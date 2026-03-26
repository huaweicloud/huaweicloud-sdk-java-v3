package com.huaweicloud.sdk.dataartsfabric.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Job配置
 */
public class JobConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ray_job_config")

    private RayJobConfig rayJobConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "python_job_config")

    private PythonJobConfig pythonJobConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spark_job_config")

    private SparkJobConfig sparkJobConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeout_seconds")

    private Integer timeoutSeconds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_retries")

    private Integer maxRetries;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue")

    private Boolean queue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_concurrent_runs")

    private Integer maxConcurrentRuns;

    public JobConfig withRayJobConfig(RayJobConfig rayJobConfig) {
        this.rayJobConfig = rayJobConfig;
        return this;
    }

    public JobConfig withRayJobConfig(Consumer<RayJobConfig> rayJobConfigSetter) {
        if (this.rayJobConfig == null) {
            this.rayJobConfig = new RayJobConfig();
            rayJobConfigSetter.accept(this.rayJobConfig);
        }

        return this;
    }

    /**
     * Get rayJobConfig
     * @return rayJobConfig
     */
    public RayJobConfig getRayJobConfig() {
        return rayJobConfig;
    }

    public void setRayJobConfig(RayJobConfig rayJobConfig) {
        this.rayJobConfig = rayJobConfig;
    }

    public JobConfig withPythonJobConfig(PythonJobConfig pythonJobConfig) {
        this.pythonJobConfig = pythonJobConfig;
        return this;
    }

    public JobConfig withPythonJobConfig(Consumer<PythonJobConfig> pythonJobConfigSetter) {
        if (this.pythonJobConfig == null) {
            this.pythonJobConfig = new PythonJobConfig();
            pythonJobConfigSetter.accept(this.pythonJobConfig);
        }

        return this;
    }

    /**
     * Get pythonJobConfig
     * @return pythonJobConfig
     */
    public PythonJobConfig getPythonJobConfig() {
        return pythonJobConfig;
    }

    public void setPythonJobConfig(PythonJobConfig pythonJobConfig) {
        this.pythonJobConfig = pythonJobConfig;
    }

    public JobConfig withSparkJobConfig(SparkJobConfig sparkJobConfig) {
        this.sparkJobConfig = sparkJobConfig;
        return this;
    }

    public JobConfig withSparkJobConfig(Consumer<SparkJobConfig> sparkJobConfigSetter) {
        if (this.sparkJobConfig == null) {
            this.sparkJobConfig = new SparkJobConfig();
            sparkJobConfigSetter.accept(this.sparkJobConfig);
        }

        return this;
    }

    /**
     * Get sparkJobConfig
     * @return sparkJobConfig
     */
    public SparkJobConfig getSparkJobConfig() {
        return sparkJobConfig;
    }

    public void setSparkJobConfig(SparkJobConfig sparkJobConfig) {
        this.sparkJobConfig = sparkJobConfig;
    }

    public JobConfig withTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        return this;
    }

    /**
     * 超时时间，即最长运行时间,超过该事件则终止。   可选，默认值为0，值0表示没有超时。
     * minimum: 0
     * maximum: 8640000
     * @return timeoutSeconds
     */
    public Integer getTimeoutSeconds() {
        return timeoutSeconds;
    }

    public void setTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
    }

    public JobConfig withMaxRetries(Integer maxRetries) {
        this.maxRetries = maxRetries;
        return this;
    }

    /**
     * 运行重试次数
     * minimum: 0
     * maximum: 100
     * @return maxRetries
     */
    public Integer getMaxRetries() {
        return maxRetries;
    }

    public void setMaxRetries(Integer maxRetries) {
        this.maxRetries = maxRetries;
    }

    public JobConfig withQueue(Boolean queue) {
        this.queue = queue;
        return this;
    }

    /**
     * 作业是否排队。 true: 排队 false：不排队
     * @return queue
     */
    public Boolean getQueue() {
        return queue;
    }

    public void setQueue(Boolean queue) {
        this.queue = queue;
    }

    public JobConfig withMaxConcurrentRuns(Integer maxConcurrentRuns) {
        this.maxConcurrentRuns = maxConcurrentRuns;
        return this;
    }

    /**
     * 作业允许的最大并发运行数可选。 Default: 1
     * minimum: 1
     * maximum: 100
     * @return maxConcurrentRuns
     */
    public Integer getMaxConcurrentRuns() {
        return maxConcurrentRuns;
    }

    public void setMaxConcurrentRuns(Integer maxConcurrentRuns) {
        this.maxConcurrentRuns = maxConcurrentRuns;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobConfig that = (JobConfig) obj;
        return Objects.equals(this.rayJobConfig, that.rayJobConfig)
            && Objects.equals(this.pythonJobConfig, that.pythonJobConfig)
            && Objects.equals(this.sparkJobConfig, that.sparkJobConfig)
            && Objects.equals(this.timeoutSeconds, that.timeoutSeconds)
            && Objects.equals(this.maxRetries, that.maxRetries) && Objects.equals(this.queue, that.queue)
            && Objects.equals(this.maxConcurrentRuns, that.maxConcurrentRuns);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(rayJobConfig, pythonJobConfig, sparkJobConfig, timeoutSeconds, maxRetries, queue, maxConcurrentRuns);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobConfig {\n");
        sb.append("    rayJobConfig: ").append(toIndentedString(rayJobConfig)).append("\n");
        sb.append("    pythonJobConfig: ").append(toIndentedString(pythonJobConfig)).append("\n");
        sb.append("    sparkJobConfig: ").append(toIndentedString(sparkJobConfig)).append("\n");
        sb.append("    timeoutSeconds: ").append(toIndentedString(timeoutSeconds)).append("\n");
        sb.append("    maxRetries: ").append(toIndentedString(maxRetries)).append("\n");
        sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
        sb.append("    maxConcurrentRuns: ").append(toIndentedString(maxConcurrentRuns)).append("\n");
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
