package com.huaweicloud.sdk.geip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateInternetBandwidthRequestBody
 */
public class UpdateInternetBandwidthRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "internet_bandwidth")

    private UpdateInternetBandwidthRequestBodyInternetBandwidth internetBandwidth;

    public UpdateInternetBandwidthRequestBody withInternetBandwidth(
        UpdateInternetBandwidthRequestBodyInternetBandwidth internetBandwidth) {
        this.internetBandwidth = internetBandwidth;
        return this;
    }

    public UpdateInternetBandwidthRequestBody withInternetBandwidth(
        Consumer<UpdateInternetBandwidthRequestBodyInternetBandwidth> internetBandwidthSetter) {
        if (this.internetBandwidth == null) {
            this.internetBandwidth = new UpdateInternetBandwidthRequestBodyInternetBandwidth();
            internetBandwidthSetter.accept(this.internetBandwidth);
        }

        return this;
    }

    /**
     * Get internetBandwidth
     * @return internetBandwidth
     */
    public UpdateInternetBandwidthRequestBodyInternetBandwidth getInternetBandwidth() {
        return internetBandwidth;
    }

    public void setInternetBandwidth(UpdateInternetBandwidthRequestBodyInternetBandwidth internetBandwidth) {
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
        UpdateInternetBandwidthRequestBody that = (UpdateInternetBandwidthRequestBody) obj;
        return Objects.equals(this.internetBandwidth, that.internetBandwidth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(internetBandwidth);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateInternetBandwidthRequestBody {\n");
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
