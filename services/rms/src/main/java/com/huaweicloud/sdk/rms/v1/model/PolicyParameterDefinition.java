package com.huaweicloud.sdk.rms.v1.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 策略参数定义
 */
public class PolicyParameterDefinition  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="allowed_values")
    
    private List<Object> allowedValues = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="default_value")
    
    private String defaultValue;
    /**
     * 策略参数类型
     */
    public static final class TypeEnum {

        
        /**
         * Enum ARRAY for value: "Array"
         */
        public static final TypeEnum ARRAY = new TypeEnum("Array");
        
        /**
         * Enum BOOLEAN for value: "Boolean"
         */
        public static final TypeEnum BOOLEAN = new TypeEnum("Boolean");
        
        /**
         * Enum INTEGER for value: "Integer"
         */
        public static final TypeEnum INTEGER = new TypeEnum("Integer");
        
        /**
         * Enum FLOAT for value: "Float"
         */
        public static final TypeEnum FLOAT = new TypeEnum("Float");
        
        /**
         * Enum STRING for value: "String"
         */
        public static final TypeEnum STRING = new TypeEnum("String");
        
        /**
         * Enum DATETIME for value: "DateTime"
         */
        public static final TypeEnum DATETIME = new TypeEnum("DateTime");
        

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("Array", ARRAY);
            map.put("Boolean", BOOLEAN);
            map.put("Integer", INTEGER);
            map.put("Float", FLOAT);
            map.put("String", STRING);
            map.put("DateTime", DATETIME);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
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
            if (obj != null && obj instanceof TypeEnum) {
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

    public PolicyParameterDefinition withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 策略参数名字
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public PolicyParameterDefinition withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 策略参数描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public PolicyParameterDefinition withAllowedValues(List<Object> allowedValues) {
        this.allowedValues = allowedValues;
        return this;
    }

    
    public PolicyParameterDefinition addAllowedValuesItem(Object allowedValuesItem) {
        this.allowedValues.add(allowedValuesItem);
        return this;
    }

    public PolicyParameterDefinition withAllowedValues(Consumer<List<Object>> allowedValuesSetter) {
        if(this.allowedValues == null ){
            this.allowedValues = new ArrayList<>();
        }
        allowedValuesSetter.accept(this.allowedValues);
        return this;
    }

    /**
     * 策略参数允许值列表
     * @return allowedValues
     */
    public List<Object> getAllowedValues() {
        return allowedValues;
    }

    public void setAllowedValues(List<Object> allowedValues) {
        this.allowedValues = allowedValues;
    }

    

    public PolicyParameterDefinition withDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    


    /**
     * 策略参数默认值
     * @return defaultValue
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    

    public PolicyParameterDefinition withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    


    /**
     * 策略参数类型
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PolicyParameterDefinition policyParameterDefinition = (PolicyParameterDefinition) o;
        return Objects.equals(this.name, policyParameterDefinition.name) &&
            Objects.equals(this.description, policyParameterDefinition.description) &&
            Objects.equals(this.allowedValues, policyParameterDefinition.allowedValues) &&
            Objects.equals(this.defaultValue, policyParameterDefinition.defaultValue) &&
            Objects.equals(this.type, policyParameterDefinition.type);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, description, allowedValues, defaultValue, type);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyParameterDefinition {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    allowedValues: ").append(toIndentedString(allowedValues)).append("\n");
        sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

