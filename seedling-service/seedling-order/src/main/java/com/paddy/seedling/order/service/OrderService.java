package com.paddy.seedling.order.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class OrderService {

    public Long list(Long userId) {
        log.info("========进入订单列表=======");
        return userId;
    }

}
