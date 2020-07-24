package com.paddy.seedling.user.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserService {

    public Long list(Long userId) {
        log.info("========进入用户列表=======");
        return userId;
    }

}
