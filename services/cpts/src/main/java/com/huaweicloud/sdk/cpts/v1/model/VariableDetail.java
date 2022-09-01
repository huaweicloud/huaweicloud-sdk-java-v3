package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * VariableDetail
 */
public class VariableDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_size")

    @JacksonXmlProperty(localName = "file_size")

    private Integer fileSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_quoted")

    @JacksonXmlProperty(localName = "is_quoted")

    private Boolean isQuoted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "variable")

    @JacksonXmlProperty(localName = "variable")

    private List<Object> variable = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "variable_type")

    @JacksonXmlProperty(localName = "variable_type")

    private Integer variableType;

    public VariableDetail withFileSize(Integer fileSize) {
        this.fileSize = fileSize;
        return this;
    }

    /**
     * file_size
     * minimum: 0
     * maximum: 2147483647
     * @return fileSize
     */
    public Integer getFileSize() {
        return fileSize;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    public VariableDetail withId(Integer id) {
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

    public VariableDetail withIsQuoted(Boolean isQuoted) {
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

    public VariableDetail withName(String name) {
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

    public VariableDetail withVariable(List<Object> variable) {
        this.variable = variable;
        return this;
    }

    public VariableDetail addVariableItem(Object variableItem) {
        if (this.variable == null) {
            this.variable = new ArrayList<>();
        }
        this.variable.add(variableItem);
        return this;
    }

    public VariableDetail withVariable(Consumer<List<Object>> variableSetter) {
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

    public VariableDetail withVariableType(Integer variableType) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VariableDetail variableDetail = (VariableDetail) o;
        return Objects.equals(this.fileSize, variableDetail.fileSize) && Objects.equals(this.id, variableDetail.id)
            && Objects.equals(this.isQuoted, variableDetail.isQuoted) && Objects.equals(this.name, variableDetail.name)
            && Objects.equals(this.variable, variableDetail.variable)
            && Objects.equals(this.variableType, variableDetail.variableType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileSize, id, isQuoted, name, variable, variableType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VariableDetail {\n");
        sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    isQuoted: ").append(toIndentedString(isQuoted)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    variable: ").append(toIndentedString(variable)).append("\n");
        sb.append("    variableType: ").append(toIndentedString(variableType)).append("\n");
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
