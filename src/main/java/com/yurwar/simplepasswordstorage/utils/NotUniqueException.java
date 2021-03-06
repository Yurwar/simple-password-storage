package com.yurwar.simplepasswordstorage.utils;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class NotUniqueException extends RuntimeException {
    public NotUniqueException() {
    }

    public NotUniqueException(String message) {
        super(message);
    }

    public NotUniqueException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotUniqueException(Throwable cause) {
        super(cause);
    }

    public NotUniqueException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
