package com.huaweicloud.sdk.elb.v3.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListLoadBalancersRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="marker")
    
    private String marker;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page_reverse")
    
    private Boolean pageReverse;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="admin_state_up")
    
    private Boolean adminStateUp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="provisioning_status")
    
    private String provisioningStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="operating_status")
    
    private String operatingStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="guaranteed")
    
    private String guaranteed;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vpc_id")
    
    private String vpcId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vip_port_id")
    
    private String vipPortId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vip_address")
    
    private String vipAddress;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vip_subnet_cidr_id")
    
    private String vipSubnetCidrId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="l4_flavor_id")
    
    private String l4FlavorId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="l4_scale_flavor_id")
    
    private String l4ScaleFlavorId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ipv6_vip_address")
    
    private String ipv6VipAddress;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ipv6_vip_virsubnet_id")
    
    private String ipv6VipVirsubnetId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ipv6_vip_port_id")
    
    private String ipv6VipPortId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private String tags;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="availability_zone_list")
    
    private String availabilityZoneList;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="eips")
    
    private String eips;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="l7_flavor_id")
    
    private String l7FlavorId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="l7_scale_flavor_id")
    
    private String l7ScaleFlavorId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="billing_info")
    
    private String billingInfo;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="member_device_id")
    
    private String memberDeviceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="member_address")
    
    private String memberAddress;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags-any")
    
    private String tagsAny;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="not-tags")
    
    private String notTags;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="not-tags-any")
    
    private String notTagsAny;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="publicips")
    
    private String publicips;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ip_version")
    
    private Integer ipVersion;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="deletion_protection_enable")
    
    private Boolean deletionProtectionEnable;

    public ListLoadBalancersRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    


    /**
     * Get marker
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListLoadBalancersRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * Get limit
     * minimum: 0
     * maximum: 2000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListLoadBalancersRequest withPageReverse(Boolean pageReverse) {
        this.pageReverse = pageReverse;
        return this;
    }

    


    /**
     * Get pageReverse
     * @return pageReverse
     */
    public Boolean getPageReverse() {
        return pageReverse;
    }

    public void setPageReverse(Boolean pageReverse) {
        this.pageReverse = pageReverse;
    }

    public ListLoadBalancersRequest withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * Get id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListLoadBalancersRequest withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * Get name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListLoadBalancersRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * Get description
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ListLoadBalancersRequest withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    


    /**
     * Get adminStateUp
     * @return adminStateUp
     */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public ListLoadBalancersRequest withProvisioningStatus(String provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
        return this;
    }

    


    /**
     * Get provisioningStatus
     * @return provisioningStatus
     */
    public String getProvisioningStatus() {
        return provisioningStatus;
    }

    public void setProvisioningStatus(String provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
    }

    public ListLoadBalancersRequest withOperatingStatus(String operatingStatus) {
        this.operatingStatus = operatingStatus;
        return this;
    }

    


    /**
     * Get operatingStatus
     * @return operatingStatus
     */
    public String getOperatingStatus() {
        return operatingStatus;
    }

    public void setOperatingStatus(String operatingStatus) {
        this.operatingStatus = operatingStatus;
    }

    public ListLoadBalancersRequest withGuaranteed(String guaranteed) {
        this.guaranteed = guaranteed;
        return this;
    }

    


    /**
     * Get guaranteed
     * @return guaranteed
     */
    public String getGuaranteed() {
        return guaranteed;
    }

    public void setGuaranteed(String guaranteed) {
        this.guaranteed = guaranteed;
    }

    public ListLoadBalancersRequest withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    


    /**
     * Get vpcId
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public ListLoadBalancersRequest withVipPortId(String vipPortId) {
        this.vipPortId = vipPortId;
        return this;
    }

    


    /**
     * Get vipPortId
     * @return vipPortId
     */
    public String getVipPortId() {
        return vipPortId;
    }

    public void setVipPortId(String vipPortId) {
        this.vipPortId = vipPortId;
    }

    public ListLoadBalancersRequest withVipAddress(String vipAddress) {
        this.vipAddress = vipAddress;
        return this;
    }

    


    /**
     * Get vipAddress
     * @return vipAddress
     */
    public String getVipAddress() {
        return vipAddress;
    }

    public void setVipAddress(String vipAddress) {
        this.vipAddress = vipAddress;
    }

    public ListLoadBalancersRequest withVipSubnetCidrId(String vipSubnetCidrId) {
        this.vipSubnetCidrId = vipSubnetCidrId;
        return this;
    }

    


    /**
     * Get vipSubnetCidrId
     * @return vipSubnetCidrId
     */
    public String getVipSubnetCidrId() {
        return vipSubnetCidrId;
    }

    public void setVipSubnetCidrId(String vipSubnetCidrId) {
        this.vipSubnetCidrId = vipSubnetCidrId;
    }

    public ListLoadBalancersRequest withL4FlavorId(String l4FlavorId) {
        this.l4FlavorId = l4FlavorId;
        return this;
    }

    


    /**
     * Get l4FlavorId
     * @return l4FlavorId
     */
    public String getL4FlavorId() {
        return l4FlavorId;
    }

    public void setL4FlavorId(String l4FlavorId) {
        this.l4FlavorId = l4FlavorId;
    }

    public ListLoadBalancersRequest withL4ScaleFlavorId(String l4ScaleFlavorId) {
        this.l4ScaleFlavorId = l4ScaleFlavorId;
        return this;
    }

    


    /**
     * Get l4ScaleFlavorId
     * @return l4ScaleFlavorId
     */
    public String getL4ScaleFlavorId() {
        return l4ScaleFlavorId;
    }

    public void setL4ScaleFlavorId(String l4ScaleFlavorId) {
        this.l4ScaleFlavorId = l4ScaleFlavorId;
    }

    public ListLoadBalancersRequest withIpv6VipAddress(String ipv6VipAddress) {
        this.ipv6VipAddress = ipv6VipAddress;
        return this;
    }

    


    /**
     * Get ipv6VipAddress
     * @return ipv6VipAddress
     */
    public String getIpv6VipAddress() {
        return ipv6VipAddress;
    }

    public void setIpv6VipAddress(String ipv6VipAddress) {
        this.ipv6VipAddress = ipv6VipAddress;
    }

    public ListLoadBalancersRequest withIpv6VipVirsubnetId(String ipv6VipVirsubnetId) {
        this.ipv6VipVirsubnetId = ipv6VipVirsubnetId;
        return this;
    }

    


    /**
     * Get ipv6VipVirsubnetId
     * @return ipv6VipVirsubnetId
     */
    public String getIpv6VipVirsubnetId() {
        return ipv6VipVirsubnetId;
    }

    public void setIpv6VipVirsubnetId(String ipv6VipVirsubnetId) {
        this.ipv6VipVirsubnetId = ipv6VipVirsubnetId;
    }

    public ListLoadBalancersRequest withIpv6VipPortId(String ipv6VipPortId) {
        this.ipv6VipPortId = ipv6VipPortId;
        return this;
    }

    


    /**
     * Get ipv6VipPortId
     * @return ipv6VipPortId
     */
    public String getIpv6VipPortId() {
        return ipv6VipPortId;
    }

    public void setIpv6VipPortId(String ipv6VipPortId) {
        this.ipv6VipPortId = ipv6VipPortId;
    }

    public ListLoadBalancersRequest withTags(String tags) {
        this.tags = tags;
        return this;
    }

    


    /**
     * Get tags
     * @return tags
     */
    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public ListLoadBalancersRequest withAvailabilityZoneList(String availabilityZoneList) {
        this.availabilityZoneList = availabilityZoneList;
        return this;
    }

    


    /**
     * Get availabilityZoneList
     * @return availabilityZoneList
     */
    public String getAvailabilityZoneList() {
        return availabilityZoneList;
    }

    public void setAvailabilityZoneList(String availabilityZoneList) {
        this.availabilityZoneList = availabilityZoneList;
    }

    public ListLoadBalancersRequest withEips(String eips) {
        this.eips = eips;
        return this;
    }

    


    /**
     * Get eips
     * @return eips
     */
    public String getEips() {
        return eips;
    }

    public void setEips(String eips) {
        this.eips = eips;
    }

    public ListLoadBalancersRequest withL7FlavorId(String l7FlavorId) {
        this.l7FlavorId = l7FlavorId;
        return this;
    }

    


    /**
     * Get l7FlavorId
     * @return l7FlavorId
     */
    public String getL7FlavorId() {
        return l7FlavorId;
    }

    public void setL7FlavorId(String l7FlavorId) {
        this.l7FlavorId = l7FlavorId;
    }

    public ListLoadBalancersRequest withL7ScaleFlavorId(String l7ScaleFlavorId) {
        this.l7ScaleFlavorId = l7ScaleFlavorId;
        return this;
    }

    


    /**
     * Get l7ScaleFlavorId
     * @return l7ScaleFlavorId
     */
    public String getL7ScaleFlavorId() {
        return l7ScaleFlavorId;
    }

    public void setL7ScaleFlavorId(String l7ScaleFlavorId) {
        this.l7ScaleFlavorId = l7ScaleFlavorId;
    }

    public ListLoadBalancersRequest withBillingInfo(String billingInfo) {
        this.billingInfo = billingInfo;
        return this;
    }

    


    /**
     * Get billingInfo
     * @return billingInfo
     */
    public String getBillingInfo() {
        return billingInfo;
    }

    public void setBillingInfo(String billingInfo) {
        this.billingInfo = billingInfo;
    }

    public ListLoadBalancersRequest withMemberDeviceId(String memberDeviceId) {
        this.memberDeviceId = memberDeviceId;
        return this;
    }

    


    /**
     * Get memberDeviceId
     * @return memberDeviceId
     */
    public String getMemberDeviceId() {
        return memberDeviceId;
    }

    public void setMemberDeviceId(String memberDeviceId) {
        this.memberDeviceId = memberDeviceId;
    }

    public ListLoadBalancersRequest withMemberAddress(String memberAddress) {
        this.memberAddress = memberAddress;
        return this;
    }

    


    /**
     * Get memberAddress
     * @return memberAddress
     */
    public String getMemberAddress() {
        return memberAddress;
    }

    public void setMemberAddress(String memberAddress) {
        this.memberAddress = memberAddress;
    }

    public ListLoadBalancersRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * Get enterpriseProjectId
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListLoadBalancersRequest withTagsAny(String tagsAny) {
        this.tagsAny = tagsAny;
        return this;
    }

    


    /**
     * Get tagsAny
     * @return tagsAny
     */
    public String getTagsAny() {
        return tagsAny;
    }

    public void setTagsAny(String tagsAny) {
        this.tagsAny = tagsAny;
    }

    public ListLoadBalancersRequest withNotTags(String notTags) {
        this.notTags = notTags;
        return this;
    }

    


    /**
     * Get notTags
     * @return notTags
     */
    public String getNotTags() {
        return notTags;
    }

    public void setNotTags(String notTags) {
        this.notTags = notTags;
    }

    public ListLoadBalancersRequest withNotTagsAny(String notTagsAny) {
        this.notTagsAny = notTagsAny;
        return this;
    }

    


    /**
     * Get notTagsAny
     * @return notTagsAny
     */
    public String getNotTagsAny() {
        return notTagsAny;
    }

    public void setNotTagsAny(String notTagsAny) {
        this.notTagsAny = notTagsAny;
    }

    public ListLoadBalancersRequest withPublicips(String publicips) {
        this.publicips = publicips;
        return this;
    }

    


    /**
     * Get publicips
     * @return publicips
     */
    public String getPublicips() {
        return publicips;
    }

    public void setPublicips(String publicips) {
        this.publicips = publicips;
    }

    public ListLoadBalancersRequest withIpVersion(Integer ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    


    /**
     * Get ipVersion
     * @return ipVersion
     */
    public Integer getIpVersion() {
        return ipVersion;
    }

    public void setIpVersion(Integer ipVersion) {
        this.ipVersion = ipVersion;
    }

    public ListLoadBalancersRequest withDeletionProtectionEnable(Boolean deletionProtectionEnable) {
        this.deletionProtectionEnable = deletionProtectionEnable;
        return this;
    }

    


    /**
     * Get deletionProtectionEnable
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
        ListLoadBalancersRequest listLoadBalancersRequest = (ListLoadBalancersRequest) o;
        return Objects.equals(this.marker, listLoadBalancersRequest.marker) &&
            Objects.equals(this.limit, listLoadBalancersRequest.limit) &&
            Objects.equals(this.pageReverse, listLoadBalancersRequest.pageReverse) &&
            Objects.equals(this.id, listLoadBalancersRequest.id) &&
            Objects.equals(this.name, listLoadBalancersRequest.name) &&
            Objects.equals(this.description, listLoadBalancersRequest.description) &&
            Objects.equals(this.adminStateUp, listLoadBalancersRequest.adminStateUp) &&
            Objects.equals(this.provisioningStatus, listLoadBalancersRequest.provisioningStatus) &&
            Objects.equals(this.operatingStatus, listLoadBalancersRequest.operatingStatus) &&
            Objects.equals(this.guaranteed, listLoadBalancersRequest.guaranteed) &&
            Objects.equals(this.vpcId, listLoadBalancersRequest.vpcId) &&
            Objects.equals(this.vipPortId, listLoadBalancersRequest.vipPortId) &&
            Objects.equals(this.vipAddress, listLoadBalancersRequest.vipAddress) &&
            Objects.equals(this.vipSubnetCidrId, listLoadBalancersRequest.vipSubnetCidrId) &&
            Objects.equals(this.l4FlavorId, listLoadBalancersRequest.l4FlavorId) &&
            Objects.equals(this.l4ScaleFlavorId, listLoadBalancersRequest.l4ScaleFlavorId) &&
            Objects.equals(this.ipv6VipAddress, listLoadBalancersRequest.ipv6VipAddress) &&
            Objects.equals(this.ipv6VipVirsubnetId, listLoadBalancersRequest.ipv6VipVirsubnetId) &&
            Objects.equals(this.ipv6VipPortId, listLoadBalancersRequest.ipv6VipPortId) &&
            Objects.equals(this.tags, listLoadBalancersRequest.tags) &&
            Objects.equals(this.availabilityZoneList, listLoadBalancersRequest.availabilityZoneList) &&
            Objects.equals(this.eips, listLoadBalancersRequest.eips) &&
            Objects.equals(this.l7FlavorId, listLoadBalancersRequest.l7FlavorId) &&
            Objects.equals(this.l7ScaleFlavorId, listLoadBalancersRequest.l7ScaleFlavorId) &&
            Objects.equals(this.billingInfo, listLoadBalancersRequest.billingInfo) &&
            Objects.equals(this.memberDeviceId, listLoadBalancersRequest.memberDeviceId) &&
            Objects.equals(this.memberAddress, listLoadBalancersRequest.memberAddress) &&
            Objects.equals(this.enterpriseProjectId, listLoadBalancersRequest.enterpriseProjectId) &&
            Objects.equals(this.tagsAny, listLoadBalancersRequest.tagsAny) &&
            Objects.equals(this.notTags, listLoadBalancersRequest.notTags) &&
            Objects.equals(this.notTagsAny, listLoadBalancersRequest.notTagsAny) &&
            Objects.equals(this.publicips, listLoadBalancersRequest.publicips) &&
            Objects.equals(this.ipVersion, listLoadBalancersRequest.ipVersion) &&
            Objects.equals(this.deletionProtectionEnable, listLoadBalancersRequest.deletionProtectionEnable);
    }
    @Override
    public int hashCode() {
        return Objects.hash(marker, limit, pageReverse, id, name, description, adminStateUp, provisioningStatus, operatingStatus, guaranteed, vpcId, vipPortId, vipAddress, vipSubnetCidrId, l4FlavorId, l4ScaleFlavorId, ipv6VipAddress, ipv6VipVirsubnetId, ipv6VipPortId, tags, availabilityZoneList, eips, l7FlavorId, l7ScaleFlavorId, billingInfo, memberDeviceId, memberAddress, enterpriseProjectId, tagsAny, notTags, notTagsAny, publicips, ipVersion, deletionProtectionEnable);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListLoadBalancersRequest {\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    pageReverse: ").append(toIndentedString(pageReverse)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    provisioningStatus: ").append(toIndentedString(provisioningStatus)).append("\n");
        sb.append("    operatingStatus: ").append(toIndentedString(operatingStatus)).append("\n");
        sb.append("    guaranteed: ").append(toIndentedString(guaranteed)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    vipPortId: ").append(toIndentedString(vipPortId)).append("\n");
        sb.append("    vipAddress: ").append(toIndentedString(vipAddress)).append("\n");
        sb.append("    vipSubnetCidrId: ").append(toIndentedString(vipSubnetCidrId)).append("\n");
        sb.append("    l4FlavorId: ").append(toIndentedString(l4FlavorId)).append("\n");
        sb.append("    l4ScaleFlavorId: ").append(toIndentedString(l4ScaleFlavorId)).append("\n");
        sb.append("    ipv6VipAddress: ").append(toIndentedString(ipv6VipAddress)).append("\n");
        sb.append("    ipv6VipVirsubnetId: ").append(toIndentedString(ipv6VipVirsubnetId)).append("\n");
        sb.append("    ipv6VipPortId: ").append(toIndentedString(ipv6VipPortId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    availabilityZoneList: ").append(toIndentedString(availabilityZoneList)).append("\n");
        sb.append("    eips: ").append(toIndentedString(eips)).append("\n");
        sb.append("    l7FlavorId: ").append(toIndentedString(l7FlavorId)).append("\n");
        sb.append("    l7ScaleFlavorId: ").append(toIndentedString(l7ScaleFlavorId)).append("\n");
        sb.append("    billingInfo: ").append(toIndentedString(billingInfo)).append("\n");
        sb.append("    memberDeviceId: ").append(toIndentedString(memberDeviceId)).append("\n");
        sb.append("    memberAddress: ").append(toIndentedString(memberAddress)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    tagsAny: ").append(toIndentedString(tagsAny)).append("\n");
        sb.append("    notTags: ").append(toIndentedString(notTags)).append("\n");
        sb.append("    notTagsAny: ").append(toIndentedString(notTagsAny)).append("\n");
        sb.append("    publicips: ").append(toIndentedString(publicips)).append("\n");
        sb.append("    ipVersion: ").append(toIndentedString(ipVersion)).append("\n");
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

