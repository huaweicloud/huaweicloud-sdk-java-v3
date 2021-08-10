package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class BindMfaDevice {

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

    public BindMfaDevice withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /** 待绑定MFA设备的IAM用户ID。
     * 
     * @return userId */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public BindMfaDevice withSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    /** MFA设备序列号。
     * 
     * @return serialNumber */
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public BindMfaDevice withAuthenticationCodeFirst(String authenticationCodeFirst) {
        this.authenticationCodeFirst = authenticationCodeFirst;
        return this;
    }

    /** 第一组验证码。
     * 
     * @return authenticationCodeFirst */
    public String getAuthenticationCodeFirst() {
        return authenticationCodeFirst;
    }

    public void setAuthenticationCodeFirst(String authenticationCodeFirst) {
        this.authenticationCodeFirst = authenticationCodeFirst;
    }

    public BindMfaDevice withAuthenticationCodeSecond(String authenticationCodeSecond) {
        this.authenticationCodeSecond = authenticationCodeSecond;
        return this;
    }

    /** 第二组验证码。
     * 
     * @return authenticationCodeSecond */
    public String getAuthenticationCodeSecond() {
        return authenticationCodeSecond;
    }

    public void setAuthenticationCodeSecond(String authenticationCodeSecond) {
        this.authenticationCodeSecond = authenticationCodeSecond;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BindMfaDevice bindMfaDevice = (BindMfaDevice) o;
        return Objects.equals(this.userId, bindMfaDevice.userId)
            && Objects.equals(this.serialNumber, bindMfaDevice.serialNumber)
            && Objects.equals(this.authenticationCodeFirst, bindMfaDevice.authenticationCodeFirst)
            && Objects.equals(this.authenticationCodeSecond, bindMfaDevice.authenticationCodeSecond);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, serialNumber, authenticationCodeFirst, authenticationCodeSecond);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BindMfaDevice {\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
        sb.append("    authenticationCodeFirst: ").append(toIndentedString(authenticationCodeFirst)).append("\n");
        sb.append("    authenticationCodeSecond: ").append(toIndentedString(authenticationCodeSecond)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
