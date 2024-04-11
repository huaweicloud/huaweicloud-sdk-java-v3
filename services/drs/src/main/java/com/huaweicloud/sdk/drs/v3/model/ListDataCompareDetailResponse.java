package com.huaweicloud.sdk.drs.v3.model;

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
public class ListDataCompareDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_line_compare_result_infos")

    private List<TableLineCompareResultInfo> tableLineCompareResultInfos = null;

    public ListDataCompareDetailResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 对比数量
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListDataCompareDetailResponse withTableLineCompareResultInfos(
        List<TableLineCompareResultInfo> tableLineCompareResultInfos) {
        this.tableLineCompareResultInfos = tableLineCompareResultInfos;
        return this;
    }

    public ListDataCompareDetailResponse addTableLineCompareResultInfosItem(
        TableLineCompareResultInfo tableLineCompareResultInfosItem) {
        if (this.tableLineCompareResultInfos == null) {
            this.tableLineCompareResultInfos = new ArrayList<>();
        }
        this.tableLineCompareResultInfos.add(tableLineCompareResultInfosItem);
        return this;
    }

    public ListDataCompareDetailResponse withTableLineCompareResultInfos(
        Consumer<List<TableLineCompareResultInfo>> tableLineCompareResultInfosSetter) {
        if (this.tableLineCompareResultInfos == null) {
            this.tableLineCompareResultInfos = new ArrayList<>();
        }
        tableLineCompareResultInfosSetter.accept(this.tableLineCompareResultInfos);
        return this;
    }

    /**
     * 对比信息列表
     * @return tableLineCompareResultInfos
     */
    public List<TableLineCompareResultInfo> getTableLineCompareResultInfos() {
        return tableLineCompareResultInfos;
    }

    public void setTableLineCompareResultInfos(List<TableLineCompareResultInfo> tableLineCompareResultInfos) {
        this.tableLineCompareResultInfos = tableLineCompareResultInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDataCompareDetailResponse that = (ListDataCompareDetailResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount)
            && Objects.equals(this.tableLineCompareResultInfos, that.tableLineCompareResultInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, tableLineCompareResultInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDataCompareDetailResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    tableLineCompareResultInfos: ")
            .append(toIndentedString(tableLineCompareResultInfos))
            .append("\n");
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
