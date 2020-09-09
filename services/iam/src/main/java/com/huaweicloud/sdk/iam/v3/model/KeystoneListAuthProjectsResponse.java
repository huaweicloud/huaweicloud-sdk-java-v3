package com.huaweicloud.sdk.iam.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.AuthProjectResult;
import com.huaweicloud.sdk.iam.v3.model.LinksSelf;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class KeystoneListAuthProjectsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="links")
    
    private LinksSelf links = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="projects")
    
    private List<AuthProjectResult> projects = null;
    
    public KeystoneListAuthProjectsResponse withLinks(LinksSelf links) {
        this.links = links;
        return this;
    }

    public KeystoneListAuthProjectsResponse withLinks(Consumer<LinksSelf> linksSetter) {
        if(this.links == null ){
            this.links = new LinksSelf();
            linksSetter.accept(this.links);
        }
        
        return this;
    }


    /**
     * Get links
     * @return links
     */
    public LinksSelf getLinks() {
        return links;
    }

    public void setLinks(LinksSelf links) {
        this.links = links;
    }

    public KeystoneListAuthProjectsResponse withProjects(List<AuthProjectResult> projects) {
        this.projects = projects;
        return this;
    }

    
    public KeystoneListAuthProjectsResponse addProjectsItem(AuthProjectResult projectsItem) {
        if (this.projects == null) {
            this.projects = new ArrayList<>();
        }
        this.projects.add(projectsItem);
        return this;
    }

    public KeystoneListAuthProjectsResponse withProjects(Consumer<List<AuthProjectResult>> projectsSetter) {
        if(this.projects == null ){
            this.projects = new ArrayList<>();
        }
        projectsSetter.accept(this.projects);
        return this;
    }

    /**
     * 项目信息列表。
     * @return projects
     */
    public List<AuthProjectResult> getProjects() {
        return projects;
    }

    public void setProjects(List<AuthProjectResult> projects) {
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
        KeystoneListAuthProjectsResponse keystoneListAuthProjectsResponse = (KeystoneListAuthProjectsResponse) o;
        return Objects.equals(this.links, keystoneListAuthProjectsResponse.links) &&
            Objects.equals(this.projects, keystoneListAuthProjectsResponse.projects);
    }
    @Override
    public int hashCode() {
        return Objects.hash(links, projects);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneListAuthProjectsResponse {\n");
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

