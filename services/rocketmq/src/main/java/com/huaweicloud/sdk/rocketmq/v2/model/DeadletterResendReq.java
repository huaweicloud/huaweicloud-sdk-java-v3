package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DeadletterResendReq
 */
public class DeadletterResendReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic")

    private String topic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "msg_id_list")

    private List<String> msgIdList = null;

    public DeadletterResendReq withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
     * topic。
     * @return topic
     */
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public DeadletterResendReq withMsgIdList(List<String> msgIdList) {
        this.msgIdList = msgIdList;
        return this;
    }

    public DeadletterResendReq addMsgIdListItem(String msgIdListItem) {
        if (this.msgIdList == null) {
            this.msgIdList = new ArrayList<>();
        }
        this.msgIdList.add(msgIdListItem);
        return this;
    }

    public DeadletterResendReq withMsgIdList(Consumer<List<String>> msgIdListSetter) {
        if (this.msgIdList == null) {
            this.msgIdList = new ArrayList<>();
        }
        msgIdListSetter.accept(this.msgIdList);
        return this;
    }

    /**
     * 消息列表。
     * @return msgIdList
     */
    public List<String> getMsgIdList() {
        return msgIdList;
    }

    public void setMsgIdList(List<String> msgIdList) {
        this.msgIdList = msgIdList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeadletterResendReq deadletterResendReq = (DeadletterResendReq) o;
        return Objects.equals(this.topic, deadletterResendReq.topic)
            && Objects.equals(this.msgIdList, deadletterResendReq.msgIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topic, msgIdList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeadletterResendReq {\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        sb.append("    msgIdList: ").append(toIndentedString(msgIdList)).append("\n");
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
