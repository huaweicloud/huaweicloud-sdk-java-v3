package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class BatchLimitSpeedReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "speed_limits")

    @JacksonXmlProperty(localName = "speed_limits")

    private List<LimitSpeedReq> speedLimits = null;

    public BatchLimitSpeedReq withSpeedLimits(List<LimitSpeedReq> speedLimits) {
        this.speedLimits = speedLimits;
        return this;
    }

    public BatchLimitSpeedReq addSpeedLimitsItem(LimitSpeedReq speedLimitsItem) {
        if (this.speedLimits == null) {
            this.speedLimits = new ArrayList<>();
        }
        this.speedLimits.add(speedLimitsItem);
        return this;
    }

    public BatchLimitSpeedReq withSpeedLimits(Consumer<List<LimitSpeedReq>> speedLimitsSetter) {
        if (this.speedLimits == null) {
            this.speedLimits = new ArrayList<>();
        }
        speedLimitsSetter.accept(this.speedLimits);
        return this;
    }

    /**
     * 灾备限速设置信息
     * @return speedLimits
     */
    public List<LimitSpeedReq> getSpeedLimits() {
        return speedLimits;
    }

    public void setSpeedLimits(List<LimitSpeedReq> speedLimits) {
        this.speedLimits = speedLimits;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchLimitSpeedReq batchLimitSpeedReq = (BatchLimitSpeedReq) o;
        return Objects.equals(this.speedLimits, batchLimitSpeedReq.speedLimits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(speedLimits);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchLimitSpeedReq {\n");
        sb.append("    speedLimits: ").append(toIndentedString(speedLimits)).append("\n");
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
