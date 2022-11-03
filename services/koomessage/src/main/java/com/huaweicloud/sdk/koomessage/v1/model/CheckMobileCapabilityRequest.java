package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CheckMobileCapabilityRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CheckMobileCapabilityRequestBody body;

    public CheckMobileCapabilityRequest withBody(CheckMobileCapabilityRequestBody body) {
        this.body = body;
        return this;
    }

    public CheckMobileCapabilityRequest withBody(Consumer<CheckMobileCapabilityRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new CheckMobileCapabilityRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CheckMobileCapabilityRequestBody getBody() {
        return body;
    }

    public void setBody(CheckMobileCapabilityRequestBody body) {
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
        CheckMobileCapabilityRequest checkMobileCapabilityRequest = (CheckMobileCapabilityRequest) o;
        return Objects.equals(this.body, checkMobileCapabilityRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckMobileCapabilityRequest {\n");
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