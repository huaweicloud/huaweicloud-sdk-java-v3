package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ExecutionTimeDetailsInfo
 */
public class ExecutionTimeDetailsInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_time")

    private ResourceTime resourceTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kernel_time")

    private KernelTime kernelTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kernel_execution_time")

    private KernelExecutionTime kernelExecutionTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wait_event_time")

    private WaitEventTime waitEventTime;

    public ExecutionTimeDetailsInfo withResourceTime(ResourceTime resourceTime) {
        this.resourceTime = resourceTime;
        return this;
    }

    public ExecutionTimeDetailsInfo withResourceTime(Consumer<ResourceTime> resourceTimeSetter) {
        if (this.resourceTime == null) {
            this.resourceTime = new ResourceTime();
            resourceTimeSetter.accept(this.resourceTime);
        }

        return this;
    }

    /**
     * Get resourceTime
     * @return resourceTime
     */
    public ResourceTime getResourceTime() {
        return resourceTime;
    }

    public void setResourceTime(ResourceTime resourceTime) {
        this.resourceTime = resourceTime;
    }

    public ExecutionTimeDetailsInfo withKernelTime(KernelTime kernelTime) {
        this.kernelTime = kernelTime;
        return this;
    }

    public ExecutionTimeDetailsInfo withKernelTime(Consumer<KernelTime> kernelTimeSetter) {
        if (this.kernelTime == null) {
            this.kernelTime = new KernelTime();
            kernelTimeSetter.accept(this.kernelTime);
        }

        return this;
    }

    /**
     * Get kernelTime
     * @return kernelTime
     */
    public KernelTime getKernelTime() {
        return kernelTime;
    }

    public void setKernelTime(KernelTime kernelTime) {
        this.kernelTime = kernelTime;
    }

    public ExecutionTimeDetailsInfo withKernelExecutionTime(KernelExecutionTime kernelExecutionTime) {
        this.kernelExecutionTime = kernelExecutionTime;
        return this;
    }

    public ExecutionTimeDetailsInfo withKernelExecutionTime(Consumer<KernelExecutionTime> kernelExecutionTimeSetter) {
        if (this.kernelExecutionTime == null) {
            this.kernelExecutionTime = new KernelExecutionTime();
            kernelExecutionTimeSetter.accept(this.kernelExecutionTime);
        }

        return this;
    }

    /**
     * Get kernelExecutionTime
     * @return kernelExecutionTime
     */
    public KernelExecutionTime getKernelExecutionTime() {
        return kernelExecutionTime;
    }

    public void setKernelExecutionTime(KernelExecutionTime kernelExecutionTime) {
        this.kernelExecutionTime = kernelExecutionTime;
    }

    public ExecutionTimeDetailsInfo withWaitEventTime(WaitEventTime waitEventTime) {
        this.waitEventTime = waitEventTime;
        return this;
    }

    public ExecutionTimeDetailsInfo withWaitEventTime(Consumer<WaitEventTime> waitEventTimeSetter) {
        if (this.waitEventTime == null) {
            this.waitEventTime = new WaitEventTime();
            waitEventTimeSetter.accept(this.waitEventTime);
        }

        return this;
    }

    /**
     * Get waitEventTime
     * @return waitEventTime
     */
    public WaitEventTime getWaitEventTime() {
        return waitEventTime;
    }

    public void setWaitEventTime(WaitEventTime waitEventTime) {
        this.waitEventTime = waitEventTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExecutionTimeDetailsInfo that = (ExecutionTimeDetailsInfo) obj;
        return Objects.equals(this.resourceTime, that.resourceTime) && Objects.equals(this.kernelTime, that.kernelTime)
            && Objects.equals(this.kernelExecutionTime, that.kernelExecutionTime)
            && Objects.equals(this.waitEventTime, that.waitEventTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceTime, kernelTime, kernelExecutionTime, waitEventTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecutionTimeDetailsInfo {\n");
        sb.append("    resourceTime: ").append(toIndentedString(resourceTime)).append("\n");
        sb.append("    kernelTime: ").append(toIndentedString(kernelTime)).append("\n");
        sb.append("    kernelExecutionTime: ").append(toIndentedString(kernelExecutionTime)).append("\n");
        sb.append("    waitEventTime: ").append(toIndentedString(waitEventTime)).append("\n");
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
