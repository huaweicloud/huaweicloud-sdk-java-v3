package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 列加工对象 约束： 列加工提供列级的查询、映射和过滤能力。 编辑列名后，目标数据库的列名为修改后的名称。 列映射名不能和原列名或已存在的映射名相同。 不支持库名、表名带有换行符的列进行映射。 任务再编辑时，已经同步的表不支持修改列信息。 只有勾选的列才会被同步。 MySQL-&gt;MySQL、MySQL-&gt;GaussDB(for MySQL)不支持分区表的分区字段进行列映射。 GaussDB分区键不可以被过滤。
 */
public class DbObjectColumnInfo {

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
    @JsonProperty(value = "column_infos")

    private List<QueryColumnInfo> columnInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public DbObjectColumnInfo withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * 数据库库名称。
     * @return dbName
     */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public DbObjectColumnInfo withSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }

    /**
     * 数据库schema名称。
     * @return schemaName
     */
    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    public DbObjectColumnInfo withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * 数据库表名称。
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public DbObjectColumnInfo withColumnInfos(List<QueryColumnInfo> columnInfos) {
        this.columnInfos = columnInfos;
        return this;
    }

    public DbObjectColumnInfo addColumnInfosItem(QueryColumnInfo columnInfosItem) {
        if (this.columnInfos == null) {
            this.columnInfos = new ArrayList<>();
        }
        this.columnInfos.add(columnInfosItem);
        return this;
    }

    public DbObjectColumnInfo withColumnInfos(Consumer<List<QueryColumnInfo>> columnInfosSetter) {
        if (this.columnInfos == null) {
            this.columnInfos = new ArrayList<>();
        }
        columnInfosSetter.accept(this.columnInfos);
        return this;
    }

    /**
     * 数据库列信息。
     * @return columnInfos
     */
    public List<QueryColumnInfo> getColumnInfos() {
        return columnInfos;
    }

    public void setColumnInfos(List<QueryColumnInfo> columnInfos) {
        this.columnInfos = columnInfos;
    }

    public DbObjectColumnInfo withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 数据库列信息总数，与分页无关，仅作为返回体参数
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DbObjectColumnInfo that = (DbObjectColumnInfo) obj;
        return Objects.equals(this.dbName, that.dbName) && Objects.equals(this.schemaName, that.schemaName)
            && Objects.equals(this.tableName, that.tableName) && Objects.equals(this.columnInfos, that.columnInfos)
            && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbName, schemaName, tableName, columnInfos, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DbObjectColumnInfo {\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    columnInfos: ").append(toIndentedString(columnInfos)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
