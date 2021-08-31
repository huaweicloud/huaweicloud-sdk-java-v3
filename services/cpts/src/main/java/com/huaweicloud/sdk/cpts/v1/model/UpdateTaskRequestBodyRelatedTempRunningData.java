package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** UpdateTaskRequestBodyRelatedTempRunningData */
public class UpdateTaskRequestBodyRelatedTempRunningData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_run_info_id")

    private Integer taskRunInfoId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "related_temp_running_id")

    private Integer relatedTempRunningId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "temp_id")

    private Integer tempId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "temp_name")

    private String tempName;

    public UpdateTaskRequestBodyRelatedTempRunningData withTaskRunInfoId(Integer taskRunInfoId) {
        this.taskRunInfoId = taskRunInfoId;
        return this;
    }

    /** task_run_info_id minimum: 0 maximum: 2147483647
     * 
     * @return taskRunInfoId */
    public Integer getTaskRunInfoId() {
        return taskRunInfoId;
    }

    public void setTaskRunInfoId(Integer taskRunInfoId) {
        this.taskRunInfoId = taskRunInfoId;
    }

    public UpdateTaskRequestBodyRelatedTempRunningData withRelatedTempRunningId(Integer relatedTempRunningId) {
        this.relatedTempRunningId = relatedTempRunningId;
        return this;
    }

    /** related_temp_running_id minimum: 0 maximum: 2147483647
     * 
     * @return relatedTempRunningId */
    public Integer getRelatedTempRunningId() {
        return relatedTempRunningId;
    }

    public void setRelatedTempRunningId(Integer relatedTempRunningId) {
        this.relatedTempRunningId = relatedTempRunningId;
    }

    public UpdateTaskRequestBodyRelatedTempRunningData withTempId(Integer tempId) {
        this.tempId = tempId;
        return this;
    }

    /** temp_id minimum: 0 maximum: 2147483647
     * 
     * @return tempId */
    public Integer getTempId() {
        return tempId;
    }

    public void setTempId(Integer tempId) {
        this.tempId = tempId;
    }

    public UpdateTaskRequestBodyRelatedTempRunningData withTempName(String tempName) {
        this.tempName = tempName;
        return this;
    }

    /** temp_name
     * 
     * @return tempName */
    public String getTempName() {
        return tempName;
    }

    public void setTempName(String tempName) {
        this.tempName = tempName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateTaskRequestBodyRelatedTempRunningData updateTaskRequestBodyRelatedTempRunningData =
            (UpdateTaskRequestBodyRelatedTempRunningData) o;
        return Objects.equals(this.taskRunInfoId, updateTaskRequestBodyRelatedTempRunningData.taskRunInfoId)
            && Objects.equals(this.relatedTempRunningId,
                updateTaskRequestBodyRelatedTempRunningData.relatedTempRunningId)
            && Objects.equals(this.tempId, updateTaskRequestBodyRelatedTempRunningData.tempId)
            && Objects.equals(this.tempName, updateTaskRequestBodyRelatedTempRunningData.tempName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskRunInfoId, relatedTempRunningId, tempId, tempName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTaskRequestBodyRelatedTempRunningData {\n");
        sb.append("    taskRunInfoId: ").append(toIndentedString(taskRunInfoId)).append("\n");
        sb.append("    relatedTempRunningId: ").append(toIndentedString(relatedTempRunningId)).append("\n");
        sb.append("    tempId: ").append(toIndentedString(tempId)).append("\n");
        sb.append("    tempName: ").append(toIndentedString(tempName)).append("\n");
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
