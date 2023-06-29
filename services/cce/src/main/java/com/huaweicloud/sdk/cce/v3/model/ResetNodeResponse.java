package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.UUID;

/**
 * Response Object
 */
public class ResetNodeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobid")

    private UUID jobid;

    public ResetNodeResponse withJobid(UUID jobid) {
        this.jobid = jobid;
        return this;
    }

    /**
     * 提交任务成功后返回的任务ID，用户可以使用该ID对任务执行情况进行查询。
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
        ResetNodeResponse that = (ResetNodeResponse) obj;
        return Objects.equals(this.jobid, that.jobid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobid);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResetNodeResponse {\n");
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
