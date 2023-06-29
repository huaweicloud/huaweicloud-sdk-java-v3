package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AddIssueWorkHoursResponseBodyAddedWorkHours
 */
public class AddIssueWorkHoursResponseBodyAddedWorkHours {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "work_hours_id")

    private String workHoursId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_id")

    private Integer issueId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_nick_name")

    private String userNickName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "work_date")

    private String workDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "work_hours")

    private String workHours;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "work_hours_type_name")

    private String workHoursTypeName;

    public AddIssueWorkHoursResponseBodyAddedWorkHours withWorkHoursId(String workHoursId) {
        this.workHoursId = workHoursId;
        return this;
    }

    /**
     * 工时id
     * @return workHoursId
     */
    public String getWorkHoursId() {
        return workHoursId;
    }

    public void setWorkHoursId(String workHoursId) {
        this.workHoursId = workHoursId;
    }

    public AddIssueWorkHoursResponseBodyAddedWorkHours withIssueId(Integer issueId) {
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

    public AddIssueWorkHoursResponseBodyAddedWorkHours withUserName(String userName) {
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

    public AddIssueWorkHoursResponseBodyAddedWorkHours withUserNickName(String userNickName) {
        this.userNickName = userNickName;
        return this;
    }

    /**
     * 用户昵称
     * @return userNickName
     */
    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName;
    }

    public AddIssueWorkHoursResponseBodyAddedWorkHours withWorkDate(String workDate) {
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

    public AddIssueWorkHoursResponseBodyAddedWorkHours withWorkHours(String workHours) {
        this.workHours = workHours;
        return this;
    }

    /**
     * 工时数
     * @return workHours
     */
    public String getWorkHours() {
        return workHours;
    }

    public void setWorkHours(String workHours) {
        this.workHours = workHours;
    }

    public AddIssueWorkHoursResponseBodyAddedWorkHours withWorkHoursTypeName(String workHoursTypeName) {
        this.workHoursTypeName = workHoursTypeName;
        return this;
    }

    /**
     * 工时类型名称
     * @return workHoursTypeName
     */
    public String getWorkHoursTypeName() {
        return workHoursTypeName;
    }

    public void setWorkHoursTypeName(String workHoursTypeName) {
        this.workHoursTypeName = workHoursTypeName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddIssueWorkHoursResponseBodyAddedWorkHours that = (AddIssueWorkHoursResponseBodyAddedWorkHours) obj;
        return Objects.equals(this.workHoursId, that.workHoursId) && Objects.equals(this.issueId, that.issueId)
            && Objects.equals(this.userName, that.userName) && Objects.equals(this.userNickName, that.userNickName)
            && Objects.equals(this.workDate, that.workDate) && Objects.equals(this.workHours, that.workHours)
            && Objects.equals(this.workHoursTypeName, that.workHoursTypeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workHoursId, issueId, userName, userNickName, workDate, workHours, workHoursTypeName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddIssueWorkHoursResponseBodyAddedWorkHours {\n");
        sb.append("    workHoursId: ").append(toIndentedString(workHoursId)).append("\n");
        sb.append("    issueId: ").append(toIndentedString(issueId)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    userNickName: ").append(toIndentedString(userNickName)).append("\n");
        sb.append("    workDate: ").append(toIndentedString(workDate)).append("\n");
        sb.append("    workHours: ").append(toIndentedString(workHours)).append("\n");
        sb.append("    workHoursTypeName: ").append(toIndentedString(workHoursTypeName)).append("\n");
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
