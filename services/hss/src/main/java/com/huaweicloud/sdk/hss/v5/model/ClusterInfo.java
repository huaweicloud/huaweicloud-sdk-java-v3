package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 集群安装agent信息
 */
public class ClusterInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_name")

    private String enterpriseProjectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_version")

    private String clusterVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_status")

    private String clusterStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "installed_pod_num")

    private Integer installedPodNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pod_num")

    private Integer podNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_pod_num")

    private Integer protectPodNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_status")

    private String protectStatus;

    public ClusterInfo withEnterpriseProjectName(String enterpriseProjectName) {
        this.enterpriseProjectName = enterpriseProjectName;
        return this;
    }

    /**
     * **参数解释**: 所属企业项目名称 **取值范围**: 字符长度0-65535位 
     * @return enterpriseProjectName
     */
    public String getEnterpriseProjectName() {
        return enterpriseProjectName;
    }

    public void setEnterpriseProjectName(String enterpriseProjectName) {
        this.enterpriseProjectName = enterpriseProjectName;
    }

    public ClusterInfo withClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
        return this;
    }

    /**
     * **参数解释**: 集群版本 **取值范围**: 字符长度0-256位 
     * @return clusterVersion
     */
    public String getClusterVersion() {
        return clusterVersion;
    }

    public void setClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
    }

    public ClusterInfo withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * **参数解释**: 集群id **取值范围**: 字符长度0-64位 
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public ClusterInfo withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * **参数解释**: 所属集群 **取值范围**: 字符长度0-256位 
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public ClusterInfo withClusterStatus(String clusterStatus) {
        this.clusterStatus = clusterStatus;
        return this;
    }

    /**
     * **参数解释**： 集群状态，从CCE同步状态 **取值范围**： - workload：工作负载。 - cluster：集群。 
     * @return clusterStatus
     */
    public String getClusterStatus() {
        return clusterStatus;
    }

    public void setClusterStatus(String clusterStatus) {
        this.clusterStatus = clusterStatus;
    }

    public ClusterInfo withInstalledPodNum(Integer installedPodNum) {
        this.installedPodNum = installedPodNum;
        return this;
    }

    /**
     * **参数解释**: 已安装实例个数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return installedPodNum
     */
    public Integer getInstalledPodNum() {
        return installedPodNum;
    }

    public void setInstalledPodNum(Integer installedPodNum) {
        this.installedPodNum = installedPodNum;
    }

    public ClusterInfo withPodNum(Integer podNum) {
        this.podNum = podNum;
        return this;
    }

    /**
     * **参数解释**: 全部实例个数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return podNum
     */
    public Integer getPodNum() {
        return podNum;
    }

    public void setPodNum(Integer podNum) {
        this.podNum = podNum;
    }

    public ClusterInfo withProtectPodNum(Integer protectPodNum) {
        this.protectPodNum = protectPodNum;
        return this;
    }

    /**
     * **参数解释**: 已防护实例数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return protectPodNum
     */
    public Integer getProtectPodNum() {
        return protectPodNum;
    }

    public void setProtectPodNum(Integer protectPodNum) {
        this.protectPodNum = protectPodNum;
    }

    public ClusterInfo withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释**: 创建时间 **取值范围**: 最小值0，最大值9223372036854775807 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ClusterInfo withProtectStatus(String protectStatus) {
        this.protectStatus = protectStatus;
        return this;
    }

    /**
     * **参数解释**: 防护状态 **取值范围**: 字符长度0-65535位 
     * @return protectStatus
     */
    public String getProtectStatus() {
        return protectStatus;
    }

    public void setProtectStatus(String protectStatus) {
        this.protectStatus = protectStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClusterInfo that = (ClusterInfo) obj;
        return Objects.equals(this.enterpriseProjectName, that.enterpriseProjectName)
            && Objects.equals(this.clusterVersion, that.clusterVersion)
            && Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.clusterName, that.clusterName)
            && Objects.equals(this.clusterStatus, that.clusterStatus)
            && Objects.equals(this.installedPodNum, that.installedPodNum) && Objects.equals(this.podNum, that.podNum)
            && Objects.equals(this.protectPodNum, that.protectPodNum)
            && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.protectStatus, that.protectStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectName,
            clusterVersion,
            clusterId,
            clusterName,
            clusterStatus,
            installedPodNum,
            podNum,
            protectPodNum,
            createTime,
            protectStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterInfo {\n");
        sb.append("    enterpriseProjectName: ").append(toIndentedString(enterpriseProjectName)).append("\n");
        sb.append("    clusterVersion: ").append(toIndentedString(clusterVersion)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    clusterStatus: ").append(toIndentedString(clusterStatus)).append("\n");
        sb.append("    installedPodNum: ").append(toIndentedString(installedPodNum)).append("\n");
        sb.append("    podNum: ").append(toIndentedString(podNum)).append("\n");
        sb.append("    protectPodNum: ").append(toIndentedString(protectPodNum)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    protectStatus: ").append(toIndentedString(protectStatus)).append("\n");
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
