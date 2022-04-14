package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListCustomerselfResourceRecordsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fee_records")

    private List<ResFeeRecordV2> feeRecords = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "currency")

    private String currency;

    public ListCustomerselfResourceRecordsResponse withFeeRecords(List<ResFeeRecordV2> feeRecords) {
        this.feeRecords = feeRecords;
        return this;
    }

    public ListCustomerselfResourceRecordsResponse addFeeRecordsItem(ResFeeRecordV2 feeRecordsItem) {
        if (this.feeRecords == null) {
            this.feeRecords = new ArrayList<>();
        }
        this.feeRecords.add(feeRecordsItem);
        return this;
    }

    public ListCustomerselfResourceRecordsResponse withFeeRecords(Consumer<List<ResFeeRecordV2>> feeRecordsSetter) {
        if (this.feeRecords == null) {
            this.feeRecords = new ArrayList<>();
        }
        feeRecordsSetter.accept(this.feeRecords);
        return this;
    }

    /** 资源费用记录数据。 具体请参见表3。
     * 
     * @return feeRecords */
    public List<ResFeeRecordV2> getFeeRecords() {
        return feeRecords;
    }

    public void setFeeRecords(List<ResFeeRecordV2> feeRecords) {
        this.feeRecords = feeRecords;
    }

    public ListCustomerselfResourceRecordsResponse withTotalCount(Integer totalCount) {
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

    public ListCustomerselfResourceRecordsResponse withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /** 货币单位代码： USD：美元
     * 
     * @return currency */
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListCustomerselfResourceRecordsResponse listCustomerselfResourceRecordsResponse =
            (ListCustomerselfResourceRecordsResponse) o;
        return Objects.equals(this.feeRecords, listCustomerselfResourceRecordsResponse.feeRecords)
            && Objects.equals(this.totalCount, listCustomerselfResourceRecordsResponse.totalCount)
            && Objects.equals(this.currency, listCustomerselfResourceRecordsResponse.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(feeRecords, totalCount, currency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCustomerselfResourceRecordsResponse {\n");
        sb.append("    feeRecords: ").append(toIndentedString(feeRecords)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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
