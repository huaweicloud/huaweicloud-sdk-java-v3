package com.huaweicloud.sdk.classroom.v3.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * JobRecords
 */
public class JobRecords  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="auto_score")
    
    private Integer autoScore;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="case_pass_count")
    
    private Integer casePassCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="exe_case_count")
    
    private Integer exeCaseCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="code_line")
    
    private Integer codeLine;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="commit_time")
    
    private String commitTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="complexity_file_avg")
    
    private String complexityFileAvg;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="auto_score_using_time")
    
    private Integer autoScoreUsingTime;

    public JobRecords withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 第XX次提交
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JobRecords withAutoScore(Integer autoScore) {
        this.autoScore = autoScore;
        return this;
    }

    


    /**
     * 习题判题得分
     * @return autoScore
     */
    public Integer getAutoScore() {
        return autoScore;
    }

    public void setAutoScore(Integer autoScore) {
        this.autoScore = autoScore;
    }

    public JobRecords withCasePassCount(Integer casePassCount) {
        this.casePassCount = casePassCount;
        return this;
    }

    


    /**
     * 习题用例通过数
     * @return casePassCount
     */
    public Integer getCasePassCount() {
        return casePassCount;
    }

    public void setCasePassCount(Integer casePassCount) {
        this.casePassCount = casePassCount;
    }

    public JobRecords withExeCaseCount(Integer exeCaseCount) {
        this.exeCaseCount = exeCaseCount;
        return this;
    }

    


    /**
     * 习题用例总数
     * @return exeCaseCount
     */
    public Integer getExeCaseCount() {
        return exeCaseCount;
    }

    public void setExeCaseCount(Integer exeCaseCount) {
        this.exeCaseCount = exeCaseCount;
    }

    public JobRecords withCodeLine(Integer codeLine) {
        this.codeLine = codeLine;
        return this;
    }

    


    /**
     * 代码行数
     * @return codeLine
     */
    public Integer getCodeLine() {
        return codeLine;
    }

    public void setCodeLine(Integer codeLine) {
        this.codeLine = codeLine;
    }

    public JobRecords withCommitTime(String commitTime) {
        this.commitTime = commitTime;
        return this;
    }

    


    /**
     * 习题提交时间, 日期格式：yyyy-MM-dd HH:mm:ss
     * @return commitTime
     */
    public String getCommitTime() {
        return commitTime;
    }

    public void setCommitTime(String commitTime) {
        this.commitTime = commitTime;
    }

    public JobRecords withComplexityFileAvg(String complexityFileAvg) {
        this.complexityFileAvg = complexityFileAvg;
        return this;
    }

    


    /**
     * 习题圈复杂度
     * @return complexityFileAvg
     */
    public String getComplexityFileAvg() {
        return complexityFileAvg;
    }

    public void setComplexityFileAvg(String complexityFileAvg) {
        this.complexityFileAvg = complexityFileAvg;
    }

    public JobRecords withAutoScoreUsingTime(Integer autoScoreUsingTime) {
        this.autoScoreUsingTime = autoScoreUsingTime;
        return this;
    }

    


    /**
     * 习题判题耗时(毫秒)
     * @return autoScoreUsingTime
     */
    public Integer getAutoScoreUsingTime() {
        return autoScoreUsingTime;
    }

    public void setAutoScoreUsingTime(Integer autoScoreUsingTime) {
        this.autoScoreUsingTime = autoScoreUsingTime;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JobRecords jobRecords = (JobRecords) o;
        return Objects.equals(this.name, jobRecords.name) &&
            Objects.equals(this.autoScore, jobRecords.autoScore) &&
            Objects.equals(this.casePassCount, jobRecords.casePassCount) &&
            Objects.equals(this.exeCaseCount, jobRecords.exeCaseCount) &&
            Objects.equals(this.codeLine, jobRecords.codeLine) &&
            Objects.equals(this.commitTime, jobRecords.commitTime) &&
            Objects.equals(this.complexityFileAvg, jobRecords.complexityFileAvg) &&
            Objects.equals(this.autoScoreUsingTime, jobRecords.autoScoreUsingTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, autoScore, casePassCount, exeCaseCount, codeLine, commitTime, complexityFileAvg, autoScoreUsingTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobRecords {\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    autoScore: ").append(toIndentedString(autoScore)).append("\n");
            sb.append("    casePassCount: ").append(toIndentedString(casePassCount)).append("\n");
            sb.append("    exeCaseCount: ").append(toIndentedString(exeCaseCount)).append("\n");
            sb.append("    codeLine: ").append(toIndentedString(codeLine)).append("\n");
            sb.append("    commitTime: ").append(toIndentedString(commitTime)).append("\n");
            sb.append("    complexityFileAvg: ").append(toIndentedString(complexityFileAvg)).append("\n");
            sb.append("    autoScoreUsingTime: ").append(toIndentedString(autoScoreUsingTime)).append("\n");
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

