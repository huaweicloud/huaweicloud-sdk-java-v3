package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.util.Objects;
import java.util.function.Consumer;

/** ShowPlansResponseBody */
public class ShowPlansResponseBody {

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
    @JsonProperty(value = "owner")

    private ShowPlansResponseOwner owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "design_stage")

    private ShowPlansResponseDesignStage designStage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_stage")

    private ShowPlansResponseExecuteStage executeStage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_stage")

    private ShowPlansResponseReportStage reportStage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iteration")

    private NameAndId iteration;

    public ShowPlansResponseBody withPlanId(String planId) {
        this.planId = planId;
        return this;
    }

    /** 测试计划id
     * 
     * @return planId */
    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public ShowPlansResponseBody withName(String name) {
        this.name = name;
        return this;
    }

    /** 测试计划名称
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowPlansResponseBody withStartDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }

    /** 测试计划开始时间
     * 
     * @return startDate */
    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public ShowPlansResponseBody withEndDate(LocalDate endDate) {
        this.endDate = endDate;
        return this;
    }

    /** 测试计划截止时间
     * 
     * @return endDate */
    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public ShowPlansResponseBody withFinishDate(LocalDate finishDate) {
        this.finishDate = finishDate;
        return this;
    }

    /** 测试计划实际完成时间（测试计划实际完成指测试计划下所有测试用例处于完成状态）
     * 
     * @return finishDate */
    public LocalDate getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(LocalDate finishDate) {
        this.finishDate = finishDate;
    }

    public ShowPlansResponseBody withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /** 项目id
     * 
     * @return projectId */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ShowPlansResponseBody withCurrentStage(String currentStage) {
        this.currentStage = currentStage;
        return this;
    }

    /** 当前测试计划所处的阶段
     * 
     * @return currentStage */
    public String getCurrentStage() {
        return currentStage;
    }

    public void setCurrentStage(String currentStage) {
        this.currentStage = currentStage;
    }

    public ShowPlansResponseBody withExpireDay(String expireDay) {
        this.expireDay = expireDay;
        return this;
    }

    /** 获取超期时间,正值表示已超期
     * 
     * @return expireDay */
    public String getExpireDay() {
        return expireDay;
    }

    public void setExpireDay(String expireDay) {
        this.expireDay = expireDay;
    }

    public ShowPlansResponseBody withOwner(ShowPlansResponseOwner owner) {
        this.owner = owner;
        return this;
    }

    public ShowPlansResponseBody withOwner(Consumer<ShowPlansResponseOwner> ownerSetter) {
        if (this.owner == null) {
            this.owner = new ShowPlansResponseOwner();
            ownerSetter.accept(this.owner);
        }

        return this;
    }

    /** Get owner
     * 
     * @return owner */
    public ShowPlansResponseOwner getOwner() {
        return owner;
    }

    public void setOwner(ShowPlansResponseOwner owner) {
        this.owner = owner;
    }

    public ShowPlansResponseBody withDesignStage(ShowPlansResponseDesignStage designStage) {
        this.designStage = designStage;
        return this;
    }

    public ShowPlansResponseBody withDesignStage(Consumer<ShowPlansResponseDesignStage> designStageSetter) {
        if (this.designStage == null) {
            this.designStage = new ShowPlansResponseDesignStage();
            designStageSetter.accept(this.designStage);
        }

        return this;
    }

    /** Get designStage
     * 
     * @return designStage */
    public ShowPlansResponseDesignStage getDesignStage() {
        return designStage;
    }

    public void setDesignStage(ShowPlansResponseDesignStage designStage) {
        this.designStage = designStage;
    }

    public ShowPlansResponseBody withExecuteStage(ShowPlansResponseExecuteStage executeStage) {
        this.executeStage = executeStage;
        return this;
    }

    public ShowPlansResponseBody withExecuteStage(Consumer<ShowPlansResponseExecuteStage> executeStageSetter) {
        if (this.executeStage == null) {
            this.executeStage = new ShowPlansResponseExecuteStage();
            executeStageSetter.accept(this.executeStage);
        }

        return this;
    }

    /** Get executeStage
     * 
     * @return executeStage */
    public ShowPlansResponseExecuteStage getExecuteStage() {
        return executeStage;
    }

    public void setExecuteStage(ShowPlansResponseExecuteStage executeStage) {
        this.executeStage = executeStage;
    }

    public ShowPlansResponseBody withReportStage(ShowPlansResponseReportStage reportStage) {
        this.reportStage = reportStage;
        return this;
    }

    public ShowPlansResponseBody withReportStage(Consumer<ShowPlansResponseReportStage> reportStageSetter) {
        if (this.reportStage == null) {
            this.reportStage = new ShowPlansResponseReportStage();
            reportStageSetter.accept(this.reportStage);
        }

        return this;
    }

    /** Get reportStage
     * 
     * @return reportStage */
    public ShowPlansResponseReportStage getReportStage() {
        return reportStage;
    }

    public void setReportStage(ShowPlansResponseReportStage reportStage) {
        this.reportStage = reportStage;
    }

    public ShowPlansResponseBody withIteration(NameAndId iteration) {
        this.iteration = iteration;
        return this;
    }

    public ShowPlansResponseBody withIteration(Consumer<NameAndId> iterationSetter) {
        if (this.iteration == null) {
            this.iteration = new NameAndId();
            iterationSetter.accept(this.iteration);
        }

        return this;
    }

    /** Get iteration
     * 
     * @return iteration */
    public NameAndId getIteration() {
        return iteration;
    }

    public void setIteration(NameAndId iteration) {
        this.iteration = iteration;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowPlansResponseBody showPlansResponseBody = (ShowPlansResponseBody) o;
        return Objects.equals(this.planId, showPlansResponseBody.planId)
            && Objects.equals(this.name, showPlansResponseBody.name)
            && Objects.equals(this.startDate, showPlansResponseBody.startDate)
            && Objects.equals(this.endDate, showPlansResponseBody.endDate)
            && Objects.equals(this.finishDate, showPlansResponseBody.finishDate)
            && Objects.equals(this.projectId, showPlansResponseBody.projectId)
            && Objects.equals(this.currentStage, showPlansResponseBody.currentStage)
            && Objects.equals(this.expireDay, showPlansResponseBody.expireDay)
            && Objects.equals(this.owner, showPlansResponseBody.owner)
            && Objects.equals(this.designStage, showPlansResponseBody.designStage)
            && Objects.equals(this.executeStage, showPlansResponseBody.executeStage)
            && Objects.equals(this.reportStage, showPlansResponseBody.reportStage)
            && Objects.equals(this.iteration, showPlansResponseBody.iteration);
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
            owner,
            designStage,
            executeStage,
            reportStage,
            iteration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPlansResponseBody {\n");
        sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
        sb.append("    finishDate: ").append(toIndentedString(finishDate)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    currentStage: ").append(toIndentedString(currentStage)).append("\n");
        sb.append("    expireDay: ").append(toIndentedString(expireDay)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    designStage: ").append(toIndentedString(designStage)).append("\n");
        sb.append("    executeStage: ").append(toIndentedString(executeStage)).append("\n");
        sb.append("    reportStage: ").append(toIndentedString(reportStage)).append("\n");
        sb.append("    iteration: ").append(toIndentedString(iteration)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
