package com.huaweicloud.sdk.sdrs.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 失败任务数据结构
 */
public class FailureJobParams {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_type")

    private String jobType;

    /**
     * 任务状态。当前仅支持“FAIL”。FAIL：表示任务失败。
     */
    public static final class JobStatusEnum {

        /**
         * Enum FAIL for value: "FAIL"
         */
        public static final JobStatusEnum FAIL = new JobStatusEnum("FAIL");

        private static final Map<String, JobStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, JobStatusEnum> createStaticFields() {
            Map<String, JobStatusEnum> map = new HashMap<>();
            map.put("FAIL", FAIL);
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
            JobStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new JobStatusEnum(value);
            }
            return result;
        }

        public static JobStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            JobStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    @JsonProperty(value = "begin_time")

    private String beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    /**
     * 失败任务状态。createFail：表示创建失败。deleteFail：表示删除失败。attachFail：表示挂载失败。detachFail：表示卸载失败。expandFail：表示扩容失败。resizeFail：表示变更规格失败。startFail：表示开启保护失败。stopFail：表示停止保护失败。reverseFail：表示切换失败。failoverFail：表示故障切换失败。reprotectFail : 表示重保护失败。
     */
    public static final class FailureStatusEnum {

        /**
         * Enum CREATEFAIL for value: "createFail"
         */
        public static final FailureStatusEnum CREATEFAIL = new FailureStatusEnum("createFail");

        /**
         * Enum DELETEFAIL for value: "deleteFail"
         */
        public static final FailureStatusEnum DELETEFAIL = new FailureStatusEnum("deleteFail");

        /**
         * Enum ATTACHFAIL for value: "attachFail"
         */
        public static final FailureStatusEnum ATTACHFAIL = new FailureStatusEnum("attachFail");

        /**
         * Enum DETACHFAIL for value: "detachFail"
         */
        public static final FailureStatusEnum DETACHFAIL = new FailureStatusEnum("detachFail");

        /**
         * Enum EXPANDFAIL for value: "expandFail"
         */
        public static final FailureStatusEnum EXPANDFAIL = new FailureStatusEnum("expandFail");

        /**
         * Enum RESIZEFAIL for value: "resizeFail"
         */
        public static final FailureStatusEnum RESIZEFAIL = new FailureStatusEnum("resizeFail");

        /**
         * Enum STARTFAIL for value: "startFail"
         */
        public static final FailureStatusEnum STARTFAIL = new FailureStatusEnum("startFail");

        /**
         * Enum STOPFAIL for value: "stopFail"
         */
        public static final FailureStatusEnum STOPFAIL = new FailureStatusEnum("stopFail");

        /**
         * Enum REVERSEFAIL for value: "reverseFail"
         */
        public static final FailureStatusEnum REVERSEFAIL = new FailureStatusEnum("reverseFail");

        /**
         * Enum FAILOVERFAIL for value: "failoverFail"
         */
        public static final FailureStatusEnum FAILOVERFAIL = new FailureStatusEnum("failoverFail");

        /**
         * Enum REPROTECTFAIL for value: "reprotectFail"
         */
        public static final FailureStatusEnum REPROTECTFAIL = new FailureStatusEnum("reprotectFail");

