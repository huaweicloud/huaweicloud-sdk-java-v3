package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class EnableClusterGroupPolicyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clustergroupid")

    private String clustergroupid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retry")

    private String retry;

    public EnableClusterGroupPolicyRequest withClustergroupid(String clustergroupid) {
        this.clustergroupid = clustergroupid;
        return this;
    }

    /**
     * 容器舰队id
     * @return clustergroupid
     */
    public String getClustergroupid() {
        return clustergroupid;
    }

    public void setClustergroupid(String clustergroupid) {
        this.clustergroupid = clustergroupid;
    }

    public EnableClusterGroupPolicyRequest withRetry(String retry) {
        this.retry = retry;
        return this;
    }

    /**
     * 重试启动策略管理功能
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
        EnableClusterGroupPolicyRequest that = (EnableClusterGroupPolicyRequest) obj;
        return Objects.equals(this.clustergroupid, that.clustergroupid) && Objects.equals(this.retry, that.retry);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clustergroupid, retry);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnableClusterGroupPolicyRequest {\n");
        sb.append("    clustergroupid: ").append(toIndentedString(clustergroupid)).append("\n");
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
