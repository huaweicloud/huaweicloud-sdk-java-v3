package com.huaweicloud.sdk.modelarts.v1.model;

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
 * 参数。
 */
public class WorkflowParameter {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 参数的类型，枚举值如下: - str：字符串 - int：整型 - bool：布尔类型 - float：浮点型
     */
    public static final class TypeEnum {

        /**
         * Enum STR_ for value: "str：字符串类型"
         */
        public static final TypeEnum STR_ = new TypeEnum("str：字符串类型");

        /**
         * Enum INT_ for value: "int：整型"
         */
        public static final TypeEnum INT_ = new TypeEnum("int：整型");

        /**
         * Enum BOOL_ for value: "bool：布尔类型"
         */
        public static final TypeEnum BOOL_ = new TypeEnum("bool：布尔类型");

        /**
         * Enum FLOAT_ for value: "float：浮点型"
         */
        public static final TypeEnum FLOAT_ = new TypeEnum("float：浮点型");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("str：字符串类型", STR_);
            map.put("int：整型", INT_);
            map.put("bool：布尔类型", BOOL_);
            map.put("float：浮点型", FLOAT_);
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "example")

    private Object example;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delay")

    private Boolean delay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default")

    private Object _default;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private Object value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enum")

    private List<Object> _enum = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_steps")

    private List<String> usedSteps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "format")

    private String format;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "constraint")

    private Map<String, Object> constraint = null;

    public WorkflowParameter withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Workflow工作流配置参数的名称。填写1-64位，仅包含英文、数字、下划线（_）和中划线（-），并且以英文开头的名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkflowParameter withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 参数的类型，枚举值如下: - str：字符串 - int：整型 - bool：布尔类型 - float：浮点型
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public WorkflowParameter withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Workflow工作流配置参数的描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public WorkflowParameter withExample(Object example) {
        this.example = example;
        return this;
    }

    /**
     * Workflow工作流配置参数的样例。
     * @return example
     */
    public Object getExample() {
        return example;
    }

    public void setExample(Object example) {
        this.example = example;
    }

    public WorkflowParameter withDelay(Boolean delay) {
        this.delay = delay;
        return this;
    }

    /**
     * 是否为延迟输入的参数，默认为否。
     * @return delay
     */
    public Boolean getDelay() {
        return delay;
    }

    public void setDelay(Boolean delay) {
        this.delay = delay;
    }

    public WorkflowParameter withDefault(Object _default) {
        this._default = _default;
        return this;
    }

    /**
     * 配置参数的默认值。
     * @return _default
     */
    public Object getDefault() {
        return _default;
    }

    public void setDefault(Object _default) {
        this._default = _default;
    }

    public WorkflowParameter withValue(Object value) {
        this.value = value;
        return this;
    }

    /**
     * 参数值。
     * @return value
     */
    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public WorkflowParameter withEnum(List<Object> _enum) {
        this._enum = _enum;
        return this;
    }

    public WorkflowParameter addEnumItem(Object _enumItem) {
        if (this._enum == null) {
            this._enum = new ArrayList<>();
        }
        this._enum.add(_enumItem);
        return this;
    }

    public WorkflowParameter withEnum(Consumer<List<Object>> _enumSetter) {
        if (this._enum == null) {
            this._enum = new ArrayList<>();
        }
        _enumSetter.accept(this._enum);
        return this;
    }

    /**
     * Workflow工作流配置参数的枚举项。
     * @return _enum
     */
    public List<Object> getEnum() {
        return _enum;
    }

    public void setEnum(List<Object> _enum) {
        this._enum = _enum;
    }

    public WorkflowParameter withUsedSteps(List<String> usedSteps) {
        this.usedSteps = usedSteps;
        return this;
    }

    public WorkflowParameter addUsedStepsItem(String usedStepsItem) {
        if (this.usedSteps == null) {
            this.usedSteps = new ArrayList<>();
        }
        this.usedSteps.add(usedStepsItem);
        return this;
    }

    public WorkflowParameter withUsedSteps(Consumer<List<String>> usedStepsSetter) {
        if (this.usedSteps == null) {
            this.usedSteps = new ArrayList<>();
        }
        usedStepsSetter.accept(this.usedSteps);
        return this;
    }

    /**
     * 使用这个参数的工作流节点。
     * @return usedSteps
     */
    public List<String> getUsedSteps() {
        return usedSteps;
    }

    public void setUsedSteps(List<String> usedSteps) {
        this.usedSteps = usedSteps;
    }

    public WorkflowParameter withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * 数据格式。
     * @return format
     */
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public WorkflowParameter withConstraint(Map<String, Object> constraint) {
        this.constraint = constraint;
        return this;
    }

    public WorkflowParameter putConstraintItem(String key, Object constraintItem) {
        if (this.constraint == null) {
            this.constraint = new HashMap<>();
        }
        this.constraint.put(key, constraintItem);
        return this;
    }

    public WorkflowParameter withConstraint(Consumer<Map<String, Object>> constraintSetter) {
        if (this.constraint == null) {
            this.constraint = new HashMap<>();
        }
        constraintSetter.accept(this.constraint);
        return this;
    }

    /**
     * 限制条件。
     * @return constraint
     */
    public Map<String, Object> getConstraint() {
        return constraint;
    }

    public void setConstraint(Map<String, Object> constraint) {
        this.constraint = constraint;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkflowParameter that = (WorkflowParameter) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.type, that.type)
            && Objects.equals(this.description, that.description) && Objects.equals(this.example, that.example)
            && Objects.equals(this.delay, that.delay) && Objects.equals(this._default, that._default)
            && Objects.equals(this.value, that.value) && Objects.equals(this._enum, that._enum)
            && Objects.equals(this.usedSteps, that.usedSteps) && Objects.equals(this.format, that.format)
            && Objects.equals(this.constraint, that.constraint);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(name, type, description, example, delay, _default, value, _enum, usedSteps, format, constraint);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowParameter {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    example: ").append(toIndentedString(example)).append("\n");
        sb.append("    delay: ").append(toIndentedString(delay)).append("\n");
        sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    _enum: ").append(toIndentedString(_enum)).append("\n");
        sb.append("    usedSteps: ").append(toIndentedString(usedSteps)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    constraint: ").append(toIndentedString(constraint)).append("\n");
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
