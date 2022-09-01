package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 示例字段对象
 */
public class DemoField {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field_name")

    @JacksonXmlProperty(localName = "field_name")

    private String fieldName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    @JacksonXmlProperty(localName = "content")

    private String content;

    /**
     * 字段数据类型。 可选范围：string、long、float
     */
    public static final class TypeEnum {

        /**
         * Enum STRING for value: "string"
         */
        public static final TypeEnum STRING = new TypeEnum("string");

        /**
         * Enum LONG for value: "long"
         */
        public static final TypeEnum LONG = new TypeEnum("long");

        /**
         * Enum FLOAT for value: "float"
         */
        public static final TypeEnum FLOAT = new TypeEnum("float");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("string", STRING);
            map.put("long", LONG);
            map.put("float", FLOAT);
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

    @JacksonXmlProperty(localName = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_analysis")

    @JacksonXmlProperty(localName = "is_analysis")

    private Boolean isAnalysis;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index")

    @JacksonXmlProperty(localName = "index")

    private Integer index;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relation")

    @JacksonXmlProperty(localName = "relation")

    private String relation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_defined_name")

    @JacksonXmlProperty(localName = "user_defined_name")

    private String userDefinedName;

    public DemoField withFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    /**
     * 字段名称
     * @return fieldName
     */
    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public DemoField withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * 字段示例内容
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public DemoField withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 字段数据类型。 可选范围：string、long、float
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public DemoField withIsAnalysis(Boolean isAnalysis) {
        this.isAnalysis = isAnalysis;
        return this;
    }

    /**
     * 是否开启快速分析
     * @return isAnalysis
     */
    public Boolean getIsAnalysis() {
        return isAnalysis;
    }

    public void setIsAnalysis(Boolean isAnalysis) {
        this.isAnalysis = isAnalysis;
    }

    public DemoField withIndex(Integer index) {
        this.index = index;
        return this;
    }

    /**
     * 手动正则及分隔符方式中字段序号
     * minimum: 0
     * maximum: 200
     * @return index
     */
    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public DemoField withRelation(String relation) {
        this.relation = relation;
        return this;
    }

    /**
     * 描叙多层级json中字段间的层级关系
     * @return relation
     */
    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public DemoField withUserDefinedName(String userDefinedName) {
        this.userDefinedName = userDefinedName;
        return this;
    }

    /**
     * json及nginx方式中字段自定义别名
     * @return userDefinedName
     */
    public String getUserDefinedName() {
        return userDefinedName;
    }

    public void setUserDefinedName(String userDefinedName) {
        this.userDefinedName = userDefinedName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DemoField demoField = (DemoField) o;
        return Objects.equals(this.fieldName, demoField.fieldName) && Objects.equals(this.content, demoField.content)
            && Objects.equals(this.type, demoField.type) && Objects.equals(this.isAnalysis, demoField.isAnalysis)
            && Objects.equals(this.index, demoField.index) && Objects.equals(this.relation, demoField.relation)
            && Objects.equals(this.userDefinedName, demoField.userDefinedName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fieldName, content, type, isAnalysis, index, relation, userDefinedName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DemoField {\n");
        sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    isAnalysis: ").append(toIndentedString(isAnalysis)).append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    relation: ").append(toIndentedString(relation)).append("\n");
        sb.append("    userDefinedName: ").append(toIndentedString(userDefinedName)).append("\n");
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
