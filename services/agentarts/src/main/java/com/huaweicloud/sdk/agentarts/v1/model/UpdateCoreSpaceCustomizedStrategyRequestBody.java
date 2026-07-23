package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 更新自定义记忆策略（请求体）。所有字段可选，仅更新传入字段。 步骤列表采用全量替换语义：传入的 steps 将完全替代现有步骤。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
 */
public class UpdateCoreSpaceCustomizedStrategyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "steps")

    private List<CoreSpaceMemoryStrategyStepRequestBody> steps = null;

    public UpdateCoreSpaceCustomizedStrategyRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：**  策略名称，用于标识和区分不同的记忆策略。 **约束限制：**  仅支持字母、数字和中划线。 **取值范围：**  长度1-48字符。 **默认取值：** 不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateCoreSpaceCustomizedStrategyRequestBody withSteps(List<CoreSpaceMemoryStrategyStepRequestBody> steps) {
        this.steps = steps;
        return this;
    }

    public UpdateCoreSpaceCustomizedStrategyRequestBody addStepsItem(CoreSpaceMemoryStrategyStepRequestBody stepsItem) {
        if (this.steps == null) {
            this.steps = new ArrayList<>();
        }
        this.steps.add(stepsItem);
        return this;
    }

    public UpdateCoreSpaceCustomizedStrategyRequestBody withSteps(
        Consumer<List<CoreSpaceMemoryStrategyStepRequestBody>> stepsSetter) {
        if (this.steps == null) {
            this.steps = new ArrayList<>();
        }
        stepsSetter.accept(this.steps);
        return this;
    }

    /**
     * **参数解释：** 更新已有步骤。 **约束限制：** 数组长度0-20个。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
     * @return steps
     */
    public List<CoreSpaceMemoryStrategyStepRequestBody> getSteps() {
        return steps;
    }

    public void setSteps(List<CoreSpaceMemoryStrategyStepRequestBody> steps) {
        this.steps = steps;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateCoreSpaceCustomizedStrategyRequestBody that = (UpdateCoreSpaceCustomizedStrategyRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.steps, that.steps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, steps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCoreSpaceCustomizedStrategyRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
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
