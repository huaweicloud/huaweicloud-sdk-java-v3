package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 查询同步映射请求参数。
 */
public class QueryUserSelectedObjectInfoReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema_name")

    private String schemaName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_column_info")

    private Boolean hasColumnInfo;

    public QueryUserSelectedObjectInfoReq withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * 库名。
     * @return dbName
     */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public QueryUserSelectedObjectInfoReq withSchemaName(String schemaName) {
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

    public QueryUserSelectedObjectInfoReq withTableName(String tableName) {
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

    public QueryUserSelectedObjectInfoReq withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，表示从此偏移量开始查询， offset 大于等于 0。默认为0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public QueryUserSelectedObjectInfoReq withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示的条目数量。默认为10，取值范围【1-1000】
     * minimum: 1
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public QueryUserSelectedObjectInfoReq withHasColumnInfo(Boolean hasColumnInfo) {
        this.hasColumnInfo = hasColumnInfo;
        return this;
    }

    /**
     * 是否有映射。
     * @return hasColumnInfo
     */
    public Boolean getHasColumnInfo() {
        return hasColumnInfo;
    }

    public void setHasColumnInfo(Boolean hasColumnInfo) {
        this.hasColumnInfo = hasColumnInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueryUserSelectedObjectInfoReq that = (QueryUserSelectedObjectInfoReq) obj;
        return Objects.equals(this.dbName, that.dbName) && Objects.equals(this.schemaName, that.schemaName)
            && Objects.equals(this.tableName, that.tableName) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.hasColumnInfo, that.hasColumnInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbName, schemaName, tableName, offset, limit, hasColumnInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryUserSelectedObjectInfoReq {\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    hasColumnInfo: ").append(toIndentedString(hasColumnInfo)).append("\n");
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
