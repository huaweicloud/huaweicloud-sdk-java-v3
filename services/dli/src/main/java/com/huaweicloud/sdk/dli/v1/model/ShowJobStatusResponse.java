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
public class ShowJobStatusResponse extends SdkResponse {

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

    private List<JobsTags> tags = null;

    public ShowJobStatusResponse withJobId(String jobId) {
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

    public ShowJobStatusResponse withJobType(String jobType) {
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

    public ShowJobStatusResponse withQueueName(String queueName) {
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

    public ShowJobStatusResponse withOwner(String owner) {
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

    public ShowJobStatusResponse withStartTime(Long startTime) {
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

    public ShowJobStatusResponse withDuration(Long duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 作业运行时长，单位毫秒。
     * @return duration
     */
    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public ShowJobStatusResponse withStatus(StatusEnum status) {
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

    public ShowJobStatusResponse withInputRowCount(Long inputRowCount) {
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

    public ShowJobStatusResponse withBadRowCount(Long badRowCount) {
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

    public ShowJobStatusResponse withInputSize(Long inputSize) {
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

    public ShowJobStatusResponse withResultCount(Integer resultCount) {
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

    public ShowJobStatusResponse withDatabaseName(String databaseName) {
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

    public ShowJobStatusResponse withTableName(String tableName) {
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

    public ShowJobStatusResponse withDetail(String detail) {
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

    public ShowJobStatusResponse withStatement(String statement) {
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

    public ShowJobStatusResponse withIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }

    /**
     * 执行请求是否成功。“true”表示请求执行成功。
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public ShowJobStatusResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 系统提示信息，执行成功时，信息可能为空。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ShowJobStatusResponse withJobMode(String jobMode) {
        this.jobMode = jobMode;
        return this;
    }

    /**
     * 作业执行方式
     * @return jobMode
     */
    public String getJobMode() {
        return jobMode;
    }

    public void setJobMode(String jobMode) {
        this.jobMode = jobMode;
    }

    public ShowJobStatusResponse withTags(List<JobsTags> tags) {
        this.tags = tags;
        return this;
    }

    public ShowJobStatusResponse addTagsItem(JobsTags tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ShowJobStatusResponse withTags(Consumer<List<JobsTags>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 作业的标签。具体请参考表tags
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
        ShowJobStatusResponse showJobStatusResponse = (ShowJobStatusResponse) o;
        return Objects.equals(this.jobId, showJobStatusResponse.jobId)
            && Objects.equals(this.jobType, showJobStatusResponse.jobType)
            && Objects.equals(this.queueName, showJobStatusResponse.queueName)
            && Objects.equals(this.owner, showJobStatusResponse.owner)
            && Objects.equals(this.startTime, showJobStatusResponse.startTime)
            && Objects.equals(this.duration, showJobStatusResponse.duration)
            && Objects.equals(this.status, showJobStatusResponse.status)
            && Objects.equals(this.inputRowCount, showJobStatusResponse.inputRowCount)
            && Objects.equals(this.badRowCount, showJobStatusResponse.badRowCount)
            && Objects.equals(this.inputSize, showJobStatusResponse.inputSize)
            && Objects.equals(this.resultCount, showJobStatusResponse.resultCount)
            && Objects.equals(this.databaseName, showJobStatusResponse.databaseName)
            && Objects.equals(this.tableName, showJobStatusResponse.tableName)
            && Objects.equals(this.detail, showJobStatusResponse.detail)
            && Objects.equals(this.statement, showJobStatusResponse.statement)
            && Objects.equals(this.isSuccess, showJobStatusResponse.isSuccess)
            && Objects.equals(this.message, showJobStatusResponse.message)
            && Objects.equals(this.jobMode, showJobStatusResponse.jobMode)
            && Objects.equals(this.tags, showJobStatusResponse.tags);
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
            statement,
            isSuccess,
            message,
            jobMode,
            tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowJobStatusResponse {\n");
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
