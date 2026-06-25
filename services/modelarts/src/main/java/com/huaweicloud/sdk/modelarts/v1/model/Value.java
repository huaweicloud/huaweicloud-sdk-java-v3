package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 资源量。
 */
public class Value {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu")

    private String cpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory")

    private String memory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tnt004")

    private String tnt004;

    public Value withCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * cpu量，即计算资源量。
     * @return cpu
     */
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public Value withMemory(String memory) {
        this.memory = memory;
        return this;
    }

    /**
     * 内存。
     * @return memory
     */
    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public Value withTnt004(String tnt004) {
        this.tnt004 = tnt004;
        return this;
    }

    /**
     * GPU卡的数量。
     * @return tnt004
     */
    public String getTnt004() {
        return tnt004;
    }

    public void setTnt004(String tnt004) {
        this.tnt004 = tnt004;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Value that = (Value) obj;
        return Objects.equals(this.cpu, that.cpu) && Objects.equals(this.memory, that.memory)
            && Objects.equals(this.tnt004, that.tnt004);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpu, memory, tnt004);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Value {\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
        sb.append("    tnt004: ").append(toIndentedString(tnt004)).append("\n");
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
