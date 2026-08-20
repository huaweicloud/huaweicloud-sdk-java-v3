package com.huaweicloud.sdk.aidatalakejobserver.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：资源规格配置，用于描述Driver或Executor的CPU、内存、磁盘资源配置。 
 */
public class ShowResourceSpecResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu")

    private Integer cpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory")

    private Integer memory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk")

    private Integer disk;

    public ShowResourceSpecResponse withCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * **参数解释**：CPU毫核数，用于指定Driver或Executor的CPU资源。 **取值范围**：最小值为1,默认值为1000。 
     * @return cpu
     */
    public Integer getCpu() {
        return cpu;
    }

    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }

    public ShowResourceSpecResponse withMemory(Integer memory) {
        this.memory = memory;
        return this;
    }

    /**
     * **参数解释**：内存大小，用于指定Driver或Executor的内存资源。 **取值范围**：单位为MB，最小值为1。默认值为4096。 
     * @return memory
     */
    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public ShowResourceSpecResponse withDisk(Integer disk) {
        this.disk = disk;
        return this;
    }

    /**
     * **参数解释**：本地磁盘大小，用于指定Driver或Executor的本地磁盘容量。 **取值范围**：单位为GB，最小值为0。 
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
        ShowResourceSpecResponse that = (ShowResourceSpecResponse) obj;
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
        sb.append("class ShowResourceSpecResponse {\n");
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
