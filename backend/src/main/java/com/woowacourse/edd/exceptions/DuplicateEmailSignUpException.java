package com.woowacourse.edd.exceptions;

import org.springframework.http.HttpStatus;

public class DuplicateEmailSignUpException extends ErrorResponseException {

    public static final String DUPLICATE_EMAIL_SIGNUP_MESSAGE = "이미 존재하거나 탈퇴한 회원의 이메일은 사용하실 수 없습니다.";

    public DuplicateEmailSignUpException() {
        super(DUPLICATE_EMAIL_SIGNUP_MESSAGE, HttpStatus.BAD_REQUEST);
    }
}
