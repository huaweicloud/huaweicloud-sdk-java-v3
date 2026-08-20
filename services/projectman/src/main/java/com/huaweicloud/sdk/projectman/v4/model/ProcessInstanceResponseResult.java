package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 返回结果
 */
public class ProcessInstanceResponseResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cc")

    private String cc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approver")

    private String approver;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

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

    private ProcessInstanceResponseResultCreatedBy createdBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number")

    private String number;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "need_approval")

    private Boolean needApproval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "br2co")

    private String br2co;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_by")

    private ProcessInstanceResponseResultModifiedBy modifiedBy;

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
    @JsonProperty(value = "review_config")

    private ProcessInstanceResponseResultReviewConfig reviewConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private ProcessInstanceResponseResultStatus status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stage")

    private String stage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "opinions")

    private List<ProcessInstanceResponseResultOpinions> opinions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "opinion_comments")

    private List<String> opinionComments = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attachments")

    private List<String> attachments = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wikis")

    private List<String> wikis = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associatedocuments")

    private List<String> associatedocuments = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cos")

    private List<ProcessInstanceResponseResultCos> cos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approval_phase_result")

    private String approvalPhaseResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ccbs")

    private List<ProcessInstanceResponseResultCcbs> ccbs = null;

    public ProcessInstanceResponseResult withCc(String cc) {
        this.cc = cc;
        return this;
    }

    /**
     * 抄送人列表
     * @return cc
     */
    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public ProcessInstanceResponseResult withApprover(String approver) {
        this.approver = approver;
        return this;
    }

    /**
     * 决策人ID
     * @return approver
     */
    public String getApprover() {
        return approver;
    }

    public void setApprover(String approver) {
        this.approver = approver;
    }

    public ProcessInstanceResponseResult withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 评审单描述，列表接口不返回描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProcessInstanceResponseResult withClosedTime(String closedTime) {
        this.closedTime = closedTime;
        return this;
    }

    /**
     * 评审单完成时间
     * @return closedTime
     */
    public String getClosedTime() {
        return closedTime;
    }

    public void setClosedTime(String closedTime) {
        this.closedTime = closedTime;
    }

    public ProcessInstanceResponseResult withReviewer(String reviewer) {
        this.reviewer = reviewer;
        return this;
    }

    /**
     * 评审专家ID，逗号分隔
     * @return reviewer
     */
    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public ProcessInstanceResponseResult withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ProcessInstanceResponseResult withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 评审单标题
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ProcessInstanceResponseResult withModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
        return this;
    }

    /**
     * 评审单最后修改时间戳
     * @return modifiedDate
     */
    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public ProcessInstanceResponseResult withCreatedBy(ProcessInstanceResponseResultCreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public ProcessInstanceResponseResult withCreatedBy(
        Consumer<ProcessInstanceResponseResultCreatedBy> createdBySetter) {
        if (this.createdBy == null) {
            this.createdBy = new ProcessInstanceResponseResultCreatedBy();
            createdBySetter.accept(this.createdBy);
        }

        return this;
    }

    /**
     * Get createdBy
     * @return createdBy
     */
    public ProcessInstanceResponseResultCreatedBy getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(ProcessInstanceResponseResultCreatedBy createdBy) {
        this.createdBy = createdBy;
    }

    public ProcessInstanceResponseResult withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 租户id
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ProcessInstanceResponseResult withNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * 评审单编号
     * @return number
     */
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public ProcessInstanceResponseResult withNeedApproval(Boolean needApproval) {
        this.needApproval = needApproval;
        return this;
    }

    /**
     * 是否需要审批
     * @return needApproval
     */
    public Boolean getNeedApproval() {
        return needApproval;
    }

    public void setNeedApproval(Boolean needApproval) {
        this.needApproval = needApproval;
    }

    public ProcessInstanceResponseResult withBr2co(String br2co) {
        this.br2co = br2co;
        return this;
    }

    /**
     * 基线评审对象
     * @return br2co
     */
    public String getBr2co() {
        return br2co;
    }

    public void setBr2co(String br2co) {
        this.br2co = br2co;
    }

    public ProcessInstanceResponseResult withModifiedBy(ProcessInstanceResponseResultModifiedBy modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    public ProcessInstanceResponseResult withModifiedBy(
        Consumer<ProcessInstanceResponseResultModifiedBy> modifiedBySetter) {
        if (this.modifiedBy == null) {
            this.modifiedBy = new ProcessInstanceResponseResultModifiedBy();
            modifiedBySetter.accept(this.modifiedBy);
        }

        return this;
    }

    /**
     * Get modifiedBy
     * @return modifiedBy
     */
    public ProcessInstanceResponseResultModifiedBy getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(ProcessInstanceResponseResultModifiedBy modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public ProcessInstanceResponseResult withApprovalTime(String approvalTime) {
        this.approvalTime = approvalTime;
        return this;
    }

    /**
     * 评审时间
     * @return approvalTime
     */
    public String getApprovalTime() {
        return approvalTime;
    }

    public void setApprovalTime(String approvalTime) {
        this.approvalTime = approvalTime;
    }

    public ProcessInstanceResponseResult withPlanEndDate(String planEndDate) {
        this.planEndDate = planEndDate;
        return this;
    }

    /**
     * 计划完成时间
     * @return planEndDate
     */
    public String getPlanEndDate() {
        return planEndDate;
    }

    public void setPlanEndDate(String planEndDate) {
        this.planEndDate = planEndDate;
    }

    public ProcessInstanceResponseResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 评审单ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ProcessInstanceResponseResult withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 评审单工作状态，取值为\"正在工作\",\"作废\"
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public ProcessInstanceResponseResult withCreatedDate(String createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * 创建时间
     * @return createdDate
     */
    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public ProcessInstanceResponseResult withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * 类别
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ProcessInstanceResponseResult withPlanStartDate(String planStartDate) {
        this.planStartDate = planStartDate;
        return this;
    }

    /**
     * 计划开始时间
     * @return planStartDate
     */
    public String getPlanStartDate() {
        return planStartDate;
    }

    public void setPlanStartDate(String planStartDate) {
        this.planStartDate = planStartDate;
    }

    public ProcessInstanceResponseResult withReviewConfig(ProcessInstanceResponseResultReviewConfig reviewConfig) {
        this.reviewConfig = reviewConfig;
        return this;
    }

    public ProcessInstanceResponseResult withReviewConfig(
        Consumer<ProcessInstanceResponseResultReviewConfig> reviewConfigSetter) {
        if (this.reviewConfig == null) {
            this.reviewConfig = new ProcessInstanceResponseResultReviewConfig();
            reviewConfigSetter.accept(this.reviewConfig);
        }

        return this;
    }

    /**
     * Get reviewConfig
     * @return reviewConfig
     */
    public ProcessInstanceResponseResultReviewConfig getReviewConfig() {
        return reviewConfig;
    }

    public void setReviewConfig(ProcessInstanceResponseResultReviewConfig reviewConfig) {
        this.reviewConfig = reviewConfig;
    }

    public ProcessInstanceResponseResult withStatus(ProcessInstanceResponseResultStatus status) {
        this.status = status;
        return this;
    }

    public ProcessInstanceResponseResult withStatus(Consumer<ProcessInstanceResponseResultStatus> statusSetter) {
        if (this.status == null) {
            this.status = new ProcessInstanceResponseResultStatus();
            statusSetter.accept(this.status);
        }

        return this;
    }

    /**
     * Get status
     * @return status
     */
    public ProcessInstanceResponseResultStatus getStatus() {
        return status;
    }

    public void setStatus(ProcessInstanceResponseResultStatus status) {
        this.status = status;
    }

    public ProcessInstanceResponseResult withStage(String stage) {
        this.stage = stage;
        return this;
    }

    /**
     * 阶段
     * @return stage
     */
    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public ProcessInstanceResponseResult withOpinions(List<ProcessInstanceResponseResultOpinions> opinions) {
        this.opinions = opinions;
        return this;
    }

    public ProcessInstanceResponseResult addOpinionsItem(ProcessInstanceResponseResultOpinions opinionsItem) {
        if (this.opinions == null) {
            this.opinions = new ArrayList<>();
        }
        this.opinions.add(opinionsItem);
        return this;
    }

    public ProcessInstanceResponseResult withOpinions(
        Consumer<List<ProcessInstanceResponseResultOpinions>> opinionsSetter) {
        if (this.opinions == null) {
            this.opinions = new ArrayList<>();
        }
        opinionsSetter.accept(this.opinions);
        return this;
    }

    /**
     * 变更对象评审专家Id列表（创建变更评审时使用）
     * @return opinions
     */
    public List<ProcessInstanceResponseResultOpinions> getOpinions() {
        return opinions;
    }

    public void setOpinions(List<ProcessInstanceResponseResultOpinions> opinions) {
        this.opinions = opinions;
    }

    public ProcessInstanceResponseResult withOpinionComments(List<String> opinionComments) {
        this.opinionComments = opinionComments;
        return this;
    }

    public ProcessInstanceResponseResult addOpinionCommentsItem(String opinionCommentsItem) {
        if (this.opinionComments == null) {
            this.opinionComments = new ArrayList<>();
        }
        this.opinionComments.add(opinionCommentsItem);
        return this;
    }

    public ProcessInstanceResponseResult withOpinionComments(Consumer<List<String>> opinionCommentsSetter) {
        if (this.opinionComments == null) {
            this.opinionComments = new ArrayList<>();
        }
        opinionCommentsSetter.accept(this.opinionComments);
        return this;
    }

    /**
     * 评审意见
     * @return opinionComments
     */
    public List<String> getOpinionComments() {
        return opinionComments;
    }

    public void setOpinionComments(List<String> opinionComments) {
        this.opinionComments = opinionComments;
    }

    public ProcessInstanceResponseResult withAttachments(List<String> attachments) {
        this.attachments = attachments;
        return this;
    }

    public ProcessInstanceResponseResult addAttachmentsItem(String attachmentsItem) {
        if (this.attachments == null) {
            this.attachments = new ArrayList<>();
        }
        this.attachments.add(attachmentsItem);
        return this;
    }

    public ProcessInstanceResponseResult withAttachments(Consumer<List<String>> attachmentsSetter) {
        if (this.attachments == null) {
            this.attachments = new ArrayList<>();
        }
        attachmentsSetter.accept(this.attachments);
        return this;
    }

    /**
     * 附件
     * @return attachments
     */
    public List<String> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<String> attachments) {
        this.attachments = attachments;
    }

    public ProcessInstanceResponseResult withWikis(List<String> wikis) {
        this.wikis = wikis;
        return this;
    }

    public ProcessInstanceResponseResult addWikisItem(String wikisItem) {
        if (this.wikis == null) {
            this.wikis = new ArrayList<>();
        }
        this.wikis.add(wikisItem);
        return this;
    }

    public ProcessInstanceResponseResult withWikis(Consumer<List<String>> wikisSetter) {
        if (this.wikis == null) {
            this.wikis = new ArrayList<>();
        }
        wikisSetter.accept(this.wikis);
        return this;
    }

    /**
     * 关联wiki
     * @return wikis
     */
    public List<String> getWikis() {
        return wikis;
    }

    public void setWikis(List<String> wikis) {
        this.wikis = wikis;
    }

    public ProcessInstanceResponseResult withAssociatedocuments(List<String> associatedocuments) {
        this.associatedocuments = associatedocuments;
        return this;
    }

    public ProcessInstanceResponseResult addAssociatedocumentsItem(String associatedocumentsItem) {
        if (this.associatedocuments == null) {
            this.associatedocuments = new ArrayList<>();
        }
        this.associatedocuments.add(associatedocumentsItem);
        return this;
    }

    public ProcessInstanceResponseResult withAssociatedocuments(Consumer<List<String>> associatedocumentsSetter) {
        if (this.associatedocuments == null) {
            this.associatedocuments = new ArrayList<>();
        }
        associatedocumentsSetter.accept(this.associatedocuments);
        return this;
    }

    /**
     * 关联文档
     * @return associatedocuments
     */
    public List<String> getAssociatedocuments() {
        return associatedocuments;
    }

    public void setAssociatedocuments(List<String> associatedocuments) {
        this.associatedocuments = associatedocuments;
    }

    public ProcessInstanceResponseResult withCos(List<ProcessInstanceResponseResultCos> cos) {
        this.cos = cos;
        return this;
    }

    public ProcessInstanceResponseResult addCosItem(ProcessInstanceResponseResultCos cosItem) {
        if (this.cos == null) {
            this.cos = new ArrayList<>();
        }
        this.cos.add(cosItem);
        return this;
    }

    public ProcessInstanceResponseResult withCos(Consumer<List<ProcessInstanceResponseResultCos>> cosSetter) {
        if (this.cos == null) {
            this.cos = new ArrayList<>();
        }
        cosSetter.accept(this.cos);
        return this;
    }

    /**
     * 评审对象列表
     * @return cos
     */
    public List<ProcessInstanceResponseResultCos> getCos() {
        return cos;
    }

    public void setCos(List<ProcessInstanceResponseResultCos> cos) {
        this.cos = cos;
    }

    public ProcessInstanceResponseResult withApprovalPhaseResult(String approvalPhaseResult) {
        this.approvalPhaseResult = approvalPhaseResult;
        return this;
    }

    /**
     * 评审结果
     * @return approvalPhaseResult
     */
    public String getApprovalPhaseResult() {
        return approvalPhaseResult;
    }

    public void setApprovalPhaseResult(String approvalPhaseResult) {
        this.approvalPhaseResult = approvalPhaseResult;
    }

    public ProcessInstanceResponseResult withCcbs(List<ProcessInstanceResponseResultCcbs> ccbs) {
        this.ccbs = ccbs;
        return this;
    }

    public ProcessInstanceResponseResult addCcbsItem(ProcessInstanceResponseResultCcbs ccbsItem) {
        if (this.ccbs == null) {
            this.ccbs = new ArrayList<>();
        }
        this.ccbs.add(ccbsItem);
        return this;
    }

    public ProcessInstanceResponseResult withCcbs(Consumer<List<ProcessInstanceResponseResultCcbs>> ccbsSetter) {
        if (this.ccbs == null) {
            this.ccbs = new ArrayList<>();
        }
        ccbsSetter.accept(this.ccbs);
        return this;
    }

    /**
     * 审批信息列表
     * @return ccbs
     */
    public List<ProcessInstanceResponseResultCcbs> getCcbs() {
        return ccbs;
    }

    public void setCcbs(List<ProcessInstanceResponseResultCcbs> ccbs) {
        this.ccbs = ccbs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProcessInstanceResponseResult that = (ProcessInstanceResponseResult) obj;
        return Objects.equals(this.cc, that.cc) && Objects.equals(this.approver, that.approver)
            && Objects.equals(this.description, that.description) && Objects.equals(this.closedTime, that.closedTime)
            && Objects.equals(this.reviewer, that.reviewer) && Objects.equals(this.type, that.type)
            && Objects.equals(this.title, that.title) && Objects.equals(this.modifiedDate, that.modifiedDate)
            && Objects.equals(this.createdBy, that.createdBy) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.number, that.number) && Objects.equals(this.needApproval, that.needApproval)
            && Objects.equals(this.br2co, that.br2co) && Objects.equals(this.modifiedBy, that.modifiedBy)
            && Objects.equals(this.approvalTime, that.approvalTime)
            && Objects.equals(this.planEndDate, that.planEndDate) && Objects.equals(this.id, that.id)
            && Objects.equals(this.state, that.state) && Objects.equals(this.createdDate, that.createdDate)
            && Objects.equals(this.category, that.category) && Objects.equals(this.planStartDate, that.planStartDate)
            && Objects.equals(this.reviewConfig, that.reviewConfig) && Objects.equals(this.status, that.status)
            && Objects.equals(this.stage, that.stage) && Objects.equals(this.opinions, that.opinions)
            && Objects.equals(this.opinionComments, that.opinionComments)
            && Objects.equals(this.attachments, that.attachments) && Objects.equals(this.wikis, that.wikis)
            && Objects.equals(this.associatedocuments, that.associatedocuments) && Objects.equals(this.cos, that.cos)
            && Objects.equals(this.approvalPhaseResult, that.approvalPhaseResult)
            && Objects.equals(this.ccbs, that.ccbs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cc,
            approver,
            description,
            closedTime,
            reviewer,
            type,
            title,
            modifiedDate,
            createdBy,
            domainId,
            number,
            needApproval,
            br2co,
            modifiedBy,
            approvalTime,
            planEndDate,
            id,
            state,
            createdDate,
            category,
            planStartDate,
            reviewConfig,
            status,
            stage,
            opinions,
            opinionComments,
            attachments,
            wikis,
            associatedocuments,
            cos,
            approvalPhaseResult,
            ccbs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProcessInstanceResponseResult {\n");
        sb.append("    cc: ").append(toIndentedString(cc)).append("\n");
        sb.append("    approver: ").append(toIndentedString(approver)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    closedTime: ").append(toIndentedString(closedTime)).append("\n");
        sb.append("    reviewer: ").append(toIndentedString(reviewer)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    needApproval: ").append(toIndentedString(needApproval)).append("\n");
        sb.append("    br2co: ").append(toIndentedString(br2co)).append("\n");
        sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
        sb.append("    approvalTime: ").append(toIndentedString(approvalTime)).append("\n");
        sb.append("    planEndDate: ").append(toIndentedString(planEndDate)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    planStartDate: ").append(toIndentedString(planStartDate)).append("\n");
        sb.append("    reviewConfig: ").append(toIndentedString(reviewConfig)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    stage: ").append(toIndentedString(stage)).append("\n");
        sb.append("    opinions: ").append(toIndentedString(opinions)).append("\n");
        sb.append("    opinionComments: ").append(toIndentedString(opinionComments)).append("\n");
        sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
        sb.append("    wikis: ").append(toIndentedString(wikis)).append("\n");
        sb.append("    associatedocuments: ").append(toIndentedString(associatedocuments)).append("\n");
        sb.append("    cos: ").append(toIndentedString(cos)).append("\n");
        sb.append("    approvalPhaseResult: ").append(toIndentedString(approvalPhaseResult)).append("\n");
        sb.append("    ccbs: ").append(toIndentedString(ccbs)).append("\n");
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
