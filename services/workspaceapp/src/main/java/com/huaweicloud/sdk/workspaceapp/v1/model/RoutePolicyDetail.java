package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 路由策略。
 */
public class RoutePolicyDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_session")

    private Integer maxSession;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_threshold")

    private Integer cpuThreshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gpu_threshold")

    private Integer gpuThreshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mem_threshold")

    private Integer memThreshold;

    public RoutePolicyDetail withMaxSession(Integer maxSession) {
        this.maxSession = maxSession;
        return this;
    }

    /**
     * 单台服务器最大的连接会话数。
     * minimum: 1
     * maximum: 1024
     * @return maxSession
     */
    public Integer getMaxSession() {
        return maxSession;
    }

    public void setMaxSession(Integer maxSession) {
        this.maxSession = maxSession;
    }

    public RoutePolicyDetail withCpuThreshold(Integer cpuThreshold) {
        this.cpuThreshold = cpuThreshold;
        return this;
    }

    /**
     * cpu使用率阈值，单位为%。
     * minimum: 1
     * maximum: 100
     * @return cpuThreshold
     */
    public Integer getCpuThreshold() {
        return cpuThreshold;
    }

    public void setCpuThreshold(Integer cpuThreshold) {
        this.cpuThreshold = cpuThreshold;
    }

    public RoutePolicyDetail withGpuThreshold(Integer gpuThreshold) {
        this.gpuThreshold = gpuThreshold;
        return this;
    }

    /**
     * gpu显存使用率阈值，单位为%。
     * minimum: 1
     * maximum: 100
     * @return gpuThreshold
     */
    public Integer getGpuThreshold() {
        return gpuThreshold;
    }

    public void setGpuThreshold(Integer gpuThreshold) {
        this.gpuThreshold = gpuThreshold;
    }

    public RoutePolicyDetail withMemThreshold(Integer memThreshold) {
        this.memThreshold = memThreshold;
        return this;
    }

    /**
     * 内存使用率阈值，单位为%。
     * minimum: 1
     * maximum: 100
     * @return memThreshold
     */
    public Integer getMemThreshold() {
        return memThreshold;
    }

    public void setMemThreshold(Integer memThreshold) {
        this.memThreshold = memThreshold;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RoutePolicyDetail that = (RoutePolicyDetail) obj;
        return Objects.equals(this.maxSession, that.maxSession) && Objects.equals(this.cpuThreshold, that.cpuThreshold)
            && Objects.equals(this.gpuThreshold, that.gpuThreshold)
            && Objects.equals(this.memThreshold, that.memThreshold);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxSession, cpuThreshold, gpuThreshold, memThreshold);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RoutePolicyDetail {\n");
        sb.append("    maxSession: ").append(toIndentedString(maxSession)).append("\n");
        sb.append("    cpuThreshold: ").append(toIndentedString(cpuThreshold)).append("\n");
        sb.append("    gpuThreshold: ").append(toIndentedString(gpuThreshold)).append("\n");
        sb.append("    memThreshold: ").append(toIndentedString(memThreshold)).append("\n");
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
