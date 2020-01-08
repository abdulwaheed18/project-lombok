package com.waheedtechblog.lombok.model;

import lombok.Cleanup;
import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.UnsupportedCharsetException;
import java.util.stream.Collectors;

/**
 * You can use @Cleanup to ensure a given resource is automatically cleaned up before the code execution path exits your current scope.
 * https://projectlombok.org/features/Cleanup
 */
public class CleanupLombok {

    @SneakyThrows
    public String withSneakyThrows() {
       @Cleanup InputStream is = this.getClass().getResourceAsStream("filename.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
            return br.lines().collect(Collectors.joining("\n"));
    }

}
