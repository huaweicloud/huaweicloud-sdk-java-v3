package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 脚本信息
 */
public class ScriptInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 脚本类型 - FlinkSQL: Flink SQL - DLISQL：DLI SQL - SparkSQL: MRS Spark SQL - HiveSQL: MRS Hive SQL - DWSSQL: DWS SQL - RDSSQL: RDS SQL - Shell: Shell 脚本 - PYTHON：Python 脚本 - PRESTO: MRS Presto SQL - ClickHouseSQL: MRS ClickHouse SQL - HetuEngineSQL: MRS HetuEngine SQL - ImpalaSQL: MRS Impala SQL - SparkPython: MRS Spark Python脚本
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
         * Enum RDSSQL for value: "RDSSQL"
         */
        public static final TypeEnum RDSSQL = new TypeEnum("RDSSQL");

        /**
         * Enum SHELL for value: "Shell"
         */
        public static final TypeEnum SHELL = new TypeEnum("Shell");

        /**
         * Enum PYTHON for value: "PYTHON"
         */
        public static final TypeEnum PYTHON = new TypeEnum("PYTHON");

        /**
         * Enum PRESTO for value: "PRESTO"
         */
        public static final TypeEnum PRESTO = new TypeEnum("PRESTO");

        /**
         * Enum CLICKHOUSESQL for value: "ClickHouseSQL"
         */
        public static final TypeEnum CLICKHOUSESQL = new TypeEnum("ClickHouseSQL");

        /**
         * Enum HETUENGINESQL for value: "HetuEngineSQL"
         */
        public static final TypeEnum HETUENGINESQL = new TypeEnum("HetuEngineSQL");

        /**
         * Enum IMPALASQL for value: "ImpalaSQL"
         */
        public static final TypeEnum IMPALASQL = new TypeEnum("ImpalaSQL");

        /**
         * Enum SPARKPYTHON for value: "SparkPython"
         */
        public static final TypeEnum SPARKPYTHON = new TypeEnum("SparkPython");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("FlinkSQL", FLINKSQL);
            map.put("DLISQL", DLISQL);
            map.put("SparkSQL", SPARKSQL);
            map.put("HiveSQL", HIVESQL);
            map.put("DWSSQL", DWSSQL);
            map.put("RDSSQL", RDSSQL);
            map.put("Shell", SHELL);
            map.put("PYTHON", PYTHON);
            map.put("PRESTO", PRESTO);
            map.put("ClickHouseSQL", CLICKHOUSESQL);
            map.put("HetuEngineSQL", HETUENGINESQL);
            map.put("ImpalaSQL", IMPALASQL);
            map.put("SparkPython", SPARKPYTHON);
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_user")

    private String createUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_name")

    private String connectionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database")

    private String database;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_name")

    private String queueName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configuration")

    private Object _configuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public ScriptInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 脚本名称，只能包含五种字符：英文字母、数字、中文、中划线和点号，且长度小于等于128个字符。脚本名称不能重复。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ScriptInfo withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 脚本类型 - FlinkSQL: Flink SQL - DLISQL：DLI SQL - SparkSQL: MRS Spark SQL - HiveSQL: MRS Hive SQL - DWSSQL: DWS SQL - RDSSQL: RDS SQL - Shell: Shell 脚本 - PYTHON：Python 脚本 - PRESTO: MRS Presto SQL - ClickHouseSQL: MRS ClickHouse SQL - HetuEngineSQL: MRS HetuEngine SQL - ImpalaSQL: MRS Impala SQL - SparkPython: MRS Spark Python脚本
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ScriptInfo withDirectory(String directory) {
        this.directory = directory;
        return this;
    }

    /**
     * 脚本所在目录路径 通过DataArts Studio管理控制台 > 数据开发，左侧列表选择“数据开发 > 脚本开发”。在脚本的目录树上，可以查看到当前已经创建的目录，默认在根目录/。
     * @return directory
     */
    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public ScriptInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 脚本id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ScriptInfo withCreateUser(String createUser) {
        this.createUser = createUser;
        return this;
    }

    /**
     * 脚本创建人
     * @return createUser
     */
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public ScriptInfo withConnectionName(String connectionName) {
        this.connectionName = connectionName;
        return this;
    }

    /**
     * 脚本关联的连接名称。当type参数值为DLISQL、SparkSQL、HiveSQL、DWSSQL、Shell、PRESTO、ClickHouseSQL、ImpalaSQL、HetuEngineSQL、RDSSQL其中之一时，这个参数是必选的。用户可以通过查询连接列表（待下线）接口获取当前系统中已经存在的连接。默认值为空。
     * @return connectionName
     */
    public String getConnectionName() {
        return connectionName;
    }

    public void setConnectionName(String connectionName) {
        this.connectionName = connectionName;
    }

    public ScriptInfo withDatabase(String database) {
        this.database = database;
        return this;
    }

    /**
     * 执行SQL语句所关联的数据库，当type参数值为DLISQL、SparkSQL、HiveSQL、DWSSQL、PRESTO、ClickHouseSQL、ImpalaSQL、HetuEngineSQL、RDSSQL其中之一时，才支持此参数。 - type为DLISQL时，可以通过查看所有数据库接口获取数据库信息。 - type为其他类型的时候，需要通过JDBC方式连上集群，查询数据库信息。默认值为空。
     * @return database
     */
    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public ScriptInfo withQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }

    /**
     * DLI资源队列名称，当type参数值为DLISQL时，才支持此参数。可以通过查询队列列表接口获取队列信息。默认值为空。
     * @return queueName
     */
    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public ScriptInfo withConfiguration(Object _configuration) {
        this._configuration = _configuration;
        return this;
    }

    /**
     * 用户定义适用于此作业的配置参数，当type参数值为DLISQL时存在。当前支持的配置项列表请参考DLI的conf参数说明。默认值为空。
     * @return _configuration
     */
    public Object getConfiguration() {
        return _configuration;
    }

    public void setConfiguration(Object _configuration) {
        this._configuration = _configuration;
    }

    public ScriptInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述，长度不能超过255个字符。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScriptInfo that = (ScriptInfo) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.type, that.type)
            && Objects.equals(this.directory, that.directory) && Objects.equals(this.id, that.id)
            && Objects.equals(this.createUser, that.createUser)
            && Objects.equals(this.connectionName, that.connectionName) && Objects.equals(this.database, that.database)
            && Objects.equals(this.queueName, that.queueName)
            && Objects.equals(this._configuration, that._configuration)
            && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            type,
            directory,
            id,
            createUser,
            connectionName,
            database,
            queueName,
            _configuration,
            description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScriptInfo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    directory: ").append(toIndentedString(directory)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    createUser: ").append(toIndentedString(createUser)).append("\n");
        sb.append("    connectionName: ").append(toIndentedString(connectionName)).append("\n");
        sb.append("    database: ").append(toIndentedString(database)).append("\n");
        sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
        sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
