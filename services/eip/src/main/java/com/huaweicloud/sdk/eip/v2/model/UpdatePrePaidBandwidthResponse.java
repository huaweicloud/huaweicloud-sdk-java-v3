package com.huaweicloud.sdk.eip.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.eip.v2.model.BandwidthResp;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class UpdatePrePaidBandwidthResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bandwidth")
    
    private BandwidthResp bandwidth;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="order_id")
    
    private String orderId;

    public UpdatePrePaidBandwidthResponse withBandwidth(BandwidthResp bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    public UpdatePrePaidBandwidthResponse withBandwidth(Consumer<BandwidthResp> bandwidthSetter) {
        if(this.bandwidth == null ){
            this.bandwidth = new BandwidthResp();
            bandwidthSetter.accept(this.bandwidth);
        }
        
        return this;
    }


    /**
     * Get bandwidth
     * @return bandwidth
     */
    public BandwidthResp getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(BandwidthResp bandwidth) {
        this.bandwidth = bandwidth;
    }

    

    public UpdatePrePaidBandwidthResponse withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    


    /**
     * 订单号（包周期场景返回该字段）
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdatePrePaidBandwidthResponse updatePrePaidBandwidthResponse = (UpdatePrePaidBandwidthResponse) o;
        return Objects.equals(this.bandwidth, updatePrePaidBandwidthResponse.bandwidth) &&
            Objects.equals(this.orderId, updatePrePaidBandwidthResponse.orderId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(bandwidth, orderId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePrePaidBandwidthResponse {\n");
        sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
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

