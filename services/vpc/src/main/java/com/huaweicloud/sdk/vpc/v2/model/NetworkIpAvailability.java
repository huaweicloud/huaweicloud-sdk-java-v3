package com.huaweicloud.sdk.vpc.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.vpc.v2.model.SubnetIpAvailability;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class NetworkIpAvailability  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="network_id")
    
    private String networkId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="network_name")
    
    private String networkName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tenant_id")
    
    private String tenantId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_ips")
    
    private Integer totalIps;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="used_ips")
    
    private Integer usedIps;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subnet_ip_availability")
    
    private List<SubnetIpAvailability> subnetIpAvailability = null;
    
    public NetworkIpAvailability withNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }

    


    /**
     * 网络ID
     * @return networkId
     */
    public String getNetworkId() {
        return networkId;
    }

    public void setNetworkId(String networkId) {
        this.networkId = networkId;
    }

    

    public NetworkIpAvailability withNetworkName(String networkName) {
        this.networkName = networkName;
        return this;
    }

    


    /**
     * 网络名称
     * @return networkName
     */
    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }

    

    public NetworkIpAvailability withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    


    /**
     * 项目ID
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    

    public NetworkIpAvailability withTotalIps(Integer totalIps) {
        this.totalIps = totalIps;
        return this;
    }

    


    /**
     * 网络中IP总数（不包含系统预留地址）
     * @return totalIps
     */
    public Integer getTotalIps() {
        return totalIps;
    }

    public void setTotalIps(Integer totalIps) {
        this.totalIps = totalIps;
    }

    

    public NetworkIpAvailability withUsedIps(Integer usedIps) {
        this.usedIps = usedIps;
        return this;
    }

    


    /**
     * 网络中已经使用的IP数目（不包含系统预留地址）
     * @return usedIps
     */
    public Integer getUsedIps() {
        return usedIps;
    }

    public void setUsedIps(Integer usedIps) {
        this.usedIps = usedIps;
    }

    

    public NetworkIpAvailability withSubnetIpAvailability(List<SubnetIpAvailability> subnetIpAvailability) {
        this.subnetIpAvailability = subnetIpAvailability;
        return this;
    }

    
    public NetworkIpAvailability addSubnetIpAvailabilityItem(SubnetIpAvailability subnetIpAvailabilityItem) {
        if(this.subnetIpAvailability == null) {
            this.subnetIpAvailability = new ArrayList<>();
        }
        this.subnetIpAvailability.add(subnetIpAvailabilityItem);
        return this;
    }

    public NetworkIpAvailability withSubnetIpAvailability(Consumer<List<SubnetIpAvailability>> subnetIpAvailabilitySetter) {
        if(this.subnetIpAvailability == null) {
            this.subnetIpAvailability = new ArrayList<>();
        }
        subnetIpAvailabilitySetter.accept(this.subnetIpAvailability);
        return this;
    }

    /**
     * 子网IP使用情况的对象
     * @return subnetIpAvailability
     */
    public List<SubnetIpAvailability> getSubnetIpAvailability() {
        return subnetIpAvailability;
    }

    public void setSubnetIpAvailability(List<SubnetIpAvailability> subnetIpAvailability) {
        this.subnetIpAvailability = subnetIpAvailability;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NetworkIpAvailability networkIpAvailability = (NetworkIpAvailability) o;
        return Objects.equals(this.networkId, networkIpAvailability.networkId) &&
            Objects.equals(this.networkName, networkIpAvailability.networkName) &&
            Objects.equals(this.tenantId, networkIpAvailability.tenantId) &&
            Objects.equals(this.totalIps, networkIpAvailability.totalIps) &&
            Objects.equals(this.usedIps, networkIpAvailability.usedIps) &&
            Objects.equals(this.subnetIpAvailability, networkIpAvailability.subnetIpAvailability);
    }
    @Override
    public int hashCode() {
        return Objects.hash(networkId, networkName, tenantId, totalIps, usedIps, subnetIpAvailability);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NetworkIpAvailability {\n");
        sb.append("    networkId: ").append(toIndentedString(networkId)).append("\n");
        sb.append("    networkName: ").append(toIndentedString(networkName)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    totalIps: ").append(toIndentedString(totalIps)).append("\n");
        sb.append("    usedIps: ").append(toIndentedString(usedIps)).append("\n");
        sb.append("    subnetIpAvailability: ").append(toIndentedString(subnetIpAvailability)).append("\n");
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

