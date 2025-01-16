package com.huaweicloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteNotifyPolicyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_urn")

    private String topicUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notify_policy_id")

    private String notifyPolicyId;

    public DeleteNotifyPolicyRequest withTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
        return this;
    }

    /**
     * Topic的唯一的资源标识，可通过[查询主题列表](smn_api_51004.xml)获取该标识。
     * @return topicUrn
     */
    public String getTopicUrn() {
        return topicUrn;
    }

    public void setTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
    }

    public DeleteNotifyPolicyRequest withNotifyPolicyId(String notifyPolicyId) {
        this.notifyPolicyId = notifyPolicyId;
        return this;
    }

    /**
     * 通知策略ID。
     * @return notifyPolicyId
     */
    public String getNotifyPolicyId() {
        return notifyPolicyId;
    }

    public void setNotifyPolicyId(String notifyPolicyId) {
        this.notifyPolicyId = notifyPolicyId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteNotifyPolicyRequest that = (DeleteNotifyPolicyRequest) obj;
        return Objects.equals(this.topicUrn, that.topicUrn) && Objects.equals(this.notifyPolicyId, that.notifyPolicyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topicUrn, notifyPolicyId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteNotifyPolicyRequest {\n");
        sb.append("    topicUrn: ").append(toIndentedString(topicUrn)).append("\n");
        sb.append("    notifyPolicyId: ").append(toIndentedString(notifyPolicyId)).append("\n");
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
