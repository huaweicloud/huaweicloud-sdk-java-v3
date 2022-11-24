package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * IEF Flink job action回调的请求body体。
 */
public class IefFlinkJobMessagesReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message_id")

    private String messageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private State state;

    public IefFlinkJobMessagesReq withMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * 消息id
     * @return messageId
     */
    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public IefFlinkJobMessagesReq withState(State state) {
        this.state = state;
        return this;
    }

    public IefFlinkJobMessagesReq withState(Consumer<State> stateSetter) {
        if (this.state == null) {
            this.state = new State();
            stateSetter.accept(this.state);
        }

        return this;
    }

    /**
     * Get state
     * @return state
     */
    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IefFlinkJobMessagesReq iefFlinkJobMessagesReq = (IefFlinkJobMessagesReq) o;
        return Objects.equals(this.messageId, iefFlinkJobMessagesReq.messageId)
            && Objects.equals(this.state, iefFlinkJobMessagesReq.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageId, state);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IefFlinkJobMessagesReq {\n");
        sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
