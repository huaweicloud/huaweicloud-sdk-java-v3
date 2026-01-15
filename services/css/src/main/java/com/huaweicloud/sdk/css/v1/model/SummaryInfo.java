package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SummaryInfo
 */
public class SummaryInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "highRisk")

    private Integer highRisk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mediumRisk")

    private Integer mediumRisk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "normal")

    private Integer normal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suggestion")

    private Integer suggestion;

    public SummaryInfo withHighRisk(Integer highRisk) {
        this.highRisk = highRisk;
        return this;
    }

    /**
     * **参数解释**： 集群风险概要。 **取值范围**： 不涉及
     * @return highRisk
     */
    public Integer getHighRisk() {
        return highRisk;
    }

    public void setHighRisk(Integer highRisk) {
        this.highRisk = highRisk;
    }

    public SummaryInfo withMediumRisk(Integer mediumRisk) {
        this.mediumRisk = mediumRisk;
        return this;
    }

    /**
     * **参数解释**： 集群风险检测项判定为中风险的数量。 **取值范围**： 0-100
     * @return mediumRisk
     */
    public Integer getMediumRisk() {
        return mediumRisk;
    }

    public void setMediumRisk(Integer mediumRisk) {
        this.mediumRisk = mediumRisk;
    }

    public SummaryInfo withNormal(Integer normal) {
        this.normal = normal;
        return this;
    }

    /**
     * **参数解释： 集群风险检测项判定为正常项的数量。 **取值范围**： 0-100
     * @return normal
     */
    public Integer getNormal() {
        return normal;
    }

    public void setNormal(Integer normal) {
        this.normal = normal;
    }

    public SummaryInfo withSuggestion(Integer suggestion) {
        this.suggestion = suggestion;
        return this;
    }

    /**
     * **参数解释**： 集群风险检测项判定为提示项的数量。 **取值范围**： 0-100
     * @return suggestion
     */
    public Integer getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(Integer suggestion) {
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
        SummaryInfo that = (SummaryInfo) obj;
        return Objects.equals(this.highRisk, that.highRisk) && Objects.equals(this.mediumRisk, that.mediumRisk)
            && Objects.equals(this.normal, that.normal) && Objects.equals(this.suggestion, that.suggestion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(highRisk, mediumRisk, normal, suggestion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SummaryInfo {\n");
        sb.append("    highRisk: ").append(toIndentedString(highRisk)).append("\n");
        sb.append("    mediumRisk: ").append(toIndentedString(mediumRisk)).append("\n");
        sb.append("    normal: ").append(toIndentedString(normal)).append("\n");
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
