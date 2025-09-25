package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 内核执行模块耗时
 */
public class KernelExecutionTime {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "all_time")

    private Long allTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kernel_execution_time_details")

    private KernelExecTimeDetails kernelExecutionTimeDetails;

    public KernelExecutionTime withAllTime(Long allTime) {
        this.allTime = allTime;
        return this;
    }

    /**
     * **参数解释**: 总耗时（单位：微秒）。 **取值范围**: 不涉及。
     * @return allTime
     */
    public Long getAllTime() {
        return allTime;
    }

    public void setAllTime(Long allTime) {
        this.allTime = allTime;
    }

    public KernelExecutionTime withKernelExecutionTimeDetails(KernelExecTimeDetails kernelExecutionTimeDetails) {
        this.kernelExecutionTimeDetails = kernelExecutionTimeDetails;
        return this;
    }

    public KernelExecutionTime withKernelExecutionTimeDetails(
        Consumer<KernelExecTimeDetails> kernelExecutionTimeDetailsSetter) {
        if (this.kernelExecutionTimeDetails == null) {
            this.kernelExecutionTimeDetails = new KernelExecTimeDetails();
            kernelExecutionTimeDetailsSetter.accept(this.kernelExecutionTimeDetails);
        }

        return this;
    }

    /**
     * Get kernelExecutionTimeDetails
     * @return kernelExecutionTimeDetails
     */
    public KernelExecTimeDetails getKernelExecutionTimeDetails() {
        return kernelExecutionTimeDetails;
    }

    public void setKernelExecutionTimeDetails(KernelExecTimeDetails kernelExecutionTimeDetails) {
        this.kernelExecutionTimeDetails = kernelExecutionTimeDetails;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        KernelExecutionTime that = (KernelExecutionTime) obj;
        return Objects.equals(this.allTime, that.allTime)
            && Objects.equals(this.kernelExecutionTimeDetails, that.kernelExecutionTimeDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allTime, kernelExecutionTimeDetails);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KernelExecutionTime {\n");
        sb.append("    allTime: ").append(toIndentedString(allTime)).append("\n");
        sb.append("    kernelExecutionTimeDetails: ").append(toIndentedString(kernelExecutionTimeDetails)).append("\n");
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
