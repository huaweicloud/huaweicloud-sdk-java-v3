package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 工作项对象
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
    @JsonProperty(value = "category_layer_id")

    private String categoryLayerId;

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
    @JsonProperty(value = "assigned_cc")

    private List<UserEntity> assignedCc = null;

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
    @JsonProperty(value = "plan_iteration")

    private String planIteration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "change_status")

    private String changeStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "no_break_reason")

    private String noBreakReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "submitted_by")

    private List<UserEntity> submittedBy = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ir2rr")

    private String ir2rr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "feature_set")

    private String featureSet;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expected_repair_date")

    private String expectedRepairDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "found_pi")

    private String foundPi;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "found_iteration")

    private String foundIteration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason_analysis")

    private String reasonAnalysis;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repair_solution")

    private String repairSolution;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_report")

    private String testReport;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sys_no_repair_reason")

    private String sysNoRepairReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sys_activation_reason")

    private String sysActivationReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sys_return_reason")

    private String sysReturnReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_failures_times")

    private Integer testFailuresTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "close_type")

    private String closeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_owner")

    private UserEntity planOwner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "doing_owner")

    private UserEntity doingOwner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delivered_owner")

    private UserEntity deliveredOwner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "checking_owner")

    private UserEntity checkingOwner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_owner")

    private UserEntity testOwner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "develop_owner")

    private UserEntity developOwner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "processing_owner")

    private UserEntity processingOwner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fixed_owner")

    private UserEntity fixedOwner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "researchanddevelop_owner")

    private UserEntity researchanddevelopOwner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "analyse_owner")

    private UserEntity analyseOwner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_start_date")

    private String planStartDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expect_delivery_time")

    private String expectDeliveryTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_test_end_date")

    private String planTestEndDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private String severity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "promised")

    private String promised;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recipient")

    private List<UserEntity> recipient = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sys_no_develop_reason")

    private String sysNoDevelopReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "val_feature")

    private String valFeature;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "function_scene")

    private String functionScene;

    public IssueEntity withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 需要更新的工作项ID，可通过查询树状工作项接口获取，响应消息体中的id字段的值就是工作项ID。
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
     * 工作项标题，可通过查询树状工作项接口获取，响应消息体中的title字段的值就是工作项标题。
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
     * 工作项描述字段，可通过查询树状工作项接口获取，响应消息体中的description字段的值就是工作项描述字段。
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
     * 工作项大分类定义。工作项创建、编辑无此字段，仅作展示用，可通过查询树状工作项接口获取，响应消息体中的type字段的值就是工作项大分类定义。
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
     * 工作项编号，可通过查询树状工作项接口获取，响应消息体中的number字段的值就是工作项编号。
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
     * 工作项类型，可通过查询树状工作项接口获取，响应消息体中的category字段的值就是工作项类型。
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public IssueEntity withCategoryLayerId(String categoryLayerId) {
        this.categoryLayerId = categoryLayerId;
        return this;
    }

    /**
     * 工作项类型层级关系ID，此参数影响工作项的层级显示。通过获取模型树配置信息获取，根据参数中的category在响应消息体中category_layer_config中找到对应的category_code，和category_code同级的id就是工作项类型层级关系ID。
     * @return categoryLayerId
     */
    public String getCategoryLayerId() {
        return categoryLayerId;
    }

    public void setCategoryLayerId(String categoryLayerId) {
        this.categoryLayerId = categoryLayerId;
    }

    public IssueEntity withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * 父工作项ID，可通过查询树状工作项接口获取，响应消息体中的parent_id字段的值就是父工作项ID。
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
     * 项目的32位uuid，项目唯一标识，通过查询IPD项目列表接口获取，响应消息体中的project_id字段的值就是项目ID。
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
     * 工作项状态code。可通过查询工作项状态接口获取，响应消息体中的code字段的值就是工作项工作项状态code。
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
     * 工作项的生命周期，可选值为“正在工作”，“作废”，可通过查询树状工作项接口获取，响应消息体中的state字段的值就是工作项的生命周期。
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

    public IssueEntity withAssignedCc(List<UserEntity> assignedCc) {
        this.assignedCc = assignedCc;
        return this;
    }

    public IssueEntity addAssignedCcItem(UserEntity assignedCcItem) {
        if (this.assignedCc == null) {
            this.assignedCc = new ArrayList<>();
        }
        this.assignedCc.add(assignedCcItem);
        return this;
    }

    public IssueEntity withAssignedCc(Consumer<List<UserEntity>> assignedCcSetter) {
        if (this.assignedCc == null) {
            this.assignedCc = new ArrayList<>();
        }
        assignedCcSetter.accept(this.assignedCc);
        return this;
    }

    /**
     * 工作项抄送人，支持多个抄送人。数组元素为UserEntity对象。
     * @return assignedCc
     */
    public List<UserEntity> getAssignedCc() {
        return assignedCc;
    }

    public void setAssignedCc(List<UserEntity> assignedCc) {
        this.assignedCc = assignedCc;
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
     * 工作项创建时间，unix时间戳，单位：毫秒。
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
     * 工作项最近更新时间，unix时间戳，单位：毫秒。
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
     * 工作项计划结束日期，unix时间戳，单位：毫秒。
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
     * 工作项关闭时间，unix时间戳，单位：毫秒。
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
     * 工作项计划工时。
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
     * 工作项实际工时。
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
     * 工作项所属租户ID，可通过查询树状工作项接口获取，响应消息体中的tenant_id字段的值就是工作项所属租户ID。
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
     * 工作项关联项ID。
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
     * 工作项是否已挂起。
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
     * 工作项状态改变时间，可用于计算工作项在当前状态停留天数，unix时间戳，单位：毫秒。
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
     * 工作项标签。数组元素为LabelEntity对象。
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
     * 工作项自定义字段映射，用户添加的系统字段也在此列，格式为{\"code\":\"字段code\",\"value\":\"字段值\"}。数组元素为FieldCodeValuePair对象。
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
     * 工作项的子工作项集合。数组元素为IssueEntity对象。
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
     * 子工作项的路径。
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
     * IR和SF的关联字段。
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
     * 工作项是否需要分解。
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
     * 分解状态。
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
     * 工作项基线状态。
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
     * 工作项优先级，部分工作项有此字段。
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
     * 是否涉及网络安全。
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
     * 研发需求协同信息，协同任务ID，可通过查询树状工作项接口获取，响应消息体中的collaboratives字段的值就是研发需求协同信息，协同任务ID。
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
     * 领域字段。
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
     * 工作项发布计划ID。通过发布/迭代计划列表查询接口查询计划列表，返回参数中PlanVO里面的category=PI的对象的id字段就是迭代计划的ID。
     * @return planPi
     */
    public String getPlanPi() {
        return planPi;
    }

    public void setPlanPi(String planPi) {
        this.planPi = planPi;
    }

    public IssueEntity withPlanIteration(String planIteration) {
        this.planIteration = planIteration;
        return this;
    }

    /**
     * 工作项完成的迭代计划ID，在Bug中为修复迭代计划ID。通过发布/迭代计划列表查询接口查询计划列表，返回参数中PlanVO里面的category=Iteration的对象的id字段就是迭代计划的ID。
     * @return planIteration
     */
    public String getPlanIteration() {
        return planIteration;
    }

    public void setPlanIteration(String planIteration) {
        this.planIteration = planIteration;
    }

    public IssueEntity withChangeStatus(String changeStatus) {
        this.changeStatus = changeStatus;
        return this;
    }

    /**
     * 工作项变更状态。
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
     * 无需分解原因。
     * @return noBreakReason
     */
    public String getNoBreakReason() {
        return noBreakReason;
    }

    public void setNoBreakReason(String noBreakReason) {
        this.noBreakReason = noBreakReason;
    }

    public IssueEntity withSubmittedBy(List<UserEntity> submittedBy) {
        this.submittedBy = submittedBy;
        return this;
    }

    public IssueEntity addSubmittedByItem(UserEntity submittedByItem) {
        if (this.submittedBy == null) {
            this.submittedBy = new ArrayList<>();
        }
        this.submittedBy.add(submittedByItem);
        return this;
    }

    public IssueEntity withSubmittedBy(Consumer<List<UserEntity>> submittedBySetter) {
        if (this.submittedBy == null) {
            this.submittedBy = new ArrayList<>();
        }
        submittedBySetter.accept(this.submittedBy);
        return this;
    }

    /**
     * 工作项提出人。数组元素为UserEntity对象。
     * @return submittedBy
     */
    public List<UserEntity> getSubmittedBy() {
        return submittedBy;
    }

    public void setSubmittedBy(List<UserEntity> submittedBy) {
        this.submittedBy = submittedBy;
    }

    public IssueEntity withIr2rr(String ir2rr) {
        this.ir2rr = ir2rr;
        return this;
    }

    /**
     * IR关联的RR ID，可以通过查询工作项列表或者查询树状工作项接口获取，响应消息体中的id字段的值就是工作项ID。
     * @return ir2rr
     */
    public String getIr2rr() {
        return ir2rr;
    }

    public void setIr2rr(String ir2rr) {
        this.ir2rr = ir2rr;
    }

    public IssueEntity withFeatureSet(String featureSet) {
        this.featureSet = featureSet;
        return this;
    }

    /**
     * 特性集ID，可以通过查询特性集接口获取，响应消息体中的id字段的值就是特性集ID。
     * @return featureSet
     */
    public String getFeatureSet() {
        return featureSet;
    }

    public void setFeatureSet(String featureSet) {
        this.featureSet = featureSet;
    }

    public IssueEntity withExpectedRepairDate(String expectedRepairDate) {
        this.expectedRepairDate = expectedRepairDate;
        return this;
    }

    /**
     * 期望修复时间。预设字段中，仅Bug有此字段，unix时间戳，单位：毫秒。
     * @return expectedRepairDate
     */
    public String getExpectedRepairDate() {
        return expectedRepairDate;
    }

    public void setExpectedRepairDate(String expectedRepairDate) {
        this.expectedRepairDate = expectedRepairDate;
    }

    public IssueEntity withFoundPi(String foundPi) {
        this.foundPi = foundPi;
        return this;
    }

    /**
     * 缺陷发现发布计划ID，预设字段中，仅Bug有此字段。通过发布/迭代计划列表查询接口查询计划列表，返回参数中PlanVO里面的category=PI的对象的id字段就是迭代计划的ID。
     * @return foundPi
     */
    public String getFoundPi() {
        return foundPi;
    }

    public void setFoundPi(String foundPi) {
        this.foundPi = foundPi;
    }

    public IssueEntity withFoundIteration(String foundIteration) {
        this.foundIteration = foundIteration;
        return this;
    }

    /**
     * 缺陷发现迭代计划ID，预设字段中，仅Bug有此字段。通过发布/迭代计划列表查询接口查询计划列表，返回参数中PlanVO里面的category=Iteration的对象的id字段就是迭代计划的ID。
     * @return foundIteration
     */
    public String getFoundIteration() {
        return foundIteration;
    }

    public void setFoundIteration(String foundIteration) {
        this.foundIteration = foundIteration;
    }

    public IssueEntity withReasonAnalysis(String reasonAnalysis) {
        this.reasonAnalysis = reasonAnalysis;
        return this;
    }

    /**
     * 分析原因。
     * @return reasonAnalysis
     */
    public String getReasonAnalysis() {
        return reasonAnalysis;
    }

    public void setReasonAnalysis(String reasonAnalysis) {
        this.reasonAnalysis = reasonAnalysis;
    }

    public IssueEntity withRepairSolution(String repairSolution) {
        this.repairSolution = repairSolution;
        return this;
    }

    /**
     * 修复方案。预设字段中，仅Bug有此字段。
     * @return repairSolution
     */
    public String getRepairSolution() {
        return repairSolution;
    }

    public void setRepairSolution(String repairSolution) {
        this.repairSolution = repairSolution;
    }

    public IssueEntity withTestReport(String testReport) {
        this.testReport = testReport;
        return this;
    }

    /**
     * 测试报告。预设字段中，仅Bug有此字段。
     * @return testReport
     */
    public String getTestReport() {
        return testReport;
    }

    public void setTestReport(String testReport) {
        this.testReport = testReport;
    }

    public IssueEntity withSysNoRepairReason(String sysNoRepairReason) {
        this.sysNoRepairReason = sysNoRepairReason;
        return this;
    }

    /**
     * 无需修复原因。预设字段中，仅Bug有此字段。
     * @return sysNoRepairReason
     */
    public String getSysNoRepairReason() {
        return sysNoRepairReason;
    }

    public void setSysNoRepairReason(String sysNoRepairReason) {
        this.sysNoRepairReason = sysNoRepairReason;
    }

    public IssueEntity withSysActivationReason(String sysActivationReason) {
        this.sysActivationReason = sysActivationReason;
        return this;
    }

    /**
     * 激活原因。预设字段中，仅Bug有此字段。
     * @return sysActivationReason
     */
    public String getSysActivationReason() {
        return sysActivationReason;
    }

    public void setSysActivationReason(String sysActivationReason) {
        this.sysActivationReason = sysActivationReason;
    }

    public IssueEntity withSysReturnReason(String sysReturnReason) {
        this.sysReturnReason = sysReturnReason;
        return this;
    }

    /**
     * 退回原因。预设字段中，仅Bug有此字段。
     * @return sysReturnReason
     */
    public String getSysReturnReason() {
        return sysReturnReason;
    }

    public void setSysReturnReason(String sysReturnReason) {
        this.sysReturnReason = sysReturnReason;
    }

    public IssueEntity withTestFailuresTimes(Integer testFailuresTimes) {
        this.testFailuresTimes = testFailuresTimes;
        return this;
    }

    /**
     * 回归不通过次数。预设字段中，仅Bug有此字段。
     * minimum: 0
     * maximum: 999999
     * @return testFailuresTimes
     */
    public Integer getTestFailuresTimes() {
        return testFailuresTimes;
    }

    public void setTestFailuresTimes(Integer testFailuresTimes) {
        this.testFailuresTimes = testFailuresTimes;
    }

    public IssueEntity withCloseType(String closeType) {
        this.closeType = closeType;
        return this;
    }

    /**
     * 关闭类型。
     * @return closeType
     */
    public String getCloseType() {
        return closeType;
    }

    public void setCloseType(String closeType) {
        this.closeType = closeType;
    }

    public IssueEntity withPlanOwner(UserEntity planOwner) {
        this.planOwner = planOwner;
        return this;
    }

    public IssueEntity withPlanOwner(Consumer<UserEntity> planOwnerSetter) {
        if (this.planOwner == null) {
            this.planOwner = new UserEntity();
            planOwnerSetter.accept(this.planOwner);
        }

        return this;
    }

    /**
     * Get planOwner
     * @return planOwner
     */
    public UserEntity getPlanOwner() {
        return planOwner;
    }

    public void setPlanOwner(UserEntity planOwner) {
        this.planOwner = planOwner;
    }

    public IssueEntity withDoingOwner(UserEntity doingOwner) {
        this.doingOwner = doingOwner;
        return this;
    }

    public IssueEntity withDoingOwner(Consumer<UserEntity> doingOwnerSetter) {
        if (this.doingOwner == null) {
            this.doingOwner = new UserEntity();
            doingOwnerSetter.accept(this.doingOwner);
        }

        return this;
    }

    /**
     * Get doingOwner
     * @return doingOwner
     */
    public UserEntity getDoingOwner() {
        return doingOwner;
    }

    public void setDoingOwner(UserEntity doingOwner) {
        this.doingOwner = doingOwner;
    }

    public IssueEntity withDeliveredOwner(UserEntity deliveredOwner) {
        this.deliveredOwner = deliveredOwner;
        return this;
    }

    public IssueEntity withDeliveredOwner(Consumer<UserEntity> deliveredOwnerSetter) {
        if (this.deliveredOwner == null) {
            this.deliveredOwner = new UserEntity();
            deliveredOwnerSetter.accept(this.deliveredOwner);
        }

        return this;
    }

    /**
     * Get deliveredOwner
     * @return deliveredOwner
     */
    public UserEntity getDeliveredOwner() {
        return deliveredOwner;
    }

    public void setDeliveredOwner(UserEntity deliveredOwner) {
        this.deliveredOwner = deliveredOwner;
    }

    public IssueEntity withCheckingOwner(UserEntity checkingOwner) {
        this.checkingOwner = checkingOwner;
        return this;
    }

    public IssueEntity withCheckingOwner(Consumer<UserEntity> checkingOwnerSetter) {
        if (this.checkingOwner == null) {
            this.checkingOwner = new UserEntity();
            checkingOwnerSetter.accept(this.checkingOwner);
        }

        return this;
    }

    /**
     * Get checkingOwner
     * @return checkingOwner
     */
    public UserEntity getCheckingOwner() {
        return checkingOwner;
    }

    public void setCheckingOwner(UserEntity checkingOwner) {
        this.checkingOwner = checkingOwner;
    }

    public IssueEntity withTestOwner(UserEntity testOwner) {
        this.testOwner = testOwner;
        return this;
    }

    public IssueEntity withTestOwner(Consumer<UserEntity> testOwnerSetter) {
        if (this.testOwner == null) {
            this.testOwner = new UserEntity();
            testOwnerSetter.accept(this.testOwner);
        }

        return this;
    }

    /**
     * Get testOwner
     * @return testOwner
     */
    public UserEntity getTestOwner() {
        return testOwner;
    }

    public void setTestOwner(UserEntity testOwner) {
        this.testOwner = testOwner;
    }

    public IssueEntity withDevelopOwner(UserEntity developOwner) {
        this.developOwner = developOwner;
        return this;
    }

    public IssueEntity withDevelopOwner(Consumer<UserEntity> developOwnerSetter) {
        if (this.developOwner == null) {
            this.developOwner = new UserEntity();
            developOwnerSetter.accept(this.developOwner);
        }

        return this;
    }

    /**
     * Get developOwner
     * @return developOwner
     */
    public UserEntity getDevelopOwner() {
        return developOwner;
    }

    public void setDevelopOwner(UserEntity developOwner) {
        this.developOwner = developOwner;
    }

    public IssueEntity withProcessingOwner(UserEntity processingOwner) {
        this.processingOwner = processingOwner;
        return this;
    }

    public IssueEntity withProcessingOwner(Consumer<UserEntity> processingOwnerSetter) {
        if (this.processingOwner == null) {
            this.processingOwner = new UserEntity();
            processingOwnerSetter.accept(this.processingOwner);
        }

        return this;
    }

    /**
     * Get processingOwner
     * @return processingOwner
     */
    public UserEntity getProcessingOwner() {
        return processingOwner;
    }

    public void setProcessingOwner(UserEntity processingOwner) {
        this.processingOwner = processingOwner;
    }

    public IssueEntity withFixedOwner(UserEntity fixedOwner) {
        this.fixedOwner = fixedOwner;
        return this;
    }

    public IssueEntity withFixedOwner(Consumer<UserEntity> fixedOwnerSetter) {
        if (this.fixedOwner == null) {
            this.fixedOwner = new UserEntity();
            fixedOwnerSetter.accept(this.fixedOwner);
        }

        return this;
    }

    /**
     * Get fixedOwner
     * @return fixedOwner
     */
    public UserEntity getFixedOwner() {
        return fixedOwner;
    }

    public void setFixedOwner(UserEntity fixedOwner) {
        this.fixedOwner = fixedOwner;
    }

    public IssueEntity withResearchanddevelopOwner(UserEntity researchanddevelopOwner) {
        this.researchanddevelopOwner = researchanddevelopOwner;
        return this;
    }

    public IssueEntity withResearchanddevelopOwner(Consumer<UserEntity> researchanddevelopOwnerSetter) {
        if (this.researchanddevelopOwner == null) {
            this.researchanddevelopOwner = new UserEntity();
            researchanddevelopOwnerSetter.accept(this.researchanddevelopOwner);
        }

        return this;
    }

    /**
     * Get researchanddevelopOwner
     * @return researchanddevelopOwner
     */
    public UserEntity getResearchanddevelopOwner() {
        return researchanddevelopOwner;
    }

    public void setResearchanddevelopOwner(UserEntity researchanddevelopOwner) {
        this.researchanddevelopOwner = researchanddevelopOwner;
    }

    public IssueEntity withAnalyseOwner(UserEntity analyseOwner) {
        this.analyseOwner = analyseOwner;
        return this;
    }

    public IssueEntity withAnalyseOwner(Consumer<UserEntity> analyseOwnerSetter) {
        if (this.analyseOwner == null) {
            this.analyseOwner = new UserEntity();
            analyseOwnerSetter.accept(this.analyseOwner);
        }

        return this;
    }

    /**
     * Get analyseOwner
     * @return analyseOwner
     */
    public UserEntity getAnalyseOwner() {
        return analyseOwner;
    }

    public void setAnalyseOwner(UserEntity analyseOwner) {
        this.analyseOwner = analyseOwner;
    }

    public IssueEntity withPlanStartDate(String planStartDate) {
        this.planStartDate = planStartDate;
        return this;
    }

    /**
     * 计划开始时间。工作项的计划启动日期，用于项目进度管理和排期。
     * @return planStartDate
     */
    public String getPlanStartDate() {
        return planStartDate;
    }

    public void setPlanStartDate(String planStartDate) {
        this.planStartDate = planStartDate;
    }

    public IssueEntity withExpectDeliveryTime(String expectDeliveryTime) {
        this.expectDeliveryTime = expectDeliveryTime;
        return this;
    }

    /**
     * 期望完成时间。工作项的预期交付日期，用于跟踪工作项是否按期完成。
     * @return expectDeliveryTime
     */
    public String getExpectDeliveryTime() {
        return expectDeliveryTime;
    }

    public void setExpectDeliveryTime(String expectDeliveryTime) {
        this.expectDeliveryTime = expectDeliveryTime;
    }

    public IssueEntity withPlanTestEndDate(String planTestEndDate) {
        this.planTestEndDate = planTestEndDate;
        return this;
    }

    /**
     * 计划测试结束时间。Bug类型工作项的计划测试完成日期，用于跟踪Bug修复后的测试进度。
     * @return planTestEndDate
     */
    public String getPlanTestEndDate() {
        return planTestEndDate;
    }

    public void setPlanTestEndDate(String planTestEndDate) {
        this.planTestEndDate = planTestEndDate;
    }

    public IssueEntity withSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * 严重程度。Bug类型工作项的严重级别，用于评估Bug的影响范围和修复优先级。
     * @return severity
     */
    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public IssueEntity withPromised(String promised) {
        this.promised = promised;
        return this;
    }

    /**
     * 是否承诺。RR（原始需求）类型工作项的承诺状态标识，用于标记需求是否已承诺交付。
     * @return promised
     */
    public String getPromised() {
        return promised;
    }

    public void setPromised(String promised) {
        this.promised = promised;
    }

    public IssueEntity withRecipient(List<UserEntity> recipient) {
        this.recipient = recipient;
        return this;
    }

    public IssueEntity addRecipientItem(UserEntity recipientItem) {
        if (this.recipient == null) {
            this.recipient = new ArrayList<>();
        }
        this.recipient.add(recipientItem);
        return this;
    }

    public IssueEntity withRecipient(Consumer<List<UserEntity>> recipientSetter) {
        if (this.recipient == null) {
            this.recipient = new ArrayList<>();
        }
        recipientSetter.accept(this.recipient);
        return this;
    }

    /**
     * 承接人。RR（原始需求）类型工作项的需求承接责任人，负责需求的分析和转化。
     * @return recipient
     */
    public List<UserEntity> getRecipient() {
        return recipient;
    }

    public void setRecipient(List<UserEntity> recipient) {
        this.recipient = recipient;
    }

    public IssueEntity withSysNoDevelopReason(String sysNoDevelopReason) {
        this.sysNoDevelopReason = sysNoDevelopReason;
        return this;
    }

    /**
     * 无需研发原因。RR（原始需求）类型工作项不需要进行研发的原因说明。
     * @return sysNoDevelopReason
     */
    public String getSysNoDevelopReason() {
        return sysNoDevelopReason;
    }

    public void setSysNoDevelopReason(String sysNoDevelopReason) {
        this.sysNoDevelopReason = sysNoDevelopReason;
    }

    public IssueEntity withValFeature(String valFeature) {
        this.valFeature = valFeature;
        return this;
    }

    /**
     * 价值特性。SF/FE类型工作项对应的业务价值特性描述，用于关联业务价值和技术实现。
     * @return valFeature
     */
    public String getValFeature() {
        return valFeature;
    }

    public void setValFeature(String valFeature) {
        this.valFeature = valFeature;
    }

    public IssueEntity withFunctionScene(String functionScene) {
        this.functionScene = functionScene;
        return this;
    }

    /**
     * 功能场景。SF/FE类型工作项的功能应用场景描述，用于说明特性的使用场景和用户故事。
     * @return functionScene
     */
    public String getFunctionScene() {
        return functionScene;
    }

    public void setFunctionScene(String functionScene) {
        this.functionScene = functionScene;
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
            && Objects.equals(this.categoryLayerId, that.categoryLayerId)
            && Objects.equals(this.parentId, that.parentId) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.status, that.status) && Objects.equals(this.state, that.state)
            && Objects.equals(this.assignee, that.assignee) && Objects.equals(this.assignedCc, that.assignedCc)
            && Objects.equals(this.createdBy, that.createdBy) && Objects.equals(this.createdTime, that.createdTime)
            && Objects.equals(this.modifiedBy, that.modifiedBy) && Objects.equals(this.modifiedTime, that.modifiedTime)
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
            && Objects.equals(this.planIteration, that.planIteration)
            && Objects.equals(this.changeStatus, that.changeStatus)
            && Objects.equals(this.noBreakReason, that.noBreakReason)
            && Objects.equals(this.submittedBy, that.submittedBy) && Objects.equals(this.ir2rr, that.ir2rr)
            && Objects.equals(this.featureSet, that.featureSet)
            && Objects.equals(this.expectedRepairDate, that.expectedRepairDate)
            && Objects.equals(this.foundPi, that.foundPi) && Objects.equals(this.foundIteration, that.foundIteration)
            && Objects.equals(this.reasonAnalysis, that.reasonAnalysis)
            && Objects.equals(this.repairSolution, that.repairSolution)
            && Objects.equals(this.testReport, that.testReport)
            && Objects.equals(this.sysNoRepairReason, that.sysNoRepairReason)
            && Objects.equals(this.sysActivationReason, that.sysActivationReason)
            && Objects.equals(this.sysReturnReason, that.sysReturnReason)
            && Objects.equals(this.testFailuresTimes, that.testFailuresTimes)
            && Objects.equals(this.closeType, that.closeType) && Objects.equals(this.planOwner, that.planOwner)
            && Objects.equals(this.doingOwner, that.doingOwner)
            && Objects.equals(this.deliveredOwner, that.deliveredOwner)
            && Objects.equals(this.checkingOwner, that.checkingOwner) && Objects.equals(this.testOwner, that.testOwner)
            && Objects.equals(this.developOwner, that.developOwner)
            && Objects.equals(this.processingOwner, that.processingOwner)
            && Objects.equals(this.fixedOwner, that.fixedOwner)
            && Objects.equals(this.researchanddevelopOwner, that.researchanddevelopOwner)
            && Objects.equals(this.analyseOwner, that.analyseOwner)
            && Objects.equals(this.planStartDate, that.planStartDate)
            && Objects.equals(this.expectDeliveryTime, that.expectDeliveryTime)
            && Objects.equals(this.planTestEndDate, that.planTestEndDate)
            && Objects.equals(this.severity, that.severity) && Objects.equals(this.promised, that.promised)
            && Objects.equals(this.recipient, that.recipient)
            && Objects.equals(this.sysNoDevelopReason, that.sysNoDevelopReason)
            && Objects.equals(this.valFeature, that.valFeature)
            && Objects.equals(this.functionScene, that.functionScene);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            title,
            description,
            type,
            number,
            category,
            categoryLayerId,
            parentId,
            projectId,
            status,
            state,
            assignee,
            assignedCc,
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
            planIteration,
            changeStatus,
            noBreakReason,
            submittedBy,
            ir2rr,
            featureSet,
            expectedRepairDate,
            foundPi,
            foundIteration,
            reasonAnalysis,
            repairSolution,
            testReport,
            sysNoRepairReason,
            sysActivationReason,
            sysReturnReason,
            testFailuresTimes,
            closeType,
            planOwner,
            doingOwner,
            deliveredOwner,
            checkingOwner,
            testOwner,
            developOwner,
            processingOwner,
            fixedOwner,
            researchanddevelopOwner,
            analyseOwner,
            planStartDate,
            expectDeliveryTime,
            planTestEndDate,
            severity,
            promised,
            recipient,
            sysNoDevelopReason,
            valFeature,
            functionScene);
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
        sb.append("    categoryLayerId: ").append(toIndentedString(categoryLayerId)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
        sb.append("    assignedCc: ").append(toIndentedString(assignedCc)).append("\n");
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
        sb.append("    planIteration: ").append(toIndentedString(planIteration)).append("\n");
        sb.append("    changeStatus: ").append(toIndentedString(changeStatus)).append("\n");
        sb.append("    noBreakReason: ").append(toIndentedString(noBreakReason)).append("\n");
        sb.append("    submittedBy: ").append(toIndentedString(submittedBy)).append("\n");
        sb.append("    ir2rr: ").append(toIndentedString(ir2rr)).append("\n");
        sb.append("    featureSet: ").append(toIndentedString(featureSet)).append("\n");
        sb.append("    expectedRepairDate: ").append(toIndentedString(expectedRepairDate)).append("\n");
        sb.append("    foundPi: ").append(toIndentedString(foundPi)).append("\n");
        sb.append("    foundIteration: ").append(toIndentedString(foundIteration)).append("\n");
        sb.append("    reasonAnalysis: ").append(toIndentedString(reasonAnalysis)).append("\n");
        sb.append("    repairSolution: ").append(toIndentedString(repairSolution)).append("\n");
        sb.append("    testReport: ").append(toIndentedString(testReport)).append("\n");
        sb.append("    sysNoRepairReason: ").append(toIndentedString(sysNoRepairReason)).append("\n");
        sb.append("    sysActivationReason: ").append(toIndentedString(sysActivationReason)).append("\n");
        sb.append("    sysReturnReason: ").append(toIndentedString(sysReturnReason)).append("\n");
        sb.append("    testFailuresTimes: ").append(toIndentedString(testFailuresTimes)).append("\n");
        sb.append("    closeType: ").append(toIndentedString(closeType)).append("\n");
        sb.append("    planOwner: ").append(toIndentedString(planOwner)).append("\n");
        sb.append("    doingOwner: ").append(toIndentedString(doingOwner)).append("\n");
        sb.append("    deliveredOwner: ").append(toIndentedString(deliveredOwner)).append("\n");
        sb.append("    checkingOwner: ").append(toIndentedString(checkingOwner)).append("\n");
        sb.append("    testOwner: ").append(toIndentedString(testOwner)).append("\n");
        sb.append("    developOwner: ").append(toIndentedString(developOwner)).append("\n");
        sb.append("    processingOwner: ").append(toIndentedString(processingOwner)).append("\n");
        sb.append("    fixedOwner: ").append(toIndentedString(fixedOwner)).append("\n");
        sb.append("    researchanddevelopOwner: ").append(toIndentedString(researchanddevelopOwner)).append("\n");
        sb.append("    analyseOwner: ").append(toIndentedString(analyseOwner)).append("\n");
        sb.append("    planStartDate: ").append(toIndentedString(planStartDate)).append("\n");
        sb.append("    expectDeliveryTime: ").append(toIndentedString(expectDeliveryTime)).append("\n");
        sb.append("    planTestEndDate: ").append(toIndentedString(planTestEndDate)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    promised: ").append(toIndentedString(promised)).append("\n");
        sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
        sb.append("    sysNoDevelopReason: ").append(toIndentedString(sysNoDevelopReason)).append("\n");
        sb.append("    valFeature: ").append(toIndentedString(valFeature)).append("\n");
        sb.append("    functionScene: ").append(toIndentedString(functionScene)).append("\n");
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
