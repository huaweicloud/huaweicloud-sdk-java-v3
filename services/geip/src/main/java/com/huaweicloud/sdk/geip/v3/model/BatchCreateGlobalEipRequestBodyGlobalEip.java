package com.huaweicloud.sdk.geip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量创建全域弹性公网IP请求体对象
 */
public class BatchCreateGlobalEipRequestBodyGlobalEip {

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
    @JsonProperty(value = "internet_bandwidth_info")

    private BatchCreateGlobalEipRequestBodyGlobalEipInternetBandwidthInfo internetBandwidthInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<CreateGlobalEipRequestBodyGlobalEipTags> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    public BatchCreateGlobalEipRequestBodyGlobalEip withName(String name) {
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

    public BatchCreateGlobalEipRequestBodyGlobalEip withDescription(String description) {
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

    public BatchCreateGlobalEipRequestBodyGlobalEip withGeipPoolName(String geipPoolName) {
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

    public BatchCreateGlobalEipRequestBodyGlobalEip withAccessSite(String accessSite) {
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

    public BatchCreateGlobalEipRequestBodyGlobalEip withInternetBandwidthInfo(
        BatchCreateGlobalEipRequestBodyGlobalEipInternetBandwidthInfo internetBandwidthInfo) {
        this.internetBandwidthInfo = internetBandwidthInfo;
        return this;
    }

    public BatchCreateGlobalEipRequestBodyGlobalEip withInternetBandwidthInfo(
        Consumer<BatchCreateGlobalEipRequestBodyGlobalEipInternetBandwidthInfo> internetBandwidthInfoSetter) {
        if (this.internetBandwidthInfo == null) {
            this.internetBandwidthInfo = new BatchCreateGlobalEipRequestBodyGlobalEipInternetBandwidthInfo();
            internetBandwidthInfoSetter.accept(this.internetBandwidthInfo);
        }

        return this;
    }

    /**
     * Get internetBandwidthInfo
     * @return internetBandwidthInfo
     */
    public BatchCreateGlobalEipRequestBodyGlobalEipInternetBandwidthInfo getInternetBandwidthInfo() {
        return internetBandwidthInfo;
    }

    public void setInternetBandwidthInfo(
        BatchCreateGlobalEipRequestBodyGlobalEipInternetBandwidthInfo internetBandwidthInfo) {
        this.internetBandwidthInfo = internetBandwidthInfo;
    }

    public BatchCreateGlobalEipRequestBodyGlobalEip withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 批创个数
     * minimum: 1
     * maximum: 9999
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public BatchCreateGlobalEipRequestBodyGlobalEip withTags(List<CreateGlobalEipRequestBodyGlobalEipTags> tags) {
        this.tags = tags;
        return this;
    }

    public BatchCreateGlobalEipRequestBodyGlobalEip addTagsItem(CreateGlobalEipRequestBodyGlobalEipTags tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public BatchCreateGlobalEipRequestBodyGlobalEip withTags(
        Consumer<List<CreateGlobalEipRequestBodyGlobalEipTags>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 全域弹性公网IP标签
     * @return tags
     */
    public List<CreateGlobalEipRequestBodyGlobalEipTags> getTags() {
        return tags;
    }

    public void setTags(List<CreateGlobalEipRequestBodyGlobalEipTags> tags) {
        this.tags = tags;
    }

    public BatchCreateGlobalEipRequestBodyGlobalEip withEnterpriseProjectId(String enterpriseProjectId) {
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
        BatchCreateGlobalEipRequestBodyGlobalEip that = (BatchCreateGlobalEipRequestBodyGlobalEip) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.geipPoolName, that.geipPoolName) && Objects.equals(this.accessSite, that.accessSite)
            && Objects.equals(this.internetBandwidthInfo, that.internetBandwidthInfo)
            && Objects.equals(this.count, that.count) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(name, description, geipPoolName, accessSite, internetBandwidthInfo, count, tags, enterpriseProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateGlobalEipRequestBodyGlobalEip {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    geipPoolName: ").append(toIndentedString(geipPoolName)).append("\n");
        sb.append("    accessSite: ").append(toIndentedString(accessSite)).append("\n");
        sb.append("    internetBandwidthInfo: ").append(toIndentedString(internetBandwidthInfo)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
