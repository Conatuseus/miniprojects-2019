package com.woowacourse.edd.exceptions;

public class InvalidEmailException extends RuntimeException {

    private static final String INVALID_EMAIL_MESSAGE = "이메일은 한 글자 이상이어야 합니다.";

    public InvalidEmailException() {
        super(INVALID_EMAIL_MESSAGE);
    }
}
