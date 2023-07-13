package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowBandwidthCalcResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_calc")

    private Map<String, Object> bandwidthCalc = null;

    public ShowBandwidthCalcResponse withBandwidthCalc(Map<String, Object> bandwidthCalc) {
        this.bandwidthCalc = bandwidthCalc;
        return this;
    }

    public ShowBandwidthCalcResponse putBandwidthCalcItem(String key, Object bandwidthCalcItem) {
        if (this.bandwidthCalc == null) {
            this.bandwidthCalc = new HashMap<>();
        }
        this.bandwidthCalc.put(key, bandwidthCalcItem);
        return this;
    }

    public ShowBandwidthCalcResponse withBandwidthCalc(Consumer<Map<String, Object>> bandwidthCalcSetter) {
        if (this.bandwidthCalc == null) {
            this.bandwidthCalc = new HashMap<>();
        }
        bandwidthCalcSetter.accept(this.bandwidthCalc);
        return this;
    }

    /**
     * 95峰值，日峰值月平均线信息
     * @return bandwidthCalc
     */
    public Map<String, Object> getBandwidthCalc() {
        return bandwidthCalc;
    }

    public void setBandwidthCalc(Map<String, Object> bandwidthCalc) {
        this.bandwidthCalc = bandwidthCalc;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowBandwidthCalcResponse that = (ShowBandwidthCalcResponse) obj;
        return Objects.equals(this.bandwidthCalc, that.bandwidthCalc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bandwidthCalc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBandwidthCalcResponse {\n");
        sb.append("    bandwidthCalc: ").append(toIndentedString(bandwidthCalc)).append("\n");
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
