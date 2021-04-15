package com.huaweicloud.sdk.projectman.v4.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.projectman.v4.model.ListProjectsV4ResponseBodyProjects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListProjectsV4Response extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="projects")
    
    private List<ListProjectsV4ResponseBodyProjects> projects = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;

    public ListProjectsV4Response withProjects(List<ListProjectsV4ResponseBodyProjects> projects) {
        this.projects = projects;
        return this;
    }

    
    public ListProjectsV4Response addProjectsItem(ListProjectsV4ResponseBodyProjects projectsItem) {
        if(this.projects == null) {
            this.projects = new ArrayList<>();
        }
        this.projects.add(projectsItem);
        return this;
    }

    public ListProjectsV4Response withProjects(Consumer<List<ListProjectsV4ResponseBodyProjects>> projectsSetter) {
        if(this.projects == null) {
            this.projects = new ArrayList<>();
        }
        projectsSetter.accept(this.projects);
        return this;
    }

    /**
     * 项目信息列表
     * @return projects
     */
    public List<ListProjectsV4ResponseBodyProjects> getProjects() {
        return projects;
    }

    public void setProjects(List<ListProjectsV4ResponseBodyProjects> projects) {
        this.projects = projects;
    }

    

    public ListProjectsV4Response withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * 项目总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListProjectsV4Response listProjectsV4Response = (ListProjectsV4Response) o;
        return Objects.equals(this.projects, listProjectsV4Response.projects) &&
            Objects.equals(this.total, listProjectsV4Response.total);
    }
    @Override
    public int hashCode() {
        return Objects.hash(projects, total);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProjectsV4Response {\n");
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

