package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ClustersResponseInfo
 */
public class ClustersResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_type")

    private String clusterType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private String mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace_num")

    private Integer namespaceNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_num")

    private Integer policyNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protection_status")

    private Boolean protectionStatus;

    public ClustersResponseInfo withClusterId(String clusterId) {
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

    public ClustersResponseInfo withClusterName(String clusterName) {
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

    public ClustersResponseInfo withClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }

    /**
     * 集群类型:   - cce：cce集群   - k8s：k8s集群    - ali：阿里云集群   - tencent：腾讯云集群   - azure：微软云集群   - aws：亚马逊集群   - self_built_hw：华为云自建集群   - self_built_idc：IDC自建集群
     * @return clusterType
     */
    public String getClusterType() {
        return clusterType;
    }

    public void setClusterType(String clusterType) {
        this.clusterType = clusterType;
    }

    public ClustersResponseInfo withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 集群版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ClustersResponseInfo withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * 网络模型:   - overlay_l2：容器隧道网络   - vpc-router：VPC网络   - eni：云原生网络2.0   - native-network：K8S原生网络
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public ClustersResponseInfo withNamespaceNum(Integer namespaceNum) {
        this.namespaceNum = namespaceNum;
        return this;
    }

    /**
     * 命名空间数
     * minimum: 0
     * maximum: 100
     * @return namespaceNum
     */
    public Integer getNamespaceNum() {
        return namespaceNum;
    }

    public void setNamespaceNum(Integer namespaceNum) {
        this.namespaceNum = namespaceNum;
    }

    public ClustersResponseInfo withPolicyNum(Integer policyNum) {
        this.policyNum = policyNum;
        return this;
    }

    /**
     * 策略数量
     * minimum: 0
     * maximum: 16
     * @return policyNum
     */
    public Integer getPolicyNum() {
        return policyNum;
    }

    public void setPolicyNum(Integer policyNum) {
        this.policyNum = policyNum;
    }

    public ClustersResponseInfo withProtectionStatus(Boolean protectionStatus) {
        this.protectionStatus = protectionStatus;
        return this;
    }

    /**
     * 防护状态：true、false
     * @return protectionStatus
     */
    public Boolean getProtectionStatus() {
        return protectionStatus;
    }

    public void setProtectionStatus(Boolean protectionStatus) {
        this.protectionStatus = protectionStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClustersResponseInfo that = (ClustersResponseInfo) obj;
        return Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.clusterName, that.clusterName)
            && Objects.equals(this.clusterType, that.clusterType) && Objects.equals(this.version, that.version)
            && Objects.equals(this.mode, that.mode) && Objects.equals(this.namespaceNum, that.namespaceNum)
            && Objects.equals(this.policyNum, that.policyNum)
            && Objects.equals(this.protectionStatus, that.protectionStatus);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(clusterId, clusterName, clusterType, version, mode, namespaceNum, policyNum, protectionStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClustersResponseInfo {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    clusterType: ").append(toIndentedString(clusterType)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    namespaceNum: ").append(toIndentedString(namespaceNum)).append("\n");
        sb.append("    policyNum: ").append(toIndentedString(policyNum)).append("\n");
        sb.append("    protectionStatus: ").append(toIndentedString(protectionStatus)).append("\n");
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
