package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 测试计划需求列表详情
 */
public class TestPlanIssueDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_id")

    private String planId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workitem_id")

    private String workitemId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_issue")

    private String parentIssue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_date")

    private String startDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_date")

    private String endDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private NameAndId owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private NameAndId severity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private NameAndId status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tracker")

    private NameAndId tracker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iteration")

    private NameAndId iteration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "module")

    private NameAndId module;

    public TestPlanIssueDetail withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目id，项目唯一标识，固定长度32位字符
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public TestPlanIssueDetail withPlanId(String planId) {
        this.planId = planId;
        return this;
    }

    /**
     * 测试计划id
     * @return planId
     */
    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public TestPlanIssueDetail withWorkitemId(String workitemId) {
        this.workitemId = workitemId;
        return this;
    }

    /**
     * 工作项id
     * @return workitemId
     */
    public String getWorkitemId() {
        return workitemId;
    }

    public void setWorkitemId(String workitemId) {
        this.workitemId = workitemId;
    }

    public TestPlanIssueDetail withParentIssue(String parentIssue) {
        this.parentIssue = parentIssue;
        return this;
    }

    /**
     * 父工作项
     * @return parentIssue
     */
    public String getParentIssue() {
        return parentIssue;
    }

    public void setParentIssue(String parentIssue) {
        this.parentIssue = parentIssue;
    }

    public TestPlanIssueDetail withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * 预计开始日期
     * @return startDate
     */
    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public TestPlanIssueDetail withEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * 预计结束日期
     * @return endDate
     */
    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public TestPlanIssueDetail withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 工作项名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TestPlanIssueDetail withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * region信息
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public TestPlanIssueDetail withOwner(NameAndId owner) {
        this.owner = owner;
        return this;
    }

    public TestPlanIssueDetail withOwner(Consumer<NameAndId> ownerSetter) {
        if (this.owner == null) {
            this.owner = new NameAndId();
            ownerSetter.accept(this.owner);
        }

        return this;
    }

    /**
     * Get owner
     * @return owner
     */
    public NameAndId getOwner() {
        return owner;
    }

    public void setOwner(NameAndId owner) {
        this.owner = owner;
    }

    public TestPlanIssueDetail withSeverity(NameAndId severity) {
        this.severity = severity;
        return this;
    }

    public TestPlanIssueDetail withSeverity(Consumer<NameAndId> severitySetter) {
        if (this.severity == null) {
            this.severity = new NameAndId();
            severitySetter.accept(this.severity);
        }

        return this;
    }

    /**
     * Get severity
     * @return severity
     */
    public NameAndId getSeverity() {
        return severity;
    }

    public void setSeverity(NameAndId severity) {
        this.severity = severity;
    }

    public TestPlanIssueDetail withStatus(NameAndId status) {
        this.status = status;
        return this;
    }

    public TestPlanIssueDetail withStatus(Consumer<NameAndId> statusSetter) {
        if (this.status == null) {
            this.status = new NameAndId();
            statusSetter.accept(this.status);
        }

        return this;
    }

    /**
     * Get status
     * @return status
     */
    public NameAndId getStatus() {
        return status;
    }

    public void setStatus(NameAndId status) {
        this.status = status;
    }

    public TestPlanIssueDetail withTracker(NameAndId tracker) {
        this.tracker = tracker;
        return this;
    }

    public TestPlanIssueDetail withTracker(Consumer<NameAndId> trackerSetter) {
        if (this.tracker == null) {
            this.tracker = new NameAndId();
            trackerSetter.accept(this.tracker);
        }

        return this;
    }

    /**
     * Get tracker
     * @return tracker
     */
    public NameAndId getTracker() {
        return tracker;
    }

    public void setTracker(NameAndId tracker) {
        this.tracker = tracker;
    }

    public TestPlanIssueDetail withIteration(NameAndId iteration) {
        this.iteration = iteration;
        return this;
    }

    public TestPlanIssueDetail withIteration(Consumer<NameAndId> iterationSetter) {
        if (this.iteration == null) {
            this.iteration = new NameAndId();
            iterationSetter.accept(this.iteration);
        }

        return this;
    }

    /**
     * Get iteration
     * @return iteration
     */
    public NameAndId getIteration() {
        return iteration;
    }

    public void setIteration(NameAndId iteration) {
        this.iteration = iteration;
    }

    public TestPlanIssueDetail withModule(NameAndId module) {
        this.module = module;
        return this;
    }

    public TestPlanIssueDetail withModule(Consumer<NameAndId> moduleSetter) {
        if (this.module == null) {
            this.module = new NameAndId();
            moduleSetter.accept(this.module);
        }

        return this;
    }

    /**
     * Get module
     * @return module
     */
    public NameAndId getModule() {
        return module;
    }

    public void setModule(NameAndId module) {
        this.module = module;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TestPlanIssueDetail that = (TestPlanIssueDetail) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.planId, that.planId)
            && Objects.equals(this.workitemId, that.workitemId) && Objects.equals(this.parentIssue, that.parentIssue)
            && Objects.equals(this.startDate, that.startDate) && Objects.equals(this.endDate, that.endDate)
            && Objects.equals(this.name, that.name) && Objects.equals(this.regionId, that.regionId)
            && Objects.equals(this.owner, that.owner) && Objects.equals(this.severity, that.severity)
            && Objects.equals(this.status, that.status) && Objects.equals(this.tracker, that.tracker)
            && Objects.equals(this.iteration, that.iteration) && Objects.equals(this.module, that.module);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId,
            planId,
            workitemId,
            parentIssue,
            startDate,
            endDate,
            name,
            regionId,
            owner,
            severity,
            status,
            tracker,
            iteration,
            module);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TestPlanIssueDetail {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
        sb.append("    workitemId: ").append(toIndentedString(workitemId)).append("\n");
        sb.append("    parentIssue: ").append(toIndentedString(parentIssue)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    tracker: ").append(toIndentedString(tracker)).append("\n");
        sb.append("    iteration: ").append(toIndentedString(iteration)).append("\n");
        sb.append("    module: ").append(toIndentedString(module)).append("\n");
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
