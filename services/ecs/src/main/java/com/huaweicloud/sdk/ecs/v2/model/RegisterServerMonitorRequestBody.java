package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * This is a auto create Body Object
 */
public class RegisterServerMonitorRequestBody {

    /**
     * 注册云服务器监控。
     */
    public static final class MonitorMetricsEnum {

        /**
         * Enum EMPTY for value: ""
         */
        public static final MonitorMetricsEnum EMPTY = new MonitorMetricsEnum("");

        private static final Map<String, MonitorMetricsEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MonitorMetricsEnum> createStaticFields() {
            Map<String, MonitorMetricsEnum> map = new HashMap<>();
            map.put("", EMPTY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MonitorMetricsEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static MonitorMetricsEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            MonitorMetricsEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new MonitorMetricsEnum(value);
            }
            return result;
        }

        public static MonitorMetricsEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            MonitorMetricsEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MonitorMetricsEnum) {
                return this.value.equals(((MonitorMetricsEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "monitorMetrics")

    private MonitorMetricsEnum monitorMetrics;

    public RegisterServerMonitorRequestBody withMonitorMetrics(MonitorMetricsEnum monitorMetrics) {
        this.monitorMetrics = monitorMetrics;
        return this;
    }

    /**
     * 注册云服务器监控。
     * @return monitorMetrics
     */
    public MonitorMetricsEnum getMonitorMetrics() {
        return monitorMetrics;
    }

    public void setMonitorMetrics(MonitorMetricsEnum monitorMetrics) {
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
