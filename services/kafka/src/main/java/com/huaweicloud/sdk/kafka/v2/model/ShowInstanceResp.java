package com.huaweicloud.sdk.kafka.v2.model;

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
    @JsonProperty(value = "engine_version")

    private String engineVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "specification")

    private String specification;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_space")

    private Integer storageSpace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition_num")

    private String partitionNum;

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
    @JsonProperty(value = "port")

    private Integer port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

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
    @JsonProperty(value = "subnet_name")

    private String subnetName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_cidr")

    private String subnetCidr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_user")

    private String accessUser;

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
    @JsonProperty(value = "management_connect_address")

    private String managementConnectAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssl_enable")

    private Boolean sslEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "broker_ssl_enable")

    private Boolean brokerSslEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kafka_security_protocol")

    private String kafkaSecurityProtocol;

    /**
     * Gets or Sets saslEnabledMechanisms
     */
    public static final class SaslEnabledMechanismsEnum {

        /**
         * Enum PLAIN for value: "PLAIN"
         */
        public static final SaslEnabledMechanismsEnum PLAIN = new SaslEnabledMechanismsEnum("PLAIN");

        /**
         * Enum SCRAM_SHA_512 for value: "SCRAM-SHA-512"
         */
        public static final SaslEnabledMechanismsEnum SCRAM_SHA_512 = new SaslEnabledMechanismsEnum("SCRAM-SHA-512");

        private static final Map<String, SaslEnabledMechanismsEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SaslEnabledMechanismsEnum> createStaticFields() {
            Map<String, SaslEnabledMechanismsEnum> map = new HashMap<>();
            map.put("PLAIN", PLAIN);
            map.put("SCRAM-SHA-512", SCRAM_SHA_512);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SaslEnabledMechanismsEnum(String value) {
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
        public static SaslEnabledMechanismsEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SaslEnabledMechanismsEnum(value));
        }

        public static SaslEnabledMechanismsEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SaslEnabledMechanismsEnum) {
                return this.value.equals(((SaslEnabledMechanismsEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sasl_enabled_mechanisms")

    private List<SaslEnabledMechanismsEnum> saslEnabledMechanisms = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssl_two_way_enable")

    private Boolean sslTwoWayEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cert_replaced")

    private Boolean certReplaced;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_management_connect_address")

    private String publicManagementConnectAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_logical_volume")

    private Boolean isLogicalVolume;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_times")

    private Integer extendTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_auto_topic")

    private Boolean enableAutoTopic;

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
    @JsonProperty(value = "public_connect_address")

    private String publicConnectAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_connect_domain_name")

    private String publicConnectDomainName;

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

    /**
     * 消息老化策略。
     */
    public static final class RetentionPolicyEnum {

        /**
         * Enum TIME_BASE for value: "time_base"
         */
        public static final RetentionPolicyEnum TIME_BASE = new RetentionPolicyEnum("time_base");

        /**
         * Enum PRODUCE_REJECT for value: "produce_reject"
         */
        public static final RetentionPolicyEnum PRODUCE_REJECT = new RetentionPolicyEnum("produce_reject");

        private static final Map<String, RetentionPolicyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RetentionPolicyEnum> createStaticFields() {
            Map<String, RetentionPolicyEnum> map = new HashMap<>();
            map.put("time_base", TIME_BASE);
            map.put("produce_reject", PRODUCE_REJECT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RetentionPolicyEnum(String value) {
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
        public static RetentionPolicyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RetentionPolicyEnum(value));
        }

        public static RetentionPolicyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RetentionPolicyEnum) {
                return this.value.equals(((RetentionPolicyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retention_policy")

    private RetentionPolicyEnum retentionPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kafka_public_status")

    private String kafkaPublicStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_bandwidth")

    private Integer publicBandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_log_collection")

    private Boolean enableLogCollection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_auth_cert")

    private Boolean newAuthCert;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cross_vpc_info")

    private String crossVpcInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_enable")

    private Boolean ipv6Enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_connect_addresses")

    private List<String> ipv6ConnectAddresses = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connector_enable")

    private Boolean connectorEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connector_node_num")

    private Integer connectorNodeNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connector_id")

    private String connectorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rest_enable")

    private Boolean restEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rest_connect_address")

    private String restConnectAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_boundwidth")

    private Integer publicBoundwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message_query_inst_enable")

    private Boolean messageQueryInstEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_client_plain")

    private Boolean vpcClientPlain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_features")

    private String supportFeatures;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trace_enable")

    private Boolean traceEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_enable")

    private Boolean agentEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pod_connect_address")

    private String podConnectAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_encrypted")

    private Boolean diskEncrypted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_encrypted_key")

    private String diskEncryptedKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kafka_private_connect_address")

    private String kafkaPrivateConnectAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kafka_private_connect_domain_name")

    private String kafkaPrivateConnectDomainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ces_version")

    private String cesVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_access_enabled")

    private String publicAccessEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_num")

    private Integer nodeNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_protocols")

    private PortProtocolsEntity portProtocols;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_acl")

    private Boolean enableAcl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_spec_billing_enable")

    private Boolean newSpecBillingEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "broker_num")

    private Integer brokerNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TagEntity> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dr_enable")

    private Boolean drEnable;

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

    public ShowInstanceResp withDescription(String description) {
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

    public ShowInstanceResp withStorageSpace(Integer storageSpace) {
        this.storageSpace = storageSpace;
        return this;
    }

    /**
     * 消息存储空间，单位：GB。
     * @return storageSpace
     */
    public Integer getStorageSpace() {
        return storageSpace;
    }

    public void setStorageSpace(Integer storageSpace) {
        this.storageSpace = storageSpace;
    }

    public ShowInstanceResp withPartitionNum(String partitionNum) {
        this.partitionNum = partitionNum;
        return this;
    }

    /**
     * Kafka实例的分区数量。
     * @return partitionNum
     */
    public String getPartitionNum() {
        return partitionNum;
    }

    public void setPartitionNum(String partitionNum) {
        this.partitionNum = partitionNum;
    }

    public ShowInstanceResp withUsedStorageSpace(Integer usedStorageSpace) {
        this.usedStorageSpace = usedStorageSpace;
        return this;
    }

    /**
     * 已使用的消息存储空间，单位：GB。
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
     * 实例是否开启域名访问功能。 - true：开启 - false：未开启
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
     * 实例连接IP地址。
     * @return connectAddress
     */
    public String getConnectAddress() {
        return connectAddress;
    }

    public void setConnectAddress(String connectAddress) {
        this.connectAddress = connectAddress;
    }

    public ShowInstanceResp withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * 实例连接端口。
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
     * 实例的状态。详细状态说明请参考[实例状态说明](kafka-api-180514012.xml)。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public ShowInstanceResp withResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
        return this;
    }

    /**
     * 资源规格标识。   [- dms.instance.kafka.cluster.c3.mini：Kafka实例的基准带宽为100MByte/秒。   - dms.instance.kafka.cluster.c3.small.2：Kafka实例的基准带宽为300MByte/秒。   - dms.instance.kafka.cluster.c3.middle.2：Kafka实例的基准带宽为600MByte/秒。   - dms.instance.kafka.cluster.c3.high.2：Kafka实例的基准带宽为1200MByte/秒。](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,hk_tm,dt)
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
     * [付费模式，1表示按需计费，0表示包年/包月计费。](tag:hws,hws_hk,ctc,cmcc)[付费模式，暂未使用。](tag:hws_ocb,ocb) [付费模式，1表示按需计费。](tag:dt,g42,tm,hk_g42,hk_tm,hcs,fcs,sbc,hk_sbc,hws_eu)
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
     * VPC ID。
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
     * VPC的名称。
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
     * 完成创建时间。  格式为时间戳，指从格林威治时间 1970年01月01日00时00分00秒起至指定时间的偏差总毫秒数。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
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
     * 子网网段。
     * @return subnetCidr
     */
    public String getSubnetCidr() {
        return subnetCidr;
    }

    public void setSubnetCidr(String subnetCidr) {
        this.subnetCidr = subnetCidr;
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

    public ShowInstanceResp withAccessUser(String accessUser) {
        this.accessUser = accessUser;
        return this;
    }

    /**
     * 实例访问用户名。
     * @return accessUser
     */
    public String getAccessUser() {
        return accessUser;
    }

    public void setAccessUser(String accessUser) {
        this.accessUser = accessUser;
    }

    public ShowInstanceResp withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 订单ID，只有在包周期计费时才会有order_id值，其他计费方式order_id值为空。
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

    public ShowInstanceResp withEnablePublicip(Boolean enablePublicip) {
        this.enablePublicip = enablePublicip;
        return this;
    }

    /**
     * 实例是否开启公网访问功能。 - true：开启 - false：未开启
     * @return enablePublicip
     */
    public Boolean getEnablePublicip() {
        return enablePublicip;
    }

    public void setEnablePublicip(Boolean enablePublicip) {
        this.enablePublicip = enablePublicip;
    }

    public ShowInstanceResp withManagementConnectAddress(String managementConnectAddress) {
        this.managementConnectAddress = managementConnectAddress;
        return this;
    }

    /**
     * Kafka实例的Kafka Manager连接地址。
     * @return managementConnectAddress
     */
    public String getManagementConnectAddress() {
        return managementConnectAddress;
    }

    public void setManagementConnectAddress(String managementConnectAddress) {
        this.managementConnectAddress = managementConnectAddress;
    }

    public ShowInstanceResp withSslEnable(Boolean sslEnable) {
        this.sslEnable = sslEnable;
        return this;
    }

    /**
     * 是否开启安全认证。 - true：开启 - false：未开启
     * @return sslEnable
     */
    public Boolean getSslEnable() {
        return sslEnable;
    }

    public void setSslEnable(Boolean sslEnable) {
        this.sslEnable = sslEnable;
    }

    public ShowInstanceResp withBrokerSslEnable(Boolean brokerSslEnable) {
        this.brokerSslEnable = brokerSslEnable;
        return this;
    }

    /**
     * 是否开启broker间副本加密传输。 - true：开启 - false：未开启
     * @return brokerSslEnable
     */
    public Boolean getBrokerSslEnable() {
        return brokerSslEnable;
    }

    public void setBrokerSslEnable(Boolean brokerSslEnable) {
        this.brokerSslEnable = brokerSslEnable;
    }

    public ShowInstanceResp withKafkaSecurityProtocol(String kafkaSecurityProtocol) {
        this.kafkaSecurityProtocol = kafkaSecurityProtocol;
        return this;
    }

    /**
     * Kafka使用的安全协议。 若实例详情中不存在port_protocols返回参数，则kafka_security_protocol同时代表内网访问、公网访问以及跨VPC访问的安全协议。 若实例详情中存在port_protocols返回参数，则kafka_security_protocol仅代表跨VPC访问的安全协议。内网访问公网访问的安全协议请参考port_protocols参数。  - PLAINTEXT: 既未采用SSL证书进行加密传输，也不支持账号密码认证。性能更好，安全性较低，建议在生产环境下公网访问不使用此方式。 - SASL_SSL: 采用SSL证书进行加密传输，支持账号密码认证，安全性更高。 - SASL_PLAINTEXT: 明文传输，支持账号密码认证，性能更好，建议使用SCRAM-SHA-512机制。
     * @return kafkaSecurityProtocol
     */
    public String getKafkaSecurityProtocol() {
        return kafkaSecurityProtocol;
    }

    public void setKafkaSecurityProtocol(String kafkaSecurityProtocol) {
        this.kafkaSecurityProtocol = kafkaSecurityProtocol;
    }

    public ShowInstanceResp withSaslEnabledMechanisms(List<SaslEnabledMechanismsEnum> saslEnabledMechanisms) {
        this.saslEnabledMechanisms = saslEnabledMechanisms;
        return this;
    }

    public ShowInstanceResp addSaslEnabledMechanismsItem(SaslEnabledMechanismsEnum saslEnabledMechanismsItem) {
        if (this.saslEnabledMechanisms == null) {
            this.saslEnabledMechanisms = new ArrayList<>();
        }
        this.saslEnabledMechanisms.add(saslEnabledMechanismsItem);
        return this;
    }

    public ShowInstanceResp withSaslEnabledMechanisms(
        Consumer<List<SaslEnabledMechanismsEnum>> saslEnabledMechanismsSetter) {
        if (this.saslEnabledMechanisms == null) {
            this.saslEnabledMechanisms = new ArrayList<>();
        }
        saslEnabledMechanismsSetter.accept(this.saslEnabledMechanisms);
        return this;
    }

    /**
     * 开启SASL后使用的认证机制。 - PLAIN: 简单的用户名密码校验。 - SCRAM-SHA-512: 用户凭证校验，安全性比PLAIN机制更高。
     * @return saslEnabledMechanisms
     */
    public List<SaslEnabledMechanismsEnum> getSaslEnabledMechanisms() {
        return saslEnabledMechanisms;
    }

    public void setSaslEnabledMechanisms(List<SaslEnabledMechanismsEnum> saslEnabledMechanisms) {
        this.saslEnabledMechanisms = saslEnabledMechanisms;
    }

    public ShowInstanceResp withSslTwoWayEnable(Boolean sslTwoWayEnable) {
        this.sslTwoWayEnable = sslTwoWayEnable;
        return this;
    }

    /**
     * 是否开启双向认证。
     * @return sslTwoWayEnable
     */
    public Boolean getSslTwoWayEnable() {
        return sslTwoWayEnable;
    }

    public void setSslTwoWayEnable(Boolean sslTwoWayEnable) {
        this.sslTwoWayEnable = sslTwoWayEnable;
    }

    public ShowInstanceResp withCertReplaced(Boolean certReplaced) {
        this.certReplaced = certReplaced;
        return this;
    }

    /**
     * 是否能够证书替换。
     * @return certReplaced
     */
    public Boolean getCertReplaced() {
        return certReplaced;
    }

    public void setCertReplaced(Boolean certReplaced) {
        this.certReplaced = certReplaced;
    }

    public ShowInstanceResp withPublicManagementConnectAddress(String publicManagementConnectAddress) {
        this.publicManagementConnectAddress = publicManagementConnectAddress;
        return this;
    }

    /**
     * 公网访问Kafka Manager连接地址。
     * @return publicManagementConnectAddress
     */
    public String getPublicManagementConnectAddress() {
        return publicManagementConnectAddress;
    }

    public void setPublicManagementConnectAddress(String publicManagementConnectAddress) {
        this.publicManagementConnectAddress = publicManagementConnectAddress;
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

    public ShowInstanceResp withIsLogicalVolume(Boolean isLogicalVolume) {
        this.isLogicalVolume = isLogicalVolume;
        return this;
    }

    /**
     * 实例扩容时用于区分老实例与新实例。 - true：新创建的实例，允许磁盘动态扩容不需要重启。 - false：老实例
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
     * 实例扩容磁盘次数，如果超过20次则无法扩容磁盘。
     * @return extendTimes
     */
    public Integer getExtendTimes() {
        return extendTimes;
    }

    public void setExtendTimes(Integer extendTimes) {
        this.extendTimes = extendTimes;
    }

    public ShowInstanceResp withEnableAutoTopic(Boolean enableAutoTopic) {
        this.enableAutoTopic = enableAutoTopic;
        return this;
    }

    /**
     * 是否打开kafka自动创建Topic功能。   - true：开启   - false：关闭
     * @return enableAutoTopic
     */
    public Boolean getEnableAutoTopic() {
        return enableAutoTopic;
    }

    public void setEnableAutoTopic(Boolean enableAutoTopic) {
        this.enableAutoTopic = enableAutoTopic;
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
     * 实例节点所在的可用区，返回“可用区ID”。
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
     * 实例节点所在的可用区名称，返回“可用区名称”。
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
     * 总共消息存储空间，单位：GB。
     * @return totalStorageSpace
     */
    public Integer getTotalStorageSpace() {
        return totalStorageSpace;
    }

    public void setTotalStorageSpace(Integer totalStorageSpace) {
        this.totalStorageSpace = totalStorageSpace;
    }

    public ShowInstanceResp withPublicConnectAddress(String publicConnectAddress) {
        this.publicConnectAddress = publicConnectAddress;
        return this;
    }

    /**
     * 实例公网连接IP地址。当实例开启了公网访问，实例才包含该参数。
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
     * 实例公网连接域名。当实例开启了公网访问，实例才包含该参数。
     * @return publicConnectDomainName
     */
    public String getPublicConnectDomainName() {
        return publicConnectDomainName;
    }

    public void setPublicConnectDomainName(String publicConnectDomainName) {
        this.publicConnectDomainName = publicConnectDomainName;
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
     * IO规格。
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

    public ShowInstanceResp withRetentionPolicy(RetentionPolicyEnum retentionPolicy) {
        this.retentionPolicy = retentionPolicy;
        return this;
    }

    /**
     * 消息老化策略。
     * @return retentionPolicy
     */
    public RetentionPolicyEnum getRetentionPolicy() {
        return retentionPolicy;
    }

    public void setRetentionPolicy(RetentionPolicyEnum retentionPolicy) {
        this.retentionPolicy = retentionPolicy;
    }

    public ShowInstanceResp withKafkaPublicStatus(String kafkaPublicStatus) {
        this.kafkaPublicStatus = kafkaPublicStatus;
        return this;
    }

    /**
     * Kafka公网开启状态。
     * @return kafkaPublicStatus
     */
    public String getKafkaPublicStatus() {
        return kafkaPublicStatus;
    }

    public void setKafkaPublicStatus(String kafkaPublicStatus) {
        this.kafkaPublicStatus = kafkaPublicStatus;
    }

    public ShowInstanceResp withPublicBandwidth(Integer publicBandwidth) {
        this.publicBandwidth = publicBandwidth;
        return this;
    }

    /**
     * kafka公网访问带宽。
     * @return publicBandwidth
     */
    public Integer getPublicBandwidth() {
        return publicBandwidth;
    }

    public void setPublicBandwidth(Integer publicBandwidth) {
        this.publicBandwidth = publicBandwidth;
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

    public ShowInstanceResp withNewAuthCert(Boolean newAuthCert) {
        this.newAuthCert = newAuthCert;
        return this;
    }

    /**
     * 是否开启新证书。
     * @return newAuthCert
     */
    public Boolean getNewAuthCert() {
        return newAuthCert;
    }

    public void setNewAuthCert(Boolean newAuthCert) {
        this.newAuthCert = newAuthCert;
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

    public ShowInstanceResp withIpv6Enable(Boolean ipv6Enable) {
        this.ipv6Enable = ipv6Enable;
        return this;
    }

    /**
     * 是否开启ipv6。
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
     * IPv6的连接地址。
     * @return ipv6ConnectAddresses
     */
    public List<String> getIpv6ConnectAddresses() {
        return ipv6ConnectAddresses;
    }

    public void setIpv6ConnectAddresses(List<String> ipv6ConnectAddresses) {
        this.ipv6ConnectAddresses = ipv6ConnectAddresses;
    }

    public ShowInstanceResp withConnectorEnable(Boolean connectorEnable) {
        this.connectorEnable = connectorEnable;
        return this;
    }

    /**
     * 是否开启转储。新规格产品暂不支持开启转储。
     * @return connectorEnable
     */
    public Boolean getConnectorEnable() {
        return connectorEnable;
    }

    public void setConnectorEnable(Boolean connectorEnable) {
        this.connectorEnable = connectorEnable;
    }

    public ShowInstanceResp withConnectorNodeNum(Integer connectorNodeNum) {
        this.connectorNodeNum = connectorNodeNum;
        return this;
    }

    /**
     * connector节点数量。
     * @return connectorNodeNum
     */
    public Integer getConnectorNodeNum() {
        return connectorNodeNum;
    }

    public void setConnectorNodeNum(Integer connectorNodeNum) {
        this.connectorNodeNum = connectorNodeNum;
    }

    public ShowInstanceResp withConnectorId(String connectorId) {
        this.connectorId = connectorId;
        return this;
    }

    /**
     * 转储任务ID。
     * @return connectorId
     */
    public String getConnectorId() {
        return connectorId;
    }

    public void setConnectorId(String connectorId) {
        this.connectorId = connectorId;
    }

    public ShowInstanceResp withRestEnable(Boolean restEnable) {
        this.restEnable = restEnable;
        return this;
    }

    /**
     * 是否开启Kafka rest功能。
     * @return restEnable
     */
    public Boolean getRestEnable() {
        return restEnable;
    }

    public void setRestEnable(Boolean restEnable) {
        this.restEnable = restEnable;
    }

    public ShowInstanceResp withRestConnectAddress(String restConnectAddress) {
        this.restConnectAddress = restConnectAddress;
        return this;
    }

    /**
     * Kafka rest连接地址。
     * @return restConnectAddress
     */
    public String getRestConnectAddress() {
        return restConnectAddress;
    }

    public void setRestConnectAddress(String restConnectAddress) {
        this.restConnectAddress = restConnectAddress;
    }

    public ShowInstanceResp withPublicBoundwidth(Integer publicBoundwidth) {
        this.publicBoundwidth = publicBoundwidth;
        return this;
    }

    /**
     * kafka公网访问带宽。待删除版本。
     * @return publicBoundwidth
     */
    public Integer getPublicBoundwidth() {
        return publicBoundwidth;
    }

    public void setPublicBoundwidth(Integer publicBoundwidth) {
        this.publicBoundwidth = publicBoundwidth;
    }

    public ShowInstanceResp withMessageQueryInstEnable(Boolean messageQueryInstEnable) {
        this.messageQueryInstEnable = messageQueryInstEnable;
        return this;
    }

    /**
     * 是否开启消息查询功能。
     * @return messageQueryInstEnable
     */
    public Boolean getMessageQueryInstEnable() {
        return messageQueryInstEnable;
    }

    public void setMessageQueryInstEnable(Boolean messageQueryInstEnable) {
        this.messageQueryInstEnable = messageQueryInstEnable;
    }

    public ShowInstanceResp withVpcClientPlain(Boolean vpcClientPlain) {
        this.vpcClientPlain = vpcClientPlain;
        return this;
    }

    /**
     * 是否开启VPC明文访问。
     * @return vpcClientPlain
     */
    public Boolean getVpcClientPlain() {
        return vpcClientPlain;
    }

    public void setVpcClientPlain(Boolean vpcClientPlain) {
        this.vpcClientPlain = vpcClientPlain;
    }

    public ShowInstanceResp withSupportFeatures(String supportFeatures) {
        this.supportFeatures = supportFeatures;
        return this;
    }

    /**
     * Kafka实例支持的特性功能。
     * @return supportFeatures
     */
    public String getSupportFeatures() {
        return supportFeatures;
    }

    public void setSupportFeatures(String supportFeatures) {
        this.supportFeatures = supportFeatures;
    }

    public ShowInstanceResp withTraceEnable(Boolean traceEnable) {
        this.traceEnable = traceEnable;
        return this;
    }

    /**
     * 是否开启消息轨迹功能。
     * @return traceEnable
     */
    public Boolean getTraceEnable() {
        return traceEnable;
    }

    public void setTraceEnable(Boolean traceEnable) {
        this.traceEnable = traceEnable;
    }

    public ShowInstanceResp withAgentEnable(Boolean agentEnable) {
        this.agentEnable = agentEnable;
        return this;
    }

    /**
     * 是否开启代理。
     * @return agentEnable
     */
    public Boolean getAgentEnable() {
        return agentEnable;
    }

    public void setAgentEnable(Boolean agentEnable) {
        this.agentEnable = agentEnable;
    }

    public ShowInstanceResp withPodConnectAddress(String podConnectAddress) {
        this.podConnectAddress = podConnectAddress;
        return this;
    }

    /**
     * 租户侧连接地址。
     * @return podConnectAddress
     */
    public String getPodConnectAddress() {
        return podConnectAddress;
    }

    public void setPodConnectAddress(String podConnectAddress) {
        this.podConnectAddress = podConnectAddress;
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

    public ShowInstanceResp withDiskEncryptedKey(String diskEncryptedKey) {
        this.diskEncryptedKey = diskEncryptedKey;
        return this;
    }

    /**
     * 磁盘加密key，未开启磁盘加密时为空。
     * @return diskEncryptedKey
     */
    public String getDiskEncryptedKey() {
        return diskEncryptedKey;
    }

    public void setDiskEncryptedKey(String diskEncryptedKey) {
        this.diskEncryptedKey = diskEncryptedKey;
    }

    public ShowInstanceResp withKafkaPrivateConnectAddress(String kafkaPrivateConnectAddress) {
        this.kafkaPrivateConnectAddress = kafkaPrivateConnectAddress;
        return this;
    }

    /**
     * Kafka实例内网连接地址。
     * @return kafkaPrivateConnectAddress
     */
    public String getKafkaPrivateConnectAddress() {
        return kafkaPrivateConnectAddress;
    }

    public void setKafkaPrivateConnectAddress(String kafkaPrivateConnectAddress) {
        this.kafkaPrivateConnectAddress = kafkaPrivateConnectAddress;
    }

    public ShowInstanceResp withKafkaPrivateConnectDomainName(String kafkaPrivateConnectDomainName) {
        this.kafkaPrivateConnectDomainName = kafkaPrivateConnectDomainName;
        return this;
    }

    /**
     * Kafka实例内网连接域名。
     * @return kafkaPrivateConnectDomainName
     */
    public String getKafkaPrivateConnectDomainName() {
        return kafkaPrivateConnectDomainName;
    }

    public void setKafkaPrivateConnectDomainName(String kafkaPrivateConnectDomainName) {
        this.kafkaPrivateConnectDomainName = kafkaPrivateConnectDomainName;
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

    public ShowInstanceResp withPublicAccessEnabled(String publicAccessEnabled) {
        this.publicAccessEnabled = publicAccessEnabled;
        return this;
    }

    /**
     *  区分实例什么时候开启的公网访问  取值范围：   - true：已开启公网访问   - actived：已开启公网访问   - closed：已关闭公网访问   - false：已关闭公网访问 
     * @return publicAccessEnabled
     */
    public String getPublicAccessEnabled() {
        return publicAccessEnabled;
    }

    public void setPublicAccessEnabled(String publicAccessEnabled) {
        this.publicAccessEnabled = publicAccessEnabled;
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

    public ShowInstanceResp withPortProtocols(PortProtocolsEntity portProtocols) {
        this.portProtocols = portProtocols;
        return this;
    }

    public ShowInstanceResp withPortProtocols(Consumer<PortProtocolsEntity> portProtocolsSetter) {
        if (this.portProtocols == null) {
            this.portProtocols = new PortProtocolsEntity();
            portProtocolsSetter.accept(this.portProtocols);
        }

        return this;
    }

    /**
     * Get portProtocols
     * @return portProtocols
     */
    public PortProtocolsEntity getPortProtocols() {
        return portProtocols;
    }

    public void setPortProtocols(PortProtocolsEntity portProtocols) {
        this.portProtocols = portProtocols;
    }

    public ShowInstanceResp withEnableAcl(Boolean enableAcl) {
        this.enableAcl = enableAcl;
        return this;
    }

    /**
     * 是否开启访问控制。
     * @return enableAcl
     */
    public Boolean getEnableAcl() {
        return enableAcl;
    }

    public void setEnableAcl(Boolean enableAcl) {
        this.enableAcl = enableAcl;
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

    public ShowInstanceResp withBrokerNum(Integer brokerNum) {
        this.brokerNum = brokerNum;
        return this;
    }

    /**
     * 节点数量。
     * @return brokerNum
     */
    public Integer getBrokerNum() {
        return brokerNum;
    }

    public void setBrokerNum(Integer brokerNum) {
        this.brokerNum = brokerNum;
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

    public ShowInstanceResp withDrEnable(Boolean drEnable) {
        this.drEnable = drEnable;
        return this;
    }

    /**
     * 是否为容灾实例。
     * @return drEnable
     */
    public Boolean getDrEnable() {
        return drEnable;
    }

    public void setDrEnable(Boolean drEnable) {
        this.drEnable = drEnable;
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
            && Objects.equals(this.engineVersion, that.engineVersion)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.specification, that.specification)
            && Objects.equals(this.storageSpace, that.storageSpace)
            && Objects.equals(this.partitionNum, that.partitionNum)
            && Objects.equals(this.usedStorageSpace, that.usedStorageSpace)
            && Objects.equals(this.dnsEnable, that.dnsEnable)
            && Objects.equals(this.connectAddress, that.connectAddress) && Objects.equals(this.port, that.port)
            && Objects.equals(this.status, that.status) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.resourceSpecCode, that.resourceSpecCode)
            && Objects.equals(this.chargingMode, that.chargingMode) && Objects.equals(this.vpcId, that.vpcId)
            && Objects.equals(this.vpcName, that.vpcName) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.subnetName, that.subnetName) && Objects.equals(this.subnetCidr, that.subnetCidr)
            && Objects.equals(this.userId, that.userId) && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.accessUser, that.accessUser) && Objects.equals(this.orderId, that.orderId)
            && Objects.equals(this.maintainBegin, that.maintainBegin)
            && Objects.equals(this.maintainEnd, that.maintainEnd)
            && Objects.equals(this.enablePublicip, that.enablePublicip)
            && Objects.equals(this.managementConnectAddress, that.managementConnectAddress)
            && Objects.equals(this.sslEnable, that.sslEnable)
            && Objects.equals(this.brokerSslEnable, that.brokerSslEnable)
            && Objects.equals(this.kafkaSecurityProtocol, that.kafkaSecurityProtocol)
            && Objects.equals(this.saslEnabledMechanisms, that.saslEnabledMechanisms)
            && Objects.equals(this.sslTwoWayEnable, that.sslTwoWayEnable)
            && Objects.equals(this.certReplaced, that.certReplaced)
            && Objects.equals(this.publicManagementConnectAddress, that.publicManagementConnectAddress)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.isLogicalVolume, that.isLogicalVolume)
            && Objects.equals(this.extendTimes, that.extendTimes)
            && Objects.equals(this.enableAutoTopic, that.enableAutoTopic) && Objects.equals(this.type, that.type)
            && Objects.equals(this.productId, that.productId)
            && Objects.equals(this.securityGroupId, that.securityGroupId)
            && Objects.equals(this.securityGroupName, that.securityGroupName)
            && Objects.equals(this.subnetId, that.subnetId) && Objects.equals(this.availableZones, that.availableZones)
            && Objects.equals(this.availableZoneNames, that.availableZoneNames)
            && Objects.equals(this.totalStorageSpace, that.totalStorageSpace)
            && Objects.equals(this.publicConnectAddress, that.publicConnectAddress)
            && Objects.equals(this.publicConnectDomainName, that.publicConnectDomainName)
            && Objects.equals(this.storageResourceId, that.storageResourceId)
            && Objects.equals(this.storageSpecCode, that.storageSpecCode)
            && Objects.equals(this.serviceType, that.serviceType) && Objects.equals(this.storageType, that.storageType)
            && Objects.equals(this.retentionPolicy, that.retentionPolicy)
            && Objects.equals(this.kafkaPublicStatus, that.kafkaPublicStatus)
            && Objects.equals(this.publicBandwidth, that.publicBandwidth)
            && Objects.equals(this.enableLogCollection, that.enableLogCollection)
            && Objects.equals(this.newAuthCert, that.newAuthCert)
            && Objects.equals(this.crossVpcInfo, that.crossVpcInfo) && Objects.equals(this.ipv6Enable, that.ipv6Enable)
            && Objects.equals(this.ipv6ConnectAddresses, that.ipv6ConnectAddresses)
            && Objects.equals(this.connectorEnable, that.connectorEnable)
            && Objects.equals(this.connectorNodeNum, that.connectorNodeNum)
            && Objects.equals(this.connectorId, that.connectorId) && Objects.equals(this.restEnable, that.restEnable)
            && Objects.equals(this.restConnectAddress, that.restConnectAddress)
            && Objects.equals(this.publicBoundwidth, that.publicBoundwidth)
            && Objects.equals(this.messageQueryInstEnable, that.messageQueryInstEnable)
            && Objects.equals(this.vpcClientPlain, that.vpcClientPlain)
            && Objects.equals(this.supportFeatures, that.supportFeatures)
            && Objects.equals(this.traceEnable, that.traceEnable) && Objects.equals(this.agentEnable, that.agentEnable)
            && Objects.equals(this.podConnectAddress, that.podConnectAddress)
            && Objects.equals(this.diskEncrypted, that.diskEncrypted)
            && Objects.equals(this.diskEncryptedKey, that.diskEncryptedKey)
            && Objects.equals(this.kafkaPrivateConnectAddress, that.kafkaPrivateConnectAddress)
            && Objects.equals(this.kafkaPrivateConnectDomainName, that.kafkaPrivateConnectDomainName)
            && Objects.equals(this.cesVersion, that.cesVersion)
            && Objects.equals(this.publicAccessEnabled, that.publicAccessEnabled)
            && Objects.equals(this.nodeNum, that.nodeNum) && Objects.equals(this.portProtocols, that.portProtocols)
            && Objects.equals(this.enableAcl, that.enableAcl)
            && Objects.equals(this.newSpecBillingEnable, that.newSpecBillingEnable)
            && Objects.equals(this.brokerNum, that.brokerNum) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.drEnable, that.drEnable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            engine,
            engineVersion,
            description,
            specification,
            storageSpace,
            partitionNum,
            usedStorageSpace,
            dnsEnable,
            connectAddress,
            port,
            status,
            instanceId,
            resourceSpecCode,
            chargingMode,
            vpcId,
            vpcName,
            createdAt,
            subnetName,
            subnetCidr,
            userId,
            userName,
            accessUser,
            orderId,
            maintainBegin,
            maintainEnd,
            enablePublicip,
            managementConnectAddress,
            sslEnable,
            brokerSslEnable,
            kafkaSecurityProtocol,
            saslEnabledMechanisms,
            sslTwoWayEnable,
            certReplaced,
            publicManagementConnectAddress,
            enterpriseProjectId,
            isLogicalVolume,
            extendTimes,
            enableAutoTopic,
            type,
            productId,
            securityGroupId,
            securityGroupName,
            subnetId,
            availableZones,
            availableZoneNames,
            totalStorageSpace,
            publicConnectAddress,
            publicConnectDomainName,
            storageResourceId,
            storageSpecCode,
            serviceType,
            storageType,
            retentionPolicy,
            kafkaPublicStatus,
            publicBandwidth,
            enableLogCollection,
            newAuthCert,
            crossVpcInfo,
            ipv6Enable,
            ipv6ConnectAddresses,
            connectorEnable,
            connectorNodeNum,
            connectorId,
            restEnable,
            restConnectAddress,
            publicBoundwidth,
            messageQueryInstEnable,
            vpcClientPlain,
            supportFeatures,
            traceEnable,
            agentEnable,
            podConnectAddress,
            diskEncrypted,
            diskEncryptedKey,
            kafkaPrivateConnectAddress,
            kafkaPrivateConnectDomainName,
            cesVersion,
            publicAccessEnabled,
            nodeNum,
            portProtocols,
            enableAcl,
            newSpecBillingEnable,
            brokerNum,
            tags,
            drEnable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstanceResp {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
        sb.append("    engineVersion: ").append(toIndentedString(engineVersion)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    specification: ").append(toIndentedString(specification)).append("\n");
        sb.append("    storageSpace: ").append(toIndentedString(storageSpace)).append("\n");
        sb.append("    partitionNum: ").append(toIndentedString(partitionNum)).append("\n");
        sb.append("    usedStorageSpace: ").append(toIndentedString(usedStorageSpace)).append("\n");
        sb.append("    dnsEnable: ").append(toIndentedString(dnsEnable)).append("\n");
        sb.append("    connectAddress: ").append(toIndentedString(connectAddress)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    resourceSpecCode: ").append(toIndentedString(resourceSpecCode)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    vpcName: ").append(toIndentedString(vpcName)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    subnetName: ").append(toIndentedString(subnetName)).append("\n");
        sb.append("    subnetCidr: ").append(toIndentedString(subnetCidr)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    accessUser: ").append(toIndentedString(accessUser)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    maintainBegin: ").append(toIndentedString(maintainBegin)).append("\n");
        sb.append("    maintainEnd: ").append(toIndentedString(maintainEnd)).append("\n");
        sb.append("    enablePublicip: ").append(toIndentedString(enablePublicip)).append("\n");
        sb.append("    managementConnectAddress: ").append(toIndentedString(managementConnectAddress)).append("\n");
        sb.append("    sslEnable: ").append(toIndentedString(sslEnable)).append("\n");
        sb.append("    brokerSslEnable: ").append(toIndentedString(brokerSslEnable)).append("\n");
        sb.append("    kafkaSecurityProtocol: ").append(toIndentedString(kafkaSecurityProtocol)).append("\n");
        sb.append("    saslEnabledMechanisms: ").append(toIndentedString(saslEnabledMechanisms)).append("\n");
        sb.append("    sslTwoWayEnable: ").append(toIndentedString(sslTwoWayEnable)).append("\n");
        sb.append("    certReplaced: ").append(toIndentedString(certReplaced)).append("\n");
        sb.append("    publicManagementConnectAddress: ")
            .append(toIndentedString(publicManagementConnectAddress))
            .append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    isLogicalVolume: ").append(toIndentedString(isLogicalVolume)).append("\n");
        sb.append("    extendTimes: ").append(toIndentedString(extendTimes)).append("\n");
        sb.append("    enableAutoTopic: ").append(toIndentedString(enableAutoTopic)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    securityGroupName: ").append(toIndentedString(securityGroupName)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    availableZones: ").append(toIndentedString(availableZones)).append("\n");
        sb.append("    availableZoneNames: ").append(toIndentedString(availableZoneNames)).append("\n");
        sb.append("    totalStorageSpace: ").append(toIndentedString(totalStorageSpace)).append("\n");
        sb.append("    publicConnectAddress: ").append(toIndentedString(publicConnectAddress)).append("\n");
        sb.append("    publicConnectDomainName: ").append(toIndentedString(publicConnectDomainName)).append("\n");
        sb.append("    storageResourceId: ").append(toIndentedString(storageResourceId)).append("\n");
        sb.append("    storageSpecCode: ").append(toIndentedString(storageSpecCode)).append("\n");
        sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
        sb.append("    storageType: ").append(toIndentedString(storageType)).append("\n");
        sb.append("    retentionPolicy: ").append(toIndentedString(retentionPolicy)).append("\n");
        sb.append("    kafkaPublicStatus: ").append(toIndentedString(kafkaPublicStatus)).append("\n");
        sb.append("    publicBandwidth: ").append(toIndentedString(publicBandwidth)).append("\n");
        sb.append("    enableLogCollection: ").append(toIndentedString(enableLogCollection)).append("\n");
        sb.append("    newAuthCert: ").append(toIndentedString(newAuthCert)).append("\n");
        sb.append("    crossVpcInfo: ").append(toIndentedString(crossVpcInfo)).append("\n");
        sb.append("    ipv6Enable: ").append(toIndentedString(ipv6Enable)).append("\n");
        sb.append("    ipv6ConnectAddresses: ").append(toIndentedString(ipv6ConnectAddresses)).append("\n");
        sb.append("    connectorEnable: ").append(toIndentedString(connectorEnable)).append("\n");
        sb.append("    connectorNodeNum: ").append(toIndentedString(connectorNodeNum)).append("\n");
        sb.append("    connectorId: ").append(toIndentedString(connectorId)).append("\n");
        sb.append("    restEnable: ").append(toIndentedString(restEnable)).append("\n");
        sb.append("    restConnectAddress: ").append(toIndentedString(restConnectAddress)).append("\n");
        sb.append("    publicBoundwidth: ").append(toIndentedString(publicBoundwidth)).append("\n");
        sb.append("    messageQueryInstEnable: ").append(toIndentedString(messageQueryInstEnable)).append("\n");
        sb.append("    vpcClientPlain: ").append(toIndentedString(vpcClientPlain)).append("\n");
        sb.append("    supportFeatures: ").append(toIndentedString(supportFeatures)).append("\n");
        sb.append("    traceEnable: ").append(toIndentedString(traceEnable)).append("\n");
        sb.append("    agentEnable: ").append(toIndentedString(agentEnable)).append("\n");
        sb.append("    podConnectAddress: ").append(toIndentedString(podConnectAddress)).append("\n");
        sb.append("    diskEncrypted: ").append(toIndentedString(diskEncrypted)).append("\n");
        sb.append("    diskEncryptedKey: ").append(toIndentedString(diskEncryptedKey)).append("\n");
        sb.append("    kafkaPrivateConnectAddress: ").append(toIndentedString(kafkaPrivateConnectAddress)).append("\n");
        sb.append("    kafkaPrivateConnectDomainName: ")
            .append(toIndentedString(kafkaPrivateConnectDomainName))
            .append("\n");
        sb.append("    cesVersion: ").append(toIndentedString(cesVersion)).append("\n");
        sb.append("    publicAccessEnabled: ").append(toIndentedString(publicAccessEnabled)).append("\n");
        sb.append("    nodeNum: ").append(toIndentedString(nodeNum)).append("\n");
        sb.append("    portProtocols: ").append(toIndentedString(portProtocols)).append("\n");
        sb.append("    enableAcl: ").append(toIndentedString(enableAcl)).append("\n");
        sb.append("    newSpecBillingEnable: ").append(toIndentedString(newSpecBillingEnable)).append("\n");
        sb.append("    brokerNum: ").append(toIndentedString(brokerNum)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    drEnable: ").append(toIndentedString(drEnable)).append("\n");
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
