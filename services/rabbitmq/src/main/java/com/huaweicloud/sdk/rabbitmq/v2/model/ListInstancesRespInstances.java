package com.huaweicloud.sdk.rabbitmq.v2.model;

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

/** ListInstancesRespInstances */
public class ListInstancesRespInstances {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine")

    private String engine;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_version")

    private String engineVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "specification")

    private String specification;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_space")

    private Integer storageSpace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_storage_space")

    private Integer usedStorageSpace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connect_address")

    private String connectAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_spec_code")

    private String resourceSpecCode;

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
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

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
    @JsonProperty(value = "enable_publicip")

    private Boolean enablePublicip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip_address")

    private String publicipAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip_id")

    private String publicipId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "management_connect_address")

    private String managementConnectAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssl_enable")

    private Boolean sslEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_logical_volume")

    private Boolean isLogicalVolume;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_times")

    private Integer extendTimes;

    /** 实例类型：集群，cluster。 */
    public static final class TypeEnum {

        /** Enum SINGLE for value: "single" */
        public static final TypeEnum SINGLE = new TypeEnum("single");

        /** Enum CLUSTER for value: "cluster" */
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
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    @JsonProperty(value = "available_zones")

    private List<String> availableZones = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_storage_space")

    private Integer totalStorageSpace;

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
    @JsonProperty(value = "ipv6_enable")

    private Boolean ipv6Enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_connect_addresses")

    private List<String> ipv6ConnectAddresses = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<ListInstancesRespTags> tags = null;

    public ListInstancesRespInstances withName(String name) {
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

    public ListInstancesRespInstances withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /** 引擎。
     * 
     * @return engine */
    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public ListInstancesRespInstances withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /** 版本。
     * 
     * @return engineVersion */
    public String getEngineVersion() {
        return engineVersion;
    }

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    public ListInstancesRespInstances withSpecification(String specification) {
        this.specification = specification;
        return this;
    }

    /** 实例规格。 - RabbitMQ实例单机返回vm规格。 - RabbitMQ实例集群返回vm规格和节点数。
     * 
     * @return specification */
    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public ListInstancesRespInstances withStorageSpace(Integer storageSpace) {
        this.storageSpace = storageSpace;
        return this;
    }

    /** 消息存储空间，单位：GB。
     * 
     * @return storageSpace */
    public Integer getStorageSpace() {
        return storageSpace;
    }

    public void setStorageSpace(Integer storageSpace) {
        this.storageSpace = storageSpace;
    }

    public ListInstancesRespInstances withUsedStorageSpace(Integer usedStorageSpace) {
        this.usedStorageSpace = usedStorageSpace;
        return this;
    }

    /** 已使用的消息存储空间，单位：GB。
     * 
     * @return usedStorageSpace */
    public Integer getUsedStorageSpace() {
        return usedStorageSpace;
    }

    public void setUsedStorageSpace(Integer usedStorageSpace) {
        this.usedStorageSpace = usedStorageSpace;
    }

    public ListInstancesRespInstances withConnectAddress(String connectAddress) {
        this.connectAddress = connectAddress;
        return this;
    }

    /** 实例连接IP地址。
     * 
     * @return connectAddress */
    public String getConnectAddress() {
        return connectAddress;
    }

    public void setConnectAddress(String connectAddress) {
        this.connectAddress = connectAddress;
    }

    public ListInstancesRespInstances withPort(Integer port) {
        this.port = port;
        return this;
    }

    /** 实例连接端口。
     * 
     * @return port */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public ListInstancesRespInstances withStatus(String status) {
        this.status = status;
        return this;
    }

    /** 实例的状态。详细状态说明见[实例状态说明](https://support.huaweicloud.com/api-rabbitmq/rabbitmq-api-180514012.html)。
     * 
     * @return status */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListInstancesRespInstances withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 实例描述。
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ListInstancesRespInstances withInstanceId(String instanceId) {
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

    public ListInstancesRespInstances withResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
        return this;
    }

    /** 资源规格标识。 - dms.instance.rabbitmq.single.c3.2u4g：RabbitMQ单机，vm规格2u4g -
     * dms.instance.rabbitmq.single.c3.4u8g：RabbitMQ单机，vm规格4u8g -
     * dms.instance.rabbitmq.single.c3.8u16g：RabbitMQ单机，vm规格8u16g -
     * dms.instance.rabbitmq.single.c3.16u32g：RabbitMQ单机，vm规格16u32g -
     * dms.instance.rabbitmq.cluster.c3.4u8g.3：RabbitMQ集群，vm规格4u8g，3个节点 -
     * dms.instance.rabbitmq.cluster.c3.4u8g.5：RabbitMQ集群，vm规格4u8g，5个节点 -
     * dms.instance.rabbitmq.cluster.c3.4u8g.7：RabbitMQ集群，vm规格4u8g，7个节点 -
     * dms.instance.rabbitmq.cluster.c3.8u16g.3：RabbitMQ集群，vm规格8u16g，3个节点 -
     * dms.instance.rabbitmq.cluster.c3.8u16g.5：RabbitMQ集群，vm规格8u16g，5个节点 -
     * dms.instance.rabbitmq.cluster.c3.8u16g.7：RabbitMQ集群，vm规格8u16g，7个节点 -
     * dms.instance.rabbitmq.cluster.c3.16u32g.3：RabbitMQ集群，vm规格16u32g，3个节点 -
     * dms.instance.rabbitmq.cluster.c3.16u32g.5：RabbitMQ集群，vm规格16u32g，5个节点 -
     * dms.instance.rabbitmq.cluster.c3.16u32g.7：RabbitMQ集群，vm规格16u32g，7个节点
     * 
     * @return resourceSpecCode */
    public String getResourceSpecCode() {
        return resourceSpecCode;
    }

    public void setResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
    }

    public ListInstancesRespInstances withChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /** 付费模式，1表示按需计费，0表示包年/包月计费。
     * 
     * @return chargingMode */
    public Integer getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
    }

    public ListInstancesRespInstances withVpcId(String vpcId) {
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

    public ListInstancesRespInstances withVpcName(String vpcName) {
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

    public ListInstancesRespInstances withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /** 完成创建时间。 格式为时间戳，指从格林威治时间 1970年01月01日00时00分00秒起至指定时间的偏差总毫秒数。
     * 
     * @return createdAt */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ListInstancesRespInstances withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /** 用户ID。
     * 
     * @return userId */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ListInstancesRespInstances withUserName(String userName) {
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

    public ListInstancesRespInstances withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /** 订单ID，只有在包周期计费时才会有order_id值，其他计费方式order_id值为空。
     * 
     * @return orderId */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public ListInstancesRespInstances withMaintainBegin(String maintainBegin) {
        this.maintainBegin = maintainBegin;
        return this;
    }

    /** 维护时间窗开始时间，格式为HH:mm:ss。
     * 
     * @return maintainBegin */
    public String getMaintainBegin() {
        return maintainBegin;
    }

    public void setMaintainBegin(String maintainBegin) {
        this.maintainBegin = maintainBegin;
    }

    public ListInstancesRespInstances withMaintainEnd(String maintainEnd) {
        this.maintainEnd = maintainEnd;
        return this;
    }

    /** 维护时间窗结束时间，格式为HH:mm:ss。
     * 
     * @return maintainEnd */
    public String getMaintainEnd() {
        return maintainEnd;
    }

    public void setMaintainEnd(String maintainEnd) {
        this.maintainEnd = maintainEnd;
    }

    public ListInstancesRespInstances withEnablePublicip(Boolean enablePublicip) {
        this.enablePublicip = enablePublicip;
        return this;
    }

    /** RabbitMQ实例是否开启公网访问功能。 - true：开启 - false：未开启
     * 
     * @return enablePublicip */
    public Boolean getEnablePublicip() {
        return enablePublicip;
    }

    public void setEnablePublicip(Boolean enablePublicip) {
        this.enablePublicip = enablePublicip;
    }

    public ListInstancesRespInstances withPublicipAddress(String publicipAddress) {
        this.publicipAddress = publicipAddress;
        return this;
    }

    /** RabbitMQ实例绑定的弹性IP地址。 如果未开启公网访问功能，该字段值为null。
     * 
     * @return publicipAddress */
    public String getPublicipAddress() {
        return publicipAddress;
    }

    public void setPublicipAddress(String publicipAddress) {
        this.publicipAddress = publicipAddress;
    }

    public ListInstancesRespInstances withPublicipId(String publicipId) {
        this.publicipId = publicipId;
        return this;
    }

    /** RabbitMQ实例绑定的弹性IP地址的ID。 如果未开启公网访问功能，该字段值为null。
     * 
     * @return publicipId */
    public String getPublicipId() {
        return publicipId;
    }

    public void setPublicipId(String publicipId) {
        this.publicipId = publicipId;
    }

    public ListInstancesRespInstances withManagementConnectAddress(String managementConnectAddress) {
        this.managementConnectAddress = managementConnectAddress;
        return this;
    }

    /** RabbitMQ实例的管理地址。
     * 
     * @return managementConnectAddress */
    public String getManagementConnectAddress() {
        return managementConnectAddress;
    }

    public void setManagementConnectAddress(String managementConnectAddress) {
        this.managementConnectAddress = managementConnectAddress;
    }

    public ListInstancesRespInstances withSslEnable(Boolean sslEnable) {
        this.sslEnable = sslEnable;
        return this;
    }

    /** 是否开启安全认证。 - true：开启 - false：未开启
     * 
     * @return sslEnable */
    public Boolean getSslEnable() {
        return sslEnable;
    }

    public void setSslEnable(Boolean sslEnable) {
        this.sslEnable = sslEnable;
    }

    public ListInstancesRespInstances withEnterpriseProjectId(String enterpriseProjectId) {
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

    public ListInstancesRespInstances withIsLogicalVolume(Boolean isLogicalVolume) {
        this.isLogicalVolume = isLogicalVolume;
        return this;
    }

    /** 实例扩容时用于区分老实例与新实例。 - true：新创建的实例，允许磁盘动态扩容不需要重启。 - false：老实例
     * 
     * @return isLogicalVolume */
    public Boolean getIsLogicalVolume() {
        return isLogicalVolume;
    }

    public void setIsLogicalVolume(Boolean isLogicalVolume) {
        this.isLogicalVolume = isLogicalVolume;
    }

    public ListInstancesRespInstances withExtendTimes(Integer extendTimes) {
        this.extendTimes = extendTimes;
        return this;
    }

    /** 实例扩容磁盘次数，如果超过20次则无法扩容磁盘。
     * 
     * @return extendTimes */
    public Integer getExtendTimes() {
        return extendTimes;
    }

    public void setExtendTimes(Integer extendTimes) {
        this.extendTimes = extendTimes;
    }

    public ListInstancesRespInstances withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /** 实例类型：集群，cluster。
     * 
     * @return type */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ListInstancesRespInstances withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /** 产品标识。
     * 
     * @return productId */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public ListInstancesRespInstances withSecurityGroupId(String securityGroupId) {
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

    public ListInstancesRespInstances withSecurityGroupName(String securityGroupName) {
        this.securityGroupName = securityGroupName;
        return this;
    }

    /** 租户安全组名称。
     * 
     * @return securityGroupName */
    public String getSecurityGroupName() {
        return securityGroupName;
    }

    public void setSecurityGroupName(String securityGroupName) {
        this.securityGroupName = securityGroupName;
    }

    public ListInstancesRespInstances withSubnetId(String subnetId) {
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

    public ListInstancesRespInstances withAvailableZones(List<String> availableZones) {
        this.availableZones = availableZones;
        return this;
    }

    public ListInstancesRespInstances addAvailableZonesItem(String availableZonesItem) {
        if (this.availableZones == null) {
            this.availableZones = new ArrayList<>();
        }
        this.availableZones.add(availableZonesItem);
        return this;
    }

    public ListInstancesRespInstances withAvailableZones(Consumer<List<String>> availableZonesSetter) {
        if (this.availableZones == null) {
            this.availableZones = new ArrayList<>();
        }
        availableZonesSetter.accept(this.availableZones);
        return this;
    }

    /** 实例节点所在的可用区，返回“可用区ID”。
     * 
     * @return availableZones */
    public List<String> getAvailableZones() {
        return availableZones;
    }

    public void setAvailableZones(List<String> availableZones) {
        this.availableZones = availableZones;
    }

    public ListInstancesRespInstances withTotalStorageSpace(Integer totalStorageSpace) {
        this.totalStorageSpace = totalStorageSpace;
        return this;
    }

    /** 总共消息存储空间，单位：GB。
     * 
     * @return totalStorageSpace */
    public Integer getTotalStorageSpace() {
        return totalStorageSpace;
    }

    public void setTotalStorageSpace(Integer totalStorageSpace) {
        this.totalStorageSpace = totalStorageSpace;
    }

    public ListInstancesRespInstances withStorageResourceId(String storageResourceId) {
        this.storageResourceId = storageResourceId;
        return this;
    }

    /** 存储资源ID。
     * 
     * @return storageResourceId */
    public String getStorageResourceId() {
        return storageResourceId;
    }

    public void setStorageResourceId(String storageResourceId) {
        this.storageResourceId = storageResourceId;
    }

    public ListInstancesRespInstances withStorageSpecCode(String storageSpecCode) {
        this.storageSpecCode = storageSpecCode;
        return this;
    }

    /** IO规格。
     * 
     * @return storageSpecCode */
    public String getStorageSpecCode() {
        return storageSpecCode;
    }

    public void setStorageSpecCode(String storageSpecCode) {
        this.storageSpecCode = storageSpecCode;
    }

    public ListInstancesRespInstances withServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /** 服务类型。
     * 
     * @return serviceType */
    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public ListInstancesRespInstances withStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }

    /** 存储类型。
     * 
     * @return storageType */
    public String getStorageType() {
        return storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    public ListInstancesRespInstances withIpv6Enable(Boolean ipv6Enable) {
        this.ipv6Enable = ipv6Enable;
        return this;
    }

    /** 是否开启ipv6。
     * 
     * @return ipv6Enable */
    public Boolean getIpv6Enable() {
        return ipv6Enable;
    }

    public void setIpv6Enable(Boolean ipv6Enable) {
        this.ipv6Enable = ipv6Enable;
    }

    public ListInstancesRespInstances withIpv6ConnectAddresses(List<String> ipv6ConnectAddresses) {
        this.ipv6ConnectAddresses = ipv6ConnectAddresses;
        return this;
    }

    public ListInstancesRespInstances addIpv6ConnectAddressesItem(String ipv6ConnectAddressesItem) {
        if (this.ipv6ConnectAddresses == null) {
            this.ipv6ConnectAddresses = new ArrayList<>();
        }
        this.ipv6ConnectAddresses.add(ipv6ConnectAddressesItem);
        return this;
    }

    public ListInstancesRespInstances withIpv6ConnectAddresses(Consumer<List<String>> ipv6ConnectAddressesSetter) {
        if (this.ipv6ConnectAddresses == null) {
            this.ipv6ConnectAddresses = new ArrayList<>();
        }
        ipv6ConnectAddressesSetter.accept(this.ipv6ConnectAddresses);
        return this;
    }

    /** IPv6的连接地址。
     * 
     * @return ipv6ConnectAddresses */
    public List<String> getIpv6ConnectAddresses() {
        return ipv6ConnectAddresses;
    }

    public void setIpv6ConnectAddresses(List<String> ipv6ConnectAddresses) {
        this.ipv6ConnectAddresses = ipv6ConnectAddresses;
    }

    public ListInstancesRespInstances withTags(List<ListInstancesRespTags> tags) {
        this.tags = tags;
        return this;
    }

    public ListInstancesRespInstances addTagsItem(ListInstancesRespTags tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ListInstancesRespInstances withTags(Consumer<List<ListInstancesRespTags>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /** 标签列表。
     * 
     * @return tags */
    public List<ListInstancesRespTags> getTags() {
        return tags;
    }

    public void setTags(List<ListInstancesRespTags> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListInstancesRespInstances listInstancesRespInstances = (ListInstancesRespInstances) o;
        return Objects.equals(this.name, listInstancesRespInstances.name)
            && Objects.equals(this.engine, listInstancesRespInstances.engine)
            && Objects.equals(this.engineVersion, listInstancesRespInstances.engineVersion)
            && Objects.equals(this.specification, listInstancesRespInstances.specification)
            && Objects.equals(this.storageSpace, listInstancesRespInstances.storageSpace)
            && Objects.equals(this.usedStorageSpace, listInstancesRespInstances.usedStorageSpace)
            && Objects.equals(this.connectAddress, listInstancesRespInstances.connectAddress)
            && Objects.equals(this.port, listInstancesRespInstances.port)
            && Objects.equals(this.status, listInstancesRespInstances.status)
            && Objects.equals(this.description, listInstancesRespInstances.description)
            && Objects.equals(this.instanceId, listInstancesRespInstances.instanceId)
            && Objects.equals(this.resourceSpecCode, listInstancesRespInstances.resourceSpecCode)
            && Objects.equals(this.chargingMode, listInstancesRespInstances.chargingMode)
            && Objects.equals(this.vpcId, listInstancesRespInstances.vpcId)
            && Objects.equals(this.vpcName, listInstancesRespInstances.vpcName)
            && Objects.equals(this.createdAt, listInstancesRespInstances.createdAt)
            && Objects.equals(this.userId, listInstancesRespInstances.userId)
            && Objects.equals(this.userName, listInstancesRespInstances.userName)
            && Objects.equals(this.orderId, listInstancesRespInstances.orderId)
            && Objects.equals(this.maintainBegin, listInstancesRespInstances.maintainBegin)
            && Objects.equals(this.maintainEnd, listInstancesRespInstances.maintainEnd)
            && Objects.equals(this.enablePublicip, listInstancesRespInstances.enablePublicip)
            && Objects.equals(this.publicipAddress, listInstancesRespInstances.publicipAddress)
            && Objects.equals(this.publicipId, listInstancesRespInstances.publicipId)
            && Objects.equals(this.managementConnectAddress, listInstancesRespInstances.managementConnectAddress)
            && Objects.equals(this.sslEnable, listInstancesRespInstances.sslEnable)
            && Objects.equals(this.enterpriseProjectId, listInstancesRespInstances.enterpriseProjectId)
            && Objects.equals(this.isLogicalVolume, listInstancesRespInstances.isLogicalVolume)
            && Objects.equals(this.extendTimes, listInstancesRespInstances.extendTimes)
            && Objects.equals(this.type, listInstancesRespInstances.type)
            && Objects.equals(this.productId, listInstancesRespInstances.productId)
            && Objects.equals(this.securityGroupId, listInstancesRespInstances.securityGroupId)
            && Objects.equals(this.securityGroupName, listInstancesRespInstances.securityGroupName)
            && Objects.equals(this.subnetId, listInstancesRespInstances.subnetId)
            && Objects.equals(this.availableZones, listInstancesRespInstances.availableZones)
            && Objects.equals(this.totalStorageSpace, listInstancesRespInstances.totalStorageSpace)
            && Objects.equals(this.storageResourceId, listInstancesRespInstances.storageResourceId)
            && Objects.equals(this.storageSpecCode, listInstancesRespInstances.storageSpecCode)
            && Objects.equals(this.serviceType, listInstancesRespInstances.serviceType)
            && Objects.equals(this.storageType, listInstancesRespInstances.storageType)
            && Objects.equals(this.ipv6Enable, listInstancesRespInstances.ipv6Enable)
            && Objects.equals(this.ipv6ConnectAddresses, listInstancesRespInstances.ipv6ConnectAddresses)
            && Objects.equals(this.tags, listInstancesRespInstances.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            engine,
            engineVersion,
            specification,
            storageSpace,
            usedStorageSpace,
            connectAddress,
            port,
            status,
            description,
            instanceId,
            resourceSpecCode,
            chargingMode,
            vpcId,
            vpcName,
            createdAt,
            userId,
            userName,
            orderId,
            maintainBegin,
            maintainEnd,
            enablePublicip,
            publicipAddress,
            publicipId,
            managementConnectAddress,
            sslEnable,
            enterpriseProjectId,
            isLogicalVolume,
            extendTimes,
            type,
            productId,
            securityGroupId,
            securityGroupName,
            subnetId,
            availableZones,
            totalStorageSpace,
            storageResourceId,
            storageSpecCode,
            serviceType,
            storageType,
            ipv6Enable,
            ipv6ConnectAddresses,
            tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstancesRespInstances {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
        sb.append("    engineVersion: ").append(toIndentedString(engineVersion)).append("\n");
        sb.append("    specification: ").append(toIndentedString(specification)).append("\n");
        sb.append("    storageSpace: ").append(toIndentedString(storageSpace)).append("\n");
        sb.append("    usedStorageSpace: ").append(toIndentedString(usedStorageSpace)).append("\n");
        sb.append("    connectAddress: ").append(toIndentedString(connectAddress)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    resourceSpecCode: ").append(toIndentedString(resourceSpecCode)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    vpcName: ").append(toIndentedString(vpcName)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    maintainBegin: ").append(toIndentedString(maintainBegin)).append("\n");
        sb.append("    maintainEnd: ").append(toIndentedString(maintainEnd)).append("\n");
        sb.append("    enablePublicip: ").append(toIndentedString(enablePublicip)).append("\n");
        sb.append("    publicipAddress: ").append(toIndentedString(publicipAddress)).append("\n");
        sb.append("    publicipId: ").append(toIndentedString(publicipId)).append("\n");
        sb.append("    managementConnectAddress: ").append(toIndentedString(managementConnectAddress)).append("\n");
        sb.append("    sslEnable: ").append(toIndentedString(sslEnable)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    isLogicalVolume: ").append(toIndentedString(isLogicalVolume)).append("\n");
        sb.append("    extendTimes: ").append(toIndentedString(extendTimes)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    securityGroupName: ").append(toIndentedString(securityGroupName)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    availableZones: ").append(toIndentedString(availableZones)).append("\n");
        sb.append("    totalStorageSpace: ").append(toIndentedString(totalStorageSpace)).append("\n");
        sb.append("    storageResourceId: ").append(toIndentedString(storageResourceId)).append("\n");
        sb.append("    storageSpecCode: ").append(toIndentedString(storageSpecCode)).append("\n");
        sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
        sb.append("    storageType: ").append(toIndentedString(storageType)).append("\n");
        sb.append("    ipv6Enable: ").append(toIndentedString(ipv6Enable)).append("\n");
        sb.append("    ipv6ConnectAddresses: ").append(toIndentedString(ipv6ConnectAddresses)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
