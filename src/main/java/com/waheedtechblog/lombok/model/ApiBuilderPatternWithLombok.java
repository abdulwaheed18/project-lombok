package com.waheedtechblog.lombok.model;

import lombok.Builder;

/**
 * Generates builder pattern using @BUilder annotation
 * https://projectlombok.org/features/Builder
 */
@Builder
public class ApiBuilderPatternWithLombok {

    private String hostname;
    private String port;
    private boolean isHttps;
    private int readTimeout;
    private String username;
    private String password;
}
