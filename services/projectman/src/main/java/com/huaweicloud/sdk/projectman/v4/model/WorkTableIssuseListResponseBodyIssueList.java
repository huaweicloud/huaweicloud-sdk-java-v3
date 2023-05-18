package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * WorkTableIssuseListResponseBodyIssueList
 */
public class WorkTableIssuseListResponseBodyIssueList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subject")

    private String subject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_issue_id")

    private Integer parentIssueId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_issue")

    private WorkTableIssuseListResponseBodyParentIssue parentIssue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project")

    private WorkTableIssuseListResponseBodyProject project;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "release_dev")

    private String releaseDev;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "find_release_dev")

    private String findReleaseDev;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "done_ratio")

    private Integer doneRatio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expected_work_hours")

    private Double expectedWorkHours;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actual_work_hours")

    private Double actualWorkHours;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tracker")

    private WorkTableIssuseListResponseBodyTracker tracker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order")

    private WorkTableIssuseListResponseBodyOrder order;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private WorkTableIssuseListResponseBodySeverity severity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private WorkTableIssuseListResponseBodyPriority priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private WorkTableIssuseListResponseBodyDomain domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "position")

    private Double position;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "module")

    private WorkTableIssuseListResponseBodyModule module;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assigned_to")

    private SimpleUserIn assignedTo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "author")

    private SimpleUserIn author;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "developer")

    private SimpleUserIn developer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "closeder")

    private SimpleUserIn closeder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private WorkTableIssuseListResponseBodyStatus status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deleted")

    private Boolean deleted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_watcher")

    private Boolean isWatcher;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "closed_flag")

    private Integer closedFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_on")

    private String createdOn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_on")

    private String updatedOn;

    public WorkTableIssuseListResponseBodyIssueList withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 工作项id
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public WorkTableIssuseListResponseBodyIssueList withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * 工作项标题
     * @return subject
     */
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public WorkTableIssuseListResponseBodyIssueList withParentIssueId(Integer parentIssueId) {
        this.parentIssueId = parentIssueId;
        return this;
    }

    /**
     * 父工作项id
     * @return parentIssueId
     */
    public Integer getParentIssueId() {
        return parentIssueId;
    }

    public void setParentIssueId(Integer parentIssueId) {
        this.parentIssueId = parentIssueId;
    }

    public WorkTableIssuseListResponseBodyIssueList withParentIssue(
        WorkTableIssuseListResponseBodyParentIssue parentIssue) {
        this.parentIssue = parentIssue;
        return this;
    }

    public WorkTableIssuseListResponseBodyIssueList withParentIssue(
        Consumer<WorkTableIssuseListResponseBodyParentIssue> parentIssueSetter) {
        if (this.parentIssue == null) {
            this.parentIssue = new WorkTableIssuseListResponseBodyParentIssue();
            parentIssueSetter.accept(this.parentIssue);
        }

        return this;
    }

    /**
     * Get parentIssue
     * @return parentIssue
     */
    public WorkTableIssuseListResponseBodyParentIssue getParentIssue() {
        return parentIssue;
    }

    public void setParentIssue(WorkTableIssuseListResponseBodyParentIssue parentIssue) {
        this.parentIssue = parentIssue;
    }

    public WorkTableIssuseListResponseBodyIssueList withProject(WorkTableIssuseListResponseBodyProject project) {
        this.project = project;
        return this;
    }

    public WorkTableIssuseListResponseBodyIssueList withProject(
        Consumer<WorkTableIssuseListResponseBodyProject> projectSetter) {
        if (this.project == null) {
            this.project = new WorkTableIssuseListResponseBodyProject();
            projectSetter.accept(this.project);
        }

        return this;
    }

    /**
     * Get project
     * @return project
     */
    public WorkTableIssuseListResponseBodyProject getProject() {
        return project;
    }

    public void setProject(WorkTableIssuseListResponseBodyProject project) {
        this.project = project;
    }

    public WorkTableIssuseListResponseBodyIssueList withReleaseDev(String releaseDev) {
        this.releaseDev = releaseDev;
        return this;
    }

    /**
     * 发布版本
     * @return releaseDev
     */
    public String getReleaseDev() {
        return releaseDev;
    }

    public void setReleaseDev(String releaseDev) {
        this.releaseDev = releaseDev;
    }

    public WorkTableIssuseListResponseBodyIssueList withFindReleaseDev(String findReleaseDev) {
        this.findReleaseDev = findReleaseDev;
        return this;
    }

    /**
     * 发现发布版本
     * @return findReleaseDev
     */
    public String getFindReleaseDev() {
        return findReleaseDev;
    }

    public void setFindReleaseDev(String findReleaseDev) {
        this.findReleaseDev = findReleaseDev;
    }

    public WorkTableIssuseListResponseBodyIssueList withDoneRatio(Integer doneRatio) {
        this.doneRatio = doneRatio;
        return this;
    }

    /**
     * 工作项完成度
     * @return doneRatio
     */
    public Integer getDoneRatio() {
        return doneRatio;
    }

    public void setDoneRatio(Integer doneRatio) {
        this.doneRatio = doneRatio;
    }

    public WorkTableIssuseListResponseBodyIssueList withExpectedWorkHours(Double expectedWorkHours) {
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

    public WorkTableIssuseListResponseBodyIssueList withActualWorkHours(Double actualWorkHours) {
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

    public WorkTableIssuseListResponseBodyIssueList withTracker(WorkTableIssuseListResponseBodyTracker tracker) {
        this.tracker = tracker;
        return this;
    }

    public WorkTableIssuseListResponseBodyIssueList withTracker(
        Consumer<WorkTableIssuseListResponseBodyTracker> trackerSetter) {
        if (this.tracker == null) {
            this.tracker = new WorkTableIssuseListResponseBodyTracker();
            trackerSetter.accept(this.tracker);
        }

        return this;
    }

    /**
     * Get tracker
     * @return tracker
     */
    public WorkTableIssuseListResponseBodyTracker getTracker() {
        return tracker;
    }

    public void setTracker(WorkTableIssuseListResponseBodyTracker tracker) {
        this.tracker = tracker;
    }

    public WorkTableIssuseListResponseBodyIssueList withOrder(WorkTableIssuseListResponseBodyOrder order) {
        this.order = order;
        return this;
    }

    public WorkTableIssuseListResponseBodyIssueList withOrder(
        Consumer<WorkTableIssuseListResponseBodyOrder> orderSetter) {
        if (this.order == null) {
            this.order = new WorkTableIssuseListResponseBodyOrder();
            orderSetter.accept(this.order);
        }

        return this;
    }

    /**
     * Get order
     * @return order
     */
    public WorkTableIssuseListResponseBodyOrder getOrder() {
        return order;
    }

    public void setOrder(WorkTableIssuseListResponseBodyOrder order) {
        this.order = order;
    }

    public WorkTableIssuseListResponseBodyIssueList withSeverity(WorkTableIssuseListResponseBodySeverity severity) {
        this.severity = severity;
        return this;
    }

    public WorkTableIssuseListResponseBodyIssueList withSeverity(
        Consumer<WorkTableIssuseListResponseBodySeverity> severitySetter) {
        if (this.severity == null) {
            this.severity = new WorkTableIssuseListResponseBodySeverity();
            severitySetter.accept(this.severity);
        }

        return this;
    }

    /**
     * Get severity
     * @return severity
     */
    public WorkTableIssuseListResponseBodySeverity getSeverity() {
        return severity;
    }

    public void setSeverity(WorkTableIssuseListResponseBodySeverity severity) {
        this.severity = severity;
    }

    public WorkTableIssuseListResponseBodyIssueList withPriority(WorkTableIssuseListResponseBodyPriority priority) {
        this.priority = priority;
        return this;
    }

    public WorkTableIssuseListResponseBodyIssueList withPriority(
        Consumer<WorkTableIssuseListResponseBodyPriority> prioritySetter) {
        if (this.priority == null) {
            this.priority = new WorkTableIssuseListResponseBodyPriority();
            prioritySetter.accept(this.priority);
        }

        return this;
    }

    /**
     * Get priority
     * @return priority
     */
    public WorkTableIssuseListResponseBodyPriority getPriority() {
        return priority;
    }

    public void setPriority(WorkTableIssuseListResponseBodyPriority priority) {
        this.priority = priority;
    }

    public WorkTableIssuseListResponseBodyIssueList withDomain(WorkTableIssuseListResponseBodyDomain domain) {
        this.domain = domain;
        return this;
    }

    public WorkTableIssuseListResponseBodyIssueList withDomain(
        Consumer<WorkTableIssuseListResponseBodyDomain> domainSetter) {
        if (this.domain == null) {
            this.domain = new WorkTableIssuseListResponseBodyDomain();
            domainSetter.accept(this.domain);
        }

        return this;
    }

    /**
     * Get domain
     * @return domain
     */
    public WorkTableIssuseListResponseBodyDomain getDomain() {
        return domain;
    }

    public void setDomain(WorkTableIssuseListResponseBodyDomain domain) {
        this.domain = domain;
    }

    public WorkTableIssuseListResponseBodyIssueList withPosition(Double position) {
        this.position = position;
        return this;
    }

    /**
     * 排序数值
     * @return position
     */
    public Double getPosition() {
        return position;
    }

    public void setPosition(Double position) {
        this.position = position;
    }

    public WorkTableIssuseListResponseBodyIssueList withModule(WorkTableIssuseListResponseBodyModule module) {
        this.module = module;
        return this;
    }

    public WorkTableIssuseListResponseBodyIssueList withModule(
        Consumer<WorkTableIssuseListResponseBodyModule> moduleSetter) {
        if (this.module == null) {
            this.module = new WorkTableIssuseListResponseBodyModule();
            moduleSetter.accept(this.module);
        }

        return this;
    }

    /**
     * Get module
     * @return module
     */
    public WorkTableIssuseListResponseBodyModule getModule() {
        return module;
    }

    public void setModule(WorkTableIssuseListResponseBodyModule module) {
        this.module = module;
    }

    public WorkTableIssuseListResponseBodyIssueList withAssignedTo(SimpleUserIn assignedTo) {
        this.assignedTo = assignedTo;
        return this;
    }

    public WorkTableIssuseListResponseBodyIssueList withAssignedTo(Consumer<SimpleUserIn> assignedToSetter) {
        if (this.assignedTo == null) {
            this.assignedTo = new SimpleUserIn();
            assignedToSetter.accept(this.assignedTo);
        }

        return this;
    }

    /**
     * Get assignedTo
     * @return assignedTo
     */
    public SimpleUserIn getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(SimpleUserIn assignedTo) {
        this.assignedTo = assignedTo;
    }

    public WorkTableIssuseListResponseBodyIssueList withAuthor(SimpleUserIn author) {
        this.author = author;
        return this;
    }

    public WorkTableIssuseListResponseBodyIssueList withAuthor(Consumer<SimpleUserIn> authorSetter) {
        if (this.author == null) {
            this.author = new SimpleUserIn();
            authorSetter.accept(this.author);
        }

        return this;
    }

    /**
     * Get author
     * @return author
     */
    public SimpleUserIn getAuthor() {
        return author;
    }

    public void setAuthor(SimpleUserIn author) {
        this.author = author;
    }

    public WorkTableIssuseListResponseBodyIssueList withDeveloper(SimpleUserIn developer) {
        this.developer = developer;
        return this;
    }

    public WorkTableIssuseListResponseBodyIssueList withDeveloper(Consumer<SimpleUserIn> developerSetter) {
        if (this.developer == null) {
            this.developer = new SimpleUserIn();
            developerSetter.accept(this.developer);
        }

        return this;
    }

    /**
     * Get developer
     * @return developer
     */
    public SimpleUserIn getDeveloper() {
        return developer;
    }

    public void setDeveloper(SimpleUserIn developer) {
        this.developer = developer;
    }

    public WorkTableIssuseListResponseBodyIssueList withCloseder(SimpleUserIn closeder) {
        this.closeder = closeder;
        return this;
    }

    public WorkTableIssuseListResponseBodyIssueList withCloseder(Consumer<SimpleUserIn> closederSetter) {
        if (this.closeder == null) {
            this.closeder = new SimpleUserIn();
            closederSetter.accept(this.closeder);
        }

        return this;
    }

    /**
     * Get closeder
     * @return closeder
     */
    public SimpleUserIn getCloseder() {
        return closeder;
    }

    public void setCloseder(SimpleUserIn closeder) {
        this.closeder = closeder;
    }

    public WorkTableIssuseListResponseBodyIssueList withStatus(WorkTableIssuseListResponseBodyStatus status) {
        this.status = status;
        return this;
    }

    public WorkTableIssuseListResponseBodyIssueList withStatus(
        Consumer<WorkTableIssuseListResponseBodyStatus> statusSetter) {
        if (this.status == null) {
            this.status = new WorkTableIssuseListResponseBodyStatus();
            statusSetter.accept(this.status);
        }

        return this;
    }

    /**
     * Get status
     * @return status
     */
    public WorkTableIssuseListResponseBodyStatus getStatus() {
        return status;
    }

    public void setStatus(WorkTableIssuseListResponseBodyStatus status) {
        this.status = status;
    }

    public WorkTableIssuseListResponseBodyIssueList withDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    /**
     * 是否删除工作项
     * @return deleted
     */
    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public WorkTableIssuseListResponseBodyIssueList withIsWatcher(Boolean isWatcher) {
        this.isWatcher = isWatcher;
        return this;
    }

    /**
     * 是否关注工作项
     * @return isWatcher
     */
    public Boolean getIsWatcher() {
        return isWatcher;
    }

    public void setIsWatcher(Boolean isWatcher) {
        this.isWatcher = isWatcher;
    }

    public WorkTableIssuseListResponseBodyIssueList withClosedFlag(Integer closedFlag) {
        this.closedFlag = closedFlag;
        return this;
    }

    /**
     * 关闭标志
     * @return closedFlag
     */
    public Integer getClosedFlag() {
        return closedFlag;
    }

    public void setClosedFlag(Integer closedFlag) {
        this.closedFlag = closedFlag;
    }

    public WorkTableIssuseListResponseBodyIssueList withCreatedOn(String createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * 工作项新建时间戳
     * @return createdOn
     */
    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public WorkTableIssuseListResponseBodyIssueList withUpdatedOn(String updatedOn) {
        this.updatedOn = updatedOn;
        return this;
    }

    /**
     * 工作项更新时间戳
     * @return updatedOn
     */
    public String getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(String updatedOn) {
        this.updatedOn = updatedOn;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WorkTableIssuseListResponseBodyIssueList workTableIssuseListResponseBodyIssueList =
            (WorkTableIssuseListResponseBodyIssueList) o;
        return Objects.equals(this.id, workTableIssuseListResponseBodyIssueList.id)
            && Objects.equals(this.subject, workTableIssuseListResponseBodyIssueList.subject)
            && Objects.equals(this.parentIssueId, workTableIssuseListResponseBodyIssueList.parentIssueId)
            && Objects.equals(this.parentIssue, workTableIssuseListResponseBodyIssueList.parentIssue)
            && Objects.equals(this.project, workTableIssuseListResponseBodyIssueList.project)
            && Objects.equals(this.releaseDev, workTableIssuseListResponseBodyIssueList.releaseDev)
            && Objects.equals(this.findReleaseDev, workTableIssuseListResponseBodyIssueList.findReleaseDev)
            && Objects.equals(this.doneRatio, workTableIssuseListResponseBodyIssueList.doneRatio)
            && Objects.equals(this.expectedWorkHours, workTableIssuseListResponseBodyIssueList.expectedWorkHours)
            && Objects.equals(this.actualWorkHours, workTableIssuseListResponseBodyIssueList.actualWorkHours)
            && Objects.equals(this.tracker, workTableIssuseListResponseBodyIssueList.tracker)
            && Objects.equals(this.order, workTableIssuseListResponseBodyIssueList.order)
            && Objects.equals(this.severity, workTableIssuseListResponseBodyIssueList.severity)
            && Objects.equals(this.priority, workTableIssuseListResponseBodyIssueList.priority)
            && Objects.equals(this.domain, workTableIssuseListResponseBodyIssueList.domain)
            && Objects.equals(this.position, workTableIssuseListResponseBodyIssueList.position)
            && Objects.equals(this.module, workTableIssuseListResponseBodyIssueList.module)
            && Objects.equals(this.assignedTo, workTableIssuseListResponseBodyIssueList.assignedTo)
            && Objects.equals(this.author, workTableIssuseListResponseBodyIssueList.author)
            && Objects.equals(this.developer, workTableIssuseListResponseBodyIssueList.developer)
            && Objects.equals(this.closeder, workTableIssuseListResponseBodyIssueList.closeder)
            && Objects.equals(this.status, workTableIssuseListResponseBodyIssueList.status)
            && Objects.equals(this.deleted, workTableIssuseListResponseBodyIssueList.deleted)
            && Objects.equals(this.isWatcher, workTableIssuseListResponseBodyIssueList.isWatcher)
            && Objects.equals(this.closedFlag, workTableIssuseListResponseBodyIssueList.closedFlag)
            && Objects.equals(this.createdOn, workTableIssuseListResponseBodyIssueList.createdOn)
            && Objects.equals(this.updatedOn, workTableIssuseListResponseBodyIssueList.updatedOn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            subject,
            parentIssueId,
            parentIssue,
            project,
            releaseDev,
            findReleaseDev,
            doneRatio,
            expectedWorkHours,
            actualWorkHours,
            tracker,
            order,
            severity,
            priority,
            domain,
            position,
            module,
            assignedTo,
            author,
            developer,
            closeder,
            status,
            deleted,
            isWatcher,
            closedFlag,
            createdOn,
            updatedOn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkTableIssuseListResponseBodyIssueList {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
        sb.append("    parentIssueId: ").append(toIndentedString(parentIssueId)).append("\n");
        sb.append("    parentIssue: ").append(toIndentedString(parentIssue)).append("\n");
        sb.append("    project: ").append(toIndentedString(project)).append("\n");
        sb.append("    releaseDev: ").append(toIndentedString(releaseDev)).append("\n");
        sb.append("    findReleaseDev: ").append(toIndentedString(findReleaseDev)).append("\n");
        sb.append("    doneRatio: ").append(toIndentedString(doneRatio)).append("\n");
        sb.append("    expectedWorkHours: ").append(toIndentedString(expectedWorkHours)).append("\n");
        sb.append("    actualWorkHours: ").append(toIndentedString(actualWorkHours)).append("\n");
        sb.append("    tracker: ").append(toIndentedString(tracker)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
        sb.append("    module: ").append(toIndentedString(module)).append("\n");
        sb.append("    assignedTo: ").append(toIndentedString(assignedTo)).append("\n");
        sb.append("    author: ").append(toIndentedString(author)).append("\n");
        sb.append("    developer: ").append(toIndentedString(developer)).append("\n");
        sb.append("    closeder: ").append(toIndentedString(closeder)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
        sb.append("    isWatcher: ").append(toIndentedString(isWatcher)).append("\n");
        sb.append("    closedFlag: ").append(toIndentedString(closedFlag)).append("\n");
        sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
        sb.append("    updatedOn: ").append(toIndentedString(updatedOn)).append("\n");
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
