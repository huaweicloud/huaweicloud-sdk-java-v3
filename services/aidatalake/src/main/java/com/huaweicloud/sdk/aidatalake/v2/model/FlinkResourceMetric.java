package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：Flink作业运行实例上资源的指标信息。 
 */
public class FlinkResourceMetric {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_memory")

    private Long totalMemory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_cpu")

    private Long totalCpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_disk")

    private Long totalDisk;

    public FlinkResourceMetric withTotalMemory(Long totalMemory) {
        this.totalMemory = totalMemory;
        return this;
    }

    /**
     * **参数解释**：总内存，单位MB。 **取值范围**：0~9223372036854775807。 
     * @return totalMemory
     */
    public Long getTotalMemory() {
        return totalMemory;
    }

    public void setTotalMemory(Long totalMemory) {
        this.totalMemory = totalMemory;
    }

    public FlinkResourceMetric withTotalCpu(Long totalCpu) {
        this.totalCpu = totalCpu;
        return this;
    }

    /**
     * **参数解释**：总CPU，单位毫核。 **取值范围**：0~9223372036854775807。 
     * @return totalCpu
     */
    public Long getTotalCpu() {
        return totalCpu;
    }

    public void setTotalCpu(Long totalCpu) {
        this.totalCpu = totalCpu;
    }

    public FlinkResourceMetric withTotalDisk(Long totalDisk) {
        this.totalDisk = totalDisk;
        return this;
    }

    /**
     * **参数解释**：总磁盘容量，单位GB。 **取值范围**：0~9223372036854775807。 
     * @return totalDisk
     */
    public Long getTotalDisk() {
        return totalDisk;
    }

    public void setTotalDisk(Long totalDisk) {
        this.totalDisk = totalDisk;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FlinkResourceMetric that = (FlinkResourceMetric) obj;
        return Objects.equals(this.totalMemory, that.totalMemory) && Objects.equals(this.totalCpu, that.totalCpu)
            && Objects.equals(this.totalDisk, that.totalDisk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalMemory, totalCpu, totalDisk);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlinkResourceMetric {\n");
        sb.append("    totalMemory: ").append(toIndentedString(totalMemory)).append("\n");
        sb.append("    totalCpu: ").append(toIndentedString(totalCpu)).append("\n");
        sb.append("    totalDisk: ").append(toIndentedString(totalDisk)).append("\n");
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
