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
 * MemberJobCard
 */
public class MemberJobCard  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="average_score")
    
    private String averageScore;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="score")
    
    private Integer score;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="send_time")
    
    private String sendTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="last_submit_time")
    
    private String lastSubmitTime;

    public MemberJobCard withName(String name) {
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

    public MemberJobCard withAverageScore(String averageScore) {
        this.averageScore = averageScore;
        return this;
    }

    


    /**
     * 作业均分(作业有均分该字段才返回)
     * @return averageScore
     */
    public String getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(String averageScore) {
        this.averageScore = averageScore;
    }

    public MemberJobCard withScore(Integer score) {
        this.score = score;
        return this;
    }

    


    /**
     * 作业得分(作业有分数该字段才返回)
     * @return score
     */
    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public MemberJobCard withSendTime(String sendTime) {
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

    public MemberJobCard withLastSubmitTime(String lastSubmitTime) {
        this.lastSubmitTime = lastSubmitTime;
        return this;
    }

    


    /**
     * 作业最后一次提交时间, 日期格式：yyyy-MM-dd HH:mm:ss
     * @return lastSubmitTime
     */
    public String getLastSubmitTime() {
        return lastSubmitTime;
    }

    public void setLastSubmitTime(String lastSubmitTime) {
        this.lastSubmitTime = lastSubmitTime;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MemberJobCard memberJobCard = (MemberJobCard) o;
        return Objects.equals(this.name, memberJobCard.name) &&
            Objects.equals(this.averageScore, memberJobCard.averageScore) &&
            Objects.equals(this.score, memberJobCard.score) &&
            Objects.equals(this.sendTime, memberJobCard.sendTime) &&
            Objects.equals(this.lastSubmitTime, memberJobCard.lastSubmitTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, averageScore, score, sendTime, lastSubmitTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MemberJobCard {\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    averageScore: ").append(toIndentedString(averageScore)).append("\n");
            sb.append("    score: ").append(toIndentedString(score)).append("\n");
            sb.append("    sendTime: ").append(toIndentedString(sendTime)).append("\n");
            sb.append("    lastSubmitTime: ").append(toIndentedString(lastSubmitTime)).append("\n");
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

