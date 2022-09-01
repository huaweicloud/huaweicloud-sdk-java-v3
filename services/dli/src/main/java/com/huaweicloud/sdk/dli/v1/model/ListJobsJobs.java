package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListJobsJobs
 */
public class ListJobsJobs {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    @JacksonXmlProperty(localName = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_type")

    @JacksonXmlProperty(localName = "job_type")

    private String jobType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_name")

    @JacksonXmlProperty(localName = "queue_name")

    private String queueName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    @JacksonXmlProperty(localName = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    @JacksonXmlProperty(localName = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    @JacksonXmlProperty(localName = "duration")

    private Integer duration;

    /**
     * 此作业的当前状态，包含提交（LAUNCHING）、运行中（RUNNING）、完成（FINISHED）、失败（FAILED）、取消（CANCELLED）。
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
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    @JacksonXmlProperty(localName = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input_row_count")

    @JacksonXmlProperty(localName = "input_row_count")

    private Long inputRowCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bad_row_count")

    @JacksonXmlProperty(localName = "bad_row_count")

    private Long badRowCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input_size")

    @JacksonXmlProperty(localName = "input_size")

    private Long inputSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_count")

    @JacksonXmlProperty(localName = "result_count")

    private Integer resultCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    @JacksonXmlProperty(localName = "database_name")

    private String databaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    @JacksonXmlProperty(localName = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "with_column_header")

    @JacksonXmlProperty(localName = "with_column_header")

    private Boolean withColumnHeader;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail")

    @JacksonXmlProperty(localName = "detail")

    private String detail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statement")

    @JacksonXmlProperty(localName = "statement")

    private String statement;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    @JacksonXmlProperty(localName = "tags")

    private List<JobsTags> tags = null;

    public ListJobsJobs withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 作业ID。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ListJobsJobs withJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * 作业类型。
     * @return jobType
     */
    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public ListJobsJobs withQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }

    /**
     * 作业提交的队列。
     * @return queueName
     */
    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public ListJobsJobs withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 提交作业的用户。
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public ListJobsJobs withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 作业开始的时间。是单位为“毫秒”的时间戳。
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ListJobsJobs withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 作业运行时长，单位毫秒。
     * @return duration
     */
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public ListJobsJobs withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 此作业的当前状态，包含提交（LAUNCHING）、运行中（RUNNING）、完成（FINISHED）、失败（FAILED）、取消（CANCELLED）。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ListJobsJobs withInputRowCount(Long inputRowCount) {
        this.inputRowCount = inputRowCount;
        return this;
    }

    /**
     * Insert作业执行过程中扫描的记录条数。
     * @return inputRowCount
     */
    public Long getInputRowCount() {
        return inputRowCount;
    }

    public void setInputRowCount(Long inputRowCount) {
        this.inputRowCount = inputRowCount;
    }

    public ListJobsJobs withBadRowCount(Long badRowCount) {
        this.badRowCount = badRowCount;
        return this;
    }

    /**
     * Insert作业执行过程中扫描到的错误记录数。
     * @return badRowCount
     */
    public Long getBadRowCount() {
        return badRowCount;
    }

    public void setBadRowCount(Long badRowCount) {
        this.badRowCount = badRowCount;
    }

    public ListJobsJobs withInputSize(Long inputSize) {
        this.inputSize = inputSize;
        return this;
    }

    /**
     * 作业执行过程中扫描文件的大小。
     * @return inputSize
     */
    public Long getInputSize() {
        return inputSize;
    }

    public void setInputSize(Long inputSize) {
        this.inputSize = inputSize;
    }

    public ListJobsJobs withResultCount(Integer resultCount) {
        this.resultCount = resultCount;
        return this;
    }

    /**
     * 当前作业返回的结果总条数或insert作业插入的总条数。
     * @return resultCount
     */
    public Integer getResultCount() {
        return resultCount;
    }

    public void setResultCount(Integer resultCount) {
        this.resultCount = resultCount;
    }

    public ListJobsJobs withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * 记录其操作的表所在的数据库名称。类型为Import和Export作业才有“database_name”属性。
     * @return databaseName
     */
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public ListJobsJobs withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * 记录其操作的表名称。类型为Import和Export作业才有“table_name”属性。
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public ListJobsJobs withWithColumnHeader(Boolean withColumnHeader) {
        this.withColumnHeader = withColumnHeader;
        return this;
    }

    /**
     * Import类型的作业，记录其导入的数据是否包括列名。
     * @return withColumnHeader
     */
    public Boolean getWithColumnHeader() {
        return withColumnHeader;
    }

    public void setWithColumnHeader(Boolean withColumnHeader) {
        this.withColumnHeader = withColumnHeader;
    }

    public ListJobsJobs withDetail(String detail) {
        this.detail = detail;
        return this;
    }

    /**
     * SQL查询的相关列信息的Json字符串。
     * @return detail
     */
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public ListJobsJobs withStatement(String statement) {
        this.statement = statement;
        return this;
    }

    /**
     * 作业执行的SQL语句。
     * @return statement
     */
    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

    public ListJobsJobs withTags(List<JobsTags> tags) {
        this.tags = tags;
        return this;
    }

    public ListJobsJobs addTagsItem(JobsTags tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ListJobsJobs withTags(Consumer<List<JobsTags>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 作业标签。具体请参考表tags。
     * @return tags
     */
    public List<JobsTags> getTags() {
        return tags;
    }

    public void setTags(List<JobsTags> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListJobsJobs listJobsJobs = (ListJobsJobs) o;
        return Objects.equals(this.jobId, listJobsJobs.jobId) && Objects.equals(this.jobType, listJobsJobs.jobType)
            && Objects.equals(this.queueName, listJobsJobs.queueName) && Objects.equals(this.owner, listJobsJobs.owner)
            && Objects.equals(this.startTime, listJobsJobs.startTime)
            && Objects.equals(this.duration, listJobsJobs.duration) && Objects.equals(this.status, listJobsJobs.status)
            && Objects.equals(this.inputRowCount, listJobsJobs.inputRowCount)
            && Objects.equals(this.badRowCount, listJobsJobs.badRowCount)
            && Objects.equals(this.inputSize, listJobsJobs.inputSize)
            && Objects.equals(this.resultCount, listJobsJobs.resultCount)
            && Objects.equals(this.databaseName, listJobsJobs.databaseName)
            && Objects.equals(this.tableName, listJobsJobs.tableName)
            && Objects.equals(this.withColumnHeader, listJobsJobs.withColumnHeader)
            && Objects.equals(this.detail, listJobsJobs.detail)
            && Objects.equals(this.statement, listJobsJobs.statement) && Objects.equals(this.tags, listJobsJobs.tags);
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
            statement,
            tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListJobsJobs {\n");
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
        sb.append("    statement: ").append(toIndentedString(statement)).append("\n");
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
