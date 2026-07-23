package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * **参数解释：** 评测集的Schema字段信息定义。 **取值范围：** 不涉及。
 */
public class OpsSchemaInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * **参数解释：** 字段的数据类型，定义数据的存储和解析方式。 **取值范围：** 支持String, Integer, Float, Boolean, Object, Array<String>,Array<Integer>,Array<Float>,Array<Boolean>,Array<Object> 以及Trajectory。
     */
    public static final class TypeEnum {

        /**
         * Enum STRING for value: "String"
         */
        public static final TypeEnum STRING = new TypeEnum("String");

        /**
         * Enum INTEGER for value: "Integer"
         */
        public static final TypeEnum INTEGER = new TypeEnum("Integer");

        /**
         * Enum FLOAT for value: "Float"
         */
        public static final TypeEnum FLOAT = new TypeEnum("Float");

        /**
         * Enum BOOLEAN for value: "Boolean"
         */
        public static final TypeEnum BOOLEAN = new TypeEnum("Boolean");

        /**
         * Enum OBJECT for value: "Object"
         */
        public static final TypeEnum OBJECT = new TypeEnum("Object");

        /**
         * Enum ARRAY_STRING_ for value: "Array<String>"
         */
        public static final TypeEnum ARRAY_STRING_ = new TypeEnum("Array<String>");

        /**
         * Enum ARRAY_INTEGER_ for value: "Array<Integer>"
         */
        public static final TypeEnum ARRAY_INTEGER_ = new TypeEnum("Array<Integer>");

        /**
         * Enum ARRAY_FLOAT_ for value: "Array<Float>"
         */
        public static final TypeEnum ARRAY_FLOAT_ = new TypeEnum("Array<Float>");

        /**
         * Enum ARRAY_BOOLEAN_ for value: "Array<Boolean>"
         */
        public static final TypeEnum ARRAY_BOOLEAN_ = new TypeEnum("Array<Boolean>");

        /**
         * Enum ARRAY_OBJECT_ for value: "Array<Object>"
         */
        public static final TypeEnum ARRAY_OBJECT_ = new TypeEnum("Array<Object>");

        /**
         * Enum TRAJECTORY for value: "Trajectory"
         */
        public static final TypeEnum TRAJECTORY = new TypeEnum("Trajectory");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("String", STRING);
            map.put("Integer", INTEGER);
            map.put("Float", FLOAT);
            map.put("Boolean", BOOLEAN);
            map.put("Object", OBJECT);
            map.put("Array<String>", ARRAY_STRING_);
            map.put("Array<Integer>", ARRAY_INTEGER_);
            map.put("Array<Float>", ARRAY_FLOAT_);
            map.put("Array<Boolean>", ARRAY_BOOLEAN_);
            map.put("Array<Object>", ARRAY_OBJECT_);
            map.put("Trajectory", TRAJECTORY);
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
    @JsonProperty(value = "is_required")

    private Boolean isRequired;

    public OpsSchemaInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 字段的唯一标识符。 **取值范围：** 符合通用唯一识别码(UUID)标准的字符串。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public OpsSchemaInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 字段的键名（Key），用于在数据条目中作为属性名。 **取值范围：** 建议符合变量命名规范的字符串。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OpsSchemaInfo withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 字段的数据类型，定义数据的存储和解析方式。 **取值范围：** 支持String, Integer, Float, Boolean, Object, Array<String>,Array<Integer>,Array<Float>,Array<Boolean>,Array<Object> 以及Trajectory。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public OpsSchemaInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 对该字段业务含义或用途的详细文字说明。 **取值范围：** 描述字段的业务含义或用途的文本，最大长度10000字符。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public OpsSchemaInfo withIsRequired(Boolean isRequired) {
        this.isRequired = isRequired;
        return this;
    }

    /**
     * **参数解释：** 标识该字段在数据条目中是否为必须存在的必填项。 **取值范围：** - true：必填 - false：选填
     * @return isRequired
     */
    public Boolean getIsRequired() {
        return isRequired;
    }

    public void setIsRequired(Boolean isRequired) {
        this.isRequired = isRequired;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsSchemaInfo that = (OpsSchemaInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.type, that.type) && Objects.equals(this.description, that.description)
            && Objects.equals(this.isRequired, that.isRequired);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type, description, isRequired);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsSchemaInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    isRequired: ").append(toIndentedString(isRequired)).append("\n");
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
