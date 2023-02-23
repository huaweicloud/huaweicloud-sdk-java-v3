package com.huaweicloud.sdk.bss.v2.model;

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
public class ListCustomerAccountChangeRecordsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "currency")

    private String currency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "records")

    private List<CustomerAccountChangeRecord> records = null;

    public ListCustomerAccountChangeRecordsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * |参数名称：总条数| |参数的约束及描述：总条数|
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListCustomerAccountChangeRecordsResponse withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * |参数名称：币种| |参数约束及描述：币种|
     * @return currency
     */
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public ListCustomerAccountChangeRecordsResponse withRecords(List<CustomerAccountChangeRecord> records) {
        this.records = records;
        return this;
    }

    public ListCustomerAccountChangeRecordsResponse addRecordsItem(CustomerAccountChangeRecord recordsItem) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        this.records.add(recordsItem);
        return this;
    }

    public ListCustomerAccountChangeRecordsResponse withRecords(
        Consumer<List<CustomerAccountChangeRecord>> recordsSetter) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        recordsSetter.accept(this.records);
        return this;
    }

    /**
     * |参数名称：收支明细记录列表| |参数约束以及描述：收支明细记录列表|
     * @return records
     */
    public List<CustomerAccountChangeRecord> getRecords() {
        return records;
    }

    public void setRecords(List<CustomerAccountChangeRecord> records) {
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
        ListCustomerAccountChangeRecordsResponse listCustomerAccountChangeRecordsResponse =
            (ListCustomerAccountChangeRecordsResponse) o;
        return Objects.equals(this.totalCount, listCustomerAccountChangeRecordsResponse.totalCount)
            && Objects.equals(this.currency, listCustomerAccountChangeRecordsResponse.currency)
            && Objects.equals(this.records, listCustomerAccountChangeRecordsResponse.records);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, currency, records);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCustomerAccountChangeRecordsResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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
