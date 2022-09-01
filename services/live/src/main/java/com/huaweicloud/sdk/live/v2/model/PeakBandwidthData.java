package com.huaweicloud.sdk.live.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * PeakBandwidthData
 */
public class PeakBandwidthData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    @JacksonXmlProperty(localName = "value")

    private Long value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    @JacksonXmlProperty(localName = "domain")

    private String domain;

    public PeakBandwidthData withValue(Long value) {
        this.value = value;
        return this;
    }

    /**
     * 带宽峰值，单位为bps。
     * minimum: 0
     * maximum: -1
     * @return value
     */
    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    public PeakBandwidthData withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * 播放域名。
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PeakBandwidthData peakBandwidthData = (PeakBandwidthData) o;
        return Objects.equals(this.value, peakBandwidthData.value)
            && Objects.equals(this.domain, peakBandwidthData.domain);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, domain);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PeakBandwidthData {\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
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
