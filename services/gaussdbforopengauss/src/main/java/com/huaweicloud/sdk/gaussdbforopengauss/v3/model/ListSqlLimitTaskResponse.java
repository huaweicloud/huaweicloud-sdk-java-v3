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
public class ListSqlLimitTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit_task_list")

    private List<ListSqlLimitTaskResponseResult> limitTaskList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListSqlLimitTaskResponse withLimitTaskList(List<ListSqlLimitTaskResponseResult> limitTaskList) {
        this.limitTaskList = limitTaskList;
        return this;
    }

    public ListSqlLimitTaskResponse addLimitTaskListItem(ListSqlLimitTaskResponseResult limitTaskListItem) {
        if (this.limitTaskList == null) {
            this.limitTaskList = new ArrayList<>();
        }
        this.limitTaskList.add(limitTaskListItem);
        return this;
    }

    public ListSqlLimitTaskResponse withLimitTaskList(
        Consumer<List<ListSqlLimitTaskResponseResult>> limitTaskListSetter) {
        if (this.limitTaskList == null) {
            this.limitTaskList = new ArrayList<>();
        }
        limitTaskListSetter.accept(this.limitTaskList);
        return this;
    }

    /**
     * **参数解释**: 限流任务列表。
     * @return limitTaskList
     */
    public List<ListSqlLimitTaskResponseResult> getLimitTaskList() {
        return limitTaskList;
    }

    public void setLimitTaskList(List<ListSqlLimitTaskResponseResult> limitTaskList) {
        this.limitTaskList = limitTaskList;
    }

    public ListSqlLimitTaskResponse withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**: 查询记录数。 **取值范围**: 不涉及。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListSqlLimitTaskResponse withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释**: 索引位置。 **取值范围**: 不涉及。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListSqlLimitTaskResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * **参数解释**: 总数。 **取值范围**: 不涉及。
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
        ListSqlLimitTaskResponse that = (ListSqlLimitTaskResponse) obj;
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
        sb.append("class ListSqlLimitTaskResponse {\n");
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
