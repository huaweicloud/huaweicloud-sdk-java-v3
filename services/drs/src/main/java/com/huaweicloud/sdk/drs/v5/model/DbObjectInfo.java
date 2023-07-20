package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 对象信息。
 */
public class DbObjectInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_db_name")

    private String sourceDbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_schema_name")

    private String sourceSchemaName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_table_name")

    private String sourceTableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_db_name")

    private String targetDbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_schema_name")

    private String targetSchemaName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_table_name")

    private String targetTableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_column_info")

    private Boolean hasColumnInfo;

    public DbObjectInfo withSourceDbName(String sourceDbName) {
        this.sourceDbName = sourceDbName;
        return this;
    }

    /**
     * 源数据库库名。
     * @return sourceDbName
     */
    public String getSourceDbName() {
        return sourceDbName;
    }

    public void setSourceDbName(String sourceDbName) {
        this.sourceDbName = sourceDbName;
    }

    public DbObjectInfo withSourceSchemaName(String sourceSchemaName) {
        this.sourceSchemaName = sourceSchemaName;
        return this;
    }

    /**
     * 源数据库模式名。
     * @return sourceSchemaName
     */
    public String getSourceSchemaName() {
        return sourceSchemaName;
    }

    public void setSourceSchemaName(String sourceSchemaName) {
        this.sourceSchemaName = sourceSchemaName;
    }

    public DbObjectInfo withSourceTableName(String sourceTableName) {
        this.sourceTableName = sourceTableName;
        return this;
    }

    /**
     * 源数据库表名。
     * @return sourceTableName
     */
    public String getSourceTableName() {
        return sourceTableName;
    }

    public void setSourceTableName(String sourceTableName) {
        this.sourceTableName = sourceTableName;
    }

    public DbObjectInfo withTargetDbName(String targetDbName) {
        this.targetDbName = targetDbName;
        return this;
    }

    /**
     * 目标数据库库名。
     * @return targetDbName
     */
    public String getTargetDbName() {
        return targetDbName;
    }

    public void setTargetDbName(String targetDbName) {
        this.targetDbName = targetDbName;
    }

    public DbObjectInfo withTargetSchemaName(String targetSchemaName) {
        this.targetSchemaName = targetSchemaName;
        return this;
    }

    /**
     * 目标数据库模式名。
     * @return targetSchemaName
     */
    public String getTargetSchemaName() {
        return targetSchemaName;
    }

    public void setTargetSchemaName(String targetSchemaName) {
        this.targetSchemaName = targetSchemaName;
    }

    public DbObjectInfo withTargetTableName(String targetTableName) {
        this.targetTableName = targetTableName;
        return this;
    }

    /**
     * 目标数据库表名。
     * @return targetTableName
     */
    public String getTargetTableName() {
        return targetTableName;
    }

    public void setTargetTableName(String targetTableName) {
        this.targetTableName = targetTableName;
    }

    public DbObjectInfo withHasColumnInfo(Boolean hasColumnInfo) {
        this.hasColumnInfo = hasColumnInfo;
        return this;
    }

    /**
     * 是否有列映射。
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
        DbObjectInfo that = (DbObjectInfo) obj;
        return Objects.equals(this.sourceDbName, that.sourceDbName)
            && Objects.equals(this.sourceSchemaName, that.sourceSchemaName)
            && Objects.equals(this.sourceTableName, that.sourceTableName)
            && Objects.equals(this.targetDbName, that.targetDbName)
            && Objects.equals(this.targetSchemaName, that.targetSchemaName)
            && Objects.equals(this.targetTableName, that.targetTableName)
            && Objects.equals(this.hasColumnInfo, that.hasColumnInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceDbName,
            sourceSchemaName,
            sourceTableName,
            targetDbName,
            targetSchemaName,
            targetTableName,
            hasColumnInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DbObjectInfo {\n");
        sb.append("    sourceDbName: ").append(toIndentedString(sourceDbName)).append("\n");
        sb.append("    sourceSchemaName: ").append(toIndentedString(sourceSchemaName)).append("\n");
        sb.append("    sourceTableName: ").append(toIndentedString(sourceTableName)).append("\n");
        sb.append("    targetDbName: ").append(toIndentedString(targetDbName)).append("\n");
        sb.append("    targetSchemaName: ").append(toIndentedString(targetSchemaName)).append("\n");
        sb.append("    targetTableName: ").append(toIndentedString(targetTableName)).append("\n");
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
