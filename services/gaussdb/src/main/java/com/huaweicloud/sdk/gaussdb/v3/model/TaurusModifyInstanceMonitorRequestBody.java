package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 秒级监控修改请求
 */
public class TaurusModifyInstanceMonitorRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "monitor_switch")

    private Boolean monitorSwitch;

    /**
     * 采集周期，仅在monitor_switch为true时生效。默认为5s。monitor_switch为false时，不传该参数。取值：  - 1：采集周期为1s。 - 5：采集周期为5s。
     */
    public static final class PeriodEnum {

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final PeriodEnum NUMBER_1 = new PeriodEnum(1);

        /**
         * Enum NUMBER_5 for value: 5
         */
        public static final PeriodEnum NUMBER_5 = new PeriodEnum(5);

        private static final Map<Integer, PeriodEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, PeriodEnum> createStaticFields() {
            Map<Integer, PeriodEnum> map = new HashMap<>();
            map.put(1, NUMBER_1);
            map.put(5, NUMBER_5);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        PeriodEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static PeriodEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PeriodEnum(value));
        }

        public static PeriodEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PeriodEnum) {
                return this.value.equals(((PeriodEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period")

    private PeriodEnum period;

    public TaurusModifyInstanceMonitorRequestBody withMonitorSwitch(Boolean monitorSwitch) {
        this.monitorSwitch = monitorSwitch;
        return this;
    }

    /**
     * 实例秒级监控开关。  - true：开启 - false：关闭
     * @return monitorSwitch
     */
    public Boolean getMonitorSwitch() {
        return monitorSwitch;
    }

    public void setMonitorSwitch(Boolean monitorSwitch) {
        this.monitorSwitch = monitorSwitch;
    }

    public TaurusModifyInstanceMonitorRequestBody withPeriod(PeriodEnum period) {
        this.period = period;
        return this;
    }

    /**
     * 采集周期，仅在monitor_switch为true时生效。默认为5s。monitor_switch为false时，不传该参数。取值：  - 1：采集周期为1s。 - 5：采集周期为5s。
     * @return period
     */
    public PeriodEnum getPeriod() {
        return period;
    }

    public void setPeriod(PeriodEnum period) {
        this.period = period;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaurusModifyInstanceMonitorRequestBody that = (TaurusModifyInstanceMonitorRequestBody) obj;
        return Objects.equals(this.monitorSwitch, that.monitorSwitch) && Objects.equals(this.period, that.period);
    }

    @Override
    public int hashCode() {
        return Objects.hash(monitorSwitch, period);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaurusModifyInstanceMonitorRequestBody {\n");
        sb.append("    monitorSwitch: ").append(toIndentedString(monitorSwitch)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
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
