package com.huaweicloud.sdk.identitycenterstore.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MfaDeviceDto
 */
public class MfaDeviceDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_id")

    private String deviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_name")

    private String deviceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mfa_type")

    private String mfaType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "registered_date")

    private Long registeredDate;

    public MfaDeviceDto withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * MFA设备唯一标识符（ID）
     * @return deviceId
     */
    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public MfaDeviceDto withDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    /**
     * MFA设备名称
     * @return deviceName
     */
    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public MfaDeviceDto withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * MFA设备显示名称
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public MfaDeviceDto withMfaType(String mfaType) {
        this.mfaType = mfaType;
        return this;
    }

    /**
     * MFA类型
     * @return mfaType
     */
    public String getMfaType() {
        return mfaType;
    }

    public void setMfaType(String mfaType) {
        this.mfaType = mfaType;
    }

    public MfaDeviceDto withRegisteredDate(Long registeredDate) {
        this.registeredDate = registeredDate;
        return this;
    }

    /**
     * 注册时间
     * @return registeredDate
     */
    public Long getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(Long registeredDate) {
        this.registeredDate = registeredDate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MfaDeviceDto that = (MfaDeviceDto) obj;
        return Objects.equals(this.deviceId, that.deviceId) && Objects.equals(this.deviceName, that.deviceName)
            && Objects.equals(this.displayName, that.displayName) && Objects.equals(this.mfaType, that.mfaType)
            && Objects.equals(this.registeredDate, that.registeredDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deviceId, deviceName, displayName, mfaType, registeredDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MfaDeviceDto {\n");
        sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
        sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    mfaType: ").append(toIndentedString(mfaType)).append("\n");
        sb.append("    registeredDate: ").append(toIndentedString(registeredDate)).append("\n");
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
