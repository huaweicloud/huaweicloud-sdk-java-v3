package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateEventSchemaVersionRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema_id")

    private String schemaId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CustomizeSchemaVersionCreateReq body;

    public CreateEventSchemaVersionRequest withSchemaId(String schemaId) {
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

    public CreateEventSchemaVersionRequest withBody(CustomizeSchemaVersionCreateReq body) {
        this.body = body;
        return this;
    }

    public CreateEventSchemaVersionRequest withBody(Consumer<CustomizeSchemaVersionCreateReq> bodySetter) {
        if (this.body == null) {
            this.body = new CustomizeSchemaVersionCreateReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CustomizeSchemaVersionCreateReq getBody() {
        return body;
    }

    public void setBody(CustomizeSchemaVersionCreateReq body) {
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
        CreateEventSchemaVersionRequest that = (CreateEventSchemaVersionRequest) obj;
        return Objects.equals(this.schemaId, that.schemaId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schemaId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateEventSchemaVersionRequest {\n");
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
