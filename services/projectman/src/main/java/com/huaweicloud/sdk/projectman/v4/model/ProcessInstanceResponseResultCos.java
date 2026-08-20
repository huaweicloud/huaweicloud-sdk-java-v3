package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ProcessInstanceResponseResultCos
 */
public class ProcessInstanceResponseResultCos {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assignee")

    private ProcessInstanceResponseResultAssignee assignee;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number")

    private String number;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order")

    private String order;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "co2cr")

    private String co2cr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "co2br")

    private String co2br;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "co2gr")

    private String co2gr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "before_change")

    private String beforeChange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "after_change")

    private String afterChange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_by")

    private String modifiedBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_date")

    private String modifiedDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_by")

    private String createdBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_date")

    private String createdDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_map")

    private String statusMap;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_system")

    private String sourceSystem;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_system_link")

    private String sourceSystemLink;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_category")

    private String issueCategory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_id")

    private String issueId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_status")

    private ProcessInstanceResponseResultIssueStatus issueStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_severity")

    private String issueSeverity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_priority")

    private ProcessInstanceResponseResultIssuePriority issuePriority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_title")

    private String domainTitle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_domain_title")

    private String srcDomainTitle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_assignee_name")

    private String issueAssigneeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "change_reason")

    private String changeReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "change_type")

    private String changeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_system_id")

    private String sourceSystemId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "change_description")

    private String changeDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_deleted")

    private String hasDeleted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approval_phase_result")

    private String approvalPhaseResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approval_complete_time")

    private String approvalCompleteTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ccb_description")

    private String ccbDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actual_ccb")

    private String actualCcb;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ccbs")

    private String ccbs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ccb_info")

    private String ccbInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "opinions")

    private String opinions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "opinion_comments")

    private String opinionComments;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approval_time")

    private String approvalTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_domain_id")

    private String srcDomainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cross_domain")

    private String crossDomain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_moved")

    private String domainMoved;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reviewer")

    private List<String> reviewer = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approver")

    private List<String> approver = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rounds")

    private String rounds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_round_result")

    private String lastRoundResult;

    public ProcessInstanceResponseResultCos withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 区域
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public ProcessInstanceResponseResultCos withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * 变更对象工作项类型，此处固定为CO
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ProcessInstanceResponseResultCos withTitle(String title) {
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

    public ProcessInstanceResponseResultCos withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 变更对象状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ProcessInstanceResponseResultCos withAssignee(ProcessInstanceResponseResultAssignee assignee) {
        this.assignee = assignee;
        return this;
    }

    public ProcessInstanceResponseResultCos withAssignee(
        Consumer<ProcessInstanceResponseResultAssignee> assigneeSetter) {
        if (this.assignee == null) {
            this.assignee = new ProcessInstanceResponseResultAssignee();
            assigneeSetter.accept(this.assignee);
        }

        return this;
    }

    /**
     * Get assignee
     * @return assignee
     */
    public ProcessInstanceResponseResultAssignee getAssignee() {
        return assignee;
    }

    public void setAssignee(ProcessInstanceResponseResultAssignee assignee) {
        this.assignee = assignee;
    }

    public ProcessInstanceResponseResultCos withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 评审单描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProcessInstanceResponseResultCos withNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * 变更对象关联的工作项编号
     * @return number
     */
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public ProcessInstanceResponseResultCos withOrder(String order) {
        this.order = order;
        return this;
    }

    /**
     * 排序
     * @return order
     */
    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public ProcessInstanceResponseResultCos withCo2cr(String co2cr) {
        this.co2cr = co2cr;
        return this;
    }

    /**
     * 关联的变更评审标识
     * @return co2cr
     */
    public String getCo2cr() {
        return co2cr;
    }

    public void setCo2cr(String co2cr) {
        this.co2cr = co2cr;
    }

    public ProcessInstanceResponseResultCos withCo2br(String co2br) {
        this.co2br = co2br;
        return this;
    }

    /**
     * 关联的基线评审标识
     * @return co2br
     */
    public String getCo2br() {
        return co2br;
    }

    public void setCo2br(String co2br) {
        this.co2br = co2br;
    }

    public ProcessInstanceResponseResultCos withCo2gr(String co2gr) {
        this.co2gr = co2gr;
        return this;
    }

    /**
     * 关联的通用评审标识
     * @return co2gr
     */
    public String getCo2gr() {
        return co2gr;
    }

    public void setCo2gr(String co2gr) {
        this.co2gr = co2gr;
    }

    public ProcessInstanceResponseResultCos withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 审批对象Id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ProcessInstanceResponseResultCos withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 评审单类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ProcessInstanceResponseResultCos withState(String state) {
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

    public ProcessInstanceResponseResultCos withBeforeChange(String beforeChange) {
        this.beforeChange = beforeChange;
        return this;
    }

    /**
     * 变更对象工作项修改前内容
     * @return beforeChange
     */
    public String getBeforeChange() {
        return beforeChange;
    }

    public void setBeforeChange(String beforeChange) {
        this.beforeChange = beforeChange;
    }

    public ProcessInstanceResponseResultCos withAfterChange(String afterChange) {
        this.afterChange = afterChange;
        return this;
    }

    /**
     * 变更对象修改后内容
     * @return afterChange
     */
    public String getAfterChange() {
        return afterChange;
    }

    public void setAfterChange(String afterChange) {
        this.afterChange = afterChange;
    }

    public ProcessInstanceResponseResultCos withModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    /**
     * 评审单最后修改人
     * @return modifiedBy
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public ProcessInstanceResponseResultCos withModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
        return this;
    }

    /**
     * 评审单最后修改时间
     * @return modifiedDate
     */
    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public ProcessInstanceResponseResultCos withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * 评审单创建人
     * @return createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public ProcessInstanceResponseResultCos withCreatedDate(String createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * 评审单创建时间
     * @return createdDate
     */
    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public ProcessInstanceResponseResultCos withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 工作项所属租户ID，可通过[查询树状工作项](ShowIpdIssueTree.xml)接口获取，响应消息体中的**tenant_id**字段的值就是工作项所属租户id
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public ProcessInstanceResponseResultCos withStatusMap(String statusMap) {
        this.statusMap = statusMap;
        return this;
    }

    /**
     * 工作项状态
     * @return statusMap
     */
    public String getStatusMap() {
        return statusMap;
    }

    public void setStatusMap(String statusMap) {
        this.statusMap = statusMap;
    }

    public ProcessInstanceResponseResultCos withDomainId(String domainId) {
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

    public ProcessInstanceResponseResultCos withSourceSystem(String sourceSystem) {
        this.sourceSystem = sourceSystem;
        return this;
    }

    /**
     * 源系统
     * @return sourceSystem
     */
    public String getSourceSystem() {
        return sourceSystem;
    }

    public void setSourceSystem(String sourceSystem) {
        this.sourceSystem = sourceSystem;
    }

    public ProcessInstanceResponseResultCos withSourceSystemLink(String sourceSystemLink) {
        this.sourceSystemLink = sourceSystemLink;
        return this;
    }

    /**
     * 源系统链接
     * @return sourceSystemLink
     */
    public String getSourceSystemLink() {
        return sourceSystemLink;
    }

    public void setSourceSystemLink(String sourceSystemLink) {
        this.sourceSystemLink = sourceSystemLink;
    }

    public ProcessInstanceResponseResultCos withIssueCategory(String issueCategory) {
        this.issueCategory = issueCategory;
        return this;
    }

    /**
     * 变更对象关联的工作项类型
     * @return issueCategory
     */
    public String getIssueCategory() {
        return issueCategory;
    }

    public void setIssueCategory(String issueCategory) {
        this.issueCategory = issueCategory;
    }

    public ProcessInstanceResponseResultCos withIssueId(String issueId) {
        this.issueId = issueId;
        return this;
    }

    /**
     * 工作项ID
     * @return issueId
     */
    public String getIssueId() {
        return issueId;
    }

    public void setIssueId(String issueId) {
        this.issueId = issueId;
    }

    public ProcessInstanceResponseResultCos withIssueStatus(ProcessInstanceResponseResultIssueStatus issueStatus) {
        this.issueStatus = issueStatus;
        return this;
    }

    public ProcessInstanceResponseResultCos withIssueStatus(
        Consumer<ProcessInstanceResponseResultIssueStatus> issueStatusSetter) {
        if (this.issueStatus == null) {
            this.issueStatus = new ProcessInstanceResponseResultIssueStatus();
            issueStatusSetter.accept(this.issueStatus);
        }

        return this;
    }

    /**
     * Get issueStatus
     * @return issueStatus
     */
    public ProcessInstanceResponseResultIssueStatus getIssueStatus() {
        return issueStatus;
    }

    public void setIssueStatus(ProcessInstanceResponseResultIssueStatus issueStatus) {
        this.issueStatus = issueStatus;
    }

    public ProcessInstanceResponseResultCos withIssueSeverity(String issueSeverity) {
        this.issueSeverity = issueSeverity;
        return this;
    }

    /**
     * 工作项严重程度
     * @return issueSeverity
     */
    public String getIssueSeverity() {
        return issueSeverity;
    }

    public void setIssueSeverity(String issueSeverity) {
        this.issueSeverity = issueSeverity;
    }

    public ProcessInstanceResponseResultCos withIssuePriority(
        ProcessInstanceResponseResultIssuePriority issuePriority) {
        this.issuePriority = issuePriority;
        return this;
    }

    public ProcessInstanceResponseResultCos withIssuePriority(
        Consumer<ProcessInstanceResponseResultIssuePriority> issuePrioritySetter) {
        if (this.issuePriority == null) {
            this.issuePriority = new ProcessInstanceResponseResultIssuePriority();
            issuePrioritySetter.accept(this.issuePriority);
        }

        return this;
    }

    /**
     * Get issuePriority
     * @return issuePriority
     */
    public ProcessInstanceResponseResultIssuePriority getIssuePriority() {
        return issuePriority;
    }

    public void setIssuePriority(ProcessInstanceResponseResultIssuePriority issuePriority) {
        this.issuePriority = issuePriority;
    }

    public ProcessInstanceResponseResultCos withDomainTitle(String domainTitle) {
        this.domainTitle = domainTitle;
        return this;
    }

    /**
     * 归属项目名称
     * @return domainTitle
     */
    public String getDomainTitle() {
        return domainTitle;
    }

    public void setDomainTitle(String domainTitle) {
        this.domainTitle = domainTitle;
    }

    public ProcessInstanceResponseResultCos withSrcDomainTitle(String srcDomainTitle) {
        this.srcDomainTitle = srcDomainTitle;
        return this;
    }

    /**
     * 提出项目名称
     * @return srcDomainTitle
     */
    public String getSrcDomainTitle() {
        return srcDomainTitle;
    }

    public void setSrcDomainTitle(String srcDomainTitle) {
        this.srcDomainTitle = srcDomainTitle;
    }

    public ProcessInstanceResponseResultCos withIssueAssigneeName(String issueAssigneeName) {
        this.issueAssigneeName = issueAssigneeName;
        return this;
    }

    /**
     * 责任人昵称
     * @return issueAssigneeName
     */
    public String getIssueAssigneeName() {
        return issueAssigneeName;
    }

    public void setIssueAssigneeName(String issueAssigneeName) {
        this.issueAssigneeName = issueAssigneeName;
    }

    public ProcessInstanceResponseResultCos withChangeReason(String changeReason) {
        this.changeReason = changeReason;
        return this;
    }

    /**
     * 评审原因
     * @return changeReason
     */
    public String getChangeReason() {
        return changeReason;
    }

    public void setChangeReason(String changeReason) {
        this.changeReason = changeReason;
    }

    public ProcessInstanceResponseResultCos withChangeType(String changeType) {
        this.changeType = changeType;
        return this;
    }

    /**
     * 评审类型
     * @return changeType
     */
    public String getChangeType() {
        return changeType;
    }

    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

    public ProcessInstanceResponseResultCos withSourceSystemId(String sourceSystemId) {
        this.sourceSystemId = sourceSystemId;
        return this;
    }

    /**
     * 源系统id
     * @return sourceSystemId
     */
    public String getSourceSystemId() {
        return sourceSystemId;
    }

    public void setSourceSystemId(String sourceSystemId) {
        this.sourceSystemId = sourceSystemId;
    }

    public ProcessInstanceResponseResultCos withChangeDescription(String changeDescription) {
        this.changeDescription = changeDescription;
        return this;
    }

    /**
     * 评审描述
     * @return changeDescription
     */
    public String getChangeDescription() {
        return changeDescription;
    }

    public void setChangeDescription(String changeDescription) {
        this.changeDescription = changeDescription;
    }

    public ProcessInstanceResponseResultCos withHasDeleted(String hasDeleted) {
        this.hasDeleted = hasDeleted;
        return this;
    }

    /**
     * 是否已删除
     * @return hasDeleted
     */
    public String getHasDeleted() {
        return hasDeleted;
    }

    public void setHasDeleted(String hasDeleted) {
        this.hasDeleted = hasDeleted;
    }

    public ProcessInstanceResponseResultCos withApprovalPhaseResult(String approvalPhaseResult) {
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

    public ProcessInstanceResponseResultCos withApprovalCompleteTime(String approvalCompleteTime) {
        this.approvalCompleteTime = approvalCompleteTime;
        return this;
    }

    /**
     * 评审完成时间
     * @return approvalCompleteTime
     */
    public String getApprovalCompleteTime() {
        return approvalCompleteTime;
    }

    public void setApprovalCompleteTime(String approvalCompleteTime) {
        this.approvalCompleteTime = approvalCompleteTime;
    }

    public ProcessInstanceResponseResultCos withCcbDescription(String ccbDescription) {
        this.ccbDescription = ccbDescription;
        return this;
    }

    /**
     * 评审描述
     * @return ccbDescription
     */
    public String getCcbDescription() {
        return ccbDescription;
    }

    public void setCcbDescription(String ccbDescription) {
        this.ccbDescription = ccbDescription;
    }

    public ProcessInstanceResponseResultCos withActualCcb(String actualCcb) {
        this.actualCcb = actualCcb;
        return this;
    }

    /**
     * 评审专家
     * @return actualCcb
     */
    public String getActualCcb() {
        return actualCcb;
    }

    public void setActualCcb(String actualCcb) {
        this.actualCcb = actualCcb;
    }

    public ProcessInstanceResponseResultCos withCcbs(String ccbs) {
        this.ccbs = ccbs;
        return this;
    }

    /**
     * 审批信息列表
     * @return ccbs
     */
    public String getCcbs() {
        return ccbs;
    }

    public void setCcbs(String ccbs) {
        this.ccbs = ccbs;
    }

    public ProcessInstanceResponseResultCos withCcbInfo(String ccbInfo) {
        this.ccbInfo = ccbInfo;
        return this;
    }

    /**
     * 评审信息
     * @return ccbInfo
     */
    public String getCcbInfo() {
        return ccbInfo;
    }

    public void setCcbInfo(String ccbInfo) {
        this.ccbInfo = ccbInfo;
    }

    public ProcessInstanceResponseResultCos withOpinions(String opinions) {
        this.opinions = opinions;
        return this;
    }

    /**
     * 变更对象评审专家Id列表（创建变更评审时使用）
     * @return opinions
     */
    public String getOpinions() {
        return opinions;
    }

    public void setOpinions(String opinions) {
        this.opinions = opinions;
    }

    public ProcessInstanceResponseResultCos withOpinionComments(String opinionComments) {
        this.opinionComments = opinionComments;
        return this;
    }

    /**
     * 评审意见
     * @return opinionComments
     */
    public String getOpinionComments() {
        return opinionComments;
    }

    public void setOpinionComments(String opinionComments) {
        this.opinionComments = opinionComments;
    }

    public ProcessInstanceResponseResultCos withApprovalTime(String approvalTime) {
        this.approvalTime = approvalTime;
        return this;
    }

    /**
     * 审批时间
     * @return approvalTime
     */
    public String getApprovalTime() {
        return approvalTime;
    }

    public void setApprovalTime(String approvalTime) {
        this.approvalTime = approvalTime;
    }

    public ProcessInstanceResponseResultCos withSrcDomainId(String srcDomainId) {
        this.srcDomainId = srcDomainId;
        return this;
    }

    /**
     * 租户id
     * @return srcDomainId
     */
    public String getSrcDomainId() {
        return srcDomainId;
    }

    public void setSrcDomainId(String srcDomainId) {
        this.srcDomainId = srcDomainId;
    }

    public ProcessInstanceResponseResultCos withCrossDomain(String crossDomain) {
        this.crossDomain = crossDomain;
        return this;
    }

    /**
     * 是否跨租户
     * @return crossDomain
     */
    public String getCrossDomain() {
        return crossDomain;
    }

    public void setCrossDomain(String crossDomain) {
        this.crossDomain = crossDomain;
    }

    public ProcessInstanceResponseResultCos withDomainMoved(String domainMoved) {
        this.domainMoved = domainMoved;
        return this;
    }

    /**
     * 归属项目是否迁移
     * @return domainMoved
     */
    public String getDomainMoved() {
        return domainMoved;
    }

    public void setDomainMoved(String domainMoved) {
        this.domainMoved = domainMoved;
    }

    public ProcessInstanceResponseResultCos withReviewer(List<String> reviewer) {
        this.reviewer = reviewer;
        return this;
    }

    public ProcessInstanceResponseResultCos addReviewerItem(String reviewerItem) {
        if (this.reviewer == null) {
            this.reviewer = new ArrayList<>();
        }
        this.reviewer.add(reviewerItem);
        return this;
    }

    public ProcessInstanceResponseResultCos withReviewer(Consumer<List<String>> reviewerSetter) {
        if (this.reviewer == null) {
            this.reviewer = new ArrayList<>();
        }
        reviewerSetter.accept(this.reviewer);
        return this;
    }

    /**
     * 评审专家
     * @return reviewer
     */
    public List<String> getReviewer() {
        return reviewer;
    }

    public void setReviewer(List<String> reviewer) {
        this.reviewer = reviewer;
    }

    public ProcessInstanceResponseResultCos withApprover(List<String> approver) {
        this.approver = approver;
        return this;
    }

    public ProcessInstanceResponseResultCos addApproverItem(String approverItem) {
        if (this.approver == null) {
            this.approver = new ArrayList<>();
        }
        this.approver.add(approverItem);
        return this;
    }

    public ProcessInstanceResponseResultCos withApprover(Consumer<List<String>> approverSetter) {
        if (this.approver == null) {
            this.approver = new ArrayList<>();
        }
        approverSetter.accept(this.approver);
        return this;
    }

    /**
     * 决策人
     * @return approver
     */
    public List<String> getApprover() {
        return approver;
    }

    public void setApprover(List<String> approver) {
        this.approver = approver;
    }

    public ProcessInstanceResponseResultCos withRounds(String rounds) {
        this.rounds = rounds;
        return this;
    }

    /**
     * 评审轮次
     * @return rounds
     */
    public String getRounds() {
        return rounds;
    }

    public void setRounds(String rounds) {
        this.rounds = rounds;
    }

    public ProcessInstanceResponseResultCos withLastRoundResult(String lastRoundResult) {
        this.lastRoundResult = lastRoundResult;
        return this;
    }

    /**
     * 最近一轮决策结果
     * @return lastRoundResult
     */
    public String getLastRoundResult() {
        return lastRoundResult;
    }

    public void setLastRoundResult(String lastRoundResult) {
        this.lastRoundResult = lastRoundResult;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProcessInstanceResponseResultCos that = (ProcessInstanceResponseResultCos) obj;
        return Objects.equals(this.region, that.region) && Objects.equals(this.category, that.category)
            && Objects.equals(this.title, that.title) && Objects.equals(this.status, that.status)
            && Objects.equals(this.assignee, that.assignee) && Objects.equals(this.description, that.description)
            && Objects.equals(this.number, that.number) && Objects.equals(this.order, that.order)
            && Objects.equals(this.co2cr, that.co2cr) && Objects.equals(this.co2br, that.co2br)
            && Objects.equals(this.co2gr, that.co2gr) && Objects.equals(this.id, that.id)
            && Objects.equals(this.type, that.type) && Objects.equals(this.state, that.state)
            && Objects.equals(this.beforeChange, that.beforeChange)
            && Objects.equals(this.afterChange, that.afterChange) && Objects.equals(this.modifiedBy, that.modifiedBy)
            && Objects.equals(this.modifiedDate, that.modifiedDate) && Objects.equals(this.createdBy, that.createdBy)
            && Objects.equals(this.createdDate, that.createdDate) && Objects.equals(this.tenantId, that.tenantId)
            && Objects.equals(this.statusMap, that.statusMap) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.sourceSystem, that.sourceSystem)
            && Objects.equals(this.sourceSystemLink, that.sourceSystemLink)
            && Objects.equals(this.issueCategory, that.issueCategory) && Objects.equals(this.issueId, that.issueId)
            && Objects.equals(this.issueStatus, that.issueStatus)
            && Objects.equals(this.issueSeverity, that.issueSeverity)
            && Objects.equals(this.issuePriority, that.issuePriority)
            && Objects.equals(this.domainTitle, that.domainTitle)
            && Objects.equals(this.srcDomainTitle, that.srcDomainTitle)
            && Objects.equals(this.issueAssigneeName, that.issueAssigneeName)
            && Objects.equals(this.changeReason, that.changeReason) && Objects.equals(this.changeType, that.changeType)
            && Objects.equals(this.sourceSystemId, that.sourceSystemId)
            && Objects.equals(this.changeDescription, that.changeDescription)
            && Objects.equals(this.hasDeleted, that.hasDeleted)
            && Objects.equals(this.approvalPhaseResult, that.approvalPhaseResult)
            && Objects.equals(this.approvalCompleteTime, that.approvalCompleteTime)
            && Objects.equals(this.ccbDescription, that.ccbDescription)
            && Objects.equals(this.actualCcb, that.actualCcb) && Objects.equals(this.ccbs, that.ccbs)
            && Objects.equals(this.ccbInfo, that.ccbInfo) && Objects.equals(this.opinions, that.opinions)
            && Objects.equals(this.opinionComments, that.opinionComments)
            && Objects.equals(this.approvalTime, that.approvalTime)
            && Objects.equals(this.srcDomainId, that.srcDomainId) && Objects.equals(this.crossDomain, that.crossDomain)
            && Objects.equals(this.domainMoved, that.domainMoved) && Objects.equals(this.reviewer, that.reviewer)
            && Objects.equals(this.approver, that.approver) && Objects.equals(this.rounds, that.rounds)
            && Objects.equals(this.lastRoundResult, that.lastRoundResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(region,
            category,
            title,
            status,
            assignee,
            description,
            number,
            order,
            co2cr,
            co2br,
            co2gr,
            id,
            type,
            state,
            beforeChange,
            afterChange,
            modifiedBy,
            modifiedDate,
            createdBy,
            createdDate,
            tenantId,
            statusMap,
            domainId,
            sourceSystem,
            sourceSystemLink,
            issueCategory,
            issueId,
            issueStatus,
            issueSeverity,
            issuePriority,
            domainTitle,
            srcDomainTitle,
            issueAssigneeName,
            changeReason,
            changeType,
            sourceSystemId,
            changeDescription,
            hasDeleted,
            approvalPhaseResult,
            approvalCompleteTime,
            ccbDescription,
            actualCcb,
            ccbs,
            ccbInfo,
            opinions,
            opinionComments,
            approvalTime,
            srcDomainId,
            crossDomain,
            domainMoved,
            reviewer,
            approver,
            rounds,
            lastRoundResult);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProcessInstanceResponseResultCos {\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("    co2cr: ").append(toIndentedString(co2cr)).append("\n");
        sb.append("    co2br: ").append(toIndentedString(co2br)).append("\n");
        sb.append("    co2gr: ").append(toIndentedString(co2gr)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    beforeChange: ").append(toIndentedString(beforeChange)).append("\n");
        sb.append("    afterChange: ").append(toIndentedString(afterChange)).append("\n");
        sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
        sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    statusMap: ").append(toIndentedString(statusMap)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    sourceSystem: ").append(toIndentedString(sourceSystem)).append("\n");
        sb.append("    sourceSystemLink: ").append(toIndentedString(sourceSystemLink)).append("\n");
        sb.append("    issueCategory: ").append(toIndentedString(issueCategory)).append("\n");
        sb.append("    issueId: ").append(toIndentedString(issueId)).append("\n");
        sb.append("    issueStatus: ").append(toIndentedString(issueStatus)).append("\n");
        sb.append("    issueSeverity: ").append(toIndentedString(issueSeverity)).append("\n");
        sb.append("    issuePriority: ").append(toIndentedString(issuePriority)).append("\n");
        sb.append("    domainTitle: ").append(toIndentedString(domainTitle)).append("\n");
        sb.append("    srcDomainTitle: ").append(toIndentedString(srcDomainTitle)).append("\n");
        sb.append("    issueAssigneeName: ").append(toIndentedString(issueAssigneeName)).append("\n");
        sb.append("    changeReason: ").append(toIndentedString(changeReason)).append("\n");
        sb.append("    changeType: ").append(toIndentedString(changeType)).append("\n");
        sb.append("    sourceSystemId: ").append(toIndentedString(sourceSystemId)).append("\n");
        sb.append("    changeDescription: ").append(toIndentedString(changeDescription)).append("\n");
        sb.append("    hasDeleted: ").append(toIndentedString(hasDeleted)).append("\n");
        sb.append("    approvalPhaseResult: ").append(toIndentedString(approvalPhaseResult)).append("\n");
        sb.append("    approvalCompleteTime: ").append(toIndentedString(approvalCompleteTime)).append("\n");
        sb.append("    ccbDescription: ").append(toIndentedString(ccbDescription)).append("\n");
        sb.append("    actualCcb: ").append(toIndentedString(actualCcb)).append("\n");
        sb.append("    ccbs: ").append(toIndentedString(ccbs)).append("\n");
        sb.append("    ccbInfo: ").append(toIndentedString(ccbInfo)).append("\n");
        sb.append("    opinions: ").append(toIndentedString(opinions)).append("\n");
        sb.append("    opinionComments: ").append(toIndentedString(opinionComments)).append("\n");
        sb.append("    approvalTime: ").append(toIndentedString(approvalTime)).append("\n");
        sb.append("    srcDomainId: ").append(toIndentedString(srcDomainId)).append("\n");
        sb.append("    crossDomain: ").append(toIndentedString(crossDomain)).append("\n");
        sb.append("    domainMoved: ").append(toIndentedString(domainMoved)).append("\n");
        sb.append("    reviewer: ").append(toIndentedString(reviewer)).append("\n");
        sb.append("    approver: ").append(toIndentedString(approver)).append("\n");
        sb.append("    rounds: ").append(toIndentedString(rounds)).append("\n");
        sb.append("    lastRoundResult: ").append(toIndentedString(lastRoundResult)).append("\n");
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
