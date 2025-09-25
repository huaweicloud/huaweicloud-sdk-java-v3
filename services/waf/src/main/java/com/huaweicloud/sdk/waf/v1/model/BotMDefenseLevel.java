package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** BotM防护策略中的某一个防护等级，包含分数门限和对应防护动作 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
 */
public class BotMDefenseLevel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "threshold")

    private Integer threshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "defense_action")

    private Integer defenseAction;

    public BotMDefenseLevel withThreshold(Integer threshold) {
        this.threshold = threshold;
        return this;
    }

    /**
     * **参数解释：** 该防护等级对应的分数门限，触发当前防护等级的风险分数阈值 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return threshold
     */
    public Integer getThreshold() {
        return threshold;
    }

    public void setThreshold(Integer threshold) {
        this.threshold = threshold;
    }

    public BotMDefenseLevel withDefenseAction(Integer defenseAction) {
        this.defenseAction = defenseAction;
        return this;
    }

    /**
     * **参数解释：** 该防护等级对应的防护动作ID，如101表示拦截、102表示放行等 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return defenseAction
     */
    public Integer getDefenseAction() {
        return defenseAction;
    }

    public void setDefenseAction(Integer defenseAction) {
        this.defenseAction = defenseAction;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BotMDefenseLevel that = (BotMDefenseLevel) obj;
        return Objects.equals(this.threshold, that.threshold) && Objects.equals(this.defenseAction, that.defenseAction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(threshold, defenseAction);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BotMDefenseLevel {\n");
        sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
        sb.append("    defenseAction: ").append(toIndentedString(defenseAction)).append("\n");
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
