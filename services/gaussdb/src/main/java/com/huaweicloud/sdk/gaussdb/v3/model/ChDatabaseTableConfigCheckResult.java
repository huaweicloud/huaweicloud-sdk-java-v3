package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 表配置校验结果。
 */
public class ChDatabaseTableConfigCheckResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_config")

    private String tableConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_result")

    private String checkResult;

    public ChDatabaseTableConfigCheckResult withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * 数据库表名。
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public ChDatabaseTableConfigCheckResult withTableConfig(String tableConfig) {
        this.tableConfig = tableConfig;
        return this;
    }

    /**
     * 表配置项。  允许输入的列操作有：PARTITION BY, COLUMNS, ORDER BY, SAMPLE BY, PRIMARY KEY, TTL
     * @return tableConfig
     */
    public String getTableConfig() {
        return tableConfig;
    }

    public void setTableConfig(String tableConfig) {
        this.tableConfig = tableConfig;
    }

    public ChDatabaseTableConfigCheckResult withCheckResult(String checkResult) {
        this.checkResult = checkResult;
        return this;
    }

    /**
     * 校验结果。
     * @return checkResult
     */
    public String getCheckResult() {
        return checkResult;
    }

    public void setCheckResult(String checkResult) {
        this.checkResult = checkResult;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChDatabaseTableConfigCheckResult that = (ChDatabaseTableConfigCheckResult) obj;
        return Objects.equals(this.tableName, that.tableName) && Objects.equals(this.tableConfig, that.tableConfig)
            && Objects.equals(this.checkResult, that.checkResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableName, tableConfig, checkResult);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChDatabaseTableConfigCheckResult {\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    tableConfig: ").append(toIndentedString(tableConfig)).append("\n");
        sb.append("    checkResult: ").append(toIndentedString(checkResult)).append("\n");
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
