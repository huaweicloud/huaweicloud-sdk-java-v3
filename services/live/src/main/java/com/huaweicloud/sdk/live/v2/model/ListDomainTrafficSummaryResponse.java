package com.huaweicloud.sdk.live.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListDomainTrafficSummaryResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_list")

    private List<TrafficSummaryData> trafficList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public ListDomainTrafficSummaryResponse withTrafficList(List<TrafficSummaryData> trafficList) {
        this.trafficList = trafficList;
        return this;
    }

    public ListDomainTrafficSummaryResponse addTrafficListItem(TrafficSummaryData trafficListItem) {
        if (this.trafficList == null) {
            this.trafficList = new ArrayList<>();
        }
        this.trafficList.add(trafficListItem);
        return this;
    }

    public ListDomainTrafficSummaryResponse withTrafficList(Consumer<List<TrafficSummaryData>> trafficListSetter) {
        if (this.trafficList == null) {
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

    public ListDomainTrafficSummaryResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDomainTrafficSummaryResponse that = (ListDomainTrafficSummaryResponse) obj;
        return Objects.equals(this.trafficList, that.trafficList) && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trafficList, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDomainTrafficSummaryResponse {\n");
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
