package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowRepositoryNavigationSchemaResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private String result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema")

    private SchemaDto schema;

    public ShowRepositoryNavigationSchemaResponse withResult(String result) {
        this.result = result;
        return this;
    }

    /**
     * **参数解释：** 结果标识。 **约束限制：** 不涉及。
     * @return result
     */
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public ShowRepositoryNavigationSchemaResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * **参数解释：** 结果消息。 **约束限制：** 不涉及。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ShowRepositoryNavigationSchemaResponse withSchema(SchemaDto schema) {
        this.schema = schema;
        return this;
    }

    public ShowRepositoryNavigationSchemaResponse withSchema(Consumer<SchemaDto> schemaSetter) {
        if (this.schema == null) {
            this.schema = new SchemaDto();
            schemaSetter.accept(this.schema);
        }

        return this;
    }

    /**
     * Get schema
     * @return schema
     */
    public SchemaDto getSchema() {
        return schema;
    }

    public void setSchema(SchemaDto schema) {
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
        ShowRepositoryNavigationSchemaResponse that = (ShowRepositoryNavigationSchemaResponse) obj;
        return Objects.equals(this.result, that.result) && Objects.equals(this.message, that.message)
            && Objects.equals(this.schema, that.schema);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result, message, schema);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRepositoryNavigationSchemaResponse {\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
