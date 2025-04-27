package com.huaweicloud.sdk.gaussdb.v3.model;

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
public class ShowAutoExpandPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "switch_option")

    private Boolean switchOption;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit_size")

    private Integer limitSize;

    /**
     * **参数解释**：  可用存储空间率。 
     */
    public static final class TriggerAvailablePercentEnum {

        /**
         * Enum NUMBER_10 for value: 10
         */
        public static final TriggerAvailablePercentEnum NUMBER_10 = new TriggerAvailablePercentEnum(10);

        /**
         * Enum NUMBER_15 for value: 15
         */
        public static final TriggerAvailablePercentEnum NUMBER_15 = new TriggerAvailablePercentEnum(15);

        /**
         * Enum NUMBER_20 for value: 20
         */
        public static final TriggerAvailablePercentEnum NUMBER_20 = new TriggerAvailablePercentEnum(20);

        private static final Map<Integer, TriggerAvailablePercentEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, TriggerAvailablePercentEnum> createStaticFields() {
            Map<Integer, TriggerAvailablePercentEnum> map = new HashMap<>();
            map.put(10, NUMBER_10);
            map.put(15, NUMBER_15);
            map.put(20, NUMBER_20);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        TriggerAvailablePercentEnum(Integer value) {
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
        public static TriggerAvailablePercentEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElse(new TriggerAvailablePercentEnum(value));
        }

        public static TriggerAvailablePercentEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TriggerAvailablePercentEnum) {
                return this.value.equals(((TriggerAvailablePercentEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_available_percent")

    private TriggerAvailablePercentEnum triggerAvailablePercent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step_percent")

    private Integer stepPercent;

    public ShowAutoExpandPolicyResponse withSwitchOption(Boolean switchOption) {
        this.switchOption = switchOption;
        return this;
    }

    /**
     * **参数解释**：  自动扩容策略开关。 
     * @return switchOption
     */
    public Boolean getSwitchOption() {
        return switchOption;
    }

    public void setSwitchOption(Boolean switchOption) {
        this.switchOption = switchOption;
    }

    public ShowAutoExpandPolicyResponse withLimitSize(Integer limitSize) {
        this.limitSize = limitSize;
        return this;
    }

    /**
     * **参数解释**：  存储自动扩容上限，单位GB。 
     * minimum: 10
     * maximum: 2147483647
     * @return limitSize
     */
    public Integer getLimitSize() {
        return limitSize;
    }

    public void setLimitSize(Integer limitSize) {
        this.limitSize = limitSize;
    }

    public ShowAutoExpandPolicyResponse withTriggerAvailablePercent(
        TriggerAvailablePercentEnum triggerAvailablePercent) {
        this.triggerAvailablePercent = triggerAvailablePercent;
        return this;
    }

    /**
     * **参数解释**：  可用存储空间率。 
     * @return triggerAvailablePercent
     */
    public TriggerAvailablePercentEnum getTriggerAvailablePercent() {
        return triggerAvailablePercent;
    }

    public void setTriggerAvailablePercent(TriggerAvailablePercentEnum triggerAvailablePercent) {
        this.triggerAvailablePercent = triggerAvailablePercent;
    }

    public ShowAutoExpandPolicyResponse withStepPercent(Integer stepPercent) {
        this.stepPercent = stepPercent;
        return this;
    }

    /**
     * **参数解释**：  扩容步长百分比。 
     * minimum: 5
     * maximum: 100
     * @return stepPercent
     */
    public Integer getStepPercent() {
        return stepPercent;
    }

    public void setStepPercent(Integer stepPercent) {
        this.stepPercent = stepPercent;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAutoExpandPolicyResponse that = (ShowAutoExpandPolicyResponse) obj;
        return Objects.equals(this.switchOption, that.switchOption) && Objects.equals(this.limitSize, that.limitSize)
            && Objects.equals(this.triggerAvailablePercent, that.triggerAvailablePercent)
            && Objects.equals(this.stepPercent, that.stepPercent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(switchOption, limitSize, triggerAvailablePercent, stepPercent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAutoExpandPolicyResponse {\n");
        sb.append("    switchOption: ").append(toIndentedString(switchOption)).append("\n");
        sb.append("    limitSize: ").append(toIndentedString(limitSize)).append("\n");
        sb.append("    triggerAvailablePercent: ").append(toIndentedString(triggerAvailablePercent)).append("\n");
        sb.append("    stepPercent: ").append(toIndentedString(stepPercent)).append("\n");
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
