package com.huaweicloud.sdk.hilens.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class UpdateNodeFirmwareRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firmware_id")

    private String firmwareId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Expired-Time")

    private Integer xExpiredTime;

    public UpdateNodeFirmwareRequest withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 设备ID，从专业版HiLens控制台设备管理[查询设备列表](ListNodeUsingGeT.xml)获取
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public UpdateNodeFirmwareRequest withFirmwareId(String firmwareId) {
        this.firmwareId = firmwareId;
        return this;
    }

    /**
     * 固件ID,，从专业版HiLens控制台固件管理[查询固件列表](ListFirmwares.xml)获取
     * @return firmwareId
     */
    public String getFirmwareId() {
        return firmwareId;
    }

    public void setFirmwareId(String firmwareId) {
        this.firmwareId = firmwareId;
    }

    public UpdateNodeFirmwareRequest withXExpiredTime(Integer xExpiredTime) {
        this.xExpiredTime = xExpiredTime;
        return this;
    }

    /**
     * 离线场景超期时间，单位分钟，范围在1-86400
     * @return xExpiredTime
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Expired-Time")
    public Integer getXExpiredTime() {
        return xExpiredTime;
    }

    public void setXExpiredTime(Integer xExpiredTime) {
        this.xExpiredTime = xExpiredTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateNodeFirmwareRequest updateNodeFirmwareRequest = (UpdateNodeFirmwareRequest) o;
        return Objects.equals(this.nodeId, updateNodeFirmwareRequest.nodeId)
            && Objects.equals(this.firmwareId, updateNodeFirmwareRequest.firmwareId)
            && Objects.equals(this.xExpiredTime, updateNodeFirmwareRequest.xExpiredTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeId, firmwareId, xExpiredTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateNodeFirmwareRequest {\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    firmwareId: ").append(toIndentedString(firmwareId)).append("\n");
        sb.append("    xExpiredTime: ").append(toIndentedString(xExpiredTime)).append("\n");
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
