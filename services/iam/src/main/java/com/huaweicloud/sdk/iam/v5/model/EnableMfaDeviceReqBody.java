package com.huaweicloud.sdk.iam.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * EnableMfaDeviceReqBody
 */
public class EnableMfaDeviceReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serial_number")

    private String serialNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authentication_code_first")

    private String authenticationCodeFirst;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authentication_code_second")

    private String authenticationCodeSecond;

    public EnableMfaDeviceReqBody withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * IAM用户ID，长度为1到64个字符，只包含字母、数字和\"-\"的字符串。
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public EnableMfaDeviceReqBody withSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    /**
     * MFA设备序列号。
     * @return serialNumber
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public EnableMfaDeviceReqBody withAuthenticationCodeFirst(String authenticationCodeFirst) {
        this.authenticationCodeFirst = authenticationCodeFirst;
        return this;
    }

    /**
     * 设备发出的验证码。
     * @return authenticationCodeFirst
     */
    public String getAuthenticationCodeFirst() {
        return authenticationCodeFirst;
    }

    public void setAuthenticationCodeFirst(String authenticationCodeFirst) {
        this.authenticationCodeFirst = authenticationCodeFirst;
    }

    public EnableMfaDeviceReqBody withAuthenticationCodeSecond(String authenticationCodeSecond) {
        this.authenticationCodeSecond = authenticationCodeSecond;
        return this;
    }

    /**
     * 设备发出的后续验证码。
     * @return authenticationCodeSecond
     */
    public String getAuthenticationCodeSecond() {
        return authenticationCodeSecond;
    }

    public void setAuthenticationCodeSecond(String authenticationCodeSecond) {
        this.authenticationCodeSecond = authenticationCodeSecond;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EnableMfaDeviceReqBody that = (EnableMfaDeviceReqBody) obj;
        return Objects.equals(this.userId, that.userId) && Objects.equals(this.serialNumber, that.serialNumber)
            && Objects.equals(this.authenticationCodeFirst, that.authenticationCodeFirst)
            && Objects.equals(this.authenticationCodeSecond, that.authenticationCodeSecond);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, serialNumber, authenticationCodeFirst, authenticationCodeSecond);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnableMfaDeviceReqBody {\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
        sb.append("    authenticationCodeFirst: ").append(toIndentedString(authenticationCodeFirst)).append("\n");
        sb.append("    authenticationCodeSecond: ").append(toIndentedString(authenticationCodeSecond)).append("\n");
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
