package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：SQL Gateway 的资源规格，包含CPU和内存配额。
 */
public class ShowFlinkSqlGatewayResourceSpecResponseBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu")

    private Integer cpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory")

    private Integer memory;

    public ShowFlinkSqlGatewayResourceSpecResponseBody withCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * **参数解释**：CPU毫核数，单位为毫核。 **取值范围**：500~47500。
     * @return cpu
     */
    public Integer getCpu() {
        return cpu;
    }

    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }

    public ShowFlinkSqlGatewayResourceSpecResponseBody withMemory(Integer memory) {
        this.memory = memory;
        return this;
    }

    /**
     * **参数解释**：内存大小，单位为MB。 **取值范围**：2048~391168。
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
        ShowFlinkSqlGatewayResourceSpecResponseBody that = (ShowFlinkSqlGatewayResourceSpecResponseBody) obj;
        return Objects.equals(this.cpu, that.cpu) && Objects.equals(this.memory, that.memory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpu, memory);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowFlinkSqlGatewayResourceSpecResponseBody {\n");
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
