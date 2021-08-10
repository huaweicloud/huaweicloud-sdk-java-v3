package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ShowFunctionAsyncInvokeConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "func_urn")

    private String funcUrn;

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
    @JsonProperty(value = "created_time")

    private String createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_modified")

    private String lastModified;

    public ShowFunctionAsyncInvokeConfigResponse withFuncUrn(String funcUrn) {
        this.funcUrn = funcUrn;
        return this;
    }

    /** 函数URN。
     * 
     * @return funcUrn */
    public String getFuncUrn() {
        return funcUrn;
    }

    public void setFuncUrn(String funcUrn) {
        this.funcUrn = funcUrn;
    }

    public ShowFunctionAsyncInvokeConfigResponse withMaxAsyncEventAgeInSeconds(Integer maxAsyncEventAgeInSeconds) {
        this.maxAsyncEventAgeInSeconds = maxAsyncEventAgeInSeconds;
        return this;
    }

    /** 消息最大存活时长，取值范围[60，86400]。单位：秒。
     * 
     * @return maxAsyncEventAgeInSeconds */
    public Integer getMaxAsyncEventAgeInSeconds() {
        return maxAsyncEventAgeInSeconds;
    }

    public void setMaxAsyncEventAgeInSeconds(Integer maxAsyncEventAgeInSeconds) {
        this.maxAsyncEventAgeInSeconds = maxAsyncEventAgeInSeconds;
    }

    public ShowFunctionAsyncInvokeConfigResponse withMaxAsyncRetryAttempts(Integer maxAsyncRetryAttempts) {
        this.maxAsyncRetryAttempts = maxAsyncRetryAttempts;
        return this;
    }

    /** 异步调用失败后的最大重试次数，默认值为3。取值范围[0，8]。
     * 
     * @return maxAsyncRetryAttempts */
    public Integer getMaxAsyncRetryAttempts() {
        return maxAsyncRetryAttempts;
    }

    public void setMaxAsyncRetryAttempts(Integer maxAsyncRetryAttempts) {
        this.maxAsyncRetryAttempts = maxAsyncRetryAttempts;
    }

    public ShowFunctionAsyncInvokeConfigResponse withDestinationConfig(FuncAsyncDestinationConfig destinationConfig) {
        this.destinationConfig = destinationConfig;
        return this;
    }

    public ShowFunctionAsyncInvokeConfigResponse withDestinationConfig(
        Consumer<FuncAsyncDestinationConfig> destinationConfigSetter) {
        if (this.destinationConfig == null) {
            this.destinationConfig = new FuncAsyncDestinationConfig();
            destinationConfigSetter.accept(this.destinationConfig);
        }

        return this;
    }

    /** Get destinationConfig
     * 
     * @return destinationConfig */
    public FuncAsyncDestinationConfig getDestinationConfig() {
        return destinationConfig;
    }

    public void setDestinationConfig(FuncAsyncDestinationConfig destinationConfig) {
        this.destinationConfig = destinationConfig;
    }

    public ShowFunctionAsyncInvokeConfigResponse withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /** 异步调用配置的创建时间。
     * 
     * @return createdTime */
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public ShowFunctionAsyncInvokeConfigResponse withLastModified(String lastModified) {
        this.lastModified = lastModified;
        return this;
    }

    /** 异步调用配置的最后更改时间。
     * 
     * @return lastModified */
    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowFunctionAsyncInvokeConfigResponse showFunctionAsyncInvokeConfigResponse =
            (ShowFunctionAsyncInvokeConfigResponse) o;
        return Objects.equals(this.funcUrn, showFunctionAsyncInvokeConfigResponse.funcUrn)
            && Objects.equals(this.maxAsyncEventAgeInSeconds,
                showFunctionAsyncInvokeConfigResponse.maxAsyncEventAgeInSeconds)
            && Objects.equals(this.maxAsyncRetryAttempts, showFunctionAsyncInvokeConfigResponse.maxAsyncRetryAttempts)
            && Objects.equals(this.destinationConfig, showFunctionAsyncInvokeConfigResponse.destinationConfig)
            && Objects.equals(this.createdTime, showFunctionAsyncInvokeConfigResponse.createdTime)
            && Objects.equals(this.lastModified, showFunctionAsyncInvokeConfigResponse.lastModified);
    }

    @Override
    public int hashCode() {
        return Objects.hash(funcUrn,
            maxAsyncEventAgeInSeconds,
            maxAsyncRetryAttempts,
            destinationConfig,
            createdTime,
            lastModified);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowFunctionAsyncInvokeConfigResponse {\n");
        sb.append("    funcUrn: ").append(toIndentedString(funcUrn)).append("\n");
        sb.append("    maxAsyncEventAgeInSeconds: ").append(toIndentedString(maxAsyncEventAgeInSeconds)).append("\n");
        sb.append("    maxAsyncRetryAttempts: ").append(toIndentedString(maxAsyncRetryAttempts)).append("\n");
        sb.append("    destinationConfig: ").append(toIndentedString(destinationConfig)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
