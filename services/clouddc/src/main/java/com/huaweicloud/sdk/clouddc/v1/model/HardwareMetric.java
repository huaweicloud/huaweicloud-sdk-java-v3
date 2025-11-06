package com.huaweicloud.sdk.clouddc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 监控指标信息 **约束限制**： 不涉及 
 */
public class HardwareMetric {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_name")

    private String metricName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_devices")

    private List<String> metricDevices = null;

    public HardwareMetric withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * **参数解释**： 监控指标名 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return metricName
     */
    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    public HardwareMetric withMetricDevices(List<String> metricDevices) {
        this.metricDevices = metricDevices;
        return this;
    }

    public HardwareMetric addMetricDevicesItem(String metricDevicesItem) {
        if (this.metricDevices == null) {
            this.metricDevices = new ArrayList<>();
        }
        this.metricDevices.add(metricDevicesItem);
        return this;
    }

    public HardwareMetric withMetricDevices(Consumer<List<String>> metricDevicesSetter) {
        if (this.metricDevices == null) {
            this.metricDevices = new ArrayList<>();
        }
        metricDevicesSetter.accept(this.metricDevices);
        return this;
    }

    /**
     * **参数解释**： 监控指标对象 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return metricDevices
     */
    public List<String> getMetricDevices() {
        return metricDevices;
    }

    public void setMetricDevices(List<String> metricDevices) {
        this.metricDevices = metricDevices;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HardwareMetric that = (HardwareMetric) obj;
        return Objects.equals(this.metricName, that.metricName)
            && Objects.equals(this.metricDevices, that.metricDevices);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metricName, metricDevices);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HardwareMetric {\n");
        sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
        sb.append("    metricDevices: ").append(toIndentedString(metricDevices)).append("\n");
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
