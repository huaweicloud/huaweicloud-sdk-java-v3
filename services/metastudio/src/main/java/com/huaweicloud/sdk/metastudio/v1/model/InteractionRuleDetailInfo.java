package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * InteractionRuleDetailInfo
 */
public class InteractionRuleDetailInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_index")

    private String ruleIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_name")

    private String ruleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_type")

    private Integer eventType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hit_condition")

    private HitCondition hitCondition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger")

    private TriggerProcess trigger;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "review_config")

    private ReviewConfig reviewConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_id")

    private String ruleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    public InteractionRuleDetailInfo withRuleIndex(String ruleIndex) {
        this.ruleIndex = ruleIndex;
        return this;
    }

    /**
     * **参数解释**： 规则索引。用于触发规则时索引具体规则。 **约束限制**： 无需用户填写。 **取值范围**： 字符0-64位 **默认取值**： 不涉及。
     * @return ruleIndex
     */
    public String getRuleIndex() {
        return ruleIndex;
    }

    public void setRuleIndex(String ruleIndex) {
        this.ruleIndex = ruleIndex;
    }

    public InteractionRuleDetailInfo withRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * **参数解释**： 规则名称。 **约束限制**： 不涉及。 **取值范围**： 字符0-256位 **默认取值**： 不涉及。
     * @return ruleName
     */
    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public InteractionRuleDetailInfo withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * **参数解释**： 是否启用。 **约束限制**： 不涉及。 **取值范围**： * true：启用 * fasle：不启用  **默认取值**： true
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public InteractionRuleDetailInfo withEventType(Integer eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * **参数解释**： 规则匹配直播事件类型。接口的取值范围[0,100]，实际业务取值如下所示： * 1：弹幕事件  * 2：用户入场事件  * 3：用户点赞事件 * 4：用户送礼事件  * 10: 预置话术事件  请以实际业务取值为准。 > * 1,2,3,4：与LiveEventReport中的event.type对应。 > * 10：匹配预置剧本  **约束限制**： 不涉及。 **默认取值**： 不涉及
     * minimum: 0
     * maximum: 100
     * @return eventType
     */
    public Integer getEventType() {
        return eventType;
    }

    public void setEventType(Integer eventType) {
        this.eventType = eventType;
    }

    public InteractionRuleDetailInfo withHitCondition(HitCondition hitCondition) {
        this.hitCondition = hitCondition;
        return this;
    }

    public InteractionRuleDetailInfo withHitCondition(Consumer<HitCondition> hitConditionSetter) {
        if (this.hitCondition == null) {
            this.hitCondition = new HitCondition();
            hitConditionSetter.accept(this.hitCondition);
        }

        return this;
    }

    /**
     * Get hitCondition
     * @return hitCondition
     */
    public HitCondition getHitCondition() {
        return hitCondition;
    }

    public void setHitCondition(HitCondition hitCondition) {
        this.hitCondition = hitCondition;
    }

    public InteractionRuleDetailInfo withTrigger(TriggerProcess trigger) {
        this.trigger = trigger;
        return this;
    }

    public InteractionRuleDetailInfo withTrigger(Consumer<TriggerProcess> triggerSetter) {
        if (this.trigger == null) {
            this.trigger = new TriggerProcess();
            triggerSetter.accept(this.trigger);
        }

        return this;
    }

    /**
     * Get trigger
     * @return trigger
     */
    public TriggerProcess getTrigger() {
        return trigger;
    }

    public void setTrigger(TriggerProcess trigger) {
        this.trigger = trigger;
    }

    public InteractionRuleDetailInfo withReviewConfig(ReviewConfig reviewConfig) {
        this.reviewConfig = reviewConfig;
        return this;
    }

    public InteractionRuleDetailInfo withReviewConfig(Consumer<ReviewConfig> reviewConfigSetter) {
        if (this.reviewConfig == null) {
            this.reviewConfig = new ReviewConfig();
            reviewConfigSetter.accept(this.reviewConfig);
        }

        return this;
    }

    /**
     * Get reviewConfig
     * @return reviewConfig
     */
    public ReviewConfig getReviewConfig() {
        return reviewConfig;
    }

    public void setReviewConfig(ReviewConfig reviewConfig) {
        this.reviewConfig = reviewConfig;
    }

    public InteractionRuleDetailInfo withRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /**
     * 互动规则ID
     * @return ruleId
     */
    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public InteractionRuleDetailInfo withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间，格式遵循：RFC 3339 如“2021-01-10T08:43:17Z”。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public InteractionRuleDetailInfo withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间，格式遵循：RFC 3339 如“2021-01-10T08:43:17Z”。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InteractionRuleDetailInfo that = (InteractionRuleDetailInfo) obj;
        return Objects.equals(this.ruleIndex, that.ruleIndex) && Objects.equals(this.ruleName, that.ruleName)
            && Objects.equals(this.enabled, that.enabled) && Objects.equals(this.eventType, that.eventType)
            && Objects.equals(this.hitCondition, that.hitCondition) && Objects.equals(this.trigger, that.trigger)
            && Objects.equals(this.reviewConfig, that.reviewConfig) && Objects.equals(this.ruleId, that.ruleId)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleIndex,
            ruleName,
            enabled,
            eventType,
            hitCondition,
            trigger,
            reviewConfig,
            ruleId,
            createTime,
            updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InteractionRuleDetailInfo {\n");
        sb.append("    ruleIndex: ").append(toIndentedString(ruleIndex)).append("\n");
        sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    hitCondition: ").append(toIndentedString(hitCondition)).append("\n");
        sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
        sb.append("    reviewConfig: ").append(toIndentedString(reviewConfig)).append("\n");
        sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
