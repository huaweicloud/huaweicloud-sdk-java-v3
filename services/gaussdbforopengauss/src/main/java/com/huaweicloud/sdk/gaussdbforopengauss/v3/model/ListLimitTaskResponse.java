package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

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
public class ListLimitTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit_task_list")

    private List<ListLimitTaskResponseResult> limitTaskList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListLimitTaskResponse withLimitTaskList(List<ListLimitTaskResponseResult> limitTaskList) {
        this.limitTaskList = limitTaskList;
        return this;
    }

    public ListLimitTaskResponse addLimitTaskListItem(ListLimitTaskResponseResult limitTaskListItem) {
        if (this.limitTaskList == null) {
            this.limitTaskList = new ArrayList<>();
        }
        this.limitTaskList.add(limitTaskListItem);
        return this;
    }

    public ListLimitTaskResponse withLimitTaskList(Consumer<List<ListLimitTaskResponseResult>> limitTaskListSetter) {
        if (this.limitTaskList == null) {
            this.limitTaskList = new ArrayList<>();
        }
        limitTaskListSetter.accept(this.limitTaskList);
        return this;
    }

    /**
     * 限流任务列表
     * @return limitTaskList
     */
    public List<ListLimitTaskResponseResult> getLimitTaskList() {
        return limitTaskList;
    }

    public void setLimitTaskList(List<ListLimitTaskResponseResult> limitTaskList) {
        this.limitTaskList = limitTaskList;
    }

    public ListLimitTaskResponse withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询记录数。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListLimitTaskResponse withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 索引位置。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListLimitTaskResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListLimitTaskResponse that = (ListLimitTaskResponse) obj;
        return Objects.equals(this.limitTaskList, that.limitTaskList) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limitTaskList, limit, offset, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListLimitTaskResponse {\n");
        sb.append("    limitTaskList: ").append(toIndentedString(limitTaskList)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
