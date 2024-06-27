package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListClickHouseDataBaseReplicationConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_instance_id")

    private String sourceInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_node_id")

    private String sourceNodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_info")

    private ChDatabaseConfigResponse databaseInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_infos")

    private List<ChDatabaseTableConfigCheckResult> tableInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_repl_config")

    private ChDatabaseTableReplConfigInfo tableReplConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_tables_change")

    private Boolean isTablesChange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_table_repl_config")

    private ChDatabaseTableReplConfigInfo newTableReplConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_error_of_alter_table")

    private String lastErrorOfAlterTable;

    public ListClickHouseDataBaseReplicationConfigResponse withSourceInstanceId(String sourceInstanceId) {
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

    public ListClickHouseDataBaseReplicationConfigResponse withSourceNodeId(String sourceNodeId) {
        this.sourceNodeId = sourceNodeId;
        return this;
    }

    /**
     * 源实例节点ID。
     * @return sourceNodeId
     */
    public String getSourceNodeId() {
        return sourceNodeId;
    }

    public void setSourceNodeId(String sourceNodeId) {
        this.sourceNodeId = sourceNodeId;
    }

    public ListClickHouseDataBaseReplicationConfigResponse withDatabaseInfo(ChDatabaseConfigResponse databaseInfo) {
        this.databaseInfo = databaseInfo;
        return this;
    }

    public ListClickHouseDataBaseReplicationConfigResponse withDatabaseInfo(
        Consumer<ChDatabaseConfigResponse> databaseInfoSetter) {
        if (this.databaseInfo == null) {
            this.databaseInfo = new ChDatabaseConfigResponse();
            databaseInfoSetter.accept(this.databaseInfo);
        }

        return this;
    }

    /**
     * Get databaseInfo
     * @return databaseInfo
     */
    public ChDatabaseConfigResponse getDatabaseInfo() {
        return databaseInfo;
    }

    public void setDatabaseInfo(ChDatabaseConfigResponse databaseInfo) {
        this.databaseInfo = databaseInfo;
    }

    public ListClickHouseDataBaseReplicationConfigResponse withTableInfos(
        List<ChDatabaseTableConfigCheckResult> tableInfos) {
        this.tableInfos = tableInfos;
        return this;
    }

    public ListClickHouseDataBaseReplicationConfigResponse addTableInfosItem(
        ChDatabaseTableConfigCheckResult tableInfosItem) {
        if (this.tableInfos == null) {
            this.tableInfos = new ArrayList<>();
        }
        this.tableInfos.add(tableInfosItem);
        return this;
    }

    public ListClickHouseDataBaseReplicationConfigResponse withTableInfos(
        Consumer<List<ChDatabaseTableConfigCheckResult>> tableInfosSetter) {
        if (this.tableInfos == null) {
            this.tableInfos = new ArrayList<>();
        }
        tableInfosSetter.accept(this.tableInfos);
        return this;
    }

    /**
     * 表配置信息。
     * @return tableInfos
     */
    public List<ChDatabaseTableConfigCheckResult> getTableInfos() {
        return tableInfos;
    }

    public void setTableInfos(List<ChDatabaseTableConfigCheckResult> tableInfos) {
        this.tableInfos = tableInfos;
    }

    public ListClickHouseDataBaseReplicationConfigResponse withTableReplConfig(
        ChDatabaseTableReplConfigInfo tableReplConfig) {
        this.tableReplConfig = tableReplConfig;
        return this;
    }

    public ListClickHouseDataBaseReplicationConfigResponse withTableReplConfig(
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

    public ListClickHouseDataBaseReplicationConfigResponse withIsTablesChange(Boolean isTablesChange) {
        this.isTablesChange = isTablesChange;
        return this;
    }

    /**
     * 同步任务表是否变化。
     * @return isTablesChange
     */
    public Boolean getIsTablesChange() {
        return isTablesChange;
    }

    public void setIsTablesChange(Boolean isTablesChange) {
        this.isTablesChange = isTablesChange;
    }

    public ListClickHouseDataBaseReplicationConfigResponse withNewTableReplConfig(
        ChDatabaseTableReplConfigInfo newTableReplConfig) {
        this.newTableReplConfig = newTableReplConfig;
        return this;
    }

    public ListClickHouseDataBaseReplicationConfigResponse withNewTableReplConfig(
        Consumer<ChDatabaseTableReplConfigInfo> newTableReplConfigSetter) {
        if (this.newTableReplConfig == null) {
            this.newTableReplConfig = new ChDatabaseTableReplConfigInfo();
            newTableReplConfigSetter.accept(this.newTableReplConfig);
        }

        return this;
    }

    /**
     * Get newTableReplConfig
     * @return newTableReplConfig
     */
    public ChDatabaseTableReplConfigInfo getNewTableReplConfig() {
        return newTableReplConfig;
    }

    public void setNewTableReplConfig(ChDatabaseTableReplConfigInfo newTableReplConfig) {
        this.newTableReplConfig = newTableReplConfig;
    }

    public ListClickHouseDataBaseReplicationConfigResponse withLastErrorOfAlterTable(String lastErrorOfAlterTable) {
        this.lastErrorOfAlterTable = lastErrorOfAlterTable;
        return this;
    }

    /**
     * 最近一次alter table的异常信息。
     * @return lastErrorOfAlterTable
     */
    public String getLastErrorOfAlterTable() {
        return lastErrorOfAlterTable;
    }

    public void setLastErrorOfAlterTable(String lastErrorOfAlterTable) {
        this.lastErrorOfAlterTable = lastErrorOfAlterTable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListClickHouseDataBaseReplicationConfigResponse that = (ListClickHouseDataBaseReplicationConfigResponse) obj;
        return Objects.equals(this.sourceInstanceId, that.sourceInstanceId)
            && Objects.equals(this.sourceNodeId, that.sourceNodeId)
            && Objects.equals(this.databaseInfo, that.databaseInfo) && Objects.equals(this.tableInfos, that.tableInfos)
            && Objects.equals(this.tableReplConfig, that.tableReplConfig)
            && Objects.equals(this.isTablesChange, that.isTablesChange)
            && Objects.equals(this.newTableReplConfig, that.newTableReplConfig)
            && Objects.equals(this.lastErrorOfAlterTable, that.lastErrorOfAlterTable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceInstanceId,
            sourceNodeId,
            databaseInfo,
            tableInfos,
            tableReplConfig,
            isTablesChange,
            newTableReplConfig,
            lastErrorOfAlterTable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListClickHouseDataBaseReplicationConfigResponse {\n");
        sb.append("    sourceInstanceId: ").append(toIndentedString(sourceInstanceId)).append("\n");
        sb.append("    sourceNodeId: ").append(toIndentedString(sourceNodeId)).append("\n");
        sb.append("    databaseInfo: ").append(toIndentedString(databaseInfo)).append("\n");
        sb.append("    tableInfos: ").append(toIndentedString(tableInfos)).append("\n");
        sb.append("    tableReplConfig: ").append(toIndentedString(tableReplConfig)).append("\n");
        sb.append("    isTablesChange: ").append(toIndentedString(isTablesChange)).append("\n");
        sb.append("    newTableReplConfig: ").append(toIndentedString(newTableReplConfig)).append("\n");
        sb.append("    lastErrorOfAlterTable: ").append(toIndentedString(lastErrorOfAlterTable)).append("\n");
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
