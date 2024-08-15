package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ScriptExecuteInputParam
 */
public class ScriptExecuteInputParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "param_name")

    private String paramName;

    /**
     * 脚本入参的值，默认必填。有引用参数（param_refer不为空）时，允许为空
     */
    public static final class ParamValueEnum {

        /**
         * Enum _2 for value: "^((?!\\.{2"
         */
        public static final ParamValueEnum _2 = new ParamValueEnum("^((?!\\.{2");

        /**
         * Enum _A_ZA_Z0_9__X20_ for value: "})[a-zA-Z0-9_\\-/\\.\\x20\\?:\""
         */
        public static final ParamValueEnum _A_ZA_Z0_9__X20_ = new ParamValueEnum("})[a-zA-Z0-9_\\-/\\.\\x20\\?:\"");

        /**
         * Enum _ for value: "=+@\\\\\\[\\{\\]\\}])*$"
         */
        public static final ParamValueEnum _ = new ParamValueEnum("=+@\\\\\\[\\{\\]\\}])*$");

        private static final Map<String, ParamValueEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ParamValueEnum> createStaticFields() {
            Map<String, ParamValueEnum> map = new HashMap<>();
            map.put("^((?!\\.{2", _2);
            map.put("})[a-zA-Z0-9_\\-/\\.\\x20\\?:\"", _A_ZA_Z0_9__X20_);
            map.put("=+@\\\\\\[\\{\\]\\}])*$", _);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ParamValueEnum(String value) {
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
        public static ParamValueEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ParamValueEnum(value));
        }

        public static ParamValueEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ParamValueEnum) {
                return this.value.equals(((ParamValueEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "param_value")

    private ParamValueEnum paramValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "param_order")

    private Integer paramOrder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "param_refer")

    private ScriptExecuteParamReference paramRefer;

    public ScriptExecuteInputParam withParamName(String paramName) {
        this.paramName = paramName;
        return this;
    }

    /**
     * 脚本入参的名称,同一个脚本，参数名不能重复
     * @return paramName
     */
    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public ScriptExecuteInputParam withParamValue(ParamValueEnum paramValue) {
        this.paramValue = paramValue;
        return this;
    }

    /**
     * 脚本入参的值，默认必填。有引用参数（param_refer不为空）时，允许为空
     * @return paramValue
     */
    public ParamValueEnum getParamValue() {
        return paramValue;
    }

    public void setParamValue(ParamValueEnum paramValue) {
        this.paramValue = paramValue;
    }

    public ScriptExecuteInputParam withParamOrder(Integer paramOrder) {
        this.paramOrder = paramOrder;
        return this;
    }

    /**
     * 该参数已废弃，传入该参数不会生效。
     * @return paramOrder
     */
    public Integer getParamOrder() {
        return paramOrder;
    }

    public void setParamOrder(Integer paramOrder) {
        this.paramOrder = paramOrder;
    }

    public ScriptExecuteInputParam withParamRefer(ScriptExecuteParamReference paramRefer) {
        this.paramRefer = paramRefer;
        return this;
    }

    public ScriptExecuteInputParam withParamRefer(Consumer<ScriptExecuteParamReference> paramReferSetter) {
        if (this.paramRefer == null) {
            this.paramRefer = new ScriptExecuteParamReference();
            paramReferSetter.accept(this.paramRefer);
        }

        return this;
    }

    /**
     * Get paramRefer
     * @return paramRefer
     */
    public ScriptExecuteParamReference getParamRefer() {
        return paramRefer;
    }

    public void setParamRefer(ScriptExecuteParamReference paramRefer) {
        this.paramRefer = paramRefer;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScriptExecuteInputParam that = (ScriptExecuteInputParam) obj;
        return Objects.equals(this.paramName, that.paramName) && Objects.equals(this.paramValue, that.paramValue)
            && Objects.equals(this.paramOrder, that.paramOrder) && Objects.equals(this.paramRefer, that.paramRefer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paramName, paramValue, paramOrder, paramRefer);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScriptExecuteInputParam {\n");
        sb.append("    paramName: ").append(toIndentedString(paramName)).append("\n");
        sb.append("    paramValue: ").append(toIndentedString(paramValue)).append("\n");
        sb.append("    paramOrder: ").append(toIndentedString(paramOrder)).append("\n");
        sb.append("    paramRefer: ").append(toIndentedString(paramRefer)).append("\n");
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
