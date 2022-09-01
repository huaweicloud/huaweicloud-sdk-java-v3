package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListIssueRequestV4
 */
public class ListIssueRequestV4 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assigned_ids")

    @JacksonXmlProperty(localName = "assigned_ids")

    private List<Integer> assignedIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_ids")

    @JacksonXmlProperty(localName = "creator_ids")

    private List<Integer> creatorIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "developer_ids")

    @JacksonXmlProperty(localName = "developer_ids")

    private List<Integer> developerIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_ids")

    @JacksonXmlProperty(localName = "domain_ids")

    private List<Integer> domainIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "done_ratios")

    @JacksonXmlProperty(localName = "done_ratios")

    private List<Integer> doneRatios = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iteration_ids")

    @JacksonXmlProperty(localName = "iteration_ids")

    private List<Integer> iterationIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    @JacksonXmlProperty(localName = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    @JacksonXmlProperty(localName = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "module_ids")

    @JacksonXmlProperty(localName = "module_ids")

    private List<Integer> moduleIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority_ids")

    @JacksonXmlProperty(localName = "priority_ids")

    private List<Integer> priorityIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_type")

    @JacksonXmlProperty(localName = "query_type")

    private String queryType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity_ids")

    @JacksonXmlProperty(localName = "severity_ids")

    private List<Integer> severityIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_ids")

    @JacksonXmlProperty(localName = "status_ids")

    private List<Integer> statusIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "story_point_ids")

    @JacksonXmlProperty(localName = "story_point_ids")

    private List<Integer> storyPointIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tracker_ids")

    @JacksonXmlProperty(localName = "tracker_ids")

    private List<Integer> trackerIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "include_deleted")

    @JacksonXmlProperty(localName = "include_deleted")

    private Boolean includeDeleted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_time_interval")

    @JacksonXmlProperty(localName = "updated_time_interval")

    private String updatedTimeInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_fields")

    @JacksonXmlProperty(localName = "custom_fields")

    private List<ListIssueRequestV4CustomFields> customFields = null;

    public ListIssueRequestV4 withAssignedIds(List<Integer> assignedIds) {
        this.assignedIds = assignedIds;
        return this;
    }

    public ListIssueRequestV4 addAssignedIdsItem(Integer assignedIdsItem) {
        if (this.assignedIds == null) {
            this.assignedIds = new ArrayList<>();
        }
        this.assignedIds.add(assignedIdsItem);
        return this;
    }

    public ListIssueRequestV4 withAssignedIds(Consumer<List<Integer>> assignedIdsSetter) {
        if (this.assignedIds == null) {
            this.assignedIds = new ArrayList<>();
        }
        assignedIdsSetter.accept(this.assignedIds);
        return this;
    }

    /**
     * 处理人id
     * @return assignedIds
     */
    public List<Integer> getAssignedIds() {
        return assignedIds;
    }

    public void setAssignedIds(List<Integer> assignedIds) {
        this.assignedIds = assignedIds;
    }

    public ListIssueRequestV4 withCreatorIds(List<Integer> creatorIds) {
        this.creatorIds = creatorIds;
        return this;
    }

    public ListIssueRequestV4 addCreatorIdsItem(Integer creatorIdsItem) {
        if (this.creatorIds == null) {
            this.creatorIds = new ArrayList<>();
        }
        this.creatorIds.add(creatorIdsItem);
        return this;
    }

    public ListIssueRequestV4 withCreatorIds(Consumer<List<Integer>> creatorIdsSetter) {
        if (this.creatorIds == null) {
            this.creatorIds = new ArrayList<>();
        }
        creatorIdsSetter.accept(this.creatorIds);
        return this;
    }

    /**
     * 创建者id
     * @return creatorIds
     */
    public List<Integer> getCreatorIds() {
        return creatorIds;
    }

    public void setCreatorIds(List<Integer> creatorIds) {
        this.creatorIds = creatorIds;
    }

    public ListIssueRequestV4 withDeveloperIds(List<Integer> developerIds) {
        this.developerIds = developerIds;
        return this;
    }

    public ListIssueRequestV4 addDeveloperIdsItem(Integer developerIdsItem) {
        if (this.developerIds == null) {
            this.developerIds = new ArrayList<>();
        }
        this.developerIds.add(developerIdsItem);
        return this;
    }

    public ListIssueRequestV4 withDeveloperIds(Consumer<List<Integer>> developerIdsSetter) {
        if (this.developerIds == null) {
            this.developerIds = new ArrayList<>();
        }
        developerIdsSetter.accept(this.developerIds);
        return this;
    }

    /**
     * 开发人id,对应用户信息的数字id
     * @return developerIds
     */
    public List<Integer> getDeveloperIds() {
        return developerIds;
    }

    public void setDeveloperIds(List<Integer> developerIds) {
        this.developerIds = developerIds;
    }

    public ListIssueRequestV4 withDomainIds(List<Integer> domainIds) {
        this.domainIds = domainIds;
        return this;
    }

    public ListIssueRequestV4 addDomainIdsItem(Integer domainIdsItem) {
        if (this.domainIds == null) {
            this.domainIds = new ArrayList<>();
        }
        this.domainIds.add(domainIdsItem);
        return this;
    }

    public ListIssueRequestV4 withDomainIds(Consumer<List<Integer>> domainIdsSetter) {
        if (this.domainIds == null) {
            this.domainIds = new ArrayList<>();
        }
        domainIdsSetter.accept(this.domainIds);
        return this;
    }

    /**
     * id, 领域, 14 '性能', 15 '功能', 16 '可靠性', 17 '网络安全', 18 '可维护性', 19 '其他DFX', 20 '可用性',
     * @return domainIds
     */
    public List<Integer> getDomainIds() {
        return domainIds;
    }

    public void setDomainIds(List<Integer> domainIds) {
        this.domainIds = domainIds;
    }

    public ListIssueRequestV4 withDoneRatios(List<Integer> doneRatios) {
        this.doneRatios = doneRatios;
        return this;
    }

    public ListIssueRequestV4 addDoneRatiosItem(Integer doneRatiosItem) {
        if (this.doneRatios == null) {
            this.doneRatios = new ArrayList<>();
        }
        this.doneRatios.add(doneRatiosItem);
        return this;
    }

    public ListIssueRequestV4 withDoneRatios(Consumer<List<Integer>> doneRatiosSetter) {
        if (this.doneRatios == null) {
            this.doneRatios = new ArrayList<>();
        }
        doneRatiosSetter.accept(this.doneRatios);
        return this;
    }

    /**
     * 完成度
     * @return doneRatios
     */
    public List<Integer> getDoneRatios() {
        return doneRatios;
    }

    public void setDoneRatios(List<Integer> doneRatios) {
        this.doneRatios = doneRatios;
    }

    public ListIssueRequestV4 withIterationIds(List<Integer> iterationIds) {
        this.iterationIds = iterationIds;
        return this;
    }

    public ListIssueRequestV4 addIterationIdsItem(Integer iterationIdsItem) {
        if (this.iterationIds == null) {
            this.iterationIds = new ArrayList<>();
        }
        this.iterationIds.add(iterationIdsItem);
        return this;
    }

    public ListIssueRequestV4 withIterationIds(Consumer<List<Integer>> iterationIdsSetter) {
        if (this.iterationIds == null) {
            this.iterationIds = new ArrayList<>();
        }
        iterationIdsSetter.accept(this.iterationIds);
        return this;
    }

    /**
     * 迭代id
     * @return iterationIds
     */
    public List<Integer> getIterationIds() {
        return iterationIds;
    }

    public void setIterationIds(List<Integer> iterationIds) {
        this.iterationIds = iterationIds;
    }

    public ListIssueRequestV4 withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示数量
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListIssueRequestV4 withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 分页索引，偏移量，offset是limit的整数倍数，limit=10,offset=0,10,20...
     * minimum: 0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListIssueRequestV4 withModuleIds(List<Integer> moduleIds) {
        this.moduleIds = moduleIds;
        return this;
    }

    public ListIssueRequestV4 addModuleIdsItem(Integer moduleIdsItem) {
        if (this.moduleIds == null) {
            this.moduleIds = new ArrayList<>();
        }
        this.moduleIds.add(moduleIdsItem);
        return this;
    }

    public ListIssueRequestV4 withModuleIds(Consumer<List<Integer>> moduleIdsSetter) {
        if (this.moduleIds == null) {
            this.moduleIds = new ArrayList<>();
        }
        moduleIdsSetter.accept(this.moduleIds);
        return this;
    }

    /**
     * 模块id
     * @return moduleIds
     */
    public List<Integer> getModuleIds() {
        return moduleIds;
    }

    public void setModuleIds(List<Integer> moduleIds) {
        this.moduleIds = moduleIds;
    }

    public ListIssueRequestV4 withPriorityIds(List<Integer> priorityIds) {
        this.priorityIds = priorityIds;
        return this;
    }

    public ListIssueRequestV4 addPriorityIdsItem(Integer priorityIdsItem) {
        if (this.priorityIds == null) {
            this.priorityIds = new ArrayList<>();
        }
        this.priorityIds.add(priorityIdsItem);
        return this;
    }

    public ListIssueRequestV4 withPriorityIds(Consumer<List<Integer>> priorityIdsSetter) {
        if (this.priorityIds == null) {
            this.priorityIds = new ArrayList<>();
        }
        priorityIdsSetter.accept(this.priorityIds);
        return this;
    }

    /**
     * 优先级
     * @return priorityIds
     */
    public List<Integer> getPriorityIds() {
        return priorityIds;
    }

    public void setPriorityIds(List<Integer> priorityIds) {
        this.priorityIds = priorityIds;
    }

    public ListIssueRequestV4 withQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }

    /**
     * 查询类型 backlog feature epic
     * @return queryType
     */
    public String getQueryType() {
        return queryType;
    }

    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }

    public ListIssueRequestV4 withSeverityIds(List<Integer> severityIds) {
        this.severityIds = severityIds;
        return this;
    }

    public ListIssueRequestV4 addSeverityIdsItem(Integer severityIdsItem) {
        if (this.severityIds == null) {
            this.severityIds = new ArrayList<>();
        }
        this.severityIds.add(severityIdsItem);
        return this;
    }

    public ListIssueRequestV4 withSeverityIds(Consumer<List<Integer>> severityIdsSetter) {
        if (this.severityIds == null) {
            this.severityIds = new ArrayList<>();
        }
        severityIdsSetter.accept(this.severityIds);
        return this;
    }

    /**
     * 查询类型
     * @return severityIds
     */
    public List<Integer> getSeverityIds() {
        return severityIds;
    }

    public void setSeverityIds(List<Integer> severityIds) {
        this.severityIds = severityIds;
    }

    public ListIssueRequestV4 withStatusIds(List<Integer> statusIds) {
        this.statusIds = statusIds;
        return this;
    }

    public ListIssueRequestV4 addStatusIdsItem(Integer statusIdsItem) {
        if (this.statusIds == null) {
            this.statusIds = new ArrayList<>();
        }
        this.statusIds.add(statusIdsItem);
        return this;
    }

    public ListIssueRequestV4 withStatusIds(Consumer<List<Integer>> statusIdsSetter) {
        if (this.statusIds == null) {
            this.statusIds = new ArrayList<>();
        }
        statusIdsSetter.accept(this.statusIds);
        return this;
    }

    /**
     * 状态   id, 新建   1, 进行中 2, 已解决 3, 测试中 4, 已关闭 5, 已拒绝 6,
     * @return statusIds
     */
    public List<Integer> getStatusIds() {
        return statusIds;
    }

    public void setStatusIds(List<Integer> statusIds) {
        this.statusIds = statusIds;
    }

    public ListIssueRequestV4 withStoryPointIds(List<Integer> storyPointIds) {
        this.storyPointIds = storyPointIds;
        return this;
    }

    public ListIssueRequestV4 addStoryPointIdsItem(Integer storyPointIdsItem) {
        if (this.storyPointIds == null) {
            this.storyPointIds = new ArrayList<>();
        }
        this.storyPointIds.add(storyPointIdsItem);
        return this;
    }

    public ListIssueRequestV4 withStoryPointIds(Consumer<List<Integer>> storyPointIdsSetter) {
        if (this.storyPointIds == null) {
            this.storyPointIds = new ArrayList<>();
        }
        storyPointIdsSetter.accept(this.storyPointIds);
        return this;
    }

    /**
     * 故事点id
     * @return storyPointIds
     */
    public List<Integer> getStoryPointIds() {
        return storyPointIds;
    }

    public void setStoryPointIds(List<Integer> storyPointIds) {
        this.storyPointIds = storyPointIds;
    }

    public ListIssueRequestV4 withTrackerIds(List<Integer> trackerIds) {
        this.trackerIds = trackerIds;
        return this;
    }

    public ListIssueRequestV4 addTrackerIdsItem(Integer trackerIdsItem) {
        if (this.trackerIds == null) {
            this.trackerIds = new ArrayList<>();
        }
        this.trackerIds.add(trackerIdsItem);
        return this;
    }

    public ListIssueRequestV4 withTrackerIds(Consumer<List<Integer>> trackerIdsSetter) {
        if (this.trackerIds == null) {
            this.trackerIds = new ArrayList<>();
        }
        trackerIdsSetter.accept(this.trackerIds);
        return this;
    }

    /**
     * 工作项类型,2任务/Task,3缺陷/Bug,5Epic,6Feature,7Story
     * @return trackerIds
     */
    public List<Integer> getTrackerIds() {
        return trackerIds;
    }

    public void setTrackerIds(List<Integer> trackerIds) {
        this.trackerIds = trackerIds;
    }

    public ListIssueRequestV4 withIncludeDeleted(Boolean includeDeleted) {
        this.includeDeleted = includeDeleted;
        return this;
    }

    /**
     * true 查询的工作项包含已经逻辑删除的，false 查询的工作项不包含已经删除的
     * @return includeDeleted
     */
    public Boolean getIncludeDeleted() {
        return includeDeleted;
    }

    public void setIncludeDeleted(Boolean includeDeleted) {
        this.includeDeleted = includeDeleted;
    }

    public ListIssueRequestV4 withUpdatedTimeInterval(String updatedTimeInterval) {
        this.updatedTimeInterval = updatedTimeInterval;
        return this;
    }

    /**
     * 根据工作项的更新时间查询工作项，(查询的起始时间,查询的结束时间)
     * @return updatedTimeInterval
     */
    public String getUpdatedTimeInterval() {
        return updatedTimeInterval;
    }

    public void setUpdatedTimeInterval(String updatedTimeInterval) {
        this.updatedTimeInterval = updatedTimeInterval;
    }

    public ListIssueRequestV4 withCustomFields(List<ListIssueRequestV4CustomFields> customFields) {
        this.customFields = customFields;
        return this;
    }

    public ListIssueRequestV4 addCustomFieldsItem(ListIssueRequestV4CustomFields customFieldsItem) {
        if (this.customFields == null) {
            this.customFields = new ArrayList<>();
        }
        this.customFields.add(customFieldsItem);
        return this;
    }

    public ListIssueRequestV4 withCustomFields(Consumer<List<ListIssueRequestV4CustomFields>> customFieldsSetter) {
        if (this.customFields == null) {
            this.customFields = new ArrayList<>();
        }
        customFieldsSetter.accept(this.customFields);
        return this;
    }

    /**
     * 自定义字段
     * @return customFields
     */
    public List<ListIssueRequestV4CustomFields> getCustomFields() {
        return customFields;
    }

    public void setCustomFields(List<ListIssueRequestV4CustomFields> customFields) {
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
        ListIssueRequestV4 listIssueRequestV4 = (ListIssueRequestV4) o;
        return Objects.equals(this.assignedIds, listIssueRequestV4.assignedIds)
            && Objects.equals(this.creatorIds, listIssueRequestV4.creatorIds)
            && Objects.equals(this.developerIds, listIssueRequestV4.developerIds)
            && Objects.equals(this.domainIds, listIssueRequestV4.domainIds)
            && Objects.equals(this.doneRatios, listIssueRequestV4.doneRatios)
            && Objects.equals(this.iterationIds, listIssueRequestV4.iterationIds)
            && Objects.equals(this.limit, listIssueRequestV4.limit)
            && Objects.equals(this.offset, listIssueRequestV4.offset)
            && Objects.equals(this.moduleIds, listIssueRequestV4.moduleIds)
            && Objects.equals(this.priorityIds, listIssueRequestV4.priorityIds)
            && Objects.equals(this.queryType, listIssueRequestV4.queryType)
            && Objects.equals(this.severityIds, listIssueRequestV4.severityIds)
            && Objects.equals(this.statusIds, listIssueRequestV4.statusIds)
            && Objects.equals(this.storyPointIds, listIssueRequestV4.storyPointIds)
            && Objects.equals(this.trackerIds, listIssueRequestV4.trackerIds)
            && Objects.equals(this.includeDeleted, listIssueRequestV4.includeDeleted)
            && Objects.equals(this.updatedTimeInterval, listIssueRequestV4.updatedTimeInterval)
            && Objects.equals(this.customFields, listIssueRequestV4.customFields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assignedIds,
            creatorIds,
            developerIds,
            domainIds,
            doneRatios,
            iterationIds,
            limit,
            offset,
            moduleIds,
            priorityIds,
            queryType,
            severityIds,
            statusIds,
            storyPointIds,
            trackerIds,
            includeDeleted,
            updatedTimeInterval,
            customFields);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListIssueRequestV4 {\n");
        sb.append("    assignedIds: ").append(toIndentedString(assignedIds)).append("\n");
        sb.append("    creatorIds: ").append(toIndentedString(creatorIds)).append("\n");
        sb.append("    developerIds: ").append(toIndentedString(developerIds)).append("\n");
        sb.append("    domainIds: ").append(toIndentedString(domainIds)).append("\n");
        sb.append("    doneRatios: ").append(toIndentedString(doneRatios)).append("\n");
        sb.append("    iterationIds: ").append(toIndentedString(iterationIds)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    moduleIds: ").append(toIndentedString(moduleIds)).append("\n");
        sb.append("    priorityIds: ").append(toIndentedString(priorityIds)).append("\n");
        sb.append("    queryType: ").append(toIndentedString(queryType)).append("\n");
        sb.append("    severityIds: ").append(toIndentedString(severityIds)).append("\n");
        sb.append("    statusIds: ").append(toIndentedString(statusIds)).append("\n");
        sb.append("    storyPointIds: ").append(toIndentedString(storyPointIds)).append("\n");
        sb.append("    trackerIds: ").append(toIndentedString(trackerIds)).append("\n");
        sb.append("    includeDeleted: ").append(toIndentedString(includeDeleted)).append("\n");
        sb.append("    updatedTimeInterval: ").append(toIndentedString(updatedTimeInterval)).append("\n");
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
