package com.huaweicloud.sdk.aidatalakejobserver.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查看Spark作业的响应参数。
 */
public class ListSparkJobResponseDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_token")

    private String clientToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_name")

    private String endpointName;

    /**
     * **参数解释**：作业类型，用于标识作业的类型。 **取值范围**： - spark_jar_job：Spark jar作业。 - spark_python_job：Python Spark作业。 - spark_sql_scripting_job：SQL脚本作业（预留类型）。
     */
    public static final class JobTypeEnum {

        /**
         * Enum SPARK_JAR_JOB for value: "spark_jar_job"
         */
        public static final JobTypeEnum SPARK_JAR_JOB = new JobTypeEnum("spark_jar_job");

        /**
         * Enum SPARK_PYTHON_JOB for value: "spark_python_job"
         */
        public static final JobTypeEnum SPARK_PYTHON_JOB = new JobTypeEnum("spark_python_job");

        /**
         * Enum SPARK_SQL_SCRIPTING_JOB for value: "spark_sql_scripting_job"
         */
        public static final JobTypeEnum SPARK_SQL_SCRIPTING_JOB = new JobTypeEnum("spark_sql_scripting_job");

        private static final Map<String, JobTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, JobTypeEnum> createStaticFields() {
            Map<String, JobTypeEnum> map = new HashMap<>();
            map.put("spark_jar_job", SPARK_JAR_JOB);
            map.put("spark_python_job", SPARK_PYTHON_JOB);
            map.put("spark_sql_scripting_job", SPARK_SQL_SCRIPTING_JOB);
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
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state_message")

    private String stateMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retry_times")

    private Integer retryTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_user")

    private SparkCreateUser createUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_url")

    private String logUrl;

    public ListSparkJobResponseDto withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * **参数解释**：Spark作业ID，用于唯一标识该作业。 **取值范围**：采用UUID格式，长度为36个字符，例如：80ceaaff-3cfc-4162-a56f-70031ea4fa91。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ListSparkJobResponseDto withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * **参数解释**：Spark作业事务ID，用于防止重复提交。 **取值范围**：采用UUID格式，长度为36个字符，例如：xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx。
     * @return clientToken
     */
    public String getClientToken() {
        return clientToken;
    }

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    public ListSparkJobResponseDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：Spark作业名称，用于标识作业。 **取值范围**：长度为1~128个字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListSparkJobResponseDto withEndpointName(String endpointName) {
        this.endpointName = endpointName;
        return this;
    }

    /**
     * **参数解释**：端点名称，用于指定Spark作业执行环境。 **取值范围**：只能由英文小写字母、数字及中划线组成，以英文小写字母开头，以英文小写字母或数字结尾，且长度为1~63个字符。
     * @return endpointName
     */
    public String getEndpointName() {
        return endpointName;
    }

    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    public ListSparkJobResponseDto withJobType(JobTypeEnum jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * **参数解释**：作业类型，用于标识作业的类型。 **取值范围**： - spark_jar_job：Spark jar作业。 - spark_python_job：Python Spark作业。 - spark_sql_scripting_job：SQL脚本作业（预留类型）。
     * @return jobType
     */
    public JobTypeEnum getJobType() {
        return jobType;
    }

    public void setJobType(JobTypeEnum jobType) {
        this.jobType = jobType;
    }

    public ListSparkJobResponseDto withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * **参数解释**：Spark作业状态，用于标识作业当前执行状态。 **取值范围**： - PENDING：启动中。 - QUEUED：排队中。 - RUNNING：运行中。 - CANCELING：取消中。 - CANCELED：已取消。 - FAILED：运行失败。 - SUCCEED：运行成功。 - QUEUED_TIMEOUT：排队超时。 - RUNNING_TIMEOUT：运行超时。
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public ListSparkJobResponseDto withStateMessage(String stateMessage) {
        this.stateMessage = stateMessage;
        return this;
    }

    /**
     * **参数解释**：作业状态消息，当作业异常结束时显示相关信息。 **取值范围**：长度为0~512个字符。
     * @return stateMessage
     */
    public String getStateMessage() {
        return stateMessage;
    }

    public void setStateMessage(String stateMessage) {
        this.stateMessage = stateMessage;
    }

    public ListSparkJobResponseDto withRetryTimes(Integer retryTimes) {
        this.retryTimes = retryTimes;
        return this;
    }

    /**
     * **参数解释**：作业重试次数，用于记录作业失败后的重试次数。 **取值范围**：最小值为0。
     * @return retryTimes
     */
    public Integer getRetryTimes() {
        return retryTimes;
    }

    public void setRetryTimes(Integer retryTimes) {
        this.retryTimes = retryTimes;
    }

    public ListSparkJobResponseDto withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释**：作业创建时间，用于记录作业提交时间。 **取值范围**：unix时间戳，单位为毫秒。
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ListSparkJobResponseDto withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释**：作业开始运行时间，用于记录作业实际开始执行的时间。 **取值范围**：unix时间戳，单位为毫秒。
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ListSparkJobResponseDto withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释**：作业结束时间，用于记录作业执行完成的时间。 **取值范围**：unix时间戳，单位为毫秒。
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public ListSparkJobResponseDto withCreateUser(SparkCreateUser createUser) {
        this.createUser = createUser;
        return this;
    }

    public ListSparkJobResponseDto withCreateUser(Consumer<SparkCreateUser> createUserSetter) {
        if (this.createUser == null) {
            this.createUser = new SparkCreateUser();
            createUserSetter.accept(this.createUser);
        }

        return this;
    }

    /**
     * Get createUser
     * @return createUser
     */
    public SparkCreateUser getCreateUser() {
        return createUser;
    }

    public void setCreateUser(SparkCreateUser createUser) {
        this.createUser = createUser;
    }

    public ListSparkJobResponseDto withLogUrl(String logUrl) {
        this.logUrl = logUrl;
        return this;
    }

    /**
     * **参数解释**：日志归档路径OBS URL，用于查看作业执行日志。 **取值范围**：OBS URL格式，长度为1~1024个字符。
     * @return logUrl
     */
    public String getLogUrl() {
        return logUrl;
    }

    public void setLogUrl(String logUrl) {
        this.logUrl = logUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSparkJobResponseDto that = (ListSparkJobResponseDto) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.clientToken, that.clientToken)
            && Objects.equals(this.name, that.name) && Objects.equals(this.endpointName, that.endpointName)
            && Objects.equals(this.jobType, that.jobType) && Objects.equals(this.state, that.state)
            && Objects.equals(this.stateMessage, that.stateMessage) && Objects.equals(this.retryTimes, that.retryTimes)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.createUser, that.createUser)
            && Objects.equals(this.logUrl, that.logUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId,
            clientToken,
            name,
            endpointName,
            jobType,
            state,
            stateMessage,
            retryTimes,
            createTime,
            startTime,
            endTime,
            createUser,
            logUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSparkJobResponseDto {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    clientToken: ").append(toIndentedString(clientToken)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    endpointName: ").append(toIndentedString(endpointName)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    stateMessage: ").append(toIndentedString(stateMessage)).append("\n");
        sb.append("    retryTimes: ").append(toIndentedString(retryTimes)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    createUser: ").append(toIndentedString(createUser)).append("\n");
        sb.append("    logUrl: ").append(toIndentedString(logUrl)).append("\n");
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
