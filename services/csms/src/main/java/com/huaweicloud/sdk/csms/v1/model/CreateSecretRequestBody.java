package com.huaweicloud.sdk.csms.v1.model;

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
 * 创建凭据请求消息体。
 */
public class CreateSecretRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kms_key_id")

    private String kmsKeyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret_binary")

    private String secretBinary;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret_string")

    private String secretString;

    /**
     * 凭据类型   - COMMON：通用凭据(默认)。用于应用系统中的各种敏感信息储存。  - RDS：RDS凭据 。专门针对RDS的凭据，用于存储RDS的账号信息。（已不支持，使用RDS-FG替代）  - RDS-FG：RDS凭据 。专门针对RDS的凭据，用于存储RDS的账号信息。  - GaussDB-FG：TaurusDB凭据。专门针对TaurusDB的凭据，用于存储TaurusDB的账号信息。
     */
    public static final class SecretTypeEnum {

        /**
         * Enum COMMON for value: "COMMON"
         */
        public static final SecretTypeEnum COMMON = new SecretTypeEnum("COMMON");

        /**
         * Enum RDS_FG for value: "RDS-FG"
         */
        public static final SecretTypeEnum RDS_FG = new SecretTypeEnum("RDS-FG");

        /**
         * Enum GAUSSDB_FG for value: "GaussDB-FG"
         */
        public static final SecretTypeEnum GAUSSDB_FG = new SecretTypeEnum("GaussDB-FG");

        private static final Map<String, SecretTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SecretTypeEnum> createStaticFields() {
            Map<String, SecretTypeEnum> map = new HashMap<>();
            map.put("COMMON", COMMON);
            map.put("RDS-FG", RDS_FG);
            map.put("GaussDB-FG", GAUSSDB_FG);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SecretTypeEnum(String value) {
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
        public static SecretTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SecretTypeEnum(value));
        }

        public static SecretTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SecretTypeEnum) {
                return this.value.equals(((SecretTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret_type")

    private SecretTypeEnum secretType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_rotation")

    private Boolean autoRotation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rotation_period")

    private String rotationPeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rotation_config")

    private String rotationConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_subscriptions")

    private List<String> eventSubscriptions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rotation_func_urn")

    private String rotationFuncUrn;

    public CreateSecretRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 待创建凭据的名称。  约束：取值范围为1到64个字符，满足正则匹配“^[a-zA-Z0-9_-]{1,64}$”。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateSecretRequestBody withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * 用于加密保护凭据值的KMS主密钥ID，如果您未指定此参数，凭据管理服务将默认使用名为csms/default的默认主密钥，用于加密您账号在本项目中创建的凭据值。如果用户账号下不存在该名称的主密钥，则凭据管理服务自动为您创建该名称的密钥。
     * @return kmsKeyId
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    public CreateSecretRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 凭据的描述信息。  约束：2048字节。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateSecretRequestBody withSecretBinary(String secretBinary) {
        this.secretBinary = secretBinary;
        return this;
    }

    /**
     * 二进制类型凭据在base64编码后的明文，凭据管理服务将其加密后，存入凭据的初始版本中。  类型：base64编码的二进制数据对象。  约束：secret_binary和secret_string必须且只能设置一个，最大32K。
     * @return secretBinary
     */
    public String getSecretBinary() {
        return secretBinary;
    }

    public void setSecretBinary(String secretBinary) {
        this.secretBinary = secretBinary;
    }

    public CreateSecretRequestBody withSecretString(String secretString) {
        this.secretString = secretString;
        return this;
    }

    /**
     * 文本类型凭据的明文，凭据管理服务将其加密后，存入凭据的初始版本中。  约束：secret_binary和secret_string必须且只能设置一个，最大32K。
     * @return secretString
     */
    public String getSecretString() {
        return secretString;
    }

    public void setSecretString(String secretString) {
        this.secretString = secretString;
    }

    public CreateSecretRequestBody withSecretType(SecretTypeEnum secretType) {
        this.secretType = secretType;
        return this;
    }

    /**
     * 凭据类型   - COMMON：通用凭据(默认)。用于应用系统中的各种敏感信息储存。  - RDS：RDS凭据 。专门针对RDS的凭据，用于存储RDS的账号信息。（已不支持，使用RDS-FG替代）  - RDS-FG：RDS凭据 。专门针对RDS的凭据，用于存储RDS的账号信息。  - GaussDB-FG：TaurusDB凭据。专门针对TaurusDB的凭据，用于存储TaurusDB的账号信息。
     * @return secretType
     */
    public SecretTypeEnum getSecretType() {
        return secretType;
    }

    public void setSecretType(SecretTypeEnum secretType) {
        this.secretType = secretType;
    }

    public CreateSecretRequestBody withAutoRotation(Boolean autoRotation) {
        this.autoRotation = autoRotation;
        return this;
    }

    /**
     * 自动轮转  取值：true 开启 ,false 关闭 (默认)
     * @return autoRotation
     */
    public Boolean getAutoRotation() {
        return autoRotation;
    }

    public void setAutoRotation(Boolean autoRotation) {
        this.autoRotation = autoRotation;
    }

    public CreateSecretRequestBody withRotationPeriod(String rotationPeriod) {
        this.rotationPeriod = rotationPeriod;
        return this;
    }

    /**
     * 轮转周期  约束：6小时-8,760小时 （365天）  类型：Integer[unit] ，Integer表示时间长度 。unit表示时间单位，d（天）、h（小时）、m（分钟）、s（秒）。例如 1d 表示一天，24h也表示一天  说明：当开启自动轮转时，必须填写该值
     * @return rotationPeriod
     */
    public String getRotationPeriod() {
        return rotationPeriod;
    }

    public void setRotationPeriod(String rotationPeriod) {
        this.rotationPeriod = rotationPeriod;
    }

    public CreateSecretRequestBody withRotationConfig(String rotationConfig) {
        this.rotationConfig = rotationConfig;
        return this;
    }

    /**
     * 轮转配置  约束：范围不超过1024个字符。  当secret_type为RDS-FG、GaussDB-FG时，必须填写本参数，参数格式为{\"InstanceId\":\"\",\"SecretSubType\":\"\"}  参数说明：InstanceId为实例ID,SecretSubType为轮转子类型，取值为：SingleUser，MultiUser。  SingleUser：指定轮转类型为单用户模式轮转，每次轮转将指定账号重置为新的口令。  MultiUser：指定轮转类型为双用户模式轮转，SYSCURRENT和SYSPREVIOUS分别引用其中一个账号。凭据轮转时，SYSPREVIOUS引用的账号口令会被重置为新的随机口令，随后凭据交换SYSCURRENT和SYSPREVIOUS对账号的引用。
     * @return rotationConfig
     */
    public String getRotationConfig() {
        return rotationConfig;
    }

    public void setRotationConfig(String rotationConfig) {
        this.rotationConfig = rotationConfig;
    }

    public CreateSecretRequestBody withEventSubscriptions(List<String> eventSubscriptions) {
        this.eventSubscriptions = eventSubscriptions;
        return this;
    }

    public CreateSecretRequestBody addEventSubscriptionsItem(String eventSubscriptionsItem) {
        if (this.eventSubscriptions == null) {
            this.eventSubscriptions = new ArrayList<>();
        }
        this.eventSubscriptions.add(eventSubscriptionsItem);
        return this;
    }

    public CreateSecretRequestBody withEventSubscriptions(Consumer<List<String>> eventSubscriptionsSetter) {
        if (this.eventSubscriptions == null) {
            this.eventSubscriptions = new ArrayList<>();
        }
        eventSubscriptionsSetter.accept(this.eventSubscriptions);
        return this;
    }

    /**
     * 凭据订阅的事件列表，当前最大可订阅一个事件。当事件包含的基础事件触发时，通知消息将发送到事件对应的通知主题。
     * @return eventSubscriptions
     */
    public List<String> getEventSubscriptions() {
        return eventSubscriptions;
    }

    public void setEventSubscriptions(List<String> eventSubscriptions) {
        this.eventSubscriptions = eventSubscriptions;
    }

    public CreateSecretRequestBody withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 该参数针对企业用户使用。如果您是企业用户，且已创建企业项目，则请从下拉列表中为密钥选择需要绑定的企业项目，默认项目为“default”。 未开通企业管理的用户页面则没有“企业项目”参数项，无需进行配置。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CreateSecretRequestBody withRotationFuncUrn(String rotationFuncUrn) {
        this.rotationFuncUrn = rotationFuncUrn;
        return this;
    }

    /**
     * FunctionGraph函数的urn。
     * @return rotationFuncUrn
     */
    public String getRotationFuncUrn() {
        return rotationFuncUrn;
    }

    public void setRotationFuncUrn(String rotationFuncUrn) {
        this.rotationFuncUrn = rotationFuncUrn;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateSecretRequestBody that = (CreateSecretRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.kmsKeyId, that.kmsKeyId)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.secretBinary, that.secretBinary)
            && Objects.equals(this.secretString, that.secretString) && Objects.equals(this.secretType, that.secretType)
            && Objects.equals(this.autoRotation, that.autoRotation)
            && Objects.equals(this.rotationPeriod, that.rotationPeriod)
            && Objects.equals(this.rotationConfig, that.rotationConfig)
            && Objects.equals(this.eventSubscriptions, that.eventSubscriptions)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.rotationFuncUrn, that.rotationFuncUrn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            kmsKeyId,
            description,
            secretBinary,
            secretString,
            secretType,
            autoRotation,
            rotationPeriod,
            rotationConfig,
            eventSubscriptions,
            enterpriseProjectId,
            rotationFuncUrn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSecretRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    kmsKeyId: ").append(toIndentedString(kmsKeyId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    secretBinary: ").append(toIndentedString(secretBinary)).append("\n");
        sb.append("    secretString: ").append(toIndentedString(secretString)).append("\n");
        sb.append("    secretType: ").append(toIndentedString(secretType)).append("\n");
        sb.append("    autoRotation: ").append(toIndentedString(autoRotation)).append("\n");
        sb.append("    rotationPeriod: ").append(toIndentedString(rotationPeriod)).append("\n");
        sb.append("    rotationConfig: ").append(toIndentedString(rotationConfig)).append("\n");
        sb.append("    eventSubscriptions: ").append(toIndentedString(eventSubscriptions)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    rotationFuncUrn: ").append(toIndentedString(rotationFuncUrn)).append("\n");
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
