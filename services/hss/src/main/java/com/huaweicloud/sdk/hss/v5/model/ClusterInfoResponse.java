package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ClusterInfoResponse
 */
public class ClusterInfoResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_version")

    private Boolean latestVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_version")

    private String agentVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_type")

    private String clusterType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_num")

    private Integer nodeNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ds_info")

    private ClusterInfoResponseDsInfo dsInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_status")

    private String clusterStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "installed_status")

    private String installedStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_status")

    private String accessStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "combined_status")

    private String combinedStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_message")

    private String failedMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_log_status")

    private String clusterLogStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invoked_service")

    private String invokedService;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "registry_info")

    private ClusterInfoResponseRegistryInfo registryInfo;

    public ClusterInfoResponse withLatestVersion(Boolean latestVersion) {
        this.latestVersion = latestVersion;
        return this;
    }

    /**
     * **参数解释** 是否最新版本 **取值范围** - true：是。 - false：否。
     * @return latestVersion
     */
    public Boolean getLatestVersion() {
        return latestVersion;
    }

    public void setLatestVersion(Boolean latestVersion) {
        this.latestVersion = latestVersion;
    }

    public ClusterInfoResponse withAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }

    /**
     * **参数解释** 集群agent版本 **取值范围** 字符长度0-32位
     * @return agentVersion
     */
    public String getAgentVersion() {
        return agentVersion;
    }

    public void setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
    }

    public ClusterInfoResponse withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * **参数解释** 集群名称 **取值范围** 字符长度0-256位
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public ClusterInfoResponse withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * **参数解释** 集群id **取值范围** 字符长度1-256位
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public ClusterInfoResponse withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * **参数解释** 命名空间 **取值范围** 字符长度1-32位
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public ClusterInfoResponse withClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }

    /**
     * **参数解释** 集群类型 **取值范围** 字符长度1-32位
     * @return clusterType
     */
    public String getClusterType() {
        return clusterType;
    }

    public void setClusterType(String clusterType) {
        this.clusterType = clusterType;
    }

    public ClusterInfoResponse withNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
        return this;
    }

    /**
     * **参数解释** 节点总数 **取值范围** 取值0-65535
     * minimum: 0
     * maximum: 65535
     * @return nodeNum
     */
    public Integer getNodeNum() {
        return nodeNum;
    }

    public void setNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
    }

    public ClusterInfoResponse withDsInfo(ClusterInfoResponseDsInfo dsInfo) {
        this.dsInfo = dsInfo;
        return this;
    }

    public ClusterInfoResponse withDsInfo(Consumer<ClusterInfoResponseDsInfo> dsInfoSetter) {
        if (this.dsInfo == null) {
            this.dsInfo = new ClusterInfoResponseDsInfo();
            dsInfoSetter.accept(this.dsInfo);
        }

        return this;
    }

    /**
     * Get dsInfo
     * @return dsInfo
     */
    public ClusterInfoResponseDsInfo getDsInfo() {
        return dsInfo;
    }

    public void setDsInfo(ClusterInfoResponseDsInfo dsInfo) {
        this.dsInfo = dsInfo;
    }

    public ClusterInfoResponse withClusterStatus(String clusterStatus) {
        this.clusterStatus = clusterStatus;
        return this;
    }

    /**
     * **参数解释**: 集群状态 **约束限制**: 不涉及 **取值范围**: 包含如下： - Available：可用，表示集群处于正常状态。 - Unavailable：不可用，表示集群异常，需手动删除或联系管理员删除。 - ScalingUp：扩容中，表示集群正处于扩容过程中。 - ScalingDown：缩容中，表示集群正处于缩容过程中。 - Creating：创建中，表示集群正处于创建过程中。 - Deleting：删除中，表示集群正处于删除过程中。 - Upgrading：升级中，表示集群正处于升级过程中。 - Resizing：规格变更中，表示集群正处于变更规格中。 - RollingBack：回滚中，表示集群正处于回滚过程中。 - RollbackFailed：回滚异常，表示集群回滚异常，需联系管理员进行回滚重试。 - Empty：集群无任何资源。  **默认取值**: 不涉及 
     * @return clusterStatus
     */
    public String getClusterStatus() {
        return clusterStatus;
    }

    public void setClusterStatus(String clusterStatus) {
        this.clusterStatus = clusterStatus;
    }

    public ClusterInfoResponse withInstalledStatus(String installedStatus) {
        this.installedStatus = installedStatus;
        return this;
    }

    /**
     * **参数解释**: 集群ds安装状态 **约束限制**: 不涉及 **取值范围**: 包含如下： - installing：安装中。 - install_success：安装成功。 - install_failed：安装失败。 - partially_success：部分安装成功。 - upgrade_success：升级成功。 - upgrade_failed：升级失败。 - upgrading：升级中。 - none：未安装。  **默认取值**: 不涉及 
     * @return installedStatus
     */
    public String getInstalledStatus() {
        return installedStatus;
    }

    public void setInstalledStatus(String installedStatus) {
        this.installedStatus = installedStatus;
    }

    public ClusterInfoResponse withAccessStatus(String accessStatus) {
        this.accessStatus = accessStatus;
        return this;
    }

    /**
     * **参数解释**： 集群anp接入状态 **约束限制**： 不涉及 **取值范围**： - not_connect：未连接。 - connect_success：连接成功。 - connect_fail：连接失败。 - connect_disruption：连接中断。  **默认取值**： 不涉及 
     * @return accessStatus
     */
    public String getAccessStatus() {
        return accessStatus;
    }

    public void setAccessStatus(String accessStatus) {
        this.accessStatus = accessStatus;
    }

    public ClusterInfoResponse withCombinedStatus(String combinedStatus) {
        this.combinedStatus = combinedStatus;
        return this;
    }

    /**
     * **参数解释**： 集群anp与ds的组合状态 **约束限制**： 不涉及 **取值范围**： - accessing：接入中。 - access_error：接入异常。 - running：运行中。 - run_error：运行异常。 - upgrading：升级中。 - upgrade_error：升级失败。  **默认取值**： 不涉及 
     * @return combinedStatus
     */
    public String getCombinedStatus() {
        return combinedStatus;
    }

    public void setCombinedStatus(String combinedStatus) {
        this.combinedStatus = combinedStatus;
    }

    public ClusterInfoResponse withFailedMessage(String failedMessage) {
        this.failedMessage = failedMessage;
        return this;
    }

    /**
     * **参数解释** 集群插件接入失败的原因 **取值范围** 字符长度1-256位
     * @return failedMessage
     */
    public String getFailedMessage() {
        return failedMessage;
    }

    public void setFailedMessage(String failedMessage) {
        this.failedMessage = failedMessage;
    }

    public ClusterInfoResponse withClusterLogStatus(String clusterLogStatus) {
        this.clusterLogStatus = clusterLogStatus;
        return this;
    }

    /**
     * **参数解释**： 集群日志的接入状态 **约束限制**： 不涉及 **取值范围**： - success：接入成功。 - partial_success：部分接入。  **默认取值**： 不涉及 
     * @return clusterLogStatus
     */
    public String getClusterLogStatus() {
        return clusterLogStatus;
    }

    public void setClusterLogStatus(String clusterLogStatus) {
        this.clusterLogStatus = clusterLogStatus;
    }

    public ClusterInfoResponse withInvokedService(String invokedService) {
        this.invokedService = invokedService;
        return this;
    }

    /**
     * **参数解释**： 调用服务，标识cce免费体检报告 **约束限制**： 不涉及 **取值范围**： - hss：hss服务。 - cce：cce服务。  **默认取值**： 不涉及 
     * @return invokedService
     */
    public String getInvokedService() {
        return invokedService;
    }

    public void setInvokedService(String invokedService) {
        this.invokedService = invokedService;
    }

    public ClusterInfoResponse withRegistryInfo(ClusterInfoResponseRegistryInfo registryInfo) {
        this.registryInfo = registryInfo;
        return this;
    }

    public ClusterInfoResponse withRegistryInfo(Consumer<ClusterInfoResponseRegistryInfo> registryInfoSetter) {
        if (this.registryInfo == null) {
            this.registryInfo = new ClusterInfoResponseRegistryInfo();
            registryInfoSetter.accept(this.registryInfo);
        }

        return this;
    }

    /**
     * Get registryInfo
     * @return registryInfo
     */
    public ClusterInfoResponseRegistryInfo getRegistryInfo() {
        return registryInfo;
    }

    public void setRegistryInfo(ClusterInfoResponseRegistryInfo registryInfo) {
        this.registryInfo = registryInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClusterInfoResponse that = (ClusterInfoResponse) obj;
        return Objects.equals(this.latestVersion, that.latestVersion)
            && Objects.equals(this.agentVersion, that.agentVersion)
            && Objects.equals(this.clusterName, that.clusterName) && Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.namespace, that.namespace) && Objects.equals(this.clusterType, that.clusterType)
            && Objects.equals(this.nodeNum, that.nodeNum) && Objects.equals(this.dsInfo, that.dsInfo)
            && Objects.equals(this.clusterStatus, that.clusterStatus)
            && Objects.equals(this.installedStatus, that.installedStatus)
            && Objects.equals(this.accessStatus, that.accessStatus)
            && Objects.equals(this.combinedStatus, that.combinedStatus)
            && Objects.equals(this.failedMessage, that.failedMessage)
            && Objects.equals(this.clusterLogStatus, that.clusterLogStatus)
            && Objects.equals(this.invokedService, that.invokedService)
            && Objects.equals(this.registryInfo, that.registryInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(latestVersion,
            agentVersion,
            clusterName,
            clusterId,
            namespace,
            clusterType,
            nodeNum,
            dsInfo,
            clusterStatus,
            installedStatus,
            accessStatus,
            combinedStatus,
            failedMessage,
            clusterLogStatus,
            invokedService,
            registryInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterInfoResponse {\n");
        sb.append("    latestVersion: ").append(toIndentedString(latestVersion)).append("\n");
        sb.append("    agentVersion: ").append(toIndentedString(agentVersion)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    clusterType: ").append(toIndentedString(clusterType)).append("\n");
        sb.append("    nodeNum: ").append(toIndentedString(nodeNum)).append("\n");
        sb.append("    dsInfo: ").append(toIndentedString(dsInfo)).append("\n");
        sb.append("    clusterStatus: ").append(toIndentedString(clusterStatus)).append("\n");
        sb.append("    installedStatus: ").append(toIndentedString(installedStatus)).append("\n");
        sb.append("    accessStatus: ").append(toIndentedString(accessStatus)).append("\n");
        sb.append("    combinedStatus: ").append(toIndentedString(combinedStatus)).append("\n");
        sb.append("    failedMessage: ").append(toIndentedString(failedMessage)).append("\n");
        sb.append("    clusterLogStatus: ").append(toIndentedString(clusterLogStatus)).append("\n");
        sb.append("    invokedService: ").append(toIndentedString(invokedService)).append("\n");
        sb.append("    registryInfo: ").append(toIndentedString(registryInfo)).append("\n");
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
