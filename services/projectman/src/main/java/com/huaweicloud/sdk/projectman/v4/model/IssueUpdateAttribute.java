package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 工作项更新对象
 */
public class IssueUpdateAttribute {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_id")

    private String parentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assignee")

    private UserUpdateAttribute assignee;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assigned_cc")

    private List<UserUpdateAttribute> assignedCc = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_end_date")

    private String planEndDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload")

    private String workload;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "link")

    private String link;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private List<LabelEntity> labels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_fields")

    private List<FieldCodeValuePair> customFields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ir2feature")

    private String ir2feature;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "need_break")

    private String needBreak;

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
    @JsonProperty(value = "business_domain")

    private String businessDomain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_pi")

    private String planPi;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_iteration")

    private String planIteration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "no_break_reason")

    private String noBreakReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "submitted_by")

    private List<UserUpdateAttribute> submittedBy = null;

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
    @JsonProperty(value = "security_level")

    private String securityLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_owner")

    private UserUpdateAttribute planOwner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "doing_owner")

    private UserUpdateAttribute doingOwner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delivered_owner")

    private UserUpdateAttribute deliveredOwner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "checking_owner")

    private UserUpdateAttribute checkingOwner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_owner")

    private UserUpdateAttribute testOwner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "develop_owner")

    private UserUpdateAttribute developOwner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "processing_owner")

    private UserUpdateAttribute processingOwner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fixed_owner")

    private UserUpdateAttribute fixedOwner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "researchanddevelop_owner")

    private UserUpdateAttribute researchanddevelopOwner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "analyse_owner")

    private UserUpdateAttribute analyseOwner;

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

    private List<UserUpdateAttribute> recipient = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sys_no_develop_reason")

    private String sysNoDevelopReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "val_feature")

    private String valFeature;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "function_scene")

    private String functionScene;

    public IssueUpdateAttribute withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * **参数解释**： 工作项类型编码。编辑工作项时，此字段必填、值为当前工作项正确的工作项类型，但不会更新此字段。 **约束限制**： 不涉及。 **取值范围**： 支持多种工作项类型，使用英文逗号分隔。 - 系统设备类项目：RR、SF、IR、SR、AR、Task、Bug - 独立软件类项目：RR、SF、IR、US、Task、Bug - 云服务类项目：RR、Epic、FE、US、Task、Bug **默认取值**： 不涉及。
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public IssueUpdateAttribute withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**： 工作项描述字段，可通过[查询树状工作项](ShowIpdIssueTree.xml)接口获取，响应消息体中的**description**字段的值就是工作项描述字段。 **约束限制**： 不涉及。 **取值范围**： 1~500000个字符。 **默认取值**： 不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public IssueUpdateAttribute withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * **参数解释**： 父工作项ID，可通过[查询树状工作项](ShowIpdIssueTree.xml)接口获取，响应消息体中的**parent_id**字段的值就是父工作项ID。 **约束限制**： 不涉及。 **取值范围**： 18~19个字符的数字字符串。 **默认取值**： 不涉及。
     * @return parentId
     */
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public IssueUpdateAttribute withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 工作项状态code。可通过[查询工作项状态](ListIssueStatues.xml)接口获取，响应消息体中的**code**字段的值就是工作项状态code。 **约束限制**： 不涉及。 **取值范围**： 2~32个字符。 **默认取值**： 不涉及。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public IssueUpdateAttribute withAssignee(UserUpdateAttribute assignee) {
        this.assignee = assignee;
        return this;
    }

    public IssueUpdateAttribute withAssignee(Consumer<UserUpdateAttribute> assigneeSetter) {
        if (this.assignee == null) {
            this.assignee = new UserUpdateAttribute();
            assigneeSetter.accept(this.assignee);
        }

        return this;
    }

    /**
     * Get assignee
     * @return assignee
     */
    public UserUpdateAttribute getAssignee() {
        return assignee;
    }

    public void setAssignee(UserUpdateAttribute assignee) {
        this.assignee = assignee;
    }

    public IssueUpdateAttribute withAssignedCc(List<UserUpdateAttribute> assignedCc) {
        this.assignedCc = assignedCc;
        return this;
    }

    public IssueUpdateAttribute addAssignedCcItem(UserUpdateAttribute assignedCcItem) {
        if (this.assignedCc == null) {
            this.assignedCc = new ArrayList<>();
        }
        this.assignedCc.add(assignedCcItem);
        return this;
    }

    public IssueUpdateAttribute withAssignedCc(Consumer<List<UserUpdateAttribute>> assignedCcSetter) {
        if (this.assignedCc == null) {
            this.assignedCc = new ArrayList<>();
        }
        assignedCcSetter.accept(this.assignedCc);
        return this;
    }

    /**
     * **参数解释**： 工作项抄送人，支持多个抄送人。数组元素为UserUpdateAttribute对象。 **约束限制**： 同一工作项最多支持50个抄送人。
     * @return assignedCc
     */
    public List<UserUpdateAttribute> getAssignedCc() {
        return assignedCc;
    }

    public void setAssignedCc(List<UserUpdateAttribute> assignedCc) {
        this.assignedCc = assignedCc;
    }

    public IssueUpdateAttribute withPlanEndDate(String planEndDate) {
        this.planEndDate = planEndDate;
        return this;
    }

    /**
     * **参数解释**： 工作项计划结束日期，unix时间戳，单位：毫秒。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return planEndDate
     */
    public String getPlanEndDate() {
        return planEndDate;
    }

    public void setPlanEndDate(String planEndDate) {
        this.planEndDate = planEndDate;
    }

    public IssueUpdateAttribute withWorkload(String workload) {
        this.workload = workload;
        return this;
    }

    /**
     * **参数解释**： 工作项计划工时。 **约束限制**： 保留一位小数。 **取值范围**： 0~999999999.9。 **默认取值**： 不涉及。
     * @return workload
     */
    public String getWorkload() {
        return workload;
    }

    public void setWorkload(String workload) {
        this.workload = workload;
    }

    public IssueUpdateAttribute withLink(String link) {
        this.link = link;
        return this;
    }

    /**
     * **参数解释**： 工作项关联项ID。 **约束限制**： 多个关联项用英文逗号分隔，同一工作项最多支持50个关联项。 **取值范围**： 0~2048个字符。 **默认取值**： 不涉及。
     * @return link
     */
    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public IssueUpdateAttribute withLabels(List<LabelEntity> labels) {
        this.labels = labels;
        return this;
    }

    public IssueUpdateAttribute addLabelsItem(LabelEntity labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    public IssueUpdateAttribute withLabels(Consumer<List<LabelEntity>> labelsSetter) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        labelsSetter.accept(this.labels);
        return this;
    }

    /**
     * **参数解释**： 工作项标签。数组元素为LabelEntity对象。 **约束限制**： 不涉及。 **取值范围**： 0~50个元素，每个元素为LabelEntity对象。 **默认取值**： 不涉及。
     * @return labels
     */
    public List<LabelEntity> getLabels() {
        return labels;
    }

    public void setLabels(List<LabelEntity> labels) {
        this.labels = labels;
    }

    public IssueUpdateAttribute withCustomFields(List<FieldCodeValuePair> customFields) {
        this.customFields = customFields;
        return this;
    }

    public IssueUpdateAttribute addCustomFieldsItem(FieldCodeValuePair customFieldsItem) {
        if (this.customFields == null) {
            this.customFields = new ArrayList<>();
        }
        this.customFields.add(customFieldsItem);
        return this;
    }

    public IssueUpdateAttribute withCustomFields(Consumer<List<FieldCodeValuePair>> customFieldsSetter) {
        if (this.customFields == null) {
            this.customFields = new ArrayList<>();
        }
        customFieldsSetter.accept(this.customFields);
        return this;
    }

    /**
     * **参数解释**： 工作项自定义字段映射，用户添加的系统字段也在此列，格式为{\"code\":\"字段code\",\"value\":\"字段值\"}。数组元素为FieldCodeValuePair对象。 **约束限制**： 不涉及。 **取值范围**： 0~200个元素，每个元素为FieldCodeValuePair对象。 **默认取值**： 不涉及。
     * @return customFields
     */
    public List<FieldCodeValuePair> getCustomFields() {
        return customFields;
    }

    public void setCustomFields(List<FieldCodeValuePair> customFields) {
        this.customFields = customFields;
    }

    public IssueUpdateAttribute withIr2feature(String ir2feature) {
        this.ir2feature = ir2feature;
        return this;
    }

    /**
     * **参数解释**： IR和SF的关联字段。 **约束限制**： IR可以填写该字段。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return ir2feature
     */
    public String getIr2feature() {
        return ir2feature;
    }

    public void setIr2feature(String ir2feature) {
        this.ir2feature = ir2feature;
    }

    public IssueUpdateAttribute withNeedBreak(String needBreak) {
        this.needBreak = needBreak;
        return this;
    }

    /**
     * **参数解释**： 工作项是否需要分解。 **约束限制**： 仅可以分解的工作项类型有此字段。 **取值范围**： - yes：需要分解 - no：不需要分解 **默认取值**： 不涉及。
     * @return needBreak
     */
    public String getNeedBreak() {
        return needBreak;
    }

    public void setNeedBreak(String needBreak) {
        this.needBreak = needBreak;
    }

    public IssueUpdateAttribute withBaseline(String baseline) {
        this.baseline = baseline;
        return this;
    }

    /**
     * **参数解释**： 工作项基线状态。 **约束限制**： 不涉及。 **取值范围**： - null：未基线 - baselined：已基线 - baseline-reviewing：基线评审中 **默认取值**： 不涉及。
     * @return baseline
     */
    public String getBaseline() {
        return baseline;
    }

    public void setBaseline(String baseline) {
        this.baseline = baseline;
    }

    public IssueUpdateAttribute withPriority(String priority) {
        this.priority = priority;
        return this;
    }

    /**
     * **参数解释**： 工作项优先级，部分工作项有此字段。 **约束限制**： 不涉及。 **取值范围**： - 低：低优先级。 - 中：中优先级。 - 高：高优先级。 **默认取值**： 不涉及。
     * @return priority
     */
    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public IssueUpdateAttribute withRelatedNetworkSecurity(String relatedNetworkSecurity) {
        this.relatedNetworkSecurity = relatedNetworkSecurity;
        return this;
    }

    /**
     * **参数解释**： 是否涉及网络安全。 **约束限制**： 预设字段中，仅研发需求类型的工作项有此字段。 **取值范围**： - yes：涉及网络安全。 - no：不涉及网络安全。 **默认取值**： 不涉及。
     * @return relatedNetworkSecurity
     */
    public String getRelatedNetworkSecurity() {
        return relatedNetworkSecurity;
    }

    public void setRelatedNetworkSecurity(String relatedNetworkSecurity) {
        this.relatedNetworkSecurity = relatedNetworkSecurity;
    }

    public IssueUpdateAttribute withBusinessDomain(String businessDomain) {
        this.businessDomain = businessDomain;
        return this;
    }

    /**
     * **参数解释**： 领域字段。 **约束限制**： 不涉及。 **取值范围**： - software - soft-hardware - hardware - 性能 - 功能 - 运维 - 运营 - 用户体验 - 隐私保护 - 合规 - 韧性(可靠性/可用性) - 韧性(危险检测与相应恢复) - 透明 - 无害 - 安全 - API - 成本 - 可维护性 - 其他DFX - 可用性 - others **默认取值**： 不涉及。
     * @return businessDomain
     */
    public String getBusinessDomain() {
        return businessDomain;
    }

    public void setBusinessDomain(String businessDomain) {
        this.businessDomain = businessDomain;
    }

    public IssueUpdateAttribute withPlanPi(String planPi) {
        this.planPi = planPi;
        return this;
    }

    /**
     * **参数解释**： 工作项发布计划ID。通过[发布/迭代计划列表查询](ListPlan.xml)接口查询计划列表，返回参数中PlanVO里面的category=PI的对象的**id**字段就是迭代计划的ID。 **约束限制**： 不涉及。 **取值范围**： 18~19个字符的数字字符串。 **默认取值**： 不涉及。
     * @return planPi
     */
    public String getPlanPi() {
        return planPi;
    }

    public void setPlanPi(String planPi) {
        this.planPi = planPi;
    }

    public IssueUpdateAttribute withPlanIteration(String planIteration) {
        this.planIteration = planIteration;
        return this;
    }

    /**
     * **参数解释**： 工作项完成的迭代计划ID，在Bug中为修复迭代计划ID。通过[发布/迭代计划列表查询](ListPlan.xml)接口查询计划列表，返回参数中PlanVO里面的category=Iteration的对象的**id**字段就是迭代计划的ID。 **约束限制**： 18~19个字符的数字字符串。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return planIteration
     */
    public String getPlanIteration() {
        return planIteration;
    }

    public void setPlanIteration(String planIteration) {
        this.planIteration = planIteration;
    }

    public IssueUpdateAttribute withNoBreakReason(String noBreakReason) {
        this.noBreakReason = noBreakReason;
        return this;
    }

    /**
     * **参数解释**： 无需分解原因。 **约束限制**： need_break字段值为“no”时有此字段。 **取值范围**： 0~512个字符。 **默认取值**： 不涉及。
     * @return noBreakReason
     */
    public String getNoBreakReason() {
        return noBreakReason;
    }

    public void setNoBreakReason(String noBreakReason) {
        this.noBreakReason = noBreakReason;
    }

    public IssueUpdateAttribute withSubmittedBy(List<UserUpdateAttribute> submittedBy) {
        this.submittedBy = submittedBy;
        return this;
    }

    public IssueUpdateAttribute addSubmittedByItem(UserUpdateAttribute submittedByItem) {
        if (this.submittedBy == null) {
            this.submittedBy = new ArrayList<>();
        }
        this.submittedBy.add(submittedByItem);
        return this;
    }

    public IssueUpdateAttribute withSubmittedBy(Consumer<List<UserUpdateAttribute>> submittedBySetter) {
        if (this.submittedBy == null) {
            this.submittedBy = new ArrayList<>();
        }
        submittedBySetter.accept(this.submittedBy);
        return this;
    }

    /**
     * **参数解释**： 工作项提出人。数组元素为UserUpdateAttribute对象。 **约束限制**： 不涉及。
     * @return submittedBy
     */
    public List<UserUpdateAttribute> getSubmittedBy() {
        return submittedBy;
    }

    public void setSubmittedBy(List<UserUpdateAttribute> submittedBy) {
        this.submittedBy = submittedBy;
    }

    public IssueUpdateAttribute withIr2rr(String ir2rr) {
        this.ir2rr = ir2rr;
        return this;
    }

    /**
     * **参数解释**： IR关联的RR ID，可以通过[查询工作项列表](ListIpdProjectIssues.xml)或者[查询树状工作项](ShowIpdIssueTree.xml)接口获取，响应消息体中的**id**字段的值就是工作项ID。 **约束限制**： 多个关联项ID使用英文逗号分隔。 **取值范围**： 0~1024个字符。 **默认取值**： 不涉及。
     * @return ir2rr
     */
    public String getIr2rr() {
        return ir2rr;
    }

    public void setIr2rr(String ir2rr) {
        this.ir2rr = ir2rr;
    }

    public IssueUpdateAttribute withFeatureSet(String featureSet) {
        this.featureSet = featureSet;
        return this;
    }

    /**
     * **参数解释**： 特性集ID，可以通过[查询特性集](ShowBaselineSnapshots.xml)接口获取，响应消息体中的**id**字段的值就是特性集ID。 **约束限制**： 不涉及。 **取值范围**： 18~19个字符的数字字符串。 **默认取值**： 不涉及。
     * @return featureSet
     */
    public String getFeatureSet() {
        return featureSet;
    }

    public void setFeatureSet(String featureSet) {
        this.featureSet = featureSet;
    }

    public IssueUpdateAttribute withExpectedRepairDate(String expectedRepairDate) {
        this.expectedRepairDate = expectedRepairDate;
        return this;
    }

    /**
     * **参数解释**： 期望修复时间。预设字段中，仅Bug有此字段，unix时间戳，单位：毫秒。 **约束限制**： 不涉及。 **取值范围**： 11~19个字符。 **默认取值**： 不涉及。
     * @return expectedRepairDate
     */
    public String getExpectedRepairDate() {
        return expectedRepairDate;
    }

    public void setExpectedRepairDate(String expectedRepairDate) {
        this.expectedRepairDate = expectedRepairDate;
    }

    public IssueUpdateAttribute withFoundPi(String foundPi) {
        this.foundPi = foundPi;
        return this;
    }

    /**
     * **参数解释**： 缺陷发现发布计划ID，预设字段中，仅Bug有此字段。通过[发布/迭代计划列表查询](ListPlan.xml)接口查询计划列表，返回参数中PlanVO里面的category=PI的对象的**id**字段就是迭代计划的ID。 **约束限制**： 不涉及。 **取值范围**： 18~19个字符的数字字符串。 **默认取值**： 不涉及。
     * @return foundPi
     */
    public String getFoundPi() {
        return foundPi;
    }

    public void setFoundPi(String foundPi) {
        this.foundPi = foundPi;
    }

    public IssueUpdateAttribute withFoundIteration(String foundIteration) {
        this.foundIteration = foundIteration;
        return this;
    }

    /**
     * **参数解释**： 缺陷发现迭代计划ID，预设字段中，仅Bug有此字段。通过[发布/迭代计划列表查询](ListPlan.xml)接口查询计划列表，返回参数中PlanVO里面的category=Iteration的对象的**id**字段就是迭代计划的ID。 **约束限制**： 不涉及。 **取值范围**： 18~19个字符的数字字符串。 **默认取值**： 不涉及。
     * @return foundIteration
     */
    public String getFoundIteration() {
        return foundIteration;
    }

    public void setFoundIteration(String foundIteration) {
        this.foundIteration = foundIteration;
    }

    public IssueUpdateAttribute withReasonAnalysis(String reasonAnalysis) {
        this.reasonAnalysis = reasonAnalysis;
        return this;
    }

    /**
     * **参数解释**： 分析原因。 **约束限制**： 预设字段中，仅Bug有此字段。 **取值范围**： 0~50000个字符。 **默认取值**： 不涉及。
     * @return reasonAnalysis
     */
    public String getReasonAnalysis() {
        return reasonAnalysis;
    }

    public void setReasonAnalysis(String reasonAnalysis) {
        this.reasonAnalysis = reasonAnalysis;
    }

    public IssueUpdateAttribute withRepairSolution(String repairSolution) {
        this.repairSolution = repairSolution;
        return this;
    }

    /**
     * **参数解释**： 修复方案。预设字段中，仅Bug有此字段。 **约束限制**： 不涉及。 **取值范围**： 0~50000个字符。 **默认取值**： 不涉及。
     * @return repairSolution
     */
    public String getRepairSolution() {
        return repairSolution;
    }

    public void setRepairSolution(String repairSolution) {
        this.repairSolution = repairSolution;
    }

    public IssueUpdateAttribute withTestReport(String testReport) {
        this.testReport = testReport;
        return this;
    }

    /**
     * **参数解释**： 测试报告。预设字段中，仅Bug有此字段。 **约束限制**： 不涉及。 **取值范围**： 0~50000个字符。 **默认取值**： 不涉及。
     * @return testReport
     */
    public String getTestReport() {
        return testReport;
    }

    public void setTestReport(String testReport) {
        this.testReport = testReport;
    }

    public IssueUpdateAttribute withSysNoRepairReason(String sysNoRepairReason) {
        this.sysNoRepairReason = sysNoRepairReason;
        return this;
    }

    /**
     * **参数解释**： 无需修复原因。预设字段中，仅Bug有此字段。 **约束限制**： 不涉及。 **取值范围**： 0~50000个字符。 **默认取值**： 不涉及。
     * @return sysNoRepairReason
     */
    public String getSysNoRepairReason() {
        return sysNoRepairReason;
    }

    public void setSysNoRepairReason(String sysNoRepairReason) {
        this.sysNoRepairReason = sysNoRepairReason;
    }

    public IssueUpdateAttribute withSysActivationReason(String sysActivationReason) {
        this.sysActivationReason = sysActivationReason;
        return this;
    }

    /**
     * **参数解释**： 激活原因。预设字段中，仅Bug有此字段。 **约束限制**： 不涉及。 **取值范围**： 0~50000个字符。 **默认取值**： 不涉及。
     * @return sysActivationReason
     */
    public String getSysActivationReason() {
        return sysActivationReason;
    }

    public void setSysActivationReason(String sysActivationReason) {
        this.sysActivationReason = sysActivationReason;
    }

    public IssueUpdateAttribute withSysReturnReason(String sysReturnReason) {
        this.sysReturnReason = sysReturnReason;
        return this;
    }

    /**
     * **参数解释**： 退回原因。预设字段中，仅Bug有此字段。 **约束限制**： 不涉及。 **取值范围**： 0~50000个字符。 **默认取值**： 不涉及。
     * @return sysReturnReason
     */
    public String getSysReturnReason() {
        return sysReturnReason;
    }

    public void setSysReturnReason(String sysReturnReason) {
        this.sysReturnReason = sysReturnReason;
    }

    public IssueUpdateAttribute withTestFailuresTimes(Integer testFailuresTimes) {
        this.testFailuresTimes = testFailuresTimes;
        return this;
    }

    /**
     * **参数解释**： 回归不通过次数。预设字段中，仅Bug有此字段。 **约束限制**： 不涉及。 **取值范围**： 0~999999。 **默认取值**： 不涉及。
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

    public IssueUpdateAttribute withCloseType(String closeType) {
        this.closeType = closeType;
        return this;
    }

    /**
     * **参数解释**： 关闭类型。 **约束限制**： 不涉及。 **取值范围**： - problem_solved：问题解决关闭 - problem_to_requirement：问题转需求关闭 - duplicate_problem：重复问题关闭 - not_a_problem：非问题关闭 **默认取值**： 不涉及。
     * @return closeType
     */
    public String getCloseType() {
        return closeType;
    }

    public void setCloseType(String closeType) {
        this.closeType = closeType;
    }

    public IssueUpdateAttribute withSecurityLevel(String securityLevel) {
        this.securityLevel = securityLevel;
        return this;
    }

    /**
     * **参数解释**： 密级。低密级权限者不能访问高密级的工作项。可以通过[查询字段列表](ListIpdProjectFields.xml)接口获取，响应消息体中密级的**option**字段的值就是密级字段的可选值。 **约束限制**： 仅在涉密环境（SM）下存在此字段，非涉密环境下无此字段。涉密环境下必填。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return securityLevel
     */
    public String getSecurityLevel() {
        return securityLevel;
    }

    public void setSecurityLevel(String securityLevel) {
        this.securityLevel = securityLevel;
    }

    public IssueUpdateAttribute withPlanOwner(UserUpdateAttribute planOwner) {
        this.planOwner = planOwner;
        return this;
    }

    public IssueUpdateAttribute withPlanOwner(Consumer<UserUpdateAttribute> planOwnerSetter) {
        if (this.planOwner == null) {
            this.planOwner = new UserUpdateAttribute();
            planOwnerSetter.accept(this.planOwner);
        }

        return this;
    }

    /**
     * Get planOwner
     * @return planOwner
     */
    public UserUpdateAttribute getPlanOwner() {
        return planOwner;
    }

    public void setPlanOwner(UserUpdateAttribute planOwner) {
        this.planOwner = planOwner;
    }

    public IssueUpdateAttribute withDoingOwner(UserUpdateAttribute doingOwner) {
        this.doingOwner = doingOwner;
        return this;
    }

    public IssueUpdateAttribute withDoingOwner(Consumer<UserUpdateAttribute> doingOwnerSetter) {
        if (this.doingOwner == null) {
            this.doingOwner = new UserUpdateAttribute();
            doingOwnerSetter.accept(this.doingOwner);
        }

        return this;
    }

    /**
     * Get doingOwner
     * @return doingOwner
     */
    public UserUpdateAttribute getDoingOwner() {
        return doingOwner;
    }

    public void setDoingOwner(UserUpdateAttribute doingOwner) {
        this.doingOwner = doingOwner;
    }

    public IssueUpdateAttribute withDeliveredOwner(UserUpdateAttribute deliveredOwner) {
        this.deliveredOwner = deliveredOwner;
        return this;
    }

    public IssueUpdateAttribute withDeliveredOwner(Consumer<UserUpdateAttribute> deliveredOwnerSetter) {
        if (this.deliveredOwner == null) {
            this.deliveredOwner = new UserUpdateAttribute();
            deliveredOwnerSetter.accept(this.deliveredOwner);
        }

        return this;
    }

    /**
     * Get deliveredOwner
     * @return deliveredOwner
     */
    public UserUpdateAttribute getDeliveredOwner() {
        return deliveredOwner;
    }

    public void setDeliveredOwner(UserUpdateAttribute deliveredOwner) {
        this.deliveredOwner = deliveredOwner;
    }

    public IssueUpdateAttribute withCheckingOwner(UserUpdateAttribute checkingOwner) {
        this.checkingOwner = checkingOwner;
        return this;
    }

    public IssueUpdateAttribute withCheckingOwner(Consumer<UserUpdateAttribute> checkingOwnerSetter) {
        if (this.checkingOwner == null) {
            this.checkingOwner = new UserUpdateAttribute();
            checkingOwnerSetter.accept(this.checkingOwner);
        }

        return this;
    }

    /**
     * Get checkingOwner
     * @return checkingOwner
     */
    public UserUpdateAttribute getCheckingOwner() {
        return checkingOwner;
    }

    public void setCheckingOwner(UserUpdateAttribute checkingOwner) {
        this.checkingOwner = checkingOwner;
    }

    public IssueUpdateAttribute withTestOwner(UserUpdateAttribute testOwner) {
        this.testOwner = testOwner;
        return this;
    }

    public IssueUpdateAttribute withTestOwner(Consumer<UserUpdateAttribute> testOwnerSetter) {
        if (this.testOwner == null) {
            this.testOwner = new UserUpdateAttribute();
            testOwnerSetter.accept(this.testOwner);
        }

        return this;
    }

    /**
     * Get testOwner
     * @return testOwner
     */
    public UserUpdateAttribute getTestOwner() {
        return testOwner;
    }

    public void setTestOwner(UserUpdateAttribute testOwner) {
        this.testOwner = testOwner;
    }

    public IssueUpdateAttribute withDevelopOwner(UserUpdateAttribute developOwner) {
        this.developOwner = developOwner;
        return this;
    }

    public IssueUpdateAttribute withDevelopOwner(Consumer<UserUpdateAttribute> developOwnerSetter) {
        if (this.developOwner == null) {
            this.developOwner = new UserUpdateAttribute();
            developOwnerSetter.accept(this.developOwner);
        }

        return this;
    }

    /**
     * Get developOwner
     * @return developOwner
     */
    public UserUpdateAttribute getDevelopOwner() {
        return developOwner;
    }

    public void setDevelopOwner(UserUpdateAttribute developOwner) {
        this.developOwner = developOwner;
    }

    public IssueUpdateAttribute withProcessingOwner(UserUpdateAttribute processingOwner) {
        this.processingOwner = processingOwner;
        return this;
    }

    public IssueUpdateAttribute withProcessingOwner(Consumer<UserUpdateAttribute> processingOwnerSetter) {
        if (this.processingOwner == null) {
            this.processingOwner = new UserUpdateAttribute();
            processingOwnerSetter.accept(this.processingOwner);
        }

        return this;
    }

    /**
     * Get processingOwner
     * @return processingOwner
     */
    public UserUpdateAttribute getProcessingOwner() {
        return processingOwner;
    }

    public void setProcessingOwner(UserUpdateAttribute processingOwner) {
        this.processingOwner = processingOwner;
    }

    public IssueUpdateAttribute withFixedOwner(UserUpdateAttribute fixedOwner) {
        this.fixedOwner = fixedOwner;
        return this;
    }

    public IssueUpdateAttribute withFixedOwner(Consumer<UserUpdateAttribute> fixedOwnerSetter) {
        if (this.fixedOwner == null) {
            this.fixedOwner = new UserUpdateAttribute();
            fixedOwnerSetter.accept(this.fixedOwner);
        }

        return this;
    }

    /**
     * Get fixedOwner
     * @return fixedOwner
     */
    public UserUpdateAttribute getFixedOwner() {
        return fixedOwner;
    }

    public void setFixedOwner(UserUpdateAttribute fixedOwner) {
        this.fixedOwner = fixedOwner;
    }

    public IssueUpdateAttribute withResearchanddevelopOwner(UserUpdateAttribute researchanddevelopOwner) {
        this.researchanddevelopOwner = researchanddevelopOwner;
        return this;
    }

    public IssueUpdateAttribute withResearchanddevelopOwner(
        Consumer<UserUpdateAttribute> researchanddevelopOwnerSetter) {
        if (this.researchanddevelopOwner == null) {
            this.researchanddevelopOwner = new UserUpdateAttribute();
            researchanddevelopOwnerSetter.accept(this.researchanddevelopOwner);
        }

        return this;
    }

    /**
     * Get researchanddevelopOwner
     * @return researchanddevelopOwner
     */
    public UserUpdateAttribute getResearchanddevelopOwner() {
        return researchanddevelopOwner;
    }

    public void setResearchanddevelopOwner(UserUpdateAttribute researchanddevelopOwner) {
        this.researchanddevelopOwner = researchanddevelopOwner;
    }

    public IssueUpdateAttribute withAnalyseOwner(UserUpdateAttribute analyseOwner) {
        this.analyseOwner = analyseOwner;
        return this;
    }

    public IssueUpdateAttribute withAnalyseOwner(Consumer<UserUpdateAttribute> analyseOwnerSetter) {
        if (this.analyseOwner == null) {
            this.analyseOwner = new UserUpdateAttribute();
            analyseOwnerSetter.accept(this.analyseOwner);
        }

        return this;
    }

    /**
     * Get analyseOwner
     * @return analyseOwner
     */
    public UserUpdateAttribute getAnalyseOwner() {
        return analyseOwner;
    }

    public void setAnalyseOwner(UserUpdateAttribute analyseOwner) {
        this.analyseOwner = analyseOwner;
    }

    public IssueUpdateAttribute withPlanStartDate(String planStartDate) {
        this.planStartDate = planStartDate;
        return this;
    }

    /**
     * **参数解释**： 计划开始时间。工作项的计划启动日期，用于项目进度管理和排期。 **约束限制**： 不涉及。 **取值范围**： 11~19个字符的时间戳字符串，单位为毫秒（ms）。 **默认取值**： 不涉及。
     * @return planStartDate
     */
    public String getPlanStartDate() {
        return planStartDate;
    }

    public void setPlanStartDate(String planStartDate) {
        this.planStartDate = planStartDate;
    }

    public IssueUpdateAttribute withExpectDeliveryTime(String expectDeliveryTime) {
        this.expectDeliveryTime = expectDeliveryTime;
        return this;
    }

    /**
     * **参数解释**： 期望完成时间。工作项的预期交付日期，用于跟踪工作项是否按期完成。 **约束限制**： 不涉及。 **取值范围**： 11~19个字符的时间戳字符串，单位为毫秒（ms）。 **默认取值**： 不涉及。
     * @return expectDeliveryTime
     */
    public String getExpectDeliveryTime() {
        return expectDeliveryTime;
    }

    public void setExpectDeliveryTime(String expectDeliveryTime) {
        this.expectDeliveryTime = expectDeliveryTime;
    }

    public IssueUpdateAttribute withPlanTestEndDate(String planTestEndDate) {
        this.planTestEndDate = planTestEndDate;
        return this;
    }

    /**
     * **参数解释**： 计划测试结束时间。Bug类型工作项的计划测试完成日期，用于跟踪Bug修复后的测试进度。 **约束限制**： 仅对Bug类型工作项生效，非Bug类型忽略此字段。 **取值范围**： 11~19个字符的时间戳字符串，单位为毫秒（ms）。 **默认取值**： 不涉及。
     * @return planTestEndDate
     */
    public String getPlanTestEndDate() {
        return planTestEndDate;
    }

    public void setPlanTestEndDate(String planTestEndDate) {
        this.planTestEndDate = planTestEndDate;
    }

    public IssueUpdateAttribute withSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * **参数解释**： 严重程度。Bug类型工作项的严重级别，用于评估Bug的影响范围和修复优先级。 **约束限制**： 仅对Bug类型工作项生效，非Bug类型忽略此字段。 **取值范围**： - 致命：系统崩溃、数据丢失等严重影响 - 严重：主要功能无法使用 - 一般：次要功能异常，有替代方案 - 提示：界面优化、建议性问题 **默认取值**： 不涉及。
     * @return severity
     */
    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public IssueUpdateAttribute withPromised(String promised) {
        this.promised = promised;
        return this;
    }

    /**
     * **参数解释**： 是否承诺。RR（原始需求）类型工作项的承诺状态标识，用于标记需求是否已承诺交付。 **约束限制**： 仅对RR类型工作项生效，非RR类型忽略此字段。 **取值范围**： - yes：已承诺 - no：未承诺 **默认取值**： 不涉及。
     * @return promised
     */
    public String getPromised() {
        return promised;
    }

    public void setPromised(String promised) {
        this.promised = promised;
    }

    public IssueUpdateAttribute withRecipient(List<UserUpdateAttribute> recipient) {
        this.recipient = recipient;
        return this;
    }

    public IssueUpdateAttribute addRecipientItem(UserUpdateAttribute recipientItem) {
        if (this.recipient == null) {
            this.recipient = new ArrayList<>();
        }
        this.recipient.add(recipientItem);
        return this;
    }

    public IssueUpdateAttribute withRecipient(Consumer<List<UserUpdateAttribute>> recipientSetter) {
        if (this.recipient == null) {
            this.recipient = new ArrayList<>();
        }
        recipientSetter.accept(this.recipient);
        return this;
    }

    /**
     * **参数解释**： 承接人。RR（原始需求）类型工作项的需求承接责任人，负责需求的分析和转化。 **约束限制**： 仅对RR类型工作项生效，非RR类型忽略此字段。
     * @return recipient
     */
    public List<UserUpdateAttribute> getRecipient() {
        return recipient;
    }

    public void setRecipient(List<UserUpdateAttribute> recipient) {
        this.recipient = recipient;
    }

    public IssueUpdateAttribute withSysNoDevelopReason(String sysNoDevelopReason) {
        this.sysNoDevelopReason = sysNoDevelopReason;
        return this;
    }

    /**
     * **参数解释**： 无需研发原因。RR（原始需求）类型工作项不需要进行研发的原因说明。 **约束限制**： 仅对RR类型工作项生效，非RR类型忽略此字段。 **取值范围**： 0~50000个字符。 **默认取值**： 不涉及。
     * @return sysNoDevelopReason
     */
    public String getSysNoDevelopReason() {
        return sysNoDevelopReason;
    }

    public void setSysNoDevelopReason(String sysNoDevelopReason) {
        this.sysNoDevelopReason = sysNoDevelopReason;
    }

    public IssueUpdateAttribute withValFeature(String valFeature) {
        this.valFeature = valFeature;
        return this;
    }

    /**
     * **参数解释**： 价值特性。SF/FE类型工作项对应的业务价值特性描述，用于关联业务价值和技术实现。 **约束限制**： 仅对SF/FE类型工作项生效，其他类型忽略此字段。 **取值范围**： - yes：是 - no：否 **默认取值**： 不涉及。
     * @return valFeature
     */
    public String getValFeature() {
        return valFeature;
    }

    public void setValFeature(String valFeature) {
        this.valFeature = valFeature;
    }

    public IssueUpdateAttribute withFunctionScene(String functionScene) {
        this.functionScene = functionScene;
        return this;
    }

    /**
     * **参数解释**： 功能场景。SF/FE类型工作项的功能应用场景描述，用于说明特性的使用场景和用户故事。 **约束限制**： 仅对SF/FE类型工作项生效，其他类型忽略此字段。 **取值范围**： 0~512个字符。 **默认取值**： 不涉及。
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
        IssueUpdateAttribute that = (IssueUpdateAttribute) obj;
        return Objects.equals(this.category, that.category) && Objects.equals(this.description, that.description)
            && Objects.equals(this.parentId, that.parentId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.assignee, that.assignee) && Objects.equals(this.assignedCc, that.assignedCc)
            && Objects.equals(this.planEndDate, that.planEndDate) && Objects.equals(this.workload, that.workload)
            && Objects.equals(this.link, that.link) && Objects.equals(this.labels, that.labels)
            && Objects.equals(this.customFields, that.customFields) && Objects.equals(this.ir2feature, that.ir2feature)
            && Objects.equals(this.needBreak, that.needBreak) && Objects.equals(this.baseline, that.baseline)
            && Objects.equals(this.priority, that.priority)
            && Objects.equals(this.relatedNetworkSecurity, that.relatedNetworkSecurity)
            && Objects.equals(this.businessDomain, that.businessDomain) && Objects.equals(this.planPi, that.planPi)
            && Objects.equals(this.planIteration, that.planIteration)
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
            && Objects.equals(this.closeType, that.closeType) && Objects.equals(this.securityLevel, that.securityLevel)
            && Objects.equals(this.planOwner, that.planOwner) && Objects.equals(this.doingOwner, that.doingOwner)
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
        return Objects.hash(category,
            description,
            parentId,
            status,
            assignee,
            assignedCc,
            planEndDate,
            workload,
            link,
            labels,
            customFields,
            ir2feature,
            needBreak,
            baseline,
            priority,
            relatedNetworkSecurity,
            businessDomain,
            planPi,
            planIteration,
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
            securityLevel,
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
        sb.append("class IssueUpdateAttribute {\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
        sb.append("    assignedCc: ").append(toIndentedString(assignedCc)).append("\n");
        sb.append("    planEndDate: ").append(toIndentedString(planEndDate)).append("\n");
        sb.append("    workload: ").append(toIndentedString(workload)).append("\n");
        sb.append("    link: ").append(toIndentedString(link)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
        sb.append("    ir2feature: ").append(toIndentedString(ir2feature)).append("\n");
        sb.append("    needBreak: ").append(toIndentedString(needBreak)).append("\n");
        sb.append("    baseline: ").append(toIndentedString(baseline)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    relatedNetworkSecurity: ").append(toIndentedString(relatedNetworkSecurity)).append("\n");
        sb.append("    businessDomain: ").append(toIndentedString(businessDomain)).append("\n");
        sb.append("    planPi: ").append(toIndentedString(planPi)).append("\n");
        sb.append("    planIteration: ").append(toIndentedString(planIteration)).append("\n");
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
        sb.append("    securityLevel: ").append(toIndentedString(securityLevel)).append("\n");
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
