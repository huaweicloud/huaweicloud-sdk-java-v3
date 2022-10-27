package com.huaweicloud.sdk.cloudide.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ShowExtensionDetailRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ExtensionSearchUserInputParamCustomizeForDetail body;

    public ShowExtensionDetailRequest withBody(ExtensionSearchUserInputParamCustomizeForDetail body) {
        this.body = body;
        return this;
    }

    public ShowExtensionDetailRequest withBody(Consumer<ExtensionSearchUserInputParamCustomizeForDetail> bodySetter) {
        if (this.body == null) {
            this.body = new ExtensionSearchUserInputParamCustomizeForDetail();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ExtensionSearchUserInputParamCustomizeForDetail getBody() {
        return body;
    }

    public void setBody(ExtensionSearchUserInputParamCustomizeForDetail body) {
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
        ShowExtensionDetailRequest showExtensionDetailRequest = (ShowExtensionDetailRequest) o;
        return Objects.equals(this.body, showExtensionDetailRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowExtensionDetailRequest {\n");
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
