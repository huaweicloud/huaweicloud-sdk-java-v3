package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建知识库意图响应。
 */
public class CreateKnowledgeIntentRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "intent_id")

    private String intentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identify")

    private String identify;

    public CreateKnowledgeIntentRsp withIntentId(String intentId) {
        this.intentId = intentId;
        return this;
    }

    /**
     * 意图ID。
     * @return intentId
     */
    public String getIntentId() {
        return intentId;
    }

    public void setIntentId(String intentId) {
        this.intentId = intentId;
    }

    public CreateKnowledgeIntentRsp withIdentify(String identify) {
        this.identify = identify;
        return this;
    }

    /**
     * 意图标识。
     * @return identify
     */
    public String getIdentify() {
        return identify;
    }

    public void setIdentify(String identify) {
        this.identify = identify;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateKnowledgeIntentRsp that = (CreateKnowledgeIntentRsp) obj;
        return Objects.equals(this.intentId, that.intentId) && Objects.equals(this.identify, that.identify);
    }

    @Override
    public int hashCode() {
        return Objects.hash(intentId, identify);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateKnowledgeIntentRsp {\n");
        sb.append("    intentId: ").append(toIndentedString(intentId)).append("\n");
        sb.append("    identify: ").append(toIndentedString(identify)).append("\n");
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
