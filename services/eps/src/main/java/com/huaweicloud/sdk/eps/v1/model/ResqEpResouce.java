package com.huaweicloud.sdk.eps.v1.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.eps.v1.model.Match;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 获取企业项目下资源请求
 */
public class ResqEpResouce  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="projects")
    
    private List<String> projects = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_types")
    
    private List<String> resourceTypes = new ArrayList<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="matches")
    
    private List<Match> matches = null;
    
    public ResqEpResouce withProjects(List<String> projects) {
        this.projects = projects;
        return this;
    }

    
    public ResqEpResouce addProjectsItem(String projectsItem) {
        if (this.projects == null) {
            this.projects = new ArrayList<>();
        }
        this.projects.add(projectsItem);
        return this;
    }

    public ResqEpResouce withProjects(Consumer<List<String>> projectsSetter) {
        if(this.projects == null ){
            this.projects = new ArrayList<>();
        }
        projectsSetter.accept(this.projects);
        return this;
    }

    /**
     * 项目ID列表。resource_types中包含region级别服务时为必选项。
     * @return projects
     */
    public List<String> getProjects() {
        return projects;
    }

    public void setProjects(List<String> projects) {
        this.projects = projects;
    }

    public ResqEpResouce withResourceTypes(List<String> resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }

    
    public ResqEpResouce addResourceTypesItem(String resourceTypesItem) {
        this.resourceTypes.add(resourceTypesItem);
        return this;
    }

    public ResqEpResouce withResourceTypes(Consumer<List<String>> resourceTypesSetter) {
        if(this.resourceTypes == null ){
            this.resourceTypes = new ArrayList<>();
        }
        resourceTypesSetter.accept(this.resourceTypes);
        return this;
    }

    /**
     * 资源类型列表， 此参数为可输入的值（区分大小写）。例如：ecs,scaling_group, images, disk, vpcs,security-groups, shared_bandwidth, eip, cdn等。
     * @return resourceTypes
     */
    public List<String> getResourceTypes() {
        return resourceTypes;
    }

    public void setResourceTypes(List<String> resourceTypes) {
        this.resourceTypes = resourceTypes;
    }

    public ResqEpResouce withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * 索引位置， 从offset指定的下一条数据开始查询，必须为数字，不能为负数，默认为0。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ResqEpResouce withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * 查询记录数，不传默认为1000，limit最多为1000, 最小值为1。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ResqEpResouce withMatches(List<Match> matches) {
        this.matches = matches;
        return this;
    }

    
    public ResqEpResouce addMatchesItem(Match matchesItem) {
        if (this.matches == null) {
            this.matches = new ArrayList<>();
        }
        this.matches.add(matchesItem);
        return this;
    }

    public ResqEpResouce withMatches(Consumer<List<Match>> matchesSetter) {
        if(this.matches == null ){
            this.matches = new ArrayList<>();
        }
        matchesSetter.accept(this.matches);
        return this;
    }

    /**
     * 搜索字段，key为要匹配的字段，固定为resource_name，value为匹配的值，不传则表示无匹配条件。
     * @return matches
     */
    public List<Match> getMatches() {
        return matches;
    }

    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResqEpResouce resqEpResouce = (ResqEpResouce) o;
        return Objects.equals(this.projects, resqEpResouce.projects) &&
            Objects.equals(this.resourceTypes, resqEpResouce.resourceTypes) &&
            Objects.equals(this.offset, resqEpResouce.offset) &&
            Objects.equals(this.limit, resqEpResouce.limit) &&
            Objects.equals(this.matches, resqEpResouce.matches);
    }
    @Override
    public int hashCode() {
        return Objects.hash(projects, resourceTypes, offset, limit, matches);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResqEpResouce {\n");
        sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
        sb.append("    resourceTypes: ").append(toIndentedString(resourceTypes)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    matches: ").append(toIndentedString(matches)).append("\n");
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

