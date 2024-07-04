package com.huaweicloud.sdk.vias.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListVideoGroupsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_name")

    private String sortName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_by")

    private String orderBy;

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
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_type")

    private List<String> accessType = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_task")

    private Boolean hasTask;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private List<String> type = null;

    public ListVideoGroupsRequest withSortName(String sortName) {
        this.sortName = sortName;
        return this;
    }

    /**
     * 排序项。可选，可选值（create_at、modify_at、num_video_source、num_task）
     * @return sortName
     */
    public String getSortName() {
        return sortName;
    }

    public void setSortName(String sortName) {
        this.sortName = sortName;
    }

    public ListVideoGroupsRequest withOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    /**
     * 排序顺序，可选，默认倒序，可选值（desc、asc）
     * @return orderBy
     */
    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public ListVideoGroupsRequest withIsPaged(Boolean isPaged) {
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

    public ListVideoGroupsRequest withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * 分页每页显示的条目
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

    public ListVideoGroupsRequest withPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }

    /**
     * 第几页
     * minimum: 1
     * maximum: 100000
     * @return pageNum
     */
    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public ListVideoGroupsRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 模糊查找参数，可以按分组名称进行模糊查找
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListVideoGroupsRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态level筛选，可选值（1、2、9）
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListVideoGroupsRequest withAccessType(List<String> accessType) {
        this.accessType = accessType;
        return this;
    }

    public ListVideoGroupsRequest addAccessTypeItem(String accessTypeItem) {
        if (this.accessType == null) {
            this.accessType = new ArrayList<>();
        }
        this.accessType.add(accessTypeItem);
        return this;
    }

    public ListVideoGroupsRequest withAccessType(Consumer<List<String>> accessTypeSetter) {
        if (this.accessType == null) {
            this.accessType = new ArrayList<>();
        }
        accessTypeSetter.accept(this.accessType);
        return this;
    }

    /**
     * 根据接入方式筛选（可多选），可选值（cloud、edge）
     * @return accessType
     */
    public List<String> getAccessType() {
        return accessType;
    }

    public void setAccessType(List<String> accessType) {
        this.accessType = accessType;
    }

    public ListVideoGroupsRequest withHasTask(Boolean hasTask) {
        this.hasTask = hasTask;
        return this;
    }

    /**
     * 是否有批量作业
     * @return hasTask
     */
    public Boolean getHasTask() {
        return hasTask;
    }

    public void setHasTask(Boolean hasTask) {
        this.hasTask = hasTask;
    }

    public ListVideoGroupsRequest withType(List<String> type) {
        this.type = type;
        return this;
    }

    public ListVideoGroupsRequest addTypeItem(String typeItem) {
        if (this.type == null) {
            this.type = new ArrayList<>();
        }
        this.type.add(typeItem);
        return this;
    }

    public ListVideoGroupsRequest withType(Consumer<List<String>> typeSetter) {
        if (this.type == null) {
            this.type = new ArrayList<>();
        }
        typeSetter.accept(this.type);
        return this;
    }

    /**
     * 视频源类型筛选（可多选）[类型:obs、vcn、url、restful、camera](tag:hc)[类型:obs、vcn、url、restful、camera、VIDEO_PLATFORM、VIDEO_IMAGE_DB、RTSP_STREAM](tag:hcs)
     * @return type
     */
    public List<String> getType() {
        return type;
    }

    public void setType(List<String> type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListVideoGroupsRequest that = (ListVideoGroupsRequest) obj;
        return Objects.equals(this.sortName, that.sortName) && Objects.equals(this.orderBy, that.orderBy)
            && Objects.equals(this.isPaged, that.isPaged) && Objects.equals(this.pageSize, that.pageSize)
            && Objects.equals(this.pageNum, that.pageNum) && Objects.equals(this.name, that.name)
            && Objects.equals(this.status, that.status) && Objects.equals(this.accessType, that.accessType)
            && Objects.equals(this.hasTask, that.hasTask) && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sortName, orderBy, isPaged, pageSize, pageNum, name, status, accessType, hasTask, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListVideoGroupsRequest {\n");
        sb.append("    sortName: ").append(toIndentedString(sortName)).append("\n");
        sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
        sb.append("    isPaged: ").append(toIndentedString(isPaged)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    pageNum: ").append(toIndentedString(pageNum)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
        sb.append("    hasTask: ").append(toIndentedString(hasTask)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
