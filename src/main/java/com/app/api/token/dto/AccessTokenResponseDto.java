package com.app.api.token.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;

import java.util.Date;

@Getter @Builder
public class AccessTokenResponseDto {

    @Schema(description = "grantType", example = "Bearer", required = true)
    private String grantType;

    @Schema(description = "accessToken", example = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJBQ0NFU1MiLCJpYXQiOjE3MDU0ODk4NzksImV4cCI6MTcwNTQ5MDc3OSwibWVtYmVySWQiOjEsInJvbGUiOiJBRE1JTiJ9.hEQO-fU_4SPxwhmgdTG0iT0FaITbesofh0X7SSxmYPtzWpGyHBd63pE-LzUv22oJzHAQ3NUGs0mWGYiAy4qPNw", required = true)
    private String accessToken;

    @Schema(description = "access token 만료 시간", example = "2024-01-17 20:26:19", required = true)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
    private Date accessTokenExpireTime;
}
