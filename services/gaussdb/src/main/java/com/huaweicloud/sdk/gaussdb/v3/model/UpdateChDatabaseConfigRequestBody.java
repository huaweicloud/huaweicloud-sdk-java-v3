package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 修改数据同步
 */
public class UpdateChDatabaseConfigRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_instance_id")

    private String sourceInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_node_id")

    private String sourceNodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database")

    private String database;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    public UpdateChDatabaseConfigRequestBody withSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
        return this;
    }

    /**
     * 源实例ID，严格匹配UUID规则。
     * @return sourceInstanceId
     */
    public String getSourceInstanceId() {
        return sourceInstanceId;
    }

    public void setSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
    }

    public UpdateChDatabaseConfigRequestBody withSourceNodeId(String sourceNodeId) {
        this.sourceNodeId = sourceNodeId;
        return this;
    }

    /**
     * 源实例节点ID。
     * @return sourceNodeId
     */
    public String getSourceNodeId() {
        return sourceNodeId;
    }

    public void setSourceNodeId(String sourceNodeId) {
        this.sourceNodeId = sourceNodeId;
    }

    public UpdateChDatabaseConfigRequestBody withDatabase(String database) {
        this.database = database;
        return this;
    }

    /**
     * 数据库名。
     * @return database
     */
    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public UpdateChDatabaseConfigRequestBody withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 配置值。仅支持修改同步范围，不支持修改白名单或黑名单类型。  例如：创建了白名单数据同步，调用本接口修改时， 支持 \"value\"：\"{\\\"white_list\\\":\\\"test1,test2,test3\\\"}\" 不支持 \"value\"：\"{\\\"black_list\\\":\\\"test1,test2,test3\\\"}\"
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateChDatabaseConfigRequestBody that = (UpdateChDatabaseConfigRequestBody) obj;
        return Objects.equals(this.sourceInstanceId, that.sourceInstanceId)
            && Objects.equals(this.sourceNodeId, that.sourceNodeId) && Objects.equals(this.database, that.database)
            && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceInstanceId, sourceNodeId, database, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateChDatabaseConfigRequestBody {\n");
        sb.append("    sourceInstanceId: ").append(toIndentedString(sourceInstanceId)).append("\n");
        sb.append("    sourceNodeId: ").append(toIndentedString(sourceNodeId)).append("\n");
        sb.append("    database: ").append(toIndentedString(database)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
