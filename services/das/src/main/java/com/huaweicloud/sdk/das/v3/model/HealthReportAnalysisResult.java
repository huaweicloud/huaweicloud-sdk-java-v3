package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * HealthReportAnalysisResult
 */
public class HealthReportAnalysisResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_code")

    private String riskCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_level")

    private String riskLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_content")

    private String riskContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reasons")

    private List<HealthReportRiskReason> reasons = null;

    public HealthReportAnalysisResult withRiskCode(String riskCode) {
        this.riskCode = riskCode;
        return this;
    }

    /**
     * 风险点编码。
     * @return riskCode
     */
    public String getRiskCode() {
        return riskCode;
    }

    public void setRiskCode(String riskCode) {
        this.riskCode = riskCode;
    }

    public HealthReportAnalysisResult withRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }

    /**
     * 风险点级别。
     * @return riskLevel
     */
    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    public HealthReportAnalysisResult withRiskContent(String riskContent) {
        this.riskContent = riskContent;
        return this;
    }

    /**
     * 风险点内容。
     * @return riskContent
     */
    public String getRiskContent() {
        return riskContent;
    }

    public void setRiskContent(String riskContent) {
        this.riskContent = riskContent;
    }

    public HealthReportAnalysisResult withReasons(List<HealthReportRiskReason> reasons) {
        this.reasons = reasons;
        return this;
    }

    public HealthReportAnalysisResult addReasonsItem(HealthReportRiskReason reasonsItem) {
        if (this.reasons == null) {
            this.reasons = new ArrayList<>();
        }
        this.reasons.add(reasonsItem);
        return this;
    }

    public HealthReportAnalysisResult withReasons(Consumer<List<HealthReportRiskReason>> reasonsSetter) {
        if (this.reasons == null) {
            this.reasons = new ArrayList<>();
        }
        reasonsSetter.accept(this.reasons);
        return this;
    }

    /**
     * 可能原因列表。
     * @return reasons
     */
    public List<HealthReportRiskReason> getReasons() {
        return reasons;
    }

    public void setReasons(List<HealthReportRiskReason> reasons) {
        this.reasons = reasons;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HealthReportAnalysisResult that = (HealthReportAnalysisResult) obj;
        return Objects.equals(this.riskCode, that.riskCode) && Objects.equals(this.riskLevel, that.riskLevel)
            && Objects.equals(this.riskContent, that.riskContent) && Objects.equals(this.reasons, that.reasons);
    }

    @Override
    public int hashCode() {
        return Objects.hash(riskCode, riskLevel, riskContent, reasons);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HealthReportAnalysisResult {\n");
        sb.append("    riskCode: ").append(toIndentedString(riskCode)).append("\n");
        sb.append("    riskLevel: ").append(toIndentedString(riskLevel)).append("\n");
        sb.append("    riskContent: ").append(toIndentedString(riskContent)).append("\n");
        sb.append("    reasons: ").append(toIndentedString(reasons)).append("\n");
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
