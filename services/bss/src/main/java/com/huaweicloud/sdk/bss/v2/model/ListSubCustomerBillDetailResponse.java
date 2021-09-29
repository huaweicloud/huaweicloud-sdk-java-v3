package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListSubCustomerBillDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "currency")

    private String currency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fee_records")

    private List<SubCustomerMonthlyBillDetail> feeRecords = null;

    public ListSubCustomerBillDetailResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /** 结果集数量，只有成功才返回这个参数。
     * 
     * @return totalCount */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListSubCustomerBillDetailResponse withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /** 货币单位代码： CNY：人民币
     * 
     * @return currency */
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public ListSubCustomerBillDetailResponse withFeeRecords(List<SubCustomerMonthlyBillDetail> feeRecords) {
        this.feeRecords = feeRecords;
        return this;
    }

    public ListSubCustomerBillDetailResponse addFeeRecordsItem(SubCustomerMonthlyBillDetail feeRecordsItem) {
        if (this.feeRecords == null) {
            this.feeRecords = new ArrayList<>();
        }
        this.feeRecords.add(feeRecordsItem);
        return this;
    }

    public ListSubCustomerBillDetailResponse withFeeRecords(
        Consumer<List<SubCustomerMonthlyBillDetail>> feeRecordsSetter) {
        if (this.feeRecords == null) {
            this.feeRecords = new ArrayList<>();
        }
        feeRecordsSetter.accept(this.feeRecords);
        return this;
    }

    /** 资源费用记录数据。 具体请参见表2。
     * 
     * @return feeRecords */
    public List<SubCustomerMonthlyBillDetail> getFeeRecords() {
        return feeRecords;
    }

    public void setFeeRecords(List<SubCustomerMonthlyBillDetail> feeRecords) {
        this.feeRecords = feeRecords;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSubCustomerBillDetailResponse listSubCustomerBillDetailResponse = (ListSubCustomerBillDetailResponse) o;
        return Objects.equals(this.totalCount, listSubCustomerBillDetailResponse.totalCount)
            && Objects.equals(this.currency, listSubCustomerBillDetailResponse.currency)
            && Objects.equals(this.feeRecords, listSubCustomerBillDetailResponse.feeRecords);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, currency, feeRecords);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSubCustomerBillDetailResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    feeRecords: ").append(toIndentedString(feeRecords)).append("\n");
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
