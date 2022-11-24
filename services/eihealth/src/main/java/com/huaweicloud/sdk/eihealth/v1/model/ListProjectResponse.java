package com.huaweicloud.sdk.eihealth.v1.model;

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
public class ListProjectResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "projects")

    private List<ProjectRsp> projects = null;

    public ListProjectResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 个数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListProjectResponse withProjects(List<ProjectRsp> projects) {
        this.projects = projects;
        return this;
    }

    public ListProjectResponse addProjectsItem(ProjectRsp projectsItem) {
        if (this.projects == null) {
            this.projects = new ArrayList<>();
        }
        this.projects.add(projectsItem);
        return this;
    }

    public ListProjectResponse withProjects(Consumer<List<ProjectRsp>> projectsSetter) {
        if (this.projects == null) {
            this.projects = new ArrayList<>();
        }
        projectsSetter.accept(this.projects);
        return this;
    }

    /**
     * 项目详情列表
     * @return projects
     */
    public List<ProjectRsp> getProjects() {
        return projects;
    }

    public void setProjects(List<ProjectRsp> projects) {
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
        ListProjectResponse listProjectResponse = (ListProjectResponse) o;
        return Objects.equals(this.count, listProjectResponse.count)
            && Objects.equals(this.projects, listProjectResponse.projects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, projects);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProjectResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
