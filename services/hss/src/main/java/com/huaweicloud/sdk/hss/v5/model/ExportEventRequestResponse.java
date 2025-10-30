package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ExportEventRequestResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_total_num")

    private Integer recordTotalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    public ExportEventRequestResponse withRecordTotalNum(Integer recordTotalNum) {
        this.recordTotalNum = recordTotalNum;
        return this;
    }

    /**
     * **参数解释**： 导出记录总数 **取值范围**： 不涉及
     * minimum: 0
     * maximum: 200000
     * @return recordTotalNum
     */
    public Integer getRecordTotalNum() {
        return recordTotalNum;
    }

    public void setRecordTotalNum(Integer recordTotalNum) {
        this.recordTotalNum = recordTotalNum;
    }

    public ExportEventRequestResponse withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * **参数解释**： 导出任务ID **取值范围**： 不涉及
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
        ExportEventRequestResponse that = (ExportEventRequestResponse) obj;
        return Objects.equals(this.recordTotalNum, that.recordTotalNum) && Objects.equals(this.taskId, that.taskId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordTotalNum, taskId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportEventRequestResponse {\n");
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
