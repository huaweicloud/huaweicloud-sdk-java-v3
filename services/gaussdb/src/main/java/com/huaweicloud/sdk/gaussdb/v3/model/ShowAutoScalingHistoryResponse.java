package com.huaweicloud.sdk.gaussdb.v3.model;

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
public class ShowAutoScalingHistoryResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private String totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "records")

    private List<AutoScalingRecordInfo> records = null;

    public ShowAutoScalingHistoryResponse withTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 记录总数。
     * @return totalCount
     */
    public String getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(String totalCount) {
        this.totalCount = totalCount;
    }

    public ShowAutoScalingHistoryResponse withRecords(List<AutoScalingRecordInfo> records) {
        this.records = records;
        return this;
    }

    public ShowAutoScalingHistoryResponse addRecordsItem(AutoScalingRecordInfo recordsItem) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        this.records.add(recordsItem);
        return this;
    }

    public ShowAutoScalingHistoryResponse withRecords(Consumer<List<AutoScalingRecordInfo>> recordsSetter) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        recordsSetter.accept(this.records);
        return this;
    }

    /**
     * 自动变配历史记录列表。
     * @return records
     */
    public List<AutoScalingRecordInfo> getRecords() {
        return records;
    }

    public void setRecords(List<AutoScalingRecordInfo> records) {
        this.records = records;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAutoScalingHistoryResponse that = (ShowAutoScalingHistoryResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount) && Objects.equals(this.records, that.records);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, records);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAutoScalingHistoryResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    records: ").append(toIndentedString(records)).append("\n");
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
