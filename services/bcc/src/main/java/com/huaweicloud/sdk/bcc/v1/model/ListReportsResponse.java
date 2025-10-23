package com.huaweicloud.sdk.bcc.v1.model;

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
public class ListReportsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_marker")

    private String nextMarker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reports")

    private List<ReportEntity> reports = null;

    public ListReportsResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 本次分页查询响应的报告条数
     * minimum: 0
     * maximum: 65535
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public ListReportsResponse withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    /**
     * 下一页的marker
     * @return nextMarker
     */
    public String getNextMarker() {
        return nextMarker;
    }

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    public ListReportsResponse withReports(List<ReportEntity> reports) {
        this.reports = reports;
        return this;
    }

    public ListReportsResponse addReportsItem(ReportEntity reportsItem) {
        if (this.reports == null) {
            this.reports = new ArrayList<>();
        }
        this.reports.add(reportsItem);
        return this;
    }

    public ListReportsResponse withReports(Consumer<List<ReportEntity>> reportsSetter) {
        if (this.reports == null) {
            this.reports = new ArrayList<>();
        }
        reportsSetter.accept(this.reports);
        return this;
    }

    /**
     * 报告列表
     * @return reports
     */
    public List<ReportEntity> getReports() {
        return reports;
    }

    public void setReports(List<ReportEntity> reports) {
        this.reports = reports;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListReportsResponse that = (ListReportsResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.nextMarker, that.nextMarker)
            && Objects.equals(this.reports, that.reports);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, nextMarker, reports);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListReportsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    nextMarker: ").append(toIndentedString(nextMarker)).append("\n");
        sb.append("    reports: ").append(toIndentedString(reports)).append("\n");
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
