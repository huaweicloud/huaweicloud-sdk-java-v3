package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ReviewEntity
 */
public class ReviewEntity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number")

    private String number;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_by")

    private UserEntity createdBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_by")

    private UserEntity modifiedBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assigned_cc")

    private List<UserEntity> assignedCc = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private String createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_time")

    private String modifiedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_end_date")

    private String planEndDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_start_date")

    private String planStartDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "close_time")

    private String closeTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEntity status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "closed_time")

    private String closedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approver")

    private String approver;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reviewer")

    private String reviewer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cos")

    private List<COEntity> cos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ccbs")

    private List<CcbEntity> ccbs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "old_status")

    private StatusEntity oldStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cc")

    private List<UserEntity> cc = null;

    public ReviewEntity withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 评审单ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ReviewEntity withNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * 评审单编号。
     * @return number
     */
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public ReviewEntity withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 评审单的生命周期。
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public ReviewEntity withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 评审单标题。
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ReviewEntity withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * 评审单类别。
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ReviewEntity withCreatedBy(UserEntity createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public ReviewEntity withCreatedBy(Consumer<UserEntity> createdBySetter) {
        if (this.createdBy == null) {
            this.createdBy = new UserEntity();
            createdBySetter.accept(this.createdBy);
        }

        return this;
    }

    /**
     * Get createdBy
     * @return createdBy
     */
    public UserEntity getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(UserEntity createdBy) {
        this.createdBy = createdBy;
    }

    public ReviewEntity withModifiedBy(UserEntity modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    public ReviewEntity withModifiedBy(Consumer<UserEntity> modifiedBySetter) {
        if (this.modifiedBy == null) {
            this.modifiedBy = new UserEntity();
            modifiedBySetter.accept(this.modifiedBy);
        }

        return this;
    }

    /**
     * Get modifiedBy
     * @return modifiedBy
     */
    public UserEntity getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(UserEntity modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public ReviewEntity withAssignedCc(List<UserEntity> assignedCc) {
        this.assignedCc = assignedCc;
        return this;
    }

    public ReviewEntity addAssignedCcItem(UserEntity assignedCcItem) {
        if (this.assignedCc == null) {
            this.assignedCc = new ArrayList<>();
        }
        this.assignedCc.add(assignedCcItem);
        return this;
    }

    public ReviewEntity withAssignedCc(Consumer<List<UserEntity>> assignedCcSetter) {
        if (this.assignedCc == null) {
            this.assignedCc = new ArrayList<>();
        }
        assignedCcSetter.accept(this.assignedCc);
        return this;
    }

    /**
     * 评审单抄送人。
     * @return assignedCc
     */
    public List<UserEntity> getAssignedCc() {
        return assignedCc;
    }

    public void setAssignedCc(List<UserEntity> assignedCc) {
        this.assignedCc = assignedCc;
    }

    public ReviewEntity withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * 评审单创建时间戳。
     * @return createdTime
     */
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public ReviewEntity withModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }

    /**
     * 评审单最后修改时间戳。
     * @return modifiedTime
     */
    public String getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public ReviewEntity withPlanEndDate(String planEndDate) {
        this.planEndDate = planEndDate;
        return this;
    }

    /**
     * 计划完成日期时间戳。
     * @return planEndDate
     */
    public String getPlanEndDate() {
        return planEndDate;
    }

    public void setPlanEndDate(String planEndDate) {
        this.planEndDate = planEndDate;
    }

    public ReviewEntity withPlanStartDate(String planStartDate) {
        this.planStartDate = planStartDate;
        return this;
    }

    /**
     * 计划开始日期时间戳。
     * @return planStartDate
     */
    public String getPlanStartDate() {
        return planStartDate;
    }

    public void setPlanStartDate(String planStartDate) {
        this.planStartDate = planStartDate;
    }

    public ReviewEntity withCloseTime(String closeTime) {
        this.closeTime = closeTime;
        return this;
    }

    /**
     * 评审单完成时间。
     * @return closeTime
     */
    public String getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(String closeTime) {
        this.closeTime = closeTime;
    }

    public ReviewEntity withStatus(StatusEntity status) {
        this.status = status;
        return this;
    }

    public ReviewEntity withStatus(Consumer<StatusEntity> statusSetter) {
        if (this.status == null) {
            this.status = new StatusEntity();
            statusSetter.accept(this.status);
        }

        return this;
    }

    /**
     * Get status
     * @return status
     */
    public StatusEntity getStatus() {
        return status;
    }

    public void setStatus(StatusEntity status) {
        this.status = status;
    }

    public ReviewEntity withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 评审单描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ReviewEntity withClosedTime(String closedTime) {
        this.closedTime = closedTime;
        return this;
    }

    /**
     * 评审单完成时间。
     * @return closedTime
     */
    public String getClosedTime() {
        return closedTime;
    }

    public void setClosedTime(String closedTime) {
        this.closedTime = closedTime;
    }

    public ReviewEntity withApprover(String approver) {
        this.approver = approver;
        return this;
    }

    /**
     * 决策人ID。
     * @return approver
     */
    public String getApprover() {
        return approver;
    }

    public void setApprover(String approver) {
        this.approver = approver;
    }

    public ReviewEntity withReviewer(String reviewer) {
        this.reviewer = reviewer;
        return this;
    }

    /**
     * 评审专家ID。
     * @return reviewer
     */
    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public ReviewEntity withCos(List<COEntity> cos) {
        this.cos = cos;
        return this;
    }

    public ReviewEntity addCosItem(COEntity cosItem) {
        if (this.cos == null) {
            this.cos = new ArrayList<>();
        }
        this.cos.add(cosItem);
        return this;
    }

    public ReviewEntity withCos(Consumer<List<COEntity>> cosSetter) {
        if (this.cos == null) {
            this.cos = new ArrayList<>();
        }
        cosSetter.accept(this.cos);
        return this;
    }

    /**
     * 评审对象列表。
     * @return cos
     */
    public List<COEntity> getCos() {
        return cos;
    }

    public void setCos(List<COEntity> cos) {
        this.cos = cos;
    }

    public ReviewEntity withCcbs(List<CcbEntity> ccbs) {
        this.ccbs = ccbs;
        return this;
    }

    public ReviewEntity addCcbsItem(CcbEntity ccbsItem) {
        if (this.ccbs == null) {
            this.ccbs = new ArrayList<>();
        }
        this.ccbs.add(ccbsItem);
        return this;
    }

    public ReviewEntity withCcbs(Consumer<List<CcbEntity>> ccbsSetter) {
        if (this.ccbs == null) {
            this.ccbs = new ArrayList<>();
        }
        ccbsSetter.accept(this.ccbs);
        return this;
    }

    /**
     * 审批信息列表。
     * @return ccbs
     */
    public List<CcbEntity> getCcbs() {
        return ccbs;
    }

    public void setCcbs(List<CcbEntity> ccbs) {
        this.ccbs = ccbs;
    }

    public ReviewEntity withOldStatus(StatusEntity oldStatus) {
        this.oldStatus = oldStatus;
        return this;
    }

    public ReviewEntity withOldStatus(Consumer<StatusEntity> oldStatusSetter) {
        if (this.oldStatus == null) {
            this.oldStatus = new StatusEntity();
            oldStatusSetter.accept(this.oldStatus);
        }

        return this;
    }

    /**
     * Get oldStatus
     * @return oldStatus
     */
    public StatusEntity getOldStatus() {
        return oldStatus;
    }

    public void setOldStatus(StatusEntity oldStatus) {
        this.oldStatus = oldStatus;
    }

    public ReviewEntity withCc(List<UserEntity> cc) {
        this.cc = cc;
        return this;
    }

    public ReviewEntity addCcItem(UserEntity ccItem) {
        if (this.cc == null) {
            this.cc = new ArrayList<>();
        }
        this.cc.add(ccItem);
        return this;
    }

    public ReviewEntity withCc(Consumer<List<UserEntity>> ccSetter) {
        if (this.cc == null) {
            this.cc = new ArrayList<>();
        }
        ccSetter.accept(this.cc);
        return this;
    }

    /**
     * 抄送人列表。
     * @return cc
     */
    public List<UserEntity> getCc() {
        return cc;
    }

    public void setCc(List<UserEntity> cc) {
        this.cc = cc;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReviewEntity that = (ReviewEntity) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.number, that.number)
            && Objects.equals(this.state, that.state) && Objects.equals(this.title, that.title)
            && Objects.equals(this.category, that.category) && Objects.equals(this.createdBy, that.createdBy)
            && Objects.equals(this.modifiedBy, that.modifiedBy) && Objects.equals(this.assignedCc, that.assignedCc)
            && Objects.equals(this.createdTime, that.createdTime)
            && Objects.equals(this.modifiedTime, that.modifiedTime)
            && Objects.equals(this.planEndDate, that.planEndDate)
            && Objects.equals(this.planStartDate, that.planStartDate) && Objects.equals(this.closeTime, that.closeTime)
            && Objects.equals(this.status, that.status) && Objects.equals(this.description, that.description)
            && Objects.equals(this.closedTime, that.closedTime) && Objects.equals(this.approver, that.approver)
            && Objects.equals(this.reviewer, that.reviewer) && Objects.equals(this.cos, that.cos)
            && Objects.equals(this.ccbs, that.ccbs) && Objects.equals(this.oldStatus, that.oldStatus)
            && Objects.equals(this.cc, that.cc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            number,
            state,
            title,
            category,
            createdBy,
            modifiedBy,
            assignedCc,
            createdTime,
            modifiedTime,
            planEndDate,
            planStartDate,
            closeTime,
            status,
            description,
            closedTime,
            approver,
            reviewer,
            cos,
            ccbs,
            oldStatus,
            cc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReviewEntity {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
        sb.append("    assignedCc: ").append(toIndentedString(assignedCc)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    modifiedTime: ").append(toIndentedString(modifiedTime)).append("\n");
        sb.append("    planEndDate: ").append(toIndentedString(planEndDate)).append("\n");
        sb.append("    planStartDate: ").append(toIndentedString(planStartDate)).append("\n");
        sb.append("    closeTime: ").append(toIndentedString(closeTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    closedTime: ").append(toIndentedString(closedTime)).append("\n");
        sb.append("    approver: ").append(toIndentedString(approver)).append("\n");
        sb.append("    reviewer: ").append(toIndentedString(reviewer)).append("\n");
        sb.append("    cos: ").append(toIndentedString(cos)).append("\n");
        sb.append("    ccbs: ").append(toIndentedString(ccbs)).append("\n");
        sb.append("    oldStatus: ").append(toIndentedString(oldStatus)).append("\n");
        sb.append("    cc: ").append(toIndentedString(cc)).append("\n");
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
