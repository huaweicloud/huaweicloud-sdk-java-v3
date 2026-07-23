package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteOpsSynthesisTaskRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "synthesis_id")

    private String synthesisId;

    public DeleteOpsSynthesisTaskRequest withSynthesisId(String synthesisId) {
        this.synthesisId = synthesisId;
        return this;
    }

    /**
     * **参数解释：** 合成任务的唯一标识符（ID），该参数用于在路径中指定特定的合成任务，以便执行查询、停止或删除等操作。 **约束限制：** 字符串长度限制为1到64个字符。通常采用标准 UUID格式。 **取值范围：** 1-64位字符。 **默认取值：** 不涉及。 
     * @return synthesisId
     */
    public String getSynthesisId() {
        return synthesisId;
    }

    public void setSynthesisId(String synthesisId) {
        this.synthesisId = synthesisId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteOpsSynthesisTaskRequest that = (DeleteOpsSynthesisTaskRequest) obj;
        return Objects.equals(this.synthesisId, that.synthesisId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(synthesisId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteOpsSynthesisTaskRequest {\n");
        sb.append("    synthesisId: ").append(toIndentedString(synthesisId)).append("\n");
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
