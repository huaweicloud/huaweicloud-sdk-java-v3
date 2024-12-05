package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * WorkspaceTransformVO
 */
public class WorkspaceTransformVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_model_id")

    private String targetModelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_model_name")

    private String targetModelName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_exist_tables")

    private Boolean updateExistTables;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ids")

    private List<String> ids = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dw_type")

    private String dwType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_id")

    private String connectionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database")

    private String database;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue")

    private String queue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema")

    private String schema;

    public WorkspaceTransformVO withTargetModelId(String targetModelId) {
        this.targetModelId = targetModelId;
        return this;
    }

    /**
     * 所属关系建模的模型ID，ID字符串。
     * @return targetModelId
     */
    public String getTargetModelId() {
        return targetModelId;
    }

    public void setTargetModelId(String targetModelId) {
        this.targetModelId = targetModelId;
    }

    public WorkspaceTransformVO withTargetModelName(String targetModelName) {
        this.targetModelName = targetModelName;
        return this;
    }

    /**
     * 工作区名字。
     * @return targetModelName
     */
    public String getTargetModelName() {
        return targetModelName;
    }

    public void setTargetModelName(String targetModelName) {
        this.targetModelName = targetModelName;
    }

    public WorkspaceTransformVO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public WorkspaceTransformVO withUpdateExistTables(Boolean updateExistTables) {
        this.updateExistTables = updateExistTables;
        return this;
    }

    /**
     * 是否更新已有表。
     * @return updateExistTables
     */
    public Boolean getUpdateExistTables() {
        return updateExistTables;
    }

    public void setUpdateExistTables(Boolean updateExistTables) {
        this.updateExistTables = updateExistTables;
    }

    public WorkspaceTransformVO withIds(List<String> ids) {
        this.ids = ids;
        return this;
    }

    public WorkspaceTransformVO addIdsItem(String idsItem) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        this.ids.add(idsItem);
        return this;
    }

    public WorkspaceTransformVO withIds(Consumer<List<String>> idsSetter) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        idsSetter.accept(this.ids);
        return this;
    }

    /**
     * 需要物化的逻辑实体的ID列表，ID字符串。
     * @return ids
     */
    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    public WorkspaceTransformVO withDwType(String dwType) {
        this.dwType = dwType;
        return this;
    }

    /**
     * 数据连接类型，对应表所在的数仓类型，取值可以为DLI、DWS、MRS_HIVE、POSTGRESQL、MRS_SPARK、CLICKHOUSE、MYSQL、ORACLE和DORIS等。
     * @return dwType
     */
    public String getDwType() {
        return dwType;
    }

    public void setDwType(String dwType) {
        this.dwType = dwType;
    }

    public WorkspaceTransformVO withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }

    /**
     * 转化后物理表所属的数据连接ID。
     * @return connectionId
     */
    public String getConnectionId() {
        return connectionId;
    }

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    public WorkspaceTransformVO withDatabase(String database) {
        this.database = database;
        return this;
    }

    /**
     * 转化后物理表所属的数据库。
     * @return database
     */
    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public WorkspaceTransformVO withQueue(String queue) {
        this.queue = queue;
        return this;
    }

    /**
     * 转化后物理表所属的队列（仅DLI）。
     * @return queue
     */
    public String getQueue() {
        return queue;
    }

    public void setQueue(String queue) {
        this.queue = queue;
    }

    public WorkspaceTransformVO withSchema(String schema) {
        this.schema = schema;
        return this;
    }

    /**
     * 转化后物理表所属的schema（仅DWS和PostgreSQL）。
     * @return schema
     */
    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkspaceTransformVO that = (WorkspaceTransformVO) obj;
        return Objects.equals(this.targetModelId, that.targetModelId)
            && Objects.equals(this.targetModelName, that.targetModelName)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.updateExistTables, that.updateExistTables) && Objects.equals(this.ids, that.ids)
            && Objects.equals(this.dwType, that.dwType) && Objects.equals(this.connectionId, that.connectionId)
            && Objects.equals(this.database, that.database) && Objects.equals(this.queue, that.queue)
            && Objects.equals(this.schema, that.schema);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetModelId,
            targetModelName,
            description,
            updateExistTables,
            ids,
            dwType,
            connectionId,
            database,
            queue,
            schema);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkspaceTransformVO {\n");
        sb.append("    targetModelId: ").append(toIndentedString(targetModelId)).append("\n");
        sb.append("    targetModelName: ").append(toIndentedString(targetModelName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    updateExistTables: ").append(toIndentedString(updateExistTables)).append("\n");
        sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
        sb.append("    dwType: ").append(toIndentedString(dwType)).append("\n");
        sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
        sb.append("    database: ").append(toIndentedString(database)).append("\n");
        sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
        sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
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