        private static final Map<String, FailureStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FailureStatusEnum> createStaticFields() {
            Map<String, FailureStatusEnum> map = new HashMap<>();
            map.put("createFail", CREATEFAIL);
            map.put("deleteFail", DELETEFAIL);
            map.put("attachFail", ATTACHFAIL);
            map.put("detachFail", DETACHFAIL);
            map.put("expandFail", EXPANDFAIL);
            map.put("resizeFail", RESIZEFAIL);
            map.put("startFail", STARTFAIL);
            map.put("stopFail", STOPFAIL);
            map.put("reverseFail", REVERSEFAIL);
            map.put("failoverFail", FAILOVERFAIL);
            map.put("reprotectFail", REPROTECTFAIL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FailureStatusEnum(String value) {
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
        public static FailureStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            FailureStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new FailureStatusEnum(value);
            }
            return result;
        }

        public static FailureStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            FailureStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FailureStatusEnum) {
                return this.value.equals(((FailureStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failure_status")

    private FailureStatusEnum failureStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_reason")

    private String failReason;

    /**
     * 资源类型。 server_groups：表示保护组。 protected_instances：表示保护实例。 replications：表示复制对。 disaster_recovery_drills：表示容灾演练。
     */
    public static final class ResourceTypeEnum {

        /**
         * Enum SERVER_GROUPS for value: "server_groups"
         */
        public static final ResourceTypeEnum SERVER_GROUPS = new ResourceTypeEnum("server_groups");

        /**
         * Enum PROTECTED_INSTANCES for value: "protected_instances"
         */
        public static final ResourceTypeEnum PROTECTED_INSTANCES = new ResourceTypeEnum("protected_instances");

        /**
         * Enum REPLICATIONS for value: "replications"
         */
        public static final ResourceTypeEnum REPLICATIONS = new ResourceTypeEnum("replications");

        /**
         * Enum DISASTER_RECOVERY_DRILLS for value: "disaster_recovery_drills"
         */
        public static final ResourceTypeEnum DISASTER_RECOVERY_DRILLS =
            new ResourceTypeEnum("disaster_recovery_drills");

        private static final Map<String, ResourceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResourceTypeEnum> createStaticFields() {
            Map<String, ResourceTypeEnum> map = new HashMap<>();
            map.put("server_groups", SERVER_GROUPS);
            map.put("protected_instances", PROTECTED_INSTANCES);
            map.put("replications", REPLICATIONS);
            map.put("disaster_recovery_drills", DISASTER_RECOVERY_DRILLS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ResourceTypeEnum(String value) {
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
        public static ResourceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ResourceTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ResourceTypeEnum(value);
            }
            return result;
        }

        public static ResourceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ResourceTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ResourceTypeEnum) {
                return this.value.equals(((ResourceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private ResourceTypeEnum resourceType;

    public FailureJobParams withJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * 任务名称。
     * @return jobType
     */
    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public FailureJobParams withJobStatus(JobStatusEnum jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }

    /**
     * 任务状态。当前仅支持“FAIL”。FAIL：表示任务失败。
     * @return jobStatus
     */
    public JobStatusEnum getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(JobStatusEnum jobStatus) {
        this.jobStatus = jobStatus;
    }

    public FailureJobParams withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * 任务操作时间。默认格式为：\"yyyy-MM-ddTHH:mm:ss.SSSZ\"，例：\"2019-04-01T12:00:00.000Z\"。
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public FailureJobParams withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 任务id。执行异步API命令下发成功的返回参数。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public FailureJobParams withFailureStatus(FailureStatusEnum failureStatus) {
        this.failureStatus = failureStatus;
        return this;
    }

    /**
     * 失败任务状态。createFail：表示创建失败。deleteFail：表示删除失败。attachFail：表示挂载失败。detachFail：表示卸载失败。expandFail：表示扩容失败。resizeFail：表示变更规格失败。startFail：表示开启保护失败。stopFail：表示停止保护失败。reverseFail：表示切换失败。failoverFail：表示故障切换失败。reprotectFail : 表示重保护失败。
     * @return failureStatus
     */
    public FailureStatusEnum getFailureStatus() {
        return failureStatus;
    }

    public void setFailureStatus(FailureStatusEnum failureStatus) {
        this.failureStatus = failureStatus;
    }

    public FailureJobParams withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源ID。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public FailureJobParams withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * 资源名称。
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public FailureJobParams withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 任务失败错误码。
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public FailureJobParams withFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }

    /**
     * 任务失败原因。
     * @return failReason
     */
    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }

    public FailureJobParams withResourceType(ResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类型。 server_groups：表示保护组。 protected_instances：表示保护实例。 replications：表示复制对。 disaster_recovery_drills：表示容灾演练。
     * @return resourceType
     */
    public ResourceTypeEnum getResourceType() {
        return resourceType;
    }

    public void setResourceType(ResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FailureJobParams failureJobParams = (FailureJobParams) o;
        return Objects.equals(this.jobType, failureJobParams.jobType)
            && Objects.equals(this.jobStatus, failureJobParams.jobStatus)
            && Objects.equals(this.beginTime, failureJobParams.beginTime)
            && Objects.equals(this.jobId, failureJobParams.jobId)
            && Objects.equals(this.failureStatus, failureJobParams.failureStatus)
            && Objects.equals(this.resourceId, failureJobParams.resourceId)
            && Objects.equals(this.resourceName, failureJobParams.resourceName)
            && Objects.equals(this.errorCode, failureJobParams.errorCode)
            && Objects.equals(this.failReason, failureJobParams.failReason)
            && Objects.equals(this.resourceType, failureJobParams.resourceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobType,
            jobStatus,
            beginTime,
            jobId,
            failureStatus,
            resourceId,
            resourceName,
            errorCode,
            failReason,
            resourceType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FailureJobParams {\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    jobStatus: ").append(toIndentedString(jobStatus)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    failureStatus: ").append(toIndentedString(failureStatus)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    failReason: ").append(toIndentedString(failReason)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
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
