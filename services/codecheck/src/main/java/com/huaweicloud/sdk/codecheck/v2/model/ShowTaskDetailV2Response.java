package com.huaweicloud.sdk.codecheck.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowTaskDetailV2Response extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="task_id")
    
    private String taskId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="task_name")
    
    private String taskName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="creator_id")
    
    private String creatorId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="git_url")
    
    private String gitUrl;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="git_branch")
    
    private String gitBranch;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="last_check_time")
    
    private String lastCheckTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="code_line_total")
    
    private String codeLineTotal;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="code_line")
    
    private String codeLine;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="code_quality")
    
    private String codeQuality;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="issue_count")
    
    private String issueCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="risk_coefficient")
    
    private String riskCoefficient;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="duplication_ratio")
    
    private String duplicationRatio;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="complexity_count")
    
    private String complexityCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="duplicated_lines")
    
    private String duplicatedLines;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="comment_lines")
    
    private String commentLines;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="comment_ratio")
    
    private String commentRatio;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="duplicated_blocks")
    
    private String duplicatedBlocks;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="last_exec_time")
    
    private String lastExecTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="check_type")
    
    private String checkType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_at")
    
    private String createdAt;

    public ShowTaskDetailV2Response withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    


    /**
     * 任务id
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public ShowTaskDetailV2Response withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    


    /**
     * 任务名字
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public ShowTaskDetailV2Response withCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    


    /**
     * 创建者id
     * @return creatorId
     */
    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public ShowTaskDetailV2Response withGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
        return this;
    }

    


    /**
     * 代码仓地址
     * @return gitUrl
     */
    public String getGitUrl() {
        return gitUrl;
    }

    public void setGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
    }

    public ShowTaskDetailV2Response withGitBranch(String gitBranch) {
        this.gitBranch = gitBranch;
        return this;
    }

    


    /**
     * 代码仓分支
     * @return gitBranch
     */
    public String getGitBranch() {
        return gitBranch;
    }

    public void setGitBranch(String gitBranch) {
        this.gitBranch = gitBranch;
    }

    public ShowTaskDetailV2Response withLastCheckTime(String lastCheckTime) {
        this.lastCheckTime = lastCheckTime;
        return this;
    }

    


    /**
     * 上一次检查时间
     * @return lastCheckTime
     */
    public String getLastCheckTime() {
        return lastCheckTime;
    }

    public void setLastCheckTime(String lastCheckTime) {
        this.lastCheckTime = lastCheckTime;
    }

    public ShowTaskDetailV2Response withCodeLineTotal(String codeLineTotal) {
        this.codeLineTotal = codeLineTotal;
        return this;
    }

    


    /**
     * 代码总行数
     * @return codeLineTotal
     */
    public String getCodeLineTotal() {
        return codeLineTotal;
    }

    public void setCodeLineTotal(String codeLineTotal) {
        this.codeLineTotal = codeLineTotal;
    }

    public ShowTaskDetailV2Response withCodeLine(String codeLine) {
        this.codeLine = codeLine;
        return this;
    }

    


    /**
     * 代码有效行数
     * @return codeLine
     */
    public String getCodeLine() {
        return codeLine;
    }

    public void setCodeLine(String codeLine) {
        this.codeLine = codeLine;
    }

    public ShowTaskDetailV2Response withCodeQuality(String codeQuality) {
        this.codeQuality = codeQuality;
        return this;
    }

    


    /**
     * 代码质量
     * @return codeQuality
     */
    public String getCodeQuality() {
        return codeQuality;
    }

    public void setCodeQuality(String codeQuality) {
        this.codeQuality = codeQuality;
    }

    public ShowTaskDetailV2Response withIssueCount(String issueCount) {
        this.issueCount = issueCount;
        return this;
    }

    


    /**
     * 问题数
     * @return issueCount
     */
    public String getIssueCount() {
        return issueCount;
    }

    public void setIssueCount(String issueCount) {
        this.issueCount = issueCount;
    }

    public ShowTaskDetailV2Response withRiskCoefficient(String riskCoefficient) {
        this.riskCoefficient = riskCoefficient;
        return this;
    }

    


    /**
     * 危险系数
     * @return riskCoefficient
     */
    public String getRiskCoefficient() {
        return riskCoefficient;
    }

    public void setRiskCoefficient(String riskCoefficient) {
        this.riskCoefficient = riskCoefficient;
    }

    public ShowTaskDetailV2Response withDuplicationRatio(String duplicationRatio) {
        this.duplicationRatio = duplicationRatio;
        return this;
    }

    


    /**
     * 重复比例
     * @return duplicationRatio
     */
    public String getDuplicationRatio() {
        return duplicationRatio;
    }

    public void setDuplicationRatio(String duplicationRatio) {
        this.duplicationRatio = duplicationRatio;
    }

    public ShowTaskDetailV2Response withComplexityCount(String complexityCount) {
        this.complexityCount = complexityCount;
        return this;
    }

    


    /**
     * 复杂度
     * @return complexityCount
     */
    public String getComplexityCount() {
        return complexityCount;
    }

    public void setComplexityCount(String complexityCount) {
        this.complexityCount = complexityCount;
    }

    public ShowTaskDetailV2Response withDuplicatedLines(String duplicatedLines) {
        this.duplicatedLines = duplicatedLines;
        return this;
    }

    


    /**
     * 重复行数
     * @return duplicatedLines
     */
    public String getDuplicatedLines() {
        return duplicatedLines;
    }

    public void setDuplicatedLines(String duplicatedLines) {
        this.duplicatedLines = duplicatedLines;
    }

    public ShowTaskDetailV2Response withCommentLines(String commentLines) {
        this.commentLines = commentLines;
        return this;
    }

    


    /**
     * 注释行数
     * @return commentLines
     */
    public String getCommentLines() {
        return commentLines;
    }

    public void setCommentLines(String commentLines) {
        this.commentLines = commentLines;
    }

    public ShowTaskDetailV2Response withCommentRatio(String commentRatio) {
        this.commentRatio = commentRatio;
        return this;
    }

    


    /**
     * 注释比例
     * @return commentRatio
     */
    public String getCommentRatio() {
        return commentRatio;
    }

    public void setCommentRatio(String commentRatio) {
        this.commentRatio = commentRatio;
    }

    public ShowTaskDetailV2Response withDuplicatedBlocks(String duplicatedBlocks) {
        this.duplicatedBlocks = duplicatedBlocks;
        return this;
    }

    


    /**
     * 重复块
     * @return duplicatedBlocks
     */
    public String getDuplicatedBlocks() {
        return duplicatedBlocks;
    }

    public void setDuplicatedBlocks(String duplicatedBlocks) {
        this.duplicatedBlocks = duplicatedBlocks;
    }

    public ShowTaskDetailV2Response withLastExecTime(String lastExecTime) {
        this.lastExecTime = lastExecTime;
        return this;
    }

    


    /**
     * 上次执行时间
     * @return lastExecTime
     */
    public String getLastExecTime() {
        return lastExecTime;
    }

    public void setLastExecTime(String lastExecTime) {
        this.lastExecTime = lastExecTime;
    }

    public ShowTaskDetailV2Response withCheckType(String checkType) {
        this.checkType = checkType;
        return this;
    }

    


    /**
     * 检查类型
     * @return checkType
     */
    public String getCheckType() {
        return checkType;
    }

    public void setCheckType(String checkType) {
        this.checkType = checkType;
    }

    public ShowTaskDetailV2Response withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    


    /**
     * 创建时间
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowTaskDetailV2Response showTaskDetailV2Response = (ShowTaskDetailV2Response) o;
        return Objects.equals(this.taskId, showTaskDetailV2Response.taskId) &&
            Objects.equals(this.taskName, showTaskDetailV2Response.taskName) &&
            Objects.equals(this.creatorId, showTaskDetailV2Response.creatorId) &&
            Objects.equals(this.gitUrl, showTaskDetailV2Response.gitUrl) &&
            Objects.equals(this.gitBranch, showTaskDetailV2Response.gitBranch) &&
            Objects.equals(this.lastCheckTime, showTaskDetailV2Response.lastCheckTime) &&
            Objects.equals(this.codeLineTotal, showTaskDetailV2Response.codeLineTotal) &&
            Objects.equals(this.codeLine, showTaskDetailV2Response.codeLine) &&
            Objects.equals(this.codeQuality, showTaskDetailV2Response.codeQuality) &&
            Objects.equals(this.issueCount, showTaskDetailV2Response.issueCount) &&
            Objects.equals(this.riskCoefficient, showTaskDetailV2Response.riskCoefficient) &&
            Objects.equals(this.duplicationRatio, showTaskDetailV2Response.duplicationRatio) &&
            Objects.equals(this.complexityCount, showTaskDetailV2Response.complexityCount) &&
            Objects.equals(this.duplicatedLines, showTaskDetailV2Response.duplicatedLines) &&
            Objects.equals(this.commentLines, showTaskDetailV2Response.commentLines) &&
            Objects.equals(this.commentRatio, showTaskDetailV2Response.commentRatio) &&
            Objects.equals(this.duplicatedBlocks, showTaskDetailV2Response.duplicatedBlocks) &&
            Objects.equals(this.lastExecTime, showTaskDetailV2Response.lastExecTime) &&
            Objects.equals(this.checkType, showTaskDetailV2Response.checkType) &&
            Objects.equals(this.createdAt, showTaskDetailV2Response.createdAt);
    }
    @Override
    public int hashCode() {
        return Objects.hash(taskId, taskName, creatorId, gitUrl, gitBranch, lastCheckTime, codeLineTotal, codeLine, codeQuality, issueCount, riskCoefficient, duplicationRatio, complexityCount, duplicatedLines, commentLines, commentRatio, duplicatedBlocks, lastExecTime, checkType, createdAt);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTaskDetailV2Response {\n");
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

