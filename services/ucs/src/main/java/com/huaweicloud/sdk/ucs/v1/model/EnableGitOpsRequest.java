package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class EnableGitOpsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterid")

    private String clusterid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retry")

    private String retry;

    public EnableGitOpsRequest withClusterid(String clusterid) {
        this.clusterid = clusterid;
        return this;
    }

    /**
     * 集群id
     * @return clusterid
     */
    public String getClusterid() {
        return clusterid;
    }

    public void setClusterid(String clusterid) {
        this.clusterid = clusterid;
    }

    public EnableGitOpsRequest withRetry(String retry) {
        this.retry = retry;
        return this;
    }

    /**
     * 重试参数
     * @return retry
     */
    public String getRetry() {
        return retry;
    }

    public void setRetry(String retry) {
        this.retry = retry;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EnableGitOpsRequest that = (EnableGitOpsRequest) obj;
        return Objects.equals(this.clusterid, that.clusterid) && Objects.equals(this.retry, that.retry);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterid, retry);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnableGitOpsRequest {\n");
        sb.append("    clusterid: ").append(toIndentedString(clusterid)).append("\n");
        sb.append("    retry: ").append(toIndentedString(retry)).append("\n");
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
