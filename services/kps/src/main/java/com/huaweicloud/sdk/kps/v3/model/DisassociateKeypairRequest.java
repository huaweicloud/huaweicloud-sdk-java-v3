package com.huaweicloud.sdk.kps.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class DisassociateKeypairRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private DisassociateKeypairRequestBody body;

    public DisassociateKeypairRequest withBody(DisassociateKeypairRequestBody body) {
        this.body = body;
        return this;
    }

    public DisassociateKeypairRequest withBody(Consumer<DisassociateKeypairRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new DisassociateKeypairRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public DisassociateKeypairRequestBody getBody() {
        return body;
    }

    public void setBody(DisassociateKeypairRequestBody body) {
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
        DisassociateKeypairRequest disassociateKeypairRequest = (DisassociateKeypairRequest) o;
        return Objects.equals(this.body, disassociateKeypairRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DisassociateKeypairRequest {\n");
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
