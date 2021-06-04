package com.huaweicloud.sdk.cdn.v1.model;




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
 * OriginHostBody
 */
public class OriginHostBody  {

    /**
     * accelerate：选择加速域名作为回源地址；  customize：使用自动定义的域名作为回源地址；
     */
    public static final class OriginHostTypeEnum {

        
        /**
         * Enum ACCELERATE for value: "accelerate"
         */
        public static final OriginHostTypeEnum ACCELERATE = new OriginHostTypeEnum("accelerate");
        
        /**
         * Enum CUSTOMIZE for value: "customize"
         */
        public static final OriginHostTypeEnum CUSTOMIZE = new OriginHostTypeEnum("customize");
        

        private static final Map<String, OriginHostTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OriginHostTypeEnum> createStaticFields() {
            Map<String, OriginHostTypeEnum> map = new HashMap<>();
            map.put("accelerate", ACCELERATE);
            map.put("customize", CUSTOMIZE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OriginHostTypeEnum(String value) {
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
        public static OriginHostTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            OriginHostTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OriginHostTypeEnum(value);
            }
            return result;
        }

        public static OriginHostTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            OriginHostTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof OriginHostTypeEnum) {
                return this.value.equals(((OriginHostTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="origin_host_type")
    
    private OriginHostTypeEnum originHostType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="customize_domain")
    
    private String customizeDomain;

    public OriginHostBody withOriginHostType(OriginHostTypeEnum originHostType) {
        this.originHostType = originHostType;
        return this;
    }

    


    /**
     * accelerate：选择加速域名作为回源地址；  customize：使用自动定义的域名作为回源地址；
     * @return originHostType
     */
    public OriginHostTypeEnum getOriginHostType() {
        return originHostType;
    }

    public void setOriginHostType(OriginHostTypeEnum originHostType) {
        this.originHostType = originHostType;
    }

    

    public OriginHostBody withCustomizeDomain(String customizeDomain) {
        this.customizeDomain = customizeDomain;
        return this;
    }

    


    /**
     * 自定义回源域名，origin_host_type为 customize时传入该参数。
     * @return customizeDomain
     */
    public String getCustomizeDomain() {
        return customizeDomain;
    }

    public void setCustomizeDomain(String customizeDomain) {
        this.customizeDomain = customizeDomain;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OriginHostBody originHostBody = (OriginHostBody) o;
        return Objects.equals(this.originHostType, originHostBody.originHostType) &&
            Objects.equals(this.customizeDomain, originHostBody.customizeDomain);
    }
    @Override
    public int hashCode() {
        return Objects.hash(originHostType, customizeDomain);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OriginHostBody {\n");
        sb.append("    originHostType: ").append(toIndentedString(originHostType)).append("\n");
        sb.append("    customizeDomain: ").append(toIndentedString(customizeDomain)).append("\n");
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

