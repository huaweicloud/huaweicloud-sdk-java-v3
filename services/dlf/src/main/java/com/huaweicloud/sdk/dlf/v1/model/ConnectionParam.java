package com.huaweicloud.sdk.dlf.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ConnectionParam
 */
public class ConnectionParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

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
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ConnectionTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ConnectionTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ConnectionTypeEnum(value);
            }
            return result;
        }

        public static ConnectionTypeEnum valueOf(String value) {
            if (value == null) {
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
            if (obj instanceof ConnectionTypeEnum) {
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
    @JsonProperty(value = "connectionType")

    private ConnectionTypeEnum connectionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "params")

    private Object params;

    public ConnectionParam withName(String name) {
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

    public ConnectionParam withConnectionType(ConnectionTypeEnum connectionType) {
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

    public ConnectionParam withParams(Object params) {
        this.params = params;
        return this;
    }

    /**
     * Get params
     * @return params
     */
    public Object getParams() {
        return params;
    }

    public void setParams(Object params) {
        this.params = params;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConnectionParam connectionParam = (ConnectionParam) o;
        return Objects.equals(this.name, connectionParam.name)
            && Objects.equals(this.connectionType, connectionParam.connectionType)
            && Objects.equals(this.params, connectionParam.params);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, connectionType, params);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConnectionParam {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    connectionType: ").append(toIndentedString(connectionType)).append("\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
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
