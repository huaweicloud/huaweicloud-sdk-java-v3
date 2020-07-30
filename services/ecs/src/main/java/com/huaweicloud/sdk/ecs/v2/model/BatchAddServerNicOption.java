package com.huaweicloud.sdk.ecs.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ecs.v2.model.Ipv6Bandwidth;
import com.huaweicloud.sdk.ecs.v2.model.ServerNicSecurityGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class BatchAddServerNicOption  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subnet_id")
    
    private String subnetId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="security_groups")
    
    private List<ServerNicSecurityGroup> securityGroups = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ip_address")
    
    private String ipAddress;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ipv6_enable")
    
    private Boolean ipv6Enable;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ipv6_bandwidth")
    
    private Ipv6Bandwidth ipv6Bandwidth = null;

    public BatchAddServerNicOption withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    


    /**
     * 云服务器添加网卡的信息。  需要指定云服务器所属虚拟私有云下已创建的网络（network）的ID，UUID格式。 指定subnet_id时不能再指定port_id参数。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public BatchAddServerNicOption withSecurityGroups(List<ServerNicSecurityGroup> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    
    public BatchAddServerNicOption addSecurityGroupsItem(ServerNicSecurityGroup securityGroupsItem) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        this.securityGroups.add(securityGroupsItem);
        return this;
    }

    public BatchAddServerNicOption withSecurityGroups(Consumer<List<ServerNicSecurityGroup>> securityGroupsSetter) {
        if(this.securityGroups == null ){
            this.securityGroups = new ArrayList<>();
        }
        securityGroupsSetter.accept(this.securityGroups);
        return this;
    }

    /**
     * 添加网卡的安全组信息
     * @return securityGroups
     */
    public List<ServerNicSecurityGroup> getSecurityGroups() {
        return securityGroups;
    }

    public void setSecurityGroups(List<ServerNicSecurityGroup> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public BatchAddServerNicOption withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    


    /**
     * IP地址，无该参数表示自动分配IP地址。
     * @return ipAddress
     */
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public BatchAddServerNicOption withIpv6Enable(Boolean ipv6Enable) {
        this.ipv6Enable = ipv6Enable;
        return this;
    }

    


    /**
     * 是否支持ipv6。  取值为true时，标识此网卡支持ipv6。
     * @return ipv6Enable
     */
    public Boolean getIpv6Enable() {
        return ipv6Enable;
    }

    public void setIpv6Enable(Boolean ipv6Enable) {
        this.ipv6Enable = ipv6Enable;
    }

    public BatchAddServerNicOption withIpv6Bandwidth(Ipv6Bandwidth ipv6Bandwidth) {
        this.ipv6Bandwidth = ipv6Bandwidth;
        return this;
    }

    public BatchAddServerNicOption withIpv6Bandwidth(Consumer<Ipv6Bandwidth> ipv6BandwidthSetter) {
        if(this.ipv6Bandwidth == null ){
            this.ipv6Bandwidth = new Ipv6Bandwidth();
            ipv6BandwidthSetter.accept(this.ipv6Bandwidth);
        }
        
        return this;
    }


    /**
     * Get ipv6Bandwidth
     * @return ipv6Bandwidth
     */
    public Ipv6Bandwidth getIpv6Bandwidth() {
        return ipv6Bandwidth;
    }

    public void setIpv6Bandwidth(Ipv6Bandwidth ipv6Bandwidth) {
        this.ipv6Bandwidth = ipv6Bandwidth;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchAddServerNicOption batchAddServerNicOption = (BatchAddServerNicOption) o;
        return Objects.equals(this.subnetId, batchAddServerNicOption.subnetId) &&
            Objects.equals(this.securityGroups, batchAddServerNicOption.securityGroups) &&
            Objects.equals(this.ipAddress, batchAddServerNicOption.ipAddress) &&
            Objects.equals(this.ipv6Enable, batchAddServerNicOption.ipv6Enable) &&
            Objects.equals(this.ipv6Bandwidth, batchAddServerNicOption.ipv6Bandwidth);
    }
    @Override
    public int hashCode() {
        return Objects.hash(subnetId, securityGroups, ipAddress, ipv6Enable, ipv6Bandwidth);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchAddServerNicOption {\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
        sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
        sb.append("    ipv6Enable: ").append(toIndentedString(ipv6Enable)).append("\n");
        sb.append("    ipv6Bandwidth: ").append(toIndentedString(ipv6Bandwidth)).append("\n");
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

