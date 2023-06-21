package com.huaweicloud.sdk.dataartsstudio.v1.model;

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
 * CustomizedFieldsVOList
 */
public class CustomizedFieldsVOList {

    /**
     * 自定义项类型:TABLE, ATTRIBUTE, SUBJECT, METRIC
     */
    public static final class TypeEnum {

        /**
         * Enum TABLE for value: "TABLE"
         */
        public static final TypeEnum TABLE = new TypeEnum("TABLE");

        /**
         * Enum ATTRIBUTE for value: "ATTRIBUTE"
         */
        public static final TypeEnum ATTRIBUTE = new TypeEnum("ATTRIBUTE");

        /**
         * Enum SUBJECT for value: "SUBJECT"
         */
        public static final TypeEnum SUBJECT = new TypeEnum("SUBJECT");

        /**
         * Enum METRIC for value: "METRIC"
         */
        public static final TypeEnum METRIC = new TypeEnum("METRIC");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("TABLE", TABLE);
            map.put("ATTRIBUTE", ATTRIBUTE);
            map.put("SUBJECT", SUBJECT);
            map.put("METRIC", METRIC);
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
    @JsonProperty(value = "fields")

    private List<CustomizedFieldsVO> fields = null;

    public CustomizedFieldsVOList withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 自定义项类型:TABLE, ATTRIBUTE, SUBJECT, METRIC
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public CustomizedFieldsVOList withFields(List<CustomizedFieldsVO> fields) {
        this.fields = fields;
        return this;
    }

    public CustomizedFieldsVOList addFieldsItem(CustomizedFieldsVO fieldsItem) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        this.fields.add(fieldsItem);
        return this;
    }

    public CustomizedFieldsVOList withFields(Consumer<List<CustomizedFieldsVO>> fieldsSetter) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        fieldsSetter.accept(this.fields);
        return this;
    }

    /**
     * 自定义项列表
     * @return fields
     */
    public List<CustomizedFieldsVO> getFields() {
        return fields;
    }

    public void setFields(List<CustomizedFieldsVO> fields) {
        this.fields = fields;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomizedFieldsVOList customizedFieldsVOList = (CustomizedFieldsVOList) o;
        return Objects.equals(this.type, customizedFieldsVOList.type)
            && Objects.equals(this.fields, customizedFieldsVOList.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, fields);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomizedFieldsVOList {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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
