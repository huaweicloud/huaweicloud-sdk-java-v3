package com.huaweicloud.sdk.aidatalakejobserver.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：资源配置信息，包含Driver和Executor的资源配置。
 */
public class ShowSparkResourceConfigResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "driver_resource_spec")

    private ShowResourceSpecResponse driverResourceSpec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executor_resource_spec")

    private ShowResourceSpecResponse executorResourceSpec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executor_number")

    private Integer executorNumber;

    public ShowSparkResourceConfigResponse withDriverResourceSpec(ShowResourceSpecResponse driverResourceSpec) {
        this.driverResourceSpec = driverResourceSpec;
        return this;
    }

    public ShowSparkResourceConfigResponse withDriverResourceSpec(
        Consumer<ShowResourceSpecResponse> driverResourceSpecSetter) {
        if (this.driverResourceSpec == null) {
            this.driverResourceSpec = new ShowResourceSpecResponse();
            driverResourceSpecSetter.accept(this.driverResourceSpec);
        }

        return this;
    }

    /**
     * Get driverResourceSpec
     * @return driverResourceSpec
     */
    public ShowResourceSpecResponse getDriverResourceSpec() {
        return driverResourceSpec;
    }

    public void setDriverResourceSpec(ShowResourceSpecResponse driverResourceSpec) {
        this.driverResourceSpec = driverResourceSpec;
    }

    public ShowSparkResourceConfigResponse withExecutorResourceSpec(ShowResourceSpecResponse executorResourceSpec) {
        this.executorResourceSpec = executorResourceSpec;
        return this;
    }

    public ShowSparkResourceConfigResponse withExecutorResourceSpec(
        Consumer<ShowResourceSpecResponse> executorResourceSpecSetter) {
        if (this.executorResourceSpec == null) {
            this.executorResourceSpec = new ShowResourceSpecResponse();
            executorResourceSpecSetter.accept(this.executorResourceSpec);
        }

        return this;
    }

    /**
     * Get executorResourceSpec
     * @return executorResourceSpec
     */
    public ShowResourceSpecResponse getExecutorResourceSpec() {
        return executorResourceSpec;
    }

    public void setExecutorResourceSpec(ShowResourceSpecResponse executorResourceSpec) {
        this.executorResourceSpec = executorResourceSpec;
    }

    public ShowSparkResourceConfigResponse withExecutorNumber(Integer executorNumber) {
        this.executorNumber = executorNumber;
        return this;
    }

    /**
     * **参数解释**：Spark作业的最大executor个数，用于动态资源分配。 **取值范围**：大于0的整数。 当配置“executor_number”时，表示启用动态资源分配：spark.dynamicAllocation.enabled=true,spark.dynamicAllocation.minExecutor=1,spark.dynamicAllocation.maxExecutors=executor_number,spark.dynamicAllocation.initialExecutors=1。如需修改上述参数，可通过properties字段设置spark相关参数。
     * @return executorNumber
     */
    public Integer getExecutorNumber() {
        return executorNumber;
    }

    public void setExecutorNumber(Integer executorNumber) {
        this.executorNumber = executorNumber;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSparkResourceConfigResponse that = (ShowSparkResourceConfigResponse) obj;
        return Objects.equals(this.driverResourceSpec, that.driverResourceSpec)
            && Objects.equals(this.executorResourceSpec, that.executorResourceSpec)
            && Objects.equals(this.executorNumber, that.executorNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(driverResourceSpec, executorResourceSpec, executorNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSparkResourceConfigResponse {\n");
        sb.append("    driverResourceSpec: ").append(toIndentedString(driverResourceSpec)).append("\n");
        sb.append("    executorResourceSpec: ").append(toIndentedString(executorResourceSpec)).append("\n");
        sb.append("    executorNumber: ").append(toIndentedString(executorNumber)).append("\n");
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
