package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreatePostPaidInstanceRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private CreatePostPaidInstanceReq body;

    public CreatePostPaidInstanceRequest withBody(CreatePostPaidInstanceReq body) {
        this.body = body;
        return this;
    }

    public CreatePostPaidInstanceRequest withBody(Consumer<CreatePostPaidInstanceReq> bodySetter) {
        if (this.body == null) {
            this.body = new CreatePostPaidInstanceReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CreatePostPaidInstanceReq getBody() {
        return body;
    }

    public void setBody(CreatePostPaidInstanceReq body) {
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
        CreatePostPaidInstanceRequest createPostPaidInstanceRequest = (CreatePostPaidInstanceRequest) o;
        return Objects.equals(this.body, createPostPaidInstanceRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePostPaidInstanceRequest {\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
