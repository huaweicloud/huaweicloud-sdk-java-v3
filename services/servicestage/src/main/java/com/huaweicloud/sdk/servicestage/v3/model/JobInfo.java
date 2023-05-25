package com.huaweicloud.sdk.servicestage.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * JobInfo
 */
public class JobInfo {

    /**
     * Gets or Sets executionStatus
     */
    public static final class ExecutionStatusEnum {

        /**
         * Enum RUNNING for value: "RUNNING"
         */
        public static final ExecutionStatusEnum RUNNING = new ExecutionStatusEnum("RUNNING");

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final ExecutionStatusEnum FAILED = new ExecutionStatusEnum("FAILED");

        /**
         * Enum SUCCEEDED for value: "SUCCEEDED"
         */
        public static final ExecutionStatusEnum SUCCEEDED = new ExecutionStatusEnum("SUCCEEDED");

        private static final Map<String, ExecutionStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ExecutionStatusEnum> createStaticFields() {
            Map<String, ExecutionStatusEnum> map = new HashMap<>();
            map.put("RUNNING", RUNNING);
            map.put("FAILED", FAILED);
            map.put("SUCCEEDED", SUCCEEDED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ExecutionStatusEnum(String value) {
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
        public static ExecutionStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ExecutionStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ExecutionStatusEnum(value);
            }
            return result;
        }

        public static ExecutionStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ExecutionStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ExecutionStatusEnum) {
                return this.value.equals(((ExecutionStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_status")

    private ExecutionStatusEnum executionStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_type")

    private String jobType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rollback_enabled")

    private Boolean rollbackEnabled;

    public JobInfo withExecutionStatus(ExecutionStatusEnum executionStatus) {
        this.executionStatus = executionStatus;
        return this;
    }

    /**
     * Get executionStatus
     * @return executionStatus
     */
    public ExecutionStatusEnum getExecutionStatus() {
        return executionStatus;
    }

    public void setExecutionStatus(ExecutionStatusEnum executionStatus) {
        this.executionStatus = executionStatus;
    }

    public JobInfo withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * Get jobId
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public JobInfo withJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * Get jobType
     * @return jobType
     */
    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public JobInfo withRollbackEnabled(Boolean rollbackEnabled) {
        this.rollbackEnabled = rollbackEnabled;
        return this;
    }

    /**
     * Get rollbackEnabled
     * @return rollbackEnabled
     */
    public Boolean getRollbackEnabled() {
        return rollbackEnabled;
    }

    public void setRollbackEnabled(Boolean rollbackEnabled) {
        this.rollbackEnabled = rollbackEnabled;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JobInfo jobInfo = (JobInfo) o;
        return Objects.equals(this.executionStatus, jobInfo.executionStatus)
            && Objects.equals(this.jobId, jobInfo.jobId) && Objects.equals(this.jobType, jobInfo.jobType)
            && Objects.equals(this.rollbackEnabled, jobInfo.rollbackEnabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(executionStatus, jobId, jobType, rollbackEnabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobInfo {\n");
        sb.append("    executionStatus: ").append(toIndentedString(executionStatus)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    rollbackEnabled: ").append(toIndentedString(rollbackEnabled)).append("\n");
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
