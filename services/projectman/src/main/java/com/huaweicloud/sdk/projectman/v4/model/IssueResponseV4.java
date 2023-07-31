package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 工作项属性
 */
public class IssueResponseV4 {

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
    @JsonProperty(value = "created_time")

    private String createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private IssueUser creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_fields")

    private List<CustomField> customFields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_custom_fields")

    private List<NewCustomField> newCustomFields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "developer")

    private IssueUser developer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private IssueItemSfV4Domain domain;

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
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_issue")

    private CreateIssueResponseV4ParentIssue parentIssue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private IssueItemSfV4Priority priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order")

    private IssueResponseV4Order order;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private IssueItemSfV4Severity severity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private IssueItemSfV4Status status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "release_dev")

    private String releaseDev;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "find_release_dev")

    private String findReleaseDev;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env")

    private IssueResponseV4Env env;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tracker")

    private CreateIssueResponseV4Tracker tracker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_time")

    private String updatedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "closed_time")

    private String closedTime;

    public IssueResponseV4 withActualWorkHours(Double actualWorkHours) {
        this.actualWorkHours = actualWorkHours;
        return this;
    }

    /**
     * 实际工时
     * @return actualWorkHours
     */
    public Double getActualWorkHours() {
        return actualWorkHours;
    }

    public void setActualWorkHours(Double actualWorkHours) {
        this.actualWorkHours = actualWorkHours;
    }

    public IssueResponseV4 withAssignedCcUser(List<IssueUser> assignedCcUser) {
        this.assignedCcUser = assignedCcUser;
        return this;
    }

    public IssueResponseV4 addAssignedCcUserItem(IssueUser assignedCcUserItem) {
        if (this.assignedCcUser == null) {
            this.assignedCcUser = new ArrayList<>();
        }
        this.assignedCcUser.add(assignedCcUserItem);
        return this;
    }

    public IssueResponseV4 withAssignedCcUser(Consumer<List<IssueUser>> assignedCcUserSetter) {
        if (this.assignedCcUser == null) {
            this.assignedCcUser = new ArrayList<>();
        }
        assignedCcUserSetter.accept(this.assignedCcUser);
        return this;
    }

    /**
     * 抄送人
     * @return assignedCcUser
     */
    public List<IssueUser> getAssignedCcUser() {
        return assignedCcUser;
    }

    public void setAssignedCcUser(List<IssueUser> assignedCcUser) {
        this.assignedCcUser = assignedCcUser;
    }

    public IssueResponseV4 withAssignedUser(IssueUser assignedUser) {
        this.assignedUser = assignedUser;
        return this;
    }

    public IssueResponseV4 withAssignedUser(Consumer<IssueUser> assignedUserSetter) {
        if (this.assignedUser == null) {
            this.assignedUser = new IssueUser();
            assignedUserSetter.accept(this.assignedUser);
        }

        return this;
    }

    /**
     * Get assignedUser
     * @return assignedUser
     */
    public IssueUser getAssignedUser() {
        return assignedUser;
    }

    public void setAssignedUser(IssueUser assignedUser) {
        this.assignedUser = assignedUser;
    }

    public IssueResponseV4 withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * 预计开始时间，年-月-日
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public IssueResponseV4 withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * 创建时间 年-月-日 时:分:秒
     * @return createdTime
     */
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public IssueResponseV4 withCreator(IssueUser creator) {
        this.creator = creator;
        return this;
    }

    public IssueResponseV4 withCreator(Consumer<IssueUser> creatorSetter) {
        if (this.creator == null) {
            this.creator = new IssueUser();
            creatorSetter.accept(this.creator);
        }

        return this;
    }

    /**
     * Get creator
     * @return creator
     */
    public IssueUser getCreator() {
        return creator;
    }

    public void setCreator(IssueUser creator) {
        this.creator = creator;
    }

    public IssueResponseV4 withCustomFields(List<CustomField> customFields) {
        this.customFields = customFields;
        return this;
    }

    public IssueResponseV4 addCustomFieldsItem(CustomField customFieldsItem) {
        if (this.customFields == null) {
            this.customFields = new ArrayList<>();
        }
        this.customFields.add(customFieldsItem);
        return this;
    }

    public IssueResponseV4 withCustomFields(Consumer<List<CustomField>> customFieldsSetter) {
        if (this.customFields == null) {
            this.customFields = new ArrayList<>();
        }
        customFieldsSetter.accept(this.customFields);
        return this;
    }

    /**
     * 自定义属性值,不建议使用，建议参考new_custom_fields字段
     * @return customFields
     */
    public List<CustomField> getCustomFields() {
        return customFields;
    }

    public void setCustomFields(List<CustomField> customFields) {
        this.customFields = customFields;
    }

    public IssueResponseV4 withNewCustomFields(List<NewCustomField> newCustomFields) {
        this.newCustomFields = newCustomFields;
        return this;
    }

    public IssueResponseV4 addNewCustomFieldsItem(NewCustomField newCustomFieldsItem) {
        if (this.newCustomFields == null) {
            this.newCustomFields = new ArrayList<>();
        }
        this.newCustomFields.add(newCustomFieldsItem);
        return this;
    }

    public IssueResponseV4 withNewCustomFields(Consumer<List<NewCustomField>> newCustomFieldsSetter) {
        if (this.newCustomFields == null) {
            this.newCustomFields = new ArrayList<>();
        }
        newCustomFieldsSetter.accept(this.newCustomFields);
        return this;
    }

    /**
     * 自定义属性值
     * @return newCustomFields
     */
    public List<NewCustomField> getNewCustomFields() {
        return newCustomFields;
    }

    public void setNewCustomFields(List<NewCustomField> newCustomFields) {
        this.newCustomFields = newCustomFields;
    }

    public IssueResponseV4 withDeveloper(IssueUser developer) {
        this.developer = developer;
        return this;
    }

    public IssueResponseV4 withDeveloper(Consumer<IssueUser> developerSetter) {
        if (this.developer == null) {
            this.developer = new IssueUser();
            developerSetter.accept(this.developer);
        }

        return this;
    }

    /**
     * Get developer
     * @return developer
     */
    public IssueUser getDeveloper() {
        return developer;
    }

    public void setDeveloper(IssueUser developer) {
        this.developer = developer;
    }

    public IssueResponseV4 withDomain(IssueItemSfV4Domain domain) {
        this.domain = domain;
        return this;
    }

    public IssueResponseV4 withDomain(Consumer<IssueItemSfV4Domain> domainSetter) {
        if (this.domain == null) {
            this.domain = new IssueItemSfV4Domain();
            domainSetter.accept(this.domain);
        }

        return this;
    }

    /**
     * Get domain
     * @return domain
     */
    public IssueItemSfV4Domain getDomain() {
        return domain;
    }

    public void setDomain(IssueItemSfV4Domain domain) {
        this.domain = domain;
    }

    public IssueResponseV4 withDoneRatio(Integer doneRatio) {
        this.doneRatio = doneRatio;
        return this;
    }

    /**
     * 工作项进度值
     * @return doneRatio
     */
    public Integer getDoneRatio() {
        return doneRatio;
    }

    public void setDoneRatio(Integer doneRatio) {
        this.doneRatio = doneRatio;
    }

    public IssueResponseV4 withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 预计结束时间，年-月-日
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public IssueResponseV4 withExpectedWorkHours(Double expectedWorkHours) {
        this.expectedWorkHours = expectedWorkHours;
        return this;
    }

    /**
     * 预计工时
     * @return expectedWorkHours
     */
    public Double getExpectedWorkHours() {
        return expectedWorkHours;
    }

    public void setExpectedWorkHours(Double expectedWorkHours) {
        this.expectedWorkHours = expectedWorkHours;
    }

    public IssueResponseV4 withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 工作项项id
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public IssueResponseV4 withProject(IssueProjectResponseV4 project) {
        this.project = project;
        return this;
    }

    public IssueResponseV4 withProject(Consumer<IssueProjectResponseV4> projectSetter) {
        if (this.project == null) {
            this.project = new IssueProjectResponseV4();
            projectSetter.accept(this.project);
        }

        return this;
    }

    /**
     * Get project
     * @return project
     */
    public IssueProjectResponseV4 getProject() {
        return project;
    }

    public void setProject(IssueProjectResponseV4 project) {
        this.project = project;
    }

    public IssueResponseV4 withIteration(IssueItemSfV4Iteration iteration) {
        this.iteration = iteration;
        return this;
    }

    public IssueResponseV4 withIteration(Consumer<IssueItemSfV4Iteration> iterationSetter) {
        if (this.iteration == null) {
            this.iteration = new IssueItemSfV4Iteration();
            iterationSetter.accept(this.iteration);
        }

        return this;
    }

    /**
     * Get iteration
     * @return iteration
     */
    public IssueItemSfV4Iteration getIteration() {
        return iteration;
    }

    public void setIteration(IssueItemSfV4Iteration iteration) {
        this.iteration = iteration;
    }

    public IssueResponseV4 withModule(IssueItemSfV4Module module) {
        this.module = module;
        return this;
    }

    public IssueResponseV4 withModule(Consumer<IssueItemSfV4Module> moduleSetter) {
        if (this.module == null) {
            this.module = new IssueItemSfV4Module();
            moduleSetter.accept(this.module);
        }

        return this;
    }

    /**
     * Get module
     * @return module
     */
    public IssueItemSfV4Module getModule() {
        return module;
    }

    public void setModule(IssueItemSfV4Module module) {
        this.module = module;
    }

    public IssueResponseV4 withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 标题
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IssueResponseV4 withParentIssue(CreateIssueResponseV4ParentIssue parentIssue) {
        this.parentIssue = parentIssue;
        return this;
    }

    public IssueResponseV4 withParentIssue(Consumer<CreateIssueResponseV4ParentIssue> parentIssueSetter) {
        if (this.parentIssue == null) {
            this.parentIssue = new CreateIssueResponseV4ParentIssue();
            parentIssueSetter.accept(this.parentIssue);
        }

        return this;
    }

    /**
     * Get parentIssue
     * @return parentIssue
     */
    public CreateIssueResponseV4ParentIssue getParentIssue() {
        return parentIssue;
    }

    public void setParentIssue(CreateIssueResponseV4ParentIssue parentIssue) {
        this.parentIssue = parentIssue;
    }

    public IssueResponseV4 withPriority(IssueItemSfV4Priority priority) {
        this.priority = priority;
        return this;
    }

    public IssueResponseV4 withPriority(Consumer<IssueItemSfV4Priority> prioritySetter) {
        if (this.priority == null) {
            this.priority = new IssueItemSfV4Priority();
            prioritySetter.accept(this.priority);
        }

        return this;
    }

    /**
     * Get priority
     * @return priority
     */
    public IssueItemSfV4Priority getPriority() {
        return priority;
    }

    public void setPriority(IssueItemSfV4Priority priority) {
        this.priority = priority;
    }

    public IssueResponseV4 withOrder(IssueResponseV4Order order) {
        this.order = order;
        return this;
    }

    public IssueResponseV4 withOrder(Consumer<IssueResponseV4Order> orderSetter) {
        if (this.order == null) {
            this.order = new IssueResponseV4Order();
            orderSetter.accept(this.order);
        }

        return this;
    }

    /**
     * Get order
     * @return order
     */
    public IssueResponseV4Order getOrder() {
        return order;
    }

    public void setOrder(IssueResponseV4Order order) {
        this.order = order;
    }

    public IssueResponseV4 withSeverity(IssueItemSfV4Severity severity) {
        this.severity = severity;
        return this;
    }

    public IssueResponseV4 withSeverity(Consumer<IssueItemSfV4Severity> severitySetter) {
        if (this.severity == null) {
            this.severity = new IssueItemSfV4Severity();
            severitySetter.accept(this.severity);
        }

        return this;
    }

    /**
     * Get severity
     * @return severity
     */
    public IssueItemSfV4Severity getSeverity() {
        return severity;
    }

    public void setSeverity(IssueItemSfV4Severity severity) {
        this.severity = severity;
    }

    public IssueResponseV4 withStatus(IssueItemSfV4Status status) {
        this.status = status;
        return this;
    }

    public IssueResponseV4 withStatus(Consumer<IssueItemSfV4Status> statusSetter) {
        if (this.status == null) {
            this.status = new IssueItemSfV4Status();
            statusSetter.accept(this.status);
        }

        return this;
    }

    /**
     * Get status
     * @return status
     */
    public IssueItemSfV4Status getStatus() {
        return status;
    }

    public void setStatus(IssueItemSfV4Status status) {
        this.status = status;
    }

    public IssueResponseV4 withReleaseDev(String releaseDev) {
        this.releaseDev = releaseDev;
        return this;
    }

    /**
     * 工作项发布版本号
     * @return releaseDev
     */
    public String getReleaseDev() {
        return releaseDev;
    }

    public void setReleaseDev(String releaseDev) {
        this.releaseDev = releaseDev;
    }

    public IssueResponseV4 withFindReleaseDev(String findReleaseDev) {
        this.findReleaseDev = findReleaseDev;
        return this;
    }

    /**
     * 缺陷发现版本号（仅Bug类型工作项具备该字段）
     * @return findReleaseDev
     */
    public String getFindReleaseDev() {
        return findReleaseDev;
    }

    public void setFindReleaseDev(String findReleaseDev) {
        this.findReleaseDev = findReleaseDev;
    }

    public IssueResponseV4 withEnv(IssueResponseV4Env env) {
        this.env = env;
        return this;
    }

    public IssueResponseV4 withEnv(Consumer<IssueResponseV4Env> envSetter) {
        if (this.env == null) {
            this.env = new IssueResponseV4Env();
            envSetter.accept(this.env);
        }

        return this;
    }

    /**
     * Get env
     * @return env
     */
    public IssueResponseV4Env getEnv() {
        return env;
    }

    public void setEnv(IssueResponseV4Env env) {
        this.env = env;
    }

    public IssueResponseV4 withTracker(CreateIssueResponseV4Tracker tracker) {
        this.tracker = tracker;
        return this;
    }

    public IssueResponseV4 withTracker(Consumer<CreateIssueResponseV4Tracker> trackerSetter) {
        if (this.tracker == null) {
            this.tracker = new CreateIssueResponseV4Tracker();
            trackerSetter.accept(this.tracker);
        }

        return this;
    }

    /**
     * Get tracker
     * @return tracker
     */
    public CreateIssueResponseV4Tracker getTracker() {
        return tracker;
    }

    public void setTracker(CreateIssueResponseV4Tracker tracker) {
        this.tracker = tracker;
    }

    public IssueResponseV4 withUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    /**
     * 更新时间 年-月-日 时:分:秒
     * @return updatedTime
     */
    public String getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }

    public IssueResponseV4 withClosedTime(String closedTime) {
        this.closedTime = closedTime;
        return this;
    }

    /**
     * 关闭时间 年-月-日 时:分:秒
     * @return closedTime
     */
    public String getClosedTime() {
        return closedTime;
    }

    public void setClosedTime(String closedTime) {
        this.closedTime = closedTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IssueResponseV4 that = (IssueResponseV4) obj;
        return Objects.equals(this.actualWorkHours, that.actualWorkHours)
            && Objects.equals(this.assignedCcUser, that.assignedCcUser)
            && Objects.equals(this.assignedUser, that.assignedUser) && Objects.equals(this.beginTime, that.beginTime)
            && Objects.equals(this.createdTime, that.createdTime) && Objects.equals(this.creator, that.creator)
            && Objects.equals(this.customFields, that.customFields)
            && Objects.equals(this.newCustomFields, that.newCustomFields)
            && Objects.equals(this.developer, that.developer) && Objects.equals(this.domain, that.domain)
            && Objects.equals(this.doneRatio, that.doneRatio) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.expectedWorkHours, that.expectedWorkHours) && Objects.equals(this.id, that.id)
            && Objects.equals(this.project, that.project) && Objects.equals(this.iteration, that.iteration)
            && Objects.equals(this.module, that.module) && Objects.equals(this.name, that.name)
            && Objects.equals(this.parentIssue, that.parentIssue) && Objects.equals(this.priority, that.priority)
            && Objects.equals(this.order, that.order) && Objects.equals(this.severity, that.severity)
            && Objects.equals(this.status, that.status) && Objects.equals(this.releaseDev, that.releaseDev)
            && Objects.equals(this.findReleaseDev, that.findReleaseDev) && Objects.equals(this.env, that.env)
            && Objects.equals(this.tracker, that.tracker) && Objects.equals(this.updatedTime, that.updatedTime)
            && Objects.equals(this.closedTime, that.closedTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actualWorkHours,
            assignedCcUser,
            assignedUser,
            beginTime,
            createdTime,
            creator,
            customFields,
            newCustomFields,
            developer,
            domain,
            doneRatio,
            endTime,
            expectedWorkHours,
            id,
            project,
            iteration,
            module,
            name,
            parentIssue,
            priority,
            order,
            severity,
            status,
            releaseDev,
            findReleaseDev,
            env,
            tracker,
            updatedTime,
            closedTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssueResponseV4 {\n");
        sb.append("    actualWorkHours: ").append(toIndentedString(actualWorkHours)).append("\n");
        sb.append("    assignedCcUser: ").append(toIndentedString(assignedCcUser)).append("\n");
        sb.append("    assignedUser: ").append(toIndentedString(assignedUser)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
        sb.append("    newCustomFields: ").append(toIndentedString(newCustomFields)).append("\n");
        sb.append("    developer: ").append(toIndentedString(developer)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    doneRatio: ").append(toIndentedString(doneRatio)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    expectedWorkHours: ").append(toIndentedString(expectedWorkHours)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    project: ").append(toIndentedString(project)).append("\n");
        sb.append("    iteration: ").append(toIndentedString(iteration)).append("\n");
        sb.append("    module: ").append(toIndentedString(module)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    parentIssue: ").append(toIndentedString(parentIssue)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    releaseDev: ").append(toIndentedString(releaseDev)).append("\n");
        sb.append("    findReleaseDev: ").append(toIndentedString(findReleaseDev)).append("\n");
        sb.append("    env: ").append(toIndentedString(env)).append("\n");
        sb.append("    tracker: ").append(toIndentedString(tracker)).append("\n");
        sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
        sb.append("    closedTime: ").append(toIndentedString(closedTime)).append("\n");
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
