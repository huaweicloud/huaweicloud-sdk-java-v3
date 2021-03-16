package com.huaweicloud.sdk.kafka.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowInstanceResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="engine")
    
    private String engine;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="engine_version")
    
    private String engineVersion;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="specification")
    
    private String specification;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="storage_space")
    
    private Integer storageSpace;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="partition_num")
    
    private Integer partitionNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="used_storage_space")
    
    private Integer usedStorageSpace;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="connect_address")
    
    private String connectAddress;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="port")
    
    private Integer port;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_spec_code")
    
    private String resourceSpecCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="charging_mode")
    
    private Integer chargingMode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vpc_id")
    
    private String vpcId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vpc_name")
    
    private String vpcName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_at")
    
    private String createdAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_id")
    
    private String userId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_name")
    
    private String userName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="order_id")
    
    private String orderId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="maintain_begin")
    
    private String maintainBegin;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="maintain_end")
    
    private String maintainEnd;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enable_publicip")
    
    private Boolean enablePublicip;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="management_connect_address")
    
    private String managementConnectAddress;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ssl_enable")
    
    private Boolean sslEnable;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_logical_volume")
    
    private Boolean isLogicalVolume;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="extend_times")
    
    private Integer extendTimes;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enable_auto_topic")
    
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
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if( value == null ){
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
            if (obj != null && obj instanceof TypeEnum) {
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
    @JsonProperty(value="type")
    
    private TypeEnum type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_id")
    
    private String productId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="security_group_id")
    
    private String securityGroupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="security_group_name")
    
    private String securityGroupName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subnet_id")
    
    private String subnetId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="available_zones")
    
    private List<String> availableZones = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_storage_space")
    
    private Integer totalStorageSpace;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="public_connect_address")
    
    private String publicConnectAddress;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="storage_resource_id")
    
    private String storageResourceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="storage_spec_code")
    
    private String storageSpecCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="service_type")
    
    private String serviceType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="storage_type")
    
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
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static RetentionPolicyEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            RetentionPolicyEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new RetentionPolicyEnum(value);
            }
            return result;
        }

        public static RetentionPolicyEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            RetentionPolicyEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof RetentionPolicyEnum) {
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
    @JsonProperty(value="retention_policy")
    
    private RetentionPolicyEnum retentionPolicy;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="kafka_public_status")
    
    private String kafkaPublicStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="public_bandwidth")
    
    private Integer publicBandwidth;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="kafka_manager_user")
    
    private String kafkaManagerUser;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enable_log_collection")
    
    private Boolean enableLogCollection;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cross_vpc_info")
    
    private String crossVpcInfo;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ipv6_enable")
    
    private Boolean ipv6Enable;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ipv6_connect_addresses")
    
    private List<String> ipv6ConnectAddresses = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="connector_enable")
    
    private Boolean connectorEnable;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="connector_id")
    
    private String connectorId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rest_enable")
    
    private Boolean restEnable;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rest_connect_address")
    
    private String restConnectAddress;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="message_query_inst_enable")
    
    private Boolean messageQueryInstEnable;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vpc_client_plain")
    
    private Boolean vpcClientPlain;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="support_features")
    
    private String supportFeatures;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="trace_enable")
    
    private Boolean traceEnable;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="pod_connect_address")
    
    private String podConnectAddress;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="disk_encrypted")
    
    private Boolean diskEncrypted;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="kafka_private_connect_address")
    
    private String kafkaPrivateConnectAddress;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ces_version")
    
    private String cesVersion;

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

    

    public ShowInstanceResponse withEngine(String engine) {
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

    

    public ShowInstanceResponse withEngineVersion(String engineVersion) {
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

    

    public ShowInstanceResponse withSpecification(String specification) {
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

    

    public ShowInstanceResponse withStorageSpace(Integer storageSpace) {
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

    

    public ShowInstanceResponse withPartitionNum(Integer partitionNum) {
        this.partitionNum = partitionNum;
        return this;
    }

    


    /**
     * Kafka实例的最大topic数。
     * @return partitionNum
     */
    public Integer getPartitionNum() {
        return partitionNum;
    }

    public void setPartitionNum(Integer partitionNum) {
        this.partitionNum = partitionNum;
    }

    

    public ShowInstanceResponse withUsedStorageSpace(Integer usedStorageSpace) {
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

    

    public ShowInstanceResponse withConnectAddress(String connectAddress) {
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

    

    public ShowInstanceResponse withPort(Integer port) {
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

    

    public ShowInstanceResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 实例的状态。详细状态说明见[实例状态说明](https://support.huaweicloud.com/api-kafka/kafka-api-180514012.html)。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    

    public ShowInstanceResponse withResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
        return this;
    }

    


    /**
     * 资源规格标识。   - dms.instance.kafka.cluster.c3.mini：Kafka实例的基准带宽为100MByte/秒。   - dms.instance.kafka.cluster.c3.small.2：Kafka实例的基准带宽为300MByte/秒。   - dms.instance.kafka.cluster.c3.middle.2：Kafka实例的基准带宽为600MByte/秒。   - dms.instance.kafka.cluster.c3.high.2：Kafka实例的基准带宽为1200MByte/秒。
     * @return resourceSpecCode
     */
    public String getResourceSpecCode() {
        return resourceSpecCode;
    }

    public void setResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
    }

    

    public ShowInstanceResponse withChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    


    /**
     * 付费模式，1表示按需计费，0表示包年/包月计费。
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
     * VPC ID。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    

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

    

    public ShowInstanceResponse withCreatedAt(String createdAt) {
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

    

    public ShowInstanceResponse withUserId(String userId) {
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

    

    public ShowInstanceResponse withOrderId(String orderId) {
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

    

    public ShowInstanceResponse withMaintainBegin(String maintainBegin) {
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

    

    public ShowInstanceResponse withMaintainEnd(String maintainEnd) {
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

    

    public ShowInstanceResponse withEnablePublicip(Boolean enablePublicip) {
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

    

    public ShowInstanceResponse withManagementConnectAddress(String managementConnectAddress) {
        this.managementConnectAddress = managementConnectAddress;
        return this;
    }

    


    /**
     * Kafka实例的KafkaManager连接地址。
     * @return managementConnectAddress
     */
    public String getManagementConnectAddress() {
        return managementConnectAddress;
    }

    public void setManagementConnectAddress(String managementConnectAddress) {
        this.managementConnectAddress = managementConnectAddress;
    }

    

    public ShowInstanceResponse withSslEnable(Boolean sslEnable) {
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

    

    public ShowInstanceResponse withIsLogicalVolume(Boolean isLogicalVolume) {
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

    

    public ShowInstanceResponse withExtendTimes(Integer extendTimes) {
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

    

    public ShowInstanceResponse withEnableAutoTopic(Boolean enableAutoTopic) {
        this.enableAutoTopic = enableAutoTopic;
        return this;
    }

    


    /**
     * 是否打开kafka自动创建topic功能。   - true：开启   - false：关闭
     * @return enableAutoTopic
     */
    public Boolean getEnableAutoTopic() {
        return enableAutoTopic;
    }

    public void setEnableAutoTopic(Boolean enableAutoTopic) {
        this.enableAutoTopic = enableAutoTopic;
    }

    

    public ShowInstanceResponse withType(TypeEnum type) {
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

    

    public ShowInstanceResponse withProductId(String productId) {
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

    

    public ShowInstanceResponse withAvailableZones(List<String> availableZones) {
        this.availableZones = availableZones;
        return this;
    }

    
    public ShowInstanceResponse addAvailableZonesItem(String availableZonesItem) {
        this.availableZones.add(availableZonesItem);
        return this;
    }

    public ShowInstanceResponse withAvailableZones(Consumer<List<String>> availableZonesSetter) {
        if(this.availableZones == null ){
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

    

    public ShowInstanceResponse withTotalStorageSpace(Integer totalStorageSpace) {
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

    

    public ShowInstanceResponse withPublicConnectAddress(String publicConnectAddress) {
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

    

    public ShowInstanceResponse withStorageResourceId(String storageResourceId) {
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

    

    public ShowInstanceResponse withStorageSpecCode(String storageSpecCode) {
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

    

    public ShowInstanceResponse withServiceType(String serviceType) {
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

    

    public ShowInstanceResponse withStorageType(String storageType) {
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

    

    public ShowInstanceResponse withRetentionPolicy(RetentionPolicyEnum retentionPolicy) {
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

    

    public ShowInstanceResponse withKafkaPublicStatus(String kafkaPublicStatus) {
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

    

    public ShowInstanceResponse withPublicBandwidth(Integer publicBandwidth) {
        this.publicBandwidth = publicBandwidth;
        return this;
    }

    


    /**
     * 公网带宽。
     * @return publicBandwidth
     */
    public Integer getPublicBandwidth() {
        return publicBandwidth;
    }

    public void setPublicBandwidth(Integer publicBandwidth) {
        this.publicBandwidth = publicBandwidth;
    }

    

    public ShowInstanceResponse withKafkaManagerUser(String kafkaManagerUser) {
        this.kafkaManagerUser = kafkaManagerUser;
        return this;
    }

    


    /**
     * 登录Kafka Manager的用户名。
     * @return kafkaManagerUser
     */
    public String getKafkaManagerUser() {
        return kafkaManagerUser;
    }

    public void setKafkaManagerUser(String kafkaManagerUser) {
        this.kafkaManagerUser = kafkaManagerUser;
    }

    

    public ShowInstanceResponse withEnableLogCollection(Boolean enableLogCollection) {
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

    

    public ShowInstanceResponse withCrossVpcInfo(String crossVpcInfo) {
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

    

    public ShowInstanceResponse withIpv6Enable(Boolean ipv6Enable) {
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

    

    public ShowInstanceResponse withIpv6ConnectAddresses(List<String> ipv6ConnectAddresses) {
        this.ipv6ConnectAddresses = ipv6ConnectAddresses;
        return this;
    }

    
    public ShowInstanceResponse addIpv6ConnectAddressesItem(String ipv6ConnectAddressesItem) {
        this.ipv6ConnectAddresses.add(ipv6ConnectAddressesItem);
        return this;
    }

    public ShowInstanceResponse withIpv6ConnectAddresses(Consumer<List<String>> ipv6ConnectAddressesSetter) {
        if(this.ipv6ConnectAddresses == null ){
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

    

    public ShowInstanceResponse withConnectorEnable(Boolean connectorEnable) {
        this.connectorEnable = connectorEnable;
        return this;
    }

    


    /**
     * 是否开启转储。
     * @return connectorEnable
     */
    public Boolean getConnectorEnable() {
        return connectorEnable;
    }

    public void setConnectorEnable(Boolean connectorEnable) {
        this.connectorEnable = connectorEnable;
    }

    

    public ShowInstanceResponse withConnectorId(String connectorId) {
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

    

    public ShowInstanceResponse withRestEnable(Boolean restEnable) {
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

    

    public ShowInstanceResponse withRestConnectAddress(String restConnectAddress) {
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

    

    public ShowInstanceResponse withMessageQueryInstEnable(Boolean messageQueryInstEnable) {
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

    

    public ShowInstanceResponse withVpcClientPlain(Boolean vpcClientPlain) {
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

    

    public ShowInstanceResponse withSupportFeatures(String supportFeatures) {
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

    

    public ShowInstanceResponse withTraceEnable(Boolean traceEnable) {
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

    

    public ShowInstanceResponse withPodConnectAddress(String podConnectAddress) {
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

    

    public ShowInstanceResponse withDiskEncrypted(Boolean diskEncrypted) {
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

    

    public ShowInstanceResponse withKafkaPrivateConnectAddress(String kafkaPrivateConnectAddress) {
        this.kafkaPrivateConnectAddress = kafkaPrivateConnectAddress;
        return this;
    }

    


    /**
     * Kafka实例私有连接地址。
     * @return kafkaPrivateConnectAddress
     */
    public String getKafkaPrivateConnectAddress() {
        return kafkaPrivateConnectAddress;
    }

    public void setKafkaPrivateConnectAddress(String kafkaPrivateConnectAddress) {
        this.kafkaPrivateConnectAddress = kafkaPrivateConnectAddress;
    }

    

    public ShowInstanceResponse withCesVersion(String cesVersion) {
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowInstanceResponse showInstanceResponse = (ShowInstanceResponse) o;
        return Objects.equals(this.name, showInstanceResponse.name) &&
            Objects.equals(this.engine, showInstanceResponse.engine) &&
            Objects.equals(this.engineVersion, showInstanceResponse.engineVersion) &&
            Objects.equals(this.specification, showInstanceResponse.specification) &&
            Objects.equals(this.storageSpace, showInstanceResponse.storageSpace) &&
            Objects.equals(this.partitionNum, showInstanceResponse.partitionNum) &&
            Objects.equals(this.usedStorageSpace, showInstanceResponse.usedStorageSpace) &&
            Objects.equals(this.connectAddress, showInstanceResponse.connectAddress) &&
            Objects.equals(this.port, showInstanceResponse.port) &&
            Objects.equals(this.status, showInstanceResponse.status) &&
            Objects.equals(this.instanceId, showInstanceResponse.instanceId) &&
            Objects.equals(this.resourceSpecCode, showInstanceResponse.resourceSpecCode) &&
            Objects.equals(this.chargingMode, showInstanceResponse.chargingMode) &&
            Objects.equals(this.vpcId, showInstanceResponse.vpcId) &&
            Objects.equals(this.vpcName, showInstanceResponse.vpcName) &&
            Objects.equals(this.createdAt, showInstanceResponse.createdAt) &&
            Objects.equals(this.userId, showInstanceResponse.userId) &&
            Objects.equals(this.userName, showInstanceResponse.userName) &&
            Objects.equals(this.orderId, showInstanceResponse.orderId) &&
            Objects.equals(this.maintainBegin, showInstanceResponse.maintainBegin) &&
            Objects.equals(this.maintainEnd, showInstanceResponse.maintainEnd) &&
            Objects.equals(this.enablePublicip, showInstanceResponse.enablePublicip) &&
            Objects.equals(this.managementConnectAddress, showInstanceResponse.managementConnectAddress) &&
            Objects.equals(this.sslEnable, showInstanceResponse.sslEnable) &&
            Objects.equals(this.enterpriseProjectId, showInstanceResponse.enterpriseProjectId) &&
            Objects.equals(this.isLogicalVolume, showInstanceResponse.isLogicalVolume) &&
            Objects.equals(this.extendTimes, showInstanceResponse.extendTimes) &&
            Objects.equals(this.enableAutoTopic, showInstanceResponse.enableAutoTopic) &&
            Objects.equals(this.type, showInstanceResponse.type) &&
            Objects.equals(this.productId, showInstanceResponse.productId) &&
            Objects.equals(this.securityGroupId, showInstanceResponse.securityGroupId) &&
            Objects.equals(this.securityGroupName, showInstanceResponse.securityGroupName) &&
            Objects.equals(this.subnetId, showInstanceResponse.subnetId) &&
            Objects.equals(this.availableZones, showInstanceResponse.availableZones) &&
            Objects.equals(this.totalStorageSpace, showInstanceResponse.totalStorageSpace) &&
            Objects.equals(this.publicConnectAddress, showInstanceResponse.publicConnectAddress) &&
            Objects.equals(this.storageResourceId, showInstanceResponse.storageResourceId) &&
            Objects.equals(this.storageSpecCode, showInstanceResponse.storageSpecCode) &&
            Objects.equals(this.serviceType, showInstanceResponse.serviceType) &&
            Objects.equals(this.storageType, showInstanceResponse.storageType) &&
            Objects.equals(this.retentionPolicy, showInstanceResponse.retentionPolicy) &&
            Objects.equals(this.kafkaPublicStatus, showInstanceResponse.kafkaPublicStatus) &&
            Objects.equals(this.publicBandwidth, showInstanceResponse.publicBandwidth) &&
            Objects.equals(this.kafkaManagerUser, showInstanceResponse.kafkaManagerUser) &&
            Objects.equals(this.enableLogCollection, showInstanceResponse.enableLogCollection) &&
            Objects.equals(this.crossVpcInfo, showInstanceResponse.crossVpcInfo) &&
            Objects.equals(this.ipv6Enable, showInstanceResponse.ipv6Enable) &&
            Objects.equals(this.ipv6ConnectAddresses, showInstanceResponse.ipv6ConnectAddresses) &&
            Objects.equals(this.connectorEnable, showInstanceResponse.connectorEnable) &&
            Objects.equals(this.connectorId, showInstanceResponse.connectorId) &&
            Objects.equals(this.restEnable, showInstanceResponse.restEnable) &&
            Objects.equals(this.restConnectAddress, showInstanceResponse.restConnectAddress) &&
            Objects.equals(this.messageQueryInstEnable, showInstanceResponse.messageQueryInstEnable) &&
            Objects.equals(this.vpcClientPlain, showInstanceResponse.vpcClientPlain) &&
            Objects.equals(this.supportFeatures, showInstanceResponse.supportFeatures) &&
            Objects.equals(this.traceEnable, showInstanceResponse.traceEnable) &&
            Objects.equals(this.podConnectAddress, showInstanceResponse.podConnectAddress) &&
            Objects.equals(this.diskEncrypted, showInstanceResponse.diskEncrypted) &&
            Objects.equals(this.kafkaPrivateConnectAddress, showInstanceResponse.kafkaPrivateConnectAddress) &&
            Objects.equals(this.cesVersion, showInstanceResponse.cesVersion);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, engine, engineVersion, specification, storageSpace, partitionNum, usedStorageSpace, connectAddress, port, status, instanceId, resourceSpecCode, chargingMode, vpcId, vpcName, createdAt, userId, userName, orderId, maintainBegin, maintainEnd, enablePublicip, managementConnectAddress, sslEnable, enterpriseProjectId, isLogicalVolume, extendTimes, enableAutoTopic, type, productId, securityGroupId, securityGroupName, subnetId, availableZones, totalStorageSpace, publicConnectAddress, storageResourceId, storageSpecCode, serviceType, storageType, retentionPolicy, kafkaPublicStatus, publicBandwidth, kafkaManagerUser, enableLogCollection, crossVpcInfo, ipv6Enable, ipv6ConnectAddresses, connectorEnable, connectorId, restEnable, restConnectAddress, messageQueryInstEnable, vpcClientPlain, supportFeatures, traceEnable, podConnectAddress, diskEncrypted, kafkaPrivateConnectAddress, cesVersion);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstanceResponse {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
        sb.append("    engineVersion: ").append(toIndentedString(engineVersion)).append("\n");
        sb.append("    specification: ").append(toIndentedString(specification)).append("\n");
        sb.append("    storageSpace: ").append(toIndentedString(storageSpace)).append("\n");
        sb.append("    partitionNum: ").append(toIndentedString(partitionNum)).append("\n");
        sb.append("    usedStorageSpace: ").append(toIndentedString(usedStorageSpace)).append("\n");
        sb.append("    connectAddress: ").append(toIndentedString(connectAddress)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
        sb.append("    managementConnectAddress: ").append(toIndentedString(managementConnectAddress)).append("\n");
        sb.append("    sslEnable: ").append(toIndentedString(sslEnable)).append("\n");
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
        sb.append("    totalStorageSpace: ").append(toIndentedString(totalStorageSpace)).append("\n");
        sb.append("    publicConnectAddress: ").append(toIndentedString(publicConnectAddress)).append("\n");
        sb.append("    storageResourceId: ").append(toIndentedString(storageResourceId)).append("\n");
        sb.append("    storageSpecCode: ").append(toIndentedString(storageSpecCode)).append("\n");
        sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
        sb.append("    storageType: ").append(toIndentedString(storageType)).append("\n");
        sb.append("    retentionPolicy: ").append(toIndentedString(retentionPolicy)).append("\n");
        sb.append("    kafkaPublicStatus: ").append(toIndentedString(kafkaPublicStatus)).append("\n");
        sb.append("    publicBandwidth: ").append(toIndentedString(publicBandwidth)).append("\n");
        sb.append("    kafkaManagerUser: ").append(toIndentedString(kafkaManagerUser)).append("\n");
        sb.append("    enableLogCollection: ").append(toIndentedString(enableLogCollection)).append("\n");
        sb.append("    crossVpcInfo: ").append(toIndentedString(crossVpcInfo)).append("\n");
        sb.append("    ipv6Enable: ").append(toIndentedString(ipv6Enable)).append("\n");
        sb.append("    ipv6ConnectAddresses: ").append(toIndentedString(ipv6ConnectAddresses)).append("\n");
        sb.append("    connectorEnable: ").append(toIndentedString(connectorEnable)).append("\n");
        sb.append("    connectorId: ").append(toIndentedString(connectorId)).append("\n");
        sb.append("    restEnable: ").append(toIndentedString(restEnable)).append("\n");
        sb.append("    restConnectAddress: ").append(toIndentedString(restConnectAddress)).append("\n");
        sb.append("    messageQueryInstEnable: ").append(toIndentedString(messageQueryInstEnable)).append("\n");
        sb.append("    vpcClientPlain: ").append(toIndentedString(vpcClientPlain)).append("\n");
        sb.append("    supportFeatures: ").append(toIndentedString(supportFeatures)).append("\n");
        sb.append("    traceEnable: ").append(toIndentedString(traceEnable)).append("\n");
        sb.append("    podConnectAddress: ").append(toIndentedString(podConnectAddress)).append("\n");
        sb.append("    diskEncrypted: ").append(toIndentedString(diskEncrypted)).append("\n");
        sb.append("    kafkaPrivateConnectAddress: ").append(toIndentedString(kafkaPrivateConnectAddress)).append("\n");
        sb.append("    cesVersion: ").append(toIndentedString(cesVersion)).append("\n");
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

