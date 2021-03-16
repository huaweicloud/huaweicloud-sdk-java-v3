package com.huaweicloud.sdk.elb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListLoadBalancersRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="admin_state_up")
    
    private Boolean adminStateUp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="availability_zone_list")
    
    private List<String> availabilityZoneList = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="billing_info")
    
    private List<String> billingInfo = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="deletion_protection_enable")
    
    private Boolean deletionProtectionEnable;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private List<String> description = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="eips")
    
    private List<String> eips = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private List<String> enterpriseProjectId = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="guaranteed")
    
    private Boolean guaranteed;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private List<String> id = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ip_version")
    
    private List<Integer> ipVersion = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ipv6_vip_address")
    
    private List<String> ipv6VipAddress = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ipv6_vip_port_id")
    
    private List<String> ipv6VipPortId = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ipv6_vip_virsubnet_id")
    
    private List<String> ipv6VipVirsubnetId = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="l4_flavor_id")
    
    private List<String> l4FlavorId = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="l4_scale_flavor_id")
    
    private List<String> l4ScaleFlavorId = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="l7_flavor_id")
    
    private List<String> l7FlavorId = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="l7_scale_flavor_id")
    
    private List<String> l7ScaleFlavorId = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="marker")
    
    private String marker;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="member_address")
    
    private List<String> memberAddress = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="member_device_id")
    
    private List<String> memberDeviceId = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private List<String> name = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="operating_status")
    
    private List<String> operatingStatus = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page_reverse")
    
    private Boolean pageReverse;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="provisioning_status")
    
    private List<String> provisioningStatus = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="publicips")
    
    private List<String> publicips = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vip_address")
    
    private List<String> vipAddress = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vip_port_id")
    
    private List<String> vipPortId = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vip_subnet_cidr_id")
    
    private List<String> vipSubnetCidrId = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vpc_id")
    
    private List<String> vpcId = null;
    
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

    

    public ListLoadBalancersRequest withAvailabilityZoneList(List<String> availabilityZoneList) {
        this.availabilityZoneList = availabilityZoneList;
        return this;
    }

    
    public ListLoadBalancersRequest addAvailabilityZoneListItem(String availabilityZoneListItem) {
        this.availabilityZoneList.add(availabilityZoneListItem);
        return this;
    }

    public ListLoadBalancersRequest withAvailabilityZoneList(Consumer<List<String>> availabilityZoneListSetter) {
        if(this.availabilityZoneList == null ){
            this.availabilityZoneList = new ArrayList<>();
        }
        availabilityZoneListSetter.accept(this.availabilityZoneList);
        return this;
    }

    /**
     * Get availabilityZoneList
     * @return availabilityZoneList
     */
    public List<String> getAvailabilityZoneList() {
        return availabilityZoneList;
    }

    public void setAvailabilityZoneList(List<String> availabilityZoneList) {
        this.availabilityZoneList = availabilityZoneList;
    }

    

    public ListLoadBalancersRequest withBillingInfo(List<String> billingInfo) {
        this.billingInfo = billingInfo;
        return this;
    }

    
    public ListLoadBalancersRequest addBillingInfoItem(String billingInfoItem) {
        this.billingInfo.add(billingInfoItem);
        return this;
    }

    public ListLoadBalancersRequest withBillingInfo(Consumer<List<String>> billingInfoSetter) {
        if(this.billingInfo == null ){
            this.billingInfo = new ArrayList<>();
        }
        billingInfoSetter.accept(this.billingInfo);
        return this;
    }

    /**
     * Get billingInfo
     * @return billingInfo
     */
    public List<String> getBillingInfo() {
        return billingInfo;
    }

    public void setBillingInfo(List<String> billingInfo) {
        this.billingInfo = billingInfo;
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

    

    public ListLoadBalancersRequest withDescription(List<String> description) {
        this.description = description;
        return this;
    }

    
    public ListLoadBalancersRequest addDescriptionItem(String descriptionItem) {
        this.description.add(descriptionItem);
        return this;
    }

    public ListLoadBalancersRequest withDescription(Consumer<List<String>> descriptionSetter) {
        if(this.description == null ){
            this.description = new ArrayList<>();
        }
        descriptionSetter.accept(this.description);
        return this;
    }

    /**
     * Get description
     * @return description
     */
    public List<String> getDescription() {
        return description;
    }

    public void setDescription(List<String> description) {
        this.description = description;
    }

    

    public ListLoadBalancersRequest withEips(List<String> eips) {
        this.eips = eips;
        return this;
    }

    
    public ListLoadBalancersRequest addEipsItem(String eipsItem) {
        this.eips.add(eipsItem);
        return this;
    }

    public ListLoadBalancersRequest withEips(Consumer<List<String>> eipsSetter) {
        if(this.eips == null ){
            this.eips = new ArrayList<>();
        }
        eipsSetter.accept(this.eips);
        return this;
    }

    /**
     * Get eips
     * @return eips
     */
    public List<String> getEips() {
        return eips;
    }

    public void setEips(List<String> eips) {
        this.eips = eips;
    }

    

    public ListLoadBalancersRequest withEnterpriseProjectId(List<String> enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    
    public ListLoadBalancersRequest addEnterpriseProjectIdItem(String enterpriseProjectIdItem) {
        this.enterpriseProjectId.add(enterpriseProjectIdItem);
        return this;
    }

    public ListLoadBalancersRequest withEnterpriseProjectId(Consumer<List<String>> enterpriseProjectIdSetter) {
        if(this.enterpriseProjectId == null ){
            this.enterpriseProjectId = new ArrayList<>();
        }
        enterpriseProjectIdSetter.accept(this.enterpriseProjectId);
        return this;
    }

    /**
     * Get enterpriseProjectId
     * @return enterpriseProjectId
     */
    public List<String> getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(List<String> enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    

    public ListLoadBalancersRequest withGuaranteed(Boolean guaranteed) {
        this.guaranteed = guaranteed;
        return this;
    }

    


    /**
     * Get guaranteed
     * @return guaranteed
     */
    public Boolean getGuaranteed() {
        return guaranteed;
    }

    public void setGuaranteed(Boolean guaranteed) {
        this.guaranteed = guaranteed;
    }

    

    public ListLoadBalancersRequest withId(List<String> id) {
        this.id = id;
        return this;
    }

    
    public ListLoadBalancersRequest addIdItem(String idItem) {
        this.id.add(idItem);
        return this;
    }

    public ListLoadBalancersRequest withId(Consumer<List<String>> idSetter) {
        if(this.id == null ){
            this.id = new ArrayList<>();
        }
        idSetter.accept(this.id);
        return this;
    }

    /**
     * Get id
     * @return id
     */
    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    

    public ListLoadBalancersRequest withIpVersion(List<Integer> ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    
    public ListLoadBalancersRequest addIpVersionItem(Integer ipVersionItem) {
        this.ipVersion.add(ipVersionItem);
        return this;
    }

    public ListLoadBalancersRequest withIpVersion(Consumer<List<Integer>> ipVersionSetter) {
        if(this.ipVersion == null ){
            this.ipVersion = new ArrayList<>();
        }
        ipVersionSetter.accept(this.ipVersion);
        return this;
    }

    /**
     * Get ipVersion
     * @return ipVersion
     */
    public List<Integer> getIpVersion() {
        return ipVersion;
    }

    public void setIpVersion(List<Integer> ipVersion) {
        this.ipVersion = ipVersion;
    }

    

    public ListLoadBalancersRequest withIpv6VipAddress(List<String> ipv6VipAddress) {
        this.ipv6VipAddress = ipv6VipAddress;
        return this;
    }

    
    public ListLoadBalancersRequest addIpv6VipAddressItem(String ipv6VipAddressItem) {
        this.ipv6VipAddress.add(ipv6VipAddressItem);
        return this;
    }

    public ListLoadBalancersRequest withIpv6VipAddress(Consumer<List<String>> ipv6VipAddressSetter) {
        if(this.ipv6VipAddress == null ){
            this.ipv6VipAddress = new ArrayList<>();
        }
        ipv6VipAddressSetter.accept(this.ipv6VipAddress);
        return this;
    }

    /**
     * Get ipv6VipAddress
     * @return ipv6VipAddress
     */
    public List<String> getIpv6VipAddress() {
        return ipv6VipAddress;
    }

    public void setIpv6VipAddress(List<String> ipv6VipAddress) {
        this.ipv6VipAddress = ipv6VipAddress;
    }

    

    public ListLoadBalancersRequest withIpv6VipPortId(List<String> ipv6VipPortId) {
        this.ipv6VipPortId = ipv6VipPortId;
        return this;
    }

    
    public ListLoadBalancersRequest addIpv6VipPortIdItem(String ipv6VipPortIdItem) {
        this.ipv6VipPortId.add(ipv6VipPortIdItem);
        return this;
    }

    public ListLoadBalancersRequest withIpv6VipPortId(Consumer<List<String>> ipv6VipPortIdSetter) {
        if(this.ipv6VipPortId == null ){
            this.ipv6VipPortId = new ArrayList<>();
        }
        ipv6VipPortIdSetter.accept(this.ipv6VipPortId);
        return this;
    }

    /**
     * Get ipv6VipPortId
     * @return ipv6VipPortId
     */
    public List<String> getIpv6VipPortId() {
        return ipv6VipPortId;
    }

    public void setIpv6VipPortId(List<String> ipv6VipPortId) {
        this.ipv6VipPortId = ipv6VipPortId;
    }

    

    public ListLoadBalancersRequest withIpv6VipVirsubnetId(List<String> ipv6VipVirsubnetId) {
        this.ipv6VipVirsubnetId = ipv6VipVirsubnetId;
        return this;
    }

    
    public ListLoadBalancersRequest addIpv6VipVirsubnetIdItem(String ipv6VipVirsubnetIdItem) {
        this.ipv6VipVirsubnetId.add(ipv6VipVirsubnetIdItem);
        return this;
    }

    public ListLoadBalancersRequest withIpv6VipVirsubnetId(Consumer<List<String>> ipv6VipVirsubnetIdSetter) {
        if(this.ipv6VipVirsubnetId == null ){
            this.ipv6VipVirsubnetId = new ArrayList<>();
        }
        ipv6VipVirsubnetIdSetter.accept(this.ipv6VipVirsubnetId);
        return this;
    }

    /**
     * Get ipv6VipVirsubnetId
     * @return ipv6VipVirsubnetId
     */
    public List<String> getIpv6VipVirsubnetId() {
        return ipv6VipVirsubnetId;
    }

    public void setIpv6VipVirsubnetId(List<String> ipv6VipVirsubnetId) {
        this.ipv6VipVirsubnetId = ipv6VipVirsubnetId;
    }

    

    public ListLoadBalancersRequest withL4FlavorId(List<String> l4FlavorId) {
        this.l4FlavorId = l4FlavorId;
        return this;
    }

    
    public ListLoadBalancersRequest addL4FlavorIdItem(String l4FlavorIdItem) {
        this.l4FlavorId.add(l4FlavorIdItem);
        return this;
    }

    public ListLoadBalancersRequest withL4FlavorId(Consumer<List<String>> l4FlavorIdSetter) {
        if(this.l4FlavorId == null ){
            this.l4FlavorId = new ArrayList<>();
        }
        l4FlavorIdSetter.accept(this.l4FlavorId);
        return this;
    }

    /**
     * Get l4FlavorId
     * @return l4FlavorId
     */
    public List<String> getL4FlavorId() {
        return l4FlavorId;
    }

    public void setL4FlavorId(List<String> l4FlavorId) {
        this.l4FlavorId = l4FlavorId;
    }

    

    public ListLoadBalancersRequest withL4ScaleFlavorId(List<String> l4ScaleFlavorId) {
        this.l4ScaleFlavorId = l4ScaleFlavorId;
        return this;
    }

    
    public ListLoadBalancersRequest addL4ScaleFlavorIdItem(String l4ScaleFlavorIdItem) {
        this.l4ScaleFlavorId.add(l4ScaleFlavorIdItem);
        return this;
    }

    public ListLoadBalancersRequest withL4ScaleFlavorId(Consumer<List<String>> l4ScaleFlavorIdSetter) {
        if(this.l4ScaleFlavorId == null ){
            this.l4ScaleFlavorId = new ArrayList<>();
        }
        l4ScaleFlavorIdSetter.accept(this.l4ScaleFlavorId);
        return this;
    }

    /**
     * Get l4ScaleFlavorId
     * @return l4ScaleFlavorId
     */
    public List<String> getL4ScaleFlavorId() {
        return l4ScaleFlavorId;
    }

    public void setL4ScaleFlavorId(List<String> l4ScaleFlavorId) {
        this.l4ScaleFlavorId = l4ScaleFlavorId;
    }

    

    public ListLoadBalancersRequest withL7FlavorId(List<String> l7FlavorId) {
        this.l7FlavorId = l7FlavorId;
        return this;
    }

    
    public ListLoadBalancersRequest addL7FlavorIdItem(String l7FlavorIdItem) {
        this.l7FlavorId.add(l7FlavorIdItem);
        return this;
    }

    public ListLoadBalancersRequest withL7FlavorId(Consumer<List<String>> l7FlavorIdSetter) {
        if(this.l7FlavorId == null ){
            this.l7FlavorId = new ArrayList<>();
        }
        l7FlavorIdSetter.accept(this.l7FlavorId);
        return this;
    }

    /**
     * Get l7FlavorId
     * @return l7FlavorId
     */
    public List<String> getL7FlavorId() {
        return l7FlavorId;
    }

    public void setL7FlavorId(List<String> l7FlavorId) {
        this.l7FlavorId = l7FlavorId;
    }

    

    public ListLoadBalancersRequest withL7ScaleFlavorId(List<String> l7ScaleFlavorId) {
        this.l7ScaleFlavorId = l7ScaleFlavorId;
        return this;
    }

    
    public ListLoadBalancersRequest addL7ScaleFlavorIdItem(String l7ScaleFlavorIdItem) {
        this.l7ScaleFlavorId.add(l7ScaleFlavorIdItem);
        return this;
    }

    public ListLoadBalancersRequest withL7ScaleFlavorId(Consumer<List<String>> l7ScaleFlavorIdSetter) {
        if(this.l7ScaleFlavorId == null ){
            this.l7ScaleFlavorId = new ArrayList<>();
        }
        l7ScaleFlavorIdSetter.accept(this.l7ScaleFlavorId);
        return this;
    }

    /**
     * Get l7ScaleFlavorId
     * @return l7ScaleFlavorId
     */
    public List<String> getL7ScaleFlavorId() {
        return l7ScaleFlavorId;
    }

    public void setL7ScaleFlavorId(List<String> l7ScaleFlavorId) {
        this.l7ScaleFlavorId = l7ScaleFlavorId;
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

    

    public ListLoadBalancersRequest withMemberAddress(List<String> memberAddress) {
        this.memberAddress = memberAddress;
        return this;
    }

    
    public ListLoadBalancersRequest addMemberAddressItem(String memberAddressItem) {
        this.memberAddress.add(memberAddressItem);
        return this;
    }

    public ListLoadBalancersRequest withMemberAddress(Consumer<List<String>> memberAddressSetter) {
        if(this.memberAddress == null ){
            this.memberAddress = new ArrayList<>();
        }
        memberAddressSetter.accept(this.memberAddress);
        return this;
    }

    /**
     * Get memberAddress
     * @return memberAddress
     */
    public List<String> getMemberAddress() {
        return memberAddress;
    }

    public void setMemberAddress(List<String> memberAddress) {
        this.memberAddress = memberAddress;
    }

    

    public ListLoadBalancersRequest withMemberDeviceId(List<String> memberDeviceId) {
        this.memberDeviceId = memberDeviceId;
        return this;
    }

    
    public ListLoadBalancersRequest addMemberDeviceIdItem(String memberDeviceIdItem) {
        this.memberDeviceId.add(memberDeviceIdItem);
        return this;
    }

    public ListLoadBalancersRequest withMemberDeviceId(Consumer<List<String>> memberDeviceIdSetter) {
        if(this.memberDeviceId == null ){
            this.memberDeviceId = new ArrayList<>();
        }
        memberDeviceIdSetter.accept(this.memberDeviceId);
        return this;
    }

    /**
     * Get memberDeviceId
     * @return memberDeviceId
     */
    public List<String> getMemberDeviceId() {
        return memberDeviceId;
    }

    public void setMemberDeviceId(List<String> memberDeviceId) {
        this.memberDeviceId = memberDeviceId;
    }

    

    public ListLoadBalancersRequest withName(List<String> name) {
        this.name = name;
        return this;
    }

    
    public ListLoadBalancersRequest addNameItem(String nameItem) {
        this.name.add(nameItem);
        return this;
    }

    public ListLoadBalancersRequest withName(Consumer<List<String>> nameSetter) {
        if(this.name == null ){
            this.name = new ArrayList<>();
        }
        nameSetter.accept(this.name);
        return this;
    }

    /**
     * Get name
     * @return name
     */
    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    

    public ListLoadBalancersRequest withOperatingStatus(List<String> operatingStatus) {
        this.operatingStatus = operatingStatus;
        return this;
    }

    
    public ListLoadBalancersRequest addOperatingStatusItem(String operatingStatusItem) {
        this.operatingStatus.add(operatingStatusItem);
        return this;
    }

    public ListLoadBalancersRequest withOperatingStatus(Consumer<List<String>> operatingStatusSetter) {
        if(this.operatingStatus == null ){
            this.operatingStatus = new ArrayList<>();
        }
        operatingStatusSetter.accept(this.operatingStatus);
        return this;
    }

    /**
     * Get operatingStatus
     * @return operatingStatus
     */
    public List<String> getOperatingStatus() {
        return operatingStatus;
    }

    public void setOperatingStatus(List<String> operatingStatus) {
        this.operatingStatus = operatingStatus;
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

    

    public ListLoadBalancersRequest withProvisioningStatus(List<String> provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
        return this;
    }

    
    public ListLoadBalancersRequest addProvisioningStatusItem(String provisioningStatusItem) {
        this.provisioningStatus.add(provisioningStatusItem);
        return this;
    }

    public ListLoadBalancersRequest withProvisioningStatus(Consumer<List<String>> provisioningStatusSetter) {
        if(this.provisioningStatus == null ){
            this.provisioningStatus = new ArrayList<>();
        }
        provisioningStatusSetter.accept(this.provisioningStatus);
        return this;
    }

    /**
     * Get provisioningStatus
     * @return provisioningStatus
     */
    public List<String> getProvisioningStatus() {
        return provisioningStatus;
    }

    public void setProvisioningStatus(List<String> provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
    }

    

    public ListLoadBalancersRequest withPublicips(List<String> publicips) {
        this.publicips = publicips;
        return this;
    }

    
    public ListLoadBalancersRequest addPublicipsItem(String publicipsItem) {
        this.publicips.add(publicipsItem);
        return this;
    }

    public ListLoadBalancersRequest withPublicips(Consumer<List<String>> publicipsSetter) {
        if(this.publicips == null ){
            this.publicips = new ArrayList<>();
        }
        publicipsSetter.accept(this.publicips);
        return this;
    }

    /**
     * Get publicips
     * @return publicips
     */
    public List<String> getPublicips() {
        return publicips;
    }

    public void setPublicips(List<String> publicips) {
        this.publicips = publicips;
    }

    

    public ListLoadBalancersRequest withVipAddress(List<String> vipAddress) {
        this.vipAddress = vipAddress;
        return this;
    }

    
    public ListLoadBalancersRequest addVipAddressItem(String vipAddressItem) {
        this.vipAddress.add(vipAddressItem);
        return this;
    }

    public ListLoadBalancersRequest withVipAddress(Consumer<List<String>> vipAddressSetter) {
        if(this.vipAddress == null ){
            this.vipAddress = new ArrayList<>();
        }
        vipAddressSetter.accept(this.vipAddress);
        return this;
    }

    /**
     * Get vipAddress
     * @return vipAddress
     */
    public List<String> getVipAddress() {
        return vipAddress;
    }

    public void setVipAddress(List<String> vipAddress) {
        this.vipAddress = vipAddress;
    }

    

    public ListLoadBalancersRequest withVipPortId(List<String> vipPortId) {
        this.vipPortId = vipPortId;
        return this;
    }

    
    public ListLoadBalancersRequest addVipPortIdItem(String vipPortIdItem) {
        this.vipPortId.add(vipPortIdItem);
        return this;
    }

    public ListLoadBalancersRequest withVipPortId(Consumer<List<String>> vipPortIdSetter) {
        if(this.vipPortId == null ){
            this.vipPortId = new ArrayList<>();
        }
        vipPortIdSetter.accept(this.vipPortId);
        return this;
    }

    /**
     * Get vipPortId
     * @return vipPortId
     */
    public List<String> getVipPortId() {
        return vipPortId;
    }

    public void setVipPortId(List<String> vipPortId) {
        this.vipPortId = vipPortId;
    }

    

    public ListLoadBalancersRequest withVipSubnetCidrId(List<String> vipSubnetCidrId) {
        this.vipSubnetCidrId = vipSubnetCidrId;
        return this;
    }

    
    public ListLoadBalancersRequest addVipSubnetCidrIdItem(String vipSubnetCidrIdItem) {
        this.vipSubnetCidrId.add(vipSubnetCidrIdItem);
        return this;
    }

    public ListLoadBalancersRequest withVipSubnetCidrId(Consumer<List<String>> vipSubnetCidrIdSetter) {
        if(this.vipSubnetCidrId == null ){
            this.vipSubnetCidrId = new ArrayList<>();
        }
        vipSubnetCidrIdSetter.accept(this.vipSubnetCidrId);
        return this;
    }

    /**
     * Get vipSubnetCidrId
     * @return vipSubnetCidrId
     */
    public List<String> getVipSubnetCidrId() {
        return vipSubnetCidrId;
    }

    public void setVipSubnetCidrId(List<String> vipSubnetCidrId) {
        this.vipSubnetCidrId = vipSubnetCidrId;
    }

    

    public ListLoadBalancersRequest withVpcId(List<String> vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    
    public ListLoadBalancersRequest addVpcIdItem(String vpcIdItem) {
        this.vpcId.add(vpcIdItem);
        return this;
    }

    public ListLoadBalancersRequest withVpcId(Consumer<List<String>> vpcIdSetter) {
        if(this.vpcId == null ){
            this.vpcId = new ArrayList<>();
        }
        vpcIdSetter.accept(this.vpcId);
        return this;
    }

    /**
     * Get vpcId
     * @return vpcId
     */
    public List<String> getVpcId() {
        return vpcId;
    }

    public void setVpcId(List<String> vpcId) {
        this.vpcId = vpcId;
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
        return Objects.equals(this.adminStateUp, listLoadBalancersRequest.adminStateUp) &&
            Objects.equals(this.availabilityZoneList, listLoadBalancersRequest.availabilityZoneList) &&
            Objects.equals(this.billingInfo, listLoadBalancersRequest.billingInfo) &&
            Objects.equals(this.deletionProtectionEnable, listLoadBalancersRequest.deletionProtectionEnable) &&
            Objects.equals(this.description, listLoadBalancersRequest.description) &&
            Objects.equals(this.eips, listLoadBalancersRequest.eips) &&
            Objects.equals(this.enterpriseProjectId, listLoadBalancersRequest.enterpriseProjectId) &&
            Objects.equals(this.guaranteed, listLoadBalancersRequest.guaranteed) &&
            Objects.equals(this.id, listLoadBalancersRequest.id) &&
            Objects.equals(this.ipVersion, listLoadBalancersRequest.ipVersion) &&
            Objects.equals(this.ipv6VipAddress, listLoadBalancersRequest.ipv6VipAddress) &&
            Objects.equals(this.ipv6VipPortId, listLoadBalancersRequest.ipv6VipPortId) &&
            Objects.equals(this.ipv6VipVirsubnetId, listLoadBalancersRequest.ipv6VipVirsubnetId) &&
            Objects.equals(this.l4FlavorId, listLoadBalancersRequest.l4FlavorId) &&
            Objects.equals(this.l4ScaleFlavorId, listLoadBalancersRequest.l4ScaleFlavorId) &&
            Objects.equals(this.l7FlavorId, listLoadBalancersRequest.l7FlavorId) &&
            Objects.equals(this.l7ScaleFlavorId, listLoadBalancersRequest.l7ScaleFlavorId) &&
            Objects.equals(this.limit, listLoadBalancersRequest.limit) &&
            Objects.equals(this.marker, listLoadBalancersRequest.marker) &&
            Objects.equals(this.memberAddress, listLoadBalancersRequest.memberAddress) &&
            Objects.equals(this.memberDeviceId, listLoadBalancersRequest.memberDeviceId) &&
            Objects.equals(this.name, listLoadBalancersRequest.name) &&
            Objects.equals(this.operatingStatus, listLoadBalancersRequest.operatingStatus) &&
            Objects.equals(this.pageReverse, listLoadBalancersRequest.pageReverse) &&
            Objects.equals(this.provisioningStatus, listLoadBalancersRequest.provisioningStatus) &&
            Objects.equals(this.publicips, listLoadBalancersRequest.publicips) &&
            Objects.equals(this.vipAddress, listLoadBalancersRequest.vipAddress) &&
            Objects.equals(this.vipPortId, listLoadBalancersRequest.vipPortId) &&
            Objects.equals(this.vipSubnetCidrId, listLoadBalancersRequest.vipSubnetCidrId) &&
            Objects.equals(this.vpcId, listLoadBalancersRequest.vpcId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(adminStateUp, availabilityZoneList, billingInfo, deletionProtectionEnable, description, eips, enterpriseProjectId, guaranteed, id, ipVersion, ipv6VipAddress, ipv6VipPortId, ipv6VipVirsubnetId, l4FlavorId, l4ScaleFlavorId, l7FlavorId, l7ScaleFlavorId, limit, marker, memberAddress, memberDeviceId, name, operatingStatus, pageReverse, provisioningStatus, publicips, vipAddress, vipPortId, vipSubnetCidrId, vpcId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListLoadBalancersRequest {\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    availabilityZoneList: ").append(toIndentedString(availabilityZoneList)).append("\n");
        sb.append("    billingInfo: ").append(toIndentedString(billingInfo)).append("\n");
        sb.append("    deletionProtectionEnable: ").append(toIndentedString(deletionProtectionEnable)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    eips: ").append(toIndentedString(eips)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    guaranteed: ").append(toIndentedString(guaranteed)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    ipVersion: ").append(toIndentedString(ipVersion)).append("\n");
        sb.append("    ipv6VipAddress: ").append(toIndentedString(ipv6VipAddress)).append("\n");
        sb.append("    ipv6VipPortId: ").append(toIndentedString(ipv6VipPortId)).append("\n");
        sb.append("    ipv6VipVirsubnetId: ").append(toIndentedString(ipv6VipVirsubnetId)).append("\n");
        sb.append("    l4FlavorId: ").append(toIndentedString(l4FlavorId)).append("\n");
        sb.append("    l4ScaleFlavorId: ").append(toIndentedString(l4ScaleFlavorId)).append("\n");
        sb.append("    l7FlavorId: ").append(toIndentedString(l7FlavorId)).append("\n");
        sb.append("    l7ScaleFlavorId: ").append(toIndentedString(l7ScaleFlavorId)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    memberAddress: ").append(toIndentedString(memberAddress)).append("\n");
        sb.append("    memberDeviceId: ").append(toIndentedString(memberDeviceId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    operatingStatus: ").append(toIndentedString(operatingStatus)).append("\n");
        sb.append("    pageReverse: ").append(toIndentedString(pageReverse)).append("\n");
        sb.append("    provisioningStatus: ").append(toIndentedString(provisioningStatus)).append("\n");
        sb.append("    publicips: ").append(toIndentedString(publicips)).append("\n");
        sb.append("    vipAddress: ").append(toIndentedString(vipAddress)).append("\n");
        sb.append("    vipPortId: ").append(toIndentedString(vipPortId)).append("\n");
        sb.append("    vipSubnetCidrId: ").append(toIndentedString(vipSubnetCidrId)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
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

