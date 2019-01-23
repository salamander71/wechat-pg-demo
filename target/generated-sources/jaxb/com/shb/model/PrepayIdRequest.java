//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2019.01.21 시간 01:12:51 PM KST 
//


package com.shb.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="xml"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="app_id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="appid" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="mch_id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="sub_appid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="sub_mch_id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="device_info" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="receipt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="nonce_str" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="sign" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="sign_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="body" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="detail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="attach" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="out_trade_no" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="fee_type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="total_fee" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="spbill_create_ip" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="time_start" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="time_expire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="goods_tag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="sbj_notify_url" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="wechat_notify_url" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="trade_type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="product_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="limit_pay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="openid" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="sub_openid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "xml"
})
@XmlRootElement(name = "prepayIdRequest")
public class PrepayIdRequest {

    protected PrepayIdRequest.Xml xml;

    /**
     * xml 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PrepayIdRequest.Xml }
     *     
     */
    public PrepayIdRequest.Xml getXml() {
        return xml;
    }

    /**
     * xml 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PrepayIdRequest.Xml }
     *     
     */
    public void setXml(PrepayIdRequest.Xml value) {
        this.xml = value;
    }


    /**
     * <p>anonymous complex type에 대한 Java 클래스입니다.
     * 
     * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="app_id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="appid" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="mch_id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="sub_appid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="sub_mch_id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="device_info" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="receipt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="nonce_str" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="sign" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="sign_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="body" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="detail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="attach" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="out_trade_no" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="fee_type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="total_fee" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="spbill_create_ip" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="time_start" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="time_expire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="goods_tag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="sbj_notify_url" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="wechat_notify_url" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="trade_type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="product_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="limit_pay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="openid" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="sub_openid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "appId",
        "appid",
        "mchId",
        "subAppid",
        "subMchId",
        "deviceInfo",
        "receipt",
        "nonceStr",
        "sign",
        "signType",
        "body",
        "detail",
        "attach",
        "outTradeNo",
        "feeType",
        "totalFee",
        "spbillCreateIp",
        "timeStart",
        "timeExpire",
        "goodsTag",
        "sbjNotifyUrl",
        "wechatNotifyUrl",
        "tradeType",
        "productId",
        "limitPay",
        "openid",
        "subOpenid"
    })
    public static class Xml {

        @XmlElement(name = "app_id", required = true)
        protected String appId;
        @XmlElement(required = true)
        protected String appid;
        @XmlElement(name = "mch_id", required = true)
        protected String mchId;
        @XmlElement(name = "sub_appid")
        protected String subAppid;
        @XmlElement(name = "sub_mch_id", required = true)
        protected String subMchId;
        @XmlElement(name = "device_info")
        protected String deviceInfo;
        protected String receipt;
        @XmlElement(name = "nonce_str", required = true)
        protected String nonceStr;
        @XmlElement(required = true)
        protected String sign;
        @XmlElement(name = "sign_type")
        protected String signType;
        @XmlElement(required = true)
        protected String body;
        protected String detail;
        protected String attach;
        @XmlElement(name = "out_trade_no", required = true)
        protected String outTradeNo;
        @XmlElement(name = "fee_type", required = true)
        protected String feeType;
        @XmlElement(name = "total_fee")
        protected int totalFee;
        @XmlElement(name = "spbill_create_ip", required = true)
        protected String spbillCreateIp;
        @XmlElement(name = "time_start")
        protected String timeStart;
        @XmlElement(name = "time_expire")
        protected String timeExpire;
        @XmlElement(name = "goods_tag")
        protected String goodsTag;
        @XmlElement(name = "sbj_notify_url", required = true)
        protected String sbjNotifyUrl;
        @XmlElement(name = "wechat_notify_url", required = true)
        protected String wechatNotifyUrl;
        @XmlElement(name = "trade_type", required = true)
        protected String tradeType;
        @XmlElement(name = "product_id")
        protected String productId;
        @XmlElement(name = "limit_pay")
        protected String limitPay;
        @XmlElement(required = true)
        protected String openid;
        @XmlElement(name = "sub_openid")
        protected String subOpenid;

        /**
         * appId 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAppId() {
            return appId;
        }

        /**
         * appId 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAppId(String value) {
            this.appId = value;
        }

        /**
         * appid 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAppid() {
            return appid;
        }

        /**
         * appid 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAppid(String value) {
            this.appid = value;
        }

        /**
         * mchId 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMchId() {
            return mchId;
        }

        /**
         * mchId 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMchId(String value) {
            this.mchId = value;
        }

        /**
         * subAppid 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubAppid() {
            return subAppid;
        }

        /**
         * subAppid 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubAppid(String value) {
            this.subAppid = value;
        }

        /**
         * subMchId 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubMchId() {
            return subMchId;
        }

        /**
         * subMchId 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubMchId(String value) {
            this.subMchId = value;
        }

        /**
         * deviceInfo 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDeviceInfo() {
            return deviceInfo;
        }

        /**
         * deviceInfo 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDeviceInfo(String value) {
            this.deviceInfo = value;
        }

        /**
         * receipt 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReceipt() {
            return receipt;
        }

        /**
         * receipt 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReceipt(String value) {
            this.receipt = value;
        }

        /**
         * nonceStr 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNonceStr() {
            return nonceStr;
        }

        /**
         * nonceStr 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNonceStr(String value) {
            this.nonceStr = value;
        }

        /**
         * sign 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSign() {
            return sign;
        }

        /**
         * sign 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSign(String value) {
            this.sign = value;
        }

        /**
         * signType 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSignType() {
            return signType;
        }

        /**
         * signType 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSignType(String value) {
            this.signType = value;
        }

        /**
         * body 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBody() {
            return body;
        }

        /**
         * body 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBody(String value) {
            this.body = value;
        }

        /**
         * detail 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDetail() {
            return detail;
        }

        /**
         * detail 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDetail(String value) {
            this.detail = value;
        }

        /**
         * attach 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAttach() {
            return attach;
        }

        /**
         * attach 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAttach(String value) {
            this.attach = value;
        }

        /**
         * outTradeNo 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOutTradeNo() {
            return outTradeNo;
        }

        /**
         * outTradeNo 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOutTradeNo(String value) {
            this.outTradeNo = value;
        }

        /**
         * feeType 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFeeType() {
            return feeType;
        }

        /**
         * feeType 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFeeType(String value) {
            this.feeType = value;
        }

        /**
         * totalFee 속성의 값을 가져옵니다.
         * 
         */
        public int getTotalFee() {
            return totalFee;
        }

