package com.woowacourse.edd.domain.vo;

import com.woowacourse.edd.exceptions.InvalidPasswordException;

import javax.persistence.Column;
import java.util.Objects;

public class Password {

    @Column(nullable = false)
    private String password;

    public Password() {
    }

    public Password(String password) {
        this.password = password;
    }

    private void checkPassword(String password) {
        if (Objects.isNull(password) || password.isEmpty()) {
            throw new InvalidPasswordException();
        }
    }

    public String getPassword() {
        return password;
    }
}
