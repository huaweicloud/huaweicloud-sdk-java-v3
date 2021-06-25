package com.huaweicloud.sdk.vod.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateAssetCategoryResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="parent_id")
    
    private Integer parentId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private Integer id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="level")
    
    private Integer level;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="projectId")
    
    private String projectId;

    public CreateAssetCategoryResponse withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 视频分类名称<br/> 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public CreateAssetCategoryResponse withParentId(Integer parentId) {
        this.parentId = parentId;
        return this;
    }

    


    /**
     * 父分类ID<br/> 
     * @return parentId
     */
    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    

    public CreateAssetCategoryResponse withId(Integer id) {
        this.id = id;
        return this;
    }

    


    /**
     * 视频分类ID<br/> 
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    

    public CreateAssetCategoryResponse withLevel(Integer level) {
        this.level = level;
        return this;
    }

    


    /**
     * 视频分类层级<br/> 
     * @return level
     */
    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    

    public CreateAssetCategoryResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    


    /**
     * Get projectId
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateAssetCategoryResponse createAssetCategoryResponse = (CreateAssetCategoryResponse) o;
        return Objects.equals(this.name, createAssetCategoryResponse.name) &&
            Objects.equals(this.parentId, createAssetCategoryResponse.parentId) &&
            Objects.equals(this.id, createAssetCategoryResponse.id) &&
            Objects.equals(this.level, createAssetCategoryResponse.level) &&
            Objects.equals(this.projectId, createAssetCategoryResponse.projectId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, parentId, id, level, projectId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAssetCategoryResponse {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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

