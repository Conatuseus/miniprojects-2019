package com.woowacourse.edd.domain.vo;

import com.woowacourse.edd.exceptions.InvalidUserNameException;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class Name {

    @Column(nullable = false)
    private String name;

    public Name() {
    }

    public Name(String name) {
        checkUserName(name);
        this.name = name;
    }

    private void checkUserName(String name) {
        if (Objects.isNull(name) || name.trim().isEmpty()) {
            throw new InvalidUserNameException();
        }
    }

    public String getName() {
        return this.name;
    }
}
