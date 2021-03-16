package com.huaweicloud.sdk.projectman.v4.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ListIssueRequestV4
 */
public class ListIssueRequestV4  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="assigned_ids")
    
    private List<Integer> assignedIds = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="creator_ids")
    
    private List<Integer> creatorIds = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="developer_ids")
    
    private List<Integer> developerIds = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain_ids")
    
    private List<Integer> domainIds = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="done_ratios")
    
    private List<Integer> doneRatios = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="iteration_ids")
    
    private List<Integer> iterationIds = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="module_ids")
    
    private List<Integer> moduleIds = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="priority_ids")
    
    private List<Integer> priorityIds = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="query_type")
    
    private String queryType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="severity_ids")
    
    private List<Integer> severityIds = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status_ids")
    
    private List<Integer> statusIds = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="story_point_ids")
    
    private List<Integer> storyPointIds = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tracker_ids")
    
    private List<Integer> trackerIds = null;
    
    public ListIssueRequestV4 withAssignedIds(List<Integer> assignedIds) {
        this.assignedIds = assignedIds;
        return this;
    }

    
    public ListIssueRequestV4 addAssignedIdsItem(Integer assignedIdsItem) {
        this.assignedIds.add(assignedIdsItem);
        return this;
    }

    public ListIssueRequestV4 withAssignedIds(Consumer<List<Integer>> assignedIdsSetter) {
        if(this.assignedIds == null ){
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
        this.creatorIds.add(creatorIdsItem);
        return this;
    }

    public ListIssueRequestV4 withCreatorIds(Consumer<List<Integer>> creatorIdsSetter) {
        if(this.creatorIds == null ){
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
        this.developerIds.add(developerIdsItem);
        return this;
    }

    public ListIssueRequestV4 withDeveloperIds(Consumer<List<Integer>> developerIdsSetter) {
        if(this.developerIds == null ){
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
        this.domainIds.add(domainIdsItem);
        return this;
    }

    public ListIssueRequestV4 withDomainIds(Consumer<List<Integer>> domainIdsSetter) {
        if(this.domainIds == null ){
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
        this.doneRatios.add(doneRatiosItem);
        return this;
    }

    public ListIssueRequestV4 withDoneRatios(Consumer<List<Integer>> doneRatiosSetter) {
        if(this.doneRatios == null ){
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
        this.iterationIds.add(iterationIdsItem);
        return this;
    }

    public ListIssueRequestV4 withIterationIds(Consumer<List<Integer>> iterationIdsSetter) {
        if(this.iterationIds == null ){
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
        this.moduleIds.add(moduleIdsItem);
        return this;
    }

    public ListIssueRequestV4 withModuleIds(Consumer<List<Integer>> moduleIdsSetter) {
        if(this.moduleIds == null ){
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
        this.priorityIds.add(priorityIdsItem);
        return this;
    }

    public ListIssueRequestV4 withPriorityIds(Consumer<List<Integer>> priorityIdsSetter) {
        if(this.priorityIds == null ){
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
        this.severityIds.add(severityIdsItem);
        return this;
    }

    public ListIssueRequestV4 withSeverityIds(Consumer<List<Integer>> severityIdsSetter) {
        if(this.severityIds == null ){
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
        this.statusIds.add(statusIdsItem);
        return this;
    }

    public ListIssueRequestV4 withStatusIds(Consumer<List<Integer>> statusIdsSetter) {
        if(this.statusIds == null ){
            this.statusIds = new ArrayList<>();
        }
        statusIdsSetter.accept(this.statusIds);
        return this;
    }

    /**
     * 状态   id, 开始   1, 进行中 2, 已解决 3, 测试中 4, 已关闭 5, 已解决 6,
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
        this.storyPointIds.add(storyPointIdsItem);
        return this;
    }

    public ListIssueRequestV4 withStoryPointIds(Consumer<List<Integer>> storyPointIdsSetter) {
        if(this.storyPointIds == null ){
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
        this.trackerIds.add(trackerIdsItem);
        return this;
    }

    public ListIssueRequestV4 withTrackerIds(Consumer<List<Integer>> trackerIdsSetter) {
        if(this.trackerIds == null ){
            this.trackerIds = new ArrayList<>();
        }
        trackerIdsSetter.accept(this.trackerIds);
        return this;
    }

    /**
     * 工作项类型,2任务/task,3缺陷/bug,5epic,6feature,7story
     * @return trackerIds
     */
    public List<Integer> getTrackerIds() {
        return trackerIds;
    }

    public void setTrackerIds(List<Integer> trackerIds) {
        this.trackerIds = trackerIds;
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
        return Objects.equals(this.assignedIds, listIssueRequestV4.assignedIds) &&
            Objects.equals(this.creatorIds, listIssueRequestV4.creatorIds) &&
            Objects.equals(this.developerIds, listIssueRequestV4.developerIds) &&
            Objects.equals(this.domainIds, listIssueRequestV4.domainIds) &&
            Objects.equals(this.doneRatios, listIssueRequestV4.doneRatios) &&
            Objects.equals(this.iterationIds, listIssueRequestV4.iterationIds) &&
            Objects.equals(this.limit, listIssueRequestV4.limit) &&
            Objects.equals(this.offset, listIssueRequestV4.offset) &&
            Objects.equals(this.moduleIds, listIssueRequestV4.moduleIds) &&
            Objects.equals(this.priorityIds, listIssueRequestV4.priorityIds) &&
            Objects.equals(this.queryType, listIssueRequestV4.queryType) &&
            Objects.equals(this.severityIds, listIssueRequestV4.severityIds) &&
            Objects.equals(this.statusIds, listIssueRequestV4.statusIds) &&
            Objects.equals(this.storyPointIds, listIssueRequestV4.storyPointIds) &&
            Objects.equals(this.trackerIds, listIssueRequestV4.trackerIds);
    }
    @Override
    public int hashCode() {
        return Objects.hash(assignedIds, creatorIds, developerIds, domainIds, doneRatios, iterationIds, limit, offset, moduleIds, priorityIds, queryType, severityIds, statusIds, storyPointIds, trackerIds);
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

