package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * NetworkTraffic
 */
public class NetworkTraffic {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_network_traffic")

    private Float avgNetworkTraffic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_down_stream")

    private Integer maxDownStream;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_network_traffic")

    private Integer maxNetworkTraffic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_upstream")

    private Integer maxUpstream;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_network_traffic")

    private Double minNetworkTraffic;

    public NetworkTraffic withAvgNetworkTraffic(Float avgNetworkTraffic) {
        this.avgNetworkTraffic = avgNetworkTraffic;
        return this;
    }

    /**
     * 平均网络流量
     * @return avgNetworkTraffic
     */
    public Float getAvgNetworkTraffic() {
        return avgNetworkTraffic;
    }

    public void setAvgNetworkTraffic(Float avgNetworkTraffic) {
        this.avgNetworkTraffic = avgNetworkTraffic;
    }

    public NetworkTraffic withMaxDownStream(Integer maxDownStream) {
        this.maxDownStream = maxDownStream;
        return this;
    }

    /**
     * 最大下行带宽
     * @return maxDownStream
     */
    public Integer getMaxDownStream() {
        return maxDownStream;
    }

    public void setMaxDownStream(Integer maxDownStream) {
        this.maxDownStream = maxDownStream;
    }

    public NetworkTraffic withMaxNetworkTraffic(Integer maxNetworkTraffic) {
        this.maxNetworkTraffic = maxNetworkTraffic;
        return this;
    }

    /**
     * 最大网络流量（流量峰值）
     * @return maxNetworkTraffic
     */
    public Integer getMaxNetworkTraffic() {
        return maxNetworkTraffic;
    }

    public void setMaxNetworkTraffic(Integer maxNetworkTraffic) {
        this.maxNetworkTraffic = maxNetworkTraffic;
    }

    public NetworkTraffic withMaxUpstream(Integer maxUpstream) {
        this.maxUpstream = maxUpstream;
        return this;
    }

    /**
     * 最大上行带宽
     * @return maxUpstream
     */
    public Integer getMaxUpstream() {
        return maxUpstream;
    }

    public void setMaxUpstream(Integer maxUpstream) {
        this.maxUpstream = maxUpstream;
    }

    public NetworkTraffic withMinNetworkTraffic(Double minNetworkTraffic) {
        this.minNetworkTraffic = minNetworkTraffic;
        return this;
    }

    /**
     * 最小网络流量
     * @return minNetworkTraffic
     */
    public Double getMinNetworkTraffic() {
        return minNetworkTraffic;
    }

    public void setMinNetworkTraffic(Double minNetworkTraffic) {
        this.minNetworkTraffic = minNetworkTraffic;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NetworkTraffic that = (NetworkTraffic) obj;
        return Objects.equals(this.avgNetworkTraffic, that.avgNetworkTraffic)
            && Objects.equals(this.maxDownStream, that.maxDownStream)
            && Objects.equals(this.maxNetworkTraffic, that.maxNetworkTraffic)
            && Objects.equals(this.maxUpstream, that.maxUpstream)
            && Objects.equals(this.minNetworkTraffic, that.minNetworkTraffic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(avgNetworkTraffic, maxDownStream, maxNetworkTraffic, maxUpstream, minNetworkTraffic);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NetworkTraffic {\n");
        sb.append("    avgNetworkTraffic: ").append(toIndentedString(avgNetworkTraffic)).append("\n");
        sb.append("    maxDownStream: ").append(toIndentedString(maxDownStream)).append("\n");
        sb.append("    maxNetworkTraffic: ").append(toIndentedString(maxNetworkTraffic)).append("\n");
        sb.append("    maxUpstream: ").append(toIndentedString(maxUpstream)).append("\n");
        sb.append("    minNetworkTraffic: ").append(toIndentedString(minNetworkTraffic)).append("\n");
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
