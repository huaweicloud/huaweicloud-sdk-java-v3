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
public class ListPoolsRequest  {



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
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="healthmonitor_id")
    
    private String healthmonitorId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="loadbalancer_id")
    
    private String loadbalancerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="protocol")
    
    private String protocol;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="lb_algorithm")
    
    private String lbAlgorithm;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="member_address")
    
    private String memberAddress;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="member_device_id")
    
    private String memberDeviceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId;

    public ListPoolsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * Get limit
     * minimum: 0
     * maximum: 2147483647
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
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

    

    public ListPoolsRequest withId(String id) {
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

    

    public ListPoolsRequest withName(String name) {
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

    

    public ListPoolsRequest withDescription(String description) {
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

    

    public ListPoolsRequest withHealthmonitorId(String healthmonitorId) {
        this.healthmonitorId = healthmonitorId;
        return this;
    }

    


    /**
     * Get healthmonitorId
     * @return healthmonitorId
     */
    public String getHealthmonitorId() {
        return healthmonitorId;
    }

    public void setHealthmonitorId(String healthmonitorId) {
        this.healthmonitorId = healthmonitorId;
    }

    

    public ListPoolsRequest withLoadbalancerId(String loadbalancerId) {
        this.loadbalancerId = loadbalancerId;
        return this;
    }

    


    /**
     * Get loadbalancerId
     * @return loadbalancerId
     */
    public String getLoadbalancerId() {
        return loadbalancerId;
    }

    public void setLoadbalancerId(String loadbalancerId) {
        this.loadbalancerId = loadbalancerId;
    }

    

    public ListPoolsRequest withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    


    /**
     * Get protocol
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    

    public ListPoolsRequest withLbAlgorithm(String lbAlgorithm) {
        this.lbAlgorithm = lbAlgorithm;
        return this;
    }

    


    /**
     * Get lbAlgorithm
     * @return lbAlgorithm
     */
    public String getLbAlgorithm() {
        return lbAlgorithm;
    }

    public void setLbAlgorithm(String lbAlgorithm) {
        this.lbAlgorithm = lbAlgorithm;
    }

    

    public ListPoolsRequest withMemberAddress(String memberAddress) {
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

    

    public ListPoolsRequest withMemberDeviceId(String memberDeviceId) {
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

    

    public ListPoolsRequest withEnterpriseProjectId(String enterpriseProjectId) {
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListPoolsRequest listPoolsRequest = (ListPoolsRequest) o;
        return Objects.equals(this.limit, listPoolsRequest.limit) &&
            Objects.equals(this.marker, listPoolsRequest.marker) &&
            Objects.equals(this.pageReverse, listPoolsRequest.pageReverse) &&
            Objects.equals(this.id, listPoolsRequest.id) &&
            Objects.equals(this.name, listPoolsRequest.name) &&
            Objects.equals(this.description, listPoolsRequest.description) &&
            Objects.equals(this.healthmonitorId, listPoolsRequest.healthmonitorId) &&
            Objects.equals(this.loadbalancerId, listPoolsRequest.loadbalancerId) &&
            Objects.equals(this.protocol, listPoolsRequest.protocol) &&
            Objects.equals(this.lbAlgorithm, listPoolsRequest.lbAlgorithm) &&
            Objects.equals(this.memberAddress, listPoolsRequest.memberAddress) &&
            Objects.equals(this.memberDeviceId, listPoolsRequest.memberDeviceId) &&
            Objects.equals(this.enterpriseProjectId, listPoolsRequest.enterpriseProjectId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(limit, marker, pageReverse, id, name, description, healthmonitorId, loadbalancerId, protocol, lbAlgorithm, memberAddress, memberDeviceId, enterpriseProjectId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPoolsRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    pageReverse: ").append(toIndentedString(pageReverse)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    healthmonitorId: ").append(toIndentedString(healthmonitorId)).append("\n");
        sb.append("    loadbalancerId: ").append(toIndentedString(loadbalancerId)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    lbAlgorithm: ").append(toIndentedString(lbAlgorithm)).append("\n");
        sb.append("    memberAddress: ").append(toIndentedString(memberAddress)).append("\n");
        sb.append("    memberDeviceId: ").append(toIndentedString(memberDeviceId)).append("\n");
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

