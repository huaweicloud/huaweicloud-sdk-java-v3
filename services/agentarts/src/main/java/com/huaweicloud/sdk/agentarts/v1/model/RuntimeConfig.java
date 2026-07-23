package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 任务运行时的环境与执行策略配置。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
 */
public class RuntimeConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_time")

    private Integer executionTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "concurrency")

    private Integer concurrency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "continue_on_exception")

    private Boolean continueOnException;

    public RuntimeConfig withExecutionTime(Integer executionTime) {
        this.executionTime = executionTime;
        return this;
    }

    /**
     * **参数解释：** 任务的预定执行时间（Unix 时间戳）。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
     * @return executionTime
     */
    public Integer getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(Integer executionTime) {
        this.executionTime = executionTime;
    }

    public RuntimeConfig withConcurrency(Integer concurrency) {
        this.concurrency = concurrency;
        return this;
    }

    /**
     * **参数解释：** 任务执行的并发数配置。 **约束限制：** 1到100之间的整数。 **取值范围：** 1 - 100。 **默认取值：** 不涉及。 
     * minimum: 1
     * maximum: 100
     * @return concurrency
     */
    public Integer getConcurrency() {
        return concurrency;
    }

    public void setConcurrency(Integer concurrency) {
        this.concurrency = concurrency;
    }

    public RuntimeConfig withContinueOnException(Boolean continueOnException) {
        this.continueOnException = continueOnException;
        return this;
    }

    /**
     * **参数解释：** 异常处理策略，是否在遇到非致命异常时继续。 **约束限制：** 不涉及。 **取值范围：** true, false。 **默认取值：** 不涉及。 
     * @return continueOnException
     */
    public Boolean getContinueOnException() {
        return continueOnException;
    }

    public void setContinueOnException(Boolean continueOnException) {
        this.continueOnException = continueOnException;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RuntimeConfig that = (RuntimeConfig) obj;
        return Objects.equals(this.executionTime, that.executionTime)
            && Objects.equals(this.concurrency, that.concurrency)
            && Objects.equals(this.continueOnException, that.continueOnException);
    }

    @Override
    public int hashCode() {
        return Objects.hash(executionTime, concurrency, continueOnException);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RuntimeConfig {\n");
        sb.append("    executionTime: ").append(toIndentedString(executionTime)).append("\n");
        sb.append("    concurrency: ").append(toIndentedString(concurrency)).append("\n");
        sb.append("    continueOnException: ").append(toIndentedString(continueOnException)).append("\n");
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
