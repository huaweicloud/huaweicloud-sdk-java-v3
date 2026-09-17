package com.huaweicloud.sdk.rc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * schema_resource_schema_response
 */
public class ResourceSchemaResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema")

    private Map<String, Object> schema = null;

    public ResourceSchemaResponse withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 资源类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ResourceSchemaResponse withSchema(Map<String, Object> schema) {
        this.schema = schema;
        return this;
    }

    public ResourceSchemaResponse putSchemaItem(String key, Object schemaItem) {
        if (this.schema == null) {
            this.schema = new HashMap<>();
        }
        this.schema.put(key, schemaItem);
        return this;
    }

    public ResourceSchemaResponse withSchema(Consumer<Map<String, Object>> schemaSetter) {
        if (this.schema == null) {
            this.schema = new HashMap<>();
        }
        schemaSetter.accept(this.schema);
        return this;
    }

    /**
     * schema 内容
     * @return schema
     */
    public Map<String, Object> getSchema() {
        return schema;
    }

    public void setSchema(Map<String, Object> schema) {
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
        ResourceSchemaResponse that = (ResourceSchemaResponse) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.schema, that.schema);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, schema);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceSchemaResponse {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
