package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建虚拟网关对象参数
 */
public class CreateVirtualGateway {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_ep_group")

    private List<String> localEpGroup = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_ep_group_ipv6")

    private List<String> localEpGroupIpv6 = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bgp_asn")

    private Integer bgpAsn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    public CreateVirtualGateway withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 虚拟网关接入的VPC的ID
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public CreateVirtualGateway withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 虚拟网关名字
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateVirtualGateway withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 虚拟网关的描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateVirtualGateway withLocalEpGroup(List<String> localEpGroup) {
        this.localEpGroup = localEpGroup;
        return this;
    }

    public CreateVirtualGateway addLocalEpGroupItem(String localEpGroupItem) {
        if (this.localEpGroup == null) {
            this.localEpGroup = new ArrayList<>();
        }
        this.localEpGroup.add(localEpGroupItem);
        return this;
    }

    public CreateVirtualGateway withLocalEpGroup(Consumer<List<String>> localEpGroupSetter) {
        if (this.localEpGroup == null) {
            this.localEpGroup = new ArrayList<>();
        }
        localEpGroupSetter.accept(this.localEpGroup);
        return this;
    }

    /**
     * 虚拟网关到访问云上服务IPv4子网列表，通常是vpc的cidrs
     * @return localEpGroup
     */
    public List<String> getLocalEpGroup() {
        return localEpGroup;
    }

    public void setLocalEpGroup(List<String> localEpGroup) {
        this.localEpGroup = localEpGroup;
    }

    public CreateVirtualGateway withLocalEpGroupIpv6(List<String> localEpGroupIpv6) {
        this.localEpGroupIpv6 = localEpGroupIpv6;
        return this;
    }

    public CreateVirtualGateway addLocalEpGroupIpv6Item(String localEpGroupIpv6Item) {
        if (this.localEpGroupIpv6 == null) {
            this.localEpGroupIpv6 = new ArrayList<>();
        }
        this.localEpGroupIpv6.add(localEpGroupIpv6Item);
        return this;
    }

    public CreateVirtualGateway withLocalEpGroupIpv6(Consumer<List<String>> localEpGroupIpv6Setter) {
        if (this.localEpGroupIpv6 == null) {
            this.localEpGroupIpv6 = new ArrayList<>();
        }
        localEpGroupIpv6Setter.accept(this.localEpGroupIpv6);
        return this;
    }

    /**
     * 预留字段用于虚拟网关到访问云上服务IPv6子网列表，通常是vpc的cidrs
     * @return localEpGroupIpv6
     */
    public List<String> getLocalEpGroupIpv6() {
        return localEpGroupIpv6;
    }

    public void setLocalEpGroupIpv6(List<String> localEpGroupIpv6) {
        this.localEpGroupIpv6 = localEpGroupIpv6;
    }

    public CreateVirtualGateway withBgpAsn(Integer bgpAsn) {
        this.bgpAsn = bgpAsn;
        return this;
    }

    /**
     * 虚拟网关本地的BGP自冶域号(asn)
     * minimum: 1
     * maximum: 4294967295
     * @return bgpAsn
     */
    public Integer getBgpAsn() {
        return bgpAsn;
    }

    public void setBgpAsn(Integer bgpAsn) {
        this.bgpAsn = bgpAsn;
    }

    public CreateVirtualGateway withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 实例所属企业项目ID
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CreateVirtualGateway withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public CreateVirtualGateway addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateVirtualGateway withTags(Consumer<List<Tag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签信息
     * @return tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateVirtualGateway createVirtualGateway = (CreateVirtualGateway) o;
        return Objects.equals(this.vpcId, createVirtualGateway.vpcId)
            && Objects.equals(this.name, createVirtualGateway.name)
            && Objects.equals(this.description, createVirtualGateway.description)
            && Objects.equals(this.localEpGroup, createVirtualGateway.localEpGroup)
            && Objects.equals(this.localEpGroupIpv6, createVirtualGateway.localEpGroupIpv6)
            && Objects.equals(this.bgpAsn, createVirtualGateway.bgpAsn)
            && Objects.equals(this.enterpriseProjectId, createVirtualGateway.enterpriseProjectId)
            && Objects.equals(this.tags, createVirtualGateway.tags);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(vpcId, name, description, localEpGroup, localEpGroupIpv6, bgpAsn, enterpriseProjectId, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVirtualGateway {\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    localEpGroup: ").append(toIndentedString(localEpGroup)).append("\n");
        sb.append("    localEpGroupIpv6: ").append(toIndentedString(localEpGroupIpv6)).append("\n");
        sb.append("    bgpAsn: ").append(toIndentedString(bgpAsn)).append("\n");
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
