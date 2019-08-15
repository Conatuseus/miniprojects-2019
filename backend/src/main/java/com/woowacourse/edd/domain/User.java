package com.woowacourse.edd.domain;

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

}
