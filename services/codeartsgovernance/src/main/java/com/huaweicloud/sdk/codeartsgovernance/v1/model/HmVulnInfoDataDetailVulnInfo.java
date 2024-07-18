package com.huaweicloud.sdk.codeartsgovernance.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.util.Objects;

/**
 * HmVulnInfoDataDetailVulnInfo
 */
public class HmVulnInfoDataDetailVulnInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "problem_file_path")

    private String problemFilePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identity_info")

    private String identityInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_level")

    private String riskLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category_id")

    private String categoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type_cn")

    private String typeCn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type_en")

    private String typeEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "problem_cn")

    private String problemCn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "problem_en")

    private String problemEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "solution_cn")

    private String solutionCn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "solution_en")

    private String solutionEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detection_scenario_cn")

    private String detectionScenarioCn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detection_scenario_en")

    private String detectionScenarioEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wiki_url")

    private String wikiUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "standard_info")

    private String standardInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confirm_state")

    private Integer confirmState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confirm_result")

    private Integer confirmResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confirmer")

    private String confirmer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confirm_description")

    private String confirmDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confirm_time")

    private LocalDate confirmTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dts_id")

    private String dtsId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "standard_no")

    private String standardNo;

    public HmVulnInfoDataDetailVulnInfo withProblemFilePath(String problemFilePath) {
        this.problemFilePath = problemFilePath;
        return this;
    }

    /**
     * 问题文件路径
     * @return problemFilePath
     */
    public String getProblemFilePath() {
        return problemFilePath;
    }

    public void setProblemFilePath(String problemFilePath) {
        this.problemFilePath = problemFilePath;
    }

    public HmVulnInfoDataDetailVulnInfo withIdentityInfo(String identityInfo) {
        this.identityInfo = identityInfo;
        return this;
    }

    /**
     * 问题特征信息
     * @return identityInfo
     */
    public String getIdentityInfo() {
        return identityInfo;
    }

    public void setIdentityInfo(String identityInfo) {
        this.identityInfo = identityInfo;
    }

    public HmVulnInfoDataDetailVulnInfo withRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }

    /**
     * 问题等级
     * @return riskLevel
     */
    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    public HmVulnInfoDataDetailVulnInfo withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * 应用名称
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public HmVulnInfoDataDetailVulnInfo withCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    /**
     * 问题项大类id
     * @return categoryId
     */
    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public HmVulnInfoDataDetailVulnInfo withTypeCn(String typeCn) {
        this.typeCn = typeCn;
        return this;
    }

    /**
     * 问题项大类中文名
     * @return typeCn
     */
    public String getTypeCn() {
        return typeCn;
    }

    public void setTypeCn(String typeCn) {
        this.typeCn = typeCn;
    }

    public HmVulnInfoDataDetailVulnInfo withTypeEn(String typeEn) {
        this.typeEn = typeEn;
        return this;
    }

    /**
     * 问题项大类英文名
     * @return typeEn
     */
    public String getTypeEn() {
        return typeEn;
    }

    public void setTypeEn(String typeEn) {
        this.typeEn = typeEn;
    }

    public HmVulnInfoDataDetailVulnInfo withProblemCn(String problemCn) {
        this.problemCn = problemCn;
        return this;
    }

    /**
     * 问题描述中文
     * @return problemCn
     */
    public String getProblemCn() {
        return problemCn;
    }

    public void setProblemCn(String problemCn) {
        this.problemCn = problemCn;
    }

    public HmVulnInfoDataDetailVulnInfo withProblemEn(String problemEn) {
        this.problemEn = problemEn;
        return this;
    }

    /**
     * 问题描述英文
     * @return problemEn
     */
    public String getProblemEn() {
        return problemEn;
    }

    public void setProblemEn(String problemEn) {
        this.problemEn = problemEn;
    }

    public HmVulnInfoDataDetailVulnInfo withSolutionCn(String solutionCn) {
        this.solutionCn = solutionCn;
        return this;
    }

    /**
     * 解决办法中文
     * @return solutionCn
     */
    public String getSolutionCn() {
        return solutionCn;
    }

    public void setSolutionCn(String solutionCn) {
        this.solutionCn = solutionCn;
    }

    public HmVulnInfoDataDetailVulnInfo withSolutionEn(String solutionEn) {
        this.solutionEn = solutionEn;
        return this;
    }

    /**
     * 解决办法英文
     * @return solutionEn
     */
    public String getSolutionEn() {
        return solutionEn;
    }

    public void setSolutionEn(String solutionEn) {
        this.solutionEn = solutionEn;
    }

    public HmVulnInfoDataDetailVulnInfo withDetectionScenarioCn(String detectionScenarioCn) {
        this.detectionScenarioCn = detectionScenarioCn;
        return this;
    }

    /**
     * 问题详细描述中文
     * @return detectionScenarioCn
     */
    public String getDetectionScenarioCn() {
        return detectionScenarioCn;
    }

    public void setDetectionScenarioCn(String detectionScenarioCn) {
        this.detectionScenarioCn = detectionScenarioCn;
    }

    public HmVulnInfoDataDetailVulnInfo withDetectionScenarioEn(String detectionScenarioEn) {
        this.detectionScenarioEn = detectionScenarioEn;
        return this;
    }

    /**
     * 问题详细描述英文
     * @return detectionScenarioEn
     */
    public String getDetectionScenarioEn() {
        return detectionScenarioEn;
    }

    public void setDetectionScenarioEn(String detectionScenarioEn) {
        this.detectionScenarioEn = detectionScenarioEn;
    }

    public HmVulnInfoDataDetailVulnInfo withWikiUrl(String wikiUrl) {
        this.wikiUrl = wikiUrl;
        return this;
    }

    /**
     * 问题wiki
     * @return wikiUrl
     */
    public String getWikiUrl() {
        return wikiUrl;
    }

    public void setWikiUrl(String wikiUrl) {
        this.wikiUrl = wikiUrl;
    }

    public HmVulnInfoDataDetailVulnInfo withStandardInfo(String standardInfo) {
        this.standardInfo = standardInfo;
        return this;
    }

    /**
     * 问题来源规范
     * @return standardInfo
     */
    public String getStandardInfo() {
        return standardInfo;
    }

    public void setStandardInfo(String standardInfo) {
        this.standardInfo = standardInfo;
    }

    public HmVulnInfoDataDetailVulnInfo withConfirmState(Integer confirmState) {
        this.confirmState = confirmState;
        return this;
    }

    /**
     * 漏洞确认: 0 - 未确认 1 - 已确认
     * @return confirmState
     */
    public Integer getConfirmState() {
        return confirmState;
    }

    public void setConfirmState(Integer confirmState) {
        this.confirmState = confirmState;
    }

    public HmVulnInfoDataDetailVulnInfo withConfirmResult(Integer confirmResult) {
        this.confirmResult = confirmResult;
        return this;
    }

    /**
     * 漏洞确认结果: 0 - 未误报 1 - 误报
     * @return confirmResult
     */
    public Integer getConfirmResult() {
        return confirmResult;
    }

    public void setConfirmResult(Integer confirmResult) {
        this.confirmResult = confirmResult;
    }

    public HmVulnInfoDataDetailVulnInfo withConfirmer(String confirmer) {
        this.confirmer = confirmer;
        return this;
    }

    /**
     * 确认人
     * @return confirmer
     */
    public String getConfirmer() {
        return confirmer;
    }

    public void setConfirmer(String confirmer) {
        this.confirmer = confirmer;
    }

    public HmVulnInfoDataDetailVulnInfo withConfirmDescription(String confirmDescription) {
        this.confirmDescription = confirmDescription;
        return this;
    }

    /**
     * 确认描述
     * @return confirmDescription
     */
    public String getConfirmDescription() {
        return confirmDescription;
    }

    public void setConfirmDescription(String confirmDescription) {
        this.confirmDescription = confirmDescription;
    }

    public HmVulnInfoDataDetailVulnInfo withConfirmTime(LocalDate confirmTime) {
        this.confirmTime = confirmTime;
        return this;
    }

    /**
     * 确认时间
     * @return confirmTime
     */
    public LocalDate getConfirmTime() {
        return confirmTime;
    }

    public void setConfirmTime(LocalDate confirmTime) {
        this.confirmTime = confirmTime;
    }

    public HmVulnInfoDataDetailVulnInfo withDtsId(String dtsId) {
        this.dtsId = dtsId;
        return this;
    }

    /**
     * 问题单编号
     * @return dtsId
     */
    public String getDtsId() {
        return dtsId;
    }

    public void setDtsId(String dtsId) {
        this.dtsId = dtsId;
    }

    public HmVulnInfoDataDetailVulnInfo withStandardNo(String standardNo) {
        this.standardNo = standardNo;
        return this;
    }

    /**
     * 标准标号
     * @return standardNo
     */
    public String getStandardNo() {
        return standardNo;
    }

    public void setStandardNo(String standardNo) {
        this.standardNo = standardNo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HmVulnInfoDataDetailVulnInfo that = (HmVulnInfoDataDetailVulnInfo) obj;
        return Objects.equals(this.problemFilePath, that.problemFilePath)
            && Objects.equals(this.identityInfo, that.identityInfo) && Objects.equals(this.riskLevel, that.riskLevel)
            && Objects.equals(this.appName, that.appName) && Objects.equals(this.categoryId, that.categoryId)
            && Objects.equals(this.typeCn, that.typeCn) && Objects.equals(this.typeEn, that.typeEn)
            && Objects.equals(this.problemCn, that.problemCn) && Objects.equals(this.problemEn, that.problemEn)
            && Objects.equals(this.solutionCn, that.solutionCn) && Objects.equals(this.solutionEn, that.solutionEn)
            && Objects.equals(this.detectionScenarioCn, that.detectionScenarioCn)
            && Objects.equals(this.detectionScenarioEn, that.detectionScenarioEn)
            && Objects.equals(this.wikiUrl, that.wikiUrl) && Objects.equals(this.standardInfo, that.standardInfo)
            && Objects.equals(this.confirmState, that.confirmState)
            && Objects.equals(this.confirmResult, that.confirmResult) && Objects.equals(this.confirmer, that.confirmer)
            && Objects.equals(this.confirmDescription, that.confirmDescription)
            && Objects.equals(this.confirmTime, that.confirmTime) && Objects.equals(this.dtsId, that.dtsId)
            && Objects.equals(this.standardNo, that.standardNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(problemFilePath,
            identityInfo,
            riskLevel,
            appName,
            categoryId,
            typeCn,
            typeEn,
            problemCn,
            problemEn,
            solutionCn,
            solutionEn,
            detectionScenarioCn,
            detectionScenarioEn,
            wikiUrl,
            standardInfo,
            confirmState,
            confirmResult,
            confirmer,
            confirmDescription,
            confirmTime,
            dtsId,
            standardNo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HmVulnInfoDataDetailVulnInfo {\n");
        sb.append("    problemFilePath: ").append(toIndentedString(problemFilePath)).append("\n");
        sb.append("    identityInfo: ").append(toIndentedString(identityInfo)).append("\n");
        sb.append("    riskLevel: ").append(toIndentedString(riskLevel)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
        sb.append("    typeCn: ").append(toIndentedString(typeCn)).append("\n");
        sb.append("    typeEn: ").append(toIndentedString(typeEn)).append("\n");
        sb.append("    problemCn: ").append(toIndentedString(problemCn)).append("\n");
        sb.append("    problemEn: ").append(toIndentedString(problemEn)).append("\n");
        sb.append("    solutionCn: ").append(toIndentedString(solutionCn)).append("\n");
        sb.append("    solutionEn: ").append(toIndentedString(solutionEn)).append("\n");
        sb.append("    detectionScenarioCn: ").append(toIndentedString(detectionScenarioCn)).append("\n");
        sb.append("    detectionScenarioEn: ").append(toIndentedString(detectionScenarioEn)).append("\n");
        sb.append("    wikiUrl: ").append(toIndentedString(wikiUrl)).append("\n");
        sb.append("    standardInfo: ").append(toIndentedString(standardInfo)).append("\n");
        sb.append("    confirmState: ").append(toIndentedString(confirmState)).append("\n");
        sb.append("    confirmResult: ").append(toIndentedString(confirmResult)).append("\n");
        sb.append("    confirmer: ").append(toIndentedString(confirmer)).append("\n");
        sb.append("    confirmDescription: ").append(toIndentedString(confirmDescription)).append("\n");
        sb.append("    confirmTime: ").append(toIndentedString(confirmTime)).append("\n");
        sb.append("    dtsId: ").append(toIndentedString(dtsId)).append("\n");
        sb.append("    standardNo: ").append(toIndentedString(standardNo)).append("\n");
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
