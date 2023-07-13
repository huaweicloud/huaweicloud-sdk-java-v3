package com.huaweicloud.sdk.bssintl.v2.model;

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
public class ListCustomerselfResourceRecordDetailsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "monthly_records")

    private List<MonthlyBillRes> monthlyRecords = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "currency")

    private String currency;

    public ListCustomerselfResourceRecordDetailsResponse withMonthlyRecords(List<MonthlyBillRes> monthlyRecords) {
        this.monthlyRecords = monthlyRecords;
        return this;
    }

    public ListCustomerselfResourceRecordDetailsResponse addMonthlyRecordsItem(MonthlyBillRes monthlyRecordsItem) {
        if (this.monthlyRecords == null) {
            this.monthlyRecords = new ArrayList<>();
        }
        this.monthlyRecords.add(monthlyRecordsItem);
        return this;
    }

    public ListCustomerselfResourceRecordDetailsResponse withMonthlyRecords(
        Consumer<List<MonthlyBillRes>> monthlyRecordsSetter) {
        if (this.monthlyRecords == null) {
            this.monthlyRecords = new ArrayList<>();
        }
        monthlyRecordsSetter.accept(this.monthlyRecords);
        return this;
    }

    /**
     * 资源详单数据记录。 具体请参见表1。
     * @return monthlyRecords
     */
    public List<MonthlyBillRes> getMonthlyRecords() {
        return monthlyRecords;
    }

    public void setMonthlyRecords(List<MonthlyBillRes> monthlyRecords) {
        this.monthlyRecords = monthlyRecords;
    }

    public ListCustomerselfResourceRecordDetailsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 结果集数量，只有成功才返回这个参数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListCustomerselfResourceRecordDetailsResponse withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * 货币单位代码： USD：美元
     * @return currency
     */
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCustomerselfResourceRecordDetailsResponse that = (ListCustomerselfResourceRecordDetailsResponse) obj;
        return Objects.equals(this.monthlyRecords, that.monthlyRecords)
            && Objects.equals(this.totalCount, that.totalCount) && Objects.equals(this.currency, that.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(monthlyRecords, totalCount, currency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCustomerselfResourceRecordDetailsResponse {\n");
        sb.append("    monthlyRecords: ").append(toIndentedString(monthlyRecords)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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
