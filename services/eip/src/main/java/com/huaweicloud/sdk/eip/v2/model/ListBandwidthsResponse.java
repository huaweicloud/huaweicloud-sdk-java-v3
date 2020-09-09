package com.huaweicloud.sdk.eip.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.eip.v2.model.BandwidthResp;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListBandwidthsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bandwidths")
    
    private List<BandwidthResp> bandwidths = null;
    
    public ListBandwidthsResponse withBandwidths(List<BandwidthResp> bandwidths) {
        this.bandwidths = bandwidths;
        return this;
    }

    
    public ListBandwidthsResponse addBandwidthsItem(BandwidthResp bandwidthsItem) {
        if (this.bandwidths == null) {
            this.bandwidths = new ArrayList<>();
        }
        this.bandwidths.add(bandwidthsItem);
        return this;
    }

    public ListBandwidthsResponse withBandwidths(Consumer<List<BandwidthResp>> bandwidthsSetter) {
        if(this.bandwidths == null ){
            this.bandwidths = new ArrayList<>();
        }
        bandwidthsSetter.accept(this.bandwidths);
        return this;
    }

    /**
     * 带宽列表对象
     * @return bandwidths
     */
    public List<BandwidthResp> getBandwidths() {
        return bandwidths;
    }

    public void setBandwidths(List<BandwidthResp> bandwidths) {
        this.bandwidths = bandwidths;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListBandwidthsResponse listBandwidthsResponse = (ListBandwidthsResponse) o;
        return Objects.equals(this.bandwidths, listBandwidthsResponse.bandwidths);
    }
    @Override
    public int hashCode() {
        return Objects.hash(bandwidths);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBandwidthsResponse {\n");
        sb.append("    bandwidths: ").append(toIndentedString(bandwidths)).append("\n");
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

