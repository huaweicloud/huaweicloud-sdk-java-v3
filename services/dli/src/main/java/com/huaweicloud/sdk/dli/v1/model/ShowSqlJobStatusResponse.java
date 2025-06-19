package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowSqlJobStatusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    /**
     * 参数解释:  作业类型 示例: 指定查询的作业类型，包含DDL、DCL、IMPORT、EXPORT、QUERY、INSERT、DATA_MIGRATION、UPDATE、DELETE、RESTART_QUEUE、SCALE_QUEUE，若要查询所有类型的作业，则传入ALL。 约束限制:  无 取值范围: DDL、DCL、IMPORT、EXPORT、QUERY、INSERT、DATA_MIGRATION、UPDATE、DELETE、RESTART_QUEUE、SCALE_QUEUE、ALL 默认取值: 无
     */
    public static final class JobTypeEnum {

        /**
         * Enum DDL for value: "DDL"
         */
        public static final JobTypeEnum DDL = new JobTypeEnum("DDL");

        /**
         * Enum DCL for value: "DCL"
         */
        public static final JobTypeEnum DCL = new JobTypeEnum("DCL");

        /**
         * Enum IMPORT for value: "IMPORT"
         */
        public static final JobTypeEnum IMPORT = new JobTypeEnum("IMPORT");

        /**
         * Enum EXPORT for value: "EXPORT"
         */
        public static final JobTypeEnum EXPORT = new JobTypeEnum("EXPORT");

        /**
         * Enum QUERY for value: "QUERY"
         */
        public static final JobTypeEnum QUERY = new JobTypeEnum("QUERY");

        /**
         * Enum INSERT for value: "INSERT"
         */
        public static final JobTypeEnum INSERT = new JobTypeEnum("INSERT");

        /**
         * Enum DATA_MIGRATION for value: "DATA_MIGRATION"
         */
        public static final JobTypeEnum DATA_MIGRATION = new JobTypeEnum("DATA_MIGRATION");

        /**
         * Enum UPDATE for value: "UPDATE"
         */
        public static final JobTypeEnum UPDATE = new JobTypeEnum("UPDATE");

        /**
         * Enum DELETE for value: "DELETE"
         */
        public static final JobTypeEnum DELETE = new JobTypeEnum("DELETE");

        /**
         * Enum RESTART_QUEUE for value: "RESTART_QUEUE"
         */
        public static final JobTypeEnum RESTART_QUEUE = new JobTypeEnum("RESTART_QUEUE");

        /**
         * Enum SCALE_QUEUE for value: "SCALE_QUEUE"
         */
        public static final JobTypeEnum SCALE_QUEUE = new JobTypeEnum("SCALE_QUEUE");

        private static final Map<String, JobTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, JobTypeEnum> createStaticFields() {
            Map<String, JobTypeEnum> map = new HashMap<>();
            map.put("DDL", DDL);
            map.put("DCL", DCL);
            map.put("IMPORT", IMPORT);
            map.put("EXPORT", EXPORT);
            map.put("QUERY", QUERY);
            map.put("INSERT", INSERT);
            map.put("DATA_MIGRATION", DATA_MIGRATION);
            map.put("UPDATE", UPDATE);
            map.put("DELETE", DELETE);
            map.put("RESTART_QUEUE", RESTART_QUEUE);
            map.put("SCALE_QUEUE", SCALE_QUEUE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        JobTypeEnum(String value) {
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
        public static JobTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new JobTypeEnum(value));
        }

        public static JobTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof JobTypeEnum) {
                return this.value.equals(((JobTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_type")

    private JobTypeEnum jobType;

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
     * 参数解释:  此作业的当前状态 示例: CANCELLED 约束限制:  无 取值范围: LAUNCHING（提交） RUNNING（运行中） FINISH（完成） FAILED（失败） CANCELLED（取消） 默认取值: 无
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

    private Integer resultCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    private String databaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail")

    private String detail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_conf")

    private String userConf;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_path")

    private String resultPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_details_path")

    private String executionDetailsPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_format")

    private String resultFormat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statement")

    private String statement;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_success")

    private Boolean isSuccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_mode")

    private String jobMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    public ShowSqlJobStatusResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 参数解释:  作业ID 示例: 6d2146a0-c2d5-41bd-8ca0-ca9694ada992 约束限制:  无 取值范围: 任意字符串 默认取值: 无
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ShowSqlJobStatusResponse withJobType(JobTypeEnum jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * 参数解释:  作业类型 示例: 指定查询的作业类型，包含DDL、DCL、IMPORT、EXPORT、QUERY、INSERT、DATA_MIGRATION、UPDATE、DELETE、RESTART_QUEUE、SCALE_QUEUE，若要查询所有类型的作业，则传入ALL。 约束限制:  无 取值范围: DDL、DCL、IMPORT、EXPORT、QUERY、INSERT、DATA_MIGRATION、UPDATE、DELETE、RESTART_QUEUE、SCALE_QUEUE、ALL 默认取值: 无
     * @return jobType
     */
    public JobTypeEnum getJobType() {
        return jobType;
    }

    public void setJobType(JobTypeEnum jobType) {
        this.jobType = jobType;
    }

    public ShowSqlJobStatusResponse withQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }

    /**
     * 参数解释:  作业提交的队列 示例: dli_sql 约束限制:  无 取值范围: 无 默认取值: 无
     * @return queueName
     */
    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public ShowSqlJobStatusResponse withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 参数解释:  提交作业的用户 示例: ei_dlics_d00352431 约束限制:  无 取值范围: 无 默认取值: 无
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public ShowSqlJobStatusResponse withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 参数解释:  作业开始的时间。是单位为“毫秒”的时间戳 示例: 1502349803729 约束限制:  无 取值范围: 大于等于0的整数 默认取值: 无
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ShowSqlJobStatusResponse withDuration(Long duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 参数解释:  作业运行时长，单位毫秒 示例: 1000 约束限制:  无 取值范围: 大于等于0的整数 默认取值: 无
     * @return duration
     */
    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public ShowSqlJobStatusResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 参数解释:  此作业的当前状态 示例: CANCELLED 约束限制:  无 取值范围: LAUNCHING（提交） RUNNING（运行中） FINISH（完成） FAILED（失败） CANCELLED（取消） 默认取值: 无
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ShowSqlJobStatusResponse withInputRowCount(Long inputRowCount) {
        this.inputRowCount = inputRowCount;
        return this;
    }

    /**
     * 参数解释:  Insert作业执行过程中扫描的记录条数 示例: 66 约束限制:  无 取值范围: 大于等于0的整数 默认取值: 无
     * @return inputRowCount
     */
    public Long getInputRowCount() {
        return inputRowCount;
    }

    public void setInputRowCount(Long inputRowCount) {
        this.inputRowCount = inputRowCount;
    }

    public ShowSqlJobStatusResponse withBadRowCount(Long badRowCount) {
        this.badRowCount = badRowCount;
        return this;
    }

    /**
     * 参数解释:  Insert作业执行过程中扫描到的错误记录数 示例: 666 约束限制:  无 取值范围: 大于等于0的整数 默认取值: 无
     * @return badRowCount
     */
    public Long getBadRowCount() {
        return badRowCount;
    }

    public void setBadRowCount(Long badRowCount) {
        this.badRowCount = badRowCount;
    }

    public ShowSqlJobStatusResponse withInputSize(Long inputSize) {
        this.inputSize = inputSize;
        return this;
    }

    /**
     * 参数解释:  作业执行过程中扫描文件的大小 示例: 5 约束限制:  无 取值范围: 大于等于0的整数 默认取值: 无
     * @return inputSize
     */
    public Long getInputSize() {
        return inputSize;
    }

    public void setInputSize(Long inputSize) {
        this.inputSize = inputSize;
    }

    public ShowSqlJobStatusResponse withResultCount(Integer resultCount) {
        this.resultCount = resultCount;
        return this;
    }

    /**
     * 参数解释:  当前作业返回的结果总条数或insert作业插入的总条数 示例: 55 约束限制:  无 取值范围: 大于等于0的整数 默认取值: 无
     * @return resultCount
     */
    public Integer getResultCount() {
        return resultCount;
    }

    public void setResultCount(Integer resultCount) {
        this.resultCount = resultCount;
    }

    public ShowSqlJobStatusResponse withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * 参数解释:  记录其操作的表所在的数据库名称。类型为Import和Export作业才有“database_name”属性 示例: db2 约束限制:  无 取值范围: 无 默认取值: 无
     * @return databaseName
     */
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public ShowSqlJobStatusResponse withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * 参数解释:  记录其操作的表名称。类型为Import和Export作业才有“table_name”属性 示例: t2 约束限制:  无 取值范围: 无 默认取值: 无
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public ShowSqlJobStatusResponse withDetail(String detail) {
        this.detail = detail;
        return this;
    }

    /**
     * 参数解释:  SQL查询的相关列信息的Json字符串 示例: {\\\"type\\\":\\\"struct\\\",\\\"fields\\\":[{\\\"name\\\":\\\"name\\\",\\\"type\\\":\\\"string\\\",\\\"nullable\\\":true,\\\"metadata\\\":{}},{\\\"name\\\":\\\"age\\\",\\\"type\\\":\\\"integer\\\",\\\"nullable\\\":true,\\\"metadata\\\":{}}]} 约束限制:  符合JSON格式 取值范围: 无 默认取值: 无
     * @return detail
     */
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public ShowSqlJobStatusResponse withUserConf(String userConf) {
        this.userConf = userConf;
        return this;
    }

    /**
     * 参数解释:  SQL配置参数信息Json字符串 示例: {\\\"type\\\":\\\"struct\\\",\\\"fields\\\":[{\\\"name\\\":\\\"name\\\",\\\"type\\\":\\\"string\\\",\\\"nullable\\\":true,\\\"metadata\\\":{}},{\\\"name\\\":\\\"age\\\",\\\"type\\\":\\\"integer\\\",\\\"nullable\\\":true,\\\"metadata\\\":{}}]} 约束限制:  符合JSON格式 取值范围: 无 默认取值: 无
     * @return userConf
     */
    public String getUserConf() {
        return userConf;
    }

    public void setUserConf(String userConf) {
        this.userConf = userConf;
    }

    public ShowSqlJobStatusResponse withResultPath(String resultPath) {
        this.resultPath = resultPath;
        return this;
    }

    /**
     * 参数解释:  查询结果OBS路径 示例: obs://bucketName/jobs/result/011c99a26ae84a1bb963a75e7637d3fd/2023/11/10/229b23ad-5033-40ed-ad70-fda900f2f04e 约束限制:  符合OBS路径格式，obs://_* 取值范围: 无 默认取值: 无
     * @return resultPath
     */
    public String getResultPath() {
        return resultPath;
    }

    public void setResultPath(String resultPath) {
        this.resultPath = resultPath;
    }

    public ShowSqlJobStatusResponse withExecutionDetailsPath(String executionDetailsPath) {
        this.executionDetailsPath = executionDetailsPath;
        return this;
    }

    /**
     * 参数解释:  查询作业执行计划OBS路径 示例: obs://bucketName/jobs/execution_details/011c99a26ae84a1bb963a75e7637d3fd/2023/11/10/229b23ad-5033-40ed-ad70-fda900f2f04e 约束限制:  符合OBS路径格式，obs://_* 取值范围: 无 默认取值: 无
     * @return executionDetailsPath
     */
    public String getExecutionDetailsPath() {
        return executionDetailsPath;
    }

    public void setExecutionDetailsPath(String executionDetailsPath) {
        this.executionDetailsPath = executionDetailsPath;
    }

    public ShowSqlJobStatusResponse withResultFormat(String resultFormat) {
        this.resultFormat = resultFormat;
        return this;
    }

    /**
     * 参数解释:  查询结果格式 示例: csv 约束限制:  无 取值范围: csv 默认取值: 无
     * @return resultFormat
     */
    public String getResultFormat() {
        return resultFormat;
    }

    public void setResultFormat(String resultFormat) {
        this.resultFormat = resultFormat;
    }

    public ShowSqlJobStatusResponse withStatement(String statement) {
        this.statement = statement;
        return this;
    }

    /**
     * 参数解释:  作业执行的SQL语句 示例: select * from t_json_002 约束限制:  符合SQL格式 取值范围: 无 默认取值: 无
     * @return statement
     */
    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

    public ShowSqlJobStatusResponse withIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }

    /**
     * 参数解释:  执行请求是否成功。true表示请求执行成功 示例: true 约束限制:  无 取值范围: true、false 默认取值: 无
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public ShowSqlJobStatusResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 参数解释:  系统提示信息，执行成功时，信息可能为空 示例: success 约束限制:  无 取值范围: 无 默认取值: 无
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ShowSqlJobStatusResponse withJobMode(String jobMode) {
        this.jobMode = jobMode;
        return this;
    }

    /**
     * 参数解释:  作业执行方式 示例: async 约束限制:  无 取值范围: async（同步） sync（异步） 默认取值: 无
     * @return jobMode
     */
    public String getJobMode() {
        return jobMode;
    }

    public void setJobMode(String jobMode) {
        this.jobMode = jobMode;
    }

    public ShowSqlJobStatusResponse withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public ShowSqlJobStatusResponse addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ShowSqlJobStatusResponse withTags(Consumer<List<Tag>> tagsSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSqlJobStatusResponse that = (ShowSqlJobStatusResponse) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.jobType, that.jobType)
            && Objects.equals(this.queueName, that.queueName) && Objects.equals(this.owner, that.owner)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.duration, that.duration)
            && Objects.equals(this.status, that.status) && Objects.equals(this.inputRowCount, that.inputRowCount)
            && Objects.equals(this.badRowCount, that.badRowCount) && Objects.equals(this.inputSize, that.inputSize)
            && Objects.equals(this.resultCount, that.resultCount)
            && Objects.equals(this.databaseName, that.databaseName) && Objects.equals(this.tableName, that.tableName)
            && Objects.equals(this.detail, that.detail) && Objects.equals(this.userConf, that.userConf)
            && Objects.equals(this.resultPath, that.resultPath)
            && Objects.equals(this.executionDetailsPath, that.executionDetailsPath)
            && Objects.equals(this.resultFormat, that.resultFormat) && Objects.equals(this.statement, that.statement)
            && Objects.equals(this.isSuccess, that.isSuccess) && Objects.equals(this.message, that.message)
            && Objects.equals(this.jobMode, that.jobMode) && Objects.equals(this.tags, that.tags);
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
            detail,
            userConf,
            resultPath,
            executionDetailsPath,
            resultFormat,
            statement,
            isSuccess,
            message,
            jobMode,
            tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSqlJobStatusResponse {\n");
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
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
        sb.append("    userConf: ").append(toIndentedString(userConf)).append("\n");
        sb.append("    resultPath: ").append(toIndentedString(resultPath)).append("\n");
        sb.append("    executionDetailsPath: ").append(toIndentedString(executionDetailsPath)).append("\n");
        sb.append("    resultFormat: ").append(toIndentedString(resultFormat)).append("\n");
        sb.append("    statement: ").append(toIndentedString(statement)).append("\n");
        sb.append("    isSuccess: ").append(toIndentedString(isSuccess)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    jobMode: ").append(toIndentedString(jobMode)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
