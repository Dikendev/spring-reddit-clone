package com.project.springredditclone.exceptions;

public class SpringRedditException extends RuntimeException {
    public SpringRedditException(String exMessage, Exception exception) {
        super(exMessage, exception);
    }


}
