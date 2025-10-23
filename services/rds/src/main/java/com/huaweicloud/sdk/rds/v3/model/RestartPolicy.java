package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RestartPolicy
 */
public class RestartPolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period")

    private List<String> period = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "utc_offset")

    private String utcOffset;

    public RestartPolicy withPeriod(List<String> period) {
        this.period = period;
        return this;
    }

    public RestartPolicy addPeriodItem(String periodItem) {
        if (this.period == null) {
            this.period = new ArrayList<>();
        }
        this.period.add(periodItem);
        return this;
    }

    public RestartPolicy withPeriod(Consumer<List<String>> periodSetter) {
        if (this.period == null) {
            this.period = new ArrayList<>();
        }
        periodSetter.accept(this.period);
        return this;
    }

    /**
     * 重启周期配置，在重启周期内的可维护时间窗进行重启，时区为UTC，取值范围： begin: 每月的第一天 middle：每月的15号 end：每月的最后一天 空列表，表示该功能关闭。
     * @return period
     */
    public List<String> getPeriod() {
        return period;
    }

    public void setPeriod(List<String> period) {
        this.period = period;
    }

    public RestartPolicy withUtcOffset(String utcOffset) {
        this.utcOffset = utcOffset;
        return this;
    }

    /**
     * 所在时区相较于UTC时间的偏移量，取值范围：格式必须为+hh:mm，或者-hh:mm，例如+08:00。
     * @return utcOffset
     */
    public String getUtcOffset() {
        return utcOffset;
    }

    public void setUtcOffset(String utcOffset) {
        this.utcOffset = utcOffset;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RestartPolicy that = (RestartPolicy) obj;
        return Objects.equals(this.period, that.period) && Objects.equals(this.utcOffset, that.utcOffset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(period, utcOffset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestartPolicy {\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    utcOffset: ").append(toIndentedString(utcOffset)).append("\n");
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
