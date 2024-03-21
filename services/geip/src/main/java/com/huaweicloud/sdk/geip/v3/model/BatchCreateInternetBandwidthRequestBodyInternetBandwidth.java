package com.huaweicloud.sdk.geip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量创建全域公网带宽请求体对象
 */
public class BatchCreateInternetBandwidthRequestBodyInternetBandwidth {

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
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<CreateGlobalEipRequestBodyGlobalEipTags> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public BatchCreateInternetBandwidthRequestBodyInternetBandwidth withIngressSize(Integer ingressSize) {
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

    public BatchCreateInternetBandwidthRequestBodyInternetBandwidth withChargeMode(String chargeMode) {
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

    public BatchCreateInternetBandwidthRequestBodyInternetBandwidth withIsp(String isp) {
        this.isp = isp;
        return this;
    }

    /**
     * 全域弹性公网IP所属线路
     * @return isp
     */
    public String getIsp() {
        return isp;
    }

    public void setIsp(String isp) {
        this.isp = isp;
    }

    public BatchCreateInternetBandwidthRequestBodyInternetBandwidth withAccessSite(String accessSite) {
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

    public BatchCreateInternetBandwidthRequestBodyInternetBandwidth withSize(Integer size) {
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

    public BatchCreateInternetBandwidthRequestBodyInternetBandwidth withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * - 功能说明：全域公网带宽名称 - 取值范围：1-64，支持数字、字母、中文、_(下划线)、-（中划线）、.（点）
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BatchCreateInternetBandwidthRequestBodyInternetBandwidth withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * - 功能说明：用户自定义的资源描述 - 约束：   - 值的长度最大512字符，由数字、字母、中文、_(下划线)、-（中划线）、.（点）组成。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BatchCreateInternetBandwidthRequestBodyInternetBandwidth withCount(Integer count) {
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

    public BatchCreateInternetBandwidthRequestBodyInternetBandwidth withTags(
        List<CreateGlobalEipRequestBodyGlobalEipTags> tags) {
        this.tags = tags;
        return this;
    }

    public BatchCreateInternetBandwidthRequestBodyInternetBandwidth addTagsItem(
        CreateGlobalEipRequestBodyGlobalEipTags tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public BatchCreateInternetBandwidthRequestBodyInternetBandwidth withTags(
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

    public BatchCreateInternetBandwidthRequestBodyInternetBandwidth withEnterpriseProjectId(
        String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * - 企业项目ID。最大长度36字节，带“-”连字符的UUID格式，或者是字符串“0”。 - 创建全域弹性公网IP时，给全域弹性公网IP绑定企业项目ID。 - 不指定该参数时，默认值是 0 - 关于企业项目ID的获取及企业项目特性的详细信息，请参见[《企业管理用户指南》](https://support.huaweicloud.com/usermanual-em/zh-cn_topic_0126101490.html)。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public BatchCreateInternetBandwidthRequestBodyInternetBandwidth withType(String type) {
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
        BatchCreateInternetBandwidthRequestBodyInternetBandwidth that =
            (BatchCreateInternetBandwidthRequestBodyInternetBandwidth) obj;
        return Objects.equals(this.ingressSize, that.ingressSize) && Objects.equals(this.chargeMode, that.chargeMode)
            && Objects.equals(this.isp, that.isp) && Objects.equals(this.accessSite, that.accessSite)
            && Objects.equals(this.size, that.size) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.count, that.count)
            && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ingressSize,
            chargeMode,
            isp,
            accessSite,
            size,
            name,
            description,
            count,
            tags,
            enterpriseProjectId,
            type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateInternetBandwidthRequestBodyInternetBandwidth {\n");
        sb.append("    ingressSize: ").append(toIndentedString(ingressSize)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    isp: ").append(toIndentedString(isp)).append("\n");
        sb.append("    accessSite: ").append(toIndentedString(accessSite)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
