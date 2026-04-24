package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PeriodSlaTimeV2
 */
public class PeriodSlaTimeV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_num")

    private Long periodNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_time")

    private String periodTime;

    public PeriodSlaTimeV2 withPeriodNum(Long periodNum) {
        this.periodNum = periodNum;
        return this;
    }

    /**
     * 周期序号。
     * @return periodNum
     */
    public Long getPeriodNum() {
        return periodNum;
    }

    public void setPeriodNum(Long periodNum) {
        this.periodNum = periodNum;
    }

    public PeriodSlaTimeV2 withPeriodTime(String periodTime) {
        this.periodTime = periodTime;
        return this;
    }

    /**
     * 相应周期的时间。
     * @return periodTime
     */
    public String getPeriodTime() {
        return periodTime;
    }

    public void setPeriodTime(String periodTime) {
        this.periodTime = periodTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PeriodSlaTimeV2 that = (PeriodSlaTimeV2) obj;
        return Objects.equals(this.periodNum, that.periodNum) && Objects.equals(this.periodTime, that.periodTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(periodNum, periodTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PeriodSlaTimeV2 {\n");
        sb.append("    periodNum: ").append(toIndentedString(periodNum)).append("\n");
        sb.append("    periodTime: ").append(toIndentedString(periodTime)).append("\n");
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
