package com.woowacourse.edd.domain.vo;

import com.woowacourse.edd.exceptions.InvalidEmailException;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class Email {

    @Column(nullable = false)
    private String email;

    public Email() {
    }

    public Email(String email) {
        checkEmail(email);
        this.email = email;
    }

    private void checkEmail(String email) {
        if (Objects.isNull(email) || email.trim().isEmpty()) {
            throw new InvalidEmailException();
        }
    }

    public String getEmail() {
        return email;
    }
}
