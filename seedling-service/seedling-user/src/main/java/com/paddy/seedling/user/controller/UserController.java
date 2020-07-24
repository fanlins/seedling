package com.paddy.seedling.user.controller;

import com.paddy.seedling.common.api.R;
import com.paddy.seedling.user.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Api(value = "用户接口", tags = "用户接口")
@RestController
@RequestMapping
public class UserController {

    @Resource
    private UserService userService;

//    @ExceptionHandler(value = Throwable.class)
    @GetMapping("list")
    @ApiOperation(value = "获取用户列表", notes = "获取用户列表数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "userId", value = "用户ID", paramType = "query", required = true, dataType = "Long")
    })
    public R list(@RequestParam("userId") Long userId) {
        return R.data(userService.list(userId));
    }

}
