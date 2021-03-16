package com.huaweicloud.sdk.apig.v2.model;




import java.util.Collections;

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
 * ApiConditionBase
 */
public class ApiConditionBase  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="req_param_name")
    
    private String reqParamName;
    /**
     * 策略条件 - exact：绝对匹配 - enum：枚举 - pattern：正则  策略类型为param时必选 
     */
    public static final class ConditionTypeEnum {

        
        /**
         * Enum EXACT for value: "exact"
         */
        public static final ConditionTypeEnum EXACT = new ConditionTypeEnum("exact");
        
        /**
         * Enum ENUM for value: "enum"
         */
        public static final ConditionTypeEnum ENUM = new ConditionTypeEnum("enum");
        
        /**
         * Enum PATTERN for value: "pattern"
         */
        public static final ConditionTypeEnum PATTERN = new ConditionTypeEnum("pattern");
        

        private static final Map<String, ConditionTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ConditionTypeEnum> createStaticFields() {
            Map<String, ConditionTypeEnum> map = new HashMap<>();
            map.put("exact", EXACT);
            map.put("enum", ENUM);
            map.put("pattern", PATTERN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ConditionTypeEnum(String value) {
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
        public static ConditionTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ConditionTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ConditionTypeEnum(value);
            }
            return result;
        }

        public static ConditionTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ConditionTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ConditionTypeEnum) {
                return this.value.equals(((ConditionTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="condition_type")
    
    private ConditionTypeEnum conditionType;
    /**
     * 策略类型 - param：参数 - source：源IP
     */
    public static final class ConditionOriginEnum {

        
        /**
         * Enum PARAM for value: "param"
         */
        public static final ConditionOriginEnum PARAM = new ConditionOriginEnum("param");
        
        /**
         * Enum SOURCE for value: "source"
         */
        public static final ConditionOriginEnum SOURCE = new ConditionOriginEnum("source");
        

        private static final Map<String, ConditionOriginEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ConditionOriginEnum> createStaticFields() {
            Map<String, ConditionOriginEnum> map = new HashMap<>();
            map.put("param", PARAM);
            map.put("source", SOURCE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ConditionOriginEnum(String value) {
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
        public static ConditionOriginEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ConditionOriginEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ConditionOriginEnum(value);
            }
            return result;
        }

        public static ConditionOriginEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ConditionOriginEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ConditionOriginEnum) {
                return this.value.equals(((ConditionOriginEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="condition_origin")
    
    private ConditionOriginEnum conditionOrigin;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="condition_value")
    
    private String conditionValue;

    public ApiConditionBase withReqParamName(String reqParamName) {
        this.reqParamName = reqParamName;
        return this;
    }

    


    /**
     * 关联的请求参数对象名称。策略类型为param时必选
     * @return reqParamName
     */
    public String getReqParamName() {
        return reqParamName;
    }

    public void setReqParamName(String reqParamName) {
        this.reqParamName = reqParamName;
    }

    

    public ApiConditionBase withConditionType(ConditionTypeEnum conditionType) {
        this.conditionType = conditionType;
        return this;
    }

    


    /**
     * 策略条件 - exact：绝对匹配 - enum：枚举 - pattern：正则  策略类型为param时必选 
     * @return conditionType
     */
    public ConditionTypeEnum getConditionType() {
        return conditionType;
    }

    public void setConditionType(ConditionTypeEnum conditionType) {
        this.conditionType = conditionType;
    }

    

    public ApiConditionBase withConditionOrigin(ConditionOriginEnum conditionOrigin) {
        this.conditionOrigin = conditionOrigin;
        return this;
    }

    


    /**
     * 策略类型 - param：参数 - source：源IP
     * @return conditionOrigin
     */
    public ConditionOriginEnum getConditionOrigin() {
        return conditionOrigin;
    }

    public void setConditionOrigin(ConditionOriginEnum conditionOrigin) {
        this.conditionOrigin = conditionOrigin;
    }

    

    public ApiConditionBase withConditionValue(String conditionValue) {
        this.conditionValue = conditionValue;
        return this;
    }

    


    /**
     * 策略值
     * @return conditionValue
     */
    public String getConditionValue() {
        return conditionValue;
    }

    public void setConditionValue(String conditionValue) {
        this.conditionValue = conditionValue;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiConditionBase apiConditionBase = (ApiConditionBase) o;
        return Objects.equals(this.reqParamName, apiConditionBase.reqParamName) &&
            Objects.equals(this.conditionType, apiConditionBase.conditionType) &&
            Objects.equals(this.conditionOrigin, apiConditionBase.conditionOrigin) &&
            Objects.equals(this.conditionValue, apiConditionBase.conditionValue);
    }
    @Override
    public int hashCode() {
        return Objects.hash(reqParamName, conditionType, conditionOrigin, conditionValue);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiConditionBase {\n");
        sb.append("    reqParamName: ").append(toIndentedString(reqParamName)).append("\n");
        sb.append("    conditionType: ").append(toIndentedString(conditionType)).append("\n");
        sb.append("    conditionOrigin: ").append(toIndentedString(conditionOrigin)).append("\n");
        sb.append("    conditionValue: ").append(toIndentedString(conditionValue)).append("\n");
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

