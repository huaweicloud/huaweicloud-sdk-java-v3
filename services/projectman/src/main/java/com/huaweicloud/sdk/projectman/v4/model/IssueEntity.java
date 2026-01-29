package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 工作项的公共父类，即所有工作项类型都有这些字段 其子类有 IssueAREntity IssueBugEntity IssueEntity IssueEpicEntity IssueFEEntity IssueIREntity IssueRREntity IssueSFEntity IssueSREntity IssueTaskEntity IssueUSEntity
 */
public class IssueEntity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number")

    private String number;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_id")

    private String parentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assignee")

    private UserEntity assignee;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_by")

    private UserEntity createdBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private String createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_by")

    private UserEntity modifiedBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_time")

    private String modifiedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_end_date")

    private String planEndDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "close_time")

    private String closeTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload")

    private String workload;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_sum")

    private String workloadSum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "link")

    private String link;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suspended")

    private Boolean suspended;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_modified_time")

    private String statusModifiedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private List<LabelEntity> labels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_fields")

    private List<FieldCodeValuePair> customFields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "children")

    private List<IssueEntity> children = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ir2feature")

    private String ir2feature;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "need_break")

    private String needBreak;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "break_status")

    private String breakStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "baseline")

    private String baseline;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private String priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "related_network_security")

    private String relatedNetworkSecurity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collaboratives")

    private String collaboratives;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "business_domain")

    private String businessDomain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_pi")

    private String planPi;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "change_status")

    private String changeStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "no_break_reason")

    private String noBreakReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "submitted_by")

    private String submittedBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ir2rr")

    private String ir2rr;

    public IssueEntity withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 工作项id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public IssueEntity withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 工作项标题
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public IssueEntity withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 工作项描述字段
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public IssueEntity withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 工作项大分类定义 requirement(研发需求)、bug(缺陷)、task(任务)、feature(特性)、raw_requirement(原始需求)
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public IssueEntity withNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * 工作项编号
     * @return number
     */
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public IssueEntity withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * 工作项类型，编辑工作项时，此字段必填、值为当前工作项正确的工作项类型，但不会更新此字段
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public IssueEntity withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * 父工作项id
     * @return parentId
     */
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public IssueEntity withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 工作项所属的项目id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public IssueEntity withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 工作项状态code
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public IssueEntity withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 工作项的生命周期，可选值为\"正在工作\",\"作废\"
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public IssueEntity withAssignee(UserEntity assignee) {
        this.assignee = assignee;
        return this;
    }

    public IssueEntity withAssignee(Consumer<UserEntity> assigneeSetter) {
        if (this.assignee == null) {
            this.assignee = new UserEntity();
            assigneeSetter.accept(this.assignee);
        }

        return this;
    }

    /**
     * Get assignee
     * @return assignee
     */
    public UserEntity getAssignee() {
        return assignee;
    }

    public void setAssignee(UserEntity assignee) {
        this.assignee = assignee;
    }

    public IssueEntity withCreatedBy(UserEntity createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public IssueEntity withCreatedBy(Consumer<UserEntity> createdBySetter) {
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

    public IssueEntity withCreatedTime(String createdTime) {
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

    public IssueEntity withModifiedBy(UserEntity modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    public IssueEntity withModifiedBy(Consumer<UserEntity> modifiedBySetter) {
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

    public IssueEntity withModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }

    /**
     * 工作项最近更新时间
     * @return modifiedTime
     */
    public String getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public IssueEntity withPlanEndDate(String planEndDate) {
        this.planEndDate = planEndDate;
        return this;
    }

    /**
     * 工作项计划结束日期，时间戳
     * @return planEndDate
     */
    public String getPlanEndDate() {
        return planEndDate;
    }

    public void setPlanEndDate(String planEndDate) {
        this.planEndDate = planEndDate;
    }

    public IssueEntity withCloseTime(String closeTime) {
        this.closeTime = closeTime;
        return this;
    }

    /**
     * 工作项关闭时间
     * @return closeTime
     */
    public String getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(String closeTime) {
        this.closeTime = closeTime;
    }

    public IssueEntity withWorkload(String workload) {
        this.workload = workload;
        return this;
    }

    /**
     * 工作项计划工时，保留一位小数，取值范围为0~999999999.9
     * @return workload
     */
    public String getWorkload() {
        return workload;
    }

    public void setWorkload(String workload) {
        this.workload = workload;
    }

    public IssueEntity withWorkloadSum(String workloadSum) {
        this.workloadSum = workloadSum;
        return this;
    }

    /**
     * 工作项计划工时，保留一位小数，取值范围为0~999999999.9，不可编辑
     * @return workloadSum
     */
    public String getWorkloadSum() {
        return workloadSum;
    }

    public void setWorkloadSum(String workloadSum) {
        this.workloadSum = workloadSum;
    }

    public IssueEntity withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 工作项所属租户id
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public IssueEntity withLink(String link) {
        this.link = link;
        return this;
    }

    /**
     * 工作项关联项id，多个关联项用英文逗号分隔，同一工作项最多支持50个关联项
     * @return link
     */
    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public IssueEntity withSuspended(Boolean suspended) {
        this.suspended = suspended;
        return this;
    }

    /**
     * 工作项是否已挂起
     * @return suspended
     */
    public Boolean getSuspended() {
        return suspended;
    }

    public void setSuspended(Boolean suspended) {
        this.suspended = suspended;
    }

    public IssueEntity withStatusModifiedTime(String statusModifiedTime) {
        this.statusModifiedTime = statusModifiedTime;
        return this;
    }

    /**
     * 工作项状态改变时间，可用于计算工作项在当前状态停留天数
     * @return statusModifiedTime
     */
    public String getStatusModifiedTime() {
        return statusModifiedTime;
    }

    public void setStatusModifiedTime(String statusModifiedTime) {
        this.statusModifiedTime = statusModifiedTime;
    }

    public IssueEntity withLabels(List<LabelEntity> labels) {
        this.labels = labels;
        return this;
    }

    public IssueEntity addLabelsItem(LabelEntity labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    public IssueEntity withLabels(Consumer<List<LabelEntity>> labelsSetter) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        labelsSetter.accept(this.labels);
        return this;
    }

    /**
     * 工作项标签
     * @return labels
     */
    public List<LabelEntity> getLabels() {
        return labels;
    }

    public void setLabels(List<LabelEntity> labels) {
        this.labels = labels;
    }

    public IssueEntity withCustomFields(List<FieldCodeValuePair> customFields) {
        this.customFields = customFields;
        return this;
    }

    public IssueEntity addCustomFieldsItem(FieldCodeValuePair customFieldsItem) {
        if (this.customFields == null) {
            this.customFields = new ArrayList<>();
        }
        this.customFields.add(customFieldsItem);
        return this;
    }

    public IssueEntity withCustomFields(Consumer<List<FieldCodeValuePair>> customFieldsSetter) {
        if (this.customFields == null) {
            this.customFields = new ArrayList<>();
        }
        customFieldsSetter.accept(this.customFields);
        return this;
    }

    /**
     * 工作项自定义字段映射，用户添加的系统字段也在此列 { \"code\":\"字段code\", \"value\":\"字段值\" }
     * @return customFields
     */
    public List<FieldCodeValuePair> getCustomFields() {
        return customFields;
    }

    public void setCustomFields(List<FieldCodeValuePair> customFields) {
        this.customFields = customFields;
    }

    public IssueEntity withChildren(List<IssueEntity> children) {
        this.children = children;
        return this;
    }

    public IssueEntity addChildrenItem(IssueEntity childrenItem) {
        if (this.children == null) {
            this.children = new ArrayList<>();
        }
        this.children.add(childrenItem);
        return this;
    }

    public IssueEntity withChildren(Consumer<List<IssueEntity>> childrenSetter) {
        if (this.children == null) {
            this.children = new ArrayList<>();
        }
        childrenSetter.accept(this.children);
        return this;
    }

    /**
     * 工作项的子工作项集合
     * @return children
     */
    public List<IssueEntity> getChildren() {
        return children;
    }

    public void setChildren(List<IssueEntity> children) {
        this.children = children;
    }

    public IssueEntity withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * 子工作项的路径
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public IssueEntity withIr2feature(String ir2feature) {
        this.ir2feature = ir2feature;
        return this;
    }

    /**
     * IR和FE的关联字段，工作项类型为IR时，有此字段
     * @return ir2feature
     */
    public String getIr2feature() {
        return ir2feature;
    }

    public void setIr2feature(String ir2feature) {
        this.ir2feature = ir2feature;
    }

    public IssueEntity withNeedBreak(String needBreak) {
        this.needBreak = needBreak;
        return this;
    }

    /**
     * 工作项是否需要分解,仅可以分解的工作项类型有此字段
     * @return needBreak
     */
    public String getNeedBreak() {
        return needBreak;
    }

    public void setNeedBreak(String needBreak) {
        this.needBreak = needBreak;
    }

    public IssueEntity withBreakStatus(String breakStatus) {
        this.breakStatus = breakStatus;
        return this;
    }

    /**
     * 分解状态 已分解—decomposed 未分解—undecomposed 不涉及— --
     * @return breakStatus
     */
    public String getBreakStatus() {
        return breakStatus;
    }

    public void setBreakStatus(String breakStatus) {
        this.breakStatus = breakStatus;
    }

    public IssueEntity withBaseline(String baseline) {
        this.baseline = baseline;
        return this;
    }

    /**
     * 工作项基线状态 未基线 —— null 已基线 —— baselined 基线评审中——baseline-reviewing
     * @return baseline
     */
    public String getBaseline() {
        return baseline;
    }

    public void setBaseline(String baseline) {
        this.baseline = baseline;
    }

    public IssueEntity withPriority(String priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 工作项优先级，部分工作项有此字段
     * @return priority
     */
    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public IssueEntity withRelatedNetworkSecurity(String relatedNetworkSecurity) {
        this.relatedNetworkSecurity = relatedNetworkSecurity;
        return this;
    }

    /**
     * 是否涉及网络安全。预设字段中，仅研发需求有此字段
     * @return relatedNetworkSecurity
     */
    public String getRelatedNetworkSecurity() {
        return relatedNetworkSecurity;
    }

    public void setRelatedNetworkSecurity(String relatedNetworkSecurity) {
        this.relatedNetworkSecurity = relatedNetworkSecurity;
    }

    public IssueEntity withCollaboratives(String collaboratives) {
        this.collaboratives = collaboratives;
        return this;
    }

    /**
     * 研发需求协同信息，协同任务id
     * @return collaboratives
     */
    public String getCollaboratives() {
        return collaboratives;
    }

    public void setCollaboratives(String collaboratives) {
        this.collaboratives = collaboratives;
    }

    public IssueEntity withBusinessDomain(String businessDomain) {
        this.businessDomain = businessDomain;
        return this;
    }

    /**
     * 领域字段
     * @return businessDomain
     */
    public String getBusinessDomain() {
        return businessDomain;
    }

    public void setBusinessDomain(String businessDomain) {
        this.businessDomain = businessDomain;
    }

    public IssueEntity withPlanPi(String planPi) {
        this.planPi = planPi;
        return this;
    }

    /**
     * 工作项发布(老版本名为PI) id
     * @return planPi
     */
    public String getPlanPi() {
        return planPi;
    }

    public void setPlanPi(String planPi) {
        this.planPi = planPi;
    }

    public IssueEntity withChangeStatus(String changeStatus) {
        this.changeStatus = changeStatus;
        return this;
    }

    /**
     * 工作项变更状态 变更评审中——change-reviewing 已变更——changed 未变更-unchange或null
     * @return changeStatus
     */
    public String getChangeStatus() {
        return changeStatus;
    }

    public void setChangeStatus(String changeStatus) {
        this.changeStatus = changeStatus;
    }

    public IssueEntity withNoBreakReason(String noBreakReason) {
        this.noBreakReason = noBreakReason;
        return this;
    }

    /**
     * 无需分解原因，need_break=no时有此字段
     * @return noBreakReason
     */
    public String getNoBreakReason() {
        return noBreakReason;
    }

    public void setNoBreakReason(String noBreakReason) {
        this.noBreakReason = noBreakReason;
    }

    public IssueEntity withSubmittedBy(String submittedBy) {
        this.submittedBy = submittedBy;
        return this;
    }

    /**
     * 提出人，部分工作项有此字段，多人时用英文逗号分隔
     * @return submittedBy
     */
    public String getSubmittedBy() {
        return submittedBy;
    }

    public void setSubmittedBy(String submittedBy) {
        this.submittedBy = submittedBy;
    }

    public IssueEntity withIr2rr(String ir2rr) {
        this.ir2rr = ir2rr;
        return this;
    }

    /**
     * IR关联的RR id，多选时用英文逗号分隔
     * @return ir2rr
     */
    public String getIr2rr() {
        return ir2rr;
    }

    public void setIr2rr(String ir2rr) {
        this.ir2rr = ir2rr;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IssueEntity that = (IssueEntity) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.title, that.title)
            && Objects.equals(this.description, that.description) && Objects.equals(this.type, that.type)
            && Objects.equals(this.number, that.number) && Objects.equals(this.category, that.category)
            && Objects.equals(this.parentId, that.parentId) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.status, that.status) && Objects.equals(this.state, that.state)
            && Objects.equals(this.assignee, that.assignee) && Objects.equals(this.createdBy, that.createdBy)
            && Objects.equals(this.createdTime, that.createdTime) && Objects.equals(this.modifiedBy, that.modifiedBy)
            && Objects.equals(this.modifiedTime, that.modifiedTime)
            && Objects.equals(this.planEndDate, that.planEndDate) && Objects.equals(this.closeTime, that.closeTime)
            && Objects.equals(this.workload, that.workload) && Objects.equals(this.workloadSum, that.workloadSum)
            && Objects.equals(this.tenantId, that.tenantId) && Objects.equals(this.link, that.link)
            && Objects.equals(this.suspended, that.suspended)
            && Objects.equals(this.statusModifiedTime, that.statusModifiedTime)
            && Objects.equals(this.labels, that.labels) && Objects.equals(this.customFields, that.customFields)
            && Objects.equals(this.children, that.children) && Objects.equals(this.path, that.path)
            && Objects.equals(this.ir2feature, that.ir2feature) && Objects.equals(this.needBreak, that.needBreak)
            && Objects.equals(this.breakStatus, that.breakStatus) && Objects.equals(this.baseline, that.baseline)
            && Objects.equals(this.priority, that.priority)
            && Objects.equals(this.relatedNetworkSecurity, that.relatedNetworkSecurity)
            && Objects.equals(this.collaboratives, that.collaboratives)
            && Objects.equals(this.businessDomain, that.businessDomain) && Objects.equals(this.planPi, that.planPi)
            && Objects.equals(this.changeStatus, that.changeStatus)
            && Objects.equals(this.noBreakReason, that.noBreakReason)
            && Objects.equals(this.submittedBy, that.submittedBy) && Objects.equals(this.ir2rr, that.ir2rr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            title,
            description,
            type,
            number,
            category,
            parentId,
            projectId,
            status,
            state,
            assignee,
            createdBy,
            createdTime,
            modifiedBy,
            modifiedTime,
            planEndDate,
            closeTime,
            workload,
            workloadSum,
            tenantId,
            link,
            suspended,
            statusModifiedTime,
            labels,
            customFields,
            children,
            path,
            ir2feature,
            needBreak,
            breakStatus,
            baseline,
            priority,
            relatedNetworkSecurity,
            collaboratives,
            businessDomain,
            planPi,
            changeStatus,
            noBreakReason,
            submittedBy,
            ir2rr);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssueEntity {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
        sb.append("    modifiedTime: ").append(toIndentedString(modifiedTime)).append("\n");
        sb.append("    planEndDate: ").append(toIndentedString(planEndDate)).append("\n");
        sb.append("    closeTime: ").append(toIndentedString(closeTime)).append("\n");
        sb.append("    workload: ").append(toIndentedString(workload)).append("\n");
        sb.append("    workloadSum: ").append(toIndentedString(workloadSum)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    link: ").append(toIndentedString(link)).append("\n");
        sb.append("    suspended: ").append(toIndentedString(suspended)).append("\n");
        sb.append("    statusModifiedTime: ").append(toIndentedString(statusModifiedTime)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
        sb.append("    children: ").append(toIndentedString(children)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    ir2feature: ").append(toIndentedString(ir2feature)).append("\n");
        sb.append("    needBreak: ").append(toIndentedString(needBreak)).append("\n");
        sb.append("    breakStatus: ").append(toIndentedString(breakStatus)).append("\n");
        sb.append("    baseline: ").append(toIndentedString(baseline)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    relatedNetworkSecurity: ").append(toIndentedString(relatedNetworkSecurity)).append("\n");
        sb.append("    collaboratives: ").append(toIndentedString(collaboratives)).append("\n");
        sb.append("    businessDomain: ").append(toIndentedString(businessDomain)).append("\n");
        sb.append("    planPi: ").append(toIndentedString(planPi)).append("\n");
        sb.append("    changeStatus: ").append(toIndentedString(changeStatus)).append("\n");
        sb.append("    noBreakReason: ").append(toIndentedString(noBreakReason)).append("\n");
        sb.append("    submittedBy: ").append(toIndentedString(submittedBy)).append("\n");
        sb.append("    ir2rr: ").append(toIndentedString(ir2rr)).append("\n");
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
