package com.huaweicloud.sdk.versatile.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 会话记录
 */
public class Conversation {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lastUpdateTime")

    private Long lastUpdateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "messageList")

    private List<Message> messageList = null;

    public Conversation withLastUpdateTime(Long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }

    /**
     * Get lastUpdateTime
     * @return lastUpdateTime
     */
    public Long getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public Conversation withMessageList(List<Message> messageList) {
        this.messageList = messageList;
        return this;
    }

    public Conversation addMessageListItem(Message messageListItem) {
        if (this.messageList == null) {
            this.messageList = new ArrayList<>();
        }
        this.messageList.add(messageListItem);
        return this;
    }

    public Conversation withMessageList(Consumer<List<Message>> messageListSetter) {
        if (this.messageList == null) {
            this.messageList = new ArrayList<>();
        }
        messageListSetter.accept(this.messageList);
        return this;
    }

    /**
     * Get messageList
     * @return messageList
     */
    public List<Message> getMessageList() {
        return messageList;
    }

    public void setMessageList(List<Message> messageList) {
        this.messageList = messageList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Conversation that = (Conversation) obj;
        return Objects.equals(this.lastUpdateTime, that.lastUpdateTime)
            && Objects.equals(this.messageList, that.messageList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastUpdateTime, messageList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Conversation {\n");
        sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
        sb.append("    messageList: ").append(toIndentedString(messageList)).append("\n");
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
