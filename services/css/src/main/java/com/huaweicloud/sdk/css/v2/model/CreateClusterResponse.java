package com.huaweicloud.sdk.css.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateClusterResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema")

    private CreateClusterResp schema;

    public CreateClusterResponse withSchema(CreateClusterResp schema) {
        this.schema = schema;
        return this;
    }

    public CreateClusterResponse withSchema(Consumer<CreateClusterResp> schemaSetter) {
        if (this.schema == null) {
            this.schema = new CreateClusterResp();
            schemaSetter.accept(this.schema);
        }

        return this;
    }

    /**
     * Get schema
     * @return schema
     */
    public CreateClusterResp getSchema() {
        return schema;
    }

    public void setSchema(CreateClusterResp schema) {
        this.schema = schema;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateClusterResponse createClusterResponse = (CreateClusterResponse) o;
        return Objects.equals(this.schema, createClusterResponse.schema);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schema);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateClusterResponse {\n");
        sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
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
