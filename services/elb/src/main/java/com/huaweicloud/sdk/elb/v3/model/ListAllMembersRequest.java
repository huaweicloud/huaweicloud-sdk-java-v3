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
public class ListAllMembersRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="address")
    
    private List<String> address = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="admin_state_up")
    
    private Boolean adminStateUp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private List<String> enterpriseProjectId = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private List<String> id = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ip_version")
    
    private String ipVersion;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="loadbalancer_id")
    
    private String loadbalancerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="marker")
    
    private String marker;


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
    @JsonProperty(value="pool_id")
    
    private String poolId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="protocol_port")
    
    private List<Integer> protocolPort = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subnet_cidr_id")
    
    private List<String> subnetCidrId = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="weight")
    
    private List<Integer> weight = null;
    
    public ListAllMembersRequest withAddress(List<String> address) {
        this.address = address;
        return this;
    }

    
    public ListAllMembersRequest addAddressItem(String addressItem) {
        this.address.add(addressItem);
        return this;
    }

    public ListAllMembersRequest withAddress(Consumer<List<String>> addressSetter) {
        if(this.address == null ){
            this.address = new ArrayList<>();
        }
        addressSetter.accept(this.address);
        return this;
    }

    /**
     * Get address
     * @return address
     */
    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    

    public ListAllMembersRequest withAdminStateUp(Boolean adminStateUp) {
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

    

    public ListAllMembersRequest withEnterpriseProjectId(List<String> enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    
    public ListAllMembersRequest addEnterpriseProjectIdItem(String enterpriseProjectIdItem) {
        this.enterpriseProjectId.add(enterpriseProjectIdItem);
        return this;
    }

    public ListAllMembersRequest withEnterpriseProjectId(Consumer<List<String>> enterpriseProjectIdSetter) {
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

    

    public ListAllMembersRequest withId(List<String> id) {
        this.id = id;
        return this;
    }

    
    public ListAllMembersRequest addIdItem(String idItem) {
        this.id.add(idItem);
        return this;
    }

    public ListAllMembersRequest withId(Consumer<List<String>> idSetter) {
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

    

    public ListAllMembersRequest withIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    


    /**
     * Get ipVersion
     * @return ipVersion
     */
    public String getIpVersion() {
        return ipVersion;
    }

    public void setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
    }

    

    public ListAllMembersRequest withLimit(Integer limit) {
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

    

    public ListAllMembersRequest withLoadbalancerId(String loadbalancerId) {
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

    

    public ListAllMembersRequest withMarker(String marker) {
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

    

    public ListAllMembersRequest withName(List<String> name) {
        this.name = name;
        return this;
    }

    
    public ListAllMembersRequest addNameItem(String nameItem) {
        this.name.add(nameItem);
        return this;
    }

    public ListAllMembersRequest withName(Consumer<List<String>> nameSetter) {
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

    

    public ListAllMembersRequest withOperatingStatus(List<String> operatingStatus) {
        this.operatingStatus = operatingStatus;
        return this;
    }

    
    public ListAllMembersRequest addOperatingStatusItem(String operatingStatusItem) {
        this.operatingStatus.add(operatingStatusItem);
        return this;
    }

    public ListAllMembersRequest withOperatingStatus(Consumer<List<String>> operatingStatusSetter) {
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

    

    public ListAllMembersRequest withPageReverse(Boolean pageReverse) {
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

    

    public ListAllMembersRequest withPoolId(String poolId) {
        this.poolId = poolId;
        return this;
    }

    


    /**
     * Get poolId
     * @return poolId
     */
    public String getPoolId() {
        return poolId;
    }

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    

    public ListAllMembersRequest withProtocolPort(List<Integer> protocolPort) {
        this.protocolPort = protocolPort;
        return this;
    }

    
    public ListAllMembersRequest addProtocolPortItem(Integer protocolPortItem) {
        this.protocolPort.add(protocolPortItem);
        return this;
    }

    public ListAllMembersRequest withProtocolPort(Consumer<List<Integer>> protocolPortSetter) {
        if(this.protocolPort == null ){
            this.protocolPort = new ArrayList<>();
        }
        protocolPortSetter.accept(this.protocolPort);
        return this;
    }

    /**
     * Get protocolPort
     * @return protocolPort
     */
    public List<Integer> getProtocolPort() {
        return protocolPort;
    }

    public void setProtocolPort(List<Integer> protocolPort) {
        this.protocolPort = protocolPort;
    }

    

    public ListAllMembersRequest withSubnetCidrId(List<String> subnetCidrId) {
        this.subnetCidrId = subnetCidrId;
        return this;
    }

    
    public ListAllMembersRequest addSubnetCidrIdItem(String subnetCidrIdItem) {
        this.subnetCidrId.add(subnetCidrIdItem);
        return this;
    }

    public ListAllMembersRequest withSubnetCidrId(Consumer<List<String>> subnetCidrIdSetter) {
        if(this.subnetCidrId == null ){
            this.subnetCidrId = new ArrayList<>();
        }
        subnetCidrIdSetter.accept(this.subnetCidrId);
        return this;
    }

    /**
     * Get subnetCidrId
     * @return subnetCidrId
     */
    public List<String> getSubnetCidrId() {
        return subnetCidrId;
    }

    public void setSubnetCidrId(List<String> subnetCidrId) {
        this.subnetCidrId = subnetCidrId;
    }

    

    public ListAllMembersRequest withWeight(List<Integer> weight) {
        this.weight = weight;
        return this;
    }

    
    public ListAllMembersRequest addWeightItem(Integer weightItem) {
        this.weight.add(weightItem);
        return this;
    }

    public ListAllMembersRequest withWeight(Consumer<List<Integer>> weightSetter) {
        if(this.weight == null ){
            this.weight = new ArrayList<>();
        }
        weightSetter.accept(this.weight);
        return this;
    }

    /**
     * Get weight
     * @return weight
     */
    public List<Integer> getWeight() {
        return weight;
    }

    public void setWeight(List<Integer> weight) {
        this.weight = weight;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAllMembersRequest listAllMembersRequest = (ListAllMembersRequest) o;
        return Objects.equals(this.address, listAllMembersRequest.address) &&
            Objects.equals(this.adminStateUp, listAllMembersRequest.adminStateUp) &&
            Objects.equals(this.enterpriseProjectId, listAllMembersRequest.enterpriseProjectId) &&
            Objects.equals(this.id, listAllMembersRequest.id) &&
            Objects.equals(this.ipVersion, listAllMembersRequest.ipVersion) &&
            Objects.equals(this.limit, listAllMembersRequest.limit) &&
            Objects.equals(this.loadbalancerId, listAllMembersRequest.loadbalancerId) &&
            Objects.equals(this.marker, listAllMembersRequest.marker) &&
            Objects.equals(this.name, listAllMembersRequest.name) &&
            Objects.equals(this.operatingStatus, listAllMembersRequest.operatingStatus) &&
            Objects.equals(this.pageReverse, listAllMembersRequest.pageReverse) &&
            Objects.equals(this.poolId, listAllMembersRequest.poolId) &&
            Objects.equals(this.protocolPort, listAllMembersRequest.protocolPort) &&
            Objects.equals(this.subnetCidrId, listAllMembersRequest.subnetCidrId) &&
            Objects.equals(this.weight, listAllMembersRequest.weight);
    }
    @Override
    public int hashCode() {
        return Objects.hash(address, adminStateUp, enterpriseProjectId, id, ipVersion, limit, loadbalancerId, marker, name, operatingStatus, pageReverse, poolId, protocolPort, subnetCidrId, weight);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAllMembersRequest {\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    ipVersion: ").append(toIndentedString(ipVersion)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    loadbalancerId: ").append(toIndentedString(loadbalancerId)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    operatingStatus: ").append(toIndentedString(operatingStatus)).append("\n");
        sb.append("    pageReverse: ").append(toIndentedString(pageReverse)).append("\n");
        sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
        sb.append("    protocolPort: ").append(toIndentedString(protocolPort)).append("\n");
        sb.append("    subnetCidrId: ").append(toIndentedString(subnetCidrId)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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

