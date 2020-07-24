package com.paddy.seedling.user.fallback;

import com.paddy.seedling.common.api.R;
import com.paddy.seedling.user.feign.UserClientAction;
import org.springframework.stereotype.Component;

/**
 * Feign失败配置 熔断
 */
@Component
public class IUserClientFallback implements UserClientAction {

	@Override
	public R userInfo(Long userId) {
		return R.fail("未获取到账号信息");
	}

	@Override
	public R userInfo(String tenantId, String account, String password) {
		return R.fail("未获取到账号信息");
	}
}
