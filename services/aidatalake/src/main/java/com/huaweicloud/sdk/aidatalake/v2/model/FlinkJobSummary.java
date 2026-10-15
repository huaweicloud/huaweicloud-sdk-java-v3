package com.huaweicloud.sdk.aidatalake.v2.model;

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
 * **参数解释**：Flink作业摘要信息（列表展示）。 
 */
public class FlinkJobSummary {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_id")

    private String endpointId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_name")

    private String endpointName;

    /**
     * **参数解释**：作业类型。 **取值范围**：   - FLINK_JAR_JOB：JAR作业。   - FLINK_SQL_JOB：SQL作业。   - FLINK_SQL_GATEWAY：SQL Gateway作业。 
     */
    public static final class JobTypeEnum {

        /**
         * Enum FLINK_JAR_JOB for value: "FLINK_JAR_JOB"
         */
        public static final JobTypeEnum FLINK_JAR_JOB = new JobTypeEnum("FLINK_JAR_JOB");

        /**
         * Enum FLINK_SQL_JOB for value: "FLINK_SQL_JOB"
         */
        public static final JobTypeEnum FLINK_SQL_JOB = new JobTypeEnum("FLINK_SQL_JOB");

        /**
         * Enum FLINK_SQL_GATEWAY for value: "FLINK_SQL_GATEWAY"
         */
        public static final JobTypeEnum FLINK_SQL_GATEWAY = new JobTypeEnum("FLINK_SQL_GATEWAY");

        private static final Map<String, JobTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, JobTypeEnum> createStaticFields() {
            Map<String, JobTypeEnum> map = new HashMap<>();
            map.put("FLINK_JAR_JOB", FLINK_JAR_JOB);
            map.put("FLINK_SQL_JOB", FLINK_SQL_JOB);
            map.put("FLINK_SQL_GATEWAY", FLINK_SQL_GATEWAY);
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
    @JsonProperty(value = "status")

    private FlinkJobStatus status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_mode")

    private FlinkJobExecutionMode executionMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric")

    private FlinkResourceMetric metric;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_user")

    private FlinkCreateUser createUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_user")

    private FlinkUpdateUser updateUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_url")

    private String logUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    public FlinkJobSummary withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * **参数解释**：Flink作业ID。 **取值范围**：UUIDv7格式，固定36位，由英文小写字母、数字及中划线组成。 
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public FlinkJobSummary withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：作业名称。 **取值范围**：1~128个字符，以字母或数字开头和结尾，中间可包含字母、数字、下划线和中划线。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FlinkJobSummary withEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }

    /**
     * **参数解释**：作业运行的端点ID。 **取值范围**：采用UUID格式，固定36个字符。 
     * @return endpointId
     */
    public String getEndpointId() {
        return endpointId;
    }

    public void setEndpointId(String endpointId) {
        this.endpointId = endpointId;
    }

    public FlinkJobSummary withEndpointName(String endpointName) {
        this.endpointName = endpointName;
        return this;
    }

