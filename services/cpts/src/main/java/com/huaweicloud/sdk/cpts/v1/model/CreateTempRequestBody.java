package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateTempRequestBody
 */
public class CreateTempRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    @JacksonXmlProperty(localName = "project_id")

    private Integer projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "temp_type")

    @JacksonXmlProperty(localName = "temp_type")

    private Integer tempType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contents")

    @JacksonXmlProperty(localName = "contents")

    private List<Object> contents = null;

    public CreateTempRequestBody withProjectId(Integer projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * project_id
     * minimum: 0
     * maximum: 2147483647
     * @return projectId
     */
    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public CreateTempRequestBody withTempType(Integer tempType) {
        this.tempType = tempType;
        return this;
    }

    /**
     * temp_type
     * minimum: 0
     * maximum: 2147483647
     * @return tempType
     */
    public Integer getTempType() {
        return tempType;
    }

    public void setTempType(Integer tempType) {
        this.tempType = tempType;
    }

    public CreateTempRequestBody withName(String name) {
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

    public CreateTempRequestBody withDescription(String description) {
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

    public CreateTempRequestBody withContents(List<Object> contents) {
        this.contents = contents;
        return this;
    }

    public CreateTempRequestBody addContentsItem(Object contentsItem) {
        if (this.contents == null) {
            this.contents = new ArrayList<>();
        }
        this.contents.add(contentsItem);
        return this;
    }

    public CreateTempRequestBody withContents(Consumer<List<Object>> contentsSetter) {
        if (this.contents == null) {
            this.contents = new ArrayList<>();
        }
        contentsSetter.accept(this.contents);
        return this;
    }

    /**
     * contents
     * @return contents
     */
    public List<Object> getContents() {
        return contents;
    }

    public void setContents(List<Object> contents) {
        this.contents = contents;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateTempRequestBody createTempRequestBody = (CreateTempRequestBody) o;
        return Objects.equals(this.projectId, createTempRequestBody.projectId)
            && Objects.equals(this.tempType, createTempRequestBody.tempType)
            && Objects.equals(this.name, createTempRequestBody.name)
            && Objects.equals(this.description, createTempRequestBody.description)
            && Objects.equals(this.contents, createTempRequestBody.contents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, tempType, name, description, contents);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTempRequestBody {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    tempType: ").append(toIndentedString(tempType)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
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
