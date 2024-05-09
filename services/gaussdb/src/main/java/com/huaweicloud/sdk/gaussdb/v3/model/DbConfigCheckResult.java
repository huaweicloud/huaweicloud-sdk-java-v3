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
 * 库配置校验检查结果。
 */
public class DbConfigCheckResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "param_name")

    private String paramName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    /**
     * 校验结果。
     */
    public static final class CheckResultEnum {

        /**
         * Enum SUCCESS for value: "success"
         */
        public static final CheckResultEnum SUCCESS = new CheckResultEnum("success");

        /**
         * Enum FAIL for value: "fail"
         */
        public static final CheckResultEnum FAIL = new CheckResultEnum("fail");

        private static final Map<String, CheckResultEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CheckResultEnum> createStaticFields() {
            Map<String, CheckResultEnum> map = new HashMap<>();
            map.put("success", SUCCESS);
            map.put("fail", FAIL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CheckResultEnum(String value) {
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
        public static CheckResultEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CheckResultEnum(value));
        }

        public static CheckResultEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CheckResultEnum) {
                return this.value.equals(((CheckResultEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_result")

    private CheckResultEnum checkResult;

    public DbConfigCheckResult withParamName(String paramName) {
        this.paramName = paramName;
        return this;
    }

    /**
     * 参数名。
     * @return paramName
     */
    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public DbConfigCheckResult withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 参数值。
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public DbConfigCheckResult withCheckResult(CheckResultEnum checkResult) {
        this.checkResult = checkResult;
        return this;
    }

    /**
     * 校验结果。
     * @return checkResult
     */
    public CheckResultEnum getCheckResult() {
        return checkResult;
    }

    public void setCheckResult(CheckResultEnum checkResult) {
        this.checkResult = checkResult;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DbConfigCheckResult that = (DbConfigCheckResult) obj;
        return Objects.equals(this.paramName, that.paramName) && Objects.equals(this.value, that.value)
            && Objects.equals(this.checkResult, that.checkResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paramName, value, checkResult);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DbConfigCheckResult {\n");
        sb.append("    paramName: ").append(toIndentedString(paramName)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    checkResult: ").append(toIndentedString(checkResult)).append("\n");
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
