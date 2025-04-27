package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * FloatingIpsPtr
 */
public class FloatingIpsPtr {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ptrdnames")

    private List<String> ptrdnames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip")

    private PublicIpRes publicip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ttl")

    private Integer ttl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "links")

    private PageLink links;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    public FloatingIpsPtr withPtrdnames(List<String> ptrdnames) {
        this.ptrdnames = ptrdnames;
        return this;
    }

    public FloatingIpsPtr addPtrdnamesItem(String ptrdnamesItem) {
        if (this.ptrdnames == null) {
            this.ptrdnames = new ArrayList<>();
        }
        this.ptrdnames.add(ptrdnamesItem);
        return this;
    }

    public FloatingIpsPtr withPtrdnames(Consumer<List<String>> ptrdnamesSetter) {
        if (this.ptrdnames == null) {
            this.ptrdnames = new ArrayList<>();
        }
        ptrdnamesSetter.accept(this.ptrdnames);
        return this;
    }

    /**
     * 反向解析记录对应的域名列表，最大个数不超过10个。
     * @return ptrdnames
     */
    public List<String> getPtrdnames() {
        return ptrdnames;
    }

    public void setPtrdnames(List<String> ptrdnames) {
        this.ptrdnames = ptrdnames;
    }

    public FloatingIpsPtr withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 反向解析记录的ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FloatingIpsPtr withPublicip(PublicIpRes publicip) {
        this.publicip = publicip;
        return this;
    }

    public FloatingIpsPtr withPublicip(Consumer<PublicIpRes> publicipSetter) {
        if (this.publicip == null) {
            this.publicip = new PublicIpRes();
            publicipSetter.accept(this.publicip);
        }

        return this;
    }

    /**
     * Get publicip
     * @return publicip
     */
    public PublicIpRes getPublicip() {
        return publicip;
    }

    public void setPublicip(PublicIpRes publicip) {
        this.publicip = publicip;
    }

    public FloatingIpsPtr withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 对反向解析记录的描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public FloatingIpsPtr withTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }

    /**
     * 反向解析记录在本地DNS服务器的缓存时间，缓存时间越长更新生效越慢，以秒为单位。
     * @return ttl
     */
    public Integer getTtl() {
        return ttl;
    }

    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }

    public FloatingIpsPtr withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 资源状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public FloatingIpsPtr withLinks(PageLink links) {
        this.links = links;
        return this;
    }

    public FloatingIpsPtr withLinks(Consumer<PageLink> linksSetter) {
        if (this.links == null) {
            this.links = new PageLink();
            linksSetter.accept(this.links);
        }

        return this;
    }

    /**
     * Get links
     * @return links
     */
    public PageLink getLinks() {
        return links;
    }

    public void setLinks(PageLink links) {
        this.links = links;
    }

    public FloatingIpsPtr withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 反向解析关联的企业项目ID，长度不超过36个字符。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public FloatingIpsPtr withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public FloatingIpsPtr addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public FloatingIpsPtr withTags(Consumer<List<Tag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 资源标签。
     * @return tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FloatingIpsPtr that = (FloatingIpsPtr) obj;
        return Objects.equals(this.ptrdnames, that.ptrdnames) && Objects.equals(this.id, that.id)
            && Objects.equals(this.publicip, that.publicip) && Objects.equals(this.description, that.description)
            && Objects.equals(this.ttl, that.ttl) && Objects.equals(this.status, that.status)
            && Objects.equals(this.links, that.links)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ptrdnames, id, publicip, description, ttl, status, links, enterpriseProjectId, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FloatingIpsPtr {\n");
        sb.append("    ptrdnames: ").append(toIndentedString(ptrdnames)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    publicip: ").append(toIndentedString(publicip)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
