package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TableItem
 */
public class TableItem {

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
    @JsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_alias")

    private String tableAlias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "directory")

    private String directory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private TableCategory category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_status")

    private TableLockStatus lockStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_status")

    private TableProcessStatus processStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_error")

    private TableProcessError processError;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edit_type")

    private TableEditType editType;

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
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_time")

    private Long deleteTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "store_size_in_bytes")

    private Long storeSizeInBytes;

    public TableItem withProjectId(String projectId) {
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

    public TableItem withWorkspaceId(String workspaceId) {
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

    public TableItem withTableId(String tableId) {
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

    public TableItem withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * Table name 表名
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public TableItem withTableAlias(String tableAlias) {
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

    public TableItem withDirectory(String directory) {
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

    public TableItem withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 表描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TableItem withCategory(TableCategory category) {
        this.category = category;
        return this;
    }

    /**
     * Get category
     * @return category
     */
    public TableCategory getCategory() {
        return category;
    }

    public void setCategory(TableCategory category) {
        this.category = category;
    }

    public TableItem withLockStatus(TableLockStatus lockStatus) {
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

    public TableItem withProcessStatus(TableProcessStatus processStatus) {
        this.processStatus = processStatus;
        return this;
    }

    /**
     * Get processStatus
     * @return processStatus
     */
    public TableProcessStatus getProcessStatus() {
        return processStatus;
    }

    public void setProcessStatus(TableProcessStatus processStatus) {
        this.processStatus = processStatus;
    }

    public TableItem withProcessError(TableProcessError processError) {
        this.processError = processError;
        return this;
    }

    /**
     * Get processError
     * @return processError
     */
    public TableProcessError getProcessError() {
        return processError;
    }

    public void setProcessError(TableProcessError processError) {
        this.processError = processError;
    }

    public TableItem withEditType(TableEditType editType) {
        this.editType = editType;
        return this;
    }

    /**
     * Get editType
     * @return editType
     */
    public TableEditType getEditType() {
        return editType;
    }

    public void setEditType(TableEditType editType) {
        this.editType = editType;
    }

    public TableItem withFormat(TableFormat format) {
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

    public TableItem withRwType(TableRWType rwType) {
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

    public TableItem withOwnerType(TableOwnerType ownerType) {
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

    public TableItem withDataLayering(DataLayering dataLayering) {
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

    public TableItem withDataClassification(DataClassification dataClassification) {
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

    public TableItem withCreateTime(Long createTime) {
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

    public TableItem withUpdateTime(Long updateTime) {
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

    public TableItem withDeleteTime(Long deleteTime) {
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

    public TableItem withStoreSizeInBytes(Long storeSizeInBytes) {
        this.storeSizeInBytes = storeSizeInBytes;
        return this;
    }

    /**
     * 已使用存储容量
     * minimum: 0
     * maximum: 4
     * @return storeSizeInBytes
     */
    public Long getStoreSizeInBytes() {
        return storeSizeInBytes;
    }

    public void setStoreSizeInBytes(Long storeSizeInBytes) {
        this.storeSizeInBytes = storeSizeInBytes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TableItem that = (TableItem) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.workspaceId, that.workspaceId)
            && Objects.equals(this.tableId, that.tableId) && Objects.equals(this.tableName, that.tableName)
            && Objects.equals(this.tableAlias, that.tableAlias) && Objects.equals(this.directory, that.directory)
            && Objects.equals(this.description, that.description) && Objects.equals(this.category, that.category)
            && Objects.equals(this.lockStatus, that.lockStatus)
            && Objects.equals(this.processStatus, that.processStatus)
            && Objects.equals(this.processError, that.processError) && Objects.equals(this.editType, that.editType)
            && Objects.equals(this.format, that.format) && Objects.equals(this.rwType, that.rwType)
            && Objects.equals(this.ownerType, that.ownerType) && Objects.equals(this.dataLayering, that.dataLayering)
            && Objects.equals(this.dataClassification, that.dataClassification)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.deleteTime, that.deleteTime)
            && Objects.equals(this.storeSizeInBytes, that.storeSizeInBytes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId,
            workspaceId,
            tableId,
            tableName,
            tableAlias,
            directory,
            description,
            category,
            lockStatus,
            processStatus,
            processError,
            editType,
            format,
            rwType,
            ownerType,
            dataLayering,
            dataClassification,
            createTime,
            updateTime,
            deleteTime,
            storeSizeInBytes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TableItem {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    tableId: ").append(toIndentedString(tableId)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    tableAlias: ").append(toIndentedString(tableAlias)).append("\n");
        sb.append("    directory: ").append(toIndentedString(directory)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    lockStatus: ").append(toIndentedString(lockStatus)).append("\n");
        sb.append("    processStatus: ").append(toIndentedString(processStatus)).append("\n");
        sb.append("    processError: ").append(toIndentedString(processError)).append("\n");
        sb.append("    editType: ").append(toIndentedString(editType)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    rwType: ").append(toIndentedString(rwType)).append("\n");
        sb.append("    ownerType: ").append(toIndentedString(ownerType)).append("\n");
        sb.append("    dataLayering: ").append(toIndentedString(dataLayering)).append("\n");
        sb.append("    dataClassification: ").append(toIndentedString(dataClassification)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    deleteTime: ").append(toIndentedString(deleteTime)).append("\n");
        sb.append("    storeSizeInBytes: ").append(toIndentedString(storeSizeInBytes)).append("\n");
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
