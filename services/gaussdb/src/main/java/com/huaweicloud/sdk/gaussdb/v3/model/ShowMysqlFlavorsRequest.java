package com.huaweicloud.sdk.gaussdb.v3.model;




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
public class ShowMysqlFlavorsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Language")
    
    
    private String xLanguage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="database_name")
    
    
    private String databaseName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version_name")
    
    
    private String versionName;
    /**
     * 规格的可用区模式，现在仅支持\"single\"、\"multi\"，不区分大小写。
     */
    public static final class AvailabilityZoneModeEnum {

        
        /**
         * Enum SINGLE for value: "single"
         */
        public static final AvailabilityZoneModeEnum SINGLE = new AvailabilityZoneModeEnum("single");
        
        /**
         * Enum MULTI for value: "multi"
         */
        public static final AvailabilityZoneModeEnum MULTI = new AvailabilityZoneModeEnum("multi");
        

        private static final Map<String, AvailabilityZoneModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AvailabilityZoneModeEnum> createStaticFields() {
            Map<String, AvailabilityZoneModeEnum> map = new HashMap<>();
            map.put("single", SINGLE);
            map.put("multi", MULTI);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AvailabilityZoneModeEnum(String value) {
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
        public static AvailabilityZoneModeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            AvailabilityZoneModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new AvailabilityZoneModeEnum(value);
            }
            return result;
        }

        public static AvailabilityZoneModeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            AvailabilityZoneModeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AvailabilityZoneModeEnum) {
                return this.value.equals(((AvailabilityZoneModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="availability_zone_mode")
    
    
    private AvailabilityZoneModeEnum availabilityZoneMode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="spec_code")
    
    
    private String specCode;

    public ShowMysqlFlavorsRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    


    /**
     * 语言。
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

    

    public ShowMysqlFlavorsRequest withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    


    /**
     * 数据库引擎名称。
     * @return databaseName
     */
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    

    public ShowMysqlFlavorsRequest withVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }

    


    /**
     * 数据库版本号，目前仅支持兼容MySQL 8.0。
     * @return versionName
     */
    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    

    public ShowMysqlFlavorsRequest withAvailabilityZoneMode(AvailabilityZoneModeEnum availabilityZoneMode) {
        this.availabilityZoneMode = availabilityZoneMode;
        return this;
    }

    


    /**
     * 规格的可用区模式，现在仅支持\"single\"、\"multi\"，不区分大小写。
     * @return availabilityZoneMode
     */
    public AvailabilityZoneModeEnum getAvailabilityZoneMode() {
        return availabilityZoneMode;
    }

    public void setAvailabilityZoneMode(AvailabilityZoneModeEnum availabilityZoneMode) {
        this.availabilityZoneMode = availabilityZoneMode;
    }

    

    public ShowMysqlFlavorsRequest withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    


    /**
     * 规格编码。
     * @return specCode
     */
    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowMysqlFlavorsRequest showMysqlFlavorsRequest = (ShowMysqlFlavorsRequest) o;
        return Objects.equals(this.xLanguage, showMysqlFlavorsRequest.xLanguage) &&
            Objects.equals(this.databaseName, showMysqlFlavorsRequest.databaseName) &&
            Objects.equals(this.versionName, showMysqlFlavorsRequest.versionName) &&
            Objects.equals(this.availabilityZoneMode, showMysqlFlavorsRequest.availabilityZoneMode) &&
            Objects.equals(this.specCode, showMysqlFlavorsRequest.specCode);
    }
    @Override
    public int hashCode() {
        return Objects.hash(xLanguage, databaseName, versionName, availabilityZoneMode, specCode);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMysqlFlavorsRequest {\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    versionName: ").append(toIndentedString(versionName)).append("\n");
        sb.append("    availabilityZoneMode: ").append(toIndentedString(availabilityZoneMode)).append("\n");
        sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
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

