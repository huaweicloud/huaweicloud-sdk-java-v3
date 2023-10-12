package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CreateFactorySupplementDataInstanceRequestBodyDependJobs
 */
public class CreateFactorySupplementDataInstanceRequestBodyDependJobs {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_name")

    private String jobName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    public CreateFactorySupplementDataInstanceRequestBodyDependJobs withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * 依赖的作业名称
     * @return jobName
     */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public CreateFactorySupplementDataInstanceRequestBodyDependJobs withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 依赖的作业名称的空间ID
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
        CreateFactorySupplementDataInstanceRequestBodyDependJobs that =
            (CreateFactorySupplementDataInstanceRequestBodyDependJobs) obj;
        return Objects.equals(this.jobName, that.jobName) && Objects.equals(this.workspaceId, that.workspaceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobName, workspaceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateFactorySupplementDataInstanceRequestBodyDependJobs {\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
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
