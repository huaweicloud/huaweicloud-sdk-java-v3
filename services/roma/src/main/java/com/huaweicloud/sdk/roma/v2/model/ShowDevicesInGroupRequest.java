package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ShowDevicesInGroupRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private Integer groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_name")

    private String productName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_name")

    private String deviceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    public ShowDevicesInGroupRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /** 实例ID
     * 
     * @return instanceId */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ShowDevicesInGroupRequest withGroupId(Integer groupId) {
        this.groupId = groupId;
        return this;
    }

    /** 设备分组ID minimum: 0 maximum: 200376420520689663
     * 
     * @return groupId */
    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public ShowDevicesInGroupRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /** 每页显示条目数量，最大数量999，超过999后只返回999 minimum: 0 maximum: 999
     * 
     * @return limit */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ShowDevicesInGroupRequest withProductName(String productName) {
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

    public ShowDevicesInGroupRequest withDeviceName(String deviceName) {
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

    public ShowDevicesInGroupRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /** 偏移量，表示从此偏移量开始查询， offset大于等于0 minimum: 0 maximum: 999999
     * 
     * @return offset */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowDevicesInGroupRequest showDevicesInGroupRequest = (ShowDevicesInGroupRequest) o;
        return Objects.equals(this.instanceId, showDevicesInGroupRequest.instanceId)
            && Objects.equals(this.groupId, showDevicesInGroupRequest.groupId)
            && Objects.equals(this.limit, showDevicesInGroupRequest.limit)
            && Objects.equals(this.productName, showDevicesInGroupRequest.productName)
            && Objects.equals(this.deviceName, showDevicesInGroupRequest.deviceName)
            && Objects.equals(this.offset, showDevicesInGroupRequest.offset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, groupId, limit, productName, deviceName, offset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDevicesInGroupRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
        sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
