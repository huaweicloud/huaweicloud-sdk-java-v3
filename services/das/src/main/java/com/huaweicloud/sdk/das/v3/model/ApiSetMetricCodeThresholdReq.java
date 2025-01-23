package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ApiSetMetricCodeThresholdReq
 */
public class ApiSetMetricCodeThresholdReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_code")

    private String metricCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore_type")

    private String datastoreType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_threshold")

    private Double newThreshold;

    public ApiSetMetricCodeThresholdReq withMetricCode(String metricCode) {
        this.metricCode = metricCode;
        return this;
    }

    /**
     * 指标码
     * @return metricCode
     */
    public String getMetricCode() {
        return metricCode;
    }

    public void setMetricCode(String metricCode) {
        this.metricCode = metricCode;
    }

    public ApiSetMetricCodeThresholdReq withDatastoreType(String datastoreType) {
        this.datastoreType = datastoreType;
        return this;
    }

    /**
     * 数据库类型
     * @return datastoreType
     */
    public String getDatastoreType() {
        return datastoreType;
    }

    public void setDatastoreType(String datastoreType) {
        this.datastoreType = datastoreType;
    }

    public ApiSetMetricCodeThresholdReq withNewThreshold(Double newThreshold) {
        this.newThreshold = newThreshold;
        return this;
    }

    /**
     * 新阈值
     * @return newThreshold
     */
    public Double getNewThreshold() {
        return newThreshold;
    }

    public void setNewThreshold(Double newThreshold) {
        this.newThreshold = newThreshold;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApiSetMetricCodeThresholdReq that = (ApiSetMetricCodeThresholdReq) obj;
        return Objects.equals(this.metricCode, that.metricCode)
            && Objects.equals(this.datastoreType, that.datastoreType)
            && Objects.equals(this.newThreshold, that.newThreshold);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metricCode, datastoreType, newThreshold);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiSetMetricCodeThresholdReq {\n");
        sb.append("    metricCode: ").append(toIndentedString(metricCode)).append("\n");
        sb.append("    datastoreType: ").append(toIndentedString(datastoreType)).append("\n");
        sb.append("    newThreshold: ").append(toIndentedString(newThreshold)).append("\n");
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
