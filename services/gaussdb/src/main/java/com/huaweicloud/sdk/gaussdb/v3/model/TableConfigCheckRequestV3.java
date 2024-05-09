package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * HTAP表配置校验请求体。
 */
public class TableConfigCheckRequestV3 {

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
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_configs")

    private List<DbConfig> dbConfigs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tables_configs")

    private List<TablesConfig> tablesConfigs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_repl_config")

    private TableReplConfig tableReplConfig;

    public TableConfigCheckRequestV3 withSourceInstanceId(String sourceInstanceId) {
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

    public TableConfigCheckRequestV3 withSourceNodeId(String sourceNodeId) {
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

    public TableConfigCheckRequestV3 withSourceDatabaseName(String sourceDatabaseName) {
        this.sourceDatabaseName = sourceDatabaseName;
        return this;
    }

    /**
     * GaussDB(for MySQL)数据库名。
     * @return sourceDatabaseName
     */
    public String getSourceDatabaseName() {
        return sourceDatabaseName;
    }

    public void setSourceDatabaseName(String sourceDatabaseName) {
        this.sourceDatabaseName = sourceDatabaseName;
    }

    public TableConfigCheckRequestV3 withTaskName(String taskName) {
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

    public TableConfigCheckRequestV3 withDbConfigs(List<DbConfig> dbConfigs) {
        this.dbConfigs = dbConfigs;
        return this;
    }

    public TableConfigCheckRequestV3 addDbConfigsItem(DbConfig dbConfigsItem) {
        if (this.dbConfigs == null) {
            this.dbConfigs = new ArrayList<>();
        }
        this.dbConfigs.add(dbConfigsItem);
        return this;
    }

    public TableConfigCheckRequestV3 withDbConfigs(Consumer<List<DbConfig>> dbConfigsSetter) {
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

    public TableConfigCheckRequestV3 withTablesConfigs(List<TablesConfig> tablesConfigs) {
        this.tablesConfigs = tablesConfigs;
        return this;
    }

    public TableConfigCheckRequestV3 addTablesConfigsItem(TablesConfig tablesConfigsItem) {
        if (this.tablesConfigs == null) {
            this.tablesConfigs = new ArrayList<>();
        }
        this.tablesConfigs.add(tablesConfigsItem);
        return this;
    }

    public TableConfigCheckRequestV3 withTablesConfigs(Consumer<List<TablesConfig>> tablesConfigsSetter) {
        if (this.tablesConfigs == null) {
            this.tablesConfigs = new ArrayList<>();
        }
        tablesConfigsSetter.accept(this.tablesConfigs);
        return this;
    }

    /**
     * 表配置信息。
     * @return tablesConfigs
     */
    public List<TablesConfig> getTablesConfigs() {
        return tablesConfigs;
    }

    public void setTablesConfigs(List<TablesConfig> tablesConfigs) {
        this.tablesConfigs = tablesConfigs;
    }

    public TableConfigCheckRequestV3 withTableReplConfig(TableReplConfig tableReplConfig) {
        this.tableReplConfig = tableReplConfig;
        return this;
    }

    public TableConfigCheckRequestV3 withTableReplConfig(Consumer<TableReplConfig> tableReplConfigSetter) {
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
        TableConfigCheckRequestV3 that = (TableConfigCheckRequestV3) obj;
        return Objects.equals(this.sourceInstanceId, that.sourceInstanceId)
            && Objects.equals(this.sourceNodeId, that.sourceNodeId)
            && Objects.equals(this.sourceDatabaseName, that.sourceDatabaseName)
            && Objects.equals(this.taskName, that.taskName) && Objects.equals(this.dbConfigs, that.dbConfigs)
            && Objects.equals(this.tablesConfigs, that.tablesConfigs)
            && Objects.equals(this.tableReplConfig, that.tableReplConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceInstanceId,
            sourceNodeId,
            sourceDatabaseName,
            taskName,
            dbConfigs,
            tablesConfigs,
            tableReplConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TableConfigCheckRequestV3 {\n");
        sb.append("    sourceInstanceId: ").append(toIndentedString(sourceInstanceId)).append("\n");
        sb.append("    sourceNodeId: ").append(toIndentedString(sourceNodeId)).append("\n");
        sb.append("    sourceDatabaseName: ").append(toIndentedString(sourceDatabaseName)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    dbConfigs: ").append(toIndentedString(dbConfigs)).append("\n");
        sb.append("    tablesConfigs: ").append(toIndentedString(tablesConfigs)).append("\n");
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
