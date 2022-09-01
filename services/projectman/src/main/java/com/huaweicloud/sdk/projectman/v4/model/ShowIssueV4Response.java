package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowIssueV4Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actual_work_hours")

    @JacksonXmlProperty(localName = "actual_work_hours")

    private Double actualWorkHours;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assigned_cc_user")

    @JacksonXmlProperty(localName = "assigned_cc_user")

    private List<IssueUser> assignedCcUser = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assigned_user")

    @JacksonXmlProperty(localName = "assigned_user")

    private IssueUser assignedUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    @JacksonXmlProperty(localName = "begin_time")

    private String beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    @JacksonXmlProperty(localName = "created_time")

    private String createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    @JacksonXmlProperty(localName = "creator")

    private IssueUser creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_fields")

    @JacksonXmlProperty(localName = "custom_fields")

    private List<CustomField> customFields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_custom_fields")

    @JacksonXmlProperty(localName = "new_custom_fields")

    private List<IssueDetailCustomField> newCustomFields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "developer")

    @JacksonXmlProperty(localName = "developer")

    private IssueUser developer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    @JacksonXmlProperty(localName = "domain")

    private IssueItemSfV4Domain domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "done_ratio")

    @JacksonXmlProperty(localName = "done_ratio")

    private Integer doneRatio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    @JacksonXmlProperty(localName = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expected_work_hours")

    @JacksonXmlProperty(localName = "expected_work_hours")

    private Double expectedWorkHours;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project")

    @JacksonXmlProperty(localName = "project")

    private IssueProjectResponseV4 project;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iteration")

    @JacksonXmlProperty(localName = "iteration")

    private IssueItemSfV4Iteration iteration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "module")

    @JacksonXmlProperty(localName = "module")

    private IssueItemSfV4Module module;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_issue")

    @JacksonXmlProperty(localName = "parent_issue")

    private CreateIssueResponseV4ParentIssue parentIssue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    @JacksonXmlProperty(localName = "priority")

    private IssueItemSfV4Priority priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    @JacksonXmlProperty(localName = "severity")

    private IssueItemSfV4Severity severity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    @JacksonXmlProperty(localName = "status")

    private IssueItemSfV4Status status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tracker")

    @JacksonXmlProperty(localName = "tracker")

    private CreateIssueResponseV4Tracker tracker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_time")

    @JacksonXmlProperty(localName = "updated_time")

    private String updatedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "closed_time")

    @JacksonXmlProperty(localName = "closed_time")

    private String closedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order")

    @JacksonXmlProperty(localName = "order")

    private IssueOrder order;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accessories")

    @JacksonXmlProperty(localName = "accessories")

    private List<IssueAccessory> accessories = null;

    public ShowIssueV4Response withActualWorkHours(Double actualWorkHours) {
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

    public ShowIssueV4Response withAssignedCcUser(List<IssueUser> assignedCcUser) {
        this.assignedCcUser = assignedCcUser;
        return this;
    }

    public ShowIssueV4Response addAssignedCcUserItem(IssueUser assignedCcUserItem) {
        if (this.assignedCcUser == null) {
            this.assignedCcUser = new ArrayList<>();
        }
        this.assignedCcUser.add(assignedCcUserItem);
        return this;
    }

    public ShowIssueV4Response withAssignedCcUser(Consumer<List<IssueUser>> assignedCcUserSetter) {
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

    public ShowIssueV4Response withAssignedUser(IssueUser assignedUser) {
        this.assignedUser = assignedUser;
        return this;
    }

    public ShowIssueV4Response withAssignedUser(Consumer<IssueUser> assignedUserSetter) {
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

    public ShowIssueV4Response withBeginTime(String beginTime) {
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

    public ShowIssueV4Response withCreatedTime(String createdTime) {
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

    public ShowIssueV4Response withCreator(IssueUser creator) {
        this.creator = creator;
        return this;
    }

    public ShowIssueV4Response withCreator(Consumer<IssueUser> creatorSetter) {
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

    public ShowIssueV4Response withCustomFields(List<CustomField> customFields) {
        this.customFields = customFields;
        return this;
    }

    public ShowIssueV4Response addCustomFieldsItem(CustomField customFieldsItem) {
        if (this.customFields == null) {
            this.customFields = new ArrayList<>();
        }
        this.customFields.add(customFieldsItem);
        return this;
    }

    public ShowIssueV4Response withCustomFields(Consumer<List<CustomField>> customFieldsSetter) {
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

    public ShowIssueV4Response withNewCustomFields(List<IssueDetailCustomField> newCustomFields) {
        this.newCustomFields = newCustomFields;
        return this;
    }

    public ShowIssueV4Response addNewCustomFieldsItem(IssueDetailCustomField newCustomFieldsItem) {
        if (this.newCustomFields == null) {
            this.newCustomFields = new ArrayList<>();
        }
        this.newCustomFields.add(newCustomFieldsItem);
        return this;
    }

    public ShowIssueV4Response withNewCustomFields(Consumer<List<IssueDetailCustomField>> newCustomFieldsSetter) {
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
    public List<IssueDetailCustomField> getNewCustomFields() {
        return newCustomFields;
    }

    public void setNewCustomFields(List<IssueDetailCustomField> newCustomFields) {
        this.newCustomFields = newCustomFields;
    }

    public ShowIssueV4Response withDeveloper(IssueUser developer) {
        this.developer = developer;
        return this;
    }

    public ShowIssueV4Response withDeveloper(Consumer<IssueUser> developerSetter) {
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

    public ShowIssueV4Response withDomain(IssueItemSfV4Domain domain) {
        this.domain = domain;
        return this;
    }

    public ShowIssueV4Response withDomain(Consumer<IssueItemSfV4Domain> domainSetter) {
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

    public ShowIssueV4Response withDoneRatio(Integer doneRatio) {
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

    public ShowIssueV4Response withEndTime(String endTime) {
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

    public ShowIssueV4Response withExpectedWorkHours(Double expectedWorkHours) {
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

    public ShowIssueV4Response withId(Integer id) {
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

    public ShowIssueV4Response withProject(IssueProjectResponseV4 project) {
        this.project = project;
        return this;
    }

    public ShowIssueV4Response withProject(Consumer<IssueProjectResponseV4> projectSetter) {
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

    public ShowIssueV4Response withIteration(IssueItemSfV4Iteration iteration) {
        this.iteration = iteration;
        return this;
    }

    public ShowIssueV4Response withIteration(Consumer<IssueItemSfV4Iteration> iterationSetter) {
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

    public ShowIssueV4Response withModule(IssueItemSfV4Module module) {
        this.module = module;
        return this;
    }

    public ShowIssueV4Response withModule(Consumer<IssueItemSfV4Module> moduleSetter) {
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

    public ShowIssueV4Response withName(String name) {
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

    public ShowIssueV4Response withParentIssue(CreateIssueResponseV4ParentIssue parentIssue) {
        this.parentIssue = parentIssue;
        return this;
    }

    public ShowIssueV4Response withParentIssue(Consumer<CreateIssueResponseV4ParentIssue> parentIssueSetter) {
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

    public ShowIssueV4Response withPriority(IssueItemSfV4Priority priority) {
        this.priority = priority;
        return this;
    }

    public ShowIssueV4Response withPriority(Consumer<IssueItemSfV4Priority> prioritySetter) {
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

    public ShowIssueV4Response withSeverity(IssueItemSfV4Severity severity) {
        this.severity = severity;
        return this;
    }

    public ShowIssueV4Response withSeverity(Consumer<IssueItemSfV4Severity> severitySetter) {
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

    public ShowIssueV4Response withStatus(IssueItemSfV4Status status) {
        this.status = status;
        return this;
    }

    public ShowIssueV4Response withStatus(Consumer<IssueItemSfV4Status> statusSetter) {
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

    public ShowIssueV4Response withTracker(CreateIssueResponseV4Tracker tracker) {
        this.tracker = tracker;
        return this;
    }

    public ShowIssueV4Response withTracker(Consumer<CreateIssueResponseV4Tracker> trackerSetter) {
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

    public ShowIssueV4Response withUpdatedTime(String updatedTime) {
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

    public ShowIssueV4Response withClosedTime(String closedTime) {
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

    public ShowIssueV4Response withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 工作项描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowIssueV4Response withOrder(IssueOrder order) {
        this.order = order;
        return this;
    }

    public ShowIssueV4Response withOrder(Consumer<IssueOrder> orderSetter) {
        if (this.order == null) {
            this.order = new IssueOrder();
            orderSetter.accept(this.order);
        }

        return this;
    }

    /**
     * Get order
     * @return order
     */
    public IssueOrder getOrder() {
        return order;
    }

    public void setOrder(IssueOrder order) {
        this.order = order;
    }

    public ShowIssueV4Response withAccessories(List<IssueAccessory> accessories) {
        this.accessories = accessories;
        return this;
    }

    public ShowIssueV4Response addAccessoriesItem(IssueAccessory accessoriesItem) {
        if (this.accessories == null) {
            this.accessories = new ArrayList<>();
        }
        this.accessories.add(accessoriesItem);
        return this;
    }

    public ShowIssueV4Response withAccessories(Consumer<List<IssueAccessory>> accessoriesSetter) {
        if (this.accessories == null) {
            this.accessories = new ArrayList<>();
        }
        accessoriesSetter.accept(this.accessories);
        return this;
    }

    /**
     * 附近列表
     * @return accessories
     */
    public List<IssueAccessory> getAccessories() {
        return accessories;
    }

    public void setAccessories(List<IssueAccessory> accessories) {
        this.accessories = accessories;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowIssueV4Response showIssueV4Response = (ShowIssueV4Response) o;
        return Objects.equals(this.actualWorkHours, showIssueV4Response.actualWorkHours)
            && Objects.equals(this.assignedCcUser, showIssueV4Response.assignedCcUser)
            && Objects.equals(this.assignedUser, showIssueV4Response.assignedUser)
            && Objects.equals(this.beginTime, showIssueV4Response.beginTime)
            && Objects.equals(this.createdTime, showIssueV4Response.createdTime)
            && Objects.equals(this.creator, showIssueV4Response.creator)
            && Objects.equals(this.customFields, showIssueV4Response.customFields)
            && Objects.equals(this.newCustomFields, showIssueV4Response.newCustomFields)
            && Objects.equals(this.developer, showIssueV4Response.developer)
            && Objects.equals(this.domain, showIssueV4Response.domain)
            && Objects.equals(this.doneRatio, showIssueV4Response.doneRatio)
            && Objects.equals(this.endTime, showIssueV4Response.endTime)
            && Objects.equals(this.expectedWorkHours, showIssueV4Response.expectedWorkHours)
            && Objects.equals(this.id, showIssueV4Response.id)
            && Objects.equals(this.project, showIssueV4Response.project)
            && Objects.equals(this.iteration, showIssueV4Response.iteration)
            && Objects.equals(this.module, showIssueV4Response.module)
            && Objects.equals(this.name, showIssueV4Response.name)
            && Objects.equals(this.parentIssue, showIssueV4Response.parentIssue)
            && Objects.equals(this.priority, showIssueV4Response.priority)
            && Objects.equals(this.severity, showIssueV4Response.severity)
            && Objects.equals(this.status, showIssueV4Response.status)
            && Objects.equals(this.tracker, showIssueV4Response.tracker)
            && Objects.equals(this.updatedTime, showIssueV4Response.updatedTime)
            && Objects.equals(this.closedTime, showIssueV4Response.closedTime)
            && Objects.equals(this.description, showIssueV4Response.description)
            && Objects.equals(this.order, showIssueV4Response.order)
            && Objects.equals(this.accessories, showIssueV4Response.accessories);
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
            severity,
            status,
            tracker,
            updatedTime,
            closedTime,
            description,
            order,
            accessories);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowIssueV4Response {\n");
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
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    tracker: ").append(toIndentedString(tracker)).append("\n");
        sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
        sb.append("    closedTime: ").append(toIndentedString(closedTime)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("    accessories: ").append(toIndentedString(accessories)).append("\n");
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
