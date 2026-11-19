package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AI智能体实例响应数据项
 */
public class ListAiInstancesResponseBodyData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_name")

    private String agentName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_id")

    private String agentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtime_name")

    private String runtimeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtime_id")

    private String runtimeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sdk_status")

    private String sdkStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private String source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_type")

    private String agentType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_number")

    private Integer sessionNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_url")

    private String imageUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_create_time")

    private Long instanceCreateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_update_time")

    private Long instanceUpdateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trace_alarm_number")

    private Integer traceAlarmNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtime_alarm_number")

    private Integer runtimeAlarmNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_group_type")

    private Integer policyGroupType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_info_list")

    private List<AiAgentPolicy> policyInfoList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_runtime_env")

    private String agentRuntimeEnv;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_type")

    private String clusterType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip")

    private String publicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ip")

    private String privateIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_status")

    private String hostStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    private String osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_name")

    private String osName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_version")

    private String osVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kernel_version")

    private String kernelVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_status")

    private String agentStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "defender_status")

    private String defenderStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_id")

    private String containerId;

    public ListAiInstancesResponseBodyData withAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }

    /**
     * **参数解释**： 智能体名字 **取值范围**： 字符长度为1-128位 
     * @return agentName
     */
    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public ListAiInstancesResponseBodyData withAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    /**
     * **参数解释**： 智能体ID **取值范围**： 字符长度为1-128位 
     * @return agentId
     */
    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public ListAiInstancesResponseBodyData withRuntimeName(String runtimeName) {
        this.runtimeName = runtimeName;
        return this;
    }

    /**
     * **参数解释**： 智能体运行时名字 **取值范围**： 字符长度为1-128位 
     * @return runtimeName
     */
    public String getRuntimeName() {
        return runtimeName;
    }

    public void setRuntimeName(String runtimeName) {
        this.runtimeName = runtimeName;
    }

    public ListAiInstancesResponseBodyData withRuntimeId(String runtimeId) {
        this.runtimeId = runtimeId;
        return this;
    }

    /**
     * **参数解释**： 智能体运行时ID **取值范围**： 字符长度为1-128位 
     * @return runtimeId
     */
    public String getRuntimeId() {
        return runtimeId;
    }

    public void setRuntimeId(String runtimeId) {
        this.runtimeId = runtimeId;
    }

    public ListAiInstancesResponseBodyData withSdkStatus(String sdkStatus) {
        this.sdkStatus = sdkStatus;
        return this;
    }

    /**
     * **参数解释**： SDK检测状态 **取值范围**： - open：开启 - close：关闭 
     * @return sdkStatus
     */
    public String getSdkStatus() {
        return sdkStatus;
    }

    public void setSdkStatus(String sdkStatus) {
        this.sdkStatus = sdkStatus;
    }

    public ListAiInstancesResponseBodyData withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * **参数解释**： 智能体的来源 **取值范围**： - AgentArts - OfficeClaw - OpenClaw 
     * @return source
     */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public ListAiInstancesResponseBodyData withAgentType(String agentType) {
        this.agentType = agentType;
        return this;
    }

    /**
     * **参数解释**： 智能体类型 **取值范围**： - agent：单智能体。 - chat：工作流。 - controller：多智能体。 - teamAgent：团队智能体。 
     * @return agentType
     */
    public String getAgentType() {
        return agentType;
    }

    public void setAgentType(String agentType) {
        this.agentType = agentType;
    }

    public ListAiInstancesResponseBodyData withSessionNumber(Integer sessionNumber) {
        this.sessionNumber = sessionNumber;
        return this;
    }

    /**
     * **参数解释**： 会话数量 **取值范围**： 0~2147483647 
     * @return sessionNumber
     */
    public Integer getSessionNumber() {
        return sessionNumber;
    }

    public void setSessionNumber(Integer sessionNumber) {
        this.sessionNumber = sessionNumber;
    }

    public ListAiInstancesResponseBodyData withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释**： 项目ID **取值范围**： 字符长度为1-128位 
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ListAiInstancesResponseBodyData withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释**： 企业项目ID **取值范围**： 字符长度为1-128位 
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListAiInstancesResponseBodyData withImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    /**
     * **参数解释**： 镜像url **取值范围**： 字符长度为1-512位 
     * @return imageUrl
     */
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public ListAiInstancesResponseBodyData withInstanceCreateTime(Long instanceCreateTime) {
        this.instanceCreateTime = instanceCreateTime;
        return this;
    }

    /**
     * **参数解释**： 智能体实例的创建时间，毫秒时间戳 **取值范围**： 0~9223372036854775807 
     * @return instanceCreateTime
     */
    public Long getInstanceCreateTime() {
        return instanceCreateTime;
    }

    public void setInstanceCreateTime(Long instanceCreateTime) {
        this.instanceCreateTime = instanceCreateTime;
    }

    public ListAiInstancesResponseBodyData withInstanceUpdateTime(Long instanceUpdateTime) {
        this.instanceUpdateTime = instanceUpdateTime;
        return this;
    }

    /**
     * **参数解释**： 智能体实例的更新时间，毫秒时间戳 **取值范围**： 0~9223372036854775807 
     * @return instanceUpdateTime
     */
    public Long getInstanceUpdateTime() {
        return instanceUpdateTime;
    }

    public void setInstanceUpdateTime(Long instanceUpdateTime) {
        this.instanceUpdateTime = instanceUpdateTime;
    }

    public ListAiInstancesResponseBodyData withTraceAlarmNumber(Integer traceAlarmNumber) {
        this.traceAlarmNumber = traceAlarmNumber;
        return this;
    }

    /**
     * **参数解释**： 行为轨迹告警数量 **取值范围**： 0~2147483647 
     * @return traceAlarmNumber
     */
    public Integer getTraceAlarmNumber() {
        return traceAlarmNumber;
    }

    public void setTraceAlarmNumber(Integer traceAlarmNumber) {
        this.traceAlarmNumber = traceAlarmNumber;
    }

    public ListAiInstancesResponseBodyData withRuntimeAlarmNumber(Integer runtimeAlarmNumber) {
        this.runtimeAlarmNumber = runtimeAlarmNumber;
        return this;
    }

    /**
     * **参数解释**： 运行时告警数量 **取值范围**： 0~2147483647 
     * @return runtimeAlarmNumber
     */
    public Integer getRuntimeAlarmNumber() {
        return runtimeAlarmNumber;
    }

    public void setRuntimeAlarmNumber(Integer runtimeAlarmNumber) {
        this.runtimeAlarmNumber = runtimeAlarmNumber;
    }

    public ListAiInstancesResponseBodyData withPolicyGroupType(Integer policyGroupType) {
        this.policyGroupType = policyGroupType;
        return this;
    }

    /**
     * **参数解释**： 策略组类型 **取值范围**： - 0：Agent运行时防护-OfficeAce - 1：Agent行为轨迹检测-OfficeAce - 2：Agent角色限定 - 3：Agent运行时防护-AgentArts - 4：Agent行为轨迹检测-AgentArts - 5：Agent运行时防护-OpenClaw - 6：Agent运行时防护-其他三方Claw 
     * @return policyGroupType
     */
    public Integer getPolicyGroupType() {
        return policyGroupType;
    }

    public void setPolicyGroupType(Integer policyGroupType) {
        this.policyGroupType = policyGroupType;
    }

    public ListAiInstancesResponseBodyData withPolicyInfoList(List<AiAgentPolicy> policyInfoList) {
        this.policyInfoList = policyInfoList;
        return this;
    }

    public ListAiInstancesResponseBodyData addPolicyInfoListItem(AiAgentPolicy policyInfoListItem) {
        if (this.policyInfoList == null) {
            this.policyInfoList = new ArrayList<>();
        }
        this.policyInfoList.add(policyInfoListItem);
        return this;
    }

    public ListAiInstancesResponseBodyData withPolicyInfoList(Consumer<List<AiAgentPolicy>> policyInfoListSetter) {
        if (this.policyInfoList == null) {
            this.policyInfoList = new ArrayList<>();
        }
        policyInfoListSetter.accept(this.policyInfoList);
        return this;
    }

    /**
     * **参数解释**: AI策略组列表 **取值范围**: 不涉及 
     * @return policyInfoList
     */
    public List<AiAgentPolicy> getPolicyInfoList() {
        return policyInfoList;
    }

    public void setPolicyInfoList(List<AiAgentPolicy> policyInfoList) {
        this.policyInfoList = policyInfoList;
    }

    public ListAiInstancesResponseBodyData withAgentRuntimeEnv(String agentRuntimeEnv) {
        this.agentRuntimeEnv = agentRuntimeEnv;
        return this;
    }

    /**
     * **参数解释**： 智能体运行环境 **取值范围**： - ECS - CCE - Others - AgentArts - OfficeClaw 
     * @return agentRuntimeEnv
     */
    public String getAgentRuntimeEnv() {
        return agentRuntimeEnv;
    }

    public void setAgentRuntimeEnv(String agentRuntimeEnv) {
        this.agentRuntimeEnv = agentRuntimeEnv;
    }

    public ListAiInstancesResponseBodyData withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * **参数解释**： 集群ID，仅agent_runtime_env为CCE时返回 **取值范围**： 字符长度为1-128位 
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public ListAiInstancesResponseBodyData withClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }

    /**
     * **参数解释**： 集群类型 **取值范围**： - CCE：云容器引擎 
     * @return clusterType
     */
    public String getClusterType() {
        return clusterType;
    }

    public void setClusterType(String clusterType) {
        this.clusterType = clusterType;
    }

    public ListAiInstancesResponseBodyData withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * **参数解释**： 集群名称，仅agent_runtime_env为CCE时返回 **取值范围**： 字符长度为1-256位 
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public ListAiInstancesResponseBodyData withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * **参数解释**： 服务器名称 **取值范围**： 字符长度为1-256位 
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public ListAiInstancesResponseBodyData withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * **参数解释**： 服务器公网IP地址 **取值范围**： 字符长度为1-128位 
     * @return publicIp
     */
    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    public ListAiInstancesResponseBodyData withPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    /**
     * **参数解释**： 服务器私有IP地址 **取值范围**： 字符长度为1-128位 
     * @return privateIp
     */
    public String getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    public ListAiInstancesResponseBodyData withHostStatus(String hostStatus) {
        this.hostStatus = hostStatus;
        return this;
    }

    /**
     * **参数解释**： 服务器状态 **取值范围**： - ACTIVE：运行中 - SHUTOFF：已关机 - BUILD：创建中 - ERROR：异常 - DELETED：已删除 - REBOOT：重启中 
     * @return hostStatus
     */
    public String getHostStatus() {
        return hostStatus;
    }

    public void setHostStatus(String hostStatus) {
        this.hostStatus = hostStatus;
    }

    public ListAiInstancesResponseBodyData withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * **参数解释**： 服务器ID **取值范围**： 字符长度为1-128位 
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public ListAiInstancesResponseBodyData withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * **参数解释**： 操作系统类型 **取值范围**： - Linux - Windows 
     * @return osType
     */
    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public ListAiInstancesResponseBodyData withOsName(String osName) {
        this.osName = osName;
        return this;
    }

    /**
     * **参数解释**： 操作系统名称 **取值范围**： - EulerOS 2.9 - CentOS 7.9 - Ubuntu 20.04 - 其他操作系统名称 
     * @return osName
     */
    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }

    public ListAiInstancesResponseBodyData withOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    /**
     * **参数解释**： 操作系统版本号 **取值范围**： 字符长度为1-64位 
     * @return osVersion
     */
    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public ListAiInstancesResponseBodyData withKernelVersion(String kernelVersion) {
        this.kernelVersion = kernelVersion;
        return this;
    }

    /**
     * **参数解释**： 操作系统内核版本号 **取值范围**： 字符长度为1-128位 
     * @return kernelVersion
     */
    public String getKernelVersion() {
        return kernelVersion;
    }

    public void setKernelVersion(String kernelVersion) {
        this.kernelVersion = kernelVersion;
    }

    public ListAiInstancesResponseBodyData withAgentStatus(String agentStatus) {
        this.agentStatus = agentStatus;
        return this;
    }

    /**
     * **参数解释**： Agent状态 **取值范围**： - online：在线 - offline：离线 - not_installed：未安装 - install_failed：安装失败 - installing：安装中 
     * @return agentStatus
     */
    public String getAgentStatus() {
        return agentStatus;
    }

    public void setAgentStatus(String agentStatus) {
        this.agentStatus = agentStatus;
    }

    public ListAiInstancesResponseBodyData withDefenderStatus(String defenderStatus) {
        this.defenderStatus = defenderStatus;
        return this;
    }

    /**
     * **参数解释**： 智能体卫士插件状态 **取值范围**： - not_installed：未安装 - install_failed：安装失败 - online：在线 - offline：离线 - installing：安装中 
     * @return defenderStatus
     */
    public String getDefenderStatus() {
        return defenderStatus;
    }

    public void setDefenderStatus(String defenderStatus) {
        this.defenderStatus = defenderStatus;
    }

    public ListAiInstancesResponseBodyData withContainerId(String containerId) {
        this.containerId = containerId;
        return this;
    }

    /**
     * **参数解释** 容器实例id **取值范围**: 字符长度0-128位
     * @return containerId
     */
    public String getContainerId() {
        return containerId;
    }

    public void setContainerId(String containerId) {
        this.containerId = containerId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAiInstancesResponseBodyData that = (ListAiInstancesResponseBodyData) obj;
        return Objects.equals(this.agentName, that.agentName) && Objects.equals(this.agentId, that.agentId)
            && Objects.equals(this.runtimeName, that.runtimeName) && Objects.equals(this.runtimeId, that.runtimeId)
            && Objects.equals(this.sdkStatus, that.sdkStatus) && Objects.equals(this.source, that.source)
            && Objects.equals(this.agentType, that.agentType) && Objects.equals(this.sessionNumber, that.sessionNumber)
            && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.imageUrl, that.imageUrl)
            && Objects.equals(this.instanceCreateTime, that.instanceCreateTime)
            && Objects.equals(this.instanceUpdateTime, that.instanceUpdateTime)
            && Objects.equals(this.traceAlarmNumber, that.traceAlarmNumber)
            && Objects.equals(this.runtimeAlarmNumber, that.runtimeAlarmNumber)
            && Objects.equals(this.policyGroupType, that.policyGroupType)
            && Objects.equals(this.policyInfoList, that.policyInfoList)
            && Objects.equals(this.agentRuntimeEnv, that.agentRuntimeEnv)
            && Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.clusterType, that.clusterType)
            && Objects.equals(this.clusterName, that.clusterName) && Objects.equals(this.hostName, that.hostName)
            && Objects.equals(this.publicIp, that.publicIp) && Objects.equals(this.privateIp, that.privateIp)
            && Objects.equals(this.hostStatus, that.hostStatus) && Objects.equals(this.hostId, that.hostId)
            && Objects.equals(this.osType, that.osType) && Objects.equals(this.osName, that.osName)
            && Objects.equals(this.osVersion, that.osVersion) && Objects.equals(this.kernelVersion, that.kernelVersion)
            && Objects.equals(this.agentStatus, that.agentStatus)
            && Objects.equals(this.defenderStatus, that.defenderStatus)
            && Objects.equals(this.containerId, that.containerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agentName,
            agentId,
            runtimeName,
            runtimeId,
            sdkStatus,
            source,
            agentType,
            sessionNumber,
            projectId,
            enterpriseProjectId,
            imageUrl,
            instanceCreateTime,
            instanceUpdateTime,
            traceAlarmNumber,
            runtimeAlarmNumber,
            policyGroupType,
            policyInfoList,
            agentRuntimeEnv,
            clusterId,
            clusterType,
            clusterName,
            hostName,
            publicIp,
            privateIp,
            hostStatus,
            hostId,
            osType,
            osName,
            osVersion,
            kernelVersion,
            agentStatus,
            defenderStatus,
            containerId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAiInstancesResponseBodyData {\n");
        sb.append("    agentName: ").append(toIndentedString(agentName)).append("\n");
        sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
        sb.append("    runtimeName: ").append(toIndentedString(runtimeName)).append("\n");
        sb.append("    runtimeId: ").append(toIndentedString(runtimeId)).append("\n");
        sb.append("    sdkStatus: ").append(toIndentedString(sdkStatus)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    agentType: ").append(toIndentedString(agentType)).append("\n");
        sb.append("    sessionNumber: ").append(toIndentedString(sessionNumber)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
        sb.append("    instanceCreateTime: ").append(toIndentedString(instanceCreateTime)).append("\n");
        sb.append("    instanceUpdateTime: ").append(toIndentedString(instanceUpdateTime)).append("\n");
        sb.append("    traceAlarmNumber: ").append(toIndentedString(traceAlarmNumber)).append("\n");
        sb.append("    runtimeAlarmNumber: ").append(toIndentedString(runtimeAlarmNumber)).append("\n");
        sb.append("    policyGroupType: ").append(toIndentedString(policyGroupType)).append("\n");
        sb.append("    policyInfoList: ").append(toIndentedString(policyInfoList)).append("\n");
        sb.append("    agentRuntimeEnv: ").append(toIndentedString(agentRuntimeEnv)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    clusterType: ").append(toIndentedString(clusterType)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
        sb.append("    hostStatus: ").append(toIndentedString(hostStatus)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    osName: ").append(toIndentedString(osName)).append("\n");
        sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
        sb.append("    kernelVersion: ").append(toIndentedString(kernelVersion)).append("\n");
        sb.append("    agentStatus: ").append(toIndentedString(agentStatus)).append("\n");
        sb.append("    defenderStatus: ").append(toIndentedString(defenderStatus)).append("\n");
        sb.append("    containerId: ").append(toIndentedString(containerId)).append("\n");
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
