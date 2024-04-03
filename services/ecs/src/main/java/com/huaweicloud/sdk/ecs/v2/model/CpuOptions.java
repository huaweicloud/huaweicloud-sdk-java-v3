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
 * 自定义CPU选项。
 */
public class CpuOptions {

    /**
     * CPU超线程数， 决定CPU是否开启超线程。取值范围：1，2。  - 1: 关闭超线程。 - 2: 打开超线程。  取值不能大于flavor中的   hw:cpu_threads，并且目标flavor配置需满足 \"hw:cpu_policy\": \"dedicated\",\"hw:cpu_threads\": \"2\"需要同时满足如下条件，才能设置为“关闭超线程”  - 只能在实例创建或者resize时指定。 - 只有目标flavor的extra_specs参数： - 存在“hw:cpu_policy”并取值为“dedicated”。 - 存在“hw:cpu_threads”并取值为“2”。
     */
    public static final class HwCpuThreadsEnum {

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final HwCpuThreadsEnum NUMBER_1 = new HwCpuThreadsEnum(1);

        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final HwCpuThreadsEnum NUMBER_2 = new HwCpuThreadsEnum(2);

        private static final Map<Integer, HwCpuThreadsEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, HwCpuThreadsEnum> createStaticFields() {
            Map<Integer, HwCpuThreadsEnum> map = new HashMap<>();
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        HwCpuThreadsEnum(Integer value) {
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
        public static HwCpuThreadsEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new HwCpuThreadsEnum(value));
        }

        public static HwCpuThreadsEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof HwCpuThreadsEnum) {
                return this.value.equals(((HwCpuThreadsEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hw:cpu_threads")

    private HwCpuThreadsEnum hwCpuThreads;

    public CpuOptions withHwCpuThreads(HwCpuThreadsEnum hwCpuThreads) {
        this.hwCpuThreads = hwCpuThreads;
        return this;
    }

    /**
     * CPU超线程数， 决定CPU是否开启超线程。取值范围：1，2。  - 1: 关闭超线程。 - 2: 打开超线程。  取值不能大于flavor中的   hw:cpu_threads，并且目标flavor配置需满足 \"hw:cpu_policy\": \"dedicated\",\"hw:cpu_threads\": \"2\"需要同时满足如下条件，才能设置为“关闭超线程”  - 只能在实例创建或者resize时指定。 - 只有目标flavor的extra_specs参数： - 存在“hw:cpu_policy”并取值为“dedicated”。 - 存在“hw:cpu_threads”并取值为“2”。
     * @return hwCpuThreads
     */
    public HwCpuThreadsEnum getHwCpuThreads() {
        return hwCpuThreads;
    }

    public void setHwCpuThreads(HwCpuThreadsEnum hwCpuThreads) {
        this.hwCpuThreads = hwCpuThreads;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CpuOptions that = (CpuOptions) obj;
        return Objects.equals(this.hwCpuThreads, that.hwCpuThreads);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hwCpuThreads);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CpuOptions {\n");
        sb.append("    hwCpuThreads: ").append(toIndentedString(hwCpuThreads)).append("\n");
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
