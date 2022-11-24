package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class AddAddressItemsUsingPostRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private AddAddressItemsInfoDto body;

    public AddAddressItemsUsingPostRequest withBody(AddAddressItemsInfoDto body) {
        this.body = body;
        return this;
    }

    public AddAddressItemsUsingPostRequest withBody(Consumer<AddAddressItemsInfoDto> bodySetter) {
        if (this.body == null) {
            this.body = new AddAddressItemsInfoDto();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public AddAddressItemsInfoDto getBody() {
        return body;
    }

    public void setBody(AddAddressItemsInfoDto body) {
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
        AddAddressItemsUsingPostRequest addAddressItemsUsingPostRequest = (AddAddressItemsUsingPostRequest) o;
        return Objects.equals(this.body, addAddressItemsUsingPostRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddAddressItemsUsingPostRequest {\n");
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
