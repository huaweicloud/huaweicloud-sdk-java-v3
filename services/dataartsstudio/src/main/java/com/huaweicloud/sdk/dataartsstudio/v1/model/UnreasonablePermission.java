package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 权限控制合理性检测结果。
 */
public class UnreasonablePermission {

    /**
     * 检测结果 * NO_RISK 无风险 * MEDIUM_RISK 中风险 * HIGH_RISK 高风险 * NOT_SCANNED 未扫描
     */
    public static final class ResultEnum {

        /**
         * Enum NO_RISK for value: "NO_RISK"
         */
        public static final ResultEnum NO_RISK = new ResultEnum("NO_RISK");

        /**
         * Enum MEDIUM_RISK for value: "MEDIUM_RISK"
         */
        public static final ResultEnum MEDIUM_RISK = new ResultEnum("MEDIUM_RISK");

        /**
         * Enum HIGH_RISK for value: "HIGH_RISK"
         */
        public static final ResultEnum HIGH_RISK = new ResultEnum("HIGH_RISK");

        /**
         * Enum NOT_SCANNED for value: "NOT_SCANNED"
         */
        public static final ResultEnum NOT_SCANNED = new ResultEnum("NOT_SCANNED");

        private static final Map<String, ResultEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResultEnum> createStaticFields() {
            Map<String, ResultEnum> map = new HashMap<>();
            map.put("NO_RISK", NO_RISK);
            map.put("MEDIUM_RISK", MEDIUM_RISK);
            map.put("HIGH_RISK", HIGH_RISK);
            map.put("NOT_SCANNED", NOT_SCANNED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ResultEnum(String value) {
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
        public static ResultEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ResultEnum(value));
        }

        public static ResultEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ResultEnum) {
                return this.value.equals(((ResultEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private ResultEnum result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public UnreasonablePermission withResult(ResultEnum result) {
        this.result = result;
        return this;
    }

    /**
     * 检测结果 * NO_RISK 无风险 * MEDIUM_RISK 中风险 * HIGH_RISK 高风险 * NOT_SCANNED 未扫描
     * @return result
     */
    public ResultEnum getResult() {
        return result;
    }

    public void setResult(ResultEnum result) {
        this.result = result;
    }

    public UnreasonablePermission withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 存在风险的权限控制数量。
     * minimum: 0
     * maximum: 2147483647
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UnreasonablePermission that = (UnreasonablePermission) obj;
        return Objects.equals(this.result, that.result) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UnreasonablePermission {\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
