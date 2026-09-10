package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class InvokeOpsFineGrainedEvaluationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private Object data;

    public InvokeOpsFineGrainedEvaluationResponse withData(Object data) {
        this.data = data;
        return this;
    }

    /**
     * **参数解释：** 细粒度评估结果。data字段根据stream参数的不同，返回不同的结构： - stream=true时，data为OpsFineGrainedEvaluationSSEEvent，为SSE流式事件中的单条评估结果数据（item_completed事件的data部分）。 - stream=false时，data为OpsFineGrainedEvaluationResult，为完整的评估结果，包含所有条目的评估详情。 **约束限制：** data字段两种结构二选一，不会同时出现。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return data
     */
    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InvokeOpsFineGrainedEvaluationResponse that = (InvokeOpsFineGrainedEvaluationResponse) obj;
        return Objects.equals(this.data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InvokeOpsFineGrainedEvaluationResponse {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
