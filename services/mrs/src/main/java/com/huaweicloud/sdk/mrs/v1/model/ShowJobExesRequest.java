package com.huaweicloud.sdk.mrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowJobExesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_exe_id")

    private String jobExeId;

    public ShowJobExesRequest withJobExeId(String jobExeId) {
        this.jobExeId = jobExeId;
        return this;
    }

    /**
     * 作业ID。
     * @return jobExeId
     */
    public String getJobExeId() {
        return jobExeId;
    }

    public void setJobExeId(String jobExeId) {
        this.jobExeId = jobExeId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowJobExesRequest that = (ShowJobExesRequest) obj;
        return Objects.equals(this.jobExeId, that.jobExeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobExeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowJobExesRequest {\n");
        sb.append("    jobExeId: ").append(toIndentedString(jobExeId)).append("\n");
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
