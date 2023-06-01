package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TaskBasicAttribute
 */
public class TaskBasicAttribute {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branch_id")

    private String branchId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branch_name")

    private String branchName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_by")

    private String createBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iteration_uri")

    private String iterationUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocols")

    private List<String> protocols = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_id")

    private String serviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stage")

    private Integer stage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stage_name")

    private String stageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_uri")

    private String versionUri;

    public TaskBasicAttribute withBranchId(String branchId) {
        this.branchId = branchId;
        return this;
    }

    /**
     * 分支ID
     * @return branchId
     */
    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public TaskBasicAttribute withBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }

    /**
     * 分支名
     * @return branchName
     */
    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public TaskBasicAttribute withCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }

    /**
     * 创建人的工号
     * @return createBy
     */
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public TaskBasicAttribute withIterationUri(String iterationUri) {
        this.iterationUri = iterationUri;
        return this;
    }

    /**
     * 迭代url
     * @return iterationUri
     */
    public String getIterationUri() {
        return iterationUri;
    }

    public void setIterationUri(String iterationUri) {
        this.iterationUri = iterationUri;
    }

    public TaskBasicAttribute withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 工程id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public TaskBasicAttribute withProtocols(List<String> protocols) {
        this.protocols = protocols;
        return this;
    }

    public TaskBasicAttribute addProtocolsItem(String protocolsItem) {
        if (this.protocols == null) {
            this.protocols = new ArrayList<>();
        }
        this.protocols.add(protocolsItem);
        return this;
    }

    public TaskBasicAttribute withProtocols(Consumer<List<String>> protocolsSetter) {
        if (this.protocols == null) {
            this.protocols = new ArrayList<>();
        }
        protocolsSetter.accept(this.protocols);
        return this;
    }

    /**
     * 协议
     * @return protocols
     */
    public List<String> getProtocols() {
        return protocols;
    }

    public void setProtocols(List<String> protocols) {
        this.protocols = protocols;
    }

    public TaskBasicAttribute withServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    /**
     * 服务id
     * @return serviceId
     */
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public TaskBasicAttribute withStage(Integer stage) {
        this.stage = stage;
        return this;
    }

    /**
     * 阶段
     * @return stage
     */
    public Integer getStage() {
        return stage;
    }

    public void setStage(Integer stage) {
        this.stage = stage;
    }

    public TaskBasicAttribute withStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }

    /**
     * 阶段名称
     * @return stageName
     */
    public String getStageName() {
        return stageName;
    }

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    public TaskBasicAttribute withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务id
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public TaskBasicAttribute withVersionUri(String versionUri) {
        this.versionUri = versionUri;
        return this;
    }

    /**
     * 版本uri
     * @return versionUri
     */
    public String getVersionUri() {
        return versionUri;
    }

    public void setVersionUri(String versionUri) {
        this.versionUri = versionUri;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaskBasicAttribute taskBasicAttribute = (TaskBasicAttribute) o;
        return Objects.equals(this.branchId, taskBasicAttribute.branchId)
            && Objects.equals(this.branchName, taskBasicAttribute.branchName)
            && Objects.equals(this.createBy, taskBasicAttribute.createBy)
            && Objects.equals(this.iterationUri, taskBasicAttribute.iterationUri)
            && Objects.equals(this.projectId, taskBasicAttribute.projectId)
            && Objects.equals(this.protocols, taskBasicAttribute.protocols)
            && Objects.equals(this.serviceId, taskBasicAttribute.serviceId)
            && Objects.equals(this.stage, taskBasicAttribute.stage)
            && Objects.equals(this.stageName, taskBasicAttribute.stageName)
            && Objects.equals(this.taskId, taskBasicAttribute.taskId)
            && Objects.equals(this.versionUri, taskBasicAttribute.versionUri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(branchId,
            branchName,
            createBy,
            iterationUri,
            projectId,
            protocols,
            serviceId,
            stage,
            stageName,
            taskId,
            versionUri);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskBasicAttribute {\n");
        sb.append("    branchId: ").append(toIndentedString(branchId)).append("\n");
        sb.append("    branchName: ").append(toIndentedString(branchName)).append("\n");
        sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
        sb.append("    iterationUri: ").append(toIndentedString(iterationUri)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    protocols: ").append(toIndentedString(protocols)).append("\n");
        sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
        sb.append("    stage: ").append(toIndentedString(stage)).append("\n");
        sb.append("    stageName: ").append(toIndentedString(stageName)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    versionUri: ").append(toIndentedString(versionUri)).append("\n");
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
