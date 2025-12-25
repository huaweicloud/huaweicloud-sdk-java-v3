package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowPipeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_by")

    private String createBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

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
    @JsonProperty(value = "owner_type")

    private String ownerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipe_alias")

    private String pipeAlias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipe_id")

    private String pipeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipe_name")

    private String pipeName;

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
    @JsonProperty(value = "resources")

    private List<IsapResource> resources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema")

    private Schema schema;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_setting")

    private StorageSetting storageSetting;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_by")

    private String updateBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    public ShowPipeResponse withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * 资源类型，例如 STREAMING_TO_INDEX
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ShowPipeResponse withCreateBy(String createBy) {
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

    public ShowPipeResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间戳
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ShowPipeResponse withDeleteTime(Integer deleteTime) {
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

    public ShowPipeResponse withDescription(String description) {
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

    public ShowPipeResponse withDirectory(String directory) {
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

    public ShowPipeResponse withOwnerType(String ownerType) {
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

    public ShowPipeResponse withPipeAlias(String pipeAlias) {
        this.pipeAlias = pipeAlias;
        return this;
    }

    /**
     * 管道别名
     * @return pipeAlias
     */
    public String getPipeAlias() {
        return pipeAlias;
    }

    public void setPipeAlias(String pipeAlias) {
        this.pipeAlias = pipeAlias;
    }

    public ShowPipeResponse withPipeId(String pipeId) {
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

    public ShowPipeResponse withPipeName(String pipeName) {
        this.pipeName = pipeName;
        return this;
    }

    /**
     * 管道名称
     * @return pipeName
     */
    public String getPipeName() {
        return pipeName;
    }

    public void setPipeName(String pipeName) {
        this.pipeName = pipeName;
    }

    public ShowPipeResponse withProcessError(String processError) {
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

    public ShowPipeResponse withProcessStatus(String processStatus) {
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

    public ShowPipeResponse withProjectId(String projectId) {
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

    public ShowPipeResponse withResources(List<IsapResource> resources) {
        this.resources = resources;
        return this;
    }

    public ShowPipeResponse addResourcesItem(IsapResource resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public ShowPipeResponse withResources(Consumer<List<IsapResource>> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * 资源列表
     * @return resources
     */
    public List<IsapResource> getResources() {
        return resources;
    }

    public void setResources(List<IsapResource> resources) {
        this.resources = resources;
    }

    public ShowPipeResponse withSchema(Schema schema) {
        this.schema = schema;
        return this;
    }

    public ShowPipeResponse withSchema(Consumer<Schema> schemaSetter) {
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

    public ShowPipeResponse withStorageSetting(StorageSetting storageSetting) {
        this.storageSetting = storageSetting;
        return this;
    }

    public ShowPipeResponse withStorageSetting(Consumer<StorageSetting> storageSettingSetter) {
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

    public ShowPipeResponse withUpdateBy(String updateBy) {
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

    public ShowPipeResponse withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间戳
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public ShowPipeResponse withWorkspaceId(String workspaceId) {
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
        ShowPipeResponse that = (ShowPipeResponse) obj;
        return Objects.equals(this.category, that.category) && Objects.equals(this.createBy, that.createBy)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.deleteTime, that.deleteTime)
            && Objects.equals(this.description, that.description) && Objects.equals(this.directory, that.directory)
            && Objects.equals(this.ownerType, that.ownerType) && Objects.equals(this.pipeAlias, that.pipeAlias)
            && Objects.equals(this.pipeId, that.pipeId) && Objects.equals(this.pipeName, that.pipeName)
            && Objects.equals(this.processError, that.processError)
            && Objects.equals(this.processStatus, that.processStatus) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.resources, that.resources) && Objects.equals(this.schema, that.schema)
            && Objects.equals(this.storageSetting, that.storageSetting) && Objects.equals(this.updateBy, that.updateBy)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.workspaceId, that.workspaceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category,
            createBy,
            createTime,
            deleteTime,
            description,
            directory,
            ownerType,
            pipeAlias,
            pipeId,
            pipeName,
            processError,
            processStatus,
            projectId,
            resources,
            schema,
            storageSetting,
            updateBy,
            updateTime,
            workspaceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPipeResponse {\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    deleteTime: ").append(toIndentedString(deleteTime)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    directory: ").append(toIndentedString(directory)).append("\n");
        sb.append("    ownerType: ").append(toIndentedString(ownerType)).append("\n");
        sb.append("    pipeAlias: ").append(toIndentedString(pipeAlias)).append("\n");
        sb.append("    pipeId: ").append(toIndentedString(pipeId)).append("\n");
        sb.append("    pipeName: ").append(toIndentedString(pipeName)).append("\n");
        sb.append("    processError: ").append(toIndentedString(processError)).append("\n");
        sb.append("    processStatus: ").append(toIndentedString(processStatus)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
        sb.append("    storageSetting: ").append(toIndentedString(storageSetting)).append("\n");
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
