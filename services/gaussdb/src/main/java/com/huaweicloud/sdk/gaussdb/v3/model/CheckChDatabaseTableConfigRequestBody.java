package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 表配置校验请求体。
 */
public class CheckChDatabaseTableConfigRequestBody {

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
    @JsonProperty(value = "db_configs")

    private List<ChDatabaseConfigsInfo> dbConfigs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tables_configs")

    private List<ChDatabaseTablesConfigsInfo> tablesConfigs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_repl_config")

    private ChDatabaseTableReplConfigInfo tableReplConfig;

    public CheckChDatabaseTableConfigRequestBody withSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
        return this;
    }

    /**
     * 源实例ID。
     * @return sourceInstanceId
     */
    public String getSourceInstanceId() {
        return sourceInstanceId;
    }

    public void setSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
    }

    public CheckChDatabaseTableConfigRequestBody withSourceNodeId(String sourceNodeId) {
        this.sourceNodeId = sourceNodeId;
        return this;
    }

    /**
     * 源节点ID。GaussDB(for MySQL)只读节点ID。如为空，则取GaussDB(for MySQL)主节点ID。
     * @return sourceNodeId
     */
    public String getSourceNodeId() {
        return sourceNodeId;
    }

    public void setSourceNodeId(String sourceNodeId) {
        this.sourceNodeId = sourceNodeId;
    }

    public CheckChDatabaseTableConfigRequestBody withSourceDatabaseName(String sourceDatabaseName) {
        this.sourceDatabaseName = sourceDatabaseName;
        return this;
    }

    /**
     * 源数据库名。
     * @return sourceDatabaseName
     */
    public String getSourceDatabaseName() {
        return sourceDatabaseName;
    }

    public void setSourceDatabaseName(String sourceDatabaseName) {
        this.sourceDatabaseName = sourceDatabaseName;
    }

    public CheckChDatabaseTableConfigRequestBody withDbConfigs(List<ChDatabaseConfigsInfo> dbConfigs) {
        this.dbConfigs = dbConfigs;
        return this;
    }

    public CheckChDatabaseTableConfigRequestBody addDbConfigsItem(ChDatabaseConfigsInfo dbConfigsItem) {
        if (this.dbConfigs == null) {
            this.dbConfigs = new ArrayList<>();
        }
        this.dbConfigs.add(dbConfigsItem);
        return this;
    }

    public CheckChDatabaseTableConfigRequestBody withDbConfigs(Consumer<List<ChDatabaseConfigsInfo>> dbConfigsSetter) {
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
    public List<ChDatabaseConfigsInfo> getDbConfigs() {
        return dbConfigs;
    }

    public void setDbConfigs(List<ChDatabaseConfigsInfo> dbConfigs) {
        this.dbConfigs = dbConfigs;
    }

    public CheckChDatabaseTableConfigRequestBody withTablesConfigs(List<ChDatabaseTablesConfigsInfo> tablesConfigs) {
        this.tablesConfigs = tablesConfigs;
        return this;
    }

    public CheckChDatabaseTableConfigRequestBody addTablesConfigsItem(ChDatabaseTablesConfigsInfo tablesConfigsItem) {
        if (this.tablesConfigs == null) {
            this.tablesConfigs = new ArrayList<>();
        }
        this.tablesConfigs.add(tablesConfigsItem);
        return this;
    }

    public CheckChDatabaseTableConfigRequestBody withTablesConfigs(
        Consumer<List<ChDatabaseTablesConfigsInfo>> tablesConfigsSetter) {
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
    public List<ChDatabaseTablesConfigsInfo> getTablesConfigs() {
        return tablesConfigs;
    }

    public void setTablesConfigs(List<ChDatabaseTablesConfigsInfo> tablesConfigs) {
        this.tablesConfigs = tablesConfigs;
    }

    public CheckChDatabaseTableConfigRequestBody withTableReplConfig(ChDatabaseTableReplConfigInfo tableReplConfig) {
        this.tableReplConfig = tableReplConfig;
        return this;
    }

    public CheckChDatabaseTableConfigRequestBody withTableReplConfig(
        Consumer<ChDatabaseTableReplConfigInfo> tableReplConfigSetter) {
        if (this.tableReplConfig == null) {
            this.tableReplConfig = new ChDatabaseTableReplConfigInfo();
            tableReplConfigSetter.accept(this.tableReplConfig);
        }

        return this;
    }

    /**
     * Get tableReplConfig
     * @return tableReplConfig
     */
    public ChDatabaseTableReplConfigInfo getTableReplConfig() {
        return tableReplConfig;
    }

    public void setTableReplConfig(ChDatabaseTableReplConfigInfo tableReplConfig) {
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
        CheckChDatabaseTableConfigRequestBody that = (CheckChDatabaseTableConfigRequestBody) obj;
        return Objects.equals(this.sourceInstanceId, that.sourceInstanceId)
            && Objects.equals(this.sourceNodeId, that.sourceNodeId)
            && Objects.equals(this.sourceDatabaseName, that.sourceDatabaseName)
            && Objects.equals(this.dbConfigs, that.dbConfigs) && Objects.equals(this.tablesConfigs, that.tablesConfigs)
            && Objects.equals(this.tableReplConfig, that.tableReplConfig);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(sourceInstanceId, sourceNodeId, sourceDatabaseName, dbConfigs, tablesConfigs, tableReplConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckChDatabaseTableConfigRequestBody {\n");
        sb.append("    sourceInstanceId: ").append(toIndentedString(sourceInstanceId)).append("\n");
        sb.append("    sourceNodeId: ").append(toIndentedString(sourceNodeId)).append("\n");
        sb.append("    sourceDatabaseName: ").append(toIndentedString(sourceDatabaseName)).append("\n");
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
