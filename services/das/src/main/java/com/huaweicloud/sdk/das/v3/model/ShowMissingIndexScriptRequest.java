package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowMissingIndexScriptRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "equality_columns")

    private String equalityColumns;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inequality_columns")

    private String inequalityColumns;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "included_columns")

    private String includedColumns;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_id")

    private String objectId;

    public ShowMissingIndexScriptRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ShowMissingIndexScriptRequest withTableName(String tableName) {
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

    public ShowMissingIndexScriptRequest withEqualityColumns(String equalityColumns) {
        this.equalityColumns = equalityColumns;
        return this;
    }

    /**
     * 相等列
     * @return equalityColumns
     */
    public String getEqualityColumns() {
        return equalityColumns;
    }

    public void setEqualityColumns(String equalityColumns) {
        this.equalityColumns = equalityColumns;
    }

    public ShowMissingIndexScriptRequest withInequalityColumns(String inequalityColumns) {
        this.inequalityColumns = inequalityColumns;
        return this;
    }

    /**
     * 不等列
     * @return inequalityColumns
     */
    public String getInequalityColumns() {
        return inequalityColumns;
    }

    public void setInequalityColumns(String inequalityColumns) {
        this.inequalityColumns = inequalityColumns;
    }

    public ShowMissingIndexScriptRequest withIncludedColumns(String includedColumns) {
        this.includedColumns = includedColumns;
        return this;
    }

    /**
     * 包含列
     * @return includedColumns
     */
    public String getIncludedColumns() {
        return includedColumns;
    }

    public void setIncludedColumns(String includedColumns) {
        this.includedColumns = includedColumns;
    }

    public ShowMissingIndexScriptRequest withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * 对象ID
     * @return objectId
     */
    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowMissingIndexScriptRequest that = (ShowMissingIndexScriptRequest) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.tableName, that.tableName)
            && Objects.equals(this.equalityColumns, that.equalityColumns)
            && Objects.equals(this.inequalityColumns, that.inequalityColumns)
            && Objects.equals(this.includedColumns, that.includedColumns)
            && Objects.equals(this.objectId, that.objectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, tableName, equalityColumns, inequalityColumns, includedColumns, objectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMissingIndexScriptRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    equalityColumns: ").append(toIndentedString(equalityColumns)).append("\n");
        sb.append("    inequalityColumns: ").append(toIndentedString(inequalityColumns)).append("\n");
        sb.append("    includedColumns: ").append(toIndentedString(includedColumns)).append("\n");
        sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
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
