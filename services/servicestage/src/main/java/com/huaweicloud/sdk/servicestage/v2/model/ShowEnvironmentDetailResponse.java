package com.huaweicloud.sdk.servicestage.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ShowEnvironmentDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alias")

    private String alias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_mode")

    private String chargeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "base_resources")

    private List<Resource> baseResources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "optional_resources")

    private List<Resource> optionalResources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    public ShowEnvironmentDetailResponse withId(String id) {
        this.id = id;
        return this;
    }

    /** 环境ID。
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowEnvironmentDetailResponse withName(String name) {
        this.name = name;
        return this;
    }

    /** 环境名称。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowEnvironmentDetailResponse withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    /** 环境别名。
     * 
     * @return alias */
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public ShowEnvironmentDetailResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 环境描述。
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowEnvironmentDetailResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /** 项目ID。
     * 
     * @return projectId */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ShowEnvironmentDetailResponse withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /** 企业项目ID。
     * 
     * @return enterpriseProjectId */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ShowEnvironmentDetailResponse withChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    /** 收费模式。
     * 
     * @return chargeMode */
    public String getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
    }

    public ShowEnvironmentDetailResponse withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /** 虚拟私有云ID。
     * 
     * @return vpcId */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public ShowEnvironmentDetailResponse withBaseResources(List<Resource> baseResources) {
        this.baseResources = baseResources;
        return this;
    }

    public ShowEnvironmentDetailResponse addBaseResourcesItem(Resource baseResourcesItem) {
        if (this.baseResources == null) {
            this.baseResources = new ArrayList<>();
        }
        this.baseResources.add(baseResourcesItem);
        return this;
    }

    public ShowEnvironmentDetailResponse withBaseResources(Consumer<List<Resource>> baseResourcesSetter) {
        if (this.baseResources == null) {
            this.baseResources = new ArrayList<>();
        }
        baseResourcesSetter.accept(this.baseResources);
        return this;
    }

    /** 基础资源。
     * 
     * @return baseResources */
    public List<Resource> getBaseResources() {
        return baseResources;
    }

    public void setBaseResources(List<Resource> baseResources) {
        this.baseResources = baseResources;
    }

    public ShowEnvironmentDetailResponse withOptionalResources(List<Resource> optionalResources) {
        this.optionalResources = optionalResources;
        return this;
    }

    public ShowEnvironmentDetailResponse addOptionalResourcesItem(Resource optionalResourcesItem) {
        if (this.optionalResources == null) {
            this.optionalResources = new ArrayList<>();
        }
        this.optionalResources.add(optionalResourcesItem);
        return this;
    }

    public ShowEnvironmentDetailResponse withOptionalResources(Consumer<List<Resource>> optionalResourcesSetter) {
        if (this.optionalResources == null) {
            this.optionalResources = new ArrayList<>();
        }
        optionalResourcesSetter.accept(this.optionalResources);
        return this;
    }

    /** 可选资源。
     * 
     * @return optionalResources */
    public List<Resource> getOptionalResources() {
        return optionalResources;
    }

    public void setOptionalResources(List<Resource> optionalResources) {
        this.optionalResources = optionalResources;
    }

    public ShowEnvironmentDetailResponse withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /** 创建人。
     * 
     * @return creator */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public ShowEnvironmentDetailResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /** 创建时间。
     * 
     * @return createTime */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ShowEnvironmentDetailResponse withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /** 修改时间。
     * 
     * @return updateTime */
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
        ShowEnvironmentDetailResponse showEnvironmentDetailResponse = (ShowEnvironmentDetailResponse) o;
        return Objects.equals(this.id, showEnvironmentDetailResponse.id)
            && Objects.equals(this.name, showEnvironmentDetailResponse.name)
            && Objects.equals(this.alias, showEnvironmentDetailResponse.alias)
            && Objects.equals(this.description, showEnvironmentDetailResponse.description)
            && Objects.equals(this.projectId, showEnvironmentDetailResponse.projectId)
            && Objects.equals(this.enterpriseProjectId, showEnvironmentDetailResponse.enterpriseProjectId)
            && Objects.equals(this.chargeMode, showEnvironmentDetailResponse.chargeMode)
            && Objects.equals(this.vpcId, showEnvironmentDetailResponse.vpcId)
            && Objects.equals(this.baseResources, showEnvironmentDetailResponse.baseResources)
            && Objects.equals(this.optionalResources, showEnvironmentDetailResponse.optionalResources)
            && Objects.equals(this.creator, showEnvironmentDetailResponse.creator)
            && Objects.equals(this.createTime, showEnvironmentDetailResponse.createTime)
            && Objects.equals(this.updateTime, showEnvironmentDetailResponse.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            alias,
            description,
            projectId,
            enterpriseProjectId,
            chargeMode,
            vpcId,
            baseResources,
            optionalResources,
            creator,
            createTime,
            updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowEnvironmentDetailResponse {\n");
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

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