        /**
         * totalFee 속성의 값을 설정합니다.
         * 
         */
        public void setTotalFee(int value) {
            this.totalFee = value;
        }

        /**
         * spbillCreateIp 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSpbillCreateIp() {
            return spbillCreateIp;
        }

        /**
         * spbillCreateIp 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSpbillCreateIp(String value) {
            this.spbillCreateIp = value;
        }

        /**
         * timeStart 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTimeStart() {
            return timeStart;
        }

        /**
         * timeStart 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTimeStart(String value) {
            this.timeStart = value;
        }

        /**
         * timeExpire 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTimeExpire() {
            return timeExpire;
        }

        /**
         * timeExpire 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTimeExpire(String value) {
            this.timeExpire = value;
        }

        /**
         * goodsTag 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGoodsTag() {
            return goodsTag;
        }

        /**
         * goodsTag 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGoodsTag(String value) {
            this.goodsTag = value;
        }

        /**
         * sbjNotifyUrl 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSbjNotifyUrl() {
            return sbjNotifyUrl;
        }

        /**
         * sbjNotifyUrl 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSbjNotifyUrl(String value) {
            this.sbjNotifyUrl = value;
        }

        /**
         * wechatNotifyUrl 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWechatNotifyUrl() {
            return wechatNotifyUrl;
        }

        /**
         * wechatNotifyUrl 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWechatNotifyUrl(String value) {
            this.wechatNotifyUrl = value;
        }

        /**
         * tradeType 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTradeType() {
            return tradeType;
        }

        /**
         * tradeType 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTradeType(String value) {
            this.tradeType = value;
        }

        /**
         * productId 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProductId() {
            return productId;
        }

        /**
         * productId 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProductId(String value) {
            this.productId = value;
        }

        /**
         * limitPay 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLimitPay() {
            return limitPay;
        }

        /**
         * limitPay 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLimitPay(String value) {
            this.limitPay = value;
        }

        /**
         * openid 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOpenid() {
            return openid;
        }

        /**
         * openid 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOpenid(String value) {
            this.openid = value;
        }

        /**
         * subOpenid 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubOpenid() {
            return subOpenid;
        }

        /**
         * subOpenid 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubOpenid(String value) {
            this.subOpenid = value;
        }

    }

}
