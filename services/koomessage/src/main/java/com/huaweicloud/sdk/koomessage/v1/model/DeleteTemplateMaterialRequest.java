package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class DeleteTemplateMaterialRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private DeleteTemplateMaterialRequestBody body;

    public DeleteTemplateMaterialRequest withBody(DeleteTemplateMaterialRequestBody body) {
        this.body = body;
        return this;
    }

    public DeleteTemplateMaterialRequest withBody(Consumer<DeleteTemplateMaterialRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new DeleteTemplateMaterialRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public DeleteTemplateMaterialRequestBody getBody() {
        return body;
    }

    public void setBody(DeleteTemplateMaterialRequestBody body) {
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
        DeleteTemplateMaterialRequest deleteTemplateMaterialRequest = (DeleteTemplateMaterialRequest) o;
        return Objects.equals(this.body, deleteTemplateMaterialRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteTemplateMaterialRequest {\n");
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
