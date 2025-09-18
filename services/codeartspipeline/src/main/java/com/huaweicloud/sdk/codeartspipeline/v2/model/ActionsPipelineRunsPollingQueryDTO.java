package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ActionsPipelineRunsPollingQueryDTO
 */
public class ActionsPipelineRunsPollingQueryDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipeline_run_ids")

    private List<String> pipelineRunIds = null;

    public ActionsPipelineRunsPollingQueryDTO withPipelineRunIds(List<String> pipelineRunIds) {
        this.pipelineRunIds = pipelineRunIds;
        return this;
    }

    public ActionsPipelineRunsPollingQueryDTO addPipelineRunIdsItem(String pipelineRunIdsItem) {
        if (this.pipelineRunIds == null) {
            this.pipelineRunIds = new ArrayList<>();
        }
        this.pipelineRunIds.add(pipelineRunIdsItem);
        return this;
    }

    public ActionsPipelineRunsPollingQueryDTO withPipelineRunIds(Consumer<List<String>> pipelineRunIdsSetter) {
        if (this.pipelineRunIds == null) {
            this.pipelineRunIds = new ArrayList<>();
        }
        pipelineRunIdsSetter.accept(this.pipelineRunIds);
        return this;
    }

    /**
     * **参数解释**： 流水线运行实例ID列表。 **约束限制**： 不涉及。 **取值范围**： 32位字符，仅由数字和字母组成。 **默认取值**： 不涉及。 
     * @return pipelineRunIds
     */
    public List<String> getPipelineRunIds() {
        return pipelineRunIds;
    }

    public void setPipelineRunIds(List<String> pipelineRunIds) {
        this.pipelineRunIds = pipelineRunIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ActionsPipelineRunsPollingQueryDTO that = (ActionsPipelineRunsPollingQueryDTO) obj;
        return Objects.equals(this.pipelineRunIds, that.pipelineRunIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pipelineRunIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionsPipelineRunsPollingQueryDTO {\n");
        sb.append("    pipelineRunIds: ").append(toIndentedString(pipelineRunIds)).append("\n");
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
