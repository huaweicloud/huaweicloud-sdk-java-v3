package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * StartTargetClusterConnectivityTestReq
 */
public class StartTargetClusterConnectivityTestReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_cluster_id")

    private String targetClusterId;

    public StartTargetClusterConnectivityTestReq withTargetClusterId(String targetClusterId) {
        this.targetClusterId = targetClusterId;
        return this;
    }

    /**
     * 目标集群ID
     * @return targetClusterId
     */
    public String getTargetClusterId() {
        return targetClusterId;
    }

    public void setTargetClusterId(String targetClusterId) {
        this.targetClusterId = targetClusterId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StartTargetClusterConnectivityTestReq that = (StartTargetClusterConnectivityTestReq) obj;
        return Objects.equals(this.targetClusterId, that.targetClusterId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetClusterId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartTargetClusterConnectivityTestReq {\n");
        sb.append("    targetClusterId: ").append(toIndentedString(targetClusterId)).append("\n");
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
