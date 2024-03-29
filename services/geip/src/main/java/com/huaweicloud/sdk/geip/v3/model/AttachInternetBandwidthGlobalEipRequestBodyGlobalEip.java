package com.huaweicloud.sdk.geip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 请求参数对象
 */
public class AttachInternetBandwidthGlobalEipRequestBodyGlobalEip {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "internet_bandwidth_id")

    private String internetBandwidthId;

    public AttachInternetBandwidthGlobalEipRequestBodyGlobalEip withInternetBandwidthId(String internetBandwidthId) {
        this.internetBandwidthId = internetBandwidthId;
        return this;
    }

    /**
     * 全域公网带宽的ID
     * @return internetBandwidthId
     */
    public String getInternetBandwidthId() {
        return internetBandwidthId;
    }

    public void setInternetBandwidthId(String internetBandwidthId) {
        this.internetBandwidthId = internetBandwidthId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AttachInternetBandwidthGlobalEipRequestBodyGlobalEip that =
            (AttachInternetBandwidthGlobalEipRequestBodyGlobalEip) obj;
        return Objects.equals(this.internetBandwidthId, that.internetBandwidthId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(internetBandwidthId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttachInternetBandwidthGlobalEipRequestBodyGlobalEip {\n");
        sb.append("    internetBandwidthId: ").append(toIndentedString(internetBandwidthId)).append("\n");
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
