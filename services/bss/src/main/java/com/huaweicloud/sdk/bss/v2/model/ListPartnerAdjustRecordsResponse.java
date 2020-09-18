package com.huaweicloud.sdk.bss.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bss.v2.model.AdjustRecordV2;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListPartnerAdjustRecordsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_count")
    
    private Integer totalCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="records")
    
    private List<AdjustRecordV2> records = null;
    
    public ListPartnerAdjustRecordsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    


    /**
     * |参数名称：返回总条数。| |参数的约束及描述：返回总条数。|
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListPartnerAdjustRecordsResponse withRecords(List<AdjustRecordV2> records) {
        this.records = records;
        return this;
    }

    
    public ListPartnerAdjustRecordsResponse addRecordsItem(AdjustRecordV2 recordsItem) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        this.records.add(recordsItem);
        return this;
    }

    public ListPartnerAdjustRecordsResponse withRecords(Consumer<List<AdjustRecordV2>> recordsSetter) {
        if(this.records == null ){
            this.records = new ArrayList<>();
        }
        recordsSetter.accept(this.records);
        return this;
    }

    /**
     * |参数名称：调账记录列表。具体请参见表 AdjustRecordV2。| |参数约束以及描述：调账记录列表。具体请参见表 AdjustRecordV2。|
     * @return records
     */
    public List<AdjustRecordV2> getRecords() {
        return records;
    }

    public void setRecords(List<AdjustRecordV2> records) {
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
        ListPartnerAdjustRecordsResponse listPartnerAdjustRecordsResponse = (ListPartnerAdjustRecordsResponse) o;
        return Objects.equals(this.totalCount, listPartnerAdjustRecordsResponse.totalCount) &&
            Objects.equals(this.records, listPartnerAdjustRecordsResponse.records);
    }
    @Override
    public int hashCode() {
        return Objects.hash(totalCount, records);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPartnerAdjustRecordsResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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

