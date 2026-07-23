package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowOpsAgentMetricGaugeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "original_value")

    private String originalValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "day_compare_data")

    private String dayCompareData;

    public ShowOpsAgentMetricGaugeResponse withOriginalValue(String originalValue) {
        this.originalValue = originalValue;
        return this;
    }

    /**
     * 当前区间的值
     * @return originalValue
     */
    public String getOriginalValue() {
        return originalValue;
    }

    public void setOriginalValue(String originalValue) {
        this.originalValue = originalValue;
    }

    public ShowOpsAgentMetricGaugeResponse withDayCompareData(String dayCompareData) {
        this.dayCompareData = dayCompareData;
        return this;
    }

    /**
     * 日环比、今日新增
     * @return dayCompareData
     */
    public String getDayCompareData() {
        return dayCompareData;
    }

    public void setDayCompareData(String dayCompareData) {
        this.dayCompareData = dayCompareData;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowOpsAgentMetricGaugeResponse that = (ShowOpsAgentMetricGaugeResponse) obj;
        return Objects.equals(this.originalValue, that.originalValue)
            && Objects.equals(this.dayCompareData, that.dayCompareData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(originalValue, dayCompareData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOpsAgentMetricGaugeResponse {\n");
        sb.append("    originalValue: ").append(toIndentedString(originalValue)).append("\n");
        sb.append("    dayCompareData: ").append(toIndentedString(dayCompareData)).append("\n");
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
