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
public class ListNodeLimitSqlModelResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_limit_sql_model_list")

    private List<ListNodeLimitSqlModelResponseResult> nodeLimitSqlModelList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListNodeLimitSqlModelResponse withNodeLimitSqlModelList(
        List<ListNodeLimitSqlModelResponseResult> nodeLimitSqlModelList) {
        this.nodeLimitSqlModelList = nodeLimitSqlModelList;
        return this;
    }

    public ListNodeLimitSqlModelResponse addNodeLimitSqlModelListItem(
        ListNodeLimitSqlModelResponseResult nodeLimitSqlModelListItem) {
        if (this.nodeLimitSqlModelList == null) {
            this.nodeLimitSqlModelList = new ArrayList<>();
        }
        this.nodeLimitSqlModelList.add(nodeLimitSqlModelListItem);
        return this;
    }

    public ListNodeLimitSqlModelResponse withNodeLimitSqlModelList(
        Consumer<List<ListNodeLimitSqlModelResponseResult>> nodeLimitSqlModelListSetter) {
        if (this.nodeLimitSqlModelList == null) {
            this.nodeLimitSqlModelList = new ArrayList<>();
        }
        nodeLimitSqlModelListSetter.accept(this.nodeLimitSqlModelList);
        return this;
    }

    /**
     * 限流SQL模板匹配信息
     * @return nodeLimitSqlModelList
     */
    public List<ListNodeLimitSqlModelResponseResult> getNodeLimitSqlModelList() {
        return nodeLimitSqlModelList;
    }

    public void setNodeLimitSqlModelList(List<ListNodeLimitSqlModelResponseResult> nodeLimitSqlModelList) {
        this.nodeLimitSqlModelList = nodeLimitSqlModelList;
    }

    public ListNodeLimitSqlModelResponse withLimit(Integer limit) {
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

    public ListNodeLimitSqlModelResponse withOffset(Integer offset) {
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

    public ListNodeLimitSqlModelResponse withTotalCount(Integer totalCount) {
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
        ListNodeLimitSqlModelResponse that = (ListNodeLimitSqlModelResponse) obj;
        return Objects.equals(this.nodeLimitSqlModelList, that.nodeLimitSqlModelList)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeLimitSqlModelList, limit, offset, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNodeLimitSqlModelResponse {\n");
        sb.append("    nodeLimitSqlModelList: ").append(toIndentedString(nodeLimitSqlModelList)).append("\n");
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
