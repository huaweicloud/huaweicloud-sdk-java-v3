package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 子任务
 */
public class SubJob {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    /**
     * 任务类型
     */
    public static final class JobTypeEnum {

        /**
         * Enum PREPARE_RESOURCE for value: "prepare_resource"
         */
        public static final JobTypeEnum PREPARE_RESOURCE = new JobTypeEnum("prepare_resource");

        /**
         * Enum UPGRADE_WORKER_1 for value: "upgrade_worker_1"
         */
        public static final JobTypeEnum UPGRADE_WORKER_1 = new JobTypeEnum("upgrade_worker_1");

        /**
         * Enum UPGRADE_WORKER_2 for value: "upgrade_worker_2"
         */
        public static final JobTypeEnum UPGRADE_WORKER_2 = new JobTypeEnum("upgrade_worker_2");

        private static final Map<String, JobTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, JobTypeEnum> createStaticFields() {
            Map<String, JobTypeEnum> map = new HashMap<>();
            map.put("prepare_resource", PREPARE_RESOURCE);
            map.put("upgrade_worker_1", UPGRADE_WORKER_1);
            map.put("upgrade_worker_2", UPGRADE_WORKER_2);
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

    /**
     * 任务状态
     */
    public static final class StatusEnum {

        /**
         * Enum INIT for value: "init"
         */
        public static final StatusEnum INIT = new StatusEnum("init");

        /**
         * Enum UPGRADING for value: "upgrading"
         */
        public static final StatusEnum UPGRADING = new StatusEnum("upgrading");

        /**
         * Enum SUCCESS for value: "success"
         */
        public static final StatusEnum SUCCESS = new StatusEnum("success");

        /**
         * Enum FAIL for value: "fail"
         */
        public static final StatusEnum FAIL = new StatusEnum("fail");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("init", INIT);
            map.put("upgrading", UPGRADING);
            map.put("success", SUCCESS);
            map.put("fail", FAIL);
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
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finished_at")

    private OffsetDateTime finishedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_message")

    private String errorMessage;

    public SubJob withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 任务ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SubJob withJobType(JobTypeEnum jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * 任务类型
     * @return jobType
     */
    public JobTypeEnum getJobType() {
        return jobType;
    }

    public void setJobType(JobTypeEnum jobType) {
        this.jobType = jobType;
    }

    public SubJob withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 任务状态
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public SubJob withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public SubJob withFinishedAt(OffsetDateTime finishedAt) {
        this.finishedAt = finishedAt;
        return this;
    }

    /**
     * 完成时间
     * @return finishedAt
     */
    public OffsetDateTime getFinishedAt() {
        return finishedAt;
    }

    public void setFinishedAt(OffsetDateTime finishedAt) {
        this.finishedAt = finishedAt;
    }

    public SubJob withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * 错误信息
     * @return errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubJob that = (SubJob) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.jobType, that.jobType)
            && Objects.equals(this.status, that.status) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.finishedAt, that.finishedAt) && Objects.equals(this.errorMessage, that.errorMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, jobType, status, createdAt, finishedAt, errorMessage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubJob {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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
