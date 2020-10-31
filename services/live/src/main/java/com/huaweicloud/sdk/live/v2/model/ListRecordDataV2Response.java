package com.huaweicloud.sdk.live.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.live.v2.model.RecordData;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListRecordDataV2Response extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="record_data_list")
    
    private List<RecordData> recordDataList = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-request-id")
    
    private String xRequestId;

    public ListRecordDataV2Response withRecordDataList(List<RecordData> recordDataList) {
        this.recordDataList = recordDataList;
        return this;
    }

    
    public ListRecordDataV2Response addRecordDataListItem(RecordData recordDataListItem) {
        if (this.recordDataList == null) {
            this.recordDataList = new ArrayList<>();
        }
        this.recordDataList.add(recordDataListItem);
        return this;
    }

    public ListRecordDataV2Response withRecordDataList(Consumer<List<RecordData>> recordDataListSetter) {
        if(this.recordDataList == null ){
            this.recordDataList = new ArrayList<>();
        }
        recordDataListSetter.accept(this.recordDataList);
        return this;
    }

    /**
     * 采样数据列表。 
     * @return recordDataList
     */
    public List<RecordData> getRecordDataList() {
        return recordDataList;
    }

    public void setRecordDataList(List<RecordData> recordDataList) {
        this.recordDataList = recordDataList;
    }

    public ListRecordDataV2Response withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    


    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-request-id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListRecordDataV2Response listRecordDataV2Response = (ListRecordDataV2Response) o;
        return Objects.equals(this.recordDataList, listRecordDataV2Response.recordDataList) &&
            Objects.equals(this.xRequestId, listRecordDataV2Response.xRequestId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(recordDataList, xRequestId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRecordDataV2Response {\n");
        sb.append("    recordDataList: ").append(toIndentedString(recordDataList)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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

