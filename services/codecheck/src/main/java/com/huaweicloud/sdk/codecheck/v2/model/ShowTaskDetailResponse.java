package com.huaweicloud.sdk.codecheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.math.BigDecimal;
import java.util.Objects;

/** Response Object */
public class ShowTaskDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_id")

    private String creatorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "git_url")

    private String gitUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "git_branch")

    private String gitBranch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_check_time")

    private String lastCheckTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code_line_total")

    private Integer codeLineTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code_line")

    private Integer codeLine;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code_quality")

    private BigDecimal codeQuality;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_count")

    private Integer issueCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_coefficient")

    private BigDecimal riskCoefficient;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duplication_ratio")

    private String duplicationRatio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "complexity_count")

    private Integer complexityCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duplicated_lines")

    private Integer duplicatedLines;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comment_lines")

    private Integer commentLines;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comment_ratio")

    private String commentRatio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duplicated_blocks")

    private Integer duplicatedBlocks;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_exec_time")

    private String lastExecTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_type")

    private String checkType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cyclomatic_complexity_per_method")

    private String cyclomaticComplexityPerMethod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "critical_count")

    private String criticalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "major_count")

    private String majorCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "minor_count")

    private String minorCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suggestion_count")

    private String suggestionCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_access")

    private String isAccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_type")

    private String triggerType;

    public ShowTaskDetailResponse withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /** 任务id
     * 
     * @return taskId */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public ShowTaskDetailResponse withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /** 任务名字
     * 
     * @return taskName */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public ShowTaskDetailResponse withCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    /** 创建者id
     * 
     * @return creatorId */
    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public ShowTaskDetailResponse withGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
        return this;
    }

    /** 代码仓地址
     * 
     * @return gitUrl */
    public String getGitUrl() {
        return gitUrl;
    }

    public void setGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
    }

    public ShowTaskDetailResponse withGitBranch(String gitBranch) {
        this.gitBranch = gitBranch;
        return this;
    }

    /** 代码仓分支
     * 
     * @return gitBranch */
    public String getGitBranch() {
        return gitBranch;
    }

    public void setGitBranch(String gitBranch) {
        this.gitBranch = gitBranch;
    }

    public ShowTaskDetailResponse withLastCheckTime(String lastCheckTime) {
        this.lastCheckTime = lastCheckTime;
        return this;
    }

    /** 上一次检查时间
     * 
     * @return lastCheckTime */
    public String getLastCheckTime() {
        return lastCheckTime;
    }

    public void setLastCheckTime(String lastCheckTime) {
        this.lastCheckTime = lastCheckTime;
    }

    public ShowTaskDetailResponse withCodeLineTotal(Integer codeLineTotal) {
        this.codeLineTotal = codeLineTotal;
        return this;
    }

    /** 代码总行数
     * 
     * @return codeLineTotal */
    public Integer getCodeLineTotal() {
        return codeLineTotal;
    }

    public void setCodeLineTotal(Integer codeLineTotal) {
        this.codeLineTotal = codeLineTotal;
    }

    public ShowTaskDetailResponse withCodeLine(Integer codeLine) {
        this.codeLine = codeLine;
        return this;
    }

    /** 代码有效行数
     * 
     * @return codeLine */
    public Integer getCodeLine() {
        return codeLine;
    }

    public void setCodeLine(Integer codeLine) {
        this.codeLine = codeLine;
    }

    public ShowTaskDetailResponse withCodeQuality(BigDecimal codeQuality) {
        this.codeQuality = codeQuality;
        return this;
    }

    /** 代码质量
     * 
     * @return codeQuality */
    public BigDecimal getCodeQuality() {
        return codeQuality;
    }

    public void setCodeQuality(BigDecimal codeQuality) {
        this.codeQuality = codeQuality;
    }

    public ShowTaskDetailResponse withIssueCount(Integer issueCount) {
        this.issueCount = issueCount;
        return this;
    }

    /** 问题数
     * 
     * @return issueCount */
    public Integer getIssueCount() {
        return issueCount;
    }

    public void setIssueCount(Integer issueCount) {
        this.issueCount = issueCount;
    }

    public ShowTaskDetailResponse withRiskCoefficient(BigDecimal riskCoefficient) {
        this.riskCoefficient = riskCoefficient;
        return this;
    }

    /** 危险系数
     * 
     * @return riskCoefficient */
    public BigDecimal getRiskCoefficient() {
        return riskCoefficient;
    }

    public void setRiskCoefficient(BigDecimal riskCoefficient) {
        this.riskCoefficient = riskCoefficient;
    }

    public ShowTaskDetailResponse withDuplicationRatio(String duplicationRatio) {
        this.duplicationRatio = duplicationRatio;
        return this;
    }

    /** 重复比例
     * 
     * @return duplicationRatio */
    public String getDuplicationRatio() {
        return duplicationRatio;
    }

    public void setDuplicationRatio(String duplicationRatio) {
        this.duplicationRatio = duplicationRatio;
    }

    public ShowTaskDetailResponse withComplexityCount(Integer complexityCount) {
        this.complexityCount = complexityCount;
        return this;
    }

    /** 复杂度
     * 
     * @return complexityCount */
    public Integer getComplexityCount() {
        return complexityCount;
    }

    public void setComplexityCount(Integer complexityCount) {
        this.complexityCount = complexityCount;
    }

    public ShowTaskDetailResponse withDuplicatedLines(Integer duplicatedLines) {
        this.duplicatedLines = duplicatedLines;
        return this;
    }

    /** 重复行数
     * 
     * @return duplicatedLines */
    public Integer getDuplicatedLines() {
        return duplicatedLines;
    }

    public void setDuplicatedLines(Integer duplicatedLines) {
        this.duplicatedLines = duplicatedLines;
    }

    public ShowTaskDetailResponse withCommentLines(Integer commentLines) {
        this.commentLines = commentLines;
        return this;
    }

    /** 注释行数
     * 
     * @return commentLines */
    public Integer getCommentLines() {
        return commentLines;
    }

    public void setCommentLines(Integer commentLines) {
        this.commentLines = commentLines;
    }

    public ShowTaskDetailResponse withCommentRatio(String commentRatio) {
        this.commentRatio = commentRatio;
        return this;
    }

    /** 注释比例
     * 
     * @return commentRatio */
    public String getCommentRatio() {
        return commentRatio;
    }

    public void setCommentRatio(String commentRatio) {
        this.commentRatio = commentRatio;
    }

    public ShowTaskDetailResponse withDuplicatedBlocks(Integer duplicatedBlocks) {
        this.duplicatedBlocks = duplicatedBlocks;
        return this;
    }

    /** 重复块
     * 
     * @return duplicatedBlocks */
    public Integer getDuplicatedBlocks() {
        return duplicatedBlocks;
    }

    public void setDuplicatedBlocks(Integer duplicatedBlocks) {
        this.duplicatedBlocks = duplicatedBlocks;
    }

    public ShowTaskDetailResponse withLastExecTime(String lastExecTime) {
        this.lastExecTime = lastExecTime;
        return this;
    }

    /** 上次执行时间
     * 
     * @return lastExecTime */
    public String getLastExecTime() {
        return lastExecTime;
    }

    public void setLastExecTime(String lastExecTime) {
        this.lastExecTime = lastExecTime;
    }

    public ShowTaskDetailResponse withCheckType(String checkType) {
        this.checkType = checkType;
        return this;
    }

    /** 检查类型
     * 
     * @return checkType */
    public String getCheckType() {
        return checkType;
    }

    public void setCheckType(String checkType) {
        this.checkType = checkType;
    }

    public ShowTaskDetailResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /** 创建时间
     * 
     * @return createdAt */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ShowTaskDetailResponse withCyclomaticComplexityPerMethod(String cyclomaticComplexityPerMethod) {
        this.cyclomaticComplexityPerMethod = cyclomaticComplexityPerMethod;
        return this;
    }

    /** 代码平均复杂度
     * 
     * @return cyclomaticComplexityPerMethod */
    public String getCyclomaticComplexityPerMethod() {
        return cyclomaticComplexityPerMethod;
    }

    public void setCyclomaticComplexityPerMethod(String cyclomaticComplexityPerMethod) {
        this.cyclomaticComplexityPerMethod = cyclomaticComplexityPerMethod;
    }

    public ShowTaskDetailResponse withCriticalCount(String criticalCount) {
        this.criticalCount = criticalCount;
        return this;
    }

    /** 致命问题数
     * 
     * @return criticalCount */
    public String getCriticalCount() {
        return criticalCount;
    }

    public void setCriticalCount(String criticalCount) {
        this.criticalCount = criticalCount;
    }

    public ShowTaskDetailResponse withMajorCount(String majorCount) {
        this.majorCount = majorCount;
        return this;
    }

    /** 严重问题数
     * 
     * @return majorCount */
    public String getMajorCount() {
        return majorCount;
    }

    public void setMajorCount(String majorCount) {
        this.majorCount = majorCount;
    }

    public ShowTaskDetailResponse withMinorCount(String minorCount) {
        this.minorCount = minorCount;
        return this;
    }

    /** 一般问题数
     * 
     * @return minorCount */
    public String getMinorCount() {
        return minorCount;
    }

    public void setMinorCount(String minorCount) {
        this.minorCount = minorCount;
    }

    public ShowTaskDetailResponse withSuggestionCount(String suggestionCount) {
        this.suggestionCount = suggestionCount;
        return this;
    }

    /** 提示问题数
     * 
     * @return suggestionCount */
    public String getSuggestionCount() {
        return suggestionCount;
    }

    public void setSuggestionCount(String suggestionCount) {
        this.suggestionCount = suggestionCount;
    }

    public ShowTaskDetailResponse withIsAccess(String isAccess) {
        this.isAccess = isAccess;
        return this;
    }

    /** 门禁质量是否通过
     * 
     * @return isAccess */
    public String getIsAccess() {
        return isAccess;
    }

    public void setIsAccess(String isAccess) {
        this.isAccess = isAccess;
    }

    public ShowTaskDetailResponse withTriggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }

    /** 任务触发方式
     * 
     * @return triggerType */
    public String getTriggerType() {
        return triggerType;
    }

    public void setTriggerType(String triggerType) {
        this.triggerType = triggerType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowTaskDetailResponse showTaskDetailResponse = (ShowTaskDetailResponse) o;
        return Objects.equals(this.taskId, showTaskDetailResponse.taskId)
            && Objects.equals(this.taskName, showTaskDetailResponse.taskName)
            && Objects.equals(this.creatorId, showTaskDetailResponse.creatorId)
            && Objects.equals(this.gitUrl, showTaskDetailResponse.gitUrl)
            && Objects.equals(this.gitBranch, showTaskDetailResponse.gitBranch)
            && Objects.equals(this.lastCheckTime, showTaskDetailResponse.lastCheckTime)
            && Objects.equals(this.codeLineTotal, showTaskDetailResponse.codeLineTotal)
            && Objects.equals(this.codeLine, showTaskDetailResponse.codeLine)
            && Objects.equals(this.codeQuality, showTaskDetailResponse.codeQuality)
            && Objects.equals(this.issueCount, showTaskDetailResponse.issueCount)
            && Objects.equals(this.riskCoefficient, showTaskDetailResponse.riskCoefficient)
            && Objects.equals(this.duplicationRatio, showTaskDetailResponse.duplicationRatio)
            && Objects.equals(this.complexityCount, showTaskDetailResponse.complexityCount)
            && Objects.equals(this.duplicatedLines, showTaskDetailResponse.duplicatedLines)
            && Objects.equals(this.commentLines, showTaskDetailResponse.commentLines)
            && Objects.equals(this.commentRatio, showTaskDetailResponse.commentRatio)
            && Objects.equals(this.duplicatedBlocks, showTaskDetailResponse.duplicatedBlocks)
            && Objects.equals(this.lastExecTime, showTaskDetailResponse.lastExecTime)
            && Objects.equals(this.checkType, showTaskDetailResponse.checkType)
            && Objects.equals(this.createdAt, showTaskDetailResponse.createdAt)
            && Objects.equals(this.cyclomaticComplexityPerMethod, showTaskDetailResponse.cyclomaticComplexityPerMethod)
            && Objects.equals(this.criticalCount, showTaskDetailResponse.criticalCount)
            && Objects.equals(this.majorCount, showTaskDetailResponse.majorCount)
            && Objects.equals(this.minorCount, showTaskDetailResponse.minorCount)
            && Objects.equals(this.suggestionCount, showTaskDetailResponse.suggestionCount)
            && Objects.equals(this.isAccess, showTaskDetailResponse.isAccess)
            && Objects.equals(this.triggerType, showTaskDetailResponse.triggerType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId,
            taskName,
            creatorId,
            gitUrl,
            gitBranch,
            lastCheckTime,
            codeLineTotal,
            codeLine,
            codeQuality,
            issueCount,
            riskCoefficient,
            duplicationRatio,
            complexityCount,
            duplicatedLines,
            commentLines,
            commentRatio,
            duplicatedBlocks,
            lastExecTime,
            checkType,
            createdAt,
            cyclomaticComplexityPerMethod,
            criticalCount,
            majorCount,
            minorCount,
            suggestionCount,
            isAccess,
            triggerType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTaskDetailResponse {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
        sb.append("    gitUrl: ").append(toIndentedString(gitUrl)).append("\n");
        sb.append("    gitBranch: ").append(toIndentedString(gitBranch)).append("\n");
        sb.append("    lastCheckTime: ").append(toIndentedString(lastCheckTime)).append("\n");
        sb.append("    codeLineTotal: ").append(toIndentedString(codeLineTotal)).append("\n");
        sb.append("    codeLine: ").append(toIndentedString(codeLine)).append("\n");
        sb.append("    codeQuality: ").append(toIndentedString(codeQuality)).append("\n");
        sb.append("    issueCount: ").append(toIndentedString(issueCount)).append("\n");
        sb.append("    riskCoefficient: ").append(toIndentedString(riskCoefficient)).append("\n");
        sb.append("    duplicationRatio: ").append(toIndentedString(duplicationRatio)).append("\n");
        sb.append("    complexityCount: ").append(toIndentedString(complexityCount)).append("\n");
        sb.append("    duplicatedLines: ").append(toIndentedString(duplicatedLines)).append("\n");
        sb.append("    commentLines: ").append(toIndentedString(commentLines)).append("\n");
        sb.append("    commentRatio: ").append(toIndentedString(commentRatio)).append("\n");
        sb.append("    duplicatedBlocks: ").append(toIndentedString(duplicatedBlocks)).append("\n");
        sb.append("    lastExecTime: ").append(toIndentedString(lastExecTime)).append("\n");
        sb.append("    checkType: ").append(toIndentedString(checkType)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    cyclomaticComplexityPerMethod: ")
            .append(toIndentedString(cyclomaticComplexityPerMethod))
            .append("\n");
        sb.append("    criticalCount: ").append(toIndentedString(criticalCount)).append("\n");
        sb.append("    majorCount: ").append(toIndentedString(majorCount)).append("\n");
        sb.append("    minorCount: ").append(toIndentedString(minorCount)).append("\n");
        sb.append("    suggestionCount: ").append(toIndentedString(suggestionCount)).append("\n");
        sb.append("    isAccess: ").append(toIndentedString(isAccess)).append("\n");
        sb.append("    triggerType: ").append(toIndentedString(triggerType)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
