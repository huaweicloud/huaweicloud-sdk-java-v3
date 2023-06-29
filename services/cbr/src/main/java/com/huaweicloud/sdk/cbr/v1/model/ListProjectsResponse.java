package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListProjectsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "projects")

    private List<ProjectsListInfo> projects = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "links")

    private SelfLinksInfo links;

    public ListProjectsResponse withProjects(List<ProjectsListInfo> projects) {
        this.projects = projects;
        return this;
    }

    public ListProjectsResponse addProjectsItem(ProjectsListInfo projectsItem) {
        if (this.projects == null) {
            this.projects = new ArrayList<>();
        }
        this.projects.add(projectsItem);
        return this;
    }

    public ListProjectsResponse withProjects(Consumer<List<ProjectsListInfo>> projectsSetter) {
        if (this.projects == null) {
            this.projects = new ArrayList<>();
        }
        projectsSetter.accept(this.projects);
        return this;
    }

    /**
     * 项目信息
     * @return projects
     */
    public List<ProjectsListInfo> getProjects() {
        return projects;
    }

    public void setProjects(List<ProjectsListInfo> projects) {
        this.projects = projects;
    }

    public ListProjectsResponse withLinks(SelfLinksInfo links) {
        this.links = links;
        return this;
    }

    public ListProjectsResponse withLinks(Consumer<SelfLinksInfo> linksSetter) {
        if (this.links == null) {
            this.links = new SelfLinksInfo();
            linksSetter.accept(this.links);
        }

        return this;
    }

    /**
     * Get links
     * @return links
     */
    public SelfLinksInfo getLinks() {
        return links;
    }

    public void setLinks(SelfLinksInfo links) {
        this.links = links;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListProjectsResponse that = (ListProjectsResponse) obj;
        return Objects.equals(this.projects, that.projects) && Objects.equals(this.links, that.links);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projects, links);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProjectsResponse {\n");
        sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
