package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 集群列表对象
 */
public class KubernetesClusterInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

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
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_nodes_number")

    private Integer totalNodesNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active_nodes_number")

    private Integer activeNodesNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creation_timestamp")

    private Long creationTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_installed_num")

    private Integer agentInstalledNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_install_failed_num")

    private Integer agentInstallFailedNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_not_install_num")

    private Integer agentNotInstallNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_ds_install_status")

    private String agentDsInstallStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_ds_failed_reason")

    private String agentDsFailedReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_operate_timestamp")

    private Long lastOperateTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_scan_time")

    private Long lastScanTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sys_vul_num")

    private Integer sysVulNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_vul_num")

    private Integer appVulNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "emg_vul_num")

    private Integer emgVulNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_assess_num")

    private Integer riskAssessNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sec_comp_num")

    private Integer secCompNum;

    public KubernetesClusterInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public KubernetesClusterInfo withClusterName(String clusterName) {
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

    public KubernetesClusterInfo withClusterId(String clusterId) {
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

    public KubernetesClusterInfo withClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }

    /**
     * **参数解释**: 集群类型 **约束限制**: 不涉及 **取值范围**: - k8s：原生集群 - cce：CCE集群 - ali：阿里云集群 - tencent：腾讯云集群 - azure：微软云集群 - aws：亚马逊集群 - self_built_hw：华为云自建集群 - self_built_idc：IDC自建集群  **默认取值**: 不涉及 
     * @return clusterType
     */
    public String getClusterType() {
        return clusterType;
    }

    public void setClusterType(String clusterType) {
        this.clusterType = clusterType;
    }

    public KubernetesClusterInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**: 集群状态(11种) **约束限制**: 不涉及 **取值范围**:   - Available：可用，表示集群处于正常状态。   - Unavailable：不可用，表示集群异常，需手动删除或联系管理员删除。   - ScalingUp：扩容中，表示集群正处于扩容过程中。   - ScalingDown：缩容中，表示集群正处于缩容过程中。   - Creating：创建中，表示集群正处于创建过程中。   - Deleting：删除中，表示集群正处于删除过程中。   - Upgrading：升级中，表示集群正处于升级过程中。   - Resizing：规格变更中，表示集群正处于变更规格中。   - RollingBack：回滚中，表示集群正处于回滚过程中。   - RollbackFailed：回滚异常，表示集群回滚异常，需联系管理员进行回滚重试。   - Empty：集群无任何资源  **默认取值**: 不涉及 
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public KubernetesClusterInfo withVersion(String version) {
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

    public KubernetesClusterInfo withTotalNodesNumber(Integer totalNodesNumber) {
        this.totalNodesNumber = totalNodesNumber;
        return this;
    }

    /**
     * 节点总数
     * minimum: 0
     * maximum: 2147483647
     * @return totalNodesNumber
     */
    public Integer getTotalNodesNumber() {
        return totalNodesNumber;
    }

    public void setTotalNodesNumber(Integer totalNodesNumber) {
        this.totalNodesNumber = totalNodesNumber;
    }

    public KubernetesClusterInfo withActiveNodesNumber(Integer activeNodesNumber) {
        this.activeNodesNumber = activeNodesNumber;
        return this;
    }

    /**
     * 正常节点数
     * minimum: 0
     * maximum: 2147483647
     * @return activeNodesNumber
     */
    public Integer getActiveNodesNumber() {
        return activeNodesNumber;
    }

    public void setActiveNodesNumber(Integer activeNodesNumber) {
        this.activeNodesNumber = activeNodesNumber;
    }

    public KubernetesClusterInfo withCreationTimestamp(Long creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
        return this;
    }

    /**
     * 创建时间戳
     * minimum: 0
     * maximum: 9223372036854775807
     * @return creationTimestamp
     */
    public Long getCreationTimestamp() {
        return creationTimestamp;
    }

    public void setCreationTimestamp(Long creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    public KubernetesClusterInfo withAgentInstalledNum(Integer agentInstalledNum) {
        this.agentInstalledNum = agentInstalledNum;
        return this;
    }

    /**
     * 集群下已安装agent节点数
     * minimum: 0
     * maximum: 2147483647
     * @return agentInstalledNum
     */
    public Integer getAgentInstalledNum() {
        return agentInstalledNum;
    }

    public void setAgentInstalledNum(Integer agentInstalledNum) {
        this.agentInstalledNum = agentInstalledNum;
    }

    public KubernetesClusterInfo withAgentInstallFailedNum(Integer agentInstallFailedNum) {
        this.agentInstallFailedNum = agentInstallFailedNum;
        return this;
    }

    /**
     * 集群下安装失败节点数
     * minimum: 0
     * maximum: 2147483647
     * @return agentInstallFailedNum
     */
    public Integer getAgentInstallFailedNum() {
        return agentInstallFailedNum;
    }

    public void setAgentInstallFailedNum(Integer agentInstallFailedNum) {
        this.agentInstallFailedNum = agentInstallFailedNum;
    }

    public KubernetesClusterInfo withAgentNotInstallNum(Integer agentNotInstallNum) {
        this.agentNotInstallNum = agentNotInstallNum;
        return this;
    }

    /**
     * 集群下未安装agent节点数
     * minimum: 0
     * maximum: 2147483647
     * @return agentNotInstallNum
     */
    public Integer getAgentNotInstallNum() {
        return agentNotInstallNum;
    }

    public void setAgentNotInstallNum(Integer agentNotInstallNum) {
        this.agentNotInstallNum = agentNotInstallNum;
    }

    public KubernetesClusterInfo withAgentDsInstallStatus(String agentDsInstallStatus) {
        this.agentDsInstallStatus = agentDsInstallStatus;
        return this;
    }

    /**
     * 集群下agent-ds安装状态，关联agent相关信息时则需同时考虑last_operate_time时间，包含如下2种。   - NotInstall：未状态。   - Installed：已安装。
     * @return agentDsInstallStatus
     */
    public String getAgentDsInstallStatus() {
        return agentDsInstallStatus;
    }

    public void setAgentDsInstallStatus(String agentDsInstallStatus) {
        this.agentDsInstallStatus = agentDsInstallStatus;
    }

    public KubernetesClusterInfo withAgentDsFailedReason(String agentDsFailedReason) {
        this.agentDsFailedReason = agentDsFailedReason;
        return this;
    }

    /**
     * 操作失败原因
     * @return agentDsFailedReason
     */
    public String getAgentDsFailedReason() {
        return agentDsFailedReason;
    }

    public void setAgentDsFailedReason(String agentDsFailedReason) {
        this.agentDsFailedReason = agentDsFailedReason;
    }

    public KubernetesClusterInfo withLastOperateTimestamp(Long lastOperateTimestamp) {
        this.lastOperateTimestamp = lastOperateTimestamp;
        return this;
    }

    /**
     * 最近操作时间戳，daemonset脚本安装操作时间，间隔10分钟以内时，agent仍处于安装中
     * minimum: 0
     * maximum: 9223372036854775807
     * @return lastOperateTimestamp
     */
    public Long getLastOperateTimestamp() {
        return lastOperateTimestamp;
    }

    public void setLastOperateTimestamp(Long lastOperateTimestamp) {
        this.lastOperateTimestamp = lastOperateTimestamp;
    }

    public KubernetesClusterInfo withLastScanTime(Long lastScanTime) {
        this.lastScanTime = lastScanTime;
        return this;
    }

    /**
     * 集群最近一次扫描时间戳
     * minimum: 0
     * maximum: 4071095999000
     * @return lastScanTime
     */
    public Long getLastScanTime() {
        return lastScanTime;
    }

    public void setLastScanTime(Long lastScanTime) {
        this.lastScanTime = lastScanTime;
    }

    public KubernetesClusterInfo withSysVulNum(Integer sysVulNum) {
        this.sysVulNum = sysVulNum;
        return this;
    }

    /**
     * 集群下系统漏洞个数
     * minimum: 0
     * maximum: 1000000
     * @return sysVulNum
     */
    public Integer getSysVulNum() {
        return sysVulNum;
    }

    public void setSysVulNum(Integer sysVulNum) {
        this.sysVulNum = sysVulNum;
    }

    public KubernetesClusterInfo withAppVulNum(Integer appVulNum) {
        this.appVulNum = appVulNum;
        return this;
    }

    /**
     * 集群下应用漏洞个数
     * minimum: 0
     * maximum: 1000000
     * @return appVulNum
     */
    public Integer getAppVulNum() {
        return appVulNum;
    }

    public void setAppVulNum(Integer appVulNum) {
        this.appVulNum = appVulNum;
    }

    public KubernetesClusterInfo withEmgVulNum(Integer emgVulNum) {
        this.emgVulNum = emgVulNum;
        return this;
    }

    /**
     * 集群下应急漏洞个数
     * minimum: 0
     * maximum: 1000000
     * @return emgVulNum
     */
    public Integer getEmgVulNum() {
        return emgVulNum;
    }

    public void setEmgVulNum(Integer emgVulNum) {
        this.emgVulNum = emgVulNum;
    }

    public KubernetesClusterInfo withRiskAssessNum(Integer riskAssessNum) {
        this.riskAssessNum = riskAssessNum;
        return this;
    }

    /**
     * 集群下风险评估问题个数
     * minimum: 0
     * maximum: 1000000
     * @return riskAssessNum
     */
    public Integer getRiskAssessNum() {
        return riskAssessNum;
    }

    public void setRiskAssessNum(Integer riskAssessNum) {
        this.riskAssessNum = riskAssessNum;
    }

    public KubernetesClusterInfo withSecCompNum(Integer secCompNum) {
        this.secCompNum = secCompNum;
        return this;
    }

    /**
     * 集群下安全合规问题个数
     * minimum: 0
     * maximum: 1000000
     * @return secCompNum
     */
    public Integer getSecCompNum() {
        return secCompNum;
    }

    public void setSecCompNum(Integer secCompNum) {
        this.secCompNum = secCompNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        KubernetesClusterInfo that = (KubernetesClusterInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.clusterName, that.clusterName)
            && Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.clusterType, that.clusterType)
            && Objects.equals(this.status, that.status) && Objects.equals(this.version, that.version)
            && Objects.equals(this.totalNodesNumber, that.totalNodesNumber)
            && Objects.equals(this.activeNodesNumber, that.activeNodesNumber)
            && Objects.equals(this.creationTimestamp, that.creationTimestamp)
            && Objects.equals(this.agentInstalledNum, that.agentInstalledNum)
            && Objects.equals(this.agentInstallFailedNum, that.agentInstallFailedNum)
            && Objects.equals(this.agentNotInstallNum, that.agentNotInstallNum)
            && Objects.equals(this.agentDsInstallStatus, that.agentDsInstallStatus)
            && Objects.equals(this.agentDsFailedReason, that.agentDsFailedReason)
            && Objects.equals(this.lastOperateTimestamp, that.lastOperateTimestamp)
            && Objects.equals(this.lastScanTime, that.lastScanTime) && Objects.equals(this.sysVulNum, that.sysVulNum)
            && Objects.equals(this.appVulNum, that.appVulNum) && Objects.equals(this.emgVulNum, that.emgVulNum)
            && Objects.equals(this.riskAssessNum, that.riskAssessNum)
            && Objects.equals(this.secCompNum, that.secCompNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            clusterName,
            clusterId,
            clusterType,
            status,
            version,
            totalNodesNumber,
            activeNodesNumber,
            creationTimestamp,
            agentInstalledNum,
            agentInstallFailedNum,
            agentNotInstallNum,
            agentDsInstallStatus,
            agentDsFailedReason,
            lastOperateTimestamp,
            lastScanTime,
            sysVulNum,
            appVulNum,
            emgVulNum,
            riskAssessNum,
            secCompNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KubernetesClusterInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    clusterType: ").append(toIndentedString(clusterType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    totalNodesNumber: ").append(toIndentedString(totalNodesNumber)).append("\n");
        sb.append("    activeNodesNumber: ").append(toIndentedString(activeNodesNumber)).append("\n");
        sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
        sb.append("    agentInstalledNum: ").append(toIndentedString(agentInstalledNum)).append("\n");
        sb.append("    agentInstallFailedNum: ").append(toIndentedString(agentInstallFailedNum)).append("\n");
        sb.append("    agentNotInstallNum: ").append(toIndentedString(agentNotInstallNum)).append("\n");
        sb.append("    agentDsInstallStatus: ").append(toIndentedString(agentDsInstallStatus)).append("\n");
        sb.append("    agentDsFailedReason: ").append(toIndentedString(agentDsFailedReason)).append("\n");
        sb.append("    lastOperateTimestamp: ").append(toIndentedString(lastOperateTimestamp)).append("\n");
        sb.append("    lastScanTime: ").append(toIndentedString(lastScanTime)).append("\n");
        sb.append("    sysVulNum: ").append(toIndentedString(sysVulNum)).append("\n");
        sb.append("    appVulNum: ").append(toIndentedString(appVulNum)).append("\n");
        sb.append("    emgVulNum: ").append(toIndentedString(emgVulNum)).append("\n");
        sb.append("    riskAssessNum: ").append(toIndentedString(riskAssessNum)).append("\n");
        sb.append("    secCompNum: ").append(toIndentedString(secCompNum)).append("\n");
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
