package com.huaweicloud.sdk.dwr.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 创建算子时用户可修改参数列表
 */
public class Input {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameter_name")

    private String parameterName;

    /**
     * 参数类型。可为string，integer，float，boolean，list，map。type为list类型时，value_type必填
     */
    public static final class TypeEnum {

        /**
         * Enum STRING for value: "string"
         */
        public static final TypeEnum STRING = new TypeEnum("string");

        /**
         * Enum INTEGER for value: "integer"
         */
        public static final TypeEnum INTEGER = new TypeEnum("integer");

        /**
         * Enum FLOAT for value: "float"
         */
        public static final TypeEnum FLOAT = new TypeEnum("float");

        /**
         * Enum BOOLEAN for value: "boolean"
         */
        public static final TypeEnum BOOLEAN = new TypeEnum("boolean");

        /**
         * Enum LIST for value: "list"
         */
        public static final TypeEnum LIST = new TypeEnum("list");

        /**
         * Enum MAP for value: "map"
         */
        public static final TypeEnum MAP = new TypeEnum("map");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("string", STRING);
            map.put("integer", INTEGER);
            map.put("float", FLOAT);
            map.put("boolean", BOOLEAN);
            map.put("list", LIST);
            map.put("map", MAP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value_type")

    private InputParaValueType valueType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_parameter_name")

    private String templateParameterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameter_value")

    private String parameterValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default")

    private String _default;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label")

    private String label;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "constraints")

    private Object constraints;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invisible")

    private Boolean invisible;

    public Input withParameterName(String parameterName) {
        this.parameterName = parameterName;
        return this;
    }

    /**
     * 输入参数名称，由小写字母、数字和中划线“-”组成
     * @return parameterName
     */
    public String getParameterName() {
        return parameterName;
    }

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    public Input withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 参数类型。可为string，integer，float，boolean，list，map。type为list类型时，value_type必填
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public Input withValueType(InputParaValueType valueType) {
        this.valueType = valueType;
        return this;
    }

    /**
     * Get valueType
     * @return valueType
     */
    public InputParaValueType getValueType() {
        return valueType;
    }

    public void setValueType(InputParaValueType valueType) {
        this.valueType = valueType;
    }

    public Input withTemplateParameterName(String templateParameterName) {
        this.templateParameterName = templateParameterName;
        return this;
    }

    /**
     * 当多个相同action template在一个工作流时，增加字段做国际化。 由小写字母、数字和中划线“-”组成
     * @return templateParameterName
     */
    public String getTemplateParameterName() {
        return templateParameterName;
    }

    public void setTemplateParameterName(String templateParameterName) {
        this.templateParameterName = templateParameterName;
    }

    public Input withParameterValue(String parameterValue) {
        this.parameterValue = parameterValue;
        return this;
    }

    /**
     * Input结构体参数类型。支持string,integer,float,boolean,list,map
     * @return parameterValue
     */
    public String getParameterValue() {
        return parameterValue;
    }

    public void setParameterValue(String parameterValue) {
        this.parameterValue = parameterValue;
    }

    public Input withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 参数项描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Input withDefault(String _default) {
        this._default = _default;
        return this;
    }

    /**
     * 默认值信息可在创建工作流实例时由外部输入替换；若未填写默认值，外部输入将必须填写这个参数的值。 注：默认值的类型和定义的参数类型必须统一。如果出现不一致，解析器可能会进行自动转换而导致出现与预期不符合的情况。
     * @return _default
     */
    public String getDefault() {
        return _default;
    }

    public void setDefault(String _default) {
        this._default = _default;
    }

    public Input withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * 参数的标签，此处定义的标签可在创建堆栈时进行分类展示。
     * @return label
     */
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Input withConstraints(Object constraints) {
        this.constraints = constraints;
        return this;
    }

    /**
     * 约束条件有以下几种，一个输入参数对每一种条件都只能定义一个规则。约束的多个条件中只要有一条不满足，即将认定参数非法。 equal：约定参数的value值必须等于特定值。 valid_values：参数的有效值，定义一个数组。 regex：参数需要满足某个正则条件，必须是字符串类型才可以进行匹配。 invalid_values：参数的无效值范围，如果参数值定义在其中，将会认为无效而报错。
     * @return constraints
     */
    public Object getConstraints() {
        return constraints;
    }

    public void setConstraints(Object constraints) {
        this.constraints = constraints;
    }

    public Input withInvisible(Boolean invisible) {
        this.invisible = invisible;
        return this;
    }

    /**
     * 输入参数的invisible设置为true时，返回值为******。
     * @return invisible
     */
    public Boolean getInvisible() {
        return invisible;
    }

    public void setInvisible(Boolean invisible) {
        this.invisible = invisible;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Input input = (Input) o;
        return Objects.equals(this.parameterName, input.parameterName) && Objects.equals(this.type, input.type)
            && Objects.equals(this.valueType, input.valueType)
            && Objects.equals(this.templateParameterName, input.templateParameterName)
            && Objects.equals(this.parameterValue, input.parameterValue)
            && Objects.equals(this.description, input.description) && Objects.equals(this._default, input._default)
            && Objects.equals(this.label, input.label) && Objects.equals(this.constraints, input.constraints)
            && Objects.equals(this.invisible, input.invisible);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parameterName,
            type,
            valueType,
            templateParameterName,
            parameterValue,
            description,
            _default,
            label,
            constraints,
            invisible);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Input {\n");
        sb.append("    parameterName: ").append(toIndentedString(parameterName)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
        sb.append("    templateParameterName: ").append(toIndentedString(templateParameterName)).append("\n");
        sb.append("    parameterValue: ").append(toIndentedString(parameterValue)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    constraints: ").append(toIndentedString(constraints)).append("\n");
        sb.append("    invisible: ").append(toIndentedString(invisible)).append("\n");
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
