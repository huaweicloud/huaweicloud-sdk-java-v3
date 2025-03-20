package com.huaweicloud.sdk.iam.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CreateVirtualMfaDeviceReqBody
 */
public class CreateVirtualMfaDeviceReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virtual_mfa_device_name")

    private String virtualMfaDeviceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    public CreateVirtualMfaDeviceReqBody withVirtualMfaDeviceName(String virtualMfaDeviceName) {
        this.virtualMfaDeviceName = virtualMfaDeviceName;
        return this;
    }

    /**
     * MFA设备名称，长度为1到64个字符，只包含字母、数字、\"_\"和\"-\"的字符串。
     * @return virtualMfaDeviceName
     */
    public String getVirtualMfaDeviceName() {
        return virtualMfaDeviceName;
    }

    public void setVirtualMfaDeviceName(String virtualMfaDeviceName) {
        this.virtualMfaDeviceName = virtualMfaDeviceName;
    }

    public CreateVirtualMfaDeviceReqBody withUserId(String userId) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateVirtualMfaDeviceReqBody that = (CreateVirtualMfaDeviceReqBody) obj;
        return Objects.equals(this.virtualMfaDeviceName, that.virtualMfaDeviceName)
            && Objects.equals(this.userId, that.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(virtualMfaDeviceName, userId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVirtualMfaDeviceReqBody {\n");
        sb.append("    virtualMfaDeviceName: ").append(toIndentedString(virtualMfaDeviceName)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
