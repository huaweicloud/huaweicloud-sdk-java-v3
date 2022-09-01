package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteSubscriptionTargetRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscription_id")

    @JacksonXmlProperty(localName = "subscription_id")

    private String subscriptionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_id")

    @JacksonXmlProperty(localName = "target_id")

    private String targetId;

    public DeleteSubscriptionTargetRequest withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * 事件订阅ID
     * @return subscriptionId
     */
    public String getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public DeleteSubscriptionTargetRequest withTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }

    /**
     * 事件订阅目标ID
     * @return targetId
     */
    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteSubscriptionTargetRequest deleteSubscriptionTargetRequest = (DeleteSubscriptionTargetRequest) o;
        return Objects.equals(this.subscriptionId, deleteSubscriptionTargetRequest.subscriptionId)
            && Objects.equals(this.targetId, deleteSubscriptionTargetRequest.targetId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subscriptionId, targetId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteSubscriptionTargetRequest {\n");
        sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
        sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
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
