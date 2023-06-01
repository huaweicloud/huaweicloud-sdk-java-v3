package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PeakMetric
 */
public class PeakMetric {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vuser")

    private Integer vuser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rps")

    private Double rps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avgRT")

    private Double avgRT;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "successRate")

    private Double successRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peakTime")

    private String peakTime;

    public PeakMetric withVuser(Integer vuser) {
        this.vuser = vuser;
        return this;
    }

    /**
     * vusers
     * @return vuser
     */
    public Integer getVuser() {
        return vuser;
    }

    public void setVuser(Integer vuser) {
        this.vuser = vuser;
    }

    public PeakMetric withRps(Double rps) {
        this.rps = rps;
        return this;
    }

    /**
     * tps
     * @return rps
     */
    public Double getRps() {
        return rps;
    }

    public void setRps(Double rps) {
        this.rps = rps;
    }

    public PeakMetric withAvgRT(Double avgRT) {
        this.avgRT = avgRT;
        return this;
    }

    /**
     * avgRT
     * @return avgRT
     */
    public Double getAvgRT() {
        return avgRT;
    }

    public void setAvgRT(Double avgRT) {
        this.avgRT = avgRT;
    }

    public PeakMetric withSuccessRate(Double successRate) {
        this.successRate = successRate;
        return this;
    }

    /**
     * 成功率
     * @return successRate
     */
    public Double getSuccessRate() {
        return successRate;
    }

    public void setSuccessRate(Double successRate) {
        this.successRate = successRate;
    }

    public PeakMetric withPeakTime(String peakTime) {
        this.peakTime = peakTime;
        return this;
    }

    /**
     * 峰值时间
     * @return peakTime
     */
    public String getPeakTime() {
        return peakTime;
    }

    public void setPeakTime(String peakTime) {
        this.peakTime = peakTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PeakMetric peakMetric = (PeakMetric) o;
        return Objects.equals(this.vuser, peakMetric.vuser) && Objects.equals(this.rps, peakMetric.rps)
            && Objects.equals(this.avgRT, peakMetric.avgRT) && Objects.equals(this.successRate, peakMetric.successRate)
            && Objects.equals(this.peakTime, peakMetric.peakTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vuser, rps, avgRT, successRate, peakTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PeakMetric {\n");
        sb.append("    vuser: ").append(toIndentedString(vuser)).append("\n");
        sb.append("    rps: ").append(toIndentedString(rps)).append("\n");
        sb.append("    avgRT: ").append(toIndentedString(avgRT)).append("\n");
        sb.append("    successRate: ").append(toIndentedString(successRate)).append("\n");
        sb.append("    peakTime: ").append(toIndentedString(peakTime)).append("\n");
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
