package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TaskInstanceSpecConResRequestRsp
 */
public class TaskInstanceSpecConResRequestRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu")

    private String cpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory")

    private String memory;

    public TaskInstanceSpecConResRequestRsp withCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * CPU申请值
     * @return cpu
     */
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public TaskInstanceSpecConResRequestRsp withMemory(String memory) {
        this.memory = memory;
        return this;
    }

    /**
     * 内存申请值
     * @return memory
     */
    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaskInstanceSpecConResRequestRsp taskInstanceSpecConResRequestRsp = (TaskInstanceSpecConResRequestRsp) o;
        return Objects.equals(this.cpu, taskInstanceSpecConResRequestRsp.cpu)
            && Objects.equals(this.memory, taskInstanceSpecConResRequestRsp.memory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpu, memory);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskInstanceSpecConResRequestRsp {\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
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
