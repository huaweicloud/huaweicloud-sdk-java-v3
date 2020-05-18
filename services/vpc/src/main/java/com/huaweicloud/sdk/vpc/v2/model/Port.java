package com.huaweicloud.sdk.vpc.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.vpc.v2.model.AllowedAddressPair;
import com.huaweicloud.sdk.vpc.v2.model.DnsAssignMent;
import com.huaweicloud.sdk.vpc.v2.model.ExtraDhcpOpt;
import com.huaweicloud.sdk.vpc.v2.model.FixedIp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 
 */
public class Port  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="network_id")
    
    private String networkId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="admin_state_up")
    
    private Boolean adminStateUp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="mac_address")
    
    private String macAddress;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="fixed_ips")
    
    private List<FixedIp> fixedIps = new ArrayList<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="device_id")
    
    private String deviceId;
    /**
     * 功能说明：设备所属 取值范围：合法设备所属，如network:dhcp、network:VIP_PORT、network:router_interface_distributed、network:router_centralized_snat 约束：不支持设置和更新，由系统自动维护
     */
    public static class DeviceOwnerEnum {

        
        /**
         * Enum NETWORK_DHCP for value: "network:dhcp"
         */
        public static final DeviceOwnerEnum NETWORK_DHCP = new DeviceOwnerEnum("network:dhcp");

        
        /**
         * Enum NETWORK_VIP_PORT for value: "network:VIP_PORT"
         */
        public static final DeviceOwnerEnum NETWORK_VIP_PORT = new DeviceOwnerEnum("network:VIP_PORT");

        
        /**
         * Enum NETWORK_ROUTER_INTERFACE_DISTRIBUTED for value: "network:router_interface_distributed"
         */
        public static final DeviceOwnerEnum NETWORK_ROUTER_INTERFACE_DISTRIBUTED = new DeviceOwnerEnum("network:router_interface_distributed");

        
        /**
         * Enum NETWORK_ROUTER_CENTRALIZED_SNAT for value: "network:router_centralized_snat"
         */
        public static final DeviceOwnerEnum NETWORK_ROUTER_CENTRALIZED_SNAT = new DeviceOwnerEnum("network:router_centralized_snat");

        

        public static Map<String, DeviceOwnerEnum> staticFields =
                new HashMap<String, DeviceOwnerEnum>() {
                    { 
                        put("network:dhcp", NETWORK_DHCP);
                        put("network:VIP_PORT", NETWORK_VIP_PORT);
                        put("network:router_interface_distributed", NETWORK_ROUTER_INTERFACE_DISTRIBUTED);
                        put("network:router_centralized_snat", NETWORK_ROUTER_CENTRALIZED_SNAT);
                    }
                };

        private String value;

        DeviceOwnerEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static DeviceOwnerEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            DeviceOwnerEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new DeviceOwnerEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static DeviceOwnerEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            DeviceOwnerEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof DeviceOwnerEnum) {
                return this.value.equals(((DeviceOwnerEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="device_owner")
    
    private DeviceOwnerEnum deviceOwner;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tenant_id")
    
    private String tenantId;
    /**
     * 功能说明：端口状态，Hana硬直通虚拟机端口状态总为DOWN 取值范围：ACTIVE、BUILD、DOWN
     */
    public static class StatusEnum {

        
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

        

        public static Map<String, StatusEnum> staticFields =
                new HashMap<String, StatusEnum>() {
                    { 
                        put("ACTIVE", ACTIVE);
                        put("BUILD", BUILD);
                        put("DOWN", DOWN);
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
    @JsonProperty(value="security_groups")
    
    private List<String> securityGroups = new ArrayList<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="allowed_address_pairs")
    
    private List<AllowedAddressPair> allowedAddressPairs = new ArrayList<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="extra_dhcp_opts")
    
    private List<ExtraDhcpOpt> extraDhcpOpts = new ArrayList<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="binding:vnic_type")
    
    private String bindingVnicType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dns_assignment")
    
    private List<DnsAssignMent> dnsAssignment = new ArrayList<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dns_name")
    
    private String dnsName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="binding:vif_details")
    
    private Object bindingVifDetails = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="binding:profile")
    
    private Object bindingProfile = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_type")
    
    private String instanceType;

    public Port withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 端口ID
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
     * 功能说明：端口名称 取值范围：0~255个字符，支持中文、英文、字母、_(下划线)、-（中划线）
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Port withNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }

    


    /**
     * 端口所属网络的ID
     * @return networkId
     */
    public String getNetworkId() {
        return networkId;
    }

    public void setNetworkId(String networkId) {
        this.networkId = networkId;
    }

    public Port withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    


    /**
     * 功能说明：管理状态 约束：只支持true，默认为true 
     * @return adminStateUp
     */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public Port withMacAddress(String macAddress) {
        this.macAddress = macAddress;
        return this;
    }

    


    /**
     * 功能描述：端口MAC地址 约束：由系统分配，不支持指定
     * @return macAddress
     */
    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public Port withFixedIps(List<FixedIp> fixedIps) {
        this.fixedIps = fixedIps;
        return this;
    }

    
    public Port addFixedIpsItem(FixedIp fixedIpsItem) {
        this.fixedIps.add(fixedIpsItem);
        return this;
    }

    public Port withFixedIps(Consumer<List<FixedIp>> fixedIpsSetter) {
        if(this.fixedIps == null ){
            this.fixedIps = new ArrayList<>();
        }
        fixedIpsSetter.accept(this.fixedIps);
        return this;
    }

    /**
     * 功能说明：端口IP 例如：\"fixed_ips\": [{\"subnet_id\": \"4dc70db6-cb7f-4200-9790-a6a910776bba\", \"ip_address\": \"192.169.25.79\"}] 约束：一个端口只支持一个fixed_ip，且不支持更新。
     * @return fixedIps
     */
    public List<FixedIp> getFixedIps() {
        return fixedIps;
    }

    public void setFixedIps(List<FixedIp> fixedIps) {
        this.fixedIps = fixedIps;
    }

    public Port withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    


    /**
     * 功能说明：端口所属设备ID 约束：不支持设置和更新，由系统自动维护
     * @return deviceId
     */
    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public Port withDeviceOwner(DeviceOwnerEnum deviceOwner) {
        this.deviceOwner = deviceOwner;
        return this;
    }

    


    /**
     * 功能说明：设备所属 取值范围：合法设备所属，如network:dhcp、network:VIP_PORT、network:router_interface_distributed、network:router_centralized_snat 约束：不支持设置和更新，由系统自动维护
     * @return deviceOwner
     */
    public DeviceOwnerEnum getDeviceOwner() {
        return deviceOwner;
    }

    public void setDeviceOwner(DeviceOwnerEnum deviceOwner) {
        this.deviceOwner = deviceOwner;
    }

    public Port withTenantId(String tenantId) {
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

    public Port withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * 功能说明：端口状态，Hana硬直通虚拟机端口状态总为DOWN 取值范围：ACTIVE、BUILD、DOWN
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public Port withSecurityGroups(List<String> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    
    public Port addSecurityGroupsItem(String securityGroupsItem) {
        this.securityGroups.add(securityGroupsItem);
        return this;
    }

    public Port withSecurityGroups(Consumer<List<String>> securityGroupsSetter) {
        if(this.securityGroups == null ){
            this.securityGroups = new ArrayList<>();
        }
        securityGroupsSetter.accept(this.securityGroups);
        return this;
    }

    /**
     * 安全组的ID列表
     * @return securityGroups
     */
    public List<String> getSecurityGroups() {
        return securityGroups;
    }

    public void setSecurityGroups(List<String> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public Port withAllowedAddressPairs(List<AllowedAddressPair> allowedAddressPairs) {
        this.allowedAddressPairs = allowedAddressPairs;
        return this;
    }

    
    public Port addAllowedAddressPairsItem(AllowedAddressPair allowedAddressPairsItem) {
        this.allowedAddressPairs.add(allowedAddressPairsItem);
        return this;
    }

    public Port withAllowedAddressPairs(Consumer<List<AllowedAddressPair>> allowedAddressPairsSetter) {
        if(this.allowedAddressPairs == null ){
            this.allowedAddressPairs = new ArrayList<>();
        }
        allowedAddressPairsSetter.accept(this.allowedAddressPairs);
        return this;
    }

    /**
     * 功能说明：IP/Mac对列表 约束：IP地址不允许为 “0.0.0.0” 如果配置地址池较大（CIDR掩码小于24位），建议为该port配置一个单独的安全组。
     * @return allowedAddressPairs
     */
    public List<AllowedAddressPair> getAllowedAddressPairs() {
        return allowedAddressPairs;
    }

    public void setAllowedAddressPairs(List<AllowedAddressPair> allowedAddressPairs) {
        this.allowedAddressPairs = allowedAddressPairs;
    }

    public Port withExtraDhcpOpts(List<ExtraDhcpOpt> extraDhcpOpts) {
        this.extraDhcpOpts = extraDhcpOpts;
        return this;
    }

    
    public Port addExtraDhcpOptsItem(ExtraDhcpOpt extraDhcpOptsItem) {
        this.extraDhcpOpts.add(extraDhcpOptsItem);
        return this;
    }

    public Port withExtraDhcpOpts(Consumer<List<ExtraDhcpOpt>> extraDhcpOptsSetter) {
        if(this.extraDhcpOpts == null ){
            this.extraDhcpOpts = new ArrayList<>();
        }
        extraDhcpOptsSetter.accept(this.extraDhcpOpts);
        return this;
    }

    /**
     * 功能说明：DHCP的扩展Option(扩展属性)
     * @return extraDhcpOpts
     */
    public List<ExtraDhcpOpt> getExtraDhcpOpts() {
        return extraDhcpOpts;
    }

    public void setExtraDhcpOpts(List<ExtraDhcpOpt> extraDhcpOpts) {
        this.extraDhcpOpts = extraDhcpOpts;
    }

    public Port withBindingVnicType(String bindingVnicType) {
        this.bindingVnicType = bindingVnicType;
        return this;
    }

    


    /**
     * 功能说明：绑定的vNIC类型 取值范围：  - normal（软交换）  - direct: SRIOV硬直通（不支持） 
     * @return bindingVnicType
     */
    public String getBindingVnicType() {
        return bindingVnicType;
    }

    public void setBindingVnicType(String bindingVnicType) {
        this.bindingVnicType = bindingVnicType;
    }

    public Port withDnsAssignment(List<DnsAssignMent> dnsAssignment) {
        this.dnsAssignment = dnsAssignment;
        return this;
    }

    
    public Port addDnsAssignmentItem(DnsAssignMent dnsAssignmentItem) {
        this.dnsAssignment.add(dnsAssignmentItem);
        return this;
    }

    public Port withDnsAssignment(Consumer<List<DnsAssignMent>> dnsAssignmentSetter) {
        if(this.dnsAssignment == null ){
            this.dnsAssignment = new ArrayList<>();
        }
        dnsAssignmentSetter.accept(this.dnsAssignment);
        return this;
    }

    /**
     * 功能说明：主网卡默认内网域名信息 约束：不支持设置和更新，由系统自动维护
     * @return dnsAssignment
     */
    public List<DnsAssignMent> getDnsAssignment() {
        return dnsAssignment;
    }

    public void setDnsAssignment(List<DnsAssignMent> dnsAssignment) {
        this.dnsAssignment = dnsAssignment;
    }

    public Port withDnsName(String dnsName) {
        this.dnsName = dnsName;
        return this;
    }

    


    /**
     * 功能说明：主网卡默认内网DNS名称 约束：不支持设置和更新，由系统自动维护
     * @return dnsName
     */
    public String getDnsName() {
        return dnsName;
    }

    public void setDnsName(String dnsName) {
        this.dnsName = dnsName;
    }

    public Port withBindingVifDetails(Object bindingVifDetails) {
        this.bindingVifDetails = bindingVifDetails;
        return this;
    }

    


    /**
     * 功能说明：vif的详细信息，  \"ovs_hybrid_plug\": 是否为ovs/bridge混合模式 约束：管理员权限，普通租户不可指定
     * @return bindingVifDetails
     */
    public Object getBindingVifDetails() {
        return bindingVifDetails;
    }

    public void setBindingVifDetails(Object bindingVifDetails) {
        this.bindingVifDetails = bindingVifDetails;
    }

    public Port withBindingProfile(Object bindingProfile) {
        this.bindingProfile = bindingProfile;
        return this;
    }

    


    /**
     * 功能说明：提供用户设置自定义信息(扩展属性)
     * @return bindingProfile
     */
    public Object getBindingProfile() {
        return bindingProfile;
    }

    public void setBindingProfile(Object bindingProfile) {
        this.bindingProfile = bindingProfile;
    }

    public Port withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * 功能说明：端口所属实例ID，例如RDS实例ID 约束：不支持设置和更新，由系统自动维护
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public Port withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    


    /**
     * 功能说明：端口所属实例类型，例如“RDS” 约束：不支持设置和更新，由系统自动维护
     * @return instanceType
     */
    public String getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
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
            Objects.equals(this.networkId, port.networkId) &&
            Objects.equals(this.adminStateUp, port.adminStateUp) &&
            Objects.equals(this.macAddress, port.macAddress) &&
            Objects.equals(this.fixedIps, port.fixedIps) &&
            Objects.equals(this.deviceId, port.deviceId) &&
            Objects.equals(this.deviceOwner, port.deviceOwner) &&
            Objects.equals(this.tenantId, port.tenantId) &&
            Objects.equals(this.status, port.status) &&
            Objects.equals(this.securityGroups, port.securityGroups) &&
            Objects.equals(this.allowedAddressPairs, port.allowedAddressPairs) &&
            Objects.equals(this.extraDhcpOpts, port.extraDhcpOpts) &&
            Objects.equals(this.bindingVnicType, port.bindingVnicType) &&
            Objects.equals(this.dnsAssignment, port.dnsAssignment) &&
            Objects.equals(this.dnsName, port.dnsName) &&
            Objects.equals(this.bindingVifDetails, port.bindingVifDetails) &&
            Objects.equals(this.bindingProfile, port.bindingProfile) &&
            Objects.equals(this.instanceId, port.instanceId) &&
            Objects.equals(this.instanceType, port.instanceType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, networkId, adminStateUp, macAddress, fixedIps, deviceId, deviceOwner, tenantId, status, securityGroups, allowedAddressPairs, extraDhcpOpts, bindingVnicType, dnsAssignment, dnsName, bindingVifDetails, bindingProfile, instanceId, instanceType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Port {\n");
            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    networkId: ").append(toIndentedString(networkId)).append("\n");
            sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
            sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
            sb.append("    fixedIps: ").append(toIndentedString(fixedIps)).append("\n");
            sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
            sb.append("    deviceOwner: ").append(toIndentedString(deviceOwner)).append("\n");
            sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
            sb.append("    status: ").append(toIndentedString(status)).append("\n");
            sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
            sb.append("    allowedAddressPairs: ").append(toIndentedString(allowedAddressPairs)).append("\n");
            sb.append("    extraDhcpOpts: ").append(toIndentedString(extraDhcpOpts)).append("\n");
            sb.append("    bindingVnicType: ").append(toIndentedString(bindingVnicType)).append("\n");
            sb.append("    dnsAssignment: ").append(toIndentedString(dnsAssignment)).append("\n");
            sb.append("    dnsName: ").append(toIndentedString(dnsName)).append("\n");
            sb.append("    bindingVifDetails: ").append(toIndentedString(bindingVifDetails)).append("\n");
            sb.append("    bindingProfile: ").append(toIndentedString(bindingProfile)).append("\n");
            sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
            sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
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

