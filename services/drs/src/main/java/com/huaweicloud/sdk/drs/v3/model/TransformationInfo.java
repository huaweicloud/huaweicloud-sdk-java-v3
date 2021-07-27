package com.huaweicloud.sdk.drs.v3.model;




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
 * 数据加工信息
 */
public class TransformationInfo  {

    /**
     * - 生成加工规则值为contentConditionalFilter - 生成配置规则值为configConditionalFilter
     */
    public static final class TransformationTypeEnum {

        
        /**
         * Enum CONTENTCONDITIONALFILTER for value: "contentConditionalFilter"
         */
        public static final TransformationTypeEnum CONTENTCONDITIONALFILTER = new TransformationTypeEnum("contentConditionalFilter");
        
        /**
         * Enum CONFIGCONDITIONALFILTER for value: "configConditionalFilter"
         */
        public static final TransformationTypeEnum CONFIGCONDITIONALFILTER = new TransformationTypeEnum("configConditionalFilter");
        

        private static final Map<String, TransformationTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TransformationTypeEnum> createStaticFields() {
            Map<String, TransformationTypeEnum> map = new HashMap<>();
            map.put("contentConditionalFilter", CONTENTCONDITIONALFILTER);
            map.put("configConditionalFilter", CONFIGCONDITIONALFILTER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TransformationTypeEnum(String value) {
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
        public static TransformationTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            TransformationTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TransformationTypeEnum(value);
            }
            return result;
        }

        public static TransformationTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            TransformationTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TransformationTypeEnum) {
                return this.value.equals(((TransformationTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="transformation_type")
    
    private TransformationTypeEnum transformationType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="value")
    
    private String value;

    public TransformationInfo withTransformationType(TransformationTypeEnum transformationType) {
        this.transformationType = transformationType;
        return this;
    }

    


    /**
     * - 生成加工规则值为contentConditionalFilter - 生成配置规则值为configConditionalFilter
     * @return transformationType
     */
    public TransformationTypeEnum getTransformationType() {
        return transformationType;
    }

    public void setTransformationType(TransformationTypeEnum transformationType) {
        this.transformationType = transformationType;
    }

    

    public TransformationInfo withValue(String value) {
        this.value = value;
        return this;
    }

    


    /**
     * 过滤条件，生成加工规则值为sql条件语句，生成配置规则值为config。长度限制256。
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TransformationInfo transformationInfo = (TransformationInfo) o;
        return Objects.equals(this.transformationType, transformationInfo.transformationType) &&
            Objects.equals(this.value, transformationInfo.value);
    }
    @Override
    public int hashCode() {
        return Objects.hash(transformationType, value);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransformationInfo {\n");
        sb.append("    transformationType: ").append(toIndentedString(transformationType)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

