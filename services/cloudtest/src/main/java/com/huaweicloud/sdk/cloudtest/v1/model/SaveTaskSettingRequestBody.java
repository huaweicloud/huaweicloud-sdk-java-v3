package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * SaveTaskSettingRequestBody
 */
public class SaveTaskSettingRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_running_time")

    private Integer maxRunningTime;

    /**
     * 是否长期运行
     */
    public static final class IsLongRunEnum {

        /**
         * Enum _1 for value: "1"
         */
        public static final IsLongRunEnum _1 = new IsLongRunEnum("1");

        /**
         * Enum _0 for value: "0"
         */
        public static final IsLongRunEnum _0 = new IsLongRunEnum("0");

        private static final Map<String, IsLongRunEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, IsLongRunEnum> createStaticFields() {
            Map<String, IsLongRunEnum> map = new HashMap<>();
            map.put("1", _1);
            map.put("0", _0);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        IsLongRunEnum(String value) {
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
        public static IsLongRunEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new IsLongRunEnum(value));
        }

        public static IsLongRunEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof IsLongRunEnum) {
                return this.value.equals(((IsLongRunEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_long_run")

    private IsLongRunEnum isLongRun;

    public SaveTaskSettingRequestBody withMaxRunningTime(Integer maxRunningTime) {
        this.maxRunningTime = maxRunningTime;
        return this;
    }

    /**
     * 自定义时长
     * minimum: 0
     * maximum: 1000
     * @return maxRunningTime
     */
    public Integer getMaxRunningTime() {
        return maxRunningTime;
    }

    public void setMaxRunningTime(Integer maxRunningTime) {
        this.maxRunningTime = maxRunningTime;
    }

    public SaveTaskSettingRequestBody withIsLongRun(IsLongRunEnum isLongRun) {
        this.isLongRun = isLongRun;
        return this;
    }

    /**
     * 是否长期运行
     * @return isLongRun
     */
    public IsLongRunEnum getIsLongRun() {
        return isLongRun;
    }

    public void setIsLongRun(IsLongRunEnum isLongRun) {
        this.isLongRun = isLongRun;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SaveTaskSettingRequestBody that = (SaveTaskSettingRequestBody) obj;
        return Objects.equals(this.maxRunningTime, that.maxRunningTime)
            && Objects.equals(this.isLongRun, that.isLongRun);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxRunningTime, isLongRun);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SaveTaskSettingRequestBody {\n");
        sb.append("    maxRunningTime: ").append(toIndentedString(maxRunningTime)).append("\n");
        sb.append("    isLongRun: ").append(toIndentedString(isLongRun)).append("\n");
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
