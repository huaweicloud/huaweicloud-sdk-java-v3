package com.huaweicloud.sdk.vias.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListBatchTasksRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_paged")

    private Boolean isPaged;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_num")

    private Integer pageNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_by")

    private String orderBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_name")

    private String sortName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_group")

    private String videoGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_state")

    private String taskState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type_like")

    private String typeLike;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_like")

    private String nameLike;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manufacturer")

    private String manufacturer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    public ListBatchTasksRequest withIsPaged(Boolean isPaged) {
        this.isPaged = isPaged;
        return this;
    }

    /**
     * 是否分页
     * @return isPaged
     */
    public Boolean getIsPaged() {
        return isPaged;
    }

    public void setIsPaged(Boolean isPaged) {
        this.isPaged = isPaged;
    }

    public ListBatchTasksRequest withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * 每页显示的条目数量
     * minimum: 5
     * maximum: 200
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public ListBatchTasksRequest withPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }

    /**
     * 页号
     * minimum: 1
     * maximum: 10000
     * @return pageNum
     */
    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public ListBatchTasksRequest withOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    /**
     * 升序或降序，枚举值：asc|desc。
     * @return orderBy
     */
    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public ListBatchTasksRequest withSortName(String sortName) {
        this.sortName = sortName;
        return this;
    }

    /**
     * 排序字段，枚举值：task_count|created_at。
     * @return sortName
     */
    public String getSortName() {
        return sortName;
    }

    public void setSortName(String sortName) {
        this.sortName = sortName;
    }

    public ListBatchTasksRequest withVideoGroup(String videoGroup) {
        this.videoGroup = videoGroup;
        return this;
    }

    /**
     * 视频源分组列表，多个以逗号分隔，需要满足正则：^[a-zA-Z0-9\\u4e00-\\u9fa5\\,-_]{1,1000}$
     * @return videoGroup
     */
    public String getVideoGroup() {
        return videoGroup;
    }

    public void setVideoGroup(String videoGroup) {
        this.videoGroup = videoGroup;
    }

    public ListBatchTasksRequest withTaskState(String taskState) {
        this.taskState = taskState;
        return this;
    }

    /**
     * 任务状态，需要枚举值：pending|recovering|starting|upgrading|create_failed|start_failed|running|stopping|stopped|abnormal|succeeded|failed|deleting|freezing|frozen|stopped_no_service|scheduling|lack_of_resources
     * @return taskState
     */
    public String getTaskState() {
        return taskState;
    }

    public void setTaskState(String taskState) {
        this.taskState = taskState;
    }

    public ListBatchTasksRequest withTypeLike(String typeLike) {
        this.typeLike = typeLike;
        return this;
    }

    /**
     * 模糊查询字段，枚举值： batch_task_name|publish_service_name
     * @return typeLike
     */
    public String getTypeLike() {
        return typeLike;
    }

    public void setTypeLike(String typeLike) {
        this.typeLike = typeLike;
    }

    public ListBatchTasksRequest withNameLike(String nameLike) {
        this.nameLike = nameLike;
        return this;
    }

    /**
     * 模糊查询名称,需要与type_like搭配使用来实现是通过batch_task_name还是publish_service_name进行模糊查询
     * @return nameLike
     */
    public String getNameLike() {
        return nameLike;
    }

    public void setNameLike(String nameLike) {
        this.nameLike = nameLike;
    }

    public ListBatchTasksRequest withManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    /**
     * 根据厂商字段筛选，需要满足正则表达式 ^[a-zA-Z0-9\\u4e00-\\u9fa5\\,-_]{2,64}$
     * @return manufacturer
     */
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public ListBatchTasksRequest withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 算法中文名，需要满足正则表达式 ^[a-zA-Z0-9\\u4e00-\\u9fa5\\,-_]{2,64}$
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListBatchTasksRequest that = (ListBatchTasksRequest) obj;
        return Objects.equals(this.isPaged, that.isPaged) && Objects.equals(this.pageSize, that.pageSize)
            && Objects.equals(this.pageNum, that.pageNum) && Objects.equals(this.orderBy, that.orderBy)
            && Objects.equals(this.sortName, that.sortName) && Objects.equals(this.videoGroup, that.videoGroup)
            && Objects.equals(this.taskState, that.taskState) && Objects.equals(this.typeLike, that.typeLike)
            && Objects.equals(this.nameLike, that.nameLike) && Objects.equals(this.manufacturer, that.manufacturer)
            && Objects.equals(this.title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isPaged,
            pageSize,
            pageNum,
            orderBy,
            sortName,
            videoGroup,
            taskState,
            typeLike,
            nameLike,
            manufacturer,
            title);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBatchTasksRequest {\n");
        sb.append("    isPaged: ").append(toIndentedString(isPaged)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    pageNum: ").append(toIndentedString(pageNum)).append("\n");
        sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
        sb.append("    sortName: ").append(toIndentedString(sortName)).append("\n");
        sb.append("    videoGroup: ").append(toIndentedString(videoGroup)).append("\n");
        sb.append("    taskState: ").append(toIndentedString(taskState)).append("\n");
        sb.append("    typeLike: ").append(toIndentedString(typeLike)).append("\n");
        sb.append("    nameLike: ").append(toIndentedString(nameLike)).append("\n");
        sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
