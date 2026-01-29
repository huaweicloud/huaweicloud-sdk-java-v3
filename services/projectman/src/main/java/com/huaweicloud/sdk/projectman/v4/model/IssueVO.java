package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 工作项对象
 */
public class IssueVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sys_analysis_conclusion")

    private String sysAnalysisConclusion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sys_remark")

    private String sysRemark;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "promised")

    private OptionVO promised;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "belong_inside")

    private String belongInside;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_domain")

    private DomainVO srcDomain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private DomainVO domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "send_from")

    private String sendFrom;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number")

    private String number;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "send_to")

    private String sendTo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_man_day")

    private String workloadManDay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sys_check_conclusion")

    private String sysCheckConclusion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stay_days")

    private Integer stayDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assigned_cc")

    private List<UserVO> assignedCc = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "submit_time")

    private String submitTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workitem2label")

    private List<WorkItemLabelVO> workitem2label = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sys_return_conclusion")

    private String sysReturnConclusion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "close_time")

    private String closeTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private OptionVO priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_date")

    private String modifiedDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_by")

    private UserVO createdBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "break_status")

    private OptionVO breakStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_modified_date")

    private String statusModifiedDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expect_delivery_time")

    private String expectDeliveryTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_id")

    private String parentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assignee")

    private UserVO assignee;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private AlmStatus status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_pi")

    private PlanVO planPi;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "link")

    private String link;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_suspended")

    private OptionVO isSuspended;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "change_status")

    private OptionVO changeStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sum_workload_man_day")

    private String sumWorkloadManDay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sys_close_reason")

    private String sysCloseReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sys_resubmit_reason")

    private String sysResubmitReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_end_date")

    private String planEndDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rr2ir")

    private String rr2ir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category_layer_id")

    private String categoryLayerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "submitted_by")

    private List<UserVO> submittedBy = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rr2us")

    private String rr2us;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sys_no_develop_reason")

    private String sysNoDevelopReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_iteration")

    private PlanVO planIteration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sys_return_reason")

    private String sysReturnReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cascade_delete")

    private String cascadeDelete;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recipient")

    private List<UserVO> recipient = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_by")

    private UserVO modifiedBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_date")

    private String createdDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collaborative_status")

    private List<String> collaborativeStatus = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project")

    private DomainVO project;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "child_issues")

    private Map<String, IssueVO> childIssues = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "activate_times")

    private Integer activateTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "baseline")

    private OptionVO baseline;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "business_domain")

    private OptionVO businessDomain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "children")

    private String children;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collaborative_history")

    private String collaborativeHistory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collaboratives")

    private String collaboratives;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "convolution_actual_hours")

    private String convolutionActualHours;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "convolution_plan_hours")

    private String convolutionPlanHours;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "develop_owner")

    private String developOwner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "done_ratio")

    private OptionVO doneRatio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expected_repair_date")

    private String expectedRepairDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "feature2ir")

    private String feature2ir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "feature_set")

    private OptionVO featureSet;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "found_env")

    private OptionVO foundEnv;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "found_iteration")

    private PlanVO foundIteration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "found_pi")

    private PlanVO foundPi;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "function_scene")

    private String functionScene;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ir2feature")

    private String ir2feature;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ir2rr")

    private String ir2rr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_opinion_id")

    private String issueOpinionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_review_id")

    private String issueReviewId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "module")

    private OptionVO module;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "need_break")

    private OptionVO needBreak;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "need_develop")

    private OptionVO needDevelop;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "no_break_reason")

    private String noBreakReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "no_develop_reason")

    private String noDevelopReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order")

    private String order;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_dev_end_date")

    private String planDevEndDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_processing_end_date")

    private String planProcessingEndDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_researchanddevelop_end_date")

    private String planResearchanddevelopEndDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_test_end_date")

    private String planTestEndDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "position_float")

    private String positionFloat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "processing_owner")

    private String processingOwner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason_analysis")

    private String reasonAnalysis;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regression_failure_number")

    private Integer regressionFailureNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "related_network_security")

    private OptionVO relatedNetworkSecurity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repair_solution")

    private String repairSolution;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "researchanddevelop_owner")

    private String researchanddevelopOwner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private OptionVO severity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sys_activation_reason")

    private String sysActivationReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sys_no_repair_reason")

    private String sysNoRepairReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_failures_times")

    private Integer testFailuresTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_owner")

    private String testOwner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_report")

    private String testReport;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "val_feature")

    private OptionVO valFeature;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workitem2ganttchart")

    private String workitem2ganttchart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workitem2mindmap")

    private String workitem2mindmap;

    public IssueVO withSysAnalysisConclusion(String sysAnalysisConclusion) {
        this.sysAnalysisConclusion = sysAnalysisConclusion;
        return this;
    }

    /**
     * **参数解释：**  分析结论，通常在接纳RR时填写。 **取值范围：**  不涉及。
     * @return sysAnalysisConclusion
     */
    public String getSysAnalysisConclusion() {
        return sysAnalysisConclusion;
    }

    public void setSysAnalysisConclusion(String sysAnalysisConclusion) {
        this.sysAnalysisConclusion = sysAnalysisConclusion;
    }

    public IssueVO withSysRemark(String sysRemark) {
        this.sysRemark = sysRemark;
        return this;
    }

    /**
     * **参数解释：**  备注。通常在提交验收RR时填写。 **取值范围：**  不涉及。
     * @return sysRemark
     */
    public String getSysRemark() {
        return sysRemark;
    }

    public void setSysRemark(String sysRemark) {
        this.sysRemark = sysRemark;
    }

    public IssueVO withPromised(OptionVO promised) {
        this.promised = promised;
        return this;
    }

    public IssueVO withPromised(Consumer<OptionVO> promisedSetter) {
        if (this.promised == null) {
            this.promised = new OptionVO();
            promisedSetter.accept(this.promised);
        }

        return this;
    }

    /**
     * Get promised
     * @return promised
     */
    public OptionVO getPromised() {
        return promised;
    }

    public void setPromised(OptionVO promised) {
        this.promised = promised;
    }

    public IssueVO withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：**  工作项的分类。 **取值范围：**  - requirement - raw requirement - bug - task - feature
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public IssueVO withBelongInside(String belongInside) {
        this.belongInside = belongInside;
        return this;
    }

    /**
     * **参数解释：**  标识工作项是否跨项目提交。 **取值范围：**  - 1：跨项目提交工作项。 - 0：非跨项目提交工作项。
     * @return belongInside
     */
    public String getBelongInside() {
        return belongInside;
    }

    public void setBelongInside(String belongInside) {
        this.belongInside = belongInside;
    }

    public IssueVO withSrcDomain(DomainVO srcDomain) {
        this.srcDomain = srcDomain;
        return this;
    }

    public IssueVO withSrcDomain(Consumer<DomainVO> srcDomainSetter) {
        if (this.srcDomain == null) {
            this.srcDomain = new DomainVO();
            srcDomainSetter.accept(this.srcDomain);
        }

        return this;
    }

    /**
     * Get srcDomain
     * @return srcDomain
     */
    public DomainVO getSrcDomain() {
        return srcDomain;
    }

    public void setSrcDomain(DomainVO srcDomain) {
        this.srcDomain = srcDomain;
    }

    public IssueVO withDomainId(DomainVO domainId) {
        this.domainId = domainId;
        return this;
    }

    public IssueVO withDomainId(Consumer<DomainVO> domainIdSetter) {
        if (this.domainId == null) {
            this.domainId = new DomainVO();
            domainIdSetter.accept(this.domainId);
        }

        return this;
    }

    /**
     * Get domainId
     * @return domainId
     */
    public DomainVO getDomainId() {
        return domainId;
    }

    public void setDomainId(DomainVO domainId) {
        this.domainId = domainId;
    }

    public IssueVO withSendFrom(String sendFrom) {
        this.sendFrom = sendFrom;
        return this;
    }

    /**
     * **参数解释：**  原始需求的协同上游需求Id。 **取值范围：**  不涉及。
     * @return sendFrom
     */
    public String getSendFrom() {
        return sendFrom;
    }

    public void setSendFrom(String sendFrom) {
        this.sendFrom = sendFrom;
    }

    public IssueVO withNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * **参数解释：**  工作项编号，由工作项类型+年月日+6位随机数组成。 **取值范围：**  不涉及。
     * @return number
     */
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public IssueVO withSendTo(String sendTo) {
        this.sendTo = sendTo;
        return this;
    }

    /**
     * **参数解释：**  原始需求的协同下游需求Id。 **取值范围：**  不涉及。
     * @return sendTo
     */
    public String getSendTo() {
        return sendTo;
    }

    public void setSendTo(String sendTo) {
        this.sendTo = sendTo;
    }

    public IssueVO withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * **参数解释：**  工作项父子挂载路径关系。 **取值范围：**  不涉及。
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public IssueVO withWorkloadManDay(String workloadManDay) {
        this.workloadManDay = workloadManDay;
        return this;
    }

    /**
     * **参数解释：**  工作项计划工时。 **取值范围：**  不涉及。
     * @return workloadManDay
     */
    public String getWorkloadManDay() {
        return workloadManDay;
    }

    public void setWorkloadManDay(String workloadManDay) {
        this.workloadManDay = workloadManDay;
    }

    public IssueVO withSysCheckConclusion(String sysCheckConclusion) {
        this.sysCheckConclusion = sysCheckConclusion;
        return this;
    }

    /**
     * **参数解释：**  验收结论。通常是验收RR时填写。 **取值范围：**  不涉及。
     * @return sysCheckConclusion
     */
    public String getSysCheckConclusion() {
        return sysCheckConclusion;
    }

    public void setSysCheckConclusion(String sysCheckConclusion) {
        this.sysCheckConclusion = sysCheckConclusion;
    }

    public IssueVO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：**  工作项唯一Id。 **取值范围：**  不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public IssueVO withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * **参数解释：**  工作项生命周期。 **取值范围：**  - 正在工作：可正常操作的工作项； - 作废：软删除后的工作项，可在回收站恢复； - 删除：彻底删除后的工作项，无法恢复。
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public IssueVO withStayDays(Integer stayDays) {
        this.stayDays = stayDays;
        return this;
    }

    /**
     * **参数解释：**  工作项在当前状态的停留天数。 **取值范围：**  不涉及。
     * @return stayDays
     */
    public Integer getStayDays() {
        return stayDays;
    }

    public void setStayDays(Integer stayDays) {
        this.stayDays = stayDays;
    }

    public IssueVO withAssignedCc(List<UserVO> assignedCc) {
        this.assignedCc = assignedCc;
        return this;
    }

    public IssueVO addAssignedCcItem(UserVO assignedCcItem) {
        if (this.assignedCc == null) {
            this.assignedCc = new ArrayList<>();
        }
        this.assignedCc.add(assignedCcItem);
        return this;
    }

    public IssueVO withAssignedCc(Consumer<List<UserVO>> assignedCcSetter) {
        if (this.assignedCc == null) {
            this.assignedCc = new ArrayList<>();
        }
        assignedCcSetter.accept(this.assignedCc);
        return this;
    }

    /**
     * **参数解释：**  抄送人。 **取值范围：**  不涉及。
     * @return assignedCc
     */
    public List<UserVO> getAssignedCc() {
        return assignedCc;
    }

    public void setAssignedCc(List<UserVO> assignedCc) {
        this.assignedCc = assignedCc;
    }

    public IssueVO withSubmitTime(String submitTime) {
        this.submitTime = submitTime;
        return this;
    }

    /**
     * **参数解释：**  工作项提交时间，指工作项进入工作流的时间，而不是创建时间。 **取值范围：**  不涉及。
     * @return submitTime
     */
    public String getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(String submitTime) {
        this.submitTime = submitTime;
    }

    public IssueVO withWorkitem2label(List<WorkItemLabelVO> workitem2label) {
        this.workitem2label = workitem2label;
        return this;
    }

    public IssueVO addWorkitem2labelItem(WorkItemLabelVO workitem2labelItem) {
        if (this.workitem2label == null) {
            this.workitem2label = new ArrayList<>();
        }
        this.workitem2label.add(workitem2labelItem);
        return this;
    }

    public IssueVO withWorkitem2label(Consumer<List<WorkItemLabelVO>> workitem2labelSetter) {
        if (this.workitem2label == null) {
            this.workitem2label = new ArrayList<>();
        }
        workitem2labelSetter.accept(this.workitem2label);
        return this;
    }

    /**
     * **参数解释：**  工作项标签。 **取值范围：**  不涉及。
     * @return workitem2label
     */
    public List<WorkItemLabelVO> getWorkitem2label() {
        return workitem2label;
    }

    public void setWorkitem2label(List<WorkItemLabelVO> workitem2label) {
        this.workitem2label = workitem2label;
    }

    public IssueVO withSysReturnConclusion(String sysReturnConclusion) {
        this.sysReturnConclusion = sysReturnConclusion;
        return this;
    }

    /**
     * **参数解释：**  退回原因。通常为退回RR/Bug时填写。 **取值范围：**  不涉及。
     * @return sysReturnConclusion
     */
    public String getSysReturnConclusion() {
        return sysReturnConclusion;
    }

    public void setSysReturnConclusion(String sysReturnConclusion) {
        this.sysReturnConclusion = sysReturnConclusion;
    }

    public IssueVO withCloseTime(String closeTime) {
        this.closeTime = closeTime;
        return this;
    }

    /**
     * **参数解释：**  工作项完成时间。 **取值范围：**  不涉及。
     * @return closeTime
     */
    public String getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(String closeTime) {
        this.closeTime = closeTime;
    }

    public IssueVO withPriority(OptionVO priority) {
        this.priority = priority;
        return this;
    }

    public IssueVO withPriority(Consumer<OptionVO> prioritySetter) {
        if (this.priority == null) {
            this.priority = new OptionVO();
            prioritySetter.accept(this.priority);
        }

        return this;
    }

    /**
     * Get priority
     * @return priority
     */
    public OptionVO getPriority() {
        return priority;
    }

    public void setPriority(OptionVO priority) {
        this.priority = priority;
    }

    public IssueVO withModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
        return this;
    }

    /**
     * **参数解释：**  工作项最新修改时间。 **取值范围：**  不涉及。
     * @return modifiedDate
     */
    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public IssueVO withCreatedBy(UserVO createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public IssueVO withCreatedBy(Consumer<UserVO> createdBySetter) {
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

    public IssueVO withBreakStatus(OptionVO breakStatus) {
        this.breakStatus = breakStatus;
        return this;
    }

    public IssueVO withBreakStatus(Consumer<OptionVO> breakStatusSetter) {
        if (this.breakStatus == null) {
            this.breakStatus = new OptionVO();
            breakStatusSetter.accept(this.breakStatus);
        }

        return this;
    }

    /**
     * Get breakStatus
     * @return breakStatus
     */
    public OptionVO getBreakStatus() {
        return breakStatus;
    }

    public void setBreakStatus(OptionVO breakStatus) {
        this.breakStatus = breakStatus;
    }

    public IssueVO withStatusModifiedDate(String statusModifiedDate) {
        this.statusModifiedDate = statusModifiedDate;
        return this;
    }

    /**
     * **参数解释：**  工作项上一次流转状态的时间，可用于计算停留天数。unix时间戳，单位为毫秒。 **取值范围：**  不涉及。
     * @return statusModifiedDate
     */
    public String getStatusModifiedDate() {
        return statusModifiedDate;
    }

    public void setStatusModifiedDate(String statusModifiedDate) {
        this.statusModifiedDate = statusModifiedDate;
    }

    public IssueVO withExpectDeliveryTime(String expectDeliveryTime) {
        this.expectDeliveryTime = expectDeliveryTime;
        return this;
    }

    /**
     * **参数解释：**  期望完成时间。Unix时间戳，单位为毫秒。 **取值范围：**  不涉及。
     * @return expectDeliveryTime
     */
    public String getExpectDeliveryTime() {
        return expectDeliveryTime;
    }

    public void setExpectDeliveryTime(String expectDeliveryTime) {
        this.expectDeliveryTime = expectDeliveryTime;
    }

    public IssueVO withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * **参数解释：**  工作项的父工作项Id。 **取值范围：**  不涉及。
     * @return parentId
     */
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public IssueVO withAssignee(UserVO assignee) {
        this.assignee = assignee;
        return this;
    }

    public IssueVO withAssignee(Consumer<UserVO> assigneeSetter) {
        if (this.assignee == null) {
            this.assignee = new UserVO();
            assigneeSetter.accept(this.assignee);
        }

        return this;
    }

    /**
     * Get assignee
     * @return assignee
     */
    public UserVO getAssignee() {
        return assignee;
    }

    public void setAssignee(UserVO assignee) {
        this.assignee = assignee;
    }

    public IssueVO withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * **参数解释：**  工作项所属租户的域。 **取值范围：**  不涉及。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public IssueVO withStatus(AlmStatus status) {
        this.status = status;
        return this;
    }

    public IssueVO withStatus(Consumer<AlmStatus> statusSetter) {
        if (this.status == null) {
            this.status = new AlmStatus();
            statusSetter.accept(this.status);
        }

        return this;
    }

    /**
     * Get status
     * @return status
     */
    public AlmStatus getStatus() {
        return status;
    }

    public void setStatus(AlmStatus status) {
        this.status = status;
    }

    public IssueVO withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * **参数解释：**  工作项所属租户Id。 **取值范围：**  不涉及。
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public IssueVO withPlanPi(PlanVO planPi) {
        this.planPi = planPi;
        return this;
    }

    public IssueVO withPlanPi(Consumer<PlanVO> planPiSetter) {
        if (this.planPi == null) {
            this.planPi = new PlanVO();
            planPiSetter.accept(this.planPi);
        }

        return this;
    }

    /**
     * Get planPi
     * @return planPi
     */
    public PlanVO getPlanPi() {
        return planPi;
    }

    public void setPlanPi(PlanVO planPi) {
        this.planPi = planPi;
    }

    public IssueVO withLink(String link) {
        this.link = link;
        return this;
    }

    /**
     * **参数解释：**  关联工作项的关系字段。多值使用英文逗号分隔。 **取值范围：**  不涉及。
     * @return link
     */
    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public IssueVO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：**  工作项描述，最多支持50w字符。 **取值范围：**  不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public IssueVO withIsSuspended(OptionVO isSuspended) {
        this.isSuspended = isSuspended;
        return this;
    }

    public IssueVO withIsSuspended(Consumer<OptionVO> isSuspendedSetter) {
        if (this.isSuspended == null) {
            this.isSuspended = new OptionVO();
            isSuspendedSetter.accept(this.isSuspended);
        }

        return this;
    }

    /**
     * Get isSuspended
     * @return isSuspended
     */
    public OptionVO getIsSuspended() {
        return isSuspended;
    }

    public void setIsSuspended(OptionVO isSuspended) {
        this.isSuspended = isSuspended;
    }

    public IssueVO withChangeStatus(OptionVO changeStatus) {
        this.changeStatus = changeStatus;
        return this;
    }

    public IssueVO withChangeStatus(Consumer<OptionVO> changeStatusSetter) {
        if (this.changeStatus == null) {
            this.changeStatus = new OptionVO();
            changeStatusSetter.accept(this.changeStatus);
        }

        return this;
    }

    /**
     * Get changeStatus
     * @return changeStatus
     */
    public OptionVO getChangeStatus() {
        return changeStatus;
    }

    public void setChangeStatus(OptionVO changeStatus) {
        this.changeStatus = changeStatus;
    }

    public IssueVO withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * **参数解释：**  工作项标题。 **取值范围：**  不涉及。
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public IssueVO withSumWorkloadManDay(String sumWorkloadManDay) {
        this.sumWorkloadManDay = sumWorkloadManDay;
        return this;
    }

    /**
     * **参数解释：**  工作项实际工时。 **取值范围：**  不涉及。
     * @return sumWorkloadManDay
     */
    public String getSumWorkloadManDay() {
        return sumWorkloadManDay;
    }

    public void setSumWorkloadManDay(String sumWorkloadManDay) {
        this.sumWorkloadManDay = sumWorkloadManDay;
    }

    public IssueVO withSysCloseReason(String sysCloseReason) {
        this.sysCloseReason = sysCloseReason;
        return this;
    }

    /**
     * **参数解释：**  工作项关闭原因。 **取值范围：**  不涉及。
     * @return sysCloseReason
     */
    public String getSysCloseReason() {
        return sysCloseReason;
    }

    public void setSysCloseReason(String sysCloseReason) {
        this.sysCloseReason = sysCloseReason;
    }

    public IssueVO withSysResubmitReason(String sysResubmitReason) {
        this.sysResubmitReason = sysResubmitReason;
        return this;
    }

    /**
     * **参数解释：**  重新提交原因，通常用于RR/Bug退回后重新提交。 **取值范围：**  不涉及。
     * @return sysResubmitReason
     */
    public String getSysResubmitReason() {
        return sysResubmitReason;
    }

    public void setSysResubmitReason(String sysResubmitReason) {
        this.sysResubmitReason = sysResubmitReason;
    }

    public IssueVO withPlanEndDate(String planEndDate) {
        this.planEndDate = planEndDate;
        return this;
    }

    /**
     * **参数解释：**  工作项计划完成时间。 **取值范围：**  不涉及。
     * @return planEndDate
     */
    public String getPlanEndDate() {
        return planEndDate;
    }

    public void setPlanEndDate(String planEndDate) {
        this.planEndDate = planEndDate;
    }

    public IssueVO withRr2ir(String rr2ir) {
        this.rr2ir = rr2ir;
        return this;
    }

    /**
     * **参数解释：**  RR的子IR的id。多值使用英文逗号分隔。 **取值范围：**  不涉及。
     * @return rr2ir
     */
    public String getRr2ir() {
        return rr2ir;
    }

    public void setRr2ir(String rr2ir) {
        this.rr2ir = rr2ir;
    }

    public IssueVO withCategoryLayerId(String categoryLayerId) {
        this.categoryLayerId = categoryLayerId;
        return this;
    }

    /**
     * **参数解释：**  工作项类型层级id。 **取值范围：**  不涉及。
     * @return categoryLayerId
     */
    public String getCategoryLayerId() {
        return categoryLayerId;
    }

    public void setCategoryLayerId(String categoryLayerId) {
        this.categoryLayerId = categoryLayerId;
    }

    public IssueVO withSubmittedBy(List<UserVO> submittedBy) {
        this.submittedBy = submittedBy;
        return this;
    }

    public IssueVO addSubmittedByItem(UserVO submittedByItem) {
        if (this.submittedBy == null) {
            this.submittedBy = new ArrayList<>();
        }
        this.submittedBy.add(submittedByItem);
        return this;
    }

    public IssueVO withSubmittedBy(Consumer<List<UserVO>> submittedBySetter) {
        if (this.submittedBy == null) {
            this.submittedBy = new ArrayList<>();
        }
        submittedBySetter.accept(this.submittedBy);
        return this;
    }

    /**
     * **参数解释：**  工作项提交人。 **取值范围：**  不涉及。
     * @return submittedBy
     */
    public List<UserVO> getSubmittedBy() {
        return submittedBy;
    }

    public void setSubmittedBy(List<UserVO> submittedBy) {
        this.submittedBy = submittedBy;
    }

    public IssueVO withRr2us(String rr2us) {
        this.rr2us = rr2us;
        return this;
    }

    /**
     * **参数解释：**  RR的子US的id，多值使用英文逗号分隔。 **取值范围：**  不涉及。
     * @return rr2us
     */
    public String getRr2us() {
        return rr2us;
    }

    public void setRr2us(String rr2us) {
        this.rr2us = rr2us;
    }

    public IssueVO withSysNoDevelopReason(String sysNoDevelopReason) {
        this.sysNoDevelopReason = sysNoDevelopReason;
        return this;
    }

    /**
     * **参数解释：**  工作项无需开发原因。 **取值范围：**  不涉及。
     * @return sysNoDevelopReason
     */
    public String getSysNoDevelopReason() {
        return sysNoDevelopReason;
    }

    public void setSysNoDevelopReason(String sysNoDevelopReason) {
        this.sysNoDevelopReason = sysNoDevelopReason;
    }

    public IssueVO withPlanIteration(PlanVO planIteration) {
        this.planIteration = planIteration;
        return this;
    }

    public IssueVO withPlanIteration(Consumer<PlanVO> planIterationSetter) {
        if (this.planIteration == null) {
            this.planIteration = new PlanVO();
            planIterationSetter.accept(this.planIteration);
        }

        return this;
    }

    /**
     * Get planIteration
     * @return planIteration
     */
    public PlanVO getPlanIteration() {
        return planIteration;
    }

    public void setPlanIteration(PlanVO planIteration) {
        this.planIteration = planIteration;
    }

    public IssueVO withSysReturnReason(String sysReturnReason) {
        this.sysReturnReason = sysReturnReason;
        return this;
    }

    /**
     * **参数解释：**  退回原因。通常用于RR/bug退回。 **取值范围：**  不涉及。
     * @return sysReturnReason
     */
    public String getSysReturnReason() {
        return sysReturnReason;
    }

    public void setSysReturnReason(String sysReturnReason) {
        this.sysReturnReason = sysReturnReason;
    }

    public IssueVO withCascadeDelete(String cascadeDelete) {
        this.cascadeDelete = cascadeDelete;
        return this;
    }

    /**
     * **参数解释：**  是否级联删除标记。 **取值范围：**  不涉及。
     * @return cascadeDelete
     */
    public String getCascadeDelete() {
        return cascadeDelete;
    }

    public void setCascadeDelete(String cascadeDelete) {
        this.cascadeDelete = cascadeDelete;
    }

    public IssueVO withRecipient(List<UserVO> recipient) {
        this.recipient = recipient;
        return this;
    }

    public IssueVO addRecipientItem(UserVO recipientItem) {
        if (this.recipient == null) {
            this.recipient = new ArrayList<>();
        }
        this.recipient.add(recipientItem);
        return this;
    }

    public IssueVO withRecipient(Consumer<List<UserVO>> recipientSetter) {
        if (this.recipient == null) {
            this.recipient = new ArrayList<>();
        }
        recipientSetter.accept(this.recipient);
        return this;
    }

    /**
     * **参数解释：**  承接人。通常用于RR。 **取值范围：**  不涉及。
     * @return recipient
     */
    public List<UserVO> getRecipient() {
        return recipient;
    }

    public void setRecipient(List<UserVO> recipient) {
        this.recipient = recipient;
    }

    public IssueVO withModifiedBy(UserVO modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    public IssueVO withModifiedBy(Consumer<UserVO> modifiedBySetter) {
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

    public IssueVO withCreatedDate(String createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * **参数解释：**  工作项创建时间。 **取值范围：**  不涉及。
     * @return createdDate
     */
    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public IssueVO withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * **参数解释：**  工作项类型。 **取值范围：**  - 系统设备类项目：RR/SF/IR/SR/AR/Task/Bug。 - 独立软件类项目：RR/SF/IR/US/Task/Bug。 - 云服务类项目：RR/Epic/FE/US/Task/Bug。
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public IssueVO withCollaborativeStatus(List<String> collaborativeStatus) {
        this.collaborativeStatus = collaborativeStatus;
        return this;
    }

    public IssueVO addCollaborativeStatusItem(String collaborativeStatusItem) {
        if (this.collaborativeStatus == null) {
            this.collaborativeStatus = new ArrayList<>();
        }
        this.collaborativeStatus.add(collaborativeStatusItem);
        return this;
    }

    public IssueVO withCollaborativeStatus(Consumer<List<String>> collaborativeStatusSetter) {
        if (this.collaborativeStatus == null) {
            this.collaborativeStatus = new ArrayList<>();
        }
        collaborativeStatusSetter.accept(this.collaborativeStatus);
        return this;
    }

    /**
     * **参数解释：**  研发需求协同需求状态。 **取值范围：**  不涉及。
     * @return collaborativeStatus
     */
    public List<String> getCollaborativeStatus() {
        return collaborativeStatus;
    }

    public void setCollaborativeStatus(List<String> collaborativeStatus) {
        this.collaborativeStatus = collaborativeStatus;
    }

    public IssueVO withProject(DomainVO project) {
        this.project = project;
        return this;
    }

    public IssueVO withProject(Consumer<DomainVO> projectSetter) {
        if (this.project == null) {
            this.project = new DomainVO();
            projectSetter.accept(this.project);
        }

        return this;
    }

    /**
     * Get project
     * @return project
     */
    public DomainVO getProject() {
        return project;
    }

    public void setProject(DomainVO project) {
        this.project = project;
    }

    public IssueVO withChildIssues(Map<String, IssueVO> childIssues) {
        this.childIssues = childIssues;
        return this;
    }

    public IssueVO putChildIssuesItem(String key, IssueVO childIssuesItem) {
        if (this.childIssues == null) {
            this.childIssues = new HashMap<>();
        }
        this.childIssues.put(key, childIssuesItem);
        return this;
    }

    public IssueVO withChildIssues(Consumer<Map<String, IssueVO>> childIssuesSetter) {
        if (this.childIssues == null) {
            this.childIssues = new HashMap<>();
        }
        childIssuesSetter.accept(this.childIssues);
        return this;
    }

    /**
     * **参数解释：**  子工作项列表。 **取值范围：**  不涉及。
     * @return childIssues
     */
    public Map<String, IssueVO> getChildIssues() {
        return childIssues;
    }

    public void setChildIssues(Map<String, IssueVO> childIssues) {
        this.childIssues = childIssues;
    }

    public IssueVO withActivateTimes(Integer activateTimes) {
        this.activateTimes = activateTimes;
        return this;
    }

    /**
     * **参数解释：**  激活次数。Bug激活时自动赋值。 **取值范围：**  不涉及。
     * @return activateTimes
     */
    public Integer getActivateTimes() {
        return activateTimes;
    }

    public void setActivateTimes(Integer activateTimes) {
        this.activateTimes = activateTimes;
    }

    public IssueVO withBaseline(OptionVO baseline) {
        this.baseline = baseline;
        return this;
    }

    public IssueVO withBaseline(Consumer<OptionVO> baselineSetter) {
        if (this.baseline == null) {
            this.baseline = new OptionVO();
            baselineSetter.accept(this.baseline);
        }

        return this;
    }

    /**
     * Get baseline
     * @return baseline
     */
    public OptionVO getBaseline() {
        return baseline;
    }

    public void setBaseline(OptionVO baseline) {
        this.baseline = baseline;
    }

    public IssueVO withBusinessDomain(OptionVO businessDomain) {
        this.businessDomain = businessDomain;
        return this;
    }

    public IssueVO withBusinessDomain(Consumer<OptionVO> businessDomainSetter) {
        if (this.businessDomain == null) {
            this.businessDomain = new OptionVO();
            businessDomainSetter.accept(this.businessDomain);
        }

        return this;
    }

    /**
     * Get businessDomain
     * @return businessDomain
     */
    public OptionVO getBusinessDomain() {
        return businessDomain;
    }

    public void setBusinessDomain(OptionVO businessDomain) {
        this.businessDomain = businessDomain;
    }

    public IssueVO withChildren(String children) {
        this.children = children;
        return this;
    }

    /**
     * **参数解释：**  子工作项Id，多值使用英文逗号分隔。 **取值范围：**  不涉及。
     * @return children
     */
    public String getChildren() {
        return children;
    }

    public void setChildren(String children) {
        this.children = children;
    }

    public IssueVO withCollaborativeHistory(String collaborativeHistory) {
        this.collaborativeHistory = collaborativeHistory;
        return this;
    }

    /**
     * **参数解释：**  协同需求的状态变化历史记录，内容为Json字符串。 **取值范围：**  不涉及。
     * @return collaborativeHistory
     */
    public String getCollaborativeHistory() {
        return collaborativeHistory;
    }

    public void setCollaborativeHistory(String collaborativeHistory) {
        this.collaborativeHistory = collaborativeHistory;
    }

    public IssueVO withCollaboratives(String collaboratives) {
        this.collaboratives = collaboratives;
        return this;
    }

    /**
     * **参数解释：**  协同需求中的记录Id。 **取值范围：**  不涉及。
     * @return collaboratives
     */
    public String getCollaboratives() {
        return collaboratives;
    }

    public void setCollaboratives(String collaboratives) {
        this.collaboratives = collaboratives;
    }

    public IssueVO withConvolutionActualHours(String convolutionActualHours) {
        this.convolutionActualHours = convolutionActualHours;
        return this;
    }

    /**
     * **参数解释：**  卷积实际工时。父工作项中将子工作项/协同工作项的实际工时卷积得到。 **取值范围：**  不涉及。
     * @return convolutionActualHours
     */
    public String getConvolutionActualHours() {
        return convolutionActualHours;
    }

    public void setConvolutionActualHours(String convolutionActualHours) {
        this.convolutionActualHours = convolutionActualHours;
    }

    public IssueVO withConvolutionPlanHours(String convolutionPlanHours) {
        this.convolutionPlanHours = convolutionPlanHours;
        return this;
    }

    /**
     * **参数解释：**  卷积计划工时。父工作项中将子工作项/协同工作项的计划工时卷积得到。 **取值范围：**  不涉及。
     * @return convolutionPlanHours
     */
    public String getConvolutionPlanHours() {
        return convolutionPlanHours;
    }

    public void setConvolutionPlanHours(String convolutionPlanHours) {
        this.convolutionPlanHours = convolutionPlanHours;
    }

    public IssueVO withDevelopOwner(String developOwner) {
        this.developOwner = developOwner;
        return this;
    }

    /**
     * **参数解释：**  开发责任人。通常用于“开发”状态节点责任人。 **取值范围：**  不涉及。
     * @return developOwner
     */
    public String getDevelopOwner() {
        return developOwner;
    }

    public void setDevelopOwner(String developOwner) {
        this.developOwner = developOwner;
    }

    public IssueVO withDoneRatio(OptionVO doneRatio) {
        this.doneRatio = doneRatio;
        return this;
    }

    public IssueVO withDoneRatio(Consumer<OptionVO> doneRatioSetter) {
        if (this.doneRatio == null) {
            this.doneRatio = new OptionVO();
            doneRatioSetter.accept(this.doneRatio);
        }

        return this;
    }

    /**
     * Get doneRatio
     * @return doneRatio
     */
    public OptionVO getDoneRatio() {
        return doneRatio;
    }

    public void setDoneRatio(OptionVO doneRatio) {
        this.doneRatio = doneRatio;
    }

    public IssueVO withExpectedRepairDate(String expectedRepairDate) {
        this.expectedRepairDate = expectedRepairDate;
        return this;
    }

    /**
     * **参数解释：**  期望修复时间。 **取值范围：**  不涉及。
     * @return expectedRepairDate
     */
    public String getExpectedRepairDate() {
        return expectedRepairDate;
    }

    public void setExpectedRepairDate(String expectedRepairDate) {
        this.expectedRepairDate = expectedRepairDate;
    }

    public IssueVO withFeature2ir(String feature2ir) {
        this.feature2ir = feature2ir;
        return this;
    }

    /**
     * **参数解释：**  SF的子IR的id。多值使用英文逗号分隔。 **取值范围：**  不涉及。
     * @return feature2ir
     */
    public String getFeature2ir() {
        return feature2ir;
    }

    public void setFeature2ir(String feature2ir) {
        this.feature2ir = feature2ir;
    }

    public IssueVO withFeatureSet(OptionVO featureSet) {
        this.featureSet = featureSet;
        return this;
    }

    public IssueVO withFeatureSet(Consumer<OptionVO> featureSetSetter) {
        if (this.featureSet == null) {
            this.featureSet = new OptionVO();
            featureSetSetter.accept(this.featureSet);
        }

        return this;
    }

    /**
     * Get featureSet
     * @return featureSet
     */
    public OptionVO getFeatureSet() {
        return featureSet;
    }

    public void setFeatureSet(OptionVO featureSet) {
        this.featureSet = featureSet;
    }

    public IssueVO withFoundEnv(OptionVO foundEnv) {
        this.foundEnv = foundEnv;
        return this;
    }

    public IssueVO withFoundEnv(Consumer<OptionVO> foundEnvSetter) {
        if (this.foundEnv == null) {
            this.foundEnv = new OptionVO();
            foundEnvSetter.accept(this.foundEnv);
        }

        return this;
    }

    /**
     * Get foundEnv
     * @return foundEnv
     */
    public OptionVO getFoundEnv() {
        return foundEnv;
    }

    public void setFoundEnv(OptionVO foundEnv) {
        this.foundEnv = foundEnv;
    }

    public IssueVO withFoundIteration(PlanVO foundIteration) {
        this.foundIteration = foundIteration;
        return this;
    }

    public IssueVO withFoundIteration(Consumer<PlanVO> foundIterationSetter) {
        if (this.foundIteration == null) {
            this.foundIteration = new PlanVO();
            foundIterationSetter.accept(this.foundIteration);
        }

        return this;
    }

    /**
     * Get foundIteration
     * @return foundIteration
     */
    public PlanVO getFoundIteration() {
        return foundIteration;
    }

    public void setFoundIteration(PlanVO foundIteration) {
        this.foundIteration = foundIteration;
    }

    public IssueVO withFoundPi(PlanVO foundPi) {
        this.foundPi = foundPi;
        return this;
    }

    public IssueVO withFoundPi(Consumer<PlanVO> foundPiSetter) {
        if (this.foundPi == null) {
            this.foundPi = new PlanVO();
            foundPiSetter.accept(this.foundPi);
        }

        return this;
    }

    /**
     * Get foundPi
     * @return foundPi
     */
    public PlanVO getFoundPi() {
        return foundPi;
    }

    public void setFoundPi(PlanVO foundPi) {
        this.foundPi = foundPi;
    }

    public IssueVO withFunctionScene(String functionScene) {
        this.functionScene = functionScene;
        return this;
    }

    /**
     * **参数解释：**  功能场景。 **取值范围：**  不涉及。
     * @return functionScene
     */
    public String getFunctionScene() {
        return functionScene;
    }

    public void setFunctionScene(String functionScene) {
        this.functionScene = functionScene;
    }

    public IssueVO withIr2feature(String ir2feature) {
        this.ir2feature = ir2feature;
        return this;
    }

    /**
     * **参数解释：**  IR关联的SF的Id，一个IR仅能关联一个SF。 **取值范围：**  不涉及。
     * @return ir2feature
     */
    public String getIr2feature() {
        return ir2feature;
    }

    public void setIr2feature(String ir2feature) {
        this.ir2feature = ir2feature;
    }

    public IssueVO withIr2rr(String ir2rr) {
        this.ir2rr = ir2rr;
        return this;
    }

    /**
     * **参数解释：**  IR关联父RR的Id，多值使用英文逗号分隔。 **取值范围：**  不涉及。
     * @return ir2rr
     */
    public String getIr2rr() {
        return ir2rr;
    }

    public void setIr2rr(String ir2rr) {
        this.ir2rr = ir2rr;
    }

    public IssueVO withIssueOpinionId(String issueOpinionId) {
        this.issueOpinionId = issueOpinionId;
        return this;
    }

    /**
     * **参数解释：**  工作项关联的决策意见Id。 **取值范围：**  不涉及。
     * @return issueOpinionId
     */
    public String getIssueOpinionId() {
        return issueOpinionId;
    }

    public void setIssueOpinionId(String issueOpinionId) {
        this.issueOpinionId = issueOpinionId;
    }

    public IssueVO withIssueReviewId(String issueReviewId) {
        this.issueReviewId = issueReviewId;
        return this;
    }

    /**
     * **参数解释：**  工作项关联的评审意见Id。 **取值范围：**  不涉及。
     * @return issueReviewId
     */
    public String getIssueReviewId() {
        return issueReviewId;
    }

    public void setIssueReviewId(String issueReviewId) {
        this.issueReviewId = issueReviewId;
    }

    public IssueVO withModule(OptionVO module) {
        this.module = module;
        return this;
    }

    public IssueVO withModule(Consumer<OptionVO> moduleSetter) {
        if (this.module == null) {
            this.module = new OptionVO();
            moduleSetter.accept(this.module);
        }

        return this;
    }

    /**
     * Get module
     * @return module
     */
    public OptionVO getModule() {
        return module;
    }

    public void setModule(OptionVO module) {
        this.module = module;
    }

    public IssueVO withNeedBreak(OptionVO needBreak) {
        this.needBreak = needBreak;
        return this;
    }

    public IssueVO withNeedBreak(Consumer<OptionVO> needBreakSetter) {
        if (this.needBreak == null) {
            this.needBreak = new OptionVO();
            needBreakSetter.accept(this.needBreak);
        }

        return this;
    }

    /**
     * Get needBreak
     * @return needBreak
     */
    public OptionVO getNeedBreak() {
        return needBreak;
    }

    public void setNeedBreak(OptionVO needBreak) {
        this.needBreak = needBreak;
    }

    public IssueVO withNeedDevelop(OptionVO needDevelop) {
        this.needDevelop = needDevelop;
        return this;
    }

    public IssueVO withNeedDevelop(Consumer<OptionVO> needDevelopSetter) {
        if (this.needDevelop == null) {
            this.needDevelop = new OptionVO();
            needDevelopSetter.accept(this.needDevelop);
        }

        return this;
    }

    /**
     * Get needDevelop
     * @return needDevelop
     */
    public OptionVO getNeedDevelop() {
        return needDevelop;
    }

    public void setNeedDevelop(OptionVO needDevelop) {
        this.needDevelop = needDevelop;
    }

    public IssueVO withNoBreakReason(String noBreakReason) {
        this.noBreakReason = noBreakReason;
        return this;
    }

    /**
     * **参数解释：**  无需分解原因。 **取值范围：**  不涉及。
     * @return noBreakReason
     */
    public String getNoBreakReason() {
        return noBreakReason;
    }

    public void setNoBreakReason(String noBreakReason) {
        this.noBreakReason = noBreakReason;
    }

    public IssueVO withNoDevelopReason(String noDevelopReason) {
        this.noDevelopReason = noDevelopReason;
        return this;
    }

    /**
     * **参数解释：**  无需开发原因。 **取值范围：**  不涉及。
     * @return noDevelopReason
     */
    public String getNoDevelopReason() {
        return noDevelopReason;
    }

    public void setNoDevelopReason(String noDevelopReason) {
        this.noDevelopReason = noDevelopReason;
    }

    public IssueVO withOrder(String order) {
        this.order = order;
        return this;
    }

    /**
     * **参数解释：**  优先级顺序。 **取值范围：**  1~100。
     * @return order
     */
    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public IssueVO withPlanDevEndDate(String planDevEndDate) {
        this.planDevEndDate = planDevEndDate;
        return this;
    }

    /**
     * **参数解释：**  计划开发结束时间。通常用于“开发”状态节点，Unix时间戳，单位为毫秒。 **取值范围：**  不涉及。
     * @return planDevEndDate
     */
    public String getPlanDevEndDate() {
        return planDevEndDate;
    }

    public void setPlanDevEndDate(String planDevEndDate) {
        this.planDevEndDate = planDevEndDate;
    }

    public IssueVO withPlanProcessingEndDate(String planProcessingEndDate) {
        this.planProcessingEndDate = planProcessingEndDate;
        return this;
    }

    /**
     * **参数解释：**  计划处理中结束时间。通常用于“处理中”状态节点，Unix时间戳，单位为毫秒。 **取值范围：**  不涉及。
     * @return planProcessingEndDate
     */
    public String getPlanProcessingEndDate() {
        return planProcessingEndDate;
    }

    public void setPlanProcessingEndDate(String planProcessingEndDate) {
        this.planProcessingEndDate = planProcessingEndDate;
    }

    public IssueVO withPlanResearchanddevelopEndDate(String planResearchanddevelopEndDate) {
        this.planResearchanddevelopEndDate = planResearchanddevelopEndDate;
        return this;
    }

    /**
     * **参数解释：**  计划研发结束时间。通常用于“研发”状态节点，Unix时间戳，单位为毫秒。 **取值范围：**  不涉及。
     * @return planResearchanddevelopEndDate
     */
    public String getPlanResearchanddevelopEndDate() {
        return planResearchanddevelopEndDate;
    }

    public void setPlanResearchanddevelopEndDate(String planResearchanddevelopEndDate) {
        this.planResearchanddevelopEndDate = planResearchanddevelopEndDate;
    }

    public IssueVO withPlanTestEndDate(String planTestEndDate) {
        this.planTestEndDate = planTestEndDate;
        return this;
    }

    /**
     * **参数解释：**  计划测试结束时间。通常用于“测试”状态节点，Unix时间戳，单位为毫秒。 **取值范围：**  不涉及。
     * @return planTestEndDate
     */
    public String getPlanTestEndDate() {
        return planTestEndDate;
    }

    public void setPlanTestEndDate(String planTestEndDate) {
        this.planTestEndDate = planTestEndDate;
    }

    public IssueVO withPositionFloat(String positionFloat) {
        this.positionFloat = positionFloat;
        return this;
    }

    /**
     * **参数解释：**  标识工作项在列表中初始排序位置。 **取值范围：**  不涉及。
     * @return positionFloat
     */
    public String getPositionFloat() {
        return positionFloat;
    }

    public void setPositionFloat(String positionFloat) {
        this.positionFloat = positionFloat;
    }

    public IssueVO withProcessingOwner(String processingOwner) {
        this.processingOwner = processingOwner;
        return this;
    }

    /**
     * **参数解释：**  处理中责任人。通常用于“处理中”状态节点。 **取值范围：**  不涉及。
     * @return processingOwner
     */
    public String getProcessingOwner() {
        return processingOwner;
    }

    public void setProcessingOwner(String processingOwner) {
        this.processingOwner = processingOwner;
    }

    public IssueVO withReasonAnalysis(String reasonAnalysis) {
        this.reasonAnalysis = reasonAnalysis;
        return this;
    }

    /**
     * **参数解释：**  分析原因。 **取值范围：**  不涉及。
     * @return reasonAnalysis
     */
    public String getReasonAnalysis() {
        return reasonAnalysis;
    }

    public void setReasonAnalysis(String reasonAnalysis) {
        this.reasonAnalysis = reasonAnalysis;
    }

    public IssueVO withRegressionFailureNumber(Integer regressionFailureNumber) {
        this.regressionFailureNumber = regressionFailureNumber;
        return this;
    }

    /**
     * **参数解释：**  回归不通过次数。缺陷测试不通过时自动赋值。 **取值范围：**  不涉及。
     * @return regressionFailureNumber
     */
    public Integer getRegressionFailureNumber() {
        return regressionFailureNumber;
    }

    public void setRegressionFailureNumber(Integer regressionFailureNumber) {
        this.regressionFailureNumber = regressionFailureNumber;
    }

    public IssueVO withRelatedNetworkSecurity(OptionVO relatedNetworkSecurity) {
        this.relatedNetworkSecurity = relatedNetworkSecurity;
        return this;
    }

    public IssueVO withRelatedNetworkSecurity(Consumer<OptionVO> relatedNetworkSecuritySetter) {
        if (this.relatedNetworkSecurity == null) {
            this.relatedNetworkSecurity = new OptionVO();
            relatedNetworkSecuritySetter.accept(this.relatedNetworkSecurity);
        }

        return this;
    }

    /**
     * Get relatedNetworkSecurity
     * @return relatedNetworkSecurity
     */
    public OptionVO getRelatedNetworkSecurity() {
        return relatedNetworkSecurity;
    }

    public void setRelatedNetworkSecurity(OptionVO relatedNetworkSecurity) {
        this.relatedNetworkSecurity = relatedNetworkSecurity;
    }

    public IssueVO withRepairSolution(String repairSolution) {
        this.repairSolution = repairSolution;
        return this;
    }

    /**
     * **参数解释：**  修复方案。常用于修复缺陷时。 **取值范围：**  不涉及。
     * @return repairSolution
     */
    public String getRepairSolution() {
        return repairSolution;
    }

    public void setRepairSolution(String repairSolution) {
        this.repairSolution = repairSolution;
    }

    public IssueVO withResearchanddevelopOwner(String researchanddevelopOwner) {
        this.researchanddevelopOwner = researchanddevelopOwner;
        return this;
    }

    /**
     * **参数解释：**  研发责任人。通常用于“研发”状态节点。 **取值范围：**  不涉及。
     * @return researchanddevelopOwner
     */
    public String getResearchanddevelopOwner() {
        return researchanddevelopOwner;
    }

    public void setResearchanddevelopOwner(String researchanddevelopOwner) {
        this.researchanddevelopOwner = researchanddevelopOwner;
    }

    public IssueVO withSeverity(OptionVO severity) {
        this.severity = severity;
        return this;
    }

    public IssueVO withSeverity(Consumer<OptionVO> severitySetter) {
        if (this.severity == null) {
            this.severity = new OptionVO();
            severitySetter.accept(this.severity);
        }

        return this;
    }

    /**
     * Get severity
     * @return severity
     */
    public OptionVO getSeverity() {
        return severity;
    }

    public void setSeverity(OptionVO severity) {
        this.severity = severity;
    }

    public IssueVO withSysActivationReason(String sysActivationReason) {
        this.sysActivationReason = sysActivationReason;
        return this;
    }

    /**
     * **参数解释：**  严重程度。 **取值范围：**  不涉及。
     * @return sysActivationReason
     */
    public String getSysActivationReason() {
        return sysActivationReason;
    }

    public void setSysActivationReason(String sysActivationReason) {
        this.sysActivationReason = sysActivationReason;
    }

    public IssueVO withSysNoRepairReason(String sysNoRepairReason) {
        this.sysNoRepairReason = sysNoRepairReason;
        return this;
    }

    /**
     * **参数解释：**  无需修复原因。通常用于在缺陷无需修复时。 **取值范围：**  不涉及。
     * @return sysNoRepairReason
     */
    public String getSysNoRepairReason() {
        return sysNoRepairReason;
    }

    public void setSysNoRepairReason(String sysNoRepairReason) {
        this.sysNoRepairReason = sysNoRepairReason;
    }

    public IssueVO withTestFailuresTimes(Integer testFailuresTimes) {
        this.testFailuresTimes = testFailuresTimes;
        return this;
    }

    /**
     * **参数解释：**  测试不通过次数。 **取值范围：**  不涉及。
     * @return testFailuresTimes
     */
    public Integer getTestFailuresTimes() {
        return testFailuresTimes;
    }

    public void setTestFailuresTimes(Integer testFailuresTimes) {
        this.testFailuresTimes = testFailuresTimes;
    }

    public IssueVO withTestOwner(String testOwner) {
        this.testOwner = testOwner;
        return this;
    }

    /**
     * **参数解释：**  测试责任人。通常用于“测试”状态节点。 **取值范围：**  不涉及。
     * @return testOwner
     */
    public String getTestOwner() {
        return testOwner;
    }

    public void setTestOwner(String testOwner) {
        this.testOwner = testOwner;
    }

    public IssueVO withTestReport(String testReport) {
        this.testReport = testReport;
        return this;
    }

    /**
     * **参数解释：**  测试报告。 **取值范围：**  不涉及。
     * @return testReport
     */
    public String getTestReport() {
        return testReport;
    }

    public void setTestReport(String testReport) {
        this.testReport = testReport;
    }

    public IssueVO withValFeature(OptionVO valFeature) {
        this.valFeature = valFeature;
        return this;
    }

    public IssueVO withValFeature(Consumer<OptionVO> valFeatureSetter) {
        if (this.valFeature == null) {
            this.valFeature = new OptionVO();
            valFeatureSetter.accept(this.valFeature);
        }

        return this;
    }

    /**
     * Get valFeature
     * @return valFeature
     */
    public OptionVO getValFeature() {
        return valFeature;
    }

    public void setValFeature(OptionVO valFeature) {
        this.valFeature = valFeature;
    }

    public IssueVO withWorkitem2ganttchart(String workitem2ganttchart) {
        this.workitem2ganttchart = workitem2ganttchart;
        return this;
    }

    /**
     * **参数解释：**  工作项关联的甘特图Id。 **取值范围：**  不涉及。
     * @return workitem2ganttchart
     */
    public String getWorkitem2ganttchart() {
        return workitem2ganttchart;
    }

    public void setWorkitem2ganttchart(String workitem2ganttchart) {
        this.workitem2ganttchart = workitem2ganttchart;
    }

    public IssueVO withWorkitem2mindmap(String workitem2mindmap) {
        this.workitem2mindmap = workitem2mindmap;
        return this;
    }

    /**
     * **参数解释：**  工作项关联的思维导图Id。 **取值范围：**  不涉及。
     * @return workitem2mindmap
     */
    public String getWorkitem2mindmap() {
        return workitem2mindmap;
    }

    public void setWorkitem2mindmap(String workitem2mindmap) {
        this.workitem2mindmap = workitem2mindmap;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IssueVO that = (IssueVO) obj;
        return Objects.equals(this.sysAnalysisConclusion, that.sysAnalysisConclusion)
            && Objects.equals(this.sysRemark, that.sysRemark) && Objects.equals(this.promised, that.promised)
            && Objects.equals(this.type, that.type) && Objects.equals(this.belongInside, that.belongInside)
            && Objects.equals(this.srcDomain, that.srcDomain) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.sendFrom, that.sendFrom) && Objects.equals(this.number, that.number)
            && Objects.equals(this.sendTo, that.sendTo) && Objects.equals(this.path, that.path)
            && Objects.equals(this.workloadManDay, that.workloadManDay)
            && Objects.equals(this.sysCheckConclusion, that.sysCheckConclusion) && Objects.equals(this.id, that.id)
            && Objects.equals(this.state, that.state) && Objects.equals(this.stayDays, that.stayDays)
            && Objects.equals(this.assignedCc, that.assignedCc) && Objects.equals(this.submitTime, that.submitTime)
            && Objects.equals(this.workitem2label, that.workitem2label)
            && Objects.equals(this.sysReturnConclusion, that.sysReturnConclusion)
            && Objects.equals(this.closeTime, that.closeTime) && Objects.equals(this.priority, that.priority)
            && Objects.equals(this.modifiedDate, that.modifiedDate) && Objects.equals(this.createdBy, that.createdBy)
            && Objects.equals(this.breakStatus, that.breakStatus)
            && Objects.equals(this.statusModifiedDate, that.statusModifiedDate)
            && Objects.equals(this.expectDeliveryTime, that.expectDeliveryTime)
            && Objects.equals(this.parentId, that.parentId) && Objects.equals(this.assignee, that.assignee)
            && Objects.equals(this.region, that.region) && Objects.equals(this.status, that.status)
            && Objects.equals(this.tenantId, that.tenantId) && Objects.equals(this.planPi, that.planPi)
            && Objects.equals(this.link, that.link) && Objects.equals(this.description, that.description)
            && Objects.equals(this.isSuspended, that.isSuspended)
            && Objects.equals(this.changeStatus, that.changeStatus) && Objects.equals(this.title, that.title)
            && Objects.equals(this.sumWorkloadManDay, that.sumWorkloadManDay)
            && Objects.equals(this.sysCloseReason, that.sysCloseReason)
            && Objects.equals(this.sysResubmitReason, that.sysResubmitReason)
            && Objects.equals(this.planEndDate, that.planEndDate) && Objects.equals(this.rr2ir, that.rr2ir)
            && Objects.equals(this.categoryLayerId, that.categoryLayerId)
            && Objects.equals(this.submittedBy, that.submittedBy) && Objects.equals(this.rr2us, that.rr2us)
            && Objects.equals(this.sysNoDevelopReason, that.sysNoDevelopReason)
            && Objects.equals(this.planIteration, that.planIteration)
            && Objects.equals(this.sysReturnReason, that.sysReturnReason)
            && Objects.equals(this.cascadeDelete, that.cascadeDelete) && Objects.equals(this.recipient, that.recipient)
            && Objects.equals(this.modifiedBy, that.modifiedBy) && Objects.equals(this.createdDate, that.createdDate)
            && Objects.equals(this.category, that.category)
            && Objects.equals(this.collaborativeStatus, that.collaborativeStatus)
            && Objects.equals(this.project, that.project) && Objects.equals(this.childIssues, that.childIssues)
            && Objects.equals(this.activateTimes, that.activateTimes) && Objects.equals(this.baseline, that.baseline)
            && Objects.equals(this.businessDomain, that.businessDomain) && Objects.equals(this.children, that.children)
            && Objects.equals(this.collaborativeHistory, that.collaborativeHistory)
            && Objects.equals(this.collaboratives, that.collaboratives)
            && Objects.equals(this.convolutionActualHours, that.convolutionActualHours)
            && Objects.equals(this.convolutionPlanHours, that.convolutionPlanHours)
            && Objects.equals(this.developOwner, that.developOwner) && Objects.equals(this.doneRatio, that.doneRatio)
            && Objects.equals(this.expectedRepairDate, that.expectedRepairDate)
            && Objects.equals(this.feature2ir, that.feature2ir) && Objects.equals(this.featureSet, that.featureSet)
            && Objects.equals(this.foundEnv, that.foundEnv) && Objects.equals(this.foundIteration, that.foundIteration)
            && Objects.equals(this.foundPi, that.foundPi) && Objects.equals(this.functionScene, that.functionScene)
            && Objects.equals(this.ir2feature, that.ir2feature) && Objects.equals(this.ir2rr, that.ir2rr)
            && Objects.equals(this.issueOpinionId, that.issueOpinionId)
            && Objects.equals(this.issueReviewId, that.issueReviewId) && Objects.equals(this.module, that.module)
            && Objects.equals(this.needBreak, that.needBreak) && Objects.equals(this.needDevelop, that.needDevelop)
            && Objects.equals(this.noBreakReason, that.noBreakReason)
            && Objects.equals(this.noDevelopReason, that.noDevelopReason) && Objects.equals(this.order, that.order)
            && Objects.equals(this.planDevEndDate, that.planDevEndDate)
            && Objects.equals(this.planProcessingEndDate, that.planProcessingEndDate)
            && Objects.equals(this.planResearchanddevelopEndDate, that.planResearchanddevelopEndDate)
            && Objects.equals(this.planTestEndDate, that.planTestEndDate)
            && Objects.equals(this.positionFloat, that.positionFloat)
            && Objects.equals(this.processingOwner, that.processingOwner)
            && Objects.equals(this.reasonAnalysis, that.reasonAnalysis)
            && Objects.equals(this.regressionFailureNumber, that.regressionFailureNumber)
            && Objects.equals(this.relatedNetworkSecurity, that.relatedNetworkSecurity)
            && Objects.equals(this.repairSolution, that.repairSolution)
            && Objects.equals(this.researchanddevelopOwner, that.researchanddevelopOwner)
            && Objects.equals(this.severity, that.severity)
            && Objects.equals(this.sysActivationReason, that.sysActivationReason)
            && Objects.equals(this.sysNoRepairReason, that.sysNoRepairReason)
            && Objects.equals(this.testFailuresTimes, that.testFailuresTimes)
            && Objects.equals(this.testOwner, that.testOwner) && Objects.equals(this.testReport, that.testReport)
            && Objects.equals(this.valFeature, that.valFeature)
            && Objects.equals(this.workitem2ganttchart, that.workitem2ganttchart)
            && Objects.equals(this.workitem2mindmap, that.workitem2mindmap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sysAnalysisConclusion,
            sysRemark,
            promised,
            type,
            belongInside,
            srcDomain,
            domainId,
            sendFrom,
            number,
            sendTo,
            path,
            workloadManDay,
            sysCheckConclusion,
            id,
            state,
            stayDays,
            assignedCc,
            submitTime,
            workitem2label,
            sysReturnConclusion,
            closeTime,
            priority,
            modifiedDate,
            createdBy,
            breakStatus,
            statusModifiedDate,
            expectDeliveryTime,
            parentId,
            assignee,
            region,
            status,
            tenantId,
            planPi,
            link,
            description,
            isSuspended,
            changeStatus,
            title,
            sumWorkloadManDay,
            sysCloseReason,
            sysResubmitReason,
            planEndDate,
            rr2ir,
            categoryLayerId,
            submittedBy,
            rr2us,
            sysNoDevelopReason,
            planIteration,
            sysReturnReason,
            cascadeDelete,
            recipient,
            modifiedBy,
            createdDate,
            category,
            collaborativeStatus,
            project,
            childIssues,
            activateTimes,
            baseline,
            businessDomain,
            children,
            collaborativeHistory,
            collaboratives,
            convolutionActualHours,
            convolutionPlanHours,
            developOwner,
            doneRatio,
            expectedRepairDate,
            feature2ir,
            featureSet,
            foundEnv,
            foundIteration,
            foundPi,
            functionScene,
            ir2feature,
            ir2rr,
            issueOpinionId,
            issueReviewId,
            module,
            needBreak,
            needDevelop,
            noBreakReason,
            noDevelopReason,
            order,
            planDevEndDate,
            planProcessingEndDate,
            planResearchanddevelopEndDate,
            planTestEndDate,
            positionFloat,
            processingOwner,
            reasonAnalysis,
            regressionFailureNumber,
            relatedNetworkSecurity,
            repairSolution,
            researchanddevelopOwner,
            severity,
            sysActivationReason,
            sysNoRepairReason,
            testFailuresTimes,
            testOwner,
            testReport,
            valFeature,
            workitem2ganttchart,
            workitem2mindmap);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssueVO {\n");
        sb.append("    sysAnalysisConclusion: ").append(toIndentedString(sysAnalysisConclusion)).append("\n");
        sb.append("    sysRemark: ").append(toIndentedString(sysRemark)).append("\n");
        sb.append("    promised: ").append(toIndentedString(promised)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    belongInside: ").append(toIndentedString(belongInside)).append("\n");
        sb.append("    srcDomain: ").append(toIndentedString(srcDomain)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    sendFrom: ").append(toIndentedString(sendFrom)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    sendTo: ").append(toIndentedString(sendTo)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    workloadManDay: ").append(toIndentedString(workloadManDay)).append("\n");
        sb.append("    sysCheckConclusion: ").append(toIndentedString(sysCheckConclusion)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    stayDays: ").append(toIndentedString(stayDays)).append("\n");
        sb.append("    assignedCc: ").append(toIndentedString(assignedCc)).append("\n");
        sb.append("    submitTime: ").append(toIndentedString(submitTime)).append("\n");
        sb.append("    workitem2label: ").append(toIndentedString(workitem2label)).append("\n");
        sb.append("    sysReturnConclusion: ").append(toIndentedString(sysReturnConclusion)).append("\n");
        sb.append("    closeTime: ").append(toIndentedString(closeTime)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    breakStatus: ").append(toIndentedString(breakStatus)).append("\n");
        sb.append("    statusModifiedDate: ").append(toIndentedString(statusModifiedDate)).append("\n");
        sb.append("    expectDeliveryTime: ").append(toIndentedString(expectDeliveryTime)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    planPi: ").append(toIndentedString(planPi)).append("\n");
        sb.append("    link: ").append(toIndentedString(link)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    isSuspended: ").append(toIndentedString(isSuspended)).append("\n");
        sb.append("    changeStatus: ").append(toIndentedString(changeStatus)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    sumWorkloadManDay: ").append(toIndentedString(sumWorkloadManDay)).append("\n");
        sb.append("    sysCloseReason: ").append(toIndentedString(sysCloseReason)).append("\n");
        sb.append("    sysResubmitReason: ").append(toIndentedString(sysResubmitReason)).append("\n");
        sb.append("    planEndDate: ").append(toIndentedString(planEndDate)).append("\n");
        sb.append("    rr2ir: ").append(toIndentedString(rr2ir)).append("\n");
        sb.append("    categoryLayerId: ").append(toIndentedString(categoryLayerId)).append("\n");
        sb.append("    submittedBy: ").append(toIndentedString(submittedBy)).append("\n");
        sb.append("    rr2us: ").append(toIndentedString(rr2us)).append("\n");
        sb.append("    sysNoDevelopReason: ").append(toIndentedString(sysNoDevelopReason)).append("\n");
        sb.append("    planIteration: ").append(toIndentedString(planIteration)).append("\n");
        sb.append("    sysReturnReason: ").append(toIndentedString(sysReturnReason)).append("\n");
        sb.append("    cascadeDelete: ").append(toIndentedString(cascadeDelete)).append("\n");
        sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
        sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
        sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    collaborativeStatus: ").append(toIndentedString(collaborativeStatus)).append("\n");
        sb.append("    project: ").append(toIndentedString(project)).append("\n");
        sb.append("    childIssues: ").append(toIndentedString(childIssues)).append("\n");
        sb.append("    activateTimes: ").append(toIndentedString(activateTimes)).append("\n");
        sb.append("    baseline: ").append(toIndentedString(baseline)).append("\n");
        sb.append("    businessDomain: ").append(toIndentedString(businessDomain)).append("\n");
        sb.append("    children: ").append(toIndentedString(children)).append("\n");
        sb.append("    collaborativeHistory: ").append(toIndentedString(collaborativeHistory)).append("\n");
        sb.append("    collaboratives: ").append(toIndentedString(collaboratives)).append("\n");
        sb.append("    convolutionActualHours: ").append(toIndentedString(convolutionActualHours)).append("\n");
        sb.append("    convolutionPlanHours: ").append(toIndentedString(convolutionPlanHours)).append("\n");
        sb.append("    developOwner: ").append(toIndentedString(developOwner)).append("\n");
        sb.append("    doneRatio: ").append(toIndentedString(doneRatio)).append("\n");
        sb.append("    expectedRepairDate: ").append(toIndentedString(expectedRepairDate)).append("\n");
        sb.append("    feature2ir: ").append(toIndentedString(feature2ir)).append("\n");
        sb.append("    featureSet: ").append(toIndentedString(featureSet)).append("\n");
        sb.append("    foundEnv: ").append(toIndentedString(foundEnv)).append("\n");
        sb.append("    foundIteration: ").append(toIndentedString(foundIteration)).append("\n");
        sb.append("    foundPi: ").append(toIndentedString(foundPi)).append("\n");
        sb.append("    functionScene: ").append(toIndentedString(functionScene)).append("\n");
        sb.append("    ir2feature: ").append(toIndentedString(ir2feature)).append("\n");
        sb.append("    ir2rr: ").append(toIndentedString(ir2rr)).append("\n");
        sb.append("    issueOpinionId: ").append(toIndentedString(issueOpinionId)).append("\n");
        sb.append("    issueReviewId: ").append(toIndentedString(issueReviewId)).append("\n");
        sb.append("    module: ").append(toIndentedString(module)).append("\n");
        sb.append("    needBreak: ").append(toIndentedString(needBreak)).append("\n");
        sb.append("    needDevelop: ").append(toIndentedString(needDevelop)).append("\n");
        sb.append("    noBreakReason: ").append(toIndentedString(noBreakReason)).append("\n");
        sb.append("    noDevelopReason: ").append(toIndentedString(noDevelopReason)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("    planDevEndDate: ").append(toIndentedString(planDevEndDate)).append("\n");
        sb.append("    planProcessingEndDate: ").append(toIndentedString(planProcessingEndDate)).append("\n");
        sb.append("    planResearchanddevelopEndDate: ")
            .append(toIndentedString(planResearchanddevelopEndDate))
            .append("\n");
        sb.append("    planTestEndDate: ").append(toIndentedString(planTestEndDate)).append("\n");
        sb.append("    positionFloat: ").append(toIndentedString(positionFloat)).append("\n");
        sb.append("    processingOwner: ").append(toIndentedString(processingOwner)).append("\n");
        sb.append("    reasonAnalysis: ").append(toIndentedString(reasonAnalysis)).append("\n");
        sb.append("    regressionFailureNumber: ").append(toIndentedString(regressionFailureNumber)).append("\n");
        sb.append("    relatedNetworkSecurity: ").append(toIndentedString(relatedNetworkSecurity)).append("\n");
        sb.append("    repairSolution: ").append(toIndentedString(repairSolution)).append("\n");
        sb.append("    researchanddevelopOwner: ").append(toIndentedString(researchanddevelopOwner)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    sysActivationReason: ").append(toIndentedString(sysActivationReason)).append("\n");
        sb.append("    sysNoRepairReason: ").append(toIndentedString(sysNoRepairReason)).append("\n");
        sb.append("    testFailuresTimes: ").append(toIndentedString(testFailuresTimes)).append("\n");
        sb.append("    testOwner: ").append(toIndentedString(testOwner)).append("\n");
        sb.append("    testReport: ").append(toIndentedString(testReport)).append("\n");
        sb.append("    valFeature: ").append(toIndentedString(valFeature)).append("\n");
        sb.append("    workitem2ganttchart: ").append(toIndentedString(workitem2ganttchart)).append("\n");
        sb.append("    workitem2mindmap: ").append(toIndentedString(workitem2mindmap)).append("\n");
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
