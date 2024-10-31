package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 按需防火墙实体
 */
public class CreateFirewallReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<CreateFirewallReqTags> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private CreateFirewallReqFlavor flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_info")

    private CreateFirewallReqChargeInfo chargeInfo;

    public CreateFirewallReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 防火墙名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateFirewallReq withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID，用户根据组织规划企业项目，对应的ID为企业项目ID，可通过[如何获取企业项目ID](cfw_02_0027.xml)获取，用户未开启企业项目时为0
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CreateFirewallReq withTags(List<CreateFirewallReqTags> tags) {
        this.tags = tags;
        return this;
    }

    public CreateFirewallReq addTagsItem(CreateFirewallReqTags tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateFirewallReq withTags(Consumer<List<CreateFirewallReqTags>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 服务资源标签列表，防火墙资源添加标签后，可根据键、值组合查询资源，同时可根据键、值组合进行话单合并统计。
     * @return tags
     */
    public List<CreateFirewallReqTags> getTags() {
        return tags;
    }

    public void setTags(List<CreateFirewallReqTags> tags) {
        this.tags = tags;
    }

    public CreateFirewallReq withFlavor(CreateFirewallReqFlavor flavor) {
        this.flavor = flavor;
        return this;
    }

    public CreateFirewallReq withFlavor(Consumer<CreateFirewallReqFlavor> flavorSetter) {
        if (this.flavor == null) {
            this.flavor = new CreateFirewallReqFlavor();
            flavorSetter.accept(this.flavor);
        }

        return this;
    }

    /**
     * Get flavor
     * @return flavor
     */
    public CreateFirewallReqFlavor getFlavor() {
        return flavor;
    }

    public void setFlavor(CreateFirewallReqFlavor flavor) {
        this.flavor = flavor;
    }

    public CreateFirewallReq withChargeInfo(CreateFirewallReqChargeInfo chargeInfo) {
        this.chargeInfo = chargeInfo;
        return this;
    }

    public CreateFirewallReq withChargeInfo(Consumer<CreateFirewallReqChargeInfo> chargeInfoSetter) {
        if (this.chargeInfo == null) {
            this.chargeInfo = new CreateFirewallReqChargeInfo();
            chargeInfoSetter.accept(this.chargeInfo);
        }

        return this;
    }

    /**
     * Get chargeInfo
     * @return chargeInfo
     */
    public CreateFirewallReqChargeInfo getChargeInfo() {
        return chargeInfo;
    }

    public void setChargeInfo(CreateFirewallReqChargeInfo chargeInfo) {
        this.chargeInfo = chargeInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateFirewallReq that = (CreateFirewallReq) obj;
        return Objects.equals(this.name, that.name)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.flavor, that.flavor)
            && Objects.equals(this.chargeInfo, that.chargeInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, enterpriseProjectId, tags, flavor, chargeInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateFirewallReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    chargeInfo: ").append(toIndentedString(chargeInfo)).append("\n");
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
