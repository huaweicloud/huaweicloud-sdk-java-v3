package com.huaweicloud.sdk.sms.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 源端校验项
 */
public class EnvironmentCheck {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "params")

    private List<String> params = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 检查结果 OK：检查通过 WARN：警告 ERROR:检查不通过
     */
    public static final class ResultEnum {

        /**
         * Enum OK for value: "OK"
         */
        public static final ResultEnum OK = new ResultEnum("OK");

        /**
         * Enum WARN for value: "WARN"
         */
        public static final ResultEnum WARN = new ResultEnum("WARN");

        /**
         * Enum ERROR for value: "ERROR"
         */
        public static final ResultEnum ERROR = new ResultEnum("ERROR");

        private static final Map<String, ResultEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResultEnum> createStaticFields() {
            Map<String, ResultEnum> map = new HashMap<>();
            map.put("OK", OK);
            map.put("WARN", WARN);
            map.put("ERROR", ERROR);
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
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_or_warn")

    private String errorOrWarn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_params")

    private String errorParams;

    public EnvironmentCheck withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 该检查项的ID
     * minimum: 0
     * maximum: 9223372036854775807
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EnvironmentCheck withParams(List<String> params) {
        this.params = params;
        return this;
    }

    public EnvironmentCheck addParamsItem(String paramsItem) {
        if (this.params == null) {
            this.params = new ArrayList<>();
        }
        this.params.add(paramsItem);
        return this;
    }

    public EnvironmentCheck withParams(Consumer<List<String>> paramsSetter) {
        if (this.params == null) {
            this.params = new ArrayList<>();
        }
        paramsSetter.accept(this.params);
        return this;
    }

    /**
     * 参数
     * @return params
     */
    public List<String> getParams() {
        return params;
    }

    public void setParams(List<String> params) {
        this.params = params;
    }

    public EnvironmentCheck withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 检查项名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnvironmentCheck withResult(ResultEnum result) {
        this.result = result;
        return this;
    }

    /**
     * 检查结果 OK：检查通过 WARN：警告 ERROR:检查不通过
     * @return result
     */
    public ResultEnum getResult() {
        return result;
    }

    public void setResult(ResultEnum result) {
        this.result = result;
    }

    public EnvironmentCheck withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 检查不通过的错误码
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public EnvironmentCheck withErrorOrWarn(String errorOrWarn) {
        this.errorOrWarn = errorOrWarn;
        return this;
    }

    /**
     * 检查的错误或者警告
     * @return errorOrWarn
     */
    public String getErrorOrWarn() {
        return errorOrWarn;
    }

    public void setErrorOrWarn(String errorOrWarn) {
        this.errorOrWarn = errorOrWarn;
    }

    public EnvironmentCheck withErrorParams(String errorParams) {
        this.errorParams = errorParams;
        return this;
    }

    /**
     * 检查不通过的错误参数
     * @return errorParams
     */
    public String getErrorParams() {
        return errorParams;
    }

    public void setErrorParams(String errorParams) {
        this.errorParams = errorParams;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EnvironmentCheck that = (EnvironmentCheck) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.params, that.params)
            && Objects.equals(this.name, that.name) && Objects.equals(this.result, that.result)
            && Objects.equals(this.errorCode, that.errorCode) && Objects.equals(this.errorOrWarn, that.errorOrWarn)
            && Objects.equals(this.errorParams, that.errorParams);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, params, name, result, errorCode, errorOrWarn, errorParams);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnvironmentCheck {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorOrWarn: ").append(toIndentedString(errorOrWarn)).append("\n");
        sb.append("    errorParams: ").append(toIndentedString(errorParams)).append("\n");
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
