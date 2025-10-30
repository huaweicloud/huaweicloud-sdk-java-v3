package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 堆栈取证信息 **取值范围**： 不涉及
 */
public class EventForensicInfoStackForensic {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack_input_value")

    private String attackInputValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_stack")

    private String appStack;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chk_probe")

    private Integer chkProbe;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chk_rule")

    private Integer chkRule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_name")

    private Integer pluginName;

    public EventForensicInfoStackForensic withAttackInputValue(String attackInputValue) {
        this.attackInputValue = attackInputValue;
        return this;
    }

    /**
     * **参数解释**： 攻击载荷 **取值范围**： 不涉及
     * @return attackInputValue
     */
    public String getAttackInputValue() {
        return attackInputValue;
    }

    public void setAttackInputValue(String attackInputValue) {
        this.attackInputValue = attackInputValue;
    }

    public EventForensicInfoStackForensic withAppStack(String appStack) {
        this.appStack = appStack;
        return this;
    }

    /**
     * **参数解释**： 堆栈信息 **取值范围**： 不涉及
     * @return appStack
     */
    public String getAppStack() {
        return appStack;
    }

    public void setAppStack(String appStack) {
        this.appStack = appStack;
    }

    public EventForensicInfoStackForensic withChkProbe(Integer chkProbe) {
        this.chkProbe = chkProbe;
        return this;
    }

    /**
     * **参数解释**： 攻击探针 **取值范围**： 不涉及
     * @return chkProbe
     */
    public Integer getChkProbe() {
        return chkProbe;
    }

    public void setChkProbe(Integer chkProbe) {
        this.chkProbe = chkProbe;
    }

    public EventForensicInfoStackForensic withChkRule(Integer chkRule) {
        this.chkRule = chkRule;
        return this;
    }

    /**
     * **参数解释**： 特性规则 **取值范围**： 不涉及
     * @return chkRule
     */
    public Integer getChkRule() {
        return chkRule;
    }

    public void setChkRule(Integer chkRule) {
        this.chkRule = chkRule;
    }

    public EventForensicInfoStackForensic withPluginName(Integer pluginName) {
        this.pluginName = pluginName;
        return this;
    }

    /**
     * **参数解释**： 检测规则 **取值范围**： 不涉及
     * @return pluginName
     */
    public Integer getPluginName() {
        return pluginName;
    }

    public void setPluginName(Integer pluginName) {
        this.pluginName = pluginName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EventForensicInfoStackForensic that = (EventForensicInfoStackForensic) obj;
        return Objects.equals(this.attackInputValue, that.attackInputValue)
            && Objects.equals(this.appStack, that.appStack) && Objects.equals(this.chkProbe, that.chkProbe)
            && Objects.equals(this.chkRule, that.chkRule) && Objects.equals(this.pluginName, that.pluginName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attackInputValue, appStack, chkProbe, chkRule, pluginName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventForensicInfoStackForensic {\n");
        sb.append("    attackInputValue: ").append(toIndentedString(attackInputValue)).append("\n");
        sb.append("    appStack: ").append(toIndentedString(appStack)).append("\n");
        sb.append("    chkProbe: ").append(toIndentedString(chkProbe)).append("\n");
        sb.append("    chkRule: ").append(toIndentedString(chkRule)).append("\n");
        sb.append("    pluginName: ").append(toIndentedString(pluginName)).append("\n");
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
