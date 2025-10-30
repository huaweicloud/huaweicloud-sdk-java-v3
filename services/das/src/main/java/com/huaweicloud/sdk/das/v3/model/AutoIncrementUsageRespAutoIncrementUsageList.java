package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AutoIncrementUsageRespAutoIncrementUsageList
 */
public class AutoIncrementUsageRespAutoIncrementUsageList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database")

    private String database;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table")

    private String table;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column")

    private String column;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_value")

    private String currentValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_value")

    private String maxValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ratio")

    private String ratio;

    public AutoIncrementUsageRespAutoIncrementUsageList withDatabase(String database) {
        this.database = database;
        return this;
    }

    /**
     * 数据库名
     * @return database
     */
    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public AutoIncrementUsageRespAutoIncrementUsageList withTable(String table) {
        this.table = table;
        return this;
    }

    /**
     * 表名
     * @return table
     */
    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public AutoIncrementUsageRespAutoIncrementUsageList withColumn(String column) {
        this.column = column;
        return this;
    }

    /**
     * 列名
     * @return column
     */
    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public AutoIncrementUsageRespAutoIncrementUsageList withCurrentValue(String currentValue) {
        this.currentValue = currentValue;
        return this;
    }

    /**
     * 自增ID当前值
     * @return currentValue
     */
    public String getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(String currentValue) {
        this.currentValue = currentValue;
    }

    public AutoIncrementUsageRespAutoIncrementUsageList withMaxValue(String maxValue) {
        this.maxValue = maxValue;
        return this;
    }

    /**
     * 该数据类型的自增 ID 支持的最大值。
     * @return maxValue
     */
    public String getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(String maxValue) {
        this.maxValue = maxValue;
    }

    public AutoIncrementUsageRespAutoIncrementUsageList withRatio(String ratio) {
        this.ratio = ratio;
        return this;
    }

    /**
     * 自增ID使用比例
     * @return ratio
     */
    public String getRatio() {
        return ratio;
    }

    public void setRatio(String ratio) {
        this.ratio = ratio;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AutoIncrementUsageRespAutoIncrementUsageList that = (AutoIncrementUsageRespAutoIncrementUsageList) obj;
        return Objects.equals(this.database, that.database) && Objects.equals(this.table, that.table)
            && Objects.equals(this.column, that.column) && Objects.equals(this.currentValue, that.currentValue)
            && Objects.equals(this.maxValue, that.maxValue) && Objects.equals(this.ratio, that.ratio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(database, table, column, currentValue, maxValue, ratio);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AutoIncrementUsageRespAutoIncrementUsageList {\n");
        sb.append("    database: ").append(toIndentedString(database)).append("\n");
        sb.append("    table: ").append(toIndentedString(table)).append("\n");
        sb.append("    column: ").append(toIndentedString(column)).append("\n");
        sb.append("    currentValue: ").append(toIndentedString(currentValue)).append("\n");
        sb.append("    maxValue: ").append(toIndentedString(maxValue)).append("\n");
        sb.append("    ratio: ").append(toIndentedString(ratio)).append("\n");
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
