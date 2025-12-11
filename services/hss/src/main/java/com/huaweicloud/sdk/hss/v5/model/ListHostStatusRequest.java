package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListHostStatusRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_status")

    private String agentStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detect_result")

    private String detectResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_status")

    private String hostStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    private String osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ip")

    private String privateIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip")

    private String publicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_addr")

    private String ipAddr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_status")

    private String protectStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_intrusion")

    private Boolean hasIntrusion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_vul")

    private Boolean hasVul;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_baseline")

    private Boolean hasBaseline;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_key")

    private String sortKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_dir")

    private String sortDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_group_id")

    private String policyGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_group_name")

    private String policyGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charging_mode")

    private String chargingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "refresh")

    private Boolean refresh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "get_common_login_locations")

    private Boolean getCommonLoginLocations;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "above_version")

    private Boolean aboveVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "outside_host")

    private Boolean outsideHost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_value")

    private String assetValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label")

    private String label;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_group")

    private String serverGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_upgradable")

    private Boolean agentUpgradable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "install_mode")

    private Boolean installMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "binding_key")

    private Boolean bindingKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_interrupt")

    private Boolean protectInterrupt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incluster")

    private Boolean incluster;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_degradation")

    private Boolean protectDegradation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListHostStatusRequest withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * **参数解释**: 区域ID，用于查询目的区域内的资产。获取方式请参见[获取区域ID](hss_02_0026.xml)。 **约束限制**: 不涉及 **取值范围**: 字符长度1-128位 **默认取值**: 不涉及 
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public ListHostStatusRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释**: 企业项目ID，用于过滤不同企业项目下的资产。获取方式请参见[获取企业项目ID](hss_02_0027.xml)。 如需查询所有企业项目下的资产请传参“all_granted_eps”。 **约束限制**: 开通企业项目功能后才需要配置企业项目ID参数。 **取值范围**: 字符长度1-256位 **默认取值**: 0，表示默认企业项目（default）。 
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListHostStatusRequest withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释**： 主机开通的版本 **约束限制**: 不涉及 **取值范围**： 包含如下7种输入。 - hss.version.null ：无。 - hss.version.basic ：基础版。 - hss.version.advanced ：专业版。 - hss.version.enterprise ：企业版。 - hss.version.premium ：旗舰版。 - hss.version.wtp ：网页防篡改版。 - hss.version.container.enterprise：容器版。 **默认取值**: 不涉及
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ListHostStatusRequest withAgentStatus(String agentStatus) {
        this.agentStatus = agentStatus;
        return this;
    }

    /**
     * **参数解释**: Agent的状态 **约束限制**: 不涉及 **取值范围**: Agent的状态分为两类： - installed：已安装。已安装状态包含以下四种情况：   - online：在线。表示Agent已经成功安装并且与HSS云端防护中心保持连接。   - offline：离线。表示虽然Agent已经安装，但当前与HSS云端防护中心的连接中断。   - install_failed：安装失败。表示在尝试安装过程中遇到错误或问题，导致安装未能完成。   - installing：安装中。表示当前正在进行Agent安装。 - not_installed ：未安装。表示服务器中尚未安装Agent。 如果您要筛选除在线以外所有状态的Agent，可设置not_online（仅作为查询条件） **默认取值**: 不涉及
     * @return agentStatus
     */
    public String getAgentStatus() {
        return agentStatus;
    }

    public void setAgentStatus(String agentStatus) {
        this.agentStatus = agentStatus;
    }

    public ListHostStatusRequest withDetectResult(String detectResult) {
        this.detectResult = detectResult;
        return this;
    }

    /**
     * **参数解释**: 检测结果 **约束限制**: 不涉及 **取值范围**: 包含如下4种。   - undetected ：未检测。   - clean ：无风险。   - risk ：有风险。   - scanning ：检测中。 **默认取值**: 不涉及
     * @return detectResult
     */
    public String getDetectResult() {
        return detectResult;
    }

    public void setDetectResult(String detectResult) {
        this.detectResult = detectResult;
    }

    public ListHostStatusRequest withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * **参数解释**: 服务器名称 **约束限制**: 不涉及 **取值范围**: 字符长度1-256位 **默认取值**: 不涉及 
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public ListHostStatusRequest withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * **参数解释**: 服务器的唯一标识ID **约束限制**: 不涉及 **取值范围**: 字符长度1-64位 **默认取值**: 不涉及 
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public ListHostStatusRequest withHostStatus(String hostStatus) {
        this.hostStatus = hostStatus;
        return this;
    }

    /**
     * **参数解释**: 主机状态 **约束限制**: 不涉及 **取值范围**: 包含如下4种。 - ACTIVE ：正在运行。 - SHUTOFF ：关机。 - BUILDING ：创建中。 - ERROR ：故障。 **默认取值**: 不涉及
     * @return hostStatus
     */
    public String getHostStatus() {
        return hostStatus;
    }

    public void setHostStatus(String hostStatus) {
        this.hostStatus = hostStatus;
    }

    public ListHostStatusRequest withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * **参数解释**: 操作系统类型 **约束限制**: 不涉及 **取值范围**: 包含如下2种。 - Linux ：Linux。 - Windows ：Windows。 **默认取值**: 不涉及
     * @return osType
     */
    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public ListHostStatusRequest withPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    /**
     * **参数解释**: 服务器私有IP **约束限制**: 不涉及 **取值范围**: 字符长度1-128位 **默认取值**: 不涉及 
     * @return privateIp
     */
    public String getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    public ListHostStatusRequest withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * **参数解释**: 服务器弹性IP地址 **约束限制**: 不涉及 **取值范围**: IPv4格式（长度7-15位）、IPv6格式（长度15-39位） **默认取值**: 无 
     * @return publicIp
     */
    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    public ListHostStatusRequest withIpAddr(String ipAddr) {
        this.ipAddr = ipAddr;
        return this;
    }

    /**
     * **参数解释**: 公网或私网IP **约束限制**: 不涉及 **取值范围**: 字符长度1-128位 **默认取值**: 不涉及
     * @return ipAddr
     */
    public String getIpAddr() {
        return ipAddr;
    }

    public void setIpAddr(String ipAddr) {
        this.ipAddr = ipAddr;
    }

    public ListHostStatusRequest withProtectStatus(String protectStatus) {
        this.protectStatus = protectStatus;
        return this;
    }

    /**
     * **参数解释**: 防护状态 **约束限制**: 不涉及 **取值范围**: 包含如下3种： - closed ：关闭。 - opened ：开启。 - protection_exception ：防护异常。 **默认取值**: 不涉及
     * @return protectStatus
     */
    public String getProtectStatus() {
        return protectStatus;
    }

    public void setProtectStatus(String protectStatus) {
        this.protectStatus = protectStatus;
    }

    public ListHostStatusRequest withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * **参数解释**: 服务器组的唯一标识ID **约束限制**: 不涉及 **取值范围**: 字符长度1-64位 **默认取值**: 不涉及 
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public ListHostStatusRequest withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * **参数解释**: 服务器组名称 **约束限制**: 不涉及 **取值范围**: 字符长度1-64位 **默认取值**: 不涉及 
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public ListHostStatusRequest withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * **参数解释**: VPC的ID **约束限制**: 不涉及 **取值范围**: 字符长度1-128位 **默认取值**: 不涉及 
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public ListHostStatusRequest withHasIntrusion(Boolean hasIntrusion) {
        this.hasIntrusion = hasIntrusion;
        return this;
    }

    /**
     * **参数解释**: 存在告警事件 **约束限制**: 不涉及 **取值范围**: true或者false **默认取值**: 不涉及 
     * @return hasIntrusion
     */
    public Boolean getHasIntrusion() {
        return hasIntrusion;
    }

    public void setHasIntrusion(Boolean hasIntrusion) {
        this.hasIntrusion = hasIntrusion;
    }

    public ListHostStatusRequest withHasVul(Boolean hasVul) {
        this.hasVul = hasVul;
        return this;
    }

    /**
     * **参数解释**: 存在漏洞风险 **约束限制**: 不涉及 **取值范围**: true或者false **默认取值**: 不涉及 
     * @return hasVul
     */
    public Boolean getHasVul() {
        return hasVul;
    }

    public void setHasVul(Boolean hasVul) {
        this.hasVul = hasVul;
    }

    public ListHostStatusRequest withHasBaseline(Boolean hasBaseline) {
        this.hasBaseline = hasBaseline;
        return this;
    }

    /**
     * **参数解释**: 存在基线风险 **约束限制**: 不涉及 **取值范围**: true或者false **默认取值**: 不涉及 
     * @return hasBaseline
     */
    public Boolean getHasBaseline() {
        return hasBaseline;
    }

    public void setHasBaseline(Boolean hasBaseline) {
        this.hasBaseline = hasBaseline;
    }

    public ListHostStatusRequest withSortKey(String sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    /**
     * **参数解释**: 排序字段 **约束限制**: 不涉及 **取值范围**: 只支持risk_num **默认取值**: 不涉及 
     * @return sortKey
     */
    public String getSortKey() {
        return sortKey;
    }

    public void setSortKey(String sortKey) {
        this.sortKey = sortKey;
    }

    public ListHostStatusRequest withSortDir(String sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    /**
     * **参数解释**: 排序的顺序 **约束限制**: 不涉及 **取值范围**: - asc: 正序 - desc: 倒序 **默认取值**: 不涉及 
     * @return sortDir
     */
    public String getSortDir() {
        return sortDir;
    }

    public void setSortDir(String sortDir) {
        this.sortDir = sortDir;
    }

    public ListHostStatusRequest withPolicyGroupId(String policyGroupId) {
        this.policyGroupId = policyGroupId;
        return this;
    }

    /**
     * **参数解释**: 策略组ID **约束限制**: 不涉及 **取值范围**: 字符长度0-128位 **默认取值**: 不涉及 
     * @return policyGroupId
     */
    public String getPolicyGroupId() {
        return policyGroupId;
    }

    public void setPolicyGroupId(String policyGroupId) {
        this.policyGroupId = policyGroupId;
    }

    public ListHostStatusRequest withPolicyGroupName(String policyGroupName) {
        this.policyGroupName = policyGroupName;
        return this;
    }

    /**
     * **参数解释**: 策略组名称 **约束限制**: 不涉及 **取值范围**: 字符长度1-256位 **默认取值**: 不涉及 
     * @return policyGroupName
     */
    public String getPolicyGroupName() {
        return policyGroupName;
    }

    public void setPolicyGroupName(String policyGroupName) {
        this.policyGroupName = policyGroupName;
    }

    public ListHostStatusRequest withChargingMode(String chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /**
     * **参数解释**： 收费模式 **约束限制**: 不涉及 **取值范围**: - packet_cycle ：包年/包月。 - on_demand ：按需。 **默认取值**: 不涉及
     * @return chargingMode
     */
    public String getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(String chargingMode) {
        this.chargingMode = chargingMode;
    }

    public ListHostStatusRequest withRefresh(Boolean refresh) {
        this.refresh = refresh;
        return this;
    }

    /**
     * **参数解释** : 是否强制从ECS同步主机 **约束限制** : 不涉及 **取值范围** : true或者false **默认取值** : 不涉及 
     * @return refresh
     */
    public Boolean getRefresh() {
        return refresh;
    }

    public void setRefresh(Boolean refresh) {
        this.refresh = refresh;
    }

    public ListHostStatusRequest withGetCommonLoginLocations(Boolean getCommonLoginLocations) {
        this.getCommonLoginLocations = getCommonLoginLocations;
        return this;
    }

    /**
     * **参数解释** : 是否获取主机常用登录地信息 **约束限制** : 不涉及 **取值范围** : true或者false **默认取值** : 不涉及 
     * @return getCommonLoginLocations
     */
    public Boolean getGetCommonLoginLocations() {
        return getCommonLoginLocations;
    }

    public void setGetCommonLoginLocations(Boolean getCommonLoginLocations) {
        this.getCommonLoginLocations = getCommonLoginLocations;
    }

    public ListHostStatusRequest withAboveVersion(Boolean aboveVersion) {
        this.aboveVersion = aboveVersion;
        return this;
    }

    /**
     * **参数解释** : 是否返回比当前版本高的所有版本 **约束限制** : 不涉及 **取值范围** : true或者false **默认取值** : 不涉及 
     * @return aboveVersion
     */
    public Boolean getAboveVersion() {
        return aboveVersion;
    }

    public void setAboveVersion(Boolean aboveVersion) {
        this.aboveVersion = aboveVersion;
    }

    public ListHostStatusRequest withOutsideHost(Boolean outsideHost) {
        this.outsideHost = outsideHost;
        return this;
    }

    /**
     * **参数解释** : 是否华为云主机 **约束限制** : 不涉及 **取值范围** : true或者false **默认取值** : 不涉及 
     * @return outsideHost
     */
    public Boolean getOutsideHost() {
        return outsideHost;
    }

    public void setOutsideHost(Boolean outsideHost) {
        this.outsideHost = outsideHost;
    }

    public ListHostStatusRequest withAssetValue(String assetValue) {
        this.assetValue = assetValue;
        return this;
    }

    /**
     * **参数解释** : 资产重要性 **约束限制** : 不涉及 **取值范围** : 包含如下4种 - important ：重要资产 - common ：一般资产 - test ：测试资产 **默认取值** : 不涉及 
     * @return assetValue
     */
    public String getAssetValue() {
        return assetValue;
    }

    public void setAssetValue(String assetValue) {
        this.assetValue = assetValue;
    }

    public ListHostStatusRequest withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * **参数解释** : 资产标签 **约束限制** : 不涉及 **取值范围** : 字符长度1-64位 **默认取值** : 不涉及 
     * @return label
     */
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public ListHostStatusRequest withServerGroup(String serverGroup) {
        this.serverGroup = serverGroup;
        return this;
    }

    /**
     * **参数解释** : 资产服务器组 **约束限制** : 不涉及 **取值范围** : 字符长度1-64位 **默认取值** : 不涉及 
     * @return serverGroup
     */
    public String getServerGroup() {
        return serverGroup;
    }

    public void setServerGroup(String serverGroup) {
        this.serverGroup = serverGroup;
    }

    public ListHostStatusRequest withAgentUpgradable(Boolean agentUpgradable) {
        this.agentUpgradable = agentUpgradable;
        return this;
    }

    /**
     * **参数解释** : agent是否可升级 **约束限制** : 不涉及 **取值范围** : true或者false **默认取值** : 不涉及 
     * @return agentUpgradable
     */
    public Boolean getAgentUpgradable() {
        return agentUpgradable;
    }

    public void setAgentUpgradable(Boolean agentUpgradable) {
        this.agentUpgradable = agentUpgradable;
    }

    public ListHostStatusRequest withInstallMode(Boolean installMode) {
        this.installMode = installMode;
        return this;
    }

    /**
     * **参数解释** : 是否安装模式场景 **约束限制** : 不涉及 **取值范围** : true或者false **默认取值** : 不涉及 
     * @return installMode
     */
    public Boolean getInstallMode() {
        return installMode;
    }

    public void setInstallMode(Boolean installMode) {
        this.installMode = installMode;
    }

    public ListHostStatusRequest withBindingKey(Boolean bindingKey) {
        this.bindingKey = bindingKey;
        return this;
    }

    /**
     * **参数解释** : 是否绑定DEW密钥 **约束限制** : 不涉及 **取值范围** : true或者false **默认取值** : 不涉及 
     * @return bindingKey
     */
    public Boolean getBindingKey() {
        return bindingKey;
    }

    public void setBindingKey(Boolean bindingKey) {
        this.bindingKey = bindingKey;
    }

    public ListHostStatusRequest withProtectInterrupt(Boolean protectInterrupt) {
        this.protectInterrupt = protectInterrupt;
        return this;
    }

    /**
     * **参数解释** : 是否防护中断 **约束限制** : 不涉及 **取值范围** : true或者false **默认取值** : 不涉及 
     * @return protectInterrupt
     */
    public Boolean getProtectInterrupt() {
        return protectInterrupt;
    }

    public void setProtectInterrupt(Boolean protectInterrupt) {
        this.protectInterrupt = protectInterrupt;
    }

    public ListHostStatusRequest withIncluster(Boolean incluster) {
        this.incluster = incluster;
        return this;
    }

    /**
     * **参数解释** : 是否集群内节点 **约束限制** : 不涉及 **取值范围** : true或者false **默认取值** : 不涉及 
     * @return incluster
     */
    public Boolean getIncluster() {
        return incluster;
    }

    public void setIncluster(Boolean incluster) {
        this.incluster = incluster;
    }

    public ListHostStatusRequest withProtectDegradation(Boolean protectDegradation) {
        this.protectDegradation = protectDegradation;
        return this;
    }

    /**
     * **参数解释** : 是否防护降级 **约束限制** : 不涉及 **取值范围** : true或者false **默认取值** : 不涉及 
     * @return protectDegradation
     */
    public Boolean getProtectDegradation() {
        return protectDegradation;
    }

    public void setProtectDegradation(Boolean protectDegradation) {
        this.protectDegradation = protectDegradation;
    }

    public ListHostStatusRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * **参数解释**: 集群ID **约束限制**: 不涉及 **取值范围**: 字符长度1-64位 **默认取值**: 不涉及 
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public ListHostStatusRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释**: 偏移量：指定返回记录的开始位置 **约束限制**: 不涉及 **取值范围**: 最小值0，最大值2000000 **默认取值**: 默认为0 
     * minimum: 0
     * maximum: 2000000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListHostStatusRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**: 每页显示个数 **约束限制**: 不涉及 **取值范围**: 取值10-200 **默认取值**: 10 
     * minimum: 10
     * maximum: 200
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListHostStatusRequest that = (ListHostStatusRequest) obj;
        return Objects.equals(this.region, that.region)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.version, that.version) && Objects.equals(this.agentStatus, that.agentStatus)
            && Objects.equals(this.detectResult, that.detectResult) && Objects.equals(this.hostName, that.hostName)
            && Objects.equals(this.hostId, that.hostId) && Objects.equals(this.hostStatus, that.hostStatus)
            && Objects.equals(this.osType, that.osType) && Objects.equals(this.privateIp, that.privateIp)
            && Objects.equals(this.publicIp, that.publicIp) && Objects.equals(this.ipAddr, that.ipAddr)
            && Objects.equals(this.protectStatus, that.protectStatus) && Objects.equals(this.groupId, that.groupId)
            && Objects.equals(this.groupName, that.groupName) && Objects.equals(this.vpcId, that.vpcId)
            && Objects.equals(this.hasIntrusion, that.hasIntrusion) && Objects.equals(this.hasVul, that.hasVul)
            && Objects.equals(this.hasBaseline, that.hasBaseline) && Objects.equals(this.sortKey, that.sortKey)
            && Objects.equals(this.sortDir, that.sortDir) && Objects.equals(this.policyGroupId, that.policyGroupId)
            && Objects.equals(this.policyGroupName, that.policyGroupName)
            && Objects.equals(this.chargingMode, that.chargingMode) && Objects.equals(this.refresh, that.refresh)
            && Objects.equals(this.getCommonLoginLocations, that.getCommonLoginLocations)
            && Objects.equals(this.aboveVersion, that.aboveVersion)
            && Objects.equals(this.outsideHost, that.outsideHost) && Objects.equals(this.assetValue, that.assetValue)
            && Objects.equals(this.label, that.label) && Objects.equals(this.serverGroup, that.serverGroup)
            && Objects.equals(this.agentUpgradable, that.agentUpgradable)
            && Objects.equals(this.installMode, that.installMode) && Objects.equals(this.bindingKey, that.bindingKey)
            && Objects.equals(this.protectInterrupt, that.protectInterrupt)
            && Objects.equals(this.incluster, that.incluster)
            && Objects.equals(this.protectDegradation, that.protectDegradation)
            && Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(region,
            enterpriseProjectId,
            version,
            agentStatus,
            detectResult,
            hostName,
            hostId,
            hostStatus,
            osType,
            privateIp,
            publicIp,
            ipAddr,
            protectStatus,
            groupId,
            groupName,
            vpcId,
            hasIntrusion,
            hasVul,
            hasBaseline,
            sortKey,
            sortDir,
            policyGroupId,
            policyGroupName,
            chargingMode,
            refresh,
            getCommonLoginLocations,
            aboveVersion,
            outsideHost,
            assetValue,
            label,
            serverGroup,
            agentUpgradable,
            installMode,
            bindingKey,
            protectInterrupt,
            incluster,
            protectDegradation,
            clusterId,
            offset,
            limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListHostStatusRequest {\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    agentStatus: ").append(toIndentedString(agentStatus)).append("\n");
        sb.append("    detectResult: ").append(toIndentedString(detectResult)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    hostStatus: ").append(toIndentedString(hostStatus)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    ipAddr: ").append(toIndentedString(ipAddr)).append("\n");
        sb.append("    protectStatus: ").append(toIndentedString(protectStatus)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    hasIntrusion: ").append(toIndentedString(hasIntrusion)).append("\n");
        sb.append("    hasVul: ").append(toIndentedString(hasVul)).append("\n");
        sb.append("    hasBaseline: ").append(toIndentedString(hasBaseline)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
        sb.append("    policyGroupId: ").append(toIndentedString(policyGroupId)).append("\n");
        sb.append("    policyGroupName: ").append(toIndentedString(policyGroupName)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    refresh: ").append(toIndentedString(refresh)).append("\n");
        sb.append("    getCommonLoginLocations: ").append(toIndentedString(getCommonLoginLocations)).append("\n");
        sb.append("    aboveVersion: ").append(toIndentedString(aboveVersion)).append("\n");
        sb.append("    outsideHost: ").append(toIndentedString(outsideHost)).append("\n");
        sb.append("    assetValue: ").append(toIndentedString(assetValue)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    serverGroup: ").append(toIndentedString(serverGroup)).append("\n");
        sb.append("    agentUpgradable: ").append(toIndentedString(agentUpgradable)).append("\n");
        sb.append("    installMode: ").append(toIndentedString(installMode)).append("\n");
        sb.append("    bindingKey: ").append(toIndentedString(bindingKey)).append("\n");
        sb.append("    protectInterrupt: ").append(toIndentedString(protectInterrupt)).append("\n");
        sb.append("    incluster: ").append(toIndentedString(incluster)).append("\n");
        sb.append("    protectDegradation: ").append(toIndentedString(protectDegradation)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
