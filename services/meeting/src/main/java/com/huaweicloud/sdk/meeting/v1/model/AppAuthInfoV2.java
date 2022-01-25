package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @JsonProperty("corpId")
    private String corpId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("expireTime")
    private Long expireTime = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("nonce")
    private String nonce = null;

    @JsonIgnore
    private String key = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("clientType")
    private Integer clientType = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("deptCode")
    private String deptCode = null;

    /**
     * 租户场景 (默认单租户场景)
     * 1、单租户场景下必须填写appId和appKey，选填userId。如果userId不填默认以企业管理员身份调用
     * 2、单租户场景下不能填写corpId
     * 3、多租户场景下必须填写appId和appKey，选填corpId和userId。如果corpId和userId都不填默认以SP管理员身份调用；如果corpId填写，userId不填，以企业管理员身份调用
     */
    private TenantSceneEnum tenantSceneEnum;

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

    public String getCorpId() {
        return corpId;
    }

    public void setCorpId(String corpId) {
        this.corpId = corpId;
    }

    public AppAuthInfoV2 withCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }

    public Integer getClientType() {
        return clientType;
    }

    public void setClientType(Integer clientType) {
        this.clientType = clientType;
    }

    public AppAuthInfoV2 withDeptCode(String deptCode) {
        this.deptCode = deptCode;
        return this;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public AppAuthInfoV2 withClientType(Integer clientType) {
        this.clientType = clientType;
        return this;
    }

    public AppAuthInfoV2 withTenantScene(TenantSceneEnum tenantSceneEnum) {
        this.tenantSceneEnum = tenantSceneEnum;
        return this;
    }

    /**
     * 计算签名
     * <p>
     * 计算公式：
     * <p>
     * userId为null或者空字符串：
     * signature=HexEncode(HMAC256((appId + "::" + expireTime + ":" + nonce), appKey))
     * </p>
     * <p>
     * userId不为空：
     * HMAC-SHA256 signature=HexEncode(HMAC256((appId + ":" + userId + ":" + expireTime + ":" + nonce), appKey))
     * </p>
     *
     * @return
     */
    public String build() {
        StringBuilder sb = new StringBuilder(this.appId).append(":");
        if (userId == null) {
            userId = "";
        }
        if (tenantSceneEnum == TenantSceneEnum.MULTI_TENANT) {
            // 多租户场景
            if (corpId == null) {
                corpId = "";
            }
            sb.append(corpId).append(":")
                .append(userId).append(":")
                .append(expireTime).append(":")
                .append(nonce).toString();
        } else {
            // 单租户场景
            sb.append(userId).append(":")
                .append(expireTime).append(":")
                .append(nonce).toString();
        }

        return HmacSHA256.encode(sb.toString(), this.key);
    }
}
