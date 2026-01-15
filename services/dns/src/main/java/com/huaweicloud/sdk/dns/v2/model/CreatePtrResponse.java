package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreatePtrResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip")

    private PublicIpRes publicip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ptrdnames")

    private List<String> ptrdnames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

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

    public CreatePtrResponse withPublicip(PublicIpRes publicip) {
        this.publicip = publicip;
        return this;
    }

    public CreatePtrResponse withPublicip(Consumer<PublicIpRes> publicipSetter) {
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

    public CreatePtrResponse withPtrdnames(List<String> ptrdnames) {
        this.ptrdnames = ptrdnames;
        return this;
    }

    public CreatePtrResponse addPtrdnamesItem(String ptrdnamesItem) {
        if (this.ptrdnames == null) {
            this.ptrdnames = new ArrayList<>();
        }
        this.ptrdnames.add(ptrdnamesItem);
        return this;
    }

    public CreatePtrResponse withPtrdnames(Consumer<List<String>> ptrdnamesSetter) {
        if (this.ptrdnames == null) {
            this.ptrdnames = new ArrayList<>();
        }
        ptrdnamesSetter.accept(this.ptrdnames);
        return this;
    }

    /**
     * 反向解析记录对应的域名列表,最大个数不超过10个。
     * @return ptrdnames
     */
    public List<String> getPtrdnames() {
        return ptrdnames;
    }

    public void setPtrdnames(List<String> ptrdnames) {
        this.ptrdnames = ptrdnames;
    }

    public CreatePtrResponse withId(String id) {
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

    public CreatePtrResponse withDescription(String description) {
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

    public CreatePtrResponse withTtl(Integer ttl) {
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

    public CreatePtrResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 资源状态。 **取值范围：** - ACTIVE：正常 - PENDING_CREATE：创建中 - PENDING_UPDATE：更新中 - PENDING_DELETE：删除中 - PENDING_FREEZE：冻结中 - FREEZE：冻结 - ILLEGAL：违规冻结 - POLICE：公安冻结 - ERROR：失败
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CreatePtrResponse withLinks(PageLink links) {
        this.links = links;
        return this;
    }

    public CreatePtrResponse withLinks(Consumer<PageLink> linksSetter) {
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

    public CreatePtrResponse withEnterpriseProjectId(String enterpriseProjectId) {
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
        CreatePtrResponse that = (CreatePtrResponse) obj;
        return Objects.equals(this.publicip, that.publicip) && Objects.equals(this.ptrdnames, that.ptrdnames)
            && Objects.equals(this.id, that.id) && Objects.equals(this.description, that.description)
            && Objects.equals(this.ttl, that.ttl) && Objects.equals(this.status, that.status)
            && Objects.equals(this.links, that.links)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publicip, ptrdnames, id, description, ttl, status, links, enterpriseProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePtrResponse {\n");
        sb.append("    publicip: ").append(toIndentedString(publicip)).append("\n");
        sb.append("    ptrdnames: ").append(toIndentedString(ptrdnames)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
