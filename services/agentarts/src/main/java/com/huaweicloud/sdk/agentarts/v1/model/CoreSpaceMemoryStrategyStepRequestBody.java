package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 记忆策略执行步骤，定义策略中每个阶段的具体操作。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
 */
public class CoreSpaceMemoryStrategyStepRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step_order")

    private Integer stepOrder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instruction")

    private String instruction;

    public CoreSpaceMemoryStrategyStepRequestBody withStepOrder(Integer stepOrder) {
        this.stepOrder = stepOrder;
        return this;
    }

    /**
     * **参数解释：** 步骤执行顺序，从 1 开始。 **约束限制：** 不涉及。 **取值范围：** 1-20 **默认取值：** 不涉及。 
     * minimum: 1
     * maximum: 20
     * @return stepOrder
     */
    public Integer getStepOrder() {
        return stepOrder;
    }

    public void setStepOrder(Integer stepOrder) {
        this.stepOrder = stepOrder;
    }

    public CoreSpaceMemoryStrategyStepRequestBody withInstruction(String instruction) {
        this.instruction = instruction;
        return this;
    }

    /**
     * **参数解释：** 步骤指令（Prompt 模板）。 **约束限制：** 长度不超过50000字符。 **取值范围：** 长度0-50000字符。 **默认取值：** 不传使用默认模板。 
     * @return instruction
     */
    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CoreSpaceMemoryStrategyStepRequestBody that = (CoreSpaceMemoryStrategyStepRequestBody) obj;
        return Objects.equals(this.stepOrder, that.stepOrder) && Objects.equals(this.instruction, that.instruction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stepOrder, instruction);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoreSpaceMemoryStrategyStepRequestBody {\n");
        sb.append("    stepOrder: ").append(toIndentedString(stepOrder)).append("\n");
        sb.append("    instruction: ").append(toIndentedString(instruction)).append("\n");
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
