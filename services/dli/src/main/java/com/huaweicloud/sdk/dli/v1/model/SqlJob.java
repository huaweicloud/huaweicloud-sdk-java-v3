package com.huaweicloud.sdk.dli.v1.model;

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
 * 作业信息。
 */
public class SqlJob {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_type")

    private String jobType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_name")

    private String queueName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Long duration;

    /**
     * 此作业的当前状态 示例: CANCELLED 约束限制:  无 取值范围: LAUNCHING（提交中） RUNNING（运行中） FINISHED（完成） FAILED（失败） CANCELLED（取消） 默认取值: 无
     */
    public static final class StatusEnum {

        /**
         * Enum LAUNCHING for value: "LAUNCHING"
         */
        public static final StatusEnum LAUNCHING = new StatusEnum("LAUNCHING");

        /**
         * Enum RUNNING for value: "RUNNING"
         */
        public static final StatusEnum RUNNING = new StatusEnum("RUNNING");

        /**
         * Enum FINISHED for value: "FINISHED"
         */
        public static final StatusEnum FINISHED = new StatusEnum("FINISHED");

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final StatusEnum FAILED = new StatusEnum("FAILED");

        /**
         * Enum CANCELLED for value: "CANCELLED"
         */
        public static final StatusEnum CANCELLED = new StatusEnum("CANCELLED");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("LAUNCHING", LAUNCHING);
            map.put("RUNNING", RUNNING);
            map.put("FINISHED", FINISHED);
            map.put("FAILED", FAILED);
            map.put("CANCELLED", CANCELLED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input_row_count")

    private Long inputRowCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bad_row_count")

    private Long badRowCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input_size")

    private Long inputSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_count")

    private Long resultCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    private String databaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "with_column_header")

    private Boolean withColumnHeader;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail")

    private String detail;

    /**
     * 引擎类型 示例: spark 约束限制:  无 取值范围: spark, hetuEngine 默认取值: 无
     */
    public static final class EngineTypeEnum {

        /**
         * Enum SPARK for value: "spark"
         */
        public static final EngineTypeEnum SPARK = new EngineTypeEnum("spark");

        /**
         * Enum HETUENGINE for value: "hetuEngine"
         */
        public static final EngineTypeEnum HETUENGINE = new EngineTypeEnum("hetuEngine");

