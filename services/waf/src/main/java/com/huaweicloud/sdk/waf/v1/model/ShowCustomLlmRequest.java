package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowCustomLlmRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "llmId")

    private String llmId;

    public ShowCustomLlmRequest withLlmId(String llmId) {
        this.llmId = llmId;
        return this;
    }

    /**
     * **参数解释：** 自定义大模型ID **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return llmId
     */
    public String getLlmId() {
        return llmId;
    }

    public void setLlmId(String llmId) {
        this.llmId = llmId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowCustomLlmRequest that = (ShowCustomLlmRequest) obj;
        return Objects.equals(this.llmId, that.llmId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(llmId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCustomLlmRequest {\n");
        sb.append("    llmId: ").append(toIndentedString(llmId)).append("\n");
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
