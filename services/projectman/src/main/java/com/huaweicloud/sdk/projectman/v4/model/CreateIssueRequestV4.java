package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 工作项属性 */
public class CreateIssueRequestV4 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actual_work_hours")

    private Double actualWorkHours;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assigned_id")

    private Integer assignedId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private String beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "developer_id")

    private Integer developerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private Integer domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "done_ratio")

    private Integer doneRatio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expected_work_hours")

    private Double expectedWorkHours;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iteration_id")

    private Integer iterationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "module_id")

    private Integer moduleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_issue_id")

    private Integer parentIssueId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority_id")

    private Integer priorityId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity_id")

    private Integer severityId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_id")

    private Integer statusId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tracker_id")

    private Integer trackerId;

    public CreateIssueRequestV4 withActualWorkHours(Double actualWorkHours) {
        this.actualWorkHours = actualWorkHours;
        return this;
    }

    /** 实际工时
     * 
     * @return actualWorkHours */
    public Double getActualWorkHours() {
        return actualWorkHours;
    }

    public void setActualWorkHours(Double actualWorkHours) {
        this.actualWorkHours = actualWorkHours;
    }

    public CreateIssueRequestV4 withAssignedId(Integer assignedId) {
        this.assignedId = assignedId;
        return this;
    }

    /** 处理人id,对应用户信息的数字id
     * 
     * @return assignedId */
    public Integer getAssignedId() {
        return assignedId;
    }

    public void setAssignedId(Integer assignedId) {
        this.assignedId = assignedId;
    }

    public CreateIssueRequestV4 withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /** 开始时间，年-月-日
     * 
     * @return beginTime */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public CreateIssueRequestV4 withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 描述信息
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateIssueRequestV4 withDeveloperId(Integer developerId) {
        this.developerId = developerId;
        return this;
    }

    /** 开发者id,对应用户信息的数字id
     * 
     * @return developerId */
    public Integer getDeveloperId() {
        return developerId;
    }

    public void setDeveloperId(Integer developerId) {
        this.developerId = developerId;
    }

    public CreateIssueRequestV4 withDomainId(Integer domainId) {
        this.domainId = domainId;
        return this;
    }

    /** id 领域, 14 '性能', 15 '功能', 16 '可靠性' 17 '网络安全' 18 '可维护性' 19 '其他DFX' 20 '可用性'
     * 
     * @return domainId */
    public Integer getDomainId() {
        return domainId;
    }

    public void setDomainId(Integer domainId) {
        this.domainId = domainId;
    }

    public CreateIssueRequestV4 withDoneRatio(Integer doneRatio) {
        this.doneRatio = doneRatio;
        return this;
    }

    /** 工作项进度值
     * 
     * @return doneRatio */
    public Integer getDoneRatio() {
        return doneRatio;
    }

    public void setDoneRatio(Integer doneRatio) {
        this.doneRatio = doneRatio;
    }

    public CreateIssueRequestV4 withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /** 结束时间，年-月-日
     * 
     * @return endTime */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public CreateIssueRequestV4 withExpectedWorkHours(Double expectedWorkHours) {
        this.expectedWorkHours = expectedWorkHours;
        return this;
    }

    /** 预计工时
     * 
     * @return expectedWorkHours */
    public Double getExpectedWorkHours() {
        return expectedWorkHours;
    }

    public void setExpectedWorkHours(Double expectedWorkHours) {
        this.expectedWorkHours = expectedWorkHours;
    }

    public CreateIssueRequestV4 withIterationId(Integer iterationId) {
        this.iterationId = iterationId;
        return this;
    }

    /** 迭代id
     * 
     * @return iterationId */
    public Integer getIterationId() {
        return iterationId;
    }

    public void setIterationId(Integer iterationId) {
        this.iterationId = iterationId;
    }

    public CreateIssueRequestV4 withModuleId(Integer moduleId) {
        this.moduleId = moduleId;
        return this;
    }

    /** 模块id
     * 
     * @return moduleId */
    public Integer getModuleId() {
        return moduleId;
    }

    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    public CreateIssueRequestV4 withName(String name) {
        this.name = name;
        return this;
    }

    /** 标题
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateIssueRequestV4 withParentIssueId(Integer parentIssueId) {
        this.parentIssueId = parentIssueId;
        return this;
    }

    /** 父工作项的id,创建子工作项时必填，父工作项的类型tracker_id不能为2,3
     * 
     * @return parentIssueId */
    public Integer getParentIssueId() {
        return parentIssueId;
    }

    public void setParentIssueId(Integer parentIssueId) {
        this.parentIssueId = parentIssueId;
    }

    public CreateIssueRequestV4 withPriorityId(Integer priorityId) {
        this.priorityId = priorityId;
        return this;
    }

    /** 优先级, 1 低, 2 中, 3 高,
     * 
     * @return priorityId */
    public Integer getPriorityId() {
        return priorityId;
    }

    public void setPriorityId(Integer priorityId) {
        this.priorityId = priorityId;
    }

    public CreateIssueRequestV4 withSeverityId(Integer severityId) {
        this.severityId = severityId;
        return this;
    }

    /** 重要程度, 10 关键, 11 重要, 12 一般, 13 提示,
     * 
     * @return severityId */
    public Integer getSeverityId() {
        return severityId;
    }

    public void setSeverityId(Integer severityId) {
        this.severityId = severityId;
    }

    public CreateIssueRequestV4 withStatusId(Integer statusId) {
        this.statusId = statusId;
        return this;
    }

    /** 状态 id, 开始 1, 进行中 2, 已解决 3, 测试中 4, 已关闭 5, 已解决 6,
     * 
     * @return statusId */
    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public CreateIssueRequestV4 withTrackerId(Integer trackerId) {
        this.trackerId = trackerId;
        return this;
    }

    /** 工作项类型, 2任务/task,3缺陷/bug,5epic,6feature,7story; 5 只能为 6 的父工作项类型; 6 只能为 7 的父工作项类型; 7 只能为 2,3的父;
     * 
     * @return trackerId */
    public Integer getTrackerId() {
        return trackerId;
    }

    public void setTrackerId(Integer trackerId) {
        this.trackerId = trackerId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateIssueRequestV4 createIssueRequestV4 = (CreateIssueRequestV4) o;
        return Objects.equals(this.actualWorkHours, createIssueRequestV4.actualWorkHours)
            && Objects.equals(this.assignedId, createIssueRequestV4.assignedId)
            && Objects.equals(this.beginTime, createIssueRequestV4.beginTime)
            && Objects.equals(this.description, createIssueRequestV4.description)
            && Objects.equals(this.developerId, createIssueRequestV4.developerId)
            && Objects.equals(this.domainId, createIssueRequestV4.domainId)
            && Objects.equals(this.doneRatio, createIssueRequestV4.doneRatio)
            && Objects.equals(this.endTime, createIssueRequestV4.endTime)
            && Objects.equals(this.expectedWorkHours, createIssueRequestV4.expectedWorkHours)
            && Objects.equals(this.iterationId, createIssueRequestV4.iterationId)
            && Objects.equals(this.moduleId, createIssueRequestV4.moduleId)
            && Objects.equals(this.name, createIssueRequestV4.name)
            && Objects.equals(this.parentIssueId, createIssueRequestV4.parentIssueId)
            && Objects.equals(this.priorityId, createIssueRequestV4.priorityId)
            && Objects.equals(this.severityId, createIssueRequestV4.severityId)
            && Objects.equals(this.statusId, createIssueRequestV4.statusId)
            && Objects.equals(this.trackerId, createIssueRequestV4.trackerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actualWorkHours,
            assignedId,
            beginTime,
            description,
            developerId,
            domainId,
            doneRatio,
            endTime,
            expectedWorkHours,
            iterationId,
            moduleId,
            name,
            parentIssueId,
            priorityId,
            severityId,
            statusId,
            trackerId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateIssueRequestV4 {\n");
        sb.append("    actualWorkHours: ").append(toIndentedString(actualWorkHours)).append("\n");
        sb.append("    assignedId: ").append(toIndentedString(assignedId)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    developerId: ").append(toIndentedString(developerId)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    doneRatio: ").append(toIndentedString(doneRatio)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    expectedWorkHours: ").append(toIndentedString(expectedWorkHours)).append("\n");
        sb.append("    iterationId: ").append(toIndentedString(iterationId)).append("\n");
        sb.append("    moduleId: ").append(toIndentedString(moduleId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    parentIssueId: ").append(toIndentedString(parentIssueId)).append("\n");
        sb.append("    priorityId: ").append(toIndentedString(priorityId)).append("\n");
        sb.append("    severityId: ").append(toIndentedString(severityId)).append("\n");
        sb.append("    statusId: ").append(toIndentedString(statusId)).append("\n");
        sb.append("    trackerId: ").append(toIndentedString(trackerId)).append("\n");
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
