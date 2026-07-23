package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class TagOpsTraceLabelRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trace_id")

    private String traceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private TagOpsTraceLabelRequestBody body;

    public TagOpsTraceLabelRequest withTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }

    /**
     * trace的id
     * @return traceId
     */
    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public TagOpsTraceLabelRequest withBody(TagOpsTraceLabelRequestBody body) {
        this.body = body;
        return this;
    }

    public TagOpsTraceLabelRequest withBody(Consumer<TagOpsTraceLabelRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new TagOpsTraceLabelRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public TagOpsTraceLabelRequestBody getBody() {
        return body;
    }

    public void setBody(TagOpsTraceLabelRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TagOpsTraceLabelRequest that = (TagOpsTraceLabelRequest) obj;
        return Objects.equals(this.traceId, that.traceId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(traceId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TagOpsTraceLabelRequest {\n");
        sb.append("    traceId: ").append(toIndentedString(traceId)).append("\n");
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
