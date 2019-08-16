package com.woowacourse.edd.application.service;

import com.woowacourse.edd.application.converter.UserConverter;
import com.woowacourse.edd.application.dto.UserSaveRequestDto;
import com.woowacourse.edd.application.response.UserSaveResponse;
import com.woowacourse.edd.domain.User;
import com.woowacourse.edd.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final UserConverter userConverter;

    @Autowired
    public UserService(UserRepository userRepository, UserConverter userConverter) {
        this.userRepository = userRepository;
        this.userConverter = userConverter;
    }

    public UserSaveResponse save(UserSaveRequestDto userSaveRequestDto) {
        User user = userRepository.save(userConverter.toEntity(userSaveRequestDto));
        return userConverter.toSaveResponse(user);
    }
}