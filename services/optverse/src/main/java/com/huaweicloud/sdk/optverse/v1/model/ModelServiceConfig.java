package com.huaweicloud.sdk.optverse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 服务配置
 */
public class ModelServiceConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_spec")

    private ModelServiceConfigCustomSpec customSpec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_env")

    private Map<String, String> userEnv = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_count")

    private Integer instanceCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_size_limit")

    private Integer requestSizeLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_limit_per_second")

    private Integer requestLimitPerSecond;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_timeout")

    private Integer requestTimeout;

    public ModelServiceConfig withCustomSpec(ModelServiceConfigCustomSpec customSpec) {
        this.customSpec = customSpec;
        return this;
    }

    public ModelServiceConfig withCustomSpec(Consumer<ModelServiceConfigCustomSpec> customSpecSetter) {
        if (this.customSpec == null) {
            this.customSpec = new ModelServiceConfigCustomSpec();
            customSpecSetter.accept(this.customSpec);
        }

        return this;
    }

    /**
     * Get customSpec
     * @return customSpec
     */
    public ModelServiceConfigCustomSpec getCustomSpec() {
        return customSpec;
    }

    public void setCustomSpec(ModelServiceConfigCustomSpec customSpec) {
        this.customSpec = customSpec;
    }

    public ModelServiceConfig withUserEnv(Map<String, String> userEnv) {
        this.userEnv = userEnv;
        return this;
    }

    public ModelServiceConfig putUserEnvItem(String key, String userEnvItem) {
        if (this.userEnv == null) {
            this.userEnv = new HashMap<>();
        }
        this.userEnv.put(key, userEnvItem);
        return this;
    }

    public ModelServiceConfig withUserEnv(Consumer<Map<String, String>> userEnvSetter) {
        if (this.userEnv == null) {
            this.userEnv = new HashMap<>();
        }
        userEnvSetter.accept(this.userEnv);
        return this;
    }

    /**
     * 部署环境变量，Map格式
     * @return userEnv
     */
    public Map<String, String> getUserEnv() {
        return userEnv;
    }

    public void setUserEnv(Map<String, String> userEnv) {
        this.userEnv = userEnv;
    }

    public ModelServiceConfig withInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }

    /**
     * 部署实例个数，取值范围[1-10]，默认值1
     * minimum: 1
     * maximum: 10
     * @return instanceCount
     */
    public Integer getInstanceCount() {
        return instanceCount;
    }

    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    public ModelServiceConfig withRequestSizeLimit(Integer requestSizeLimit) {
        this.requestSizeLimit = requestSizeLimit;
        return this;
    }

    /**
     * 请求大小限制，取值范围[1-64000]，默认值6400
     * minimum: 1
     * maximum: 64000
     * @return requestSizeLimit
     */
    public Integer getRequestSizeLimit() {
        return requestSizeLimit;
    }

    public void setRequestSizeLimit(Integer requestSizeLimit) {
        this.requestSizeLimit = requestSizeLimit;
    }

    public ModelServiceConfig withRequestLimitPerSecond(Integer requestLimitPerSecond) {
        this.requestLimitPerSecond = requestLimitPerSecond;
        return this;
    }

    /**
     * 请求QPS限制，取值范围[1-10000]，默认值100
     * minimum: 1
     * maximum: 10000
     * @return requestLimitPerSecond
     */
    public Integer getRequestLimitPerSecond() {
        return requestLimitPerSecond;
    }

    public void setRequestLimitPerSecond(Integer requestLimitPerSecond) {
        this.requestLimitPerSecond = requestLimitPerSecond;
    }

    public ModelServiceConfig withRequestTimeout(Integer requestTimeout) {
        this.requestTimeout = requestTimeout;
        return this;
    }

    /**
     * 请求超时时间，取值范围[1-120000]，默认值120000，单位毫秒
     * minimum: 1
     * maximum: 120000
     * @return requestTimeout
     */
    public Integer getRequestTimeout() {
        return requestTimeout;
    }

    public void setRequestTimeout(Integer requestTimeout) {
        this.requestTimeout = requestTimeout;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModelServiceConfig that = (ModelServiceConfig) obj;
        return Objects.equals(this.customSpec, that.customSpec) && Objects.equals(this.userEnv, that.userEnv)
            && Objects.equals(this.instanceCount, that.instanceCount)
            && Objects.equals(this.requestSizeLimit, that.requestSizeLimit)
            && Objects.equals(this.requestLimitPerSecond, that.requestLimitPerSecond)
            && Objects.equals(this.requestTimeout, that.requestTimeout);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(customSpec, userEnv, instanceCount, requestSizeLimit, requestLimitPerSecond, requestTimeout);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModelServiceConfig {\n");
        sb.append("    customSpec: ").append(toIndentedString(customSpec)).append("\n");
        sb.append("    userEnv: ").append(toIndentedString(userEnv)).append("\n");
        sb.append("    instanceCount: ").append(toIndentedString(instanceCount)).append("\n");
        sb.append("    requestSizeLimit: ").append(toIndentedString(requestSizeLimit)).append("\n");
        sb.append("    requestLimitPerSecond: ").append(toIndentedString(requestLimitPerSecond)).append("\n");
        sb.append("    requestTimeout: ").append(toIndentedString(requestTimeout)).append("\n");
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
