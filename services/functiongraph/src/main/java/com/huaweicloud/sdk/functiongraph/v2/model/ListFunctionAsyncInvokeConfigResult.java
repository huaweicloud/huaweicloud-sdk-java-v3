package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 函数异步配置返回结构体。
 */
public class ListFunctionAsyncInvokeConfigResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "func_urn")

    @JacksonXmlProperty(localName = "func_urn")

    private String funcUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_async_event_age_in_seconds")

    @JacksonXmlProperty(localName = "max_async_event_age_in_seconds")

    private Integer maxAsyncEventAgeInSeconds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_async_retry_attempts")

    @JacksonXmlProperty(localName = "max_async_retry_attempts")

    private Integer maxAsyncRetryAttempts;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_config")

    @JacksonXmlProperty(localName = "destination_config")

    private FuncAsyncDestinationConfig destinationConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    @JacksonXmlProperty(localName = "created_time")

    private String createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_modified")

    @JacksonXmlProperty(localName = "last_modified")

    private String lastModified;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_async_status_log")

    @JacksonXmlProperty(localName = "enable_async_status_log")

    private Boolean enableAsyncStatusLog;

    public ListFunctionAsyncInvokeConfigResult withFuncUrn(String funcUrn) {
        this.funcUrn = funcUrn;
        return this;
    }

    /**
     * 函数URN。
     * @return funcUrn
     */
    public String getFuncUrn() {
        return funcUrn;
    }

    public void setFuncUrn(String funcUrn) {
        this.funcUrn = funcUrn;
    }

    public ListFunctionAsyncInvokeConfigResult withMaxAsyncEventAgeInSeconds(Integer maxAsyncEventAgeInSeconds) {
        this.maxAsyncEventAgeInSeconds = maxAsyncEventAgeInSeconds;
        return this;
    }

    /**
     * 消息最大存活时长，取值范围[60，86400]。单位：秒。
     * @return maxAsyncEventAgeInSeconds
     */
    public Integer getMaxAsyncEventAgeInSeconds() {
        return maxAsyncEventAgeInSeconds;
    }

    public void setMaxAsyncEventAgeInSeconds(Integer maxAsyncEventAgeInSeconds) {
        this.maxAsyncEventAgeInSeconds = maxAsyncEventAgeInSeconds;
    }

    public ListFunctionAsyncInvokeConfigResult withMaxAsyncRetryAttempts(Integer maxAsyncRetryAttempts) {
        this.maxAsyncRetryAttempts = maxAsyncRetryAttempts;
        return this;
    }

    /**
     * 异步调用失败后的最大重试次数，默认值为3。取值范围[0，8]。
     * @return maxAsyncRetryAttempts
     */
    public Integer getMaxAsyncRetryAttempts() {
        return maxAsyncRetryAttempts;
    }

    public void setMaxAsyncRetryAttempts(Integer maxAsyncRetryAttempts) {
        this.maxAsyncRetryAttempts = maxAsyncRetryAttempts;
    }

    public ListFunctionAsyncInvokeConfigResult withDestinationConfig(FuncAsyncDestinationConfig destinationConfig) {
        this.destinationConfig = destinationConfig;
        return this;
    }

    public ListFunctionAsyncInvokeConfigResult withDestinationConfig(
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

    public ListFunctionAsyncInvokeConfigResult withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * 异步调用配置的创建时间。
     * @return createdTime
     */
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public ListFunctionAsyncInvokeConfigResult withLastModified(String lastModified) {
        this.lastModified = lastModified;
        return this;
    }

    /**
     * 异步调用配置的最后更改时间。
     * @return lastModified
     */
    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    public ListFunctionAsyncInvokeConfigResult withEnableAsyncStatusLog(Boolean enableAsyncStatusLog) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListFunctionAsyncInvokeConfigResult listFunctionAsyncInvokeConfigResult =
            (ListFunctionAsyncInvokeConfigResult) o;
        return Objects.equals(this.funcUrn, listFunctionAsyncInvokeConfigResult.funcUrn)
            && Objects.equals(this.maxAsyncEventAgeInSeconds,
                listFunctionAsyncInvokeConfigResult.maxAsyncEventAgeInSeconds)
            && Objects.equals(this.maxAsyncRetryAttempts, listFunctionAsyncInvokeConfigResult.maxAsyncRetryAttempts)
            && Objects.equals(this.destinationConfig, listFunctionAsyncInvokeConfigResult.destinationConfig)
            && Objects.equals(this.createdTime, listFunctionAsyncInvokeConfigResult.createdTime)
            && Objects.equals(this.lastModified, listFunctionAsyncInvokeConfigResult.lastModified)
            && Objects.equals(this.enableAsyncStatusLog, listFunctionAsyncInvokeConfigResult.enableAsyncStatusLog);
    }

    @Override
    public int hashCode() {
        return Objects.hash(funcUrn,
            maxAsyncEventAgeInSeconds,
            maxAsyncRetryAttempts,
            destinationConfig,
            createdTime,
            lastModified,
            enableAsyncStatusLog);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFunctionAsyncInvokeConfigResult {\n");
        sb.append("    funcUrn: ").append(toIndentedString(funcUrn)).append("\n");
        sb.append("    maxAsyncEventAgeInSeconds: ").append(toIndentedString(maxAsyncEventAgeInSeconds)).append("\n");
        sb.append("    maxAsyncRetryAttempts: ").append(toIndentedString(maxAsyncRetryAttempts)).append("\n");
        sb.append("    destinationConfig: ").append(toIndentedString(destinationConfig)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
        sb.append("    enableAsyncStatusLog: ").append(toIndentedString(enableAsyncStatusLog)).append("\n");
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
