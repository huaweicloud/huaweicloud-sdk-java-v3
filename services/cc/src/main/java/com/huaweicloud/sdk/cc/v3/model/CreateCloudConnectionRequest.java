package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class CreateCloudConnectionRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateCloudConnectionRequestBody body;

    public CreateCloudConnectionRequest withBody(CreateCloudConnectionRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateCloudConnectionRequest withBody(Consumer<CreateCloudConnectionRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new CreateCloudConnectionRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public CreateCloudConnectionRequestBody getBody() {
        return body;
    }

    public void setBody(CreateCloudConnectionRequestBody body) {
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
        CreateCloudConnectionRequest createCloudConnectionRequest = (CreateCloudConnectionRequest) o;
        return Objects.equals(this.body, createCloudConnectionRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCloudConnectionRequest {\n");
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
