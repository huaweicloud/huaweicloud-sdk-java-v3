package com.huaweicloud.sdk.hilens.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * FirmwareUpdateRecord
 */
public class FirmwareUpdateRecord {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firmware_name")

    private String firmwareName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firmware_version")

    private String firmwareVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firmware_size")

    private Integer firmwareSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firmware_upgrade_time")

    private Integer firmwareUpgradeTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    public FirmwareUpdateRecord withFirmwareName(String firmwareName) {
        this.firmwareName = firmwareName;
        return this;
    }

    /**
     * 固件名称
     * @return firmwareName
     */
    public String getFirmwareName() {
        return firmwareName;
    }

    public void setFirmwareName(String firmwareName) {
        this.firmwareName = firmwareName;
    }

    public FirmwareUpdateRecord withFirmwareVersion(String firmwareVersion) {
        this.firmwareVersion = firmwareVersion;
        return this;
    }

    /**
     * 固件版本
     * @return firmwareVersion
     */
    public String getFirmwareVersion() {
        return firmwareVersion;
    }

    public void setFirmwareVersion(String firmwareVersion) {
        this.firmwareVersion = firmwareVersion;
    }

    public FirmwareUpdateRecord withFirmwareSize(Integer firmwareSize) {
        this.firmwareSize = firmwareSize;
        return this;
    }

    /**
     * 固件大小
     * @return firmwareSize
     */
    public Integer getFirmwareSize() {
        return firmwareSize;
    }

    public void setFirmwareSize(Integer firmwareSize) {
        this.firmwareSize = firmwareSize;
    }

    public FirmwareUpdateRecord withFirmwareUpgradeTime(Integer firmwareUpgradeTime) {
        this.firmwareUpgradeTime = firmwareUpgradeTime;
        return this;
    }

    /**
     * 固件升级时间
     * @return firmwareUpgradeTime
     */
    public Integer getFirmwareUpgradeTime() {
        return firmwareUpgradeTime;
    }

    public void setFirmwareUpgradeTime(Integer firmwareUpgradeTime) {
        this.firmwareUpgradeTime = firmwareUpgradeTime;
    }

    public FirmwareUpdateRecord withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 固件升级状态
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FirmwareUpdateRecord firmwareUpdateRecord = (FirmwareUpdateRecord) o;
        return Objects.equals(this.firmwareName, firmwareUpdateRecord.firmwareName)
            && Objects.equals(this.firmwareVersion, firmwareUpdateRecord.firmwareVersion)
            && Objects.equals(this.firmwareSize, firmwareUpdateRecord.firmwareSize)
            && Objects.equals(this.firmwareUpgradeTime, firmwareUpdateRecord.firmwareUpgradeTime)
            && Objects.equals(this.status, firmwareUpdateRecord.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firmwareName, firmwareVersion, firmwareSize, firmwareUpgradeTime, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FirmwareUpdateRecord {\n");
        sb.append("    firmwareName: ").append(toIndentedString(firmwareName)).append("\n");
        sb.append("    firmwareVersion: ").append(toIndentedString(firmwareVersion)).append("\n");
        sb.append("    firmwareSize: ").append(toIndentedString(firmwareSize)).append("\n");
        sb.append("    firmwareUpgradeTime: ").append(toIndentedString(firmwareUpgradeTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
