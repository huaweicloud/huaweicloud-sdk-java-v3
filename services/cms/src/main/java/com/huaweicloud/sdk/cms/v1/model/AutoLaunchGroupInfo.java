package com.huaweicloud.sdk.cms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * 智能购买组信息
 */
public class AutoLaunchGroupInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_state")

    private String taskState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "valid_since")

    private OffsetDateTime validSince;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "valid_until")

    private OffsetDateTime validUntil;

    public AutoLaunchGroupInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 智能购买组id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AutoLaunchGroupInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * autoLaunchGroup的名称(1-64个字符)，只能包含中文、字母、数字、下划线或中划线
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AutoLaunchGroupInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 请求类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public AutoLaunchGroupInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * autoLaunchGroup的运行状态 SUBMITTED|ACTIVE|DELETING|DELETED
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public AutoLaunchGroupInfo withTaskState(String taskState) {
        this.taskState = taskState;
        return this;
    }

    /**
     * autoLaunchGroup的任务状态， INIT|HANDLING|FULFILLED|ERROR
     * @return taskState
     */
    public String getTaskState() {
        return taskState;
    }

    public void setTaskState(String taskState) {
        this.taskState = taskState;
    }

    public AutoLaunchGroupInfo withValidSince(OffsetDateTime validSince) {
        this.validSince = validSince;
        return this;
    }

    /**
     * 开始时间
     * @return validSince
     */
    public OffsetDateTime getValidSince() {
        return validSince;
    }

    public void setValidSince(OffsetDateTime validSince) {
        this.validSince = validSince;
    }

    public AutoLaunchGroupInfo withValidUntil(OffsetDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    /**
     * 结束时间
     * @return validUntil
     */
    public OffsetDateTime getValidUntil() {
        return validUntil;
    }

    public void setValidUntil(OffsetDateTime validUntil) {
        this.validUntil = validUntil;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AutoLaunchGroupInfo autoLaunchGroupInfo = (AutoLaunchGroupInfo) o;
        return Objects.equals(this.id, autoLaunchGroupInfo.id) && Objects.equals(this.name, autoLaunchGroupInfo.name)
            && Objects.equals(this.type, autoLaunchGroupInfo.type)
            && Objects.equals(this.status, autoLaunchGroupInfo.status)
            && Objects.equals(this.taskState, autoLaunchGroupInfo.taskState)
            && Objects.equals(this.validSince, autoLaunchGroupInfo.validSince)
            && Objects.equals(this.validUntil, autoLaunchGroupInfo.validUntil);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type, status, taskState, validSince, validUntil);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AutoLaunchGroupInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    taskState: ").append(toIndentedString(taskState)).append("\n");
        sb.append("    validSince: ").append(toIndentedString(validSince)).append("\n");
        sb.append("    validUntil: ").append(toIndentedString(validUntil)).append("\n");
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
