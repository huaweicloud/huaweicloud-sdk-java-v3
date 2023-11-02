package com.huaweicloud.sdk.koomap.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListCommonWorkspaceRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_ids")

    private List<String> workspaceIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_name")

    private String workspaceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "star")

    private Boolean star;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time_from")

    private String createTimeFrom;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time_to")

    private String createTimeTo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time_from")

    private String updateTimeFrom;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time_to")

    private String updateTimeTo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_by")

    private String orderBy;

    public ListCommonWorkspaceRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量。查询时忽略的记录数量。
     * minimum: 0
     * maximum: 2147483647
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListCommonWorkspaceRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 分页大小。
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

    public ListCommonWorkspaceRequest withWorkspaceIds(List<String> workspaceIds) {
        this.workspaceIds = workspaceIds;
        return this;
    }

    public ListCommonWorkspaceRequest addWorkspaceIdsItem(String workspaceIdsItem) {
        if (this.workspaceIds == null) {
            this.workspaceIds = new ArrayList<>();
        }
        this.workspaceIds.add(workspaceIdsItem);
        return this;
    }

    public ListCommonWorkspaceRequest withWorkspaceIds(Consumer<List<String>> workspaceIdsSetter) {
        if (this.workspaceIds == null) {
            this.workspaceIds = new ArrayList<>();
        }
        workspaceIdsSetter.accept(this.workspaceIds);
        return this;
    }

    /**
     * 根据工作共享空间ID查询。
     * @return workspaceIds
     */
    public List<String> getWorkspaceIds() {
        return workspaceIds;
    }

    public void setWorkspaceIds(List<String> workspaceIds) {
        this.workspaceIds = workspaceIds;
    }

    public ListCommonWorkspaceRequest withWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }

    /**
     * 工作共享空间名称。支持模糊查询。
     * @return workspaceName
     */
    public String getWorkspaceName() {
        return workspaceName;
    }

    public void setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
    }

    public ListCommonWorkspaceRequest withStar(Boolean star) {
        this.star = star;
        return this;
    }

    /**
     * 工作共享空间是否置顶显示（最多可置顶4个）。 - 0：否 - 1：是
     * @return star
     */
    public Boolean getStar() {
        return star;
    }

    public void setStar(Boolean star) {
        this.star = star;
    }

    public ListCommonWorkspaceRequest withCreateTimeFrom(String createTimeFrom) {
        this.createTimeFrom = createTimeFrom;
        return this;
    }

    /**
     * 创建工作共享空间的起始时间。查询在该时间之后创建的工作共享空间。接收UTC时间格式字符串，格式为yyyy-MM-dd'T'HH:mm:ss'Z'。
     * @return createTimeFrom
     */
    public String getCreateTimeFrom() {
        return createTimeFrom;
    }

    public void setCreateTimeFrom(String createTimeFrom) {
        this.createTimeFrom = createTimeFrom;
    }

    public ListCommonWorkspaceRequest withCreateTimeTo(String createTimeTo) {
        this.createTimeTo = createTimeTo;
        return this;
    }

    /**
     * 创建工作共享空间的截止时间。查询在该时间之前创建的工作共享空间。接收UTC时间格式字符串，格式为yyyy-MM-dd'T'HH:mm:ss'Z'。
     * @return createTimeTo
     */
    public String getCreateTimeTo() {
        return createTimeTo;
    }

    public void setCreateTimeTo(String createTimeTo) {
        this.createTimeTo = createTimeTo;
    }

    public ListCommonWorkspaceRequest withUpdateTimeFrom(String updateTimeFrom) {
        this.updateTimeFrom = updateTimeFrom;
        return this;
    }

    /**
     * 更新工作共享空间的起始时间。查询在该时间之后更新的工作共享空间。接收UTC时间格式字符串，格式为yyyy-MM-dd'T'HH:mm:ss'Z'。
     * @return updateTimeFrom
     */
    public String getUpdateTimeFrom() {
        return updateTimeFrom;
    }

    public void setUpdateTimeFrom(String updateTimeFrom) {
        this.updateTimeFrom = updateTimeFrom;
    }

    public ListCommonWorkspaceRequest withUpdateTimeTo(String updateTimeTo) {
        this.updateTimeTo = updateTimeTo;
        return this;
    }

    /**
     * 更新工作共享空间的截止时间。查询在该时间之前更新的工作共享空间。接收UTC时间格式字符串，格式为yyyy-MM-dd'T'HH:mm:ss'Z'。
     * @return updateTimeTo
     */
    public String getUpdateTimeTo() {
        return updateTimeTo;
    }

    public void setUpdateTimeTo(String updateTimeTo) {
        this.updateTimeTo = updateTimeTo;
    }

    public ListCommonWorkspaceRequest withOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    /**
     * 排序字段。置顶空间默认排列在列表最前面，并且根据该排序字段组合排序。  - create_time_asc：按照创建时间升序排列。 - create_time_desc：按照创建时间降序排列。
     * @return orderBy
     */
    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCommonWorkspaceRequest that = (ListCommonWorkspaceRequest) obj;
        return Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.workspaceIds, that.workspaceIds)
            && Objects.equals(this.workspaceName, that.workspaceName) && Objects.equals(this.star, that.star)
            && Objects.equals(this.createTimeFrom, that.createTimeFrom)
            && Objects.equals(this.createTimeTo, that.createTimeTo)
            && Objects.equals(this.updateTimeFrom, that.updateTimeFrom)
            && Objects.equals(this.updateTimeTo, that.updateTimeTo) && Objects.equals(this.orderBy, that.orderBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offset,
            limit,
            workspaceIds,
            workspaceName,
            star,
            createTimeFrom,
            createTimeTo,
            updateTimeFrom,
            updateTimeTo,
            orderBy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCommonWorkspaceRequest {\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    workspaceIds: ").append(toIndentedString(workspaceIds)).append("\n");
        sb.append("    workspaceName: ").append(toIndentedString(workspaceName)).append("\n");
        sb.append("    star: ").append(toIndentedString(star)).append("\n");
        sb.append("    createTimeFrom: ").append(toIndentedString(createTimeFrom)).append("\n");
        sb.append("    createTimeTo: ").append(toIndentedString(createTimeTo)).append("\n");
        sb.append("    updateTimeFrom: ").append(toIndentedString(updateTimeFrom)).append("\n");
        sb.append("    updateTimeTo: ").append(toIndentedString(updateTimeTo)).append("\n");
        sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
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
