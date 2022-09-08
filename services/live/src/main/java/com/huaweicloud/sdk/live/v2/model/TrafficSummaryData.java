package com.huaweicloud.sdk.live.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TrafficSummaryData
 */
public class TrafficSummaryData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private Long value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private String domain;

    public TrafficSummaryData withValue(Long value) {
        this.value = value;
        return this;
    }

    /**
     * 流量，单位为byte。
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

    public TrafficSummaryData withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * 域名。
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
        TrafficSummaryData trafficSummaryData = (TrafficSummaryData) o;
        return Objects.equals(this.value, trafficSummaryData.value)
            && Objects.equals(this.domain, trafficSummaryData.domain);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, domain);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TrafficSummaryData {\n");
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
