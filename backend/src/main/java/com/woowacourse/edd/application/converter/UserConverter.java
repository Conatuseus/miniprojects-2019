package com.woowacourse.edd.application.converter;

import com.woowacourse.edd.application.dto.UserSaveRequestDto;
import com.woowacourse.edd.application.response.UserSaveResponse;
import com.woowacourse.edd.domain.User;
import com.woowacourse.edd.domain.vo.Email;
import com.woowacourse.edd.domain.vo.Name;
import com.woowacourse.edd.domain.vo.Password;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {

    public User toEntity(UserSaveRequestDto userSaveRequestDto) {
        return new User(new Email(userSaveRequestDto.getEmail()), new Password(userSaveRequestDto.getPassword()), new Name(userSaveRequestDto.getUserName()));
    }

    public UserSaveResponse toSaveResponse(User user) {
        return new UserSaveResponse(user.getId(), user.getName().getName(), user.getEmail().getEmail());
    }
}
