package com.brokerapp.service;

import com.brokerapp.payload.UserDto;

public interface UserService {
    public long createUser(UserDto userDto);
}
