package com.woowacourse.edd.exceptions;

public class PasswordNotEqualException extends RuntimeException {

    private static final String PASSWORD_NOT_EQUAL_MESSAGE = "두 비밀번호가 일치하지 않습니다.";

    public PasswordNotEqualException() {
        super(PASSWORD_NOT_EQUAL_MESSAGE);
    }
}
