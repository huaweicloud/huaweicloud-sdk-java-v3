package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ResendReq
 */
public class ResendReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group")

    private String group;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_id")

    private String clientId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "msg_id_list")

    private List<String> msgIdList = null;

    public ResendReq withGroup(String group) {
        this.group = group;
        return this;
    }

    /**
     * Group ID。
     * @return group
     */
    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public ResendReq withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * 客户端ID。
     * @return clientId
     */
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public ResendReq withMsgIdList(List<String> msgIdList) {
        this.msgIdList = msgIdList;
        return this;
    }

    public ResendReq addMsgIdListItem(String msgIdListItem) {
        if (this.msgIdList == null) {
            this.msgIdList = new ArrayList<>();
        }
        this.msgIdList.add(msgIdListItem);
        return this;
    }

    public ResendReq withMsgIdList(Consumer<List<String>> msgIdListSetter) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResendReq that = (ResendReq) obj;
        return Objects.equals(this.group, that.group) && Objects.equals(this.clientId, that.clientId)
            && Objects.equals(this.msgIdList, that.msgIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(group, clientId, msgIdList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResendReq {\n");
        sb.append("    group: ").append(toIndentedString(group)).append("\n");
        sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
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
