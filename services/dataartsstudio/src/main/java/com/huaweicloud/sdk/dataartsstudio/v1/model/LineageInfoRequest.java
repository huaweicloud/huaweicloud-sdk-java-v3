package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * LineageInfoRequest
 */
public class LineageInfoRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_source_type")

    private String dataSourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_id")

    private String connectionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_name")

    private String connectionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_name")

    private String nodeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_lineage")

    private TableLineageV2 tableLineage;

    public LineageInfoRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 集群id
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public LineageInfoRequest withDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }

    /**
     * 数据连接类型
     * @return dataSourceType
     */
    public String getDataSourceType() {
        return dataSourceType;
    }

    public void setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
    }

    public LineageInfoRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }

    /**
     * 数据连接id
     * @return connectionId
     */
    public String getConnectionId() {
        return connectionId;
    }

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    public LineageInfoRequest withConnectionName(String connectionName) {
        this.connectionName = connectionName;
        return this;
    }

    /**
     * 数据连接名称
     * @return connectionName
     */
    public String getConnectionName() {
        return connectionName;
    }

    public void setConnectionName(String connectionName) {
        this.connectionName = connectionName;
    }

    public LineageInfoRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 工作空间id
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public LineageInfoRequest withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 作业id
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public LineageInfoRequest withNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /**
     * 算子名称
     * @return nodeName
     */
    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public LineageInfoRequest withTableLineage(TableLineageV2 tableLineage) {
        this.tableLineage = tableLineage;
        return this;
    }

    public LineageInfoRequest withTableLineage(Consumer<TableLineageV2> tableLineageSetter) {
        if (this.tableLineage == null) {
            this.tableLineage = new TableLineageV2();
            tableLineageSetter.accept(this.tableLineage);
        }

        return this;
    }

    /**
     * Get tableLineage
     * @return tableLineage
     */
    public TableLineageV2 getTableLineage() {
        return tableLineage;
    }

    public void setTableLineage(TableLineageV2 tableLineage) {
        this.tableLineage = tableLineage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LineageInfoRequest that = (LineageInfoRequest) obj;
        return Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.dataSourceType, that.dataSourceType)
            && Objects.equals(this.connectionId, that.connectionId)
            && Objects.equals(this.connectionName, that.connectionName)
            && Objects.equals(this.workspaceId, that.workspaceId) && Objects.equals(this.jobId, that.jobId)
            && Objects.equals(this.nodeName, that.nodeName) && Objects.equals(this.tableLineage, that.tableLineage);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(clusterId, dataSourceType, connectionId, connectionName, workspaceId, jobId, nodeName, tableLineage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LineageInfoRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    dataSourceType: ").append(toIndentedString(dataSourceType)).append("\n");
        sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
        sb.append("    connectionName: ").append(toIndentedString(connectionName)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
        sb.append("    tableLineage: ").append(toIndentedString(tableLineage)).append("\n");
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
