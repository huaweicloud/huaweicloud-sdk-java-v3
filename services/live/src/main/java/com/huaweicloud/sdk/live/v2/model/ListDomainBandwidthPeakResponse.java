package com.huaweicloud.sdk.live.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.live.v2.model.PeakBandwidthData;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListDomainBandwidthPeakResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bandwidth_list")
    
    private List<PeakBandwidthData> bandwidthList = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-request-id")
    
    private String xRequestId;

    public ListDomainBandwidthPeakResponse withBandwidthList(List<PeakBandwidthData> bandwidthList) {
        this.bandwidthList = bandwidthList;
        return this;
    }

    
    public ListDomainBandwidthPeakResponse addBandwidthListItem(PeakBandwidthData bandwidthListItem) {
        if(this.bandwidthList == null) {
            this.bandwidthList = new ArrayList<>();
        }
        this.bandwidthList.add(bandwidthListItem);
        return this;
    }

    public ListDomainBandwidthPeakResponse withBandwidthList(Consumer<List<PeakBandwidthData>> bandwidthListSetter) {
        if(this.bandwidthList == null) {
            this.bandwidthList = new ArrayList<>();
        }
        bandwidthListSetter.accept(this.bandwidthList);
        return this;
    }

    /**
     * 域名对应的带宽峰值列表。
     * @return bandwidthList
     */
    public List<PeakBandwidthData> getBandwidthList() {
        return bandwidthList;
    }

    public void setBandwidthList(List<PeakBandwidthData> bandwidthList) {
        this.bandwidthList = bandwidthList;
    }

    

    public ListDomainBandwidthPeakResponse withXRequestId(String xRequestId) {
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
        ListDomainBandwidthPeakResponse listDomainBandwidthPeakResponse = (ListDomainBandwidthPeakResponse) o;
        return Objects.equals(this.bandwidthList, listDomainBandwidthPeakResponse.bandwidthList) &&
            Objects.equals(this.xRequestId, listDomainBandwidthPeakResponse.xRequestId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(bandwidthList, xRequestId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDomainBandwidthPeakResponse {\n");
        sb.append("    bandwidthList: ").append(toIndentedString(bandwidthList)).append("\n");
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

