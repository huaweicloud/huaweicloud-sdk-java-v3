package com.huaweicloud.sdk.bss.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bss.v2.model.QuotaRecord;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListCouponQuotasRecordsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="records")
    
    private List<QuotaRecord> records = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_count")
    
    private Integer totalCount;

    public ListCouponQuotasRecordsResponse withRecords(List<QuotaRecord> records) {
        this.records = records;
        return this;
    }

    
    public ListCouponQuotasRecordsResponse addRecordsItem(QuotaRecord recordsItem) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        this.records.add(recordsItem);
        return this;
    }

    public ListCouponQuotasRecordsResponse withRecords(Consumer<List<QuotaRecord>> recordsSetter) {
        if(this.records == null ){
            this.records = new ArrayList<>();
        }
        recordsSetter.accept(this.records);
        return this;
    }

    /**
     * |参数名称：记录列表。具体请参见表 QuotaRecord。| |参数约束以及描述：记录列表。具体请参见表 QuotaRecord。|
     * @return records
     */
    public List<QuotaRecord> getRecords() {
        return records;
    }

    public void setRecords(List<QuotaRecord> records) {
        this.records = records;
    }

    public ListCouponQuotasRecordsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    


    /**
     * |参数名称：查询总数。| |参数的约束及描述：查询总数。|
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
        ListCouponQuotasRecordsResponse listCouponQuotasRecordsResponse = (ListCouponQuotasRecordsResponse) o;
        return Objects.equals(this.records, listCouponQuotasRecordsResponse.records) &&
            Objects.equals(this.totalCount, listCouponQuotasRecordsResponse.totalCount);
    }
    @Override
    public int hashCode() {
        return Objects.hash(records, totalCount);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCouponQuotasRecordsResponse {\n");
        sb.append("    records: ").append(toIndentedString(records)).append("\n");
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

