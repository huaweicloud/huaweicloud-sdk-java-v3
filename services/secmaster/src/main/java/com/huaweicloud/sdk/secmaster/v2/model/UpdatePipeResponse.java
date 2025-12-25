package com.huaweicloud.sdk.secmaster.v2.model;

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
public class UpdatePipeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipe_id")

    private String pipeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipe_name")

    private String pipeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipe_alias")

    private String pipeAlias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private PipeCategory category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "directory")

    private String directory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_status")

    private PipeProcessStatus processStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_error")

    private PipeProcessError processError;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner_type")

    private PipeOwnerType ownerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private List<PipeResource> resources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema")

    private PipeSchema schema;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_time")

    private Long deleteTime;

    public UpdatePipeResponse withProjectId(String projectId) {
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

    public UpdatePipeResponse withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * UUID
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public UpdatePipeResponse withPipeId(String pipeId) {
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

    public UpdatePipeResponse withPipeName(String pipeName) {
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

    public UpdatePipeResponse withPipeAlias(String pipeAlias) {
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

    public UpdatePipeResponse withCategory(PipeCategory category) {
        this.category = category;
        return this;
    }

    /**
     * Get category
     * @return category
     */
    public PipeCategory getCategory() {
        return category;
    }

    public void setCategory(PipeCategory category) {
        this.category = category;
    }

    public UpdatePipeResponse withDirectory(String directory) {
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

    public UpdatePipeResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 管道描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdatePipeResponse withProcessStatus(PipeProcessStatus processStatus) {
        this.processStatus = processStatus;
        return this;
    }

    /**
     * Get processStatus
     * @return processStatus
     */
    public PipeProcessStatus getProcessStatus() {
        return processStatus;
    }

    public void setProcessStatus(PipeProcessStatus processStatus) {
        this.processStatus = processStatus;
    }

    public UpdatePipeResponse withProcessError(PipeProcessError processError) {
        this.processError = processError;
        return this;
    }

    /**
     * Get processError
     * @return processError
     */
    public PipeProcessError getProcessError() {
        return processError;
    }

    public void setProcessError(PipeProcessError processError) {
        this.processError = processError;
    }

    public UpdatePipeResponse withOwnerType(PipeOwnerType ownerType) {
        this.ownerType = ownerType;
        return this;
    }

    /**
     * Get ownerType
     * @return ownerType
     */
    public PipeOwnerType getOwnerType() {
        return ownerType;
    }

    public void setOwnerType(PipeOwnerType ownerType) {
        this.ownerType = ownerType;
    }

    public UpdatePipeResponse withResources(List<PipeResource> resources) {
        this.resources = resources;
        return this;
    }

    public UpdatePipeResponse addResourcesItem(PipeResource resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public UpdatePipeResponse withResources(Consumer<List<PipeResource>> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * 管道资源
     * @return resources
     */
    public List<PipeResource> getResources() {
        return resources;
    }

    public void setResources(List<PipeResource> resources) {
        this.resources = resources;
    }

    public UpdatePipeResponse withSchema(PipeSchema schema) {
        this.schema = schema;
        return this;
    }

    public UpdatePipeResponse withSchema(Consumer<PipeSchema> schemaSetter) {
        if (this.schema == null) {
            this.schema = new PipeSchema();
            schemaSetter.accept(this.schema);
        }

        return this;
    }

    /**
     * Get schema
     * @return schema
     */
    public PipeSchema getSchema() {
        return schema;
    }

    public void setSchema(PipeSchema schema) {
        this.schema = schema;
    }

    public UpdatePipeResponse withCreateTime(Long createTime) {
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

    public UpdatePipeResponse withUpdateTime(Long updateTime) {
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

    public UpdatePipeResponse withDeleteTime(Long deleteTime) {
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
        UpdatePipeResponse that = (UpdatePipeResponse) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.workspaceId, that.workspaceId)
            && Objects.equals(this.pipeId, that.pipeId) && Objects.equals(this.pipeName, that.pipeName)
            && Objects.equals(this.pipeAlias, that.pipeAlias) && Objects.equals(this.category, that.category)
            && Objects.equals(this.directory, that.directory) && Objects.equals(this.description, that.description)
            && Objects.equals(this.processStatus, that.processStatus)
            && Objects.equals(this.processError, that.processError) && Objects.equals(this.ownerType, that.ownerType)
            && Objects.equals(this.resources, that.resources) && Objects.equals(this.schema, that.schema)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.deleteTime, that.deleteTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId,
            workspaceId,
            pipeId,
            pipeName,
            pipeAlias,
            category,
            directory,
            description,
            processStatus,
            processError,
            ownerType,
            resources,
            schema,
            createTime,
            updateTime,
            deleteTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePipeResponse {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    pipeId: ").append(toIndentedString(pipeId)).append("\n");
        sb.append("    pipeName: ").append(toIndentedString(pipeName)).append("\n");
        sb.append("    pipeAlias: ").append(toIndentedString(pipeAlias)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    directory: ").append(toIndentedString(directory)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    processStatus: ").append(toIndentedString(processStatus)).append("\n");
        sb.append("    processError: ").append(toIndentedString(processError)).append("\n");
        sb.append("    ownerType: ").append(toIndentedString(ownerType)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
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
