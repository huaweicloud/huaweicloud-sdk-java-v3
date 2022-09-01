package com.huaweicloud.sdk.servicestage.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 构建工程参数。
 */
public class JobInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "CREATED_BY")

    @JacksonXmlProperty(localName = "CREATED_BY")

    private String createdBy;

    /**
     * 执行状态。
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
    @JsonProperty(value = "EXECUTION_STATUS")

    @JacksonXmlProperty(localName = "EXECUTION_STATUS")

    private ExecutionStatusEnum executionStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "JOB_DESC")

    @JacksonXmlProperty(localName = "JOB_DESC")

    private String jobDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "JOB_ID")

    @JacksonXmlProperty(localName = "JOB_ID")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "JOB_NAME")

    @JacksonXmlProperty(localName = "JOB_NAME")

    private String jobName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "JOB_TYPE")

    @JacksonXmlProperty(localName = "JOB_TYPE")

    private String jobType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ORDER_ID")

    @JacksonXmlProperty(localName = "ORDER_ID")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "PROJECT_ID")

    @JacksonXmlProperty(localName = "PROJECT_ID")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "SERVICE_INSTANCE_ID")

    @JacksonXmlProperty(localName = "SERVICE_INSTANCE_ID")

    private String serviceInstanceId;

    public JobInfo withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * 创建者。
     * @return createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public JobInfo withExecutionStatus(ExecutionStatusEnum executionStatus) {
        this.executionStatus = executionStatus;
        return this;
    }

    /**
     * 执行状态。
     * @return executionStatus
     */
    public ExecutionStatusEnum getExecutionStatus() {
        return executionStatus;
    }

    public void setExecutionStatus(ExecutionStatusEnum executionStatus) {
        this.executionStatus = executionStatus;
    }

    public JobInfo withJobDesc(String jobDesc) {
        this.jobDesc = jobDesc;
        return this;
    }

    /**
     * 工作描述。
     * @return jobDesc
     */
    public String getJobDesc() {
        return jobDesc;
    }

    public void setJobDesc(String jobDesc) {
        this.jobDesc = jobDesc;
    }

    public JobInfo withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 工作ID。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public JobInfo withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * 工作名称。
     * @return jobName
     */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public JobInfo withJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * 类别。
     * @return jobType
     */
    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public JobInfo withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 排序ID。
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public JobInfo withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 创建租户的项目ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public JobInfo withServiceInstanceId(String serviceInstanceId) {
        this.serviceInstanceId = serviceInstanceId;
        return this;
    }

    /**
     * 实例ID。
     * @return serviceInstanceId
     */
    public String getServiceInstanceId() {
        return serviceInstanceId;
    }

    public void setServiceInstanceId(String serviceInstanceId) {
        this.serviceInstanceId = serviceInstanceId;
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
        return Objects.equals(this.createdBy, jobInfo.createdBy)
            && Objects.equals(this.executionStatus, jobInfo.executionStatus)
            && Objects.equals(this.jobDesc, jobInfo.jobDesc) && Objects.equals(this.jobId, jobInfo.jobId)
            && Objects.equals(this.jobName, jobInfo.jobName) && Objects.equals(this.jobType, jobInfo.jobType)
            && Objects.equals(this.orderId, jobInfo.orderId) && Objects.equals(this.projectId, jobInfo.projectId)
            && Objects.equals(this.serviceInstanceId, jobInfo.serviceInstanceId);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(createdBy, executionStatus, jobDesc, jobId, jobName, jobType, orderId, projectId, serviceInstanceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobInfo {\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    executionStatus: ").append(toIndentedString(executionStatus)).append("\n");
        sb.append("    jobDesc: ").append(toIndentedString(jobDesc)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    serviceInstanceId: ").append(toIndentedString(serviceInstanceId)).append("\n");
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
