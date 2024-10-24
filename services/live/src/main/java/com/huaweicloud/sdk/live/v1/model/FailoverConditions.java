package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 主备切换配置
 */
public class FailoverConditions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input_loss_threshold_msec")

    private Integer inputLossThresholdMsec;

    /**
     * 以主入流URL为第一优先级（PRIMARY）或主备URL平等切换（EQUAL）。  如果是平等切换时，使用的是备URL，不会自动切换至主URL。  非必填，默认值为EQUAL。
     */
    public static final class InputPreferenceEnum {

        /**
         * Enum EQUAL for value: "EQUAL"
         */
        public static final InputPreferenceEnum EQUAL = new InputPreferenceEnum("EQUAL");

        /**
         * Enum PRIMARY for value: "PRIMARY"
         */
        public static final InputPreferenceEnum PRIMARY = new InputPreferenceEnum("PRIMARY");

        private static final Map<String, InputPreferenceEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, InputPreferenceEnum> createStaticFields() {
            Map<String, InputPreferenceEnum> map = new HashMap<>();
            map.put("EQUAL", EQUAL);
            map.put("PRIMARY", PRIMARY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        InputPreferenceEnum(String value) {
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
        public static InputPreferenceEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new InputPreferenceEnum(value));
        }

        public static InputPreferenceEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof InputPreferenceEnum) {
                return this.value.equals(((InputPreferenceEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input_preference")

    private InputPreferenceEnum inputPreference;

    public FailoverConditions withInputLossThresholdMsec(Integer inputLossThresholdMsec) {
        this.inputLossThresholdMsec = inputLossThresholdMsec;
        return this;
    }

    /**
     * 入流停止的时长阈值。到达此阈值后，自动触发主备切换。  单位：毫秒，取值范围：0 - 3600000。  非必填，默认填2000ms。
     * minimum: 0
     * maximum: 3600000
     * @return inputLossThresholdMsec
     */
    public Integer getInputLossThresholdMsec() {
        return inputLossThresholdMsec;
    }

    public void setInputLossThresholdMsec(Integer inputLossThresholdMsec) {
        this.inputLossThresholdMsec = inputLossThresholdMsec;
    }

    public FailoverConditions withInputPreference(InputPreferenceEnum inputPreference) {
        this.inputPreference = inputPreference;
        return this;
    }

    /**
     * 以主入流URL为第一优先级（PRIMARY）或主备URL平等切换（EQUAL）。  如果是平等切换时，使用的是备URL，不会自动切换至主URL。  非必填，默认值为EQUAL。
     * @return inputPreference
     */
    public InputPreferenceEnum getInputPreference() {
        return inputPreference;
    }

    public void setInputPreference(InputPreferenceEnum inputPreference) {
        this.inputPreference = inputPreference;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FailoverConditions that = (FailoverConditions) obj;
        return Objects.equals(this.inputLossThresholdMsec, that.inputLossThresholdMsec)
            && Objects.equals(this.inputPreference, that.inputPreference);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inputLossThresholdMsec, inputPreference);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FailoverConditions {\n");
        sb.append("    inputLossThresholdMsec: ").append(toIndentedString(inputLossThresholdMsec)).append("\n");
        sb.append("    inputPreference: ").append(toIndentedString(inputPreference)).append("\n");
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
