package com.filterSearch.SearchBar.ExceptionHandling;

import lombok.Data;

@Data
public class LocationNotFoundException extends  Exception {

    private String country;
    private String message;


    public LocationNotFoundException(String country, String message){
        this.country=country;
        this.message=message;
    }

    public LocationNotFoundException(String message) {
        super(message);
    }

    public LocationNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public LocationNotFoundException(Throwable cause) {
        super(cause);
    }

    protected LocationNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }




}
