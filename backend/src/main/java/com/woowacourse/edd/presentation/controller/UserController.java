package com.woowacourse.edd.presentation.controller;

import com.woowacourse.edd.application.dto.UserSaveRequestDto;
import com.woowacourse.edd.application.response.UserSaveResponse;
import com.woowacourse.edd.application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<UserSaveResponse> save(@RequestBody UserSaveRequestDto userSaveRequestDto) {
        UserSaveResponse userSaveResponse = userService.save(userSaveRequestDto);
        return new ResponseEntity<>(userSaveResponse, HttpStatus.OK);
    }
}
