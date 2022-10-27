package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建任务请求体。
 */
public class CreateVmsTaskResponseMode {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ret_code")

    private String retCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desc")

    private String desc;

    public CreateVmsTaskResponseMode withRetCode(String retCode) {
        this.retCode = retCode;
        return this;
    }

    /**
     * 智能信息基础版下发结果返回码。
     * @return retCode
     */
    public String getRetCode() {
        return retCode;
    }

    public void setRetCode(String retCode) {
        this.retCode = retCode;
    }

    public CreateVmsTaskResponseMode withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 智能信息基础版下发任务批次ID。
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public CreateVmsTaskResponseMode withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * 智能信息基础版下发描述信息。
     * @return desc
     */
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateVmsTaskResponseMode createVmsTaskResponseMode = (CreateVmsTaskResponseMode) o;
        return Objects.equals(this.retCode, createVmsTaskResponseMode.retCode)
            && Objects.equals(this.taskId, createVmsTaskResponseMode.taskId)
            && Objects.equals(this.desc, createVmsTaskResponseMode.desc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(retCode, taskId, desc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVmsTaskResponseMode {\n");
        sb.append("    retCode: ").append(toIndentedString(retCode)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
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
