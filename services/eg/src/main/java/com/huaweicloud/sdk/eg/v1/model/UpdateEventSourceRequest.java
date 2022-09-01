package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateEventSourceRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_id")

    @JacksonXmlProperty(localName = "source_id")

    private String sourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private CustomizeSourceUpdateReq body;

    public UpdateEventSourceRequest withSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    /**
     * 指定查询的事件源ID
     * @return sourceId
     */
    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public UpdateEventSourceRequest withBody(CustomizeSourceUpdateReq body) {
        this.body = body;
        return this;
    }

    public UpdateEventSourceRequest withBody(Consumer<CustomizeSourceUpdateReq> bodySetter) {
        if (this.body == null) {
            this.body = new CustomizeSourceUpdateReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CustomizeSourceUpdateReq getBody() {
        return body;
    }

    public void setBody(CustomizeSourceUpdateReq body) {
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
        UpdateEventSourceRequest updateEventSourceRequest = (UpdateEventSourceRequest) o;
        return Objects.equals(this.sourceId, updateEventSourceRequest.sourceId)
            && Objects.equals(this.body, updateEventSourceRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateEventSourceRequest {\n");
        sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
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
