package com.huaweicloud.sdk.bss.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bss.v2.model.MonthlyBillRecord;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListCustomerBillsFeeRecordsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_count")
    
    private Integer totalCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="records")
    
    private List<MonthlyBillRecord> records = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="currency")
    
    private String currency;

    public ListCustomerBillsFeeRecordsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    


    /**
     * |参数名称：总条数，必须大于等于0。| |参数的约束及描述：总条数，必须大于等于0。|
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListCustomerBillsFeeRecordsResponse withRecords(List<MonthlyBillRecord> records) {
        this.records = records;
        return this;
    }

    
    public ListCustomerBillsFeeRecordsResponse addRecordsItem(MonthlyBillRecord recordsItem) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        this.records.add(recordsItem);
        return this;
    }

    public ListCustomerBillsFeeRecordsResponse withRecords(Consumer<List<MonthlyBillRecord>> recordsSetter) {
        if(this.records == null ){
            this.records = new ArrayList<>();
        }
        recordsSetter.accept(this.records);
        return this;
    }

    /**
     * |参数名称：资源费用记录数据。具体请参见表 MonthlyBillRes。| |参数约束以及描述：资源费用记录数据。具体请参见表 MonthlyBillRes。|
     * @return records
     */
    public List<MonthlyBillRecord> getRecords() {
        return records;
    }

    public void setRecords(List<MonthlyBillRecord> records) {
        this.records = records;
    }

    public ListCustomerBillsFeeRecordsResponse withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    


    /**
     * |参数名称：币种。| |参数约束及描述：币种。|
     * @return currency
     */
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
        ListCustomerBillsFeeRecordsResponse listCustomerBillsFeeRecordsResponse = (ListCustomerBillsFeeRecordsResponse) o;
        return Objects.equals(this.totalCount, listCustomerBillsFeeRecordsResponse.totalCount) &&
            Objects.equals(this.records, listCustomerBillsFeeRecordsResponse.records) &&
            Objects.equals(this.currency, listCustomerBillsFeeRecordsResponse.currency);
    }
    @Override
    public int hashCode() {
        return Objects.hash(totalCount, records, currency);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCustomerBillsFeeRecordsResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    records: ").append(toIndentedString(records)).append("\n");
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

