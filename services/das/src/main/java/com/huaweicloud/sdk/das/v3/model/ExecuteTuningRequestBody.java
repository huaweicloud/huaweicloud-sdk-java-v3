package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 执行调优请求体
 */
public class ExecuteTuningRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    private String databaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema_name")

    private String schemaName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_script")

    private String sqlScript;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_type")

    private String nodeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "use_default_search_path")

    private Boolean useDefaultSearchPath;

    public ExecuteTuningRequestBody withDatabaseName(String databaseName) {
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

    public ExecuteTuningRequestBody withSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }

    /**
     * schema名称，诊断实例类型为postgresql时可用
     * @return schemaName
     */
    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    public ExecuteTuningRequestBody withSqlScript(String sqlScript) {
        this.sqlScript = sqlScript;
        return this;
    }

    /**
     * 诊断的SQL语句
     * @return sqlScript
     */
    public String getSqlScript() {
        return sqlScript;
    }

    public void setSqlScript(String sqlScript) {
        this.sqlScript = sqlScript;
    }

    public ExecuteTuningRequestBody withNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    /**
     * 执行节点类型，取值范围：master（主节点）、slave（副节点）、readreplica（只读节点）
     * @return nodeType
     */
    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public ExecuteTuningRequestBody withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 执行节点ID，实例节点的唯一标识
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public ExecuteTuningRequestBody withUseDefaultSearchPath(Boolean useDefaultSearchPath) {
        this.useDefaultSearchPath = useDefaultSearchPath;
        return this;
    }

    /**
     * 是否使用search_path作为环境变量，诊断实例类型为postgresql时可用
     * @return useDefaultSearchPath
     */
    public Boolean getUseDefaultSearchPath() {
        return useDefaultSearchPath;
    }

    public void setUseDefaultSearchPath(Boolean useDefaultSearchPath) {
        this.useDefaultSearchPath = useDefaultSearchPath;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExecuteTuningRequestBody that = (ExecuteTuningRequestBody) obj;
        return Objects.equals(this.databaseName, that.databaseName) && Objects.equals(this.schemaName, that.schemaName)
            && Objects.equals(this.sqlScript, that.sqlScript) && Objects.equals(this.nodeType, that.nodeType)
            && Objects.equals(this.nodeId, that.nodeId)
            && Objects.equals(this.useDefaultSearchPath, that.useDefaultSearchPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(databaseName, schemaName, sqlScript, nodeType, nodeId, useDefaultSearchPath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecuteTuningRequestBody {\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
        sb.append("    sqlScript: ").append(toIndentedString(sqlScript)).append("\n");
        sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    useDefaultSearchPath: ").append(toIndentedString(useDefaultSearchPath)).append("\n");
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
