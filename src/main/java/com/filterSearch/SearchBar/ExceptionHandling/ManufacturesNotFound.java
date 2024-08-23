package com.filterSearch.SearchBar.ExceptionHandling;

import lombok.Data;

@Data
public class ManufacturesNotFound extends Exception {
    public ManufacturesNotFound(String message) {
        super(message);
    }

    public ManufacturesNotFound(String message, Throwable cause) {
        super(message, cause);
    }

    public ManufacturesNotFound(Throwable cause) {
        super(cause);
    }

    protected ManufacturesNotFound(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
