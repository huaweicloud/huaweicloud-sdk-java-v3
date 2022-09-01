package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 
 */
public class UnbindMfaDevice {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    @JacksonXmlProperty(localName = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authentication_code")

    @JacksonXmlProperty(localName = "authentication_code")

    private String authenticationCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serial_number")

    @JacksonXmlProperty(localName = "serial_number")

    private String serialNumber;

    public UnbindMfaDevice withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 待解绑MFA设备的IAM用户ID。
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public UnbindMfaDevice withAuthenticationCode(String authenticationCode) {
        this.authenticationCode = authenticationCode;
        return this;
    }

    /**
     * 管理员为IAM用户解绑MFA设备：填写6位任意验证码，不做校验。IAM用户为自己解绑MFA设备：填写虚拟MFA验证码。
     * @return authenticationCode
     */
    public String getAuthenticationCode() {
        return authenticationCode;
    }

    public void setAuthenticationCode(String authenticationCode) {
        this.authenticationCode = authenticationCode;
    }

    public UnbindMfaDevice withSerialNumber(String serialNumber) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UnbindMfaDevice unbindMfaDevice = (UnbindMfaDevice) o;
        return Objects.equals(this.userId, unbindMfaDevice.userId)
            && Objects.equals(this.authenticationCode, unbindMfaDevice.authenticationCode)
            && Objects.equals(this.serialNumber, unbindMfaDevice.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, authenticationCode, serialNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UnbindMfaDevice {\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    authenticationCode: ").append(toIndentedString(authenticationCode)).append("\n");
        sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
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
