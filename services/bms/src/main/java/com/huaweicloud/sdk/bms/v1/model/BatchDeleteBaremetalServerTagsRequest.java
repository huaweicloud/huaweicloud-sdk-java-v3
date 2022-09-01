package com.huaweicloud.sdk.bms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchDeleteBaremetalServerTagsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_id")

    @JacksonXmlProperty(localName = "server_id")

    private String serverId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private BatchDeleteBaremetalServerTagsRequestBody body;

    public BatchDeleteBaremetalServerTagsRequest withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * Get serverId
     * @return serverId
     */
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public BatchDeleteBaremetalServerTagsRequest withBody(BatchDeleteBaremetalServerTagsRequestBody body) {
        this.body = body;
        return this;
    }

    public BatchDeleteBaremetalServerTagsRequest withBody(
        Consumer<BatchDeleteBaremetalServerTagsRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new BatchDeleteBaremetalServerTagsRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public BatchDeleteBaremetalServerTagsRequestBody getBody() {
        return body;
    }

    public void setBody(BatchDeleteBaremetalServerTagsRequestBody body) {
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
        BatchDeleteBaremetalServerTagsRequest batchDeleteBaremetalServerTagsRequest =
            (BatchDeleteBaremetalServerTagsRequest) o;
        return Objects.equals(this.serverId, batchDeleteBaremetalServerTagsRequest.serverId)
            && Objects.equals(this.body, batchDeleteBaremetalServerTagsRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteBaremetalServerTagsRequest {\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
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
