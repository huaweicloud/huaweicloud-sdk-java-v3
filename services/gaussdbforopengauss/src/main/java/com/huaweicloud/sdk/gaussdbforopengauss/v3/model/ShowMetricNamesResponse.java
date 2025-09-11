package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowMetricNamesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_names")

    private List<MetricNameResult> metricNames = null;

    public ShowMetricNamesResponse withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * **参数解释**: 指标组名。 **取值范围**: 不涉及。
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public ShowMetricNamesResponse withMetricNames(List<MetricNameResult> metricNames) {
        this.metricNames = metricNames;
        return this;
    }

    public ShowMetricNamesResponse addMetricNamesItem(MetricNameResult metricNamesItem) {
        if (this.metricNames == null) {
            this.metricNames = new ArrayList<>();
        }
        this.metricNames.add(metricNamesItem);
        return this;
    }

    public ShowMetricNamesResponse withMetricNames(Consumer<List<MetricNameResult>> metricNamesSetter) {
        if (this.metricNames == null) {
            this.metricNames = new ArrayList<>();
        }
        metricNamesSetter.accept(this.metricNames);
        return this;
    }

    /**
     * **参数解释**: 指标分组名称信息。
     * @return metricNames
     */
    public List<MetricNameResult> getMetricNames() {
        return metricNames;
    }

    public void setMetricNames(List<MetricNameResult> metricNames) {
        this.metricNames = metricNames;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowMetricNamesResponse that = (ShowMetricNamesResponse) obj;
        return Objects.equals(this.groupName, that.groupName) && Objects.equals(this.metricNames, that.metricNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupName, metricNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMetricNamesResponse {\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    metricNames: ").append(toIndentedString(metricNames)).append("\n");
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
