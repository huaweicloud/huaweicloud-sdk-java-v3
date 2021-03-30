package com.huaweicloud.sdk.projectman.v4.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ShowProjectWorkHoursResponseBodyWorkHours
 */
public class ShowProjectWorkHoursResponseBodyWorkHours  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_name")
    
    private String projectName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="nick_name")
    
    private String nickName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_name")
    
    private String userName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="work_date")
    
    private String workDate;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="work_hours_num")
    
    private String workHoursNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="summary")
    
    private String summary;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="work_hours_type_name")
    
    private String workHoursTypeName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="issue_id")
    
    private Integer issueId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="issue_type")
    
    private String issueType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subject")
    
    private String subject;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_time")
    
    private String createdTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="closed_time")
    
    private String closedTime;

    public ShowProjectWorkHoursResponseBodyWorkHours withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    


    /**
     * 项目名称
     * @return projectName
     */
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    

    public ShowProjectWorkHoursResponseBodyWorkHours withNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    


    /**
     * 用户昵称
     * @return nickName
     */
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    

    public ShowProjectWorkHoursResponseBodyWorkHours withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    


    /**
     * 用户名
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    

    public ShowProjectWorkHoursResponseBodyWorkHours withWorkDate(String workDate) {
        this.workDate = workDate;
        return this;
    }

    


    /**
     * 工时日期
     * @return workDate
     */
    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    

    public ShowProjectWorkHoursResponseBodyWorkHours withWorkHoursNum(String workHoursNum) {
        this.workHoursNum = workHoursNum;
        return this;
    }

    


    /**
     * 工时花费
     * @return workHoursNum
     */
    public String getWorkHoursNum() {
        return workHoursNum;
    }

    public void setWorkHoursNum(String workHoursNum) {
        this.workHoursNum = workHoursNum;
    }

    

    public ShowProjectWorkHoursResponseBodyWorkHours withSummary(String summary) {
        this.summary = summary;
        return this;
    }

    


    /**
     * 工时内容
     * @return summary
     */
    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    

    public ShowProjectWorkHoursResponseBodyWorkHours withWorkHoursTypeName(String workHoursTypeName) {
        this.workHoursTypeName = workHoursTypeName;
        return this;
    }

    


    /**
     * 工时类型
     * @return workHoursTypeName
     */
    public String getWorkHoursTypeName() {
        return workHoursTypeName;
    }

    public void setWorkHoursTypeName(String workHoursTypeName) {
        this.workHoursTypeName = workHoursTypeName;
    }

    

    public ShowProjectWorkHoursResponseBodyWorkHours withIssueId(Integer issueId) {
        this.issueId = issueId;
        return this;
    }

    


    /**
     * 工作项id
     * @return issueId
     */
    public Integer getIssueId() {
        return issueId;
    }

    public void setIssueId(Integer issueId) {
        this.issueId = issueId;
    }

    

    public ShowProjectWorkHoursResponseBodyWorkHours withIssueType(String issueType) {
        this.issueType = issueType;
        return this;
    }

    


    /**
     * 工作项类型
     * @return issueType
     */
    public String getIssueType() {
        return issueType;
    }

    public void setIssueType(String issueType) {
        this.issueType = issueType;
    }

    

    public ShowProjectWorkHoursResponseBodyWorkHours withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    


    /**
     * 工作项标题
     * @return subject
     */
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    

    public ShowProjectWorkHoursResponseBodyWorkHours withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    


    /**
     * 工作项创建时间
     * @return createdTime
     */
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    

    public ShowProjectWorkHoursResponseBodyWorkHours withClosedTime(String closedTime) {
        this.closedTime = closedTime;
        return this;
    }

    


    /**
     * 工作项结束时间
     * @return closedTime
     */
    public String getClosedTime() {
        return closedTime;
    }

    public void setClosedTime(String closedTime) {
        this.closedTime = closedTime;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowProjectWorkHoursResponseBodyWorkHours showProjectWorkHoursResponseBodyWorkHours = (ShowProjectWorkHoursResponseBodyWorkHours) o;
        return Objects.equals(this.projectName, showProjectWorkHoursResponseBodyWorkHours.projectName) &&
            Objects.equals(this.nickName, showProjectWorkHoursResponseBodyWorkHours.nickName) &&
            Objects.equals(this.userName, showProjectWorkHoursResponseBodyWorkHours.userName) &&
            Objects.equals(this.workDate, showProjectWorkHoursResponseBodyWorkHours.workDate) &&
            Objects.equals(this.workHoursNum, showProjectWorkHoursResponseBodyWorkHours.workHoursNum) &&
            Objects.equals(this.summary, showProjectWorkHoursResponseBodyWorkHours.summary) &&
            Objects.equals(this.workHoursTypeName, showProjectWorkHoursResponseBodyWorkHours.workHoursTypeName) &&
            Objects.equals(this.issueId, showProjectWorkHoursResponseBodyWorkHours.issueId) &&
            Objects.equals(this.issueType, showProjectWorkHoursResponseBodyWorkHours.issueType) &&
            Objects.equals(this.subject, showProjectWorkHoursResponseBodyWorkHours.subject) &&
            Objects.equals(this.createdTime, showProjectWorkHoursResponseBodyWorkHours.createdTime) &&
            Objects.equals(this.closedTime, showProjectWorkHoursResponseBodyWorkHours.closedTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(projectName, nickName, userName, workDate, workHoursNum, summary, workHoursTypeName, issueId, issueType, subject, createdTime, closedTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowProjectWorkHoursResponseBodyWorkHours {\n");
        sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
        sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    workDate: ").append(toIndentedString(workDate)).append("\n");
        sb.append("    workHoursNum: ").append(toIndentedString(workHoursNum)).append("\n");
        sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
        sb.append("    workHoursTypeName: ").append(toIndentedString(workHoursTypeName)).append("\n");
        sb.append("    issueId: ").append(toIndentedString(issueId)).append("\n");
        sb.append("    issueType: ").append(toIndentedString(issueType)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    closedTime: ").append(toIndentedString(closedTime)).append("\n");
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

