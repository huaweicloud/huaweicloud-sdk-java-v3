package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CsbResource
 */
public class CsbResource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<CsbResourceTag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "affected_resources")

    private List<AffectedResource> affectedResources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "environment")

    private ResourceEnvironment environment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider")

    private String provider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_id")

    private String securityGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "urn")

    private String urn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "urnext")

    private String urnext;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    public CsbResource withTags(List<CsbResourceTag> tags) {
        this.tags = tags;
        return this;
    }

    public CsbResource addTagsItem(CsbResourceTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CsbResource withTags(Consumer<List<CsbResourceTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 资源标签
     * @return tags
     */
    public List<CsbResourceTag> getTags() {
        return tags;
    }

    public void setTags(List<CsbResourceTag> tags) {
        this.tags = tags;
    }

    public CsbResource withAffectedResources(List<AffectedResource> affectedResources) {
        this.affectedResources = affectedResources;
        return this;
    }

    public CsbResource addAffectedResourcesItem(AffectedResource affectedResourcesItem) {
        if (this.affectedResources == null) {
            this.affectedResources = new ArrayList<>();
        }
        this.affectedResources.add(affectedResourcesItem);
        return this;
    }

    public CsbResource withAffectedResources(Consumer<List<AffectedResource>> affectedResourcesSetter) {
        if (this.affectedResources == null) {
            this.affectedResources = new ArrayList<>();
        }
        affectedResourcesSetter.accept(this.affectedResources);
        return this;
    }

    /**
     * 防护资源对象列表
     * @return affectedResources
     */
    public List<AffectedResource> getAffectedResources() {
        return affectedResources;
    }

    public void setAffectedResources(List<AffectedResource> affectedResources) {
        this.affectedResources = affectedResources;
    }

    public CsbResource withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public CsbResource withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 资源描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CsbResource withEnvironment(ResourceEnvironment environment) {
        this.environment = environment;
        return this;
    }

    public CsbResource withEnvironment(Consumer<ResourceEnvironment> environmentSetter) {
        if (this.environment == null) {
            this.environment = new ResourceEnvironment();
            environmentSetter.accept(this.environment);
        }

        return this;
    }

    /**
     * Get environment
     * @return environment
     */
    public ResourceEnvironment getEnvironment() {
        return environment;
    }

    public void setEnvironment(ResourceEnvironment environment) {
        this.environment = environment;
    }

    public CsbResource withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 资源名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CsbResource withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * 所属云服务，dbss
     * @return provider
     */
    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public CsbResource withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源ID
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public CsbResource withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    /**
     * 安全组ID
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public CsbResource withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * 子网ID
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public CsbResource withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 资源类型   - cloudservers: 审计   - dbEncrypt: 加密   - dbOm: 运维
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CsbResource withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public CsbResource withUrn(String urn) {
        this.urn = urn;
        return this;
    }

    /**
     * 资源URN
     * @return urn
     */
    public String getUrn() {
        return urn;
    }

    public void setUrn(String urn) {
        this.urn = urn;
    }

    public CsbResource withUrnext(String urnext) {
        this.urnext = urnext;
        return this;
    }

    /**
     * 资源URN扩展
     * @return urnext
     */
    public String getUrnext() {
        return urnext;
    }

    public void setUrnext(String urnext) {
        this.urnext = urnext;
    }

    public CsbResource withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * VPC ID
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CsbResource that = (CsbResource) obj;
        return Objects.equals(this.tags, that.tags) && Objects.equals(this.affectedResources, that.affectedResources)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.description, that.description)
            && Objects.equals(this.environment, that.environment) && Objects.equals(this.name, that.name)
            && Objects.equals(this.provider, that.provider) && Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.securityGroupId, that.securityGroupId)
            && Objects.equals(this.subnetId, that.subnetId) && Objects.equals(this.type, that.type)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.urn, that.urn)
            && Objects.equals(this.urnext, that.urnext) && Objects.equals(this.vpcId, that.vpcId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tags,
            affectedResources,
            createTime,
            description,
            environment,
            name,
            provider,
            resourceId,
            securityGroupId,
            subnetId,
            type,
            updateTime,
            urn,
            urnext,
            vpcId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CsbResource {\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    affectedResources: ").append(toIndentedString(affectedResources)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
        sb.append("    urnext: ").append(toIndentedString(urnext)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
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
