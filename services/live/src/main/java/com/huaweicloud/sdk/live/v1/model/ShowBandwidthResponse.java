package com.huaweicloud.sdk.live.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.live.v1.model.BandwidthInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowBandwidthResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bandwidth_info")
    
    private List<BandwidthInfo> bandwidthInfo = null;
    
    public ShowBandwidthResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * 查询结果的总元素数量
     * minimum: 0
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    

    public ShowBandwidthResponse withBandwidthInfo(List<BandwidthInfo> bandwidthInfo) {
        this.bandwidthInfo = bandwidthInfo;
        return this;
    }

    
    public ShowBandwidthResponse addBandwidthInfoItem(BandwidthInfo bandwidthInfoItem) {
        this.bandwidthInfo.add(bandwidthInfoItem);
        return this;
    }

    public ShowBandwidthResponse withBandwidthInfo(Consumer<List<BandwidthInfo>> bandwidthInfoSetter) {
        if(this.bandwidthInfo == null ){
            this.bandwidthInfo = new ArrayList<>();
        }
        bandwidthInfoSetter.accept(this.bandwidthInfo);
        return this;
    }

    /**
     * 带宽信息
     * @return bandwidthInfo
     */
    public List<BandwidthInfo> getBandwidthInfo() {
        return bandwidthInfo;
    }

    public void setBandwidthInfo(List<BandwidthInfo> bandwidthInfo) {
        this.bandwidthInfo = bandwidthInfo;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowBandwidthResponse showBandwidthResponse = (ShowBandwidthResponse) o;
        return Objects.equals(this.total, showBandwidthResponse.total) &&
            Objects.equals(this.bandwidthInfo, showBandwidthResponse.bandwidthInfo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(total, bandwidthInfo);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBandwidthResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    bandwidthInfo: ").append(toIndentedString(bandwidthInfo)).append("\n");
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

