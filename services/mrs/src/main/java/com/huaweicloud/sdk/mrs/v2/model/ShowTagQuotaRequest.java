package com.huaweicloud.sdk.mrs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowTagQuotaRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_scaling_policy_tags")

    private Boolean autoScalingPolicyTags;

    public ShowTagQuotaRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 集群ID。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public ShowTagQuotaRequest withAutoScalingPolicyTags(Boolean autoScalingPolicyTags) {
        this.autoScalingPolicyTags = autoScalingPolicyTags;
        return this;
    }

    /**
     * 是否查询弹性伸缩策略标签
     * @return autoScalingPolicyTags
     */
    public Boolean getAutoScalingPolicyTags() {
        return autoScalingPolicyTags;
    }

    public void setAutoScalingPolicyTags(Boolean autoScalingPolicyTags) {
        this.autoScalingPolicyTags = autoScalingPolicyTags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTagQuotaRequest that = (ShowTagQuotaRequest) obj;
        return Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.autoScalingPolicyTags, that.autoScalingPolicyTags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, autoScalingPolicyTags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTagQuotaRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    autoScalingPolicyTags: ").append(toIndentedString(autoScalingPolicyTags)).append("\n");
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
