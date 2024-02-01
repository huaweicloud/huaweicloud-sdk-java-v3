package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateGlobalConnectionBandwidthRequestBody
 */
public class UpdateGlobalConnectionBandwidthRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "globalconnection_bandwidth")

    private UpdateGlobalConnectionBandwidth globalconnectionBandwidth;

    public UpdateGlobalConnectionBandwidthRequestBody withGlobalconnectionBandwidth(
        UpdateGlobalConnectionBandwidth globalconnectionBandwidth) {
        this.globalconnectionBandwidth = globalconnectionBandwidth;
        return this;
    }

    public UpdateGlobalConnectionBandwidthRequestBody withGlobalconnectionBandwidth(
        Consumer<UpdateGlobalConnectionBandwidth> globalconnectionBandwidthSetter) {
        if (this.globalconnectionBandwidth == null) {
            this.globalconnectionBandwidth = new UpdateGlobalConnectionBandwidth();
            globalconnectionBandwidthSetter.accept(this.globalconnectionBandwidth);
        }

        return this;
    }

    /**
     * Get globalconnectionBandwidth
     * @return globalconnectionBandwidth
     */
    public UpdateGlobalConnectionBandwidth getGlobalconnectionBandwidth() {
        return globalconnectionBandwidth;
    }

    public void setGlobalconnectionBandwidth(UpdateGlobalConnectionBandwidth globalconnectionBandwidth) {
        this.globalconnectionBandwidth = globalconnectionBandwidth;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateGlobalConnectionBandwidthRequestBody that = (UpdateGlobalConnectionBandwidthRequestBody) obj;
        return Objects.equals(this.globalconnectionBandwidth, that.globalconnectionBandwidth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(globalconnectionBandwidth);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateGlobalConnectionBandwidthRequestBody {\n");
        sb.append("    globalconnectionBandwidth: ").append(toIndentedString(globalconnectionBandwidth)).append("\n");
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
