package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 工作项。 **取值范围：** 不涉及。
 */
public class IssueNew {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_on")

    private String updatedOn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "story_point")

    private StoryPoint storyPoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subject")

    private String subject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project")

    private Project project;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isParent")

    private Boolean isParent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "done_ratio")

    private Integer doneRatio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "findReleaseDev")

    private String findReleaseDev;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tracker")

    private Tracker tracker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_date")

    private String startDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assigned_to")

    private IssueNewAssignedTo assignedTo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_attribute")

    private StatusAttributeVO statusAttribute;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private Severity severity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "releaseDev")

    private String releaseDev;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "author")

    private IssueNewAuthor author;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "module")

    private Object module;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "due_date")

    private String dueDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expected_work_hours")

    private Integer expectedWorkHours;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Priority priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actual_work_hours")

    private Integer actualWorkHours;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_watcher")

    private Boolean isWatcher;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deleted")

    private Boolean deleted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fixed_version")

    private Object fixedVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_archived")

    private Boolean isArchived;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_on")

    private String createdOn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private Object domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "developer")

    private Object developer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "closeder")

    private Object closeder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "position")

    private String position;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "closed_flag")

    private Integer closedFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assigned_cc_user")

    private String assignedCcUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_value_new")

    private Object customValueNew;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Status status;

    public IssueNew withUpdatedOn(String updatedOn) {
        this.updatedOn = updatedOn;
        return this;
    }

    /**
     * **参数解释：** 工作项的更新日期。时间戳格式（示例：1839340800000） 。 **取值范围：** 不涉及。
     * @return updatedOn
     */
    public String getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(String updatedOn) {
        this.updatedOn = updatedOn;
    }

    public IssueNew withStoryPoint(StoryPoint storyPoint) {
        this.storyPoint = storyPoint;
        return this;
    }

    public IssueNew withStoryPoint(Consumer<StoryPoint> storyPointSetter) {
        if (this.storyPoint == null) {
            this.storyPoint = new StoryPoint();
            storyPointSetter.accept(this.storyPoint);
        }

        return this;
    }

    /**
     * Get storyPoint
     * @return storyPoint
     */
    public StoryPoint getStoryPoint() {
        return storyPoint;
    }

    public void setStoryPoint(StoryPoint storyPoint) {
        this.storyPoint = storyPoint;
    }

    public IssueNew withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * **参数解释：** 工作项的负责者。 **取值范围：** 不涉及。
     * @return subject
     */
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public IssueNew withProject(Project project) {
        this.project = project;
        return this;
    }

    public IssueNew withProject(Consumer<Project> projectSetter) {
        if (this.project == null) {
            this.project = new Project();
            projectSetter.accept(this.project);
        }

        return this;
    }

    /**
     * Get project
     * @return project
     */
    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public IssueNew withIsParent(Boolean isParent) {
        this.isParent = isParent;
        return this;
    }

    /**
     * **参数解释：** 是否有子工作项。 **取值范围：** true（有子工作项） false（没有子工作项）
     * @return isParent
     */
    public Boolean getIsParent() {
        return isParent;
    }

    public void setIsParent(Boolean isParent) {
        this.isParent = isParent;
    }

    public IssueNew withDoneRatio(Integer doneRatio) {
        this.doneRatio = doneRatio;
        return this;
    }

    /**
     * **参数解释：** 工作项完成度。 **取值范围：** 不涉及。
     * @return doneRatio
     */
    public Integer getDoneRatio() {
        return doneRatio;
    }

    public void setDoneRatio(Integer doneRatio) {
        this.doneRatio = doneRatio;
    }

    public IssueNew withFindReleaseDev(String findReleaseDev) {
        this.findReleaseDev = findReleaseDev;
        return this;
    }

    /**
     * **参数解释：** 发布人 。 **取值范围：** 不涉及。
     * @return findReleaseDev
     */
    public String getFindReleaseDev() {
        return findReleaseDev;
    }

    public void setFindReleaseDev(String findReleaseDev) {
        this.findReleaseDev = findReleaseDev;
    }

    public IssueNew withTracker(Tracker tracker) {
        this.tracker = tracker;
        return this;
    }

    public IssueNew withTracker(Consumer<Tracker> trackerSetter) {
        if (this.tracker == null) {
            this.tracker = new Tracker();
            trackerSetter.accept(this.tracker);
        }

        return this;
    }

    /**
     * Get tracker
     * @return tracker
     */
    public Tracker getTracker() {
        return tracker;
    }

    public void setTracker(Tracker tracker) {
        this.tracker = tracker;
    }

    public IssueNew withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 工作项列表id。 **取值范围：** 不涉及。
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public IssueNew withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * **参数解释：** 工作项的开始日期。时间戳格式（示例：1839340800000）。 **取值范围：** 不涉及。
     * @return startDate
     */
    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public IssueNew withAssignedTo(IssueNewAssignedTo assignedTo) {
        this.assignedTo = assignedTo;
        return this;
    }

    public IssueNew withAssignedTo(Consumer<IssueNewAssignedTo> assignedToSetter) {
        if (this.assignedTo == null) {
            this.assignedTo = new IssueNewAssignedTo();
            assignedToSetter.accept(this.assignedTo);
        }

        return this;
    }

    /**
     * Get assignedTo
     * @return assignedTo
     */
    public IssueNewAssignedTo getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(IssueNewAssignedTo assignedTo) {
        this.assignedTo = assignedTo;
    }

    public IssueNew withStatusAttribute(StatusAttributeVO statusAttribute) {
        this.statusAttribute = statusAttribute;
        return this;
    }

    public IssueNew withStatusAttribute(Consumer<StatusAttributeVO> statusAttributeSetter) {
        if (this.statusAttribute == null) {
            this.statusAttribute = new StatusAttributeVO();
            statusAttributeSetter.accept(this.statusAttribute);
        }

        return this;
    }

    /**
     * Get statusAttribute
     * @return statusAttribute
     */
    public StatusAttributeVO getStatusAttribute() {
        return statusAttribute;
    }

    public void setStatusAttribute(StatusAttributeVO statusAttribute) {
        this.statusAttribute = statusAttribute;
    }

    public IssueNew withSeverity(Severity severity) {
        this.severity = severity;
        return this;
    }

    public IssueNew withSeverity(Consumer<Severity> severitySetter) {
        if (this.severity == null) {
            this.severity = new Severity();
            severitySetter.accept(this.severity);
        }

        return this;
    }

    /**
     * Get severity
     * @return severity
     */
    public Severity getSeverity() {
        return severity;
    }

    public void setSeverity(Severity severity) {
        this.severity = severity;
    }

    public IssueNew withReleaseDev(String releaseDev) {
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

    public IssueNew withAuthor(IssueNewAuthor author) {
        this.author = author;
        return this;
    }

    public IssueNew withAuthor(Consumer<IssueNewAuthor> authorSetter) {
        if (this.author == null) {
            this.author = new IssueNewAuthor();
            authorSetter.accept(this.author);
        }

        return this;
    }

    /**
     * Get author
     * @return author
     */
    public IssueNewAuthor getAuthor() {
        return author;
    }

    public void setAuthor(IssueNewAuthor author) {
        this.author = author;
    }

    public IssueNew withModule(Object module) {
        this.module = module;
        return this;
    }

    /**
     * **参数解释：** 工作项的模块。 **取值范围：** 不涉及。
     * @return module
     */
    public Object getModule() {
        return module;
    }

    public void setModule(Object module) {
        this.module = module;
    }

    public IssueNew withDueDate(String dueDate) {
        this.dueDate = dueDate;
        return this;
    }

    /**
     * **参数解释：** 工作项的截止日期，时间戳格式（示例：1839340800000）。 **取值范围：** 不涉及。
     * @return dueDate
     */
    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public IssueNew withExpectedWorkHours(Integer expectedWorkHours) {
        this.expectedWorkHours = expectedWorkHours;
        return this;
    }

    /**
     * **参数解释：** 工作项的预计工时(单位：人时)。 **取值范围：** 不涉及。
     * @return expectedWorkHours
     */
    public Integer getExpectedWorkHours() {
        return expectedWorkHours;
    }

    public void setExpectedWorkHours(Integer expectedWorkHours) {
        this.expectedWorkHours = expectedWorkHours;
    }

    public IssueNew withPriority(Priority priority) {
        this.priority = priority;
        return this;
    }

    public IssueNew withPriority(Consumer<Priority> prioritySetter) {
        if (this.priority == null) {
            this.priority = new Priority();
            prioritySetter.accept(this.priority);
        }

        return this;
    }

    /**
     * Get priority
     * @return priority
     */
    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public IssueNew withActualWorkHours(Integer actualWorkHours) {
        this.actualWorkHours = actualWorkHours;
        return this;
    }

    /**
     * **参数解释：** 工作项的实际工时（单位：人/时）。 **取值范围：** 不涉及。
     * @return actualWorkHours
     */
    public Integer getActualWorkHours() {
        return actualWorkHours;
    }

    public void setActualWorkHours(Integer actualWorkHours) {
        this.actualWorkHours = actualWorkHours;
    }

    public IssueNew withIsWatcher(Boolean isWatcher) {
        this.isWatcher = isWatcher;
        return this;
    }

    /**
     * **参数解释：** 是否关注 。 **取值范围：** true（是） false（不是）
     * @return isWatcher
     */
    public Boolean getIsWatcher() {
        return isWatcher;
    }

    public void setIsWatcher(Boolean isWatcher) {
        this.isWatcher = isWatcher;
    }

    public IssueNew withDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    /**
     * **参数解释：** 是否删除 。 **取值范围：** true（是） false（不是）
     * @return deleted
     */
    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public IssueNew withFixedVersion(Object fixedVersion) {
        this.fixedVersion = fixedVersion;
        return this;
    }

    /**
     * **参数解释：** 问题解决版本。 **取值范围：** 不涉及。
     * @return fixedVersion
     */
    public Object getFixedVersion() {
        return fixedVersion;
    }

    public void setFixedVersion(Object fixedVersion) {
        this.fixedVersion = fixedVersion;
    }

    public IssueNew withIsArchived(Boolean isArchived) {
        this.isArchived = isArchived;
        return this;
    }

    /**
     * **参数解释：** 是否归档。 **取值范围：** true（是） false（不是）
     * @return isArchived
     */
    public Boolean getIsArchived() {
        return isArchived;
    }

    public void setIsArchived(Boolean isArchived) {
        this.isArchived = isArchived;
    }

    public IssueNew withCreatedOn(String createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * **参数解释：** 工作项的创建时间，时间戳格式（示例：1839340800000）。 **取值范围：** 不涉及。
     * @return createdOn
     */
    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public IssueNew withDomain(Object domain) {
        this.domain = domain;
        return this;
    }

    /**
     * **参数解释：** 工作项的领域 。 **取值范围：** 不涉及。
     * @return domain
     */
    public Object getDomain() {
        return domain;
    }

    public void setDomain(Object domain) {
        this.domain = domain;
    }

    public IssueNew withDeveloper(Object developer) {
        this.developer = developer;
        return this;
    }

    /**
     * **参数解释：** 工作项的开发人员。 **取值范围：** 不涉及。
     * @return developer
     */
    public Object getDeveloper() {
        return developer;
    }

    public void setDeveloper(Object developer) {
        this.developer = developer;
    }

    public IssueNew withCloseder(Object closeder) {
        this.closeder = closeder;
        return this;
    }

    /**
     * **参数解释：** 关闭人员。 **取值范围：** 不涉及。
     * @return closeder
     */
    public Object getCloseder() {
        return closeder;
    }

    public void setCloseder(Object closeder) {
        this.closeder = closeder;
    }

    public IssueNew withPosition(String position) {
        this.position = position;
        return this;
    }

    /**
     * **参数解释：** 工作项在列表的展示位置 。 **取值范围：** 不涉及。
     * @return position
     */
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public IssueNew withClosedFlag(Integer closedFlag) {
        this.closedFlag = closedFlag;
        return this;
    }

    /**
     * **参数解释：** 关闭标志 。 **取值范围：** 0（打开） 1（关闭）
     * @return closedFlag
     */
    public Integer getClosedFlag() {
        return closedFlag;
    }

    public void setClosedFlag(Integer closedFlag) {
        this.closedFlag = closedFlag;
    }

    public IssueNew withAssignedCcUser(String assignedCcUser) {
        this.assignedCcUser = assignedCcUser;
        return this;
    }

    /**
     * **参数解释：** 工作项的抄送人。 **取值范围：** 不涉及。
     * @return assignedCcUser
     */
    public String getAssignedCcUser() {
        return assignedCcUser;
    }

    public void setAssignedCcUser(String assignedCcUser) {
        this.assignedCcUser = assignedCcUser;
    }

    public IssueNew withCustomValueNew(Object customValueNew) {
        this.customValueNew = customValueNew;
        return this;
    }

    /**
     * **参数解释：** 自定义字段。 **取值范围：** 不涉及。
     * @return customValueNew
     */
    public Object getCustomValueNew() {
        return customValueNew;
    }

    public void setCustomValueNew(Object customValueNew) {
        this.customValueNew = customValueNew;
    }

    public IssueNew withStatus(Status status) {
        this.status = status;
        return this;
    }

    public IssueNew withStatus(Consumer<Status> statusSetter) {
        if (this.status == null) {
            this.status = new Status();
            statusSetter.accept(this.status);
        }

        return this;
    }

    /**
     * Get status
     * @return status
     */
    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IssueNew that = (IssueNew) obj;
        return Objects.equals(this.updatedOn, that.updatedOn) && Objects.equals(this.storyPoint, that.storyPoint)
            && Objects.equals(this.subject, that.subject) && Objects.equals(this.project, that.project)
            && Objects.equals(this.isParent, that.isParent) && Objects.equals(this.doneRatio, that.doneRatio)
            && Objects.equals(this.findReleaseDev, that.findReleaseDev) && Objects.equals(this.tracker, that.tracker)
            && Objects.equals(this.id, that.id) && Objects.equals(this.startDate, that.startDate)
            && Objects.equals(this.assignedTo, that.assignedTo)
            && Objects.equals(this.statusAttribute, that.statusAttribute)
            && Objects.equals(this.severity, that.severity) && Objects.equals(this.releaseDev, that.releaseDev)
            && Objects.equals(this.author, that.author) && Objects.equals(this.module, that.module)
            && Objects.equals(this.dueDate, that.dueDate)
            && Objects.equals(this.expectedWorkHours, that.expectedWorkHours)
            && Objects.equals(this.priority, that.priority)
            && Objects.equals(this.actualWorkHours, that.actualWorkHours)
            && Objects.equals(this.isWatcher, that.isWatcher) && Objects.equals(this.deleted, that.deleted)
            && Objects.equals(this.fixedVersion, that.fixedVersion) && Objects.equals(this.isArchived, that.isArchived)
            && Objects.equals(this.createdOn, that.createdOn) && Objects.equals(this.domain, that.domain)
            && Objects.equals(this.developer, that.developer) && Objects.equals(this.closeder, that.closeder)
            && Objects.equals(this.position, that.position) && Objects.equals(this.closedFlag, that.closedFlag)
            && Objects.equals(this.assignedCcUser, that.assignedCcUser)
            && Objects.equals(this.customValueNew, that.customValueNew) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(updatedOn,
            storyPoint,
            subject,
            project,
            isParent,
            doneRatio,
            findReleaseDev,
            tracker,
            id,
            startDate,
            assignedTo,
            statusAttribute,
            severity,
            releaseDev,
            author,
            module,
            dueDate,
            expectedWorkHours,
            priority,
            actualWorkHours,
            isWatcher,
            deleted,
            fixedVersion,
            isArchived,
            createdOn,
            domain,
            developer,
            closeder,
            position,
            closedFlag,
            assignedCcUser,
            customValueNew,
            status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssueNew {\n");
        sb.append("    updatedOn: ").append(toIndentedString(updatedOn)).append("\n");
        sb.append("    storyPoint: ").append(toIndentedString(storyPoint)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
        sb.append("    project: ").append(toIndentedString(project)).append("\n");
        sb.append("    isParent: ").append(toIndentedString(isParent)).append("\n");
        sb.append("    doneRatio: ").append(toIndentedString(doneRatio)).append("\n");
        sb.append("    findReleaseDev: ").append(toIndentedString(findReleaseDev)).append("\n");
        sb.append("    tracker: ").append(toIndentedString(tracker)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    assignedTo: ").append(toIndentedString(assignedTo)).append("\n");
        sb.append("    statusAttribute: ").append(toIndentedString(statusAttribute)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    releaseDev: ").append(toIndentedString(releaseDev)).append("\n");
        sb.append("    author: ").append(toIndentedString(author)).append("\n");
        sb.append("    module: ").append(toIndentedString(module)).append("\n");
        sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
        sb.append("    expectedWorkHours: ").append(toIndentedString(expectedWorkHours)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    actualWorkHours: ").append(toIndentedString(actualWorkHours)).append("\n");
        sb.append("    isWatcher: ").append(toIndentedString(isWatcher)).append("\n");
        sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
        sb.append("    fixedVersion: ").append(toIndentedString(fixedVersion)).append("\n");
        sb.append("    isArchived: ").append(toIndentedString(isArchived)).append("\n");
        sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    developer: ").append(toIndentedString(developer)).append("\n");
        sb.append("    closeder: ").append(toIndentedString(closeder)).append("\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
        sb.append("    closedFlag: ").append(toIndentedString(closedFlag)).append("\n");
        sb.append("    assignedCcUser: ").append(toIndentedString(assignedCcUser)).append("\n");
        sb.append("    customValueNew: ").append(toIndentedString(customValueNew)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
