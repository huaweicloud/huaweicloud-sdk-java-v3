package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：可选资源配置枚举。 
 */
public class WorkerSizeInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu")

    private Integer cpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mem")

    private Integer mem;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accelerator")

    private Integer accelerator;

    public WorkerSizeInfo withCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * **参数解释**：可选资源配置项中的cpu大小，即单个worker的cpu配置大小，单位毫核。 **取值范围**：小于等于资源池该规格cpu大小。 
     * @return cpu
     */
    public Integer getCpu() {
        return cpu;
    }

    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }

    public WorkerSizeInfo withMem(Integer mem) {
        this.mem = mem;
        return this;
    }

    /**
     * **参数解释**：可选资源配置项中的内存大小，即单个worker的内存配置大小，单位MB。 **取值范围**：小于等于资源池该规格内存大小。 
     * @return mem
     */
    public Integer getMem() {
        return mem;
    }

    public void setMem(Integer mem) {
        this.mem = mem;
    }

    public WorkerSizeInfo withAccelerator(Integer accelerator) {
        this.accelerator = accelerator;
        return this;
    }

    /**
     * **参数解释**：可选资源配置项中的显卡数量，即单个worker的显卡配置数量，单位卡。 **取值范围**：小于等于资源池该规格显卡大小。 
     * @return accelerator
     */
    public Integer getAccelerator() {
        return accelerator;
    }

    public void setAccelerator(Integer accelerator) {
        this.accelerator = accelerator;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkerSizeInfo that = (WorkerSizeInfo) obj;
        return Objects.equals(this.cpu, that.cpu) && Objects.equals(this.mem, that.mem)
            && Objects.equals(this.accelerator, that.accelerator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpu, mem, accelerator);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkerSizeInfo {\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    mem: ").append(toIndentedString(mem)).append("\n");
        sb.append("    accelerator: ").append(toIndentedString(accelerator)).append("\n");
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
