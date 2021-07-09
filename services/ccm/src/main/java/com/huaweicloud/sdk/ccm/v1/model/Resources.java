package com.huaweicloud.sdk.ccm.v1.model;




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
 * Resources
 */
public class Resources  {

    /**
     * 配额类型。枚举值说明:  - CERTIFICATE_AUTHORITY: 私有证书颁发机构  - CERTIFICATE: 证书
     */
    public static final class TypeEnum {

        
        /**
         * Enum CERTIFICATE_AUTHORITY for value: "CERTIFICATE_AUTHORITY"
         */
        public static final TypeEnum CERTIFICATE_AUTHORITY = new TypeEnum("CERTIFICATE_AUTHORITY");
        
        /**
         * Enum CERTIFICATE for value: "CERTIFICATE"
         */
        public static final TypeEnum CERTIFICATE = new TypeEnum("CERTIFICATE");
        

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("CERTIFICATE_AUTHORITY", CERTIFICATE_AUTHORITY);
            map.put("CERTIFICATE", CERTIFICATE);
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


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="used")
    
    private Integer used;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="quota")
    
    private Integer quota;

    public Resources withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    


    /**
     * 配额类型。枚举值说明:  - CERTIFICATE_AUTHORITY: 私有证书颁发机构  - CERTIFICATE: 证书
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    

    public Resources withUsed(Integer used) {
        this.used = used;
        return this;
    }

    


    /**
     * 已使用配额数
     * minimum: 0
     * maximum: 10000
     * @return used
     */
    public Integer getUsed() {
        return used;
    }

    public void setUsed(Integer used) {
        this.used = used;
    }

    

    public Resources withQuota(Integer quota) {
        this.quota = quota;
        return this;
    }

    


    /**
     * 配额总数
     * minimum: 0
     * maximum: 10000
     * @return quota
     */
    public Integer getQuota() {
        return quota;
    }

    public void setQuota(Integer quota) {
        this.quota = quota;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Resources resources = (Resources) o;
        return Objects.equals(this.type, resources.type) &&
            Objects.equals(this.used, resources.used) &&
            Objects.equals(this.quota, resources.quota);
    }
    @Override
    public int hashCode() {
        return Objects.hash(type, used, quota);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Resources {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    used: ").append(toIndentedString(used)).append("\n");
        sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
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

