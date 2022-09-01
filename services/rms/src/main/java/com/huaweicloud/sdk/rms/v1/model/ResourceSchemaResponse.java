package com.huaweicloud.sdk.rms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 单条schema信息
 */
public class ResourceSchemaResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    @JacksonXmlProperty(localName = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema")

    @JacksonXmlProperty(localName = "schema")

    private Object schema;

    public ResourceSchemaResponse withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 资源类型.
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ResourceSchemaResponse withSchema(Object schema) {
        this.schema = schema;
        return this;
    }

    /**
     * schema 内容.
     * @return schema
     */
    public Object getSchema() {
        return schema;
    }

    public void setSchema(Object schema) {
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
        ResourceSchemaResponse resourceSchemaResponse = (ResourceSchemaResponse) o;
        return Objects.equals(this.type, resourceSchemaResponse.type)
            && Objects.equals(this.schema, resourceSchemaResponse.schema);
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
