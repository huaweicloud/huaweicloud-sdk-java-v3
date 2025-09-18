package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询流水线列表请求体
 */
public class ListPipelineQuery {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_ids")

    private List<String> projectIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_id")

    private String componentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private List<String> status = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_publish")

    private Boolean isPublish;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_id")

    private String creatorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_ids")

    private List<String> creatorIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executor_ids")

    private List<String> executorIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Long offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Long limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_key")

    private String sortKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_dir")

    private String sortDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_path_id")

    private String groupPathId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "by_group")

    private Boolean byGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_banned")

    private Boolean isBanned;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_new")

    private Boolean queryNew;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_level_list")

    private List<Integer> securityLevelList = null;

    public ListPipelineQuery withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释**： CodeArts项目ID。 **约束限制**： 不涉及。 **取值范围**： 每个项目ID为32位字符，由数字和字母组成。 **默认取值**： 不涉及。 
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ListPipelineQuery withProjectIds(List<String> projectIds) {
        this.projectIds = projectIds;
        return this;
    }

    public ListPipelineQuery addProjectIdsItem(String projectIdsItem) {
        if (this.projectIds == null) {
            this.projectIds = new ArrayList<>();
        }
        this.projectIds.add(projectIdsItem);
        return this;
    }

    public ListPipelineQuery withProjectIds(Consumer<List<String>> projectIdsSetter) {
        if (this.projectIds == null) {
            this.projectIds = new ArrayList<>();
        }
        projectIdsSetter.accept(this.projectIds);
        return this;
    }

    /**
     * **参数解释**： CodeArts项目ID列表。 **约束限制**： 不涉及。 **取值范围**： 每个项目ID为32位字符，由数字和字母组成。 **默认取值**： 不涉及。 
     * @return projectIds
     */
    public List<String> getProjectIds() {
        return projectIds;
    }

    public void setProjectIds(List<String> projectIds) {
        this.projectIds = projectIds;
    }

    public ListPipelineQuery withComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }

    /**
     * **参数解释**： 微服务ID。可以通过[查询微服务列表](ListMicroservice.xml)接口获取，其中data.id即为微服务ID。 **约束限制**： 不涉及。 **取值范围**： 32位字符串。 **默认取值**： 不涉及。 
     * @return componentId
     */
    public String getComponentId() {
        return componentId;
    }

    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

    public ListPipelineQuery withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 流水线名称，支持模糊查询。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListPipelineQuery withStatus(List<String> status) {
        this.status = status;
        return this;
    }

    public ListPipelineQuery addStatusItem(String statusItem) {
        if (this.status == null) {
            this.status = new ArrayList<>();
        }
        this.status.add(statusItem);
        return this;
    }

    public ListPipelineQuery withStatus(Consumer<List<String>> statusSetter) {
        if (this.status == null) {
            this.status = new ArrayList<>();
        }
        statusSetter.accept(this.status);
        return this;
    }

    /**
     * **参数解释**： 流水线状态列表。 **约束限制**： 不涉及。 **取值范围**： - COMPLETED：已完成。 - RUNNING：运行中。 - FAILED：失败。 - CANCELED：取消。 - PAUSED：暂停。 - SUSPEND：挂起。 - IGNORED：忽略。 **默认取值**： 不涉及。 
     * @return status
     */
    public List<String> getStatus() {
        return status;
    }

    public void setStatus(List<String> status) {
        this.status = status;
    }

    public ListPipelineQuery withIsPublish(Boolean isPublish) {
        this.isPublish = isPublish;
        return this;
    }

    /**
     * **参数解释**： 是否为变更流水线。 **约束限制**： 不涉及。 **取值范围**： - true：是变更流水线。 - false：非变更流水线。 **默认取值**： 不涉及。 
     * @return isPublish
     */
    public Boolean getIsPublish() {
        return isPublish;
    }

    public void setIsPublish(Boolean isPublish) {
        this.isPublish = isPublish;
    }

    public ListPipelineQuery withCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    /**
     * **参数解释**： 创建人ID，用户的userId。 **约束限制**： 不涉及。 **取值范围**： 每个ID为32位字符串。 **默认取值**： 不涉及。 
     * @return creatorId
     */
    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public ListPipelineQuery withCreatorIds(List<String> creatorIds) {
        this.creatorIds = creatorIds;
        return this;
    }

    public ListPipelineQuery addCreatorIdsItem(String creatorIdsItem) {
        if (this.creatorIds == null) {
            this.creatorIds = new ArrayList<>();
        }
        this.creatorIds.add(creatorIdsItem);
        return this;
    }

    public ListPipelineQuery withCreatorIds(Consumer<List<String>> creatorIdsSetter) {
        if (this.creatorIds == null) {
            this.creatorIds = new ArrayList<>();
        }
        creatorIdsSetter.accept(this.creatorIds);
        return this;
    }

    /**
     * **参数解释**： 创建人ID列表。 **约束限制**： 不涉及。 **取值范围**： 每个ID为32位字符串。 **默认取值**： 不涉及。 
     * @return creatorIds
     */
    public List<String> getCreatorIds() {
        return creatorIds;
    }

    public void setCreatorIds(List<String> creatorIds) {
        this.creatorIds = creatorIds;
    }

    public ListPipelineQuery withExecutorIds(List<String> executorIds) {
        this.executorIds = executorIds;
        return this;
    }

    public ListPipelineQuery addExecutorIdsItem(String executorIdsItem) {
        if (this.executorIds == null) {
            this.executorIds = new ArrayList<>();
        }
        this.executorIds.add(executorIdsItem);
        return this;
    }

    public ListPipelineQuery withExecutorIds(Consumer<List<String>> executorIdsSetter) {
        if (this.executorIds == null) {
            this.executorIds = new ArrayList<>();
        }
        executorIdsSetter.accept(this.executorIds);
        return this;
    }

    /**
     * **参数解释**： 执行人ID列表。 **约束限制**： 不涉及。 **取值范围**： 每个ID为32位字符串。 **默认取值**： 不涉及。 
     * @return executorIds
     */
    public List<String> getExecutorIds() {
        return executorIds;
    }

    public void setExecutorIds(List<String> executorIds) {
        this.executorIds = executorIds;
    }

    public ListPipelineQuery withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释**： 流水线开始时间。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ListPipelineQuery withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释**： 流水线结束时间。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ListPipelineQuery withOffset(Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释**： 起始偏移。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return offset
     */
    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public ListPipelineQuery withLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**： 查询数量。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return limit
     */
    public Long getLimit() {
        return limit;
    }

    public void setLimit(Long limit) {
        this.limit = limit;
    }

    public ListPipelineQuery withSortKey(String sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    /**
     * **参数解释**： 排序字段名称。 **约束限制**： 不涉及。 **取值范围**： - name：流水线名。 - create_time：创建时间。 - update_time：更新时间。 **默认取值**： 不涉及。 
     * @return sortKey
     */
    public String getSortKey() {
        return sortKey;
    }

    public void setSortKey(String sortKey) {
        this.sortKey = sortKey;
    }

    public ListPipelineQuery withSortDir(String sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    /**
     * **参数解释**： 排序规则。 **约束限制**： 不涉及。 **取值范围**： - asc：按排序字段升序。 - desc：按排序字段降序。 **默认取值**： 不涉及。 
     * @return sortDir
     */
    public String getSortDir() {
        return sortDir;
    }

    public void setSortDir(String sortDir) {
        this.sortDir = sortDir;
    }

    public ListPipelineQuery withGroupPathId(String groupPathId) {
        this.groupPathId = groupPathId;
        return this;
    }

    /**
     * **参数解释**： 流水线分组ID。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return groupPathId
     */
    public String getGroupPathId() {
        return groupPathId;
    }

    public void setGroupPathId(String groupPathId) {
        this.groupPathId = groupPathId;
    }

    public ListPipelineQuery withByGroup(Boolean byGroup) {
        this.byGroup = byGroup;
        return this;
    }

    /**
     * **参数解释**： 是否分组查询。 **约束限制**： 不涉及。 **取值范围**： - true：是分组查询。 - false：不是分组查询。 **默认取值**： 不涉及。 
     * @return byGroup
     */
    public Boolean getByGroup() {
        return byGroup;
    }

    public void setByGroup(Boolean byGroup) {
        this.byGroup = byGroup;
    }

    public ListPipelineQuery withIsBanned(Boolean isBanned) {
        this.isBanned = isBanned;
        return this;
    }

    /**
     * **参数解释**： 是否包含被禁用的流水线。 **约束限制**： 不涉及。 **取值范围**： - true：包含被禁用的流水线。 - false：不包含被禁用的流水线。 **默认取值**： 不涉及。 
     * @return isBanned
     */
    public Boolean getIsBanned() {
        return isBanned;
    }

    public void setIsBanned(Boolean isBanned) {
        this.isBanned = isBanned;
    }

    public ListPipelineQuery withQueryNew(Boolean queryNew) {
        this.queryNew = queryNew;
        return this;
    }

    /**
     * **参数解释**： 是否只查询新版流水线。 **约束限制**： 不涉及。 **取值范围**： - true：只查询新版流水线。 - false：不只查询新版流水线。 **默认取值**： true。 
     * @return queryNew
     */
    public Boolean getQueryNew() {
        return queryNew;
    }

    public void setQueryNew(Boolean queryNew) {
        this.queryNew = queryNew;
    }

    public ListPipelineQuery withSecurityLevelList(List<Integer> securityLevelList) {
        this.securityLevelList = securityLevelList;
        return this;
    }

    public ListPipelineQuery addSecurityLevelListItem(Integer securityLevelListItem) {
        if (this.securityLevelList == null) {
            this.securityLevelList = new ArrayList<>();
        }
        this.securityLevelList.add(securityLevelListItem);
        return this;
    }

    public ListPipelineQuery withSecurityLevelList(Consumer<List<Integer>> securityLevelListSetter) {
        if (this.securityLevelList == null) {
            this.securityLevelList = new ArrayList<>();
        }
        securityLevelListSetter.accept(this.securityLevelList);
        return this;
    }

    /**
     * **参数解释**： 流水线密集等级。 **约束限制**： 非涉密场景无该字段。 **取值范围**： 零及以上正整数。 0：未设置密级。 1：最低密级。 **默认取值**： 不涉及。 
     * @return securityLevelList
     */
    public List<Integer> getSecurityLevelList() {
        return securityLevelList;
    }

    public void setSecurityLevelList(List<Integer> securityLevelList) {
        this.securityLevelList = securityLevelList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPipelineQuery that = (ListPipelineQuery) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.projectIds, that.projectIds)
            && Objects.equals(this.componentId, that.componentId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.status, that.status) && Objects.equals(this.isPublish, that.isPublish)
            && Objects.equals(this.creatorId, that.creatorId) && Objects.equals(this.creatorIds, that.creatorIds)
            && Objects.equals(this.executorIds, that.executorIds) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.sortKey, that.sortKey)
            && Objects.equals(this.sortDir, that.sortDir) && Objects.equals(this.groupPathId, that.groupPathId)
            && Objects.equals(this.byGroup, that.byGroup) && Objects.equals(this.isBanned, that.isBanned)
            && Objects.equals(this.queryNew, that.queryNew)
            && Objects.equals(this.securityLevelList, that.securityLevelList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId,
            projectIds,
            componentId,
            name,
            status,
            isPublish,
            creatorId,
            creatorIds,
            executorIds,
            startTime,
            endTime,
            offset,
            limit,
            sortKey,
            sortDir,
            groupPathId,
            byGroup,
            isBanned,
            queryNew,
            securityLevelList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPipelineQuery {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    projectIds: ").append(toIndentedString(projectIds)).append("\n");
        sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    isPublish: ").append(toIndentedString(isPublish)).append("\n");
        sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
        sb.append("    creatorIds: ").append(toIndentedString(creatorIds)).append("\n");
        sb.append("    executorIds: ").append(toIndentedString(executorIds)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
        sb.append("    groupPathId: ").append(toIndentedString(groupPathId)).append("\n");
        sb.append("    byGroup: ").append(toIndentedString(byGroup)).append("\n");
        sb.append("    isBanned: ").append(toIndentedString(isBanned)).append("\n");
        sb.append("    queryNew: ").append(toIndentedString(queryNew)).append("\n");
        sb.append("    securityLevelList: ").append(toIndentedString(securityLevelList)).append("\n");
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
