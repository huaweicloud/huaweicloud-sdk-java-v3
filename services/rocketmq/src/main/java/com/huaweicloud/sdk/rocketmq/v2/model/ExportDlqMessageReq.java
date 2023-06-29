package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ExportDlqMessageReq
 */
public class ExportDlqMessageReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic")

    private String topic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "msg_id_list")

    private List<String> msgIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uniq_key_list")

    private List<String> uniqKeyList = null;

    public ExportDlqMessageReq withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
     * 主题名称。
     * @return topic
     */
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public ExportDlqMessageReq withMsgIdList(List<String> msgIdList) {
        this.msgIdList = msgIdList;
        return this;
    }

    public ExportDlqMessageReq addMsgIdListItem(String msgIdListItem) {
        if (this.msgIdList == null) {
            this.msgIdList = new ArrayList<>();
        }
        this.msgIdList.add(msgIdListItem);
        return this;
    }

    public ExportDlqMessageReq withMsgIdList(Consumer<List<String>> msgIdListSetter) {
        if (this.msgIdList == null) {
            this.msgIdList = new ArrayList<>();
        }
        msgIdListSetter.accept(this.msgIdList);
        return this;
    }

    /**
     * 消息ID列表。
     * @return msgIdList
     */
    public List<String> getMsgIdList() {
        return msgIdList;
    }

    public void setMsgIdList(List<String> msgIdList) {
        this.msgIdList = msgIdList;
    }

    public ExportDlqMessageReq withUniqKeyList(List<String> uniqKeyList) {
        this.uniqKeyList = uniqKeyList;
        return this;
    }

    public ExportDlqMessageReq addUniqKeyListItem(String uniqKeyListItem) {
        if (this.uniqKeyList == null) {
            this.uniqKeyList = new ArrayList<>();
        }
        this.uniqKeyList.add(uniqKeyListItem);
        return this;
    }

    public ExportDlqMessageReq withUniqKeyList(Consumer<List<String>> uniqKeyListSetter) {
        if (this.uniqKeyList == null) {
            this.uniqKeyList = new ArrayList<>();
        }
        uniqKeyListSetter.accept(this.uniqKeyList);
        return this;
    }

    /**
     * 唯一Key列表。
     * @return uniqKeyList
     */
    public List<String> getUniqKeyList() {
        return uniqKeyList;
    }

    public void setUniqKeyList(List<String> uniqKeyList) {
        this.uniqKeyList = uniqKeyList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExportDlqMessageReq that = (ExportDlqMessageReq) obj;
        return Objects.equals(this.topic, that.topic) && Objects.equals(this.msgIdList, that.msgIdList)
            && Objects.equals(this.uniqKeyList, that.uniqKeyList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topic, msgIdList, uniqKeyList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportDlqMessageReq {\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        sb.append("    msgIdList: ").append(toIndentedString(msgIdList)).append("\n");
        sb.append("    uniqKeyList: ").append(toIndentedString(uniqKeyList)).append("\n");
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
