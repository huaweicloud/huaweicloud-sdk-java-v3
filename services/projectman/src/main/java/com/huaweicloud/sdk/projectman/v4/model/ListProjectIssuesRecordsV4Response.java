package com.huaweicloud.sdk.projectman.v4.model;

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
public class ListProjectIssuesRecordsV4Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "records")

    private List<IssueAttrHistoryRecord> records = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListProjectIssuesRecordsV4Response withRecords(List<IssueAttrHistoryRecord> records) {
        this.records = records;
        return this;
    }

    public ListProjectIssuesRecordsV4Response addRecordsItem(IssueAttrHistoryRecord recordsItem) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        this.records.add(recordsItem);
        return this;
    }

    public ListProjectIssuesRecordsV4Response withRecords(Consumer<List<IssueAttrHistoryRecord>> recordsSetter) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        recordsSetter.accept(this.records);
        return this;
    }

    /**
     * 历史记录
     * @return records
     */
    public List<IssueAttrHistoryRecord> getRecords() {
        return records;
    }

    public void setRecords(List<IssueAttrHistoryRecord> records) {
        this.records = records;
    }

    public ListProjectIssuesRecordsV4Response withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListProjectIssuesRecordsV4Response listProjectIssuesRecordsV4Response = (ListProjectIssuesRecordsV4Response) o;
        return Objects.equals(this.records, listProjectIssuesRecordsV4Response.records)
            && Objects.equals(this.total, listProjectIssuesRecordsV4Response.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(records, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProjectIssuesRecordsV4Response {\n");
        sb.append("    records: ").append(toIndentedString(records)).append("\n");
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
