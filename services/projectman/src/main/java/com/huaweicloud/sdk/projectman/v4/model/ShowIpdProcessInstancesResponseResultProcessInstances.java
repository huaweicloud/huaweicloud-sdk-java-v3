package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ShowIpdProcessInstancesResponseResultProcessInstances
 */
public class ShowIpdProcessInstancesResponseResultProcessInstances {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cc")

    private String cc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approver")

    private String approver;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "closed_time")

    private String closedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reviewer")

    private String reviewer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_date")

    private String modifiedDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_by")

    private UserVO createdBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number")

    private String number;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "need_approval")

    private String needApproval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_by")

    private UserVO modifiedBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approval_time")

    private String approvalTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_end_date")

    private String planEndDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_date")

    private String createdDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_start_date")

    private String planStartDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private ShowIpdProcessInstancesResponseResultStatus status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ccbs")

    private List<UserObject> ccbs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "opinions")

    private List<ShowIpdProcessInstancesResponseResultOpinions> opinions = null;

    public ShowIpdProcessInstancesResponseResultProcessInstances withCc(String cc) {
        this.cc = cc;
        return this;
    }

    /**
     * 抄送人，多值使用英文逗号分隔。
     * @return cc
     */
    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public ShowIpdProcessInstancesResponseResultProcessInstances withApprover(String approver) {
        this.approver = approver;
        return this;
    }

    /**
     * 评审单决策人。
     * @return approver
     */
    public String getApprover() {
        return approver;
    }

    public void setApprover(String approver) {
        this.approver = approver;
    }

    public ShowIpdProcessInstancesResponseResultProcessInstances withClosedTime(String closedTime) {
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

    public ShowIpdProcessInstancesResponseResultProcessInstances withReviewer(String reviewer) {
        this.reviewer = reviewer;
        return this;
    }

    /**
     * 评审专家。
     * @return reviewer
     */
    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public ShowIpdProcessInstancesResponseResultProcessInstances withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 评审分类。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ShowIpdProcessInstancesResponseResultProcessInstances withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 标题。
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ShowIpdProcessInstancesResponseResultProcessInstances withModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
        return this;
    }

    /**
     * 修改时间。
     * @return modifiedDate
     */
    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public ShowIpdProcessInstancesResponseResultProcessInstances withCreatedBy(UserVO createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public ShowIpdProcessInstancesResponseResultProcessInstances withCreatedBy(Consumer<UserVO> createdBySetter) {
        if (this.createdBy == null) {
            this.createdBy = new UserVO();
            createdBySetter.accept(this.createdBy);
        }

        return this;
    }

    /**
     * Get createdBy
     * @return createdBy
     */
    public UserVO getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(UserVO createdBy) {
        this.createdBy = createdBy;
    }

    public ShowIpdProcessInstancesResponseResultProcessInstances withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 项目空间ID。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ShowIpdProcessInstancesResponseResultProcessInstances withNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * 评审编号。
     * @return number
     */
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public ShowIpdProcessInstancesResponseResultProcessInstances withNeedApproval(String needApproval) {
        this.needApproval = needApproval;
        return this;
    }

    /**
     * 是否需要决策人审批。
     * @return needApproval
     */
    public String getNeedApproval() {
        return needApproval;
    }

    public void setNeedApproval(String needApproval) {
        this.needApproval = needApproval;
    }

    public ShowIpdProcessInstancesResponseResultProcessInstances withModifiedBy(UserVO modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    public ShowIpdProcessInstancesResponseResultProcessInstances withModifiedBy(Consumer<UserVO> modifiedBySetter) {
        if (this.modifiedBy == null) {
            this.modifiedBy = new UserVO();
            modifiedBySetter.accept(this.modifiedBy);
        }

        return this;
    }

    /**
     * Get modifiedBy
     * @return modifiedBy
     */
    public UserVO getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(UserVO modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public ShowIpdProcessInstancesResponseResultProcessInstances withApprovalTime(String approvalTime) {
        this.approvalTime = approvalTime;
        return this;
    }

    /**
     * 审批时间。
     * @return approvalTime
     */
    public String getApprovalTime() {
        return approvalTime;
    }

    public void setApprovalTime(String approvalTime) {
        this.approvalTime = approvalTime;
    }

    public ShowIpdProcessInstancesResponseResultProcessInstances withPlanEndDate(String planEndDate) {
        this.planEndDate = planEndDate;
        return this;
    }

    /**
     * 计划结束时间。
     * @return planEndDate
     */
    public String getPlanEndDate() {
        return planEndDate;
    }

    public void setPlanEndDate(String planEndDate) {
        this.planEndDate = planEndDate;
    }

    public ShowIpdProcessInstancesResponseResultProcessInstances withId(String id) {
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

    public ShowIpdProcessInstancesResponseResultProcessInstances withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 评审单数据状态。
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public ShowIpdProcessInstancesResponseResultProcessInstances withCreatedDate(String createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * 创建时间。
     * @return createdDate
     */
    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public ShowIpdProcessInstancesResponseResultProcessInstances withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * 评审单类型。
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ShowIpdProcessInstancesResponseResultProcessInstances withPlanStartDate(String planStartDate) {
        this.planStartDate = planStartDate;
        return this;
    }

    /**
     * 计划开始时间。
     * @return planStartDate
     */
    public String getPlanStartDate() {
        return planStartDate;
    }

    public void setPlanStartDate(String planStartDate) {
        this.planStartDate = planStartDate;
    }

    public ShowIpdProcessInstancesResponseResultProcessInstances withStatus(
        ShowIpdProcessInstancesResponseResultStatus status) {
        this.status = status;
        return this;
    }

    public ShowIpdProcessInstancesResponseResultProcessInstances withStatus(
        Consumer<ShowIpdProcessInstancesResponseResultStatus> statusSetter) {
        if (this.status == null) {
            this.status = new ShowIpdProcessInstancesResponseResultStatus();
            statusSetter.accept(this.status);
        }

        return this;
    }

    /**
     * Get status
     * @return status
     */
    public ShowIpdProcessInstancesResponseResultStatus getStatus() {
        return status;
    }

    public void setStatus(ShowIpdProcessInstancesResponseResultStatus status) {
        this.status = status;
    }

    public ShowIpdProcessInstancesResponseResultProcessInstances withCcbs(List<UserObject> ccbs) {
        this.ccbs = ccbs;
        return this;
    }

    public ShowIpdProcessInstancesResponseResultProcessInstances addCcbsItem(UserObject ccbsItem) {
        if (this.ccbs == null) {
            this.ccbs = new ArrayList<>();
        }
        this.ccbs.add(ccbsItem);
        return this;
    }

    public ShowIpdProcessInstancesResponseResultProcessInstances withCcbs(Consumer<List<UserObject>> ccbsSetter) {
        if (this.ccbs == null) {
            this.ccbs = new ArrayList<>();
        }
        ccbsSetter.accept(this.ccbs);
        return this;
    }

    /**
     * 决策人对象列表。
     * @return ccbs
     */
    public List<UserObject> getCcbs() {
        return ccbs;
    }

    public void setCcbs(List<UserObject> ccbs) {
        this.ccbs = ccbs;
    }

    public ShowIpdProcessInstancesResponseResultProcessInstances withOpinions(
        List<ShowIpdProcessInstancesResponseResultOpinions> opinions) {
        this.opinions = opinions;
        return this;
    }

    public ShowIpdProcessInstancesResponseResultProcessInstances addOpinionsItem(
        ShowIpdProcessInstancesResponseResultOpinions opinionsItem) {
        if (this.opinions == null) {
            this.opinions = new ArrayList<>();
        }
        this.opinions.add(opinionsItem);
        return this;
    }

    public ShowIpdProcessInstancesResponseResultProcessInstances withOpinions(
        Consumer<List<ShowIpdProcessInstancesResponseResultOpinions>> opinionsSetter) {
        if (this.opinions == null) {
            this.opinions = new ArrayList<>();
        }
        opinionsSetter.accept(this.opinions);
        return this;
    }

    /**
     * opinion对象列表。
     * @return opinions
     */
    public List<ShowIpdProcessInstancesResponseResultOpinions> getOpinions() {
        return opinions;
    }

    public void setOpinions(List<ShowIpdProcessInstancesResponseResultOpinions> opinions) {
        this.opinions = opinions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowIpdProcessInstancesResponseResultProcessInstances that =
            (ShowIpdProcessInstancesResponseResultProcessInstances) obj;
        return Objects.equals(this.cc, that.cc) && Objects.equals(this.approver, that.approver)
            && Objects.equals(this.closedTime, that.closedTime) && Objects.equals(this.reviewer, that.reviewer)
            && Objects.equals(this.type, that.type) && Objects.equals(this.title, that.title)
            && Objects.equals(this.modifiedDate, that.modifiedDate) && Objects.equals(this.createdBy, that.createdBy)
            && Objects.equals(this.domainId, that.domainId) && Objects.equals(this.number, that.number)
            && Objects.equals(this.needApproval, that.needApproval) && Objects.equals(this.modifiedBy, that.modifiedBy)
            && Objects.equals(this.approvalTime, that.approvalTime)
            && Objects.equals(this.planEndDate, that.planEndDate) && Objects.equals(this.id, that.id)
            && Objects.equals(this.state, that.state) && Objects.equals(this.createdDate, that.createdDate)
            && Objects.equals(this.category, that.category) && Objects.equals(this.planStartDate, that.planStartDate)
            && Objects.equals(this.status, that.status) && Objects.equals(this.ccbs, that.ccbs)
            && Objects.equals(this.opinions, that.opinions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cc,
            approver,
            closedTime,
            reviewer,
            type,
            title,
            modifiedDate,
            createdBy,
            domainId,
            number,
            needApproval,
            modifiedBy,
            approvalTime,
            planEndDate,
            id,
            state,
            createdDate,
            category,
            planStartDate,
            status,
            ccbs,
            opinions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowIpdProcessInstancesResponseResultProcessInstances {\n");
        sb.append("    cc: ").append(toIndentedString(cc)).append("\n");
        sb.append("    approver: ").append(toIndentedString(approver)).append("\n");
        sb.append("    closedTime: ").append(toIndentedString(closedTime)).append("\n");
        sb.append("    reviewer: ").append(toIndentedString(reviewer)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    needApproval: ").append(toIndentedString(needApproval)).append("\n");
        sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
        sb.append("    approvalTime: ").append(toIndentedString(approvalTime)).append("\n");
        sb.append("    planEndDate: ").append(toIndentedString(planEndDate)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    planStartDate: ").append(toIndentedString(planStartDate)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    ccbs: ").append(toIndentedString(ccbs)).append("\n");
        sb.append("    opinions: ").append(toIndentedString(opinions)).append("\n");
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
