package com.huaweicloud.sdk.bss.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bss.v2.model.SubCustomerResFeeRecordV2;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListSubCustomerResFeeRecordsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="fee_records")
    
    private List<SubCustomerResFeeRecordV2> feeRecords = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="count")
    
    private Integer count;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="currency")
    
    private String currency;

    public ListSubCustomerResFeeRecordsResponse withFeeRecords(List<SubCustomerResFeeRecordV2> feeRecords) {
        this.feeRecords = feeRecords;
        return this;
    }

    
    public ListSubCustomerResFeeRecordsResponse addFeeRecordsItem(SubCustomerResFeeRecordV2 feeRecordsItem) {
        if (this.feeRecords == null) {
            this.feeRecords = new ArrayList<>();
        }
        this.feeRecords.add(feeRecordsItem);
        return this;
    }

    public ListSubCustomerResFeeRecordsResponse withFeeRecords(Consumer<List<SubCustomerResFeeRecordV2>> feeRecordsSetter) {
        if(this.feeRecords == null ){
            this.feeRecords = new ArrayList<>();
        }
        feeRecordsSetter.accept(this.feeRecords);
        return this;
    }

    /**
     * |参数名称：资源费用记录数据。具体请参见表 ResFeeRecordV2。| |参数约束以及描述：资源费用记录数据。具体请参见表 ResFeeRecordV2。|
     * @return feeRecords
     */
    public List<SubCustomerResFeeRecordV2> getFeeRecords() {
        return feeRecords;
    }

    public void setFeeRecords(List<SubCustomerResFeeRecordV2> feeRecords) {
        this.feeRecords = feeRecords;
    }

    public ListSubCustomerResFeeRecordsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    


    /**
     * |参数名称：结果集数量，只有成功才返回这个参数。| |参数的约束及描述：结果集数量，只有成功才返回这个参数。|
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListSubCustomerResFeeRecordsResponse withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    


    /**
     * |参数名称：货币单位代码：CNY：人民币USD：美元| |参数约束及描述：货币单位代码：CNY：人民币USD：美元|
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
        ListSubCustomerResFeeRecordsResponse listSubCustomerResFeeRecordsResponse = (ListSubCustomerResFeeRecordsResponse) o;
        return Objects.equals(this.feeRecords, listSubCustomerResFeeRecordsResponse.feeRecords) &&
            Objects.equals(this.count, listSubCustomerResFeeRecordsResponse.count) &&
            Objects.equals(this.currency, listSubCustomerResFeeRecordsResponse.currency);
    }
    @Override
    public int hashCode() {
        return Objects.hash(feeRecords, count, currency);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSubCustomerResFeeRecordsResponse {\n");
        sb.append("    feeRecords: ").append(toIndentedString(feeRecords)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

