package com.woowacourse.edd.application.dto;

import com.woowacourse.edd.exceptions.PasswordNotEqualException;

public class UserSaveRequestDto {

    private String email;
    private String userName;
    private String password;

    public UserSaveRequestDto() {
    }

    public UserSaveRequestDto(String email, String userName, String password, String confirmPassword) {
        checkPasswordEquals(password, confirmPassword);
        this.email = email;
        this.userName = userName;
        this.password = password;
    }

    private void checkPasswordEquals(String password, String confirmPassword) {
        if (!password.equals(confirmPassword)) {
            throw new PasswordNotEqualException();
        }
    }

    public String getEmail() {
        return email;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
