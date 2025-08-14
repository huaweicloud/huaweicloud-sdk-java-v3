package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Host
 */
public class Host {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_id")

    private String agentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ip")

    private String privateIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip")

    private String publicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_name")

    private String enterpriseProjectName;

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
    @JsonProperty(value = "host_status")

    private String hostStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_status")

    private String agentStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "install_result_code")

    private String installResultCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_status")

    private String protectStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_image")

    private String osImage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    private String osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_bit")

    private String osBit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detect_result")

    private String detectResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time")

    private Long expireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charging_mode")

    private String chargingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "outside_host")

    private Boolean outsideHost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_group_id")

    private String policyGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_group_name")

    private String policyGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset")

    private Integer asset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vulnerability")

    private Integer vulnerability;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "baseline")

    private Integer baseline;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "intrusion")

    private Integer intrusion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_value")

    private String assetValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private List<String> labels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_create_time")

    private Long agentCreateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_update_time")

    private Long agentUpdateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_version")

    private String agentVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgrade_status")

    private String upgradeStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgrade_result_code")

    private String upgradeResultCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgradable")

    private Boolean upgradable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "open_time")

    private Long openTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_interrupt")

    private Boolean protectInterrupt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_degradation")

    private Boolean protectDegradation;

    /**
     * **参数解释**： 服务器来源 **取值范围**： 包含如下3种。   - ecs ：华为云ecs。   - outside ：非华为云机器。   - workspace ：华为云workspace。
     */
    public static final class HostSourcesEnum {

        /**
         * Enum ECS for value: "ecs"
         */
        public static final HostSourcesEnum ECS = new HostSourcesEnum("ecs");

        /**
         * Enum OUTSIDE for value: "outside"
         */
        public static final HostSourcesEnum OUTSIDE = new HostSourcesEnum("outside");

        /**
         * Enum WORKSPACE for value: "workspace"
         */
        public static final HostSourcesEnum WORKSPACE = new HostSourcesEnum("workspace");

        private static final Map<String, HostSourcesEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, HostSourcesEnum> createStaticFields() {
            Map<String, HostSourcesEnum> map = new HashMap<>();
            map.put("ecs", ECS);
            map.put("outside", OUTSIDE);
            map.put("workspace", WORKSPACE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        HostSourcesEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static HostSourcesEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new HostSourcesEnum(value));
        }

        public static HostSourcesEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof HostSourcesEnum) {
                return this.value.equals(((HostSourcesEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_sources")

    private HostSourcesEnum hostSources;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interrupt_reason")

    private String interruptReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "degradation_reason")

    private String degradationReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_name")

    private String keyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_open_version")

    private String autoOpenVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "install_progress")

    private Integer installProgress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "common_login_area_codes")

    private List<Integer> commonLoginAreaCodes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    public Host withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * **参数解释**: 服务器名称 **取值范围**: 字符长度1-128位 
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public Host withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * **参数解释**: 服务器ID **取值范围**: 字符长度1-128位 
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public Host withAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    /**
     * **参数解释**: Agent ID **取值范围**: 字符长度1-128位 
     * @return agentId
     */
    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public Host withPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    /**
     * **参数解释**: 私有IP地址 **取值范围**: 字符长度1-128位 
     * @return privateIp
     */
    public String getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    public Host withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * **参数解释**: 弹性公网IP地址 **取值范围**: 字符长度1-128位 
     * @return publicIp
     */
    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    public Host withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释**: 企业项目ID **取值范围**: 字符长度0-256位 
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public Host withEnterpriseProjectName(String enterpriseProjectName) {
        this.enterpriseProjectName = enterpriseProjectName;
        return this;
    }

    /**
     * **参数解释**: 所属企业项目名称 **取值范围**: 字符长度0-256位 
     * @return enterpriseProjectName
     */
    public String getEnterpriseProjectName() {
        return enterpriseProjectName;
    }

    public void setEnterpriseProjectName(String enterpriseProjectName) {
        this.enterpriseProjectName = enterpriseProjectName;
    }

    public Host withOsName(String osName) {
        this.osName = osName;
        return this;
    }

    /**
     * **参数解释**: 系统名称 **取值范围**: 字符长度0-128位 
     * @return osName
     */
    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }

    public Host withOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    /**
     * **参数解释**: 系统版本 **取值范围**: 字符长度0-256位 
     * @return osVersion
     */
    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public Host withKernelVersion(String kernelVersion) {
        this.kernelVersion = kernelVersion;
        return this;
    }

    /**
     * **参数解释**: 内核版本 **取值范围**: 字符长度0-256位 
     * @return kernelVersion
     */
    public String getKernelVersion() {
        return kernelVersion;
    }

    public void setKernelVersion(String kernelVersion) {
        this.kernelVersion = kernelVersion;
    }

    public Host withHostStatus(String hostStatus) {
        this.hostStatus = hostStatus;
        return this;
    }

    /**
     * **参数解释**: 服务器状态 **取值范围**: 包含如下4种。 - ACTIVE ：运行中。 - SHUTOFF ：关机。 - BUILDING ：创建中。 - ERROR ：故障。
     * @return hostStatus
     */
    public String getHostStatus() {
        return hostStatus;
    }

    public void setHostStatus(String hostStatus) {
        this.hostStatus = hostStatus;
    }

    public Host withAgentStatus(String agentStatus) {
        this.agentStatus = agentStatus;
        return this;
    }

    /**
     * **参数解释**: Agent状态 **取值范围**: 包含如下6种。 - installed ：已安装。 - not_installed ：未安装。 - online ：在线。 - offline ：离线。 - install_failed ：安装失败。 - installing ：安装中。
     * @return agentStatus
     */
    public String getAgentStatus() {
        return agentStatus;
    }

    public void setAgentStatus(String agentStatus) {
        this.agentStatus = agentStatus;
    }

    public Host withInstallResultCode(String installResultCode) {
        this.installResultCode = installResultCode;
        return this;
    }

    /**
     * **参数解释**: 安装结果 **取值范围**: 包含如下12种。   - install_succeed ：安装成功。   - network_access_timeout ：网络不通，访问超时。   - invalid_port ：无效端口。   - auth_failed ：认证错误，口令不正确。   - permission_denied ：权限错误，被拒绝。   - no_available_vpc ：没有相同VPC的agent在线虚拟机。   - install_exception ：安装异常。   - invalid_param ：参数错误。   - install_failed ：安装失败。   - package_unavailable ：安装包失效。   - os_type_not_support ：系统类型错误。   - os_arch_not_support ：架构类型错误。
     * @return installResultCode
     */
    public String getInstallResultCode() {
        return installResultCode;
    }

    public void setInstallResultCode(String installResultCode) {
        this.installResultCode = installResultCode;
    }

    public Host withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释**： 主机开通的版本 **取值范围**： 包含如下7种输入。 - hss.version.null ：无。 - hss.version.basic ：基础版。 - hss.version.advanced ：专业版。 - hss.version.enterprise ：企业版。 - hss.version.premium ：旗舰版。 - hss.version.wtp ：网页防篡改版。 - hss.version.container.enterprise：容器版。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Host withProtectStatus(String protectStatus) {
        this.protectStatus = protectStatus;
        return this;
    }

    /**
     * **参数解释**： 防护状态 **取值范围**： 包含如下3种。 - closed ：未防护。 - opened ：防护中。 - protection_exception ：防护异常。
     * @return protectStatus
     */
    public String getProtectStatus() {
        return protectStatus;
    }

    public void setProtectStatus(String protectStatus) {
        this.protectStatus = protectStatus;
    }

    public Host withOsImage(String osImage) {
        this.osImage = osImage;
        return this;
    }

    /**
     * **参数解释**： 系统镜像 **取值范围**： 字符长度0-128位
     * @return osImage
     */
    public String getOsImage() {
        return osImage;
    }

    public void setOsImage(String osImage) {
        this.osImage = osImage;
    }

    public Host withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * **参数解释**： 操作系统类型 **取值范围**： 包含如下2种。   - Linux ：Linux。   - Windows ：Windows。
     * @return osType
     */
    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public Host withOsBit(String osBit) {
        this.osBit = osBit;
        return this;
    }

    /**
     * **参数解释**： 操作系统位数 **取值范围**： 字符长度0-128位
     * @return osBit
     */
    public String getOsBit() {
        return osBit;
    }

    public void setOsBit(String osBit) {
        this.osBit = osBit;
    }

    public Host withDetectResult(String detectResult) {
        this.detectResult = detectResult;
        return this;
    }

    /**
     * **参数解释**： 云主机安全检测结果 **取值范围**： 包含如下4种。 - undetected ：未检测。 - clean ：无风险。 - risk ：有风险。 - scanning ：检测中。
     * @return detectResult
     */
    public String getDetectResult() {
        return detectResult;
    }

    public void setDetectResult(String detectResult) {
        this.detectResult = detectResult;
    }

    public Host withExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * **参数解释**： 试用版到期时间 **取值范围**： -1到4824695185000（-1表示非试用版配额，当值不为-1时为试用版本过期时间）
     * minimum: 0
     * maximum: 4824695185000
     * @return expireTime
     */
    public Long getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
    }

    public Host withChargingMode(String chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /**
     * **参数解释**： 收费模式 **取值范围**： 包含如下2种。   - packet_cycle ：包年/包月。   - on_demand ：按需。
     * @return chargingMode
     */
    public String getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(String chargingMode) {
        this.chargingMode = chargingMode;
    }

    public Host withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * **参数解释**： 主机安全配额ID（UUID） **取值范围**： 字符长度0-128位
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public Host withOutsideHost(Boolean outsideHost) {
        this.outsideHost = outsideHost;
        return this;
    }

    /**
     * **参数解释**： 是否非华为云机器 **取值范围**： true或者false
     * @return outsideHost
     */
    public Boolean getOutsideHost() {
        return outsideHost;
    }

    public void setOutsideHost(Boolean outsideHost) {
        this.outsideHost = outsideHost;
    }

    public Host withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * **参数解释**： 服务器组ID **取值范围**： 字符长度0-128位
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public Host withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * **参数解释**： 服务器组名称 **取值范围**： 字符长度0-128位
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Host withPolicyGroupId(String policyGroupId) {
        this.policyGroupId = policyGroupId;
        return this;
    }

    /**
     * **参数解释**： 策略组ID **取值范围**： 字符长度0-128位
     * @return policyGroupId
     */
    public String getPolicyGroupId() {
        return policyGroupId;
    }

    public void setPolicyGroupId(String policyGroupId) {
        this.policyGroupId = policyGroupId;
    }

    public Host withPolicyGroupName(String policyGroupName) {
        this.policyGroupName = policyGroupName;
        return this;
    }

    /**
     * **参数解释**： 策略组名称 **取值范围**： 字符长度0-128位
     * @return policyGroupName
     */
    public String getPolicyGroupName() {
        return policyGroupName;
    }

    public void setPolicyGroupName(String policyGroupName) {
        this.policyGroupName = policyGroupName;
    }

    public Host withAsset(Integer asset) {
        this.asset = asset;
        return this;
    }

    /**
     * **参数解释**： 资产风险 **取值范围**： 0-2097152
     * minimum: 0
     * maximum: 2097152
     * @return asset
     */
    public Integer getAsset() {
        return asset;
    }

    public void setAsset(Integer asset) {
        this.asset = asset;
    }

    public Host withVulnerability(Integer vulnerability) {
        this.vulnerability = vulnerability;
        return this;
    }

    /**
     * **参数解释**： 漏洞风险总数，包含Linux软件漏洞、Windows系统漏洞、Web-CMS漏洞、应用漏洞 **取值范围**： 0-2097152
     * minimum: 0
     * maximum: 2097152
     * @return vulnerability
     */
    public Integer getVulnerability() {
        return vulnerability;
    }

    public void setVulnerability(Integer vulnerability) {
        this.vulnerability = vulnerability;
    }

    public Host withBaseline(Integer baseline) {
        this.baseline = baseline;
        return this;
    }

    /**
     * **参数解释**： 基线风险总数，包含配置风险、弱口令 **取值范围**： 0-2097152
     * minimum: 0
     * maximum: 2097152
     * @return baseline
     */
    public Integer getBaseline() {
        return baseline;
    }

    public void setBaseline(Integer baseline) {
        this.baseline = baseline;
    }

    public Host withIntrusion(Integer intrusion) {
        this.intrusion = intrusion;
        return this;
    }

    /**
     * **参数解释**： 入侵风险总数 **取值范围**： 0-2097152
     * minimum: 0
     * maximum: 2097152
     * @return intrusion
     */
    public Integer getIntrusion() {
        return intrusion;
    }

    public void setIntrusion(Integer intrusion) {
        this.intrusion = intrusion;
    }

    public Host withAssetValue(String assetValue) {
        this.assetValue = assetValue;
        return this;
    }

    /**
     * **参数解释**： 资产重要性 **取值范围**： 包含如下3种   - important ：重要资产   - common ：一般资产   - test ：测试资产
     * @return assetValue
     */
    public String getAssetValue() {
        return assetValue;
    }

    public void setAssetValue(String assetValue) {
        this.assetValue = assetValue;
    }

    public Host withLabels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    public Host addLabelsItem(String labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    public Host withLabels(Consumer<List<String>> labelsSetter) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        labelsSetter.accept(this.labels);
        return this;
    }

    /**
     * **参数解释**： 标签列表 **取值范围**： 不涉及
     * @return labels
     */
    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public Host withAgentCreateTime(Long agentCreateTime) {
        this.agentCreateTime = agentCreateTime;
        return this;
    }

    /**
     * **参数解释**： agent安装时间，采用时间戳，默认毫秒 **取值范围**： 0-4824695185000
     * minimum: 0
     * maximum: 4824695185000
     * @return agentCreateTime
     */
    public Long getAgentCreateTime() {
        return agentCreateTime;
    }

    public void setAgentCreateTime(Long agentCreateTime) {
        this.agentCreateTime = agentCreateTime;
    }

    public Host withAgentUpdateTime(Long agentUpdateTime) {
        this.agentUpdateTime = agentUpdateTime;
        return this;
    }

    /**
     * **参数解释**： agent状态修改时间，采用时间戳，默认毫秒 **取值范围**： 0-4824695185000
     * minimum: 0
     * maximum: 4824695185000
     * @return agentUpdateTime
     */
    public Long getAgentUpdateTime() {
        return agentUpdateTime;
    }

    public void setAgentUpdateTime(Long agentUpdateTime) {
        this.agentUpdateTime = agentUpdateTime;
    }

    public Host withAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }

    /**
     * **参数解释**： agent版本 **取值范围**： 字符长度0-32位
     * @return agentVersion
     */
    public String getAgentVersion() {
        return agentVersion;
    }

    public void setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
    }

    public Host withUpgradeStatus(String upgradeStatus) {
        this.upgradeStatus = upgradeStatus;
        return this;
    }

    /**
     * **参数解释**： 升级状态 **取值范围**： 包含如下4种。   - not_upgrade ：未升级，也就是默认状态，客户还没有给这台机器下发过升级。   - upgrading ：正在升级中。   - upgrade_failed ：升级失败。   - upgrade_succeed ：升级成功。
     * @return upgradeStatus
     */
    public String getUpgradeStatus() {
        return upgradeStatus;
    }

    public void setUpgradeStatus(String upgradeStatus) {
        this.upgradeStatus = upgradeStatus;
    }

    public Host withUpgradeResultCode(String upgradeResultCode) {
        this.upgradeResultCode = upgradeResultCode;
        return this;
    }

    /**
     * **参数解释**： 升级失败原因，只有当upgrade_status为upgrade_failed时才显示 **取值范围**： 包含如下6种。   - package_unavailable ：升级包解析失败，升级文件有错误。   - network_access_timeout ：下载升级包失败，网络异常。   - agent_offline ：agent离线。   - hostguard_abnormal ：agent工作进程异常。   - insufficient_disk_space ：磁盘空间不足。   - failed_to_replace_file ：替换文件失败。
     * @return upgradeResultCode
     */
    public String getUpgradeResultCode() {
        return upgradeResultCode;
    }

    public void setUpgradeResultCode(String upgradeResultCode) {
        this.upgradeResultCode = upgradeResultCode;
    }

    public Host withUpgradable(Boolean upgradable) {
        this.upgradable = upgradable;
        return this;
    }

    /**
     * **参数解释**： 该服务器agent是否可升级 **取值范围**： true或者false
     * @return upgradable
     */
    public Boolean getUpgradable() {
        return upgradable;
    }

    public void setUpgradable(Boolean upgradable) {
        this.upgradable = upgradable;
    }

    public Host withOpenTime(Long openTime) {
        this.openTime = openTime;
        return this;
    }

    /**
     * **参数解释**： 开启防护时间，采用时间戳，默认毫秒 **取值范围**： 0-4824695185000
     * minimum: 0
     * maximum: 4824695185000
     * @return openTime
     */
    public Long getOpenTime() {
        return openTime;
    }

    public void setOpenTime(Long openTime) {
        this.openTime = openTime;
    }

    public Host withProtectInterrupt(Boolean protectInterrupt) {
        this.protectInterrupt = protectInterrupt;
        return this;
    }

    /**
     * **参数解释**： 防护是否中断 **取值范围**： true或者false
     * @return protectInterrupt
     */
    public Boolean getProtectInterrupt() {
        return protectInterrupt;
    }

    public void setProtectInterrupt(Boolean protectInterrupt) {
        this.protectInterrupt = protectInterrupt;
    }

    public Host withProtectDegradation(Boolean protectDegradation) {
        this.protectDegradation = protectDegradation;
        return this;
    }

    /**
     * **参数解释**： 防护是否降级 **取值范围**： true或者false
     * @return protectDegradation
     */
    public Boolean getProtectDegradation() {
        return protectDegradation;
    }

    public void setProtectDegradation(Boolean protectDegradation) {
        this.protectDegradation = protectDegradation;
    }

    public Host withHostSources(HostSourcesEnum hostSources) {
        this.hostSources = hostSources;
        return this;
    }

    /**
     * **参数解释**： 服务器来源 **取值范围**： 包含如下3种。   - ecs ：华为云ecs。   - outside ：非华为云机器。   - workspace ：华为云workspace。
     * @return hostSources
     */
    public HostSourcesEnum getHostSources() {
        return hostSources;
    }

    public void setHostSources(HostSourcesEnum hostSources) {
        this.hostSources = hostSources;
    }

    public Host withInterruptReason(String interruptReason) {
        this.interruptReason = interruptReason;
        return this;
    }

    /**
     * **参数解释**： 防护中断原因 **取值范围**： 字符长度1-32位
     * @return interruptReason
     */
    public String getInterruptReason() {
        return interruptReason;
    }

    public void setInterruptReason(String interruptReason) {
        this.interruptReason = interruptReason;
    }

    public Host withDegradationReason(String degradationReason) {
        this.degradationReason = degradationReason;
        return this;
    }

    /**
     * **参数解释**： 防护降级原因 **取值范围**： 字符长度1-32位
     * @return degradationReason
     */
    public String getDegradationReason() {
        return degradationReason;
    }

    public void setDegradationReason(String degradationReason) {
        this.degradationReason = degradationReason;
    }

    public Host withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * **参数解释**： 使用的密钥对名称 **取值范围**： 字符长度1-32位
     * @return keyName
     */
    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public Host withAutoOpenVersion(String autoOpenVersion) {
        this.autoOpenVersion = autoOpenVersion;
        return this;
    }

    /**
     * **参数解释**： cce购买主机 **取值范围**： 字符长度1-32位
     * @return autoOpenVersion
     */
    public String getAutoOpenVersion() {
        return autoOpenVersion;
    }

    public void setAutoOpenVersion(String autoOpenVersion) {
        this.autoOpenVersion = autoOpenVersion;
    }

    public Host withInstallProgress(Integer installProgress) {
        this.installProgress = installProgress;
        return this;
    }

    /**
     * **参数解释**： 安装进度 **取值范围**： 0-100
     * minimum: 0
     * maximum: 100
     * @return installProgress
     */
    public Integer getInstallProgress() {
        return installProgress;
    }

    public void setInstallProgress(Integer installProgress) {
        this.installProgress = installProgress;
    }

    public Host withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * **参数解释**： vpc id **取值范围**： 字符长度0-128位
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public Host withCommonLoginAreaCodes(List<Integer> commonLoginAreaCodes) {
        this.commonLoginAreaCodes = commonLoginAreaCodes;
        return this;
    }

    public Host addCommonLoginAreaCodesItem(Integer commonLoginAreaCodesItem) {
        if (this.commonLoginAreaCodes == null) {
            this.commonLoginAreaCodes = new ArrayList<>();
        }
        this.commonLoginAreaCodes.add(commonLoginAreaCodesItem);
        return this;
    }

    public Host withCommonLoginAreaCodes(Consumer<List<Integer>> commonLoginAreaCodesSetter) {
        if (this.commonLoginAreaCodes == null) {
            this.commonLoginAreaCodes = new ArrayList<>();
        }
        commonLoginAreaCodesSetter.accept(this.commonLoginAreaCodes);
        return this;
    }

    /**
     * **参数解释**： 后台识别服务器常用登录地编号 **取值范围**： 不涉及
     * @return commonLoginAreaCodes
     */
    public List<Integer> getCommonLoginAreaCodes() {
        return commonLoginAreaCodes;
    }

    public void setCommonLoginAreaCodes(List<Integer> commonLoginAreaCodes) {
        this.commonLoginAreaCodes = commonLoginAreaCodes;
    }

    public Host withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * **参数解释**： 集群名称 **取值范围**： 字符长度1-128位
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public Host withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * **参数解释**： 集群id **取值范围**： 字符长度1-128位
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Host that = (Host) obj;
        return Objects.equals(this.hostName, that.hostName) && Objects.equals(this.hostId, that.hostId)
            && Objects.equals(this.agentId, that.agentId) && Objects.equals(this.privateIp, that.privateIp)
            && Objects.equals(this.publicIp, that.publicIp)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.enterpriseProjectName, that.enterpriseProjectName)
            && Objects.equals(this.osName, that.osName) && Objects.equals(this.osVersion, that.osVersion)
            && Objects.equals(this.kernelVersion, that.kernelVersion)
            && Objects.equals(this.hostStatus, that.hostStatus) && Objects.equals(this.agentStatus, that.agentStatus)
            && Objects.equals(this.installResultCode, that.installResultCode)
            && Objects.equals(this.version, that.version) && Objects.equals(this.protectStatus, that.protectStatus)
            && Objects.equals(this.osImage, that.osImage) && Objects.equals(this.osType, that.osType)
            && Objects.equals(this.osBit, that.osBit) && Objects.equals(this.detectResult, that.detectResult)
            && Objects.equals(this.expireTime, that.expireTime) && Objects.equals(this.chargingMode, that.chargingMode)
            && Objects.equals(this.resourceId, that.resourceId) && Objects.equals(this.outsideHost, that.outsideHost)
            && Objects.equals(this.groupId, that.groupId) && Objects.equals(this.groupName, that.groupName)
            && Objects.equals(this.policyGroupId, that.policyGroupId)
            && Objects.equals(this.policyGroupName, that.policyGroupName) && Objects.equals(this.asset, that.asset)
            && Objects.equals(this.vulnerability, that.vulnerability) && Objects.equals(this.baseline, that.baseline)
            && Objects.equals(this.intrusion, that.intrusion) && Objects.equals(this.assetValue, that.assetValue)
            && Objects.equals(this.labels, that.labels) && Objects.equals(this.agentCreateTime, that.agentCreateTime)
            && Objects.equals(this.agentUpdateTime, that.agentUpdateTime)
            && Objects.equals(this.agentVersion, that.agentVersion)
            && Objects.equals(this.upgradeStatus, that.upgradeStatus)
            && Objects.equals(this.upgradeResultCode, that.upgradeResultCode)
            && Objects.equals(this.upgradable, that.upgradable) && Objects.equals(this.openTime, that.openTime)
            && Objects.equals(this.protectInterrupt, that.protectInterrupt)
            && Objects.equals(this.protectDegradation, that.protectDegradation)
            && Objects.equals(this.hostSources, that.hostSources)
            && Objects.equals(this.interruptReason, that.interruptReason)
            && Objects.equals(this.degradationReason, that.degradationReason)
            && Objects.equals(this.keyName, that.keyName) && Objects.equals(this.autoOpenVersion, that.autoOpenVersion)
            && Objects.equals(this.installProgress, that.installProgress) && Objects.equals(this.vpcId, that.vpcId)
            && Objects.equals(this.commonLoginAreaCodes, that.commonLoginAreaCodes)
            && Objects.equals(this.clusterName, that.clusterName) && Objects.equals(this.clusterId, that.clusterId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostName,
            hostId,
            agentId,
            privateIp,
            publicIp,
            enterpriseProjectId,
            enterpriseProjectName,
            osName,
            osVersion,
            kernelVersion,
            hostStatus,
            agentStatus,
            installResultCode,
            version,
            protectStatus,
            osImage,
            osType,
            osBit,
            detectResult,
            expireTime,
            chargingMode,
            resourceId,
            outsideHost,
            groupId,
            groupName,
            policyGroupId,
            policyGroupName,
            asset,
            vulnerability,
            baseline,
            intrusion,
            assetValue,
            labels,
            agentCreateTime,
            agentUpdateTime,
            agentVersion,
            upgradeStatus,
            upgradeResultCode,
            upgradable,
            openTime,
            protectInterrupt,
            protectDegradation,
            hostSources,
            interruptReason,
            degradationReason,
            keyName,
            autoOpenVersion,
            installProgress,
            vpcId,
            commonLoginAreaCodes,
            clusterName,
            clusterId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Host {\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
        sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    enterpriseProjectName: ").append(toIndentedString(enterpriseProjectName)).append("\n");
        sb.append("    osName: ").append(toIndentedString(osName)).append("\n");
        sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
        sb.append("    kernelVersion: ").append(toIndentedString(kernelVersion)).append("\n");
        sb.append("    hostStatus: ").append(toIndentedString(hostStatus)).append("\n");
        sb.append("    agentStatus: ").append(toIndentedString(agentStatus)).append("\n");
        sb.append("    installResultCode: ").append(toIndentedString(installResultCode)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    protectStatus: ").append(toIndentedString(protectStatus)).append("\n");
        sb.append("    osImage: ").append(toIndentedString(osImage)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    osBit: ").append(toIndentedString(osBit)).append("\n");
        sb.append("    detectResult: ").append(toIndentedString(detectResult)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    outsideHost: ").append(toIndentedString(outsideHost)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    policyGroupId: ").append(toIndentedString(policyGroupId)).append("\n");
        sb.append("    policyGroupName: ").append(toIndentedString(policyGroupName)).append("\n");
        sb.append("    asset: ").append(toIndentedString(asset)).append("\n");
        sb.append("    vulnerability: ").append(toIndentedString(vulnerability)).append("\n");
        sb.append("    baseline: ").append(toIndentedString(baseline)).append("\n");
        sb.append("    intrusion: ").append(toIndentedString(intrusion)).append("\n");
        sb.append("    assetValue: ").append(toIndentedString(assetValue)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    agentCreateTime: ").append(toIndentedString(agentCreateTime)).append("\n");
        sb.append("    agentUpdateTime: ").append(toIndentedString(agentUpdateTime)).append("\n");
        sb.append("    agentVersion: ").append(toIndentedString(agentVersion)).append("\n");
        sb.append("    upgradeStatus: ").append(toIndentedString(upgradeStatus)).append("\n");
        sb.append("    upgradeResultCode: ").append(toIndentedString(upgradeResultCode)).append("\n");
        sb.append("    upgradable: ").append(toIndentedString(upgradable)).append("\n");
        sb.append("    openTime: ").append(toIndentedString(openTime)).append("\n");
        sb.append("    protectInterrupt: ").append(toIndentedString(protectInterrupt)).append("\n");
        sb.append("    protectDegradation: ").append(toIndentedString(protectDegradation)).append("\n");
        sb.append("    hostSources: ").append(toIndentedString(hostSources)).append("\n");
        sb.append("    interruptReason: ").append(toIndentedString(interruptReason)).append("\n");
        sb.append("    degradationReason: ").append(toIndentedString(degradationReason)).append("\n");
        sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
        sb.append("    autoOpenVersion: ").append(toIndentedString(autoOpenVersion)).append("\n");
        sb.append("    installProgress: ").append(toIndentedString(installProgress)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    commonLoginAreaCodes: ").append(toIndentedString(commonLoginAreaCodes)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
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
