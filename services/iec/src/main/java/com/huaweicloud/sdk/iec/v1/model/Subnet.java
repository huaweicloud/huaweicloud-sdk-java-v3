package com.huaweicloud.sdk.iec.v1.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 子网对象。
 */
public class Subnet  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cidr")
    
    private String cidr;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dnsList")
    
    private List<String> dnsList = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="gateway_ip")
    
    private String gatewayIp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dhcp_enable")
    
    private Boolean dhcpEnable;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="primary_dns")
    
    private String primaryDns;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="secondary_dns")
    
    private String secondaryDns;
    /**
     * 子网的状态  取值范围： - ACTIVE：表示子网已挂载到ROUTER上 - UNKNOWN：表示子网还未挂载到ROUTER上 - ERROR：表示子网状态故障
     */
    public static final class StatusEnum {

        
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
        

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("ACTIVE", ACTIVE);
            map.put("UNKNOWN", UNKNOWN);
            map.put("ERROR", ERROR);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
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
    @JsonProperty(value="vpc_id")
    
    private String vpcId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="site_id")
    
    private String siteId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="site_info")
    
    private String siteInfo;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="neutron_network_id")
    
    private String neutronNetworkId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="neutron_subnet_id")
    
    private String neutronSubnetId;

    public Subnet withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 子网的ID。
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
     * 子网名称  取值范围：1-64个字符，支持数字、字母、中文、_(下划线)、-（中划线）、.（点）
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public Subnet withCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    


    /**
     * 子网的网段  取值范围：必须在vpc对应cidr范围内  约束：必须是cidr格式。掩码长度不能大于28
     * @return cidr
     */
    public String getCidr() {
        return cidr;
    }

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    

    public Subnet withDnsList(List<String> dnsList) {
        this.dnsList = dnsList;
        return this;
    }

    
    public Subnet addDnsListItem(String dnsListItem) {
        if(this.dnsList == null) {
            this.dnsList = new ArrayList<>();
        }
        this.dnsList.add(dnsListItem);
        return this;
    }

    public Subnet withDnsList(Consumer<List<String>> dnsListSetter) {
        if(this.dnsList == null) {
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

    

    public Subnet withGatewayIp(String gatewayIp) {
        this.gatewayIp = gatewayIp;
        return this;
    }

    


    /**
     * 子网的网关  取值范围：子网网段中的IP地址  约束：必须是ip格式
     * @return gatewayIp
     */
    public String getGatewayIp() {
        return gatewayIp;
    }

    public void setGatewayIp(String gatewayIp) {
        this.gatewayIp = gatewayIp;
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

    

    public Subnet withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * 子网的状态  取值范围： - ACTIVE：表示子网已挂载到ROUTER上 - UNKNOWN：表示子网还未挂载到ROUTER上 - ERROR：表示子网状态故障
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    

    public Subnet withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    


    /**
     * 虚拟私有云ID。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    

    public Subnet withSiteId(String siteId) {
        this.siteId = siteId;
        return this;
    }

    


    /**
     * 子网所属的站点ID。
     * @return siteId
     */
    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    

    public Subnet withSiteInfo(String siteInfo) {
        this.siteInfo = siteInfo;
        return this;
    }

    


    /**
     * 子网所属的站点信息。
     * @return siteInfo
     */
    public String getSiteInfo() {
        return siteInfo;
    }

    public void setSiteInfo(String siteInfo) {
        this.siteInfo = siteInfo;
    }

    

    public Subnet withNeutronNetworkId(String neutronNetworkId) {
        this.neutronNetworkId = neutronNetworkId;
        return this;
    }

    


    /**
     * 对应网络（OpenStack Neutron接口） id。
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
     * 对应子网（OpenStack Neutron接口） id。
     * @return neutronSubnetId
     */
    public String getNeutronSubnetId() {
        return neutronSubnetId;
    }

    public void setNeutronSubnetId(String neutronSubnetId) {
        this.neutronSubnetId = neutronSubnetId;
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
            Objects.equals(this.cidr, subnet.cidr) &&
            Objects.equals(this.dnsList, subnet.dnsList) &&
            Objects.equals(this.gatewayIp, subnet.gatewayIp) &&
            Objects.equals(this.dhcpEnable, subnet.dhcpEnable) &&
            Objects.equals(this.primaryDns, subnet.primaryDns) &&
            Objects.equals(this.secondaryDns, subnet.secondaryDns) &&
            Objects.equals(this.status, subnet.status) &&
            Objects.equals(this.vpcId, subnet.vpcId) &&
            Objects.equals(this.siteId, subnet.siteId) &&
            Objects.equals(this.siteInfo, subnet.siteInfo) &&
            Objects.equals(this.neutronNetworkId, subnet.neutronNetworkId) &&
            Objects.equals(this.neutronSubnetId, subnet.neutronSubnetId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, cidr, dnsList, gatewayIp, dhcpEnable, primaryDns, secondaryDns, status, vpcId, siteId, siteInfo, neutronNetworkId, neutronSubnetId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Subnet {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
        sb.append("    dnsList: ").append(toIndentedString(dnsList)).append("\n");
        sb.append("    gatewayIp: ").append(toIndentedString(gatewayIp)).append("\n");
        sb.append("    dhcpEnable: ").append(toIndentedString(dhcpEnable)).append("\n");
        sb.append("    primaryDns: ").append(toIndentedString(primaryDns)).append("\n");
        sb.append("    secondaryDns: ").append(toIndentedString(secondaryDns)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
        sb.append("    siteInfo: ").append(toIndentedString(siteInfo)).append("\n");
        sb.append("    neutronNetworkId: ").append(toIndentedString(neutronNetworkId)).append("\n");
        sb.append("    neutronSubnetId: ").append(toIndentedString(neutronSubnetId)).append("\n");
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

