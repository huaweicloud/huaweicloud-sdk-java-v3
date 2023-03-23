package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowCcRuleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policyid")

    private String policyid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prefix")

    private Boolean prefix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private BigDecimal mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conditions")

    private List<CcCondition> conditions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private CcrulesListInfoAction action;

    /**
     * 限速模式：   - ip：IP限速，根据IP区分单个Web访问者。   - cookie：用户限速，根据Cookie键值区分单个Web访问者。   - header：用户限速，根据Header区分单个Web访问者。   - other：根据Referer（自定义请求访问的来源）字段区分单个Web访问者。   - policy: 策略限速   - domain: 域名限速     - url: url限速
     */
    public static final class TagTypeEnum {

        /**
         * Enum IP for value: "ip"
         */
        public static final TagTypeEnum IP = new TagTypeEnum("ip");

        /**
         * Enum COOKIE for value: "cookie"
         */
        public static final TagTypeEnum COOKIE = new TagTypeEnum("cookie");

        /**
         * Enum HEADER for value: "header"
         */
        public static final TagTypeEnum HEADER = new TagTypeEnum("header");

        /**
         * Enum OTHER for value: "other"
         */
        public static final TagTypeEnum OTHER = new TagTypeEnum("other");

        /**
         * Enum POLICY for value: "policy"
         */
        public static final TagTypeEnum POLICY = new TagTypeEnum("policy");

        /**
         * Enum DOMAIN for value: "domain"
         */
        public static final TagTypeEnum DOMAIN = new TagTypeEnum("domain");

        /**
         * Enum URL for value: "url"
         */
        public static final TagTypeEnum URL = new TagTypeEnum("url");

        private static final Map<String, TagTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TagTypeEnum> createStaticFields() {
            Map<String, TagTypeEnum> map = new HashMap<>();
            map.put("ip", IP);
            map.put("cookie", COOKIE);
            map.put("header", HEADER);
            map.put("other", OTHER);
            map.put("policy", POLICY);
            map.put("domain", DOMAIN);
            map.put("url", URL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TagTypeEnum(String value) {
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
        public static TagTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            TagTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TagTypeEnum(value);
            }
            return result;
        }

        public static TagTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TagTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TagTypeEnum) {
                return this.value.equals(((TagTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_type")

    private TagTypeEnum tagType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_index")

    private String tagIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_condition")

    private CcrulesListInfoTagCondition tagCondition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit_num")

    private Integer limitNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit_period")

    private Integer limitPeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unlock_num")

    private Integer unlockNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_time")

    private Integer lockTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_aggregation")

    private Boolean domainAggregation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_aggregation")

    private Boolean regionAggregation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_num")

    private Integer totalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unaggregation")

    private Boolean unaggregation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aging_time")

    private Integer agingTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "producer")

    private Integer producer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp")

    private Long timestamp;

    public ShowCcRuleResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Rule ID.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowCcRuleResponse withPolicyid(String policyid) {
        this.policyid = policyid;
        return this;
    }

    /**
     * Policy ID.
     * @return policyid
     */
    public String getPolicyid() {
        return policyid;
    }

    public void setPolicyid(String policyid) {
        this.policyid = policyid;
    }

    public ShowCcRuleResponse withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 当mode值为0时，该参数有返回值。规则应用的URL链接，不包含域名。
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ShowCcRuleResponse withPrefix(Boolean prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * 路径是否为前缀模式，当防护url以*结束，则为前缀模式。
     * @return prefix
     */
    public Boolean getPrefix() {
        return prefix;
    }

    public void setPrefix(Boolean prefix) {
        this.prefix = prefix;
    }

    public ShowCcRuleResponse withMode(BigDecimal mode) {
        this.mode = mode;
        return this;
    }

    /**
     * cc规则防护模式，对应console上的mode，现在只支持创建高级cc规则防护模式。   - 0：标准，只支持对域名的防护路径做限制。  - 1：高级，支持对路径、IP、Cookie、Header、Params字段做限制。
     * @return mode
     */
    public BigDecimal getMode() {
        return mode;
    }

    public void setMode(BigDecimal mode) {
        this.mode = mode;
    }

    public ShowCcRuleResponse withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 规则状态，0：关闭，1：开启
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public ShowCcRuleResponse withConditions(List<CcCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public ShowCcRuleResponse addConditionsItem(CcCondition conditionsItem) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        this.conditions.add(conditionsItem);
        return this;
    }

    public ShowCcRuleResponse withConditions(Consumer<List<CcCondition>> conditionsSetter) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        conditionsSetter.accept(this.conditions);
        return this;
    }

    /**
     * cc规则防护规则限速条件，当cc防护规则为高级模式（mode参数值为1）时，该参数必填。
     * @return conditions
     */
    public List<CcCondition> getConditions() {
        return conditions;
    }

    public void setConditions(List<CcCondition> conditions) {
        this.conditions = conditions;
    }

    public ShowCcRuleResponse withAction(CcrulesListInfoAction action) {
        this.action = action;
        return this;
    }

    public ShowCcRuleResponse withAction(Consumer<CcrulesListInfoAction> actionSetter) {
        if (this.action == null) {
            this.action = new CcrulesListInfoAction();
            actionSetter.accept(this.action);
        }

        return this;
    }

    /**
     * Get action
     * @return action
     */
    public CcrulesListInfoAction getAction() {
        return action;
    }

    public void setAction(CcrulesListInfoAction action) {
        this.action = action;
    }

    public ShowCcRuleResponse withTagType(TagTypeEnum tagType) {
        this.tagType = tagType;
        return this;
    }

    /**
     * 限速模式：   - ip：IP限速，根据IP区分单个Web访问者。   - cookie：用户限速，根据Cookie键值区分单个Web访问者。   - header：用户限速，根据Header区分单个Web访问者。   - other：根据Referer（自定义请求访问的来源）字段区分单个Web访问者。   - policy: 策略限速   - domain: 域名限速     - url: url限速
     * @return tagType
     */
    public TagTypeEnum getTagType() {
        return tagType;
    }

    public void setTagType(TagTypeEnum tagType) {
        this.tagType = tagType;
    }

    public ShowCcRuleResponse withTagIndex(String tagIndex) {
        this.tagIndex = tagIndex;
        return this;
    }

    /**
     * 用户标识，当限速模式为用户限速(cookie或header)时，需要传该参数。   - 选择cookie时，设置cookie字段名，即用户需要根据网站实际情况配置唯一可识别Web访问者的cookie中的某属性变量名。用户标识的cookie，不支持正则，必须完全匹配。例如：如果网站使用cookie中的某个字段name唯一标识用户，那么可以选取name字段来区分Web访问者。   - 选择header时，设置需要防护的自定义HTTP首部，即用户需要根据网站实际情况配置可识别Web访问者的HTTP首部。
     * @return tagIndex
     */
    public String getTagIndex() {
        return tagIndex;
    }

    public void setTagIndex(String tagIndex) {
        this.tagIndex = tagIndex;
    }

    public ShowCcRuleResponse withTagCondition(CcrulesListInfoTagCondition tagCondition) {
        this.tagCondition = tagCondition;
        return this;
    }

    public ShowCcRuleResponse withTagCondition(Consumer<CcrulesListInfoTagCondition> tagConditionSetter) {
        if (this.tagCondition == null) {
            this.tagCondition = new CcrulesListInfoTagCondition();
            tagConditionSetter.accept(this.tagCondition);
        }

        return this;
    }

    /**
     * Get tagCondition
     * @return tagCondition
     */
    public CcrulesListInfoTagCondition getTagCondition() {
        return tagCondition;
    }

    public void setTagCondition(CcrulesListInfoTagCondition tagCondition) {
        this.tagCondition = tagCondition;
    }

    public ShowCcRuleResponse withLimitNum(Integer limitNum) {
        this.limitNum = limitNum;
        return this;
    }

    /**
     * 限制频率，单位为次，范围为1~2147483647
     * @return limitNum
     */
    public Integer getLimitNum() {
        return limitNum;
    }

    public void setLimitNum(Integer limitNum) {
        this.limitNum = limitNum;
    }

    public ShowCcRuleResponse withLimitPeriod(Integer limitPeriod) {
        this.limitPeriod = limitPeriod;
        return this;
    }

    /**
     * 限速周期，单位为秒，范围1~3600
     * @return limitPeriod
     */
    public Integer getLimitPeriod() {
        return limitPeriod;
    }

    public void setLimitPeriod(Integer limitPeriod) {
        this.limitPeriod = limitPeriod;
    }

    public ShowCcRuleResponse withUnlockNum(Integer unlockNum) {
        this.unlockNum = unlockNum;
        return this;
    }

    /**
     * 放行频率，单位为次，范围为0~2147483647。只有当防护动作类型为dynamic_block时，才需要传该参数。
     * @return unlockNum
     */
    public Integer getUnlockNum() {
        return unlockNum;
    }

    public void setUnlockNum(Integer unlockNum) {
        this.unlockNum = unlockNum;
    }

    public ShowCcRuleResponse withLockTime(Integer lockTime) {
        this.lockTime = lockTime;
        return this;
    }

    /**
     * 阻断时间，单位为秒，范围为0~65535。当“防护动作”选择“阻断”时，可设置阻断后恢复正常访问页面的时间。
     * @return lockTime
     */
    public Integer getLockTime() {
        return lockTime;
    }

    public void setLockTime(Integer lockTime) {
        this.lockTime = lockTime;
    }

    public ShowCcRuleResponse withDomainAggregation(Boolean domainAggregation) {
        this.domainAggregation = domainAggregation;
        return this;
    }

    /**
     * 是否开启域名聚合统计。
     * @return domainAggregation
     */
    public Boolean getDomainAggregation() {
        return domainAggregation;
    }

    public void setDomainAggregation(Boolean domainAggregation) {
        this.domainAggregation = domainAggregation;
    }

    public ShowCcRuleResponse withRegionAggregation(Boolean regionAggregation) {
        this.regionAggregation = regionAggregation;
        return this;
    }

    /**
     * 是否开启全局计数。
     * @return regionAggregation
     */
    public Boolean getRegionAggregation() {
        return regionAggregation;
    }

    public void setRegionAggregation(Boolean regionAggregation) {
        this.regionAggregation = regionAggregation;
    }

    public ShowCcRuleResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 规则描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowCcRuleResponse withTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * 该参数为预留参数，用于后续功能扩展，当前请用户忽略该参数
     * @return totalNum
     */
    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public ShowCcRuleResponse withUnaggregation(Boolean unaggregation) {
        this.unaggregation = unaggregation;
        return this;
    }

    /**
     * 该参数为预留参数，用于后续功能扩展，当前请用户忽略该参数
     * @return unaggregation
     */
    public Boolean getUnaggregation() {
        return unaggregation;
    }

    public void setUnaggregation(Boolean unaggregation) {
        this.unaggregation = unaggregation;
    }

    public ShowCcRuleResponse withAgingTime(Integer agingTime) {
        this.agingTime = agingTime;
        return this;
    }

    /**
     * 规则老化时间，该参数为预留参数，用于后续功能扩展，当前请用户忽略该参数
     * @return agingTime
     */
    public Integer getAgingTime() {
        return agingTime;
    }

    public void setAgingTime(Integer agingTime) {
        this.agingTime = agingTime;
    }

    public ShowCcRuleResponse withProducer(Integer producer) {
        this.producer = producer;
        return this;
    }

    /**
     * 规则创建对象，该参数为预留参数，用于后续功能扩展，当前请用户忽略该参数
     * @return producer
     */
    public Integer getProducer() {
        return producer;
    }

    public void setProducer(Integer producer) {
        this.producer = producer;
    }

    public ShowCcRuleResponse withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * 创建规则时间戳
     * @return timestamp
     */
    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowCcRuleResponse showCcRuleResponse = (ShowCcRuleResponse) o;
        return Objects.equals(this.id, showCcRuleResponse.id)
            && Objects.equals(this.policyid, showCcRuleResponse.policyid)
            && Objects.equals(this.url, showCcRuleResponse.url)
            && Objects.equals(this.prefix, showCcRuleResponse.prefix)
            && Objects.equals(this.mode, showCcRuleResponse.mode)
            && Objects.equals(this.status, showCcRuleResponse.status)
            && Objects.equals(this.conditions, showCcRuleResponse.conditions)
            && Objects.equals(this.action, showCcRuleResponse.action)
            && Objects.equals(this.tagType, showCcRuleResponse.tagType)
            && Objects.equals(this.tagIndex, showCcRuleResponse.tagIndex)
            && Objects.equals(this.tagCondition, showCcRuleResponse.tagCondition)
            && Objects.equals(this.limitNum, showCcRuleResponse.limitNum)
            && Objects.equals(this.limitPeriod, showCcRuleResponse.limitPeriod)
            && Objects.equals(this.unlockNum, showCcRuleResponse.unlockNum)
            && Objects.equals(this.lockTime, showCcRuleResponse.lockTime)
            && Objects.equals(this.domainAggregation, showCcRuleResponse.domainAggregation)
            && Objects.equals(this.regionAggregation, showCcRuleResponse.regionAggregation)
            && Objects.equals(this.description, showCcRuleResponse.description)
            && Objects.equals(this.totalNum, showCcRuleResponse.totalNum)
            && Objects.equals(this.unaggregation, showCcRuleResponse.unaggregation)
            && Objects.equals(this.agingTime, showCcRuleResponse.agingTime)
            && Objects.equals(this.producer, showCcRuleResponse.producer)
            && Objects.equals(this.timestamp, showCcRuleResponse.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            policyid,
            url,
            prefix,
            mode,
            status,
            conditions,
            action,
            tagType,
            tagIndex,
            tagCondition,
            limitNum,
            limitPeriod,
            unlockNum,
            lockTime,
            domainAggregation,
            regionAggregation,
            description,
            totalNum,
            unaggregation,
            agingTime,
            producer,
            timestamp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCcRuleResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    policyid: ").append(toIndentedString(policyid)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    tagType: ").append(toIndentedString(tagType)).append("\n");
        sb.append("    tagIndex: ").append(toIndentedString(tagIndex)).append("\n");
        sb.append("    tagCondition: ").append(toIndentedString(tagCondition)).append("\n");
        sb.append("    limitNum: ").append(toIndentedString(limitNum)).append("\n");
        sb.append("    limitPeriod: ").append(toIndentedString(limitPeriod)).append("\n");
        sb.append("    unlockNum: ").append(toIndentedString(unlockNum)).append("\n");
        sb.append("    lockTime: ").append(toIndentedString(lockTime)).append("\n");
        sb.append("    domainAggregation: ").append(toIndentedString(domainAggregation)).append("\n");
        sb.append("    regionAggregation: ").append(toIndentedString(regionAggregation)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
        sb.append("    unaggregation: ").append(toIndentedString(unaggregation)).append("\n");
        sb.append("    agingTime: ").append(toIndentedString(agingTime)).append("\n");
        sb.append("    producer: ").append(toIndentedString(producer)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