    /**
     * **参数解释**：作业运行的端点名称。 **取值范围**：只能由英文小写字母、数字及中划线组成，以英文小写字母开头，以英文小写字母或数字结尾，且长度为1~63个字符。 
     * @return endpointName
     */
    public String getEndpointName() {
        return endpointName;
    }

    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    public FlinkJobSummary withJobType(JobTypeEnum jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * **参数解释**：作业类型。 **取值范围**：   - FLINK_JAR_JOB：JAR作业。   - FLINK_SQL_JOB：SQL作业。   - FLINK_SQL_GATEWAY：SQL Gateway作业。 
     * @return jobType
     */
    public JobTypeEnum getJobType() {
        return jobType;
    }

    public void setJobType(JobTypeEnum jobType) {
        this.jobType = jobType;
    }

    public FlinkJobSummary withStatus(FlinkJobStatus status) {
        this.status = status;
        return this;
    }

    public FlinkJobSummary withStatus(Consumer<FlinkJobStatus> statusSetter) {
        if (this.status == null) {
            this.status = new FlinkJobStatus();
            statusSetter.accept(this.status);
        }

        return this;
    }

    /**
     * Get status
     * @return status
     */
    public FlinkJobStatus getStatus() {
        return status;
    }

    public void setStatus(FlinkJobStatus status) {
        this.status = status;
    }

    public FlinkJobSummary withExecutionMode(FlinkJobExecutionMode executionMode) {
        this.executionMode = executionMode;
        return this;
    }

    /**
     * Get executionMode
     * @return executionMode
     */
    public FlinkJobExecutionMode getExecutionMode() {
        return executionMode;
    }

    public void setExecutionMode(FlinkJobExecutionMode executionMode) {
        this.executionMode = executionMode;
    }

    public FlinkJobSummary withMetric(FlinkResourceMetric metric) {
        this.metric = metric;
        return this;
    }

    public FlinkJobSummary withMetric(Consumer<FlinkResourceMetric> metricSetter) {
        if (this.metric == null) {
            this.metric = new FlinkResourceMetric();
            metricSetter.accept(this.metric);
        }

        return this;
    }

    /**
     * Get metric
     * @return metric
     */
    public FlinkResourceMetric getMetric() {
        return metric;
    }

    public void setMetric(FlinkResourceMetric metric) {
        this.metric = metric;
    }

    public FlinkJobSummary withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释**：创建时间戳。 **取值范围**：0~4102416000000，13位毫秒时间戳。 
     * minimum: 0
     * maximum: 4102416000000
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public FlinkJobSummary withCreateUser(FlinkCreateUser createUser) {
        this.createUser = createUser;
        return this;
    }

    public FlinkJobSummary withCreateUser(Consumer<FlinkCreateUser> createUserSetter) {
        if (this.createUser == null) {
            this.createUser = new FlinkCreateUser();
            createUserSetter.accept(this.createUser);
        }

        return this;
    }

    /**
     * Get createUser
     * @return createUser
     */
    public FlinkCreateUser getCreateUser() {
        return createUser;
    }

    public void setCreateUser(FlinkCreateUser createUser) {
        this.createUser = createUser;
    }

    public FlinkJobSummary withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * **参数解释**：更新时间戳。 **取值范围**：0~4102416000000，13位毫秒时间戳。 
     * minimum: 0
     * maximum: 4102416000000
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public FlinkJobSummary withUpdateUser(FlinkUpdateUser updateUser) {
        this.updateUser = updateUser;
        return this;
    }

    public FlinkJobSummary withUpdateUser(Consumer<FlinkUpdateUser> updateUserSetter) {
        if (this.updateUser == null) {
            this.updateUser = new FlinkUpdateUser();
            updateUserSetter.accept(this.updateUser);
        }

        return this;
    }

    /**
     * Get updateUser
     * @return updateUser
     */
    public FlinkUpdateUser getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(FlinkUpdateUser updateUser) {
        this.updateUser = updateUser;
    }

    public FlinkJobSummary withLogUrl(String logUrl) {
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

    public FlinkJobSummary withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**：作业描述信息。 **取值范围**：1~512个字符。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public FlinkJobSummary withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释**：作业开始运行的时间戳（进入RUNNING状态的时间）。 **取值范围**：0 ~ 4102416000000，13位毫秒时间戳。 
     * minimum: 0
     * maximum: 4102416000000
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public FlinkJobSummary withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释**：作业结束时间戳（进入终态 FINISHED/CANCELLED/FAILED的时间）。 **取值范围**：0 ~ 4102416000000，13位毫秒时间戳。 
     * minimum: 0
     * maximum: 4102416000000
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FlinkJobSummary that = (FlinkJobSummary) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.endpointId, that.endpointId) && Objects.equals(this.endpointName, that.endpointName)
            && Objects.equals(this.jobType, that.jobType) && Objects.equals(this.status, that.status)
            && Objects.equals(this.executionMode, that.executionMode) && Objects.equals(this.metric, that.metric)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.createUser, that.createUser)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.updateUser, that.updateUser)
            && Objects.equals(this.logUrl, that.logUrl) && Objects.equals(this.description, that.description)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId,
            name,
            endpointId,
            endpointName,
            jobType,
            status,
            executionMode,
            metric,
            createTime,
            createUser,
            updateTime,
            updateUser,
            logUrl,
            description,
            startTime,
            endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlinkJobSummary {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    endpointId: ").append(toIndentedString(endpointId)).append("\n");
        sb.append("    endpointName: ").append(toIndentedString(endpointName)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    executionMode: ").append(toIndentedString(executionMode)).append("\n");
        sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    createUser: ").append(toIndentedString(createUser)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    updateUser: ").append(toIndentedString(updateUser)).append("\n");
        sb.append("    logUrl: ").append(toIndentedString(logUrl)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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
