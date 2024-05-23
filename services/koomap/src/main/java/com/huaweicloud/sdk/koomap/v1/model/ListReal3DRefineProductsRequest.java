package com.huaweicloud.sdk.koomap.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListReal3DRefineProductsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "refine_product_id")

    private String refineProductId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subtask_name")

    private String subtaskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subtask_create_time_from")

    private String subtaskCreateTimeFrom;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subtask_create_time_to")

    private String subtaskCreateTimeTo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subtask_completed_time_from")

    private String subtaskCompletedTimeFrom;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subtask_completed_time_to")

    private String subtaskCompletedTimeTo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_by")

    private String orderBy;

    public ListReal3DRefineProductsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量。
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

    public ListReal3DRefineProductsRequest withLimit(Integer limit) {
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

    public ListReal3DRefineProductsRequest withRefineProductId(String refineProductId) {
        this.refineProductId = refineProductId;
        return this;
    }

    /**
     * 精修后处理成果数据ID。
     * @return refineProductId
     */
    public String getRefineProductId() {
        return refineProductId;
    }

    public void setRefineProductId(String refineProductId) {
        this.refineProductId = refineProductId;
    }

    public ListReal3DRefineProductsRequest withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * 原始实景三维建模任务名称。
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public ListReal3DRefineProductsRequest withSubtaskName(String subtaskName) {
        this.subtaskName = subtaskName;
        return this;
    }

    /**
     * 精修后处理任务别名。
     * @return subtaskName
     */
    public String getSubtaskName() {
        return subtaskName;
    }

    public void setSubtaskName(String subtaskName) {
        this.subtaskName = subtaskName;
    }

    public ListReal3DRefineProductsRequest withSubtaskCreateTimeFrom(String subtaskCreateTimeFrom) {
        this.subtaskCreateTimeFrom = subtaskCreateTimeFrom;
        return this;
    }

    /**
     * 精修后处理任务创建起始时间，为UTC时间格式字符串，格式为yyyy-MM-dd'T'HH:mm:ss'Z'。
     * @return subtaskCreateTimeFrom
     */
    public String getSubtaskCreateTimeFrom() {
        return subtaskCreateTimeFrom;
    }

    public void setSubtaskCreateTimeFrom(String subtaskCreateTimeFrom) {
        this.subtaskCreateTimeFrom = subtaskCreateTimeFrom;
    }

    public ListReal3DRefineProductsRequest withSubtaskCreateTimeTo(String subtaskCreateTimeTo) {
        this.subtaskCreateTimeTo = subtaskCreateTimeTo;
        return this;
    }

    /**
     * 精修后处理任务创建截止时间，为UTC时间格式字符串，格式为yyyy-MM-dd'T'HH:mm:ss'Z'。
     * @return subtaskCreateTimeTo
     */
    public String getSubtaskCreateTimeTo() {
        return subtaskCreateTimeTo;
    }

    public void setSubtaskCreateTimeTo(String subtaskCreateTimeTo) {
        this.subtaskCreateTimeTo = subtaskCreateTimeTo;
    }

    public ListReal3DRefineProductsRequest withSubtaskCompletedTimeFrom(String subtaskCompletedTimeFrom) {
        this.subtaskCompletedTimeFrom = subtaskCompletedTimeFrom;
        return this;
    }

    /**
     * 精修后处理任务完成起始时间，为UTC时间格式字符串，格式为yyyy-MM-dd'T'HH:mm:ss'Z'。
     * @return subtaskCompletedTimeFrom
     */
    public String getSubtaskCompletedTimeFrom() {
        return subtaskCompletedTimeFrom;
    }

    public void setSubtaskCompletedTimeFrom(String subtaskCompletedTimeFrom) {
        this.subtaskCompletedTimeFrom = subtaskCompletedTimeFrom;
    }

    public ListReal3DRefineProductsRequest withSubtaskCompletedTimeTo(String subtaskCompletedTimeTo) {
        this.subtaskCompletedTimeTo = subtaskCompletedTimeTo;
        return this;
    }

    /**
     * 精修后处理任务完成截止时间，为UTC时间格式字符串，格式为yyyy-MM-dd'T'HH:mm:ss'Z'。
     * @return subtaskCompletedTimeTo
     */
    public String getSubtaskCompletedTimeTo() {
        return subtaskCompletedTimeTo;
    }

    public void setSubtaskCompletedTimeTo(String subtaskCompletedTimeTo) {
        this.subtaskCompletedTimeTo = subtaskCompletedTimeTo;
    }

    public ListReal3DRefineProductsRequest withOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    /**
     * 排序参数，支持task_name_asc（原始实景三维建模任务名称增序）、task_name_desc（原始实景三维建模任务名称降序）、subtask_name_asc（精修后处理任务别名增序）、subtask_name_desc（精修后处理任务别名降序）。
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
        ListReal3DRefineProductsRequest that = (ListReal3DRefineProductsRequest) obj;
        return Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.refineProductId, that.refineProductId)
            && Objects.equals(this.taskName, that.taskName) && Objects.equals(this.subtaskName, that.subtaskName)
            && Objects.equals(this.subtaskCreateTimeFrom, that.subtaskCreateTimeFrom)
            && Objects.equals(this.subtaskCreateTimeTo, that.subtaskCreateTimeTo)
            && Objects.equals(this.subtaskCompletedTimeFrom, that.subtaskCompletedTimeFrom)
            && Objects.equals(this.subtaskCompletedTimeTo, that.subtaskCompletedTimeTo)
            && Objects.equals(this.orderBy, that.orderBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offset,
            limit,
            refineProductId,
            taskName,
            subtaskName,
            subtaskCreateTimeFrom,
            subtaskCreateTimeTo,
            subtaskCompletedTimeFrom,
            subtaskCompletedTimeTo,
            orderBy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListReal3DRefineProductsRequest {\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    refineProductId: ").append(toIndentedString(refineProductId)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    subtaskName: ").append(toIndentedString(subtaskName)).append("\n");
        sb.append("    subtaskCreateTimeFrom: ").append(toIndentedString(subtaskCreateTimeFrom)).append("\n");
        sb.append("    subtaskCreateTimeTo: ").append(toIndentedString(subtaskCreateTimeTo)).append("\n");
        sb.append("    subtaskCompletedTimeFrom: ").append(toIndentedString(subtaskCompletedTimeFrom)).append("\n");
        sb.append("    subtaskCompletedTimeTo: ").append(toIndentedString(subtaskCompletedTimeTo)).append("\n");
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
