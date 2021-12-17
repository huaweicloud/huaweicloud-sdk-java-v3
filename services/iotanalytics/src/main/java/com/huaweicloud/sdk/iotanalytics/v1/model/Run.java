package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/** Run */
public class Run {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "run_id")

    private String runId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_name")

    private String jobName;

    /** 作业类型。 */
    public static final class JobTypeEnum {

        /** Enum SQLJOB for value: "SqlJob" */
        public static final JobTypeEnum SQLJOB = new JobTypeEnum("SqlJob");

        private static final Map<String, JobTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, JobTypeEnum> createStaticFields() {
            Map<String, JobTypeEnum> map = new HashMap<>();
            map.put("SqlJob", SQLJOB);
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
            JobTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new JobTypeEnum(value);
            }
            return result;
        }

        public static JobTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            JobTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Long duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_schedule_job")

    private Boolean isScheduleJob;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "computing_resource_name")

    private String computingResourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_job")

    private SqlJobRun sqlJob;

    public Run withRunId(String runId) {
        this.runId = runId;
        return this;
    }

    /** 作业运行ID。
     * 
     * @return runId */
    public String getRunId() {
        return runId;
    }

    public void setRunId(String runId) {
        this.runId = runId;
    }

    public Run withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /** 作业ID。
     * 
     * @return jobId */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public Run withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /** 作业名称。
     * 
     * @return jobName */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public Run withJobType(JobTypeEnum jobType) {
        this.jobType = jobType;
        return this;
    }

    /** 作业类型。
     * 
     * @return jobType */
    public JobTypeEnum getJobType() {
        return jobType;
    }

    public void setJobType(JobTypeEnum jobType) {
        this.jobType = jobType;
    }

    public Run withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /** 作业开始的时间。时间格式为ISO日期时间格式yyyy-MM-dd'T'HH:mm:ss'Z'
     * 
     * @return startTime */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public Run withDuration(Long duration) {
        this.duration = duration;
        return this;
    }

    /** 作业运行时长，单位毫秒。
     * 
     * @return duration */
    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public Run withStatus(String status) {
        this.status = status;
        return this;
    }

    /** 此作业的当前状态，包含提交（LAUNCHING）、运行中（RUNNING）、完成（FINISHED）、失败（FAILED）、取消（CANCELLED）。
     * 
     * @return status */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Run withIsScheduleJob(Boolean isScheduleJob) {
        this.isScheduleJob = isScheduleJob;
        return this;
    }

    /** 是否定时作业。
     * 
     * @return isScheduleJob */
    public Boolean getIsScheduleJob() {
        return isScheduleJob;
    }

    public void setIsScheduleJob(Boolean isScheduleJob) {
        this.isScheduleJob = isScheduleJob;
    }

    public Run withComputingResourceName(String computingResourceName) {
        this.computingResourceName = computingResourceName;
        return this;
    }

    /** 计算资源名称。
     * 
     * @return computingResourceName */
    public String getComputingResourceName() {
        return computingResourceName;
    }

    public void setComputingResourceName(String computingResourceName) {
        this.computingResourceName = computingResourceName;
    }

    public Run withSqlJob(SqlJobRun sqlJob) {
        this.sqlJob = sqlJob;
        return this;
    }

    public Run withSqlJob(Consumer<SqlJobRun> sqlJobSetter) {
        if (this.sqlJob == null) {
            this.sqlJob = new SqlJobRun();
            sqlJobSetter.accept(this.sqlJob);
        }

        return this;
    }

    /** Get sqlJob
     * 
     * @return sqlJob */
    public SqlJobRun getSqlJob() {
        return sqlJob;
    }

    public void setSqlJob(SqlJobRun sqlJob) {
        this.sqlJob = sqlJob;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Run run = (Run) o;
        return Objects.equals(this.runId, run.runId) && Objects.equals(this.jobId, run.jobId)
            && Objects.equals(this.jobName, run.jobName) && Objects.equals(this.jobType, run.jobType)
            && Objects.equals(this.startTime, run.startTime) && Objects.equals(this.duration, run.duration)
            && Objects.equals(this.status, run.status) && Objects.equals(this.isScheduleJob, run.isScheduleJob)
            && Objects.equals(this.computingResourceName, run.computingResourceName)
            && Objects.equals(this.sqlJob, run.sqlJob);
    }

    @Override
    public int hashCode() {
        return Objects.hash(runId,
            jobId,
            jobName,
            jobType,
            startTime,
            duration,
            status,
            isScheduleJob,
            computingResourceName,
            sqlJob);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Run {\n");
        sb.append("    runId: ").append(toIndentedString(runId)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    isScheduleJob: ").append(toIndentedString(isScheduleJob)).append("\n");
        sb.append("    computingResourceName: ").append(toIndentedString(computingResourceName)).append("\n");
        sb.append("    sqlJob: ").append(toIndentedString(sqlJob)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
