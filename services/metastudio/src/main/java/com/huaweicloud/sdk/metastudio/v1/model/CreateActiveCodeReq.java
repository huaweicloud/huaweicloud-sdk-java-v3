package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建激活码请求。
 */
public class CreateActiveCodeReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "robot_id")

    private String robotId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "room_id")

    private String roomId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "valid_period")

    private Integer validPeriod;

    public CreateActiveCodeReq withRobotId(String robotId) {
        this.robotId = robotId;
        return this;
    }

    /**
     * 应用ID。
     * @return robotId
     */
    public String getRobotId() {
        return robotId;
    }

    public void setRobotId(String robotId) {
        this.robotId = robotId;
    }

    public CreateActiveCodeReq withRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }

    /**
     * 智能交互对话ID。
     * @return roomId
     */
    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public CreateActiveCodeReq withValidPeriod(Integer validPeriod) {
        this.validPeriod = validPeriod;
        return this;
    }

    /**
     * 有效天数（0表示长期有效）。
     * minimum: 0
     * maximum: 65535
     * @return validPeriod
     */
    public Integer getValidPeriod() {
        return validPeriod;
    }

    public void setValidPeriod(Integer validPeriod) {
        this.validPeriod = validPeriod;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateActiveCodeReq that = (CreateActiveCodeReq) obj;
        return Objects.equals(this.robotId, that.robotId) && Objects.equals(this.roomId, that.roomId)
            && Objects.equals(this.validPeriod, that.validPeriod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(robotId, roomId, validPeriod);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateActiveCodeReq {\n");
        sb.append("    robotId: ").append(toIndentedString(robotId)).append("\n");
        sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
        sb.append("    validPeriod: ").append(toIndentedString(validPeriod)).append("\n");
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
