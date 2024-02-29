package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListReleasePackagesRequestBody
 */
public class ListReleasePackagesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_word")

    private String keyWord;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apply_user_name")

    private String applyUserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deploy_user_name")

    private String deployUserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apply_begin_time")

    private Long applyBeginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apply_end_time")

    private Long applyEndTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deploy_begin_time")

    private Long deployBeginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deploy_end_time")

    private Long deployEndTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apply_user_name_filter")

    private List<String> applyUserNameFilter = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deploy_user_name_filter")

    private List<String> deployUserNameFilter = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deploy_status_filter")

    private List<Integer> deployStatusFilter = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sorted_direction")

    private String sortedDirection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_column")

    private String orderColumn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    public ListReleasePackagesRequestBody withKeyWord(String keyWord) {
        this.keyWord = keyWord;
        return this;
    }

    /**
     * 包名package_name关键字
     * @return keyWord
     */
    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public ListReleasePackagesRequestBody withApplyUserName(String applyUserName) {
        this.applyUserName = applyUserName;
        return this;
    }

    /**
     * 申请人名称
     * @return applyUserName
     */
    public String getApplyUserName() {
        return applyUserName;
    }

    public void setApplyUserName(String applyUserName) {
        this.applyUserName = applyUserName;
    }

    public ListReleasePackagesRequestBody withDeployUserName(String deployUserName) {
        this.deployUserName = deployUserName;
        return this;
    }

    /**
     * 发布人名称
     * @return deployUserName
     */
    public String getDeployUserName() {
        return deployUserName;
    }

    public void setDeployUserName(String deployUserName) {
        this.deployUserName = deployUserName;
    }

    public ListReleasePackagesRequestBody withApplyBeginTime(Long applyBeginTime) {
        this.applyBeginTime = applyBeginTime;
        return this;
    }

    /**
     * 申请开始时间，13位时间戳
     * @return applyBeginTime
     */
    public Long getApplyBeginTime() {
        return applyBeginTime;
    }

    public void setApplyBeginTime(Long applyBeginTime) {
        this.applyBeginTime = applyBeginTime;
    }

    public ListReleasePackagesRequestBody withApplyEndTime(Long applyEndTime) {
        this.applyEndTime = applyEndTime;
        return this;
    }

    /**
     * 申请结束时间，13位时间戳
     * @return applyEndTime
     */
    public Long getApplyEndTime() {
        return applyEndTime;
    }

    public void setApplyEndTime(Long applyEndTime) {
        this.applyEndTime = applyEndTime;
    }

    public ListReleasePackagesRequestBody withDeployBeginTime(Long deployBeginTime) {
        this.deployBeginTime = deployBeginTime;
        return this;
    }

    /**
     * 发布开始时间，13位时间戳
     * @return deployBeginTime
     */
    public Long getDeployBeginTime() {
        return deployBeginTime;
    }

    public void setDeployBeginTime(Long deployBeginTime) {
        this.deployBeginTime = deployBeginTime;
    }

    public ListReleasePackagesRequestBody withDeployEndTime(Long deployEndTime) {
        this.deployEndTime = deployEndTime;
        return this;
    }

    /**
     * 发布结束时间，13位时间戳
     * @return deployEndTime
     */
    public Long getDeployEndTime() {
        return deployEndTime;
    }

    public void setDeployEndTime(Long deployEndTime) {
        this.deployEndTime = deployEndTime;
    }

    public ListReleasePackagesRequestBody withApplyUserNameFilter(List<String> applyUserNameFilter) {
        this.applyUserNameFilter = applyUserNameFilter;
        return this;
    }

    public ListReleasePackagesRequestBody addApplyUserNameFilterItem(String applyUserNameFilterItem) {
        if (this.applyUserNameFilter == null) {
            this.applyUserNameFilter = new ArrayList<>();
        }
        this.applyUserNameFilter.add(applyUserNameFilterItem);
        return this;
    }

    public ListReleasePackagesRequestBody withApplyUserNameFilter(Consumer<List<String>> applyUserNameFilterSetter) {
        if (this.applyUserNameFilter == null) {
            this.applyUserNameFilter = new ArrayList<>();
        }
        applyUserNameFilterSetter.accept(this.applyUserNameFilter);
        return this;
    }

    /**
     * 申请人名称集合，根据该字段筛选，如果选择了apply_user_name，则该名称必须包含在集合内
     * @return applyUserNameFilter
     */
    public List<String> getApplyUserNameFilter() {
        return applyUserNameFilter;
    }

    public void setApplyUserNameFilter(List<String> applyUserNameFilter) {
        this.applyUserNameFilter = applyUserNameFilter;
    }

    public ListReleasePackagesRequestBody withDeployUserNameFilter(List<String> deployUserNameFilter) {
        this.deployUserNameFilter = deployUserNameFilter;
        return this;
    }

    public ListReleasePackagesRequestBody addDeployUserNameFilterItem(String deployUserNameFilterItem) {
        if (this.deployUserNameFilter == null) {
            this.deployUserNameFilter = new ArrayList<>();
        }
        this.deployUserNameFilter.add(deployUserNameFilterItem);
        return this;
    }

    public ListReleasePackagesRequestBody withDeployUserNameFilter(Consumer<List<String>> deployUserNameFilterSetter) {
        if (this.deployUserNameFilter == null) {
            this.deployUserNameFilter = new ArrayList<>();
        }
        deployUserNameFilterSetter.accept(this.deployUserNameFilter);
        return this;
    }

    /**
     * 发布人名称集合，根据该字段筛选，如果选择了apply_user_name，则该名称必须包含在集合内
     * @return deployUserNameFilter
     */
    public List<String> getDeployUserNameFilter() {
        return deployUserNameFilter;
    }

    public void setDeployUserNameFilter(List<String> deployUserNameFilter) {
        this.deployUserNameFilter = deployUserNameFilter;
    }

    public ListReleasePackagesRequestBody withDeployStatusFilter(List<Integer> deployStatusFilter) {
        this.deployStatusFilter = deployStatusFilter;
        return this;
    }

    public ListReleasePackagesRequestBody addDeployStatusFilterItem(Integer deployStatusFilterItem) {
        if (this.deployStatusFilter == null) {
            this.deployStatusFilter = new ArrayList<>();
        }
        this.deployStatusFilter.add(deployStatusFilterItem);
        return this;
    }

    public ListReleasePackagesRequestBody withDeployStatusFilter(Consumer<List<Integer>> deployStatusFilterSetter) {
        if (this.deployStatusFilter == null) {
            this.deployStatusFilter = new ArrayList<>();
        }
        deployStatusFilterSetter.accept(this.deployStatusFilter);
        return this;
    }

    /**
     * 发布状态集合: 1:待审批,2:成功,3:失败, 5:发布中
     * @return deployStatusFilter
     */
    public List<Integer> getDeployStatusFilter() {
        return deployStatusFilter;
    }

    public void setDeployStatusFilter(List<Integer> deployStatusFilter) {
        this.deployStatusFilter = deployStatusFilter;
    }

    public ListReleasePackagesRequestBody withSortedDirection(String sortedDirection) {
        this.sortedDirection = sortedDirection;
        return this;
    }

    /**
     * 排序方向，默认是desc
     * @return sortedDirection
     */
    public String getSortedDirection() {
        return sortedDirection;
    }

    public void setSortedDirection(String sortedDirection) {
        this.sortedDirection = sortedDirection;
    }

    public ListReleasePackagesRequestBody withOrderColumn(String orderColumn) {
        this.orderColumn = orderColumn;
        return this;
    }

    /**
     * 排序字段，默认是apply_timestamp
     * @return orderColumn
     */
    public String getOrderColumn() {
        return orderColumn;
    }

    public void setOrderColumn(String orderColumn) {
        this.orderColumn = orderColumn;
    }

    public ListReleasePackagesRequestBody withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 分页返回结果，默认是10
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListReleasePackagesRequestBody withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 分页的起始页，默认值位0，取值范围大于等于0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListReleasePackagesRequestBody that = (ListReleasePackagesRequestBody) obj;
        return Objects.equals(this.keyWord, that.keyWord) && Objects.equals(this.applyUserName, that.applyUserName)
            && Objects.equals(this.deployUserName, that.deployUserName)
            && Objects.equals(this.applyBeginTime, that.applyBeginTime)
            && Objects.equals(this.applyEndTime, that.applyEndTime)
            && Objects.equals(this.deployBeginTime, that.deployBeginTime)
            && Objects.equals(this.deployEndTime, that.deployEndTime)
            && Objects.equals(this.applyUserNameFilter, that.applyUserNameFilter)
            && Objects.equals(this.deployUserNameFilter, that.deployUserNameFilter)
            && Objects.equals(this.deployStatusFilter, that.deployStatusFilter)
            && Objects.equals(this.sortedDirection, that.sortedDirection)
            && Objects.equals(this.orderColumn, that.orderColumn) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.offset, that.offset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyWord,
            applyUserName,
            deployUserName,
            applyBeginTime,
            applyEndTime,
            deployBeginTime,
            deployEndTime,
            applyUserNameFilter,
            deployUserNameFilter,
            deployStatusFilter,
            sortedDirection,
            orderColumn,
            limit,
            offset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListReleasePackagesRequestBody {\n");
        sb.append("    keyWord: ").append(toIndentedString(keyWord)).append("\n");
        sb.append("    applyUserName: ").append(toIndentedString(applyUserName)).append("\n");
        sb.append("    deployUserName: ").append(toIndentedString(deployUserName)).append("\n");
        sb.append("    applyBeginTime: ").append(toIndentedString(applyBeginTime)).append("\n");
        sb.append("    applyEndTime: ").append(toIndentedString(applyEndTime)).append("\n");
        sb.append("    deployBeginTime: ").append(toIndentedString(deployBeginTime)).append("\n");
        sb.append("    deployEndTime: ").append(toIndentedString(deployEndTime)).append("\n");
        sb.append("    applyUserNameFilter: ").append(toIndentedString(applyUserNameFilter)).append("\n");
        sb.append("    deployUserNameFilter: ").append(toIndentedString(deployUserNameFilter)).append("\n");
        sb.append("    deployStatusFilter: ").append(toIndentedString(deployStatusFilter)).append("\n");
        sb.append("    sortedDirection: ").append(toIndentedString(sortedDirection)).append("\n");
        sb.append("    orderColumn: ").append(toIndentedString(orderColumn)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
