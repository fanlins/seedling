package com.paddy.seedling.order.controller;

import com.paddy.seedling.order.service.OrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Api(value = "订单信息", tags = "订单接口")
@RestController
@RequestMapping
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping("list")
    @ApiOperation(value = "获取订单列表", notes = "获取用户的订单列表")
    public Long list(@RequestParam("userId") Long userId) {
        return orderService.list(userId);
    }

}
