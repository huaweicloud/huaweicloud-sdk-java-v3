package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class DisableClusterGroupPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobID")

    private String jobID;

    public DisableClusterGroupPolicyResponse withJobID(String jobID) {
        this.jobID = jobID;
        return this;
    }

    /**
     * 任务id
     * @return jobID
     */
    public String getJobID() {
        return jobID;
    }

    public void setJobID(String jobID) {
        this.jobID = jobID;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DisableClusterGroupPolicyResponse that = (DisableClusterGroupPolicyResponse) obj;
        return Objects.equals(this.jobID, that.jobID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobID);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DisableClusterGroupPolicyResponse {\n");
        sb.append("    jobID: ").append(toIndentedString(jobID)).append("\n");
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
