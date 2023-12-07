package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowProjectDataDashboardResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "defect")

    private DefectVo defect;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_pass_rate")

    private CasePassRateVo casePassRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_completion_rate")

    private CaseCompletionRateVo caseCompletionRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_type")

    private String projectType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_cover_rate")

    private IssueCoverRateVo issueCoverRate;

    public ShowProjectDataDashboardResponse withDefect(DefectVo defect) {
        this.defect = defect;
        return this;
    }

    public ShowProjectDataDashboardResponse withDefect(Consumer<DefectVo> defectSetter) {
        if (this.defect == null) {
            this.defect = new DefectVo();
            defectSetter.accept(this.defect);
        }

        return this;
    }

    /**
     * Get defect
     * @return defect
     */
    public DefectVo getDefect() {
        return defect;
    }

    public void setDefect(DefectVo defect) {
        this.defect = defect;
    }

    public ShowProjectDataDashboardResponse withCasePassRate(CasePassRateVo casePassRate) {
        this.casePassRate = casePassRate;
        return this;
    }

    public ShowProjectDataDashboardResponse withCasePassRate(Consumer<CasePassRateVo> casePassRateSetter) {
        if (this.casePassRate == null) {
            this.casePassRate = new CasePassRateVo();
            casePassRateSetter.accept(this.casePassRate);
        }

        return this;
    }

    /**
     * Get casePassRate
     * @return casePassRate
     */
    public CasePassRateVo getCasePassRate() {
        return casePassRate;
    }

    public void setCasePassRate(CasePassRateVo casePassRate) {
        this.casePassRate = casePassRate;
    }

    public ShowProjectDataDashboardResponse withCaseCompletionRate(CaseCompletionRateVo caseCompletionRate) {
        this.caseCompletionRate = caseCompletionRate;
        return this;
    }

    public ShowProjectDataDashboardResponse withCaseCompletionRate(
        Consumer<CaseCompletionRateVo> caseCompletionRateSetter) {
        if (this.caseCompletionRate == null) {
            this.caseCompletionRate = new CaseCompletionRateVo();
            caseCompletionRateSetter.accept(this.caseCompletionRate);
        }

        return this;
    }

    /**
     * Get caseCompletionRate
     * @return caseCompletionRate
     */
    public CaseCompletionRateVo getCaseCompletionRate() {
        return caseCompletionRate;
    }

    public void setCaseCompletionRate(CaseCompletionRateVo caseCompletionRate) {
        this.caseCompletionRate = caseCompletionRate;
    }

    public ShowProjectDataDashboardResponse withProjectType(String projectType) {
        this.projectType = projectType;
        return this;
    }

    /**
     * 项目类型
     * @return projectType
     */
    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

    public ShowProjectDataDashboardResponse withIssueCoverRate(IssueCoverRateVo issueCoverRate) {
        this.issueCoverRate = issueCoverRate;
        return this;
    }

    public ShowProjectDataDashboardResponse withIssueCoverRate(Consumer<IssueCoverRateVo> issueCoverRateSetter) {
        if (this.issueCoverRate == null) {
            this.issueCoverRate = new IssueCoverRateVo();
            issueCoverRateSetter.accept(this.issueCoverRate);
        }

        return this;
    }

    /**
     * Get issueCoverRate
     * @return issueCoverRate
     */
    public IssueCoverRateVo getIssueCoverRate() {
        return issueCoverRate;
    }

    public void setIssueCoverRate(IssueCoverRateVo issueCoverRate) {
        this.issueCoverRate = issueCoverRate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowProjectDataDashboardResponse that = (ShowProjectDataDashboardResponse) obj;
        return Objects.equals(this.defect, that.defect) && Objects.equals(this.casePassRate, that.casePassRate)
            && Objects.equals(this.caseCompletionRate, that.caseCompletionRate)
            && Objects.equals(this.projectType, that.projectType)
            && Objects.equals(this.issueCoverRate, that.issueCoverRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(defect, casePassRate, caseCompletionRate, projectType, issueCoverRate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowProjectDataDashboardResponse {\n");
        sb.append("    defect: ").append(toIndentedString(defect)).append("\n");
        sb.append("    casePassRate: ").append(toIndentedString(casePassRate)).append("\n");
        sb.append("    caseCompletionRate: ").append(toIndentedString(caseCompletionRate)).append("\n");
        sb.append("    projectType: ").append(toIndentedString(projectType)).append("\n");
        sb.append("    issueCoverRate: ").append(toIndentedString(issueCoverRate)).append("\n");
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
