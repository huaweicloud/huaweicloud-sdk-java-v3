package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Flink 作业运行时配置。
 */
public class FlinkRuntimeConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restore_strategy")

    private FlinkRestoreStrategy restoreStrategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_config")

    private FlinkResourceConfig resourceConfig;

    public FlinkRuntimeConfig withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Flink 版本。仅支持 Flink 1.15及以上版本。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public FlinkRuntimeConfig withRestoreStrategy(FlinkRestoreStrategy restoreStrategy) {
        this.restoreStrategy = restoreStrategy;
        return this;
    }

    public FlinkRuntimeConfig withRestoreStrategy(Consumer<FlinkRestoreStrategy> restoreStrategySetter) {
        if (this.restoreStrategy == null) {
            this.restoreStrategy = new FlinkRestoreStrategy();
            restoreStrategySetter.accept(this.restoreStrategy);
        }

        return this;
    }

    /**
     * Get restoreStrategy
     * @return restoreStrategy
     */
    public FlinkRestoreStrategy getRestoreStrategy() {
        return restoreStrategy;
    }

    public void setRestoreStrategy(FlinkRestoreStrategy restoreStrategy) {
        this.restoreStrategy = restoreStrategy;
    }

    public FlinkRuntimeConfig withResourceConfig(FlinkResourceConfig resourceConfig) {
        this.resourceConfig = resourceConfig;
        return this;
    }

    public FlinkRuntimeConfig withResourceConfig(Consumer<FlinkResourceConfig> resourceConfigSetter) {
        if (this.resourceConfig == null) {
            this.resourceConfig = new FlinkResourceConfig();
            resourceConfigSetter.accept(this.resourceConfig);
        }

        return this;
    }

    /**
     * Get resourceConfig
     * @return resourceConfig
     */
    public FlinkResourceConfig getResourceConfig() {
        return resourceConfig;
    }

    public void setResourceConfig(FlinkResourceConfig resourceConfig) {
        this.resourceConfig = resourceConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FlinkRuntimeConfig that = (FlinkRuntimeConfig) obj;
        return Objects.equals(this.version, that.version) && Objects.equals(this.restoreStrategy, that.restoreStrategy)
            && Objects.equals(this.resourceConfig, that.resourceConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, restoreStrategy, resourceConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlinkRuntimeConfig {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    restoreStrategy: ").append(toIndentedString(restoreStrategy)).append("\n");
        sb.append("    resourceConfig: ").append(toIndentedString(resourceConfig)).append("\n");
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
