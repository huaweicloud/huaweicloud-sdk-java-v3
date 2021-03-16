package com.huaweicloud.sdk.projectman.v4.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.projectman.v4.model.GetProjectInfoV4ResultProjectCreator;
import java.math.BigDecimal;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 项目信息
 */
public class GetProjectInfoV4ResultProject  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_num_id")
    
    private Integer projectNumId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    private String projectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_on")
    
    private BigDecimal createdOn;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="updated_on")
    
    private BigDecimal updatedOn;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_type")
    
    private String projectType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="archive")
    
    private Boolean archive;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_id")
    
    private String enterpriseId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="creator")
    
    private GetProjectInfoV4ResultProjectCreator creator;

    public GetProjectInfoV4ResultProject withProjectNumId(Integer projectNumId) {
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

    

    public GetProjectInfoV4ResultProject withProjectId(String projectId) {
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

    

    public GetProjectInfoV4ResultProject withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 项目名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public GetProjectInfoV4ResultProject withCreatedOn(BigDecimal createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    


    /**
     * 项目创建时间
     * @return createdOn
     */
    public BigDecimal getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(BigDecimal createdOn) {
        this.createdOn = createdOn;
    }

    

    public GetProjectInfoV4ResultProject withUpdatedOn(BigDecimal updatedOn) {
        this.updatedOn = updatedOn;
        return this;
    }

    


    /**
     * 项目更新时间
     * @return updatedOn
     */
    public BigDecimal getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(BigDecimal updatedOn) {
        this.updatedOn = updatedOn;
    }

    

    public GetProjectInfoV4ResultProject withProjectType(String projectType) {
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

    

    public GetProjectInfoV4ResultProject withArchive(Boolean archive) {
        this.archive = archive;
        return this;
    }

    


    /**
     * 是否归档
     * @return archive
     */
    public Boolean getArchive() {
        return archive;
    }

    public void setArchive(Boolean archive) {
        this.archive = archive;
    }

    

    public GetProjectInfoV4ResultProject withEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }

    


    /**
     * 企业项目id
     * @return enterpriseId
     */
    public String getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    

    public GetProjectInfoV4ResultProject withCreator(GetProjectInfoV4ResultProjectCreator creator) {
        this.creator = creator;
        return this;
    }

    public GetProjectInfoV4ResultProject withCreator(Consumer<GetProjectInfoV4ResultProjectCreator> creatorSetter) {
        if(this.creator == null ){
            this.creator = new GetProjectInfoV4ResultProjectCreator();
            creatorSetter.accept(this.creator);
        }
        
        return this;
    }


    /**
     * Get creator
     * @return creator
     */
    public GetProjectInfoV4ResultProjectCreator getCreator() {
        return creator;
    }

    public void setCreator(GetProjectInfoV4ResultProjectCreator creator) {
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
        GetProjectInfoV4ResultProject getProjectInfoV4ResultProject = (GetProjectInfoV4ResultProject) o;
        return Objects.equals(this.projectNumId, getProjectInfoV4ResultProject.projectNumId) &&
            Objects.equals(this.projectId, getProjectInfoV4ResultProject.projectId) &&
            Objects.equals(this.name, getProjectInfoV4ResultProject.name) &&
            Objects.equals(this.createdOn, getProjectInfoV4ResultProject.createdOn) &&
            Objects.equals(this.updatedOn, getProjectInfoV4ResultProject.updatedOn) &&
            Objects.equals(this.projectType, getProjectInfoV4ResultProject.projectType) &&
            Objects.equals(this.archive, getProjectInfoV4ResultProject.archive) &&
            Objects.equals(this.enterpriseId, getProjectInfoV4ResultProject.enterpriseId) &&
            Objects.equals(this.creator, getProjectInfoV4ResultProject.creator);
    }
    @Override
    public int hashCode() {
        return Objects.hash(projectNumId, projectId, name, createdOn, updatedOn, projectType, archive, enterpriseId, creator);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetProjectInfoV4ResultProject {\n");
        sb.append("    projectNumId: ").append(toIndentedString(projectNumId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
        sb.append("    updatedOn: ").append(toIndentedString(updatedOn)).append("\n");
        sb.append("    projectType: ").append(toIndentedString(projectType)).append("\n");
        sb.append("    archive: ").append(toIndentedString(archive)).append("\n");
        sb.append("    enterpriseId: ").append(toIndentedString(enterpriseId)).append("\n");
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

