package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：SQL Gateway的资源规格，仅FLINK_SQL_GATEWAY类型使用。 **约束限制**：不涉及。
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
     * **参数解释**：SQL Gateway的CPU配额，单位为毫核。 **约束限制**：不涉及。 **取值范围**：100~48000。 **默认取值**：500。
     * minimum: 100
     * maximum: 48000
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
     * **参数解释**：SQL Gateway的内存配额，单位为MB。 **约束限制**：不涉及。 **取值范围**：128~393216。 **默认取值**：1000。
     * minimum: 128
     * maximum: 393216
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
