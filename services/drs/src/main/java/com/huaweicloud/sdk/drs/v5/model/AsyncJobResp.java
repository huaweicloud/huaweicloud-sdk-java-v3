package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 批量异步创建任务响应体。
 */
public class AsyncJobResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "async_job_id")

    private String asyncJobId;

    /**
     * 批量异步创建的任务状态。取值： - ASYNC_JOB_VALIDATING：批量异步任务参数校验中。 - ASYNC_JOB_VALIDATE_FAILED：批量异步任务参数校验失败。 - ASYNC_JOB_CREATING：批量异步任务创建中。 - ASYNC_JOB_CREATE_FAILED：批量异步任务创建失败。 - ASYNC_JOB_COMPLETED：批量异步任务创建完成。
     */
    public static final class StatusEnum {

        /**
         * Enum ASYNC_JOB_VALIDATING for value: "ASYNC_JOB_VALIDATING"
         */
        public static final StatusEnum ASYNC_JOB_VALIDATING = new StatusEnum("ASYNC_JOB_VALIDATING");

        /**
         * Enum ASYNC_JOB_VALIDATE_FAILED for value: "ASYNC_JOB_VALIDATE_FAILED"
         */
        public static final StatusEnum ASYNC_JOB_VALIDATE_FAILED = new StatusEnum("ASYNC_JOB_VALIDATE_FAILED");

        /**
         * Enum ASYNC_JOB_CREATING for value: "ASYNC_JOB_CREATING"
         */
        public static final StatusEnum ASYNC_JOB_CREATING = new StatusEnum("ASYNC_JOB_CREATING");

        /**
         * Enum ASYNC_JOB_CREATE_FAILED for value: "ASYNC_JOB_CREATE_FAILED"
         */
        public static final StatusEnum ASYNC_JOB_CREATE_FAILED = new StatusEnum("ASYNC_JOB_CREATE_FAILED");

        /**
         * Enum ASYNC_JOB_COMPLETED for value: "ASYNC_JOB_COMPLETED"
         */
        public static final StatusEnum ASYNC_JOB_COMPLETED = new StatusEnum("ASYNC_JOB_COMPLETED");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("ASYNC_JOB_VALIDATING", ASYNC_JOB_VALIDATING);
            map.put("ASYNC_JOB_VALIDATE_FAILED", ASYNC_JOB_VALIDATE_FAILED);
            map.put("ASYNC_JOB_CREATING", ASYNC_JOB_CREATING);
            map.put("ASYNC_JOB_CREATE_FAILED", ASYNC_JOB_CREATE_FAILED);
            map.put("ASYNC_JOB_COMPLETED", ASYNC_JOB_COMPLETED);
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
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    public AsyncJobResp withAsyncJobId(String asyncJobId) {
        this.asyncJobId = asyncJobId;
        return this;
    }

    /**
     * 批量异步创建的任务ID。
     * @return asyncJobId
     */
    public String getAsyncJobId() {
        return asyncJobId;
    }

    public void setAsyncJobId(String asyncJobId) {
        this.asyncJobId = asyncJobId;
    }

    public AsyncJobResp withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 批量异步创建的任务状态。取值： - ASYNC_JOB_VALIDATING：批量异步任务参数校验中。 - ASYNC_JOB_VALIDATE_FAILED：批量异步任务参数校验失败。 - ASYNC_JOB_CREATING：批量异步任务创建中。 - ASYNC_JOB_CREATE_FAILED：批量异步任务创建失败。 - ASYNC_JOB_COMPLETED：批量异步任务创建完成。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public AsyncJobResp withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * 批量异步创建的任务的租户名。
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public AsyncJobResp withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 批量异步创建的任务的用户名。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public AsyncJobResp withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 批量异步创建的任务的创建时间。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AsyncJobResp that = (AsyncJobResp) obj;
        return Objects.equals(this.asyncJobId, that.asyncJobId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.domainName, that.domainName) && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(asyncJobId, status, domainName, userName, createTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AsyncJobResp {\n");
        sb.append("    asyncJobId: ").append(toIndentedString(asyncJobId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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
