package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 返回数据。
 */
public class CheckScriptRiskResData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_level")

    private String riskLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blacklist_commands")

    private List<CheckScriptRiskResDataBlacklistCommands> blacklistCommands = null;

    public CheckScriptRiskResData withRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }

    /**
     * 风险等级。
     * @return riskLevel
     */
    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    public CheckScriptRiskResData withBlacklistCommands(
        List<CheckScriptRiskResDataBlacklistCommands> blacklistCommands) {
        this.blacklistCommands = blacklistCommands;
        return this;
    }

    public CheckScriptRiskResData addBlacklistCommandsItem(
        CheckScriptRiskResDataBlacklistCommands blacklistCommandsItem) {
        if (this.blacklistCommands == null) {
            this.blacklistCommands = new ArrayList<>();
        }
        this.blacklistCommands.add(blacklistCommandsItem);
        return this;
    }

    public CheckScriptRiskResData withBlacklistCommands(
        Consumer<List<CheckScriptRiskResDataBlacklistCommands>> blacklistCommandsSetter) {
        if (this.blacklistCommands == null) {
            this.blacklistCommands = new ArrayList<>();
        }
        blacklistCommandsSetter.accept(this.blacklistCommands);
        return this;
    }

    /**
     * 黑名单列表。
     * @return blacklistCommands
     */
    public List<CheckScriptRiskResDataBlacklistCommands> getBlacklistCommands() {
        return blacklistCommands;
    }

    public void setBlacklistCommands(List<CheckScriptRiskResDataBlacklistCommands> blacklistCommands) {
        this.blacklistCommands = blacklistCommands;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckScriptRiskResData that = (CheckScriptRiskResData) obj;
        return Objects.equals(this.riskLevel, that.riskLevel)
            && Objects.equals(this.blacklistCommands, that.blacklistCommands);
    }

    @Override
    public int hashCode() {
        return Objects.hash(riskLevel, blacklistCommands);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckScriptRiskResData {\n");
        sb.append("    riskLevel: ").append(toIndentedString(riskLevel)).append("\n");
        sb.append("    blacklistCommands: ").append(toIndentedString(blacklistCommands)).append("\n");
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
