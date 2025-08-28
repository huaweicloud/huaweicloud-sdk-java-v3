package com.huaweicloud.sdk.iam.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 虚拟MFA设备。
 */
public class MfaDeviceMetadata {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serial_number")

    private String serialNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    public MfaDeviceMetadata withSerialNumber(String serialNumber) {
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

    public MfaDeviceMetadata withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * IAM用户ID。
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public MfaDeviceMetadata withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 虚拟MFA设备是否开启。
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MfaDeviceMetadata that = (MfaDeviceMetadata) obj;
        return Objects.equals(this.serialNumber, that.serialNumber) && Objects.equals(this.userId, that.userId)
            && Objects.equals(this.enabled, that.enabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNumber, userId, enabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MfaDeviceMetadata {\n");
        sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
