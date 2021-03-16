package com.huaweicloud.sdk.elb.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListLoadbalancersRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="marker")
    
    private String marker;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page_reverse")
    
    private Boolean pageReverse;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="operating_status")
    
    private String operatingStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="provisioning_status")
    
    private String provisioningStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vip_address")
    
    private String vipAddress;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vip_port_id")
    
    private String vipPortId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vip_subnet_id")
    
    private String vipSubnetId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vpc_id")
    
    private String vpcId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="admin_state_up")
    
    private Boolean adminStateUp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="member_address")
    
    private String memberAddress;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="member_device_id")
    
    private String memberDeviceId;

    public ListLoadbalancersRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * Get limit
     * minimum: 0
     * maximum: 9223372036854775807
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    

    public ListLoadbalancersRequest withMarker(String marker) {
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

    

    public ListLoadbalancersRequest withPageReverse(Boolean pageReverse) {
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

    

    public ListLoadbalancersRequest withId(String id) {
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

    

    public ListLoadbalancersRequest withDescription(String description) {
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

    

    public ListLoadbalancersRequest withName(String name) {
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

    

    public ListLoadbalancersRequest withOperatingStatus(String operatingStatus) {
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

    

    public ListLoadbalancersRequest withProvisioningStatus(String provisioningStatus) {
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

    

    public ListLoadbalancersRequest withVipAddress(String vipAddress) {
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

    

    public ListLoadbalancersRequest withVipPortId(String vipPortId) {
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

    

    public ListLoadbalancersRequest withVipSubnetId(String vipSubnetId) {
        this.vipSubnetId = vipSubnetId;
        return this;
    }

    


    /**
     * Get vipSubnetId
     * @return vipSubnetId
     */
    public String getVipSubnetId() {
        return vipSubnetId;
    }

    public void setVipSubnetId(String vipSubnetId) {
        this.vipSubnetId = vipSubnetId;
    }

    

    public ListLoadbalancersRequest withVpcId(String vpcId) {
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

    

    public ListLoadbalancersRequest withEnterpriseProjectId(String enterpriseProjectId) {
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

    

    public ListLoadbalancersRequest withAdminStateUp(Boolean adminStateUp) {
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

    

    public ListLoadbalancersRequest withMemberAddress(String memberAddress) {
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

    

    public ListLoadbalancersRequest withMemberDeviceId(String memberDeviceId) {
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListLoadbalancersRequest listLoadbalancersRequest = (ListLoadbalancersRequest) o;
        return Objects.equals(this.limit, listLoadbalancersRequest.limit) &&
            Objects.equals(this.marker, listLoadbalancersRequest.marker) &&
            Objects.equals(this.pageReverse, listLoadbalancersRequest.pageReverse) &&
            Objects.equals(this.id, listLoadbalancersRequest.id) &&
            Objects.equals(this.description, listLoadbalancersRequest.description) &&
            Objects.equals(this.name, listLoadbalancersRequest.name) &&
            Objects.equals(this.operatingStatus, listLoadbalancersRequest.operatingStatus) &&
            Objects.equals(this.provisioningStatus, listLoadbalancersRequest.provisioningStatus) &&
            Objects.equals(this.vipAddress, listLoadbalancersRequest.vipAddress) &&
            Objects.equals(this.vipPortId, listLoadbalancersRequest.vipPortId) &&
            Objects.equals(this.vipSubnetId, listLoadbalancersRequest.vipSubnetId) &&
            Objects.equals(this.vpcId, listLoadbalancersRequest.vpcId) &&
            Objects.equals(this.enterpriseProjectId, listLoadbalancersRequest.enterpriseProjectId) &&
            Objects.equals(this.adminStateUp, listLoadbalancersRequest.adminStateUp) &&
            Objects.equals(this.memberAddress, listLoadbalancersRequest.memberAddress) &&
            Objects.equals(this.memberDeviceId, listLoadbalancersRequest.memberDeviceId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(limit, marker, pageReverse, id, description, name, operatingStatus, provisioningStatus, vipAddress, vipPortId, vipSubnetId, vpcId, enterpriseProjectId, adminStateUp, memberAddress, memberDeviceId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListLoadbalancersRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    pageReverse: ").append(toIndentedString(pageReverse)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    operatingStatus: ").append(toIndentedString(operatingStatus)).append("\n");
        sb.append("    provisioningStatus: ").append(toIndentedString(provisioningStatus)).append("\n");
        sb.append("    vipAddress: ").append(toIndentedString(vipAddress)).append("\n");
        sb.append("    vipPortId: ").append(toIndentedString(vipPortId)).append("\n");
        sb.append("    vipSubnetId: ").append(toIndentedString(vipSubnetId)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    memberAddress: ").append(toIndentedString(memberAddress)).append("\n");
        sb.append("    memberDeviceId: ").append(toIndentedString(memberDeviceId)).append("\n");
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

