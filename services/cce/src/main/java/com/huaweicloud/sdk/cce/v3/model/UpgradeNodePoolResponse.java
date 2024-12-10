package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.UUID;

/**
 * Response Object
 */
public class UpgradeNodePoolResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobid")

    private UUID jobid;

    public UpgradeNodePoolResponse withJobid(UUID jobid) {
        this.jobid = jobid;
        return this;
    }

    /**
     * Job ID returned after the job is delivered. The job ID can be used to query the job execution status.
     * @return jobid
     */
    public UUID getJobid() {
        return jobid;
    }

    public void setJobid(UUID jobid) {
        this.jobid = jobid;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpgradeNodePoolResponse that = (UpgradeNodePoolResponse) obj;
        return Objects.equals(this.jobid, that.jobid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobid);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpgradeNodePoolResponse {\n");
        sb.append("    jobid: ").append(toIndentedString(jobid)).append("\n");
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
