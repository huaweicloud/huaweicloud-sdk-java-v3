package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 应急预案内部包含的作业、脚本信息
 */
public class SubTaskInfoDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_task_type")

    private String subTaskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_associated_task_id")

    private String subAssociatedTaskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_associated_task_name")

    private String subAssociatedTaskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_associated_task_type")

    private String subAssociatedTaskType;

    public SubTaskInfoDTO withSubTaskType(String subTaskType) {
        this.subTaskType = subTaskType;
        return this;
    }

    /**
     * 子任务类型
     * @return subTaskType
     */
    public String getSubTaskType() {
        return subTaskType;
    }

    public void setSubTaskType(String subTaskType) {
        this.subTaskType = subTaskType;
    }

    public SubTaskInfoDTO withSubAssociatedTaskId(String subAssociatedTaskId) {
        this.subAssociatedTaskId = subAssociatedTaskId;
        return this;
    }

    /**
     * 作业、脚本的id
     * @return subAssociatedTaskId
     */
    public String getSubAssociatedTaskId() {
        return subAssociatedTaskId;
    }

    public void setSubAssociatedTaskId(String subAssociatedTaskId) {
        this.subAssociatedTaskId = subAssociatedTaskId;
    }

    public SubTaskInfoDTO withSubAssociatedTaskName(String subAssociatedTaskName) {
        this.subAssociatedTaskName = subAssociatedTaskName;
        return this;
    }

    /**
     * 作业、脚本的名称
     * @return subAssociatedTaskName
     */
    public String getSubAssociatedTaskName() {
        return subAssociatedTaskName;
    }

    public void setSubAssociatedTaskName(String subAssociatedTaskName) {
        this.subAssociatedTaskName = subAssociatedTaskName;
    }

    public SubTaskInfoDTO withSubAssociatedTaskType(String subAssociatedTaskType) {
        this.subAssociatedTaskType = subAssociatedTaskType;
        return this;
    }

    /**
     * 作业、脚本的分类：自定义、公共
     * @return subAssociatedTaskType
     */
    public String getSubAssociatedTaskType() {
        return subAssociatedTaskType;
    }

    public void setSubAssociatedTaskType(String subAssociatedTaskType) {
        this.subAssociatedTaskType = subAssociatedTaskType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubTaskInfoDTO that = (SubTaskInfoDTO) obj;
        return Objects.equals(this.subTaskType, that.subTaskType)
            && Objects.equals(this.subAssociatedTaskId, that.subAssociatedTaskId)
            && Objects.equals(this.subAssociatedTaskName, that.subAssociatedTaskName)
            && Objects.equals(this.subAssociatedTaskType, that.subAssociatedTaskType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subTaskType, subAssociatedTaskId, subAssociatedTaskName, subAssociatedTaskType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubTaskInfoDTO {\n");
        sb.append("    subTaskType: ").append(toIndentedString(subTaskType)).append("\n");
        sb.append("    subAssociatedTaskId: ").append(toIndentedString(subAssociatedTaskId)).append("\n");
        sb.append("    subAssociatedTaskName: ").append(toIndentedString(subAssociatedTaskName)).append("\n");
        sb.append("    subAssociatedTaskType: ").append(toIndentedString(subAssociatedTaskType)).append("\n");
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
