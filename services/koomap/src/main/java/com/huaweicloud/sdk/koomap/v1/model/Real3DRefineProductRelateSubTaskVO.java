package com.huaweicloud.sdk.koomap.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 精修后处理成果数据关联后处理任务。
 */
public class Real3DRefineProductRelateSubTaskVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subtask_name")

    private String subtaskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subtask_id")

    private String subtaskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "completed_time")

    private String completedTime;

    public Real3DRefineProductRelateSubTaskVO withSubtaskName(String subtaskName) {
        this.subtaskName = subtaskName;
        return this;
    }

    /**
     * 精修后处理任务别名。
     * @return subtaskName
     */
    public String getSubtaskName() {
        return subtaskName;
    }

    public void setSubtaskName(String subtaskName) {
        this.subtaskName = subtaskName;
    }

    public Real3DRefineProductRelateSubTaskVO withSubtaskId(String subtaskId) {
        this.subtaskId = subtaskId;
        return this;
    }

    /**
     * 精修后处理任务ID。
     * @return subtaskId
     */
    public String getSubtaskId() {
        return subtaskId;
    }

    public void setSubtaskId(String subtaskId) {
        this.subtaskId = subtaskId;
    }

    public Real3DRefineProductRelateSubTaskVO withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 精修后处理任务创建时间。格式为UTC时间：yyyy-MM-dd'T'HH:mm:ss'Z'。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Real3DRefineProductRelateSubTaskVO withCompletedTime(String completedTime) {
        this.completedTime = completedTime;
        return this;
    }

    /**
     * 精修后处理任务完成时间。格式为UTC时间：yyyy-MM-dd'T'HH:mm:ss'Z'。
     * @return completedTime
     */
    public String getCompletedTime() {
        return completedTime;
    }

    public void setCompletedTime(String completedTime) {
        this.completedTime = completedTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Real3DRefineProductRelateSubTaskVO that = (Real3DRefineProductRelateSubTaskVO) obj;
        return Objects.equals(this.subtaskName, that.subtaskName) && Objects.equals(this.subtaskId, that.subtaskId)
            && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.completedTime, that.completedTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subtaskName, subtaskId, createTime, completedTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Real3DRefineProductRelateSubTaskVO {\n");
        sb.append("    subtaskName: ").append(toIndentedString(subtaskName)).append("\n");
        sb.append("    subtaskId: ").append(toIndentedString(subtaskId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    completedTime: ").append(toIndentedString(completedTime)).append("\n");
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
