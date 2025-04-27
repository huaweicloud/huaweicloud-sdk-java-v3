package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListPtrRecordsFloatingResp
 */
public class ListPtrRecordsFloatingResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ptrdname")

    private String ptrdname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ttl")

    private Integer ttl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    private String address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "links")

    private PageLink links;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    public ListPtrRecordsFloatingResp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 反向解析记录的ID，格式形如{region}:{floatingip_id}。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListPtrRecordsFloatingResp withPtrdname(String ptrdname) {
        this.ptrdname = ptrdname;
        return this;
    }

    /**
     * 反向解析记录对应的域名。
     * @return ptrdname
     */
    public String getPtrdname() {
        return ptrdname;
    }

    public void setPtrdname(String ptrdname) {
        this.ptrdname = ptrdname;
    }

    public ListPtrRecordsFloatingResp withDescription(String description) {
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

    public ListPtrRecordsFloatingResp withTtl(Integer ttl) {
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

    public ListPtrRecordsFloatingResp withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * 弹性公网IP的IP地址。
     * @return address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ListPtrRecordsFloatingResp withStatus(String status) {
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

    public ListPtrRecordsFloatingResp withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * 对该资源的当前操作。  取值范围：CREATE，UPDATE，DELETE，NONE。 CREATE：表示创建，UPDATE：表示更新，DELETE：表示删除，NONE：表示无操作
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public ListPtrRecordsFloatingResp withLinks(PageLink links) {
        this.links = links;
        return this;
    }

    public ListPtrRecordsFloatingResp withLinks(Consumer<PageLink> linksSetter) {
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

    public ListPtrRecordsFloatingResp withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public ListPtrRecordsFloatingResp addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ListPtrRecordsFloatingResp withTags(Consumer<List<Tag>> tagsSetter) {
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

    public ListPtrRecordsFloatingResp withEnterpriseProjectId(String enterpriseProjectId) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPtrRecordsFloatingResp that = (ListPtrRecordsFloatingResp) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.ptrdname, that.ptrdname)
            && Objects.equals(this.description, that.description) && Objects.equals(this.ttl, that.ttl)
            && Objects.equals(this.address, that.address) && Objects.equals(this.status, that.status)
            && Objects.equals(this.action, that.action) && Objects.equals(this.links, that.links)
            && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ptrdname, description, ttl, address, status, action, links, tags, enterpriseProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPtrRecordsFloatingResp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    ptrdname: ").append(toIndentedString(ptrdname)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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
