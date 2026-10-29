package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：SQL Gateway的资源规格，仅FLINK_SQL_GATEWAY类型使用。 **约束限制**：SQL Gateway与JobManager的CPU之和不能超过48000毫核，内存之和不能超过393216 MB。
 */
public class FlinkSqlGatewayResourceSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu")

    private Integer cpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory")

    private Integer memory;

    public FlinkSqlGatewayResourceSpec withCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * **参数解释**：CPU毫核数，单位为毫核，用于指定SQL Gateway的CPU资源。 **约束限制**：SQL Gateway与JobManager的CPU之和不能超过48000毫核。 **取值范围**：500~47500。 **默认取值**：1000。
     * minimum: 500
     * maximum: 47500
     * @return cpu
     */
    public Integer getCpu() {
        return cpu;
    }

    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }

    public FlinkSqlGatewayResourceSpec withMemory(Integer memory) {
        this.memory = memory;
        return this;
    }

    /**
     * **参数解释**：内存大小，单位为MB，用于指定SQL Gateway的内存资源。 **约束限制**：SQL Gateway与JobManager的内存之和不能超过393216 MB。 **取值范围**：2048~391168。 **默认取值**：4096。
     * minimum: 2048
     * maximum: 391168
     * @return memory
     */
    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FlinkSqlGatewayResourceSpec that = (FlinkSqlGatewayResourceSpec) obj;
        return Objects.equals(this.cpu, that.cpu) && Objects.equals(this.memory, that.memory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpu, memory);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlinkSqlGatewayResourceSpec {\n");
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
