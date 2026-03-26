package com.huaweicloud.sdk.dataartsfabricep.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowJobRunDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job")

    private JobRef job;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_id")

    private String endpointId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Long duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private JobType type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_user")

    private User createUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_path")

    private List<StoragePath> logPath = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public ShowJobRunDetailResponse withJob(JobRef job) {
        this.job = job;
        return this;
    }

    public ShowJobRunDetailResponse withJob(Consumer<JobRef> jobSetter) {
        if (this.job == null) {
            this.job = new JobRef();
            jobSetter.accept(this.job);
        }

        return this;
    }

    /**
     * Get job
     * @return job
     */
    public JobRef getJob() {
        return job;
    }

    public void setJob(JobRef job) {
        this.job = job;
    }

    public ShowJobRunDetailResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 作业运行的名称，只能包含中文、字母、数字、下划线、中划线、点、空格
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowJobRunDetailResponse withEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }

    /**
     * endpoint空间id
     * @return endpointId
     */
    public String getEndpointId() {
        return endpointId;
    }

    public void setEndpointId(String endpointId) {
        this.endpointId = endpointId;
    }

    public ShowJobRunDetailResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 一种资源ID，32~36位的英文、数字、短横组合
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowJobRunDetailResponse withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public ShowJobRunDetailResponse withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public ShowJobRunDetailResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ShowJobRunDetailResponse withDuration(Long duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 运行时间
     * @return duration
     */
    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public ShowJobRunDetailResponse withType(JobType type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    public JobType getType() {
        return type;
    }

    public void setType(JobType type) {
        this.type = type;
    }

    public ShowJobRunDetailResponse withCreateUser(User createUser) {
        this.createUser = createUser;
        return this;
    }

    public ShowJobRunDetailResponse withCreateUser(Consumer<User> createUserSetter) {
        if (this.createUser == null) {
            this.createUser = new User();
            createUserSetter.accept(this.createUser);
        }

        return this;
    }

    /**
     * Get createUser
     * @return createUser
     */
    public User getCreateUser() {
        return createUser;
    }

    public void setCreateUser(User createUser) {
        this.createUser = createUser;
    }

    public ShowJobRunDetailResponse withLogPath(List<StoragePath> logPath) {
        this.logPath = logPath;
        return this;
    }

    public ShowJobRunDetailResponse addLogPathItem(StoragePath logPathItem) {
        if (this.logPath == null) {
            this.logPath = new ArrayList<>();
        }
        this.logPath.add(logPathItem);
        return this;
    }

    public ShowJobRunDetailResponse withLogPath(Consumer<List<StoragePath>> logPathSetter) {
        if (this.logPath == null) {
            this.logPath = new ArrayList<>();
        }
        logPathSetter.accept(this.logPath);
        return this;
    }

    /**
     * 日志存储路径
     * @return logPath
     */
    public List<StoragePath> getLogPath() {
        return logPath;
    }

    public void setLogPath(List<StoragePath> logPath) {
        this.logPath = logPath;
    }

    public ShowJobRunDetailResponse withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 错误码
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public ShowJobRunDetailResponse withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * 错误描述
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public ShowJobRunDetailResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowJobRunDetailResponse that = (ShowJobRunDetailResponse) obj;
        return Objects.equals(this.job, that.job) && Objects.equals(this.name, that.name)
            && Objects.equals(this.endpointId, that.endpointId) && Objects.equals(this.id, that.id)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.status, that.status) && Objects.equals(this.duration, that.duration)
            && Objects.equals(this.type, that.type) && Objects.equals(this.createUser, that.createUser)
            && Objects.equals(this.logPath, that.logPath) && Objects.equals(this.errorCode, that.errorCode)
            && Objects.equals(this.errorMsg, that.errorMsg) && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(job,
            name,
            endpointId,
            id,
            createTime,
            updateTime,
            status,
            duration,
            type,
            createUser,
            logPath,
            errorCode,
            errorMsg,
            xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowJobRunDetailResponse {\n");
        sb.append("    job: ").append(toIndentedString(job)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    endpointId: ").append(toIndentedString(endpointId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    createUser: ").append(toIndentedString(createUser)).append("\n");
        sb.append("    logPath: ").append(toIndentedString(logPath)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
