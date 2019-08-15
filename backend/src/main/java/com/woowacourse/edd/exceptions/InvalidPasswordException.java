package com.woowacourse.edd.exceptions;

public class InvalidPasswordException extends RuntimeException {

    private static final String INVALID_PASSWORD_MESSAGE = "비밀번호는 한 글자 이상이어야 합니다.";

    public InvalidPasswordException() {
        super(INVALID_PASSWORD_MESSAGE);
    }
}
