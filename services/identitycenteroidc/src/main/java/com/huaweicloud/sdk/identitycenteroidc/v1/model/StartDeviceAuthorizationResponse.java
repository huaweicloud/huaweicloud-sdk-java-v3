package com.huaweicloud.sdk.identitycenteroidc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class StartDeviceAuthorizationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_code")

    private String deviceCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expires_in")

    private Integer expiresIn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interval")

    private Integer interval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_code")

    private String userCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verification_uri")

    private String verificationUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verification_uri_complete")

    private String verificationUriComplete;

    public StartDeviceAuthorizationResponse withDeviceCode(String deviceCode) {
        this.deviceCode = deviceCode;
        return this;
    }

    /**
     * 设备在轮询会话令牌时使用的设备码
     * @return deviceCode
     */
    public String getDeviceCode() {
        return deviceCode;
    }

    public void setDeviceCode(String deviceCode) {
        this.deviceCode = deviceCode;
    }

    public StartDeviceAuthorizationResponse withExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
        return this;
    }

    /**
     * 设备码失效时间（以秒为单位）
     * @return expiresIn
     */
    public Integer getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
    }

    public StartDeviceAuthorizationResponse withInterval(Integer interval) {
        this.interval = interval;
        return this;
    }

    /**
     * 指示轮询会话时，客户端在两次尝试之间必须等待的秒数
     * @return interval
     */
    public Integer getInterval() {
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    public StartDeviceAuthorizationResponse withUserCode(String userCode) {
        this.userCode = userCode;
        return this;
    }

    /**
     * 一次性用户验证码。授权正在使用的设备时需要此操作
     * @return userCode
     */
    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public StartDeviceAuthorizationResponse withVerificationUri(String verificationUri) {
        this.verificationUri = verificationUri;
        return this;
    }

    /**
     * 使用一次性用户验证码授权设备的验证页面的URI
     * @return verificationUri
     */
    public String getVerificationUri() {
        return verificationUri;
    }

    public void setVerificationUri(String verificationUri) {
        this.verificationUri = verificationUri;
    }

    public StartDeviceAuthorizationResponse withVerificationUriComplete(String verificationUriComplete) {
        this.verificationUriComplete = verificationUriComplete;
        return this;
    }

    /**
     * 客户端可用于自动启动浏览器的备用URL。此过程跳过用户访问验证页面并输入代码的手动步骤
     * @return verificationUriComplete
     */
    public String getVerificationUriComplete() {
        return verificationUriComplete;
    }

    public void setVerificationUriComplete(String verificationUriComplete) {
        this.verificationUriComplete = verificationUriComplete;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StartDeviceAuthorizationResponse that = (StartDeviceAuthorizationResponse) obj;
        return Objects.equals(this.deviceCode, that.deviceCode) && Objects.equals(this.expiresIn, that.expiresIn)
            && Objects.equals(this.interval, that.interval) && Objects.equals(this.userCode, that.userCode)
            && Objects.equals(this.verificationUri, that.verificationUri)
            && Objects.equals(this.verificationUriComplete, that.verificationUriComplete);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deviceCode, expiresIn, interval, userCode, verificationUri, verificationUriComplete);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartDeviceAuthorizationResponse {\n");
        sb.append("    deviceCode: ").append(toIndentedString(deviceCode)).append("\n");
        sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
        sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
        sb.append("    userCode: ").append(toIndentedString(userCode)).append("\n");
        sb.append("    verificationUri: ").append(toIndentedString(verificationUri)).append("\n");
        sb.append("    verificationUriComplete: ").append(toIndentedString(verificationUriComplete)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
