package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class Indicator {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "indicator_name")

    private String indicatorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "indicator_params")

    private IndicatorParam indicatorParams;

    public Indicator withIndicatorName(String indicatorName) {
        this.indicatorName = indicatorName;
        return this;
    }

    /** 指标名称： - clickPVRate，点击PV率 - clickUVRate，点击UV率 - customize，自定义
     * 
     * @return indicatorName */
    public String getIndicatorName() {
        return indicatorName;
    }

    public void setIndicatorName(String indicatorName) {
        this.indicatorName = indicatorName;
    }

    public Indicator withIndicatorParams(IndicatorParam indicatorParams) {
        this.indicatorParams = indicatorParams;
        return this;
    }

    public Indicator withIndicatorParams(Consumer<IndicatorParam> indicatorParamsSetter) {
        if (this.indicatorParams == null) {
            this.indicatorParams = new IndicatorParam();
            indicatorParamsSetter.accept(this.indicatorParams);
        }

        return this;
    }

    /** Get indicatorParams
     * 
     * @return indicatorParams */
    public IndicatorParam getIndicatorParams() {
        return indicatorParams;
    }

    public void setIndicatorParams(IndicatorParam indicatorParams) {
        this.indicatorParams = indicatorParams;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Indicator indicator = (Indicator) o;
        return Objects.equals(this.indicatorName, indicator.indicatorName)
            && Objects.equals(this.indicatorParams, indicator.indicatorParams);
    }

    @Override
    public int hashCode() {
        return Objects.hash(indicatorName, indicatorParams);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Indicator {\n");
        sb.append("    indicatorName: ").append(toIndentedString(indicatorName)).append("\n");
        sb.append("    indicatorParams: ").append(toIndentedString(indicatorParams)).append("\n");
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
