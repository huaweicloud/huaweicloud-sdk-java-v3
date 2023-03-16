package com.huaweicloud.sdk.organizations.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class DisableTrustedServiceRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private TrustedServiceReqBody body;

    public DisableTrustedServiceRequest withBody(TrustedServiceReqBody body) {
        this.body = body;
        return this;
    }

    public DisableTrustedServiceRequest withBody(Consumer<TrustedServiceReqBody> bodySetter) {
        if (this.body == null) {
            this.body = new TrustedServiceReqBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public TrustedServiceReqBody getBody() {
        return body;
    }

    public void setBody(TrustedServiceReqBody body) {
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
        DisableTrustedServiceRequest disableTrustedServiceRequest = (DisableTrustedServiceRequest) o;
        return Objects.equals(this.body, disableTrustedServiceRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DisableTrustedServiceRequest {\n");
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
