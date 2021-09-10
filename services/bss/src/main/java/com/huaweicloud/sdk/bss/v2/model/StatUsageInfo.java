package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** StatUsageInfo */
public class StatUsageInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stat_time")

    private String statTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "guaranteed_band_width")

    private String guaranteedBandWidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usage")

    private String usage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "measure_id")

    private Integer measureId;

    public StatUsageInfo withStatTime(String statTime) {
        this.statTime = statTime;
        return this;
    }

    /** 统计时间点，格式为YYYY-MM-DDTHH:MM:SSZ，UTC时间。
     * 
     * @return statTime */
    public String getStatTime() {
        return statTime;
    }

    public void setStatTime(String statTime) {
        this.statTime = statTime;
    }

    public StatUsageInfo withGuaranteedBandWidth(String guaranteedBandWidth) {
        this.guaranteedBandWidth = guaranteedBandWidth;
        return this;
    }

    /** 保底带宽。 说明： 该字段为预留值，当前始终为空；当场景为95增强时才返回数值。
     * 
     * @return guaranteedBandWidth */
    public String getGuaranteedBandWidth() {
        return guaranteedBandWidth;
    }

    public void setGuaranteedBandWidth(String guaranteedBandWidth) {
        this.guaranteedBandWidth = guaranteedBandWidth;
    }

    public StatUsageInfo withUsage(String usage) {
        this.usage = usage;
        return this;
    }

    /** 用量。
     * 
     * @return usage */
    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public StatUsageInfo withMeasureId(Integer measureId) {
        this.measureId = measureId;
        return this;
    }

    /** 单位，您可以调用查询度量单位列表接口获取。带宽和用量使用相同的计量单位。
     * 
     * @return measureId */
    public Integer getMeasureId() {
        return measureId;
    }

    public void setMeasureId(Integer measureId) {
        this.measureId = measureId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StatUsageInfo statUsageInfo = (StatUsageInfo) o;
        return Objects.equals(this.statTime, statUsageInfo.statTime)
            && Objects.equals(this.guaranteedBandWidth, statUsageInfo.guaranteedBandWidth)
            && Objects.equals(this.usage, statUsageInfo.usage)
            && Objects.equals(this.measureId, statUsageInfo.measureId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statTime, guaranteedBandWidth, usage, measureId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StatUsageInfo {\n");
        sb.append("    statTime: ").append(toIndentedString(statTime)).append("\n");
        sb.append("    guaranteedBandWidth: ").append(toIndentedString(guaranteedBandWidth)).append("\n");
        sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
        sb.append("    measureId: ").append(toIndentedString(measureId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
