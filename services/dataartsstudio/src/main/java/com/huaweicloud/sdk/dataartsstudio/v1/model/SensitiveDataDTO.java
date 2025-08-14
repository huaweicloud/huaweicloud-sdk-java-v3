package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SensitiveDataDTO
 */
public class SensitiveDataDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    private String databaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema_name")

    private String schemaName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_name")

    private String columnName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_id")

    private String ruleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active_flag")

    private Integer activeFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "classification_id")

    private String classificationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category_id")

    private String categoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sync_time")

    private Long syncTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "find_time")

    private Long findTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    public SensitiveDataDTO withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 唯一标识，自动生成的ID。
     * minimum: 0
     * maximum: 9223372036854775807
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SensitiveDataDTO withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * 集群名称。
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public SensitiveDataDTO withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * 数据库名。
     * @return databaseName
     */
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public SensitiveDataDTO withSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }

    /**
     * 模式名。
     * @return schemaName
     */
    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    public SensitiveDataDTO withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * 表名称。
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public SensitiveDataDTO withColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }

    /**
     * 字段名称。
     * @return columnName
     */
    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public SensitiveDataDTO withRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /**
     * 规则id。
     * @return ruleId
     */
    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public SensitiveDataDTO withActiveFlag(Integer activeFlag) {
        this.activeFlag = activeFlag;
        return this;
    }

    /**
     * 是否有效。1:有效 2:无效 3:待确认。
     * minimum: 1
     * maximum: 3
     * @return activeFlag
     */
    public Integer getActiveFlag() {
        return activeFlag;
    }

    public void setActiveFlag(Integer activeFlag) {
        this.activeFlag = activeFlag;
    }

    public SensitiveDataDTO withClassificationId(String classificationId) {
        this.classificationId = classificationId;
        return this;
    }

    /**
     * 数据密级id。
     * @return classificationId
     */
    public String getClassificationId() {
        return classificationId;
    }

    public void setClassificationId(String classificationId) {
        this.classificationId = classificationId;
    }

    public SensitiveDataDTO withCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    /**
     * 分类ID。
     * @return categoryId
     */
    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public SensitiveDataDTO withSyncTime(Long syncTime) {
        this.syncTime = syncTime;
        return this;
    }

    /**
     * 同步时间。
     * minimum: 0
     * maximum: 9223372036854775807
     * @return syncTime
     */
    public Long getSyncTime() {
        return syncTime;
    }

    public void setSyncTime(Long syncTime) {
        this.syncTime = syncTime;
    }

    public SensitiveDataDTO withFindTime(Long findTime) {
        this.findTime = findTime;
        return this;
    }

    /**
     * 最后发现时间。
     * minimum: 0
     * maximum: 9223372036854775807
     * @return findTime
     */
    public Long getFindTime() {
        return findTime;
    }

    public void setFindTime(Long findTime) {
        this.findTime = findTime;
    }

    public SensitiveDataDTO withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务id。
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
        SensitiveDataDTO that = (SensitiveDataDTO) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.clusterName, that.clusterName)
            && Objects.equals(this.databaseName, that.databaseName) && Objects.equals(this.schemaName, that.schemaName)
            && Objects.equals(this.tableName, that.tableName) && Objects.equals(this.columnName, that.columnName)
            && Objects.equals(this.ruleId, that.ruleId) && Objects.equals(this.activeFlag, that.activeFlag)
            && Objects.equals(this.classificationId, that.classificationId)
            && Objects.equals(this.categoryId, that.categoryId) && Objects.equals(this.syncTime, that.syncTime)
            && Objects.equals(this.findTime, that.findTime) && Objects.equals(this.taskId, that.taskId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            clusterName,
            databaseName,
            schemaName,
            tableName,
            columnName,
            ruleId,
            activeFlag,
            classificationId,
            categoryId,
            syncTime,
            findTime,
            taskId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SensitiveDataDTO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
        sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
        sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
        sb.append("    classificationId: ").append(toIndentedString(classificationId)).append("\n");
        sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
        sb.append("    syncTime: ").append(toIndentedString(syncTime)).append("\n");
        sb.append("    findTime: ").append(toIndentedString(findTime)).append("\n");
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
