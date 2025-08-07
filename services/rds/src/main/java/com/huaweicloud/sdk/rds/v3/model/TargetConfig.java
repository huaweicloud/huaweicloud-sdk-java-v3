package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TargetConfig
 */
public class TargetConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private String flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu")

    private String cpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mem")

    private String mem;

    public TargetConfig withFlavor(String flavor) {
        this.flavor = flavor;
        return this;
    }

    /**
     * 当name=RESIZE_FLAVOR时，表示规格变更任务的目标规格。
     * @return flavor
     */
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public TargetConfig withCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * 当name=RESIZE_FLAVOR时，表示规格变更任务的的目标cpu。
     * @return cpu
     */
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public TargetConfig withMem(String mem) {
        this.mem = mem;
        return this;
    }

    /**
     * 当name=RESIZE_FLAVOR时，表示规格变更任务的目标内存。
     * @return mem
     */
    public String getMem() {
        return mem;
    }

    public void setMem(String mem) {
        this.mem = mem;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TargetConfig that = (TargetConfig) obj;
        return Objects.equals(this.flavor, that.flavor) && Objects.equals(this.cpu, that.cpu)
            && Objects.equals(this.mem, that.mem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavor, cpu, mem);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TargetConfig {\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    mem: ").append(toIndentedString(mem)).append("\n");
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
