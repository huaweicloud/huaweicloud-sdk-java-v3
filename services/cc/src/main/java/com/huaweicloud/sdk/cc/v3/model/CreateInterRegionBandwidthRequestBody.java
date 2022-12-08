package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建域间带宽实例的请求体。
 */
public class CreateInterRegionBandwidthRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inter_region_bandwidth")

    private CreateInterRegionBandwidth interRegionBandwidth;

    public CreateInterRegionBandwidthRequestBody withInterRegionBandwidth(
        CreateInterRegionBandwidth interRegionBandwidth) {
        this.interRegionBandwidth = interRegionBandwidth;
        return this;
    }

    public CreateInterRegionBandwidthRequestBody withInterRegionBandwidth(
        Consumer<CreateInterRegionBandwidth> interRegionBandwidthSetter) {
        if (this.interRegionBandwidth == null) {
            this.interRegionBandwidth = new CreateInterRegionBandwidth();
            interRegionBandwidthSetter.accept(this.interRegionBandwidth);
        }

        return this;
    }

    /**
     * Get interRegionBandwidth
     * @return interRegionBandwidth
     */
    public CreateInterRegionBandwidth getInterRegionBandwidth() {
        return interRegionBandwidth;
    }

    public void setInterRegionBandwidth(CreateInterRegionBandwidth interRegionBandwidth) {
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
        CreateInterRegionBandwidthRequestBody createInterRegionBandwidthRequestBody =
            (CreateInterRegionBandwidthRequestBody) o;
        return Objects.equals(this.interRegionBandwidth, createInterRegionBandwidthRequestBody.interRegionBandwidth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(interRegionBandwidth);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateInterRegionBandwidthRequestBody {\n");
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
