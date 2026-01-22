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

/**
 * ShowInstanceResp
 */
public class ShowInstanceResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_user")

    private String accessUser;

    /**
     * **参数解释**： 代理个数。 **取值范围**： - 1 - 3 - 5 - 7
     */
    public static final class BrokerNumEnum {

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final BrokerNumEnum NUMBER_1 = new BrokerNumEnum(1);

        /**
         * Enum NUMBER_3 for value: 3
         */
        public static final BrokerNumEnum NUMBER_3 = new BrokerNumEnum(3);

        /**
         * Enum NUMBER_5 for value: 5
         */
        public static final BrokerNumEnum NUMBER_5 = new BrokerNumEnum(5);

        /**
         * Enum NUMBER_7 for value: 7
         */
        public static final BrokerNumEnum NUMBER_7 = new BrokerNumEnum(7);

        private static final Map<Integer, BrokerNumEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, BrokerNumEnum> createStaticFields() {
            Map<Integer, BrokerNumEnum> map = new HashMap<>();
            map.put(1, NUMBER_1);
            map.put(3, NUMBER_3);
            map.put(5, NUMBER_5);
            map.put(7, NUMBER_7);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        BrokerNumEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static BrokerNumEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new BrokerNumEnum(value));
        }

        public static BrokerNumEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof BrokerNumEnum) {
                return this.value.equals(((BrokerNumEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "broker_num")

    private BrokerNumEnum brokerNum;

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
    @JsonProperty(value = "dns_enable")

    private Boolean dnsEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connect_address")

    private String connectAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connect_domain_name")

    private String connectDomainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_connect_address")

    private String publicConnectAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_connect_domain_name")

    private String publicConnectDomainName;

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
    @JsonProperty(value = "management_connect_domain_name")

    private String managementConnectDomainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_management_connect_address")

    private String publicManagementConnectAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_management_connect_domain_name")

    private String publicManagementConnectDomainName;

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

    /**
     * **参数解释**： 实例类型。 **取值范围**： - single：单机。 - cluster：集群。
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
    @JsonProperty(value = "available_zone_names")

    private List<String> availableZoneNames = null;

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
    @JsonProperty(value = "ipv6_enable")

    private Boolean ipv6Enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_connect_addresses")

    private List<String> ipv6ConnectAddresses = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TagEntity> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type")

    private String serviceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_type")

    private String storageType;

    public ShowInstanceResp withAccessUser(String accessUser) {
        this.accessUser = accessUser;
        return this;
    }

    /**
     * **参数解释**： 认证用户名。 **取值范围**： 不涉及。
     * @return accessUser
     */
    public String getAccessUser() {
        return accessUser;
    }

    public void setAccessUser(String accessUser) {
        this.accessUser = accessUser;
    }

    public ShowInstanceResp withBrokerNum(BrokerNumEnum brokerNum) {
        this.brokerNum = brokerNum;
        return this;
    }

    /**
     * **参数解释**： 代理个数。 **取值范围**： - 1 - 3 - 5 - 7
     * @return brokerNum
     */
    public BrokerNumEnum getBrokerNum() {
        return brokerNum;
    }

    public void setBrokerNum(BrokerNumEnum brokerNum) {
        this.brokerNum = brokerNum;
    }

    public ShowInstanceResp withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 实例名称。 **取值范围**： 不涉及。
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
     * **参数解释**： 消息引擎类型。 **取值范围**： rabbitmq：RabbitMQ引擎。
     * @return engine
     */
    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public ShowInstanceResp withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * **参数解释**： 消息引擎版本。 **取值范围**： - 3.8.35 [- 3.12.13](tag:srg) [- AMQP-0-9-1](tag:hws,hws_hk,hws_eu)
     * @return engineVersion
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    public ShowInstanceResp withSpecification(String specification) {
        this.specification = specification;
        return this;
    }

    /**
     * **参数解释**： 实例规格。 **取值范围**： - 单机实例：返回vm规格。 - 集群实例：返回vm规格和节点数。
     * @return specification
     */
    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public ShowInstanceResp withStorageSpace(Integer storageSpace) {
        this.storageSpace = storageSpace;
        return this;
    }

    /**
     * **参数解释**： 消息存储空间，单位：GB。 **取值范围**： 不涉及。
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
     * **参数解释**： 已使用的消息存储空间，单位：GB。 **取值范围**： 不涉及。
     * @return usedStorageSpace
     */
    public Integer getUsedStorageSpace() {
        return usedStorageSpace;
    }

    public void setUsedStorageSpace(Integer usedStorageSpace) {
        this.usedStorageSpace = usedStorageSpace;
    }

    public ShowInstanceResp withDnsEnable(Boolean dnsEnable) {
        this.dnsEnable = dnsEnable;
        return this;
    }

    /**
     * **参数解释**： 实例是否开启域名访问功能。 **取值范围**： - true：开启 - false：未开启
     * @return dnsEnable
     */
    public Boolean getDnsEnable() {
        return dnsEnable;
    }

    public void setDnsEnable(Boolean dnsEnable) {
        this.dnsEnable = dnsEnable;
    }

    public ShowInstanceResp withConnectAddress(String connectAddress) {
        this.connectAddress = connectAddress;
        return this;
    }

    /**
     * **参数解释**： 实例内网连接IP地址。 **取值范围**： 不涉及。
     * @return connectAddress
     */
    public String getConnectAddress() {
        return connectAddress;
    }

    public void setConnectAddress(String connectAddress) {
        this.connectAddress = connectAddress;
    }

    public ShowInstanceResp withConnectDomainName(String connectDomainName) {
        this.connectDomainName = connectDomainName;
        return this;
    }

    /**
     * **参数解释**： 实例内网连接域名。 **取值范围**： 不涉及。
     * @return connectDomainName
     */
    public String getConnectDomainName() {
        return connectDomainName;
    }

    public void setConnectDomainName(String connectDomainName) {
        this.connectDomainName = connectDomainName;
    }

    public ShowInstanceResp withPublicConnectAddress(String publicConnectAddress) {
        this.publicConnectAddress = publicConnectAddress;
        return this;
    }

    /**
     * **参数解释**： 实例公网连接IP地址。 **取值范围**： 不涉及。
     * @return publicConnectAddress
     */
    public String getPublicConnectAddress() {
        return publicConnectAddress;
    }

    public void setPublicConnectAddress(String publicConnectAddress) {
        this.publicConnectAddress = publicConnectAddress;
    }

    public ShowInstanceResp withPublicConnectDomainName(String publicConnectDomainName) {
        this.publicConnectDomainName = publicConnectDomainName;
        return this;
    }

    /**
     * **参数解释**： 实例公网连接域名。 **取值范围**： 不涉及。
     * @return publicConnectDomainName
     */
    public String getPublicConnectDomainName() {
        return publicConnectDomainName;
    }

    public void setPublicConnectDomainName(String publicConnectDomainName) {
        this.publicConnectDomainName = publicConnectDomainName;
    }

    public ShowInstanceResp withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * **参数解释**： 实例连接端口。 **取值范围**： 不涉及。
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public ShowInstanceResp withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 实例状态。 **取值范围**： [详细状态说明请参考[实例状态说明](rabbitmq-api-180514012.xml)](tag:hws,hws_eu,hws_hk,cmcc,ctc,sbc,hk_sbc,g42,hk_g42,tm,hk_tm,ax)[详细状态说明请参考[实例状态说明](kafka-api-180514012.xml)](tag:hcs)。
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
     * **参数解释**： 实例描述。 **取值范围**： 不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowInstanceResp withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数解释**： 实例ID。 **取值范围**： 不涉及。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ShowInstanceResp withResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
        return this;
    }

    /**
     * **参数解释**： 资源规格标识。 **取值范围**： -[ dms.instance.rabbitmq.single.c3.2u4g：RabbitMQ单机，vm规格2u4g - dms.instance.rabbitmq.single.c3.4u8g：RabbitMQ单机，vm规格4u8g - dms.instance.rabbitmq.single.c3.8u16g：RabbitMQ单机，vm规格8u16g - dms.instance.rabbitmq.single.c3.16u32g：RabbitMQ单机，vm规格16u32g - dms.instance.rabbitmq.cluster.c3.4u8g.3：RabbitMQ集群，vm规格4u8g，3个节点 - dms.instance.rabbitmq.cluster.c3.4u8g.5：RabbitMQ集群，vm规格4u8g，5个节点 - dms.instance.rabbitmq.cluster.c3.4u8g.7：RabbitMQ集群，vm规格4u8g，7个节点 - dms.instance.rabbitmq.cluster.c3.8u16g.3：RabbitMQ集群，vm规格8u16g，3个节点 - dms.instance.rabbitmq.cluster.c3.8u16g.5：RabbitMQ集群，vm规格8u16g，5个节点 - dms.instance.rabbitmq.cluster.c3.8u16g.7：RabbitMQ集群，vm规格8u16g，7个节点 - dms.instance.rabbitmq.cluster.c3.16u32g.3：RabbitMQ集群，vm规格16u32g，3个节点 - dms.instance.rabbitmq.cluster.c3.16u32g.5：RabbitMQ集群，vm规格16u32g，5个节点 - dms.instance.rabbitmq.cluster.c3.16u32g.7：RabbitMQ集群，vm规格16u32g，7个节点](tag:hws,hws_eu,hws_hk,ctc,g42,hk_g42,tm,hk_tm,sbc,ax,hk_sbc)
     * @return resourceSpecCode
     */
    public String getResourceSpecCode() {
        return resourceSpecCode;
    }

    public void setResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
    }

    public ShowInstanceResp withChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /**
     * **参数解释**： 付费模式。 **取值范围**： - 1：按需计费。 - 0：包年/包月计费。
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
     * **参数解释**： VPC ID。 **取值范围**： 不涉及。
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
     * **参数解释**： VPC的名称。 **取值范围**： 不涉及。
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
     * **参数解释**： 完成创建时间。格式为时间戳，指从格林威治时间 1970年01月01日00时00分00秒起至指定时间的偏差总毫秒数。 **取值范围**： 不涉及。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ShowInstanceResp withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * **参数解释**： 用户ID。 **取值范围**： 不涉及。
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
     * **参数解释**： 用户名。 **取值范围**： 不涉及。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ShowInstanceResp withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * **参数解释**： 订单ID，只有在包周期计费时才会有order_id值，其他计费方式order_id值为空。 **取值范围**： 不涉及。
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public ShowInstanceResp withMaintainBegin(String maintainBegin) {
        this.maintainBegin = maintainBegin;
        return this;
    }

    /**
     * **参数解释**： 维护时间窗开始时间，格式为HH:mm:ss。 **取值范围**： 不涉及。
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
     * **参数解释**： 维护时间窗结束时间，格式为HH:mm:ss。 **取值范围**： 不涉及。
     * @return maintainEnd
     */
    public String getMaintainEnd() {
        return maintainEnd;
    }

    public void setMaintainEnd(String maintainEnd) {
        this.maintainEnd = maintainEnd;
    }

    public ShowInstanceResp withEnablePublicip(Boolean enablePublicip) {
        this.enablePublicip = enablePublicip;
        return this;
    }

    /**
     * **参数解释**： RabbitMQ实例是否开启公网访问功能。 **取值范围**： - true：开启 - false：未开启
     * @return enablePublicip
     */
    public Boolean getEnablePublicip() {
        return enablePublicip;
    }

    public void setEnablePublicip(Boolean enablePublicip) {
        this.enablePublicip = enablePublicip;
    }

    public ShowInstanceResp withPublicipAddress(String publicipAddress) {
        this.publicipAddress = publicipAddress;
        return this;
    }

    /**
     * **参数解释**： RabbitMQ实例绑定的弹性IP地址。  如果未开启公网访问功能，该字段值为null。 **取值范围**： - true：开启 - false：未开启
     * @return publicipAddress
     */
    public String getPublicipAddress() {
        return publicipAddress;
    }

    public void setPublicipAddress(String publicipAddress) {
        this.publicipAddress = publicipAddress;
    }

    public ShowInstanceResp withPublicipId(String publicipId) {
        this.publicipId = publicipId;
        return this;
    }

    /**
     * **参数解释**： RabbitMQ实例绑定的弹性IP地址的ID。  如果未开启公网访问功能，该字段值为null。 **取值范围**： 不涉及。
     * @return publicipId
     */
    public String getPublicipId() {
        return publicipId;
    }

    public void setPublicipId(String publicipId) {
        this.publicipId = publicipId;
    }

    public ShowInstanceResp withManagementConnectAddress(String managementConnectAddress) {
        this.managementConnectAddress = managementConnectAddress;
        return this;
    }

    /**
     * **参数解释**： RabbitMQ实例的管理地址。 **取值范围**： 不涉及。
     * @return managementConnectAddress
     */
    public String getManagementConnectAddress() {
        return managementConnectAddress;
    }

    public void setManagementConnectAddress(String managementConnectAddress) {
        this.managementConnectAddress = managementConnectAddress;
    }

    public ShowInstanceResp withManagementConnectDomainName(String managementConnectDomainName) {
        this.managementConnectDomainName = managementConnectDomainName;
        return this;
    }

    /**
     * **参数解释**： RabbitMQ实例的管理域名。 **取值范围**： 不涉及。
     * @return managementConnectDomainName
     */
    public String getManagementConnectDomainName() {
        return managementConnectDomainName;
    }

    public void setManagementConnectDomainName(String managementConnectDomainName) {
        this.managementConnectDomainName = managementConnectDomainName;
    }

    public ShowInstanceResp withPublicManagementConnectAddress(String publicManagementConnectAddress) {
        this.publicManagementConnectAddress = publicManagementConnectAddress;
        return this;
    }

    /**
     * **参数解释**： RabbitMQ实例的公网管理地址。 **取值范围**： 不涉及。
     * @return publicManagementConnectAddress
     */
    public String getPublicManagementConnectAddress() {
        return publicManagementConnectAddress;
    }

    public void setPublicManagementConnectAddress(String publicManagementConnectAddress) {
        this.publicManagementConnectAddress = publicManagementConnectAddress;
    }

    public ShowInstanceResp withPublicManagementConnectDomainName(String publicManagementConnectDomainName) {
        this.publicManagementConnectDomainName = publicManagementConnectDomainName;
        return this;
    }

    /**
     * **参数解释**： RabbitMQ实例的公网管理域名。 **取值范围**： 不涉及。
     * @return publicManagementConnectDomainName
     */
    public String getPublicManagementConnectDomainName() {
        return publicManagementConnectDomainName;
    }

    public void setPublicManagementConnectDomainName(String publicManagementConnectDomainName) {
        this.publicManagementConnectDomainName = publicManagementConnectDomainName;
    }

    public ShowInstanceResp withSslEnable(Boolean sslEnable) {
        this.sslEnable = sslEnable;
        return this;
    }

    /**
     * **参数解释**： 是否开启安全认证。 **取值范围**： - true：开启 - false：未开启
     * @return sslEnable
     */
    public Boolean getSslEnable() {
        return sslEnable;
    }

    public void setSslEnable(Boolean sslEnable) {
        this.sslEnable = sslEnable;
    }

    public ShowInstanceResp withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释**： 企业项目ID。 **取值范围**： 不涉及。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ShowInstanceResp withIsLogicalVolume(Boolean isLogicalVolume) {
        this.isLogicalVolume = isLogicalVolume;
        return this;
    }

    /**
     * **参数解释**： 实例扩容时用于区分老实例与新实例。 **取值范围**： - true：新创建的实例，允许磁盘动态扩容不需要重启。 - false：特别老的实例不支持磁盘扩容。
     * @return isLogicalVolume
     */
    public Boolean getIsLogicalVolume() {
        return isLogicalVolume;
    }

    public void setIsLogicalVolume(Boolean isLogicalVolume) {
        this.isLogicalVolume = isLogicalVolume;
    }

    public ShowInstanceResp withExtendTimes(Integer extendTimes) {
        this.extendTimes = extendTimes;
        return this;
    }

    /**
     * **参数解释**： 实例扩容磁盘次数。 **取值范围**： 不涉及。
     * @return extendTimes
     */
    public Integer getExtendTimes() {
        return extendTimes;
    }

    public void setExtendTimes(Integer extendTimes) {
        this.extendTimes = extendTimes;
    }

    public ShowInstanceResp withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 实例类型。 **取值范围**： - single：单机。 - cluster：集群。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ShowInstanceResp withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * **参数解释**： 产品标识。 **取值范围**： 不涉及。
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
     * **参数解释**： 安全组ID。 **取值范围**： 不涉及。
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
     * **参数解释**： 租户安全组名称。 **取值范围**： 不涉及。
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
     * **参数解释**： 子网ID。 **取值范围**： 不涉及。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
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
     * **参数解释**： 实例节点所在的可用区ID。
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
     * **参数解释**： 实例节点所在的可用区名称。
     * @return availableZoneNames
     */
    public List<String> getAvailableZoneNames() {
        return availableZoneNames;
    }

    public void setAvailableZoneNames(List<String> availableZoneNames) {
        this.availableZoneNames = availableZoneNames;
    }

    public ShowInstanceResp withTotalStorageSpace(Integer totalStorageSpace) {
        this.totalStorageSpace = totalStorageSpace;
        return this;
    }

    /**
     * **参数解释**： 总共消息存储空间，单位：GB。 **取值范围**： 不涉及。
     * @return totalStorageSpace
     */
    public Integer getTotalStorageSpace() {
        return totalStorageSpace;
    }

    public void setTotalStorageSpace(Integer totalStorageSpace) {
        this.totalStorageSpace = totalStorageSpace;
    }

    public ShowInstanceResp withStorageResourceId(String storageResourceId) {
        this.storageResourceId = storageResourceId;
        return this;
    }

    /**
     * **参数解释**： 存储资源ID。 **取值范围**： 不涉及。
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
     * **参数解释**： IO规格。 **取值范围**： 不涉及。
     * @return storageSpecCode
     */
    public String getStorageSpecCode() {
        return storageSpecCode;
    }

    public void setStorageSpecCode(String storageSpecCode) {
        this.storageSpecCode = storageSpecCode;
    }

    public ShowInstanceResp withIpv6Enable(Boolean ipv6Enable) {
        this.ipv6Enable = ipv6Enable;
        return this;
    }

    /**
     * **参数解释**： 是否开启IPv6。 **取值范围**： - true：开启。 - false：不开启。
     * @return ipv6Enable
     */
    public Boolean getIpv6Enable() {
        return ipv6Enable;
    }

    public void setIpv6Enable(Boolean ipv6Enable) {
        this.ipv6Enable = ipv6Enable;
    }

    public ShowInstanceResp withIpv6ConnectAddresses(List<String> ipv6ConnectAddresses) {
        this.ipv6ConnectAddresses = ipv6ConnectAddresses;
        return this;
    }

    public ShowInstanceResp addIpv6ConnectAddressesItem(String ipv6ConnectAddressesItem) {
        if (this.ipv6ConnectAddresses == null) {
            this.ipv6ConnectAddresses = new ArrayList<>();
        }
        this.ipv6ConnectAddresses.add(ipv6ConnectAddressesItem);
        return this;
    }

    public ShowInstanceResp withIpv6ConnectAddresses(Consumer<List<String>> ipv6ConnectAddressesSetter) {
        if (this.ipv6ConnectAddresses == null) {
            this.ipv6ConnectAddresses = new ArrayList<>();
        }
        ipv6ConnectAddressesSetter.accept(this.ipv6ConnectAddresses);
        return this;
    }

    /**
     * **参数解释**： IPv6的连接地址。
     * @return ipv6ConnectAddresses
     */
    public List<String> getIpv6ConnectAddresses() {
        return ipv6ConnectAddresses;
    }

    public void setIpv6ConnectAddresses(List<String> ipv6ConnectAddresses) {
        this.ipv6ConnectAddresses = ipv6ConnectAddresses;
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
     * **参数解释**： 标签列表。
     * @return tags
     */
    public List<TagEntity> getTags() {
        return tags;
    }

    public void setTags(List<TagEntity> tags) {
        this.tags = tags;
    }

    public ShowInstanceResp withServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * **参数解释**： 服务类型。 **取值范围**： advanced：服务类型。
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
     * **参数解释**： 存储类型。 **取值范围**： hec：存储类型。
     * @return storageType
     */
    public String getStorageType() {
        return storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
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
        return Objects.equals(this.accessUser, that.accessUser) && Objects.equals(this.brokerNum, that.brokerNum)
            && Objects.equals(this.name, that.name) && Objects.equals(this.engine, that.engine)
            && Objects.equals(this.engineVersion, that.engineVersion)
            && Objects.equals(this.specification, that.specification)
            && Objects.equals(this.storageSpace, that.storageSpace)
            && Objects.equals(this.usedStorageSpace, that.usedStorageSpace)
            && Objects.equals(this.dnsEnable, that.dnsEnable)
            && Objects.equals(this.connectAddress, that.connectAddress)
            && Objects.equals(this.connectDomainName, that.connectDomainName)
            && Objects.equals(this.publicConnectAddress, that.publicConnectAddress)
            && Objects.equals(this.publicConnectDomainName, that.publicConnectDomainName)
            && Objects.equals(this.port, that.port) && Objects.equals(this.status, that.status)
            && Objects.equals(this.description, that.description) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.resourceSpecCode, that.resourceSpecCode)
            && Objects.equals(this.chargingMode, that.chargingMode) && Objects.equals(this.vpcId, that.vpcId)
            && Objects.equals(this.vpcName, that.vpcName) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.userId, that.userId) && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.orderId, that.orderId) && Objects.equals(this.maintainBegin, that.maintainBegin)
            && Objects.equals(this.maintainEnd, that.maintainEnd)
            && Objects.equals(this.enablePublicip, that.enablePublicip)
            && Objects.equals(this.publicipAddress, that.publicipAddress)
            && Objects.equals(this.publicipId, that.publicipId)
            && Objects.equals(this.managementConnectAddress, that.managementConnectAddress)
            && Objects.equals(this.managementConnectDomainName, that.managementConnectDomainName)
            && Objects.equals(this.publicManagementConnectAddress, that.publicManagementConnectAddress)
            && Objects.equals(this.publicManagementConnectDomainName, that.publicManagementConnectDomainName)
            && Objects.equals(this.sslEnable, that.sslEnable)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.isLogicalVolume, that.isLogicalVolume)
            && Objects.equals(this.extendTimes, that.extendTimes) && Objects.equals(this.type, that.type)
            && Objects.equals(this.productId, that.productId)
            && Objects.equals(this.securityGroupId, that.securityGroupId)
            && Objects.equals(this.securityGroupName, that.securityGroupName)
            && Objects.equals(this.subnetId, that.subnetId) && Objects.equals(this.availableZones, that.availableZones)
            && Objects.equals(this.availableZoneNames, that.availableZoneNames)
            && Objects.equals(this.totalStorageSpace, that.totalStorageSpace)
            && Objects.equals(this.storageResourceId, that.storageResourceId)
            && Objects.equals(this.storageSpecCode, that.storageSpecCode)
            && Objects.equals(this.ipv6Enable, that.ipv6Enable)
            && Objects.equals(this.ipv6ConnectAddresses, that.ipv6ConnectAddresses)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.serviceType, that.serviceType)
            && Objects.equals(this.storageType, that.storageType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessUser,
            brokerNum,
            name,
            engine,
            engineVersion,
            specification,
            storageSpace,
            usedStorageSpace,
            dnsEnable,
            connectAddress,
            connectDomainName,
            publicConnectAddress,
            publicConnectDomainName,
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
            managementConnectDomainName,
            publicManagementConnectAddress,
            publicManagementConnectDomainName,
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
            availableZoneNames,
            totalStorageSpace,
            storageResourceId,
            storageSpecCode,
            ipv6Enable,
            ipv6ConnectAddresses,
            tags,
            serviceType,
            storageType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstanceResp {\n");
        sb.append("    accessUser: ").append(toIndentedString(accessUser)).append("\n");
        sb.append("    brokerNum: ").append(toIndentedString(brokerNum)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
        sb.append("    engineVersion: ").append(toIndentedString(engineVersion)).append("\n");
        sb.append("    specification: ").append(toIndentedString(specification)).append("\n");
        sb.append("    storageSpace: ").append(toIndentedString(storageSpace)).append("\n");
        sb.append("    usedStorageSpace: ").append(toIndentedString(usedStorageSpace)).append("\n");
        sb.append("    dnsEnable: ").append(toIndentedString(dnsEnable)).append("\n");
        sb.append("    connectAddress: ").append(toIndentedString(connectAddress)).append("\n");
        sb.append("    connectDomainName: ").append(toIndentedString(connectDomainName)).append("\n");
        sb.append("    publicConnectAddress: ").append(toIndentedString(publicConnectAddress)).append("\n");
        sb.append("    publicConnectDomainName: ").append(toIndentedString(publicConnectDomainName)).append("\n");
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
        sb.append("    managementConnectDomainName: ")
            .append(toIndentedString(managementConnectDomainName))
            .append("\n");
        sb.append("    publicManagementConnectAddress: ")
            .append(toIndentedString(publicManagementConnectAddress))
            .append("\n");
        sb.append("    publicManagementConnectDomainName: ")
            .append(toIndentedString(publicManagementConnectDomainName))
            .append("\n");
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
        sb.append("    availableZoneNames: ").append(toIndentedString(availableZoneNames)).append("\n");
        sb.append("    totalStorageSpace: ").append(toIndentedString(totalStorageSpace)).append("\n");
        sb.append("    storageResourceId: ").append(toIndentedString(storageResourceId)).append("\n");
        sb.append("    storageSpecCode: ").append(toIndentedString(storageSpecCode)).append("\n");
        sb.append("    ipv6Enable: ").append(toIndentedString(ipv6Enable)).append("\n");
        sb.append("    ipv6ConnectAddresses: ").append(toIndentedString(ipv6ConnectAddresses)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
        sb.append("    storageType: ").append(toIndentedString(storageType)).append("\n");
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
