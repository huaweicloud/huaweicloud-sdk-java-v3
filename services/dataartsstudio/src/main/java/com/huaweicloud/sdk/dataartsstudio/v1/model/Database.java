package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Database
 */
public class Database {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    private String databaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_guid")

    private String databaseGuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_qualified_name")

    private String databaseQualifiedName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_count")

    private Integer tableCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_size")

    private Integer dataSize;

    public Database withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * 数据库名称
     * @return databaseName
     */
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public Database withDatabaseGuid(String databaseGuid) {
        this.databaseGuid = databaseGuid;
        return this;
    }

    /**
     * 数据库guid
     * @return databaseGuid
     */
    public String getDatabaseGuid() {
        return databaseGuid;
    }

    public void setDatabaseGuid(String databaseGuid) {
        this.databaseGuid = databaseGuid;
    }

    public Database withDatabaseQualifiedName(String databaseQualifiedName) {
        this.databaseQualifiedName = databaseQualifiedName;
        return this;
    }

    /**
     * 数据库的唯一标识名称
     * @return databaseQualifiedName
     */
    public String getDatabaseQualifiedName() {
        return databaseQualifiedName;
    }

    public void setDatabaseQualifiedName(String databaseQualifiedName) {
        this.databaseQualifiedName = databaseQualifiedName;
    }

    public Database withTableCount(Integer tableCount) {
        this.tableCount = tableCount;
        return this;
    }

    /**
     * 数据库中表数目
     * @return tableCount
     */
    public Integer getTableCount() {
        return tableCount;
    }

    public void setTableCount(Integer tableCount) {
        this.tableCount = tableCount;
    }

    public Database withDataSize(Integer dataSize) {
        this.dataSize = dataSize;
        return this;
    }

    /**
     * 数据量大小
     * @return dataSize
     */
    public Integer getDataSize() {
        return dataSize;
    }

    public void setDataSize(Integer dataSize) {
        this.dataSize = dataSize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Database that = (Database) obj;
        return Objects.equals(this.databaseName, that.databaseName)
            && Objects.equals(this.databaseGuid, that.databaseGuid)
            && Objects.equals(this.databaseQualifiedName, that.databaseQualifiedName)
            && Objects.equals(this.tableCount, that.tableCount) && Objects.equals(this.dataSize, that.dataSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(databaseName, databaseGuid, databaseQualifiedName, tableCount, dataSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Database {\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    databaseGuid: ").append(toIndentedString(databaseGuid)).append("\n");
        sb.append("    databaseQualifiedName: ").append(toIndentedString(databaseQualifiedName)).append("\n");
        sb.append("    tableCount: ").append(toIndentedString(tableCount)).append("\n");
        sb.append("    dataSize: ").append(toIndentedString(dataSize)).append("\n");
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
