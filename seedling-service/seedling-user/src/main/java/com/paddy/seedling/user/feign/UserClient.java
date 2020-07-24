package com.paddy.seedling.user.feign;

import com.paddy.seedling.common.api.IResultCode;
import com.paddy.seedling.common.api.R;
import com.paddy.seedling.user.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
public class UserClient implements UserClientAction {

    @Resource
    private UserService userService;

    @Override
    public R userInfo(Long userId) {
        return R.data(userService.list(userId));
    }

    @Override
    public R userInfo(String tenantId, String account, String password) {
        return R.success(new IResultCode() {
            @Override
            public String getMessage() {
                return "哈哈哈哈";
            }

            @Override
            public int getCode() {
                return 111;
            }
        });
    }
}
