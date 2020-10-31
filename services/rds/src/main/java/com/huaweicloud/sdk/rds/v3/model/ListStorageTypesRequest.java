package com.huaweicloud.sdk.rds.v3.model;




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
    /**
     * Gets or Sets databaseName
     */
    public static final class DatabaseNameEnum {

        
        /**
         * Enum MYSQL for value: "MySQL"
         */
        public static final DatabaseNameEnum MYSQL = new DatabaseNameEnum("MySQL");
        
        /**
         * Enum POSTGRESQL for value: "PostgreSQL"
         */
        public static final DatabaseNameEnum POSTGRESQL = new DatabaseNameEnum("PostgreSQL");
        
        /**
         * Enum SQLSERVER for value: "SQLServer"
         */
        public static final DatabaseNameEnum SQLSERVER = new DatabaseNameEnum("SQLServer");
        

        private static final Map<String, DatabaseNameEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DatabaseNameEnum> createStaticFields() {
            Map<String, DatabaseNameEnum> map = new HashMap<>();
            map.put("MySQL", MYSQL);
            map.put("PostgreSQL", POSTGRESQL);
            map.put("SQLServer", SQLSERVER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DatabaseNameEnum(String value) {
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
        public static DatabaseNameEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            DatabaseNameEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DatabaseNameEnum(value);
            }
            return result;
        }

        public static DatabaseNameEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            DatabaseNameEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof DatabaseNameEnum) {
                return this.value.equals(((DatabaseNameEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="database_name")
    
    private DatabaseNameEnum databaseName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version_name")
    
    private String versionName;

    public ListStorageTypesRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    


    /**
     * Get xLanguage
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

    public ListStorageTypesRequest withDatabaseName(DatabaseNameEnum databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    


    /**
     * Get databaseName
     * @return databaseName
     */
    public DatabaseNameEnum getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(DatabaseNameEnum databaseName) {
        this.databaseName = databaseName;
    }

    public ListStorageTypesRequest withVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }

    


    /**
     * Get versionName
     * @return versionName
     */
    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
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
            Objects.equals(this.databaseName, listStorageTypesRequest.databaseName) &&
            Objects.equals(this.versionName, listStorageTypesRequest.versionName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(xLanguage, databaseName, versionName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListStorageTypesRequest {\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    versionName: ").append(toIndentedString(versionName)).append("\n");
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

