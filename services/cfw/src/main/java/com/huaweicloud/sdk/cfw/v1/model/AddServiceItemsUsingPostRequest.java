package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class AddServiceItemsUsingPostRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private AddServiceItemsUsingPOSTRequestBody body;

    public AddServiceItemsUsingPostRequest withBody(AddServiceItemsUsingPOSTRequestBody body) {
        this.body = body;
        return this;
    }

    public AddServiceItemsUsingPostRequest withBody(Consumer<AddServiceItemsUsingPOSTRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new AddServiceItemsUsingPOSTRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public AddServiceItemsUsingPOSTRequestBody getBody() {
        return body;
    }

    public void setBody(AddServiceItemsUsingPOSTRequestBody body) {
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
        AddServiceItemsUsingPostRequest addServiceItemsUsingPostRequest = (AddServiceItemsUsingPostRequest) o;
        return Objects.equals(this.body, addServiceItemsUsingPostRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddServiceItemsUsingPostRequest {\n");
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
