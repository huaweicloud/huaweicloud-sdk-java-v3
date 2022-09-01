package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateRecordCallbackConfigRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private RecordCallbackConfigRequest body;

    public CreateRecordCallbackConfigRequest withBody(RecordCallbackConfigRequest body) {
        this.body = body;
        return this;
    }

    public CreateRecordCallbackConfigRequest withBody(Consumer<RecordCallbackConfigRequest> bodySetter) {
        if (this.body == null) {
            this.body = new RecordCallbackConfigRequest();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public RecordCallbackConfigRequest getBody() {
        return body;
    }

    public void setBody(RecordCallbackConfigRequest body) {
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
        CreateRecordCallbackConfigRequest createRecordCallbackConfigRequest = (CreateRecordCallbackConfigRequest) o;
        return Objects.equals(this.body, createRecordCallbackConfigRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRecordCallbackConfigRequest {\n");
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
