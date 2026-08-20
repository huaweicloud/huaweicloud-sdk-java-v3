package com.huaweicloud.sdk.aidatalakejobserver.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：资源配置规格，用于指定作业使用CPU、内存、磁盘资源，可生成对Driver、Executor等资源的粗粒度描述。 **约束限制**：不涉及。 
 */
public class ResourceSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu")

    private Integer cpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory")

    private Integer memory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk")

    private Integer disk;

    public ResourceSpec withCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * **参数解释**：CPU核数，单位为毫核，用于指定作业运行所需的CPU资源。 **约束限制**：不涉及。 **取值范围**：最小值为1000，最大值为48000。 **默认取值**：1000。 
     * minimum: 1000
     * maximum: 48000
     * @return cpu
     */
    public Integer getCpu() {
        return cpu;
    }

    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }

    public ResourceSpec withMemory(Integer memory) {
        this.memory = memory;
        return this;
    }

    /**
     * **参数解释**：内存大小，单位为MB，用于指定作业运行所需的内存资源。 **约束限制**：不涉及。 **取值范围**：最小值为1024，最大值为393216。 **默认取值**：4096。 
     * minimum: 1024
     * maximum: 393216
     * @return memory
     */
    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public ResourceSpec withDisk(Integer disk) {
        this.disk = disk;
        return this;
    }

    /**
     * **参数解释**：本地磁盘大小，用于指定Spark作业Driver和Executor的本地磁盘资源。 **约束限制**：不涉及。 **取值范围**：单位为GB，最小值为0，最大值为994。 **默认取值**：不涉及。 
     * minimum: 0
     * maximum: 994
     * @return disk
     */
    public Integer getDisk() {
        return disk;
    }

    public void setDisk(Integer disk) {
        this.disk = disk;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceSpec that = (ResourceSpec) obj;
        return Objects.equals(this.cpu, that.cpu) && Objects.equals(this.memory, that.memory)
            && Objects.equals(this.disk, that.disk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpu, memory, disk);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceSpec {\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
        sb.append("    disk: ").append(toIndentedString(disk)).append("\n");
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
