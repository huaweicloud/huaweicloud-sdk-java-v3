package com.huaweicloud.sdk.codeartsrepo.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TemplateRepositoryList
 */
public class TemplateRepositoryList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "projects")

    private List<TemplateRepository> projects = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public TemplateRepositoryList withProjects(List<TemplateRepository> projects) {
        this.projects = projects;
        return this;
    }

    public TemplateRepositoryList addProjectsItem(TemplateRepository projectsItem) {
        if (this.projects == null) {
            this.projects = new ArrayList<>();
        }
        this.projects.add(projectsItem);
        return this;
    }

    public TemplateRepositoryList withProjects(Consumer<List<TemplateRepository>> projectsSetter) {
        if (this.projects == null) {
            this.projects = new ArrayList<>();
        }
        projectsSetter.accept(this.projects);
        return this;
    }

    /**
     * 模板列表
     * @return projects
     */
    public List<TemplateRepository> getProjects() {
        return projects;
    }

    public void setProjects(List<TemplateRepository> projects) {
        this.projects = projects;
    }

    public TemplateRepositoryList withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 模板总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TemplateRepositoryList that = (TemplateRepositoryList) obj;
        return Objects.equals(this.projects, that.projects) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projects, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateRepositoryList {\n");
        sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
