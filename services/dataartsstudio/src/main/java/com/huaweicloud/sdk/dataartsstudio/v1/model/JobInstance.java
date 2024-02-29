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
 * 作业实例信息
 */
public class JobInstance {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_name")

    private String jobName;

    /**
     * 实例运行状态： - waiting：等待运行 - running：运行中 - success：运行成功 - fail： 运行失败 - running-exception：运行异常 - pause： 暂停 - manual-stop：取消 - skip-by-depend：跳过 - freeze：冻结
     */
    public static final class StatusEnum {

        /**
         * Enum WAITING for value: "waiting"
         */
        public static final StatusEnum WAITING = new StatusEnum("waiting");

        /**
         * Enum RUNNING for value: "running"
         */
        public static final StatusEnum RUNNING = new StatusEnum("running");

        /**
         * Enum SUCCESS for value: "success"
         */
        public static final StatusEnum SUCCESS = new StatusEnum("success");

        /**
         * Enum FAIL for value: "fail"
         */
        public static final StatusEnum FAIL = new StatusEnum("fail");

        /**
         * Enum RUNNING_EXCEPTION for value: "running-exception"
         */
        public static final StatusEnum RUNNING_EXCEPTION = new StatusEnum("running-exception");

        /**
         * Enum PAUSE for value: "pause"
         */
        public static final StatusEnum PAUSE = new StatusEnum("pause");

        /**
         * Enum MANUAL_STOP for value: "manual-stop"
         */
        public static final StatusEnum MANUAL_STOP = new StatusEnum("manual-stop");

        /**
         * Enum SKIP_BY_DEPEND for value: "skip-by-depend"
         */
        public static final StatusEnum SKIP_BY_DEPEND = new StatusEnum("skip-by-depend");

        /**
         * Enum FREEZE for value: "freeze"
         */
        public static final StatusEnum FREEZE = new StatusEnum("freeze");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("waiting", WAITING);
            map.put("running", RUNNING);
            map.put("success", SUCCESS);
            map.put("fail", FAIL);
            map.put("running-exception", RUNNING_EXCEPTION);
            map.put("pause", PAUSE);
            map.put("manual-stop", MANUAL_STOP);
            map.put("skip-by-depend", SKIP_BY_DEPEND);
            map.put("freeze", FREEZE);
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
    @JsonProperty(value = "job_instance_name")

    private String jobInstanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_time")

    private Long planTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_time")

    private Long executeTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private Long instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_type")

    private Integer instanceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "submit_time")

    private Long submitTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private Long jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private Integer version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "force_success")

    private Boolean forceSuccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ignore_success")

    private Boolean ignoreSuccess;

    public JobInstance withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * 作业名称。如果要查询指定批处理作业的实例列表，jobName就是批处理作业名。如果要查询实时作业下某个节点关联的子作业，jobName格式为[实时作业名称]_[节点名称]。
     * @return jobName
     */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public JobInstance withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 实例运行状态： - waiting：等待运行 - running：运行中 - success：运行成功 - fail： 运行失败 - running-exception：运行异常 - pause： 暂停 - manual-stop：取消 - skip-by-depend：跳过 - freeze：冻结
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public JobInstance withJobInstanceName(String jobInstanceName) {
        this.jobInstanceName = jobInstanceName;
        return this;
    }

    /**
     * 作业实例运行时日志记录的实例名称, 非作业定义的名称
     * @return jobInstanceName
     */
    public String getJobInstanceName() {
        return jobInstanceName;
    }

    public void setJobInstanceName(String jobInstanceName) {
        this.jobInstanceName = jobInstanceName;
    }

    public JobInstance withPlanTime(Long planTime) {
        this.planTime = planTime;
        return this;
    }

    /**
     * 作业实例计划执行时间
     * @return planTime
     */
    public Long getPlanTime() {
        return planTime;
    }

    public void setPlanTime(Long planTime) {
        this.planTime = planTime;
    }

    public JobInstance withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 作业实例实际执行开始时间
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public JobInstance withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 作业实例实际执行结束时间
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public JobInstance withExecuteTime(Long executeTime) {
        this.executeTime = executeTime;
        return this;
    }

    /**
     * 执行耗时，单位：毫秒
     * @return executeTime
     */
    public Long getExecuteTime() {
        return executeTime;
    }

    public void setExecuteTime(Long executeTime) {
        this.executeTime = executeTime;
    }

    public JobInstance withInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 作业实例id
     * @return instanceId
     */
    public Long getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
    }

    public JobInstance withInstanceType(Integer instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * 作业实例类型
     * @return instanceType
     */
    public Integer getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(Integer instanceType) {
        this.instanceType = instanceType;
    }

    public JobInstance withSubmitTime(Long submitTime) {
        this.submitTime = submitTime;
        return this;
    }

    /**
     * 作业提交运行时间
     * @return submitTime
     */
    public Long getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Long submitTime) {
        this.submitTime = submitTime;
    }

    public JobInstance withJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 作业id
     * @return jobId
     */
    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public JobInstance withVersion(Integer version) {
        this.version = version;
        return this;
    }

    /**
     * 作业实例版本
     * @return version
     */
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public JobInstance withForceSuccess(Boolean forceSuccess) {
        this.forceSuccess = forceSuccess;
        return this;
    }

    /**
     * 作业实例状态筛选为强制成功
     * @return forceSuccess
     */
    public Boolean getForceSuccess() {
        return forceSuccess;
    }

    public void setForceSuccess(Boolean forceSuccess) {
        this.forceSuccess = forceSuccess;
    }

    public JobInstance withIgnoreSuccess(Boolean ignoreSuccess) {
        this.ignoreSuccess = ignoreSuccess;
        return this;
    }

    /**
     * 作业实例状态筛选为忽略失败
     * @return ignoreSuccess
     */
    public Boolean getIgnoreSuccess() {
        return ignoreSuccess;
    }

    public void setIgnoreSuccess(Boolean ignoreSuccess) {
        this.ignoreSuccess = ignoreSuccess;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobInstance that = (JobInstance) obj;
        return Objects.equals(this.jobName, that.jobName) && Objects.equals(this.status, that.status)
            && Objects.equals(this.jobInstanceName, that.jobInstanceName)
            && Objects.equals(this.planTime, that.planTime) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.executeTime, that.executeTime)
            && Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.instanceType, that.instanceType)
            && Objects.equals(this.submitTime, that.submitTime) && Objects.equals(this.jobId, that.jobId)
            && Objects.equals(this.version, that.version) && Objects.equals(this.forceSuccess, that.forceSuccess)
            && Objects.equals(this.ignoreSuccess, that.ignoreSuccess);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobName,
            status,
            jobInstanceName,
            planTime,
            startTime,
            endTime,
            executeTime,
            instanceId,
            instanceType,
            submitTime,
            jobId,
            version,
            forceSuccess,
            ignoreSuccess);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobInstance {\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    jobInstanceName: ").append(toIndentedString(jobInstanceName)).append("\n");
        sb.append("    planTime: ").append(toIndentedString(planTime)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    executeTime: ").append(toIndentedString(executeTime)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
        sb.append("    submitTime: ").append(toIndentedString(submitTime)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    forceSuccess: ").append(toIndentedString(forceSuccess)).append("\n");
        sb.append("    ignoreSuccess: ").append(toIndentedString(ignoreSuccess)).append("\n");
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
