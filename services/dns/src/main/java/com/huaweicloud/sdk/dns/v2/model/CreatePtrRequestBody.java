package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreatePtrRequestBody
 */
public class CreatePtrRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip")

    private PublicIpReq publicip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ptrdnames")

    private List<String> ptrdnames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ttl")

    private Integer ttl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    public CreatePtrRequestBody withPublicip(PublicIpReq publicip) {
        this.publicip = publicip;
        return this;
    }

    public CreatePtrRequestBody withPublicip(Consumer<PublicIpReq> publicipSetter) {
        if (this.publicip == null) {
            this.publicip = new PublicIpReq();
            publicipSetter.accept(this.publicip);
        }

        return this;
    }

    /**
     * Get publicip
     * @return publicip
     */
    public PublicIpReq getPublicip() {
        return publicip;
    }

    public void setPublicip(PublicIpReq publicip) {
        this.publicip = publicip;
    }

    public CreatePtrRequestBody withPtrdnames(List<String> ptrdnames) {
        this.ptrdnames = ptrdnames;
        return this;
    }

    public CreatePtrRequestBody addPtrdnamesItem(String ptrdnamesItem) {
        if (this.ptrdnames == null) {
            this.ptrdnames = new ArrayList<>();
        }
        this.ptrdnames.add(ptrdnamesItem);
        return this;
    }

    public CreatePtrRequestBody withPtrdnames(Consumer<List<String>> ptrdnamesSetter) {
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

    public CreatePtrRequestBody withDescription(String description) {
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

    public CreatePtrRequestBody withTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }

    /**
     * 反向解析记录在本地DNS服务器的缓存时间，缓存时间越长更新生效越慢，以秒为单位。取值范围：1～2147483647
     * @return ttl
     */
    public Integer getTtl() {
        return ttl;
    }

    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }

    public CreatePtrRequestBody withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public CreatePtrRequestBody addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreatePtrRequestBody withTags(Consumer<List<Tag>> tagsSetter) {
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

    public CreatePtrRequestBody withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 反向解析关联的企业项目ID，长度不超过36个字符。默认值为0。
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
        CreatePtrRequestBody that = (CreatePtrRequestBody) obj;
        return Objects.equals(this.publicip, that.publicip) && Objects.equals(this.ptrdnames, that.ptrdnames)
            && Objects.equals(this.description, that.description) && Objects.equals(this.ttl, that.ttl)
            && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publicip, ptrdnames, description, ttl, tags, enterpriseProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePtrRequestBody {\n");
        sb.append("    publicip: ").append(toIndentedString(publicip)).append("\n");
        sb.append("    ptrdnames: ").append(toIndentedString(ptrdnames)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
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
