package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 函数异步配置请求体。
 */
public class UpdateFunctionAsyncInvokeConfigRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_async_event_age_in_seconds")

    private Integer maxAsyncEventAgeInSeconds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_async_retry_attempts")

    private Integer maxAsyncRetryAttempts;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_config")

    private FuncAsyncDestinationConfig destinationConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_async_status_log")

    private Boolean enableAsyncStatusLog;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_group_id")

    private String logGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_stream_id")

    private String logStreamId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_group_name")

    private String logGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_stream_name")

    private String logStreamName;

    public UpdateFunctionAsyncInvokeConfigRequestBody withMaxAsyncEventAgeInSeconds(Integer maxAsyncEventAgeInSeconds) {
        this.maxAsyncEventAgeInSeconds = maxAsyncEventAgeInSeconds;
        return this;
    }

    /**
     * 消息最大存活时长，取值范围[1，86400]，单位：秒，默认值为3600。
     * minimum: 1
     * maximum: 86400
     * @return maxAsyncEventAgeInSeconds
     */
    public Integer getMaxAsyncEventAgeInSeconds() {
        return maxAsyncEventAgeInSeconds;
    }

    public void setMaxAsyncEventAgeInSeconds(Integer maxAsyncEventAgeInSeconds) {
        this.maxAsyncEventAgeInSeconds = maxAsyncEventAgeInSeconds;
    }

    public UpdateFunctionAsyncInvokeConfigRequestBody withMaxAsyncRetryAttempts(Integer maxAsyncRetryAttempts) {
        this.maxAsyncRetryAttempts = maxAsyncRetryAttempts;
        return this;
    }

    /**
     * 异步调用失败后的最大重试次数，默认值为1。取值范围[0，3]。
     * minimum: 0
     * maximum: 3
     * @return maxAsyncRetryAttempts
     */
    public Integer getMaxAsyncRetryAttempts() {
        return maxAsyncRetryAttempts;
    }

    public void setMaxAsyncRetryAttempts(Integer maxAsyncRetryAttempts) {
        this.maxAsyncRetryAttempts = maxAsyncRetryAttempts;
    }

    public UpdateFunctionAsyncInvokeConfigRequestBody withDestinationConfig(
        FuncAsyncDestinationConfig destinationConfig) {
        this.destinationConfig = destinationConfig;
        return this;
    }

    public UpdateFunctionAsyncInvokeConfigRequestBody withDestinationConfig(
        Consumer<FuncAsyncDestinationConfig> destinationConfigSetter) {
        if (this.destinationConfig == null) {
            this.destinationConfig = new FuncAsyncDestinationConfig();
            destinationConfigSetter.accept(this.destinationConfig);
        }

        return this;
    }

    /**
     * Get destinationConfig
     * @return destinationConfig
     */
    public FuncAsyncDestinationConfig getDestinationConfig() {
        return destinationConfig;
    }

    public void setDestinationConfig(FuncAsyncDestinationConfig destinationConfig) {
        this.destinationConfig = destinationConfig;
    }

    public UpdateFunctionAsyncInvokeConfigRequestBody withEnableAsyncStatusLog(Boolean enableAsyncStatusLog) {
        this.enableAsyncStatusLog = enableAsyncStatusLog;
        return this;
    }

    /**
     * 开启异步调用状态持久化
     * @return enableAsyncStatusLog
     */
    public Boolean getEnableAsyncStatusLog() {
        return enableAsyncStatusLog;
    }

    public void setEnableAsyncStatusLog(Boolean enableAsyncStatusLog) {
        this.enableAsyncStatusLog = enableAsyncStatusLog;
    }

    public UpdateFunctionAsyncInvokeConfigRequestBody withLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
        return this;
    }

    /**
     * 自定义日志查询组id。
     * @return logGroupId
     */
    public String getLogGroupId() {
        return logGroupId;
    }

    public void setLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
    }

    public UpdateFunctionAsyncInvokeConfigRequestBody withLogStreamId(String logStreamId) {
        this.logStreamId = logStreamId;
        return this;
    }

    /**
     * 自定义日志查询流id。
     * @return logStreamId
     */
    public String getLogStreamId() {
        return logStreamId;
    }

    public void setLogStreamId(String logStreamId) {
        this.logStreamId = logStreamId;
    }

    public UpdateFunctionAsyncInvokeConfigRequestBody withLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
        return this;
    }

    /**
     * 自定义日志查询组名称。
     * @return logGroupName
     */
    public String getLogGroupName() {
        return logGroupName;
    }

    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    public UpdateFunctionAsyncInvokeConfigRequestBody withLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
        return this;
    }

    /**
     * 自定义日志查询流名称。
     * @return logStreamName
     */
    public String getLogStreamName() {
        return logStreamName;
    }

    public void setLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateFunctionAsyncInvokeConfigRequestBody that = (UpdateFunctionAsyncInvokeConfigRequestBody) obj;
        return Objects.equals(this.maxAsyncEventAgeInSeconds, that.maxAsyncEventAgeInSeconds)
            && Objects.equals(this.maxAsyncRetryAttempts, that.maxAsyncRetryAttempts)
            && Objects.equals(this.destinationConfig, that.destinationConfig)
            && Objects.equals(this.enableAsyncStatusLog, that.enableAsyncStatusLog)
            && Objects.equals(this.logGroupId, that.logGroupId) && Objects.equals(this.logStreamId, that.logStreamId)
            && Objects.equals(this.logGroupName, that.logGroupName)
            && Objects.equals(this.logStreamName, that.logStreamName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxAsyncEventAgeInSeconds,
            maxAsyncRetryAttempts,
            destinationConfig,
            enableAsyncStatusLog,
            logGroupId,
            logStreamId,
            logGroupName,
            logStreamName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateFunctionAsyncInvokeConfigRequestBody {\n");
        sb.append("    maxAsyncEventAgeInSeconds: ").append(toIndentedString(maxAsyncEventAgeInSeconds)).append("\n");
        sb.append("    maxAsyncRetryAttempts: ").append(toIndentedString(maxAsyncRetryAttempts)).append("\n");
        sb.append("    destinationConfig: ").append(toIndentedString(destinationConfig)).append("\n");
        sb.append("    enableAsyncStatusLog: ").append(toIndentedString(enableAsyncStatusLog)).append("\n");
        sb.append("    logGroupId: ").append(toIndentedString(logGroupId)).append("\n");
        sb.append("    logStreamId: ").append(toIndentedString(logStreamId)).append("\n");
        sb.append("    logGroupName: ").append(toIndentedString(logGroupName)).append("\n");
        sb.append("    logStreamName: ").append(toIndentedString(logStreamName)).append("\n");
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
