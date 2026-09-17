package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BatchDeletesResponseResultDeleteIssueDelIssue
 */
public class BatchDeletesResponseResultDeleteIssueDelIssue {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tracker_id")

    private Integer trackerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subject")

    private String subject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_id")

    private Integer statusId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "done_ratio")

    private Integer doneRatio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expected_work_hours")

    private Integer expectedWorkHours;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actual_work_hours")

    private Integer actualWorkHours;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deleted")

    private Boolean deleted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_archived")

    private Boolean isArchived;

    public BatchDeletesResponseResultDeleteIssueDelIssue withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 工作项id。 **取值范围：** 不涉及。
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BatchDeletesResponseResultDeleteIssueDelIssue withTrackerId(Integer trackerId) {
        this.trackerId = trackerId;
        return this;
    }

    /**
     * **参数解释：** 工作项类型。 **取值范围：** 2（任务/Task） 3（缺陷/Bug） 5（Epic） 6（Feature） 7（Story）
     * @return trackerId
     */
    public Integer getTrackerId() {
        return trackerId;
    }

    public void setTrackerId(Integer trackerId) {
        this.trackerId = trackerId;
    }

    public BatchDeletesResponseResultDeleteIssueDelIssue withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * **参数解释：** 工作项名称 。 **取值范围：** 不涉及。
     * @return subject
     */
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public BatchDeletesResponseResultDeleteIssueDelIssue withStatusId(Integer statusId) {
        this.statusId = statusId;
        return this;
    }

    /**
     * **参数解释：** 工作项状态id 。 **取值范围：** 不涉及。
     * @return statusId
     */
    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public BatchDeletesResponseResultDeleteIssueDelIssue withDoneRatio(Integer doneRatio) {
        this.doneRatio = doneRatio;
        return this;
    }

    /**
     * **参数解释：** 工作项完成度。 **取值范围：** 不涉及。
     * @return doneRatio
     */
    public Integer getDoneRatio() {
        return doneRatio;
    }

    public void setDoneRatio(Integer doneRatio) {
        this.doneRatio = doneRatio;
    }

    public BatchDeletesResponseResultDeleteIssueDelIssue withExpectedWorkHours(Integer expectedWorkHours) {
        this.expectedWorkHours = expectedWorkHours;
        return this;
    }

    /**
     * **参数解释：** 预计工时(单位：人时)。 **取值范围：** 不涉及。
     * @return expectedWorkHours
     */
    public Integer getExpectedWorkHours() {
        return expectedWorkHours;
    }

    public void setExpectedWorkHours(Integer expectedWorkHours) {
        this.expectedWorkHours = expectedWorkHours;
    }

    public BatchDeletesResponseResultDeleteIssueDelIssue withActualWorkHours(Integer actualWorkHours) {
        this.actualWorkHours = actualWorkHours;
        return this;
    }

    /**
     * **参数解释：** 实际工时(单位：人时)。 **取值范围：** 不涉及。
     * @return actualWorkHours
     */
    public Integer getActualWorkHours() {
        return actualWorkHours;
    }

    public void setActualWorkHours(Integer actualWorkHours) {
        this.actualWorkHours = actualWorkHours;
    }

    public BatchDeletesResponseResultDeleteIssueDelIssue withDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    /**
     * **参数解释：** 是否完成删除。 **取值范围：** 0（未删除） 1（已删除）
     * @return deleted
     */
    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public BatchDeletesResponseResultDeleteIssueDelIssue withIsArchived(Boolean isArchived) {
        this.isArchived = isArchived;
        return this;
    }

    /**
     * **参数解释：** 是否归档。 **取值范围：** 0（未归档） 1（已归档）
     * @return isArchived
     */
    public Boolean getIsArchived() {
        return isArchived;
    }

    public void setIsArchived(Boolean isArchived) {
        this.isArchived = isArchived;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDeletesResponseResultDeleteIssueDelIssue that = (BatchDeletesResponseResultDeleteIssueDelIssue) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.trackerId, that.trackerId)
            && Objects.equals(this.subject, that.subject) && Objects.equals(this.statusId, that.statusId)
            && Objects.equals(this.doneRatio, that.doneRatio)
            && Objects.equals(this.expectedWorkHours, that.expectedWorkHours)
            && Objects.equals(this.actualWorkHours, that.actualWorkHours) && Objects.equals(this.deleted, that.deleted)
            && Objects.equals(this.isArchived, that.isArchived);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, trackerId, subject, statusId, doneRatio, expectedWorkHours, actualWorkHours, deleted, isArchived);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeletesResponseResultDeleteIssueDelIssue {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    trackerId: ").append(toIndentedString(trackerId)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
        sb.append("    statusId: ").append(toIndentedString(statusId)).append("\n");
        sb.append("    doneRatio: ").append(toIndentedString(doneRatio)).append("\n");
        sb.append("    expectedWorkHours: ").append(toIndentedString(expectedWorkHours)).append("\n");
        sb.append("    actualWorkHours: ").append(toIndentedString(actualWorkHours)).append("\n");
        sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
        sb.append("    isArchived: ").append(toIndentedString(isArchived)).append("\n");
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
