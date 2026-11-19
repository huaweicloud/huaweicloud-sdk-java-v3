package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 实例信息
 */
public class ServerlessInstanceInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_name")

    private String enterpriseProjectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_ip")

    private String instanceIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_status")

    private String instanceStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace_name")

    private String namespaceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_status")

    private String agentStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_id")

    private String agentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscribe_time")

    private Long subscribeTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_request")

    private String cpuRequest;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_limit")

    private String cpuLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_status")

    private String protectStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_group_name")

    private String policyGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private List<LabelInfo> labels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_name")

    private String workloadName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_info")

    private List<ProtectionContainerInfo> containerInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support_protect")

    private Boolean isSupportProtect;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_num")

    private Long vulNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_vul_num")

    private Long appVulNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "linux_vul_num")

    private Long linuxVulNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_num")

    private Long securityNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_num")

    private Long eventNum;

    public ServerlessInstanceInfo withEnterpriseProjectName(String enterpriseProjectName) {
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

    public ServerlessInstanceInfo withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * **参数解释**: 实例名称 **取值范围**: 字符长度0-65535位 
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public ServerlessInstanceInfo withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数解释**: 实例ID **取值范围**: 字符长度0-65535位 
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ServerlessInstanceInfo withInstanceIp(String instanceIp) {
        this.instanceIp = instanceIp;
        return this;
    }

    /**
     * **参数解释**: 实例IP **取值范围**: 字符长度0-65535位 
     * @return instanceIp
     */
    public String getInstanceIp() {
        return instanceIp;
    }

    public void setInstanceIp(String instanceIp) {
        this.instanceIp = instanceIp;
    }

    public ServerlessInstanceInfo withInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }

    /**
     * **参数解释**: 实例状态 **取值范围**: 字符长度0-65535位 
     * @return instanceStatus
     */
    public String getInstanceStatus() {
        return instanceStatus;
    }

    public void setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
    }

    public ServerlessInstanceInfo withNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }

    /**
     * **参数解释**: 命名空间名称 **取值范围**: 字符长度0-256位 
     * @return namespaceName
     */
    public String getNamespaceName() {
        return namespaceName;
    }

    public void setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
    }

    public ServerlessInstanceInfo withAgentStatus(String agentStatus) {
        this.agentStatus = agentStatus;
        return this;
    }

    /**
     * **参数解释**: agent状态 **取值范围**: 字符长度0-65535位 
     * @return agentStatus
     */
    public String getAgentStatus() {
        return agentStatus;
    }

    public void setAgentStatus(String agentStatus) {
        this.agentStatus = agentStatus;
    }

    public ServerlessInstanceInfo withAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    /**
     * **参数解释**: agentID标识 **取值范围**: 字符长度0-65535位 
     * @return agentId
     */
    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public ServerlessInstanceInfo withCreateTime(Long createTime) {
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

    public ServerlessInstanceInfo withSubscribeTime(Long subscribeTime) {
        this.subscribeTime = subscribeTime;
        return this;
    }

    /**
     * **参数解释**: 开通防护时间 **取值范围**: 最小值0，最大值9223372036854775807 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return subscribeTime
     */
    public Long getSubscribeTime() {
        return subscribeTime;
    }

    public void setSubscribeTime(Long subscribeTime) {
        this.subscribeTime = subscribeTime;
    }

    public ServerlessInstanceInfo withCpuRequest(String cpuRequest) {
        this.cpuRequest = cpuRequest;
        return this;
    }

    /**
     * **参数解释**: cpu申请值 **取值范围**: 字符长度0-65535位 
     * @return cpuRequest
     */
    public String getCpuRequest() {
        return cpuRequest;
    }

    public void setCpuRequest(String cpuRequest) {
        this.cpuRequest = cpuRequest;
    }

    public ServerlessInstanceInfo withCpuLimit(String cpuLimit) {
        this.cpuLimit = cpuLimit;
        return this;
    }

    /**
     * **参数解释**: cpu限制值 **取值范围**: 字符长度0-65535位 
     * @return cpuLimit
     */
    public String getCpuLimit() {
        return cpuLimit;
    }

    public void setCpuLimit(String cpuLimit) {
        this.cpuLimit = cpuLimit;
    }

    public ServerlessInstanceInfo withProtectStatus(String protectStatus) {
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

    public ServerlessInstanceInfo withPolicyGroupName(String policyGroupName) {
        this.policyGroupName = policyGroupName;
        return this;
    }

    /**
     * **参数解释**: 策略组名称 **取值范围**: 字符长度0-65535位 
     * @return policyGroupName
     */
    public String getPolicyGroupName() {
        return policyGroupName;
    }

    public void setPolicyGroupName(String policyGroupName) {
        this.policyGroupName = policyGroupName;
    }

    public ServerlessInstanceInfo withLabels(List<LabelInfo> labels) {
        this.labels = labels;
        return this;
    }

    public ServerlessInstanceInfo addLabelsItem(LabelInfo labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    public ServerlessInstanceInfo withLabels(Consumer<List<LabelInfo>> labelsSetter) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        labelsSetter.accept(this.labels);
        return this;
    }

    /**
     * **参数解释**: 标签 **取值范围**: 最小值0，最大值65535 
     * @return labels
     */
    public List<LabelInfo> getLabels() {
        return labels;
    }

    public void setLabels(List<LabelInfo> labels) {
        this.labels = labels;
    }

    public ServerlessInstanceInfo withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * **参数解释**: 所属集群名称 **取值范围**: 字符长度0-65535位 
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public ServerlessInstanceInfo withWorkloadName(String workloadName) {
        this.workloadName = workloadName;
        return this;
    }

    /**
     * **参数解释**: 所属工作负载名称 **取值范围**: 字符长度0-65535位 
     * @return workloadName
     */
    public String getWorkloadName() {
        return workloadName;
    }

    public void setWorkloadName(String workloadName) {
        this.workloadName = workloadName;
    }

    public ServerlessInstanceInfo withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * **参数解释**: 所属集群ID **取值范围**: 字符长度0-65535位 
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public ServerlessInstanceInfo withContainerInfo(List<ProtectionContainerInfo> containerInfo) {
        this.containerInfo = containerInfo;
        return this;
    }

    public ServerlessInstanceInfo addContainerInfoItem(ProtectionContainerInfo containerInfoItem) {
        if (this.containerInfo == null) {
            this.containerInfo = new ArrayList<>();
        }
        this.containerInfo.add(containerInfoItem);
        return this;
    }

    public ServerlessInstanceInfo withContainerInfo(Consumer<List<ProtectionContainerInfo>> containerInfoSetter) {
        if (this.containerInfo == null) {
            this.containerInfo = new ArrayList<>();
        }
        containerInfoSetter.accept(this.containerInfo);
        return this;
    }

    /**
     * **参数解释**: 容器列表 **取值范围**: 最小值0，最大值65535 
     * @return containerInfo
     */
    public List<ProtectionContainerInfo> getContainerInfo() {
        return containerInfo;
    }

    public void setContainerInfo(List<ProtectionContainerInfo> containerInfo) {
        this.containerInfo = containerInfo;
    }

    public ServerlessInstanceInfo withIsSupportProtect(Boolean isSupportProtect) {
        this.isSupportProtect = isSupportProtect;
        return this;
    }

    /**
     * **参数解释**: 实例是否支持开关防护 **取值范围**: - true：是。 - false：否。 
     * @return isSupportProtect
     */
    public Boolean getIsSupportProtect() {
        return isSupportProtect;
    }

    public void setIsSupportProtect(Boolean isSupportProtect) {
        this.isSupportProtect = isSupportProtect;
    }

    public ServerlessInstanceInfo withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * **参数解释**: 实例不支持开关防护的原因 **取值范围**: 字符长度0-65535位 
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ServerlessInstanceInfo withVulNum(Long vulNum) {
        this.vulNum = vulNum;
        return this;
    }

    /**
     * **参数解释**: 实例漏洞风险数 **取值范围**: 最小值0，最大值9223372036854775807 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return vulNum
     */
    public Long getVulNum() {
        return vulNum;
    }

    public void setVulNum(Long vulNum) {
        this.vulNum = vulNum;
    }

    public ServerlessInstanceInfo withAppVulNum(Long appVulNum) {
        this.appVulNum = appVulNum;
        return this;
    }

    /**
     * **参数解释**: 实例应用漏洞风险数 **取值范围**: 最小值0，最大值9223372036854775807 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return appVulNum
     */
    public Long getAppVulNum() {
        return appVulNum;
    }

    public void setAppVulNum(Long appVulNum) {
        this.appVulNum = appVulNum;
    }

    public ServerlessInstanceInfo withLinuxVulNum(Long linuxVulNum) {
        this.linuxVulNum = linuxVulNum;
        return this;
    }

    /**
     * **参数解释**: 实例系统漏洞风险数 **取值范围**: 最小值0，最大值9223372036854775807 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return linuxVulNum
     */
    public Long getLinuxVulNum() {
        return linuxVulNum;
    }

    public void setLinuxVulNum(Long linuxVulNum) {
        this.linuxVulNum = linuxVulNum;
    }

    public ServerlessInstanceInfo withSecurityNum(Long securityNum) {
        this.securityNum = securityNum;
        return this;
    }

    /**
     * **参数解释**: 实例基线检查数 **取值范围**: 最小值0，最大值9223372036854775807 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return securityNum
     */
    public Long getSecurityNum() {
        return securityNum;
    }

    public void setSecurityNum(Long securityNum) {
        this.securityNum = securityNum;
    }

    public ServerlessInstanceInfo withEventNum(Long eventNum) {
        this.eventNum = eventNum;
        return this;
    }

    /**
     * **参数解释**: 实例入侵风险数 **取值范围**: 最小值0，最大值9223372036854775807 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return eventNum
     */
    public Long getEventNum() {
        return eventNum;
    }

    public void setEventNum(Long eventNum) {
        this.eventNum = eventNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServerlessInstanceInfo that = (ServerlessInstanceInfo) obj;
        return Objects.equals(this.enterpriseProjectName, that.enterpriseProjectName)
            && Objects.equals(this.instanceName, that.instanceName) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.instanceIp, that.instanceIp)
            && Objects.equals(this.instanceStatus, that.instanceStatus)
            && Objects.equals(this.namespaceName, that.namespaceName)
            && Objects.equals(this.agentStatus, that.agentStatus) && Objects.equals(this.agentId, that.agentId)
            && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.subscribeTime, that.subscribeTime)
            && Objects.equals(this.cpuRequest, that.cpuRequest) && Objects.equals(this.cpuLimit, that.cpuLimit)
            && Objects.equals(this.protectStatus, that.protectStatus)
            && Objects.equals(this.policyGroupName, that.policyGroupName) && Objects.equals(this.labels, that.labels)
            && Objects.equals(this.clusterName, that.clusterName)
            && Objects.equals(this.workloadName, that.workloadName) && Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.containerInfo, that.containerInfo)
            && Objects.equals(this.isSupportProtect, that.isSupportProtect) && Objects.equals(this.reason, that.reason)
            && Objects.equals(this.vulNum, that.vulNum) && Objects.equals(this.appVulNum, that.appVulNum)
            && Objects.equals(this.linuxVulNum, that.linuxVulNum) && Objects.equals(this.securityNum, that.securityNum)
            && Objects.equals(this.eventNum, that.eventNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectName,
            instanceName,
            instanceId,
            instanceIp,
            instanceStatus,
            namespaceName,
            agentStatus,
            agentId,
            createTime,
            subscribeTime,
            cpuRequest,
            cpuLimit,
            protectStatus,
            policyGroupName,
            labels,
            clusterName,
            workloadName,
            clusterId,
            containerInfo,
            isSupportProtect,
            reason,
            vulNum,
            appVulNum,
            linuxVulNum,
            securityNum,
            eventNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServerlessInstanceInfo {\n");
        sb.append("    enterpriseProjectName: ").append(toIndentedString(enterpriseProjectName)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    instanceIp: ").append(toIndentedString(instanceIp)).append("\n");
        sb.append("    instanceStatus: ").append(toIndentedString(instanceStatus)).append("\n");
        sb.append("    namespaceName: ").append(toIndentedString(namespaceName)).append("\n");
        sb.append("    agentStatus: ").append(toIndentedString(agentStatus)).append("\n");
        sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    subscribeTime: ").append(toIndentedString(subscribeTime)).append("\n");
        sb.append("    cpuRequest: ").append(toIndentedString(cpuRequest)).append("\n");
        sb.append("    cpuLimit: ").append(toIndentedString(cpuLimit)).append("\n");
        sb.append("    protectStatus: ").append(toIndentedString(protectStatus)).append("\n");
        sb.append("    policyGroupName: ").append(toIndentedString(policyGroupName)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    workloadName: ").append(toIndentedString(workloadName)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    containerInfo: ").append(toIndentedString(containerInfo)).append("\n");
        sb.append("    isSupportProtect: ").append(toIndentedString(isSupportProtect)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    vulNum: ").append(toIndentedString(vulNum)).append("\n");
        sb.append("    appVulNum: ").append(toIndentedString(appVulNum)).append("\n");
        sb.append("    linuxVulNum: ").append(toIndentedString(linuxVulNum)).append("\n");
        sb.append("    securityNum: ").append(toIndentedString(securityNum)).append("\n");
        sb.append("    eventNum: ").append(toIndentedString(eventNum)).append("\n");
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
