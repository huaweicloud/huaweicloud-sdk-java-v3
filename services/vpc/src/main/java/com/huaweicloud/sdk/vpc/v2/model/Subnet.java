package com.huaweicloud.sdk.vpc.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.vpc.v2.model.ExtraDhcpOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 
 */
public class Subnet  {



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
    @JsonProperty(value="cidr")
    
    private String cidr;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="gateway_ip")
    
    private String gatewayIp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ipv6_enable")
    
    private Boolean ipv6Enable;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cidr_v6")
    
    private String cidrV6;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="gateway_ip_v6")
    
    private String gatewayIpV6;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dhcp_enable")
    
    private Boolean dhcpEnable;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="primary_dns")
    
    private String primaryDns;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="secondary_dns")
    
    private String secondaryDns;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dnsList")
    
    private List<String> dnsList = new ArrayList<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="availability_zone")
    
    private String availabilityZone;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vpc_id")
    
    private String vpcId;
    /**
     * 功能说明：子网的状态 取值范围： - ACTIVE：表示子网已挂载到ROUTER上 - UNKNOWN：表示子网还未挂载到ROUTER上 - ERROR：表示子网状态故障
     */
    public static class StatusEnum {

        
        /**
         * Enum ACTIVE for value: "ACTIVE"
         */
        public static final StatusEnum ACTIVE = new StatusEnum("ACTIVE");

        
        /**
         * Enum UNKNOWN for value: "UNKNOWN"
         */
        public static final StatusEnum UNKNOWN = new StatusEnum("UNKNOWN");

        
        /**
         * Enum ERROR for value: "ERROR"
         */
        public static final StatusEnum ERROR = new StatusEnum("ERROR");

        

        public static Map<String, StatusEnum> staticFields =
                new HashMap<String, StatusEnum>() {
                    { 
                        put("ACTIVE", ACTIVE);
                        put("UNKNOWN", UNKNOWN);
                        put("ERROR", ERROR);
                    }
                };

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            StatusEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new StatusEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private StatusEnum status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="neutron_network_id")
    
    private String neutronNetworkId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="neutron_subnet_id")
    
    private String neutronSubnetId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="neutron_subnet_id_v6")
    
    private String neutronSubnetIdV6;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="extra_dhcp_opts")
    
    private List<ExtraDhcpOption> extraDhcpOpts = new ArrayList<>();
    
    public Subnet withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 子网ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Subnet withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 功能说明：子网名称 取值范围：1-64个字符，支持数字、字母、中文、_(下划线)、-（中划线）、.（点）
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Subnet withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 功能说明：子网描述 取值范围：0-255个字符，不能包含“<”和“>”。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Subnet withCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    


    /**
     * 功能说明：子网的网段 取值范围：必须在vpc对应cidr范围内 约束：必须是cidr格式。掩码长度不能大于28
     * @return cidr
     */
    public String getCidr() {
        return cidr;
    }

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    public Subnet withGatewayIp(String gatewayIp) {
        this.gatewayIp = gatewayIp;
        return this;
    }

    


    /**
     * 功能说明：子网的网关 取值范围：子网网段中的IP地址 约束：必须是ip格式
     * @return gatewayIp
     */
    public String getGatewayIp() {
        return gatewayIp;
    }

    public void setGatewayIp(String gatewayIp) {
        this.gatewayIp = gatewayIp;
    }

    public Subnet withIpv6Enable(Boolean ipv6Enable) {
        this.ipv6Enable = ipv6Enable;
        return this;
    }

    


    /**
     * 功能说明：是否创建cidr_v6 取值范围：true（开启），false（关闭）
     * @return ipv6Enable
     */
    public Boolean getIpv6Enable() {
        return ipv6Enable;
    }

    public void setIpv6Enable(Boolean ipv6Enable) {
        this.ipv6Enable = ipv6Enable;
    }

    public Subnet withCidrV6(String cidrV6) {
        this.cidrV6 = cidrV6;
        return this;
    }

    


    /**
     * IPv6子网的网段，如果子网为IPv4子网，则不返回此参数
     * @return cidrV6
     */
    public String getCidrV6() {
        return cidrV6;
    }

    public void setCidrV6(String cidrV6) {
        this.cidrV6 = cidrV6;
    }

    public Subnet withGatewayIpV6(String gatewayIpV6) {
        this.gatewayIpV6 = gatewayIpV6;
        return this;
    }

    


    /**
     * IPv6子网的网关，如果子网为IPv4子网，则不返回此参数
     * @return gatewayIpV6
     */
    public String getGatewayIpV6() {
        return gatewayIpV6;
    }

    public void setGatewayIpV6(String gatewayIpV6) {
        this.gatewayIpV6 = gatewayIpV6;
    }

    public Subnet withDhcpEnable(Boolean dhcpEnable) {
        this.dhcpEnable = dhcpEnable;
        return this;
    }

    


    /**
     * 子网是否开启dhcp功能
     * @return dhcpEnable
     */
    public Boolean getDhcpEnable() {
        return dhcpEnable;
    }

    public void setDhcpEnable(Boolean dhcpEnable) {
        this.dhcpEnable = dhcpEnable;
    }

    public Subnet withPrimaryDns(String primaryDns) {
        this.primaryDns = primaryDns;
        return this;
    }

    


    /**
     * 子网dns服务器地址1
     * @return primaryDns
     */
    public String getPrimaryDns() {
        return primaryDns;
    }

    public void setPrimaryDns(String primaryDns) {
        this.primaryDns = primaryDns;
    }

    public Subnet withSecondaryDns(String secondaryDns) {
        this.secondaryDns = secondaryDns;
        return this;
    }

    


    /**
     * 子网dns服务器地址2
     * @return secondaryDns
     */
    public String getSecondaryDns() {
        return secondaryDns;
    }

    public void setSecondaryDns(String secondaryDns) {
        this.secondaryDns = secondaryDns;
    }

    public Subnet withDnsList(List<String> dnsList) {
        this.dnsList = dnsList;
        return this;
    }

    
    public Subnet addDnsListItem(String dnsListItem) {
        this.dnsList.add(dnsListItem);
        return this;
    }

    public Subnet withDnsList(Consumer<List<String>> dnsListSetter) {
        if(this.dnsList == null ){
            this.dnsList = new ArrayList<>();
        }
        dnsListSetter.accept(this.dnsList);
        return this;
    }

    /**
     * 子网dns服务器地址列表
     * @return dnsList
     */
    public List<String> getDnsList() {
        return dnsList;
    }

    public void setDnsList(List<String> dnsList) {
        this.dnsList = dnsList;
    }

    public Subnet withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    


    /**
     * 子网所在的可用区标识
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public Subnet withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    


    /**
     * 子网所在VPC标识
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public Subnet withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * 功能说明：子网的状态 取值范围： - ACTIVE：表示子网已挂载到ROUTER上 - UNKNOWN：表示子网还未挂载到ROUTER上 - ERROR：表示子网状态故障
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public Subnet withNeutronNetworkId(String neutronNetworkId) {
        this.neutronNetworkId = neutronNetworkId;
        return this;
    }

    


    /**
     * 对应网络（OpenStack Neutron接口）id
     * @return neutronNetworkId
     */
    public String getNeutronNetworkId() {
        return neutronNetworkId;
    }

    public void setNeutronNetworkId(String neutronNetworkId) {
        this.neutronNetworkId = neutronNetworkId;
    }

    public Subnet withNeutronSubnetId(String neutronSubnetId) {
        this.neutronSubnetId = neutronSubnetId;
        return this;
    }

    


    /**
     * 对应子网（OpenStack Neutron接口）id
     * @return neutronSubnetId
     */
    public String getNeutronSubnetId() {
        return neutronSubnetId;
    }

    public void setNeutronSubnetId(String neutronSubnetId) {
        this.neutronSubnetId = neutronSubnetId;
    }

    public Subnet withNeutronSubnetIdV6(String neutronSubnetIdV6) {
        this.neutronSubnetIdV6 = neutronSubnetIdV6;
        return this;
    }

    


    /**
     * 对应IPv6子网（OpenStack Neutron接口）id，如果子网为IPv4子网，则不返回此参数
     * @return neutronSubnetIdV6
     */
    public String getNeutronSubnetIdV6() {
        return neutronSubnetIdV6;
    }

    public void setNeutronSubnetIdV6(String neutronSubnetIdV6) {
        this.neutronSubnetIdV6 = neutronSubnetIdV6;
    }

    public Subnet withExtraDhcpOpts(List<ExtraDhcpOption> extraDhcpOpts) {
        this.extraDhcpOpts = extraDhcpOpts;
        return this;
    }

    
    public Subnet addExtraDhcpOptsItem(ExtraDhcpOption extraDhcpOptsItem) {
        this.extraDhcpOpts.add(extraDhcpOptsItem);
        return this;
    }

    public Subnet withExtraDhcpOpts(Consumer<List<ExtraDhcpOption>> extraDhcpOptsSetter) {
        if(this.extraDhcpOpts == null ){
            this.extraDhcpOpts = new ArrayList<>();
        }
        extraDhcpOptsSetter.accept(this.extraDhcpOpts);
        return this;
    }

    /**
     * 子网配置的NTP地址
     * @return extraDhcpOpts
     */
    public List<ExtraDhcpOption> getExtraDhcpOpts() {
        return extraDhcpOpts;
    }

    public void setExtraDhcpOpts(List<ExtraDhcpOption> extraDhcpOpts) {
        this.extraDhcpOpts = extraDhcpOpts;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Subnet subnet = (Subnet) o;
        return Objects.equals(this.id, subnet.id) &&
            Objects.equals(this.name, subnet.name) &&
            Objects.equals(this.description, subnet.description) &&
            Objects.equals(this.cidr, subnet.cidr) &&
            Objects.equals(this.gatewayIp, subnet.gatewayIp) &&
            Objects.equals(this.ipv6Enable, subnet.ipv6Enable) &&
            Objects.equals(this.cidrV6, subnet.cidrV6) &&
            Objects.equals(this.gatewayIpV6, subnet.gatewayIpV6) &&
            Objects.equals(this.dhcpEnable, subnet.dhcpEnable) &&
            Objects.equals(this.primaryDns, subnet.primaryDns) &&
            Objects.equals(this.secondaryDns, subnet.secondaryDns) &&
            Objects.equals(this.dnsList, subnet.dnsList) &&
            Objects.equals(this.availabilityZone, subnet.availabilityZone) &&
            Objects.equals(this.vpcId, subnet.vpcId) &&
            Objects.equals(this.status, subnet.status) &&
            Objects.equals(this.neutronNetworkId, subnet.neutronNetworkId) &&
            Objects.equals(this.neutronSubnetId, subnet.neutronSubnetId) &&
            Objects.equals(this.neutronSubnetIdV6, subnet.neutronSubnetIdV6) &&
            Objects.equals(this.extraDhcpOpts, subnet.extraDhcpOpts);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, cidr, gatewayIp, ipv6Enable, cidrV6, gatewayIpV6, dhcpEnable, primaryDns, secondaryDns, dnsList, availabilityZone, vpcId, status, neutronNetworkId, neutronSubnetId, neutronSubnetIdV6, extraDhcpOpts);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Subnet {\n");
            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    description: ").append(toIndentedString(description)).append("\n");
            sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
            sb.append("    gatewayIp: ").append(toIndentedString(gatewayIp)).append("\n");
            sb.append("    ipv6Enable: ").append(toIndentedString(ipv6Enable)).append("\n");
            sb.append("    cidrV6: ").append(toIndentedString(cidrV6)).append("\n");
            sb.append("    gatewayIpV6: ").append(toIndentedString(gatewayIpV6)).append("\n");
            sb.append("    dhcpEnable: ").append(toIndentedString(dhcpEnable)).append("\n");
            sb.append("    primaryDns: ").append(toIndentedString(primaryDns)).append("\n");
            sb.append("    secondaryDns: ").append(toIndentedString(secondaryDns)).append("\n");
            sb.append("    dnsList: ").append(toIndentedString(dnsList)).append("\n");
            sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
            sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
            sb.append("    status: ").append(toIndentedString(status)).append("\n");
            sb.append("    neutronNetworkId: ").append(toIndentedString(neutronNetworkId)).append("\n");
            sb.append("    neutronSubnetId: ").append(toIndentedString(neutronSubnetId)).append("\n");
            sb.append("    neutronSubnetIdV6: ").append(toIndentedString(neutronSubnetIdV6)).append("\n");
            sb.append("    extraDhcpOpts: ").append(toIndentedString(extraDhcpOpts)).append("\n");
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

