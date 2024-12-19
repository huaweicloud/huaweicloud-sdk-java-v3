package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 执行中控制响应结构体
 */
public class ActiveControlRspDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "control_type")

    private String controlType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "control_id")

    private String controlId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private Object value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    public ActiveControlRspDTO withControlType(String controlType) {
        this.controlType = controlType;
        return this;
    }

    /**
     * 控制类型，包括control、schedule、local_control
     * @return controlType
     */
    public String getControlType() {
        return controlType;
    }

    public void setControlType(String controlType) {
        this.controlType = controlType;
    }

    public ActiveControlRspDTO withControlId(String controlId) {
        this.controlId = controlId;
        return this;
    }

    /**
     * 控制id
     * @return controlId
     */
    public String getControlId() {
        return controlId;
    }

    public void setControlId(String controlId) {
        this.controlId = controlId;
    }

    public ActiveControlRspDTO withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 控制的优先级
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public ActiveControlRspDTO withValue(Object value) {
        this.value = value;
        return this;
    }

    /**
     * 此次控制的值
     * @return value
     */
    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public ActiveControlRspDTO withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 控制的结束时间
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public ActiveControlRspDTO withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 记录创建的时间
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ActiveControlRspDTO that = (ActiveControlRspDTO) obj;
        return Objects.equals(this.controlType, that.controlType) && Objects.equals(this.controlId, that.controlId)
            && Objects.equals(this.priority, that.priority) && Objects.equals(this.value, that.value)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(controlType, controlId, priority, value, endTime, createTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActiveControlRspDTO {\n");
        sb.append("    controlType: ").append(toIndentedString(controlType)).append("\n");
        sb.append("    controlId: ").append(toIndentedString(controlId)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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
