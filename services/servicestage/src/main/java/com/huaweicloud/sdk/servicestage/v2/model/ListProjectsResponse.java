package com.huaweicloud.sdk.servicestage.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.servicestage.v2.model.Project;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListProjectsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="projects")
    
    private List<Project> projects = null;
    
    public ListProjectsResponse withProjects(List<Project> projects) {
        this.projects = projects;
        return this;
    }

    
    public ListProjectsResponse addProjectsItem(Project projectsItem) {
        this.projects.add(projectsItem);
        return this;
    }

    public ListProjectsResponse withProjects(Consumer<List<Project>> projectsSetter) {
        if(this.projects == null ){
            this.projects = new ArrayList<>();
        }
        projectsSetter.accept(this.projects);
        return this;
    }

    /**
     * 项目列表。
     * @return projects
     */
    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
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
        ListProjectsResponse listProjectsResponse = (ListProjectsResponse) o;
        return Objects.equals(this.projects, listProjectsResponse.projects);
    }
    @Override
    public int hashCode() {
        return Objects.hash(projects);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProjectsResponse {\n");
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

