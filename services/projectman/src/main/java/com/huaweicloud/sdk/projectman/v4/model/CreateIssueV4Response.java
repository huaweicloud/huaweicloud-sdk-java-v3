package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class CreateIssueV4Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actual_work_hours")

    private Double actualWorkHours;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assigned_cc_user")

    private List<IssueUser> assignedCcUser = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assigned_user")

    private IssueUser assignedUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private String beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private IssueUser creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_fields")

    private List<CustomField> customFields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "developer")

    private IssueUser developer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private CreateIssueResponseV4Domain domain;

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
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project")

    private IssueProjectResponseV4 project;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iteration")

    private IssueItemSfV4Iteration iteration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "module")

    private IssueItemSfV4Module module;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_issue")

    private CreateIssueResponseV4ParentIssue parentIssue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private IssueItemSfV4Priority priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private IssueItemSfV4Severity severity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private IssueItemSfV4Status status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tracker")

    private IssueItemSfV4Tracker tracker;

    public CreateIssueV4Response withActualWorkHours(Double actualWorkHours) {
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

    public CreateIssueV4Response withAssignedCcUser(List<IssueUser> assignedCcUser) {
        this.assignedCcUser = assignedCcUser;
        return this;
    }

    public CreateIssueV4Response addAssignedCcUserItem(IssueUser assignedCcUserItem) {
        if (this.assignedCcUser == null) {
            this.assignedCcUser = new ArrayList<>();
        }
        this.assignedCcUser.add(assignedCcUserItem);
        return this;
    }

    public CreateIssueV4Response withAssignedCcUser(Consumer<List<IssueUser>> assignedCcUserSetter) {
        if (this.assignedCcUser == null) {
            this.assignedCcUser = new ArrayList<>();
        }
        assignedCcUserSetter.accept(this.assignedCcUser);
        return this;
    }

    /** 抄送人
     * 
     * @return assignedCcUser */
    public List<IssueUser> getAssignedCcUser() {
        return assignedCcUser;
    }

    public void setAssignedCcUser(List<IssueUser> assignedCcUser) {
        this.assignedCcUser = assignedCcUser;
    }

    public CreateIssueV4Response withAssignedUser(IssueUser assignedUser) {
        this.assignedUser = assignedUser;
        return this;
    }

    public CreateIssueV4Response withAssignedUser(Consumer<IssueUser> assignedUserSetter) {
        if (this.assignedUser == null) {
            this.assignedUser = new IssueUser();
            assignedUserSetter.accept(this.assignedUser);
        }

        return this;
    }

    /** Get assignedUser
     * 
     * @return assignedUser */
    public IssueUser getAssignedUser() {
        return assignedUser;
    }

    public void setAssignedUser(IssueUser assignedUser) {
        this.assignedUser = assignedUser;
    }

    public CreateIssueV4Response withBeginTime(String beginTime) {
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

    public CreateIssueV4Response withCreator(IssueUser creator) {
        this.creator = creator;
        return this;
    }

    public CreateIssueV4Response withCreator(Consumer<IssueUser> creatorSetter) {
        if (this.creator == null) {
            this.creator = new IssueUser();
            creatorSetter.accept(this.creator);
        }

        return this;
    }

    /** Get creator
     * 
     * @return creator */
    public IssueUser getCreator() {
        return creator;
    }

    public void setCreator(IssueUser creator) {
        this.creator = creator;
    }

    public CreateIssueV4Response withCustomFields(List<CustomField> customFields) {
        this.customFields = customFields;
        return this;
    }

    public CreateIssueV4Response addCustomFieldsItem(CustomField customFieldsItem) {
        if (this.customFields == null) {
            this.customFields = new ArrayList<>();
        }
        this.customFields.add(customFieldsItem);
        return this;
    }

    public CreateIssueV4Response withCustomFields(Consumer<List<CustomField>> customFieldsSetter) {
        if (this.customFields == null) {
            this.customFields = new ArrayList<>();
        }
        customFieldsSetter.accept(this.customFields);
        return this;
    }

    /** 自定义属性值
     * 
     * @return customFields */
    public List<CustomField> getCustomFields() {
        return customFields;
    }

    public void setCustomFields(List<CustomField> customFields) {
        this.customFields = customFields;
    }

    public CreateIssueV4Response withDeveloper(IssueUser developer) {
        this.developer = developer;
        return this;
    }

    public CreateIssueV4Response withDeveloper(Consumer<IssueUser> developerSetter) {
        if (this.developer == null) {
            this.developer = new IssueUser();
            developerSetter.accept(this.developer);
        }

        return this;
    }

    /** Get developer
     * 
     * @return developer */
    public IssueUser getDeveloper() {
        return developer;
    }

    public void setDeveloper(IssueUser developer) {
        this.developer = developer;
    }

    public CreateIssueV4Response withDomain(CreateIssueResponseV4Domain domain) {
        this.domain = domain;
        return this;
    }

    public CreateIssueV4Response withDomain(Consumer<CreateIssueResponseV4Domain> domainSetter) {
        if (this.domain == null) {
            this.domain = new CreateIssueResponseV4Domain();
            domainSetter.accept(this.domain);
        }

        return this;
    }

    /** Get domain
     * 
     * @return domain */
    public CreateIssueResponseV4Domain getDomain() {
        return domain;
    }

    public void setDomain(CreateIssueResponseV4Domain domain) {
        this.domain = domain;
    }

    public CreateIssueV4Response withDoneRatio(Integer doneRatio) {
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

    public CreateIssueV4Response withEndTime(String endTime) {
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

    public CreateIssueV4Response withExpectedWorkHours(Double expectedWorkHours) {
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

    public CreateIssueV4Response withId(Integer id) {
        this.id = id;
        return this;
    }

    /** 工作项项id
     * 
     * @return id */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CreateIssueV4Response withProject(IssueProjectResponseV4 project) {
        this.project = project;
        return this;
    }

    public CreateIssueV4Response withProject(Consumer<IssueProjectResponseV4> projectSetter) {
        if (this.project == null) {
            this.project = new IssueProjectResponseV4();
            projectSetter.accept(this.project);
        }

        return this;
    }

    /** Get project
     * 
     * @return project */
    public IssueProjectResponseV4 getProject() {
        return project;
    }

    public void setProject(IssueProjectResponseV4 project) {
        this.project = project;
    }

    public CreateIssueV4Response withIteration(IssueItemSfV4Iteration iteration) {
        this.iteration = iteration;
        return this;
    }

    public CreateIssueV4Response withIteration(Consumer<IssueItemSfV4Iteration> iterationSetter) {
        if (this.iteration == null) {
            this.iteration = new IssueItemSfV4Iteration();
            iterationSetter.accept(this.iteration);
        }

        return this;
    }

    /** Get iteration
     * 
     * @return iteration */
    public IssueItemSfV4Iteration getIteration() {
        return iteration;
    }

    public void setIteration(IssueItemSfV4Iteration iteration) {
        this.iteration = iteration;
    }

    public CreateIssueV4Response withModule(IssueItemSfV4Module module) {
        this.module = module;
        return this;
    }

    public CreateIssueV4Response withModule(Consumer<IssueItemSfV4Module> moduleSetter) {
        if (this.module == null) {
            this.module = new IssueItemSfV4Module();
            moduleSetter.accept(this.module);
        }

        return this;
    }

    /** Get module
     * 
     * @return module */
    public IssueItemSfV4Module getModule() {
        return module;
    }

    public void setModule(IssueItemSfV4Module module) {
        this.module = module;
    }

    public CreateIssueV4Response withParentIssue(CreateIssueResponseV4ParentIssue parentIssue) {
        this.parentIssue = parentIssue;
        return this;
    }

    public CreateIssueV4Response withParentIssue(Consumer<CreateIssueResponseV4ParentIssue> parentIssueSetter) {
        if (this.parentIssue == null) {
            this.parentIssue = new CreateIssueResponseV4ParentIssue();
            parentIssueSetter.accept(this.parentIssue);
        }

        return this;
    }

    /** Get parentIssue
     * 
     * @return parentIssue */
    public CreateIssueResponseV4ParentIssue getParentIssue() {
        return parentIssue;
    }

    public void setParentIssue(CreateIssueResponseV4ParentIssue parentIssue) {
        this.parentIssue = parentIssue;
    }

    public CreateIssueV4Response withPriority(IssueItemSfV4Priority priority) {
        this.priority = priority;
        return this;
    }

    public CreateIssueV4Response withPriority(Consumer<IssueItemSfV4Priority> prioritySetter) {
        if (this.priority == null) {
            this.priority = new IssueItemSfV4Priority();
            prioritySetter.accept(this.priority);
        }

        return this;
    }

    /** Get priority
     * 
     * @return priority */
    public IssueItemSfV4Priority getPriority() {
        return priority;
    }

    public void setPriority(IssueItemSfV4Priority priority) {
        this.priority = priority;
    }

    public CreateIssueV4Response withSeverity(IssueItemSfV4Severity severity) {
        this.severity = severity;
        return this;
    }

    public CreateIssueV4Response withSeverity(Consumer<IssueItemSfV4Severity> severitySetter) {
        if (this.severity == null) {
            this.severity = new IssueItemSfV4Severity();
            severitySetter.accept(this.severity);
        }

        return this;
    }

    /** Get severity
     * 
     * @return severity */
    public IssueItemSfV4Severity getSeverity() {
        return severity;
    }

    public void setSeverity(IssueItemSfV4Severity severity) {
        this.severity = severity;
    }

    public CreateIssueV4Response withStatus(IssueItemSfV4Status status) {
        this.status = status;
        return this;
    }

    public CreateIssueV4Response withStatus(Consumer<IssueItemSfV4Status> statusSetter) {
        if (this.status == null) {
            this.status = new IssueItemSfV4Status();
            statusSetter.accept(this.status);
        }

        return this;
    }

    /** Get status
     * 
     * @return status */
    public IssueItemSfV4Status getStatus() {
        return status;
    }

    public void setStatus(IssueItemSfV4Status status) {
        this.status = status;
    }

    public CreateIssueV4Response withTracker(IssueItemSfV4Tracker tracker) {
        this.tracker = tracker;
        return this;
    }

    public CreateIssueV4Response withTracker(Consumer<IssueItemSfV4Tracker> trackerSetter) {
        if (this.tracker == null) {
            this.tracker = new IssueItemSfV4Tracker();
            trackerSetter.accept(this.tracker);
        }

        return this;
    }

    /** Get tracker
     * 
     * @return tracker */
    public IssueItemSfV4Tracker getTracker() {
        return tracker;
    }

    public void setTracker(IssueItemSfV4Tracker tracker) {
        this.tracker = tracker;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateIssueV4Response createIssueV4Response = (CreateIssueV4Response) o;
        return Objects.equals(this.actualWorkHours, createIssueV4Response.actualWorkHours)
            && Objects.equals(this.assignedCcUser, createIssueV4Response.assignedCcUser)
            && Objects.equals(this.assignedUser, createIssueV4Response.assignedUser)
            && Objects.equals(this.beginTime, createIssueV4Response.beginTime)
            && Objects.equals(this.creator, createIssueV4Response.creator)
            && Objects.equals(this.customFields, createIssueV4Response.customFields)
            && Objects.equals(this.developer, createIssueV4Response.developer)
            && Objects.equals(this.domain, createIssueV4Response.domain)
            && Objects.equals(this.doneRatio, createIssueV4Response.doneRatio)
            && Objects.equals(this.endTime, createIssueV4Response.endTime)
            && Objects.equals(this.expectedWorkHours, createIssueV4Response.expectedWorkHours)
            && Objects.equals(this.id, createIssueV4Response.id)
            && Objects.equals(this.project, createIssueV4Response.project)
            && Objects.equals(this.iteration, createIssueV4Response.iteration)
            && Objects.equals(this.module, createIssueV4Response.module)
            && Objects.equals(this.parentIssue, createIssueV4Response.parentIssue)
            && Objects.equals(this.priority, createIssueV4Response.priority)
            && Objects.equals(this.severity, createIssueV4Response.severity)
            && Objects.equals(this.status, createIssueV4Response.status)
            && Objects.equals(this.tracker, createIssueV4Response.tracker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actualWorkHours,
            assignedCcUser,
            assignedUser,
            beginTime,
            creator,
            customFields,
            developer,
            domain,
            doneRatio,
            endTime,
            expectedWorkHours,
            id,
            project,
            iteration,
            module,
            parentIssue,
            priority,
            severity,
            status,
            tracker);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateIssueV4Response {\n");
        sb.append("    actualWorkHours: ").append(toIndentedString(actualWorkHours)).append("\n");
        sb.append("    assignedCcUser: ").append(toIndentedString(assignedCcUser)).append("\n");
        sb.append("    assignedUser: ").append(toIndentedString(assignedUser)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
        sb.append("    developer: ").append(toIndentedString(developer)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    doneRatio: ").append(toIndentedString(doneRatio)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    expectedWorkHours: ").append(toIndentedString(expectedWorkHours)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    project: ").append(toIndentedString(project)).append("\n");
        sb.append("    iteration: ").append(toIndentedString(iteration)).append("\n");
        sb.append("    module: ").append(toIndentedString(module)).append("\n");
        sb.append("    parentIssue: ").append(toIndentedString(parentIssue)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    tracker: ").append(toIndentedString(tracker)).append("\n");
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
