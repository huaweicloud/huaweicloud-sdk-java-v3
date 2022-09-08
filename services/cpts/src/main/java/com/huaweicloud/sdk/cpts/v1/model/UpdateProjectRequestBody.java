package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateProjectRequestBody
 */
public class UpdateProjectRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "variables_no_file")

    private List<String> variablesNoFile = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private Integer source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "external_params")

    private Object externalParams;

    public UpdateProjectRequestBody withId(Integer id) {
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

    public UpdateProjectRequestBody withName(String name) {
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

    public UpdateProjectRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * description
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateProjectRequestBody withVariablesNoFile(List<String> variablesNoFile) {
        this.variablesNoFile = variablesNoFile;
        return this;
    }

    public UpdateProjectRequestBody addVariablesNoFileItem(String variablesNoFileItem) {
        if (this.variablesNoFile == null) {
            this.variablesNoFile = new ArrayList<>();
        }
        this.variablesNoFile.add(variablesNoFileItem);
        return this;
    }

    public UpdateProjectRequestBody withVariablesNoFile(Consumer<List<String>> variablesNoFileSetter) {
        if (this.variablesNoFile == null) {
            this.variablesNoFile = new ArrayList<>();
        }
        variablesNoFileSetter.accept(this.variablesNoFile);
        return this;
    }

    /**
     * variables_no_file
     * @return variablesNoFile
     */
    public List<String> getVariablesNoFile() {
        return variablesNoFile;
    }

    public void setVariablesNoFile(List<String> variablesNoFile) {
        this.variablesNoFile = variablesNoFile;
    }

    public UpdateProjectRequestBody withSource(Integer source) {
        this.source = source;
        return this;
    }

    /**
     * source
     * minimum: 0
     * maximum: 2147483647
     * @return source
     */
    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public UpdateProjectRequestBody withExternalParams(Object externalParams) {
        this.externalParams = externalParams;
        return this;
    }

    /**
     * external_params
     * @return externalParams
     */
    public Object getExternalParams() {
        return externalParams;
    }

    public void setExternalParams(Object externalParams) {
        this.externalParams = externalParams;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateProjectRequestBody updateProjectRequestBody = (UpdateProjectRequestBody) o;
        return Objects.equals(this.id, updateProjectRequestBody.id)
            && Objects.equals(this.name, updateProjectRequestBody.name)
            && Objects.equals(this.description, updateProjectRequestBody.description)
            && Objects.equals(this.variablesNoFile, updateProjectRequestBody.variablesNoFile)
            && Objects.equals(this.source, updateProjectRequestBody.source)
            && Objects.equals(this.externalParams, updateProjectRequestBody.externalParams);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, variablesNoFile, source, externalParams);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateProjectRequestBody {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    variablesNoFile: ").append(toIndentedString(variablesNoFile)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    externalParams: ").append(toIndentedString(externalParams)).append("\n");
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
