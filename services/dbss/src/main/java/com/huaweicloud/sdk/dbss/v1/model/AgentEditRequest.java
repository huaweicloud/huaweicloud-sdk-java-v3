package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AgentEditRequest
 */
public class AgentEditRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_threshold")

    private Integer cpuThreshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mem_threshold")

    private Integer memThreshold;

    public AgentEditRequest withCpuThreshold(Integer cpuThreshold) {
        this.cpuThreshold = cpuThreshold;
        return this;
    }

    /**
     * CPU阈值,0-100之间
     * @return cpuThreshold
     */
    public Integer getCpuThreshold() {
        return cpuThreshold;
    }

    public void setCpuThreshold(Integer cpuThreshold) {
        this.cpuThreshold = cpuThreshold;
    }

    public AgentEditRequest withMemThreshold(Integer memThreshold) {
        this.memThreshold = memThreshold;
        return this;
    }

    /**
     * 内存阈值，0-100之间
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
        AgentEditRequest that = (AgentEditRequest) obj;
        return Objects.equals(this.cpuThreshold, that.cpuThreshold)
            && Objects.equals(this.memThreshold, that.memThreshold);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpuThreshold, memThreshold);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AgentEditRequest {\n");
        sb.append("    cpuThreshold: ").append(toIndentedString(cpuThreshold)).append("\n");
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
