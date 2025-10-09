package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 任务
 */
public class Job {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    /**
     * 任务类型
     */
    public static final class JobTypeEnum {

        /**
         * Enum UPGRADE for value: "upgrade"
         */
        public static final JobTypeEnum UPGRADE = new JobTypeEnum("upgrade");

        /**
         * Enum ROLLBACK for value: "rollback"
         */
        public static final JobTypeEnum ROLLBACK = new JobTypeEnum("rollback");

        private static final Map<String, JobTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, JobTypeEnum> createStaticFields() {
            Map<String, JobTypeEnum> map = new HashMap<>();
            map.put("upgrade", UPGRADE);
            map.put("rollback", ROLLBACK);
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
         * Enum UPGRADING for value: "upgrading"
         */
        public static final StatusEnum UPGRADING = new StatusEnum("upgrading");

        /**
         * Enum PENDING_UPGRADE_CONFIRM for value: "pending_upgrade_confirm"
         */
        public static final StatusEnum PENDING_UPGRADE_CONFIRM = new StatusEnum("pending_upgrade_confirm");

        /**
         * Enum SUCCESS for value: "success"
         */
        public static final StatusEnum SUCCESS = new StatusEnum("success");

        /**
         * Enum ROLLING_BACK for value: "rolling_back"
         */
        public static final StatusEnum ROLLING_BACK = new StatusEnum("rolling_back");

        /**
         * Enum ROLLBACK_SUCCESS for value: "rollback_success"
         */
        public static final StatusEnum ROLLBACK_SUCCESS = new StatusEnum("rollback_success");

        /**
         * Enum FAIL for value: "fail"
         */
        public static final StatusEnum FAIL = new StatusEnum("fail");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("upgrading", UPGRADING);
            map.put("pending_upgrade_confirm", PENDING_UPGRADE_CONFIRM);
            map.put("success", SUCCESS);
            map.put("rolling_back", ROLLING_BACK);
            map.put("rollback_success", ROLLBACK_SUCCESS);
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_jobs")

    private List<SubJob> subJobs = null;

    public Job withId(String id) {
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

    public Job withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源Id
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public Job withJobType(JobTypeEnum jobType) {
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

    public Job withStatus(StatusEnum status) {
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

    public Job withCreatedAt(OffsetDateTime createdAt) {
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

    public Job withFinishedAt(OffsetDateTime finishedAt) {
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

    public Job withErrorMessage(String errorMessage) {
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

    public Job withSubJobs(List<SubJob> subJobs) {
        this.subJobs = subJobs;
        return this;
    }

    public Job addSubJobsItem(SubJob subJobsItem) {
        if (this.subJobs == null) {
            this.subJobs = new ArrayList<>();
        }
        this.subJobs.add(subJobsItem);
        return this;
    }

    public Job withSubJobs(Consumer<List<SubJob>> subJobsSetter) {
        if (this.subJobs == null) {
            this.subJobs = new ArrayList<>();
        }
        subJobsSetter.accept(this.subJobs);
        return this;
    }

    /**
     * 子任务列表
     * @return subJobs
     */
    public List<SubJob> getSubJobs() {
        return subJobs;
    }

    public void setSubJobs(List<SubJob> subJobs) {
        this.subJobs = subJobs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Job that = (Job) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.jobType, that.jobType) && Objects.equals(this.status, that.status)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.finishedAt, that.finishedAt)
            && Objects.equals(this.errorMessage, that.errorMessage) && Objects.equals(this.subJobs, that.subJobs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, resourceId, jobType, status, createdAt, finishedAt, errorMessage, subJobs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Job {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
        sb.append("    subJobs: ").append(toIndentedString(subJobs)).append("\n");
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
