package com.huaweicloud.sdk.servicestage.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.servicestage.v2.model.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ChangeResourceInEnvironmentResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="alias")
    
    private String alias;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    private String projectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="charge_mode")
    
    private String chargeMode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vpc_id")
    
    private String vpcId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="base_resources")
    
    private List<Resource> baseResources = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="optional_resources")
    
    private List<Resource> optionalResources = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="creator")
    
    private String creator;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    
    private Long createTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="update_time")
    
    private Long updateTime;

    public ChangeResourceInEnvironmentResponse withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 环境ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ChangeResourceInEnvironmentResponse withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 环境名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ChangeResourceInEnvironmentResponse withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    


    /**
     * 环境别名。
     * @return alias
     */
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public ChangeResourceInEnvironmentResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 环境描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ChangeResourceInEnvironmentResponse withProjectId(String projectId) {
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

    public ChangeResourceInEnvironmentResponse withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * 企业项目ID。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ChangeResourceInEnvironmentResponse withChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    


    /**
     * 收费模式。
     * @return chargeMode
     */
    public String getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
    }

    public ChangeResourceInEnvironmentResponse withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    


    /**
     * 虚拟私有云ID。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public ChangeResourceInEnvironmentResponse withBaseResources(List<Resource> baseResources) {
        this.baseResources = baseResources;
        return this;
    }

    
    public ChangeResourceInEnvironmentResponse addBaseResourcesItem(Resource baseResourcesItem) {
        if (this.baseResources == null) {
            this.baseResources = new ArrayList<>();
        }
        this.baseResources.add(baseResourcesItem);
        return this;
    }

    public ChangeResourceInEnvironmentResponse withBaseResources(Consumer<List<Resource>> baseResourcesSetter) {
        if(this.baseResources == null ){
            this.baseResources = new ArrayList<>();
        }
        baseResourcesSetter.accept(this.baseResources);
        return this;
    }

    /**
     * 基础资源。
     * @return baseResources
     */
    public List<Resource> getBaseResources() {
        return baseResources;
    }

    public void setBaseResources(List<Resource> baseResources) {
        this.baseResources = baseResources;
    }

    public ChangeResourceInEnvironmentResponse withOptionalResources(List<Resource> optionalResources) {
        this.optionalResources = optionalResources;
        return this;
    }

    
    public ChangeResourceInEnvironmentResponse addOptionalResourcesItem(Resource optionalResourcesItem) {
        if (this.optionalResources == null) {
            this.optionalResources = new ArrayList<>();
        }
        this.optionalResources.add(optionalResourcesItem);
        return this;
    }

    public ChangeResourceInEnvironmentResponse withOptionalResources(Consumer<List<Resource>> optionalResourcesSetter) {
        if(this.optionalResources == null ){
            this.optionalResources = new ArrayList<>();
        }
        optionalResourcesSetter.accept(this.optionalResources);
        return this;
    }

    /**
     * 可选资源。
     * @return optionalResources
     */
    public List<Resource> getOptionalResources() {
        return optionalResources;
    }

    public void setOptionalResources(List<Resource> optionalResources) {
        this.optionalResources = optionalResources;
    }

    public ChangeResourceInEnvironmentResponse withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    


    /**
     * 创建人。
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public ChangeResourceInEnvironmentResponse withCreateTime(Long createTime) {
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

    public ChangeResourceInEnvironmentResponse withUpdateTime(Long updateTime) {
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
        ChangeResourceInEnvironmentResponse changeResourceInEnvironmentResponse = (ChangeResourceInEnvironmentResponse) o;
        return Objects.equals(this.id, changeResourceInEnvironmentResponse.id) &&
            Objects.equals(this.name, changeResourceInEnvironmentResponse.name) &&
            Objects.equals(this.alias, changeResourceInEnvironmentResponse.alias) &&
            Objects.equals(this.description, changeResourceInEnvironmentResponse.description) &&
            Objects.equals(this.projectId, changeResourceInEnvironmentResponse.projectId) &&
            Objects.equals(this.enterpriseProjectId, changeResourceInEnvironmentResponse.enterpriseProjectId) &&
            Objects.equals(this.chargeMode, changeResourceInEnvironmentResponse.chargeMode) &&
            Objects.equals(this.vpcId, changeResourceInEnvironmentResponse.vpcId) &&
            Objects.equals(this.baseResources, changeResourceInEnvironmentResponse.baseResources) &&
            Objects.equals(this.optionalResources, changeResourceInEnvironmentResponse.optionalResources) &&
            Objects.equals(this.creator, changeResourceInEnvironmentResponse.creator) &&
            Objects.equals(this.createTime, changeResourceInEnvironmentResponse.createTime) &&
            Objects.equals(this.updateTime, changeResourceInEnvironmentResponse.updateTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, alias, description, projectId, enterpriseProjectId, chargeMode, vpcId, baseResources, optionalResources, creator, createTime, updateTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeResourceInEnvironmentResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    baseResources: ").append(toIndentedString(baseResources)).append("\n");
        sb.append("    optionalResources: ").append(toIndentedString(optionalResources)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
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

