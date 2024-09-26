package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteHarvestTaskRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Access-Control-Allow-Internal")

    private String accessControlAllowInternal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Access-Control-Allow-External")

    private String accessControlAllowExternal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    public DeleteHarvestTaskRequest withAccessControlAllowInternal(String accessControlAllowInternal) {
        this.accessControlAllowInternal = accessControlAllowInternal;
        return this;
    }

    /**
     * 服务鉴权Token，服务开启鉴权，必须携带Access-Control-Allow-Internal访问服务。
     * @return accessControlAllowInternal
     */
    public String getAccessControlAllowInternal() {
        return accessControlAllowInternal;
    }

    public void setAccessControlAllowInternal(String accessControlAllowInternal) {
        this.accessControlAllowInternal = accessControlAllowInternal;
    }

    public DeleteHarvestTaskRequest withAccessControlAllowExternal(String accessControlAllowExternal) {
        this.accessControlAllowExternal = accessControlAllowExternal;
        return this;
    }

    /**
     * 服务鉴权Token，服务开启鉴权，必须携带Access-Control-Allow-External访问服务。
     * @return accessControlAllowExternal
     */
    public String getAccessControlAllowExternal() {
        return accessControlAllowExternal;
    }

    public void setAccessControlAllowExternal(String accessControlAllowExternal) {
        this.accessControlAllowExternal = accessControlAllowExternal;
    }

    public DeleteHarvestTaskRequest withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 任务ID
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteHarvestTaskRequest that = (DeleteHarvestTaskRequest) obj;
        return Objects.equals(this.accessControlAllowInternal, that.accessControlAllowInternal)
            && Objects.equals(this.accessControlAllowExternal, that.accessControlAllowExternal)
            && Objects.equals(this.jobId, that.jobId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessControlAllowInternal, accessControlAllowExternal, jobId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteHarvestTaskRequest {\n");
        sb.append("    accessControlAllowInternal: ").append(toIndentedString(accessControlAllowInternal)).append("\n");
        sb.append("    accessControlAllowExternal: ").append(toIndentedString(accessControlAllowExternal)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
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
