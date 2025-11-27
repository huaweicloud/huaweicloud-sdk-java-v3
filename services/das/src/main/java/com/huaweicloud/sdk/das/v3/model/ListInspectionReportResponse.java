package com.huaweicloud.sdk.das.v3.model;

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
public class ListInspectionReportResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "batch_inspection_report_list")

    private List<BatchInspectionReport> batchInspectionReportList = null;

    public ListInspectionReportResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总数
     * minimum: 0
     * maximum: 2147483647
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListInspectionReportResponse withBatchInspectionReportList(
        List<BatchInspectionReport> batchInspectionReportList) {
        this.batchInspectionReportList = batchInspectionReportList;
        return this;
    }

    public ListInspectionReportResponse addBatchInspectionReportListItem(
        BatchInspectionReport batchInspectionReportListItem) {
        if (this.batchInspectionReportList == null) {
            this.batchInspectionReportList = new ArrayList<>();
        }
        this.batchInspectionReportList.add(batchInspectionReportListItem);
        return this;
    }

    public ListInspectionReportResponse withBatchInspectionReportList(
        Consumer<List<BatchInspectionReport>> batchInspectionReportListSetter) {
        if (this.batchInspectionReportList == null) {
            this.batchInspectionReportList = new ArrayList<>();
        }
        batchInspectionReportListSetter.accept(this.batchInspectionReportList);
        return this;
    }

    /**
     * 批量巡检报告列表
     * @return batchInspectionReportList
     */
    public List<BatchInspectionReport> getBatchInspectionReportList() {
        return batchInspectionReportList;
    }

    public void setBatchInspectionReportList(List<BatchInspectionReport> batchInspectionReportList) {
        this.batchInspectionReportList = batchInspectionReportList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInspectionReportResponse that = (ListInspectionReportResponse) obj;
        return Objects.equals(this.total, that.total)
            && Objects.equals(this.batchInspectionReportList, that.batchInspectionReportList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, batchInspectionReportList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInspectionReportResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    batchInspectionReportList: ").append(toIndentedString(batchInspectionReportList)).append("\n");
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
