package com.huaweicloud.sdk.dgc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowScriptResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 脚本类型
     */
    public static final class TypeEnum {

        /**
         * Enum FLINKSQL for value: "FlinkSQL"
         */
        public static final TypeEnum FLINKSQL = new TypeEnum("FlinkSQL");

        /**
         * Enum DLISQL for value: "DLISQL"
         */
        public static final TypeEnum DLISQL = new TypeEnum("DLISQL");

        /**
         * Enum SPARKSQL for value: "SparkSQL"
         */
        public static final TypeEnum SPARKSQL = new TypeEnum("SparkSQL");

        /**
         * Enum HIVESQL for value: "HiveSQL"
         */
        public static final TypeEnum HIVESQL = new TypeEnum("HiveSQL");

        /**
         * Enum DWSSQL for value: "DWSSQL"
         */
        public static final TypeEnum DWSSQL = new TypeEnum("DWSSQL");

        /**
         * Enum SHELL for value: "Shell"
         */
        public static final TypeEnum SHELL = new TypeEnum("Shell");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("FlinkSQL", FLINKSQL);
            map.put("DLISQL", DLISQL);
            map.put("SparkSQL", SPARKSQL);
            map.put("HiveSQL", HIVESQL);
            map.put("DWSSQL", DWSSQL);
            map.put("Shell", SHELL);
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
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
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
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "directory")

    private String directory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connectionName")

    private String connectionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database")

    private String database;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queueName")

    private String queueName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configuration")

    private String _configuration;

    public ShowScriptResponse withName(String name) {
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

    public ShowScriptResponse withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 脚本类型
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ShowScriptResponse withDirectory(String directory) {
        this.directory = directory;
        return this;
    }

    /**
     * 脚本关联的目录
     * @return directory
     */
    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public ShowScriptResponse withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * 脚本内容
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ShowScriptResponse withConnectionName(String connectionName) {
        this.connectionName = connectionName;
        return this;
    }

    /**
     * 脚本关联的连接名称
     * @return connectionName
     */
    public String getConnectionName() {
        return connectionName;
    }

    public void setConnectionName(String connectionName) {
        this.connectionName = connectionName;
    }

    public ShowScriptResponse withDatabase(String database) {
        this.database = database;
        return this;
    }

    /**
     * 脚本执行所在的数据库
     * @return database
     */
    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public ShowScriptResponse withQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }

    /**
     * 脚本关联的DLI队列名称
     * @return queueName
     */
    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public ShowScriptResponse withConfiguration(String _configuration) {
        this._configuration = _configuration;
        return this;
    }

    /**
     * 脚本的配置项参数
     * @return _configuration
     */
    public String getConfiguration() {
        return _configuration;
    }

    public void setConfiguration(String _configuration) {
        this._configuration = _configuration;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowScriptResponse showScriptResponse = (ShowScriptResponse) o;
        return Objects.equals(this.name, showScriptResponse.name) && Objects.equals(this.type, showScriptResponse.type)
            && Objects.equals(this.directory, showScriptResponse.directory)
            && Objects.equals(this.content, showScriptResponse.content)
            && Objects.equals(this.connectionName, showScriptResponse.connectionName)
            && Objects.equals(this.database, showScriptResponse.database)
            && Objects.equals(this.queueName, showScriptResponse.queueName)
            && Objects.equals(this._configuration, showScriptResponse._configuration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, directory, content, connectionName, database, queueName, _configuration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowScriptResponse {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    directory: ").append(toIndentedString(directory)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    connectionName: ").append(toIndentedString(connectionName)).append("\n");
        sb.append("    database: ").append(toIndentedString(database)).append("\n");
        sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
        sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
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
