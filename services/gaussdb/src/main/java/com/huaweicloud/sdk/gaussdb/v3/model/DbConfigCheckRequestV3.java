package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * HTAP库配置校验请求体。
 */
public class DbConfigCheckRequestV3 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_instance_id")

    private String sourceInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_node_id")

    private String sourceNodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_database_name")

    private String sourceDatabaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_database_name")

    private String targetDatabaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_configs")

    private List<DbConfig> dbConfigs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_repl_config")

    private TableReplConfig tableReplConfig;

    public DbConfigCheckRequestV3 withSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
        return this;
    }

    /**
     * TaurusDB实例ID。
     * @return sourceInstanceId
     */
    public String getSourceInstanceId() {
        return sourceInstanceId;
    }

    public void setSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
    }

    public DbConfigCheckRequestV3 withSourceNodeId(String sourceNodeId) {
        this.sourceNodeId = sourceNodeId;
        return this;
    }

    /**
     * TaurusDB只读节点ID。如为空，则取TaurusDB主节点ID
     * @return sourceNodeId
     */
    public String getSourceNodeId() {
        return sourceNodeId;
    }

    public void setSourceNodeId(String sourceNodeId) {
        this.sourceNodeId = sourceNodeId;
    }

    public DbConfigCheckRequestV3 withSourceDatabaseName(String sourceDatabaseName) {
        this.sourceDatabaseName = sourceDatabaseName;
        return this;
    }

    /**
     * TaurusDB数据库名。
     * @return sourceDatabaseName
     */
    public String getSourceDatabaseName() {
        return sourceDatabaseName;
    }

    public void setSourceDatabaseName(String sourceDatabaseName) {
        this.sourceDatabaseName = sourceDatabaseName;
    }

    public DbConfigCheckRequestV3 withTargetDatabaseName(String targetDatabaseName) {
        this.targetDatabaseName = targetDatabaseName;
        return this;
    }

    /**
     * 目标数据库名。字符长度限制3~128位，仅支持英文大小写字母、数字以及下划线_。
     * @return targetDatabaseName
     */
    public String getTargetDatabaseName() {
        return targetDatabaseName;
    }

    public void setTargetDatabaseName(String targetDatabaseName) {
        this.targetDatabaseName = targetDatabaseName;
    }

    public DbConfigCheckRequestV3 withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * 同步任务名称。字符长度限制3~128位，仅支持英文大小写字母、数字以及下划线_。
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public DbConfigCheckRequestV3 withDbConfigs(List<DbConfig> dbConfigs) {
        this.dbConfigs = dbConfigs;
        return this;
    }

    public DbConfigCheckRequestV3 addDbConfigsItem(DbConfig dbConfigsItem) {
        if (this.dbConfigs == null) {
            this.dbConfigs = new ArrayList<>();
        }
        this.dbConfigs.add(dbConfigsItem);
        return this;
    }

    public DbConfigCheckRequestV3 withDbConfigs(Consumer<List<DbConfig>> dbConfigsSetter) {
        if (this.dbConfigs == null) {
            this.dbConfigs = new ArrayList<>();
        }
        dbConfigsSetter.accept(this.dbConfigs);
        return this;
    }

    /**
     * 库配置列表。
     * @return dbConfigs
     */
    public List<DbConfig> getDbConfigs() {
        return dbConfigs;
    }

    public void setDbConfigs(List<DbConfig> dbConfigs) {
        this.dbConfigs = dbConfigs;
    }

    public DbConfigCheckRequestV3 withTableReplConfig(TableReplConfig tableReplConfig) {
        this.tableReplConfig = tableReplConfig;
        return this;
    }

    public DbConfigCheckRequestV3 withTableReplConfig(Consumer<TableReplConfig> tableReplConfigSetter) {
        if (this.tableReplConfig == null) {
            this.tableReplConfig = new TableReplConfig();
            tableReplConfigSetter.accept(this.tableReplConfig);
        }

        return this;
    }

    /**
     * Get tableReplConfig
     * @return tableReplConfig
     */
    public TableReplConfig getTableReplConfig() {
        return tableReplConfig;
    }

    public void setTableReplConfig(TableReplConfig tableReplConfig) {
        this.tableReplConfig = tableReplConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DbConfigCheckRequestV3 that = (DbConfigCheckRequestV3) obj;
        return Objects.equals(this.sourceInstanceId, that.sourceInstanceId)
            && Objects.equals(this.sourceNodeId, that.sourceNodeId)
            && Objects.equals(this.sourceDatabaseName, that.sourceDatabaseName)
            && Objects.equals(this.targetDatabaseName, that.targetDatabaseName)
            && Objects.equals(this.taskName, that.taskName) && Objects.equals(this.dbConfigs, that.dbConfigs)
            && Objects.equals(this.tableReplConfig, that.tableReplConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceInstanceId,
            sourceNodeId,
            sourceDatabaseName,
            targetDatabaseName,
            taskName,
            dbConfigs,
            tableReplConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DbConfigCheckRequestV3 {\n");
        sb.append("    sourceInstanceId: ").append(toIndentedString(sourceInstanceId)).append("\n");
        sb.append("    sourceNodeId: ").append(toIndentedString(sourceNodeId)).append("\n");
        sb.append("    sourceDatabaseName: ").append(toIndentedString(sourceDatabaseName)).append("\n");
        sb.append("    targetDatabaseName: ").append(toIndentedString(targetDatabaseName)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    dbConfigs: ").append(toIndentedString(dbConfigs)).append("\n");
        sb.append("    tableReplConfig: ").append(toIndentedString(tableReplConfig)).append("\n");
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
