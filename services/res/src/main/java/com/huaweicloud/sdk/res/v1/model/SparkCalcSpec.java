package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * spark自定义计算规格
 */
public class SparkCalcSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "driver_memory")

    private String driverMemory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "driver_cores")

    private Integer driverCores;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executor_memory")

    private String executorMemory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executor_cores")

    private Integer executorCores;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_executors")

    private Integer numExecutors;

    public SparkCalcSpec withDriverMemory(String driverMemory) {
        this.driverMemory = driverMemory;
        return this;
    }

    /**
     * driver内存
     * @return driverMemory
     */
    public String getDriverMemory() {
        return driverMemory;
    }

    public void setDriverMemory(String driverMemory) {
        this.driverMemory = driverMemory;
    }

    public SparkCalcSpec withDriverCores(Integer driverCores) {
        this.driverCores = driverCores;
        return this;
    }

    /**
     * driver核数
     * @return driverCores
     */
    public Integer getDriverCores() {
        return driverCores;
    }

    public void setDriverCores(Integer driverCores) {
        this.driverCores = driverCores;
    }

    public SparkCalcSpec withExecutorMemory(String executorMemory) {
        this.executorMemory = executorMemory;
        return this;
    }

    /**
     * executor内存
     * @return executorMemory
     */
    public String getExecutorMemory() {
        return executorMemory;
    }

    public void setExecutorMemory(String executorMemory) {
        this.executorMemory = executorMemory;
    }

    public SparkCalcSpec withExecutorCores(Integer executorCores) {
        this.executorCores = executorCores;
        return this;
    }

    /**
     * executor核数
     * @return executorCores
     */
    public Integer getExecutorCores() {
        return executorCores;
    }

    public void setExecutorCores(Integer executorCores) {
        this.executorCores = executorCores;
    }

    public SparkCalcSpec withNumExecutors(Integer numExecutors) {
        this.numExecutors = numExecutors;
        return this;
    }

    /**
     * executor个数
     * @return numExecutors
     */
    public Integer getNumExecutors() {
        return numExecutors;
    }

    public void setNumExecutors(Integer numExecutors) {
        this.numExecutors = numExecutors;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SparkCalcSpec sparkCalcSpec = (SparkCalcSpec) o;
        return Objects.equals(this.driverMemory, sparkCalcSpec.driverMemory)
            && Objects.equals(this.driverCores, sparkCalcSpec.driverCores)
            && Objects.equals(this.executorMemory, sparkCalcSpec.executorMemory)
            && Objects.equals(this.executorCores, sparkCalcSpec.executorCores)
            && Objects.equals(this.numExecutors, sparkCalcSpec.numExecutors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(driverMemory, driverCores, executorMemory, executorCores, numExecutors);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SparkCalcSpec {\n");
        sb.append("    driverMemory: ").append(toIndentedString(driverMemory)).append("\n");
        sb.append("    driverCores: ").append(toIndentedString(driverCores)).append("\n");
        sb.append("    executorMemory: ").append(toIndentedString(executorMemory)).append("\n");
        sb.append("    executorCores: ").append(toIndentedString(executorCores)).append("\n");
        sb.append("    numExecutors: ").append(toIndentedString(numExecutors)).append("\n");
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
