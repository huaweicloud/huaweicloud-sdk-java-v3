package com.huaweicloud.sdk.aad.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * FrequencyControlRule
 */
public class FrequencyControlRule {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "producer")

    private Integer producer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit_num")

    private String limitNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit_period")

    private String limitPeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_time")

    private String lockTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_type")

    private String tagType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_index")

    private String tagIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_condition")

    private TagCondition tagCondition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private ActionInfo action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private String mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conditions")

    private List<Condition> conditions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unlock_num")

    private Integer unlockNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_aggregation")

    private Boolean domainAggregation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_aggregation")

    private Boolean regionAggregation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "captcha_lock_time")

    private Integer captchaLockTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "grayscale_time")

    private Boolean grayscaleTime;

    public FrequencyControlRule withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FrequencyControlRule withProducer(Integer producer) {
        this.producer = producer;
        return this;
    }

    /**
     * 判断是否是智能cc生成的规则
     * @return producer
     */
    public Integer getProducer() {
        return producer;
    }

    public void setProducer(Integer producer) {
        this.producer = producer;
    }

    public FrequencyControlRule withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 规则名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FrequencyControlRule withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 规则应用的url
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public FrequencyControlRule withLimitNum(String limitNum) {
        this.limitNum = limitNum;
        return this;
    }

    /**
     * 限速频率，单位为次，范围为1~2147483647
     * @return limitNum
     */
    public String getLimitNum() {
        return limitNum;
    }

    public void setLimitNum(String limitNum) {
        this.limitNum = limitNum;
    }

    public FrequencyControlRule withLimitPeriod(String limitPeriod) {
        this.limitPeriod = limitPeriod;
        return this;
    }

    /**
     * 限速周期，单位为秒，范围1~3600
     * @return limitPeriod
     */
    public String getLimitPeriod() {
        return limitPeriod;
    }

    public void setLimitPeriod(String limitPeriod) {
        this.limitPeriod = limitPeriod;
    }

    public FrequencyControlRule withLockTime(String lockTime) {
        this.lockTime = lockTime;
        return this;
    }

    /**
     * 阻断时间，单位为秒，范围为0~65535
     * @return lockTime
     */
    public String getLockTime() {
        return lockTime;
    }

    public void setLockTime(String lockTime) {
        this.lockTime = lockTime;
    }

    public FrequencyControlRule withTagType(String tagType) {
        this.tagType = tagType;
        return this;
    }

    /**
     * 限速模式：ip、cookie、header、other、policy、domain、url。 源限速：ip：IP限速，根据IP区分单个Web访问者。cookie：用户限速，根据Cookie键值区分单个Web访问者。header：用户限速，根据Header区分单个Web访问者。other：根据Referer（自定义请求访问的来源）字段区分单个Web访问者。-目的限速：policy: 策略限速、domain: 域名限速、url: url限速
     * @return tagType
     */
    public String getTagType() {
        return tagType;
    }

    public void setTagType(String tagType) {
        this.tagType = tagType;
    }

    public FrequencyControlRule withTagIndex(String tagIndex) {
        this.tagIndex = tagIndex;
        return this;
    }

    /**
     * 用户标识，当限速模式为用户限速(cookie或header)时
     * @return tagIndex
     */
    public String getTagIndex() {
        return tagIndex;
    }

    public void setTagIndex(String tagIndex) {
        this.tagIndex = tagIndex;
    }

    public FrequencyControlRule withTagCondition(TagCondition tagCondition) {
        this.tagCondition = tagCondition;
        return this;
    }

    public FrequencyControlRule withTagCondition(Consumer<TagCondition> tagConditionSetter) {
        if (this.tagCondition == null) {
            this.tagCondition = new TagCondition();
            tagConditionSetter.accept(this.tagCondition);
        }

        return this;
    }

    /**
     * Get tagCondition
     * @return tagCondition
     */
    public TagCondition getTagCondition() {
        return tagCondition;
    }

    public void setTagCondition(TagCondition tagCondition) {
        this.tagCondition = tagCondition;
    }

    public FrequencyControlRule withAction(ActionInfo action) {
        this.action = action;
        return this;
    }

    public FrequencyControlRule withAction(Consumer<ActionInfo> actionSetter) {
        if (this.action == null) {
            this.action = new ActionInfo();
            actionSetter.accept(this.action);
        }

        return this;
    }

    /**
     * Get action
     * @return action
     */
    public ActionInfo getAction() {
        return action;
    }

    public void setAction(ActionInfo action) {
        this.action = action;
    }

    public FrequencyControlRule withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * cc规则防护模式，0：标准(老版本)，只支持对域名的防护路径做限制。1：高级(新版本)，支持对路径、IP、Cookie、Header、Params字段做限制。修改CC规则时必须传mode
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public FrequencyControlRule withConditions(List<Condition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public FrequencyControlRule addConditionsItem(Condition conditionsItem) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        this.conditions.add(conditionsItem);
        return this;
    }

    public FrequencyControlRule withConditions(Consumer<List<Condition>> conditionsSetter) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        conditionsSetter.accept(this.conditions);
        return this;
    }

    /**
     * cc规则防护规则限速条件
     * @return conditions
     */
    public List<Condition> getConditions() {
        return conditions;
    }

    public void setConditions(List<Condition> conditions) {
        this.conditions = conditions;
    }

    public FrequencyControlRule withUnlockNum(Integer unlockNum) {
        this.unlockNum = unlockNum;
        return this;
    }

    /**
     * 放行频率，单位为次，范围为0~2147483647
     * minimum: 0
     * maximum: 2147483647
     * @return unlockNum
     */
    public Integer getUnlockNum() {
        return unlockNum;
    }

    public void setUnlockNum(Integer unlockNum) {
        this.unlockNum = unlockNum;
    }

    public FrequencyControlRule withDomainAggregation(Boolean domainAggregation) {
        this.domainAggregation = domainAggregation;
        return this;
    }

    /**
     * 域名聚合统计
     * @return domainAggregation
     */
    public Boolean getDomainAggregation() {
        return domainAggregation;
    }

    public void setDomainAggregation(Boolean domainAggregation) {
        this.domainAggregation = domainAggregation;
    }

    public FrequencyControlRule withRegionAggregation(Boolean regionAggregation) {
        this.regionAggregation = regionAggregation;
        return this;
    }

    /**
     * 全局计数
     * @return regionAggregation
     */
    public Boolean getRegionAggregation() {
        return regionAggregation;
    }

    public void setRegionAggregation(Boolean regionAggregation) {
        this.regionAggregation = regionAggregation;
    }

    public FrequencyControlRule withCaptchaLockTime(Integer captchaLockTime) {
        this.captchaLockTime = captchaLockTime;
        return this;
    }

    /**
     * 锁定验证时间
     * minimum: 0
     * maximum: 3600
     * @return captchaLockTime
     */
    public Integer getCaptchaLockTime() {
        return captchaLockTime;
    }

    public void setCaptchaLockTime(Integer captchaLockTime) {
        this.captchaLockTime = captchaLockTime;
    }

    public FrequencyControlRule withGrayscaleTime(Boolean grayscaleTime) {
        this.grayscaleTime = grayscaleTime;
        return this;
    }

    /**
     * 是否灰度生效
     * @return grayscaleTime
     */
    public Boolean getGrayscaleTime() {
        return grayscaleTime;
    }

    public void setGrayscaleTime(Boolean grayscaleTime) {
        this.grayscaleTime = grayscaleTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FrequencyControlRule that = (FrequencyControlRule) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.producer, that.producer)
            && Objects.equals(this.name, that.name) && Objects.equals(this.url, that.url)
            && Objects.equals(this.limitNum, that.limitNum) && Objects.equals(this.limitPeriod, that.limitPeriod)
            && Objects.equals(this.lockTime, that.lockTime) && Objects.equals(this.tagType, that.tagType)
            && Objects.equals(this.tagIndex, that.tagIndex) && Objects.equals(this.tagCondition, that.tagCondition)
            && Objects.equals(this.action, that.action) && Objects.equals(this.mode, that.mode)
            && Objects.equals(this.conditions, that.conditions) && Objects.equals(this.unlockNum, that.unlockNum)
            && Objects.equals(this.domainAggregation, that.domainAggregation)
            && Objects.equals(this.regionAggregation, that.regionAggregation)
            && Objects.equals(this.captchaLockTime, that.captchaLockTime)
            && Objects.equals(this.grayscaleTime, that.grayscaleTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            producer,
            name,
            url,
            limitNum,
            limitPeriod,
            lockTime,
            tagType,
            tagIndex,
            tagCondition,
            action,
            mode,
            conditions,
            unlockNum,
            domainAggregation,
            regionAggregation,
            captchaLockTime,
            grayscaleTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FrequencyControlRule {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    producer: ").append(toIndentedString(producer)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    limitNum: ").append(toIndentedString(limitNum)).append("\n");
        sb.append("    limitPeriod: ").append(toIndentedString(limitPeriod)).append("\n");
        sb.append("    lockTime: ").append(toIndentedString(lockTime)).append("\n");
        sb.append("    tagType: ").append(toIndentedString(tagType)).append("\n");
        sb.append("    tagIndex: ").append(toIndentedString(tagIndex)).append("\n");
        sb.append("    tagCondition: ").append(toIndentedString(tagCondition)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
        sb.append("    unlockNum: ").append(toIndentedString(unlockNum)).append("\n");
        sb.append("    domainAggregation: ").append(toIndentedString(domainAggregation)).append("\n");
        sb.append("    regionAggregation: ").append(toIndentedString(regionAggregation)).append("\n");
        sb.append("    captchaLockTime: ").append(toIndentedString(captchaLockTime)).append("\n");
        sb.append("    grayscaleTime: ").append(toIndentedString(grayscaleTime)).append("\n");
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
