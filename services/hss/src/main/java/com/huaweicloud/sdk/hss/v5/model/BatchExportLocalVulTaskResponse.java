package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class BatchExportLocalVulTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_total_num")

    private Long recordTotalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    public BatchExportLocalVulTaskResponse withRecordTotalNum(Long recordTotalNum) {
        this.recordTotalNum = recordTotalNum;
        return this;
    }

    /**
     * **参数解释**: 导出记录总数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return recordTotalNum
     */
    public Long getRecordTotalNum() {
        return recordTotalNum;
    }

    public void setRecordTotalNum(Long recordTotalNum) {
        this.recordTotalNum = recordTotalNum;
    }

    public BatchExportLocalVulTaskResponse withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * **参数解释**: 导出任务ID **取值范围**: 字符长度1-256位 
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchExportLocalVulTaskResponse that = (BatchExportLocalVulTaskResponse) obj;
        return Objects.equals(this.recordTotalNum, that.recordTotalNum) && Objects.equals(this.taskId, that.taskId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordTotalNum, taskId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchExportLocalVulTaskResponse {\n");
        sb.append("    recordTotalNum: ").append(toIndentedString(recordTotalNum)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
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
