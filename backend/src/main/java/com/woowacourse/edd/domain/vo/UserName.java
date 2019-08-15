package com.woowacourse.edd.domain.vo;

import com.woowacourse.edd.exceptions.InvalidUserNameException;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class UserName {

    @Column(nullable = false)
    private String userName;

    public UserName() {
    }

    public UserName(String userName) {
        checkUserName(userName);
        this.userName = userName;
    }

    private void checkUserName(String userName) {
        if (Objects.isNull(userName) || userName.trim().isEmpty()) {
            throw new InvalidUserNameException();
        }
    }

    public String getUserName() {
        return this.userName;
    }
}
