package com.huaweicloud.sdk.aidatalakejobserver.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：Spark作业资源配置，用于配置Driver和Executor的资源规格和数量。 **约束限制**：不涉及。
 */
public class SparkResourceConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "driver_resource_spec")

    private ResourceSpec driverResourceSpec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executor_number")

    private Integer executorNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executor_resource_spec")

    private ResourceSpec executorResourceSpec;

    public SparkResourceConfig withDriverResourceSpec(ResourceSpec driverResourceSpec) {
        this.driverResourceSpec = driverResourceSpec;
        return this;
    }

    public SparkResourceConfig withDriverResourceSpec(Consumer<ResourceSpec> driverResourceSpecSetter) {
        if (this.driverResourceSpec == null) {
            this.driverResourceSpec = new ResourceSpec();
            driverResourceSpecSetter.accept(this.driverResourceSpec);
        }

        return this;
    }

    /**
     * Get driverResourceSpec
     * @return driverResourceSpec
     */
    public ResourceSpec getDriverResourceSpec() {
        return driverResourceSpec;
    }

    public void setDriverResourceSpec(ResourceSpec driverResourceSpec) {
        this.driverResourceSpec = driverResourceSpec;
    }

    public SparkResourceConfig withExecutorNumber(Integer executorNumber) {
        this.executorNumber = executorNumber;
        return this;
    }

    /**
     * **参数解释**：Executor数量，用于指定Spark作业的最大Executor个数。如果配置此参数，则表示启用动态资源分配，动态资源分配最小Executor数为1，初始Executor数为1，最大Executor数为配置值。 **约束限制**：不涉及。 **取值范围**：0~65535。 **默认取值**：不涉及。
     * minimum: 0
     * maximum: 65535
     * @return executorNumber
     */
    public Integer getExecutorNumber() {
        return executorNumber;
    }

    public void setExecutorNumber(Integer executorNumber) {
        this.executorNumber = executorNumber;
    }

    public SparkResourceConfig withExecutorResourceSpec(ResourceSpec executorResourceSpec) {
        this.executorResourceSpec = executorResourceSpec;
        return this;
    }

    public SparkResourceConfig withExecutorResourceSpec(Consumer<ResourceSpec> executorResourceSpecSetter) {
        if (this.executorResourceSpec == null) {
            this.executorResourceSpec = new ResourceSpec();
            executorResourceSpecSetter.accept(this.executorResourceSpec);
        }

        return this;
    }

    /**
     * Get executorResourceSpec
     * @return executorResourceSpec
     */
    public ResourceSpec getExecutorResourceSpec() {
        return executorResourceSpec;
    }

    public void setExecutorResourceSpec(ResourceSpec executorResourceSpec) {
        this.executorResourceSpec = executorResourceSpec;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SparkResourceConfig that = (SparkResourceConfig) obj;
        return Objects.equals(this.driverResourceSpec, that.driverResourceSpec)
            && Objects.equals(this.executorNumber, that.executorNumber)
            && Objects.equals(this.executorResourceSpec, that.executorResourceSpec);
    }

    @Override
    public int hashCode() {
        return Objects.hash(driverResourceSpec, executorNumber, executorResourceSpec);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SparkResourceConfig {\n");
        sb.append("    driverResourceSpec: ").append(toIndentedString(driverResourceSpec)).append("\n");
        sb.append("    executorNumber: ").append(toIndentedString(executorNumber)).append("\n");
        sb.append("    executorResourceSpec: ").append(toIndentedString(executorResourceSpec)).append("\n");
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