        private static final Map<String, EngineTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EngineTypeEnum> createStaticFields() {
            Map<String, EngineTypeEnum> map = new HashMap<>();
            map.put("spark", SPARK);
            map.put("hetuEngine", HETUENGINE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EngineTypeEnum(String value) {
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
        public static EngineTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EngineTypeEnum(value));
        }

        public static EngineTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EngineTypeEnum) {
                return this.value.equals(((EngineTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_type")

    private EngineTypeEnum engineType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statement")

    private String statement;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_cost")

    private String cpuCost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_byte")

    private String outputByte;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_path")

    private String resultPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_format")

    private String resultFormat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_details_path")

    private String executionDetailsPath;

    public SqlJob withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 参数解释:  作业ID 示例: 6d2146a0-c2d5-41bd-8ca0-ca9694ada992 约束限制:  无 取值范围: 无 默认取值: 无
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public SqlJob withJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * 参数解释:  指定查询的作业类型，包含DDL、DCL、IMPORT、EXPORT、QUERY、INSERT、DATA_MIGRATION、UPDATE、DELETE、RESTART_QUEUE、SCALE_QUEUE，若要查询所有类型的作业，则传入ALL。 示例: QUERY 约束限制:  无 取值范围: DDL、DCL、IMPORT、EXPORT、QUERY、INSERT、DATA_MIGRATION、UPDATE、DELETE、RESTART_QUEUE、SCALE_QUEUE、ALL 默认取值: 无
     * @return jobType
     */
    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public SqlJob withQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }

    /**
     * 作业提交的对列 示例: ci_sql 约束限制:  无 取值范围: 无 默认取值: 无
     * @return queueName
     */
    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public SqlJob withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 提交作业的用户 示例: tenant1 约束限制:  无 取值范围: 无 默认取值: 无
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public SqlJob withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 作业开始的时间。是单位为“毫秒”的时间戳 示例: 1502349803729 约束限制:  无 取值范围: 大于等于0的整数 默认取值: 无
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public SqlJob withDuration(Long duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 作业运行时长，单位毫秒 示例: 30000 约束限制:  无 取值范围: 大于等于0的整数 默认取值: 无
     * @return duration
     */
    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public SqlJob withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 此作业的当前状态 示例: CANCELLED 约束限制:  无 取值范围: LAUNCHING（提交中） RUNNING（运行中） FINISHED（完成） FAILED（失败） CANCELLED（取消） 默认取值: 无
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public SqlJob withInputRowCount(Long inputRowCount) {
        this.inputRowCount = inputRowCount;
        return this;
    }

    /**
     * Insert作业执行过程中扫描的记录条数 示例: 66 约束限制:  无 取值范围: 大于等于0的整数 默认取值: 无
     * @return inputRowCount
     */
    public Long getInputRowCount() {
        return inputRowCount;
    }

    public void setInputRowCount(Long inputRowCount) {
        this.inputRowCount = inputRowCount;
    }

    public SqlJob withBadRowCount(Long badRowCount) {
        this.badRowCount = badRowCount;
        return this;
    }

    /**
     * Insert作业执行过程中扫描到的错误记录数 示例: 666 约束限制:  无 取值范围: 大于等于0的整数 默认取值: 无
     * @return badRowCount
     */
    public Long getBadRowCount() {
        return badRowCount;
    }

    public void setBadRowCount(Long badRowCount) {
        this.badRowCount = badRowCount;
    }

    public SqlJob withInputSize(Long inputSize) {
        this.inputSize = inputSize;
        return this;
    }

    /**
     * 作业执行过程中扫描文件的大小 示例: 5 约束限制:  无 取值范围: 大于等于0的整数 默认取值: 无
     * @return inputSize
     */
    public Long getInputSize() {
        return inputSize;
    }

    public void setInputSize(Long inputSize) {
        this.inputSize = inputSize;
    }

    public SqlJob withResultCount(Long resultCount) {
        this.resultCount = resultCount;
        return this;
    }

    /**
     * 当前作业返回的结果总条数或insert作业插入的总条数 示例: 55 约束限制:  无 取值范围: 大于等于0的整数 默认取值: 无
     * @return resultCount
     */
    public Long getResultCount() {
        return resultCount;
    }

    public void setResultCount(Long resultCount) {
        this.resultCount = resultCount;
    }

    public SqlJob withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * 记录其操作的表所在的数据库名称。类型为Import和Export作业才有“database_name”属性 示例: db2 约束限制:  无 取值范围: 无 默认取值: 无
     * @return databaseName
     */
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public SqlJob withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * 记录其操作的表名称。类型为Import和Export作业才有“table_name”属性 示例: t2 约束限制:  无 取值范围: 无 默认取值: 无
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public SqlJob withWithColumnHeader(Boolean withColumnHeader) {
        this.withColumnHeader = withColumnHeader;
        return this;
    }

    /**
     * Import类型的作业，记录其导入的数据是否包括列名 示例: true 约束限制:  无 取值范围: true, false 默认取值: 无
     * @return withColumnHeader
     */
    public Boolean getWithColumnHeader() {
        return withColumnHeader;
    }

    public void setWithColumnHeader(Boolean withColumnHeader) {
        this.withColumnHeader = withColumnHeader;
    }

    public SqlJob withDetail(String detail) {
        this.detail = detail;
        return this;
    }

    /**
     * SQL查询的相关列信息的Json字符串 示例: {\\\"type\\\":\\\"struct\\\",\\\"fields\\\":[{\\\"name\\\":\\\"name\\\",\\\"type\\\":\\\"string\\\",\\\"nullable\\\":true,\\\"metadata\\\":{}},{\\\"name\\\":\\\"age\\\",\\\"type\\\":\\\"integer\\\",\\\"nullable\\\":true,\\\"metadata\\\":{}}]} 约束限制:  符合Json格式的字符串 取值范围: 无 默认取值: 无
     * @return detail
     */
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public SqlJob withEngineType(EngineTypeEnum engineType) {
        this.engineType = engineType;
        return this;
    }

    /**
     * 引擎类型 示例: spark 约束限制:  无 取值范围: spark, hetuEngine 默认取值: 无
     * @return engineType
     */
    public EngineTypeEnum getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineTypeEnum engineType) {
        this.engineType = engineType;
    }

    public SqlJob withStatement(String statement) {
        this.statement = statement;
        return this;
    }

    /**
     * 作业执行的SQL语句 示例: select * from t_json_002 约束限制:  无 取值范围: 无 默认取值: 无
     * @return statement
     */
    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

    public SqlJob withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public SqlJob addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public SqlJob withTags(Consumer<List<Tag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 作业标签
     * @return tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public SqlJob withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 系统提示信息 示例: Navicat Data Modeler enables you to build high-quality conceptual, logical and physical data models for a wide variety of audiences. Navicat 15 has added support for the system-wide dark mode. Creativity is intelligence having fun. The On Startup feature allows you to control what tabs appear when you launch Navicat. In the Objects tab, you can use the List List, Detail Detail and ER Diagram ER Diagram buttons to change the object view. If your Internet Service Provider (ISP) does not provide direct access to its server, Secure Tunneling Protocol (SSH) / HTTP is another solution. A man’s best friends are his ten fingers. Export Wizard allows you to export data from tables, collections, views, or query results to any available formats. Navicat 15 has added support for the system-wide dark mode. Secure Sockets Layer(SSL) is a protocol for transmitting private documents via the Internet. A man’s best friends are his ten fingers. Navicat Monitor is a safe, simple and agentless remote server monitoring tool that is packed with powerful features to make your monitoring effective as possible. The past has no power over the present moment. Such sessions are also susceptible to session hijacking, where a malicious user takes over your session once you have authenticated. A man is not old until regrets take the place of dreams. Secure SHell (SSH) is a program to log in into another computer over a network, execute commands on a remote server, and move files from one machine to another. Secure SHell (SSH) is a program to log in into another computer over a network, execute commands on a remote server, and move files from one machine to another. Champions keep playing until they get it right. All journeys have secret destinations of which the traveler is unaware. Flexible settings enable you to set up a custom key for comparison and synchronization. Navicat authorizes you to make connection to remote servers running on different platforms (i.e. Windows, macOS, Linux and UNIX), and supports PAM and GSSAPI authentication. To successfully establish a new connection to local/remote server - no matter via SSL, SSH or HTTP, set the database login information in the General tab. It can also manage cloud databases such as Amazon Redshift, Amazon RDS, Alibaba Cloud. Features in Navicat are sophisticated enough to provide professional developers for all their specific needs, yet easy to learn for users who are new to database server. After logged in the Navicat Cloud feature, the Navigation pane will be divided into Navicat Cloud and My Connections sections. 约束限制:  无 取值范围: 无 默认取值: 无
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public SqlJob withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 作业结束的时间。是单位为“毫秒”的时间戳 示例: 1502349803729 约束限制:  无 取值范围: 大于等于0的整数 默认取值: 无
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public SqlJob withCpuCost(String cpuCost) {
        this.cpuCost = cpuCost;
        return this;
    }

    /**
     * 作业的CPU累计使用量 示例: 15376 约束限制:  无 取值范围: 无 默认取值: 无
     * @return cpuCost
     */
    public String getCpuCost() {
        return cpuCost;
    }

    public void setCpuCost(String cpuCost) {
        this.cpuCost = cpuCost;
    }

    public SqlJob withOutputByte(String outputByte) {
        this.outputByte = outputByte;
        return this;
    }

    /**
     * 作业的输出字节数 示例: 35 约束限制:  无 取值范围: 无 默认取值: 无
     * @return outputByte
     */
    public String getOutputByte() {
        return outputByte;
    }

    public void setOutputByte(String outputByte) {
        this.outputByte = outputByte;
    }

    public SqlJob withResultPath(String resultPath) {
        this.resultPath = resultPath;
        return this;
    }

    /**
     * 作业结果的存储路径。
     * @return resultPath
     */
    public String getResultPath() {
        return resultPath;
    }

    public void setResultPath(String resultPath) {
        this.resultPath = resultPath;
    }

    public SqlJob withResultFormat(String resultFormat) {
        this.resultFormat = resultFormat;
        return this;
    }

    /**
     * 作业结果的存储格式，当前只支持csv
     * @return resultFormat
     */
    public String getResultFormat() {
        return resultFormat;
    }

    public void setResultFormat(String resultFormat) {
        this.resultFormat = resultFormat;
    }

    public SqlJob withExecutionDetailsPath(String executionDetailsPath) {
        this.executionDetailsPath = executionDetailsPath;
        return this;
    }

    /**
     * 作业执行计划的存储路径。
     * @return executionDetailsPath
     */
    public String getExecutionDetailsPath() {
        return executionDetailsPath;
    }

    public void setExecutionDetailsPath(String executionDetailsPath) {
        this.executionDetailsPath = executionDetailsPath;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SqlJob that = (SqlJob) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.jobType, that.jobType)
            && Objects.equals(this.queueName, that.queueName) && Objects.equals(this.owner, that.owner)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.duration, that.duration)
            && Objects.equals(this.status, that.status) && Objects.equals(this.inputRowCount, that.inputRowCount)
            && Objects.equals(this.badRowCount, that.badRowCount) && Objects.equals(this.inputSize, that.inputSize)
            && Objects.equals(this.resultCount, that.resultCount)
            && Objects.equals(this.databaseName, that.databaseName) && Objects.equals(this.tableName, that.tableName)
            && Objects.equals(this.withColumnHeader, that.withColumnHeader) && Objects.equals(this.detail, that.detail)
            && Objects.equals(this.engineType, that.engineType) && Objects.equals(this.statement, that.statement)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.message, that.message)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.cpuCost, that.cpuCost)
            && Objects.equals(this.outputByte, that.outputByte) && Objects.equals(this.resultPath, that.resultPath)
            && Objects.equals(this.resultFormat, that.resultFormat)
            && Objects.equals(this.executionDetailsPath, that.executionDetailsPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId,
            jobType,
            queueName,
            owner,
            startTime,
            duration,
            status,
            inputRowCount,
            badRowCount,
            inputSize,
            resultCount,
            databaseName,
            tableName,
            withColumnHeader,
            detail,
            engineType,
            statement,
            tags,
            message,
            endTime,
            cpuCost,
            outputByte,
            resultPath,
            resultFormat,
            executionDetailsPath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SqlJob {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    inputRowCount: ").append(toIndentedString(inputRowCount)).append("\n");
        sb.append("    badRowCount: ").append(toIndentedString(badRowCount)).append("\n");
        sb.append("    inputSize: ").append(toIndentedString(inputSize)).append("\n");
        sb.append("    resultCount: ").append(toIndentedString(resultCount)).append("\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    withColumnHeader: ").append(toIndentedString(withColumnHeader)).append("\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
        sb.append("    engineType: ").append(toIndentedString(engineType)).append("\n");
        sb.append("    statement: ").append(toIndentedString(statement)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    cpuCost: ").append(toIndentedString(cpuCost)).append("\n");
        sb.append("    outputByte: ").append(toIndentedString(outputByte)).append("\n");
        sb.append("    resultPath: ").append(toIndentedString(resultPath)).append("\n");
        sb.append("    resultFormat: ").append(toIndentedString(resultFormat)).append("\n");
        sb.append("    executionDetailsPath: ").append(toIndentedString(executionDetailsPath)).append("\n");
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
