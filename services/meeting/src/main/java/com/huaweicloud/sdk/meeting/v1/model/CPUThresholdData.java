package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CPU阈值查询结果结构体
 */
public class CPUThresholdData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu")

    private Integer cpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpuDefault")

    private Integer cpuDefault;

    public CPUThresholdData withCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * 自定义的cpu阈值，单位为百分比(%)
     * minimum: 0
     * maximum: 100
     * @return cpu
     */
    public Integer getCpu() {
        return cpu;
    }

    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }

    public CPUThresholdData withCpuDefault(Integer cpuDefault) {
        this.cpuDefault = cpuDefault;
        return this;
    }

    /**
     * cpu阈值默认值，单位为百分比(%)
     * minimum: 0
     * maximum: 100
     * @return cpuDefault
     */
    public Integer getCpuDefault() {
        return cpuDefault;
    }

    public void setCpuDefault(Integer cpuDefault) {
        this.cpuDefault = cpuDefault;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CPUThresholdData cpUThresholdData = (CPUThresholdData) o;
        return Objects.equals(this.cpu, cpUThresholdData.cpu)
            && Objects.equals(this.cpuDefault, cpUThresholdData.cpuDefault);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpu, cpuDefault);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CPUThresholdData {\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    cpuDefault: ").append(toIndentedString(cpuDefault)).append("\n");
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
