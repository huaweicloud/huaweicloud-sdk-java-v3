package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** 函数调用信息 */
public class FunctionRef {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ref_name")

    private String refName;

    /** 函数调用模式，目前只支持同步调用 */
    public static final class InvokeModeEnum {

        /** Enum SYNCHRONIZE for value: "synchronize" */
        public static final InvokeModeEnum SYNCHRONIZE = new InvokeModeEnum("synchronize");

        private static final Map<String, InvokeModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, InvokeModeEnum> createStaticFields() {
            Map<String, InvokeModeEnum> map = new HashMap<>();
            map.put("synchronize", SYNCHRONIZE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        InvokeModeEnum(String value) {
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
        public static InvokeModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            InvokeModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new InvokeModeEnum(value);
            }
            return result;
        }

        public static InvokeModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            InvokeModeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof InvokeModeEnum) {
                return this.value.equals(((InvokeModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invoke_mode")

    private InvokeModeEnum invokeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "arguments")

    private Object arguments;

    public FunctionRef withRefName(String refName) {
        this.refName = refName;
        return this;
    }

    /** 函数引用名称，需要和外层functions中的name对应
     * 
     * @return refName */
    public String getRefName() {
        return refName;
    }

    public void setRefName(String refName) {
        this.refName = refName;
    }

    public FunctionRef withInvokeMode(InvokeModeEnum invokeMode) {
        this.invokeMode = invokeMode;
        return this;
    }

    /** 函数调用模式，目前只支持同步调用
     * 
     * @return invokeMode */
    public InvokeModeEnum getInvokeMode() {
        return invokeMode;
    }

    public void setInvokeMode(InvokeModeEnum invokeMode) {
        this.invokeMode = invokeMode;
    }

    public FunctionRef withArguments(Object arguments) {
        this.arguments = arguments;
        return this;
    }

    /** 函数执行时的入参，支持引用constants中的常量 定义方式：参数路径 | 常量值/常量路径 参数路径指输入参数的JsonPath路径，如$.a.b[0].c
     * 常量值可以为数字类型，字符串类型(需要用单引号括起来)，布尔类型 常量路径为常量的JsonPath路径，但是根节点需要用$CONST表示，示例：$CONST.a.b
     * 
     * @return arguments */
    public Object getArguments() {
        return arguments;
    }

    public void setArguments(Object arguments) {
        this.arguments = arguments;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FunctionRef functionRef = (FunctionRef) o;
        return Objects.equals(this.refName, functionRef.refName)
            && Objects.equals(this.invokeMode, functionRef.invokeMode)
            && Objects.equals(this.arguments, functionRef.arguments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(refName, invokeMode, arguments);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FunctionRef {\n");
        sb.append("    refName: ").append(toIndentedString(refName)).append("\n");
        sb.append("    invokeMode: ").append(toIndentedString(invokeMode)).append("\n");
        sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
