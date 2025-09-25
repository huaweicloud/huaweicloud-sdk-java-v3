package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 内核模块耗时
 */
public class KernelTime {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "all_time")

    private Long allTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kernel_time_details")

    private KernelTimeDetails kernelTimeDetails;

    public KernelTime withAllTime(Long allTime) {
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

    public KernelTime withKernelTimeDetails(KernelTimeDetails kernelTimeDetails) {
        this.kernelTimeDetails = kernelTimeDetails;
        return this;
    }

    public KernelTime withKernelTimeDetails(Consumer<KernelTimeDetails> kernelTimeDetailsSetter) {
        if (this.kernelTimeDetails == null) {
            this.kernelTimeDetails = new KernelTimeDetails();
            kernelTimeDetailsSetter.accept(this.kernelTimeDetails);
        }

        return this;
    }

    /**
     * Get kernelTimeDetails
     * @return kernelTimeDetails
     */
    public KernelTimeDetails getKernelTimeDetails() {
        return kernelTimeDetails;
    }

    public void setKernelTimeDetails(KernelTimeDetails kernelTimeDetails) {
        this.kernelTimeDetails = kernelTimeDetails;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        KernelTime that = (KernelTime) obj;
        return Objects.equals(this.allTime, that.allTime)
            && Objects.equals(this.kernelTimeDetails, that.kernelTimeDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allTime, kernelTimeDetails);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KernelTime {\n");
        sb.append("    allTime: ").append(toIndentedString(allTime)).append("\n");
        sb.append("    kernelTimeDetails: ").append(toIndentedString(kernelTimeDetails)).append("\n");
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
