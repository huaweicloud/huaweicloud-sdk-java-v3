package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RecordUserViewVulTaskRequestInfo
 */
public class RecordUserViewVulTaskRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_type")

    private String taskType;

    public RecordUserViewVulTaskRequestInfo withTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * 任务类型 - vul_repair：修复任务 - vul_scan：扫描任务
     * @return taskType
     */
    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RecordUserViewVulTaskRequestInfo that = (RecordUserViewVulTaskRequestInfo) obj;
        return Objects.equals(this.taskType, that.taskType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecordUserViewVulTaskRequestInfo {\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
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
