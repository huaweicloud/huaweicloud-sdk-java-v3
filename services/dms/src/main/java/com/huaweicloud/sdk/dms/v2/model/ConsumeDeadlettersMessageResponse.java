package com.huaweicloud.sdk.dms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ConsumeDeadlettersMessageResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private List<ConsumeDeadlettersMessage> body = null;

    public ConsumeDeadlettersMessageResponse withBody(List<ConsumeDeadlettersMessage> body) {
        this.body = body;
        return this;
    }

    public ConsumeDeadlettersMessageResponse addBodyItem(ConsumeDeadlettersMessage bodyItem) {
        if (this.body == null) {
            this.body = new ArrayList<>();
        }
        this.body.add(bodyItem);
        return this;
    }

    public ConsumeDeadlettersMessageResponse withBody(Consumer<List<ConsumeDeadlettersMessage>> bodySetter) {
        if (this.body == null) {
            this.body = new ArrayList<>();
        }
        bodySetter.accept(this.body);
        return this;
    }

    /** 消息数组。
     * 
     * @return body */
    public List<ConsumeDeadlettersMessage> getBody() {
        return body;
    }

    public void setBody(List<ConsumeDeadlettersMessage> body) {
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
        ConsumeDeadlettersMessageResponse consumeDeadlettersMessageResponse = (ConsumeDeadlettersMessageResponse) o;
        return Objects.equals(this.body, consumeDeadlettersMessageResponse.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConsumeDeadlettersMessageResponse {\n");
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
