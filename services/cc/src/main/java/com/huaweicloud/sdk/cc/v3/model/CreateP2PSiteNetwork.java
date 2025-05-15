package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建P2P类型的分支网络的请求体。
 */
public class CreateP2PSiteNetwork {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sites")

    private List<CreateSiteInformation> sites = null;

    public CreateP2PSiteNetwork withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 实例名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateP2PSiteNetwork withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 实例描述。不支持 <>。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateP2PSiteNetwork withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public CreateP2PSiteNetwork addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateP2PSiteNetwork withTags(Consumer<List<Tag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 实例标签。
     * @return tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public CreateP2PSiteNetwork withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 实例所属企业项目ID。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CreateP2PSiteNetwork withSites(List<CreateSiteInformation> sites) {
        this.sites = sites;
        return this;
    }

    public CreateP2PSiteNetwork addSitesItem(CreateSiteInformation sitesItem) {
        if (this.sites == null) {
            this.sites = new ArrayList<>();
        }
        this.sites.add(sitesItem);
        return this;
    }

    public CreateP2PSiteNetwork withSites(Consumer<List<CreateSiteInformation>> sitesSetter) {
        if (this.sites == null) {
            this.sites = new ArrayList<>();
        }
        sitesSetter.accept(this.sites);
        return this;
    }

    /**
     * 端到端（P2P）类型分支网络连接的两个端点定义，长度固定为2的数组。
     * @return sites
     */
    public List<CreateSiteInformation> getSites() {
        return sites;
    }

    public void setSites(List<CreateSiteInformation> sites) {
        this.sites = sites;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateP2PSiteNetwork that = (CreateP2PSiteNetwork) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.sites, that.sites);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, tags, enterpriseProjectId, sites);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateP2PSiteNetwork {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    sites: ").append(toIndentedString(sites)).append("\n");
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
