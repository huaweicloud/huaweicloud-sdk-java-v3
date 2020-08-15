package com.huaweicloud.sdk.bssintl.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bssintl.v2.model.MonthlyBillRes;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListCustomerselfResourceRecordDetailsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="currency")
    
    private String currency;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="monthly_records")
    
    private List<MonthlyBillRes> monthlyRecords = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_count")
    
    private Integer totalCount;

    public ListCustomerselfResourceRecordDetailsResponse withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    


    /**
     * |参数名称：货币单位代码| |参数的约束及描述：该参数非必填，最大长度3，CNY：人民币；USD：美元|
     * @return currency
     */
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

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

    public ListCustomerselfResourceRecordDetailsResponse withMonthlyRecords(Consumer<List<MonthlyBillRes>> monthlyRecordsSetter) {
        if(this.monthlyRecords == null ){
            this.monthlyRecords = new ArrayList<>();
        }
        monthlyRecordsSetter.accept(this.monthlyRecords);
        return this;
    }

    /**
     * |参数名称：资源费用记录数据| |参数的约束及描述：该参数非必填|
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
     * |参数名称：结果集数量| |参数的约束及描述：该参数非必填，且只允许数字，只有成功才返回这个参数。|
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListCustomerselfResourceRecordDetailsResponse listCustomerselfResourceRecordDetailsResponse = (ListCustomerselfResourceRecordDetailsResponse) o;
        return Objects.equals(this.currency, listCustomerselfResourceRecordDetailsResponse.currency) &&
            Objects.equals(this.monthlyRecords, listCustomerselfResourceRecordDetailsResponse.monthlyRecords) &&
            Objects.equals(this.totalCount, listCustomerselfResourceRecordDetailsResponse.totalCount);
    }
    @Override
    public int hashCode() {
        return Objects.hash(currency, monthlyRecords, totalCount);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCustomerselfResourceRecordDetailsResponse {\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    monthlyRecords: ").append(toIndentedString(monthlyRecords)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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

