package com.huaweicloud.sdk.dataartsfabric.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建消息通知策略请求体
 */
public class CreateMessageNotificationPolicyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message_notification_policy_list")

    private List<CreateMessageNotificationPolicy> messageNotificationPolicyList = null;

    public CreateMessageNotificationPolicyRequestBody withMessageNotificationPolicyList(
        List<CreateMessageNotificationPolicy> messageNotificationPolicyList) {
        this.messageNotificationPolicyList = messageNotificationPolicyList;
        return this;
    }

    public CreateMessageNotificationPolicyRequestBody addMessageNotificationPolicyListItem(
        CreateMessageNotificationPolicy messageNotificationPolicyListItem) {
        if (this.messageNotificationPolicyList == null) {
            this.messageNotificationPolicyList = new ArrayList<>();
        }
        this.messageNotificationPolicyList.add(messageNotificationPolicyListItem);
        return this;
    }

    public CreateMessageNotificationPolicyRequestBody withMessageNotificationPolicyList(
        Consumer<List<CreateMessageNotificationPolicy>> messageNotificationPolicyListSetter) {
        if (this.messageNotificationPolicyList == null) {
            this.messageNotificationPolicyList = new ArrayList<>();
        }
        messageNotificationPolicyListSetter.accept(this.messageNotificationPolicyList);
        return this;
    }

    /**
     * 消息通知策略
     * @return messageNotificationPolicyList
     */
    public List<CreateMessageNotificationPolicy> getMessageNotificationPolicyList() {
        return messageNotificationPolicyList;
    }

    public void setMessageNotificationPolicyList(List<CreateMessageNotificationPolicy> messageNotificationPolicyList) {
        this.messageNotificationPolicyList = messageNotificationPolicyList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateMessageNotificationPolicyRequestBody that = (CreateMessageNotificationPolicyRequestBody) obj;
        return Objects.equals(this.messageNotificationPolicyList, that.messageNotificationPolicyList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageNotificationPolicyList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateMessageNotificationPolicyRequestBody {\n");
        sb.append("    messageNotificationPolicyList: ")
            .append(toIndentedString(messageNotificationPolicyList))
            .append("\n");
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
