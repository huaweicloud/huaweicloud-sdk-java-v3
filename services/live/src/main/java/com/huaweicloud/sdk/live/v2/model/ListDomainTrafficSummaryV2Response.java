package com.huaweicloud.sdk.live.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.live.v2.model.TrafficSummaryData;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListDomainTrafficSummaryV2Response extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="traffic_list")
    
    private List<TrafficSummaryData> trafficList = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-request-id")
    
    private String xRequestId;

    public ListDomainTrafficSummaryV2Response withTrafficList(List<TrafficSummaryData> trafficList) {
        this.trafficList = trafficList;
        return this;
    }

    
    public ListDomainTrafficSummaryV2Response addTrafficListItem(TrafficSummaryData trafficListItem) {
        if (this.trafficList == null) {
            this.trafficList = new ArrayList<>();
        }
        this.trafficList.add(trafficListItem);
        return this;
    }

    public ListDomainTrafficSummaryV2Response withTrafficList(Consumer<List<TrafficSummaryData>> trafficListSetter) {
        if(this.trafficList == null ){
            this.trafficList = new ArrayList<>();
        }
        trafficListSetter.accept(this.trafficList);
        return this;
    }

    /**
     * 域名对应的流量汇总列表。
     * @return trafficList
     */
    public List<TrafficSummaryData> getTrafficList() {
        return trafficList;
    }

    public void setTrafficList(List<TrafficSummaryData> trafficList) {
        this.trafficList = trafficList;
    }

    public ListDomainTrafficSummaryV2Response withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    


    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="")
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
        ListDomainTrafficSummaryV2Response listDomainTrafficSummaryV2Response = (ListDomainTrafficSummaryV2Response) o;
        return Objects.equals(this.trafficList, listDomainTrafficSummaryV2Response.trafficList) &&
            Objects.equals(this.xRequestId, listDomainTrafficSummaryV2Response.xRequestId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(trafficList, xRequestId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDomainTrafficSummaryV2Response {\n");
        sb.append("    trafficList: ").append(toIndentedString(trafficList)).append("\n");
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

