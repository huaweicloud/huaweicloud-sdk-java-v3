package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowFunctionAppResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_modified_time")

    private Long lastModifiedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stack_resources")

    private StackResource stackResources;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stack_name")

    private String stackName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stack_id")

    private String stackId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_name")

    private String repoName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo")

    private RepoInfo repo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipeline_id")

    private String pipelineId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apig_url")

    private String apigUrl;

    public ShowFunctionAppResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 应用名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowFunctionAppResponse withLastModifiedTime(Long lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * 最后修改时间
     * @return lastModifiedTime
     */
    public Long getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(Long lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    public ShowFunctionAppResponse withStackResources(StackResource stackResources) {
        this.stackResources = stackResources;
        return this;
    }

    public ShowFunctionAppResponse withStackResources(Consumer<StackResource> stackResourcesSetter) {
        if (this.stackResources == null) {
            this.stackResources = new StackResource();
            stackResourcesSetter.accept(this.stackResources);
        }

        return this;
    }

    /**
     * Get stackResources
     * @return stackResources
     */
    public StackResource getStackResources() {
        return stackResources;
    }

    public void setStackResources(StackResource stackResources) {
        this.stackResources = stackResources;
    }

    public ShowFunctionAppResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 应用状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowFunctionAppResponse withStackName(String stackName) {
        this.stackName = stackName;
        return this;
    }

    /**
     * 资源栈名称
     * @return stackName
     */
    public String getStackName() {
        return stackName;
    }

    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    public ShowFunctionAppResponse withStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }

    /**
     * 资源栈id
     * @return stackId
     */
    public String getStackId() {
        return stackId;
    }

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    public ShowFunctionAppResponse withRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }

    /**
     * 存储库名称
     * @return repoName
     */
    public String getRepoName() {
        return repoName;
    }

    public void setRepoName(String repoName) {
        this.repoName = repoName;
    }

    public ShowFunctionAppResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 应用描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowFunctionAppResponse withRepo(RepoInfo repo) {
        this.repo = repo;
        return this;
    }

    public ShowFunctionAppResponse withRepo(Consumer<RepoInfo> repoSetter) {
        if (this.repo == null) {
            this.repo = new RepoInfo();
            repoSetter.accept(this.repo);
        }

        return this;
    }

    /**
     * Get repo
     * @return repo
     */
    public RepoInfo getRepo() {
        return repo;
    }

    public void setRepo(RepoInfo repo) {
        this.repo = repo;
    }

    public ShowFunctionAppResponse withPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }

    /**
     * 管道id
     * @return pipelineId
     */
    public String getPipelineId() {
        return pipelineId;
    }

    public void setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
    }

    public ShowFunctionAppResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ShowFunctionAppResponse withApigUrl(String apigUrl) {
        this.apigUrl = apigUrl;
        return this;
    }

    /**
     * 调用URL
     * @return apigUrl
     */
    public String getApigUrl() {
        return apigUrl;
    }

    public void setApigUrl(String apigUrl) {
        this.apigUrl = apigUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowFunctionAppResponse that = (ShowFunctionAppResponse) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.lastModifiedTime, that.lastModifiedTime)
            && Objects.equals(this.stackResources, that.stackResources) && Objects.equals(this.status, that.status)
            && Objects.equals(this.stackName, that.stackName) && Objects.equals(this.stackId, that.stackId)
            && Objects.equals(this.repoName, that.repoName) && Objects.equals(this.description, that.description)
            && Objects.equals(this.repo, that.repo) && Objects.equals(this.pipelineId, that.pipelineId)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.apigUrl, that.apigUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            lastModifiedTime,
            stackResources,
            status,
            stackName,
            stackId,
            repoName,
            description,
            repo,
            pipelineId,
            projectId,
            apigUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowFunctionAppResponse {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    lastModifiedTime: ").append(toIndentedString(lastModifiedTime)).append("\n");
        sb.append("    stackResources: ").append(toIndentedString(stackResources)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    stackName: ").append(toIndentedString(stackName)).append("\n");
        sb.append("    stackId: ").append(toIndentedString(stackId)).append("\n");
        sb.append("    repoName: ").append(toIndentedString(repoName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    repo: ").append(toIndentedString(repo)).append("\n");
        sb.append("    pipelineId: ").append(toIndentedString(pipelineId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    apigUrl: ").append(toIndentedString(apigUrl)).append("\n");
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
