package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** DevicesInGroup */
public class DevicesInGroup {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_id")

    private Integer deviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_name")

    private String deviceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private Integer productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_name")

    private String productName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "online_status")

    private Integer onlineStatus;

    public DevicesInGroup withDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /** 设备ID minimum: 1 maximum: -8446744073709551617
     * 
     * @return deviceId */
    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public DevicesInGroup withDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    /** 设备名称
     * 
     * @return deviceName */
    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public DevicesInGroup withProductId(Integer productId) {
        this.productId = productId;
        return this;
    }

    /** 产品ID minimum: 1 maximum: -8446744073709551617
     * 
     * @return productId */
    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public DevicesInGroup withProductName(String productName) {
        this.productName = productName;
        return this;
    }

    /** 产品名称
     * 
     * @return productName */
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public DevicesInGroup withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /** 设备状态 0-启用 1-禁用 minimum: 0 maximum: 10
     * 
     * @return status */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public DevicesInGroup withOnlineStatus(Integer onlineStatus) {
        this.onlineStatus = onlineStatus;
        return this;
    }

    /** 是否在线 0-未连接 1-在线 2-离线 minimum: 0 maximum: 10
     * 
     * @return onlineStatus */
    public Integer getOnlineStatus() {
        return onlineStatus;
    }

    public void setOnlineStatus(Integer onlineStatus) {
        this.onlineStatus = onlineStatus;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DevicesInGroup devicesInGroup = (DevicesInGroup) o;
        return Objects.equals(this.deviceId, devicesInGroup.deviceId)
            && Objects.equals(this.deviceName, devicesInGroup.deviceName)
            && Objects.equals(this.productId, devicesInGroup.productId)
            && Objects.equals(this.productName, devicesInGroup.productName)
            && Objects.equals(this.status, devicesInGroup.status)
            && Objects.equals(this.onlineStatus, devicesInGroup.onlineStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deviceId, deviceName, productId, productName, status, onlineStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DevicesInGroup {\n");
        sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
        sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    onlineStatus: ").append(toIndentedString(onlineStatus)).append("\n");
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
