package com.huaweicloud.sdk.secmaster.v2.model;

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
public class ListRetrieveScriptsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "listcount")

    private Long listcount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "records")

    private List<RetrieveScript> records = null;

    public ListRetrieveScriptsResponse withListcount(Long listcount) {
        this.listcount = listcount;
        return this;
    }

    /**
     * 计数
     * minimum: 0
     * maximum: 500
     * @return listcount
     */
    public Long getListcount() {
        return listcount;
    }

    public void setListcount(Long listcount) {
        this.listcount = listcount;
    }

    public ListRetrieveScriptsResponse withRecords(List<RetrieveScript> records) {
        this.records = records;
        return this;
    }

    public ListRetrieveScriptsResponse addRecordsItem(RetrieveScript recordsItem) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        this.records.add(recordsItem);
        return this;
    }

    public ListRetrieveScriptsResponse withRecords(Consumer<List<RetrieveScript>> recordsSetter) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        recordsSetter.accept(this.records);
        return this;
    }

    /**
     * 检索
     * @return records
     */
    public List<RetrieveScript> getRecords() {
        return records;
    }

    public void setRecords(List<RetrieveScript> records) {
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
        ListRetrieveScriptsResponse that = (ListRetrieveScriptsResponse) obj;
        return Objects.equals(this.listcount, that.listcount) && Objects.equals(this.records, that.records);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listcount, records);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRetrieveScriptsResponse {\n");
        sb.append("    listcount: ").append(toIndentedString(listcount)).append("\n");
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
