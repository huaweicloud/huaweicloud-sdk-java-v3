package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateIpdProjectIssueRequestBody
 */
public class CreateIpdProjectIssueRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_domain")

    private String srcDomain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "submitted_by")

    private String submittedBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recipient")

    private List<String> recipient = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expect_delivery_time")

    private Long expectDeliveryTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private String priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assigned_cc")

    private List<String> assignedCc = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assignee")

    private String assignee;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_pi")

    private String planPi;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_iteration")

    private String planIteration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_start_date")

    private Long planStartDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_end_date")

    private Long planEndDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_man_day")

    private Integer workloadManDay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "business_domain")

    private String businessDomain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "need_break")

    private String needBreak;

    public CreateIpdProjectIssueRequestBody withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 工作项名称
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public CreateIpdProjectIssueRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateIpdProjectIssueRequestBody withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态[\"Committed\", \"Analyse\", \"ToBeConfirmed\", \"Plan\", \"Doing\", \"Delivered\", \"Checking\"]
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CreateIpdProjectIssueRequestBody withSrcDomain(String srcDomain) {
        this.srcDomain = srcDomain;
        return this;
    }

    /**
     * 提出项目domainId
     * @return srcDomain
     */
    public String getSrcDomain() {
        return srcDomain;
    }

    public void setSrcDomain(String srcDomain) {
        this.srcDomain = srcDomain;
    }

    public CreateIpdProjectIssueRequestBody withSubmittedBy(String submittedBy) {
        this.submittedBy = submittedBy;
        return this;
    }

    /**
     * 提交人Id
     * @return submittedBy
     */
    public String getSubmittedBy() {
        return submittedBy;
    }

    public void setSubmittedBy(String submittedBy) {
        this.submittedBy = submittedBy;
    }

    public CreateIpdProjectIssueRequestBody withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 归属项目domainId
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public CreateIpdProjectIssueRequestBody withRecipient(List<String> recipient) {
        this.recipient = recipient;
        return this;
    }

    public CreateIpdProjectIssueRequestBody addRecipientItem(String recipientItem) {
        if (this.recipient == null) {
            this.recipient = new ArrayList<>();
        }
        this.recipient.add(recipientItem);
        return this;
    }

    public CreateIpdProjectIssueRequestBody withRecipient(Consumer<List<String>> recipientSetter) {
        if (this.recipient == null) {
            this.recipient = new ArrayList<>();
        }
        recipientSetter.accept(this.recipient);
        return this;
    }

    /**
     * 承接人id
     * @return recipient
     */
    public List<String> getRecipient() {
        return recipient;
    }

    public void setRecipient(List<String> recipient) {
        this.recipient = recipient;
    }

    public CreateIpdProjectIssueRequestBody withExpectDeliveryTime(Long expectDeliveryTime) {
        this.expectDeliveryTime = expectDeliveryTime;
        return this;
    }

    /**
     * 期望完成时间
     * @return expectDeliveryTime
     */
    public Long getExpectDeliveryTime() {
        return expectDeliveryTime;
    }

    public void setExpectDeliveryTime(Long expectDeliveryTime) {
        this.expectDeliveryTime = expectDeliveryTime;
    }

    public CreateIpdProjectIssueRequestBody withPriority(String priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 优先级
     * @return priority
     */
    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public CreateIpdProjectIssueRequestBody withAssignedCc(List<String> assignedCc) {
        this.assignedCc = assignedCc;
        return this;
    }

    public CreateIpdProjectIssueRequestBody addAssignedCcItem(String assignedCcItem) {
        if (this.assignedCc == null) {
            this.assignedCc = new ArrayList<>();
        }
        this.assignedCc.add(assignedCcItem);
        return this;
    }

    public CreateIpdProjectIssueRequestBody withAssignedCc(Consumer<List<String>> assignedCcSetter) {
        if (this.assignedCc == null) {
            this.assignedCc = new ArrayList<>();
        }
        assignedCcSetter.accept(this.assignedCc);
        return this;
    }

    /**
     * 抄送人id
     * @return assignedCc
     */
    public List<String> getAssignedCc() {
        return assignedCc;
    }

    public void setAssignedCc(List<String> assignedCc) {
        this.assignedCc = assignedCc;
    }

    public CreateIpdProjectIssueRequestBody withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * 工作项分类：[Epic,FE,IR,RR,SR,US,AR,Bug,Task]
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public CreateIpdProjectIssueRequestBody withAssignee(String assignee) {
        this.assignee = assignee;
        return this;
    }

    /**
     * 责任人
     * @return assignee
     */
    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public CreateIpdProjectIssueRequestBody withPlanPi(String planPi) {
        this.planPi = planPi;
        return this;
    }

    /**
     * PI ID
     * @return planPi
     */
    public String getPlanPi() {
        return planPi;
    }

    public void setPlanPi(String planPi) {
        this.planPi = planPi;
    }

    public CreateIpdProjectIssueRequestBody withPlanIteration(String planIteration) {
        this.planIteration = planIteration;
        return this;
    }

    /**
     * 迭代ID
     * @return planIteration
     */
    public String getPlanIteration() {
        return planIteration;
    }

    public void setPlanIteration(String planIteration) {
        this.planIteration = planIteration;
    }

    public CreateIpdProjectIssueRequestBody withPlanStartDate(Long planStartDate) {
        this.planStartDate = planStartDate;
        return this;
    }

    /**
     * 计划开始时间
     * @return planStartDate
     */
    public Long getPlanStartDate() {
        return planStartDate;
    }

    public void setPlanStartDate(Long planStartDate) {
        this.planStartDate = planStartDate;
    }

    public CreateIpdProjectIssueRequestBody withPlanEndDate(Long planEndDate) {
        this.planEndDate = planEndDate;
        return this;
    }

    /**
     * 计划结束时间
     * @return planEndDate
     */
    public Long getPlanEndDate() {
        return planEndDate;
    }

    public void setPlanEndDate(Long planEndDate) {
        this.planEndDate = planEndDate;
    }

    public CreateIpdProjectIssueRequestBody withWorkloadManDay(Integer workloadManDay) {
        this.workloadManDay = workloadManDay;
        return this;
    }

    /**
     * 计划工时
     * @return workloadManDay
     */
    public Integer getWorkloadManDay() {
        return workloadManDay;
    }

    public void setWorkloadManDay(Integer workloadManDay) {
        this.workloadManDay = workloadManDay;
    }

    public CreateIpdProjectIssueRequestBody withBusinessDomain(String businessDomain) {
        this.businessDomain = businessDomain;
        return this;
    }

    /**
     * 领域
     * @return businessDomain
     */
    public String getBusinessDomain() {
        return businessDomain;
    }

    public void setBusinessDomain(String businessDomain) {
        this.businessDomain = businessDomain;
    }

    public CreateIpdProjectIssueRequestBody withNeedBreak(String needBreak) {
        this.needBreak = needBreak;
        return this;
    }

    /**
     * 是否需要分解
     * @return needBreak
     */
    public String getNeedBreak() {
        return needBreak;
    }

    public void setNeedBreak(String needBreak) {
        this.needBreak = needBreak;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateIpdProjectIssueRequestBody that = (CreateIpdProjectIssueRequestBody) obj;
        return Objects.equals(this.title, that.title) && Objects.equals(this.description, that.description)
            && Objects.equals(this.status, that.status) && Objects.equals(this.srcDomain, that.srcDomain)
            && Objects.equals(this.submittedBy, that.submittedBy) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.recipient, that.recipient)
            && Objects.equals(this.expectDeliveryTime, that.expectDeliveryTime)
            && Objects.equals(this.priority, that.priority) && Objects.equals(this.assignedCc, that.assignedCc)
            && Objects.equals(this.category, that.category) && Objects.equals(this.assignee, that.assignee)
            && Objects.equals(this.planPi, that.planPi) && Objects.equals(this.planIteration, that.planIteration)
            && Objects.equals(this.planStartDate, that.planStartDate)
            && Objects.equals(this.planEndDate, that.planEndDate)
            && Objects.equals(this.workloadManDay, that.workloadManDay)
            && Objects.equals(this.businessDomain, that.businessDomain)
            && Objects.equals(this.needBreak, that.needBreak);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title,
            description,
            status,
            srcDomain,
            submittedBy,
            domainId,
            recipient,
            expectDeliveryTime,
            priority,
            assignedCc,
            category,
            assignee,
            planPi,
            planIteration,
            planStartDate,
            planEndDate,
            workloadManDay,
            businessDomain,
            needBreak);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateIpdProjectIssueRequestBody {\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    srcDomain: ").append(toIndentedString(srcDomain)).append("\n");
        sb.append("    submittedBy: ").append(toIndentedString(submittedBy)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
        sb.append("    expectDeliveryTime: ").append(toIndentedString(expectDeliveryTime)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    assignedCc: ").append(toIndentedString(assignedCc)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
        sb.append("    planPi: ").append(toIndentedString(planPi)).append("\n");
        sb.append("    planIteration: ").append(toIndentedString(planIteration)).append("\n");
        sb.append("    planStartDate: ").append(toIndentedString(planStartDate)).append("\n");
        sb.append("    planEndDate: ").append(toIndentedString(planEndDate)).append("\n");
        sb.append("    workloadManDay: ").append(toIndentedString(workloadManDay)).append("\n");
        sb.append("    businessDomain: ").append(toIndentedString(businessDomain)).append("\n");
        sb.append("    needBreak: ").append(toIndentedString(needBreak)).append("\n");
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
