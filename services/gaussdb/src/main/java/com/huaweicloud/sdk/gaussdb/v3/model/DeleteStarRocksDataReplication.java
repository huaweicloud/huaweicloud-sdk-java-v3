package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 删除StarRocks数据同步任务请求体。
 */
public class DeleteStarRocksDataReplication {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    public DeleteStarRocksDataReplication withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * 数据同步任务名。字符长度限制3~128位，仅支持英文大小写字母、数字以及下划线_。
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteStarRocksDataReplication that = (DeleteStarRocksDataReplication) obj;
        return Objects.equals(this.taskName, that.taskName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteStarRocksDataReplication {\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
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
