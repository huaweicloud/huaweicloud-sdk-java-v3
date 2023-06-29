package com.huaweicloud.sdk.aom.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RateControl
 */
public class RateControl {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "have_rate_control")

    private Boolean haveRateControl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_delay")

    private Integer timeDelay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max")

    private Integer max;

    public RateControl withHaveRateControl(Boolean haveRateControl) {
        this.haveRateControl = haveRateControl;
        return this;
    }

    /**
     * 是否分批发布，默认值是false。
     * @return haveRateControl
     */
    public Boolean getHaveRateControl() {
        return haveRateControl;
    }

    public void setHaveRateControl(Boolean haveRateControl) {
        this.haveRateControl = haveRateControl;
    }

    public RateControl withTimeDelay(Integer timeDelay) {
        this.timeDelay = timeDelay;
        return this;
    }

    /**
     * 每批间隔。
     * minimum: 1
     * maximum: 60
     * @return timeDelay
     */
    public Integer getTimeDelay() {
        return timeDelay;
    }

    public void setTimeDelay(Integer timeDelay) {
        this.timeDelay = timeDelay;
    }

    public RateControl withMax(Integer max) {
        this.max = max;
        return this;
    }

    /**
     * 每批支持的最大实例数。
     * minimum: 0
     * maximum: 100
     * @return max
     */
    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RateControl that = (RateControl) obj;
        return Objects.equals(this.haveRateControl, that.haveRateControl)
            && Objects.equals(this.timeDelay, that.timeDelay) && Objects.equals(this.max, that.max);
    }

    @Override
    public int hashCode() {
        return Objects.hash(haveRateControl, timeDelay, max);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RateControl {\n");
        sb.append("    haveRateControl: ").append(toIndentedString(haveRateControl)).append("\n");
        sb.append("    timeDelay: ").append(toIndentedString(timeDelay)).append("\n");
        sb.append("    max: ").append(toIndentedString(max)).append("\n");
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
