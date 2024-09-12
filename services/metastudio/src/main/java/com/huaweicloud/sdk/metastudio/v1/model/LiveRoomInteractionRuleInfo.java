package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 直播使用互动规则配置信息
 */
public class LiveRoomInteractionRuleInfo {

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
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled_scenes")

    private List<String> enabledScenes = null;

    public LiveRoomInteractionRuleInfo withRuleIndex(String ruleIndex) {
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

    public LiveRoomInteractionRuleInfo withRuleName(String ruleName) {
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

    public LiveRoomInteractionRuleInfo withEnabled(Boolean enabled) {
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

    public LiveRoomInteractionRuleInfo withEventType(Integer eventType) {
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

    public LiveRoomInteractionRuleInfo withHitCondition(HitCondition hitCondition) {
        this.hitCondition = hitCondition;
        return this;
    }

    public LiveRoomInteractionRuleInfo withHitCondition(Consumer<HitCondition> hitConditionSetter) {
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

    public LiveRoomInteractionRuleInfo withTrigger(TriggerProcess trigger) {
        this.trigger = trigger;
        return this;
    }

    public LiveRoomInteractionRuleInfo withTrigger(Consumer<TriggerProcess> triggerSetter) {
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

    public LiveRoomInteractionRuleInfo withReviewConfig(ReviewConfig reviewConfig) {
        this.reviewConfig = reviewConfig;
        return this;
    }

    public LiveRoomInteractionRuleInfo withReviewConfig(Consumer<ReviewConfig> reviewConfigSetter) {
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

    public LiveRoomInteractionRuleInfo withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * **参数解释**： 互动规则库ID。从互动库导入时携带互动库ID。 **约束限制**： 不涉及。 **取值范围**： 字符长度1-64位。 **默认取值**： 不涉及。
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public LiveRoomInteractionRuleInfo withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * **参数解释**： 互动规则库名称。从互动库导入时携带互动库名称。 **约束限制**： 不涉及。 **取值范围**： 字符长度1-256位。 **默认取值**： 不涉及。
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public LiveRoomInteractionRuleInfo withEnabledScenes(List<String> enabledScenes) {
        this.enabledScenes = enabledScenes;
        return this;
    }

    public LiveRoomInteractionRuleInfo addEnabledScenesItem(String enabledScenesItem) {
        if (this.enabledScenes == null) {
            this.enabledScenes = new ArrayList<>();
        }
        this.enabledScenes.add(enabledScenesItem);
        return this;
    }

    public LiveRoomInteractionRuleInfo withEnabledScenes(Consumer<List<String>> enabledScenesSetter) {
        if (this.enabledScenes == null) {
            this.enabledScenes = new ArrayList<>();
        }
        enabledScenesSetter.accept(this.enabledScenes);
        return this;
    }

    /**
     * **参数解释**： 规则启用场景。启用部分场景时填写。如果不填写则适用所有场景。 **约束限制**： 不涉及。 **取值范围**： 对应直播间场景列表，最大100个场景，这边也对应100个。 条目填写场景名称，字符长度1-256。 **默认取值**： 不涉及。
     * @return enabledScenes
     */
    public List<String> getEnabledScenes() {
        return enabledScenes;
    }

    public void setEnabledScenes(List<String> enabledScenes) {
        this.enabledScenes = enabledScenes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LiveRoomInteractionRuleInfo that = (LiveRoomInteractionRuleInfo) obj;
        return Objects.equals(this.ruleIndex, that.ruleIndex) && Objects.equals(this.ruleName, that.ruleName)
            && Objects.equals(this.enabled, that.enabled) && Objects.equals(this.eventType, that.eventType)
            && Objects.equals(this.hitCondition, that.hitCondition) && Objects.equals(this.trigger, that.trigger)
            && Objects.equals(this.reviewConfig, that.reviewConfig) && Objects.equals(this.groupId, that.groupId)
            && Objects.equals(this.groupName, that.groupName) && Objects.equals(this.enabledScenes, that.enabledScenes);
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
            groupId,
            groupName,
            enabledScenes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LiveRoomInteractionRuleInfo {\n");
        sb.append("    ruleIndex: ").append(toIndentedString(ruleIndex)).append("\n");
        sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    hitCondition: ").append(toIndentedString(hitCondition)).append("\n");
        sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
        sb.append("    reviewConfig: ").append(toIndentedString(reviewConfig)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    enabledScenes: ").append(toIndentedString(enabledScenes)).append("\n");
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
