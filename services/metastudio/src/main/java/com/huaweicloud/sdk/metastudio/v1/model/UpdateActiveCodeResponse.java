package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class UpdateActiveCodeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active_code_id")

    private String activeCodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active_code")

    private String activeCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "robot_id")

    private String robotId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "room_id")

    private String roomId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "valid_period")

    private Integer validPeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time")

    private String expireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public UpdateActiveCodeResponse withActiveCodeId(String activeCodeId) {
        this.activeCodeId = activeCodeId;
        return this;
    }

    /**
     * 激活码ID。
     * @return activeCodeId
     */
    public String getActiveCodeId() {
        return activeCodeId;
    }

    public void setActiveCodeId(String activeCodeId) {
        this.activeCodeId = activeCodeId;
    }

    public UpdateActiveCodeResponse withActiveCode(String activeCode) {
        this.activeCode = activeCode;
        return this;
    }

    /**
     * 激活码。
     * @return activeCode
     */
    public String getActiveCode() {
        return activeCode;
    }

    public void setActiveCode(String activeCode) {
        this.activeCode = activeCode;
    }

    public UpdateActiveCodeResponse withRobotId(String robotId) {
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

    public UpdateActiveCodeResponse withRoomId(String roomId) {
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

    public UpdateActiveCodeResponse withValidPeriod(Integer validPeriod) {
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

    public UpdateActiveCodeResponse withExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * 过期时间，格式遵循：RFC 3339 如\"2021-01-10T08:43:17Z\"。
     * @return expireTime
     */
    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public UpdateActiveCodeResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间，格式遵循：RFC 3339 如\"2021-01-10T08:43:17Z\"。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public UpdateActiveCodeResponse withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间，格式遵循：RFC 3339 如\"2021-01-10T08:43:17Z\"。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public UpdateActiveCodeResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateActiveCodeResponse that = (UpdateActiveCodeResponse) obj;
        return Objects.equals(this.activeCodeId, that.activeCodeId) && Objects.equals(this.activeCode, that.activeCode)
            && Objects.equals(this.robotId, that.robotId) && Objects.equals(this.roomId, that.roomId)
            && Objects.equals(this.validPeriod, that.validPeriod) && Objects.equals(this.expireTime, that.expireTime)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(activeCodeId,
            activeCode,
            robotId,
            roomId,
            validPeriod,
            expireTime,
            createTime,
            updateTime,
            xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateActiveCodeResponse {\n");
        sb.append("    activeCodeId: ").append(toIndentedString(activeCodeId)).append("\n");
        sb.append("    activeCode: ").append(toIndentedString(activeCode)).append("\n");
        sb.append("    robotId: ").append(toIndentedString(robotId)).append("\n");
        sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
        sb.append("    validPeriod: ").append(toIndentedString(validPeriod)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
