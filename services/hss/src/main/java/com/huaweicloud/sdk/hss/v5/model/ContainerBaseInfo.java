package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 容器基本信息
 */
public class ContainerBaseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_id")

    private String containerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_name")

    private String containerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_name")

    private String imageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_limit")

    private String cpuLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory_limit")

    private String memoryLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restart_count")

    private Integer restartCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pod_name")

    private String podName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_type")

    private String clusterType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risky")

    private Boolean risky;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "low_risk")

    private Integer lowRisk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "medium_risk")

    private Integer mediumRisk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "high_risk")

    private Integer highRisk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fatal_risk")

    private Integer fatalRisk;

    public ContainerBaseInfo withContainerId(String containerId) {
        this.containerId = containerId;
        return this;
    }

    /**
     * 容器ID
     * @return containerId
     */
    public String getContainerId() {
        return containerId;
    }

    public void setContainerId(String containerId) {
        this.containerId = containerId;
    }

    public ContainerBaseInfo withContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * 容器名称
     * @return containerName
     */
    public String getContainerName() {
        return containerName;
    }

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    public ContainerBaseInfo withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    /**
     * 镜像名称
     * @return imageName
     */
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public ContainerBaseInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 容器状态，包含以下几种： -Running 运行中 -Terminated 终止 -Waiting 等待
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ContainerBaseInfo withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * minimum: 0
     * maximum: 4071095999000
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ContainerBaseInfo withCpuLimit(String cpuLimit) {
        this.cpuLimit = cpuLimit;
        return this;
    }

    /**
     * cpu限制
     * @return cpuLimit
     */
    public String getCpuLimit() {
        return cpuLimit;
    }

    public void setCpuLimit(String cpuLimit) {
        this.cpuLimit = cpuLimit;
    }

    public ContainerBaseInfo withMemoryLimit(String memoryLimit) {
        this.memoryLimit = memoryLimit;
        return this;
    }

    /**
     * 内存限制
     * @return memoryLimit
     */
    public String getMemoryLimit() {
        return memoryLimit;
    }

    public void setMemoryLimit(String memoryLimit) {
        this.memoryLimit = memoryLimit;
    }

    public ContainerBaseInfo withRestartCount(Integer restartCount) {
        this.restartCount = restartCount;
        return this;
    }

    /**
     * 重启次数
     * minimum: 0
     * maximum: 20
     * @return restartCount
     */
    public Integer getRestartCount() {
        return restartCount;
    }

    public void setRestartCount(Integer restartCount) {
        this.restartCount = restartCount;
    }

    public ContainerBaseInfo withPodName(String podName) {
        this.podName = podName;
        return this;
    }

    /**
     * 所属pod名称
     * @return podName
     */
    public String getPodName() {
        return podName;
    }

    public void setPodName(String podName) {
        this.podName = podName;
    }

    public ContainerBaseInfo withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * 所属集群
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public ContainerBaseInfo withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 集群id
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public ContainerBaseInfo withClusterType(String clusterType) {
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

    public ContainerBaseInfo withRisky(Boolean risky) {
        this.risky = risky;
        return this;
    }

    /**
     * 是否有风险
     * @return risky
     */
    public Boolean getRisky() {
        return risky;
    }

    public void setRisky(Boolean risky) {
        this.risky = risky;
    }

    public ContainerBaseInfo withLowRisk(Integer lowRisk) {
        this.lowRisk = lowRisk;
        return this;
    }

    /**
     * 低危风险数量
     * minimum: 0
     * maximum: 2147483647
     * @return lowRisk
     */
    public Integer getLowRisk() {
        return lowRisk;
    }

    public void setLowRisk(Integer lowRisk) {
        this.lowRisk = lowRisk;
    }

    public ContainerBaseInfo withMediumRisk(Integer mediumRisk) {
        this.mediumRisk = mediumRisk;
        return this;
    }

    /**
     * 中危风险数量
     * minimum: 0
     * maximum: 2147483647
     * @return mediumRisk
     */
    public Integer getMediumRisk() {
        return mediumRisk;
    }

    public void setMediumRisk(Integer mediumRisk) {
        this.mediumRisk = mediumRisk;
    }

    public ContainerBaseInfo withHighRisk(Integer highRisk) {
        this.highRisk = highRisk;
        return this;
    }

    /**
     * 高危风险数量
     * minimum: 0
     * maximum: 2147483647
     * @return highRisk
     */
    public Integer getHighRisk() {
        return highRisk;
    }

    public void setHighRisk(Integer highRisk) {
        this.highRisk = highRisk;
    }

    public ContainerBaseInfo withFatalRisk(Integer fatalRisk) {
        this.fatalRisk = fatalRisk;
        return this;
    }

    /**
     * 致命风险数量
     * minimum: 0
     * maximum: 2147483647
     * @return fatalRisk
     */
    public Integer getFatalRisk() {
        return fatalRisk;
    }

    public void setFatalRisk(Integer fatalRisk) {
        this.fatalRisk = fatalRisk;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ContainerBaseInfo that = (ContainerBaseInfo) obj;
        return Objects.equals(this.containerId, that.containerId)
            && Objects.equals(this.containerName, that.containerName) && Objects.equals(this.imageName, that.imageName)
            && Objects.equals(this.status, that.status) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.cpuLimit, that.cpuLimit) && Objects.equals(this.memoryLimit, that.memoryLimit)
            && Objects.equals(this.restartCount, that.restartCount) && Objects.equals(this.podName, that.podName)
            && Objects.equals(this.clusterName, that.clusterName) && Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.clusterType, that.clusterType) && Objects.equals(this.risky, that.risky)
            && Objects.equals(this.lowRisk, that.lowRisk) && Objects.equals(this.mediumRisk, that.mediumRisk)
            && Objects.equals(this.highRisk, that.highRisk) && Objects.equals(this.fatalRisk, that.fatalRisk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(containerId,
            containerName,
            imageName,
            status,
            createTime,
            cpuLimit,
            memoryLimit,
            restartCount,
            podName,
            clusterName,
            clusterId,
            clusterType,
            risky,
            lowRisk,
            mediumRisk,
            highRisk,
            fatalRisk);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContainerBaseInfo {\n");
        sb.append("    containerId: ").append(toIndentedString(containerId)).append("\n");
        sb.append("    containerName: ").append(toIndentedString(containerName)).append("\n");
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    cpuLimit: ").append(toIndentedString(cpuLimit)).append("\n");
        sb.append("    memoryLimit: ").append(toIndentedString(memoryLimit)).append("\n");
        sb.append("    restartCount: ").append(toIndentedString(restartCount)).append("\n");
        sb.append("    podName: ").append(toIndentedString(podName)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    clusterType: ").append(toIndentedString(clusterType)).append("\n");
        sb.append("    risky: ").append(toIndentedString(risky)).append("\n");
        sb.append("    lowRisk: ").append(toIndentedString(lowRisk)).append("\n");
        sb.append("    mediumRisk: ").append(toIndentedString(mediumRisk)).append("\n");
        sb.append("    highRisk: ").append(toIndentedString(highRisk)).append("\n");
        sb.append("    fatalRisk: ").append(toIndentedString(fatalRisk)).append("\n");
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
