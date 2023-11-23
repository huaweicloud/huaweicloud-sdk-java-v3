package com.huaweicloud.sdk.rds.v3.model;

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
public class ListInspectionHistoriesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inspection_reports")

    private List<InspectionReports> inspectionReports = null;

    public ListInspectionHistoriesResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总记录数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListInspectionHistoriesResponse withInspectionReports(List<InspectionReports> inspectionReports) {
        this.inspectionReports = inspectionReports;
        return this;
    }

    public ListInspectionHistoriesResponse addInspectionReportsItem(InspectionReports inspectionReportsItem) {
        if (this.inspectionReports == null) {
            this.inspectionReports = new ArrayList<>();
        }
        this.inspectionReports.add(inspectionReportsItem);
        return this;
    }

    public ListInspectionHistoriesResponse withInspectionReports(
        Consumer<List<InspectionReports>> inspectionReportsSetter) {
        if (this.inspectionReports == null) {
            this.inspectionReports = new ArrayList<>();
        }
        inspectionReportsSetter.accept(this.inspectionReports);
        return this;
    }

    /**
     * 检查报告信息。
     * @return inspectionReports
     */
    public List<InspectionReports> getInspectionReports() {
        return inspectionReports;
    }

    public void setInspectionReports(List<InspectionReports> inspectionReports) {
        this.inspectionReports = inspectionReports;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInspectionHistoriesResponse that = (ListInspectionHistoriesResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount)
            && Objects.equals(this.inspectionReports, that.inspectionReports);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, inspectionReports);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInspectionHistoriesResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    inspectionReports: ").append(toIndentedString(inspectionReports)).append("\n");
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
