package com.app.global.error.exception;

import com.app.global.error.ErrorCode;
import com.app.global.error.exception.BusinessException;

public class AuthenticationException extends BusinessException {

    public AuthenticationException(ErrorCode errorCode) {
        super(errorCode);
    }
}
