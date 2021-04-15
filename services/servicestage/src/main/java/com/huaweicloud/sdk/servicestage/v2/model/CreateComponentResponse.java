package com.huaweicloud.sdk.servicestage.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.servicestage.v2.model.BuildInfo;
import com.huaweicloud.sdk.servicestage.v2.model.ComponentCategory;
import com.huaweicloud.sdk.servicestage.v2.model.ComponentSubCategory;
import com.huaweicloud.sdk.servicestage.v2.model.RuntimeType;
import com.huaweicloud.sdk.servicestage.v2.model.SourceObject;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateComponentResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private Integer status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="runtime")
    
    private RuntimeType runtime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="category")
    
    private ComponentCategory category;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sub_category")
    
    private ComponentSubCategory subCategory;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    private String projectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="application_id")
    
    private String applicationId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="source")
    
    private SourceObject source;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="build")
    
    private BuildInfo build;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="pipeline_ids")
    
    private List<String> pipelineIds = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    
    private Long createTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="update_time")
    
    private Long updateTime;

    public CreateComponentResponse withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 应用组件ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public CreateComponentResponse withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 应用组件名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public CreateComponentResponse withStatus(Integer status) {
        this.status = status;
        return this;
    }

    


    /**
     * 取值0或1。  0：表示正常状态。  1：表示正在删除。 
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    

    public CreateComponentResponse withRuntime(RuntimeType runtime) {
        this.runtime = runtime;
        return this;
    }

    


    /**
     * Get runtime
     * @return runtime
     */
    public RuntimeType getRuntime() {
        return runtime;
    }

    public void setRuntime(RuntimeType runtime) {
        this.runtime = runtime;
    }

    

    public CreateComponentResponse withCategory(ComponentCategory category) {
        this.category = category;
        return this;
    }

    


    /**
     * Get category
     * @return category
     */
    public ComponentCategory getCategory() {
        return category;
    }

    public void setCategory(ComponentCategory category) {
        this.category = category;
    }

    

    public CreateComponentResponse withSubCategory(ComponentSubCategory subCategory) {
        this.subCategory = subCategory;
        return this;
    }

    


    /**
     * Get subCategory
     * @return subCategory
     */
    public ComponentSubCategory getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(ComponentSubCategory subCategory) {
        this.subCategory = subCategory;
    }

    

    public CreateComponentResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public CreateComponentResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    


    /**
     * 项目ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    

    public CreateComponentResponse withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    


    /**
     * 应用ID。
     * @return applicationId
     */
    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    

    public CreateComponentResponse withSource(SourceObject source) {
        this.source = source;
        return this;
    }

    public CreateComponentResponse withSource(Consumer<SourceObject> sourceSetter) {
        if(this.source == null ){
            this.source = new SourceObject();
            sourceSetter.accept(this.source);
        }
        
        return this;
    }


    /**
     * Get source
     * @return source
     */
    public SourceObject getSource() {
        return source;
    }

    public void setSource(SourceObject source) {
        this.source = source;
    }

    

    public CreateComponentResponse withBuild(BuildInfo build) {
        this.build = build;
        return this;
    }

    public CreateComponentResponse withBuild(Consumer<BuildInfo> buildSetter) {
        if(this.build == null ){
            this.build = new BuildInfo();
            buildSetter.accept(this.build);
        }
        
        return this;
    }


    /**
     * Get build
     * @return build
     */
    public BuildInfo getBuild() {
        return build;
    }

    public void setBuild(BuildInfo build) {
        this.build = build;
    }

    

    public CreateComponentResponse withPipelineIds(List<String> pipelineIds) {
        this.pipelineIds = pipelineIds;
        return this;
    }

    
    public CreateComponentResponse addPipelineIdsItem(String pipelineIdsItem) {
        if(this.pipelineIds == null) {
            this.pipelineIds = new ArrayList<>();
        }
        this.pipelineIds.add(pipelineIdsItem);
        return this;
    }

    public CreateComponentResponse withPipelineIds(Consumer<List<String>> pipelineIdsSetter) {
        if(this.pipelineIds == null) {
            this.pipelineIds = new ArrayList<>();
        }
        pipelineIdsSetter.accept(this.pipelineIds);
        return this;
    }

    /**
     * 流水线Id列表，最多10个。
     * @return pipelineIds
     */
    public List<String> getPipelineIds() {
        return pipelineIds;
    }

    public void setPipelineIds(List<String> pipelineIds) {
        this.pipelineIds = pipelineIds;
    }

    

    public CreateComponentResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    


    /**
     * 创建时间。
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    

    public CreateComponentResponse withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    


    /**
     * 修改时间。
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateComponentResponse createComponentResponse = (CreateComponentResponse) o;
        return Objects.equals(this.id, createComponentResponse.id) &&
            Objects.equals(this.name, createComponentResponse.name) &&
            Objects.equals(this.status, createComponentResponse.status) &&
            Objects.equals(this.runtime, createComponentResponse.runtime) &&
            Objects.equals(this.category, createComponentResponse.category) &&
            Objects.equals(this.subCategory, createComponentResponse.subCategory) &&
            Objects.equals(this.description, createComponentResponse.description) &&
            Objects.equals(this.projectId, createComponentResponse.projectId) &&
            Objects.equals(this.applicationId, createComponentResponse.applicationId) &&
            Objects.equals(this.source, createComponentResponse.source) &&
            Objects.equals(this.build, createComponentResponse.build) &&
            Objects.equals(this.pipelineIds, createComponentResponse.pipelineIds) &&
            Objects.equals(this.createTime, createComponentResponse.createTime) &&
            Objects.equals(this.updateTime, createComponentResponse.updateTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, status, runtime, category, subCategory, description, projectId, applicationId, source, build, pipelineIds, createTime, updateTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateComponentResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    runtime: ").append(toIndentedString(runtime)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    subCategory: ").append(toIndentedString(subCategory)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    build: ").append(toIndentedString(build)).append("\n");
        sb.append("    pipelineIds: ").append(toIndentedString(pipelineIds)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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

