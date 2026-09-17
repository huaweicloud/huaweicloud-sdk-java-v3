package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * IssueDetailResponseV2
 */
public class IssueDetailResponseV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actual_work_hours")

    private Double actualWorkHours;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assigned_cc_user")

    private List<UserVO> assignedCcUser = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assigned_to")

    private UserVO assignedTo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_date")

    private String startDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_on")

    private String createdOn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "author")

    private UserVO author;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_fields")

    private List<CustomFieldV2> customFields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_value_new")

    private IssueDetailCustomFieldV2 customValueNew;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "developer")

    private UserVO developer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private IssueDetailResponseV2Domain domain;

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

    private ProjectVO project;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iteration")

    private IssueDetailResponseV2Iteration iteration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "story_point")

    private IssueDetailResponseV2StoryPoint storyPoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "module")

    private IssueDetailResponseV2Module module;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subject")

    private String subject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_issue")

    private IssueDetailResponseV2ParentIssue parentIssue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private IssueDetailResponseV2Priority priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private IssueDetailResponseV2Severity severity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private IssueDetailResponseV2Status status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "release_dev")

    private String releaseDev;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "find_release_dev")

    private String findReleaseDev;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env")

    private IssueDetailResponseV2Env env;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tracker")

    private IssueDetailResponseV2Tracker tracker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_on")

    private String updatedOn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "closed_time")

    private String closedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accessories_list")

    private List<IssueAccessoryV2> accessoriesList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inner_text")

    private String innerText;

    public IssueDetailResponseV2 withActualWorkHours(Double actualWorkHours) {
        this.actualWorkHours = actualWorkHours;
        return this;
    }

    /**
     * **参数解释：** 工作项的实际工时（单位：人/时）。 **取值范围：** 不涉及。
     * minimum: 0
     * maximum: 1E+4
     * @return actualWorkHours
     */
    public Double getActualWorkHours() {
        return actualWorkHours;
    }

    public void setActualWorkHours(Double actualWorkHours) {
        this.actualWorkHours = actualWorkHours;
    }

    public IssueDetailResponseV2 withAssignedCcUser(List<UserVO> assignedCcUser) {
        this.assignedCcUser = assignedCcUser;
        return this;
    }

    public IssueDetailResponseV2 addAssignedCcUserItem(UserVO assignedCcUserItem) {
        if (this.assignedCcUser == null) {
            this.assignedCcUser = new ArrayList<>();
        }
        this.assignedCcUser.add(assignedCcUserItem);
        return this;
    }

    public IssueDetailResponseV2 withAssignedCcUser(Consumer<List<UserVO>> assignedCcUserSetter) {
        if (this.assignedCcUser == null) {
            this.assignedCcUser = new ArrayList<>();
        }
        assignedCcUserSetter.accept(this.assignedCcUser);
        return this;
    }

    /**
     * **参数解释：** 当前工作项的抄送人。
     * @return assignedCcUser
     */
    public List<UserVO> getAssignedCcUser() {
        return assignedCcUser;
    }

    public void setAssignedCcUser(List<UserVO> assignedCcUser) {
        this.assignedCcUser = assignedCcUser;
    }

    public IssueDetailResponseV2 withAssignedTo(UserVO assignedTo) {
        this.assignedTo = assignedTo;
        return this;
    }

    public IssueDetailResponseV2 withAssignedTo(Consumer<UserVO> assignedToSetter) {
        if (this.assignedTo == null) {
            this.assignedTo = new UserVO();
            assignedToSetter.accept(this.assignedTo);
        }

        return this;
    }

    /**
     * Get assignedTo
     * @return assignedTo
     */
    public UserVO getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(UserVO assignedTo) {
        this.assignedTo = assignedTo;
    }

    public IssueDetailResponseV2 withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * **参数解释：** 工作项的预计开始时间，时间戳格式（示例：1754323200000）。 **取值范围：** 不涉及。
     * @return startDate
     */
    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public IssueDetailResponseV2 withCreatedOn(String createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * **参数解释：** 工作项创建时间，时间戳格式（示例：1754374102000）。 **取值范围：** 不涉及。
     * @return createdOn
     */
    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public IssueDetailResponseV2 withAuthor(UserVO author) {
        this.author = author;
        return this;
    }

    public IssueDetailResponseV2 withAuthor(Consumer<UserVO> authorSetter) {
        if (this.author == null) {
            this.author = new UserVO();
            authorSetter.accept(this.author);
        }

        return this;
    }

    /**
     * Get author
     * @return author
     */
    public UserVO getAuthor() {
        return author;
    }

    public void setAuthor(UserVO author) {
        this.author = author;
    }

    public IssueDetailResponseV2 withCustomFields(List<CustomFieldV2> customFields) {
        this.customFields = customFields;
        return this;
    }

    public IssueDetailResponseV2 addCustomFieldsItem(CustomFieldV2 customFieldsItem) {
        if (this.customFields == null) {
            this.customFields = new ArrayList<>();
        }
        this.customFields.add(customFieldsItem);
        return this;
    }

    public IssueDetailResponseV2 withCustomFields(Consumer<List<CustomFieldV2>> customFieldsSetter) {
        if (this.customFields == null) {
            this.customFields = new ArrayList<>();
        }
        customFieldsSetter.accept(this.customFields);
        return this;
    }

    /**
     * **参数解释：** 工作项的自定义字段。
     * @return customFields
     */
    public List<CustomFieldV2> getCustomFields() {
        return customFields;
    }

    public void setCustomFields(List<CustomFieldV2> customFields) {
        this.customFields = customFields;
    }

    public IssueDetailResponseV2 withCustomValueNew(IssueDetailCustomFieldV2 customValueNew) {
        this.customValueNew = customValueNew;
        return this;
    }

    public IssueDetailResponseV2 withCustomValueNew(Consumer<IssueDetailCustomFieldV2> customValueNewSetter) {
        if (this.customValueNew == null) {
            this.customValueNew = new IssueDetailCustomFieldV2();
            customValueNewSetter.accept(this.customValueNew);
        }

        return this;
    }

    /**
     * Get customValueNew
     * @return customValueNew
     */
    public IssueDetailCustomFieldV2 getCustomValueNew() {
        return customValueNew;
    }

    public void setCustomValueNew(IssueDetailCustomFieldV2 customValueNew) {
        this.customValueNew = customValueNew;
    }

    public IssueDetailResponseV2 withDeveloper(UserVO developer) {
        this.developer = developer;
        return this;
    }

    public IssueDetailResponseV2 withDeveloper(Consumer<UserVO> developerSetter) {
        if (this.developer == null) {
            this.developer = new UserVO();
            developerSetter.accept(this.developer);
        }

        return this;
    }

    /**
     * Get developer
     * @return developer
     */
    public UserVO getDeveloper() {
        return developer;
    }

    public void setDeveloper(UserVO developer) {
        this.developer = developer;
    }

    public IssueDetailResponseV2 withDomain(IssueDetailResponseV2Domain domain) {
        this.domain = domain;
        return this;
    }

    public IssueDetailResponseV2 withDomain(Consumer<IssueDetailResponseV2Domain> domainSetter) {
        if (this.domain == null) {
            this.domain = new IssueDetailResponseV2Domain();
            domainSetter.accept(this.domain);
        }

        return this;
    }

    /**
     * Get domain
     * @return domain
     */
    public IssueDetailResponseV2Domain getDomain() {
        return domain;
    }

    public void setDomain(IssueDetailResponseV2Domain domain) {
        this.domain = domain;
    }

    public IssueDetailResponseV2 withDoneRatio(Integer doneRatio) {
        this.doneRatio = doneRatio;
        return this;
    }

    /**
     * **参数解释：** 工作项完成度。 **取值范围：** 不涉及。
     * minimum: 0
     * maximum: 2147483647
     * @return doneRatio
     */
    public Integer getDoneRatio() {
        return doneRatio;
    }

    public void setDoneRatio(Integer doneRatio) {
        this.doneRatio = doneRatio;
    }

    public IssueDetailResponseV2 withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释：** 工作项的预计结束时间，时间戳格式（示例：1754323200000）。 **取值范围：** 不涉及。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public IssueDetailResponseV2 withExpectedWorkHours(Double expectedWorkHours) {
        this.expectedWorkHours = expectedWorkHours;
        return this;
    }

    /**
     * **参数解释：** 工作项的预计完成工时（单位：人/时）。 **取值范围：** 不涉及。
     * minimum: 0
     * maximum: 1E+4
     * @return expectedWorkHours
     */
    public Double getExpectedWorkHours() {
        return expectedWorkHours;
    }

    public void setExpectedWorkHours(Double expectedWorkHours) {
        this.expectedWorkHours = expectedWorkHours;
    }

    public IssueDetailResponseV2 withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 工作项id。 **取值范围：** 不涉及。
     * minimum: 0
     * maximum: 2147483647
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public IssueDetailResponseV2 withProject(ProjectVO project) {
        this.project = project;
        return this;
    }

    public IssueDetailResponseV2 withProject(Consumer<ProjectVO> projectSetter) {
        if (this.project == null) {
            this.project = new ProjectVO();
            projectSetter.accept(this.project);
        }

        return this;
    }

    /**
     * Get project
     * @return project
     */
    public ProjectVO getProject() {
        return project;
    }

    public void setProject(ProjectVO project) {
        this.project = project;
    }

    public IssueDetailResponseV2 withIteration(IssueDetailResponseV2Iteration iteration) {
        this.iteration = iteration;
        return this;
    }

    public IssueDetailResponseV2 withIteration(Consumer<IssueDetailResponseV2Iteration> iterationSetter) {
        if (this.iteration == null) {
            this.iteration = new IssueDetailResponseV2Iteration();
            iterationSetter.accept(this.iteration);
        }

        return this;
    }

    /**
     * Get iteration
     * @return iteration
     */
    public IssueDetailResponseV2Iteration getIteration() {
        return iteration;
    }

    public void setIteration(IssueDetailResponseV2Iteration iteration) {
        this.iteration = iteration;
    }

    public IssueDetailResponseV2 withStoryPoint(IssueDetailResponseV2StoryPoint storyPoint) {
        this.storyPoint = storyPoint;
        return this;
    }

    public IssueDetailResponseV2 withStoryPoint(Consumer<IssueDetailResponseV2StoryPoint> storyPointSetter) {
        if (this.storyPoint == null) {
            this.storyPoint = new IssueDetailResponseV2StoryPoint();
            storyPointSetter.accept(this.storyPoint);
        }

        return this;
    }

    /**
     * Get storyPoint
     * @return storyPoint
     */
    public IssueDetailResponseV2StoryPoint getStoryPoint() {
        return storyPoint;
    }

    public void setStoryPoint(IssueDetailResponseV2StoryPoint storyPoint) {
        this.storyPoint = storyPoint;
    }

    public IssueDetailResponseV2 withModule(IssueDetailResponseV2Module module) {
        this.module = module;
        return this;
    }

    public IssueDetailResponseV2 withModule(Consumer<IssueDetailResponseV2Module> moduleSetter) {
        if (this.module == null) {
            this.module = new IssueDetailResponseV2Module();
            moduleSetter.accept(this.module);
        }

        return this;
    }

    /**
     * Get module
     * @return module
     */
    public IssueDetailResponseV2Module getModule() {
        return module;
    }

    public void setModule(IssueDetailResponseV2Module module) {
        this.module = module;
    }

    public IssueDetailResponseV2 withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * **参数解释：** 工作项的标题。 **取值范围：** 不涉及。
     * @return subject
     */
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public IssueDetailResponseV2 withParentIssue(IssueDetailResponseV2ParentIssue parentIssue) {
        this.parentIssue = parentIssue;
        return this;
    }

    public IssueDetailResponseV2 withParentIssue(Consumer<IssueDetailResponseV2ParentIssue> parentIssueSetter) {
        if (this.parentIssue == null) {
            this.parentIssue = new IssueDetailResponseV2ParentIssue();
            parentIssueSetter.accept(this.parentIssue);
        }

        return this;
    }

    /**
     * Get parentIssue
     * @return parentIssue
     */
    public IssueDetailResponseV2ParentIssue getParentIssue() {
        return parentIssue;
    }

    public void setParentIssue(IssueDetailResponseV2ParentIssue parentIssue) {
        this.parentIssue = parentIssue;
    }

    public IssueDetailResponseV2 withPriority(IssueDetailResponseV2Priority priority) {
        this.priority = priority;
        return this;
    }

    public IssueDetailResponseV2 withPriority(Consumer<IssueDetailResponseV2Priority> prioritySetter) {
        if (this.priority == null) {
            this.priority = new IssueDetailResponseV2Priority();
            prioritySetter.accept(this.priority);
        }

        return this;
    }

    /**
     * Get priority
     * @return priority
     */
    public IssueDetailResponseV2Priority getPriority() {
        return priority;
    }

    public void setPriority(IssueDetailResponseV2Priority priority) {
        this.priority = priority;
    }

    public IssueDetailResponseV2 withSeverity(IssueDetailResponseV2Severity severity) {
        this.severity = severity;
        return this;
    }

    public IssueDetailResponseV2 withSeverity(Consumer<IssueDetailResponseV2Severity> severitySetter) {
        if (this.severity == null) {
            this.severity = new IssueDetailResponseV2Severity();
            severitySetter.accept(this.severity);
        }

        return this;
    }

    /**
     * Get severity
     * @return severity
     */
    public IssueDetailResponseV2Severity getSeverity() {
        return severity;
    }

    public void setSeverity(IssueDetailResponseV2Severity severity) {
        this.severity = severity;
    }

    public IssueDetailResponseV2 withStatus(IssueDetailResponseV2Status status) {
        this.status = status;
        return this;
    }

    public IssueDetailResponseV2 withStatus(Consumer<IssueDetailResponseV2Status> statusSetter) {
        if (this.status == null) {
            this.status = new IssueDetailResponseV2Status();
            statusSetter.accept(this.status);
        }

        return this;
    }

    /**
     * Get status
     * @return status
     */
    public IssueDetailResponseV2Status getStatus() {
        return status;
    }

    public void setStatus(IssueDetailResponseV2Status status) {
        this.status = status;
    }

    public IssueDetailResponseV2 withReleaseDev(String releaseDev) {
        this.releaseDev = releaseDev;
        return this;
    }

    /**
     * **参数解释：** 工作项发布版本号。 **取值范围：** 不涉及。
     * @return releaseDev
     */
    public String getReleaseDev() {
        return releaseDev;
    }

    public void setReleaseDev(String releaseDev) {
        this.releaseDev = releaseDev;
    }

    public IssueDetailResponseV2 withFindReleaseDev(String findReleaseDev) {
        this.findReleaseDev = findReleaseDev;
        return this;
    }

    /**
     * **参数解释：** 缺陷发现版本号（仅Bug类型工作项具备该字段）。 **取值范围：** 不涉及。
     * @return findReleaseDev
     */
    public String getFindReleaseDev() {
        return findReleaseDev;
    }

    public void setFindReleaseDev(String findReleaseDev) {
        this.findReleaseDev = findReleaseDev;
    }

    public IssueDetailResponseV2 withEnv(IssueDetailResponseV2Env env) {
        this.env = env;
        return this;
    }

    public IssueDetailResponseV2 withEnv(Consumer<IssueDetailResponseV2Env> envSetter) {
        if (this.env == null) {
            this.env = new IssueDetailResponseV2Env();
            envSetter.accept(this.env);
        }

        return this;
    }

    /**
     * Get env
     * @return env
     */
    public IssueDetailResponseV2Env getEnv() {
        return env;
    }

    public void setEnv(IssueDetailResponseV2Env env) {
        this.env = env;
    }

    public IssueDetailResponseV2 withTracker(IssueDetailResponseV2Tracker tracker) {
        this.tracker = tracker;
        return this;
    }

    public IssueDetailResponseV2 withTracker(Consumer<IssueDetailResponseV2Tracker> trackerSetter) {
        if (this.tracker == null) {
            this.tracker = new IssueDetailResponseV2Tracker();
            trackerSetter.accept(this.tracker);
        }

        return this;
    }

    /**
     * Get tracker
     * @return tracker
     */
    public IssueDetailResponseV2Tracker getTracker() {
        return tracker;
    }

    public void setTracker(IssueDetailResponseV2Tracker tracker) {
        this.tracker = tracker;
    }

    public IssueDetailResponseV2 withUpdatedOn(String updatedOn) {
        this.updatedOn = updatedOn;
        return this;
    }

    /**
     * **参数解释：** 工作项的最后更新时间，时间戳格式（示例：1754374102000）。 **取值范围：** 不涉及。
     * @return updatedOn
     */
    public String getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(String updatedOn) {
        this.updatedOn = updatedOn;
    }

    public IssueDetailResponseV2 withClosedTime(String closedTime) {
        this.closedTime = closedTime;
        return this;
    }

    /**
     * **参数解释：** 工作项的关闭时间，时间戳格式（示例：1754374102000）。 **取值范围：** 不涉及。
     * @return closedTime
     */
    public String getClosedTime() {
        return closedTime;
    }

    public void setClosedTime(String closedTime) {
        this.closedTime = closedTime;
    }

    public IssueDetailResponseV2 withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 工作项描述。 **取值范围：** 不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public IssueDetailResponseV2 withAccessoriesList(List<IssueAccessoryV2> accessoriesList) {
        this.accessoriesList = accessoriesList;
        return this;
    }

    public IssueDetailResponseV2 addAccessoriesListItem(IssueAccessoryV2 accessoriesListItem) {
        if (this.accessoriesList == null) {
            this.accessoriesList = new ArrayList<>();
        }
        this.accessoriesList.add(accessoriesListItem);
        return this;
    }

    public IssueDetailResponseV2 withAccessoriesList(Consumer<List<IssueAccessoryV2>> accessoriesListSetter) {
        if (this.accessoriesList == null) {
            this.accessoriesList = new ArrayList<>();
        }
        accessoriesListSetter.accept(this.accessoriesList);
        return this;
    }

    /**
     * **参数解释：** 工作项的附件列表。
     * @return accessoriesList
     */
    public List<IssueAccessoryV2> getAccessoriesList() {
        return accessoriesList;
    }

    public void setAccessoriesList(List<IssueAccessoryV2> accessoriesList) {
        this.accessoriesList = accessoriesList;
    }

    public IssueDetailResponseV2 withInnerText(String innerText) {
        this.innerText = innerText;
        return this;
    }

    /**
     * **参数解释：** 工作项更新的评论内容。 **取值范围：** 不涉及。
     * @return innerText
     */
    public String getInnerText() {
        return innerText;
    }

    public void setInnerText(String innerText) {
        this.innerText = innerText;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IssueDetailResponseV2 that = (IssueDetailResponseV2) obj;
        return Objects.equals(this.actualWorkHours, that.actualWorkHours)
            && Objects.equals(this.assignedCcUser, that.assignedCcUser)
            && Objects.equals(this.assignedTo, that.assignedTo) && Objects.equals(this.startDate, that.startDate)
            && Objects.equals(this.createdOn, that.createdOn) && Objects.equals(this.author, that.author)
            && Objects.equals(this.customFields, that.customFields)
            && Objects.equals(this.customValueNew, that.customValueNew)
            && Objects.equals(this.developer, that.developer) && Objects.equals(this.domain, that.domain)
            && Objects.equals(this.doneRatio, that.doneRatio) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.expectedWorkHours, that.expectedWorkHours) && Objects.equals(this.id, that.id)
            && Objects.equals(this.project, that.project) && Objects.equals(this.iteration, that.iteration)
            && Objects.equals(this.storyPoint, that.storyPoint) && Objects.equals(this.module, that.module)
            && Objects.equals(this.subject, that.subject) && Objects.equals(this.parentIssue, that.parentIssue)
            && Objects.equals(this.priority, that.priority) && Objects.equals(this.severity, that.severity)
            && Objects.equals(this.status, that.status) && Objects.equals(this.releaseDev, that.releaseDev)
            && Objects.equals(this.findReleaseDev, that.findReleaseDev) && Objects.equals(this.env, that.env)
            && Objects.equals(this.tracker, that.tracker) && Objects.equals(this.updatedOn, that.updatedOn)
            && Objects.equals(this.closedTime, that.closedTime) && Objects.equals(this.description, that.description)
            && Objects.equals(this.accessoriesList, that.accessoriesList)
            && Objects.equals(this.innerText, that.innerText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actualWorkHours,
            assignedCcUser,
            assignedTo,
            startDate,
            createdOn,
            author,
            customFields,
            customValueNew,
            developer,
            domain,
            doneRatio,
            endTime,
            expectedWorkHours,
            id,
            project,
            iteration,
            storyPoint,
            module,
            subject,
            parentIssue,
            priority,
            severity,
            status,
            releaseDev,
            findReleaseDev,
            env,
            tracker,
            updatedOn,
            closedTime,
            description,
            accessoriesList,
            innerText);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssueDetailResponseV2 {\n");
        sb.append("    actualWorkHours: ").append(toIndentedString(actualWorkHours)).append("\n");
        sb.append("    assignedCcUser: ").append(toIndentedString(assignedCcUser)).append("\n");
        sb.append("    assignedTo: ").append(toIndentedString(assignedTo)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
        sb.append("    author: ").append(toIndentedString(author)).append("\n");
        sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
        sb.append("    customValueNew: ").append(toIndentedString(customValueNew)).append("\n");
        sb.append("    developer: ").append(toIndentedString(developer)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    doneRatio: ").append(toIndentedString(doneRatio)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    expectedWorkHours: ").append(toIndentedString(expectedWorkHours)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    project: ").append(toIndentedString(project)).append("\n");
        sb.append("    iteration: ").append(toIndentedString(iteration)).append("\n");
        sb.append("    storyPoint: ").append(toIndentedString(storyPoint)).append("\n");
        sb.append("    module: ").append(toIndentedString(module)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
        sb.append("    parentIssue: ").append(toIndentedString(parentIssue)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    releaseDev: ").append(toIndentedString(releaseDev)).append("\n");
        sb.append("    findReleaseDev: ").append(toIndentedString(findReleaseDev)).append("\n");
        sb.append("    env: ").append(toIndentedString(env)).append("\n");
        sb.append("    tracker: ").append(toIndentedString(tracker)).append("\n");
        sb.append("    updatedOn: ").append(toIndentedString(updatedOn)).append("\n");
        sb.append("    closedTime: ").append(toIndentedString(closedTime)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    accessoriesList: ").append(toIndentedString(accessoriesList)).append("\n");
        sb.append("    innerText: ").append(toIndentedString(innerText)).append("\n");
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
