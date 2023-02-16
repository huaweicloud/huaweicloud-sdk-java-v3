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
 * Request Object
 */
public class ListStorageTypesRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Language")
    
    
    private String xLanguage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version")
    
    
    private String version;
    /**
     * 实例类型： enterprise(企业版)， centralization_standard(主备版)，不区分大小写。
     */
    public static final class HaModeEnum {

        
        /**
         * Enum ENTERPRISE for value: "enterprise"
         */
        public static final HaModeEnum ENTERPRISE = new HaModeEnum("enterprise");
        
        /**
         * Enum CENTRALIZATION_STANDARD for value: "centralization_standard"
         */
        public static final HaModeEnum CENTRALIZATION_STANDARD = new HaModeEnum("centralization_standard");
        

        private static final Map<String, HaModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, HaModeEnum> createStaticFields() {
            Map<String, HaModeEnum> map = new HashMap<>();
            map.put("enterprise", ENTERPRISE);
            map.put("centralization_standard", CENTRALIZATION_STANDARD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        HaModeEnum(String value) {
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
        public static HaModeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            HaModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new HaModeEnum(value);
            }
            return result;
        }

        public static HaModeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            HaModeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof HaModeEnum) {
                return this.value.equals(((HaModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ha_mode")
    
    
    private HaModeEnum haMode;

    public ListStorageTypesRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    


    /**
     * 语言
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Language")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    

    public ListStorageTypesRequest withVersion(String version) {
        this.version = version;
        return this;
    }

    


    /**
     * 数据库版本号。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    

    public ListStorageTypesRequest withHaMode(HaModeEnum haMode) {
        this.haMode = haMode;
        return this;
    }

    


    /**
     * 实例类型： enterprise(企业版)， centralization_standard(主备版)，不区分大小写。
     * @return haMode
     */
    public HaModeEnum getHaMode() {
        return haMode;
    }

    public void setHaMode(HaModeEnum haMode) {
        this.haMode = haMode;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListStorageTypesRequest listStorageTypesRequest = (ListStorageTypesRequest) o;
        return Objects.equals(this.xLanguage, listStorageTypesRequest.xLanguage) &&
            Objects.equals(this.version, listStorageTypesRequest.version) &&
            Objects.equals(this.haMode, listStorageTypesRequest.haMode);
    }
    @Override
    public int hashCode() {
        return Objects.hash(xLanguage, version, haMode);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListStorageTypesRequest {\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    haMode: ").append(toIndentedString(haMode)).append("\n");
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

