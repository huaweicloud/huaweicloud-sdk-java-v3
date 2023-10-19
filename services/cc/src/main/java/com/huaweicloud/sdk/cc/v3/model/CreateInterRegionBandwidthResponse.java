package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateInterRegionBandwidthResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inter_region_bandwidth")

    private InterRegionBandwidth interRegionBandwidth;

    public CreateInterRegionBandwidthResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 资源ID标识符。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public CreateInterRegionBandwidthResponse withInterRegionBandwidth(InterRegionBandwidth interRegionBandwidth) {
        this.interRegionBandwidth = interRegionBandwidth;
        return this;
    }

    public CreateInterRegionBandwidthResponse withInterRegionBandwidth(
        Consumer<InterRegionBandwidth> interRegionBandwidthSetter) {
        if (this.interRegionBandwidth == null) {
            this.interRegionBandwidth = new InterRegionBandwidth();
            interRegionBandwidthSetter.accept(this.interRegionBandwidth);
        }

        return this;
    }

    /**
     * Get interRegionBandwidth
     * @return interRegionBandwidth
     */
    public InterRegionBandwidth getInterRegionBandwidth() {
        return interRegionBandwidth;
    }

    public void setInterRegionBandwidth(InterRegionBandwidth interRegionBandwidth) {
        this.interRegionBandwidth = interRegionBandwidth;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateInterRegionBandwidthResponse that = (CreateInterRegionBandwidthResponse) obj;
        return Objects.equals(this.requestId, that.requestId)
            && Objects.equals(this.interRegionBandwidth, that.interRegionBandwidth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, interRegionBandwidth);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateInterRegionBandwidthResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    interRegionBandwidth: ").append(toIndentedString(interRegionBandwidth)).append("\n");
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
