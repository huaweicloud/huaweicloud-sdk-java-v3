package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * CustomerModifyAutoEnlargePolicyReq
 */
public class CustomerModifyAutoEnlargePolicyReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "switch_option")

    private Boolean switchOption;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit_size")

    private Integer limitSize;

    /**
     * 可用存储空间百分比，小于等于此值或者10GB时触发扩容，switch_option为true时必填
     */
    public static final class TriggerThresholdEnum {

        /**
         * Enum NUMBER_10 for value: 10
         */
        public static final TriggerThresholdEnum NUMBER_10 = new TriggerThresholdEnum(10);

        /**
         * Enum NUMBER_15 for value: 15
         */
        public static final TriggerThresholdEnum NUMBER_15 = new TriggerThresholdEnum(15);

        /**
         * Enum NUMBER_20 for value: 20
         */
        public static final TriggerThresholdEnum NUMBER_20 = new TriggerThresholdEnum(20);

        private static final Map<Integer, TriggerThresholdEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, TriggerThresholdEnum> createStaticFields() {
            Map<Integer, TriggerThresholdEnum> map = new HashMap<>();
            map.put(10, NUMBER_10);
            map.put(15, NUMBER_15);
            map.put(20, NUMBER_20);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        TriggerThresholdEnum(Integer value) {
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
        public static TriggerThresholdEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            TriggerThresholdEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TriggerThresholdEnum(value);
            }
            return result;
        }

        public static TriggerThresholdEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            TriggerThresholdEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TriggerThresholdEnum) {
                return this.value.equals(((TriggerThresholdEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_threshold")

    private TriggerThresholdEnum triggerThreshold;

    public CustomerModifyAutoEnlargePolicyReq withSwitchOption(Boolean switchOption) {
        this.switchOption = switchOption;
        return this;
    }

    /**
     * 是否开启自动扩容,true为开启,false为关闭
     * @return switchOption
     */
    public Boolean getSwitchOption() {
        return switchOption;
    }

    public void setSwitchOption(Boolean switchOption) {
        this.switchOption = switchOption;
    }

    public CustomerModifyAutoEnlargePolicyReq withLimitSize(Integer limitSize) {
        this.limitSize = limitSize;
        return this;
    }

    /**
     * 扩容上限，单位GB, 取值范围40~4000，需要大于等于实例当前存储空间总大小，switch_option为true必填
     * @return limitSize
     */
    public Integer getLimitSize() {
        return limitSize;
    }

    public void setLimitSize(Integer limitSize) {
        this.limitSize = limitSize;
    }

    public CustomerModifyAutoEnlargePolicyReq withTriggerThreshold(TriggerThresholdEnum triggerThreshold) {
        this.triggerThreshold = triggerThreshold;
        return this;
    }

    /**
     * 可用存储空间百分比，小于等于此值或者10GB时触发扩容，switch_option为true时必填
     * @return triggerThreshold
     */
    public TriggerThresholdEnum getTriggerThreshold() {
        return triggerThreshold;
    }

    public void setTriggerThreshold(TriggerThresholdEnum triggerThreshold) {
        this.triggerThreshold = triggerThreshold;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomerModifyAutoEnlargePolicyReq customerModifyAutoEnlargePolicyReq = (CustomerModifyAutoEnlargePolicyReq) o;
        return Objects.equals(this.switchOption, customerModifyAutoEnlargePolicyReq.switchOption)
            && Objects.equals(this.limitSize, customerModifyAutoEnlargePolicyReq.limitSize)
            && Objects.equals(this.triggerThreshold, customerModifyAutoEnlargePolicyReq.triggerThreshold);
    }

    @Override
    public int hashCode() {
        return Objects.hash(switchOption, limitSize, triggerThreshold);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomerModifyAutoEnlargePolicyReq {\n");
        sb.append("    switchOption: ").append(toIndentedString(switchOption)).append("\n");
        sb.append("    limitSize: ").append(toIndentedString(limitSize)).append("\n");
        sb.append("    triggerThreshold: ").append(toIndentedString(triggerThreshold)).append("\n");
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
