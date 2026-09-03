package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 获取执行计划请求体
 */
public class ShowExecutionPlanRequestBody {

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
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_type")

    private String nodeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "use_default_search_path")

    private Boolean useDefaultSearchPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ignore_limit")

    private Boolean ignoreLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "perpage")

    private Integer perpage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "curpage")

    private Integer curpage;

    public ShowExecutionPlanRequestBody withDatabaseName(String databaseName) {
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

    public ShowExecutionPlanRequestBody withSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }

    /**
     * schema名称
     * @return schemaName
     */
    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    public ShowExecutionPlanRequestBody withSqlScript(String sqlScript) {
        this.sqlScript = sqlScript;
        return this;
    }

    /**
     * SQL脚本
     * @return sqlScript
     */
    public String getSqlScript() {
        return sqlScript;
    }

    public void setSqlScript(String sqlScript) {
        this.sqlScript = sqlScript;
    }

    public ShowExecutionPlanRequestBody withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 实例节点ID，实例节点的唯一标识
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public ShowExecutionPlanRequestBody withNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    /**
     * 节点类型（master：主节点，slave：副节点，readreplica：只读节点）
     * @return nodeType
     */
    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public ShowExecutionPlanRequestBody withUseDefaultSearchPath(Boolean useDefaultSearchPath) {
        this.useDefaultSearchPath = useDefaultSearchPath;
        return this;
    }

    /**
     * PostgreSQL是否使用默认searchPath（仅在实例是PostgreSQL时可用）
     * @return useDefaultSearchPath
     */
    public Boolean getUseDefaultSearchPath() {
        return useDefaultSearchPath;
    }

    public void setUseDefaultSearchPath(Boolean useDefaultSearchPath) {
        this.useDefaultSearchPath = useDefaultSearchPath;
    }

    public ShowExecutionPlanRequestBody withIgnoreLimit(Boolean ignoreLimit) {
        this.ignoreLimit = ignoreLimit;
        return this;
    }

    /**
     * 是否忽略限制
     * @return ignoreLimit
     */
    public Boolean getIgnoreLimit() {
        return ignoreLimit;
    }

    public void setIgnoreLimit(Boolean ignoreLimit) {
        this.ignoreLimit = ignoreLimit;
    }

    public ShowExecutionPlanRequestBody withPerpage(Integer perpage) {
        this.perpage = perpage;
        return this;
    }

    /**
     * 每页记录数，取值范围：[0, 100]
     * @return perpage
     */
    public Integer getPerpage() {
        return perpage;
    }

    public void setPerpage(Integer perpage) {
        this.perpage = perpage;
    }

    public ShowExecutionPlanRequestBody withCurpage(Integer curpage) {
        this.curpage = curpage;
        return this;
    }

    /**
     * 页码，取值范围：[0, 2^31-1]
     * @return curpage
     */
    public Integer getCurpage() {
        return curpage;
    }

    public void setCurpage(Integer curpage) {
        this.curpage = curpage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowExecutionPlanRequestBody that = (ShowExecutionPlanRequestBody) obj;
        return Objects.equals(this.databaseName, that.databaseName) && Objects.equals(this.schemaName, that.schemaName)
            && Objects.equals(this.sqlScript, that.sqlScript) && Objects.equals(this.nodeId, that.nodeId)
            && Objects.equals(this.nodeType, that.nodeType)
            && Objects.equals(this.useDefaultSearchPath, that.useDefaultSearchPath)
            && Objects.equals(this.ignoreLimit, that.ignoreLimit) && Objects.equals(this.perpage, that.perpage)
            && Objects.equals(this.curpage, that.curpage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(databaseName,
            schemaName,
            sqlScript,
            nodeId,
            nodeType,
            useDefaultSearchPath,
            ignoreLimit,
            perpage,
            curpage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowExecutionPlanRequestBody {\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
        sb.append("    sqlScript: ").append(toIndentedString(sqlScript)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
        sb.append("    useDefaultSearchPath: ").append(toIndentedString(useDefaultSearchPath)).append("\n");
        sb.append("    ignoreLimit: ").append(toIndentedString(ignoreLimit)).append("\n");
        sb.append("    perpage: ").append(toIndentedString(perpage)).append("\n");
        sb.append("    curpage: ").append(toIndentedString(curpage)).append("\n");
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
