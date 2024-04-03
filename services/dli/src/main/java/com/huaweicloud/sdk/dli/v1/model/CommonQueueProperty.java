package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CommonQueueProperty
 */
public class CommonQueueProperty {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "computeEngine.maxInstance")

    private Integer computeEngineMaxInstance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job.maxConcurrent")

    private Integer jobMaxConcurrent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "computeEngine.maxPrefetchInstance")

    private Integer computeEngineMaxPrefetchInstance;

    public CommonQueueProperty withComputeEngineMaxInstance(Integer computeEngineMaxInstance) {
        this.computeEngineMaxInstance = computeEngineMaxInstance;
        return this;
    }

    /**
     * 队列能启动的最大spark driver数量
     * @return computeEngineMaxInstance
     */
    public Integer getComputeEngineMaxInstance() {
        return computeEngineMaxInstance;
    }

    public void setComputeEngineMaxInstance(Integer computeEngineMaxInstance) {
        this.computeEngineMaxInstance = computeEngineMaxInstance;
    }

    public CommonQueueProperty withJobMaxConcurrent(Integer jobMaxConcurrent) {
        this.jobMaxConcurrent = jobMaxConcurrent;
        return this;
    }

    /**
     * 单个spark driver能同时运行的最大任务数量
     * minimum: 1
     * maximum: 32
     * @return jobMaxConcurrent
     */
    public Integer getJobMaxConcurrent() {
        return jobMaxConcurrent;
    }

    public void setJobMaxConcurrent(Integer jobMaxConcurrent) {
        this.jobMaxConcurrent = jobMaxConcurrent;
    }

    public CommonQueueProperty withComputeEngineMaxPrefetchInstance(Integer computeEngineMaxPrefetchInstance) {
        this.computeEngineMaxPrefetchInstance = computeEngineMaxPrefetchInstance;
        return this;
    }

    /**
     * 队列预先启动的最大spark driver数量
     * @return computeEngineMaxPrefetchInstance
     */
    public Integer getComputeEngineMaxPrefetchInstance() {
        return computeEngineMaxPrefetchInstance;
    }

    public void setComputeEngineMaxPrefetchInstance(Integer computeEngineMaxPrefetchInstance) {
        this.computeEngineMaxPrefetchInstance = computeEngineMaxPrefetchInstance;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CommonQueueProperty that = (CommonQueueProperty) obj;
        return Objects.equals(this.computeEngineMaxInstance, that.computeEngineMaxInstance)
            && Objects.equals(this.jobMaxConcurrent, that.jobMaxConcurrent)
            && Objects.equals(this.computeEngineMaxPrefetchInstance, that.computeEngineMaxPrefetchInstance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(computeEngineMaxInstance, jobMaxConcurrent, computeEngineMaxPrefetchInstance);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommonQueueProperty {\n");
        sb.append("    computeEngineMaxInstance: ").append(toIndentedString(computeEngineMaxInstance)).append("\n");
        sb.append("    jobMaxConcurrent: ").append(toIndentedString(jobMaxConcurrent)).append("\n");
        sb.append("    computeEngineMaxPrefetchInstance: ")
            .append(toIndentedString(computeEngineMaxPrefetchInstance))
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
