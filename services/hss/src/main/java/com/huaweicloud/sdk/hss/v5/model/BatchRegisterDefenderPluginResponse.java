package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class BatchRegisterDefenderPluginResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accepted_count")

    private Integer acceptedCount;

    public BatchRegisterDefenderPluginResponse withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * **参数解释**: 任务ID **取值范围**: 字符长度1-128位 
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public BatchRegisterDefenderPluginResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * **参数解释**: 总数 **取值范围**: 最小值0，最大值2000000 
     * minimum: 0
     * maximum: 2000000
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public BatchRegisterDefenderPluginResponse withAcceptedCount(Integer acceptedCount) {
        this.acceptedCount = acceptedCount;
        return this;
    }

    /**
     * **参数解释**: 接受数量 **取值范围**: 最小值0，最大值2000000 
     * minimum: 0
     * maximum: 2000000
     * @return acceptedCount
     */
    public Integer getAcceptedCount() {
        return acceptedCount;
    }

    public void setAcceptedCount(Integer acceptedCount) {
        this.acceptedCount = acceptedCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchRegisterDefenderPluginResponse that = (BatchRegisterDefenderPluginResponse) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.totalCount, that.totalCount)
            && Objects.equals(this.acceptedCount, that.acceptedCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, totalCount, acceptedCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchRegisterDefenderPluginResponse {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    acceptedCount: ").append(toIndentedString(acceptedCount)).append("\n");
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
