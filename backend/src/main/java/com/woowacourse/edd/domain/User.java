package com.woowacourse.edd.domain;

import com.woowacourse.edd.domain.vo.Email;
import com.woowacourse.edd.domain.vo.Name;
import com.woowacourse.edd.domain.vo.Password;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private Email email;

    @Embedded
    private Password password;

    @Embedded
    private Name name;

    private User() {
    }

    public User(Email email, Password password, Name name) {
        this.email = email;
        this.password = password;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public Email getEmail() {
        return email;
    }

    public Password getPassword() {
        return password;
    }

    public Name getName() {
        return name;
    }
}
