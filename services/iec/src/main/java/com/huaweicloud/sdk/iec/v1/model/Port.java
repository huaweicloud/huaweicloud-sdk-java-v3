package com.huaweicloud.sdk.iec.v1.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iec.v1.model.AllowedAddressPair;
import com.huaweicloud.sdk.iec.v1.model.DnsAssignment;
import com.huaweicloud.sdk.iec.v1.model.ExtraDhcpOption;
import com.huaweicloud.sdk.iec.v1.model.FixedIp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 端口的字典对象。
 */
public class Port  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;
    /**
     * 端口状态，Hana硬直通虚拟机端口状态总为DOWN  取值范围：ACTIVE、BUILD、DOWN
     */
    public static final class StatusEnum {

        
        /**
         * Enum ACTIVE for value: "ACTIVE"
         */
        public static final StatusEnum ACTIVE = new StatusEnum("ACTIVE");
        
        /**
         * Enum BUILD for value: "BUILD"
         */
        public static final StatusEnum BUILD = new StatusEnum("BUILD");
        
        /**
         * Enum DOWN for value: "DOWN"
         */
        public static final StatusEnum DOWN = new StatusEnum("DOWN");
        

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("ACTIVE", ACTIVE);
            map.put("BUILD", BUILD);
            map.put("DOWN", DOWN);
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
    @JsonProperty(value="admin_state_up")
    
    private Boolean adminStateUp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="fixed_ips")
    
    private List<FixedIp> fixedIps = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="mac_address")
    
    private String macAddress;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="network_id")
    
    private String networkId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="device_id")
    
    private String deviceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="device_owner")
    
    private String deviceOwner;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="security_groups")
    
    private List<String> securityGroups = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="extra_dhcp_opts")
    
    private List<ExtraDhcpOption> extraDhcpOpts = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="allowed_address_pairs")
    
    private List<AllowedAddressPair> allowedAddressPairs = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="site_id")
    
    private String siteId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dns_assignment")
    
    private List<DnsAssignment> dnsAssignment = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dns_name")
    
    private String dnsName;

    public Port withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 端口唯一标识
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public Port withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 端口名称  取值：默认为空，最大长度不超过255
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public Port withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * 端口状态，Hana硬直通虚拟机端口状态总为DOWN  取值范围：ACTIVE、BUILD、DOWN
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    

    public Port withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    


    /**
     * 管理状态  约束：只支持true，默认为true
     * @return adminStateUp
     */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    

    public Port withFixedIps(List<FixedIp> fixedIps) {
        this.fixedIps = fixedIps;
        return this;
    }

    
    public Port addFixedIpsItem(FixedIp fixedIpsItem) {
        if(this.fixedIps == null) {
            this.fixedIps = new ArrayList<>();
        }
        this.fixedIps.add(fixedIpsItem);
        return this;
    }

    public Port withFixedIps(Consumer<List<FixedIp>> fixedIpsSetter) {
        if(this.fixedIps == null) {
            this.fixedIps = new ArrayList<>();
        }
        fixedIpsSetter.accept(this.fixedIps);
        return this;
    }

    /**
     * 端口IP。  约束：一个端口只支持一个fixed_ip，且不支持更新。
     * @return fixedIps
     */
    public List<FixedIp> getFixedIps() {
        return fixedIps;
    }

    public void setFixedIps(List<FixedIp> fixedIps) {
        this.fixedIps = fixedIps;
    }

    

    public Port withMacAddress(String macAddress) {
        this.macAddress = macAddress;
        return this;
    }

    


    /**
     * 端口MAC地址  约束：由系统分配，不支持指定
     * @return macAddress
     */
    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    

    public Port withNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }

    


    /**
     * 端口所属网络的ID  约束：必须是存在的网络ID
     * @return networkId
     */
    public String getNetworkId() {
        return networkId;
    }

    public void setNetworkId(String networkId) {
        this.networkId = networkId;
    }

    

    public Port withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    


    /**
     * 端口所属设备ID  约束：不支持设置和更新，由系统自动维护
     * @return deviceId
     */
    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    

    public Port withDeviceOwner(String deviceOwner) {
        this.deviceOwner = deviceOwner;
        return this;
    }

    


    /**
     * 设备所属（DHCP/Router/ lb/Nova）  约束：不支持设置和更新，由系统自动维护 
     * @return deviceOwner
     */
    public String getDeviceOwner() {
        return deviceOwner;
    }

    public void setDeviceOwner(String deviceOwner) {
        this.deviceOwner = deviceOwner;
    }

    

    public Port withSecurityGroups(List<String> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    
    public Port addSecurityGroupsItem(String securityGroupsItem) {
        if(this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        this.securityGroups.add(securityGroupsItem);
        return this;
    }

    public Port withSecurityGroups(Consumer<List<String>> securityGroupsSetter) {
        if(this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        securityGroupsSetter.accept(this.securityGroups);
        return this;
    }

    /**
     * 安全组的UUID(扩展属性)
     * @return securityGroups
     */
    public List<String> getSecurityGroups() {
        return securityGroups;
    }

    public void setSecurityGroups(List<String> securityGroups) {
        this.securityGroups = securityGroups;
    }

    

    public Port withExtraDhcpOpts(List<ExtraDhcpOption> extraDhcpOpts) {
        this.extraDhcpOpts = extraDhcpOpts;
        return this;
    }

    
    public Port addExtraDhcpOptsItem(ExtraDhcpOption extraDhcpOptsItem) {
        if(this.extraDhcpOpts == null) {
            this.extraDhcpOpts = new ArrayList<>();
        }
        this.extraDhcpOpts.add(extraDhcpOptsItem);
        return this;
    }

    public Port withExtraDhcpOpts(Consumer<List<ExtraDhcpOption>> extraDhcpOptsSetter) {
        if(this.extraDhcpOpts == null) {
            this.extraDhcpOpts = new ArrayList<>();
        }
        extraDhcpOptsSetter.accept(this.extraDhcpOpts);
        return this;
    }

    /**
     * DHCP的扩展属性。
     * @return extraDhcpOpts
     */
    public List<ExtraDhcpOption> getExtraDhcpOpts() {
        return extraDhcpOpts;
    }

    public void setExtraDhcpOpts(List<ExtraDhcpOption> extraDhcpOpts) {
        this.extraDhcpOpts = extraDhcpOpts;
    }

    

    public Port withAllowedAddressPairs(List<AllowedAddressPair> allowedAddressPairs) {
        this.allowedAddressPairs = allowedAddressPairs;
        return this;
    }

    
    public Port addAllowedAddressPairsItem(AllowedAddressPair allowedAddressPairsItem) {
        if(this.allowedAddressPairs == null) {
            this.allowedAddressPairs = new ArrayList<>();
        }
        this.allowedAddressPairs.add(allowedAddressPairsItem);
        return this;
    }

    public Port withAllowedAddressPairs(Consumer<List<AllowedAddressPair>> allowedAddressPairsSetter) {
        if(this.allowedAddressPairs == null) {
            this.allowedAddressPairs = new ArrayList<>();
        }
        allowedAddressPairsSetter.accept(this.allowedAddressPairs);
        return this;
    }

    /**
     * IP/Mac对列表。  约束：IP地址不允许为 “0.0.0.0/0”  建议：如果allowed_address_pairs配置地址池较大的CIDR（掩码小于24位），建议为该port配置一个单独的安全组。
     * @return allowedAddressPairs
     */
    public List<AllowedAddressPair> getAllowedAddressPairs() {
        return allowedAddressPairs;
    }

    public void setAllowedAddressPairs(List<AllowedAddressPair> allowedAddressPairs) {
        this.allowedAddressPairs = allowedAddressPairs;
    }

    

    public Port withSiteId(String siteId) {
        this.siteId = siteId;
        return this;
    }

    


    /**
     * 站点ID
     * @return siteId
     */
    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    

    public Port withDnsAssignment(List<DnsAssignment> dnsAssignment) {
        this.dnsAssignment = dnsAssignment;
        return this;
    }

    
    public Port addDnsAssignmentItem(DnsAssignment dnsAssignmentItem) {
        if(this.dnsAssignment == null) {
            this.dnsAssignment = new ArrayList<>();
        }
        this.dnsAssignment.add(dnsAssignmentItem);
        return this;
    }

    public Port withDnsAssignment(Consumer<List<DnsAssignment>> dnsAssignmentSetter) {
        if(this.dnsAssignment == null) {
            this.dnsAssignment = new ArrayList<>();
        }
        dnsAssignmentSetter.accept(this.dnsAssignment);
        return this;
    }

    /**
     * 主网卡默认内网域名信息  约束：不支持设置和更新，由系统自动维护
     * @return dnsAssignment
     */
    public List<DnsAssignment> getDnsAssignment() {
        return dnsAssignment;
    }

    public void setDnsAssignment(List<DnsAssignment> dnsAssignment) {
        this.dnsAssignment = dnsAssignment;
    }

    

    public Port withDnsName(String dnsName) {
        this.dnsName = dnsName;
        return this;
    }

    


    /**
     * 主网卡默认内网DNS名称  约束：不支持设置和更新，由系统自动维护
     * @return dnsName
     */
    public String getDnsName() {
        return dnsName;
    }

    public void setDnsName(String dnsName) {
        this.dnsName = dnsName;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Port port = (Port) o;
        return Objects.equals(this.id, port.id) &&
            Objects.equals(this.name, port.name) &&
            Objects.equals(this.status, port.status) &&
            Objects.equals(this.adminStateUp, port.adminStateUp) &&
            Objects.equals(this.fixedIps, port.fixedIps) &&
            Objects.equals(this.macAddress, port.macAddress) &&
            Objects.equals(this.networkId, port.networkId) &&
            Objects.equals(this.deviceId, port.deviceId) &&
            Objects.equals(this.deviceOwner, port.deviceOwner) &&
            Objects.equals(this.securityGroups, port.securityGroups) &&
            Objects.equals(this.extraDhcpOpts, port.extraDhcpOpts) &&
            Objects.equals(this.allowedAddressPairs, port.allowedAddressPairs) &&
            Objects.equals(this.siteId, port.siteId) &&
            Objects.equals(this.dnsAssignment, port.dnsAssignment) &&
            Objects.equals(this.dnsName, port.dnsName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, status, adminStateUp, fixedIps, macAddress, networkId, deviceId, deviceOwner, securityGroups, extraDhcpOpts, allowedAddressPairs, siteId, dnsAssignment, dnsName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Port {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    fixedIps: ").append(toIndentedString(fixedIps)).append("\n");
        sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
        sb.append("    networkId: ").append(toIndentedString(networkId)).append("\n");
        sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
        sb.append("    deviceOwner: ").append(toIndentedString(deviceOwner)).append("\n");
        sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
        sb.append("    extraDhcpOpts: ").append(toIndentedString(extraDhcpOpts)).append("\n");
        sb.append("    allowedAddressPairs: ").append(toIndentedString(allowedAddressPairs)).append("\n");
        sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
        sb.append("    dnsAssignment: ").append(toIndentedString(dnsAssignment)).append("\n");
        sb.append("    dnsName: ").append(toIndentedString(dnsName)).append("\n");
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

