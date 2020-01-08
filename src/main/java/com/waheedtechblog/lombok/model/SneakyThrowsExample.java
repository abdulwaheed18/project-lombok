package com.waheedtechblog.lombok.model;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.UnsupportedCharsetException;
import java.util.stream.Collectors;

/**
 * @SneakyThrows can be used to sneakily throw checked exceptions without actually declaring this in your method's throws clause.
 * https://projectlombok.org/features/SneakyThrows
 */
public class SneakyThrowsExample {

    public String withoutSneakyThrows() {
        try (InputStream is = this.getClass().getResourceAsStream("filename.txt")) {
            BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
            return br.lines().collect(Collectors.joining("\n"));
        } catch (IOException | UnsupportedCharsetException ex) {
            // If this ever happens, then its a bug.
            throw new RuntimeException(ex);
        }
    }

    @SneakyThrows
    public String withSneakyThrows() {
        try (InputStream is = this.getClass().getResourceAsStream("filename.txt")) {
            BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
            return br.lines().collect(Collectors.joining("\n"));
        }
    }
}
