package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 日志保留设置
 */
public class CommonSettingsResponseLogRetention {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retention_days")

    private Integer retentionDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "range_days_min")

    private Integer rangeDaysMin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "range_days_max")

    private Integer rangeDaysMax;

    public CommonSettingsResponseLogRetention withRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
        return this;
    }

    /**
     * 设定的审计日志保存时间
     * @return retentionDays
     */
    public Integer getRetentionDays() {
        return retentionDays;
    }

    public void setRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
    }

    public CommonSettingsResponseLogRetention withRangeDaysMin(Integer rangeDaysMin) {
        this.rangeDaysMin = rangeDaysMin;
        return this;
    }

    /**
     * 审计日志保存时间设置最小时间
     * @return rangeDaysMin
     */
    public Integer getRangeDaysMin() {
        return rangeDaysMin;
    }

    public void setRangeDaysMin(Integer rangeDaysMin) {
        this.rangeDaysMin = rangeDaysMin;
    }

    public CommonSettingsResponseLogRetention withRangeDaysMax(Integer rangeDaysMax) {
        this.rangeDaysMax = rangeDaysMax;
        return this;
    }

    /**
     * 审计日志保存时间设置最大时间
     * @return rangeDaysMax
     */
    public Integer getRangeDaysMax() {
        return rangeDaysMax;
    }

    public void setRangeDaysMax(Integer rangeDaysMax) {
        this.rangeDaysMax = rangeDaysMax;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CommonSettingsResponseLogRetention that = (CommonSettingsResponseLogRetention) obj;
        return Objects.equals(this.retentionDays, that.retentionDays)
            && Objects.equals(this.rangeDaysMin, that.rangeDaysMin)
            && Objects.equals(this.rangeDaysMax, that.rangeDaysMax);
    }

    @Override
    public int hashCode() {
        return Objects.hash(retentionDays, rangeDaysMin, rangeDaysMax);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommonSettingsResponseLogRetention {\n");
        sb.append("    retentionDays: ").append(toIndentedString(retentionDays)).append("\n");
        sb.append("    rangeDaysMin: ").append(toIndentedString(rangeDaysMin)).append("\n");
        sb.append("    rangeDaysMax: ").append(toIndentedString(rangeDaysMax)).append("\n");
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
