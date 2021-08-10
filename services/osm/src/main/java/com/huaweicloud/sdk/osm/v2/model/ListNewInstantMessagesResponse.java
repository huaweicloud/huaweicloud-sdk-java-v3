package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListNewInstantMessagesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "imstatus")

    private List<ImStatusV2> imstatus = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "immsg")

    private List<UserInstantIncidentMsgV2> immsg = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_message_time_id")

    private String lastMessageTimeId;

    public ListNewInstantMessagesResponse withImstatus(List<ImStatusV2> imstatus) {
        this.imstatus = imstatus;
        return this;
    }

    public ListNewInstantMessagesResponse addImstatusItem(ImStatusV2 imstatusItem) {
        if (this.imstatus == null) {
            this.imstatus = new ArrayList<>();
        }
        this.imstatus.add(imstatusItem);
        return this;
    }

    public ListNewInstantMessagesResponse withImstatus(Consumer<List<ImStatusV2>> imstatusSetter) {
        if (this.imstatus == null) {
            this.imstatus = new ArrayList<>();
        }
        imstatusSetter.accept(this.imstatus);
        return this;
    }

    /** 状态列表
     * 
     * @return imstatus */
    public List<ImStatusV2> getImstatus() {
        return imstatus;
    }

    public void setImstatus(List<ImStatusV2> imstatus) {
        this.imstatus = imstatus;
    }

    public ListNewInstantMessagesResponse withImmsg(List<UserInstantIncidentMsgV2> immsg) {
        this.immsg = immsg;
        return this;
    }

    public ListNewInstantMessagesResponse addImmsgItem(UserInstantIncidentMsgV2 immsgItem) {
        if (this.immsg == null) {
            this.immsg = new ArrayList<>();
        }
        this.immsg.add(immsgItem);
        return this;
    }

    public ListNewInstantMessagesResponse withImmsg(Consumer<List<UserInstantIncidentMsgV2>> immsgSetter) {
        if (this.immsg == null) {
            this.immsg = new ArrayList<>();
        }
        immsgSetter.accept(this.immsg);
        return this;
    }

    /** 留言内容列表
     * 
     * @return immsg */
    public List<UserInstantIncidentMsgV2> getImmsg() {
        return immsg;
    }

    public void setImmsg(List<UserInstantIncidentMsgV2> immsg) {
        this.immsg = immsg;
    }

    public ListNewInstantMessagesResponse withLastMessageTimeId(String lastMessageTimeId) {
        this.lastMessageTimeId = lastMessageTimeId;
        return this;
    }

    /** 上次查询留言时间
     * 
     * @return lastMessageTimeId */
    public String getLastMessageTimeId() {
        return lastMessageTimeId;
    }

    public void setLastMessageTimeId(String lastMessageTimeId) {
        this.lastMessageTimeId = lastMessageTimeId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListNewInstantMessagesResponse listNewInstantMessagesResponse = (ListNewInstantMessagesResponse) o;
        return Objects.equals(this.imstatus, listNewInstantMessagesResponse.imstatus)
            && Objects.equals(this.immsg, listNewInstantMessagesResponse.immsg)
            && Objects.equals(this.lastMessageTimeId, listNewInstantMessagesResponse.lastMessageTimeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imstatus, immsg, lastMessageTimeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNewInstantMessagesResponse {\n");
        sb.append("    imstatus: ").append(toIndentedString(imstatus)).append("\n");
        sb.append("    immsg: ").append(toIndentedString(immsg)).append("\n");
        sb.append("    lastMessageTimeId: ").append(toIndentedString(lastMessageTimeId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
