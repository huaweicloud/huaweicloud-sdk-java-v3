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
 * 创建实例请求体。
 */
public class CreateInstanceByEngineReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /**
     * **参数解释**： 消息引擎。 **约束限制**： 不涉及 **取值范围**： kafka **默认取值**： 不涉及。
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
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static EngineEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EngineEnum(value));
        }

        public static EngineEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EngineEnum) {
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
    @JsonProperty(value = "engine")

    private EngineEnum engine;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_version")

    private String engineVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "broker_num")

    private Integer brokerNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_space")

    private Integer storageSpace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_user")

    private String accessUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private String password;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_id")

    private String securityGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_zones")

    private List<String> availableZones = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

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
    @JsonProperty(value = "tenant_ips")

    private List<String> tenantIps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip_id")

    private String publicipId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssl_enable")

    private Boolean sslEnable;

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
    @JsonProperty(value = "port_protocol")

    private PortProtocol portProtocol;

    /**
     * **参数解释**： 磁盘的容量到达容量阈值后，对于消息的处理策略。 **约束限制**： 不涉及。 **取值范围**： - produce_reject：表示拒绝消息写入。 - time_base：表示自动删除最老消息。 **默认取值**： 不涉及。
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
    @JsonProperty(value = "ipv6_enable")

    private Boolean ipv6Enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_encrypted_enable")

    private Boolean diskEncryptedEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_encrypted_key")

    private String diskEncryptedKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connector_enable")

    private Boolean connectorEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_auto_topic")

    private Boolean enableAutoTopic;

    /**
     * **参数解释**： 云硬盘类型。[如何选择磁盘类型请参考《云硬盘 [产品介绍](tag:hws,hws_hk,hws_eu,cmcc)[用户指南](tag:dt,g42,hk_g42,ctc,tm,hk_tm,sbc,ocb,hws_ocb,ax)》的“磁盘类型及性能介绍”。](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,hk_tm,dt,ax) **约束限制**： 不涉及。 **取值范围**： - dms.physical.storage.high.v2：高IO云硬盘。 - dms.physical.storage.ultra.v2：超高IO云硬盘。 - [dms.physical.storage.general：通用型SSD云硬盘。](tag:hws,hws_hk,dt,ax) - [dms.physical.storage.extreme：极速型SSD云硬盘。](tag:hws,hws_hk,dt,ax) **默认取值**： 不涉及。
     */
    public static final class StorageSpecCodeEnum {

        /**
         * Enum DMS_PHYSICAL_STORAGE_HIGH_V2 for value: "dms.physical.storage.high.v2"
         */
        public static final StorageSpecCodeEnum DMS_PHYSICAL_STORAGE_HIGH_V2 =
            new StorageSpecCodeEnum("dms.physical.storage.high.v2");

        /**
         * Enum DMS_PHYSICAL_STORAGE_ULTRA_V2 for value: "dms.physical.storage.ultra.v2"
         */
        public static final StorageSpecCodeEnum DMS_PHYSICAL_STORAGE_ULTRA_V2 =
            new StorageSpecCodeEnum("dms.physical.storage.ultra.v2");

        /**
         * Enum _DMS_PHYSICAL_STORAGE_GENERAL_TAG_HWS_HWS_HK_DT_AX_ for value: "[dms.physical.storage.general](tag:hws,hws_hk,dt,ax)"
         */
        public static final StorageSpecCodeEnum _DMS_PHYSICAL_STORAGE_GENERAL_TAG_HWS_HWS_HK_DT_AX_ =
            new StorageSpecCodeEnum("[dms.physical.storage.general](tag:hws,hws_hk,dt,ax)");

        /**
         * Enum _DMS_PHYSICAL_STORAGE_EXTREME_TAG_HWS_HWS_HK_DT_AX_ for value: "[dms.physical.storage.extreme](tag:hws,hws_hk,dt,ax)"
         */
        public static final StorageSpecCodeEnum _DMS_PHYSICAL_STORAGE_EXTREME_TAG_HWS_HWS_HK_DT_AX_ =
            new StorageSpecCodeEnum("[dms.physical.storage.extreme](tag:hws,hws_hk,dt,ax)");

        private static final Map<String, StorageSpecCodeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StorageSpecCodeEnum> createStaticFields() {
            Map<String, StorageSpecCodeEnum> map = new HashMap<>();
            map.put("dms.physical.storage.high.v2", DMS_PHYSICAL_STORAGE_HIGH_V2);
            map.put("dms.physical.storage.ultra.v2", DMS_PHYSICAL_STORAGE_ULTRA_V2);
            map.put("[dms.physical.storage.general](tag:hws,hws_hk,dt,ax)",
                _DMS_PHYSICAL_STORAGE_GENERAL_TAG_HWS_HWS_HK_DT_AX_);
            map.put("[dms.physical.storage.extreme](tag:hws,hws_hk,dt,ax)",
                _DMS_PHYSICAL_STORAGE_EXTREME_TAG_HWS_HWS_HK_DT_AX_);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StorageSpecCodeEnum(String value) {
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
        public static StorageSpecCodeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StorageSpecCodeEnum(value));
        }

        public static StorageSpecCodeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StorageSpecCodeEnum) {
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
    @JsonProperty(value = "storage_spec_code")

    private StorageSpecCodeEnum storageSpecCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TagEntity> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "arch_type")

    private String archType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_client_plain")

    private Boolean vpcClientPlain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bss_param")

    private BssParam bssParam;

    public CreateInstanceByEngineReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 实例名称。 **约束限制**： 由英文字符开头，只能由英文字母、数字、中划线、下划线组成，长度为4~64的字符。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateInstanceByEngineReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**： 实例的描述信息。 **约束限制**： 长度不超过1024的字符串。[且字符串不能包含\">\"与\"<\"，字符串首字符不能为\"=\",\"+\",\"-\",\"@\"的全角和半角字符。](tag:hcs,fcs) \\与\"在json报文中属于特殊字符，如果参数值中需要显示\\或者\"字符，请在字符前增加转义字符\\，比如\\\\\\\\或者\\\\\"。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateInstanceByEngineReq withEngine(EngineEnum engine) {
        this.engine = engine;
        return this;
    }

    /**
     * **参数解释**： 消息引擎。 **约束限制**： 不涉及 **取值范围**： kafka **默认取值**： 不涉及。
     * @return engine
     */
    public EngineEnum getEngine() {
        return engine;
    }

    public void setEngine(EngineEnum engine) {
        this.engine = engine;
    }

    public CreateInstanceByEngineReq withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * **参数解释**： 消息引擎的版本。 **约束限制**： 不涉及 **取值范围**： [- 1.1.0](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,hk_tm,sbc,cmcc,ax) [- 2.3.0](tag:g42,tm,hk_g42,ctc,hk_tm,dt,sbc,cmcc,hws_eu) - 2.7 [- 3.x](tag:hws,hws_hk,dt,sbc,hcs,fcs,ctc,tm,hk_tm,hws_eu,ax) **默认取值**： 不涉及。
     * @return engineVersion
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    public CreateInstanceByEngineReq withBrokerNum(Integer brokerNum) {
        this.brokerNum = brokerNum;
        return this;
    }

    /**
     * **参数解释**： 代理个数。 **约束限制**： 不涉及。 **取值范围**： [- Kafka实例规格为kafka.2u4g.cluster.small时，代理数取值范围3-30。](tag:hws,hws_hk,hws_eu,dt,ax) - Kafka实例规格为kafka.2u4g.cluster时，代理数取值范围3-30。 - Kafka实例规格为kafka.4u8g.cluster时，代理数取值范围3-30。 - Kafka实例规格为kafka.8u16g.cluster时，代理数取值范围3-50。 - Kafka实例规格为kafka.12u24g.cluster时，代理数取值范围3-50。 - Kafka实例规格为kafka.16u32g.cluster时，代理数取值范围3-50。 **默认取值**： 不涉及。
     * @return brokerNum
     */
    public Integer getBrokerNum() {
        return brokerNum;
    }

    public void setBrokerNum(Integer brokerNum) {
        this.brokerNum = brokerNum;
    }

    public CreateInstanceByEngineReq withStorageSpace(Integer storageSpace) {
        this.storageSpace = storageSpace;
        return this;
    }

    /**
     * **参数解释**： 消息存储空间，单位GB。 **约束限制**： 不涉及。 **取值范围**： [- Kafka实例规格为c6.2u4g.cluster时，存储空间取值范围300GB ~ 300000GB。 - Kafka实例规格为c6.4u8g.cluster时，存储空间取值范围300GB ~ 600000GB。 - Kafka实例规格为c6.8u16g.cluster时，存储空间取值范围300GB ~ 1500000GB。 - Kafka实例规格为c6.12u24g.cluster时，存储空间取值范围300GB ~ 1500000GB。 - Kafka实例规格为c6.16u32g.cluster时，存储空间取值范围300GB ~ 1500000GB。](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,hk_tm,dt,ax) [- Kafka实例规格为s6.2u4g.cluster.small时，存储空间取值范围300GB~300000GB。](tag:hws,hws_hk,hws_eu,dt,ax) [- Kafka实例规格为kafka.2u8g.cluster时，存储空间取值范围300GB~300000GB。](tag:fcs) [- Kafka实例规格为kafka.4u16g.cluster时，存储空间取值范围300GB~600000GB。 - Kafka实例规格为kafka.8u32g.cluster时，存储空间取值范围300GB~1500000GB。 - Kafka实例规格为kafka.16u64g.cluster时，存储空间取值范围300GB~1500000GB。 - Kafka实例规格为kafka.32u128g.cluster时，存储空间取值范围300GB~1500000GB。](tag:hcs,fcs) **默认取值**： 不涉及。
     * @return storageSpace
     */
    public Integer getStorageSpace() {
        return storageSpace;
    }

    public void setStorageSpace(Integer storageSpace) {
        this.storageSpace = storageSpace;
    }

    public CreateInstanceByEngineReq withAccessUser(String accessUser) {
        this.accessUser = accessUser;
        return this;
    }

    /**
     * **参数解释**：  认证用户名。 **约束限制**： 只能由英文字母开头且由英文字母、数字、中划线、下划线组成，长度为4~64的字符。当ssl_enable为true时，该参数必选，ssl_enable为false时，该参数无效。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return accessUser
     */
    public String getAccessUser() {
        return accessUser;
    }

    public void setAccessUser(String accessUser) {
        this.accessUser = accessUser;
    }

    public CreateInstanceByEngineReq withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * **参数解释**： 实例的认证密码。 **约束限制**： - 当ssl_enable为true时，该参数必选，ssl_enable为false时，该参数无效。 - 输入长度为8到32位的字符串。 - 必须包含如下四种字符中的三种组合：   - 小写字母。   - 大写字母。   - 数字。   - 特殊字符包括（`~!@#$%^&*()-_=+\\|[{}]:'\",<.>/?）和空格，并且不能以-开头。    **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public CreateInstanceByEngineReq withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * **参数解释**：  虚拟私有云ID。获取方法如下：参考《虚拟私有云 API参考》，调用“查询VPC列表”接口，从响应体中获取VPC ID。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public CreateInstanceByEngineReq withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    /**
     * **参数解释**： 指定实例所属的安全组。获取方法如下：参考《虚拟私有云 API参考》，调用“查询安全组列表”接口，从响应体中获取安全组ID。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public CreateInstanceByEngineReq withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * **参数解释**： 子网信息。获取方法如下：参考《虚拟私有云 API参考》，调用“查询子网列表”接口，从响应体中获取子网ID。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public CreateInstanceByEngineReq withAvailableZones(List<String> availableZones) {
        this.availableZones = availableZones;
        return this;
    }

    public CreateInstanceByEngineReq addAvailableZonesItem(String availableZonesItem) {
        if (this.availableZones == null) {
            this.availableZones = new ArrayList<>();
        }
        this.availableZones.add(availableZonesItem);
        return this;
    }

    public CreateInstanceByEngineReq withAvailableZones(Consumer<List<String>> availableZonesSetter) {
        if (this.availableZones == null) {
            this.availableZones = new ArrayList<>();
        }
        availableZonesSetter.accept(this.availableZones);
        return this;
    }

    /**
     * **参数解释**： 创建节点到指定且有资源的可用区ID。请参考[查询可用区信息](ListAvailableZones.xml)获取可用区ID。 **约束限制**： 该参数不能为空数组或者数组的值为空。  创建Kafka实例，节点需要部署在1个或3个及以上可用区中。如果部署在多个可用区中，以英文逗号隔开多个可用区ID。
     * @return availableZones
     */
    public List<String> getAvailableZones() {
        return availableZones;
    }

    public void setAvailableZones(List<String> availableZones) {
        this.availableZones = availableZones;
    }

    public CreateInstanceByEngineReq withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * **参数解释**： 产品ID。产品ID可以从[查询产品规格列表](ListEngineProducts.xml)获取。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public CreateInstanceByEngineReq withMaintainBegin(String maintainBegin) {
        this.maintainBegin = maintainBegin;
        return this;
    }

    /**
     * **参数解释**： 维护时间窗开始时间。 **约束限制**： 格式为HH:mm。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return maintainBegin
     */
    public String getMaintainBegin() {
        return maintainBegin;
    }

    public void setMaintainBegin(String maintainBegin) {
        this.maintainBegin = maintainBegin;
    }

    public CreateInstanceByEngineReq withMaintainEnd(String maintainEnd) {
        this.maintainEnd = maintainEnd;
        return this;
    }

    /**
     * **参数解释**： 维护时间窗结束时间。 **约束限制**： 格式为HH:mm。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return maintainEnd
     */
    public String getMaintainEnd() {
        return maintainEnd;
    }

    public void setMaintainEnd(String maintainEnd) {
        this.maintainEnd = maintainEnd;
    }

    public CreateInstanceByEngineReq withEnablePublicip(Boolean enablePublicip) {
        this.enablePublicip = enablePublicip;
        return this;
    }

    /**
     * **参数解释**： 是否开启公网访问功能。 **约束限制**： 不涉及。 **取值范围**： - true：开启。 - false：不开启。 **默认取值**： false。
     * @return enablePublicip
     */
    public Boolean getEnablePublicip() {
        return enablePublicip;
    }

    public void setEnablePublicip(Boolean enablePublicip) {
        this.enablePublicip = enablePublicip;
    }

    public CreateInstanceByEngineReq withTenantIps(List<String> tenantIps) {
        this.tenantIps = tenantIps;
        return this;
    }

    public CreateInstanceByEngineReq addTenantIpsItem(String tenantIpsItem) {
        if (this.tenantIps == null) {
            this.tenantIps = new ArrayList<>();
        }
        this.tenantIps.add(tenantIpsItem);
        return this;
    }

    public CreateInstanceByEngineReq withTenantIps(Consumer<List<String>> tenantIpsSetter) {
        if (this.tenantIps == null) {
            this.tenantIps = new ArrayList<>();
        }
        tenantIpsSetter.accept(this.tenantIps);
        return this;
    }

    /**
     * **参数解释**： 创建实例时可以手动指定实例节点的内网IP地址，仅支持指定IPv4地址。 **约束限制**： 指定内网IP地址数量必须小于等于创建的节点数量。  如果指定的内网IP地址数量小于创建的节点数量时，系统会自动为剩余的节点随机分配内网IP地址。
     * @return tenantIps
     */
    public List<String> getTenantIps() {
        return tenantIps;
    }

    public void setTenantIps(List<String> tenantIps) {
        this.tenantIps = tenantIps;
    }

    public CreateInstanceByEngineReq withPublicipId(String publicipId) {
        this.publicipId = publicipId;
        return this;
    }

    /**
     * **参数解释**： 实例绑定的弹性IP地址的ID。 **约束限制**： 以英文逗号隔开多个弹性IP地址的ID。  如果开启了公网访问功能（即enable_publicip为true），该字段为必选。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return publicipId
     */
    public String getPublicipId() {
        return publicipId;
    }

    public void setPublicipId(String publicipId) {
        this.publicipId = publicipId;
    }

    public CreateInstanceByEngineReq withSslEnable(Boolean sslEnable) {
        this.sslEnable = sslEnable;
        return this;
    }

    /**
     * **参数解释**： 是否开启SASL加密访问。  [实例创建后将不支持动态开启和关闭。](tag:ocb,hws_ocb,hcs) **约束限制**： 不涉及。 **取值范围**： - true：开启SASL加密访问。 - false：关闭SASL加密访问。 **默认取值**： 不涉及。
     * @return sslEnable
     */
    public Boolean getSslEnable() {
        return sslEnable;
    }

    public void setSslEnable(Boolean sslEnable) {
        this.sslEnable = sslEnable;
    }

    public CreateInstanceByEngineReq withKafkaSecurityProtocol(String kafkaSecurityProtocol) {
        this.kafkaSecurityProtocol = kafkaSecurityProtocol;
        return this;
    }

    /**
     * **参数解释**： 开启SASL后使用的安全协议。 **约束限制**： 若该字段值为空，默认开启SASL_SSL认证机制。实例创建后，此参数不支持动态修改。 若创建实例时，使用了port_protocol参数，则Kafka的内网访问安全协议以及公网访问安全协议会使用port_protocol中的值，则此参数无效。 **取值范围**： - SASL_SSL：使用SSL证书加密传输，支持账号密码认证，安全性更高。 - SASL_PLAINTEXT：通过明文传输，支持账号密码认证，性能更好。 **默认取值**： 不涉及。
     * @return kafkaSecurityProtocol
     */
    public String getKafkaSecurityProtocol() {
        return kafkaSecurityProtocol;
    }

    public void setKafkaSecurityProtocol(String kafkaSecurityProtocol) {
        this.kafkaSecurityProtocol = kafkaSecurityProtocol;
    }

    public CreateInstanceByEngineReq withSaslEnabledMechanisms(List<SaslEnabledMechanismsEnum> saslEnabledMechanisms) {
        this.saslEnabledMechanisms = saslEnabledMechanisms;
        return this;
    }

    public CreateInstanceByEngineReq addSaslEnabledMechanismsItem(SaslEnabledMechanismsEnum saslEnabledMechanismsItem) {
        if (this.saslEnabledMechanisms == null) {
            this.saslEnabledMechanisms = new ArrayList<>();
        }
        this.saslEnabledMechanisms.add(saslEnabledMechanismsItem);
        return this;
    }

    public CreateInstanceByEngineReq withSaslEnabledMechanisms(
        Consumer<List<SaslEnabledMechanismsEnum>> saslEnabledMechanismsSetter) {
        if (this.saslEnabledMechanisms == null) {
            this.saslEnabledMechanisms = new ArrayList<>();
        }
        saslEnabledMechanismsSetter.accept(this.saslEnabledMechanisms);
        return this;
    }

    /**
     * **参数解释**： 开启SASL后使用的认证机制。 **约束限制**： 如果开启了SASL认证功能（即ssl_enable=true），该字段为必选。若该字段值为空，默认开启PLAIN认证机制。
     * @return saslEnabledMechanisms
     */
    public List<SaslEnabledMechanismsEnum> getSaslEnabledMechanisms() {
        return saslEnabledMechanisms;
    }

    public void setSaslEnabledMechanisms(List<SaslEnabledMechanismsEnum> saslEnabledMechanisms) {
        this.saslEnabledMechanisms = saslEnabledMechanisms;
    }

    public CreateInstanceByEngineReq withPortProtocol(PortProtocol portProtocol) {
        this.portProtocol = portProtocol;
        return this;
    }

    public CreateInstanceByEngineReq withPortProtocol(Consumer<PortProtocol> portProtocolSetter) {
        if (this.portProtocol == null) {
            this.portProtocol = new PortProtocol();
            portProtocolSetter.accept(this.portProtocol);
        }

        return this;
    }

    /**
     * Get portProtocol
     * @return portProtocol
     */
    public PortProtocol getPortProtocol() {
        return portProtocol;
    }

    public void setPortProtocol(PortProtocol portProtocol) {
        this.portProtocol = portProtocol;
    }

    public CreateInstanceByEngineReq withRetentionPolicy(RetentionPolicyEnum retentionPolicy) {
        this.retentionPolicy = retentionPolicy;
        return this;
    }

    /**
     * **参数解释**： 磁盘的容量到达容量阈值后，对于消息的处理策略。 **约束限制**： 不涉及。 **取值范围**： - produce_reject：表示拒绝消息写入。 - time_base：表示自动删除最老消息。 **默认取值**： 不涉及。
     * @return retentionPolicy
     */
    public RetentionPolicyEnum getRetentionPolicy() {
        return retentionPolicy;
    }

    public void setRetentionPolicy(RetentionPolicyEnum retentionPolicy) {
        this.retentionPolicy = retentionPolicy;
    }

    public CreateInstanceByEngineReq withIpv6Enable(Boolean ipv6Enable) {
        this.ipv6Enable = ipv6Enable;
        return this;
    }

    /**
     * **参数解释**： 是否开启IPv6。 **约束限制**： 仅在虚拟私有云支持IPv6时生效。 **取值范围**： - true：开启。 - false：不开启。 **默认取值**： false。
     * @return ipv6Enable
     */
    public Boolean getIpv6Enable() {
        return ipv6Enable;
    }

    public void setIpv6Enable(Boolean ipv6Enable) {
        this.ipv6Enable = ipv6Enable;
    }

    public CreateInstanceByEngineReq withDiskEncryptedEnable(Boolean diskEncryptedEnable) {
        this.diskEncryptedEnable = diskEncryptedEnable;
        return this;
    }

    /**
     * **参数解释**： 是否开启磁盘加密。 **约束限制**： 不涉及。 **取值范围**： - true：开启。 - false：不开启。 **默认取值**： false。
     * @return diskEncryptedEnable
     */
    public Boolean getDiskEncryptedEnable() {
        return diskEncryptedEnable;
    }

    public void setDiskEncryptedEnable(Boolean diskEncryptedEnable) {
        this.diskEncryptedEnable = diskEncryptedEnable;
    }

    public CreateInstanceByEngineReq withDiskEncryptedKey(String diskEncryptedKey) {
        this.diskEncryptedKey = diskEncryptedKey;
        return this;
    }

    /**
     * **参数解释**： 磁盘加密key，未开启磁盘加密时为空。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return diskEncryptedKey
     */
    public String getDiskEncryptedKey() {
        return diskEncryptedKey;
    }

    public void setDiskEncryptedKey(String diskEncryptedKey) {
        this.diskEncryptedKey = diskEncryptedKey;
    }

    public CreateInstanceByEngineReq withConnectorEnable(Boolean connectorEnable) {
        this.connectorEnable = connectorEnable;
        return this;
    }

    /**
     * **参数解释**： 是否开启Smart Connect功能。Smart Connect用于Kafka实例和其他云服务之间的数据同步，或者两个Kafka实例之间的数据同步，实现数据的备份或迁移。 **约束限制**： 不涉及。 **取值范围**： - true：开启。 - false：不开启。 **默认取值**： false。
     * @return connectorEnable
     */
    public Boolean getConnectorEnable() {
        return connectorEnable;
    }

    public void setConnectorEnable(Boolean connectorEnable) {
        this.connectorEnable = connectorEnable;
    }

    public CreateInstanceByEngineReq withEnableAutoTopic(Boolean enableAutoTopic) {
        this.enableAutoTopic = enableAutoTopic;
        return this;
    }

    /**
     * **参数解释**： 是否开启kafka自动创建Topic功能。当您选择开启，向一个未创建的Topic生产或消费消息时，系统会自动创建此Topic。 **约束限制**： 不涉及。 **取值范围**： - true：开启。 - false：不开启。 **默认取值**： false。
     * @return enableAutoTopic
     */
    public Boolean getEnableAutoTopic() {
        return enableAutoTopic;
    }

    public void setEnableAutoTopic(Boolean enableAutoTopic) {
        this.enableAutoTopic = enableAutoTopic;
    }

    public CreateInstanceByEngineReq withStorageSpecCode(StorageSpecCodeEnum storageSpecCode) {
        this.storageSpecCode = storageSpecCode;
        return this;
    }

    /**
     * **参数解释**： 云硬盘类型。[如何选择磁盘类型请参考《云硬盘 [产品介绍](tag:hws,hws_hk,hws_eu,cmcc)[用户指南](tag:dt,g42,hk_g42,ctc,tm,hk_tm,sbc,ocb,hws_ocb,ax)》的“磁盘类型及性能介绍”。](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,hk_tm,dt,ax) **约束限制**： 不涉及。 **取值范围**： - dms.physical.storage.high.v2：高IO云硬盘。 - dms.physical.storage.ultra.v2：超高IO云硬盘。 - [dms.physical.storage.general：通用型SSD云硬盘。](tag:hws,hws_hk,dt,ax) - [dms.physical.storage.extreme：极速型SSD云硬盘。](tag:hws,hws_hk,dt,ax) **默认取值**： 不涉及。
     * @return storageSpecCode
     */
    public StorageSpecCodeEnum getStorageSpecCode() {
        return storageSpecCode;
    }

    public void setStorageSpecCode(StorageSpecCodeEnum storageSpecCode) {
        this.storageSpecCode = storageSpecCode;
    }

    public CreateInstanceByEngineReq withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释**： 企业项目ID。 **约束限制**： 若为企业项目账号，该参数必填。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CreateInstanceByEngineReq withTags(List<TagEntity> tags) {
        this.tags = tags;
        return this;
    }

    public CreateInstanceByEngineReq addTagsItem(TagEntity tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateInstanceByEngineReq withTags(Consumer<List<TagEntity>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释**： Kafka实例的标签信息。 **约束限制**： 不涉及。
     * @return tags
     */
    public List<TagEntity> getTags() {
        return tags;
    }

    public void setTags(List<TagEntity> tags) {
        this.tags = tags;
    }

    public CreateInstanceByEngineReq withArchType(String archType) {
        this.archType = archType;
        return this;
    }

    /**
     * **参数解释**： CPU架构。 **约束限制**： 不涉及。 **取值范围**： - X86 [- ARM](tag:hcs,fcs,ctc) **默认取值**： 不涉及。
     * @return archType
     */
    public String getArchType() {
        return archType;
    }

    public void setArchType(String archType) {
        this.archType = archType;
    }

    public CreateInstanceByEngineReq withVpcClientPlain(Boolean vpcClientPlain) {
        this.vpcClientPlain = vpcClientPlain;
        return this;
    }

    /**
     * **参数解释**： VPC内网明文访问。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return vpcClientPlain
     */
    public Boolean getVpcClientPlain() {
        return vpcClientPlain;
    }

    public void setVpcClientPlain(Boolean vpcClientPlain) {
        this.vpcClientPlain = vpcClientPlain;
    }

    public CreateInstanceByEngineReq withBssParam(BssParam bssParam) {
        this.bssParam = bssParam;
        return this;
    }

    public CreateInstanceByEngineReq withBssParam(Consumer<BssParam> bssParamSetter) {
        if (this.bssParam == null) {
            this.bssParam = new BssParam();
            bssParamSetter.accept(this.bssParam);
        }

        return this;
    }

    /**
     * Get bssParam
     * @return bssParam
     */
    public BssParam getBssParam() {
        return bssParam;
    }

    public void setBssParam(BssParam bssParam) {
        this.bssParam = bssParam;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateInstanceByEngineReq that = (CreateInstanceByEngineReq) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.engine, that.engine) && Objects.equals(this.engineVersion, that.engineVersion)
            && Objects.equals(this.brokerNum, that.brokerNum) && Objects.equals(this.storageSpace, that.storageSpace)
            && Objects.equals(this.accessUser, that.accessUser) && Objects.equals(this.password, that.password)
            && Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.securityGroupId, that.securityGroupId)
            && Objects.equals(this.subnetId, that.subnetId) && Objects.equals(this.availableZones, that.availableZones)
            && Objects.equals(this.productId, that.productId) && Objects.equals(this.maintainBegin, that.maintainBegin)
            && Objects.equals(this.maintainEnd, that.maintainEnd)
            && Objects.equals(this.enablePublicip, that.enablePublicip)
            && Objects.equals(this.tenantIps, that.tenantIps) && Objects.equals(this.publicipId, that.publicipId)
            && Objects.equals(this.sslEnable, that.sslEnable)
            && Objects.equals(this.kafkaSecurityProtocol, that.kafkaSecurityProtocol)
            && Objects.equals(this.saslEnabledMechanisms, that.saslEnabledMechanisms)
            && Objects.equals(this.portProtocol, that.portProtocol)
            && Objects.equals(this.retentionPolicy, that.retentionPolicy)
            && Objects.equals(this.ipv6Enable, that.ipv6Enable)
            && Objects.equals(this.diskEncryptedEnable, that.diskEncryptedEnable)
            && Objects.equals(this.diskEncryptedKey, that.diskEncryptedKey)
            && Objects.equals(this.connectorEnable, that.connectorEnable)
            && Objects.equals(this.enableAutoTopic, that.enableAutoTopic)
            && Objects.equals(this.storageSpecCode, that.storageSpecCode)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.archType, that.archType)
            && Objects.equals(this.vpcClientPlain, that.vpcClientPlain) && Objects.equals(this.bssParam, that.bssParam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            description,
            engine,
            engineVersion,
            brokerNum,
            storageSpace,
            accessUser,
            password,
            vpcId,
            securityGroupId,
            subnetId,
            availableZones,
            productId,
            maintainBegin,
            maintainEnd,
            enablePublicip,
            tenantIps,
            publicipId,
            sslEnable,
            kafkaSecurityProtocol,
            saslEnabledMechanisms,
            portProtocol,
            retentionPolicy,
            ipv6Enable,
            diskEncryptedEnable,
            diskEncryptedKey,
            connectorEnable,
            enableAutoTopic,
            storageSpecCode,
            enterpriseProjectId,
            tags,
            archType,
            vpcClientPlain,
            bssParam);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateInstanceByEngineReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
        sb.append("    engineVersion: ").append(toIndentedString(engineVersion)).append("\n");
        sb.append("    brokerNum: ").append(toIndentedString(brokerNum)).append("\n");
        sb.append("    storageSpace: ").append(toIndentedString(storageSpace)).append("\n");
        sb.append("    accessUser: ").append(toIndentedString(accessUser)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    availableZones: ").append(toIndentedString(availableZones)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    maintainBegin: ").append(toIndentedString(maintainBegin)).append("\n");
        sb.append("    maintainEnd: ").append(toIndentedString(maintainEnd)).append("\n");
        sb.append("    enablePublicip: ").append(toIndentedString(enablePublicip)).append("\n");
        sb.append("    tenantIps: ").append(toIndentedString(tenantIps)).append("\n");
        sb.append("    publicipId: ").append(toIndentedString(publicipId)).append("\n");
        sb.append("    sslEnable: ").append(toIndentedString(sslEnable)).append("\n");
        sb.append("    kafkaSecurityProtocol: ").append(toIndentedString(kafkaSecurityProtocol)).append("\n");
        sb.append("    saslEnabledMechanisms: ").append(toIndentedString(saslEnabledMechanisms)).append("\n");
        sb.append("    portProtocol: ").append(toIndentedString(portProtocol)).append("\n");
        sb.append("    retentionPolicy: ").append(toIndentedString(retentionPolicy)).append("\n");
        sb.append("    ipv6Enable: ").append(toIndentedString(ipv6Enable)).append("\n");
        sb.append("    diskEncryptedEnable: ").append(toIndentedString(diskEncryptedEnable)).append("\n");
        sb.append("    diskEncryptedKey: ").append(toIndentedString(diskEncryptedKey)).append("\n");
        sb.append("    connectorEnable: ").append(toIndentedString(connectorEnable)).append("\n");
        sb.append("    enableAutoTopic: ").append(toIndentedString(enableAutoTopic)).append("\n");
        sb.append("    storageSpecCode: ").append(toIndentedString(storageSpecCode)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    archType: ").append(toIndentedString(archType)).append("\n");
        sb.append("    vpcClientPlain: ").append(toIndentedString(vpcClientPlain)).append("\n");
        sb.append("    bssParam: ").append(toIndentedString(bssParam)).append("\n");
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
