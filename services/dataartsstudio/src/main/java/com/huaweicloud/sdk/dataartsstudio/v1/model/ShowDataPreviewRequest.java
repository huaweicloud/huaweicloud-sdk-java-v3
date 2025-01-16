package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowDataPreviewRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace")

    private String workspace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "guid")

    private String guid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_connection_id")

    private String dataConnectionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_type")

    private String dataType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database")

    private String database;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema")

    private String schema;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table")

    private String table;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datasource_workspace_id")

    private String datasourceWorkspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partitions_condition")

    private String partitionsCondition;

    public ShowDataPreviewRequest withWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }

    /**
     * 工作空间ID，获取方法请参见[实例ID和工作空间ID](dataartsstudio_02_0350.xml)。
     * @return workspace
     */
    public String getWorkspace() {
        return workspace;
    }

    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }

    public ShowDataPreviewRequest withGuid(String guid) {
        this.guid = guid;
        return this;
    }

    /**
     * 资产guid，获取方法请参见[数据资产guid](dataartsstudio_02_0351.xml)。
     * @return guid
     */
    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public ShowDataPreviewRequest withDataConnectionId(String dataConnectionId) {
        this.dataConnectionId = dataConnectionId;
        return this;
    }

    /**
     * 连接id
     * @return dataConnectionId
     */
    public String getDataConnectionId() {
        return dataConnectionId;
    }

    public void setDataConnectionId(String dataConnectionId) {
        this.dataConnectionId = dataConnectionId;
    }

    public ShowDataPreviewRequest withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * 数据源表类型，取值范围：hive_table、dws_table、dli_table、dli_table_managed、dli_table_external、dli_table_view、mysql_table、gbase_table、postgre_table、hbase_table、dm_table、doris_table、sqlserver_table。
     * @return dataType
     */
    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public ShowDataPreviewRequest withDatabase(String database) {
        this.database = database;
        return this;
    }

    /**
     * database名称
     * @return database
     */
    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public ShowDataPreviewRequest withSchema(String schema) {
        this.schema = schema;
        return this;
    }

    /**
     * schema名称
     * @return schema
     */
    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public ShowDataPreviewRequest withTable(String table) {
        this.table = table;
        return this;
    }

    /**
     * table名称
     * @return table
     */
    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public ShowDataPreviewRequest withDatasourceWorkspaceId(String datasourceWorkspaceId) {
        this.datasourceWorkspaceId = datasourceWorkspaceId;
        return this;
    }

    /**
     * 数据源空间id
     * @return datasourceWorkspaceId
     */
    public String getDatasourceWorkspaceId() {
        return datasourceWorkspaceId;
    }

    public void setDatasourceWorkspaceId(String datasourceWorkspaceId) {
        this.datasourceWorkspaceId = datasourceWorkspaceId;
    }

    public ShowDataPreviewRequest withPartitionsCondition(String partitionsCondition) {
        this.partitionsCondition = partitionsCondition;
        return this;
    }

    /**
     * 分区名称，hive类型数据源可使用预览分区中数据
     * @return partitionsCondition
     */
    public String getPartitionsCondition() {
        return partitionsCondition;
    }

    public void setPartitionsCondition(String partitionsCondition) {
        this.partitionsCondition = partitionsCondition;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDataPreviewRequest that = (ShowDataPreviewRequest) obj;
        return Objects.equals(this.workspace, that.workspace) && Objects.equals(this.guid, that.guid)
            && Objects.equals(this.dataConnectionId, that.dataConnectionId)
            && Objects.equals(this.dataType, that.dataType) && Objects.equals(this.database, that.database)
            && Objects.equals(this.schema, that.schema) && Objects.equals(this.table, that.table)
            && Objects.equals(this.datasourceWorkspaceId, that.datasourceWorkspaceId)
            && Objects.equals(this.partitionsCondition, that.partitionsCondition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspace,
            guid,
            dataConnectionId,
            dataType,
            database,
            schema,
            table,
            datasourceWorkspaceId,
            partitionsCondition);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDataPreviewRequest {\n");
        sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
        sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
        sb.append("    dataConnectionId: ").append(toIndentedString(dataConnectionId)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("    database: ").append(toIndentedString(database)).append("\n");
        sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
        sb.append("    table: ").append(toIndentedString(table)).append("\n");
        sb.append("    datasourceWorkspaceId: ").append(toIndentedString(datasourceWorkspaceId)).append("\n");
        sb.append("    partitionsCondition: ").append(toIndentedString(partitionsCondition)).append("\n");
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
