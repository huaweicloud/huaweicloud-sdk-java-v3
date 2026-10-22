package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：SparkSql端点的Executor资源配置。 
 */
public class SparkExecutorResourceSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu")

    private Integer cpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory")

    private Integer memory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_executor_numbers")

    private Integer minExecutorNumbers;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_executor_numbers")

    private Integer maxExecutorNumbers;

    public SparkExecutorResourceSpec withCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * **参数解释**：Spark Executor CPU，单位毫核。 **约束限制**：不涉及。 **取值范围**：1000~48000。 **默认取值**：不涉及。
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

    public SparkExecutorResourceSpec withMemory(Integer memory) {
        this.memory = memory;
        return this;
    }

    /**
     * **参数解释**：Spark Executor内存大小，单位MB，1GB=1024MB。 **约束限制**：不涉及。 **取值范围**：1024~393216。 **默认取值**：不涉及。
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

    public SparkExecutorResourceSpec withMinExecutorNumbers(Integer minExecutorNumbers) {
        this.minExecutorNumbers = minExecutorNumbers;
        return this;
    }

    /**
     * **参数解释**：Spark Executor最小数量。 **约束限制**：不涉及。 **取值范围**：1~2147483647。 **默认取值**：不涉及。
     * minimum: 1
     * @return minExecutorNumbers
     */
    public Integer getMinExecutorNumbers() {
        return minExecutorNumbers;
    }

    public void setMinExecutorNumbers(Integer minExecutorNumbers) {
        this.minExecutorNumbers = minExecutorNumbers;
    }

    public SparkExecutorResourceSpec withMaxExecutorNumbers(Integer maxExecutorNumbers) {
        this.maxExecutorNumbers = maxExecutorNumbers;
        return this;
    }

    /**
     * **参数解释**：Spark Executor最大数量。 **约束限制**：不涉及。 **取值范围**：1~1000。 **默认取值**：不涉及。
     * minimum: 1
     * maximum: 1000
     * @return maxExecutorNumbers
     */
    public Integer getMaxExecutorNumbers() {
        return maxExecutorNumbers;
    }

    public void setMaxExecutorNumbers(Integer maxExecutorNumbers) {
        this.maxExecutorNumbers = maxExecutorNumbers;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SparkExecutorResourceSpec that = (SparkExecutorResourceSpec) obj;
        return Objects.equals(this.cpu, that.cpu) && Objects.equals(this.memory, that.memory)
            && Objects.equals(this.minExecutorNumbers, that.minExecutorNumbers)
            && Objects.equals(this.maxExecutorNumbers, that.maxExecutorNumbers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpu, memory, minExecutorNumbers, maxExecutorNumbers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SparkExecutorResourceSpec {\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
        sb.append("    minExecutorNumbers: ").append(toIndentedString(minExecutorNumbers)).append("\n");
        sb.append("    maxExecutorNumbers: ").append(toIndentedString(maxExecutorNumbers)).append("\n");
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
