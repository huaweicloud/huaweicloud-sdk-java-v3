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
 * 数据库信息。
 */
public class OpenGaussDatastore  {

    /**
     * 数据库引擎，不区分大小写，取值如下：  GaussDB(for openGauss)。
     */
    public static final class TypeEnum {

        
        /**
         * Enum GAUSSDB_FOR_OPENGAUSS_ for value: "GaussDB(for openGauss)"
         */
        public static final TypeEnum GAUSSDB_FOR_OPENGAUSS_ = new TypeEnum("GaussDB(for openGauss)");
        
        /**
         * Enum GAUSSDB for value: "GaussDB"
         */
        public static final TypeEnum GAUSSDB = new TypeEnum("GaussDB");
        

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("GaussDB(for openGauss)", GAUSSDB_FOR_OPENGAUSS_);
            map.put("GaussDB", GAUSSDB);
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
    @JsonProperty(value="version")
    

    private String version;

    public OpenGaussDatastore withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    


    /**
     * 数据库引擎，不区分大小写，取值如下：  GaussDB(for openGauss)。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    

    public OpenGaussDatastore withVersion(String version) {
        this.version = version;
        return this;
    }

    


    /**
     * 数据库版本。不填时，默认为当前最新版本。  GaussDB支持的版本参考[查询数据库引擎的版本](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product=GaussDBforopenGauss&api=ListDatastores)。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OpenGaussDatastore openGaussDatastore = (OpenGaussDatastore) o;
        return Objects.equals(this.type, openGaussDatastore.type) &&
            Objects.equals(this.version, openGaussDatastore.version);
    }
    @Override
    public int hashCode() {
        return Objects.hash(type, version);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpenGaussDatastore {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

