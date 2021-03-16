package com.huaweicloud.sdk.kafka.v2.model;




import java.util.Collections;

import java.util.Collections;

import java.util.Collections;

import java.util.Collections;

import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.kafka.v2.model.CreatePostPaidInstanceReqTags;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 创建实例请求体。
 */
public class CreatePostPaidInstanceReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;
    /**
     * 消息引擎。取值填写为：kafka。
     */
    public static final class EngineEnum {

        
        /**
         * Enum KAFKA for value: "kafka"
         */
        public static final EngineEnum KAFKA = new EngineEnum("kafka");
        

        private static final Map<String, EngineEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EngineEnum> createStaticFields() {
            Map<String, EngineEnum> map = new HashMap<>();
            map.put("kafka", KAFKA);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EngineEnum(String value) {
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
        public static EngineEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            EngineEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new EngineEnum(value);
            }
            return result;
        }

        public static EngineEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            EngineEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof EngineEnum) {
                return this.value.equals(((EngineEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="engine")
    
    private EngineEnum engine;
    /**
     * 消息引擎的版本。取值填写为：1.1.0和2.3.0。
     */
    public static final class EngineVersionEnum {

        
        /**
         * Enum _1_1_0 for value: "1.1.0"
         */
        public static final EngineVersionEnum _1_1_0 = new EngineVersionEnum("1.1.0");
        
        /**
         * Enum _2_3_0 for value: "2.3.0"
         */
        public static final EngineVersionEnum _2_3_0 = new EngineVersionEnum("2.3.0");
        

        private static final Map<String, EngineVersionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EngineVersionEnum> createStaticFields() {
            Map<String, EngineVersionEnum> map = new HashMap<>();
            map.put("1.1.0", _1_1_0);
            map.put("2.3.0", _2_3_0);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EngineVersionEnum(String value) {
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
        public static EngineVersionEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            EngineVersionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new EngineVersionEnum(value);
            }
            return result;
        }

        public static EngineVersionEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            EngineVersionEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof EngineVersionEnum) {
                return this.value.equals(((EngineVersionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="engine_version")
    
    private EngineVersionEnum engineVersion;
    /**
     * Kafka实例的基准带宽，表示单位时间内传送的最大数据量，单位MB。 取值范围：   - 100MB   - 300MB   - 600MB   - 1200MB
     */
    public static final class SpecificationEnum {

        
        /**
         * Enum _100MB for value: "100MB"
         */
        public static final SpecificationEnum _100MB = new SpecificationEnum("100MB");
        
        /**
         * Enum _300MB for value: "300MB"
         */
        public static final SpecificationEnum _300MB = new SpecificationEnum("300MB");
        
        /**
         * Enum _600MB for value: "600MB"
         */
        public static final SpecificationEnum _600MB = new SpecificationEnum("600MB");
        
        /**
         * Enum _1200MB for value: "1200MB"
         */
        public static final SpecificationEnum _1200MB = new SpecificationEnum("1200MB");
        

        private static final Map<String, SpecificationEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SpecificationEnum> createStaticFields() {
            Map<String, SpecificationEnum> map = new HashMap<>();
            map.put("100MB", _100MB);
            map.put("300MB", _300MB);
            map.put("600MB", _600MB);
            map.put("1200MB", _1200MB);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SpecificationEnum(String value) {
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
        public static SpecificationEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            SpecificationEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SpecificationEnum(value);
            }
            return result;
        }

        public static SpecificationEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            SpecificationEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof SpecificationEnum) {
                return this.value.equals(((SpecificationEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="specification")
    
    private SpecificationEnum specification;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="storage_space")
    
    private Integer storageSpace;
    /**
     * Kafka实例的最大分区数量。   - 参数specification为100MB时，取值300   - 参数specification为300MB时，取值900   - 参数specification为600MB时，取值1800   - 参数specification为1200MB时，取值1800
     */
    public static final class PartitionNumEnum {

        
        /**
         * Enum NUMBER_300 for value: 300
         */
        public static final PartitionNumEnum NUMBER_300 = new PartitionNumEnum(300);
        
        /**
         * Enum NUMBER_900 for value: 900
         */
        public static final PartitionNumEnum NUMBER_900 = new PartitionNumEnum(900);
        
        /**
         * Enum NUMBER_1800 for value: 1800
         */
        public static final PartitionNumEnum NUMBER_1800 = new PartitionNumEnum(1800);
        

        private static final Map<Integer, PartitionNumEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, PartitionNumEnum> createStaticFields() {
            Map<Integer, PartitionNumEnum> map = new HashMap<>();
            map.put(300, NUMBER_300);
            map.put(900, NUMBER_900);
            map.put(1800, NUMBER_1800);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        PartitionNumEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return Integer.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static PartitionNumEnum fromValue(Integer value) {
            if( value == null ){
                return null;
            }
            PartitionNumEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new PartitionNumEnum(value);
            }
            return result;
        }

        public static PartitionNumEnum valueOf(Integer value) {
            if( value == null ){
                return null;
            }
            PartitionNumEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof PartitionNumEnum) {
                return this.value.equals(((PartitionNumEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="partition_num")
    
    private PartitionNumEnum partitionNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="access_user")
    
    private String accessUser;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="password")
    
    private String password;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vpc_id")
    
    private String vpcId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="security_group_id")
    
    private String securityGroupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subnet_id")
    
    private String subnetId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="available_zones")
    
    private List<String> availableZones = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_id")
    
    private String productId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="kafka_manager_user")
    
    private String kafkaManagerUser;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="kafka_manager_password")
    
    private String kafkaManagerPassword;


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
    @JsonProperty(value="public_bandwidth")
    
    private Integer publicBandwidth;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="publicip_id")
    
    private String publicipId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ssl_enable")
    
    private Boolean sslEnable;
    /**
     * 磁盘的容量到达容量阈值后，对于消息的处理策略。  取值如下： - produce_reject：表示拒绝消息写入。 - time_base：表示自动删除最老消息。
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
    @JsonProperty(value="connector_enable")
    
    private Boolean connectorEnable;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enable_auto_topic")
    
    private Boolean enableAutoTopic;
    /**
     * 存储IO规格。如何选择磁盘类型请参考[磁盘类型及性能介绍](https://support.huaweicloud.com/productdesc-evs/zh-cn_topic_0044524691.html)。 取值范围：   - 参数specification为100MB时，取值dms.physical.storage.high或者dms.physical.storage.ultra   - 参数specification为300MB时，取值dms.physical.storage.high或者dms.physical.storage.ultra   - 参数specification为600MB时，取值dms.physical.storage.ultra   - 参数specification为1200MB时，取值dms.physical.storage.ultra存储IO规格。如何选择磁盘类型请参考磁盘类型及性能介绍。
     */
    public static final class StorageSpecCodeEnum {

        
        /**
         * Enum DMS_PHYSICAL_STORAGE_NORMAL for value: "dms.physical.storage.normal"
         */
        public static final StorageSpecCodeEnum DMS_PHYSICAL_STORAGE_NORMAL = new StorageSpecCodeEnum("dms.physical.storage.normal");
        
        /**
         * Enum DMS_PHYSICAL_STORAGE_HIGH for value: "dms.physical.storage.high"
         */
        public static final StorageSpecCodeEnum DMS_PHYSICAL_STORAGE_HIGH = new StorageSpecCodeEnum("dms.physical.storage.high");
        
        /**
         * Enum DMS_PHYSICAL_STORAGE_ULTRA for value: "dms.physical.storage.ultra"
         */
        public static final StorageSpecCodeEnum DMS_PHYSICAL_STORAGE_ULTRA = new StorageSpecCodeEnum("dms.physical.storage.ultra");
        

        private static final Map<String, StorageSpecCodeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StorageSpecCodeEnum> createStaticFields() {
            Map<String, StorageSpecCodeEnum> map = new HashMap<>();
            map.put("dms.physical.storage.normal", DMS_PHYSICAL_STORAGE_NORMAL);
            map.put("dms.physical.storage.high", DMS_PHYSICAL_STORAGE_HIGH);
            map.put("dms.physical.storage.ultra", DMS_PHYSICAL_STORAGE_ULTRA);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StorageSpecCodeEnum(String value) {
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
        public static StorageSpecCodeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            StorageSpecCodeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StorageSpecCodeEnum(value);
            }
            return result;
        }

        public static StorageSpecCodeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            StorageSpecCodeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof StorageSpecCodeEnum) {
                return this.value.equals(((StorageSpecCodeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="storage_spec_code")
    
    private StorageSpecCodeEnum storageSpecCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private List<CreatePostPaidInstanceReqTags> tags = null;
    
    public CreatePostPaidInstanceReq withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 实例名称。  由英文字符开头，只能由英文字母、数字、中划线、下划线组成，长度为4~64的字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public CreatePostPaidInstanceReq withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 实例的描述信息。  长度不超过1024的字符串。  > \\与\"在json报文中属于特殊字符，如果参数值中需要显示\\或者\"字符，请在字符前增加转义字符\\，比如\\\\或者\\\"。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public CreatePostPaidInstanceReq withEngine(EngineEnum engine) {
        this.engine = engine;
        return this;
    }

    


    /**
     * 消息引擎。取值填写为：kafka。
     * @return engine
     */
    public EngineEnum getEngine() {
        return engine;
    }

    public void setEngine(EngineEnum engine) {
        this.engine = engine;
    }

    

    public CreatePostPaidInstanceReq withEngineVersion(EngineVersionEnum engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    


    /**
     * 消息引擎的版本。取值填写为：1.1.0和2.3.0。
     * @return engineVersion
     */
    public EngineVersionEnum getEngineVersion() {
        return engineVersion;
    }

    public void setEngineVersion(EngineVersionEnum engineVersion) {
        this.engineVersion = engineVersion;
    }

    

    public CreatePostPaidInstanceReq withSpecification(SpecificationEnum specification) {
        this.specification = specification;
        return this;
    }

    


    /**
     * Kafka实例的基准带宽，表示单位时间内传送的最大数据量，单位MB。 取值范围：   - 100MB   - 300MB   - 600MB   - 1200MB
     * @return specification
     */
    public SpecificationEnum getSpecification() {
        return specification;
    }

    public void setSpecification(SpecificationEnum specification) {
        this.specification = specification;
    }

    

    public CreatePostPaidInstanceReq withStorageSpace(Integer storageSpace) {
        this.storageSpace = storageSpace;
        return this;
    }

    


    /**
     * 消息存储空间，单位GB。   - Kafka实例规格为100MB时，存储空间取值范围600GB ~ 90000GB。   - Kafka实例规格为300MB时，存储空间取值范围1200GB ~ 90000GB。   - Kafka实例规格为600MB时，存储空间取值范围2400GB ~ 90000GB。   - Kafka实例规格为1200MB，存储空间取值范围4800GB ~ 90000GB。
     * @return storageSpace
     */
    public Integer getStorageSpace() {
        return storageSpace;
    }

    public void setStorageSpace(Integer storageSpace) {
        this.storageSpace = storageSpace;
    }

    

    public CreatePostPaidInstanceReq withPartitionNum(PartitionNumEnum partitionNum) {
        this.partitionNum = partitionNum;
        return this;
    }

    


    /**
     * Kafka实例的最大分区数量。   - 参数specification为100MB时，取值300   - 参数specification为300MB时，取值900   - 参数specification为600MB时，取值1800   - 参数specification为1200MB时，取值1800
     * @return partitionNum
     */
    public PartitionNumEnum getPartitionNum() {
        return partitionNum;
    }

    public void setPartitionNum(PartitionNumEnum partitionNum) {
        this.partitionNum = partitionNum;
    }

    

    public CreatePostPaidInstanceReq withAccessUser(String accessUser) {
        this.accessUser = accessUser;
        return this;
    }

    


    /**
     * 当ssl_enable为true时，该参数必选，ssl_enable为false时，该参数无效。  认证用户名，只能由英文字母、数字、中划线组成，长度为4~64的字符。
     * @return accessUser
     */
    public String getAccessUser() {
        return accessUser;
    }

    public void setAccessUser(String accessUser) {
        this.accessUser = accessUser;
    }

    

    public CreatePostPaidInstanceReq withPassword(String password) {
        this.password = password;
        return this;
    }

    


    /**
     * 当ssl_enable为true时，该参数必选，ssl_enable为false时，该参数无效。  实例的认证密码。  复杂度要求： - 输入长度为8到32位的字符串。 - 必须包含如下四种字符中的两种组合：   - 小写字母   - 大写字母   - 数字   - 特殊字符包括（`~!@#$%^&*()-_=+\\|[{}]:'\",<.>/?）
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    

    public CreatePostPaidInstanceReq withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    


    /**
     * 虚拟私有云ID。  获取方法如下： - 方法1：登录虚拟私有云服务的控制台界面，在虚拟私有云的详情页面查找VPC ID。 - 方法2：通过虚拟私有云服务的API接口查询，具体操作可参考[查询VPC列表](https://support.huaweicloud.com/api-vpc/vpc_api01_0003.html)。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    

    public CreatePostPaidInstanceReq withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    


    /**
     * 指定实例所属的安全组。  获取方法如下： - 方法1：登录虚拟私有云服务的控制台界面，在安全组的详情页面查找安全组ID。 - 方法2：通过虚拟私有云服务的API接口查询，具体操作可参考[查询安全组列表](https://support.huaweicloud.com/api-vpc/vpc_sg01_0002.html)。
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    

    public CreatePostPaidInstanceReq withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    


    /**
     * 子网信息。  获取方法如下： - 方法1：登录虚拟私有云服务的控制台界面，单击VPC下的子网，进入子网详情页面，查找网络ID。 - 方法2：通过虚拟私有云服务的API接口查询，具体操作可参考[查询子网列表](https://support.huaweicloud.com/api-vpc/vpc_subnet01_0003.html)。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    

    public CreatePostPaidInstanceReq withAvailableZones(List<String> availableZones) {
        this.availableZones = availableZones;
        return this;
    }

    
    public CreatePostPaidInstanceReq addAvailableZonesItem(String availableZonesItem) {
        this.availableZones.add(availableZonesItem);
        return this;
    }

    public CreatePostPaidInstanceReq withAvailableZones(Consumer<List<String>> availableZonesSetter) {
        if(this.availableZones == null ){
            this.availableZones = new ArrayList<>();
        }
        availableZonesSetter.accept(this.availableZones);
        return this;
    }

    /**
     * 创建节点到指定且有资源的可用区ID。该参数不能为空数组或者数组的值为空，详情请参考[查询可用区信息](https://support.huaweicloud.com/api-kafka/ListAvailableZones.html)查询得到。在查询时，请注意查看该可用区是否有资源。  创建Kafka实例，支持节点部署在1个或3个及3个以上的可用区。在为节点指定可用区时，用逗号分隔开。
     * @return availableZones
     */
    public List<String> getAvailableZones() {
        return availableZones;
    }

    public void setAvailableZones(List<String> availableZones) {
        this.availableZones = availableZones;
    }

    

    public CreatePostPaidInstanceReq withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    


    /**
     * 产品标识。  获取方法，请参考查询[产品规格列表](https://support.huaweicloud.com/api-kafka/ListProducts.html)。
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    

    public CreatePostPaidInstanceReq withKafkaManagerUser(String kafkaManagerUser) {
        this.kafkaManagerUser = kafkaManagerUser;
        return this;
    }

    


    /**
     * 表示登录Kafka Manager的用户名。只能由英文字母、数字、中划线组成，长度为4~64的字符。
     * @return kafkaManagerUser
     */
    public String getKafkaManagerUser() {
        return kafkaManagerUser;
    }

    public void setKafkaManagerUser(String kafkaManagerUser) {
        this.kafkaManagerUser = kafkaManagerUser;
    }

    

    public CreatePostPaidInstanceReq withKafkaManagerPassword(String kafkaManagerPassword) {
        this.kafkaManagerPassword = kafkaManagerPassword;
        return this;
    }

    


    /**
     * 表示登录Kafka Manager的密码。  复杂度要求：   - 输入长度为8到32位的字符串。   - 必须包含如下四种字符中的两种组合：       - 小写字母       - 大写字母       - 数字       - 特殊字符包括（`~!@#$%^&*()-_=+\\|[{}]:'\",<.>/?）
     * @return kafkaManagerPassword
     */
    public String getKafkaManagerPassword() {
        return kafkaManagerPassword;
    }

    public void setKafkaManagerPassword(String kafkaManagerPassword) {
        this.kafkaManagerPassword = kafkaManagerPassword;
    }

    

    public CreatePostPaidInstanceReq withMaintainBegin(String maintainBegin) {
        this.maintainBegin = maintainBegin;
        return this;
    }

    


    /**
     * 维护时间窗开始时间，格式为HH:mm。 - 维护时间窗开始和结束时间必须为指定的时间段，可参考[查询维护时间窗时间段](https://support.huaweicloud.com/api-kafka/ShowMaintainWindows.html)获取。 - 开始时间必须为22:00、02:00、06:00、10:00、14:00和18:00。 - 该参数不能单独为空，若该值为空，则结束时间也为空。系统分配一个默认开始时间02:00。
     * @return maintainBegin
     */
    public String getMaintainBegin() {
        return maintainBegin;
    }

    public void setMaintainBegin(String maintainBegin) {
        this.maintainBegin = maintainBegin;
    }

    

    public CreatePostPaidInstanceReq withMaintainEnd(String maintainEnd) {
        this.maintainEnd = maintainEnd;
        return this;
    }

    


    /**
     * 维护时间窗结束时间，格式为HH:mm。 - 维护时间窗开始和结束时间必须为指定的时间段，可参考[查询维护时间窗时间段](https://support.huaweicloud.com/api-kafka/ShowMaintainWindows.html)获取。 - 结束时间在开始时间基础上加四个小时，即当开始时间为22:00时，结束时间为02:00。 - 该参数不能单独为空，若该值为空，则开始时间也为空，系统分配一个默认结束时间06:00。
     * @return maintainEnd
     */
    public String getMaintainEnd() {
        return maintainEnd;
    }

    public void setMaintainEnd(String maintainEnd) {
        this.maintainEnd = maintainEnd;
    }

    

    public CreatePostPaidInstanceReq withEnablePublicip(Boolean enablePublicip) {
        this.enablePublicip = enablePublicip;
        return this;
    }

    


    /**
     * 是否开启公网访问功能。默认不开启公网。 - true：开启 - false：不开启
     * @return enablePublicip
     */
    public Boolean getEnablePublicip() {
        return enablePublicip;
    }

    public void setEnablePublicip(Boolean enablePublicip) {
        this.enablePublicip = enablePublicip;
    }

    

    public CreatePostPaidInstanceReq withPublicBandwidth(Integer publicBandwidth) {
        this.publicBandwidth = publicBandwidth;
        return this;
    }

    


    /**
     * 表示公网带宽，单位是Mbit/s。 取值范围： - Kafka实例规格为100MB时，公网带宽取值范围3到900，且必须为实例节点个数的倍数。 - Kafka实例规格为300MB时，公网带宽取值范围3到900，且必须为实例节点个数的倍数。 - Kafka实例规格为600MB时，公网带宽取值范围4到1200，且必须为实例节点个数的倍数。 - Kafka实例规格为1200MB时，公网带宽取值范围8到2400，且必须为实例节点个数的倍数。
     * @return publicBandwidth
     */
    public Integer getPublicBandwidth() {
        return publicBandwidth;
    }

    public void setPublicBandwidth(Integer publicBandwidth) {
        this.publicBandwidth = publicBandwidth;
    }

    

    public CreatePostPaidInstanceReq withPublicipId(String publicipId) {
        this.publicipId = publicipId;
        return this;
    }

    


    /**
     * 实例绑定的弹性IP地址的ID。  如果开启了公网访问功能（即enable_publicip为true），该字段为必选。
     * @return publicipId
     */
    public String getPublicipId() {
        return publicipId;
    }

    public void setPublicipId(String publicipId) {
        this.publicipId = publicipId;
    }

    

    public CreatePostPaidInstanceReq withSslEnable(Boolean sslEnable) {
        this.sslEnable = sslEnable;
        return this;
    }

    


    /**
     * 是否打开SSL加密访问。 - true：打开SSL加密访问。 - false：不打开SSL加密访问。
     * @return sslEnable
     */
    public Boolean getSslEnable() {
        return sslEnable;
    }

    public void setSslEnable(Boolean sslEnable) {
        this.sslEnable = sslEnable;
    }

    

    public CreatePostPaidInstanceReq withRetentionPolicy(RetentionPolicyEnum retentionPolicy) {
        this.retentionPolicy = retentionPolicy;
        return this;
    }

    


    /**
     * 磁盘的容量到达容量阈值后，对于消息的处理策略。  取值如下： - produce_reject：表示拒绝消息写入。 - time_base：表示自动删除最老消息。
     * @return retentionPolicy
     */
    public RetentionPolicyEnum getRetentionPolicy() {
        return retentionPolicy;
    }

    public void setRetentionPolicy(RetentionPolicyEnum retentionPolicy) {
        this.retentionPolicy = retentionPolicy;
    }

    

    public CreatePostPaidInstanceReq withConnectorEnable(Boolean connectorEnable) {
        this.connectorEnable = connectorEnable;
        return this;
    }

    


    /**
     * 是否开启消息转储功能。  默认不开启消息转储。
     * @return connectorEnable
     */
    public Boolean getConnectorEnable() {
        return connectorEnable;
    }

    public void setConnectorEnable(Boolean connectorEnable) {
        this.connectorEnable = connectorEnable;
    }

    

    public CreatePostPaidInstanceReq withEnableAutoTopic(Boolean enableAutoTopic) {
        this.enableAutoTopic = enableAutoTopic;
        return this;
    }

    


    /**
     * 是否打开kafka自动创建topic功能。 - true：开启 - false：关闭  当您选择开启，表示生产或消费一个未创建的Topic时，会自动创建一个包含3个分区和3个副本的Topic。
     * @return enableAutoTopic
     */
    public Boolean getEnableAutoTopic() {
        return enableAutoTopic;
    }

    public void setEnableAutoTopic(Boolean enableAutoTopic) {
        this.enableAutoTopic = enableAutoTopic;
    }

    

    public CreatePostPaidInstanceReq withStorageSpecCode(StorageSpecCodeEnum storageSpecCode) {
        this.storageSpecCode = storageSpecCode;
        return this;
    }

    


    /**
     * 存储IO规格。如何选择磁盘类型请参考[磁盘类型及性能介绍](https://support.huaweicloud.com/productdesc-evs/zh-cn_topic_0044524691.html)。 取值范围：   - 参数specification为100MB时，取值dms.physical.storage.high或者dms.physical.storage.ultra   - 参数specification为300MB时，取值dms.physical.storage.high或者dms.physical.storage.ultra   - 参数specification为600MB时，取值dms.physical.storage.ultra   - 参数specification为1200MB时，取值dms.physical.storage.ultra存储IO规格。如何选择磁盘类型请参考磁盘类型及性能介绍。
     * @return storageSpecCode
     */
    public StorageSpecCodeEnum getStorageSpecCode() {
        return storageSpecCode;
    }

    public void setStorageSpecCode(StorageSpecCodeEnum storageSpecCode) {
        this.storageSpecCode = storageSpecCode;
    }

    

    public CreatePostPaidInstanceReq withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * 企业项目ID。若为企业项目账号，该参数必填。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    

    public CreatePostPaidInstanceReq withTags(List<CreatePostPaidInstanceReqTags> tags) {
        this.tags = tags;
        return this;
    }

    
    public CreatePostPaidInstanceReq addTagsItem(CreatePostPaidInstanceReqTags tagsItem) {
        this.tags.add(tagsItem);
        return this;
    }

    public CreatePostPaidInstanceReq withTags(Consumer<List<CreatePostPaidInstanceReqTags>> tagsSetter) {
        if(this.tags == null ){
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签列表。
     * @return tags
     */
    public List<CreatePostPaidInstanceReqTags> getTags() {
        return tags;
    }

    public void setTags(List<CreatePostPaidInstanceReqTags> tags) {
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
        CreatePostPaidInstanceReq createPostPaidInstanceReq = (CreatePostPaidInstanceReq) o;
        return Objects.equals(this.name, createPostPaidInstanceReq.name) &&
            Objects.equals(this.description, createPostPaidInstanceReq.description) &&
            Objects.equals(this.engine, createPostPaidInstanceReq.engine) &&
            Objects.equals(this.engineVersion, createPostPaidInstanceReq.engineVersion) &&
            Objects.equals(this.specification, createPostPaidInstanceReq.specification) &&
            Objects.equals(this.storageSpace, createPostPaidInstanceReq.storageSpace) &&
            Objects.equals(this.partitionNum, createPostPaidInstanceReq.partitionNum) &&
            Objects.equals(this.accessUser, createPostPaidInstanceReq.accessUser) &&
            Objects.equals(this.password, createPostPaidInstanceReq.password) &&
            Objects.equals(this.vpcId, createPostPaidInstanceReq.vpcId) &&
            Objects.equals(this.securityGroupId, createPostPaidInstanceReq.securityGroupId) &&
            Objects.equals(this.subnetId, createPostPaidInstanceReq.subnetId) &&
            Objects.equals(this.availableZones, createPostPaidInstanceReq.availableZones) &&
            Objects.equals(this.productId, createPostPaidInstanceReq.productId) &&
            Objects.equals(this.kafkaManagerUser, createPostPaidInstanceReq.kafkaManagerUser) &&
            Objects.equals(this.kafkaManagerPassword, createPostPaidInstanceReq.kafkaManagerPassword) &&
            Objects.equals(this.maintainBegin, createPostPaidInstanceReq.maintainBegin) &&
            Objects.equals(this.maintainEnd, createPostPaidInstanceReq.maintainEnd) &&
            Objects.equals(this.enablePublicip, createPostPaidInstanceReq.enablePublicip) &&
            Objects.equals(this.publicBandwidth, createPostPaidInstanceReq.publicBandwidth) &&
            Objects.equals(this.publicipId, createPostPaidInstanceReq.publicipId) &&
            Objects.equals(this.sslEnable, createPostPaidInstanceReq.sslEnable) &&
            Objects.equals(this.retentionPolicy, createPostPaidInstanceReq.retentionPolicy) &&
            Objects.equals(this.connectorEnable, createPostPaidInstanceReq.connectorEnable) &&
            Objects.equals(this.enableAutoTopic, createPostPaidInstanceReq.enableAutoTopic) &&
            Objects.equals(this.storageSpecCode, createPostPaidInstanceReq.storageSpecCode) &&
            Objects.equals(this.enterpriseProjectId, createPostPaidInstanceReq.enterpriseProjectId) &&
            Objects.equals(this.tags, createPostPaidInstanceReq.tags);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, description, engine, engineVersion, specification, storageSpace, partitionNum, accessUser, password, vpcId, securityGroupId, subnetId, availableZones, productId, kafkaManagerUser, kafkaManagerPassword, maintainBegin, maintainEnd, enablePublicip, publicBandwidth, publicipId, sslEnable, retentionPolicy, connectorEnable, enableAutoTopic, storageSpecCode, enterpriseProjectId, tags);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePostPaidInstanceReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
        sb.append("    engineVersion: ").append(toIndentedString(engineVersion)).append("\n");
        sb.append("    specification: ").append(toIndentedString(specification)).append("\n");
        sb.append("    storageSpace: ").append(toIndentedString(storageSpace)).append("\n");
        sb.append("    partitionNum: ").append(toIndentedString(partitionNum)).append("\n");
        sb.append("    accessUser: ").append(toIndentedString(accessUser)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    availableZones: ").append(toIndentedString(availableZones)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    kafkaManagerUser: ").append(toIndentedString(kafkaManagerUser)).append("\n");
        sb.append("    kafkaManagerPassword: ").append(toIndentedString(kafkaManagerPassword)).append("\n");
        sb.append("    maintainBegin: ").append(toIndentedString(maintainBegin)).append("\n");
        sb.append("    maintainEnd: ").append(toIndentedString(maintainEnd)).append("\n");
        sb.append("    enablePublicip: ").append(toIndentedString(enablePublicip)).append("\n");
        sb.append("    publicBandwidth: ").append(toIndentedString(publicBandwidth)).append("\n");
        sb.append("    publicipId: ").append(toIndentedString(publicipId)).append("\n");
        sb.append("    sslEnable: ").append(toIndentedString(sslEnable)).append("\n");
        sb.append("    retentionPolicy: ").append(toIndentedString(retentionPolicy)).append("\n");
        sb.append("    connectorEnable: ").append(toIndentedString(connectorEnable)).append("\n");
        sb.append("    enableAutoTopic: ").append(toIndentedString(enableAutoTopic)).append("\n");
        sb.append("    storageSpecCode: ").append(toIndentedString(storageSpecCode)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

