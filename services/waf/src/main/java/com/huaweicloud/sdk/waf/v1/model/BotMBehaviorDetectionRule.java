package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** BotM行为检测规则包含的信息，关联行为检测的基础规则与防护策略。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
 */
public class BotMBehaviorDetectionRule {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule")

    private BotMRule rule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "strategy")

    private BotMDefenseStrategy strategy;

    public BotMBehaviorDetectionRule withRule(BotMRule rule) {
        this.rule = rule;
        return this;
    }

    public BotMBehaviorDetectionRule withRule(Consumer<BotMRule> ruleSetter) {
        if (this.rule == null) {
            this.rule = new BotMRule();
            ruleSetter.accept(this.rule);
        }

        return this;
    }

    /**
     * Get rule
     * @return rule
     */
    public BotMRule getRule() {
        return rule;
    }

    public void setRule(BotMRule rule) {
        this.rule = rule;
    }

    public BotMBehaviorDetectionRule withStrategy(BotMDefenseStrategy strategy) {
        this.strategy = strategy;
        return this;
    }

    public BotMBehaviorDetectionRule withStrategy(Consumer<BotMDefenseStrategy> strategySetter) {
        if (this.strategy == null) {
            this.strategy = new BotMDefenseStrategy();
            strategySetter.accept(this.strategy);
        }

        return this;
    }

    /**
     * Get strategy
     * @return strategy
     */
    public BotMDefenseStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(BotMDefenseStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BotMBehaviorDetectionRule that = (BotMBehaviorDetectionRule) obj;
        return Objects.equals(this.rule, that.rule) && Objects.equals(this.strategy, that.strategy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rule, strategy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BotMBehaviorDetectionRule {\n");
        sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
        sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
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
