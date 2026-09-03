package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowBackupUsageAlarmConfigResponse extends SdkResponse {

    /**
     * **参数解释**：  告警开关。  **约束限制**：  不涉及。  **取值范围**：  - ON - OFF  **默认取值**：  OFF。
     */
    public static final class AlarmEnabledEnum {

        /**
         * Enum ON for value: "ON"
         */
        public static final AlarmEnabledEnum ON = new AlarmEnabledEnum("ON");

        /**
         * Enum OFF for value: "OFF"
         */
        public static final AlarmEnabledEnum OFF = new AlarmEnabledEnum("OFF");

        private static final Map<String, AlarmEnabledEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AlarmEnabledEnum> createStaticFields() {
            Map<String, AlarmEnabledEnum> map = new HashMap<>();
            map.put("ON", ON);
            map.put("OFF", OFF);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AlarmEnabledEnum(String value) {
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
        public static AlarmEnabledEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AlarmEnabledEnum(value));
        }

        public static AlarmEnabledEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AlarmEnabledEnum) {
                return this.value.equals(((AlarmEnabledEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_enabled")

    private AlarmEnabledEnum alarmEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "threshold_percent")

    private Integer thresholdPercent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "increment_percent")

    private Integer incrementPercent;

    public ShowBackupUsageAlarmConfigResponse withAlarmEnabled(AlarmEnabledEnum alarmEnabled) {
        this.alarmEnabled = alarmEnabled;
        return this;
    }

    /**
     * **参数解释**：  告警开关。  **约束限制**：  不涉及。  **取值范围**：  - ON - OFF  **默认取值**：  OFF。
     * @return alarmEnabled
     */
    public AlarmEnabledEnum getAlarmEnabled() {
        return alarmEnabled;
    }

    public void setAlarmEnabled(AlarmEnabledEnum alarmEnabled) {
        this.alarmEnabled = alarmEnabled;
    }

    public ShowBackupUsageAlarmConfigResponse withThresholdPercent(Integer thresholdPercent) {
        this.thresholdPercent = thresholdPercent;
        return this;
    }

    /**
     * **参数解释**：  阈值百分比，占免费备份空间大小的百分比。  **约束限制**：  不涉及。  **取值范围**：  1-100。  **默认取值**：  90。
     * @return thresholdPercent
     */
    public Integer getThresholdPercent() {
        return thresholdPercent;
    }

    public void setThresholdPercent(Integer thresholdPercent) {
        this.thresholdPercent = thresholdPercent;
    }

    public ShowBackupUsageAlarmConfigResponse withIncrementPercent(Integer incrementPercent) {
        this.incrementPercent = incrementPercent;
        return this;
    }

    /**
     * **参数解释**：  增量百分比，占免费备份空间大小的百分比。  **约束限制**：  不涉及。  **取值范围**：  1-100。  **默认取值**：  10。
     * @return incrementPercent
     */
    public Integer getIncrementPercent() {
        return incrementPercent;
    }

    public void setIncrementPercent(Integer incrementPercent) {
        this.incrementPercent = incrementPercent;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowBackupUsageAlarmConfigResponse that = (ShowBackupUsageAlarmConfigResponse) obj;
        return Objects.equals(this.alarmEnabled, that.alarmEnabled)
            && Objects.equals(this.thresholdPercent, that.thresholdPercent)
            && Objects.equals(this.incrementPercent, that.incrementPercent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarmEnabled, thresholdPercent, incrementPercent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBackupUsageAlarmConfigResponse {\n");
        sb.append("    alarmEnabled: ").append(toIndentedString(alarmEnabled)).append("\n");
        sb.append("    thresholdPercent: ").append(toIndentedString(thresholdPercent)).append("\n");
        sb.append("    incrementPercent: ").append(toIndentedString(incrementPercent)).append("\n");
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
