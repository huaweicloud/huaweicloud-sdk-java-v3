package com.huaweicloud.sdk.dgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowJobRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace")

    private String workspace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_name")

    private String jobName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private Integer version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dependencies")

    private Boolean dependencies;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "getJobSubmitVersion")

    private Boolean getJobSubmitVersion;

    public ShowJobRequest withWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }

    /**
     * 工作空间id
     * @return workspace
     */
    public String getWorkspace() {
        return workspace;
    }

    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }

    public ShowJobRequest withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * 作业名称.
     * @return jobName
     */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public ShowJobRequest withVersion(Integer version) {
        this.version = version;
        return this;
    }

    /**
     * 作业版本号，若传入版本号，则查询指定提交版本号的作业。
     * @return version
     */
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public ShowJobRequest withDependencies(Boolean dependencies) {
        this.dependencies = dependencies;
        return this;
    }

    /**
     * 返回下游依赖当前作业的作业，只返回第一层。
     * @return dependencies
     */
    public Boolean getDependencies() {
        return dependencies;
    }

    public void setDependencies(Boolean dependencies) {
        this.dependencies = dependencies;
    }

    public ShowJobRequest withGetJobSubmitVersion(Boolean getJobSubmitVersion) {
        this.getJobSubmitVersion = getJobSubmitVersion;
        return this;
    }

    /**
     * 该字段仅在verion未设置时生效，true：作业最新提交版本，false：开发态作业（即最新保存版本）。
     * @return getJobSubmitVersion
     */
    public Boolean getGetJobSubmitVersion() {
        return getJobSubmitVersion;
    }

    public void setGetJobSubmitVersion(Boolean getJobSubmitVersion) {
        this.getJobSubmitVersion = getJobSubmitVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowJobRequest that = (ShowJobRequest) obj;
        return Objects.equals(this.workspace, that.workspace) && Objects.equals(this.jobName, that.jobName)
            && Objects.equals(this.version, that.version) && Objects.equals(this.dependencies, that.dependencies)
            && Objects.equals(this.getJobSubmitVersion, that.getJobSubmitVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspace, jobName, version, dependencies, getJobSubmitVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowJobRequest {\n");
        sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    dependencies: ").append(toIndentedString(dependencies)).append("\n");
        sb.append("    getJobSubmitVersion: ").append(toIndentedString(getJobSubmitVersion)).append("\n");
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
