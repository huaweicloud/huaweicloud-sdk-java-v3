package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** InstanceListInfo */
public class InstanceListInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip_id")

    private String publicipId;

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
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_id")

    private String securityGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_ssl")

    private Boolean enableSsl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_memory")

    private Integer maxMemory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_memory")

    private Integer usedMemory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip_address")

    private String publicipAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "capacity")

    private Integer capacity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "capacity_minor")

    private String capacityMinor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

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
    @JsonProperty(value = "engine_version")

    private String engineVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_upgrade")

    private Boolean serviceUpgrade;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "no_password_access")

    private String noPasswordAccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_task_id")

    private String serviceTaskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_user")

    private String accessUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_publicip")

    private Boolean enablePublicip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_code")

    private String specCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<ResourceTag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_type")

    private String cpuType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_codes")

    private List<String> azCodes = null;

    public InstanceListInfo withPublicipId(String publicipId) {
        this.publicipId = publicipId;
        return this;
    }

    /** Redis缓存实例绑定的弹性IP地址的id。 如果未开启公网访问功能，该字段值为null。
     * 
     * @return publicipId */
    public String getPublicipId() {
        return publicipId;
    }

    public void setPublicipId(String publicipId) {
        this.publicipId = publicipId;
    }

    public InstanceListInfo withVpcName(String vpcName) {
        this.vpcName = vpcName;
        return this;
    }

    /** VPC的名称。
     * 
     * @return vpcName */
    public String getVpcName() {
        return vpcName;
    }

    public void setVpcName(String vpcName) {
        this.vpcName = vpcName;
    }

    public InstanceListInfo withChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /** 计费模式，0表示按需计费，1表示包年/包月计费。
     * 
     * @return chargingMode */
    public Integer getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
    }

    public InstanceListInfo withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /** VPC ID。
     * 
     * @return vpcId */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public InstanceListInfo withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /** 子网ID。
     * 
     * @return subnetId */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public InstanceListInfo withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    /** 安全组ID。
     * 
     * @return securityGroupId */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public InstanceListInfo withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /** 创建时间。格式为：2017-03-31T12:24:46.297Z
     * 
     * @return createdAt */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public InstanceListInfo withEnableSsl(Boolean enableSsl) {
        this.enableSsl = enableSsl;
        return this;
    }

    /** Redis缓存实例开启公网访问功能时，是否选择支持ssl。 - true：开启 - false：不开启
     * 
     * @return enableSsl */
    public Boolean getEnableSsl() {
        return enableSsl;
    }

    public void setEnableSsl(Boolean enableSsl) {
        this.enableSsl = enableSsl;
    }

    public InstanceListInfo withMaxMemory(Integer maxMemory) {
        this.maxMemory = maxMemory;
        return this;
    }

    /** 总内存，单位：MB。
     * 
     * @return maxMemory */
    public Integer getMaxMemory() {
        return maxMemory;
    }

    public void setMaxMemory(Integer maxMemory) {
        this.maxMemory = maxMemory;
    }

    public InstanceListInfo withUsedMemory(Integer usedMemory) {
        this.usedMemory = usedMemory;
        return this;
    }

    /** 已使用的内存，单位：MB。
     * 
     * @return usedMemory */
    public Integer getUsedMemory() {
        return usedMemory;
    }

    public void setUsedMemory(Integer usedMemory) {
        this.usedMemory = usedMemory;
    }

    public InstanceListInfo withPublicipAddress(String publicipAddress) {
        this.publicipAddress = publicipAddress;
        return this;
    }

    /** Redis缓存实例绑定的弹性IP地址。 如果未开启公网访问功能，该字段值为null。
     * 
     * @return publicipAddress */
    public String getPublicipAddress() {
        return publicipAddress;
    }

    public void setPublicipAddress(String publicipAddress) {
        this.publicipAddress = publicipAddress;
    }

    public InstanceListInfo withCapacity(Integer capacity) {
        this.capacity = capacity;
        return this;
    }

    /** 缓存容量（G Byte）。
     * 
     * @return capacity */
    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public InstanceListInfo withCapacityMinor(String capacityMinor) {
        this.capacityMinor = capacityMinor;
        return this;
    }

    /** 小规格缓存容量（G Byte）。
     * 
     * @return capacityMinor */
    public String getCapacityMinor() {
        return capacityMinor;
    }

    public void setCapacityMinor(String capacityMinor) {
        this.capacityMinor = capacityMinor;
    }

    public InstanceListInfo withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /** 订单ID，仅在创建包周期实例时返回。按需实例时此值为null
     * 
     * @return orderId */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public InstanceListInfo withMaintainBegin(String maintainBegin) {
        this.maintainBegin = maintainBegin;
        return this;
    }

    /** 维护时间窗开始时间，为UTC时间，格式为HH:mm:ss。
     * 
     * @return maintainBegin */
    public String getMaintainBegin() {
        return maintainBegin;
    }

    public void setMaintainBegin(String maintainBegin) {
        this.maintainBegin = maintainBegin;
    }

    public InstanceListInfo withMaintainEnd(String maintainEnd) {
        this.maintainEnd = maintainEnd;
        return this;
    }

    /** 维护时间窗结束时间，为UTC时间，格式为HH:mm:ss。
     * 
     * @return maintainEnd */
    public String getMaintainEnd() {
        return maintainEnd;
    }

    public void setMaintainEnd(String maintainEnd) {
        this.maintainEnd = maintainEnd;
    }

    public InstanceListInfo withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /** 缓存引擎。
     * 
     * @return engine */
    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public InstanceListInfo withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /** 缓存版本。
     * 
     * @return engineVersion */
    public String getEngineVersion() {
        return engineVersion;
    }

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    public InstanceListInfo withServiceUpgrade(Boolean serviceUpgrade) {
        this.serviceUpgrade = serviceUpgrade;
        return this;
    }

    /** 实例是否存在升级任务。 - true：存在 - false：不存在
     * 
     * @return serviceUpgrade */
    public Boolean getServiceUpgrade() {
        return serviceUpgrade;
    }

    public void setServiceUpgrade(Boolean serviceUpgrade) {
        this.serviceUpgrade = serviceUpgrade;
    }

    public InstanceListInfo withNoPasswordAccess(String noPasswordAccess) {
        this.noPasswordAccess = noPasswordAccess;
        return this;
    }

    /** 是否允许免密码访问缓存实例。 - true：该实例无需密码即可访问。 - false：该实例必须通过密码认证才能访问。
     * 
     * @return noPasswordAccess */
    public String getNoPasswordAccess() {
        return noPasswordAccess;
    }

    public void setNoPasswordAccess(String noPasswordAccess) {
        this.noPasswordAccess = noPasswordAccess;
    }

    public InstanceListInfo withServiceTaskId(String serviceTaskId) {
        this.serviceTaskId = serviceTaskId;
        return this;
    }

    /** 升级任务的ID。 - 当service_upgrade为true时，为升级任务的ID。 - 当service_upgrade为false时，该参数为空。
     * 
     * @return serviceTaskId */
    public String getServiceTaskId() {
        return serviceTaskId;
    }

    public void setServiceTaskId(String serviceTaskId) {
        this.serviceTaskId = serviceTaskId;
    }

    public InstanceListInfo withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /** 连接缓存实例的IP地址。如果是集群实例，返回多个IP地址，使用逗号分隔。如：192.168.0.1，192.168.0.2。
     * 
     * @return ip */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public InstanceListInfo withAccessUser(String accessUser) {
        this.accessUser = accessUser;
        return this;
    }

    /** 通过密码认证访问缓存实例的认证用户名。
     * 
     * @return accessUser */
    public String getAccessUser() {
        return accessUser;
    }

    public void setAccessUser(String accessUser) {
        this.accessUser = accessUser;
    }

    public InstanceListInfo withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /** 实例ID。
     * 
     * @return instanceId */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public InstanceListInfo withEnablePublicip(Boolean enablePublicip) {
        this.enablePublicip = enablePublicip;
        return this;
    }

    /** Redis缓存实例是否开启公网访问功能。 - true：开启 - false：不开启
     * 
     * @return enablePublicip */
    public Boolean getEnablePublicip() {
        return enablePublicip;
    }

    public void setEnablePublicip(Boolean enablePublicip) {
        this.enablePublicip = enablePublicip;
    }

    public InstanceListInfo withPort(Integer port) {
        this.port = port;
        return this;
    }

    /** 缓存的端口。
     * 
     * @return port */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public InstanceListInfo withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /** 用户id。
     * 
     * @return userId */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public InstanceListInfo withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /** 用户名。
     * 
     * @return userName */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public InstanceListInfo withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /** 实例的域名。
     * 
     * @return domainName */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public InstanceListInfo withName(String name) {
        this.name = name;
        return this;
    }

    /** 实例名称。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InstanceListInfo withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    /** 产品规格编码。
     * 
     * @return specCode */
    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    public InstanceListInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /** 实例状态。详细状态说明见[缓存实例状态说明](https://support.huaweicloud.com/api-dcs/dcs-api-0312047.html)。
     * 
     * @return status */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public InstanceListInfo withTags(List<ResourceTag> tags) {
        this.tags = tags;
        return this;
    }

    public InstanceListInfo addTagsItem(ResourceTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public InstanceListInfo withTags(Consumer<List<ResourceTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /** 实例标签键值。
     * 
     * @return tags */
    public List<ResourceTag> getTags() {
        return tags;
    }

    public void setTags(List<ResourceTag> tags) {
        this.tags = tags;
    }

    public InstanceListInfo withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /** 企业项目ID。
     * 
     * @return enterpriseProjectId */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public InstanceListInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 实例描述备注
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public InstanceListInfo withCpuType(String cpuType) {
        this.cpuType = cpuType;
        return this;
    }

    /** 实例CPU类型，通常为x86_64或aarch64
     * 
     * @return cpuType */
    public String getCpuType() {
        return cpuType;
    }

    public void setCpuType(String cpuType) {
        this.cpuType = cpuType;
    }

    public InstanceListInfo withAzCodes(List<String> azCodes) {
        this.azCodes = azCodes;
        return this;
    }

    public InstanceListInfo addAzCodesItem(String azCodesItem) {
        if (this.azCodes == null) {
            this.azCodes = new ArrayList<>();
        }
        this.azCodes.add(azCodesItem);
        return this;
    }

    public InstanceListInfo withAzCodes(Consumer<List<String>> azCodesSetter) {
        if (this.azCodes == null) {
            this.azCodes = new ArrayList<>();
        }
        azCodesSetter.accept(this.azCodes);
        return this;
    }

    /** 有资源的可用区编码。
     * 
     * @return azCodes */
    public List<String> getAzCodes() {
        return azCodes;
    }

    public void setAzCodes(List<String> azCodes) {
        this.azCodes = azCodes;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InstanceListInfo instanceListInfo = (InstanceListInfo) o;
        return Objects.equals(this.publicipId, instanceListInfo.publicipId)
            && Objects.equals(this.vpcName, instanceListInfo.vpcName)
            && Objects.equals(this.chargingMode, instanceListInfo.chargingMode)
            && Objects.equals(this.vpcId, instanceListInfo.vpcId)
            && Objects.equals(this.subnetId, instanceListInfo.subnetId)
            && Objects.equals(this.securityGroupId, instanceListInfo.securityGroupId)
            && Objects.equals(this.createdAt, instanceListInfo.createdAt)
            && Objects.equals(this.enableSsl, instanceListInfo.enableSsl)
            && Objects.equals(this.maxMemory, instanceListInfo.maxMemory)
            && Objects.equals(this.usedMemory, instanceListInfo.usedMemory)
            && Objects.equals(this.publicipAddress, instanceListInfo.publicipAddress)
            && Objects.equals(this.capacity, instanceListInfo.capacity)
            && Objects.equals(this.capacityMinor, instanceListInfo.capacityMinor)
            && Objects.equals(this.orderId, instanceListInfo.orderId)
            && Objects.equals(this.maintainBegin, instanceListInfo.maintainBegin)
            && Objects.equals(this.maintainEnd, instanceListInfo.maintainEnd)
            && Objects.equals(this.engine, instanceListInfo.engine)
            && Objects.equals(this.engineVersion, instanceListInfo.engineVersion)
            && Objects.equals(this.serviceUpgrade, instanceListInfo.serviceUpgrade)
            && Objects.equals(this.noPasswordAccess, instanceListInfo.noPasswordAccess)
            && Objects.equals(this.serviceTaskId, instanceListInfo.serviceTaskId)
            && Objects.equals(this.ip, instanceListInfo.ip)
            && Objects.equals(this.accessUser, instanceListInfo.accessUser)
            && Objects.equals(this.instanceId, instanceListInfo.instanceId)
            && Objects.equals(this.enablePublicip, instanceListInfo.enablePublicip)
            && Objects.equals(this.port, instanceListInfo.port) && Objects.equals(this.userId, instanceListInfo.userId)
            && Objects.equals(this.userName, instanceListInfo.userName)
            && Objects.equals(this.domainName, instanceListInfo.domainName)
            && Objects.equals(this.name, instanceListInfo.name)
            && Objects.equals(this.specCode, instanceListInfo.specCode)
            && Objects.equals(this.status, instanceListInfo.status) && Objects.equals(this.tags, instanceListInfo.tags)
            && Objects.equals(this.enterpriseProjectId, instanceListInfo.enterpriseProjectId)
            && Objects.equals(this.description, instanceListInfo.description)
            && Objects.equals(this.cpuType, instanceListInfo.cpuType)
            && Objects.equals(this.azCodes, instanceListInfo.azCodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publicipId,
            vpcName,
            chargingMode,
            vpcId,
            subnetId,
            securityGroupId,
            createdAt,
            enableSsl,
            maxMemory,
            usedMemory,
            publicipAddress,
            capacity,
            capacityMinor,
            orderId,
            maintainBegin,
            maintainEnd,
            engine,
            engineVersion,
            serviceUpgrade,
            noPasswordAccess,
            serviceTaskId,
            ip,
            accessUser,
            instanceId,
            enablePublicip,
            port,
            userId,
            userName,
            domainName,
            name,
            specCode,
            status,
            tags,
            enterpriseProjectId,
            description,
            cpuType,
            azCodes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceListInfo {\n");
        sb.append("    publicipId: ").append(toIndentedString(publicipId)).append("\n");
        sb.append("    vpcName: ").append(toIndentedString(vpcName)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    enableSsl: ").append(toIndentedString(enableSsl)).append("\n");
        sb.append("    maxMemory: ").append(toIndentedString(maxMemory)).append("\n");
        sb.append("    usedMemory: ").append(toIndentedString(usedMemory)).append("\n");
        sb.append("    publicipAddress: ").append(toIndentedString(publicipAddress)).append("\n");
        sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
        sb.append("    capacityMinor: ").append(toIndentedString(capacityMinor)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    maintainBegin: ").append(toIndentedString(maintainBegin)).append("\n");
        sb.append("    maintainEnd: ").append(toIndentedString(maintainEnd)).append("\n");
        sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
        sb.append("    engineVersion: ").append(toIndentedString(engineVersion)).append("\n");
        sb.append("    serviceUpgrade: ").append(toIndentedString(serviceUpgrade)).append("\n");
        sb.append("    noPasswordAccess: ").append(toIndentedString(noPasswordAccess)).append("\n");
        sb.append("    serviceTaskId: ").append(toIndentedString(serviceTaskId)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    accessUser: ").append(toIndentedString(accessUser)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    enablePublicip: ").append(toIndentedString(enablePublicip)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    cpuType: ").append(toIndentedString(cpuType)).append("\n");
        sb.append("    azCodes: ").append(toIndentedString(azCodes)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
