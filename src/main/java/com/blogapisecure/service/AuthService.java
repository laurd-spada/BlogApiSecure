package com.blogapisecure.service;

import com.blogapisecure.dto.LoginDto;
import com.blogapisecure.dto.RegisterDto;

public interface AuthService {
    String login(LoginDto loginDto);

    String register(RegisterDto registerDto);
}
