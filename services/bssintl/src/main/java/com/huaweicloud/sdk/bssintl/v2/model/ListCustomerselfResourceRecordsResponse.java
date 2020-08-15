package com.huaweicloud.sdk.bssintl.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bssintl.v2.model.ResFeeRecordV2;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListCustomerselfResourceRecordsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="currency")
    
    private String currency;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="fee_records")
    
    private List<ResFeeRecordV2> feeRecords = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_count")
    
    private Integer totalCount;

    public ListCustomerselfResourceRecordsResponse withCurrency(String currency) {
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

    


    /**
     * |参数名称：结果集数量，只有成功才返回这个参数。| |参数的约束及描述：结果集数量，只有成功才返回这个参数。|
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
        ListCustomerselfResourceRecordsResponse listCustomerselfResourceRecordsResponse = (ListCustomerselfResourceRecordsResponse) o;
        return Objects.equals(this.currency, listCustomerselfResourceRecordsResponse.currency) &&
            Objects.equals(this.feeRecords, listCustomerselfResourceRecordsResponse.feeRecords) &&
            Objects.equals(this.totalCount, listCustomerselfResourceRecordsResponse.totalCount);
    }
    @Override
    public int hashCode() {
        return Objects.hash(currency, feeRecords, totalCount);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCustomerselfResourceRecordsResponse {\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    feeRecords: ").append(toIndentedString(feeRecords)).append("\n");
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

