package com.huaweicloud.sdk.cloudbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ShowListPeriodHistoryResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "history_records")

    private List<HistoryRecord1> historyRecords = null;

    public ShowListPeriodHistoryResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /** 记录总数
     * 
     * @return total */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ShowListPeriodHistoryResponse withHistoryRecords(List<HistoryRecord1> historyRecords) {
        this.historyRecords = historyRecords;
        return this;
    }

    public ShowListPeriodHistoryResponse addHistoryRecordsItem(HistoryRecord1 historyRecordsItem) {
        if (this.historyRecords == null) {
            this.historyRecords = new ArrayList<>();
        }
        this.historyRecords.add(historyRecordsItem);
        return this;
    }

    public ShowListPeriodHistoryResponse withHistoryRecords(Consumer<List<HistoryRecord1>> historyRecordsSetter) {
        if (this.historyRecords == null) {
            this.historyRecords = new ArrayList<>();
        }
        historyRecordsSetter.accept(this.historyRecords);
        return this;
    }

    /** 构建历史列表
     * 
     * @return historyRecords */
    public List<HistoryRecord1> getHistoryRecords() {
        return historyRecords;
    }

    public void setHistoryRecords(List<HistoryRecord1> historyRecords) {
        this.historyRecords = historyRecords;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowListPeriodHistoryResponse showListPeriodHistoryResponse = (ShowListPeriodHistoryResponse) o;
        return Objects.equals(this.total, showListPeriodHistoryResponse.total)
            && Objects.equals(this.historyRecords, showListPeriodHistoryResponse.historyRecords);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, historyRecords);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowListPeriodHistoryResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    historyRecords: ").append(toIndentedString(historyRecords)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
