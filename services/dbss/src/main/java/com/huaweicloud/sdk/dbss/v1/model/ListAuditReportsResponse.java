package com.huaweicloud.sdk.dbss.v1.model;

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
public class ListAuditReportsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reports")

    private List<ReportInfo> reports = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    public ListAuditReportsResponse withReports(List<ReportInfo> reports) {
        this.reports = reports;
        return this;
    }

    public ListAuditReportsResponse addReportsItem(ReportInfo reportsItem) {
        if (this.reports == null) {
            this.reports = new ArrayList<>();
        }
        this.reports.add(reportsItem);
        return this;
    }

    public ListAuditReportsResponse withReports(Consumer<List<ReportInfo>> reportsSetter) {
        if (this.reports == null) {
            this.reports = new ArrayList<>();
        }
        reportsSetter.accept(this.reports);
        return this;
    }

    /**
     * 报表对象列表
     * @return reports
     */
    public List<ReportInfo> getReports() {
        return reports;
    }

    public void setReports(List<ReportInfo> reports) {
        this.reports = reports;
    }

    public ListAuditReportsResponse withTotal(Long total) {
        this.total = total;
        return this;
    }

    /**
     * 总记录数
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAuditReportsResponse that = (ListAuditReportsResponse) obj;
        return Objects.equals(this.reports, that.reports) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reports, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAuditReportsResponse {\n");
        sb.append("    reports: ").append(toIndentedString(reports)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
