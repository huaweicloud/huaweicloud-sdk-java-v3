package com.huaweicloud.sdk.dcos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 操作设备对象的服务详情
 */
public class DeviceServiceDetails {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "room_code")

    private String roomCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rack_code")

    private String rackCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "u_position")

    private String uPosition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sn")

    private String sn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_or_slot")

    private String portOrSlot;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_status")

    private String taskStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public DeviceServiceDetails withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 对象类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public DeviceServiceDetails withRoomCode(String roomCode) {
        this.roomCode = roomCode;
        return this;
    }

    /**
     * 机房编码
     * @return roomCode
     */
    public String getRoomCode() {
        return roomCode;
    }

    public void setRoomCode(String roomCode) {
        this.roomCode = roomCode;
    }

    public DeviceServiceDetails withRackCode(String rackCode) {
        this.rackCode = rackCode;
        return this;
    }

    /**
     * 机柜编码
     * @return rackCode
     */
    public String getRackCode() {
        return rackCode;
    }

    public void setRackCode(String rackCode) {
        this.rackCode = rackCode;
    }

    public DeviceServiceDetails withUPosition(String uPosition) {
        this.uPosition = uPosition;
        return this;
    }

    /**
     * u位
     * @return uPosition
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "u_position")
    public String getUPosition() {
        return uPosition;
    }

    public void setUPosition(String uPosition) {
        this.uPosition = uPosition;
    }

    public DeviceServiceDetails withSn(String sn) {
        this.sn = sn;
        return this;
    }

    /**
     * sn
     * @return sn
     */
    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public DeviceServiceDetails withPortOrSlot(String portOrSlot) {
        this.portOrSlot = portOrSlot;
        return this;
    }

    /**
     * 端口号或槽口号
     * @return portOrSlot
     */
    public String getPortOrSlot() {
        return portOrSlot;
    }

    public void setPortOrSlot(String portOrSlot) {
        this.portOrSlot = portOrSlot;
    }

    public DeviceServiceDetails withTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    /**
     * 成功或异常
     * @return taskStatus
     */
    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public DeviceServiceDetails withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 异常原因
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeviceServiceDetails that = (DeviceServiceDetails) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.roomCode, that.roomCode)
            && Objects.equals(this.rackCode, that.rackCode) && Objects.equals(this.uPosition, that.uPosition)
            && Objects.equals(this.sn, that.sn) && Objects.equals(this.portOrSlot, that.portOrSlot)
            && Objects.equals(this.taskStatus, that.taskStatus) && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, roomCode, rackCode, uPosition, sn, portOrSlot, taskStatus, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeviceServiceDetails {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    roomCode: ").append(toIndentedString(roomCode)).append("\n");
        sb.append("    rackCode: ").append(toIndentedString(rackCode)).append("\n");
        sb.append("    uPosition: ").append(toIndentedString(uPosition)).append("\n");
        sb.append("    sn: ").append(toIndentedString(sn)).append("\n");
        sb.append("    portOrSlot: ").append(toIndentedString(portOrSlot)).append("\n");
        sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
