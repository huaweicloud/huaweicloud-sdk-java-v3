package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * SparkClusterConfig
 */
public class SparkClusterConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aging_time")

    private Integer agingTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_stop_config")

    private AutoStopConfig autoStopConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "driver_resource_spec")

    private SparkDriverResourceSpec driverResourceSpec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executor_resource_spec")

    private SparkExecutorResourceSpec executorResourceSpec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_clusters")

    private Integer minClusters;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_clusters")

    private Integer maxClusters;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_cluster_concurrent_queries")

    private Integer maxClusterConcurrentQueries;

    public SparkClusterConfig withAgingTime(Integer agingTime) {
        this.agingTime = agingTime;
        return this;
    }

    /**
     * **参数解释**：集群老化时间（小时）。 **约束限制**：不涉及。 **取值范围**：1~12。 **默认取值**：6。 
     * minimum: 1
     * maximum: 12
     * @return agingTime
     */
    public Integer getAgingTime() {
        return agingTime;
    }

    public void setAgingTime(Integer agingTime) {
        this.agingTime = agingTime;
    }

    public SparkClusterConfig withAutoStopConfig(AutoStopConfig autoStopConfig) {
        this.autoStopConfig = autoStopConfig;
        return this;
    }

    public SparkClusterConfig withAutoStopConfig(Consumer<AutoStopConfig> autoStopConfigSetter) {
        if (this.autoStopConfig == null) {
            this.autoStopConfig = new AutoStopConfig();
            autoStopConfigSetter.accept(this.autoStopConfig);
        }

        return this;
    }

    /**
     * Get autoStopConfig
     * @return autoStopConfig
     */
    public AutoStopConfig getAutoStopConfig() {
        return autoStopConfig;
    }

    public void setAutoStopConfig(AutoStopConfig autoStopConfig) {
        this.autoStopConfig = autoStopConfig;
    }

    public SparkClusterConfig withDriverResourceSpec(SparkDriverResourceSpec driverResourceSpec) {
        this.driverResourceSpec = driverResourceSpec;
        return this;
    }

    public SparkClusterConfig withDriverResourceSpec(Consumer<SparkDriverResourceSpec> driverResourceSpecSetter) {
        if (this.driverResourceSpec == null) {
            this.driverResourceSpec = new SparkDriverResourceSpec();
            driverResourceSpecSetter.accept(this.driverResourceSpec);
        }

        return this;
    }

    /**
     * Get driverResourceSpec
     * @return driverResourceSpec
     */
    public SparkDriverResourceSpec getDriverResourceSpec() {
        return driverResourceSpec;
    }

    public void setDriverResourceSpec(SparkDriverResourceSpec driverResourceSpec) {
        this.driverResourceSpec = driverResourceSpec;
    }

    public SparkClusterConfig withExecutorResourceSpec(SparkExecutorResourceSpec executorResourceSpec) {
        this.executorResourceSpec = executorResourceSpec;
        return this;
    }

    public SparkClusterConfig withExecutorResourceSpec(Consumer<SparkExecutorResourceSpec> executorResourceSpecSetter) {
        if (this.executorResourceSpec == null) {
            this.executorResourceSpec = new SparkExecutorResourceSpec();
            executorResourceSpecSetter.accept(this.executorResourceSpec);
        }

        return this;
    }

    /**
     * Get executorResourceSpec
     * @return executorResourceSpec
     */
    public SparkExecutorResourceSpec getExecutorResourceSpec() {
        return executorResourceSpec;
    }

    public void setExecutorResourceSpec(SparkExecutorResourceSpec executorResourceSpec) {
        this.executorResourceSpec = executorResourceSpec;
    }

    public SparkClusterConfig withMinClusters(Integer minClusters) {
        this.minClusters = minClusters;
        return this;
    }

    /**
     * **参数解释**：最小集群数量。 **约束限制**：不涉及。 **取值范围**：0~20。 **默认取值**：2。 
     * maximum: 20
     * @return minClusters
     */
    public Integer getMinClusters() {
        return minClusters;
    }

    public void setMinClusters(Integer minClusters) {
        this.minClusters = minClusters;
    }

    public SparkClusterConfig withMaxClusters(Integer maxClusters) {
        this.maxClusters = maxClusters;
        return this;
    }

    /**
     * **参数解释**：最大集群数量。 **约束限制**：不涉及。 **取值范围**：2~20。 **默认取值**：6。 
     * minimum: 2
     * maximum: 20
     * @return maxClusters
     */
    public Integer getMaxClusters() {
        return maxClusters;
    }

    public void setMaxClusters(Integer maxClusters) {
        this.maxClusters = maxClusters;
    }

    public SparkClusterConfig withMaxClusterConcurrentQueries(Integer maxClusterConcurrentQueries) {
        this.maxClusterConcurrentQueries = maxClusterConcurrentQueries;
        return this;
    }

    /**
     * **参数解释**：集群最大并发SQL数量。 **约束限制**：不涉及。 **取值范围**：1~30。 **默认取值**：16。 
     * minimum: 1
     * maximum: 30
     * @return maxClusterConcurrentQueries
     */
    public Integer getMaxClusterConcurrentQueries() {
        return maxClusterConcurrentQueries;
    }

    public void setMaxClusterConcurrentQueries(Integer maxClusterConcurrentQueries) {
        this.maxClusterConcurrentQueries = maxClusterConcurrentQueries;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SparkClusterConfig that = (SparkClusterConfig) obj;
        return Objects.equals(this.agingTime, that.agingTime)
            && Objects.equals(this.autoStopConfig, that.autoStopConfig)
            && Objects.equals(this.driverResourceSpec, that.driverResourceSpec)
            && Objects.equals(this.executorResourceSpec, that.executorResourceSpec)
            && Objects.equals(this.minClusters, that.minClusters) && Objects.equals(this.maxClusters, that.maxClusters)
            && Objects.equals(this.maxClusterConcurrentQueries, that.maxClusterConcurrentQueries);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agingTime,
            autoStopConfig,
            driverResourceSpec,
            executorResourceSpec,
            minClusters,
            maxClusters,
            maxClusterConcurrentQueries);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SparkClusterConfig {\n");
        sb.append("    agingTime: ").append(toIndentedString(agingTime)).append("\n");
        sb.append("    autoStopConfig: ").append(toIndentedString(autoStopConfig)).append("\n");
        sb.append("    driverResourceSpec: ").append(toIndentedString(driverResourceSpec)).append("\n");
        sb.append("    executorResourceSpec: ").append(toIndentedString(executorResourceSpec)).append("\n");
        sb.append("    minClusters: ").append(toIndentedString(minClusters)).append("\n");
        sb.append("    maxClusters: ").append(toIndentedString(maxClusters)).append("\n");
        sb.append("    maxClusterConcurrentQueries: ")
            .append(toIndentedString(maxClusterConcurrentQueries))
            .append("\n");
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
