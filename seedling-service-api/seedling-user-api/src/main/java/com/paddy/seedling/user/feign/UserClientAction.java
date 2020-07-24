package com.paddy.seedling.user.feign;


import com.paddy.seedling.common.api.R;
import com.paddy.seedling.constant.AppConstant;
import com.paddy.seedling.user.fallback.IUserClientFallback;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * User Feign接口类
 */
@FeignClient(
        value = AppConstant.APPLICATION_USER_NAME,
        fallback = IUserClientFallback.class
)
@Api(value = "用户内部接口", tags = "用户内部接口")
public interface UserClientAction {

    String API_PREFIX = "/user";

    /**
     * 获取用户信息
     *
     * @param userId 用户id
     */
    @GetMapping(API_PREFIX + "/user-info-by-id")
    @ApiOperation(value = "获取用户信息", notes = "根据用户ID获取用户信息")
    R userInfo(@RequestParam("userId") Long userId);

    /**
     * 获取用户信息
     *
     * @param tenantId 租户ID
     * @param account  账号
     * @param password 密码
     */
    @GetMapping(API_PREFIX + "/user-info")
    @ApiOperation(value = "获取用户信息", notes = "根据用户令牌获取用户信息")
    R userInfo(@RequestParam("tenantId") String tenantId, @RequestParam("account") String account, @RequestParam("password") String password);

}
