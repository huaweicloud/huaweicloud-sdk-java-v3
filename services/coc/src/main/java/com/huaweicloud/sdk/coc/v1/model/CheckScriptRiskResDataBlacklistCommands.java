package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CheckScriptRiskResDataBlacklistCommands
 */
public class CheckScriptRiskResDataBlacklistCommands {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command_name")

    private String commandName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command_rule")

    private String commandRule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "example")

    private String example;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description_en")

    private String descriptionEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description_zh")

    private String descriptionZh;

    public CheckScriptRiskResDataBlacklistCommands withCommandName(String commandName) {
        this.commandName = commandName;
        return this;
    }

    /**
     * 命令。
     * @return commandName
     */
    public String getCommandName() {
        return commandName;
    }

    public void setCommandName(String commandName) {
        this.commandName = commandName;
    }

    public CheckScriptRiskResDataBlacklistCommands withCommandRule(String commandRule) {
        this.commandRule = commandRule;
        return this;
    }

    /**
     * 匹配规则。
     * @return commandRule
     */
    public String getCommandRule() {
        return commandRule;
    }

    public void setCommandRule(String commandRule) {
        this.commandRule = commandRule;
    }

    public CheckScriptRiskResDataBlacklistCommands withExample(String example) {
        this.example = example;
        return this;
    }

    /**
     * 实例。
     * @return example
     */
    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }

    public CheckScriptRiskResDataBlacklistCommands withDescriptionEn(String descriptionEn) {
        this.descriptionEn = descriptionEn;
        return this;
    }

    /**
     * 黑名单命令中文描述。
     * @return descriptionEn
     */
    public String getDescriptionEn() {
        return descriptionEn;
    }

    public void setDescriptionEn(String descriptionEn) {
        this.descriptionEn = descriptionEn;
    }

    public CheckScriptRiskResDataBlacklistCommands withDescriptionZh(String descriptionZh) {
        this.descriptionZh = descriptionZh;
        return this;
    }

    /**
     * 黑名单命令英文描述。
     * @return descriptionZh
     */
    public String getDescriptionZh() {
        return descriptionZh;
    }

    public void setDescriptionZh(String descriptionZh) {
        this.descriptionZh = descriptionZh;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckScriptRiskResDataBlacklistCommands that = (CheckScriptRiskResDataBlacklistCommands) obj;
        return Objects.equals(this.commandName, that.commandName) && Objects.equals(this.commandRule, that.commandRule)
            && Objects.equals(this.example, that.example) && Objects.equals(this.descriptionEn, that.descriptionEn)
            && Objects.equals(this.descriptionZh, that.descriptionZh);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commandName, commandRule, example, descriptionEn, descriptionZh);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckScriptRiskResDataBlacklistCommands {\n");
        sb.append("    commandName: ").append(toIndentedString(commandName)).append("\n");
        sb.append("    commandRule: ").append(toIndentedString(commandRule)).append("\n");
        sb.append("    example: ").append(toIndentedString(example)).append("\n");
        sb.append("    descriptionEn: ").append(toIndentedString(descriptionEn)).append("\n");
        sb.append("    descriptionZh: ").append(toIndentedString(descriptionZh)).append("\n");
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
