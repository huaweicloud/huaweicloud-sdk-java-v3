package com.huaweicloud.sdk.bcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 使用已有CCE集群信息，说明：Fabric1.4版本服务仅支持1.15及以下版本集群
 */
public class CCEClusterInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_platform_type")

    private String clusterPlatformType;

    public CCEClusterInfo withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 集群ID
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public CCEClusterInfo withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * 集群名称
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public CCEClusterInfo withClusterPlatformType(String clusterPlatformType) {
        this.clusterPlatformType = clusterPlatformType;
        return this;
    }

    /**
     * 集群CPU架构类型：X86（VirtualMachine），ARM（ARM64）
     * @return clusterPlatformType
     */
    public String getClusterPlatformType() {
        return clusterPlatformType;
    }

    public void setClusterPlatformType(String clusterPlatformType) {
        this.clusterPlatformType = clusterPlatformType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CCEClusterInfo ccEClusterInfo = (CCEClusterInfo) o;
        return Objects.equals(this.clusterId, ccEClusterInfo.clusterId)
            && Objects.equals(this.clusterName, ccEClusterInfo.clusterName)
            && Objects.equals(this.clusterPlatformType, ccEClusterInfo.clusterPlatformType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, clusterName, clusterPlatformType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CCEClusterInfo {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    clusterPlatformType: ").append(toIndentedString(clusterPlatformType)).append("\n");
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
