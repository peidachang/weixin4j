package com.foxinmy.weixin4j.mp.api;

import java.util.ResourceBundle;

import com.foxinmy.weixin4j.api.BaseApi;

/**
 * 微信公众平台API
 * 
 * @className MpApi
 * @author jy.hu
 * @date 2014年9月26日
 * @since JDK 1.7
 * @see com.foxinmy.weixin4j.api.BaseApi
 * @see <a href="http://mp.weixin.qq.com/wiki/index.php">api文档</a>
 */
public class MpApi extends BaseApi {
	private final static ResourceBundle weixinBundle;
	static {
		weixinBundle = ResourceBundle
				.getBundle("com/foxinmy/weixin4j/mp/api/weixin");
	}

	@Override
	protected ResourceBundle getWeixinBundle() {
		return weixinBundle;
	}
}
