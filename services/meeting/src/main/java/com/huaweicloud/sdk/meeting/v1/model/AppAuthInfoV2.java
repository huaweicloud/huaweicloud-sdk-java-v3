package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.meeting.v1.utils.HmacSHA256;

import java.io.Serializable;

public class AppAuthInfoV2 implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("appId")
    private String appId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("userId")
    private String userId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("expireTime")
    private Long expireTime = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("nonce")
    private String nonce = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("key")
    private String key = null;

    /**
     * APPID
     * minLength: 1
     * maxLength: 64
     **/
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public AppAuthInfoV2 withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * 用户ID
     * minLength: 1
     * maxLength: 64
     **/
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public AppAuthInfoV2 withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 应用鉴权信息过期时间戳，单位秒（当收到app鉴权请求时服务端的Unix时间戳大于expireTime时，本次鉴权失败。
     * 样例：
     * 如果要求应用鉴权信息10分钟后过期，expireTime = 当前Unix时间戳 + 60*10;
     * 如果要求应用鉴权信息始终不过期，expireTime = 0）
     **/
    public Long getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
    }

    public AppAuthInfoV2 withExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * 随机字符串，用于计算应用鉴权信息
     * minLength: 32
     * maxLength: 64
     **/
    public String getNonce() {
        return nonce;
    }

    public void setNonce(String nonce) {
        this.nonce = nonce;
    }

    public AppAuthInfoV2 withNonce(String nonce) {
        this.nonce = nonce;
        return this;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public AppAuthInfoV2 withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 计算签名
     *
     * @return
     */
    public String build() {
        String data = new StringBuilder(this.appId).append(":")
            .append(this.userId).append(":")
            .append(this.expireTime).append(":")
            .append(this.nonce).toString();
        return HmacSHA256.encode(data, this.key);
    }

}
