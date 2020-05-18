package com.huaweicloud.sdk.classroom.v3.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * ClassroomMember
 */
public class ClassroomMember  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="member_id")
    
    private String memberId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="number")
    
    private String number;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="class_name")
    
    private String className;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_name")
    
    private String userName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="join_time")
    
    private String joinTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_received_count")
    
    private Integer jobReceivedCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_finished_count")
    
    private Integer jobFinishedCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_finished_rate")
    
    private BigDecimal jobFinishedRate = null;

    public ClassroomMember withMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }

    


    /**
     * 成员ID
     * @return memberId
     */
    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public ClassroomMember withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 成员名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClassroomMember withNumber(String number) {
        this.number = number;
        return this;
    }

    


    /**
     * 成员学号/工号
     * @return number
     */
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public ClassroomMember withClassName(String className) {
        this.className = className;
        return this;
    }

    


    /**
     * 成员所在班级的名字
     * @return className
     */
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public ClassroomMember withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    


    /**
     * 成员用户名
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ClassroomMember withJoinTime(String joinTime) {
        this.joinTime = joinTime;
        return this;
    }

    


    /**
     * 成员加入课堂时间，日期格式：yyyy-MM-dd HH:mm:ss
     * @return joinTime
     */
    public String getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(String joinTime) {
        this.joinTime = joinTime;
    }

    public ClassroomMember withJobReceivedCount(Integer jobReceivedCount) {
        this.jobReceivedCount = jobReceivedCount;
        return this;
    }

    


    /**
     * 该成员已接收到的作业数量
     * @return jobReceivedCount
     */
    public Integer getJobReceivedCount() {
        return jobReceivedCount;
    }

    public void setJobReceivedCount(Integer jobReceivedCount) {
        this.jobReceivedCount = jobReceivedCount;
    }

    public ClassroomMember withJobFinishedCount(Integer jobFinishedCount) {
        this.jobFinishedCount = jobFinishedCount;
        return this;
    }

    


    /**
     * 该成员已完成的作业数量
     * @return jobFinishedCount
     */
    public Integer getJobFinishedCount() {
        return jobFinishedCount;
    }

    public void setJobFinishedCount(Integer jobFinishedCount) {
        this.jobFinishedCount = jobFinishedCount;
    }

    public ClassroomMember withJobFinishedRate(BigDecimal jobFinishedRate) {
        this.jobFinishedRate = jobFinishedRate;
        return this;
    }

    


    /**
     * 该成员作业完成率
     * @return jobFinishedRate
     */
    public BigDecimal getJobFinishedRate() {
        return jobFinishedRate;
    }

    public void setJobFinishedRate(BigDecimal jobFinishedRate) {
        this.jobFinishedRate = jobFinishedRate;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ClassroomMember classroomMember = (ClassroomMember) o;
        return Objects.equals(this.memberId, classroomMember.memberId) &&
            Objects.equals(this.name, classroomMember.name) &&
            Objects.equals(this.number, classroomMember.number) &&
            Objects.equals(this.className, classroomMember.className) &&
            Objects.equals(this.userName, classroomMember.userName) &&
            Objects.equals(this.joinTime, classroomMember.joinTime) &&
            Objects.equals(this.jobReceivedCount, classroomMember.jobReceivedCount) &&
            Objects.equals(this.jobFinishedCount, classroomMember.jobFinishedCount) &&
            Objects.equals(this.jobFinishedRate, classroomMember.jobFinishedRate);
    }
    @Override
    public int hashCode() {
        return Objects.hash(memberId, name, number, className, userName, joinTime, jobReceivedCount, jobFinishedCount, jobFinishedRate);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClassroomMember {\n");
            sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    number: ").append(toIndentedString(number)).append("\n");
            sb.append("    className: ").append(toIndentedString(className)).append("\n");
            sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
            sb.append("    joinTime: ").append(toIndentedString(joinTime)).append("\n");
            sb.append("    jobReceivedCount: ").append(toIndentedString(jobReceivedCount)).append("\n");
            sb.append("    jobFinishedCount: ").append(toIndentedString(jobFinishedCount)).append("\n");
            sb.append("    jobFinishedRate: ").append(toIndentedString(jobFinishedRate)).append("\n");
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

