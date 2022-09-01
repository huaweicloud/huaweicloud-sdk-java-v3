package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * IssueItemSfV4
 */
public class IssueItemSfV4 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actual_work_hours")

    @JacksonXmlProperty(localName = "actual_work_hours")

    private Double actualWorkHours;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assigned_user")

    @JacksonXmlProperty(localName = "assigned_user")

    private IssueUser assignedUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "author")

    @JacksonXmlProperty(localName = "author")

    private IssueUser author;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    @JacksonXmlProperty(localName = "begin_time")

    private Long beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "closed_time")

    @JacksonXmlProperty(localName = "closed_time")

    private Long closedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    @JacksonXmlProperty(localName = "created_time")

    private Long createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_feilds")

    @JacksonXmlProperty(localName = "custom_feilds")

    private List<CustomFeildRecord> customFeilds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "developer")

    @JacksonXmlProperty(localName = "developer")

    private IssueUser developer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "discover_version")

    @JacksonXmlProperty(localName = "discover_version")

    private String discoverVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    @JacksonXmlProperty(localName = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "done_ratio")

    @JacksonXmlProperty(localName = "done_ratio")

    private Integer doneRatio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expected_work_hours")

    @JacksonXmlProperty(localName = "expected_work_hours")

    private Double expectedWorkHours;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order")

    @JacksonXmlProperty(localName = "order")

    private Integer order;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_issue_id")

    @JacksonXmlProperty(localName = "parent_issue_id")

    private Integer parentIssueId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "release_version")

    @JacksonXmlProperty(localName = "release_version")

    private String releaseVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "root_issue_id")

    @JacksonXmlProperty(localName = "root_issue_id")

    private Integer rootIssueId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "story_point")

    @JacksonXmlProperty(localName = "story_point")

    private IssueItemSfV4StoryPoint storyPoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    @JacksonXmlProperty(localName = "domain")

    private IssueItemSfV4Domain domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iteration")

    @JacksonXmlProperty(localName = "iteration")

    private IssueItemSfV4Iteration iteration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "module")

    @JacksonXmlProperty(localName = "module")

    private IssueItemSfV4Module module;

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

    private IssueItemSfV4Tracker tracker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subject")

    @JacksonXmlProperty(localName = "subject")

    private String subject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_time")

    @JacksonXmlProperty(localName = "updated_time")

    private Long updatedTime;

    public IssueItemSfV4 withActualWorkHours(Double actualWorkHours) {
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

    public IssueItemSfV4 withAssignedUser(IssueUser assignedUser) {
        this.assignedUser = assignedUser;
        return this;
    }

    public IssueItemSfV4 withAssignedUser(Consumer<IssueUser> assignedUserSetter) {
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

    public IssueItemSfV4 withAuthor(IssueUser author) {
        this.author = author;
        return this;
    }

    public IssueItemSfV4 withAuthor(Consumer<IssueUser> authorSetter) {
        if (this.author == null) {
            this.author = new IssueUser();
            authorSetter.accept(this.author);
        }

        return this;
    }

    /**
     * Get author
     * @return author
     */
    public IssueUser getAuthor() {
        return author;
    }

    public void setAuthor(IssueUser author) {
        this.author = author;
    }

    public IssueItemSfV4 withBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * 工作项开始时间
     * @return beginTime
     */
    public Long getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
    }

    public IssueItemSfV4 withClosedTime(Long closedTime) {
        this.closedTime = closedTime;
        return this;
    }

    /**
     * 关闭工作项的时间
     * @return closedTime
     */
    public Long getClosedTime() {
        return closedTime;
    }

    public void setClosedTime(Long closedTime) {
        this.closedTime = closedTime;
    }

    public IssueItemSfV4 withCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * 创建时间
     * @return createdTime
     */
    public Long getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
    }

    public IssueItemSfV4 withCustomFeilds(List<CustomFeildRecord> customFeilds) {
        this.customFeilds = customFeilds;
        return this;
    }

    public IssueItemSfV4 addCustomFeildsItem(CustomFeildRecord customFeildsItem) {
        if (this.customFeilds == null) {
            this.customFeilds = new ArrayList<>();
        }
        this.customFeilds.add(customFeildsItem);
        return this;
    }

    public IssueItemSfV4 withCustomFeilds(Consumer<List<CustomFeildRecord>> customFeildsSetter) {
        if (this.customFeilds == null) {
            this.customFeilds = new ArrayList<>();
        }
        customFeildsSetter.accept(this.customFeilds);
        return this;
    }

    /**
     * 自定义属性
     * @return customFeilds
     */
    public List<CustomFeildRecord> getCustomFeilds() {
        return customFeilds;
    }

    public void setCustomFeilds(List<CustomFeildRecord> customFeilds) {
        this.customFeilds = customFeilds;
    }

    public IssueItemSfV4 withDeveloper(IssueUser developer) {
        this.developer = developer;
        return this;
    }

    public IssueItemSfV4 withDeveloper(Consumer<IssueUser> developerSetter) {
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

    public IssueItemSfV4 withDiscoverVersion(String discoverVersion) {
        this.discoverVersion = discoverVersion;
        return this;
    }

    /**
     * 发现问题的版本
     * @return discoverVersion
     */
    public String getDiscoverVersion() {
        return discoverVersion;
    }

    public void setDiscoverVersion(String discoverVersion) {
        this.discoverVersion = discoverVersion;
    }

    public IssueItemSfV4 withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 工作项结束时间
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public IssueItemSfV4 withDoneRatio(Integer doneRatio) {
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

    public IssueItemSfV4 withExpectedWorkHours(Double expectedWorkHours) {
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

    public IssueItemSfV4 withOrder(Integer order) {
        this.order = order;
        return this;
    }

    /**
     * 顺序
     * minimum: 1
     * maximum: 100
     * @return order
     */
    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public IssueItemSfV4 withParentIssueId(Integer parentIssueId) {
        this.parentIssueId = parentIssueId;
        return this;
    }

    /**
     * 父工作项的id
     * @return parentIssueId
     */
    public Integer getParentIssueId() {
        return parentIssueId;
    }

    public void setParentIssueId(Integer parentIssueId) {
        this.parentIssueId = parentIssueId;
    }

    public IssueItemSfV4 withReleaseVersion(String releaseVersion) {
        this.releaseVersion = releaseVersion;
        return this;
    }

    /**
     * 发布的版本
     * @return releaseVersion
     */
    public String getReleaseVersion() {
        return releaseVersion;
    }

    public void setReleaseVersion(String releaseVersion) {
        this.releaseVersion = releaseVersion;
    }

    public IssueItemSfV4 withRootIssueId(Integer rootIssueId) {
        this.rootIssueId = rootIssueId;
        return this;
    }

    /**
     * 根工作项的id
     * @return rootIssueId
     */
    public Integer getRootIssueId() {
        return rootIssueId;
    }

    public void setRootIssueId(Integer rootIssueId) {
        this.rootIssueId = rootIssueId;
    }

    public IssueItemSfV4 withStoryPoint(IssueItemSfV4StoryPoint storyPoint) {
        this.storyPoint = storyPoint;
        return this;
    }

    public IssueItemSfV4 withStoryPoint(Consumer<IssueItemSfV4StoryPoint> storyPointSetter) {
        if (this.storyPoint == null) {
            this.storyPoint = new IssueItemSfV4StoryPoint();
            storyPointSetter.accept(this.storyPoint);
        }

        return this;
    }

    /**
     * Get storyPoint
     * @return storyPoint
     */
    public IssueItemSfV4StoryPoint getStoryPoint() {
        return storyPoint;
    }

    public void setStoryPoint(IssueItemSfV4StoryPoint storyPoint) {
        this.storyPoint = storyPoint;
    }

    public IssueItemSfV4 withDomain(IssueItemSfV4Domain domain) {
        this.domain = domain;
        return this;
    }

    public IssueItemSfV4 withDomain(Consumer<IssueItemSfV4Domain> domainSetter) {
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

    public IssueItemSfV4 withIteration(IssueItemSfV4Iteration iteration) {
        this.iteration = iteration;
        return this;
    }

    public IssueItemSfV4 withIteration(Consumer<IssueItemSfV4Iteration> iterationSetter) {
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

    public IssueItemSfV4 withModule(IssueItemSfV4Module module) {
        this.module = module;
        return this;
    }

    public IssueItemSfV4 withModule(Consumer<IssueItemSfV4Module> moduleSetter) {
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

    public IssueItemSfV4 withPriority(IssueItemSfV4Priority priority) {
        this.priority = priority;
        return this;
    }

    public IssueItemSfV4 withPriority(Consumer<IssueItemSfV4Priority> prioritySetter) {
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

    public IssueItemSfV4 withSeverity(IssueItemSfV4Severity severity) {
        this.severity = severity;
        return this;
    }

    public IssueItemSfV4 withSeverity(Consumer<IssueItemSfV4Severity> severitySetter) {
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

    public IssueItemSfV4 withStatus(IssueItemSfV4Status status) {
        this.status = status;
        return this;
    }

    public IssueItemSfV4 withStatus(Consumer<IssueItemSfV4Status> statusSetter) {
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

    public IssueItemSfV4 withTracker(IssueItemSfV4Tracker tracker) {
        this.tracker = tracker;
        return this;
    }

    public IssueItemSfV4 withTracker(Consumer<IssueItemSfV4Tracker> trackerSetter) {
        if (this.tracker == null) {
            this.tracker = new IssueItemSfV4Tracker();
            trackerSetter.accept(this.tracker);
        }

        return this;
    }

    /**
     * Get tracker
     * @return tracker
     */
    public IssueItemSfV4Tracker getTracker() {
        return tracker;
    }

    public void setTracker(IssueItemSfV4Tracker tracker) {
        this.tracker = tracker;
    }

    public IssueItemSfV4 withSubject(String subject) {
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

    public IssueItemSfV4 withUpdatedTime(Long updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    /**
     * 工作项更新时间
     * @return updatedTime
     */
    public Long getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Long updatedTime) {
        this.updatedTime = updatedTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IssueItemSfV4 issueItemSfV4 = (IssueItemSfV4) o;
        return Objects.equals(this.actualWorkHours, issueItemSfV4.actualWorkHours)
            && Objects.equals(this.assignedUser, issueItemSfV4.assignedUser)
            && Objects.equals(this.author, issueItemSfV4.author)
            && Objects.equals(this.beginTime, issueItemSfV4.beginTime)
            && Objects.equals(this.closedTime, issueItemSfV4.closedTime)
            && Objects.equals(this.createdTime, issueItemSfV4.createdTime)
            && Objects.equals(this.customFeilds, issueItemSfV4.customFeilds)
            && Objects.equals(this.developer, issueItemSfV4.developer)
            && Objects.equals(this.discoverVersion, issueItemSfV4.discoverVersion)
            && Objects.equals(this.endTime, issueItemSfV4.endTime)
            && Objects.equals(this.doneRatio, issueItemSfV4.doneRatio)
            && Objects.equals(this.expectedWorkHours, issueItemSfV4.expectedWorkHours)
            && Objects.equals(this.order, issueItemSfV4.order)
            && Objects.equals(this.parentIssueId, issueItemSfV4.parentIssueId)
            && Objects.equals(this.releaseVersion, issueItemSfV4.releaseVersion)
            && Objects.equals(this.rootIssueId, issueItemSfV4.rootIssueId)
            && Objects.equals(this.storyPoint, issueItemSfV4.storyPoint)
            && Objects.equals(this.domain, issueItemSfV4.domain)
            && Objects.equals(this.iteration, issueItemSfV4.iteration)
            && Objects.equals(this.module, issueItemSfV4.module)
            && Objects.equals(this.priority, issueItemSfV4.priority)
            && Objects.equals(this.severity, issueItemSfV4.severity)
            && Objects.equals(this.status, issueItemSfV4.status) && Objects.equals(this.tracker, issueItemSfV4.tracker)
            && Objects.equals(this.subject, issueItemSfV4.subject)
            && Objects.equals(this.updatedTime, issueItemSfV4.updatedTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actualWorkHours,
            assignedUser,
            author,
            beginTime,
            closedTime,
            createdTime,
            customFeilds,
            developer,
            discoverVersion,
            endTime,
            doneRatio,
            expectedWorkHours,
            order,
            parentIssueId,
            releaseVersion,
            rootIssueId,
            storyPoint,
            domain,
            iteration,
            module,
            priority,
            severity,
            status,
            tracker,
            subject,
            updatedTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssueItemSfV4 {\n");
        sb.append("    actualWorkHours: ").append(toIndentedString(actualWorkHours)).append("\n");
        sb.append("    assignedUser: ").append(toIndentedString(assignedUser)).append("\n");
        sb.append("    author: ").append(toIndentedString(author)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    closedTime: ").append(toIndentedString(closedTime)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    customFeilds: ").append(toIndentedString(customFeilds)).append("\n");
        sb.append("    developer: ").append(toIndentedString(developer)).append("\n");
        sb.append("    discoverVersion: ").append(toIndentedString(discoverVersion)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    doneRatio: ").append(toIndentedString(doneRatio)).append("\n");
        sb.append("    expectedWorkHours: ").append(toIndentedString(expectedWorkHours)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("    parentIssueId: ").append(toIndentedString(parentIssueId)).append("\n");
        sb.append("    releaseVersion: ").append(toIndentedString(releaseVersion)).append("\n");
        sb.append("    rootIssueId: ").append(toIndentedString(rootIssueId)).append("\n");
        sb.append("    storyPoint: ").append(toIndentedString(storyPoint)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    iteration: ").append(toIndentedString(iteration)).append("\n");
        sb.append("    module: ").append(toIndentedString(module)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    tracker: ").append(toIndentedString(tracker)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
        sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
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
