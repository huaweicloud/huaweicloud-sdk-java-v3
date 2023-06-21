package com.huaweicloud.sdk.dataartsstudio.v1.model;

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
public class SearchAuthorizeAppResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "records")

    private List<RecordForGetAuthApp> records = null;

    public SearchAuthorizeAppResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 符合条件的APP总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public SearchAuthorizeAppResponse withRecords(List<RecordForGetAuthApp> records) {
        this.records = records;
        return this;
    }

    public SearchAuthorizeAppResponse addRecordsItem(RecordForGetAuthApp recordsItem) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        this.records.add(recordsItem);
        return this;
    }

    public SearchAuthorizeAppResponse withRecords(Consumer<List<RecordForGetAuthApp>> recordsSetter) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        recordsSetter.accept(this.records);
        return this;
    }

    /**
     * 本次返回的APP列表
     * @return records
     */
    public List<RecordForGetAuthApp> getRecords() {
        return records;
    }

    public void setRecords(List<RecordForGetAuthApp> records) {
        this.records = records;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchAuthorizeAppResponse searchAuthorizeAppResponse = (SearchAuthorizeAppResponse) o;
        return Objects.equals(this.total, searchAuthorizeAppResponse.total)
            && Objects.equals(this.records, searchAuthorizeAppResponse.records);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, records);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchAuthorizeAppResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
