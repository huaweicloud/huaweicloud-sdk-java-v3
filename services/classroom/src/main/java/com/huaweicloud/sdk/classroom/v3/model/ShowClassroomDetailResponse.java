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
public class ShowClassroomDetailResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="announcement")
    
    private String announcement;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="announcement_time")
    
    private String announcementTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    
    private String createTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="update_time")
    
    private String updateTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="teacher")
    
    private String teacher;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="credit")
    
    private String credit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_time")
    
    private String startTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end_time")
    
    private String endTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="role")
    
    private String role;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="school")
    
    private String school;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="content_count")
    
    private Integer contentCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="courseware_count")
    
    private Integer coursewareCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_count")
    
    private Integer jobCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="member_count")
    
    private Integer memberCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private String status;

    public ShowClassroomDetailResponse withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 课堂名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowClassroomDetailResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 课堂描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowClassroomDetailResponse withAnnouncement(String announcement) {
        this.announcement = announcement;
        return this;
    }

    


    /**
     * 课堂公告
     * @return announcement
     */
    public String getAnnouncement() {
        return announcement;
    }

    public void setAnnouncement(String announcement) {
        this.announcement = announcement;
    }

    public ShowClassroomDetailResponse withAnnouncementTime(String announcementTime) {
        this.announcementTime = announcementTime;
        return this;
    }

    


    /**
     * 课堂公告创建时间，日期格式：yyyy-MM-dd
     * @return announcementTime
     */
    public String getAnnouncementTime() {
        return announcementTime;
    }

    public void setAnnouncementTime(String announcementTime) {
        this.announcementTime = announcementTime;
    }

    public ShowClassroomDetailResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    


    /**
     * 课堂创建时间，日期格式：yyyy-MM-dd HH:mm:ss
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ShowClassroomDetailResponse withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    


    /**
     * 课堂最新更新时间，日期格式：yyyy-MM-dd HH:mm:ss
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public ShowClassroomDetailResponse withTeacher(String teacher) {
        this.teacher = teacher;
        return this;
    }

    


    /**
     * 当前课堂的授课人
     * @return teacher
     */
    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public ShowClassroomDetailResponse withCredit(String credit) {
        this.credit = credit;
        return this;
    }

    


    /**
     * 课堂学分
     * @return credit
     */
    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public ShowClassroomDetailResponse withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    


    /**
     * 课堂开始时间，日期格式：yyyy-MM-dd HH:mm:ss
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ShowClassroomDetailResponse withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    


    /**
     * 课堂结束时间，日期格式：yyyy-MM-dd HH:mm:ss
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ShowClassroomDetailResponse withRole(String role) {
        this.role = role;
        return this;
    }

    


    /**
     * 当前用户在课堂下角色，取值范围：teacher：老师，student：学生
     * @return role
     */
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public ShowClassroomDetailResponse withSchool(String school) {
        this.school = school;
        return this;
    }

    


    /**
     * 授课学校
     * @return school
     */
    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public ShowClassroomDetailResponse withContentCount(Integer contentCount) {
        this.contentCount = contentCount;
        return this;
    }

    


    /**
     * 课堂下目录数量
     * @return contentCount
     */
    public Integer getContentCount() {
        return contentCount;
    }

    public void setContentCount(Integer contentCount) {
        this.contentCount = contentCount;
    }

    public ShowClassroomDetailResponse withCoursewareCount(Integer coursewareCount) {
        this.coursewareCount = coursewareCount;
        return this;
    }

    


    /**
     * 课堂下课件数量
     * @return coursewareCount
     */
    public Integer getCoursewareCount() {
        return coursewareCount;
    }

    public void setCoursewareCount(Integer coursewareCount) {
        this.coursewareCount = coursewareCount;
    }

    public ShowClassroomDetailResponse withJobCount(Integer jobCount) {
        this.jobCount = jobCount;
        return this;
    }

    


    /**
     * 课堂下作业数量
     * @return jobCount
     */
    public Integer getJobCount() {
        return jobCount;
    }

    public void setJobCount(Integer jobCount) {
        this.jobCount = jobCount;
    }

    public ShowClassroomDetailResponse withMemberCount(Integer memberCount) {
        this.memberCount = memberCount;
        return this;
    }

    


    /**
     * 课堂下成员数量
     * @return memberCount
     */
    public Integer getMemberCount() {
        return memberCount;
    }

    public void setMemberCount(Integer memberCount) {
        this.memberCount = memberCount;
    }

    public ShowClassroomDetailResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 课堂当前的状态，normal：课堂处于正常状态，archive：课堂已归档
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowClassroomDetailResponse showClassroomDetailResponse = (ShowClassroomDetailResponse) o;
        return Objects.equals(this.name, showClassroomDetailResponse.name) &&
            Objects.equals(this.description, showClassroomDetailResponse.description) &&
            Objects.equals(this.announcement, showClassroomDetailResponse.announcement) &&
            Objects.equals(this.announcementTime, showClassroomDetailResponse.announcementTime) &&
            Objects.equals(this.createTime, showClassroomDetailResponse.createTime) &&
            Objects.equals(this.updateTime, showClassroomDetailResponse.updateTime) &&
            Objects.equals(this.teacher, showClassroomDetailResponse.teacher) &&
            Objects.equals(this.credit, showClassroomDetailResponse.credit) &&
            Objects.equals(this.startTime, showClassroomDetailResponse.startTime) &&
            Objects.equals(this.endTime, showClassroomDetailResponse.endTime) &&
            Objects.equals(this.role, showClassroomDetailResponse.role) &&
            Objects.equals(this.school, showClassroomDetailResponse.school) &&
            Objects.equals(this.contentCount, showClassroomDetailResponse.contentCount) &&
            Objects.equals(this.coursewareCount, showClassroomDetailResponse.coursewareCount) &&
            Objects.equals(this.jobCount, showClassroomDetailResponse.jobCount) &&
            Objects.equals(this.memberCount, showClassroomDetailResponse.memberCount) &&
            Objects.equals(this.status, showClassroomDetailResponse.status);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, description, announcement, announcementTime, createTime, updateTime, teacher, credit, startTime, endTime, role, school, contentCount, coursewareCount, jobCount, memberCount, status);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowClassroomDetailResponse {\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    description: ").append(toIndentedString(description)).append("\n");
            sb.append("    announcement: ").append(toIndentedString(announcement)).append("\n");
            sb.append("    announcementTime: ").append(toIndentedString(announcementTime)).append("\n");
            sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
            sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
            sb.append("    teacher: ").append(toIndentedString(teacher)).append("\n");
            sb.append("    credit: ").append(toIndentedString(credit)).append("\n");
            sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
            sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
            sb.append("    role: ").append(toIndentedString(role)).append("\n");
            sb.append("    school: ").append(toIndentedString(school)).append("\n");
            sb.append("    contentCount: ").append(toIndentedString(contentCount)).append("\n");
            sb.append("    coursewareCount: ").append(toIndentedString(coursewareCount)).append("\n");
            sb.append("    jobCount: ").append(toIndentedString(jobCount)).append("\n");
            sb.append("    memberCount: ").append(toIndentedString(memberCount)).append("\n");
            sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

