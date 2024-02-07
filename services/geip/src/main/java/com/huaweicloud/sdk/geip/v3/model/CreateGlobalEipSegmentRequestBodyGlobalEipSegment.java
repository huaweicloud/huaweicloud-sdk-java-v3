package com.huaweicloud.sdk.geip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建全域弹性公网IP段请求对象信息
 */
public class CreateGlobalEipSegmentRequestBodyGlobalEipSegment {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "geip_pool_name")

    private String geipPoolName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_site")

    private String accessSite;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mask")

    private Integer mask;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "internet_bandwidth")

    private CreateGlobalEipSegmentRequestBodyGlobalEipSegmentInternetBandwidth internetBandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<CreateGlobalEipRequestBodyGlobalEipTags> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    public CreateGlobalEipSegmentRequestBodyGlobalEipSegment withName(String name) {
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

    public CreateGlobalEipSegmentRequestBodyGlobalEipSegment withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 用户自定义的资源描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateGlobalEipSegmentRequestBodyGlobalEipSegment withGeipPoolName(String geipPoolName) {
        this.geipPoolName = geipPoolName;
        return this;
    }

    /**
     * 全域弹性公网IP池子名称
     * @return geipPoolName
     */
    public String getGeipPoolName() {
        return geipPoolName;
    }

    public void setGeipPoolName(String geipPoolName) {
        this.geipPoolName = geipPoolName;
    }

    public CreateGlobalEipSegmentRequestBodyGlobalEipSegment withAccessSite(String accessSite) {
        this.accessSite = accessSite;
        return this;
    }

    /**
     * 接入点信息
     * @return accessSite
     */
    public String getAccessSite() {
        return accessSite;
    }

    public void setAccessSite(String accessSite) {
        this.accessSite = accessSite;
    }

    public CreateGlobalEipSegmentRequestBodyGlobalEipSegment withMask(Integer mask) {
        this.mask = mask;
        return this;
    }

    /**
     * 掩码长度。取值范围由GET /v3/{domain_id}/global-eip-segments/support-masks接口提供
     * minimum: 1
     * maximum: 128
     * @return mask
     */
    public Integer getMask() {
        return mask;
    }

    public void setMask(Integer mask) {
        this.mask = mask;
    }

    public CreateGlobalEipSegmentRequestBodyGlobalEipSegment withInternetBandwidth(
        CreateGlobalEipSegmentRequestBodyGlobalEipSegmentInternetBandwidth internetBandwidth) {
        this.internetBandwidth = internetBandwidth;
        return this;
    }

    public CreateGlobalEipSegmentRequestBodyGlobalEipSegment withInternetBandwidth(
        Consumer<CreateGlobalEipSegmentRequestBodyGlobalEipSegmentInternetBandwidth> internetBandwidthSetter) {
        if (this.internetBandwidth == null) {
            this.internetBandwidth = new CreateGlobalEipSegmentRequestBodyGlobalEipSegmentInternetBandwidth();
            internetBandwidthSetter.accept(this.internetBandwidth);
        }

        return this;
    }

    /**
     * Get internetBandwidth
     * @return internetBandwidth
     */
    public CreateGlobalEipSegmentRequestBodyGlobalEipSegmentInternetBandwidth getInternetBandwidth() {
        return internetBandwidth;
    }

    public void setInternetBandwidth(
        CreateGlobalEipSegmentRequestBodyGlobalEipSegmentInternetBandwidth internetBandwidth) {
        this.internetBandwidth = internetBandwidth;
    }

    public CreateGlobalEipSegmentRequestBodyGlobalEipSegment withTags(
        List<CreateGlobalEipRequestBodyGlobalEipTags> tags) {
        this.tags = tags;
        return this;
    }

    public CreateGlobalEipSegmentRequestBodyGlobalEipSegment addTagsItem(
        CreateGlobalEipRequestBodyGlobalEipTags tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateGlobalEipSegmentRequestBodyGlobalEipSegment withTags(
        Consumer<List<CreateGlobalEipRequestBodyGlobalEipTags>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 全域弹性公网IP段标签
     * @return tags
     */
    public List<CreateGlobalEipRequestBodyGlobalEipTags> getTags() {
        return tags;
    }

    public void setTags(List<CreateGlobalEipRequestBodyGlobalEipTags> tags) {
        this.tags = tags;
    }

    public CreateGlobalEipSegmentRequestBodyGlobalEipSegment withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 资源的企业项目id
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
        CreateGlobalEipSegmentRequestBodyGlobalEipSegment that =
            (CreateGlobalEipSegmentRequestBodyGlobalEipSegment) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.geipPoolName, that.geipPoolName) && Objects.equals(this.accessSite, that.accessSite)
            && Objects.equals(this.mask, that.mask) && Objects.equals(this.internetBandwidth, that.internetBandwidth)
            && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(name, description, geipPoolName, accessSite, mask, internetBandwidth, tags, enterpriseProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateGlobalEipSegmentRequestBodyGlobalEipSegment {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    geipPoolName: ").append(toIndentedString(geipPoolName)).append("\n");
        sb.append("    accessSite: ").append(toIndentedString(accessSite)).append("\n");
        sb.append("    mask: ").append(toIndentedString(mask)).append("\n");
        sb.append("    internetBandwidth: ").append(toIndentedString(internetBandwidth)).append("\n");
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
