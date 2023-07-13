package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ListWorkTableIssueRequestV4RequestBody
 */
public class ListWorkTableIssueRequestV4RequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subject")

    private String subject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_on")

    private String createdOn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_on")

    private String updatedOn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "closed_on")

    private String closedOn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_date")

    private String startDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "due_date")

    private String dueDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tracker_id")

    private String trackerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_id")

    private String statusId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "author_id")

    private String authorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "developer_id")

    private String developerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority_id")

    private String priorityId;

    public ListWorkTableIssueRequestV4RequestBody withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量,offset是limit的整数倍，limit=10,offset=0,10,20...
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListWorkTableIssueRequestV4RequestBody withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示数量
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListWorkTableIssueRequestV4RequestBody withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * 搜索关键词
     * @return subject
     */
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public ListWorkTableIssueRequestV4RequestBody withCreatedOn(String createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * 工作项创建时间区间
     * @return createdOn
     */
    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public ListWorkTableIssueRequestV4RequestBody withUpdatedOn(String updatedOn) {
        this.updatedOn = updatedOn;
        return this;
    }

    /**
     * 工作项更新时间区间
     * @return updatedOn
     */
    public String getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(String updatedOn) {
        this.updatedOn = updatedOn;
    }

    public ListWorkTableIssueRequestV4RequestBody withClosedOn(String closedOn) {
        this.closedOn = closedOn;
        return this;
    }

    /**
     * 工作项结束时间区间
     * @return closedOn
     */
    public String getClosedOn() {
        return closedOn;
    }

    public void setClosedOn(String closedOn) {
        this.closedOn = closedOn;
    }

    public ListWorkTableIssueRequestV4RequestBody withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * 工作项预计开始日期区间
     * @return startDate
     */
    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public ListWorkTableIssueRequestV4RequestBody withDueDate(String dueDate) {
        this.dueDate = dueDate;
        return this;
    }

    /**
     * 工作项预计结束日期区间
     * @return dueDate
     */
    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public ListWorkTableIssueRequestV4RequestBody withTrackerId(String trackerId) {
        this.trackerId = trackerId;
        return this;
    }

    /**
     * 工作项类型
     * @return trackerId
     */
    public String getTrackerId() {
        return trackerId;
    }

    public void setTrackerId(String trackerId) {
        this.trackerId = trackerId;
    }

    public ListWorkTableIssueRequestV4RequestBody withStatusId(String statusId) {
        this.statusId = statusId;
        return this;
    }

    /**
     * 工作项状态
     * @return statusId
     */
    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public ListWorkTableIssueRequestV4RequestBody withAuthorId(String authorId) {
        this.authorId = authorId;
        return this;
    }

    /**
     * 工作项创建人id
     * @return authorId
     */
    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public ListWorkTableIssueRequestV4RequestBody withDeveloperId(String developerId) {
        this.developerId = developerId;
        return this;
    }

    /**
     * 工作项开发人员id
     * @return developerId
     */
    public String getDeveloperId() {
        return developerId;
    }

    public void setDeveloperId(String developerId) {
        this.developerId = developerId;
    }

    public ListWorkTableIssueRequestV4RequestBody withPriorityId(String priorityId) {
        this.priorityId = priorityId;
        return this;
    }

    /**
     * 工作项优先级id
     * @return priorityId
     */
    public String getPriorityId() {
        return priorityId;
    }

    public void setPriorityId(String priorityId) {
        this.priorityId = priorityId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListWorkTableIssueRequestV4RequestBody that = (ListWorkTableIssueRequestV4RequestBody) obj;
        return Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.subject, that.subject) && Objects.equals(this.createdOn, that.createdOn)
            && Objects.equals(this.updatedOn, that.updatedOn) && Objects.equals(this.closedOn, that.closedOn)
            && Objects.equals(this.startDate, that.startDate) && Objects.equals(this.dueDate, that.dueDate)
            && Objects.equals(this.trackerId, that.trackerId) && Objects.equals(this.statusId, that.statusId)
            && Objects.equals(this.authorId, that.authorId) && Objects.equals(this.developerId, that.developerId)
            && Objects.equals(this.priorityId, that.priorityId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offset,
            limit,
            subject,
            createdOn,
            updatedOn,
            closedOn,
            startDate,
            dueDate,
            trackerId,
            statusId,
            authorId,
            developerId,
            priorityId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListWorkTableIssueRequestV4RequestBody {\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
        sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
        sb.append("    updatedOn: ").append(toIndentedString(updatedOn)).append("\n");
        sb.append("    closedOn: ").append(toIndentedString(closedOn)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
        sb.append("    trackerId: ").append(toIndentedString(trackerId)).append("\n");
        sb.append("    statusId: ").append(toIndentedString(statusId)).append("\n");
        sb.append("    authorId: ").append(toIndentedString(authorId)).append("\n");
        sb.append("    developerId: ").append(toIndentedString(developerId)).append("\n");
        sb.append("    priorityId: ").append(toIndentedString(priorityId)).append("\n");
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
