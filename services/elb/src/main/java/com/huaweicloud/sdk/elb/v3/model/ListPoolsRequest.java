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
public class ListPoolsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="admin_state_up")
    
    private Boolean adminStateUp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private List<String> description = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private List<String> enterpriseProjectId = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="healthmonitor_id")
    
    private List<String> healthmonitorId = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private List<String> id = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ip_version")
    
    private List<String> ipVersion = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="lb_algorithm")
    
    private List<String> lbAlgorithm = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="loadbalancer_id")
    
    private List<String> loadbalancerId = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="marker")
    
    private String marker;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="member_address")
    
    private List<String> memberAddress = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="member_deletion_protection_enable")
    
    private Boolean memberDeletionProtectionEnable;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="member_device_id")
    
    private List<String> memberDeviceId = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private List<String> name = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page_reverse")
    
    private Boolean pageReverse;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="protocol")
    
    private List<String> protocol = null;
    
    public ListPoolsRequest withAdminStateUp(Boolean adminStateUp) {
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

    public ListPoolsRequest withDescription(List<String> description) {
        this.description = description;
        return this;
    }

    
    public ListPoolsRequest addDescriptionItem(String descriptionItem) {
        if (this.description == null) {
            this.description = new ArrayList<>();
        }
        this.description.add(descriptionItem);
        return this;
    }

    public ListPoolsRequest withDescription(Consumer<List<String>> descriptionSetter) {
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

    public ListPoolsRequest withEnterpriseProjectId(List<String> enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    
    public ListPoolsRequest addEnterpriseProjectIdItem(String enterpriseProjectIdItem) {
        if (this.enterpriseProjectId == null) {
            this.enterpriseProjectId = new ArrayList<>();
        }
        this.enterpriseProjectId.add(enterpriseProjectIdItem);
        return this;
    }

    public ListPoolsRequest withEnterpriseProjectId(Consumer<List<String>> enterpriseProjectIdSetter) {
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

    public ListPoolsRequest withHealthmonitorId(List<String> healthmonitorId) {
        this.healthmonitorId = healthmonitorId;
        return this;
    }

    
    public ListPoolsRequest addHealthmonitorIdItem(String healthmonitorIdItem) {
        if (this.healthmonitorId == null) {
            this.healthmonitorId = new ArrayList<>();
        }
        this.healthmonitorId.add(healthmonitorIdItem);
        return this;
    }

    public ListPoolsRequest withHealthmonitorId(Consumer<List<String>> healthmonitorIdSetter) {
        if(this.healthmonitorId == null ){
            this.healthmonitorId = new ArrayList<>();
        }
        healthmonitorIdSetter.accept(this.healthmonitorId);
        return this;
    }

    /**
     * Get healthmonitorId
     * @return healthmonitorId
     */
    public List<String> getHealthmonitorId() {
        return healthmonitorId;
    }

    public void setHealthmonitorId(List<String> healthmonitorId) {
        this.healthmonitorId = healthmonitorId;
    }

    public ListPoolsRequest withId(List<String> id) {
        this.id = id;
        return this;
    }

    
    public ListPoolsRequest addIdItem(String idItem) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        this.id.add(idItem);
        return this;
    }

    public ListPoolsRequest withId(Consumer<List<String>> idSetter) {
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

    public ListPoolsRequest withIpVersion(List<String> ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    
    public ListPoolsRequest addIpVersionItem(String ipVersionItem) {
        if (this.ipVersion == null) {
            this.ipVersion = new ArrayList<>();
        }
        this.ipVersion.add(ipVersionItem);
        return this;
    }

    public ListPoolsRequest withIpVersion(Consumer<List<String>> ipVersionSetter) {
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
    public List<String> getIpVersion() {
        return ipVersion;
    }

    public void setIpVersion(List<String> ipVersion) {
        this.ipVersion = ipVersion;
    }

    public ListPoolsRequest withLbAlgorithm(List<String> lbAlgorithm) {
        this.lbAlgorithm = lbAlgorithm;
        return this;
    }

    
    public ListPoolsRequest addLbAlgorithmItem(String lbAlgorithmItem) {
        if (this.lbAlgorithm == null) {
            this.lbAlgorithm = new ArrayList<>();
        }
        this.lbAlgorithm.add(lbAlgorithmItem);
        return this;
    }

    public ListPoolsRequest withLbAlgorithm(Consumer<List<String>> lbAlgorithmSetter) {
        if(this.lbAlgorithm == null ){
            this.lbAlgorithm = new ArrayList<>();
        }
        lbAlgorithmSetter.accept(this.lbAlgorithm);
        return this;
    }

    /**
     * Get lbAlgorithm
     * @return lbAlgorithm
     */
    public List<String> getLbAlgorithm() {
        return lbAlgorithm;
    }

    public void setLbAlgorithm(List<String> lbAlgorithm) {
        this.lbAlgorithm = lbAlgorithm;
    }

    public ListPoolsRequest withLimit(Integer limit) {
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

    public ListPoolsRequest withLoadbalancerId(List<String> loadbalancerId) {
        this.loadbalancerId = loadbalancerId;
        return this;
    }

    
    public ListPoolsRequest addLoadbalancerIdItem(String loadbalancerIdItem) {
        if (this.loadbalancerId == null) {
            this.loadbalancerId = new ArrayList<>();
        }
        this.loadbalancerId.add(loadbalancerIdItem);
        return this;
    }

    public ListPoolsRequest withLoadbalancerId(Consumer<List<String>> loadbalancerIdSetter) {
        if(this.loadbalancerId == null ){
            this.loadbalancerId = new ArrayList<>();
        }
        loadbalancerIdSetter.accept(this.loadbalancerId);
        return this;
    }

    /**
     * Get loadbalancerId
     * @return loadbalancerId
     */
    public List<String> getLoadbalancerId() {
        return loadbalancerId;
    }

    public void setLoadbalancerId(List<String> loadbalancerId) {
        this.loadbalancerId = loadbalancerId;
    }

    public ListPoolsRequest withMarker(String marker) {
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

    public ListPoolsRequest withMemberAddress(List<String> memberAddress) {
        this.memberAddress = memberAddress;
        return this;
    }

    
    public ListPoolsRequest addMemberAddressItem(String memberAddressItem) {
        if (this.memberAddress == null) {
            this.memberAddress = new ArrayList<>();
        }
        this.memberAddress.add(memberAddressItem);
        return this;
    }

    public ListPoolsRequest withMemberAddress(Consumer<List<String>> memberAddressSetter) {
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

    public ListPoolsRequest withMemberDeletionProtectionEnable(Boolean memberDeletionProtectionEnable) {
        this.memberDeletionProtectionEnable = memberDeletionProtectionEnable;
        return this;
    }

    


    /**
     * Get memberDeletionProtectionEnable
     * @return memberDeletionProtectionEnable
     */
    public Boolean getMemberDeletionProtectionEnable() {
        return memberDeletionProtectionEnable;
    }

    public void setMemberDeletionProtectionEnable(Boolean memberDeletionProtectionEnable) {
        this.memberDeletionProtectionEnable = memberDeletionProtectionEnable;
    }

    public ListPoolsRequest withMemberDeviceId(List<String> memberDeviceId) {
        this.memberDeviceId = memberDeviceId;
        return this;
    }

    
    public ListPoolsRequest addMemberDeviceIdItem(String memberDeviceIdItem) {
        if (this.memberDeviceId == null) {
            this.memberDeviceId = new ArrayList<>();
        }
        this.memberDeviceId.add(memberDeviceIdItem);
        return this;
    }

    public ListPoolsRequest withMemberDeviceId(Consumer<List<String>> memberDeviceIdSetter) {
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

    public ListPoolsRequest withName(List<String> name) {
        this.name = name;
        return this;
    }

    
    public ListPoolsRequest addNameItem(String nameItem) {
        if (this.name == null) {
            this.name = new ArrayList<>();
        }
        this.name.add(nameItem);
        return this;
    }

    public ListPoolsRequest withName(Consumer<List<String>> nameSetter) {
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

    public ListPoolsRequest withPageReverse(Boolean pageReverse) {
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

    public ListPoolsRequest withProtocol(List<String> protocol) {
        this.protocol = protocol;
        return this;
    }

    
    public ListPoolsRequest addProtocolItem(String protocolItem) {
        if (this.protocol == null) {
            this.protocol = new ArrayList<>();
        }
        this.protocol.add(protocolItem);
        return this;
    }

    public ListPoolsRequest withProtocol(Consumer<List<String>> protocolSetter) {
        if(this.protocol == null ){
            this.protocol = new ArrayList<>();
        }
        protocolSetter.accept(this.protocol);
        return this;
    }

    /**
     * Get protocol
     * @return protocol
     */
    public List<String> getProtocol() {
        return protocol;
    }

    public void setProtocol(List<String> protocol) {
        this.protocol = protocol;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListPoolsRequest listPoolsRequest = (ListPoolsRequest) o;
        return Objects.equals(this.adminStateUp, listPoolsRequest.adminStateUp) &&
            Objects.equals(this.description, listPoolsRequest.description) &&
            Objects.equals(this.enterpriseProjectId, listPoolsRequest.enterpriseProjectId) &&
            Objects.equals(this.healthmonitorId, listPoolsRequest.healthmonitorId) &&
            Objects.equals(this.id, listPoolsRequest.id) &&
            Objects.equals(this.ipVersion, listPoolsRequest.ipVersion) &&
            Objects.equals(this.lbAlgorithm, listPoolsRequest.lbAlgorithm) &&
            Objects.equals(this.limit, listPoolsRequest.limit) &&
            Objects.equals(this.loadbalancerId, listPoolsRequest.loadbalancerId) &&
            Objects.equals(this.marker, listPoolsRequest.marker) &&
            Objects.equals(this.memberAddress, listPoolsRequest.memberAddress) &&
            Objects.equals(this.memberDeletionProtectionEnable, listPoolsRequest.memberDeletionProtectionEnable) &&
            Objects.equals(this.memberDeviceId, listPoolsRequest.memberDeviceId) &&
            Objects.equals(this.name, listPoolsRequest.name) &&
            Objects.equals(this.pageReverse, listPoolsRequest.pageReverse) &&
            Objects.equals(this.protocol, listPoolsRequest.protocol);
    }
    @Override
    public int hashCode() {
        return Objects.hash(adminStateUp, description, enterpriseProjectId, healthmonitorId, id, ipVersion, lbAlgorithm, limit, loadbalancerId, marker, memberAddress, memberDeletionProtectionEnable, memberDeviceId, name, pageReverse, protocol);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPoolsRequest {\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    healthmonitorId: ").append(toIndentedString(healthmonitorId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    ipVersion: ").append(toIndentedString(ipVersion)).append("\n");
        sb.append("    lbAlgorithm: ").append(toIndentedString(lbAlgorithm)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    loadbalancerId: ").append(toIndentedString(loadbalancerId)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    memberAddress: ").append(toIndentedString(memberAddress)).append("\n");
        sb.append("    memberDeletionProtectionEnable: ").append(toIndentedString(memberDeletionProtectionEnable)).append("\n");
        sb.append("    memberDeviceId: ").append(toIndentedString(memberDeviceId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    pageReverse: ").append(toIndentedString(pageReverse)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
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

