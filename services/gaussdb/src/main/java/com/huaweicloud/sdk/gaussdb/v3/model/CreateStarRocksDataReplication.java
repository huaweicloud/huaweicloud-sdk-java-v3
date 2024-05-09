package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * StarRocks创建数据同步请求。
 */
public class CreateStarRocksDataReplication {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_instance_id")

    private String sourceInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_node_id")

    private String sourceNodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_database")

    private String sourceDatabase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_database")

    private String targetDatabase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    public CreateStarRocksDataReplication withSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
        return this;
    }

    /**
     * GaussDB(for MySQL)实例ID。
     * @return sourceInstanceId
     */
    public String getSourceInstanceId() {
        return sourceInstanceId;
    }

    public void setSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
    }

    public CreateStarRocksDataReplication withSourceNodeId(String sourceNodeId) {
        this.sourceNodeId = sourceNodeId;
        return this;
    }

    /**
     * GaussDB(for MySQL)只读节点ID。如为空，则取GaussDB(for MySQL)主节点ID
     * @return sourceNodeId
     */
    public String getSourceNodeId() {
        return sourceNodeId;
    }

    public void setSourceNodeId(String sourceNodeId) {
        this.sourceNodeId = sourceNodeId;
    }

    public CreateStarRocksDataReplication withSourceDatabase(String sourceDatabase) {
        this.sourceDatabase = sourceDatabase;
        return this;
    }

    /**
     * 源数据库。
     * @return sourceDatabase
     */
    public String getSourceDatabase() {
        return sourceDatabase;
    }

    public void setSourceDatabase(String sourceDatabase) {
        this.sourceDatabase = sourceDatabase;
    }

    public CreateStarRocksDataReplication withTargetDatabase(String targetDatabase) {
        this.targetDatabase = targetDatabase;
        return this;
    }

    /**
     * 目标数据库。 字符长度限制3~128位，仅支持英文大小写字母、数字以及下划线_。
     * @return targetDatabase
     */
    public String getTargetDatabase() {
        return targetDatabase;
    }

    public void setTargetDatabase(String targetDatabase) {
        this.targetDatabase = targetDatabase;
    }

    public CreateStarRocksDataReplication withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * 同步任务名。 字符长度限制3~128位，仅支持英文大小写字母、数字以及下划线_。
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
        CreateStarRocksDataReplication that = (CreateStarRocksDataReplication) obj;
        return Objects.equals(this.sourceInstanceId, that.sourceInstanceId)
            && Objects.equals(this.sourceNodeId, that.sourceNodeId)
            && Objects.equals(this.sourceDatabase, that.sourceDatabase)
            && Objects.equals(this.targetDatabase, that.targetDatabase) && Objects.equals(this.taskName, that.taskName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceInstanceId, sourceNodeId, sourceDatabase, targetDatabase, taskName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateStarRocksDataReplication {\n");
        sb.append("    sourceInstanceId: ").append(toIndentedString(sourceInstanceId)).append("\n");
        sb.append("    sourceNodeId: ").append(toIndentedString(sourceNodeId)).append("\n");
        sb.append("    sourceDatabase: ").append(toIndentedString(sourceDatabase)).append("\n");
        sb.append("    targetDatabase: ").append(toIndentedString(targetDatabase)).append("\n");
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
