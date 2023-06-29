package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 测试计划详情
 */
public class TestPlanDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_id")

    private String planId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_date")

    private LocalDate startDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_date")

    private LocalDate endDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finish_date")

    private LocalDate finishDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_stage")

    private String currentStage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_day")

    private String expireDay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private TestPlanDetailCreator creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private TestPlanDetailOwner owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "design_stage")

    private TestPlanDetailDesignStage designStage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_stage")

    private TestPlanDetailExecuteStage executeStage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_stage")

    private TestPlanDetailReportStage reportStage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iteration")

    private NameAndId iteration;

    public TestPlanDetail withPlanId(String planId) {
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

    public TestPlanDetail withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 测试计划名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TestPlanDetail withStartDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * 测试计划开始时间
     * @return startDate
     */
    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public TestPlanDetail withEndDate(LocalDate endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * 测试计划截止时间
     * @return endDate
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public TestPlanDetail withFinishDate(LocalDate finishDate) {
        this.finishDate = finishDate;
        return this;
    }

    /**
     * 测试计划实际完成时间（测试计划实际完成指测试计划下所有测试用例处于完成状态）
     * @return finishDate
     */
    public LocalDate getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(LocalDate finishDate) {
        this.finishDate = finishDate;
    }

    public TestPlanDetail withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public TestPlanDetail withCurrentStage(String currentStage) {
        this.currentStage = currentStage;
        return this;
    }

    /**
     * 当前测试计划所处的阶段
     * @return currentStage
     */
    public String getCurrentStage() {
        return currentStage;
    }

    public void setCurrentStage(String currentStage) {
        this.currentStage = currentStage;
    }

    public TestPlanDetail withExpireDay(String expireDay) {
        this.expireDay = expireDay;
        return this;
    }

    /**
     * 获取超期时间,正值表示已超期
     * @return expireDay
     */
    public String getExpireDay() {
        return expireDay;
    }

    public void setExpireDay(String expireDay) {
        this.expireDay = expireDay;
    }

    public TestPlanDetail withCreator(TestPlanDetailCreator creator) {
        this.creator = creator;
        return this;
    }

    public TestPlanDetail withCreator(Consumer<TestPlanDetailCreator> creatorSetter) {
        if (this.creator == null) {
            this.creator = new TestPlanDetailCreator();
            creatorSetter.accept(this.creator);
        }

        return this;
    }

    /**
     * Get creator
     * @return creator
     */
    public TestPlanDetailCreator getCreator() {
        return creator;
    }

    public void setCreator(TestPlanDetailCreator creator) {
        this.creator = creator;
    }

    public TestPlanDetail withOwner(TestPlanDetailOwner owner) {
        this.owner = owner;
        return this;
    }

    public TestPlanDetail withOwner(Consumer<TestPlanDetailOwner> ownerSetter) {
        if (this.owner == null) {
            this.owner = new TestPlanDetailOwner();
            ownerSetter.accept(this.owner);
        }

        return this;
    }

    /**
     * Get owner
     * @return owner
     */
    public TestPlanDetailOwner getOwner() {
        return owner;
    }

    public void setOwner(TestPlanDetailOwner owner) {
        this.owner = owner;
    }

    public TestPlanDetail withDesignStage(TestPlanDetailDesignStage designStage) {
        this.designStage = designStage;
        return this;
    }

    public TestPlanDetail withDesignStage(Consumer<TestPlanDetailDesignStage> designStageSetter) {
        if (this.designStage == null) {
            this.designStage = new TestPlanDetailDesignStage();
            designStageSetter.accept(this.designStage);
        }

        return this;
    }

    /**
     * Get designStage
     * @return designStage
     */
    public TestPlanDetailDesignStage getDesignStage() {
        return designStage;
    }

    public void setDesignStage(TestPlanDetailDesignStage designStage) {
        this.designStage = designStage;
    }

    public TestPlanDetail withExecuteStage(TestPlanDetailExecuteStage executeStage) {
        this.executeStage = executeStage;
        return this;
    }

    public TestPlanDetail withExecuteStage(Consumer<TestPlanDetailExecuteStage> executeStageSetter) {
        if (this.executeStage == null) {
            this.executeStage = new TestPlanDetailExecuteStage();
            executeStageSetter.accept(this.executeStage);
        }

        return this;
    }

    /**
     * Get executeStage
     * @return executeStage
     */
    public TestPlanDetailExecuteStage getExecuteStage() {
        return executeStage;
    }

    public void setExecuteStage(TestPlanDetailExecuteStage executeStage) {
        this.executeStage = executeStage;
    }

    public TestPlanDetail withReportStage(TestPlanDetailReportStage reportStage) {
        this.reportStage = reportStage;
        return this;
    }

    public TestPlanDetail withReportStage(Consumer<TestPlanDetailReportStage> reportStageSetter) {
        if (this.reportStage == null) {
            this.reportStage = new TestPlanDetailReportStage();
            reportStageSetter.accept(this.reportStage);
        }

        return this;
    }

    /**
     * Get reportStage
     * @return reportStage
     */
    public TestPlanDetailReportStage getReportStage() {
        return reportStage;
    }

    public void setReportStage(TestPlanDetailReportStage reportStage) {
        this.reportStage = reportStage;
    }

    public TestPlanDetail withIteration(NameAndId iteration) {
        this.iteration = iteration;
        return this;
    }

    public TestPlanDetail withIteration(Consumer<NameAndId> iterationSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TestPlanDetail that = (TestPlanDetail) obj;
        return Objects.equals(this.planId, that.planId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.startDate, that.startDate) && Objects.equals(this.endDate, that.endDate)
            && Objects.equals(this.finishDate, that.finishDate) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.currentStage, that.currentStage) && Objects.equals(this.expireDay, that.expireDay)
            && Objects.equals(this.creator, that.creator) && Objects.equals(this.owner, that.owner)
            && Objects.equals(this.designStage, that.designStage)
            && Objects.equals(this.executeStage, that.executeStage)
            && Objects.equals(this.reportStage, that.reportStage) && Objects.equals(this.iteration, that.iteration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(planId,
            name,
            startDate,
            endDate,
            finishDate,
            projectId,
            currentStage,
            expireDay,
            creator,
            owner,
            designStage,
            executeStage,
            reportStage,
            iteration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TestPlanDetail {\n");
        sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
        sb.append("    finishDate: ").append(toIndentedString(finishDate)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    currentStage: ").append(toIndentedString(currentStage)).append("\n");
        sb.append("    expireDay: ").append(toIndentedString(expireDay)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    designStage: ").append(toIndentedString(designStage)).append("\n");
        sb.append("    executeStage: ").append(toIndentedString(executeStage)).append("\n");
        sb.append("    reportStage: ").append(toIndentedString(reportStage)).append("\n");
        sb.append("    iteration: ").append(toIndentedString(iteration)).append("\n");
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
