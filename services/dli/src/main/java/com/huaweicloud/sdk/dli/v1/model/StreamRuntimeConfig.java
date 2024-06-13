package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 流作业运行时配置。
 */
public class StreamRuntimeConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "staging_uri")

    private String stagingUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logging")

    private StreamLoggingConfig logging;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties")

    private Properties properties;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flink_runtime_config")

    private FlinkRuntimeConfig flinkRuntimeConfig;

    public StreamRuntimeConfig withStagingUri(String stagingUri) {
        this.stagingUri = stagingUri;
        return this;
    }

    /**
     * 临时文件存储 URI，作业运行时产生的临时文件存储的 OBS 路径。（当前不支持配置）
     * @return stagingUri
     */
    public String getStagingUri() {
        return stagingUri;
    }

    public void setStagingUri(String stagingUri) {
        this.stagingUri = stagingUri;
    }

    public StreamRuntimeConfig withLogging(StreamLoggingConfig logging) {
        this.logging = logging;
        return this;
    }

    public StreamRuntimeConfig withLogging(Consumer<StreamLoggingConfig> loggingSetter) {
        if (this.logging == null) {
            this.logging = new StreamLoggingConfig();
            loggingSetter.accept(this.logging);
        }

        return this;
    }

    /**
     * Get logging
     * @return logging
     */
    public StreamLoggingConfig getLogging() {
        return logging;
    }

    public void setLogging(StreamLoggingConfig logging) {
        this.logging = logging;
    }

    public StreamRuntimeConfig withProperties(Properties properties) {
        this.properties = properties;
        return this;
    }

    public StreamRuntimeConfig withProperties(Consumer<Properties> propertiesSetter) {
        if (this.properties == null) {
            this.properties = new Properties();
            propertiesSetter.accept(this.properties);
        }

        return this;
    }

    /**
     * Get properties
     * @return properties
     */
    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public StreamRuntimeConfig withFlinkRuntimeConfig(FlinkRuntimeConfig flinkRuntimeConfig) {
        this.flinkRuntimeConfig = flinkRuntimeConfig;
        return this;
    }

    public StreamRuntimeConfig withFlinkRuntimeConfig(Consumer<FlinkRuntimeConfig> flinkRuntimeConfigSetter) {
        if (this.flinkRuntimeConfig == null) {
            this.flinkRuntimeConfig = new FlinkRuntimeConfig();
            flinkRuntimeConfigSetter.accept(this.flinkRuntimeConfig);
        }

        return this;
    }

    /**
     * Get flinkRuntimeConfig
     * @return flinkRuntimeConfig
     */
    public FlinkRuntimeConfig getFlinkRuntimeConfig() {
        return flinkRuntimeConfig;
    }

    public void setFlinkRuntimeConfig(FlinkRuntimeConfig flinkRuntimeConfig) {
        this.flinkRuntimeConfig = flinkRuntimeConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StreamRuntimeConfig that = (StreamRuntimeConfig) obj;
        return Objects.equals(this.stagingUri, that.stagingUri) && Objects.equals(this.logging, that.logging)
            && Objects.equals(this.properties, that.properties)
            && Objects.equals(this.flinkRuntimeConfig, that.flinkRuntimeConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stagingUri, logging, properties, flinkRuntimeConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StreamRuntimeConfig {\n");
        sb.append("    stagingUri: ").append(toIndentedString(stagingUri)).append("\n");
        sb.append("    logging: ").append(toIndentedString(logging)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
        sb.append("    flinkRuntimeConfig: ").append(toIndentedString(flinkRuntimeConfig)).append("\n");
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
