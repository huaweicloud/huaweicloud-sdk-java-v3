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
 * Response Object
 */
public class ShowJobDetailResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="accept_job_num")
    
    private Integer acceptJobNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end_time")
    
    private String endTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_answer_visibility")
    
    private String isAnswerVisibility;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_score_visibility")
    
    private String isScoreVisibility;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="average_score")
    
    private String averageScore;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="score_job_num")
    
    private Integer scoreJobNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="submit_job_num")
    
    private Integer submitJobNum;

    public ShowJobDetailResponse withAcceptJobNum(Integer acceptJobNum) {
        this.acceptJobNum = acceptJobNum;
        return this;
    }

    


    /**
     * 作业下发人数
     * @return acceptJobNum
     */
    public Integer getAcceptJobNum() {
        return acceptJobNum;
    }

    public void setAcceptJobNum(Integer acceptJobNum) {
        this.acceptJobNum = acceptJobNum;
    }

    public ShowJobDetailResponse withEndTime(String endTime) {
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

    public ShowJobDetailResponse withIsAnswerVisibility(String isAnswerVisibility) {
        this.isAnswerVisibility = isAnswerVisibility;
        return this;
    }

    


    /**
     * 作业答案是否公布(unpublish:表示未公布答案, publish:表示已公布答案)
     * @return isAnswerVisibility
     */
    public String getIsAnswerVisibility() {
        return isAnswerVisibility;
    }

    public void setIsAnswerVisibility(String isAnswerVisibility) {
        this.isAnswerVisibility = isAnswerVisibility;
    }

    public ShowJobDetailResponse withIsScoreVisibility(String isScoreVisibility) {
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

    public ShowJobDetailResponse withAverageScore(String averageScore) {
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

    public ShowJobDetailResponse withScoreJobNum(Integer scoreJobNum) {
        this.scoreJobNum = scoreJobNum;
        return this;
    }

    


    /**
     * 老师手动评分人数
     * @return scoreJobNum
     */
    public Integer getScoreJobNum() {
        return scoreJobNum;
    }

    public void setScoreJobNum(Integer scoreJobNum) {
        this.scoreJobNum = scoreJobNum;
    }

    public ShowJobDetailResponse withSubmitJobNum(Integer submitJobNum) {
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
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowJobDetailResponse showJobDetailResponse = (ShowJobDetailResponse) o;
        return Objects.equals(this.acceptJobNum, showJobDetailResponse.acceptJobNum) &&
            Objects.equals(this.endTime, showJobDetailResponse.endTime) &&
            Objects.equals(this.isAnswerVisibility, showJobDetailResponse.isAnswerVisibility) &&
            Objects.equals(this.isScoreVisibility, showJobDetailResponse.isScoreVisibility) &&
            Objects.equals(this.averageScore, showJobDetailResponse.averageScore) &&
            Objects.equals(this.scoreJobNum, showJobDetailResponse.scoreJobNum) &&
            Objects.equals(this.submitJobNum, showJobDetailResponse.submitJobNum);
    }
    @Override
    public int hashCode() {
        return Objects.hash(acceptJobNum, endTime, isAnswerVisibility, isScoreVisibility, averageScore, scoreJobNum, submitJobNum);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowJobDetailResponse {\n");
            sb.append("    acceptJobNum: ").append(toIndentedString(acceptJobNum)).append("\n");
            sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
            sb.append("    isAnswerVisibility: ").append(toIndentedString(isAnswerVisibility)).append("\n");
            sb.append("    isScoreVisibility: ").append(toIndentedString(isScoreVisibility)).append("\n");
            sb.append("    averageScore: ").append(toIndentedString(averageScore)).append("\n");
            sb.append("    scoreJobNum: ").append(toIndentedString(scoreJobNum)).append("\n");
            sb.append("    submitJobNum: ").append(toIndentedString(submitJobNum)).append("\n");
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

