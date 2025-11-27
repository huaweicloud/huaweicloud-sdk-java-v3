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
public class ListCustomerCouponChangeRecordsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "currency")

    private String currency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "records")

    private List<CustomerCouponChangeRecord> records = null;

    public ListCustomerCouponChangeRecordsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * |参数名称：返回总条数| |参数的约束及描述：返回总条数|
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListCustomerCouponChangeRecordsResponse withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * |参数名称：币种| |参数约束及描述：CNY：人民币。|
     * @return currency
     */
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public ListCustomerCouponChangeRecordsResponse withRecords(List<CustomerCouponChangeRecord> records) {
        this.records = records;
        return this;
    }

    public ListCustomerCouponChangeRecordsResponse addRecordsItem(CustomerCouponChangeRecord recordsItem) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        this.records.add(recordsItem);
        return this;
    }

    public ListCustomerCouponChangeRecordsResponse withRecords(
        Consumer<List<CustomerCouponChangeRecord>> recordsSetter) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        recordsSetter.accept(this.records);
        return this;
    }

    /**
     * |参数名称：优惠券收支明细记录列表| |参数约束以及描述：优惠券收支明细记录列表，具体请参见表 CustomerCouponChangeRecord。|
     * @return records
     */
    public List<CustomerCouponChangeRecord> getRecords() {
        return records;
    }

    public void setRecords(List<CustomerCouponChangeRecord> records) {
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
        ListCustomerCouponChangeRecordsResponse that = (ListCustomerCouponChangeRecordsResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount) && Objects.equals(this.currency, that.currency)
            && Objects.equals(this.records, that.records);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, currency, records);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCustomerCouponChangeRecordsResponse {\n");
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
