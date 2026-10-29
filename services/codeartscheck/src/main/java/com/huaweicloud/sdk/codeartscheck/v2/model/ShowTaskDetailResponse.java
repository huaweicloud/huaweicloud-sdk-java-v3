package com.huaweicloud.sdk.codeartscheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Response Object
 */
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
    @JsonProperty(value = "cyclomatic_complexity_per_file")

    private String cyclomaticComplexityPerFile;

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
    @JsonProperty(value = "review_result")

    private String reviewResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_type")

    private String triggerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_duplication_ratio")

    private String fileDuplicationRatio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_count")

    private Integer newCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "solve_count")

    private Integer solveCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dismissed_count")

    private Integer dismissedCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duplicated_files")

    private Integer duplicatedFiles;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_critical_count")

    private String newCriticalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_major_count")

    private String newMajorCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_minor_count")

    private String newMinorCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_suggestion_count")

    private String newSuggestionCount;

    public ShowTaskDetailResponse withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * **参数解释：** 旧版任务ID。即新建检查任务接口的返回值，每个代码检查任务及其下的分支任务、通过API创建的增量任务都有唯一的任务ID。 **取值范围：** 不涉及。
     * @return taskId
     */
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

    /**
     * **参数解释：** 任务名称。 **取值范围：** 不涉及。
     * @return taskName
     */
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

    /**
     * **参数解释：** 任务创建者用户ID。 **取值范围：** 不涉及。
     * @return creatorId
     */
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

    /**
     * **参数解释：** 代码仓地址。 **取值范围：** 不涉及。
     * @return gitUrl
     */
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

    /**
     * **参数解释：** 代码仓分支，如果是MR模式，为源分支。 **取值范围：** 不涉及。
     * @return gitBranch
     */
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

    /**
     * **参数解释：** 上一次检查时间。使用UTC时间，格式为yyyy-MM-ddTHH:mm:ssZ。例如：2020-09-25T12:05:00Z。 **取值范围：** 不涉及。
     * @return lastCheckTime
     */
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

    /**
     * **参数解释：** 原始代码行数，包含空行和注释行。 **取值范围：** 不涉及。
     * @return codeLineTotal
     */
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

    /**
     * **参数解释：** 有效代码行数，不包含空行和注释行。 **取值范围：** 不涉及。
     * @return codeLine
     */
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

    /**
     * **参数解释：** 代码质量。 **取值范围：** 不涉及。
     * @return codeQuality
     */
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

    /**
     * **参数解释：** [待处理问题数。](tag:hws,hws_hk)[待处理和重新打开（需打开忽略审核开关）问题数。](tag:fcs,hcs,hcs_sm,hcs_site,hcs_sitesm) **取值范围：** 不涉及。
     * @return issueCount
     */
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

    /**
     * **参数解释：** 危险系数。 **取值范围：** 不涉及。
     * @return riskCoefficient
     */
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

    /**
     * **参数解释：** 代码重复率。 **取值范围：** 不涉及。
     * @return duplicationRatio
     */
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

    /**
     * **参数解释：** 圈复杂度总数。 **取值范围：** 不涉及。
     * @return complexityCount
     */
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

    /**
     * **参数解释：** 重复行数总数。 **取值范围：** 不涉及。
     * @return duplicatedLines
     */
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

    /**
     * **参数解释：** 注释行数。 **取值范围：** 不涉及。
     * @return commentLines
     */
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

    /**
     * **参数解释：** 注释率。 **取值范围：** 不涉及。
     * @return commentRatio
     */
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

    /**
     * **参数解释：** 重复块个数。 **取值范围：** 不涉及。
     * @return duplicatedBlocks
     */
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

    /**
     * **参数解释：** 上一次执行时间。使用UTC时间，格式为yyyy-MM-ddTHH:mm:ssZ。例如：2020-09-25T12:05:00Z。 **取值范围：** 不涉及。
     * @return lastExecTime
     */
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

    /**
     * **参数解释：** 废弃字段。 **约束限制：** 不涉及。 **取值范围：** 不涉及。
     * @return checkType
     */
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

    /**
     * **参数解释：** 创建时间。使用UTC时间，格式为yyyy-MM-ddTHH:mm:ssZ。例如：2020-09-25T12:05:00Z。 **取值范围：** 不涉及。
     * @return createdAt
     */
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

    /**
     * **参数解释：** 平均圈复杂度（方法）。 **取值范围：** 不涉及。
     * @return cyclomaticComplexityPerMethod
     */
    public String getCyclomaticComplexityPerMethod() {
        return cyclomaticComplexityPerMethod;
    }

    public void setCyclomaticComplexityPerMethod(String cyclomaticComplexityPerMethod) {
        this.cyclomaticComplexityPerMethod = cyclomaticComplexityPerMethod;
    }

    public ShowTaskDetailResponse withCyclomaticComplexityPerFile(String cyclomaticComplexityPerFile) {
        this.cyclomaticComplexityPerFile = cyclomaticComplexityPerFile;
        return this;
    }

    /**
     * **参数解释：** 平均圈复杂度（文件）。 **取值范围：** 不涉及。
     * @return cyclomaticComplexityPerFile
     */
    public String getCyclomaticComplexityPerFile() {
        return cyclomaticComplexityPerFile;
    }

    public void setCyclomaticComplexityPerFile(String cyclomaticComplexityPerFile) {
        this.cyclomaticComplexityPerFile = cyclomaticComplexityPerFile;
    }

    public ShowTaskDetailResponse withCriticalCount(String criticalCount) {
        this.criticalCount = criticalCount;
        return this;
    }

    /**
     * **参数解释：** 致命问题数。不包括已忽略和已修复问题。 **取值范围：** 不涉及。
     * @return criticalCount
     */
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

    /**
     * **参数解释：** 严重问题数。不包括已忽略和已修复问题。 **取值范围：** 不涉及。
     * @return majorCount
     */
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

    /**
     * **参数解释：** 一般问题数。不包括已忽略和已修复问题。 **取值范围：** 不涉及。
     * @return minorCount
     */
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

    /**
     * **参数解释：** 提示问题数。不包括已忽略和已修复问题。 **取值范围：** 不涉及。
     * @return suggestionCount
     */
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

    /**
     * **参数解释：** 门禁质量是否通过。 **取值范围：** - 1：门禁通过。 - 0：门禁不通过。
     * @return isAccess
     */
    public String getIsAccess() {
        return isAccess;
    }

    public void setIsAccess(String isAccess) {
        this.isAccess = isAccess;
    }

    public ShowTaskDetailResponse withReviewResult(String reviewResult) {
        this.reviewResult = reviewResult;
        return this;
    }

    /**
     * **参数解释：** 门禁质量是否通过。 **取值范围：** 不涉及。
     * @return reviewResult
     */
    public String getReviewResult() {
        return reviewResult;
    }

    public void setReviewResult(String reviewResult) {
        this.reviewResult = reviewResult;
    }

    public ShowTaskDetailResponse withTriggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }

    /**
     * **参数解释：** 任务触发方式。 **取值范围：** - 0：手动触发。 - 1：定时触发。 - 2：代码提交触发。 - 3：合并请求触发。
     * @return triggerType
     */
    public String getTriggerType() {
        return triggerType;
    }

    public void setTriggerType(String triggerType) {
        this.triggerType = triggerType;
    }

    public ShowTaskDetailResponse withFileDuplicationRatio(String fileDuplicationRatio) {
        this.fileDuplicationRatio = fileDuplicationRatio;
        return this;
    }

    /**
     * **参数解释：** 文件重复率。 **取值范围：** 不涉及。
     * @return fileDuplicationRatio
     */
    public String getFileDuplicationRatio() {
        return fileDuplicationRatio;
    }

    public void setFileDuplicationRatio(String fileDuplicationRatio) {
        this.fileDuplicationRatio = fileDuplicationRatio;
    }

    public ShowTaskDetailResponse withNewCount(Integer newCount) {
        this.newCount = newCount;
        return this;
    }

    /**
     * **参数解释：** 新发现问题数。不包括已忽略和已修复问题。 **取值范围：** 不涉及。
     * @return newCount
     */
    public Integer getNewCount() {
        return newCount;
    }

    public void setNewCount(Integer newCount) {
        this.newCount = newCount;
    }

    public ShowTaskDetailResponse withSolveCount(Integer solveCount) {
        this.solveCount = solveCount;
        return this;
    }

    /**
     * **参数解释：** 已解决和已修复问题数。 **取值范围：** 不涉及。
     * @return solveCount
     */
    public Integer getSolveCount() {
        return solveCount;
    }

    public void setSolveCount(Integer solveCount) {
        this.solveCount = solveCount;
    }

    public ShowTaskDetailResponse withDismissedCount(Integer dismissedCount) {
        this.dismissedCount = dismissedCount;
        return this;
    }

    /**
     * **参数解释：** 已忽略问题数。 **取值范围：** 不涉及。
     * @return dismissedCount
     */
    public Integer getDismissedCount() {
        return dismissedCount;
    }

    public void setDismissedCount(Integer dismissedCount) {
        this.dismissedCount = dismissedCount;
    }

    public ShowTaskDetailResponse withDuplicatedFiles(Integer duplicatedFiles) {
        this.duplicatedFiles = duplicatedFiles;
        return this;
    }

    /**
     * **参数解释：** 重复文件数量。 **取值范围：** 不涉及。
     * @return duplicatedFiles
     */
    public Integer getDuplicatedFiles() {
        return duplicatedFiles;
    }

    public void setDuplicatedFiles(Integer duplicatedFiles) {
        this.duplicatedFiles = duplicatedFiles;
    }

    public ShowTaskDetailResponse withNewCriticalCount(String newCriticalCount) {
        this.newCriticalCount = newCriticalCount;
        return this;
    }

    /**
     * **参数解释：** 新增致命问题数。不包括已忽略和已修复问题。 **取值范围：** 不涉及。
     * @return newCriticalCount
     */
    public String getNewCriticalCount() {
        return newCriticalCount;
    }

    public void setNewCriticalCount(String newCriticalCount) {
        this.newCriticalCount = newCriticalCount;
    }

    public ShowTaskDetailResponse withNewMajorCount(String newMajorCount) {
        this.newMajorCount = newMajorCount;
        return this;
    }

    /**
     * **参数解释：** 新增严重问题数。不包括已忽略和已修复问题。 **取值范围：** 不涉及。
     * @return newMajorCount
     */
    public String getNewMajorCount() {
        return newMajorCount;
    }

    public void setNewMajorCount(String newMajorCount) {
        this.newMajorCount = newMajorCount;
    }

    public ShowTaskDetailResponse withNewMinorCount(String newMinorCount) {
        this.newMinorCount = newMinorCount;
        return this;
    }

    /**
     * **参数解释：** 新增一般问题数。不包括已忽略和已修复问题。 **取值范围：** 不涉及。
     * @return newMinorCount
     */
    public String getNewMinorCount() {
        return newMinorCount;
    }

    public void setNewMinorCount(String newMinorCount) {
        this.newMinorCount = newMinorCount;
    }

    public ShowTaskDetailResponse withNewSuggestionCount(String newSuggestionCount) {
        this.newSuggestionCount = newSuggestionCount;
        return this;
    }

    /**
     * **参数解释：** 新增提示问题数。不包括已忽略和已修复问题。 **取值范围：** 不涉及。
     * @return newSuggestionCount
     */
    public String getNewSuggestionCount() {
        return newSuggestionCount;
    }

    public void setNewSuggestionCount(String newSuggestionCount) {
        this.newSuggestionCount = newSuggestionCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTaskDetailResponse that = (ShowTaskDetailResponse) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.taskName, that.taskName)
            && Objects.equals(this.creatorId, that.creatorId) && Objects.equals(this.gitUrl, that.gitUrl)
            && Objects.equals(this.gitBranch, that.gitBranch) && Objects.equals(this.lastCheckTime, that.lastCheckTime)
            && Objects.equals(this.codeLineTotal, that.codeLineTotal) && Objects.equals(this.codeLine, that.codeLine)
            && Objects.equals(this.codeQuality, that.codeQuality) && Objects.equals(this.issueCount, that.issueCount)
            && Objects.equals(this.riskCoefficient, that.riskCoefficient)
            && Objects.equals(this.duplicationRatio, that.duplicationRatio)
            && Objects.equals(this.complexityCount, that.complexityCount)
            && Objects.equals(this.duplicatedLines, that.duplicatedLines)
            && Objects.equals(this.commentLines, that.commentLines)
            && Objects.equals(this.commentRatio, that.commentRatio)
            && Objects.equals(this.duplicatedBlocks, that.duplicatedBlocks)
            && Objects.equals(this.lastExecTime, that.lastExecTime) && Objects.equals(this.checkType, that.checkType)
            && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.cyclomaticComplexityPerMethod, that.cyclomaticComplexityPerMethod)
            && Objects.equals(this.cyclomaticComplexityPerFile, that.cyclomaticComplexityPerFile)
            && Objects.equals(this.criticalCount, that.criticalCount)
            && Objects.equals(this.majorCount, that.majorCount) && Objects.equals(this.minorCount, that.minorCount)
            && Objects.equals(this.suggestionCount, that.suggestionCount)
            && Objects.equals(this.isAccess, that.isAccess) && Objects.equals(this.reviewResult, that.reviewResult)
            && Objects.equals(this.triggerType, that.triggerType)
            && Objects.equals(this.fileDuplicationRatio, that.fileDuplicationRatio)
            && Objects.equals(this.newCount, that.newCount) && Objects.equals(this.solveCount, that.solveCount)
            && Objects.equals(this.dismissedCount, that.dismissedCount)
            && Objects.equals(this.duplicatedFiles, that.duplicatedFiles)
            && Objects.equals(this.newCriticalCount, that.newCriticalCount)
            && Objects.equals(this.newMajorCount, that.newMajorCount)
            && Objects.equals(this.newMinorCount, that.newMinorCount)
            && Objects.equals(this.newSuggestionCount, that.newSuggestionCount);
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
            cyclomaticComplexityPerFile,
            criticalCount,
            majorCount,
            minorCount,
            suggestionCount,
            isAccess,
            reviewResult,
            triggerType,
            fileDuplicationRatio,
            newCount,
            solveCount,
            dismissedCount,
            duplicatedFiles,
            newCriticalCount,
            newMajorCount,
            newMinorCount,
            newSuggestionCount);
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
        sb.append("    cyclomaticComplexityPerFile: ")
            .append(toIndentedString(cyclomaticComplexityPerFile))
            .append("\n");
        sb.append("    criticalCount: ").append(toIndentedString(criticalCount)).append("\n");
        sb.append("    majorCount: ").append(toIndentedString(majorCount)).append("\n");
        sb.append("    minorCount: ").append(toIndentedString(minorCount)).append("\n");
        sb.append("    suggestionCount: ").append(toIndentedString(suggestionCount)).append("\n");
        sb.append("    isAccess: ").append(toIndentedString(isAccess)).append("\n");
        sb.append("    reviewResult: ").append(toIndentedString(reviewResult)).append("\n");
        sb.append("    triggerType: ").append(toIndentedString(triggerType)).append("\n");
        sb.append("    fileDuplicationRatio: ").append(toIndentedString(fileDuplicationRatio)).append("\n");
        sb.append("    newCount: ").append(toIndentedString(newCount)).append("\n");
        sb.append("    solveCount: ").append(toIndentedString(solveCount)).append("\n");
        sb.append("    dismissedCount: ").append(toIndentedString(dismissedCount)).append("\n");
        sb.append("    duplicatedFiles: ").append(toIndentedString(duplicatedFiles)).append("\n");
        sb.append("    newCriticalCount: ").append(toIndentedString(newCriticalCount)).append("\n");
        sb.append("    newMajorCount: ").append(toIndentedString(newMajorCount)).append("\n");
        sb.append("    newMinorCount: ").append(toIndentedString(newMinorCount)).append("\n");
        sb.append("    newSuggestionCount: ").append(toIndentedString(newSuggestionCount)).append("\n");
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
