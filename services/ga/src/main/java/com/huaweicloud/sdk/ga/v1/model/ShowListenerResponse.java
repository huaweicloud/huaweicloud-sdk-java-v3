package com.huaweicloud.sdk.ga.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowListenerResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "listener")

    private ListenerDetail listener;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public ShowListenerResponse withListener(ListenerDetail listener) {
        this.listener = listener;
        return this;
    }

    public ShowListenerResponse withListener(Consumer<ListenerDetail> listenerSetter) {
        if (this.listener == null) {
            this.listener = new ListenerDetail();
            listenerSetter.accept(this.listener);
        }

        return this;
    }

    /**
     * Get listener
     * @return listener
     */
    public ListenerDetail getListener() {
        return listener;
    }

    public void setListener(ListenerDetail listener) {
        this.listener = listener;
    }

    public ShowListenerResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求ID。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowListenerResponse showListenerResponse = (ShowListenerResponse) o;
        return Objects.equals(this.listener, showListenerResponse.listener)
            && Objects.equals(this.requestId, showListenerResponse.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listener, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowListenerResponse {\n");
        sb.append("    listener: ").append(toIndentedString(listener)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
