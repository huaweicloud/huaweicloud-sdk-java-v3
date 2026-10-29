package com.huaweicloud.sdk.codeartscheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 执行结果。
 */
public class JobResultInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "CRITICAL")

    private Integer critical;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "DELAYSTATUS_COUNT")

    private Integer delaystatusCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "FATAL")

    private Integer fatal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "GENERAL")

    private Integer general;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "INFO")

    private Integer info;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "PROMPT")

    private Integer prompt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "codeLine")

    private Integer codeLine;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "defectCount")

    private Integer defectCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dismissed")

    private Integer dismissed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fileTotal")

    private Integer fileTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fixed")

    private Integer fixed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobId")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "newUnsolvedDefectCount")

    private Integer newUnsolvedDefectCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nonSecurityDefectCount")

    private Integer nonSecurityDefectCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reviewResult")

    private String reviewResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "securityDefectCount")

    private Integer securityDefectCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "solvedDefectCount")

    private Integer solvedDefectCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unsolvedDefectCount")

    private Integer unsolvedDefectCount;

    public JobResultInfo withCritical(Integer critical) {
        this.critical = critical;
        return this;
    }

    /**
     * **参数解释：** 严重问题数。 **取值范围：** ≥0
     * @return critical
     */
    public Integer getCritical() {
        return critical;
    }

    public void setCritical(Integer critical) {
        this.critical = critical;
    }

    public JobResultInfo withDelaystatusCount(Integer delaystatusCount) {
        this.delaystatusCount = delaystatusCount;
        return this;
    }

    /**
     * **参数解释：** 延迟上线问题数。 **取值范围：** ≥0
     * @return delaystatusCount
     */
    public Integer getDelaystatusCount() {
        return delaystatusCount;
    }

    public void setDelaystatusCount(Integer delaystatusCount) {
        this.delaystatusCount = delaystatusCount;
    }

    public JobResultInfo withFatal(Integer fatal) {
        this.fatal = fatal;
        return this;
    }

    /**
     * **参数解释：** 致命问题数。 **取值范围：** ≥0
     * @return fatal
     */
    public Integer getFatal() {
        return fatal;
    }

    public void setFatal(Integer fatal) {
        this.fatal = fatal;
    }

    public JobResultInfo withGeneral(Integer general) {
        this.general = general;
        return this;
    }

    /**
     * **参数解释：** 一般问题数。 **取值范围：** ≥0
     * @return general
     */
    public Integer getGeneral() {
        return general;
    }

    public void setGeneral(Integer general) {
        this.general = general;
    }

    public JobResultInfo withInfo(Integer info) {
        this.info = info;
        return this;
    }

    /**
     * **参数解释：** 信息问题数。 **取值范围：** ≥0
     * @return info
     */
    public Integer getInfo() {
        return info;
    }

    public void setInfo(Integer info) {
        this.info = info;
    }

    public JobResultInfo withPrompt(Integer prompt) {
        this.prompt = prompt;
        return this;
    }

    /**
     * **参数解释：** 提示问题数。 **取值范围：** ≥0
     * @return prompt
     */
    public Integer getPrompt() {
        return prompt;
    }

    public void setPrompt(Integer prompt) {
        this.prompt = prompt;
    }

    public JobResultInfo withCodeLine(Integer codeLine) {
        this.codeLine = codeLine;
        return this;
    }

    /**
     * **参数解释：** 扫描代码行数，不包括空行和注释行。 **取值范围：** ≥0
     * @return codeLine
     */
    public Integer getCodeLine() {
        return codeLine;
    }

    public void setCodeLine(Integer codeLine) {
        this.codeLine = codeLine;
    }

    public JobResultInfo withDefectCount(Integer defectCount) {
        this.defectCount = defectCount;
        return this;
    }

    /**
     * **参数解释：** 缺陷总数。 **取值范围：** ≥0
     * @return defectCount
     */
    public Integer getDefectCount() {
        return defectCount;
    }

    public void setDefectCount(Integer defectCount) {
        this.defectCount = defectCount;
    }

    public JobResultInfo withDismissed(Integer dismissed) {
        this.dismissed = dismissed;
        return this;
    }

    /**
     * **参数解释：** 已忽略问题数。 **取值范围：** ≥0
     * @return dismissed
     */
    public Integer getDismissed() {
        return dismissed;
    }

    public void setDismissed(Integer dismissed) {
        this.dismissed = dismissed;
    }

    public JobResultInfo withFileTotal(Integer fileTotal) {
        this.fileTotal = fileTotal;
        return this;
    }

    /**
     * **参数解释：** 文件总数。 **取值范围：** ≥0
     * @return fileTotal
     */
    public Integer getFileTotal() {
        return fileTotal;
    }

    public void setFileTotal(Integer fileTotal) {
        this.fileTotal = fileTotal;
    }

    public JobResultInfo withFixed(Integer fixed) {
        this.fixed = fixed;
        return this;
    }

    /**
     * **参数解释：** 已修复问题数。 **取值范围：** ≥0
     * @return fixed
     */
    public Integer getFixed() {
        return fixed;
    }

    public void setFixed(Integer fixed) {
        this.fixed = fixed;
    }

    public JobResultInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 执行ID，来自代码检查执行任务接口的返回值，每次执行代码检查任务都有唯一的执行ID。 **取值范围：** 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public JobResultInfo withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * **参数解释：** 执行ID，来自代码检查执行任务接口的返回值，每次执行代码检查任务都有唯一的执行ID。 **取值范围：** 不涉及。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public JobResultInfo withNewUnsolvedDefectCount(Integer newUnsolvedDefectCount) {
        this.newUnsolvedDefectCount = newUnsolvedDefectCount;
        return this;
    }

    /**
     * **参数解释：** 未解决且新增的问题数。 **取值范围：** ≥0
     * @return newUnsolvedDefectCount
     */
    public Integer getNewUnsolvedDefectCount() {
        return newUnsolvedDefectCount;
    }

    public void setNewUnsolvedDefectCount(Integer newUnsolvedDefectCount) {
        this.newUnsolvedDefectCount = newUnsolvedDefectCount;
    }

    public JobResultInfo withNonSecurityDefectCount(Integer nonSecurityDefectCount) {
        this.nonSecurityDefectCount = nonSecurityDefectCount;
        return this;
    }

    /**
     * **参数解释：** 非安全问题数。 **取值范围：** ≥0
     * @return nonSecurityDefectCount
     */
    public Integer getNonSecurityDefectCount() {
        return nonSecurityDefectCount;
    }

    public void setNonSecurityDefectCount(Integer nonSecurityDefectCount) {
        this.nonSecurityDefectCount = nonSecurityDefectCount;
    }

    public JobResultInfo withReviewResult(String reviewResult) {
        this.reviewResult = reviewResult;
        return this;
    }

    /**
     * **参数解释：** 门禁结果。 **取值范围：** - success：门禁通过。 - error：门禁未通过。
     * @return reviewResult
     */
    public String getReviewResult() {
        return reviewResult;
    }

    public void setReviewResult(String reviewResult) {
        this.reviewResult = reviewResult;
    }

    public JobResultInfo withSecurityDefectCount(Integer securityDefectCount) {
        this.securityDefectCount = securityDefectCount;
        return this;
    }

    /**
     * **参数解释：** 安全问题数。 **取值范围：** ≥0
     * @return securityDefectCount
     */
    public Integer getSecurityDefectCount() {
        return securityDefectCount;
    }

    public void setSecurityDefectCount(Integer securityDefectCount) {
        this.securityDefectCount = securityDefectCount;
    }

    public JobResultInfo withSolvedDefectCount(Integer solvedDefectCount) {
        this.solvedDefectCount = solvedDefectCount;
        return this;
    }

    /**
     * **参数解释：** 已解决的问题数。 **取值范围：** 不涉及。
     * @return solvedDefectCount
     */
    public Integer getSolvedDefectCount() {
        return solvedDefectCount;
    }

    public void setSolvedDefectCount(Integer solvedDefectCount) {
        this.solvedDefectCount = solvedDefectCount;
    }

    public JobResultInfo withUnsolvedDefectCount(Integer unsolvedDefectCount) {
        this.unsolvedDefectCount = unsolvedDefectCount;
        return this;
    }

    /**
     * **参数解释：** 未解决的问题数。 **取值范围：** 不涉及。
     * @return unsolvedDefectCount
     */
    public Integer getUnsolvedDefectCount() {
        return unsolvedDefectCount;
    }

    public void setUnsolvedDefectCount(Integer unsolvedDefectCount) {
        this.unsolvedDefectCount = unsolvedDefectCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobResultInfo that = (JobResultInfo) obj;
        return Objects.equals(this.critical, that.critical)
            && Objects.equals(this.delaystatusCount, that.delaystatusCount) && Objects.equals(this.fatal, that.fatal)
            && Objects.equals(this.general, that.general) && Objects.equals(this.info, that.info)
            && Objects.equals(this.prompt, that.prompt) && Objects.equals(this.codeLine, that.codeLine)
            && Objects.equals(this.defectCount, that.defectCount) && Objects.equals(this.dismissed, that.dismissed)
            && Objects.equals(this.fileTotal, that.fileTotal) && Objects.equals(this.fixed, that.fixed)
            && Objects.equals(this.id, that.id) && Objects.equals(this.jobId, that.jobId)
            && Objects.equals(this.newUnsolvedDefectCount, that.newUnsolvedDefectCount)
            && Objects.equals(this.nonSecurityDefectCount, that.nonSecurityDefectCount)
            && Objects.equals(this.reviewResult, that.reviewResult)
            && Objects.equals(this.securityDefectCount, that.securityDefectCount)
            && Objects.equals(this.solvedDefectCount, that.solvedDefectCount)
            && Objects.equals(this.unsolvedDefectCount, that.unsolvedDefectCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(critical,
            delaystatusCount,
            fatal,
            general,
            info,
            prompt,
            codeLine,
            defectCount,
            dismissed,
            fileTotal,
            fixed,
            id,
            jobId,
            newUnsolvedDefectCount,
            nonSecurityDefectCount,
            reviewResult,
            securityDefectCount,
            solvedDefectCount,
            unsolvedDefectCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobResultInfo {\n");
        sb.append("    critical: ").append(toIndentedString(critical)).append("\n");
        sb.append("    delaystatusCount: ").append(toIndentedString(delaystatusCount)).append("\n");
        sb.append("    fatal: ").append(toIndentedString(fatal)).append("\n");
        sb.append("    general: ").append(toIndentedString(general)).append("\n");
        sb.append("    info: ").append(toIndentedString(info)).append("\n");
        sb.append("    prompt: ").append(toIndentedString(prompt)).append("\n");
        sb.append("    codeLine: ").append(toIndentedString(codeLine)).append("\n");
        sb.append("    defectCount: ").append(toIndentedString(defectCount)).append("\n");
        sb.append("    dismissed: ").append(toIndentedString(dismissed)).append("\n");
        sb.append("    fileTotal: ").append(toIndentedString(fileTotal)).append("\n");
        sb.append("    fixed: ").append(toIndentedString(fixed)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    newUnsolvedDefectCount: ").append(toIndentedString(newUnsolvedDefectCount)).append("\n");
        sb.append("    nonSecurityDefectCount: ").append(toIndentedString(nonSecurityDefectCount)).append("\n");
        sb.append("    reviewResult: ").append(toIndentedString(reviewResult)).append("\n");
        sb.append("    securityDefectCount: ").append(toIndentedString(securityDefectCount)).append("\n");
        sb.append("    solvedDefectCount: ").append(toIndentedString(solvedDefectCount)).append("\n");
        sb.append("    unsolvedDefectCount: ").append(toIndentedString(unsolvedDefectCount)).append("\n");
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
