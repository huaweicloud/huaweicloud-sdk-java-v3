package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新域间带宽实例的请求体。
 */
public class UpdateInterRegionBandwidthRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inter_region_bandwidth")

    private UpdateInterRegionBandwidth interRegionBandwidth;

    public UpdateInterRegionBandwidthRequestBody withInterRegionBandwidth(
        UpdateInterRegionBandwidth interRegionBandwidth) {
        this.interRegionBandwidth = interRegionBandwidth;
        return this;
    }

    public UpdateInterRegionBandwidthRequestBody withInterRegionBandwidth(
        Consumer<UpdateInterRegionBandwidth> interRegionBandwidthSetter) {
        if (this.interRegionBandwidth == null) {
            this.interRegionBandwidth = new UpdateInterRegionBandwidth();
            interRegionBandwidthSetter.accept(this.interRegionBandwidth);
        }

        return this;
    }

    /**
     * Get interRegionBandwidth
     * @return interRegionBandwidth
     */
    public UpdateInterRegionBandwidth getInterRegionBandwidth() {
        return interRegionBandwidth;
    }

    public void setInterRegionBandwidth(UpdateInterRegionBandwidth interRegionBandwidth) {
        this.interRegionBandwidth = interRegionBandwidth;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateInterRegionBandwidthRequestBody updateInterRegionBandwidthRequestBody =
            (UpdateInterRegionBandwidthRequestBody) o;
        return Objects.equals(this.interRegionBandwidth, updateInterRegionBandwidthRequestBody.interRegionBandwidth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(interRegionBandwidth);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateInterRegionBandwidthRequestBody {\n");
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
