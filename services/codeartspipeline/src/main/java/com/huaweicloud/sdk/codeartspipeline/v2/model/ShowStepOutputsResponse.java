package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowStepOutputsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step_outputs")

    private List<OutputRespStepOutputs> stepOutputs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_system_time")

    private Long currentSystemTime;

    public ShowStepOutputsResponse withStepOutputs(List<OutputRespStepOutputs> stepOutputs) {
        this.stepOutputs = stepOutputs;
        return this;
    }

    public ShowStepOutputsResponse addStepOutputsItem(OutputRespStepOutputs stepOutputsItem) {
        if (this.stepOutputs == null) {
            this.stepOutputs = new ArrayList<>();
        }
        this.stepOutputs.add(stepOutputsItem);
        return this;
    }

    public ShowStepOutputsResponse withStepOutputs(Consumer<List<OutputRespStepOutputs>> stepOutputsSetter) {
        if (this.stepOutputs == null) {
            this.stepOutputs = new ArrayList<>();
        }
        stepOutputsSetter.accept(this.stepOutputs);
        return this;
    }

    /**
     * **参数解释**： 步骤输出列表，记录每个步骤输出的ID和结果信息。 **约束限制**： 不涉及。 
     * @return stepOutputs
     */
    public List<OutputRespStepOutputs> getStepOutputs() {
        return stepOutputs;
    }

    public void setStepOutputs(List<OutputRespStepOutputs> stepOutputs) {
        this.stepOutputs = stepOutputs;
    }

    public ShowStepOutputsResponse withCurrentSystemTime(Long currentSystemTime) {
        this.currentSystemTime = currentSystemTime;
        return this;
    }

    /**
     * **参数解释**： 当前系统时间。 **取值范围**： 不涉及。 
     * @return currentSystemTime
     */
    public Long getCurrentSystemTime() {
        return currentSystemTime;
    }

    public void setCurrentSystemTime(Long currentSystemTime) {
        this.currentSystemTime = currentSystemTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowStepOutputsResponse that = (ShowStepOutputsResponse) obj;
        return Objects.equals(this.stepOutputs, that.stepOutputs)
            && Objects.equals(this.currentSystemTime, that.currentSystemTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stepOutputs, currentSystemTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowStepOutputsResponse {\n");
        sb.append("    stepOutputs: ").append(toIndentedString(stepOutputs)).append("\n");
        sb.append("    currentSystemTime: ").append(toIndentedString(currentSystemTime)).append("\n");
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
