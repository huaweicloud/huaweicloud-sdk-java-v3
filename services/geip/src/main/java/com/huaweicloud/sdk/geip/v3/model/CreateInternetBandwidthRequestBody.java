package com.huaweicloud.sdk.geip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 全域公网带宽信息
 */
public class CreateInternetBandwidthRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "internet_bandwidth")

    private CreateInternetBandwidthRequestBodyInternetBandwidth internetBandwidth;

    public CreateInternetBandwidthRequestBody withInternetBandwidth(
        CreateInternetBandwidthRequestBodyInternetBandwidth internetBandwidth) {
        this.internetBandwidth = internetBandwidth;
        return this;
    }

    public CreateInternetBandwidthRequestBody withInternetBandwidth(
        Consumer<CreateInternetBandwidthRequestBodyInternetBandwidth> internetBandwidthSetter) {
        if (this.internetBandwidth == null) {
            this.internetBandwidth = new CreateInternetBandwidthRequestBodyInternetBandwidth();
            internetBandwidthSetter.accept(this.internetBandwidth);
        }

        return this;
    }

    /**
     * Get internetBandwidth
     * @return internetBandwidth
     */
    public CreateInternetBandwidthRequestBodyInternetBandwidth getInternetBandwidth() {
        return internetBandwidth;
    }

    public void setInternetBandwidth(CreateInternetBandwidthRequestBodyInternetBandwidth internetBandwidth) {
        this.internetBandwidth = internetBandwidth;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateInternetBandwidthRequestBody that = (CreateInternetBandwidthRequestBody) obj;
        return Objects.equals(this.internetBandwidth, that.internetBandwidth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(internetBandwidth);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateInternetBandwidthRequestBody {\n");
        sb.append("    internetBandwidth: ").append(toIndentedString(internetBandwidth)).append("\n");
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
