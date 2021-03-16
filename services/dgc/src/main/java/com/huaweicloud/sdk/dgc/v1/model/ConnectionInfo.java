package com.huaweicloud.sdk.dgc.v1.model;




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
 * ConnectionInfo
 */
public class ConnectionInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;
    /**
     * Gets or Sets connectionType
     */
    public static final class ConnectionTypeEnum {

        
        /**
         * Enum DWS for value: "DWS"
         */
        public static final ConnectionTypeEnum DWS = new ConnectionTypeEnum("DWS");
        
        /**
         * Enum DLI for value: "DLI"
         */
        public static final ConnectionTypeEnum DLI = new ConnectionTypeEnum("DLI");
        
        /**
         * Enum SPARKSQL for value: "SparkSQL"
         */
        public static final ConnectionTypeEnum SPARKSQL = new ConnectionTypeEnum("SparkSQL");
        
        /**
         * Enum HIVE for value: "Hive"
         */
        public static final ConnectionTypeEnum HIVE = new ConnectionTypeEnum("Hive");
        
        /**
         * Enum RDS for value: "RDS"
         */
        public static final ConnectionTypeEnum RDS = new ConnectionTypeEnum("RDS");
        
        /**
         * Enum CLOUDTABLE for value: "CloudTable"
         */
        public static final ConnectionTypeEnum CLOUDTABLE = new ConnectionTypeEnum("CloudTable");
        

        private static final Map<String, ConnectionTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ConnectionTypeEnum> createStaticFields() {
            Map<String, ConnectionTypeEnum> map = new HashMap<>();
            map.put("DWS", DWS);
            map.put("DLI", DLI);
            map.put("SparkSQL", SPARKSQL);
            map.put("Hive", HIVE);
            map.put("RDS", RDS);
            map.put("CloudTable", CLOUDTABLE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ConnectionTypeEnum(String value) {
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
        public static ConnectionTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ConnectionTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ConnectionTypeEnum(value);
            }
            return result;
        }

        public static ConnectionTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ConnectionTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ConnectionTypeEnum) {
                return this.value.equals(((ConnectionTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="connectionType")
    
    private ConnectionTypeEnum connectionType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="config")
    
    private Object config;

    public ConnectionInfo withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * Get name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public ConnectionInfo withConnectionType(ConnectionTypeEnum connectionType) {
        this.connectionType = connectionType;
        return this;
    }

    


    /**
     * Get connectionType
     * @return connectionType
     */
    public ConnectionTypeEnum getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(ConnectionTypeEnum connectionType) {
        this.connectionType = connectionType;
    }

    

    public ConnectionInfo withConfig(Object config) {
        this.config = config;
        return this;
    }

    


    /**
     * Get config
     * @return config
     */
    public Object getConfig() {
        return config;
    }

    public void setConfig(Object config) {
        this.config = config;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConnectionInfo connectionInfo = (ConnectionInfo) o;
        return Objects.equals(this.name, connectionInfo.name) &&
            Objects.equals(this.connectionType, connectionInfo.connectionType) &&
            Objects.equals(this.config, connectionInfo.config);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, connectionType, config);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConnectionInfo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    connectionType: ").append(toIndentedString(connectionType)).append("\n");
        sb.append("    config: ").append(toIndentedString(config)).append("\n");
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

