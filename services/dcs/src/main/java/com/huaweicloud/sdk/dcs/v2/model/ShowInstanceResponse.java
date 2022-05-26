package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowInstanceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_name")

    private String vpcName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charging_mode")

    private Integer chargingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_id")

    private String securityGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_name")

    private String securityGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_memory")

    private Integer maxMemory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_memory")

    private Integer usedMemory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "capacity")

    private Integer capacity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "capacity_minor")

    private String capacityMinor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maintain_begin")

    private String maintainBegin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maintain_end")

    private String maintainEnd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine")

    private String engine;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "no_password_access")

    private String noPasswordAccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_backup_policy")

    private InstanceBackupPolicy instanceBackupPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_codes")

    private List<String> azCodes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_user")

    private String accessUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_code")

    private String specCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_name")

    private String subnetName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_cidr")

    private String subnetCidr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_version")

    private String engineVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "readonly_domain_name")

    private String readonlyDomainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_publicip")

    private Boolean enablePublicip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip_id")

    private String publicipId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip_address")

    private String publicipAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_ssl")

    private Boolean enableSsl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_upgrade")

    private Boolean serviceUpgrade;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_task_id")

    private String serviceTaskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backend_addrs")

    private String backendAddrs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "features")

    private Features features;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name_info")

    private DomainNameInfo domainNameInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transparent_client_ip_enable")

    private Boolean transparentClientIpEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_status")

    private String subStatus;

    public ShowInstanceResponse withVpcName(String vpcName) {
        this.vpcName = vpcName;
        return this;
    }

    /**
     * VPC的名称。
     * @return vpcName
     */
    public String getVpcName() {
        return vpcName;
    }

    public void setVpcName(String vpcName) {
        this.vpcName = vpcName;
    }

    public ShowInstanceResponse withChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /**
     * 付费模式，0表示按需计费，1表示包年/包月计费。
     * @return chargingMode
     */
    public Integer getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
    }

    public ShowInstanceResponse withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * VPC ID
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public ShowInstanceResponse withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 用户名。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ShowInstanceResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 完成创建时间。格式为：2017-03-31T12:24:46.297Z
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ShowInstanceResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 实例描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowInstanceResponse withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    /**
     * 安全组ID。
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public ShowInstanceResponse withSecurityGroupName(String securityGroupName) {
        this.securityGroupName = securityGroupName;
        return this;
    }

    /**
     * 租户安全组名称。
     * @return securityGroupName
     */
    public String getSecurityGroupName() {
        return securityGroupName;
    }

    public void setSecurityGroupName(String securityGroupName) {
        this.securityGroupName = securityGroupName;
    }

    public ShowInstanceResponse withMaxMemory(Integer maxMemory) {
        this.maxMemory = maxMemory;
        return this;
    }

    /**
     * 总内存，单位：MB。
     * @return maxMemory
     */
    public Integer getMaxMemory() {
        return maxMemory;
    }

    public void setMaxMemory(Integer maxMemory) {
        this.maxMemory = maxMemory;
    }

    public ShowInstanceResponse withUsedMemory(Integer usedMemory) {
        this.usedMemory = usedMemory;
        return this;
    }

    /**
     * 已使用的内存，单位：MB。
     * @return usedMemory
     */
    public Integer getUsedMemory() {
        return usedMemory;
    }

    public void setUsedMemory(Integer usedMemory) {
        this.usedMemory = usedMemory;
    }

    public ShowInstanceResponse withCapacity(Integer capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * 缓存实例的容量（G Byte）。
     * @return capacity
     */
    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public ShowInstanceResponse withCapacityMinor(String capacityMinor) {
        this.capacityMinor = capacityMinor;
        return this;
    }

    /**
     * 单机小规格的缓存容量。
     * @return capacityMinor
     */
    public String getCapacityMinor() {
        return capacityMinor;
    }

    public void setCapacityMinor(String capacityMinor) {
        this.capacityMinor = capacityMinor;
    }

    public ShowInstanceResponse withMaintainBegin(String maintainBegin) {
        this.maintainBegin = maintainBegin;
        return this;
    }

    /**
     * 维护时间窗开始时间，为UTC时间，格式为HH:mm:ss
     * @return maintainBegin
     */
    public String getMaintainBegin() {
        return maintainBegin;
    }

    public void setMaintainBegin(String maintainBegin) {
        this.maintainBegin = maintainBegin;
    }

    public ShowInstanceResponse withMaintainEnd(String maintainEnd) {
        this.maintainEnd = maintainEnd;
        return this;
    }

    /**
     * 维护时间窗结束时间，为UTC时间，格式为HH:mm:ss
     * @return maintainEnd
     */
    public String getMaintainEnd() {
        return maintainEnd;
    }

    public void setMaintainEnd(String maintainEnd) {
        this.maintainEnd = maintainEnd;
    }

    public ShowInstanceResponse withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * 缓存实例的引擎类型。
     * @return engine
     */
    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public ShowInstanceResponse withNoPasswordAccess(String noPasswordAccess) {
        this.noPasswordAccess = noPasswordAccess;
        return this;
    }

    /**
     * 是否允许免密码访问缓存实例。 - true：该实例无需密码即可访问。 - false：该实例必须通过密码认证才能访问。 
     * @return noPasswordAccess
     */
    public String getNoPasswordAccess() {
        return noPasswordAccess;
    }

    public void setNoPasswordAccess(String noPasswordAccess) {
        this.noPasswordAccess = noPasswordAccess;
    }

    public ShowInstanceResponse withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * 连接缓存实例的IP地址。如果是集群实例，返回多个IP地址，使用逗号分隔。如：192.168.0.1，192.168.0.2。
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public ShowInstanceResponse withInstanceBackupPolicy(InstanceBackupPolicy instanceBackupPolicy) {
        this.instanceBackupPolicy = instanceBackupPolicy;
        return this;
    }

    public ShowInstanceResponse withInstanceBackupPolicy(Consumer<InstanceBackupPolicy> instanceBackupPolicySetter) {
        if (this.instanceBackupPolicy == null) {
            this.instanceBackupPolicy = new InstanceBackupPolicy();
            instanceBackupPolicySetter.accept(this.instanceBackupPolicy);
        }

        return this;
    }

    /**
     * Get instanceBackupPolicy
     * @return instanceBackupPolicy
     */
    public InstanceBackupPolicy getInstanceBackupPolicy() {
        return instanceBackupPolicy;
    }

    public void setInstanceBackupPolicy(InstanceBackupPolicy instanceBackupPolicy) {
        this.instanceBackupPolicy = instanceBackupPolicy;
    }

    public ShowInstanceResponse withAzCodes(List<String> azCodes) {
        this.azCodes = azCodes;
        return this;
    }

    public ShowInstanceResponse addAzCodesItem(String azCodesItem) {
        if (this.azCodes == null) {
            this.azCodes = new ArrayList<>();
        }
        this.azCodes.add(azCodesItem);
        return this;
    }

    public ShowInstanceResponse withAzCodes(Consumer<List<String>> azCodesSetter) {
        if (this.azCodes == null) {
            this.azCodes = new ArrayList<>();
        }
        azCodesSetter.accept(this.azCodes);
        return this;
    }

    /**
     * 实例所在的可用区。返回“可用区Code”
     * @return azCodes
     */
    public List<String> getAzCodes() {
        return azCodes;
    }

    public void setAzCodes(List<String> azCodes) {
        this.azCodes = azCodes;
    }

    public ShowInstanceResponse withAccessUser(String accessUser) {
        this.accessUser = accessUser;
        return this;
    }

    /**
     * 通过密码认证访问缓存实例的认证用户名。
     * @return accessUser
     */
    public String getAccessUser() {
        return accessUser;
    }

    public void setAccessUser(String accessUser) {
        this.accessUser = accessUser;
    }

    public ShowInstanceResponse withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ShowInstanceResponse withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * 缓存的端口。
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public ShowInstanceResponse withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 用户id。
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ShowInstanceResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 实例名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowInstanceResponse withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    /**
     * 产品规格编码
     * @return specCode
     */
    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    public ShowInstanceResponse withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * 子网ID。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public ShowInstanceResponse withSubnetName(String subnetName) {
        this.subnetName = subnetName;
        return this;
    }

    /**
     * 子网名称。
     * @return subnetName
     */
    public String getSubnetName() {
        return subnetName;
    }

    public void setSubnetName(String subnetName) {
        this.subnetName = subnetName;
    }

    public ShowInstanceResponse withSubnetCidr(String subnetCidr) {
        this.subnetCidr = subnetCidr;
        return this;
    }

    /**
     * 子网网段。
     * @return subnetCidr
     */
    public String getSubnetCidr() {
        return subnetCidr;
    }

    public void setSubnetCidr(String subnetCidr) {
        this.subnetCidr = subnetCidr;
    }

    public ShowInstanceResponse withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * 缓存版本。
     * @return engineVersion
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    public ShowInstanceResponse withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 订单ID。
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public ShowInstanceResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 缓存实例的状态。详细状态说明见[缓存实例状态说明](https://support.huaweicloud.com/api-dcs/dcs-api-0312047.html)
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowInstanceResponse withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * 实例的域名。
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public ShowInstanceResponse withReadonlyDomainName(String readonlyDomainName) {
        this.readonlyDomainName = readonlyDomainName;
        return this;
    }

    /**
     * 实例的只读域名，只有主备实例有该字段。
     * @return readonlyDomainName
     */
    public String getReadonlyDomainName() {
        return readonlyDomainName;
    }

    public void setReadonlyDomainName(String readonlyDomainName) {
        this.readonlyDomainName = readonlyDomainName;
    }

    public ShowInstanceResponse withEnablePublicip(Boolean enablePublicip) {
        this.enablePublicip = enablePublicip;
        return this;
    }

    /**
     * Redis缓存实例是否开启公网访问功能。 - true：开启 - false：不开启 
     * @return enablePublicip
     */
    public Boolean getEnablePublicip() {
        return enablePublicip;
    }

    public void setEnablePublicip(Boolean enablePublicip) {
        this.enablePublicip = enablePublicip;
    }

    public ShowInstanceResponse withPublicipId(String publicipId) {
        this.publicipId = publicipId;
        return this;
    }

    /**
     * Redis缓存实例绑定的弹性IP地址的id。 如果未开启公网访问功能，该字段值为null。 
     * @return publicipId
     */
    public String getPublicipId() {
        return publicipId;
    }

    public void setPublicipId(String publicipId) {
        this.publicipId = publicipId;
    }

    public ShowInstanceResponse withPublicipAddress(String publicipAddress) {
        this.publicipAddress = publicipAddress;
        return this;
    }

    /**
     * Redis缓存实例绑定的弹性IP地址。 如果未开启公网访问功能，该字段值为null。 
     * @return publicipAddress
     */
    public String getPublicipAddress() {
        return publicipAddress;
    }

    public void setPublicipAddress(String publicipAddress) {
        this.publicipAddress = publicipAddress;
    }

    public ShowInstanceResponse withEnableSsl(Boolean enableSsl) {
        this.enableSsl = enableSsl;
        return this;
    }

    /**
     * Redis缓存实例开启公网访问功能时，是否选择支持ssl。 - true：开启 - false：不开启 
     * @return enableSsl
     */
    public Boolean getEnableSsl() {
        return enableSsl;
    }

    public void setEnableSsl(Boolean enableSsl) {
        this.enableSsl = enableSsl;
    }

    public ShowInstanceResponse withServiceUpgrade(Boolean serviceUpgrade) {
        this.serviceUpgrade = serviceUpgrade;
        return this;
    }

    /**
     * 实例是否存在升级任务。 - true：存在 - false：不存在 
     * @return serviceUpgrade
     */
    public Boolean getServiceUpgrade() {
        return serviceUpgrade;
    }

    public void setServiceUpgrade(Boolean serviceUpgrade) {
        this.serviceUpgrade = serviceUpgrade;
    }

    public ShowInstanceResponse withServiceTaskId(String serviceTaskId) {
        this.serviceTaskId = serviceTaskId;
        return this;
    }

    /**
     * 升级任务的ID。 - 当service_upgrade为true时，为升级任务的ID。 - 当service_upgrade为false时，该参数为空。 
     * @return serviceTaskId
     */
    public String getServiceTaskId() {
        return serviceTaskId;
    }

    public void setServiceTaskId(String serviceTaskId) {
        this.serviceTaskId = serviceTaskId;
    }

    public ShowInstanceResponse withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ShowInstanceResponse withBackendAddrs(String backendAddrs) {
        this.backendAddrs = backendAddrs;
        return this;
    }

    /**
     * 集群实例的后端服务地址。
     * @return backendAddrs
     */
    public String getBackendAddrs() {
        return backendAddrs;
    }

    public void setBackendAddrs(String backendAddrs) {
        this.backendAddrs = backendAddrs;
    }

    public ShowInstanceResponse withFeatures(Features features) {
        this.features = features;
        return this;
    }

    public ShowInstanceResponse withFeatures(Consumer<Features> featuresSetter) {
        if (this.features == null) {
            this.features = new Features();
            featuresSetter.accept(this.features);
        }

        return this;
    }

    /**
     * Get features
     * @return features
     */
    public Features getFeatures() {
        return features;
    }

    public void setFeatures(Features features) {
        this.features = features;
    }

    public ShowInstanceResponse withDomainNameInfo(DomainNameInfo domainNameInfo) {
        this.domainNameInfo = domainNameInfo;
        return this;
    }

    public ShowInstanceResponse withDomainNameInfo(Consumer<DomainNameInfo> domainNameInfoSetter) {
        if (this.domainNameInfo == null) {
            this.domainNameInfo = new DomainNameInfo();
            domainNameInfoSetter.accept(this.domainNameInfo);
        }

        return this;
    }

    /**
     * Get domainNameInfo
     * @return domainNameInfo
     */
    public DomainNameInfo getDomainNameInfo() {
        return domainNameInfo;
    }

    public void setDomainNameInfo(DomainNameInfo domainNameInfo) {
        this.domainNameInfo = domainNameInfo;
    }

    public ShowInstanceResponse withTransparentClientIpEnable(Boolean transparentClientIpEnable) {
        this.transparentClientIpEnable = transparentClientIpEnable;
        return this;
    }

    /**
     * 是否开启客户端ip透传。
     * @return transparentClientIpEnable
     */
    public Boolean getTransparentClientIpEnable() {
        return transparentClientIpEnable;
    }

    public void setTransparentClientIpEnable(Boolean transparentClientIpEnable) {
        this.transparentClientIpEnable = transparentClientIpEnable;
    }

    public ShowInstanceResponse withSubStatus(String subStatus) {
        this.subStatus = subStatus;
        return this;
    }

    /**
     * 实例子状态。
     * @return subStatus
     */
    public String getSubStatus() {
        return subStatus;
    }

    public void setSubStatus(String subStatus) {
        this.subStatus = subStatus;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowInstanceResponse showInstanceResponse = (ShowInstanceResponse) o;
        return Objects.equals(this.vpcName, showInstanceResponse.vpcName)
            && Objects.equals(this.chargingMode, showInstanceResponse.chargingMode)
            && Objects.equals(this.vpcId, showInstanceResponse.vpcId)
            && Objects.equals(this.userName, showInstanceResponse.userName)
            && Objects.equals(this.createdAt, showInstanceResponse.createdAt)
            && Objects.equals(this.description, showInstanceResponse.description)
            && Objects.equals(this.securityGroupId, showInstanceResponse.securityGroupId)
            && Objects.equals(this.securityGroupName, showInstanceResponse.securityGroupName)
            && Objects.equals(this.maxMemory, showInstanceResponse.maxMemory)
            && Objects.equals(this.usedMemory, showInstanceResponse.usedMemory)
            && Objects.equals(this.capacity, showInstanceResponse.capacity)
            && Objects.equals(this.capacityMinor, showInstanceResponse.capacityMinor)
            && Objects.equals(this.maintainBegin, showInstanceResponse.maintainBegin)
            && Objects.equals(this.maintainEnd, showInstanceResponse.maintainEnd)
            && Objects.equals(this.engine, showInstanceResponse.engine)
            && Objects.equals(this.noPasswordAccess, showInstanceResponse.noPasswordAccess)
            && Objects.equals(this.ip, showInstanceResponse.ip)
            && Objects.equals(this.instanceBackupPolicy, showInstanceResponse.instanceBackupPolicy)
            && Objects.equals(this.azCodes, showInstanceResponse.azCodes)
            && Objects.equals(this.accessUser, showInstanceResponse.accessUser)
            && Objects.equals(this.instanceId, showInstanceResponse.instanceId)
            && Objects.equals(this.port, showInstanceResponse.port)
            && Objects.equals(this.userId, showInstanceResponse.userId)
            && Objects.equals(this.name, showInstanceResponse.name)
            && Objects.equals(this.specCode, showInstanceResponse.specCode)
            && Objects.equals(this.subnetId, showInstanceResponse.subnetId)
            && Objects.equals(this.subnetName, showInstanceResponse.subnetName)
            && Objects.equals(this.subnetCidr, showInstanceResponse.subnetCidr)
            && Objects.equals(this.engineVersion, showInstanceResponse.engineVersion)
            && Objects.equals(this.orderId, showInstanceResponse.orderId)
            && Objects.equals(this.status, showInstanceResponse.status)
            && Objects.equals(this.domainName, showInstanceResponse.domainName)
            && Objects.equals(this.readonlyDomainName, showInstanceResponse.readonlyDomainName)
            && Objects.equals(this.enablePublicip, showInstanceResponse.enablePublicip)
            && Objects.equals(this.publicipId, showInstanceResponse.publicipId)
            && Objects.equals(this.publicipAddress, showInstanceResponse.publicipAddress)
            && Objects.equals(this.enableSsl, showInstanceResponse.enableSsl)
            && Objects.equals(this.serviceUpgrade, showInstanceResponse.serviceUpgrade)
            && Objects.equals(this.serviceTaskId, showInstanceResponse.serviceTaskId)
            && Objects.equals(this.enterpriseProjectId, showInstanceResponse.enterpriseProjectId)
            && Objects.equals(this.backendAddrs, showInstanceResponse.backendAddrs)
            && Objects.equals(this.features, showInstanceResponse.features)
            && Objects.equals(this.domainNameInfo, showInstanceResponse.domainNameInfo)
            && Objects.equals(this.transparentClientIpEnable, showInstanceResponse.transparentClientIpEnable)
            && Objects.equals(this.subStatus, showInstanceResponse.subStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpcName,
            chargingMode,
            vpcId,
            userName,
            createdAt,
            description,
            securityGroupId,
            securityGroupName,
            maxMemory,
            usedMemory,
            capacity,
            capacityMinor,
            maintainBegin,
            maintainEnd,
            engine,
            noPasswordAccess,
            ip,
            instanceBackupPolicy,
            azCodes,
            accessUser,
            instanceId,
            port,
            userId,
            name,
            specCode,
            subnetId,
            subnetName,
            subnetCidr,
            engineVersion,
            orderId,
            status,
            domainName,
            readonlyDomainName,
            enablePublicip,
            publicipId,
            publicipAddress,
            enableSsl,
            serviceUpgrade,
            serviceTaskId,
            enterpriseProjectId,
            backendAddrs,
            features,
            domainNameInfo,
            transparentClientIpEnable,
            subStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstanceResponse {\n");
        sb.append("    vpcName: ").append(toIndentedString(vpcName)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    securityGroupName: ").append(toIndentedString(securityGroupName)).append("\n");
        sb.append("    maxMemory: ").append(toIndentedString(maxMemory)).append("\n");
        sb.append("    usedMemory: ").append(toIndentedString(usedMemory)).append("\n");
        sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
        sb.append("    capacityMinor: ").append(toIndentedString(capacityMinor)).append("\n");
        sb.append("    maintainBegin: ").append(toIndentedString(maintainBegin)).append("\n");
        sb.append("    maintainEnd: ").append(toIndentedString(maintainEnd)).append("\n");
        sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
        sb.append("    noPasswordAccess: ").append(toIndentedString(noPasswordAccess)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    instanceBackupPolicy: ").append(toIndentedString(instanceBackupPolicy)).append("\n");
        sb.append("    azCodes: ").append(toIndentedString(azCodes)).append("\n");
        sb.append("    accessUser: ").append(toIndentedString(accessUser)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    subnetName: ").append(toIndentedString(subnetName)).append("\n");
        sb.append("    subnetCidr: ").append(toIndentedString(subnetCidr)).append("\n");
        sb.append("    engineVersion: ").append(toIndentedString(engineVersion)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    readonlyDomainName: ").append(toIndentedString(readonlyDomainName)).append("\n");
        sb.append("    enablePublicip: ").append(toIndentedString(enablePublicip)).append("\n");
        sb.append("    publicipId: ").append(toIndentedString(publicipId)).append("\n");
        sb.append("    publicipAddress: ").append(toIndentedString(publicipAddress)).append("\n");
        sb.append("    enableSsl: ").append(toIndentedString(enableSsl)).append("\n");
        sb.append("    serviceUpgrade: ").append(toIndentedString(serviceUpgrade)).append("\n");
        sb.append("    serviceTaskId: ").append(toIndentedString(serviceTaskId)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    backendAddrs: ").append(toIndentedString(backendAddrs)).append("\n");
        sb.append("    features: ").append(toIndentedString(features)).append("\n");
        sb.append("    domainNameInfo: ").append(toIndentedString(domainNameInfo)).append("\n");
        sb.append("    transparentClientIpEnable: ").append(toIndentedString(transparentClientIpEnable)).append("\n");
        sb.append("    subStatus: ").append(toIndentedString(subStatus)).append("\n");
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
