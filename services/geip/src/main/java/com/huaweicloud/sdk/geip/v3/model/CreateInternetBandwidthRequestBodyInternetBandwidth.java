package com.huaweicloud.sdk.geip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 全域公网带宽信息
 */
public class CreateInternetBandwidthRequestBodyInternetBandwidth {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ingress_size")

    private Integer ingressSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_mode")

    private String chargeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isp")

    private String isp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_site")

    private String accessSite;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<CreateGlobalEipRequestBodyGlobalEipTags> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public CreateInternetBandwidthRequestBodyInternetBandwidth withIngressSize(Integer ingressSize) {
        this.ingressSize = ingressSize;
        return this;
    }

    /**
     * 全域公网带宽大小（入云方向）
     * minimum: 1
     * maximum: 2147483647
     * @return ingressSize
     */
    public Integer getIngressSize() {
        return ingressSize;
    }

    public void setIngressSize(Integer ingressSize) {
        this.ingressSize = ingressSize;
    }

    public CreateInternetBandwidthRequestBodyInternetBandwidth withChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    /**
     * 计费模式
     * @return chargeMode
     */
    public String getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
    }

    public CreateInternetBandwidthRequestBodyInternetBandwidth withIsp(String isp) {
        this.isp = isp;
        return this;
    }

    /**
     * 线路
     * @return isp
     */
    public String getIsp() {
        return isp;
    }

    public void setIsp(String isp) {
        this.isp = isp;
    }

    public CreateInternetBandwidthRequestBodyInternetBandwidth withAccessSite(String accessSite) {
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

    public CreateInternetBandwidthRequestBodyInternetBandwidth withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 全域公网带宽大小（出云方向）
     * minimum: 1
     * maximum: 2147483647
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public CreateInternetBandwidthRequestBodyInternetBandwidth withName(String name) {
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

    public CreateInternetBandwidthRequestBodyInternetBandwidth withDescription(String description) {
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

    public CreateInternetBandwidthRequestBodyInternetBandwidth withTags(
        List<CreateGlobalEipRequestBodyGlobalEipTags> tags) {
        this.tags = tags;
        return this;
    }

    public CreateInternetBandwidthRequestBodyInternetBandwidth addTagsItem(
        CreateGlobalEipRequestBodyGlobalEipTags tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateInternetBandwidthRequestBodyInternetBandwidth withTags(
        Consumer<List<CreateGlobalEipRequestBodyGlobalEipTags>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 全域公网带宽标签
     * @return tags
     */
    public List<CreateGlobalEipRequestBodyGlobalEipTags> getTags() {
        return tags;
    }

    public void setTags(List<CreateGlobalEipRequestBodyGlobalEipTags> tags) {
        this.tags = tags;
    }

    public CreateInternetBandwidthRequestBodyInternetBandwidth withEnterpriseProjectId(String enterpriseProjectId) {
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

    public CreateInternetBandwidthRequestBodyInternetBandwidth withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 全域公网带宽类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateInternetBandwidthRequestBodyInternetBandwidth that =
            (CreateInternetBandwidthRequestBodyInternetBandwidth) obj;
        return Objects.equals(this.ingressSize, that.ingressSize) && Objects.equals(this.chargeMode, that.chargeMode)
            && Objects.equals(this.isp, that.isp) && Objects.equals(this.accessSite, that.accessSite)
            && Objects.equals(this.size, that.size) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(ingressSize, chargeMode, isp, accessSite, size, name, description, tags, enterpriseProjectId, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateInternetBandwidthRequestBodyInternetBandwidth {\n");
        sb.append("    ingressSize: ").append(toIndentedString(ingressSize)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    isp: ").append(toIndentedString(isp)).append("\n");
        sb.append("    accessSite: ").append(toIndentedString(accessSite)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
