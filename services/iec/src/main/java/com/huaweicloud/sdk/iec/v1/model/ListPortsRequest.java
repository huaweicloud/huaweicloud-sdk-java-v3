package com.huaweicloud.sdk.iec.v1.model;





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
public class ListPortsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="network_id")
    
    private String networkId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="admin_state_up")
    
    private Boolean adminStateUp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="fixed_ips")
    
    private List<String> fixedIps = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="mac_address")
    
    private String macAddress;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="device_id")
    
    private String deviceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="device_owner")
    
    private String deviceOwner;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="security_groups")
    
    private String securityGroups;

    public ListPortsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * Get limit
     * minimum: 0
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    

    public ListPortsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * Get offset
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    

    public ListPortsRequest withNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }

    


    /**
     * Get networkId
     * @return networkId
     */
    public String getNetworkId() {
        return networkId;
    }

    public void setNetworkId(String networkId) {
        this.networkId = networkId;
    }

    

    public ListPortsRequest withId(String id) {
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

    

    public ListPortsRequest withName(String name) {
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

    

    public ListPortsRequest withAdminStateUp(Boolean adminStateUp) {
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

    

    public ListPortsRequest withFixedIps(List<String> fixedIps) {
        this.fixedIps = fixedIps;
        return this;
    }

    
    public ListPortsRequest addFixedIpsItem(String fixedIpsItem) {
        if(this.fixedIps == null) {
            this.fixedIps = new ArrayList<>();
        }
        this.fixedIps.add(fixedIpsItem);
        return this;
    }

    public ListPortsRequest withFixedIps(Consumer<List<String>> fixedIpsSetter) {
        if(this.fixedIps == null) {
            this.fixedIps = new ArrayList<>();
        }
        fixedIpsSetter.accept(this.fixedIps);
        return this;
    }

    /**
     * Get fixedIps
     * @return fixedIps
     */
    public List<String> getFixedIps() {
        return fixedIps;
    }

    public void setFixedIps(List<String> fixedIps) {
        this.fixedIps = fixedIps;
    }

    

    public ListPortsRequest withMacAddress(String macAddress) {
        this.macAddress = macAddress;
        return this;
    }

    


    /**
     * Get macAddress
     * @return macAddress
     */
    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    

    public ListPortsRequest withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    


    /**
     * Get deviceId
     * @return deviceId
     */
    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    

    public ListPortsRequest withDeviceOwner(String deviceOwner) {
        this.deviceOwner = deviceOwner;
        return this;
    }

    


    /**
     * Get deviceOwner
     * @return deviceOwner
     */
    public String getDeviceOwner() {
        return deviceOwner;
    }

    public void setDeviceOwner(String deviceOwner) {
        this.deviceOwner = deviceOwner;
    }

    

    public ListPortsRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * Get status
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    public ListPortsRequest withSecurityGroups(String securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    


    /**
     * Get securityGroups
     * @return securityGroups
     */
    public String getSecurityGroups() {
        return securityGroups;
    }

    public void setSecurityGroups(String securityGroups) {
        this.securityGroups = securityGroups;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListPortsRequest listPortsRequest = (ListPortsRequest) o;
        return Objects.equals(this.limit, listPortsRequest.limit) &&
            Objects.equals(this.offset, listPortsRequest.offset) &&
            Objects.equals(this.networkId, listPortsRequest.networkId) &&
            Objects.equals(this.id, listPortsRequest.id) &&
            Objects.equals(this.name, listPortsRequest.name) &&
            Objects.equals(this.adminStateUp, listPortsRequest.adminStateUp) &&
            Objects.equals(this.fixedIps, listPortsRequest.fixedIps) &&
            Objects.equals(this.macAddress, listPortsRequest.macAddress) &&
            Objects.equals(this.deviceId, listPortsRequest.deviceId) &&
            Objects.equals(this.deviceOwner, listPortsRequest.deviceOwner) &&
            Objects.equals(this.status, listPortsRequest.status) &&
            Objects.equals(this.securityGroups, listPortsRequest.securityGroups);
    }
    @Override
    public int hashCode() {
        return Objects.hash(limit, offset, networkId, id, name, adminStateUp, fixedIps, macAddress, deviceId, deviceOwner, status, securityGroups);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPortsRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    networkId: ").append(toIndentedString(networkId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    fixedIps: ").append(toIndentedString(fixedIps)).append("\n");
        sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
        sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
        sb.append("    deviceOwner: ").append(toIndentedString(deviceOwner)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
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

