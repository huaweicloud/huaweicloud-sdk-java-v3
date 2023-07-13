package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateVariableRequestBody
 */
public class CreateVariableRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "variable_type")

    private Integer variableType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "variable")

    private List<Object> variable = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_quoted")

    private Boolean isQuoted;

    public CreateVariableRequestBody withId(Integer id) {
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

    public CreateVariableRequestBody withName(String name) {
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

    public CreateVariableRequestBody withVariableType(Integer variableType) {
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

    public CreateVariableRequestBody withVariable(List<Object> variable) {
        this.variable = variable;
        return this;
    }

    public CreateVariableRequestBody addVariableItem(Object variableItem) {
        if (this.variable == null) {
            this.variable = new ArrayList<>();
        }
        this.variable.add(variableItem);
        return this;
    }

    public CreateVariableRequestBody withVariable(Consumer<List<Object>> variableSetter) {
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

    public CreateVariableRequestBody withIsQuoted(Boolean isQuoted) {
        this.isQuoted = isQuoted;
        return this;
    }

    /**
     * 是否被引用
     * @return isQuoted
     */
    public Boolean getIsQuoted() {
        return isQuoted;
    }

    public void setIsQuoted(Boolean isQuoted) {
        this.isQuoted = isQuoted;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateVariableRequestBody that = (CreateVariableRequestBody) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.variableType, that.variableType) && Objects.equals(this.variable, that.variable)
            && Objects.equals(this.isQuoted, that.isQuoted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, variableType, variable, isQuoted);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVariableRequestBody {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    variableType: ").append(toIndentedString(variableType)).append("\n");
        sb.append("    variable: ").append(toIndentedString(variable)).append("\n");
        sb.append("    isQuoted: ").append(toIndentedString(isQuoted)).append("\n");
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
