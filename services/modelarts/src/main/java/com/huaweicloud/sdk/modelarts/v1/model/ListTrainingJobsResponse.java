package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListTrainingJobsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_by")

    private String sortBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order")

    private String order;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_by")

    private String groupBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ai_project")

    private String aiProject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "train_type")

    private String trainType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "items")

    private List<JobResponse> items = null;

    public ListTrainingJobsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 查询到当前用户名下的所有作业总数。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListTrainingJobsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 查询到当前用户名下的所有符合查询条件的作业总数。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListTrainingJobsResponse withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询作业的每页条目数。最小为1，最大为50。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListTrainingJobsResponse withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 查询作业的页数，最小为0。例如设置为0，则表示从第一页开始查询。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListTrainingJobsResponse withSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }

    /**
     * 查询作业排列顺序的指标。默认使用create_time排序。
     * @return sortBy
     */
    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public ListTrainingJobsResponse withOrder(String order) {
        this.order = order;
        return this;
    }

    /**
     * 查询作业排列顺序，默认为“desc”，降序排序。也可以选择对应的“asc”，升序排序。
     * @return order
     */
    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public ListTrainingJobsResponse withGroupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }

    /**
     * 查询作业要搜索的分组条件。
     * @return groupBy
     */
    public String getGroupBy() {
        return groupBy;
    }

    public void setGroupBy(String groupBy) {
        this.groupBy = groupBy;
    }

    public ListTrainingJobsResponse withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 作业所处的工作空间，默认值为“0”。
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public ListTrainingJobsResponse withAiProject(String aiProject) {
        this.aiProject = aiProject;
        return this;
    }

    /**
     * 作业所属的ai项目，默认值为\"default-ai-project\"。
     * @return aiProject
     */
    public String getAiProject() {
        return aiProject;
    }

    public void setAiProject(String aiProject) {
        this.aiProject = aiProject;
    }

    public ListTrainingJobsResponse withTrainType(String trainType) {
        this.trainType = trainType;
        return this;
    }

    /**
     * **参数解释**：在开启自定义作业和精调作业联合查询时，只显示自定义或精调作业。 **取值范围**：     - job: 只查自定义作业     - ftjob : 只查精调作业
     * @return trainType
     */
    public String getTrainType() {
        return trainType;
    }

    public void setTrainType(String trainType) {
        this.trainType = trainType;
    }

    public ListTrainingJobsResponse withItems(List<JobResponse> items) {
        this.items = items;
        return this;
    }

    public ListTrainingJobsResponse addItemsItem(JobResponse itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    public ListTrainingJobsResponse withItems(Consumer<List<JobResponse>> itemsSetter) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        itemsSetter.accept(this.items);
        return this;
    }

    /**
     * 查询到当前用户名下的所有符合查询条件的作业详情。
     * @return items
     */
    public List<JobResponse> getItems() {
        return items;
    }

    public void setItems(List<JobResponse> items) {
        this.items = items;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTrainingJobsResponse that = (ListTrainingJobsResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.count, that.count)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.sortBy, that.sortBy) && Objects.equals(this.order, that.order)
            && Objects.equals(this.groupBy, that.groupBy) && Objects.equals(this.workspaceId, that.workspaceId)
            && Objects.equals(this.aiProject, that.aiProject) && Objects.equals(this.trainType, that.trainType)
            && Objects.equals(this.items, that.items);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(total, count, limit, offset, sortBy, order, groupBy, workspaceId, aiProject, trainType, items);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTrainingJobsResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    aiProject: ").append(toIndentedString(aiProject)).append("\n");
        sb.append("    trainType: ").append(toIndentedString(trainType)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
