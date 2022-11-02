package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * This is a auto create Body Object
 */
public class RegisterServerMonitorRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "monitorMetrics")

    private String monitorMetrics;

    public RegisterServerMonitorRequestBody withMonitorMetrics(String monitorMetrics) {
        this.monitorMetrics = monitorMetrics;
        return this;
    }

    /**
     * 注册云服务器监控。
     * @return monitorMetrics
     */
    public String getMonitorMetrics() {
        return monitorMetrics;
    }

    public void setMonitorMetrics(String monitorMetrics) {
        this.monitorMetrics = monitorMetrics;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RegisterServerMonitorRequestBody registerServerMonitorRequestBody = (RegisterServerMonitorRequestBody) o;
        return Objects.equals(this.monitorMetrics, registerServerMonitorRequestBody.monitorMetrics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(monitorMetrics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RegisterServerMonitorRequestBody {\n");
        sb.append("    monitorMetrics: ").append(toIndentedString(monitorMetrics)).append("\n");
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
