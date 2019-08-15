package com.woowacourse.edd.domain;

import com.woowacourse.edd.domain.vo.Email;
import com.woowacourse.edd.domain.vo.Password;
import com.woowacourse.edd.domain.vo.UserName;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private UserName userName;

    @Embedded
    private Email email;

    @Embedded
    private Password password;

    private User() {
    }

    public User(UserName userName, Email email, Password password) {
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public UserName getUserName() {
        return userName;
    }

    public Email getEmail() {
        return email;
    }

    public Password getPassword() {
        return password;
    }
}
