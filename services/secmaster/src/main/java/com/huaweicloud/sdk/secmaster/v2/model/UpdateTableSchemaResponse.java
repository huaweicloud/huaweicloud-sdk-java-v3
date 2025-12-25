package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateTableSchemaResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_id")

    private String tableId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipe_id")

    private String pipeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_alias")

    private String tableAlias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "directory")

    private String directory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private IsapTableCategory category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_status")

    private TableLockStatus lockStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_status")

    private IsapTableProcessStatus processStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_error")

    private IsapTableProcessError processError;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "format")

    private TableFormat format;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rw_type")

    private TableRWType rwType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner_type")

    private TableOwnerType ownerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_layering")

    private DataLayering dataLayering;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_classification")

    private DataClassification dataClassification;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema")

    private IsapTableSchema schema;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_setting")

    private TableStorageSetting storageSetting;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_setting")

    private TableDisplaySetting displaySetting;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_time")

    private Long deleteTime;

    public UpdateTableSchemaResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public UpdateTableSchemaResponse withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 工作空间ID
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public UpdateTableSchemaResponse withTableId(String tableId) {
        this.tableId = tableId;
        return this;
    }

    /**
     * UUID
     * @return tableId
     */
    public String getTableId() {
        return tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    public UpdateTableSchemaResponse withPipeId(String pipeId) {
        this.pipeId = pipeId;
        return this;
    }

    /**
     * UUID
     * @return pipeId
     */
    public String getPipeId() {
        return pipeId;
    }

    public void setPipeId(String pipeId) {
        this.pipeId = pipeId;
    }

    public UpdateTableSchemaResponse withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * 表名称
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public UpdateTableSchemaResponse withTableAlias(String tableAlias) {
        this.tableAlias = tableAlias;
        return this;
    }

    /**
     * 表别名
     * @return tableAlias
     */
    public String getTableAlias() {
        return tableAlias;
    }

    public void setTableAlias(String tableAlias) {
        this.tableAlias = tableAlias;
    }

    public UpdateTableSchemaResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 相关描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateTableSchemaResponse withDirectory(String directory) {
        this.directory = directory;
        return this;
    }

    /**
     * directory 目录分组
     * @return directory
     */
    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public UpdateTableSchemaResponse withCategory(IsapTableCategory category) {
        this.category = category;
        return this;
    }

    /**
     * Get category
     * @return category
     */
    public IsapTableCategory getCategory() {
        return category;
    }

    public void setCategory(IsapTableCategory category) {
        this.category = category;
    }

    public UpdateTableSchemaResponse withLockStatus(TableLockStatus lockStatus) {
        this.lockStatus = lockStatus;
        return this;
    }

    /**
     * Get lockStatus
     * @return lockStatus
     */
    public TableLockStatus getLockStatus() {
        return lockStatus;
    }

    public void setLockStatus(TableLockStatus lockStatus) {
        this.lockStatus = lockStatus;
    }

    public UpdateTableSchemaResponse withProcessStatus(IsapTableProcessStatus processStatus) {
        this.processStatus = processStatus;
        return this;
    }

    /**
     * Get processStatus
     * @return processStatus
     */
    public IsapTableProcessStatus getProcessStatus() {
        return processStatus;
    }

    public void setProcessStatus(IsapTableProcessStatus processStatus) {
        this.processStatus = processStatus;
    }

    public UpdateTableSchemaResponse withProcessError(IsapTableProcessError processError) {
        this.processError = processError;
        return this;
    }

    /**
     * Get processError
     * @return processError
     */
    public IsapTableProcessError getProcessError() {
        return processError;
    }

    public void setProcessError(IsapTableProcessError processError) {
        this.processError = processError;
    }

    public UpdateTableSchemaResponse withFormat(TableFormat format) {
        this.format = format;
        return this;
    }

    /**
     * Get format
     * @return format
     */
    public TableFormat getFormat() {
        return format;
    }

    public void setFormat(TableFormat format) {
        this.format = format;
    }

    public UpdateTableSchemaResponse withRwType(TableRWType rwType) {
        this.rwType = rwType;
        return this;
    }

    /**
     * Get rwType
     * @return rwType
     */
    public TableRWType getRwType() {
        return rwType;
    }

    public void setRwType(TableRWType rwType) {
        this.rwType = rwType;
    }

    public UpdateTableSchemaResponse withOwnerType(TableOwnerType ownerType) {
        this.ownerType = ownerType;
        return this;
    }

    /**
     * Get ownerType
     * @return ownerType
     */
    public TableOwnerType getOwnerType() {
        return ownerType;
    }

    public void setOwnerType(TableOwnerType ownerType) {
        this.ownerType = ownerType;
    }

    public UpdateTableSchemaResponse withDataLayering(DataLayering dataLayering) {
        this.dataLayering = dataLayering;
        return this;
    }

    /**
     * Get dataLayering
     * @return dataLayering
     */
    public DataLayering getDataLayering() {
        return dataLayering;
    }

    public void setDataLayering(DataLayering dataLayering) {
        this.dataLayering = dataLayering;
    }

    public UpdateTableSchemaResponse withDataClassification(DataClassification dataClassification) {
        this.dataClassification = dataClassification;
        return this;
    }

    /**
     * Get dataClassification
     * @return dataClassification
     */
    public DataClassification getDataClassification() {
        return dataClassification;
    }

    public void setDataClassification(DataClassification dataClassification) {
        this.dataClassification = dataClassification;
    }

    public UpdateTableSchemaResponse withSchema(IsapTableSchema schema) {
        this.schema = schema;
        return this;
    }

    public UpdateTableSchemaResponse withSchema(Consumer<IsapTableSchema> schemaSetter) {
        if (this.schema == null) {
            this.schema = new IsapTableSchema();
            schemaSetter.accept(this.schema);
        }

        return this;
    }

    /**
     * Get schema
     * @return schema
     */
    public IsapTableSchema getSchema() {
        return schema;
    }

    public void setSchema(IsapTableSchema schema) {
        this.schema = schema;
    }

    public UpdateTableSchemaResponse withStorageSetting(TableStorageSetting storageSetting) {
        this.storageSetting = storageSetting;
        return this;
    }

    public UpdateTableSchemaResponse withStorageSetting(Consumer<TableStorageSetting> storageSettingSetter) {
        if (this.storageSetting == null) {
            this.storageSetting = new TableStorageSetting();
            storageSettingSetter.accept(this.storageSetting);
        }

        return this;
    }

    /**
     * Get storageSetting
     * @return storageSetting
     */
    public TableStorageSetting getStorageSetting() {
        return storageSetting;
    }

    public void setStorageSetting(TableStorageSetting storageSetting) {
        this.storageSetting = storageSetting;
    }

    public UpdateTableSchemaResponse withDisplaySetting(TableDisplaySetting displaySetting) {
        this.displaySetting = displaySetting;
        return this;
    }

    public UpdateTableSchemaResponse withDisplaySetting(Consumer<TableDisplaySetting> displaySettingSetter) {
        if (this.displaySetting == null) {
            this.displaySetting = new TableDisplaySetting();
            displaySettingSetter.accept(this.displaySetting);
        }

        return this;
    }

    /**
     * Get displaySetting
     * @return displaySetting
     */
    public TableDisplaySetting getDisplaySetting() {
        return displaySetting;
    }

    public void setDisplaySetting(TableDisplaySetting displaySetting) {
        this.displaySetting = displaySetting;
    }

    public UpdateTableSchemaResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 毫秒时间戳
     * minimum: 0
     * maximum: 2366841600000
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public UpdateTableSchemaResponse withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 毫秒时间戳
     * minimum: 0
     * maximum: 2366841600000
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public UpdateTableSchemaResponse withDeleteTime(Long deleteTime) {
        this.deleteTime = deleteTime;
        return this;
    }

    /**
     * 毫秒时间戳
     * minimum: 0
     * maximum: 2366841600000
     * @return deleteTime
     */
    public Long getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Long deleteTime) {
        this.deleteTime = deleteTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateTableSchemaResponse that = (UpdateTableSchemaResponse) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.workspaceId, that.workspaceId)
            && Objects.equals(this.tableId, that.tableId) && Objects.equals(this.pipeId, that.pipeId)
            && Objects.equals(this.tableName, that.tableName) && Objects.equals(this.tableAlias, that.tableAlias)
            && Objects.equals(this.description, that.description) && Objects.equals(this.directory, that.directory)
            && Objects.equals(this.category, that.category) && Objects.equals(this.lockStatus, that.lockStatus)
            && Objects.equals(this.processStatus, that.processStatus)
            && Objects.equals(this.processError, that.processError) && Objects.equals(this.format, that.format)
            && Objects.equals(this.rwType, that.rwType) && Objects.equals(this.ownerType, that.ownerType)
            && Objects.equals(this.dataLayering, that.dataLayering)
            && Objects.equals(this.dataClassification, that.dataClassification)
            && Objects.equals(this.schema, that.schema) && Objects.equals(this.storageSetting, that.storageSetting)
            && Objects.equals(this.displaySetting, that.displaySetting)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.deleteTime, that.deleteTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId,
            workspaceId,
            tableId,
            pipeId,
            tableName,
            tableAlias,
            description,
            directory,
            category,
            lockStatus,
            processStatus,
            processError,
            format,
            rwType,
            ownerType,
            dataLayering,
            dataClassification,
            schema,
            storageSetting,
            displaySetting,
            createTime,
            updateTime,
            deleteTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTableSchemaResponse {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    tableId: ").append(toIndentedString(tableId)).append("\n");
        sb.append("    pipeId: ").append(toIndentedString(pipeId)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    tableAlias: ").append(toIndentedString(tableAlias)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    directory: ").append(toIndentedString(directory)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    lockStatus: ").append(toIndentedString(lockStatus)).append("\n");
        sb.append("    processStatus: ").append(toIndentedString(processStatus)).append("\n");
        sb.append("    processError: ").append(toIndentedString(processError)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    rwType: ").append(toIndentedString(rwType)).append("\n");
        sb.append("    ownerType: ").append(toIndentedString(ownerType)).append("\n");
        sb.append("    dataLayering: ").append(toIndentedString(dataLayering)).append("\n");
        sb.append("    dataClassification: ").append(toIndentedString(dataClassification)).append("\n");
        sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
        sb.append("    storageSetting: ").append(toIndentedString(storageSetting)).append("\n");
        sb.append("    displaySetting: ").append(toIndentedString(displaySetting)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    deleteTime: ").append(toIndentedString(deleteTime)).append("\n");
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
