package com.huaweicloud.sdk.cloudbuild.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cloudbuild.v3.model.HistoryRecord;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowListPeriodHistoryResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="history_records")
    
    private List<HistoryRecord> historyRecords = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;

    public ShowListPeriodHistoryResponse withHistoryRecords(List<HistoryRecord> historyRecords) {
        this.historyRecords = historyRecords;
        return this;
    }

    
    public ShowListPeriodHistoryResponse addHistoryRecordsItem(HistoryRecord historyRecordsItem) {
        if (this.historyRecords == null) {
            this.historyRecords = new ArrayList<>();
        }
        this.historyRecords.add(historyRecordsItem);
        return this;
    }

    public ShowListPeriodHistoryResponse withHistoryRecords(Consumer<List<HistoryRecord>> historyRecordsSetter) {
        if(this.historyRecords == null ){
            this.historyRecords = new ArrayList<>();
        }
        historyRecordsSetter.accept(this.historyRecords);
        return this;
    }

    /**
     * 构建历史列表
     * @return historyRecords
     */
    public List<HistoryRecord> getHistoryRecords() {
        return historyRecords;
    }

    public void setHistoryRecords(List<HistoryRecord> historyRecords) {
        this.historyRecords = historyRecords;
    }

    public ShowListPeriodHistoryResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * 记录总数
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
        ShowListPeriodHistoryResponse showListPeriodHistoryResponse = (ShowListPeriodHistoryResponse) o;
        return Objects.equals(this.historyRecords, showListPeriodHistoryResponse.historyRecords) &&
            Objects.equals(this.total, showListPeriodHistoryResponse.total);
    }
    @Override
    public int hashCode() {
        return Objects.hash(historyRecords, total);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowListPeriodHistoryResponse {\n");
        sb.append("    historyRecords: ").append(toIndentedString(historyRecords)).append("\n");
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

