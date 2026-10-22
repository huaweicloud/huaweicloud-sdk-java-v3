package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * FailedLlm
 */
public class FailedLlm {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "llm_id")

    private String llmId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    public FailedLlm withLlmId(String llmId) {
        this.llmId = llmId;
        return this;
    }

    /**
     * 自定义大模型ID
     * @return llmId
     */
    public String getLlmId() {
        return llmId;
    }

    public void setLlmId(String llmId) {
        this.llmId = llmId;
    }

    public FailedLlm withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * 失败原因
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FailedLlm that = (FailedLlm) obj;
        return Objects.equals(this.llmId, that.llmId) && Objects.equals(this.reason, that.reason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(llmId, reason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FailedLlm {\n");
        sb.append("    llmId: ").append(toIndentedString(llmId)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
