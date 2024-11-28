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
 * 凭据对象。
 */
public class Secret {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kms_key_id")

    private String kmsKeyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scheduled_delete_time")

    private Long scheduledDeleteTime;

    /**
     * 凭据类型  - COMMON：通用凭据(默认)。用于应用系统中的各种敏感信息储存。 - RDS：RDS凭据 。专门针对RDS的凭据，用于存储RDS的账号信息。（已不支持，使用RDS-FG替代） - RDS-FG：RDS凭据 。专门针对RDS的凭据，用于存储RDS的账号信息。 - GaussDB-FG：GaussDB凭据。专门针对GaussDB的凭据，用于存储GaussDB的账号信息。
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
    @JsonProperty(value = "rotation_time")

    private Long rotationTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_rotation_time")

    private Long nextRotationTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_subscriptions")

    private List<String> eventSubscriptions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rotation_func_urn")

    private String rotationFuncUrn;

    public Secret withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 凭据的资源标识符。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Secret withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 凭据名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Secret withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 凭据状态，取值如下：  ENABLED：表示启用状态  DISABLED：表示禁用状态  PENDING_DELETE：表示待删除状态  FROZEN：表示冻结状态
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Secret withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * 用于加密凭据值的KMS主密钥的ID值。
     * @return kmsKeyId
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    public Secret withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 凭据的描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Secret withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 凭据创建时间，时间戳，即从1970年1月1日至该时间的总秒数。
     * minimum: 0
     * maximum: 13
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Secret withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 凭据上次更新时间，时间戳，即从1970年1月1日至该时间的总秒数。
     * minimum: 0
     * maximum: 13
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public Secret withScheduledDeleteTime(Long scheduledDeleteTime) {
        this.scheduledDeleteTime = scheduledDeleteTime;
        return this;
    }

    /**
     * 凭据计划删除时间，时间戳，即从1970年1月1日至该时间的总秒数。  凭据不在删除计划中时，本项值为null。
     * minimum: 0
     * maximum: 13
     * @return scheduledDeleteTime
     */
    public Long getScheduledDeleteTime() {
        return scheduledDeleteTime;
    }

    public void setScheduledDeleteTime(Long scheduledDeleteTime) {
        this.scheduledDeleteTime = scheduledDeleteTime;
    }

    public Secret withSecretType(SecretTypeEnum secretType) {
        this.secretType = secretType;
        return this;
    }

    /**
     * 凭据类型  - COMMON：通用凭据(默认)。用于应用系统中的各种敏感信息储存。 - RDS：RDS凭据 。专门针对RDS的凭据，用于存储RDS的账号信息。（已不支持，使用RDS-FG替代） - RDS-FG：RDS凭据 。专门针对RDS的凭据，用于存储RDS的账号信息。 - GaussDB-FG：GaussDB凭据。专门针对GaussDB的凭据，用于存储GaussDB的账号信息。
     * @return secretType
     */
    public SecretTypeEnum getSecretType() {
        return secretType;
    }

    public void setSecretType(SecretTypeEnum secretType) {
        this.secretType = secretType;
    }

    public Secret withAutoRotation(Boolean autoRotation) {
        this.autoRotation = autoRotation;
        return this;
    }

    /**
     * 自动轮转  取值：true 开启, false 关闭(默认)
     * @return autoRotation
     */
    public Boolean getAutoRotation() {
        return autoRotation;
    }

    public void setAutoRotation(Boolean autoRotation) {
        this.autoRotation = autoRotation;
    }

