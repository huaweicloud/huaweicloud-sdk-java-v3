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
 * JobCard
 */
public class JobCard  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_id")
    
    private String jobId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_send")
    
    private String isSend;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end_time")
    
    private String endTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="average_score")
    
    private String averageScore;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="submit_job_num")
    
    private Integer submitJobNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_status")
    
    private String createStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="send_type")
    
    private String sendType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_score_visibility")
    
    private String isScoreVisibility;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="send_time")
    
    private String sendTime;

    public JobCard withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 作业名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JobCard withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    


    /**
     * 作业ID
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public JobCard withIsSend(String isSend) {
        this.isSend = isSend;
        return this;
    }

    


    /**
     * 作业下发状态(unsend:作业未下发, send:作业已下发)
     * @return isSend
     */
    public String getIsSend() {
        return isSend;
    }

    public void setIsSend(String isSend) {
        this.isSend = isSend;
    }

    public JobCard withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    


    /**
     * 作业截止时间, 日期格式：yyyy-MM-dd HH:mm:ss
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public JobCard withAverageScore(String averageScore) {
        this.averageScore = averageScore;
        return this;
    }

    


    /**
     * 作业均分
     * @return averageScore
     */
    public String getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(String averageScore) {
        this.averageScore = averageScore;
    }

    public JobCard withSubmitJobNum(Integer submitJobNum) {
        this.submitJobNum = submitJobNum;
        return this;
    }

    


    /**
     * 作业提交人数
     * @return submitJobNum
     */
    public Integer getSubmitJobNum() {
        return submitJobNum;
    }

    public void setSubmitJobNum(Integer submitJobNum) {
        this.submitJobNum = submitJobNum;
    }

    public JobCard withCreateStatus(String createStatus) {
        this.createStatus = createStatus;
        return this;
    }

    


    /**
     * 作业创建状态(yes:作业可以下发, no:作业不能下发)
     * @return createStatus
     */
    public String getCreateStatus() {
        return createStatus;
    }

    public void setCreateStatus(String createStatus) {
        this.createStatus = createStatus;
    }

    public JobCard withSendType(String sendType) {
        this.sendType = sendType;
        return this;
    }

    


    /**
     * 作业下发类型(specific:指定成员下发, all:下发课堂全员)
     * @return sendType
     */
    public String getSendType() {
        return sendType;
    }

    public void setSendType(String sendType) {
        this.sendType = sendType;
    }

    public JobCard withIsScoreVisibility(String isScoreVisibility) {
        this.isScoreVisibility = isScoreVisibility;
        return this;
    }

    


    /**
     * 作业成绩是否公布(unpublish:表示未公布成绩, publish:表示已公布成绩)
     * @return isScoreVisibility
     */
    public String getIsScoreVisibility() {
        return isScoreVisibility;
    }

    public void setIsScoreVisibility(String isScoreVisibility) {
        this.isScoreVisibility = isScoreVisibility;
    }

    public JobCard withSendTime(String sendTime) {
        this.sendTime = sendTime;
        return this;
    }

    


    /**
     * 作业下发时间, 日期格式：yyyy-MM-dd HH:mm:ss
     * @return sendTime
     */
    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JobCard jobCard = (JobCard) o;
        return Objects.equals(this.name, jobCard.name) &&
            Objects.equals(this.jobId, jobCard.jobId) &&
            Objects.equals(this.isSend, jobCard.isSend) &&
            Objects.equals(this.endTime, jobCard.endTime) &&
            Objects.equals(this.averageScore, jobCard.averageScore) &&
            Objects.equals(this.submitJobNum, jobCard.submitJobNum) &&
            Objects.equals(this.createStatus, jobCard.createStatus) &&
            Objects.equals(this.sendType, jobCard.sendType) &&
            Objects.equals(this.isScoreVisibility, jobCard.isScoreVisibility) &&
            Objects.equals(this.sendTime, jobCard.sendTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, jobId, isSend, endTime, averageScore, submitJobNum, createStatus, sendType, isScoreVisibility, sendTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobCard {\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
            sb.append("    isSend: ").append(toIndentedString(isSend)).append("\n");
            sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
            sb.append("    averageScore: ").append(toIndentedString(averageScore)).append("\n");
            sb.append("    submitJobNum: ").append(toIndentedString(submitJobNum)).append("\n");
            sb.append("    createStatus: ").append(toIndentedString(createStatus)).append("\n");
            sb.append("    sendType: ").append(toIndentedString(sendType)).append("\n");
            sb.append("    isScoreVisibility: ").append(toIndentedString(isScoreVisibility)).append("\n");
            sb.append("    sendTime: ").append(toIndentedString(sendTime)).append("\n");
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

