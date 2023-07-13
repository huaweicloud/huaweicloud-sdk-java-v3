package com.huaweicloud.sdk.mrs.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowJobExeListNewRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_name")

    private String jobName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user")

    private String user;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_type")

    private String jobType;

    /**
     * 作业运行状态。 - FAILED：失败 - KILLED：已终止 - NEW：已创建 - NEW_SAVING：已创建保存中 - SUBMITTED：已提交 - ACCEPTED：已接受 - RUNNING：运行中 - FINISHED：已完成
     */
    public static final class JobStateEnum {

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final JobStateEnum FAILED = new JobStateEnum("FAILED");

        /**
         * Enum KILLED for value: "KILLED"
         */
        public static final JobStateEnum KILLED = new JobStateEnum("KILLED");

        /**
         * Enum NEW for value: "NEW"
         */
        public static final JobStateEnum NEW = new JobStateEnum("NEW");

        /**
         * Enum NEW_SAVING for value: "NEW_SAVING"
         */
        public static final JobStateEnum NEW_SAVING = new JobStateEnum("NEW_SAVING");

        /**
         * Enum SUBMITTED for value: "SUBMITTED"
         */
        public static final JobStateEnum SUBMITTED = new JobStateEnum("SUBMITTED");

        /**
         * Enum ACCEPTED for value: "ACCEPTED"
         */
        public static final JobStateEnum ACCEPTED = new JobStateEnum("ACCEPTED");

        /**
         * Enum RUNNING for value: "RUNNING"
         */
        public static final JobStateEnum RUNNING = new JobStateEnum("RUNNING");

        /**
         * Enum FINISHED for value: "FINISHED"
         */
        public static final JobStateEnum FINISHED = new JobStateEnum("FINISHED");

        private static final Map<String, JobStateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, JobStateEnum> createStaticFields() {
            Map<String, JobStateEnum> map = new HashMap<>();
            map.put("FAILED", FAILED);
            map.put("KILLED", KILLED);
            map.put("NEW", NEW);
            map.put("NEW_SAVING", NEW_SAVING);
            map.put("SUBMITTED", SUBMITTED);
            map.put("ACCEPTED", ACCEPTED);
            map.put("RUNNING", RUNNING);
            map.put("FINISHED", FINISHED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        JobStateEnum(String value) {
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
        public static JobStateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new JobStateEnum(value));
        }

        public static JobStateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof JobStateEnum) {
                return this.value.equals(((JobStateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_state")

    private JobStateEnum jobState;

    /**
     * 作业运行结果。 - FAILED：执行失败的作业。 - KILLED：执行中被手动终止的作业。 - UNDEFINED：正在执行的作业。 - SUCCEEDED：执行成功的作业。
     */
    public static final class JobResultEnum {

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final JobResultEnum FAILED = new JobResultEnum("FAILED");

        /**
         * Enum KILLED for value: "KILLED"
         */
        public static final JobResultEnum KILLED = new JobResultEnum("KILLED");

        /**
         * Enum UNDEFINED for value: "UNDEFINED"
         */
        public static final JobResultEnum UNDEFINED = new JobResultEnum("UNDEFINED");

        /**
         * Enum SUCCEEDED for value: "SUCCEEDED"
         */
        public static final JobResultEnum SUCCEEDED = new JobResultEnum("SUCCEEDED");

        private static final Map<String, JobResultEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, JobResultEnum> createStaticFields() {
            Map<String, JobResultEnum> map = new HashMap<>();
            map.put("FAILED", FAILED);
            map.put("KILLED", KILLED);
            map.put("UNDEFINED", UNDEFINED);
            map.put("SUCCEEDED", SUCCEEDED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        JobResultEnum(String value) {
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
        public static JobResultEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new JobResultEnum(value));
        }

        public static JobResultEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof JobResultEnum) {
                return this.value.equals(((JobResultEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_result")

    private JobResultEnum jobResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue")

    private String queue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private String limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private String offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_by")

    private String sortBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "submitted_time_begin")

    private Long submittedTimeBegin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "submitted_time_end")

    private Long submittedTimeEnd;

    public ShowJobExeListNewRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 集群ID。获取方法，请参见[获取集群ID](https://support.huaweicloud.com/api-mrs/mrs_02_9001.html)。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public ShowJobExeListNewRequest withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * 作业名称，只能由字母、数字、中划线和下划线组成，并且长度为1～128个字符。
     * @return jobName
     */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public ShowJobExeListNewRequest withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 作业ID，只能由字母、数字、中划线(-)组成，并且长度为1~64字符。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ShowJobExeListNewRequest withUser(String user) {
        this.user = user;
        return this;
    }

    /**
     * 用户名称、只能由字母、数字、特殊字符(-_.)组成，且不能以数字开头，并且长度为1～32字符。
     * @return user
     */
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public ShowJobExeListNewRequest withJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * 作业类型。 - MapReduce - SparkPython - SparkSubmit：SparkPython类型的作业在查询时作业类型请选择SparkSubmit。 - HiveScript - HiveSql - DistCp，导入、导出数据。 - SparkScript - SparkSql - Flink
     * @return jobType
     */
    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public ShowJobExeListNewRequest withJobState(JobStateEnum jobState) {
        this.jobState = jobState;
        return this;
    }

    /**
     * 作业运行状态。 - FAILED：失败 - KILLED：已终止 - NEW：已创建 - NEW_SAVING：已创建保存中 - SUBMITTED：已提交 - ACCEPTED：已接受 - RUNNING：运行中 - FINISHED：已完成
     * @return jobState
     */
    public JobStateEnum getJobState() {
        return jobState;
    }

    public void setJobState(JobStateEnum jobState) {
        this.jobState = jobState;
    }

    public ShowJobExeListNewRequest withJobResult(JobResultEnum jobResult) {
        this.jobResult = jobResult;
        return this;
    }

    /**
     * 作业运行结果。 - FAILED：执行失败的作业。 - KILLED：执行中被手动终止的作业。 - UNDEFINED：正在执行的作业。 - SUCCEEDED：执行成功的作业。
     * @return jobResult
     */
    public JobResultEnum getJobResult() {
        return jobResult;
    }

    public void setJobResult(JobResultEnum jobResult) {
        this.jobResult = jobResult;
    }

    public ShowJobExeListNewRequest withQueue(String queue) {
        this.queue = queue;
        return this;
    }

    /**
     * 作业的资源对列类型名称，作业的资源对列类型名称，只能由数字、字母和特殊字符(-_)组成, 并且长度为1～64字符。
     * @return queue
     */
    public String getQueue() {
        return queue;
    }

    public void setQueue(String queue) {
        this.queue = queue;
    }

    public ShowJobExeListNewRequest withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 返回结果中每页显示条数。缺省值：10
     * @return limit
     */
    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public ShowJobExeListNewRequest withOffset(String offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 表示作业列表从该偏移量开始查询。缺省值：0
     * @return offset
     */
    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public ShowJobExeListNewRequest withSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }

    /**
     * 返回结果的排序方式，默认值为desc。 - asc：按升序排列 - desc：按降序排列
     * @return sortBy
     */
    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public ShowJobExeListNewRequest withSubmittedTimeBegin(Long submittedTimeBegin) {
        this.submittedTimeBegin = submittedTimeBegin;
        return this;
    }

    /**
     * 查询该时间之后提交的作业，UTC的毫秒时间戳。例如：1562032041362。
     * @return submittedTimeBegin
     */
    public Long getSubmittedTimeBegin() {
        return submittedTimeBegin;
    }

    public void setSubmittedTimeBegin(Long submittedTimeBegin) {
        this.submittedTimeBegin = submittedTimeBegin;
    }

    public ShowJobExeListNewRequest withSubmittedTimeEnd(Long submittedTimeEnd) {
        this.submittedTimeEnd = submittedTimeEnd;
        return this;
    }

    /**
     * 查询该时间之前提交的作业UTC的毫秒时间戳。例如：1562032041362。
     * @return submittedTimeEnd
     */
    public Long getSubmittedTimeEnd() {
        return submittedTimeEnd;
    }

    public void setSubmittedTimeEnd(Long submittedTimeEnd) {
        this.submittedTimeEnd = submittedTimeEnd;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowJobExeListNewRequest that = (ShowJobExeListNewRequest) obj;
        return Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.jobName, that.jobName)
            && Objects.equals(this.jobId, that.jobId) && Objects.equals(this.user, that.user)
            && Objects.equals(this.jobType, that.jobType) && Objects.equals(this.jobState, that.jobState)
            && Objects.equals(this.jobResult, that.jobResult) && Objects.equals(this.queue, that.queue)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.sortBy, that.sortBy)
            && Objects.equals(this.submittedTimeBegin, that.submittedTimeBegin)
            && Objects.equals(this.submittedTimeEnd, that.submittedTimeEnd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId,
            jobName,
            jobId,
            user,
            jobType,
            jobState,
            jobResult,
            queue,
            limit,
            offset,
            sortBy,
            submittedTimeBegin,
            submittedTimeEnd);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowJobExeListNewRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    jobState: ").append(toIndentedString(jobState)).append("\n");
        sb.append("    jobResult: ").append(toIndentedString(jobResult)).append("\n");
        sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
        sb.append("    submittedTimeBegin: ").append(toIndentedString(submittedTimeBegin)).append("\n");
        sb.append("    submittedTimeEnd: ").append(toIndentedString(submittedTimeEnd)).append("\n");
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
