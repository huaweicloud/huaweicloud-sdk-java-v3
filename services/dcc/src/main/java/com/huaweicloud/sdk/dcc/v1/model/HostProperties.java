package com.huaweicloud.sdk.dcc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * HostProperties
 */
public class HostProperties {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_cores")

    private Integer cpuCores;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory_mb")

    private Integer memoryMb;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_speed")

    private String cpuSpeed;

    public HostProperties withCpuCores(Integer cpuCores) {
        this.cpuCores = cpuCores;
        return this;
    }

    /**
     * 核数。
     * @return cpuCores
     */
    public Integer getCpuCores() {
        return cpuCores;
    }

    public void setCpuCores(Integer cpuCores) {
        this.cpuCores = cpuCores;
    }

    public HostProperties withMemoryMb(Integer memoryMb) {
        this.memoryMb = memoryMb;
        return this;
    }

    /**
     * 内存。
     * @return memoryMb
     */
    public Integer getMemoryMb() {
        return memoryMb;
    }

    public void setMemoryMb(Integer memoryMb) {
        this.memoryMb = memoryMb;
    }

    public HostProperties withCpuSpeed(String cpuSpeed) {
        this.cpuSpeed = cpuSpeed;
        return this;
    }

    /**
     * 主频。
     * @return cpuSpeed
     */
    public String getCpuSpeed() {
        return cpuSpeed;
    }

    public void setCpuSpeed(String cpuSpeed) {
        this.cpuSpeed = cpuSpeed;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HostProperties that = (HostProperties) obj;
        return Objects.equals(this.cpuCores, that.cpuCores) && Objects.equals(this.memoryMb, that.memoryMb)
            && Objects.equals(this.cpuSpeed, that.cpuSpeed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpuCores, memoryMb, cpuSpeed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HostProperties {\n");
        sb.append("    cpuCores: ").append(toIndentedString(cpuCores)).append("\n");
        sb.append("    memoryMb: ").append(toIndentedString(memoryMb)).append("\n");
        sb.append("    cpuSpeed: ").append(toIndentedString(cpuSpeed)).append("\n");
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
