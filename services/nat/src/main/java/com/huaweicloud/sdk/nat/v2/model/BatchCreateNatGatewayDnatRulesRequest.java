package com.huaweicloud.sdk.nat.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchCreateNatGatewayDnatRulesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private BatchCreateNatGatewayDnatRulesRequestBody body;

    public BatchCreateNatGatewayDnatRulesRequest withBody(BatchCreateNatGatewayDnatRulesRequestBody body) {
        this.body = body;
        return this;
    }

    public BatchCreateNatGatewayDnatRulesRequest withBody(
        Consumer<BatchCreateNatGatewayDnatRulesRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new BatchCreateNatGatewayDnatRulesRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public BatchCreateNatGatewayDnatRulesRequestBody getBody() {
        return body;
    }

    public void setBody(BatchCreateNatGatewayDnatRulesRequestBody body) {
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
        BatchCreateNatGatewayDnatRulesRequest batchCreateNatGatewayDnatRulesRequest =
            (BatchCreateNatGatewayDnatRulesRequest) o;
        return Objects.equals(this.body, batchCreateNatGatewayDnatRulesRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateNatGatewayDnatRulesRequest {\n");
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
