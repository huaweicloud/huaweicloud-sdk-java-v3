package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowAutopilotChartValuesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chart_id")

    private String chartId;

    public ShowAutopilotChartValuesRequest withChartId(String chartId) {
        this.chartId = chartId;
        return this;
    }

    /**
     * 模板的ID
     * @return chartId
     */
    public String getChartId() {
        return chartId;
    }

    public void setChartId(String chartId) {
        this.chartId = chartId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAutopilotChartValuesRequest that = (ShowAutopilotChartValuesRequest) obj;
        return Objects.equals(this.chartId, that.chartId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chartId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAutopilotChartValuesRequest {\n");
        sb.append("    chartId: ").append(toIndentedString(chartId)).append("\n");
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
