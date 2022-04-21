package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * StatUsageSummaryInfo
 */
public class StatUsageSummaryInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actual_days")

    private String actualDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "band_width")

    private String bandWidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "monthly_guaranteed_band_width")

    private String monthlyGuaranteedBandWidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "monthly_peak_band_width")

    private String monthlyPeakBandWidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "band_width_measure_id")

    private Integer bandWidthMeasureId;

    public StatUsageSummaryInfo withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源ID。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public StatUsageSummaryInfo withActualDays(String actualDays) {
        this.actualDays = actualDays;
        return this;
    }

    /**
     * 有效天数，精度最高返回小数点后20位。  说明： 计算方式为上报的点数/288所得出的值。其中288为一天的点数，5分钟为一个点数单位。计算95费用时，因95费用是按月定价，若实际不足月，则是使用官网价*折扣*actual_days/当月天数，来计算费用明细。
     * @return actualDays
     */
    public String getActualDays() {
        return actualDays;
    }

    public void setActualDays(String actualDays) {
        this.actualDays = actualDays;
    }

    public StatUsageSummaryInfo withBandWidth(String bandWidth) {
        this.bandWidth = bandWidth;
        return this;
    }

    /**
     * 计费带宽的按月汇总。  说明： 每月2日20点后可查询上月数据；若查询当月数据，则为空。
     * @return bandWidth
     */
    public String getBandWidth() {
        return bandWidth;
    }

    public void setBandWidth(String bandWidth) {
        this.bandWidth = bandWidth;
    }

    public StatUsageSummaryInfo withMonthlyGuaranteedBandWidth(String monthlyGuaranteedBandWidth) {
        this.monthlyGuaranteedBandWidth = monthlyGuaranteedBandWidth;
        return this;
    }

    /**
     * 月保底带宽的按月汇总。  说明： 每月2日20点后可查询上月数据；若查询当月数据，则为空。该字段为预留值，当前始终为空；当场景为95增强时才返回数值。
     * @return monthlyGuaranteedBandWidth
     */
    public String getMonthlyGuaranteedBandWidth() {
        return monthlyGuaranteedBandWidth;
    }

    public void setMonthlyGuaranteedBandWidth(String monthlyGuaranteedBandWidth) {
        this.monthlyGuaranteedBandWidth = monthlyGuaranteedBandWidth;
    }

    public StatUsageSummaryInfo withMonthlyPeakBandWidth(String monthlyPeakBandWidth) {
        this.monthlyPeakBandWidth = monthlyPeakBandWidth;
        return this;
    }

    /**
     * 月峰值带宽。  说明： 每月2日20点后可查询上月数据；若查询当月数据，则为空。该字段为预留值，当前始终为空；当场景为95增强时才返回数值。
     * @return monthlyPeakBandWidth
     */
    public String getMonthlyPeakBandWidth() {
        return monthlyPeakBandWidth;
    }

    public void setMonthlyPeakBandWidth(String monthlyPeakBandWidth) {
        this.monthlyPeakBandWidth = monthlyPeakBandWidth;
    }

    public StatUsageSummaryInfo withBandWidthMeasureId(Integer bandWidthMeasureId) {
        this.bandWidthMeasureId = bandWidthMeasureId;
        return this;
    }

    /**
     * 带宽单位，您可以调用查询度量单位列表接口获取。若所有带宽为空，则该字段为空。
     * @return bandWidthMeasureId
     */
    public Integer getBandWidthMeasureId() {
        return bandWidthMeasureId;
    }

    public void setBandWidthMeasureId(Integer bandWidthMeasureId) {
        this.bandWidthMeasureId = bandWidthMeasureId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StatUsageSummaryInfo statUsageSummaryInfo = (StatUsageSummaryInfo) o;
        return Objects.equals(this.resourceId, statUsageSummaryInfo.resourceId)
            && Objects.equals(this.actualDays, statUsageSummaryInfo.actualDays)
            && Objects.equals(this.bandWidth, statUsageSummaryInfo.bandWidth)
            && Objects.equals(this.monthlyGuaranteedBandWidth, statUsageSummaryInfo.monthlyGuaranteedBandWidth)
            && Objects.equals(this.monthlyPeakBandWidth, statUsageSummaryInfo.monthlyPeakBandWidth)
            && Objects.equals(this.bandWidthMeasureId, statUsageSummaryInfo.bandWidthMeasureId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceId,
            actualDays,
            bandWidth,
            monthlyGuaranteedBandWidth,
            monthlyPeakBandWidth,
            bandWidthMeasureId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StatUsageSummaryInfo {\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    actualDays: ").append(toIndentedString(actualDays)).append("\n");
        sb.append("    bandWidth: ").append(toIndentedString(bandWidth)).append("\n");
        sb.append("    monthlyGuaranteedBandWidth: ").append(toIndentedString(monthlyGuaranteedBandWidth)).append("\n");
        sb.append("    monthlyPeakBandWidth: ").append(toIndentedString(monthlyPeakBandWidth)).append("\n");
        sb.append("    bandWidthMeasureId: ").append(toIndentedString(bandWidthMeasureId)).append("\n");
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