    public Secret withRotationPeriod(String rotationPeriod) {
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

    public Secret withRotationConfig(String rotationConfig) {
        this.rotationConfig = rotationConfig;
        return this;
    }

    /**
     * 轮转配置  约束：范围不超过1024个字符。  当secret_type为RDS-FG、GaussDB-FG时，配置为{\"InstanceId\":\"\",\"SecretSubType\":\"\"}  说明：当secret_type为RDS-FG、GaussDB-FG时，必须填写该值  InstanceId为实例ID,SecretSubType为轮转子类型，取值为：SingleUser，MultiUser。  SingleUser：指定轮转类型为单用户模式轮转，每次轮转将指定账号重置为新的口令。  MultiUser：指定轮转类型为双用户模式轮转，SYSCURRENT和SYSPREVIOUS分别引用其中一个账号。凭据轮转时，SYSPREVIOUS引用的账号口令会被重置为新的随机口令，随后凭据交换SYSCURRENT和SYSPREVIOUS对账号的引用。
     * @return rotationConfig
     */
    public String getRotationConfig() {
        return rotationConfig;
    }

    public void setRotationConfig(String rotationConfig) {
        this.rotationConfig = rotationConfig;
    }

    public Secret withRotationTime(Long rotationTime) {
        this.rotationTime = rotationTime;
        return this;
    }

    /**
     * 轮转时间戳
     * minimum: 0
     * maximum: 13
     * @return rotationTime
     */
    public Long getRotationTime() {
        return rotationTime;
    }

    public void setRotationTime(Long rotationTime) {
        this.rotationTime = rotationTime;
    }

    public Secret withNextRotationTime(Long nextRotationTime) {
        this.nextRotationTime = nextRotationTime;
        return this;
    }

    /**
     * 下一次轮转时间戳
     * minimum: 0
     * maximum: 13
     * @return nextRotationTime
     */
    public Long getNextRotationTime() {
        return nextRotationTime;
    }

    public void setNextRotationTime(Long nextRotationTime) {
        this.nextRotationTime = nextRotationTime;
    }

    public Secret withEventSubscriptions(List<String> eventSubscriptions) {
        this.eventSubscriptions = eventSubscriptions;
        return this;
    }

    public Secret addEventSubscriptionsItem(String eventSubscriptionsItem) {
        if (this.eventSubscriptions == null) {
            this.eventSubscriptions = new ArrayList<>();
        }
        this.eventSubscriptions.add(eventSubscriptionsItem);
        return this;
    }

    public Secret withEventSubscriptions(Consumer<List<String>> eventSubscriptionsSetter) {
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

    public Secret withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public Secret withRotationFuncUrn(String rotationFuncUrn) {
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
        Secret that = (Secret) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.state, that.state) && Objects.equals(this.kmsKeyId, that.kmsKeyId)
            && Objects.equals(this.description, that.description) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.scheduledDeleteTime, that.scheduledDeleteTime)
            && Objects.equals(this.secretType, that.secretType) && Objects.equals(this.autoRotation, that.autoRotation)
            && Objects.equals(this.rotationPeriod, that.rotationPeriod)
            && Objects.equals(this.rotationConfig, that.rotationConfig)
            && Objects.equals(this.rotationTime, that.rotationTime)
            && Objects.equals(this.nextRotationTime, that.nextRotationTime)
            && Objects.equals(this.eventSubscriptions, that.eventSubscriptions)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.rotationFuncUrn, that.rotationFuncUrn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            state,
            kmsKeyId,
            description,
            createTime,
            updateTime,
            scheduledDeleteTime,
            secretType,
            autoRotation,
            rotationPeriod,
            rotationConfig,
            rotationTime,
            nextRotationTime,
            eventSubscriptions,
            enterpriseProjectId,
            rotationFuncUrn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Secret {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    kmsKeyId: ").append(toIndentedString(kmsKeyId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    scheduledDeleteTime: ").append(toIndentedString(scheduledDeleteTime)).append("\n");
        sb.append("    secretType: ").append(toIndentedString(secretType)).append("\n");
        sb.append("    autoRotation: ").append(toIndentedString(autoRotation)).append("\n");
        sb.append("    rotationPeriod: ").append(toIndentedString(rotationPeriod)).append("\n");
        sb.append("    rotationConfig: ").append(toIndentedString(rotationConfig)).append("\n");
        sb.append("    rotationTime: ").append(toIndentedString(rotationTime)).append("\n");
        sb.append("    nextRotationTime: ").append(toIndentedString(nextRotationTime)).append("\n");
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
