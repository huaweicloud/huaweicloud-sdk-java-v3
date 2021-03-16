package com.huaweicloud.sdk.projectman.v4.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.projectman.v4.model.ListProjectsV4ResponseBodyCreator;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ListProjectsV4ResponseBodyProjects
 */
public class ListProjectsV4ResponseBodyProjects  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_num_id")
    
    private Integer projectNumId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    private String projectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_name")
    
    private String projectName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_time")
    
    private Long createdTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="updated_time")
    
    private Long updatedTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_type")
    
    private String projectType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="creator")
    
    private ListProjectsV4ResponseBodyCreator creator;

    public ListProjectsV4ResponseBodyProjects withProjectNumId(Integer projectNumId) {
        this.projectNumId = projectNumId;
        return this;
    }

    


    /**
     * 项目numId
     * @return projectNumId
     */
    public Integer getProjectNumId() {
        return projectNumId;
    }

    public void setProjectNumId(Integer projectNumId) {
        this.projectNumId = projectNumId;
    }

    

    public ListProjectsV4ResponseBodyProjects withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    


    /**
     * 项目uuid
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    

    public ListProjectsV4ResponseBodyProjects withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    


    /**
     * 项目名称
     * @return projectName
     */
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    

    public ListProjectsV4ResponseBodyProjects withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 项目描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public ListProjectsV4ResponseBodyProjects withCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    


    /**
     * 项目创建时间
     * @return createdTime
     */
    public Long getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
    }

    

    public ListProjectsV4ResponseBodyProjects withUpdatedTime(Long updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    


    /**
     * 项目更新时间
     * @return updatedTime
     */
    public Long getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Long updatedTime) {
        this.updatedTime = updatedTime;
    }

    

    public ListProjectsV4ResponseBodyProjects withProjectType(String projectType) {
        this.projectType = projectType;
        return this;
    }

    


    /**
     * 项目类型
     * @return projectType
     */
    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

    

    public ListProjectsV4ResponseBodyProjects withCreator(ListProjectsV4ResponseBodyCreator creator) {
        this.creator = creator;
        return this;
    }

    public ListProjectsV4ResponseBodyProjects withCreator(Consumer<ListProjectsV4ResponseBodyCreator> creatorSetter) {
        if(this.creator == null ){
            this.creator = new ListProjectsV4ResponseBodyCreator();
            creatorSetter.accept(this.creator);
        }
        
        return this;
    }


    /**
     * Get creator
     * @return creator
     */
    public ListProjectsV4ResponseBodyCreator getCreator() {
        return creator;
    }

    public void setCreator(ListProjectsV4ResponseBodyCreator creator) {
        this.creator = creator;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListProjectsV4ResponseBodyProjects listProjectsV4ResponseBodyProjects = (ListProjectsV4ResponseBodyProjects) o;
        return Objects.equals(this.projectNumId, listProjectsV4ResponseBodyProjects.projectNumId) &&
            Objects.equals(this.projectId, listProjectsV4ResponseBodyProjects.projectId) &&
            Objects.equals(this.projectName, listProjectsV4ResponseBodyProjects.projectName) &&
            Objects.equals(this.description, listProjectsV4ResponseBodyProjects.description) &&
            Objects.equals(this.createdTime, listProjectsV4ResponseBodyProjects.createdTime) &&
            Objects.equals(this.updatedTime, listProjectsV4ResponseBodyProjects.updatedTime) &&
            Objects.equals(this.projectType, listProjectsV4ResponseBodyProjects.projectType) &&
            Objects.equals(this.creator, listProjectsV4ResponseBodyProjects.creator);
    }
    @Override
    public int hashCode() {
        return Objects.hash(projectNumId, projectId, projectName, description, createdTime, updatedTime, projectType, creator);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProjectsV4ResponseBodyProjects {\n");
        sb.append("    projectNumId: ").append(toIndentedString(projectNumId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
        sb.append("    projectType: ").append(toIndentedString(projectType)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
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

