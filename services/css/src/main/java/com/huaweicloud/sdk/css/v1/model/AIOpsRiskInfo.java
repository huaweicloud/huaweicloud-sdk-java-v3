package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AIOpsRiskInfo
 */
public class AIOpsRiskInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "riskType")

    private String riskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private String level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desc")

    private String desc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suggestion")

    private String suggestion;

    public AIOpsRiskInfo withRiskType(String riskType) {
        this.riskType = riskType;
        return this;
    }

    /**
     * 检测项介绍。
     * @return riskType
     */
    public String getRiskType() {
        return riskType;
    }

    public void setRiskType(String riskType) {
        this.riskType = riskType;
    }

    public AIOpsRiskInfo withLevel(String level) {
        this.level = level;
        return this;
    }

    /**
     * 风险等级。 - high - medium - suggestion
     * @return level
     */
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public AIOpsRiskInfo withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * 风险描述。
     * @return desc
     */
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public AIOpsRiskInfo withSuggestion(String suggestion) {
        this.suggestion = suggestion;
        return this;
    }

    /**
     * 风险建议。
     * @return suggestion
     */
    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AIOpsRiskInfo that = (AIOpsRiskInfo) obj;
        return Objects.equals(this.riskType, that.riskType) && Objects.equals(this.level, that.level)
            && Objects.equals(this.desc, that.desc) && Objects.equals(this.suggestion, that.suggestion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(riskType, level, desc, suggestion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AIOpsRiskInfo {\n");
        sb.append("    riskType: ").append(toIndentedString(riskType)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
        sb.append("    suggestion: ").append(toIndentedString(suggestion)).append("\n");
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
