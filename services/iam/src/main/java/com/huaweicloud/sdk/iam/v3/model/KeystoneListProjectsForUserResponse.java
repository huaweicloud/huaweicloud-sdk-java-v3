package com.huaweicloud.sdk.iam.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.Links;
import com.huaweicloud.sdk.iam.v3.model.ProjectResult;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class KeystoneListProjectsForUserResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="links")
    
    private Links links;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="projects")
    
    private List<ProjectResult> projects = null;
    
    public KeystoneListProjectsForUserResponse withLinks(Links links) {
        this.links = links;
        return this;
    }

    public KeystoneListProjectsForUserResponse withLinks(Consumer<Links> linksSetter) {
        if(this.links == null ){
            this.links = new Links();
            linksSetter.accept(this.links);
        }
        
        return this;
    }


    /**
     * Get links
     * @return links
     */
    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    

    public KeystoneListProjectsForUserResponse withProjects(List<ProjectResult> projects) {
        this.projects = projects;
        return this;
    }

    
    public KeystoneListProjectsForUserResponse addProjectsItem(ProjectResult projectsItem) {
        if(this.projects == null) {
            this.projects = new ArrayList<>();
        }
        this.projects.add(projectsItem);
        return this;
    }

    public KeystoneListProjectsForUserResponse withProjects(Consumer<List<ProjectResult>> projectsSetter) {
        if(this.projects == null) {
            this.projects = new ArrayList<>();
        }
        projectsSetter.accept(this.projects);
        return this;
    }

    /**
     * 项目信息列表。
     * @return projects
     */
    public List<ProjectResult> getProjects() {
        return projects;
    }

    public void setProjects(List<ProjectResult> projects) {
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
        KeystoneListProjectsForUserResponse keystoneListProjectsForUserResponse = (KeystoneListProjectsForUserResponse) o;
        return Objects.equals(this.links, keystoneListProjectsForUserResponse.links) &&
            Objects.equals(this.projects, keystoneListProjectsForUserResponse.projects);
    }
    @Override
    public int hashCode() {
        return Objects.hash(links, projects);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneListProjectsForUserResponse {\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

