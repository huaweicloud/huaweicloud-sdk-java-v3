package com.huaweicloud.sdk.rms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * StoredQueryRequestBody
 */
public class StoredQueryRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expression")

    @JacksonXmlProperty(localName = "expression")

    private String expression;

    public StoredQueryRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * ResourceQL 名字
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StoredQueryRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * ResourceQL 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public StoredQueryRequestBody withExpression(String expression) {
        this.expression = expression;
        return this;
    }

    /**
     * ResourceQL 表达式
     * @return expression
     */
    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StoredQueryRequestBody storedQueryRequestBody = (StoredQueryRequestBody) o;
        return Objects.equals(this.name, storedQueryRequestBody.name)
            && Objects.equals(this.description, storedQueryRequestBody.description)
            && Objects.equals(this.expression, storedQueryRequestBody.expression);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, expression);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StoredQueryRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
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
