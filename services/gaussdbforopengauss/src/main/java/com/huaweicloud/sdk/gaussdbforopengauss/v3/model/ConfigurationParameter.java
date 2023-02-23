package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ConfigurationParameter
 */
public class ConfigurationParameter  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="value")
    

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="restart_required")
    

    private Boolean restartRequired;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="value_range")
    

    private String valueRange;
    /**
     * 参数类型，取值为“string”、“integer”、“boolean”、“list”或“float”之一。
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
         * Enum BOOLEAN for value: "boolean"
         */
        public static final TypeEnum BOOLEAN = new TypeEnum("boolean");
        
        /**
         * Enum LIST for value: "list"
         */
        public static final TypeEnum LIST = new TypeEnum("list");
        
        /**
         * Enum FLOAT for value: "float"
         */
        public static final TypeEnum FLOAT = new TypeEnum("float");
        

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("string", STRING);
            map.put("integer", INTEGER);
            map.put("boolean", BOOLEAN);
            map.put("list", LIST);
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
            if( value == null ){
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if( value == null ){
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
    @JsonProperty(value="type")
    

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    

    private String description;

    public ConfigurationParameter withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 参数名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public ConfigurationParameter withValue(String value) {
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

    

    public ConfigurationParameter withRestartRequired(Boolean restartRequired) {
        this.restartRequired = restartRequired;
        return this;
    }

    


    /**
     * 修改该参数是否需要重启实例。
     * @return restartRequired
     */
    public Boolean getRestartRequired() {
        return restartRequired;
    }

    public void setRestartRequired(Boolean restartRequired) {
        this.restartRequired = restartRequired;
    }

    

    public ConfigurationParameter withValueRange(String valueRange) {
        this.valueRange = valueRange;
        return this;
    }

    


    /**
     * 参数取值范围。
     * @return valueRange
     */
    public String getValueRange() {
        return valueRange;
    }

    public void setValueRange(String valueRange) {
        this.valueRange = valueRange;
    }

    

    public ConfigurationParameter withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    


    /**
     * 参数类型，取值为“string”、“integer”、“boolean”、“list”或“float”之一。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    

    public ConfigurationParameter withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 参数描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConfigurationParameter configurationParameter = (ConfigurationParameter) o;
        return Objects.equals(this.name, configurationParameter.name) &&
            Objects.equals(this.value, configurationParameter.value) &&
            Objects.equals(this.restartRequired, configurationParameter.restartRequired) &&
            Objects.equals(this.valueRange, configurationParameter.valueRange) &&
            Objects.equals(this.type, configurationParameter.type) &&
            Objects.equals(this.description, configurationParameter.description);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, value, restartRequired, valueRange, type, description);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigurationParameter {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    restartRequired: ").append(toIndentedString(restartRequired)).append("\n");
        sb.append("    valueRange: ").append(toIndentedString(valueRange)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

