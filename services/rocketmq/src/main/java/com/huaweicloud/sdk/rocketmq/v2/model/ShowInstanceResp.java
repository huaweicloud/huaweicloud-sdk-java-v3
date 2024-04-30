package com.huaweicloud.sdk.rocketmq.v2.model;

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
 * ShowInstanceResp
 */
public class ShowInstanceResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine")

    private String engine;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /**
     * 实例类型：集群，cluster。
     */
    public static final class TypeEnum {

        /**
         * Enum SINGLE for value: "single"
         */
        public static final TypeEnum SINGLE = new TypeEnum("single");

        /**
         * Enum CLUSTER for value: "cluster"
         */
        public static final TypeEnum CLUSTER = new TypeEnum("cluster");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("single", SINGLE);
            map.put("cluster", CLUSTER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "specification")

    private String specification;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_version")

    private String engineVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charging_mode")

    private Integer chargingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_name")

    private String vpcName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_id")

    private String securityGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_name")

    private String securityGroupName;

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
    @JsonProperty(value = "available_zones")

    private List<String> availableZones = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_zone_names")

    private List<String> availableZoneNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maintain_begin")

    private String maintainBegin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maintain_end")

    private String maintainEnd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_log_collection")

    private Boolean enableLogCollection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_space")

    private Integer storageSpace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_storage_space")

    private Integer usedStorageSpace;

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
    @JsonProperty(value = "ssl_enable")

    private Boolean sslEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cross_vpc_info")

    private String crossVpcInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_resource_id")

    private String storageResourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_spec_code")

    private String storageSpecCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type")

    private String serviceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_type")

    private String storageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_times")

    private Long extendTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_enable")

    private Boolean ipv6Enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_features")

    private String supportFeatures;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_encrypted")

    private Boolean diskEncrypted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ces_version")

    private String cesVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_num")

    private Integer nodeNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_spec_billing_enable")

    private Boolean newSpecBillingEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_acl")

    private Boolean enableAcl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "broker_num")

    private Integer brokerNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namesrv_address")

    private String namesrvAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "broker_address")

    private String brokerAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_namesrv_address")

    private String publicNamesrvAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_broker_address")

    private String publicBrokerAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "grpc_address")

    private String grpcAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_grpc_address")

    private String publicGrpcAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TagEntity> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_storage_space")

    private Integer totalStorageSpace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_spec_code")

    private String resourceSpecCode;

    public ShowInstanceResp withName(String name) {
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

    public ShowInstanceResp withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * 引擎。
     * @return engine
     */
    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public ShowInstanceResp withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowInstanceResp withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 消息描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowInstanceResp withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 实例类型：集群，cluster。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ShowInstanceResp withSpecification(String specification) {
        this.specification = specification;
        return this;
    }

    /**
     * 实例规格。
     * @return specification
     */
    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public ShowInstanceResp withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * 版本。
     * @return engineVersion
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    public ShowInstanceResp withInstanceId(String instanceId) {
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

    public ShowInstanceResp withChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /**
     * [付费模式，1表示按需计费。](tag:hws_eu,g42,hk_g42,tm,sbc,hk_sbc,hk_tm)[付费模式，1表示按需计费，0表示包年/包月计费。](tag:hws,hws_eu,hws_hk,ctc) [计费模式，参数暂未使用。](tag:ocb,hws_ocb,hcs)
     * @return chargingMode
     */
    public Integer getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
    }

    public ShowInstanceResp withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 私有云ID。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public ShowInstanceResp withVpcName(String vpcName) {
        this.vpcName = vpcName;
        return this;
    }

    /**
     * 私有云名称。
     * @return vpcName
     */
    public String getVpcName() {
        return vpcName;
    }

    public void setVpcName(String vpcName) {
        this.vpcName = vpcName;
    }

    public ShowInstanceResp withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 完成创建时间。  格式为时间戳，指从格林威治时间1970年01月01日00时00分00秒起至指定时间的偏差总毫秒数。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ShowInstanceResp withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * 产品标识。
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public ShowInstanceResp withSecurityGroupId(String securityGroupId) {
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

    public ShowInstanceResp withSecurityGroupName(String securityGroupName) {
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

    public ShowInstanceResp withSubnetId(String subnetId) {
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

    public ShowInstanceResp withSubnetName(String subnetName) {
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

    public ShowInstanceResp withSubnetCidr(String subnetCidr) {
        this.subnetCidr = subnetCidr;
        return this;
    }

    /**
     * 子网路由（仅RocketMQ 5.x版本会显示此字段）。
     * @return subnetCidr
     */
    public String getSubnetCidr() {
        return subnetCidr;
    }

    public void setSubnetCidr(String subnetCidr) {
        this.subnetCidr = subnetCidr;
    }

    public ShowInstanceResp withAvailableZones(List<String> availableZones) {
        this.availableZones = availableZones;
        return this;
    }

    public ShowInstanceResp addAvailableZonesItem(String availableZonesItem) {
        if (this.availableZones == null) {
            this.availableZones = new ArrayList<>();
        }
        this.availableZones.add(availableZonesItem);
        return this;
    }

    public ShowInstanceResp withAvailableZones(Consumer<List<String>> availableZonesSetter) {
        if (this.availableZones == null) {
            this.availableZones = new ArrayList<>();
        }
        availableZonesSetter.accept(this.availableZones);
        return this;
    }

    /**
     * 可用区ID列表。
     * @return availableZones
     */
    public List<String> getAvailableZones() {
        return availableZones;
    }

    public void setAvailableZones(List<String> availableZones) {
        this.availableZones = availableZones;
    }

    public ShowInstanceResp withAvailableZoneNames(List<String> availableZoneNames) {
        this.availableZoneNames = availableZoneNames;
        return this;
    }

    public ShowInstanceResp addAvailableZoneNamesItem(String availableZoneNamesItem) {
        if (this.availableZoneNames == null) {
            this.availableZoneNames = new ArrayList<>();
        }
        this.availableZoneNames.add(availableZoneNamesItem);
        return this;
    }

    public ShowInstanceResp withAvailableZoneNames(Consumer<List<String>> availableZoneNamesSetter) {
        if (this.availableZoneNames == null) {
            this.availableZoneNames = new ArrayList<>();
        }
        availableZoneNamesSetter.accept(this.availableZoneNames);
        return this;
    }

    /**
     * 可用区名称列表。
     * @return availableZoneNames
     */
    public List<String> getAvailableZoneNames() {
        return availableZoneNames;
    }

    public void setAvailableZoneNames(List<String> availableZoneNames) {
        this.availableZoneNames = availableZoneNames;
    }

    public ShowInstanceResp withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 用户ID。
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ShowInstanceResp withUserName(String userName) {
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

    public ShowInstanceResp withMaintainBegin(String maintainBegin) {
        this.maintainBegin = maintainBegin;
        return this;
    }

    /**
     * 维护时间窗开始时间，格式为HH:mm:ss。
     * @return maintainBegin
     */
    public String getMaintainBegin() {
        return maintainBegin;
    }

    public void setMaintainBegin(String maintainBegin) {
        this.maintainBegin = maintainBegin;
    }

    public ShowInstanceResp withMaintainEnd(String maintainEnd) {
        this.maintainEnd = maintainEnd;
        return this;
    }

    /**
     * 维护时间窗结束时间，格式为HH:mm:ss。
     * @return maintainEnd
     */
    public String getMaintainEnd() {
        return maintainEnd;
    }

    public void setMaintainEnd(String maintainEnd) {
        this.maintainEnd = maintainEnd;
    }

    public ShowInstanceResp withEnableLogCollection(Boolean enableLogCollection) {
        this.enableLogCollection = enableLogCollection;
        return this;
    }

    /**
     * 是否开启消息收集功能。
     * @return enableLogCollection
     */
    public Boolean getEnableLogCollection() {
        return enableLogCollection;
    }

    public void setEnableLogCollection(Boolean enableLogCollection) {
        this.enableLogCollection = enableLogCollection;
    }

    public ShowInstanceResp withStorageSpace(Integer storageSpace) {
        this.storageSpace = storageSpace;
        return this;
    }

    /**
     * 存储空间，单位：GB。
     * @return storageSpace
     */
    public Integer getStorageSpace() {
        return storageSpace;
    }

    public void setStorageSpace(Integer storageSpace) {
        this.storageSpace = storageSpace;
    }

    public ShowInstanceResp withUsedStorageSpace(Integer usedStorageSpace) {
        this.usedStorageSpace = usedStorageSpace;
        return this;
    }

    /**
     * 已用消息存储空间，单位：GB。
     * @return usedStorageSpace
     */
    public Integer getUsedStorageSpace() {
        return usedStorageSpace;
    }

    public void setUsedStorageSpace(Integer usedStorageSpace) {
        this.usedStorageSpace = usedStorageSpace;
    }

    public ShowInstanceResp withEnablePublicip(Boolean enablePublicip) {
        this.enablePublicip = enablePublicip;
        return this;
    }

    /**
     * 是否开启公网。
     * @return enablePublicip
     */
    public Boolean getEnablePublicip() {
        return enablePublicip;
    }

    public void setEnablePublicip(Boolean enablePublicip) {
        this.enablePublicip = enablePublicip;
    }

    public ShowInstanceResp withPublicipId(String publicipId) {
        this.publicipId = publicipId;
        return this;
    }

    /**
     * 实例绑定的弹性IP地址的ID。 以英文逗号隔开多个弹性IP地址的ID。 如果开启了公网访问功能（即enable_publicip为true），该字段为必选。
     * @return publicipId
     */
    public String getPublicipId() {
        return publicipId;
    }

    public void setPublicipId(String publicipId) {
        this.publicipId = publicipId;
    }

    public ShowInstanceResp withPublicipAddress(String publicipAddress) {
        this.publicipAddress = publicipAddress;
        return this;
    }

    /**
     * 公网IP地址。
     * @return publicipAddress
     */
    public String getPublicipAddress() {
        return publicipAddress;
    }

    public void setPublicipAddress(String publicipAddress) {
        this.publicipAddress = publicipAddress;
    }

    public ShowInstanceResp withSslEnable(Boolean sslEnable) {
        this.sslEnable = sslEnable;
        return this;
    }

    /**
     * 是否开启SSL。
     * @return sslEnable
     */
    public Boolean getSslEnable() {
        return sslEnable;
    }

    public void setSslEnable(Boolean sslEnable) {
        this.sslEnable = sslEnable;
    }

    public ShowInstanceResp withCrossVpcInfo(String crossVpcInfo) {
        this.crossVpcInfo = crossVpcInfo;
        return this;
    }

    /**
     * 跨VPC访问信息。
     * @return crossVpcInfo
     */
    public String getCrossVpcInfo() {
        return crossVpcInfo;
    }

    public void setCrossVpcInfo(String crossVpcInfo) {
        this.crossVpcInfo = crossVpcInfo;
    }

    public ShowInstanceResp withStorageResourceId(String storageResourceId) {
        this.storageResourceId = storageResourceId;
        return this;
    }

    /**
     * 存储资源ID。
     * @return storageResourceId
     */
    public String getStorageResourceId() {
        return storageResourceId;
    }

    public void setStorageResourceId(String storageResourceId) {
        this.storageResourceId = storageResourceId;
    }

    public ShowInstanceResp withStorageSpecCode(String storageSpecCode) {
        this.storageSpecCode = storageSpecCode;
        return this;
    }

    /**
     * 存储规格代码。
     * @return storageSpecCode
     */
    public String getStorageSpecCode() {
        return storageSpecCode;
    }

    public void setStorageSpecCode(String storageSpecCode) {
        this.storageSpecCode = storageSpecCode;
    }

    public ShowInstanceResp withServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * 服务类型。
     * @return serviceType
     */
    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public ShowInstanceResp withStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }

    /**
     * 存储类型。
     * @return storageType
     */
    public String getStorageType() {
        return storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    public ShowInstanceResp withExtendTimes(Long extendTimes) {
        this.extendTimes = extendTimes;
        return this;
    }

    /**
     * 扩展时间。
     * @return extendTimes
     */
    public Long getExtendTimes() {
        return extendTimes;
    }

    public void setExtendTimes(Long extendTimes) {
        this.extendTimes = extendTimes;
    }

    public ShowInstanceResp withIpv6Enable(Boolean ipv6Enable) {
        this.ipv6Enable = ipv6Enable;
        return this;
    }

    /**
     * 是否开启IPv6。
     * @return ipv6Enable
     */
    public Boolean getIpv6Enable() {
        return ipv6Enable;
    }

    public void setIpv6Enable(Boolean ipv6Enable) {
        this.ipv6Enable = ipv6Enable;
    }

    public ShowInstanceResp withSupportFeatures(String supportFeatures) {
        this.supportFeatures = supportFeatures;
        return this;
    }

    /**
     * 实例支持的特性功能。
     * @return supportFeatures
     */
    public String getSupportFeatures() {
        return supportFeatures;
    }

    public void setSupportFeatures(String supportFeatures) {
        this.supportFeatures = supportFeatures;
    }

    public ShowInstanceResp withDiskEncrypted(Boolean diskEncrypted) {
        this.diskEncrypted = diskEncrypted;
        return this;
    }

    /**
     * 是否开启磁盘加密。
     * @return diskEncrypted
     */
    public Boolean getDiskEncrypted() {
        return diskEncrypted;
    }

    public void setDiskEncrypted(Boolean diskEncrypted) {
        this.diskEncrypted = diskEncrypted;
    }

    public ShowInstanceResp withCesVersion(String cesVersion) {
        this.cesVersion = cesVersion;
        return this;
    }

    /**
     * 云监控版本。
     * @return cesVersion
     */
    public String getCesVersion() {
        return cesVersion;
    }

    public void setCesVersion(String cesVersion) {
        this.cesVersion = cesVersion;
    }

    public ShowInstanceResp withNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
        return this;
    }

    /**
     * 节点数。
     * @return nodeNum
     */
    public Integer getNodeNum() {
        return nodeNum;
    }

    public void setNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
    }

    public ShowInstanceResp withNewSpecBillingEnable(Boolean newSpecBillingEnable) {
        this.newSpecBillingEnable = newSpecBillingEnable;
        return this;
    }

    /**
     * 是否启用新规格计费。
     * @return newSpecBillingEnable
     */
    public Boolean getNewSpecBillingEnable() {
        return newSpecBillingEnable;
    }

    public void setNewSpecBillingEnable(Boolean newSpecBillingEnable) {
        this.newSpecBillingEnable = newSpecBillingEnable;
    }

    public ShowInstanceResp withEnableAcl(Boolean enableAcl) {
        this.enableAcl = enableAcl;
        return this;
    }

    /**
     * 是否开启访问控制列表。
     * @return enableAcl
     */
    public Boolean getEnableAcl() {
        return enableAcl;
    }

    public void setEnableAcl(Boolean enableAcl) {
        this.enableAcl = enableAcl;
    }

    public ShowInstanceResp withBrokerNum(Integer brokerNum) {
        this.brokerNum = brokerNum;
        return this;
    }

    /**
     * 节点数（仅RocketMQ 4.8.0版本会显示此字段）。
     * @return brokerNum
     */
    public Integer getBrokerNum() {
        return brokerNum;
    }

    public void setBrokerNum(Integer brokerNum) {
        this.brokerNum = brokerNum;
    }

    public ShowInstanceResp withNamesrvAddress(String namesrvAddress) {
        this.namesrvAddress = namesrvAddress;
        return this;
    }

    /**
     * 元数据地址。
     * @return namesrvAddress
     */
    public String getNamesrvAddress() {
        return namesrvAddress;
    }

    public void setNamesrvAddress(String namesrvAddress) {
        this.namesrvAddress = namesrvAddress;
    }

    public ShowInstanceResp withBrokerAddress(String brokerAddress) {
        this.brokerAddress = brokerAddress;
        return this;
    }

    /**
     * 业务数据地址。
     * @return brokerAddress
     */
    public String getBrokerAddress() {
        return brokerAddress;
    }

    public void setBrokerAddress(String brokerAddress) {
        this.brokerAddress = brokerAddress;
    }

    public ShowInstanceResp withPublicNamesrvAddress(String publicNamesrvAddress) {
        this.publicNamesrvAddress = publicNamesrvAddress;
        return this;
    }

    /**
     * 公网元数据地址。
     * @return publicNamesrvAddress
     */
    public String getPublicNamesrvAddress() {
        return publicNamesrvAddress;
    }

    public void setPublicNamesrvAddress(String publicNamesrvAddress) {
        this.publicNamesrvAddress = publicNamesrvAddress;
    }

    public ShowInstanceResp withPublicBrokerAddress(String publicBrokerAddress) {
        this.publicBrokerAddress = publicBrokerAddress;
        return this;
    }

    /**
     * 公网业务数据地址。
     * @return publicBrokerAddress
     */
    public String getPublicBrokerAddress() {
        return publicBrokerAddress;
    }

    public void setPublicBrokerAddress(String publicBrokerAddress) {
        this.publicBrokerAddress = publicBrokerAddress;
    }

    public ShowInstanceResp withGrpcAddress(String grpcAddress) {
        this.grpcAddress = grpcAddress;
        return this;
    }

    /**
     * grpc连接地址（仅RocketMQ 5.x版本会显示此字段）。
     * @return grpcAddress
     */
    public String getGrpcAddress() {
        return grpcAddress;
    }

    public void setGrpcAddress(String grpcAddress) {
        this.grpcAddress = grpcAddress;
    }

    public ShowInstanceResp withPublicGrpcAddress(String publicGrpcAddress) {
        this.publicGrpcAddress = publicGrpcAddress;
        return this;
    }

    /**
     * 公网grpc连接地址（仅RocketMQ 5.x版本会显示此字段）。
     * @return publicGrpcAddress
     */
    public String getPublicGrpcAddress() {
        return publicGrpcAddress;
    }

    public void setPublicGrpcAddress(String publicGrpcAddress) {
        this.publicGrpcAddress = publicGrpcAddress;
    }

    public ShowInstanceResp withEnterpriseProjectId(String enterpriseProjectId) {
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

    public ShowInstanceResp withTags(List<TagEntity> tags) {
        this.tags = tags;
        return this;
    }

    public ShowInstanceResp addTagsItem(TagEntity tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ShowInstanceResp withTags(Consumer<List<TagEntity>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签列表。
     * @return tags
     */
    public List<TagEntity> getTags() {
        return tags;
    }

    public void setTags(List<TagEntity> tags) {
        this.tags = tags;
    }

    public ShowInstanceResp withTotalStorageSpace(Integer totalStorageSpace) {
        this.totalStorageSpace = totalStorageSpace;
        return this;
    }

    /**
     * 总存储空间。
     * @return totalStorageSpace
     */
    public Integer getTotalStorageSpace() {
        return totalStorageSpace;
    }

    public void setTotalStorageSpace(Integer totalStorageSpace) {
        this.totalStorageSpace = totalStorageSpace;
    }

    public ShowInstanceResp withResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
        return this;
    }

    /**
     * 资源规格。
     * @return resourceSpecCode
     */
    public String getResourceSpecCode() {
        return resourceSpecCode;
    }

    public void setResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowInstanceResp that = (ShowInstanceResp) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.engine, that.engine)
            && Objects.equals(this.status, that.status) && Objects.equals(this.description, that.description)
            && Objects.equals(this.type, that.type) && Objects.equals(this.specification, that.specification)
            && Objects.equals(this.engineVersion, that.engineVersion)
            && Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.chargingMode, that.chargingMode)
            && Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.vpcName, that.vpcName)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.productId, that.productId)
            && Objects.equals(this.securityGroupId, that.securityGroupId)
            && Objects.equals(this.securityGroupName, that.securityGroupName)
            && Objects.equals(this.subnetId, that.subnetId) && Objects.equals(this.subnetName, that.subnetName)
            && Objects.equals(this.subnetCidr, that.subnetCidr)
            && Objects.equals(this.availableZones, that.availableZones)
            && Objects.equals(this.availableZoneNames, that.availableZoneNames)
            && Objects.equals(this.userId, that.userId) && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.maintainBegin, that.maintainBegin)
            && Objects.equals(this.maintainEnd, that.maintainEnd)
            && Objects.equals(this.enableLogCollection, that.enableLogCollection)
            && Objects.equals(this.storageSpace, that.storageSpace)
            && Objects.equals(this.usedStorageSpace, that.usedStorageSpace)
            && Objects.equals(this.enablePublicip, that.enablePublicip)
            && Objects.equals(this.publicipId, that.publicipId)
            && Objects.equals(this.publicipAddress, that.publicipAddress)
            && Objects.equals(this.sslEnable, that.sslEnable) && Objects.equals(this.crossVpcInfo, that.crossVpcInfo)
            && Objects.equals(this.storageResourceId, that.storageResourceId)
            && Objects.equals(this.storageSpecCode, that.storageSpecCode)
            && Objects.equals(this.serviceType, that.serviceType) && Objects.equals(this.storageType, that.storageType)
            && Objects.equals(this.extendTimes, that.extendTimes) && Objects.equals(this.ipv6Enable, that.ipv6Enable)
            && Objects.equals(this.supportFeatures, that.supportFeatures)
            && Objects.equals(this.diskEncrypted, that.diskEncrypted)
            && Objects.equals(this.cesVersion, that.cesVersion) && Objects.equals(this.nodeNum, that.nodeNum)
            && Objects.equals(this.newSpecBillingEnable, that.newSpecBillingEnable)
            && Objects.equals(this.enableAcl, that.enableAcl) && Objects.equals(this.brokerNum, that.brokerNum)
            && Objects.equals(this.namesrvAddress, that.namesrvAddress)
            && Objects.equals(this.brokerAddress, that.brokerAddress)
            && Objects.equals(this.publicNamesrvAddress, that.publicNamesrvAddress)
            && Objects.equals(this.publicBrokerAddress, that.publicBrokerAddress)
            && Objects.equals(this.grpcAddress, that.grpcAddress)
            && Objects.equals(this.publicGrpcAddress, that.publicGrpcAddress)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.totalStorageSpace, that.totalStorageSpace)
            && Objects.equals(this.resourceSpecCode, that.resourceSpecCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            engine,
            status,
            description,
            type,
            specification,
            engineVersion,
            instanceId,
            chargingMode,
            vpcId,
            vpcName,
            createdAt,
            productId,
            securityGroupId,
            securityGroupName,
            subnetId,
            subnetName,
            subnetCidr,
            availableZones,
            availableZoneNames,
            userId,
            userName,
            maintainBegin,
            maintainEnd,
            enableLogCollection,
            storageSpace,
            usedStorageSpace,
            enablePublicip,
            publicipId,
            publicipAddress,
            sslEnable,
            crossVpcInfo,
            storageResourceId,
            storageSpecCode,
            serviceType,
            storageType,
            extendTimes,
            ipv6Enable,
            supportFeatures,
            diskEncrypted,
            cesVersion,
            nodeNum,
            newSpecBillingEnable,
            enableAcl,
            brokerNum,
            namesrvAddress,
            brokerAddress,
            publicNamesrvAddress,
            publicBrokerAddress,
            grpcAddress,
            publicGrpcAddress,
            enterpriseProjectId,
            tags,
            totalStorageSpace,
            resourceSpecCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstanceResp {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    specification: ").append(toIndentedString(specification)).append("\n");
        sb.append("    engineVersion: ").append(toIndentedString(engineVersion)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    vpcName: ").append(toIndentedString(vpcName)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    securityGroupName: ").append(toIndentedString(securityGroupName)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    subnetName: ").append(toIndentedString(subnetName)).append("\n");
        sb.append("    subnetCidr: ").append(toIndentedString(subnetCidr)).append("\n");
        sb.append("    availableZones: ").append(toIndentedString(availableZones)).append("\n");
        sb.append("    availableZoneNames: ").append(toIndentedString(availableZoneNames)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    maintainBegin: ").append(toIndentedString(maintainBegin)).append("\n");
        sb.append("    maintainEnd: ").append(toIndentedString(maintainEnd)).append("\n");
        sb.append("    enableLogCollection: ").append(toIndentedString(enableLogCollection)).append("\n");
        sb.append("    storageSpace: ").append(toIndentedString(storageSpace)).append("\n");
        sb.append("    usedStorageSpace: ").append(toIndentedString(usedStorageSpace)).append("\n");
        sb.append("    enablePublicip: ").append(toIndentedString(enablePublicip)).append("\n");
        sb.append("    publicipId: ").append(toIndentedString(publicipId)).append("\n");
        sb.append("    publicipAddress: ").append(toIndentedString(publicipAddress)).append("\n");
        sb.append("    sslEnable: ").append(toIndentedString(sslEnable)).append("\n");
        sb.append("    crossVpcInfo: ").append(toIndentedString(crossVpcInfo)).append("\n");
        sb.append("    storageResourceId: ").append(toIndentedString(storageResourceId)).append("\n");
        sb.append("    storageSpecCode: ").append(toIndentedString(storageSpecCode)).append("\n");
        sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
        sb.append("    storageType: ").append(toIndentedString(storageType)).append("\n");
        sb.append("    extendTimes: ").append(toIndentedString(extendTimes)).append("\n");
        sb.append("    ipv6Enable: ").append(toIndentedString(ipv6Enable)).append("\n");
        sb.append("    supportFeatures: ").append(toIndentedString(supportFeatures)).append("\n");
        sb.append("    diskEncrypted: ").append(toIndentedString(diskEncrypted)).append("\n");
        sb.append("    cesVersion: ").append(toIndentedString(cesVersion)).append("\n");
        sb.append("    nodeNum: ").append(toIndentedString(nodeNum)).append("\n");
        sb.append("    newSpecBillingEnable: ").append(toIndentedString(newSpecBillingEnable)).append("\n");
        sb.append("    enableAcl: ").append(toIndentedString(enableAcl)).append("\n");
        sb.append("    brokerNum: ").append(toIndentedString(brokerNum)).append("\n");
        sb.append("    namesrvAddress: ").append(toIndentedString(namesrvAddress)).append("\n");
        sb.append("    brokerAddress: ").append(toIndentedString(brokerAddress)).append("\n");
        sb.append("    publicNamesrvAddress: ").append(toIndentedString(publicNamesrvAddress)).append("\n");
        sb.append("    publicBrokerAddress: ").append(toIndentedString(publicBrokerAddress)).append("\n");
        sb.append("    grpcAddress: ").append(toIndentedString(grpcAddress)).append("\n");
        sb.append("    publicGrpcAddress: ").append(toIndentedString(publicGrpcAddress)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    totalStorageSpace: ").append(toIndentedString(totalStorageSpace)).append("\n");
        sb.append("    resourceSpecCode: ").append(toIndentedString(resourceSpecCode)).append("\n");
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
