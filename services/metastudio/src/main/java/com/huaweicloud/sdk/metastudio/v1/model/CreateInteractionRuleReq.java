package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 单条互动规则增加请求
 */
public class CreateInteractionRuleReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_name")

    private String ruleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_type")

    private Integer eventType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hit_condition")

    private HitCondition hitCondition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger")

    private TriggerProcess trigger;

    public CreateInteractionRuleReq withRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * 规则名称
     * @return ruleName
     */
    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public CreateInteractionRuleReq withEventType(Integer eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * 事件类型。 * 1：弹幕事件 * 2：用户入场事件 * 3：用户点赞事件 * 4：用户送礼事件 * 10: 预置话术事件
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

    public CreateInteractionRuleReq withHitCondition(HitCondition hitCondition) {
        this.hitCondition = hitCondition;
        return this;
    }

    public CreateInteractionRuleReq withHitCondition(Consumer<HitCondition> hitConditionSetter) {
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

    public CreateInteractionRuleReq withTrigger(TriggerProcess trigger) {
        this.trigger = trigger;
        return this;
    }

    public CreateInteractionRuleReq withTrigger(Consumer<TriggerProcess> triggerSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateInteractionRuleReq that = (CreateInteractionRuleReq) obj;
        return Objects.equals(this.ruleName, that.ruleName) && Objects.equals(this.eventType, that.eventType)
            && Objects.equals(this.hitCondition, that.hitCondition) && Objects.equals(this.trigger, that.trigger);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleName, eventType, hitCondition, trigger);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateInteractionRuleReq {\n");
        sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    hitCondition: ").append(toIndentedString(hitCondition)).append("\n");
        sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
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
