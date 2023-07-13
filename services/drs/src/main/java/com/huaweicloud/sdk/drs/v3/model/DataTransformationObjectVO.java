package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 数据加工对象
 */
public class DataTransformationObjectVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_transformation_type")

    private String dataTransformationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema_name")

    private String schemaName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    public DataTransformationObjectVO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 数据库对象、数据库表名称和过滤类型名称，例如格式为db1-*-*-tb1-*-*---conditionFilter--。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DataTransformationObjectVO withDataTransformationType(String dataTransformationType) {
        this.dataTransformationType = dataTransformationType;
        return this;
    }

    /**
     * contentConditionalFilter：普通行过滤配置； configConditionalFilter：高级行过滤配置。
     * @return dataTransformationType
     */
    public String getDataTransformationType() {
        return dataTransformationType;
    }

    public void setDataTransformationType(String dataTransformationType) {
        this.dataTransformationType = dataTransformationType;
    }

    public DataTransformationObjectVO withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * 库名称。
     * @return dbName
     */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public DataTransformationObjectVO withSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }

    /**
     * schema名称。
     * @return schemaName
     */
    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    public DataTransformationObjectVO withTableName(String tableName) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataTransformationObjectVO that = (DataTransformationObjectVO) obj;
        return Objects.equals(this.id, that.id)
            && Objects.equals(this.dataTransformationType, that.dataTransformationType)
            && Objects.equals(this.dbName, that.dbName) && Objects.equals(this.schemaName, that.schemaName)
            && Objects.equals(this.tableName, that.tableName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dataTransformationType, dbName, schemaName, tableName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataTransformationObjectVO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    dataTransformationType: ").append(toIndentedString(dataTransformationType)).append("\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
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
