package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListProjectSetsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    @JacksonXmlProperty(localName = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    @JacksonXmlProperty(localName = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "projects")

    @JacksonXmlProperty(localName = "projects")

    private List<ProjectsSet> projects = null;

    public ListProjectSetsResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 状态码
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ListProjectSetsResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 描述
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ListProjectSetsResponse withProjects(List<ProjectsSet> projects) {
        this.projects = projects;
        return this;
    }

    public ListProjectSetsResponse addProjectsItem(ProjectsSet projectsItem) {
        if (this.projects == null) {
            this.projects = new ArrayList<>();
        }
        this.projects.add(projectsItem);
        return this;
    }

    public ListProjectSetsResponse withProjects(Consumer<List<ProjectsSet>> projectsSetter) {
        if (this.projects == null) {
            this.projects = new ArrayList<>();
        }
        projectsSetter.accept(this.projects);
        return this;
    }

    /**
     * 工程集详细信息
     * @return projects
     */
    public List<ProjectsSet> getProjects() {
        return projects;
    }

    public void setProjects(List<ProjectsSet> projects) {
        this.projects = projects;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListProjectSetsResponse listProjectSetsResponse = (ListProjectSetsResponse) o;
        return Objects.equals(this.code, listProjectSetsResponse.code)
            && Objects.equals(this.message, listProjectSetsResponse.message)
            && Objects.equals(this.projects, listProjectSetsResponse.projects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, message, projects);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProjectSetsResponse {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
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
