package com.huaweicloud.sdk.elb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v3.model.BandwidthRef;
import com.huaweicloud.sdk.elb.v3.model.CreateLoadBalancerPublicIpOption;
import com.huaweicloud.sdk.elb.v3.model.Tag;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 创建lb实例，支持创建或者绑定ipv4弹性公网和ipv6弹性公网
 */
public class CreateLoadBalancerOption  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vip_address")
    
    private String vipAddress;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vip_subnet_cidr_id")
    
    private String vipSubnetCidrId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ipv6_vip_virsubnet_id")
    
    private String ipv6VipVirsubnetId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="provider")
    
    private String provider;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="l4_flavor_id")
    
    private String l4FlavorId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    private String projectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="guaranteed")
    
    private Boolean guaranteed;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vpc_id")
    
    private String vpcId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="availability_zone_list")
    
    private List<String> availabilityZoneList = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private List<Tag> tags = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="admin_state_up")
    
    private Boolean adminStateUp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="l7_flavor_id")
    
    private String l7FlavorId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="billing_info")
    
    private String billingInfo;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ipv6_bandwidth")
    
    private BandwidthRef ipv6Bandwidth;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="publicip_ids")
    
    private List<String> publicipIds = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="publicip")
    
    private CreateLoadBalancerPublicIpOption publicip;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="elb_virsubnet_ids")
    
    private List<String> elbVirsubnetIds = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ip_target_enable")
    
    private Boolean ipTargetEnable;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="deletion_protection_enable")
    
    private Boolean deletionProtectionEnable;

    public CreateLoadBalancerOption withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 负载均衡器名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public CreateLoadBalancerOption withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 负载均衡器功能说明。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public CreateLoadBalancerOption withVipAddress(String vipAddress) {
        this.vipAddress = vipAddress;
        return this;
    }

    


    /**
     * 负载均衡器的虚拟IP。 1.传入vip_address时必须传入vip_subnet_cidr_id 2.不传入vip_address，自动分配虚拟IP 3.传入vip_address，需要保证该ip地址在子网中未被占用
     * @return vipAddress
     */
    public String getVipAddress() {
        return vipAddress;
    }

    public void setVipAddress(String vipAddress) {
        this.vipAddress = vipAddress;
    }

    

    public CreateLoadBalancerOption withVipSubnetCidrId(String vipSubnetCidrId) {
        this.vipSubnetCidrId = vipSubnetCidrId;
        return this;
    }

    


    /**
     * 负载均衡器所在的子网ID。 说明：vpc_id , vip_subnet_cidr_id, ipv6_vip_virsubnet_id不能同时为空，且需要在同一个vpc下。
     * @return vipSubnetCidrId
     */
    public String getVipSubnetCidrId() {
        return vipSubnetCidrId;
    }

    public void setVipSubnetCidrId(String vipSubnetCidrId) {
        this.vipSubnetCidrId = vipSubnetCidrId;
    }

    

    public CreateLoadBalancerOption withIpv6VipVirsubnetId(String ipv6VipVirsubnetId) {
        this.ipv6VipVirsubnetId = ipv6VipVirsubnetId;
        return this;
    }

    


    /**
     * 双栈实例对应v6的网络id 。注：默认为空，只有开启IPv6时才会传入。  说明：vpc_id，vip_subnet_cidr_id，ipv6_vip_virsubnet_id不能同时为空，且需要在同一个vpc下。
     * @return ipv6VipVirsubnetId
     */
    public String getIpv6VipVirsubnetId() {
        return ipv6VipVirsubnetId;
    }

    public void setIpv6VipVirsubnetId(String ipv6VipVirsubnetId) {
        this.ipv6VipVirsubnetId = ipv6VipVirsubnetId;
    }

    

    public CreateLoadBalancerOption withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    


    /**
     * 负载均衡器的生产者名称。只支持vlb。
     * @return provider
     */
    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    

    public CreateLoadBalancerOption withL4FlavorId(String l4FlavorId) {
        this.l4FlavorId = l4FlavorId;
        return this;
    }

    


    /**
     * 四层Flavor。
     * @return l4FlavorId
     */
    public String getL4FlavorId() {
        return l4FlavorId;
    }

    public void setL4FlavorId(String l4FlavorId) {
        this.l4FlavorId = l4FlavorId;
    }

    

    public CreateLoadBalancerOption withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    


    /**
     * 负载均衡器所在的项目ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    

    public CreateLoadBalancerOption withGuaranteed(Boolean guaranteed) {
        this.guaranteed = guaranteed;
        return this;
    }

    


    /**
     * 共享型：false 保障型：true，当前只支持true。
     * @return guaranteed
     */
    public Boolean getGuaranteed() {
        return guaranteed;
    }

    public void setGuaranteed(Boolean guaranteed) {
        this.guaranteed = guaranteed;
    }

    

    public CreateLoadBalancerOption withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    


    /**
     * 实例对应的vpc属性。 说明：vpc_id，vip_subnet_cidr_id，ipv6_vip_virsubnet_id不能同时为空，且需要在同一个vpc下。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    

    public CreateLoadBalancerOption withAvailabilityZoneList(List<String> availabilityZoneList) {
        this.availabilityZoneList = availabilityZoneList;
        return this;
    }

    
    public CreateLoadBalancerOption addAvailabilityZoneListItem(String availabilityZoneListItem) {
        if(this.availabilityZoneList == null) {
            this.availabilityZoneList = new ArrayList<>();
        }
        this.availabilityZoneList.add(availabilityZoneListItem);
        return this;
    }

    public CreateLoadBalancerOption withAvailabilityZoneList(Consumer<List<String>> availabilityZoneListSetter) {
        if(this.availabilityZoneList == null) {
            this.availabilityZoneList = new ArrayList<>();
        }
        availabilityZoneListSetter.accept(this.availabilityZoneList);
        return this;
    }

    /**
     * 可用区列表。默认指定所有可利用的AZ。 注： 可用AZ的查询方式可用通过调用nova接口查询 /v2/{project_id}/os-availability-zone
     * @return availabilityZoneList
     */
    public List<String> getAvailabilityZoneList() {
        return availabilityZoneList;
    }

    public void setAvailabilityZoneList(List<String> availabilityZoneList) {
        this.availabilityZoneList = availabilityZoneList;
    }

    

    public CreateLoadBalancerOption withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * 企业项目ID。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    

    public CreateLoadBalancerOption withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    
    public CreateLoadBalancerOption addTagsItem(Tag tagsItem) {
        if(this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateLoadBalancerOption withTags(Consumer<List<Tag>> tagsSetter) {
        if(this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 负载均衡的标签列表。示例如下：\"tags\":[{\"key\":\"aaaa\",\"value\":\"mmmaaaaa\"}]
     * @return tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    

    public CreateLoadBalancerOption withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    


    /**
     * 负载均衡器的管理状态。说明：负载均衡器的管理状态。只支持设定为true。
     * @return adminStateUp
     */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    

    public CreateLoadBalancerOption withL7FlavorId(String l7FlavorId) {
        this.l7FlavorId = l7FlavorId;
        return this;
    }

    


    /**
     * 七层Flavor。 
     * @return l7FlavorId
     */
    public String getL7FlavorId() {
        return l7FlavorId;
    }

    public void setL7FlavorId(String l7FlavorId) {
        this.l7FlavorId = l7FlavorId;
    }

    

    public CreateLoadBalancerOption withBillingInfo(String billingInfo) {
        this.billingInfo = billingInfo;
        return this;
    }

    


    /**
     * 预留资源账单信息。
     * @return billingInfo
     */
    public String getBillingInfo() {
        return billingInfo;
    }

    public void setBillingInfo(String billingInfo) {
        this.billingInfo = billingInfo;
    }

    

    public CreateLoadBalancerOption withIpv6Bandwidth(BandwidthRef ipv6Bandwidth) {
        this.ipv6Bandwidth = ipv6Bandwidth;
        return this;
    }

    public CreateLoadBalancerOption withIpv6Bandwidth(Consumer<BandwidthRef> ipv6BandwidthSetter) {
        if(this.ipv6Bandwidth == null ){
            this.ipv6Bandwidth = new BandwidthRef();
            ipv6BandwidthSetter.accept(this.ipv6Bandwidth);
        }
        
        return this;
    }


    /**
     * Get ipv6Bandwidth
     * @return ipv6Bandwidth
     */
    public BandwidthRef getIpv6Bandwidth() {
        return ipv6Bandwidth;
    }

    public void setIpv6Bandwidth(BandwidthRef ipv6Bandwidth) {
        this.ipv6Bandwidth = ipv6Bandwidth;
    }

    

    public CreateLoadBalancerOption withPublicipIds(List<String> publicipIds) {
        this.publicipIds = publicipIds;
        return this;
    }

    
    public CreateLoadBalancerOption addPublicipIdsItem(String publicipIdsItem) {
        if(this.publicipIds == null) {
            this.publicipIds = new ArrayList<>();
        }
        this.publicipIds.add(publicipIdsItem);
        return this;
    }

    public CreateLoadBalancerOption withPublicipIds(Consumer<List<String>> publicipIdsSetter) {
        if(this.publicipIds == null) {
            this.publicipIds = new ArrayList<>();
        }
        publicipIdsSetter.accept(this.publicipIds);
        return this;
    }

    /**
     * 公网EIP的ID，目前只支持一个
     * @return publicipIds
     */
    public List<String> getPublicipIds() {
        return publicipIds;
    }

    public void setPublicipIds(List<String> publicipIds) {
        this.publicipIds = publicipIds;
    }

    

    public CreateLoadBalancerOption withPublicip(CreateLoadBalancerPublicIpOption publicip) {
        this.publicip = publicip;
        return this;
    }

    public CreateLoadBalancerOption withPublicip(Consumer<CreateLoadBalancerPublicIpOption> publicipSetter) {
        if(this.publicip == null ){
            this.publicip = new CreateLoadBalancerPublicIpOption();
            publicipSetter.accept(this.publicip);
        }
        
        return this;
    }


    /**
     * Get publicip
     * @return publicip
     */
    public CreateLoadBalancerPublicIpOption getPublicip() {
        return publicip;
    }

    public void setPublicip(CreateLoadBalancerPublicIpOption publicip) {
        this.publicip = publicip;
    }

    

    public CreateLoadBalancerOption withElbVirsubnetIds(List<String> elbVirsubnetIds) {
        this.elbVirsubnetIds = elbVirsubnetIds;
        return this;
    }

    
    public CreateLoadBalancerOption addElbVirsubnetIdsItem(String elbVirsubnetIdsItem) {
        if(this.elbVirsubnetIds == null) {
            this.elbVirsubnetIds = new ArrayList<>();
        }
        this.elbVirsubnetIds.add(elbVirsubnetIdsItem);
        return this;
    }

    public CreateLoadBalancerOption withElbVirsubnetIds(Consumer<List<String>> elbVirsubnetIdsSetter) {
        if(this.elbVirsubnetIds == null) {
            this.elbVirsubnetIds = new ArrayList<>();
        }
        elbVirsubnetIdsSetter.accept(this.elbVirsubnetIds);
        return this;
    }

    /**
     * 下联面网络id列表 若该字段不指定，在loadbalancer所属的VPC中任意选一个网络id，优选双栈网络
     * @return elbVirsubnetIds
     */
    public List<String> getElbVirsubnetIds() {
        return elbVirsubnetIds;
    }

    public void setElbVirsubnetIds(List<String> elbVirsubnetIds) {
        this.elbVirsubnetIds = elbVirsubnetIds;
    }

    

    public CreateLoadBalancerOption withIpTargetEnable(Boolean ipTargetEnable) {
        this.ipTargetEnable = ipTargetEnable;
        return this;
    }

    


    /**
     * 是否启用跨VPC后端转发
     * @return ipTargetEnable
     */
    public Boolean getIpTargetEnable() {
        return ipTargetEnable;
    }

    public void setIpTargetEnable(Boolean ipTargetEnable) {
        this.ipTargetEnable = ipTargetEnable;
    }

    

    public CreateLoadBalancerOption withDeletionProtectionEnable(Boolean deletionProtectionEnable) {
        this.deletionProtectionEnable = deletionProtectionEnable;
        return this;
    }

    


    /**
     * 是否开启删除保护，默认不开启
     * @return deletionProtectionEnable
     */
    public Boolean getDeletionProtectionEnable() {
        return deletionProtectionEnable;
    }

    public void setDeletionProtectionEnable(Boolean deletionProtectionEnable) {
        this.deletionProtectionEnable = deletionProtectionEnable;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateLoadBalancerOption createLoadBalancerOption = (CreateLoadBalancerOption) o;
        return Objects.equals(this.name, createLoadBalancerOption.name) &&
            Objects.equals(this.description, createLoadBalancerOption.description) &&
            Objects.equals(this.vipAddress, createLoadBalancerOption.vipAddress) &&
            Objects.equals(this.vipSubnetCidrId, createLoadBalancerOption.vipSubnetCidrId) &&
            Objects.equals(this.ipv6VipVirsubnetId, createLoadBalancerOption.ipv6VipVirsubnetId) &&
            Objects.equals(this.provider, createLoadBalancerOption.provider) &&
            Objects.equals(this.l4FlavorId, createLoadBalancerOption.l4FlavorId) &&
            Objects.equals(this.projectId, createLoadBalancerOption.projectId) &&
            Objects.equals(this.guaranteed, createLoadBalancerOption.guaranteed) &&
            Objects.equals(this.vpcId, createLoadBalancerOption.vpcId) &&
            Objects.equals(this.availabilityZoneList, createLoadBalancerOption.availabilityZoneList) &&
            Objects.equals(this.enterpriseProjectId, createLoadBalancerOption.enterpriseProjectId) &&
            Objects.equals(this.tags, createLoadBalancerOption.tags) &&
            Objects.equals(this.adminStateUp, createLoadBalancerOption.adminStateUp) &&
            Objects.equals(this.l7FlavorId, createLoadBalancerOption.l7FlavorId) &&
            Objects.equals(this.billingInfo, createLoadBalancerOption.billingInfo) &&
            Objects.equals(this.ipv6Bandwidth, createLoadBalancerOption.ipv6Bandwidth) &&
            Objects.equals(this.publicipIds, createLoadBalancerOption.publicipIds) &&
            Objects.equals(this.publicip, createLoadBalancerOption.publicip) &&
            Objects.equals(this.elbVirsubnetIds, createLoadBalancerOption.elbVirsubnetIds) &&
            Objects.equals(this.ipTargetEnable, createLoadBalancerOption.ipTargetEnable) &&
            Objects.equals(this.deletionProtectionEnable, createLoadBalancerOption.deletionProtectionEnable);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, description, vipAddress, vipSubnetCidrId, ipv6VipVirsubnetId, provider, l4FlavorId, projectId, guaranteed, vpcId, availabilityZoneList, enterpriseProjectId, tags, adminStateUp, l7FlavorId, billingInfo, ipv6Bandwidth, publicipIds, publicip, elbVirsubnetIds, ipTargetEnable, deletionProtectionEnable);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateLoadBalancerOption {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    vipAddress: ").append(toIndentedString(vipAddress)).append("\n");
        sb.append("    vipSubnetCidrId: ").append(toIndentedString(vipSubnetCidrId)).append("\n");
        sb.append("    ipv6VipVirsubnetId: ").append(toIndentedString(ipv6VipVirsubnetId)).append("\n");
        sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
        sb.append("    l4FlavorId: ").append(toIndentedString(l4FlavorId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    guaranteed: ").append(toIndentedString(guaranteed)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    availabilityZoneList: ").append(toIndentedString(availabilityZoneList)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    l7FlavorId: ").append(toIndentedString(l7FlavorId)).append("\n");
        sb.append("    billingInfo: ").append(toIndentedString(billingInfo)).append("\n");
        sb.append("    ipv6Bandwidth: ").append(toIndentedString(ipv6Bandwidth)).append("\n");
        sb.append("    publicipIds: ").append(toIndentedString(publicipIds)).append("\n");
        sb.append("    publicip: ").append(toIndentedString(publicip)).append("\n");
        sb.append("    elbVirsubnetIds: ").append(toIndentedString(elbVirsubnetIds)).append("\n");
        sb.append("    ipTargetEnable: ").append(toIndentedString(ipTargetEnable)).append("\n");
        sb.append("    deletionProtectionEnable: ").append(toIndentedString(deletionProtectionEnable)).append("\n");
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

