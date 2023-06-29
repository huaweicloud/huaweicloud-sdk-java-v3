package com.huaweicloud.sdk.cloudrtc.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * app自动录制模式
 */
public class AppAutoRecordMode {

    /**
     * 录制模式。 - AUTO_RECORD_OFF：关闭自动录制。 - AUTO_INDIVIDUAL_RECORD：开启单流自动录制，此时record_rule_id必须非空。 
     */
    public static final class ModeEnum {

        /**
         * Enum AUTO_RECORD_OFF for value: "AUTO_RECORD_OFF"
         */
        public static final ModeEnum AUTO_RECORD_OFF = new ModeEnum("AUTO_RECORD_OFF");

        /**
         * Enum AUTO_INDIVIDUAL_RECORD for value: "AUTO_INDIVIDUAL_RECORD"
         */
        public static final ModeEnum AUTO_INDIVIDUAL_RECORD = new ModeEnum("AUTO_INDIVIDUAL_RECORD");

        private static final Map<String, ModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ModeEnum> createStaticFields() {
            Map<String, ModeEnum> map = new HashMap<>();
            map.put("AUTO_RECORD_OFF", AUTO_RECORD_OFF);
            map.put("AUTO_INDIVIDUAL_RECORD", AUTO_INDIVIDUAL_RECORD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ModeEnum(String value) {
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
        public static ModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ModeEnum(value));
        }

        public static ModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ModeEnum) {
                return this.value.equals(((ModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private ModeEnum mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_rule_id")

    private String recordRuleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    public AppAutoRecordMode withMode(ModeEnum mode) {
        this.mode = mode;
        return this;
    }

    /**
     * 录制模式。 - AUTO_RECORD_OFF：关闭自动录制。 - AUTO_INDIVIDUAL_RECORD：开启单流自动录制，此时record_rule_id必须非空。 
     * @return mode
     */
    public ModeEnum getMode() {
        return mode;
    }

    public void setMode(ModeEnum mode) {
        this.mode = mode;
    }

    public AppAutoRecordMode withRecordRuleId(String recordRuleId) {
        this.recordRuleId = recordRuleId;
        return this;
    }

    /**
     * 录制规则id。
     * @return recordRuleId
     */
    public String getRecordRuleId() {
        return recordRuleId;
    }

    public void setRecordRuleId(String recordRuleId) {
        this.recordRuleId = recordRuleId;
    }

    public AppAutoRecordMode withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间，形如“2006-01-02T15:04:05.075Z”，时区为：UTC。 
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AppAutoRecordMode that = (AppAutoRecordMode) obj;
        return Objects.equals(this.mode, that.mode) && Objects.equals(this.recordRuleId, that.recordRuleId)
            && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mode, recordRuleId, updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppAutoRecordMode {\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    recordRuleId: ").append(toIndentedString(recordRuleId)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
