package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 批量血缘信息
 */
public class TableLineageInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_guid")

    private String sourceGuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_qualified_name")

    private String sourceQualifiedName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_type")

    private String sourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_db")

    private String sourceDb;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_schema")

    private String sourceSchema;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_table")

    private String sourceTable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_guid")

    private String targetGuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_qualified_name")

    private String targetQualifiedName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_type")

    private String targetType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_db")

    private String targetDb;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_schema")

    private String targetSchema;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_table")

    private String targetTable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_guid")

    private String nodeGuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_name")

    private String nodeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_type")

    private String nodeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_qualified_name")

    private String nodeQualifiedName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    public TableLineageInfo withSourceGuid(String sourceGuid) {
        this.sourceGuid = sourceGuid;
        return this;
    }

    /**
     * 上游血缘资产guid
     * @return sourceGuid
     */
    public String getSourceGuid() {
        return sourceGuid;
    }

    public void setSourceGuid(String sourceGuid) {
        this.sourceGuid = sourceGuid;
    }

    public TableLineageInfo withSourceQualifiedName(String sourceQualifiedName) {
        this.sourceQualifiedName = sourceQualifiedName;
        return this;
    }

    /**
     * 上游血缘资产Qname
     * @return sourceQualifiedName
     */
    public String getSourceQualifiedName() {
        return sourceQualifiedName;
    }

    public void setSourceQualifiedName(String sourceQualifiedName) {
        this.sourceQualifiedName = sourceQualifiedName;
    }

    public TableLineageInfo withSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * 上游血缘资产类型
     * @return sourceType
     */
    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public TableLineageInfo withSourceDb(String sourceDb) {
        this.sourceDb = sourceDb;
        return this;
    }

    /**
     * 上游血缘资产数据库
     * @return sourceDb
     */
    public String getSourceDb() {
        return sourceDb;
    }

    public void setSourceDb(String sourceDb) {
        this.sourceDb = sourceDb;
    }

    public TableLineageInfo withSourceSchema(String sourceSchema) {
        this.sourceSchema = sourceSchema;
        return this;
    }

    /**
     * 上游血缘资产逻辑库
     * @return sourceSchema
     */
    public String getSourceSchema() {
        return sourceSchema;
    }

    public void setSourceSchema(String sourceSchema) {
        this.sourceSchema = sourceSchema;
    }

    public TableLineageInfo withSourceTable(String sourceTable) {
        this.sourceTable = sourceTable;
        return this;
    }

    /**
     * 上游血缘资产表
     * @return sourceTable
     */
    public String getSourceTable() {
        return sourceTable;
    }

    public void setSourceTable(String sourceTable) {
        this.sourceTable = sourceTable;
    }

    public TableLineageInfo withTargetGuid(String targetGuid) {
        this.targetGuid = targetGuid;
        return this;
    }

    /**
     * 下游血缘资产guid
     * @return targetGuid
     */
    public String getTargetGuid() {
        return targetGuid;
    }

    public void setTargetGuid(String targetGuid) {
        this.targetGuid = targetGuid;
    }

    public TableLineageInfo withTargetQualifiedName(String targetQualifiedName) {
        this.targetQualifiedName = targetQualifiedName;
        return this;
    }

    /**
     * 下游血缘资产Qname
     * @return targetQualifiedName
     */
    public String getTargetQualifiedName() {
        return targetQualifiedName;
    }

    public void setTargetQualifiedName(String targetQualifiedName) {
        this.targetQualifiedName = targetQualifiedName;
    }

    public TableLineageInfo withTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }

    /**
     * 下游血缘资产类型
     * @return targetType
     */
    public String getTargetType() {
        return targetType;
    }

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    public TableLineageInfo withTargetDb(String targetDb) {
        this.targetDb = targetDb;
        return this;
    }

    /**
     * 下游血缘资产数据库
     * @return targetDb
     */
    public String getTargetDb() {
        return targetDb;
    }

    public void setTargetDb(String targetDb) {
        this.targetDb = targetDb;
    }

    public TableLineageInfo withTargetSchema(String targetSchema) {
        this.targetSchema = targetSchema;
        return this;
    }

    /**
     * 下游血缘资产逻辑库
     * @return targetSchema
     */
    public String getTargetSchema() {
        return targetSchema;
    }

    public void setTargetSchema(String targetSchema) {
        this.targetSchema = targetSchema;
    }

    public TableLineageInfo withTargetTable(String targetTable) {
        this.targetTable = targetTable;
        return this;
    }

    /**
     * 下游血缘资产表
     * @return targetTable
     */
    public String getTargetTable() {
        return targetTable;
    }

    public void setTargetTable(String targetTable) {
        this.targetTable = targetTable;
    }

    public TableLineageInfo withNodeGuid(String nodeGuid) {
        this.nodeGuid = nodeGuid;
        return this;
    }

    /**
     * 作业算子guid
     * @return nodeGuid
     */
    public String getNodeGuid() {
        return nodeGuid;
    }

    public void setNodeGuid(String nodeGuid) {
        this.nodeGuid = nodeGuid;
    }

    public TableLineageInfo withNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /**
     * 作业算子名称
     * @return nodeName
     */
    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public TableLineageInfo withNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    /**
     * 作业算子类型
     * @return nodeType
     */
    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public TableLineageInfo withNodeQualifiedName(String nodeQualifiedName) {
        this.nodeQualifiedName = nodeQualifiedName;
        return this;
    }

    /**
     * 作业算子Qname
     * @return nodeQualifiedName
     */
    public String getNodeQualifiedName() {
        return nodeQualifiedName;
    }

    public void setNodeQualifiedName(String nodeQualifiedName) {
        this.nodeQualifiedName = nodeQualifiedName;
    }

    public TableLineageInfo withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 作业算子类型所属空间
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TableLineageInfo that = (TableLineageInfo) obj;
        return Objects.equals(this.sourceGuid, that.sourceGuid)
            && Objects.equals(this.sourceQualifiedName, that.sourceQualifiedName)
            && Objects.equals(this.sourceType, that.sourceType) && Objects.equals(this.sourceDb, that.sourceDb)
            && Objects.equals(this.sourceSchema, that.sourceSchema)
            && Objects.equals(this.sourceTable, that.sourceTable) && Objects.equals(this.targetGuid, that.targetGuid)
            && Objects.equals(this.targetQualifiedName, that.targetQualifiedName)
            && Objects.equals(this.targetType, that.targetType) && Objects.equals(this.targetDb, that.targetDb)
            && Objects.equals(this.targetSchema, that.targetSchema)
            && Objects.equals(this.targetTable, that.targetTable) && Objects.equals(this.nodeGuid, that.nodeGuid)
            && Objects.equals(this.nodeName, that.nodeName) && Objects.equals(this.nodeType, that.nodeType)
            && Objects.equals(this.nodeQualifiedName, that.nodeQualifiedName)
            && Objects.equals(this.workspaceId, that.workspaceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceGuid,
            sourceQualifiedName,
            sourceType,
            sourceDb,
            sourceSchema,
            sourceTable,
            targetGuid,
            targetQualifiedName,
            targetType,
            targetDb,
            targetSchema,
            targetTable,
            nodeGuid,
            nodeName,
            nodeType,
            nodeQualifiedName,
            workspaceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TableLineageInfo {\n");
        sb.append("    sourceGuid: ").append(toIndentedString(sourceGuid)).append("\n");
        sb.append("    sourceQualifiedName: ").append(toIndentedString(sourceQualifiedName)).append("\n");
        sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
        sb.append("    sourceDb: ").append(toIndentedString(sourceDb)).append("\n");
        sb.append("    sourceSchema: ").append(toIndentedString(sourceSchema)).append("\n");
        sb.append("    sourceTable: ").append(toIndentedString(sourceTable)).append("\n");
        sb.append("    targetGuid: ").append(toIndentedString(targetGuid)).append("\n");
        sb.append("    targetQualifiedName: ").append(toIndentedString(targetQualifiedName)).append("\n");
        sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
        sb.append("    targetDb: ").append(toIndentedString(targetDb)).append("\n");
        sb.append("    targetSchema: ").append(toIndentedString(targetSchema)).append("\n");
        sb.append("    targetTable: ").append(toIndentedString(targetTable)).append("\n");
        sb.append("    nodeGuid: ").append(toIndentedString(nodeGuid)).append("\n");
        sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
        sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
        sb.append("    nodeQualifiedName: ").append(toIndentedString(nodeQualifiedName)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
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
