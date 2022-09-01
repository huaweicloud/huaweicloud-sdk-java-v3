package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowBandwidthRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_id")

    @JacksonXmlProperty(localName = "bandwidth_id")

    private String bandwidthId;

    public ShowBandwidthRequest withBandwidthId(String bandwidthId) {
        this.bandwidthId = bandwidthId;
        return this;
    }

    /**
     * 带宽ID。
     * @return bandwidthId
     */
    public String getBandwidthId() {
        return bandwidthId;
    }

    public void setBandwidthId(String bandwidthId) {
        this.bandwidthId = bandwidthId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowBandwidthRequest showBandwidthRequest = (ShowBandwidthRequest) o;
        return Objects.equals(this.bandwidthId, showBandwidthRequest.bandwidthId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bandwidthId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBandwidthRequest {\n");
        sb.append("    bandwidthId: ").append(toIndentedString(bandwidthId)).append("\n");
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
