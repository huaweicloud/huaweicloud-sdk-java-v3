package com.huaweicloud.sdk.elb.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class UpdateListenerRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "listener_id")

    private String listenerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateListenerRequestBody body;

    public UpdateListenerRequest withListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }

    /** 监听器id
     * 
     * @return listenerId */
    public String getListenerId() {
        return listenerId;
    }

    public void setListenerId(String listenerId) {
        this.listenerId = listenerId;
    }

    public UpdateListenerRequest withBody(UpdateListenerRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateListenerRequest withBody(Consumer<UpdateListenerRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateListenerRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public UpdateListenerRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateListenerRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateListenerRequest updateListenerRequest = (UpdateListenerRequest) o;
        return Objects.equals(this.listenerId, updateListenerRequest.listenerId)
            && Objects.equals(this.body, updateListenerRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listenerId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateListenerRequest {\n");
        sb.append("    listenerId: ").append(toIndentedString(listenerId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
