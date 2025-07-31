package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 集群防护信息
 */
public class ClusterResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_version")

    private String clusterVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_status")

    private String protectStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_num")

    private Integer policyNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_status")

    private String clusterStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_type")

    private String clusterType;

    public ClusterResponseInfo withClusterName(String clusterName) {
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

    public ClusterResponseInfo withClusterId(String clusterId) {
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

    public ClusterResponseInfo withClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
        return this;
    }

    /**
     * 集群版本
     * @return clusterVersion
     */
    public String getClusterVersion() {
        return clusterVersion;
    }

    public void setClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
    }

    public ClusterResponseInfo withProtectStatus(String protectStatus) {
        this.protectStatus = protectStatus;
        return this;
    }

    /**
     * 防护状态 - unprotected - plugin error - protected with policy - deploy policy failed - protected without policy - uninstall failed - uninstall
     * @return protectStatus
     */
    public String getProtectStatus() {
        return protectStatus;
    }

    public void setProtectStatus(String protectStatus) {
        this.protectStatus = protectStatus;
    }

    public ClusterResponseInfo withPolicyNum(Integer policyNum) {
        this.policyNum = policyNum;
        return this;
    }

    /**
     * 策略数量
     * minimum: 0
     * maximum: 10000
     * @return policyNum
     */
    public Integer getPolicyNum() {
        return policyNum;
    }

    public void setPolicyNum(Integer policyNum) {
        this.policyNum = policyNum;
    }

    public ClusterResponseInfo withClusterStatus(String clusterStatus) {
        this.clusterStatus = clusterStatus;
        return this;
    }

    /**
     * 集群运行状态 - Available - Unavailable
     * @return clusterStatus
     */
    public String getClusterStatus() {
        return clusterStatus;
    }

    public void setClusterStatus(String clusterStatus) {
        this.clusterStatus = clusterStatus;
    }

    public ClusterResponseInfo withClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }

    /**
     * 集群类型，包含以下几种： -k8s 原生集群 -cce CCE集群 -ali 阿里云集群 -tencent 腾讯云集群 -azure 微软云集群 -aws 亚马逊集群 -self_built_hw 华为云自建集群 -self_built_idc IDC自建集群
     * @return clusterType
     */
    public String getClusterType() {
        return clusterType;
    }

    public void setClusterType(String clusterType) {
        this.clusterType = clusterType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClusterResponseInfo that = (ClusterResponseInfo) obj;
        return Objects.equals(this.clusterName, that.clusterName) && Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.clusterVersion, that.clusterVersion)
            && Objects.equals(this.protectStatus, that.protectStatus) && Objects.equals(this.policyNum, that.policyNum)
            && Objects.equals(this.clusterStatus, that.clusterStatus)
            && Objects.equals(this.clusterType, that.clusterType);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(clusterName, clusterId, clusterVersion, protectStatus, policyNum, clusterStatus, clusterType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterResponseInfo {\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    clusterVersion: ").append(toIndentedString(clusterVersion)).append("\n");
        sb.append("    protectStatus: ").append(toIndentedString(protectStatus)).append("\n");
        sb.append("    policyNum: ").append(toIndentedString(policyNum)).append("\n");
        sb.append("    clusterStatus: ").append(toIndentedString(clusterStatus)).append("\n");
        sb.append("    clusterType: ").append(toIndentedString(clusterType)).append("\n");
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
