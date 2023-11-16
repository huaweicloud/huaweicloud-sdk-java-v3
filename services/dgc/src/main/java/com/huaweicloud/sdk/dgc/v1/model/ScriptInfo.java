package com.huaweicloud.sdk.dgc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ScriptInfo
 */
public class ScriptInfo {

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
         * Enum RDSSQL for value: "RDSSQL"
         */
        public static final TypeEnum RDSSQL = new TypeEnum("RDSSQL");

        /**
         * Enum SHELL for value: "Shell"
         */
        public static final TypeEnum SHELL = new TypeEnum("Shell");

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
         * Enum PYTHON for value: "PYTHON"
         */
        public static final TypeEnum PYTHON = new TypeEnum("PYTHON");

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
            map.put("PRESTO", PRESTO);
            map.put("ClickHouseSQL", CLICKHOUSESQL);
            map.put("HetuEngineSQL", HETUENGINESQL);
            map.put("PYTHON", PYTHON);
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /**
     * 在开启审批开关后，需要填写该字段。表示创建脚本的目标状态，有三种状态：SAVED、SUBMITTED和PRODUCTION，分别表示脚本创建后是保存态，提交态，生产态。
     */
    public static final class TargetStatusEnum {

        /**
         * Enum SAVED for value: "SAVED"
         */
        public static final TargetStatusEnum SAVED = new TargetStatusEnum("SAVED");

        /**
         * Enum SUBMITTED for value: "SUBMITTED"
         */
        public static final TargetStatusEnum SUBMITTED = new TargetStatusEnum("SUBMITTED");

        /**
         * Enum PRODUCTION for value: "PRODUCTION"
         */
        public static final TargetStatusEnum PRODUCTION = new TargetStatusEnum("PRODUCTION");

        private static final Map<String, TargetStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TargetStatusEnum> createStaticFields() {
            Map<String, TargetStatusEnum> map = new HashMap<>();
            map.put("SAVED", SAVED);
            map.put("SUBMITTED", SUBMITTED);
            map.put("PRODUCTION", PRODUCTION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TargetStatusEnum(String value) {
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
        public static TargetStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TargetStatusEnum(value));
        }

        public static TargetStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TargetStatusEnum) {
                return this.value.equals(((TargetStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "targetStatus")

    private TargetStatusEnum targetStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approvers")

    private List<JobApprover> approvers = null;

    public ScriptInfo withName(String name) {
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

    public ScriptInfo withType(TypeEnum type) {
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

    public ScriptInfo withDirectory(String directory) {
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

    public ScriptInfo withContent(String content) {
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

    public ScriptInfo withConnectionName(String connectionName) {
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

    public ScriptInfo withDatabase(String database) {
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

    public ScriptInfo withQueueName(String queueName) {
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

    public ScriptInfo withConfiguration(String _configuration) {
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

    public ScriptInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 脚本描述，长度不能超过255个字符
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ScriptInfo withTargetStatus(TargetStatusEnum targetStatus) {
        this.targetStatus = targetStatus;
        return this;
    }

    /**
     * 在开启审批开关后，需要填写该字段。表示创建脚本的目标状态，有三种状态：SAVED、SUBMITTED和PRODUCTION，分别表示脚本创建后是保存态，提交态，生产态。
     * @return targetStatus
     */
    public TargetStatusEnum getTargetStatus() {
        return targetStatus;
    }

    public void setTargetStatus(TargetStatusEnum targetStatus) {
        this.targetStatus = targetStatus;
    }

    public ScriptInfo withApprovers(List<JobApprover> approvers) {
        this.approvers = approvers;
        return this;
    }

    public ScriptInfo addApproversItem(JobApprover approversItem) {
        if (this.approvers == null) {
            this.approvers = new ArrayList<>();
        }
        this.approvers.add(approversItem);
        return this;
    }

    public ScriptInfo withApprovers(Consumer<List<JobApprover>> approversSetter) {
        if (this.approvers == null) {
            this.approvers = new ArrayList<>();
        }
        approversSetter.accept(this.approvers);
        return this;
    }

    /**
     * 在开启审批开关后，需要填写该字段，表示脚本审批人
     * @return approvers
     */
    public List<JobApprover> getApprovers() {
        return approvers;
    }

    public void setApprovers(List<JobApprover> approvers) {
        this.approvers = approvers;
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
            && Objects.equals(this.directory, that.directory) && Objects.equals(this.content, that.content)
            && Objects.equals(this.connectionName, that.connectionName) && Objects.equals(this.database, that.database)
            && Objects.equals(this.queueName, that.queueName)
            && Objects.equals(this._configuration, that._configuration)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.targetStatus, that.targetStatus) && Objects.equals(this.approvers, that.approvers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            type,
            directory,
            content,
            connectionName,
            database,
            queueName,
            _configuration,
            description,
            targetStatus,
            approvers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScriptInfo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    directory: ").append(toIndentedString(directory)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    connectionName: ").append(toIndentedString(connectionName)).append("\n");
        sb.append("    database: ").append(toIndentedString(database)).append("\n");
        sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
        sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    targetStatus: ").append(toIndentedString(targetStatus)).append("\n");
        sb.append("    approvers: ").append(toIndentedString(approvers)).append("\n");
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
