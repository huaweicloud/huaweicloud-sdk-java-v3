package com.huaweicloud.sdk.cloudide.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 获取异步推断结果的请求
 */
public class ChatResultRequestMessage {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_id")

    private String resultId;

    public ChatResultRequestMessage withResultId(String resultId) {
        this.resultId = resultId;
        return this;
    }

    /**
     * request id
     * @return resultId
     */
    public String getResultId() {
        return resultId;
    }

    public void setResultId(String resultId) {
        this.resultId = resultId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChatResultRequestMessage that = (ChatResultRequestMessage) obj;
        return Objects.equals(this.resultId, that.resultId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resultId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChatResultRequestMessage {\n");
        sb.append("    resultId: ").append(toIndentedString(resultId)).append("\n");
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
