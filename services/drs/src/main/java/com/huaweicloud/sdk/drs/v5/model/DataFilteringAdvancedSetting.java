package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 数据过滤高级设置信息体
 */
public class DataFilteringAdvancedSetting {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "col_names")

    private String colNames;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prim_key_or_indexes")

    private String primKeyOrIndexes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "indexes")

    private String indexes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "values")

    private String values;

    public DataFilteringAdvancedSetting withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * 库名
     * @return dbName
     */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public DataFilteringAdvancedSetting withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * 表名
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public DataFilteringAdvancedSetting withColNames(String colNames) {
        this.colNames = colNames;
        return this;
    }

    /**
     * 列名
     * @return colNames
     */
    public String getColNames() {
        return colNames;
    }

    public void setColNames(String colNames) {
        this.colNames = colNames;
    }

    public DataFilteringAdvancedSetting withPrimKeyOrIndexes(String primKeyOrIndexes) {
        this.primKeyOrIndexes = primKeyOrIndexes;
        return this;
    }

    /**
     * 主键或唯一索引
     * @return primKeyOrIndexes
     */
    public String getPrimKeyOrIndexes() {
        return primKeyOrIndexes;
    }

    public void setPrimKeyOrIndexes(String primKeyOrIndexes) {
        this.primKeyOrIndexes = primKeyOrIndexes;
    }

    public DataFilteringAdvancedSetting withIndexes(String indexes) {
        this.indexes = indexes;
        return this;
    }

    /**
     * 优化查询所需的索引
     * @return indexes
     */
    public String getIndexes() {
        return indexes;
    }

    public void setIndexes(String indexes) {
        this.indexes = indexes;
    }

    public DataFilteringAdvancedSetting withValues(String values) {
        this.values = values;
        return this;
    }

    /**
     * 过滤条件
     * @return values
     */
    public String getValues() {
        return values;
    }

    public void setValues(String values) {
        this.values = values;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataFilteringAdvancedSetting that = (DataFilteringAdvancedSetting) obj;
        return Objects.equals(this.dbName, that.dbName) && Objects.equals(this.tableName, that.tableName)
            && Objects.equals(this.colNames, that.colNames)
            && Objects.equals(this.primKeyOrIndexes, that.primKeyOrIndexes)
            && Objects.equals(this.indexes, that.indexes) && Objects.equals(this.values, that.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbName, tableName, colNames, primKeyOrIndexes, indexes, values);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataFilteringAdvancedSetting {\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    colNames: ").append(toIndentedString(colNames)).append("\n");
        sb.append("    primKeyOrIndexes: ").append(toIndentedString(primKeyOrIndexes)).append("\n");
        sb.append("    indexes: ").append(toIndentedString(indexes)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
