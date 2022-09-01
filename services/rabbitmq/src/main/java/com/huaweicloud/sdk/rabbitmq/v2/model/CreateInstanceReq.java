package com.huaweicloud.sdk.rabbitmq.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

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
public class CreateInstanceReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    /**
     * 消息引擎：rabbitmq。
     */
    public static final class EngineEnum {

        /**
         * Enum RABBITMQ for value: "rabbitmq"
         */
        public static final EngineEnum RABBITMQ = new EngineEnum("rabbitmq");

        private static final Map<String, EngineEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EngineEnum> createStaticFields() {
            Map<String, EngineEnum> map = new HashMap<>();
            map.put("rabbitmq", RABBITMQ);
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
            EngineEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new EngineEnum(value);
            }
            return result;
        }

        public static EngineEnum valueOf(String value) {
            if (value == null) {
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

    @JacksonXmlProperty(localName = "engine")

    private EngineEnum engine;

    /**
     * 消息引擎的版本。   - RabbitMQ版本有：3.7.17 
     */
    public static final class EngineVersionEnum {

        /**
         * Enum _3_7_17 for value: "3.7.17"
         */
        public static final EngineVersionEnum _3_7_17 = new EngineVersionEnum("3.7.17");

        private static final Map<String, EngineVersionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EngineVersionEnum> createStaticFields() {
            Map<String, EngineVersionEnum> map = new HashMap<>();
            map.put("3.7.17", _3_7_17);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EngineVersionEnum(String value) {
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
        public static EngineVersionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            EngineVersionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new EngineVersionEnum(value);
            }
            return result;
        }

        public static EngineVersionEnum valueOf(String value) {
            if (value == null) {
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
            if (obj instanceof EngineVersionEnum) {
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
    @JsonProperty(value = "engine_version")

    @JacksonXmlProperty(localName = "engine_version")

    private EngineVersionEnum engineVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_space")

    @JacksonXmlProperty(localName = "storage_space")

    private Integer storageSpace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_user")

    @JacksonXmlProperty(localName = "access_user")

    private String accessUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    @JacksonXmlProperty(localName = "password")

    private String password;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    @JacksonXmlProperty(localName = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_id")

    @JacksonXmlProperty(localName = "security_group_id")

    private String securityGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    @JacksonXmlProperty(localName = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_zones")

    @JacksonXmlProperty(localName = "available_zones")

    private List<String> availableZones = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    @JacksonXmlProperty(localName = "product_id")

    private String productId;

    /**
     * 代理个数。  当产品为单机类型，代理个数只能为1；当产品为集群类型，可选3、5、7个代理个数。  产品类型为single时:   - 1  产品类型为cluster时:   - 3   - 5   - 7
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
            BrokerNumEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new BrokerNumEnum(value);
            }
            return result;
        }

        public static BrokerNumEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            BrokerNumEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    @JacksonXmlProperty(localName = "broker_num")

    private BrokerNumEnum brokerNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maintain_begin")

    @JacksonXmlProperty(localName = "maintain_begin")

    private String maintainBegin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maintain_end")

    @JacksonXmlProperty(localName = "maintain_end")

    private String maintainEnd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_publicip")

    @JacksonXmlProperty(localName = "enable_publicip")

    private Boolean enablePublicip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip_id")

    @JacksonXmlProperty(localName = "publicip_id")

    private String publicipId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssl_enable")

    @JacksonXmlProperty(localName = "ssl_enable")

    private Boolean sslEnable;

    /**
     * 存储IO规格。  取值范围：   - dms.physical.storage.high.v2   - dms.physical.storage.ultra.v2   - dms.physical.storage.high.dss.v2   - dms.physical.storage.ultra.dss.v2
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
         * Enum DMS_PHYSICAL_STORAGE_HIGH_DSS_V2 for value: "dms.physical.storage.high.dss.v2"
         */
        public static final StorageSpecCodeEnum DMS_PHYSICAL_STORAGE_HIGH_DSS_V2 =
            new StorageSpecCodeEnum("dms.physical.storage.high.dss.v2");

        /**
         * Enum DMS_PHYSICAL_STORAGE_ULTRA_DSS_V2 for value: "dms.physical.storage.ultra.dss.v2"
         */
        public static final StorageSpecCodeEnum DMS_PHYSICAL_STORAGE_ULTRA_DSS_V2 =
            new StorageSpecCodeEnum("dms.physical.storage.ultra.dss.v2");

        private static final Map<String, StorageSpecCodeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StorageSpecCodeEnum> createStaticFields() {
            Map<String, StorageSpecCodeEnum> map = new HashMap<>();
            map.put("dms.physical.storage.high.v2", DMS_PHYSICAL_STORAGE_HIGH_V2);
            map.put("dms.physical.storage.ultra.v2", DMS_PHYSICAL_STORAGE_ULTRA_V2);
            map.put("dms.physical.storage.high.dss.v2", DMS_PHYSICAL_STORAGE_HIGH_DSS_V2);
            map.put("dms.physical.storage.ultra.dss.v2", DMS_PHYSICAL_STORAGE_ULTRA_DSS_V2);
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
            StorageSpecCodeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StorageSpecCodeEnum(value);
            }
            return result;
        }

        public static StorageSpecCodeEnum valueOf(String value) {
            if (value == null) {
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

    @JacksonXmlProperty(localName = "storage_spec_code")

    private StorageSpecCodeEnum storageSpecCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    @JacksonXmlProperty(localName = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    @JacksonXmlProperty(localName = "tags")

    private List<TagEntity> tags = null;

    public CreateInstanceReq withName(String name) {
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

    public CreateInstanceReq withDescription(String description) {
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

    public CreateInstanceReq withEngine(EngineEnum engine) {
        this.engine = engine;
        return this;
    }

    /**
     * 消息引擎：rabbitmq。
     * @return engine
     */
    public EngineEnum getEngine() {
        return engine;
    }

    public void setEngine(EngineEnum engine) {
        this.engine = engine;
    }

    public CreateInstanceReq withEngineVersion(EngineVersionEnum engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * 消息引擎的版本。   - RabbitMQ版本有：3.7.17 
     * @return engineVersion
     */
    public EngineVersionEnum getEngineVersion() {
        return engineVersion;
    }

    public void setEngineVersion(EngineVersionEnum engineVersion) {
        this.engineVersion = engineVersion;
    }

    public CreateInstanceReq withStorageSpace(Integer storageSpace) {
        this.storageSpace = storageSpace;
        return this;
    }

    /**
     * 消息存储空间，单位GB。   - 单机RabbitMQ实例的存储空间的取值范围100GB~90000GB。   - 集群RabbitMQ实例的存储空间的取值范围为100GB*节点数~90000GB、200GB*节点数~90000GB、300GB*节点数~90000GB。 
     * @return storageSpace
     */
    public Integer getStorageSpace() {
        return storageSpace;
    }

    public void setStorageSpace(Integer storageSpace) {
        this.storageSpace = storageSpace;
    }

    public CreateInstanceReq withAccessUser(String accessUser) {
        this.accessUser = accessUser;
        return this;
    }

    /**
     * 认证用户名，只能由英文字母、数字、中划线组成，长度为4~64的字符。
     * @return accessUser
     */
    public String getAccessUser() {
        return accessUser;
    }

    public void setAccessUser(String accessUser) {
        this.accessUser = accessUser;
    }

    public CreateInstanceReq withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * 实例的认证密码。  复杂度要求： - 输入长度为8到32位的字符串。 - 必须包含如下四种字符中的两种组合：   - 小写字母   - 大写字母   - 数字   - 特殊字符包括（`~!@#$%^&*()-_=+\\|[{}]:'\",<.>/?）
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public CreateInstanceReq withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 租户VPC ID。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public CreateInstanceReq withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    /**
     * 租户安全组ID。
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public CreateInstanceReq withSubnetId(String subnetId) {
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

    public CreateInstanceReq withAvailableZones(List<String> availableZones) {
        this.availableZones = availableZones;
        return this;
    }

    public CreateInstanceReq addAvailableZonesItem(String availableZonesItem) {
        if (this.availableZones == null) {
            this.availableZones = new ArrayList<>();
        }
        this.availableZones.add(availableZonesItem);
        return this;
    }

    public CreateInstanceReq withAvailableZones(Consumer<List<String>> availableZonesSetter) {
        if (this.availableZones == null) {
            this.availableZones = new ArrayList<>();
        }
        availableZonesSetter.accept(this.availableZones);
        return this;
    }

    /**
     * 创建节点到指定且有资源的可用区ID。该参数不能为空数组或者数组的值为空。
     * @return availableZones
     */
    public List<String> getAvailableZones() {
        return availableZones;
    }

    public void setAvailableZones(List<String> availableZones) {
        this.availableZones = availableZones;
    }

    public CreateInstanceReq withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * 产品标识。  产品ID可以从**查询产品规格列表**接口查询。  如果产品ID为集群类型（即对应的type为cluster），broker_num字段为必选。
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public CreateInstanceReq withBrokerNum(BrokerNumEnum brokerNum) {
        this.brokerNum = brokerNum;
        return this;
    }

    /**
     * 代理个数。  当产品为单机类型，代理个数只能为1；当产品为集群类型，可选3、5、7个代理个数。  产品类型为single时:   - 1  产品类型为cluster时:   - 3   - 5   - 7
     * @return brokerNum
     */
    public BrokerNumEnum getBrokerNum() {
        return brokerNum;
    }

    public void setBrokerNum(BrokerNumEnum brokerNum) {
        this.brokerNum = brokerNum;
    }

    public CreateInstanceReq withMaintainBegin(String maintainBegin) {
        this.maintainBegin = maintainBegin;
        return this;
    }

    /**
     * 维护时间窗开始时间，格式为HH:mm。 - 维护时间窗开始和结束时间必须为指定的时间段。 - 开始时间必须为22:00、02:00、06:00、10:00、14:00和18:00。 - 该参数不能单独为空，若该值为空，则结束时间也为空。系统分配一个默认开始时间02:00。
     * @return maintainBegin
     */
    public String getMaintainBegin() {
        return maintainBegin;
    }

    public void setMaintainBegin(String maintainBegin) {
        this.maintainBegin = maintainBegin;
    }

    public CreateInstanceReq withMaintainEnd(String maintainEnd) {
        this.maintainEnd = maintainEnd;
        return this;
    }

    /**
     * 维护时间窗结束时间，格式为HH:mm。 - 维护时间窗开始和结束时间必须为指定的时间段。 - 结束时间在开始时间基础上加四个小时，即当开始时间为22:00时，结束时间为02:00。 - 该参数不能单独为空，若该值为空，则开始时间也为空，系统分配一个默认结束时间06:00。
     * @return maintainEnd
     */
    public String getMaintainEnd() {
        return maintainEnd;
    }

    public void setMaintainEnd(String maintainEnd) {
        this.maintainEnd = maintainEnd;
    }

    public CreateInstanceReq withEnablePublicip(Boolean enablePublicip) {
        this.enablePublicip = enablePublicip;
        return this;
    }

    /**
     * RabbitMQ实例是否开启公网访问功能。 - true：开启 - false：不开启
     * @return enablePublicip
     */
    public Boolean getEnablePublicip() {
        return enablePublicip;
    }

    public void setEnablePublicip(Boolean enablePublicip) {
        this.enablePublicip = enablePublicip;
    }

    public CreateInstanceReq withPublicipId(String publicipId) {
        this.publicipId = publicipId;
        return this;
    }

    /**
     * RabbitMQ实例绑定的弹性IP地址的ID。 如果开启了公网访问功能（即enable_publicip为true），该字段为必选。
     * @return publicipId
     */
    public String getPublicipId() {
        return publicipId;
    }

    public void setPublicipId(String publicipId) {
        this.publicipId = publicipId;
    }

    public CreateInstanceReq withSslEnable(Boolean sslEnable) {
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

    public CreateInstanceReq withStorageSpecCode(StorageSpecCodeEnum storageSpecCode) {
        this.storageSpecCode = storageSpecCode;
        return this;
    }

    /**
     * 存储IO规格。  取值范围：   - dms.physical.storage.high.v2   - dms.physical.storage.ultra.v2   - dms.physical.storage.high.dss.v2   - dms.physical.storage.ultra.dss.v2
     * @return storageSpecCode
     */
    public StorageSpecCodeEnum getStorageSpecCode() {
        return storageSpecCode;
    }

    public void setStorageSpecCode(StorageSpecCodeEnum storageSpecCode) {
        this.storageSpecCode = storageSpecCode;
    }

    public CreateInstanceReq withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID。若为企业项目帐号，该参数必填。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CreateInstanceReq withTags(List<TagEntity> tags) {
        this.tags = tags;
        return this;
    }

    public CreateInstanceReq addTagsItem(TagEntity tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateInstanceReq withTags(Consumer<List<TagEntity>> tagsSetter) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateInstanceReq createInstanceReq = (CreateInstanceReq) o;
        return Objects.equals(this.name, createInstanceReq.name)
            && Objects.equals(this.description, createInstanceReq.description)
            && Objects.equals(this.engine, createInstanceReq.engine)
            && Objects.equals(this.engineVersion, createInstanceReq.engineVersion)
            && Objects.equals(this.storageSpace, createInstanceReq.storageSpace)
            && Objects.equals(this.accessUser, createInstanceReq.accessUser)
            && Objects.equals(this.password, createInstanceReq.password)
            && Objects.equals(this.vpcId, createInstanceReq.vpcId)
            && Objects.equals(this.securityGroupId, createInstanceReq.securityGroupId)
            && Objects.equals(this.subnetId, createInstanceReq.subnetId)
            && Objects.equals(this.availableZones, createInstanceReq.availableZones)
            && Objects.equals(this.productId, createInstanceReq.productId)
            && Objects.equals(this.brokerNum, createInstanceReq.brokerNum)
            && Objects.equals(this.maintainBegin, createInstanceReq.maintainBegin)
            && Objects.equals(this.maintainEnd, createInstanceReq.maintainEnd)
            && Objects.equals(this.enablePublicip, createInstanceReq.enablePublicip)
            && Objects.equals(this.publicipId, createInstanceReq.publicipId)
            && Objects.equals(this.sslEnable, createInstanceReq.sslEnable)
            && Objects.equals(this.storageSpecCode, createInstanceReq.storageSpecCode)
            && Objects.equals(this.enterpriseProjectId, createInstanceReq.enterpriseProjectId)
            && Objects.equals(this.tags, createInstanceReq.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            description,
            engine,
            engineVersion,
            storageSpace,
            accessUser,
            password,
            vpcId,
            securityGroupId,
            subnetId,
            availableZones,
            productId,
            brokerNum,
            maintainBegin,
            maintainEnd,
            enablePublicip,
            publicipId,
            sslEnable,
            storageSpecCode,
            enterpriseProjectId,
            tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateInstanceReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
        sb.append("    engineVersion: ").append(toIndentedString(engineVersion)).append("\n");
        sb.append("    storageSpace: ").append(toIndentedString(storageSpace)).append("\n");
        sb.append("    accessUser: ").append(toIndentedString(accessUser)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    availableZones: ").append(toIndentedString(availableZones)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    brokerNum: ").append(toIndentedString(brokerNum)).append("\n");
        sb.append("    maintainBegin: ").append(toIndentedString(maintainBegin)).append("\n");
        sb.append("    maintainEnd: ").append(toIndentedString(maintainEnd)).append("\n");
        sb.append("    enablePublicip: ").append(toIndentedString(enablePublicip)).append("\n");
        sb.append("    publicipId: ").append(toIndentedString(publicipId)).append("\n");
        sb.append("    sslEnable: ").append(toIndentedString(sslEnable)).append("\n");
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
