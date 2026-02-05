package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 基于资源的弹性策略。
 */
public class ScalingPolicyByResource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_usage_threshold")

    private Integer cpuUsageThreshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mem_usage_threshold")

    private Integer memUsageThreshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gpu_usage_threshold")

    private Integer gpuUsageThreshold;

    public ScalingPolicyByResource withCpuUsageThreshold(Integer cpuUsageThreshold) {
        this.cpuUsageThreshold = cpuUsageThreshold;
        return this;
    }

    /**
     * 分组的总cpu使用率(达到阈值后扩容)。
     * minimum: 1
     * maximum: 100
     * @return cpuUsageThreshold
     */
    public Integer getCpuUsageThreshold() {
        return cpuUsageThreshold;
    }

    public void setCpuUsageThreshold(Integer cpuUsageThreshold) {
        this.cpuUsageThreshold = cpuUsageThreshold;
    }

    public ScalingPolicyByResource withMemUsageThreshold(Integer memUsageThreshold) {
        this.memUsageThreshold = memUsageThreshold;
        return this;
    }

    /**
     * 分组的总mem使用率(达到改阈值后扩容)。
     * minimum: 1
     * maximum: 100
     * @return memUsageThreshold
     */
    public Integer getMemUsageThreshold() {
        return memUsageThreshold;
    }

    public void setMemUsageThreshold(Integer memUsageThreshold) {
        this.memUsageThreshold = memUsageThreshold;
    }

    public ScalingPolicyByResource withGpuUsageThreshold(Integer gpuUsageThreshold) {
        this.gpuUsageThreshold = gpuUsageThreshold;
        return this;
    }

    /**
     * 分组的总显存使用率(达到改阈值后扩容)。
     * minimum: 1
     * maximum: 100
     * @return gpuUsageThreshold
     */
    public Integer getGpuUsageThreshold() {
        return gpuUsageThreshold;
    }

    public void setGpuUsageThreshold(Integer gpuUsageThreshold) {
        this.gpuUsageThreshold = gpuUsageThreshold;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScalingPolicyByResource that = (ScalingPolicyByResource) obj;
        return Objects.equals(this.cpuUsageThreshold, that.cpuUsageThreshold)
            && Objects.equals(this.memUsageThreshold, that.memUsageThreshold)
            && Objects.equals(this.gpuUsageThreshold, that.gpuUsageThreshold);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpuUsageThreshold, memUsageThreshold, gpuUsageThreshold);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScalingPolicyByResource {\n");
        sb.append("    cpuUsageThreshold: ").append(toIndentedString(cpuUsageThreshold)).append("\n");
        sb.append("    memUsageThreshold: ").append(toIndentedString(memUsageThreshold)).append("\n");
        sb.append("    gpuUsageThreshold: ").append(toIndentedString(gpuUsageThreshold)).append("\n");
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
