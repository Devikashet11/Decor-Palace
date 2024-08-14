package com.homedecor.decorpalace.entity;

import com.homedecor.decorpalace.dto.UserDto;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

        public User toEntity(UserDto userDto) {
            // Map properties from LoginDto to LoginEntity
            User user = new User();
            BeanUtils.copyProperties(userDto, user);
            return user;
        }
    }


