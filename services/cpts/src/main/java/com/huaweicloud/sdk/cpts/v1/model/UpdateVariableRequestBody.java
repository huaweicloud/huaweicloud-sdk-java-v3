package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateVariableRequestBody
 */
public class UpdateVariableRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "variable_type")

    @JacksonXmlProperty(localName = "variable_type")

    private Integer variableType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "variable")

    @JacksonXmlProperty(localName = "variable")

    private List<Object> variable = null;

    public UpdateVariableRequestBody withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * id
     * minimum: 0
     * maximum: 2147483647
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public UpdateVariableRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateVariableRequestBody withVariableType(Integer variableType) {
        this.variableType = variableType;
        return this;
    }

    /**
     * variable_type
     * minimum: 0
     * maximum: 2147483647
     * @return variableType
     */
    public Integer getVariableType() {
        return variableType;
    }

    public void setVariableType(Integer variableType) {
        this.variableType = variableType;
    }

    public UpdateVariableRequestBody withVariable(List<Object> variable) {
        this.variable = variable;
        return this;
    }

    public UpdateVariableRequestBody addVariableItem(Object variableItem) {
        if (this.variable == null) {
            this.variable = new ArrayList<>();
        }
        this.variable.add(variableItem);
        return this;
    }

    public UpdateVariableRequestBody withVariable(Consumer<List<Object>> variableSetter) {
        if (this.variable == null) {
            this.variable = new ArrayList<>();
        }
        variableSetter.accept(this.variable);
        return this;
    }

    /**
     * variable
     * @return variable
     */
    public List<Object> getVariable() {
        return variable;
    }

    public void setVariable(List<Object> variable) {
        this.variable = variable;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateVariableRequestBody updateVariableRequestBody = (UpdateVariableRequestBody) o;
        return Objects.equals(this.id, updateVariableRequestBody.id)
            && Objects.equals(this.name, updateVariableRequestBody.name)
            && Objects.equals(this.variableType, updateVariableRequestBody.variableType)
            && Objects.equals(this.variable, updateVariableRequestBody.variable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, variableType, variable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateVariableRequestBody {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    variableType: ").append(toIndentedString(variableType)).append("\n");
        sb.append("    variable: ").append(toIndentedString(variable)).append("\n");
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
