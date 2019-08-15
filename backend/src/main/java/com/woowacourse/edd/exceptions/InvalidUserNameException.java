package com.woowacourse.edd.exceptions;

public class InvalidUserNameException extends RuntimeException {

    private static final String INVALID_USER_NAME_MESSAGE = "이름은 한 글자 이상이어야 합니다.";

    public InvalidUserNameException() {
        super(INVALID_USER_NAME_MESSAGE);
    }
}
