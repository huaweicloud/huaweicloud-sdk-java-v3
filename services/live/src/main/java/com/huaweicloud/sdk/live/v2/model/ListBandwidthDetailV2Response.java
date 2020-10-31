package com.huaweicloud.sdk.live.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.live.v2.model.V2BandwidthData;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListBandwidthDetailV2Response extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="data_list")
    
    private List<V2BandwidthData> dataList = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-request-id")
    
    private String xRequestId;

    public ListBandwidthDetailV2Response withDataList(List<V2BandwidthData> dataList) {
        this.dataList = dataList;
        return this;
    }

    
    public ListBandwidthDetailV2Response addDataListItem(V2BandwidthData dataListItem) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        this.dataList.add(dataListItem);
        return this;
    }

    public ListBandwidthDetailV2Response withDataList(Consumer<List<V2BandwidthData>> dataListSetter) {
        if(this.dataList == null ){
            this.dataList = new ArrayList<>();
        }
        dataListSetter.accept(this.dataList);
        return this;
    }

    /**
     * 采样数据列表
     * @return dataList
     */
    public List<V2BandwidthData> getDataList() {
        return dataList;
    }

    public void setDataList(List<V2BandwidthData> dataList) {
        this.dataList = dataList;
    }

    public ListBandwidthDetailV2Response withXRequestId(String xRequestId) {
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
        ListBandwidthDetailV2Response listBandwidthDetailV2Response = (ListBandwidthDetailV2Response) o;
        return Objects.equals(this.dataList, listBandwidthDetailV2Response.dataList) &&
            Objects.equals(this.xRequestId, listBandwidthDetailV2Response.xRequestId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(dataList, xRequestId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBandwidthDetailV2Response {\n");
        sb.append("    dataList: ").append(toIndentedString(dataList)).append("\n");
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

