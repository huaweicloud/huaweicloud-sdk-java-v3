package com.huaweicloud.sdk.deh.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class CreateDedicatedHostRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ReqAllocateDeh body;

    public CreateDedicatedHostRequest withBody(ReqAllocateDeh body) {
        this.body = body;
        return this;
    }

    public CreateDedicatedHostRequest withBody(Consumer<ReqAllocateDeh> bodySetter) {
        if (this.body == null) {
            this.body = new ReqAllocateDeh();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public ReqAllocateDeh getBody() {
        return body;
    }

    public void setBody(ReqAllocateDeh body) {
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
        CreateDedicatedHostRequest createDedicatedHostRequest = (CreateDedicatedHostRequest) o;
        return Objects.equals(this.body, createDedicatedHostRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDedicatedHostRequest {\n");
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
