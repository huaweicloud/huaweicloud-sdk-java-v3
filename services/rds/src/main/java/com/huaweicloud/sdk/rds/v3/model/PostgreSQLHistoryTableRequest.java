package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询可恢复表的请求信息
 */
public class PostgreSQLHistoryTableRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_ids")

    private List<String> instanceIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restore_time")

    private Long restoreTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name_like")

    private String databaseNameLike;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name_like")

    private String tableNameLike;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name_like")

    private String instanceNameLike;

    public PostgreSQLHistoryTableRequest withInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }

    public PostgreSQLHistoryTableRequest addInstanceIdsItem(String instanceIdsItem) {
        if (this.instanceIds == null) {
            this.instanceIds = new ArrayList<>();
        }
        this.instanceIds.add(instanceIdsItem);
        return this;
    }

    public PostgreSQLHistoryTableRequest withInstanceIds(Consumer<List<String>> instanceIdsSetter) {
        if (this.instanceIds == null) {
            this.instanceIds = new ArrayList<>();
        }
        instanceIdsSetter.accept(this.instanceIds);
        return this;
    }

    /**
     * 实例ID集合
     * @return instanceIds
     */
    public List<String> getInstanceIds() {
        return instanceIds;
    }

    public void setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
    }

    public PostgreSQLHistoryTableRequest withRestoreTime(Long restoreTime) {
        this.restoreTime = restoreTime;
        return this;
    }

    /**
     * 恢复时间点
     * @return restoreTime
     */
    public Long getRestoreTime() {
        return restoreTime;
    }

    public void setRestoreTime(Long restoreTime) {
        this.restoreTime = restoreTime;
    }

    public PostgreSQLHistoryTableRequest withDatabaseNameLike(String databaseNameLike) {
        this.databaseNameLike = databaseNameLike;
        return this;
    }

    /**
     * 数据库名，模糊查询
     * @return databaseNameLike
     */
    public String getDatabaseNameLike() {
        return databaseNameLike;
    }

    public void setDatabaseNameLike(String databaseNameLike) {
        this.databaseNameLike = databaseNameLike;
    }

    public PostgreSQLHistoryTableRequest withTableNameLike(String tableNameLike) {
        this.tableNameLike = tableNameLike;
        return this;
    }

    /**
     * 数据库表名，模糊查询
     * @return tableNameLike
     */
    public String getTableNameLike() {
        return tableNameLike;
    }

    public void setTableNameLike(String tableNameLike) {
        this.tableNameLike = tableNameLike;
    }

    public PostgreSQLHistoryTableRequest withInstanceNameLike(String instanceNameLike) {
        this.instanceNameLike = instanceNameLike;
        return this;
    }

    /**
     * 实例名称，模糊查询
     * @return instanceNameLike
     */
    public String getInstanceNameLike() {
        return instanceNameLike;
    }

    public void setInstanceNameLike(String instanceNameLike) {
        this.instanceNameLike = instanceNameLike;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PostgreSQLHistoryTableRequest that = (PostgreSQLHistoryTableRequest) obj;
        return Objects.equals(this.instanceIds, that.instanceIds) && Objects.equals(this.restoreTime, that.restoreTime)
            && Objects.equals(this.databaseNameLike, that.databaseNameLike)
            && Objects.equals(this.tableNameLike, that.tableNameLike)
            && Objects.equals(this.instanceNameLike, that.instanceNameLike);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceIds, restoreTime, databaseNameLike, tableNameLike, instanceNameLike);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostgreSQLHistoryTableRequest {\n");
        sb.append("    instanceIds: ").append(toIndentedString(instanceIds)).append("\n");
        sb.append("    restoreTime: ").append(toIndentedString(restoreTime)).append("\n");
        sb.append("    databaseNameLike: ").append(toIndentedString(databaseNameLike)).append("\n");
        sb.append("    tableNameLike: ").append(toIndentedString(tableNameLike)).append("\n");
        sb.append("    instanceNameLike: ").append(toIndentedString(instanceNameLike)).append("\n");
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
