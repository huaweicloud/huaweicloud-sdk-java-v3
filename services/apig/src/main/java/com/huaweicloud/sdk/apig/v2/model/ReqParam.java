package com.huaweicloud.sdk.apig.v2.model;




import java.util.Collections;

import java.util.Collections;

import java.util.Collections;

import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.apig.v2.model.ReqParamBase;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ReqParam
 */
public class ReqParam  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;
    /**
     * 参数类型
     */
    public static final class TypeEnum {

        
        /**
         * Enum STRING for value: "STRING"
         */
        public static final TypeEnum STRING = new TypeEnum("STRING");
        
        /**
         * Enum NUMBER for value: "NUMBER"
         */
        public static final TypeEnum NUMBER = new TypeEnum("NUMBER");
        

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("STRING", STRING);
            map.put("NUMBER", NUMBER);
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
    /**
     * 参数位置
     */
    public static final class LocationEnum {

        
        /**
         * Enum PATH for value: "PATH"
         */
        public static final LocationEnum PATH = new LocationEnum("PATH");
        
        /**
         * Enum QUERY for value: "QUERY"
         */
        public static final LocationEnum QUERY = new LocationEnum("QUERY");
        
        /**
         * Enum HEADER for value: "HEADER"
         */
        public static final LocationEnum HEADER = new LocationEnum("HEADER");
        

        private static final Map<String, LocationEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LocationEnum> createStaticFields() {
            Map<String, LocationEnum> map = new HashMap<>();
            map.put("PATH", PATH);
            map.put("QUERY", QUERY);
            map.put("HEADER", HEADER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LocationEnum(String value) {
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
        public static LocationEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            LocationEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new LocationEnum(value);
            }
            return result;
        }

        public static LocationEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            LocationEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof LocationEnum) {
                return this.value.equals(((LocationEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="location")
    
    private LocationEnum location;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="default_value")
    
    private String defaultValue;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sample_value")
    
    private String sampleValue;
    /**
     * 是否必须 - 1：是 - 2：否  location为PATH时，required默认为1，其他场景required默认为2
     */
    public static final class RequiredEnum {

        
        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final RequiredEnum NUMBER_1 = new RequiredEnum(1);
        
        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final RequiredEnum NUMBER_2 = new RequiredEnum(2);
        

        private static final Map<Integer, RequiredEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, RequiredEnum> createStaticFields() {
            Map<Integer, RequiredEnum> map = new HashMap<>();
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        RequiredEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return Integer.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static RequiredEnum fromValue(Integer value) {
            if( value == null ){
                return null;
            }
            RequiredEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new RequiredEnum(value);
            }
            return result;
        }

        public static RequiredEnum valueOf(Integer value) {
            if( value == null ){
                return null;
            }
            RequiredEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof RequiredEnum) {
                return this.value.equals(((RequiredEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="required")
    
    private RequiredEnum required;
    /**
     * 是否开启校验 - 1：开启校验 - 2：不开启校验
     */
    public static final class ValidEnableEnum {

        
        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final ValidEnableEnum NUMBER_1 = new ValidEnableEnum(1);
        
        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final ValidEnableEnum NUMBER_2 = new ValidEnableEnum(2);
        

        private static final Map<Integer, ValidEnableEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, ValidEnableEnum> createStaticFields() {
            Map<Integer, ValidEnableEnum> map = new HashMap<>();
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        ValidEnableEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return Integer.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ValidEnableEnum fromValue(Integer value) {
            if( value == null ){
                return null;
            }
            ValidEnableEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ValidEnableEnum(value);
            }
            return result;
        }

        public static ValidEnableEnum valueOf(Integer value) {
            if( value == null ){
                return null;
            }
            ValidEnableEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ValidEnableEnum) {
                return this.value.equals(((ValidEnableEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="valid_enable")
    
    private ValidEnableEnum validEnable;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="remark")
    
    private String remark;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enumerations")
    
    private String enumerations;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="min_num")
    
    private Integer minNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="max_num")
    
    private Integer maxNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="min_size")
    
    private Integer minSize;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="max_size")
    
    private Integer maxSize;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="regular")
    
    private String regular;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="json_schema")
    
    private String jsonSchema;
    /**
     * 是否透传 - 1：是 - 2：否
     */
    public static final class PassThroughEnum {

        
        /**
         * Enum _1 for value: "1"
         */
        public static final PassThroughEnum _1 = new PassThroughEnum("1");
        
        /**
         * Enum _2 for value: "2"
         */
        public static final PassThroughEnum _2 = new PassThroughEnum("2");
        

        private static final Map<String, PassThroughEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PassThroughEnum> createStaticFields() {
            Map<String, PassThroughEnum> map = new HashMap<>();
            map.put("1", _1);
            map.put("2", _2);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PassThroughEnum(String value) {
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
        public static PassThroughEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            PassThroughEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new PassThroughEnum(value);
            }
            return result;
        }

        public static PassThroughEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            PassThroughEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof PassThroughEnum) {
                return this.value.equals(((PassThroughEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="pass_through")
    
    private PassThroughEnum passThrough;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;

    public ReqParam withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 参数名称。 长度为1 ~ 32位的字符串，字符串由英文字母、数字、中划线、下划线、英文句号组成，且只能以英文开头。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public ReqParam withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    


    /**
     * 参数类型
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    

    public ReqParam withLocation(LocationEnum location) {
        this.location = location;
        return this;
    }

    


    /**
     * 参数位置
     * @return location
     */
    public LocationEnum getLocation() {
        return location;
    }

    public void setLocation(LocationEnum location) {
        this.location = location;
    }

    

    public ReqParam withDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    


    /**
     * 参数默认值
     * @return defaultValue
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    

    public ReqParam withSampleValue(String sampleValue) {
        this.sampleValue = sampleValue;
        return this;
    }

    


    /**
     * 参数示例值
     * @return sampleValue
     */
    public String getSampleValue() {
        return sampleValue;
    }

    public void setSampleValue(String sampleValue) {
        this.sampleValue = sampleValue;
    }

    

    public ReqParam withRequired(RequiredEnum required) {
        this.required = required;
        return this;
    }

    


    /**
     * 是否必须 - 1：是 - 2：否  location为PATH时，required默认为1，其他场景required默认为2
     * @return required
     */
    public RequiredEnum getRequired() {
        return required;
    }

    public void setRequired(RequiredEnum required) {
        this.required = required;
    }

    

    public ReqParam withValidEnable(ValidEnableEnum validEnable) {
        this.validEnable = validEnable;
        return this;
    }

    


    /**
     * 是否开启校验 - 1：开启校验 - 2：不开启校验
     * @return validEnable
     */
    public ValidEnableEnum getValidEnable() {
        return validEnable;
    }

    public void setValidEnable(ValidEnableEnum validEnable) {
        this.validEnable = validEnable;
    }

    

    public ReqParam withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    


    /**
     * 描述信息。长度不超过255个字符 > 中文字符必须为UTF-8或者unicode编码。
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    

    public ReqParam withEnumerations(String enumerations) {
        this.enumerations = enumerations;
        return this;
    }

    


    /**
     * 参数枚举值
     * @return enumerations
     */
    public String getEnumerations() {
        return enumerations;
    }

    public void setEnumerations(String enumerations) {
        this.enumerations = enumerations;
    }

    

    public ReqParam withMinNum(Integer minNum) {
        this.minNum = minNum;
        return this;
    }

    


    /**
     * 参数最小值  参数类型为NUMBER时有效
     * @return minNum
     */
    public Integer getMinNum() {
        return minNum;
    }

    public void setMinNum(Integer minNum) {
        this.minNum = minNum;
    }

    

    public ReqParam withMaxNum(Integer maxNum) {
        this.maxNum = maxNum;
        return this;
    }

    


    /**
     * 参数最大值  参数类型为NUMBER时有效
     * @return maxNum
     */
    public Integer getMaxNum() {
        return maxNum;
    }

    public void setMaxNum(Integer maxNum) {
        this.maxNum = maxNum;
    }

    

    public ReqParam withMinSize(Integer minSize) {
        this.minSize = minSize;
        return this;
    }

    


    /**
     * 参数最小长度  参数类型为STRING时有效
     * @return minSize
     */
    public Integer getMinSize() {
        return minSize;
    }

    public void setMinSize(Integer minSize) {
        this.minSize = minSize;
    }

    

    public ReqParam withMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
        return this;
    }

    


    /**
     * 参数最大长度  参数类型为STRING时有效
     * @return maxSize
     */
    public Integer getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
    }

    

    public ReqParam withRegular(String regular) {
        this.regular = regular;
        return this;
    }

    


    /**
     * 正则校验规则  暂不支持
     * @return regular
     */
    public String getRegular() {
        return regular;
    }

    public void setRegular(String regular) {
        this.regular = regular;
    }

    

    public ReqParam withJsonSchema(String jsonSchema) {
        this.jsonSchema = jsonSchema;
        return this;
    }

    


    /**
     * JSON校验规则  暂不支持
     * @return jsonSchema
     */
    public String getJsonSchema() {
        return jsonSchema;
    }

    public void setJsonSchema(String jsonSchema) {
        this.jsonSchema = jsonSchema;
    }

    

    public ReqParam withPassThrough(PassThroughEnum passThrough) {
        this.passThrough = passThrough;
        return this;
    }

    


    /**
     * 是否透传 - 1：是 - 2：否
     * @return passThrough
     */
    public PassThroughEnum getPassThrough() {
        return passThrough;
    }

    public void setPassThrough(PassThroughEnum passThrough) {
        this.passThrough = passThrough;
    }

    

    public ReqParam withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 参数编号
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReqParam reqParam = (ReqParam) o;
        return Objects.equals(this.name, reqParam.name) &&
            Objects.equals(this.type, reqParam.type) &&
            Objects.equals(this.location, reqParam.location) &&
            Objects.equals(this.defaultValue, reqParam.defaultValue) &&
            Objects.equals(this.sampleValue, reqParam.sampleValue) &&
            Objects.equals(this.required, reqParam.required) &&
            Objects.equals(this.validEnable, reqParam.validEnable) &&
            Objects.equals(this.remark, reqParam.remark) &&
            Objects.equals(this.enumerations, reqParam.enumerations) &&
            Objects.equals(this.minNum, reqParam.minNum) &&
            Objects.equals(this.maxNum, reqParam.maxNum) &&
            Objects.equals(this.minSize, reqParam.minSize) &&
            Objects.equals(this.maxSize, reqParam.maxSize) &&
            Objects.equals(this.regular, reqParam.regular) &&
            Objects.equals(this.jsonSchema, reqParam.jsonSchema) &&
            Objects.equals(this.passThrough, reqParam.passThrough) &&
            Objects.equals(this.id, reqParam.id);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, type, location, defaultValue, sampleValue, required, validEnable, remark, enumerations, minNum, maxNum, minSize, maxSize, regular, jsonSchema, passThrough, id);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReqParam {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
        sb.append("    sampleValue: ").append(toIndentedString(sampleValue)).append("\n");
        sb.append("    required: ").append(toIndentedString(required)).append("\n");
        sb.append("    validEnable: ").append(toIndentedString(validEnable)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
        sb.append("    enumerations: ").append(toIndentedString(enumerations)).append("\n");
        sb.append("    minNum: ").append(toIndentedString(minNum)).append("\n");
        sb.append("    maxNum: ").append(toIndentedString(maxNum)).append("\n");
        sb.append("    minSize: ").append(toIndentedString(minSize)).append("\n");
        sb.append("    maxSize: ").append(toIndentedString(maxSize)).append("\n");
        sb.append("    regular: ").append(toIndentedString(regular)).append("\n");
        sb.append("    jsonSchema: ").append(toIndentedString(jsonSchema)).append("\n");
        sb.append("    passThrough: ").append(toIndentedString(passThrough)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

