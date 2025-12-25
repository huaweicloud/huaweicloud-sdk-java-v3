package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 资源
 */
public class IsapResource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_by")

    private String createBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Integer createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_classification")

    private String dataClassification;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_layering")

    private String dataLayering;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_time")

    private Integer deleteTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "directory")

    private String directory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_setting")

    private IsapResourceDisplaySetting displaySetting;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "format")

    private String format;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_status")

    private String lockStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner_type")

    private String ownerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipe_id")

    private String pipeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_error")

    private String processError;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_status")

    private String processStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rw_type")

    private String rwType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema")

    private Schema schema;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_setting")

    private StorageSetting storageSetting;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "store_size_in_bytes")

    private Integer storeSizeInBytes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_alias")

    private String tableAlias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_id")

    private String tableId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_by")

    private String updateBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Integer updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    public IsapResource withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * 资源类型，例如 STREAMING 或 INDEX
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public IsapResource withCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }

    /**
     * 创建者信息
     * @return createBy
     */
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public IsapResource withCreateTime(Integer createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间戳
     * @return createTime
     */
    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public IsapResource withDataClassification(String dataClassification) {
        this.dataClassification = dataClassification;
        return this;
    }

    /**
     * 数据分类，例如 FACTUAL_DATA
     * @return dataClassification
     */
    public String getDataClassification() {
        return dataClassification;
    }

    public void setDataClassification(String dataClassification) {
        this.dataClassification = dataClassification;
    }

    public IsapResource withDataLayering(String dataLayering) {
        this.dataLayering = dataLayering;
        return this;
    }

    /**
     * 数据分层，例如 ODS
     * @return dataLayering
     */
    public String getDataLayering() {
        return dataLayering;
    }

    public void setDataLayering(String dataLayering) {
        this.dataLayering = dataLayering;
    }

    public IsapResource withDeleteTime(Integer deleteTime) {
        this.deleteTime = deleteTime;
        return this;
    }

    /**
     * 删除时间戳
     * @return deleteTime
     */
    public Integer getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Integer deleteTime) {
        this.deleteTime = deleteTime;
    }

    public IsapResource withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public IsapResource withDirectory(String directory) {
        this.directory = directory;
        return this;
    }

    /**
     * 目录路径
     * @return directory
     */
    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public IsapResource withDisplaySetting(IsapResourceDisplaySetting displaySetting) {
        this.displaySetting = displaySetting;
        return this;
    }

    public IsapResource withDisplaySetting(Consumer<IsapResourceDisplaySetting> displaySettingSetter) {
        if (this.displaySetting == null) {
            this.displaySetting = new IsapResourceDisplaySetting();
            displaySettingSetter.accept(this.displaySetting);
        }

        return this;
    }

    /**
     * Get displaySetting
     * @return displaySetting
     */
    public IsapResourceDisplaySetting getDisplaySetting() {
        return displaySetting;
    }

    public void setDisplaySetting(IsapResourceDisplaySetting displaySetting) {
        this.displaySetting = displaySetting;
    }

    public IsapResource withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * 数据格式，例如 JSON
     * @return format
     */
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public IsapResource withLockStatus(String lockStatus) {
        this.lockStatus = lockStatus;
        return this;
    }

    /**
     * 锁定状态，例如 UNLOCKED
     * @return lockStatus
     */
    public String getLockStatus() {
        return lockStatus;
    }

    public void setLockStatus(String lockStatus) {
        this.lockStatus = lockStatus;
    }

    public IsapResource withOwnerType(String ownerType) {
        this.ownerType = ownerType;
        return this;
    }

    /**
     * 所有者类型，例如 USER
     * @return ownerType
     */
    public String getOwnerType() {
        return ownerType;
    }

    public void setOwnerType(String ownerType) {
        this.ownerType = ownerType;
    }

    public IsapResource withPipeId(String pipeId) {
        this.pipeId = pipeId;
        return this;
    }

    /**
     * 管道ID
     * @return pipeId
     */
    public String getPipeId() {
        return pipeId;
    }

    public void setPipeId(String pipeId) {
        this.pipeId = pipeId;
    }

    public IsapResource withProcessError(String processError) {
        this.processError = processError;
        return this;
    }

    /**
     * 处理错误状态，例如 NONE
     * @return processError
     */
    public String getProcessError() {
        return processError;
    }

    public void setProcessError(String processError) {
        this.processError = processError;
    }

    public IsapResource withProcessStatus(String processStatus) {
        this.processStatus = processStatus;
        return this;
    }

    /**
     * 处理状态，例如 COMPLETED
     * @return processStatus
     */
    public String getProcessStatus() {
        return processStatus;
    }

    public void setProcessStatus(String processStatus) {
        this.processStatus = processStatus;
    }

    public IsapResource withProjectId(String projectId) {
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

    public IsapResource withRwType(String rwType) {
        this.rwType = rwType;
        return this;
    }

    /**
     * 读写类型，例如 READ_WRITE
     * @return rwType
     */
    public String getRwType() {
        return rwType;
    }

    public void setRwType(String rwType) {
        this.rwType = rwType;
    }

    public IsapResource withSchema(Schema schema) {
        this.schema = schema;
        return this;
    }

    public IsapResource withSchema(Consumer<Schema> schemaSetter) {
        if (this.schema == null) {
            this.schema = new Schema();
            schemaSetter.accept(this.schema);
        }

        return this;
    }

    /**
     * Get schema
     * @return schema
     */
    public Schema getSchema() {
        return schema;
    }

    public void setSchema(Schema schema) {
        this.schema = schema;
    }

    public IsapResource withStorageSetting(StorageSetting storageSetting) {
        this.storageSetting = storageSetting;
        return this;
    }

    public IsapResource withStorageSetting(Consumer<StorageSetting> storageSettingSetter) {
        if (this.storageSetting == null) {
            this.storageSetting = new StorageSetting();
            storageSettingSetter.accept(this.storageSetting);
        }

        return this;
    }

    /**
     * Get storageSetting
     * @return storageSetting
     */
    public StorageSetting getStorageSetting() {
        return storageSetting;
    }

    public void setStorageSetting(StorageSetting storageSetting) {
        this.storageSetting = storageSetting;
    }

    public IsapResource withStoreSizeInBytes(Integer storeSizeInBytes) {
        this.storeSizeInBytes = storeSizeInBytes;
        return this;
    }

    /**
     * 存储大小（字节）
     * @return storeSizeInBytes
     */
    public Integer getStoreSizeInBytes() {
        return storeSizeInBytes;
    }

    public void setStoreSizeInBytes(Integer storeSizeInBytes) {
        this.storeSizeInBytes = storeSizeInBytes;
    }

    public IsapResource withTableAlias(String tableAlias) {
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

    public IsapResource withTableId(String tableId) {
        this.tableId = tableId;
        return this;
    }

    /**
     * 表ID
     * @return tableId
     */
    public String getTableId() {
        return tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    public IsapResource withTableName(String tableName) {
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

    public IsapResource withUpdateBy(String updateBy) {
        this.updateBy = updateBy;
        return this;
    }

    /**
     * 更新者信息
     * @return updateBy
     */
    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public IsapResource withUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间戳
     * @return updateTime
     */
    public Integer getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

    public IsapResource withWorkspaceId(String workspaceId) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IsapResource that = (IsapResource) obj;
        return Objects.equals(this.category, that.category) && Objects.equals(this.createBy, that.createBy)
            && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.dataClassification, that.dataClassification)
            && Objects.equals(this.dataLayering, that.dataLayering) && Objects.equals(this.deleteTime, that.deleteTime)
            && Objects.equals(this.description, that.description) && Objects.equals(this.directory, that.directory)
            && Objects.equals(this.displaySetting, that.displaySetting) && Objects.equals(this.format, that.format)
            && Objects.equals(this.lockStatus, that.lockStatus) && Objects.equals(this.ownerType, that.ownerType)
            && Objects.equals(this.pipeId, that.pipeId) && Objects.equals(this.processError, that.processError)
            && Objects.equals(this.processStatus, that.processStatus) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.rwType, that.rwType) && Objects.equals(this.schema, that.schema)
            && Objects.equals(this.storageSetting, that.storageSetting)
            && Objects.equals(this.storeSizeInBytes, that.storeSizeInBytes)
            && Objects.equals(this.tableAlias, that.tableAlias) && Objects.equals(this.tableId, that.tableId)
            && Objects.equals(this.tableName, that.tableName) && Objects.equals(this.updateBy, that.updateBy)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.workspaceId, that.workspaceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category,
            createBy,
            createTime,
            dataClassification,
            dataLayering,
            deleteTime,
            description,
            directory,
            displaySetting,
            format,
            lockStatus,
            ownerType,
            pipeId,
            processError,
            processStatus,
            projectId,
            rwType,
            schema,
            storageSetting,
            storeSizeInBytes,
            tableAlias,
            tableId,
            tableName,
            updateBy,
            updateTime,
            workspaceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IsapResource {\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    dataClassification: ").append(toIndentedString(dataClassification)).append("\n");
        sb.append("    dataLayering: ").append(toIndentedString(dataLayering)).append("\n");
        sb.append("    deleteTime: ").append(toIndentedString(deleteTime)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    directory: ").append(toIndentedString(directory)).append("\n");
        sb.append("    displaySetting: ").append(toIndentedString(displaySetting)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    lockStatus: ").append(toIndentedString(lockStatus)).append("\n");
        sb.append("    ownerType: ").append(toIndentedString(ownerType)).append("\n");
        sb.append("    pipeId: ").append(toIndentedString(pipeId)).append("\n");
        sb.append("    processError: ").append(toIndentedString(processError)).append("\n");
        sb.append("    processStatus: ").append(toIndentedString(processStatus)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    rwType: ").append(toIndentedString(rwType)).append("\n");
        sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
        sb.append("    storageSetting: ").append(toIndentedString(storageSetting)).append("\n");
        sb.append("    storeSizeInBytes: ").append(toIndentedString(storeSizeInBytes)).append("\n");
        sb.append("    tableAlias: ").append(toIndentedString(tableAlias)).append("\n");
        sb.append("    tableId: ").append(toIndentedString(tableId)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    updateBy: ").append(toIndentedString(updateBy)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
