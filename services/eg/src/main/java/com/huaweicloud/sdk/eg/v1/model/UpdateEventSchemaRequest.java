package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateEventSchemaRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema_id")

    private String schemaId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CustomizeSchemaUpdateReq body;

    public UpdateEventSchemaRequest withSchemaId(String schemaId) {
        this.schemaId = schemaId;
        return this;
    }

    /**
     * 指定查询的事件模型ID
     * @return schemaId
     */
    public String getSchemaId() {
        return schemaId;
    }

    public void setSchemaId(String schemaId) {
        this.schemaId = schemaId;
    }

    public UpdateEventSchemaRequest withBody(CustomizeSchemaUpdateReq body) {
        this.body = body;
        return this;
    }

    public UpdateEventSchemaRequest withBody(Consumer<CustomizeSchemaUpdateReq> bodySetter) {
        if (this.body == null) {
            this.body = new CustomizeSchemaUpdateReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CustomizeSchemaUpdateReq getBody() {
        return body;
    }

    public void setBody(CustomizeSchemaUpdateReq body) {
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
        UpdateEventSchemaRequest updateEventSchemaRequest = (UpdateEventSchemaRequest) o;
        return Objects.equals(this.schemaId, updateEventSchemaRequest.schemaId)
            && Objects.equals(this.body, updateEventSchemaRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schemaId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateEventSchemaRequest {\n");
        sb.append("    schemaId: ").append(toIndentedString(schemaId)).append("\n");
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
