package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Workitems
 */
public class Workitems {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actual_work_hours")

    private Double actualWorkHours;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assigned_user")

    private WorkitemUser assignedUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "author")

    private WorkitemUser author;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private String beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private String createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<WorkitemsTags> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "developer")

    private WorkitemUser developer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assigned_cc_user")

    private List<WorkitemUser> assignedCcUser = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "discover_version")

    private String discoverVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "done_ratio")

    private String doneRatio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expected_work_hours")

    private Double expectedWorkHours;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order")

    private String order;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_work_item_id")

    private String parentWorkItemId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "release_version")

    private String releaseVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "story_point")

    private String storyPoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private WorkitemsDomain domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iteration")

    private WorkitemsIteration iteration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "module")

    private WorkitemsModule module;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private String priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private String severity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private WorkitemsStatus status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subject")

    private String subject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_time")

    private String updatedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sequence")

    private String sequence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "important")

    private String important;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_fields")

    private List<WorkitemCustomField> customFields = null;

    public Workitems withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 工作项id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Workitems withDescription(String description) {
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

    public Workitems withActualWorkHours(Double actualWorkHours) {
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

    public Workitems withAssignedUser(WorkitemUser assignedUser) {
        this.assignedUser = assignedUser;
        return this;
    }

    public Workitems withAssignedUser(Consumer<WorkitemUser> assignedUserSetter) {
        if (this.assignedUser == null) {
            this.assignedUser = new WorkitemUser();
            assignedUserSetter.accept(this.assignedUser);
        }

        return this;
    }

    /**
     * Get assignedUser
     * @return assignedUser
     */
    public WorkitemUser getAssignedUser() {
        return assignedUser;
    }

    public void setAssignedUser(WorkitemUser assignedUser) {
        this.assignedUser = assignedUser;
    }

    public Workitems withAuthor(WorkitemUser author) {
        this.author = author;
        return this;
    }

    public Workitems withAuthor(Consumer<WorkitemUser> authorSetter) {
        if (this.author == null) {
            this.author = new WorkitemUser();
            authorSetter.accept(this.author);
        }

        return this;
    }

    /**
     * Get author
     * @return author
     */
    public WorkitemUser getAuthor() {
        return author;
    }

    public void setAuthor(WorkitemUser author) {
        this.author = author;
    }

    public Workitems withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * 工作项开始时间
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public Workitems withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * 创建时间
     * @return createdTime
     */
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public Workitems withTags(List<WorkitemsTags> tags) {
        this.tags = tags;
        return this;
    }

    public Workitems addTagsItem(WorkitemsTags tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public Workitems withTags(Consumer<List<WorkitemsTags>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签
     * @return tags
     */
    public List<WorkitemsTags> getTags() {
        return tags;
    }

    public void setTags(List<WorkitemsTags> tags) {
        this.tags = tags;
    }

    public Workitems withDeveloper(WorkitemUser developer) {
        this.developer = developer;
        return this;
    }

    public Workitems withDeveloper(Consumer<WorkitemUser> developerSetter) {
        if (this.developer == null) {
            this.developer = new WorkitemUser();
            developerSetter.accept(this.developer);
        }

        return this;
    }

    /**
     * Get developer
     * @return developer
     */
    public WorkitemUser getDeveloper() {
        return developer;
    }

    public void setDeveloper(WorkitemUser developer) {
        this.developer = developer;
    }

    public Workitems withAssignedCcUser(List<WorkitemUser> assignedCcUser) {
        this.assignedCcUser = assignedCcUser;
        return this;
    }

    public Workitems addAssignedCcUserItem(WorkitemUser assignedCcUserItem) {
        if (this.assignedCcUser == null) {
            this.assignedCcUser = new ArrayList<>();
        }
        this.assignedCcUser.add(assignedCcUserItem);
        return this;
    }

    public Workitems withAssignedCcUser(Consumer<List<WorkitemUser>> assignedCcUserSetter) {
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
    public List<WorkitemUser> getAssignedCcUser() {
        return assignedCcUser;
    }

    public void setAssignedCcUser(List<WorkitemUser> assignedCcUser) {
        this.assignedCcUser = assignedCcUser;
    }

    public Workitems withDiscoverVersion(String discoverVersion) {
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

    public Workitems withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 工作项结束时间
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Workitems withDoneRatio(String doneRatio) {
        this.doneRatio = doneRatio;
        return this;
    }

    /**
     * 工作项进度值
     * @return doneRatio
     */
    public String getDoneRatio() {
        return doneRatio;
    }

    public void setDoneRatio(String doneRatio) {
        this.doneRatio = doneRatio;
    }

    public Workitems withExpectedWorkHours(Double expectedWorkHours) {
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

    public Workitems withOrder(String order) {
        this.order = order;
        return this;
    }

    /**
     * 顺序
     * @return order
     */
    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public Workitems withParentWorkItemId(String parentWorkItemId) {
        this.parentWorkItemId = parentWorkItemId;
        return this;
    }

    /**
     * 父工作项的id
     * @return parentWorkItemId
     */
    public String getParentWorkItemId() {
        return parentWorkItemId;
    }

    public void setParentWorkItemId(String parentWorkItemId) {
        this.parentWorkItemId = parentWorkItemId;
    }

    public Workitems withReleaseVersion(String releaseVersion) {
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

    public Workitems withStoryPoint(String storyPoint) {
        this.storyPoint = storyPoint;
        return this;
    }

    /**
     * 故事点
     * @return storyPoint
     */
    public String getStoryPoint() {
        return storyPoint;
    }

    public void setStoryPoint(String storyPoint) {
        this.storyPoint = storyPoint;
    }

    public Workitems withDomain(WorkitemsDomain domain) {
        this.domain = domain;
        return this;
    }

    public Workitems withDomain(Consumer<WorkitemsDomain> domainSetter) {
        if (this.domain == null) {
            this.domain = new WorkitemsDomain();
            domainSetter.accept(this.domain);
        }

        return this;
    }

    /**
     * Get domain
     * @return domain
     */
    public WorkitemsDomain getDomain() {
        return domain;
    }

    public void setDomain(WorkitemsDomain domain) {
        this.domain = domain;
    }

    public Workitems withIteration(WorkitemsIteration iteration) {
        this.iteration = iteration;
        return this;
    }

    public Workitems withIteration(Consumer<WorkitemsIteration> iterationSetter) {
        if (this.iteration == null) {
            this.iteration = new WorkitemsIteration();
            iterationSetter.accept(this.iteration);
        }

        return this;
    }

    /**
     * Get iteration
     * @return iteration
     */
    public WorkitemsIteration getIteration() {
        return iteration;
    }

    public void setIteration(WorkitemsIteration iteration) {
        this.iteration = iteration;
    }

    public Workitems withModule(WorkitemsModule module) {
        this.module = module;
        return this;
    }

    public Workitems withModule(Consumer<WorkitemsModule> moduleSetter) {
        if (this.module == null) {
            this.module = new WorkitemsModule();
            moduleSetter.accept(this.module);
        }

        return this;
    }

    /**
     * Get module
     * @return module
     */
    public WorkitemsModule getModule() {
        return module;
    }

    public void setModule(WorkitemsModule module) {
        this.module = module;
    }

    public Workitems withPriority(String priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 工作项优先级
     * @return priority
     */
    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public Workitems withSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * 严重的程度 \"提示\", \"一般\", \"严重\", \"致命\"
     * @return severity
     */
    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public Workitems withStatus(WorkitemsStatus status) {
        this.status = status;
        return this;
    }

    public Workitems withStatus(Consumer<WorkitemsStatus> statusSetter) {
        if (this.status == null) {
            this.status = new WorkitemsStatus();
            statusSetter.accept(this.status);
        }

        return this;
    }

    /**
     * Get status
     * @return status
     */
    public WorkitemsStatus getStatus() {
        return status;
    }

    public void setStatus(WorkitemsStatus status) {
        this.status = status;
    }

    public Workitems withSubject(String subject) {
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

    public Workitems withUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    /**
     * 更新时间
     * @return updatedTime
     */
    public String getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }

    public Workitems withSequence(String sequence) {
        this.sequence = sequence;
        return this;
    }

    /**
     * 工作项编号
     * @return sequence
     */
    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    public Workitems withImportant(String important) {
        this.important = important;
        return this;
    }

    /**
     * 重要程度 \"关键\", \"重要\", \"一般\", \"提示\"
     * @return important
     */
    public String getImportant() {
        return important;
    }

    public void setImportant(String important) {
        this.important = important;
    }

    public Workitems withCustomFields(List<WorkitemCustomField> customFields) {
        this.customFields = customFields;
        return this;
    }

    public Workitems addCustomFieldsItem(WorkitemCustomField customFieldsItem) {
        if (this.customFields == null) {
            this.customFields = new ArrayList<>();
        }
        this.customFields.add(customFieldsItem);
        return this;
    }

    public Workitems withCustomFields(Consumer<List<WorkitemCustomField>> customFieldsSetter) {
        if (this.customFields == null) {
            this.customFields = new ArrayList<>();
        }
        customFieldsSetter.accept(this.customFields);
        return this;
    }

    /**
     * 用户自定义字段
     * @return customFields
     */
    public List<WorkitemCustomField> getCustomFields() {
        return customFields;
    }

    public void setCustomFields(List<WorkitemCustomField> customFields) {
        this.customFields = customFields;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Workitems workitems = (Workitems) o;
        return Objects.equals(this.id, workitems.id) && Objects.equals(this.description, workitems.description)
            && Objects.equals(this.actualWorkHours, workitems.actualWorkHours)
            && Objects.equals(this.assignedUser, workitems.assignedUser)
            && Objects.equals(this.author, workitems.author) && Objects.equals(this.beginTime, workitems.beginTime)
            && Objects.equals(this.createdTime, workitems.createdTime) && Objects.equals(this.tags, workitems.tags)
            && Objects.equals(this.developer, workitems.developer)
            && Objects.equals(this.assignedCcUser, workitems.assignedCcUser)
            && Objects.equals(this.discoverVersion, workitems.discoverVersion)
            && Objects.equals(this.endTime, workitems.endTime) && Objects.equals(this.doneRatio, workitems.doneRatio)
            && Objects.equals(this.expectedWorkHours, workitems.expectedWorkHours)
            && Objects.equals(this.order, workitems.order)
            && Objects.equals(this.parentWorkItemId, workitems.parentWorkItemId)
            && Objects.equals(this.releaseVersion, workitems.releaseVersion)
            && Objects.equals(this.storyPoint, workitems.storyPoint) && Objects.equals(this.domain, workitems.domain)
            && Objects.equals(this.iteration, workitems.iteration) && Objects.equals(this.module, workitems.module)
            && Objects.equals(this.priority, workitems.priority) && Objects.equals(this.severity, workitems.severity)
            && Objects.equals(this.status, workitems.status) && Objects.equals(this.subject, workitems.subject)
            && Objects.equals(this.updatedTime, workitems.updatedTime)
            && Objects.equals(this.sequence, workitems.sequence) && Objects.equals(this.important, workitems.important)
            && Objects.equals(this.customFields, workitems.customFields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            description,
            actualWorkHours,
            assignedUser,
            author,
            beginTime,
            createdTime,
            tags,
            developer,
            assignedCcUser,
            discoverVersion,
            endTime,
            doneRatio,
            expectedWorkHours,
            order,
            parentWorkItemId,
            releaseVersion,
            storyPoint,
            domain,
            iteration,
            module,
            priority,
            severity,
            status,
            subject,
            updatedTime,
            sequence,
            important,
            customFields);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Workitems {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    actualWorkHours: ").append(toIndentedString(actualWorkHours)).append("\n");
        sb.append("    assignedUser: ").append(toIndentedString(assignedUser)).append("\n");
        sb.append("    author: ").append(toIndentedString(author)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    developer: ").append(toIndentedString(developer)).append("\n");
        sb.append("    assignedCcUser: ").append(toIndentedString(assignedCcUser)).append("\n");
        sb.append("    discoverVersion: ").append(toIndentedString(discoverVersion)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    doneRatio: ").append(toIndentedString(doneRatio)).append("\n");
        sb.append("    expectedWorkHours: ").append(toIndentedString(expectedWorkHours)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("    parentWorkItemId: ").append(toIndentedString(parentWorkItemId)).append("\n");
        sb.append("    releaseVersion: ").append(toIndentedString(releaseVersion)).append("\n");
        sb.append("    storyPoint: ").append(toIndentedString(storyPoint)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    iteration: ").append(toIndentedString(iteration)).append("\n");
        sb.append("    module: ").append(toIndentedString(module)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
        sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
        sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
        sb.append("    important: ").append(toIndentedString(important)).append("\n");
        sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
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
