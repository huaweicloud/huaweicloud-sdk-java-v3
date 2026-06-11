package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Lance表格式结构体
 */
public class CreateLanceTableInput {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema")

    private LanceSchema schema;

    public CreateLanceTableInput withSchema(LanceSchema schema) {
        this.schema = schema;
        return this;
    }

    public CreateLanceTableInput withSchema(Consumer<LanceSchema> schemaSetter) {
        if (this.schema == null) {
            this.schema = new LanceSchema();
            schemaSetter.accept(this.schema);
        }

        return this;
    }

    /**
     * Get schema
     * @return schema
     */
    public LanceSchema getSchema() {
        return schema;
    }

    public void setSchema(LanceSchema schema) {
        this.schema = schema;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateLanceTableInput that = (CreateLanceTableInput) obj;
        return Objects.equals(this.schema, that.schema);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schema);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateLanceTableInput {\n");
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
