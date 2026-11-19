package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SqlSessionInfo
 */
public class SqlSessionInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_id")

    private String sessionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private SqlSessionStatusAdmin status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error")

    private ErrorMessage error;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private OffsetDateTime startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private OffsetDateTime endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wait_timeout")

    private Integer waitTimeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_retry_times")

    private Integer maxRetryTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_info")

    private Object endpointInfo;

    public SqlSessionInfo withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * **参数解释**：Session的ID。 **取值范围**：长度为1~36个字符，支持大小写英文字母、数字、连字符。
     * @return sessionId
     */
    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public SqlSessionInfo withStatus(SqlSessionStatusAdmin status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    public SqlSessionStatusAdmin getStatus() {
        return status;
    }

    public void setStatus(SqlSessionStatusAdmin status) {
        this.status = status;
    }

    public SqlSessionInfo withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释**：session创建时间。 **取值范围**：不涉及。
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public SqlSessionInfo withError(ErrorMessage error) {
        this.error = error;
        return this;
    }

    public SqlSessionInfo withError(Consumer<ErrorMessage> errorSetter) {
        if (this.error == null) {
            this.error = new ErrorMessage();
            errorSetter.accept(this.error);
        }

        return this;
    }

    /**
     * Get error
     * @return error
     */
    public ErrorMessage getError() {
        return error;
    }

    public void setError(ErrorMessage error) {
        this.error = error;
    }

    public SqlSessionInfo withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释**：开始时间。 **取值范围**：不涉及。
     * @return startTime
     */
    public OffsetDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    public SqlSessionInfo withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释**：结束时间。 **取值范围**：不涉及。
     * @return endTime
     */
    public OffsetDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
    }

    public SqlSessionInfo withWaitTimeout(Integer waitTimeout) {
        this.waitTimeout = waitTimeout;
        return this;
    }

    /**
     * **参数解释**：会话排队超时时间（秒）。 **取值范围**：不涉及。
     * @return waitTimeout
     */
    public Integer getWaitTimeout() {
        return waitTimeout;
    }

    public void setWaitTimeout(Integer waitTimeout) {
        this.waitTimeout = waitTimeout;
    }

    public SqlSessionInfo withMaxRetryTimes(Integer maxRetryTimes) {
        this.maxRetryTimes = maxRetryTimes;
        return this;
    }

    /**
     * **参数解释**：异步创建会话最大重试次数。 **取值范围**：不涉及。
     * @return maxRetryTimes
     */
    public Integer getMaxRetryTimes() {
        return maxRetryTimes;
    }

    public void setMaxRetryTimes(Integer maxRetryTimes) {
        this.maxRetryTimes = maxRetryTimes;
    }

    public SqlSessionInfo withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * **参数解释**：会话优先级。 **取值范围**：不涉及。
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public SqlSessionInfo withEndpointInfo(Object endpointInfo) {
        this.endpointInfo = endpointInfo;
        return this;
    }

    public SqlSessionInfo withEndpointInfo(Consumer<Object> endpointInfoSetter) {
        if (this.endpointInfo == null) {
            this.endpointInfo = new Object();
            endpointInfoSetter.accept(this.endpointInfo);
        }

        return this;
    }

    /**
     * **参数解释**：端点信息。
     * @return endpointInfo
     */
    public Object getEndpointInfo() {
        return endpointInfo;
    }

    public void setEndpointInfo(Object endpointInfo) {
        this.endpointInfo = endpointInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SqlSessionInfo that = (SqlSessionInfo) obj;
        return Objects.equals(this.sessionId, that.sessionId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.error, that.error)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.waitTimeout, that.waitTimeout)
            && Objects.equals(this.maxRetryTimes, that.maxRetryTimes) && Objects.equals(this.priority, that.priority)
            && Objects.equals(this.endpointInfo, that.endpointInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sessionId,
            status,
            createTime,
            error,
            startTime,
            endTime,
            waitTimeout,
            maxRetryTimes,
            priority,
            endpointInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SqlSessionInfo {\n");
        sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    waitTimeout: ").append(toIndentedString(waitTimeout)).append("\n");
        sb.append("    maxRetryTimes: ").append(toIndentedString(maxRetryTimes)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    endpointInfo: ").append(toIndentedString(endpointInfo)).append("\n");
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
