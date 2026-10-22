package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListBotMRulesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_id")

    private String policyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "known_bot_detection")

    private List<BotMRule> knownBotDetection = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transparent_detection")

    private List<BotMRule> transparentDetection = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "behavior_detection")

    private BotMBehaviorDetectionRule behaviorDetection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_detection_conditions")

    private List<TrafficDetectionConditionDTO> trafficDetectionConditions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interactive_detection")

    private List<BotMRule> interactiveDetection = null;

    public ListBotMRulesResponse withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * **参数解释：** 策略Id，关联BotM规则的防护策略唯一标识。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return policyId
     */
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public ListBotMRulesResponse withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * **参数解释：** 租户Id，当前BotM规则所属的租户唯一标识。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public ListBotMRulesResponse withKnownBotDetection(List<BotMRule> knownBotDetection) {
        this.knownBotDetection = knownBotDetection;
        return this;
    }

    public ListBotMRulesResponse addKnownBotDetectionItem(BotMRule knownBotDetectionItem) {
        if (this.knownBotDetection == null) {
            this.knownBotDetection = new ArrayList<>();
        }
        this.knownBotDetection.add(knownBotDetectionItem);
        return this;
    }

    public ListBotMRulesResponse withKnownBotDetection(Consumer<List<BotMRule>> knownBotDetectionSetter) {
        if (this.knownBotDetection == null) {
            this.knownBotDetection = new ArrayList<>();
        }
        knownBotDetectionSetter.accept(this.knownBotDetection);
        return this;
    }

    /**
     * **参数解释：** 已知Bot相关的所有规则，包含针对已知Bot的检测与防护规则。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return knownBotDetection
     */
    public List<BotMRule> getKnownBotDetection() {
        return knownBotDetection;
    }

    public void setKnownBotDetection(List<BotMRule> knownBotDetection) {
        this.knownBotDetection = knownBotDetection;
    }

    public ListBotMRulesResponse withTransparentDetection(List<BotMRule> transparentDetection) {
        this.transparentDetection = transparentDetection;
        return this;
    }

    public ListBotMRulesResponse addTransparentDetectionItem(BotMRule transparentDetectionItem) {
        if (this.transparentDetection == null) {
            this.transparentDetection = new ArrayList<>();
        }
        this.transparentDetection.add(transparentDetectionItem);
        return this;
    }

    public ListBotMRulesResponse withTransparentDetection(Consumer<List<BotMRule>> transparentDetectionSetter) {
        if (this.transparentDetection == null) {
            this.transparentDetection = new ArrayList<>();
        }
        transparentDetectionSetter.accept(this.transparentDetection);
        return this;
    }

    /**
     * **参数解释：** 透明检测相关的所有规则，包含无感知的Bot透明检测规则。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return transparentDetection
     */
    public List<BotMRule> getTransparentDetection() {
        return transparentDetection;
    }

    public void setTransparentDetection(List<BotMRule> transparentDetection) {
        this.transparentDetection = transparentDetection;
    }

    public ListBotMRulesResponse withBehaviorDetection(BotMBehaviorDetectionRule behaviorDetection) {
        this.behaviorDetection = behaviorDetection;
        return this;
    }

    public ListBotMRulesResponse withBehaviorDetection(Consumer<BotMBehaviorDetectionRule> behaviorDetectionSetter) {
        if (this.behaviorDetection == null) {
            this.behaviorDetection = new BotMBehaviorDetectionRule();
            behaviorDetectionSetter.accept(this.behaviorDetection);
        }

        return this;
    }

    /**
     * Get behaviorDetection
     * @return behaviorDetection
     */
    public BotMBehaviorDetectionRule getBehaviorDetection() {
        return behaviorDetection;
    }

    public void setBehaviorDetection(BotMBehaviorDetectionRule behaviorDetection) {
        this.behaviorDetection = behaviorDetection;
    }

    public ListBotMRulesResponse withTrafficDetectionConditions(
        List<TrafficDetectionConditionDTO> trafficDetectionConditions) {
        this.trafficDetectionConditions = trafficDetectionConditions;
        return this;
    }

    public ListBotMRulesResponse addTrafficDetectionConditionsItem(
        TrafficDetectionConditionDTO trafficDetectionConditionsItem) {
        if (this.trafficDetectionConditions == null) {
            this.trafficDetectionConditions = new ArrayList<>();
        }
        this.trafficDetectionConditions.add(trafficDetectionConditionsItem);
        return this;
    }

    public ListBotMRulesResponse withTrafficDetectionConditions(
        Consumer<List<TrafficDetectionConditionDTO>> trafficDetectionConditionsSetter) {
        if (this.trafficDetectionConditions == null) {
            this.trafficDetectionConditions = new ArrayList<>();
        }
        trafficDetectionConditionsSetter.accept(this.trafficDetectionConditions);
        return this;
    }

    /**
     * **参数解释：** 需要BOT检测的流量检测条件，定义触发Bot检测的流量筛选规则。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return trafficDetectionConditions
     */
    public List<TrafficDetectionConditionDTO> getTrafficDetectionConditions() {
        return trafficDetectionConditions;
    }

    public void setTrafficDetectionConditions(List<TrafficDetectionConditionDTO> trafficDetectionConditions) {
        this.trafficDetectionConditions = trafficDetectionConditions;
    }

    public ListBotMRulesResponse withInteractiveDetection(List<BotMRule> interactiveDetection) {
        this.interactiveDetection = interactiveDetection;
        return this;
    }

    public ListBotMRulesResponse addInteractiveDetectionItem(BotMRule interactiveDetectionItem) {
        if (this.interactiveDetection == null) {
            this.interactiveDetection = new ArrayList<>();
        }
        this.interactiveDetection.add(interactiveDetectionItem);
        return this;
    }

    public ListBotMRulesResponse withInteractiveDetection(Consumer<List<BotMRule>> interactiveDetectionSetter) {
        if (this.interactiveDetection == null) {
            this.interactiveDetection = new ArrayList<>();
        }
        interactiveDetectionSetter.accept(this.interactiveDetection);
        return this;
    }

    /**
     * **参数解释：** 主动特征检测规则列表，包含需要主动交互验证的Bot检测规则。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return interactiveDetection
     */
    public List<BotMRule> getInteractiveDetection() {
        return interactiveDetection;
    }

    public void setInteractiveDetection(List<BotMRule> interactiveDetection) {
        this.interactiveDetection = interactiveDetection;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListBotMRulesResponse that = (ListBotMRulesResponse) obj;
        return Objects.equals(this.policyId, that.policyId) && Objects.equals(this.tenantId, that.tenantId)
            && Objects.equals(this.knownBotDetection, that.knownBotDetection)
            && Objects.equals(this.transparentDetection, that.transparentDetection)
            && Objects.equals(this.behaviorDetection, that.behaviorDetection)
            && Objects.equals(this.trafficDetectionConditions, that.trafficDetectionConditions)
            && Objects.equals(this.interactiveDetection, that.interactiveDetection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyId,
            tenantId,
            knownBotDetection,
            transparentDetection,
            behaviorDetection,
            trafficDetectionConditions,
            interactiveDetection);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBotMRulesResponse {\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    knownBotDetection: ").append(toIndentedString(knownBotDetection)).append("\n");
        sb.append("    transparentDetection: ").append(toIndentedString(transparentDetection)).append("\n");
        sb.append("    behaviorDetection: ").append(toIndentedString(behaviorDetection)).append("\n");
        sb.append("    trafficDetectionConditions: ").append(toIndentedString(trafficDetectionConditions)).append("\n");
        sb.append("    interactiveDetection: ").append(toIndentedString(interactiveDetection)).append("\n");
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
