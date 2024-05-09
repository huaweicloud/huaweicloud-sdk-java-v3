package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 表配置。
 */
public class TablesConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_config")

    private String tableConfig;

    public TablesConfig withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * 表名。
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public TablesConfig withTableConfig(String tableConfig) {
        this.tableConfig = tableConfig;
        return this;
    }

    /**
     * 表配置值。
     * @return tableConfig
     */
    public String getTableConfig() {
        return tableConfig;
    }

    public void setTableConfig(String tableConfig) {
        this.tableConfig = tableConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TablesConfig that = (TablesConfig) obj;
        return Objects.equals(this.tableName, that.tableName) && Objects.equals(this.tableConfig, that.tableConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableName, tableConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TablesConfig {\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    tableConfig: ").append(toIndentedString(tableConfig)).append("\n");
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
