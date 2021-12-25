package com.huaweicloud.sdk.codehub.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class ShowPrivateKeyVerifyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private PrivateKeyVerify body;

    public ShowPrivateKeyVerifyRequest withBody(PrivateKeyVerify body) {
        this.body = body;
        return this;
    }

    public ShowPrivateKeyVerifyRequest withBody(Consumer<PrivateKeyVerify> bodySetter) {
        if (this.body == null) {
            this.body = new PrivateKeyVerify();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public PrivateKeyVerify getBody() {
        return body;
    }

    public void setBody(PrivateKeyVerify body) {
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
        ShowPrivateKeyVerifyRequest showPrivateKeyVerifyRequest = (ShowPrivateKeyVerifyRequest) o;
        return Objects.equals(this.body, showPrivateKeyVerifyRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPrivateKeyVerifyRequest {\n");
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
