package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * **参数解释**：端点指标信息。 
 */
public class V2EndpointMetric {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_name")

    private String metricName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_value")

    private BigDecimal metricValue;

    public V2EndpointMetric withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * **参数解释**：指标名称。 **取值范围**：监控指标与端点引擎类型相关，具体支持的指标如下：   - aura_job类型端点支持的指标参见：[[端点监控指标](https://support.huaweicloud.com/usermanual-aidatalake/aidatalake_01_0075.html)](tag:HEC)[[端点监控指标](https://support.huaweicloud.com/intl/zh-cn/usermanual-aidatalake/aidatalake_01_0075.html)](tag:hws_hk)。   - spark（SPARK_JOB / SPARK_SQL）类型端点支持的指标参见：[[端点监控指标](https://support.huaweicloud.com/usermanual-aidatalake/aidatalake_01_0067.html)](tag:HEC)[[端点监控指标](https://support.huaweicloud.com/intl/zh-cn/usermanual-aidatalake/aidatalake_01_0067.html)](tag:hws_hk)。 
     * @return metricName
     */
    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    public V2EndpointMetric withMetricValue(BigDecimal metricValue) {
        this.metricValue = metricValue;
        return this;
    }

    /**
     * **参数解释**：指标值。 **取值范围**：不涉及。 
     * @return metricValue
     */
    public BigDecimal getMetricValue() {
        return metricValue;
    }

    public void setMetricValue(BigDecimal metricValue) {
        this.metricValue = metricValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        V2EndpointMetric that = (V2EndpointMetric) obj;
        return Objects.equals(this.metricName, that.metricName) && Objects.equals(this.metricValue, that.metricValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metricName, metricValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class V2EndpointMetric {\n");
        sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
        sb.append("    metricValue: ").append(toIndentedString(metricValue)).append("\n");
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
