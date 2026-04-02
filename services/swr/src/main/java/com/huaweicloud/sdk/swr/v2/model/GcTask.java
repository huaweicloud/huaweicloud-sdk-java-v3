package com.huaweicloud.sdk.swr.v2.model;

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
 * GcTask
 */
public class GcTask {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_name")

    private String jobName;

    /**
     * 任务类型，MANUAL：手动执行，SCHEDULE：定时执行。
     */
    public static final class JobKindEnum {

        /**
         * Enum MANUAL for value: "MANUAL"
         */
        public static final JobKindEnum MANUAL = new JobKindEnum("MANUAL");

        /**
         * Enum SCHEDULE for value: "SCHEDULE"
         */
        public static final JobKindEnum SCHEDULE = new JobKindEnum("SCHEDULE");

        private static final Map<String, JobKindEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, JobKindEnum> createStaticFields() {
            Map<String, JobKindEnum> map = new HashMap<>();
            map.put("MANUAL", MANUAL);
            map.put("SCHEDULE", SCHEDULE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        JobKindEnum(String value) {
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
        public static JobKindEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new JobKindEnum(value));
        }

        public static JobKindEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof JobKindEnum) {
                return this.value.equals(((JobKindEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_kind")

    private JobKindEnum jobKind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_parameters")

    private JobParameters jobParameters;

    /**
     * gc任务的状态，Success：已完成，Stopped：已停止，Running：清理中，Pending：排队中，Error：失败。
     */
    public static final class JobStatusEnum {

        /**
         * Enum SUCCESS for value: "Success"
         */
        public static final JobStatusEnum SUCCESS = new JobStatusEnum("Success");

        /**
         * Enum STOPPED for value: "Stopped"
         */
        public static final JobStatusEnum STOPPED = new JobStatusEnum("Stopped");

        /**
         * Enum RUNNING for value: "Running"
         */
        public static final JobStatusEnum RUNNING = new JobStatusEnum("Running");

        /**
         * Enum PENDING for value: "Pending"
         */
        public static final JobStatusEnum PENDING = new JobStatusEnum("Pending");

        /**
         * Enum ERROR for value: "Error"
         */
        public static final JobStatusEnum ERROR = new JobStatusEnum("Error");

        private static final Map<String, JobStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, JobStatusEnum> createStaticFields() {
            Map<String, JobStatusEnum> map = new HashMap<>();
            map.put("Success", SUCCESS);
            map.put("Stopped", STOPPED);
            map.put("Running", RUNNING);
            map.put("Pending", PENDING);
            map.put("Error", ERROR);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        JobStatusEnum(String value) {
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
        public static JobStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new JobStatusEnum(value));
        }

        public static JobStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof JobStatusEnum) {
                return this.value.equals(((JobStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_status")

    private JobStatusEnum jobStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creation_time")

    private String creationTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    public GcTask withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * gc任务的ID。
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public GcTask withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * gc任务的名称。
     * @return jobName
     */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public GcTask withJobKind(JobKindEnum jobKind) {
        this.jobKind = jobKind;
        return this;
    }

    /**
     * 任务类型，MANUAL：手动执行，SCHEDULE：定时执行。
     * @return jobKind
     */
    public JobKindEnum getJobKind() {
        return jobKind;
    }

    public void setJobKind(JobKindEnum jobKind) {
        this.jobKind = jobKind;
    }

    public GcTask withJobParameters(JobParameters jobParameters) {
        this.jobParameters = jobParameters;
        return this;
    }

    public GcTask withJobParameters(Consumer<JobParameters> jobParametersSetter) {
        if (this.jobParameters == null) {
            this.jobParameters = new JobParameters();
            jobParametersSetter.accept(this.jobParameters);
        }

        return this;
    }

    /**
     * Get jobParameters
     * @return jobParameters
     */
    public JobParameters getJobParameters() {
        return jobParameters;
    }

    public void setJobParameters(JobParameters jobParameters) {
        this.jobParameters = jobParameters;
    }

    public GcTask withJobStatus(JobStatusEnum jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }

    /**
     * gc任务的状态，Success：已完成，Stopped：已停止，Running：清理中，Pending：排队中，Error：失败。
     * @return jobStatus
     */
    public JobStatusEnum getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(JobStatusEnum jobStatus) {
        this.jobStatus = jobStatus;
    }

    public GcTask withCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * gc任务的创建时间。
     * @return creationTime
     */
    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public GcTask withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * gc任务的更新时间。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GcTask that = (GcTask) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.jobName, that.jobName)
            && Objects.equals(this.jobKind, that.jobKind) && Objects.equals(this.jobParameters, that.jobParameters)
            && Objects.equals(this.jobStatus, that.jobStatus) && Objects.equals(this.creationTime, that.creationTime)
            && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, jobName, jobKind, jobParameters, jobStatus, creationTime, updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GcTask {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    jobKind: ").append(toIndentedString(jobKind)).append("\n");
        sb.append("    jobParameters: ").append(toIndentedString(jobParameters)).append("\n");
        sb.append("    jobStatus: ").append(toIndentedString(jobStatus)).append("\n");
        sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
