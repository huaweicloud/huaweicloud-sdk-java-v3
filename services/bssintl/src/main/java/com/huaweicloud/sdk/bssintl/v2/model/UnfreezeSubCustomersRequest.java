package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class UnfreezeSubCustomersRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UnfreezeSubCustomersReq body;

    public UnfreezeSubCustomersRequest withBody(UnfreezeSubCustomersReq body) {
        this.body = body;
        return this;
    }

    public UnfreezeSubCustomersRequest withBody(Consumer<UnfreezeSubCustomersReq> bodySetter) {
        if (this.body == null) {
            this.body = new UnfreezeSubCustomersReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public UnfreezeSubCustomersReq getBody() {
        return body;
    }

    public void setBody(UnfreezeSubCustomersReq body) {
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
        UnfreezeSubCustomersRequest unfreezeSubCustomersRequest = (UnfreezeSubCustomersRequest) o;
        return Objects.equals(this.body, unfreezeSubCustomersRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UnfreezeSubCustomersRequest {\n");
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
