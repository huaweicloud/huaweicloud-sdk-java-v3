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
public class ListDataServiceInstanceAccesslogsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number")

    private Integer number;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "records")

    private List<InstanceAccesslog> records = null;

    public ListDataServiceInstanceAccesslogsResponse withNumber(Integer number) {
        this.number = number;
        return this;
    }

    /**
     * 访问日志数量。
     * @return number
     */
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public ListDataServiceInstanceAccesslogsResponse withRecords(List<InstanceAccesslog> records) {
        this.records = records;
        return this;
    }

    public ListDataServiceInstanceAccesslogsResponse addRecordsItem(InstanceAccesslog recordsItem) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        this.records.add(recordsItem);
        return this;
    }

    public ListDataServiceInstanceAccesslogsResponse withRecords(Consumer<List<InstanceAccesslog>> recordsSetter) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        recordsSetter.accept(this.records);
        return this;
    }

    /**
     * 访问日志列表。
     * @return records
     */
    public List<InstanceAccesslog> getRecords() {
        return records;
    }

    public void setRecords(List<InstanceAccesslog> records) {
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
        ListDataServiceInstanceAccesslogsResponse that = (ListDataServiceInstanceAccesslogsResponse) obj;
        return Objects.equals(this.number, that.number) && Objects.equals(this.records, that.records);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, records);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDataServiceInstanceAccesslogsResponse {\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
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
