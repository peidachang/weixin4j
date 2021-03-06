package com.foxinmy.weixin4j.mp.payment;

import java.io.Serializable;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
import com.foxinmy.weixin4j.util.DateUtil;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 订单信息
 * 
 * @className PayPackage
 * @author jy
 * @date 2014年12月18日
 * @since JDK 1.7
 * @see
 */
public class PayPackage implements Serializable {

	private static final long serialVersionUID = 3450161267802545790L;

	private String body; // 商品描述 必须
	private String attach; // 附加数据,原样返回 非必须
	@XStreamAlias("out_trade_no")
	@JSONField(name = "out_trade_no")
	private String outTradeNo; // 商户系统内部的订单号 ,32 个字符内 、可包含字母 ,确保 在商户系统唯一 必须
	@XStreamAlias("total_fee")
	@JSONField(name = "total_fee")
	private String totalFee; // 订单总金额,单位为分,不 能带小数点 必须
	@XStreamAlias("spbill_create_ip")
	@JSONField(name = "spbill_create_ip")
	private String spbillCreateIp; // 订单生成的机器 IP 必须
	@XStreamAlias("time_start")
	@JSONField(name = "time_start")
	private String timeStart; // 订单生成时间,格式 为 yyyyMMddHHmmss,如 2009 年
								// 12月25日9点10分10秒表 示为 20091225091010。时区 为 GMT+8
								// beijing。该时间取 自商户服务器 非必须
	@XStreamAlias("time_expire")
	@JSONField(name = "time_expire")
	private String timeExpire; // 订单失效时间,格式 为 yyyyMMddHHmmss,如 2009 年
								// 12月27日9点10分10秒表 示为 20091227091010。时区 为 GMT+8
								// beijing。该时间取 自商户服务商品标记 非必须
	@XStreamAlias("goods_tag")
	@JSONField(name = "goods_tag")
	private String goodsTag; // 商品标记,该字段不能随便 填,不使用请填空 非必须
	@XStreamAlias("notify_url")
	@JSONField(name = "notify_url")
	private String notifyUrl; // 通知地址接收微信支付成功通知 必须

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getAttach() {
		return attach;
	}

	public void setAttach(String attach) {
		this.attach = attach;
	}

	public String getOutTradeNo() {
		return outTradeNo;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getTotalFee() {
		return totalFee;
	}

	public void setTotalFee(double totalFee) {
		this.totalFee = DateUtil.formaFee2Fen(totalFee);
	}

	public String getSpbillCreateIp() {
		return spbillCreateIp;
	}

	public void setSpbillCreateIp(String spbillCreateIp) {
		this.spbillCreateIp = spbillCreateIp;
	}

	public String getTimeStart() {
		return timeStart;
	}

	public void setTimeStart(String timeStart) {
		this.timeStart = timeStart;
	}

	public void setTimeExpire(String timeExpire) {
		this.timeExpire = timeExpire;
	}

	public void setTimeStart(Date timeStart) {
		this.timeStart = timeStart != null ? DateUtil
				.fortmat2yyyyMMddHHmmss(timeStart) : null;
	}

	public String getTimeExpire() {
		return timeExpire;
	}

	public void setTimeExpire(Date timeExpire) {
		this.timeExpire = timeExpire != null ? DateUtil
				.fortmat2yyyyMMddHHmmss(timeExpire) : null;
	}

	public String getGoodsTag() {
		return goodsTag;
	}

	public void setGoodsTag(String goodsTag) {
		this.goodsTag = goodsTag;
	}

	public String getNotifyUrl() {
		return notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

	public PayPackage() {
	}

	public PayPackage(String body, String attach, String outTradeNo,
			double totalFee, String spbillCreateIp, Date timeStart,
			Date timeExpire, String goodsTag, String notifyUrl) {
		this.body = body;
		this.attach = attach;
		this.outTradeNo = outTradeNo;
		this.totalFee = DateUtil.formaFee2Fen(totalFee);
		this.spbillCreateIp = spbillCreateIp;
		this.timeStart = timeStart != null ? DateUtil
				.fortmat2yyyyMMddHHmmss(timeStart) : null;
		this.timeExpire = timeExpire != null ? DateUtil
				.fortmat2yyyyMMddHHmmss(timeExpire) : null;
		this.goodsTag = goodsTag;
		this.notifyUrl = notifyUrl;
	}

	@Override
	public String toString() {
		return "PayPackage [body=" + body + ", attach=" + attach
				+ ", outTradeNo=" + outTradeNo + ", totalFee=" + totalFee
				+ ", spbillCreateIp=" + spbillCreateIp + ", timeStart="
				+ timeStart + ", timeExpire=" + timeExpire + ", goodsTag="
				+ goodsTag + ", notifyUrl=" + notifyUrl + "]";
	}
}
