package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * StarRocks修改配置请求体。
 */
public class ModifyDataSyncConfigRequestV3 {

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_database_name")

    private String targetDatabaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_instance_level_sync")

    private String isInstanceLevelSync;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_repl_scope")

    private String databaseReplScope;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support_reg_exp")

    private String isSupportRegExp;

    public ModifyDataSyncConfigRequestV3 withSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
        return this;
    }

    /**
     * **参数解释**：  TaurusDB实例ID。  **约束限制**：  不涉及。  **取值范围**：  只能由英文字母、数字组成，后缀为in07，长度为36个字符。  **默认值**：  不涉及。
     * @return sourceInstanceId
     */
    public String getSourceInstanceId() {
        return sourceInstanceId;
    }

    public void setSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
    }

    public ModifyDataSyncConfigRequestV3 withSourceNodeId(String sourceNodeId) {
        this.sourceNodeId = sourceNodeId;
        return this;
    }

    /**
     * **参数解释**：  TaurusDB只读节点ID。  **约束限制**：  不涉及。  **取值范围**：  只能由英文字母、数字组成，后缀为no07，长度为36个字符。  **默认值**：  不涉及。
     * @return sourceNodeId
     */
    public String getSourceNodeId() {
        return sourceNodeId;
    }

    public void setSourceNodeId(String sourceNodeId) {
        this.sourceNodeId = sourceNodeId;
    }

    public ModifyDataSyncConfigRequestV3 withSourceDatabaseName(String sourceDatabaseName) {
        this.sourceDatabaseName = sourceDatabaseName;
        return this;
    }

    /**
     * **参数解释**：  TaurusDB数据库名。  **约束限制**：  不涉及。  **取值范围**：  字符长度限制3~1024位，仅支持英文大小写字母、数字以及下划线。  **默认值**：  不涉及。
     * @return sourceDatabaseName
     */
    public String getSourceDatabaseName() {
        return sourceDatabaseName;
    }

    public void setSourceDatabaseName(String sourceDatabaseName) {
        this.sourceDatabaseName = sourceDatabaseName;
    }

    public ModifyDataSyncConfigRequestV3 withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * **参数解释**：  数据同步任务名称。  **约束限制**：  不涉及。  **取值范围**：  长度限制3~128位，仅支持英文大小写字母、数字以及下划线。  **默认值**：  不涉及。
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public ModifyDataSyncConfigRequestV3 withDbConfigs(List<DbConfig> dbConfigs) {
        this.dbConfigs = dbConfigs;
        return this;
    }

    public ModifyDataSyncConfigRequestV3 addDbConfigsItem(DbConfig dbConfigsItem) {
        if (this.dbConfigs == null) {
            this.dbConfigs = new ArrayList<>();
        }
        this.dbConfigs.add(dbConfigsItem);
        return this;
    }

    public ModifyDataSyncConfigRequestV3 withDbConfigs(Consumer<List<DbConfig>> dbConfigsSetter) {
        if (this.dbConfigs == null) {
            this.dbConfigs = new ArrayList<>();
        }
        dbConfigsSetter.accept(this.dbConfigs);
        return this;
    }

    /**
     * **参数解释**：  库配置列表。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认值**：  不涉及。
     * @return dbConfigs
     */
    public List<DbConfig> getDbConfigs() {
        return dbConfigs;
    }

    public void setDbConfigs(List<DbConfig> dbConfigs) {
        this.dbConfigs = dbConfigs;
    }

    public ModifyDataSyncConfigRequestV3 withTablesConfigs(List<TablesConfig> tablesConfigs) {
        this.tablesConfigs = tablesConfigs;
        return this;
    }

    public ModifyDataSyncConfigRequestV3 addTablesConfigsItem(TablesConfig tablesConfigsItem) {
        if (this.tablesConfigs == null) {
            this.tablesConfigs = new ArrayList<>();
        }
        this.tablesConfigs.add(tablesConfigsItem);
        return this;
    }

    public ModifyDataSyncConfigRequestV3 withTablesConfigs(Consumer<List<TablesConfig>> tablesConfigsSetter) {
        if (this.tablesConfigs == null) {
            this.tablesConfigs = new ArrayList<>();
        }
        tablesConfigsSetter.accept(this.tablesConfigs);
        return this;
    }

    /**
     * **参数解释**：  表配置信息。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认值**：  不涉及。
     * @return tablesConfigs
     */
    public List<TablesConfig> getTablesConfigs() {
        return tablesConfigs;
    }

    public void setTablesConfigs(List<TablesConfig> tablesConfigs) {
        this.tablesConfigs = tablesConfigs;
    }

    public ModifyDataSyncConfigRequestV3 withTableReplConfig(TableReplConfig tableReplConfig) {
        this.tableReplConfig = tableReplConfig;
        return this;
    }

    public ModifyDataSyncConfigRequestV3 withTableReplConfig(Consumer<TableReplConfig> tableReplConfigSetter) {
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

    public ModifyDataSyncConfigRequestV3 withTargetDatabaseName(String targetDatabaseName) {
        this.targetDatabaseName = targetDatabaseName;
        return this;
    }

    /**
     * **参数解释**：  目标数据库名。  **约束限制**：  不涉及。  **取值范围**：  长度限制3~128位，仅支持英文大小写字母、数字以及下划线。  **默认值**：  不涉及。
     * @return targetDatabaseName
     */
    public String getTargetDatabaseName() {
        return targetDatabaseName;
    }

    public void setTargetDatabaseName(String targetDatabaseName) {
        this.targetDatabaseName = targetDatabaseName;
    }

    public ModifyDataSyncConfigRequestV3 withIsInstanceLevelSync(String isInstanceLevelSync) {
        this.isInstanceLevelSync = isInstanceLevelSync;
        return this;
    }

    /**
     * **参数解释**：  是否支持实例级同步。  **约束限制**：  不涉及。  **取值范围**：  - true：是。 - false：否。  **默认取值**：  false。
     * @return isInstanceLevelSync
     */
    public String getIsInstanceLevelSync() {
        return isInstanceLevelSync;
    }

    public void setIsInstanceLevelSync(String isInstanceLevelSync) {
        this.isInstanceLevelSync = isInstanceLevelSync;
    }

    public ModifyDataSyncConfigRequestV3 withDatabaseReplScope(String databaseReplScope) {
        this.databaseReplScope = databaseReplScope;
        return this;
    }

    /**
     * **参数解释**：  库同步范围。  **约束限制**：  不涉及。  **取值范围**：  - all：同步全部库。 - part：同步部分库。  **默认取值**：  part。
     * @return databaseReplScope
     */
    public String getDatabaseReplScope() {
        return databaseReplScope;
    }

    public void setDatabaseReplScope(String databaseReplScope) {
        this.databaseReplScope = databaseReplScope;
    }

    public ModifyDataSyncConfigRequestV3 withIsSupportRegExp(String isSupportRegExp) {
        this.isSupportRegExp = isSupportRegExp;
        return this;
    }

    /**
     * **参数解释**：  是否支持通配符。  **约束限制**：  不涉及。  **取值范围**：  - true：支持通配符。 - false：不支持通配符。  **默认取值**：  false。
     * @return isSupportRegExp
     */
    public String getIsSupportRegExp() {
        return isSupportRegExp;
    }

    public void setIsSupportRegExp(String isSupportRegExp) {
        this.isSupportRegExp = isSupportRegExp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModifyDataSyncConfigRequestV3 that = (ModifyDataSyncConfigRequestV3) obj;
        return Objects.equals(this.sourceInstanceId, that.sourceInstanceId)
            && Objects.equals(this.sourceNodeId, that.sourceNodeId)
            && Objects.equals(this.sourceDatabaseName, that.sourceDatabaseName)
            && Objects.equals(this.taskName, that.taskName) && Objects.equals(this.dbConfigs, that.dbConfigs)
            && Objects.equals(this.tablesConfigs, that.tablesConfigs)
            && Objects.equals(this.tableReplConfig, that.tableReplConfig)
            && Objects.equals(this.targetDatabaseName, that.targetDatabaseName)
            && Objects.equals(this.isInstanceLevelSync, that.isInstanceLevelSync)
            && Objects.equals(this.databaseReplScope, that.databaseReplScope)
            && Objects.equals(this.isSupportRegExp, that.isSupportRegExp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceInstanceId,
            sourceNodeId,
            sourceDatabaseName,
            taskName,
            dbConfigs,
            tablesConfigs,
            tableReplConfig,
            targetDatabaseName,
            isInstanceLevelSync,
            databaseReplScope,
            isSupportRegExp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyDataSyncConfigRequestV3 {\n");
        sb.append("    sourceInstanceId: ").append(toIndentedString(sourceInstanceId)).append("\n");
        sb.append("    sourceNodeId: ").append(toIndentedString(sourceNodeId)).append("\n");
        sb.append("    sourceDatabaseName: ").append(toIndentedString(sourceDatabaseName)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    dbConfigs: ").append(toIndentedString(dbConfigs)).append("\n");
        sb.append("    tablesConfigs: ").append(toIndentedString(tablesConfigs)).append("\n");
        sb.append("    tableReplConfig: ").append(toIndentedString(tableReplConfig)).append("\n");
        sb.append("    targetDatabaseName: ").append(toIndentedString(targetDatabaseName)).append("\n");
        sb.append("    isInstanceLevelSync: ").append(toIndentedString(isInstanceLevelSync)).append("\n");
        sb.append("    databaseReplScope: ").append(toIndentedString(databaseReplScope)).append("\n");
        sb.append("    isSupportRegExp: ").append(toIndentedString(isSupportRegExp)).append("\n");
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
