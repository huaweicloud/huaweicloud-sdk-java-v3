package com.huaweicloud.sdk.oms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 带宽限速策略。
 */
public class BandwidthPolicyDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end")

    private String end;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_bandwidth")

    private Long maxBandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start")

    private String start;

    public BandwidthPolicyDto withEnd(String end) {
        this.end = end;
        return this;
    }

    /**
     * 流量控制开始时间（包含），格式为“hh:mm”。例如“12:03”表示12时03分。
     * @return end
     */
    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public BandwidthPolicyDto withMaxBandwidth(Long maxBandwidth) {
        this.maxBandwidth = maxBandwidth;
        return this;
    }

    /**
     * 时段内允许的最大流量带宽，单位Byte/s，取值范围为>= 1048576Byte/s（相当于1MB/s）且<=209715200Byte/s（相当于200MB/s）。
     * minimum: 1048576
     * maximum: 209715200
     * @return maxBandwidth
     */
    public Long getMaxBandwidth() {
        return maxBandwidth;
    }

    public void setMaxBandwidth(Long maxBandwidth) {
        this.maxBandwidth = maxBandwidth;
    }

    public BandwidthPolicyDto withStart(String start) {
        this.start = start;
        return this;
    }

    /**
     * 流量控制开始时间（包含），格式为“hh:mm”。例如“12:03”表示12时03分。
     * @return start
     */
    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BandwidthPolicyDto bandwidthPolicyDto = (BandwidthPolicyDto) o;
        return Objects.equals(this.end, bandwidthPolicyDto.end)
            && Objects.equals(this.maxBandwidth, bandwidthPolicyDto.maxBandwidth)
            && Objects.equals(this.start, bandwidthPolicyDto.start);
    }

    @Override
    public int hashCode() {
        return Objects.hash(end, maxBandwidth, start);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BandwidthPolicyDto {\n");
        sb.append("    end: ").append(toIndentedString(end)).append("\n");
        sb.append("    maxBandwidth: ").append(toIndentedString(maxBandwidth)).append("\n");
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
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
