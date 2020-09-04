package com.huaweicloud.sdk.elb.v3.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v3.model.BandwidthRef;
import com.huaweicloud.sdk.elb.v3.model.EipInfo;
import com.huaweicloud.sdk.elb.v3.model.ListenerRef;
import com.huaweicloud.sdk.elb.v3.model.PoolRef;
import com.huaweicloud.sdk.elb.v3.model.PublicIpInfo;
import com.huaweicloud.sdk.elb.v3.model.Tag;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 创建loadbalancer的消息返回体
 */
public class LoadBalancer  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id = " 自动生成 ";


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="provisioning_status")
    
    private String provisioningStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="admin_state_up")
    
    private Boolean adminStateUp = true;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="provider")
    
    private String provider = "vlb";


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="pools")
    
    private List<PoolRef> pools = new ArrayList<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="listeners")
    
    private List<ListenerRef> listeners = new ArrayList<>();
        /**
     * 功能描述：负载均衡器的操作状态。 取值范围：ONLINE、OFFLINE、DEGRADED、DISABLED或NO_MONITOR。 约束：该字段为预留字段，暂未启用，默认为ONLINE。
     */
    public static class OperatingStatusEnum {

        
        /**
         * Enum ONLINE for value: "ONLINE"
         */
        public static final OperatingStatusEnum ONLINE = new OperatingStatusEnum("ONLINE");
        
        /**
         * Enum OFFLINE for value: "OFFLINE"
         */
        public static final OperatingStatusEnum OFFLINE = new OperatingStatusEnum("OFFLINE");
        
        /**
         * Enum DEGRADED for value: "DEGRADED"
         */
        public static final OperatingStatusEnum DEGRADED = new OperatingStatusEnum("DEGRADED");
        
        /**
         * Enum DISABLED for value: "DISABLED"
         */
        public static final OperatingStatusEnum DISABLED = new OperatingStatusEnum("DISABLED");
        
        /**
         * Enum NO_MONITOR for value: "NO_MONITOR"
         */
        public static final OperatingStatusEnum NO_MONITOR = new OperatingStatusEnum("NO_MONITOR");
        

        public static final Map<String, OperatingStatusEnum> staticFields = new HashMap<String, OperatingStatusEnum>() {
            { 
                put("ONLINE", ONLINE);
                put("OFFLINE", OFFLINE);
                put("DEGRADED", DEGRADED);
                put("DISABLED", DISABLED);
                put("NO_MONITOR", NO_MONITOR);
            }
        };

        private String value;

        OperatingStatusEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static OperatingStatusEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            OperatingStatusEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new OperatingStatusEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static OperatingStatusEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            OperatingStatusEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof OperatingStatusEnum) {
                return this.value.equals(((OperatingStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="operating_status")
    
    private OperatingStatusEnum operatingStatus = OperatingStatusEnum.ONLINE;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vip_address")
    
    private String vipAddress;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vip_subnet_cidr_id")
    
    private String vipSubnetCidrId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    private String projectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vip_port_id")
    
    private String vipPortId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private List<Tag> tags = new ArrayList<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_at")
    
    private String createdAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="updated_at")
    
    private String updatedAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="guaranteed")
    
    private Boolean guaranteed = true;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vpc_id")
    
    private String vpcId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="eips")
    
    private List<EipInfo> eips = new ArrayList<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ipv6_vip_address")
    
    private String ipv6VipAddress = "空";


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ipv6_vip_virsubnet_id")
    
    private String ipv6VipVirsubnetId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ipv6_vip_port_id")
    
    private String ipv6VipPortId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="availability_zone_list")
    
    private List<String> availabilityZoneList = new ArrayList<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="billing_info")
    
    private String billingInfo;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="l4_flavor_id")
    
    private String l4FlavorId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="l4_scale_flavor_id")
    
    private String l4ScaleFlavorId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="l7_flavor_id")
    
    private String l7FlavorId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="l7_scale_flavor_id")
    
    private String l7ScaleFlavorId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="publicips")
    
    private List<PublicIpInfo> publicips = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="elb_virsubnet_ids")
    
    private List<String> elbVirsubnetIds = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="elb_virsubnet_type")
    
    private String elbVirsubnetType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ip_target_enable")
    
    private Boolean ipTargetEnable = false;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="deletion_protection_enable")
    
    private String deletionProtectionEnable;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="frozen_scene")
    
    private String frozenScene;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ipv6_bandwidth")
    
    private BandwidthRef ipv6Bandwidth = null;

    public LoadBalancer withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 功能描述：负载均衡器ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LoadBalancer withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 功能描述：负载均衡器描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LoadBalancer withProvisioningStatus(String provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
        return this;
    }

    


    /**
     * 功能描述：负载均衡器的配置状态。 取值范围：ACTIVE、PENDING_CREATE 或者ERROR。 约束：该字段为预留字段，暂未启用，默认为ACTIVE。
     * @return provisioningStatus
     */
    public String getProvisioningStatus() {
        return provisioningStatus;
    }

    public void setProvisioningStatus(String provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
    }

    public LoadBalancer withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    


    /**
     * 功能描述：负载均衡器的管理状态。 约束：只支持设定为true。
     * @return adminStateUp
     */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public LoadBalancer withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    


    /**
     * 功能描述：负载均衡器的生产者名称。 约束：只支持vlb。
     * @return provider
     */
    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public LoadBalancer withPools(List<PoolRef> pools) {
        this.pools = pools;
        return this;
    }

    
    public LoadBalancer addPoolsItem(PoolRef poolsItem) {
        this.pools.add(poolsItem);
        return this;
    }

    public LoadBalancer withPools(Consumer<List<PoolRef>> poolsSetter) {
        if(this.pools == null ){
            this.pools = new ArrayList<>();
        }
        poolsSetter.accept(this.pools);
        return this;
    }

    /**
     * 功能描述：负载均衡器关联的后端云服务器组ID的列表。
     * @return pools
     */
    public List<PoolRef> getPools() {
        return pools;
    }

    public void setPools(List<PoolRef> pools) {
        this.pools = pools;
    }

    public LoadBalancer withListeners(List<ListenerRef> listeners) {
        this.listeners = listeners;
        return this;
    }

    
    public LoadBalancer addListenersItem(ListenerRef listenersItem) {
        this.listeners.add(listenersItem);
        return this;
    }

    public LoadBalancer withListeners(Consumer<List<ListenerRef>> listenersSetter) {
        if(this.listeners == null ){
            this.listeners = new ArrayList<>();
        }
        listenersSetter.accept(this.listeners);
        return this;
    }

    /**
     * 功能描述：负载均衡器关联的监听器ID的列表。
     * @return listeners
     */
    public List<ListenerRef> getListeners() {
        return listeners;
    }

    public void setListeners(List<ListenerRef> listeners) {
        this.listeners = listeners;
    }

    public LoadBalancer withOperatingStatus(OperatingStatusEnum operatingStatus) {
        this.operatingStatus = operatingStatus;
        return this;
    }

    


    /**
     * 功能描述：负载均衡器的操作状态。 取值范围：ONLINE、OFFLINE、DEGRADED、DISABLED或NO_MONITOR。 约束：该字段为预留字段，暂未启用，默认为ONLINE。
     * @return operatingStatus
     */
    public OperatingStatusEnum getOperatingStatus() {
        return operatingStatus;
    }

    public void setOperatingStatus(OperatingStatusEnum operatingStatus) {
        this.operatingStatus = operatingStatus;
    }

    public LoadBalancer withVipAddress(String vipAddress) {
        this.vipAddress = vipAddress;
        return this;
    }

    


    /**
     * 功能描述：负载均衡器的虚拟IP。
     * @return vipAddress
     */
    public String getVipAddress() {
        return vipAddress;
    }

    public void setVipAddress(String vipAddress) {
        this.vipAddress = vipAddress;
    }

    public LoadBalancer withVipSubnetCidrId(String vipSubnetCidrId) {
        this.vipSubnetCidrId = vipSubnetCidrId;
        return this;
    }

    


    /**
     * 功能描述：负载均衡器所在的子网ID。 约束：vpc_id , vip_subnet_cidr_id, ipv6_vip_virsubnet_id不能同时为空，且需要在同一个vpc下。
     * @return vipSubnetCidrId
     */
    public String getVipSubnetCidrId() {
        return vipSubnetCidrId;
    }

    public void setVipSubnetCidrId(String vipSubnetCidrId) {
        this.vipSubnetCidrId = vipSubnetCidrId;
    }

    public LoadBalancer withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 功能描述：负载均衡器的负载均衡器名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LoadBalancer withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    


    /**
     * 负载均衡器所在的项目ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public LoadBalancer withVipPortId(String vipPortId) {
        this.vipPortId = vipPortId;
        return this;
    }

    


    /**
     * 负载均衡器虚拟IP对应的端口ID。
     * @return vipPortId
     */
    public String getVipPortId() {
        return vipPortId;
    }

    public void setVipPortId(String vipPortId) {
        this.vipPortId = vipPortId;
    }

    public LoadBalancer withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    
    public LoadBalancer addTagsItem(Tag tagsItem) {
        this.tags.add(tagsItem);
        return this;
    }

    public LoadBalancer withTags(Consumer<List<Tag>> tagsSetter) {
        if(this.tags == null ){
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 功能描述：负载均衡的标签列表。
     * @return tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public LoadBalancer withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    


    /**
     * 功能描述：负载均衡器的创建时间。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public LoadBalancer withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    


    /**
     * 功能描述：负载均衡器的更新时间。
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public LoadBalancer withGuaranteed(Boolean guaranteed) {
        this.guaranteed = guaranteed;
        return this;
    }

    


    /**
     * 功能描述：是否是性能保障性实例 取值范围：共享型：false；性能保障型：true
     * @return guaranteed
     */
    public Boolean getGuaranteed() {
        return guaranteed;
    }

    public void setGuaranteed(Boolean guaranteed) {
        this.guaranteed = guaranteed;
    }

    public LoadBalancer withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    


    /**
     * 功能描述：实例对应的vpc属性。若无，则从vip_subnet_cidr_id获取。  约束：vpc_id , vip_subnet_cidr_id, ipv6_vip_virsubnet_id不能同时为空，且需要在同一个vpc下。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public LoadBalancer withEips(List<EipInfo> eips) {
        this.eips = eips;
        return this;
    }

    
    public LoadBalancer addEipsItem(EipInfo eipsItem) {
        this.eips.add(eipsItem);
        return this;
    }

    public LoadBalancer withEips(Consumer<List<EipInfo>> eipsSetter) {
        if(this.eips == null ){
            this.eips = new ArrayList<>();
        }
        eipsSetter.accept(this.eips);
        return this;
    }

    /**
     * 功能描述：公网ELB实例绑定EIP信息。
     * @return eips
     */
    public List<EipInfo> getEips() {
        return eips;
    }

    public void setEips(List<EipInfo> eips) {
        this.eips = eips;
    }

    public LoadBalancer withIpv6VipAddress(String ipv6VipAddress) {
        this.ipv6VipAddress = ipv6VipAddress;
        return this;
    }

    


    /**
     * 功能描述：双栈实例对应v6的ip地址。 
     * @return ipv6VipAddress
     */
    public String getIpv6VipAddress() {
        return ipv6VipAddress;
    }

    public void setIpv6VipAddress(String ipv6VipAddress) {
        this.ipv6VipAddress = ipv6VipAddress;
    }

    public LoadBalancer withIpv6VipVirsubnetId(String ipv6VipVirsubnetId) {
        this.ipv6VipVirsubnetId = ipv6VipVirsubnetId;
        return this;
    }

    


    /**
     * 功能描述：双栈实例对应v6的网络id 。 约束： 1、默认为空，只有开启IPv6时才会传入。 2、vpc_id , vip_subnet_cidr_id, ipv6_vip_virsubnet_id不能同时为空，且需要在同一个vpc下。
     * @return ipv6VipVirsubnetId
     */
    public String getIpv6VipVirsubnetId() {
        return ipv6VipVirsubnetId;
    }

    public void setIpv6VipVirsubnetId(String ipv6VipVirsubnetId) {
        this.ipv6VipVirsubnetId = ipv6VipVirsubnetId;
    }

    public LoadBalancer withIpv6VipPortId(String ipv6VipPortId) {
        this.ipv6VipPortId = ipv6VipPortId;
        return this;
    }

    


    /**
     * 功能描述：IPv6的VIP端口id。
     * @return ipv6VipPortId
     */
    public String getIpv6VipPortId() {
        return ipv6VipPortId;
    }

    public void setIpv6VipPortId(String ipv6VipPortId) {
        this.ipv6VipPortId = ipv6VipPortId;
    }

    public LoadBalancer withAvailabilityZoneList(List<String> availabilityZoneList) {
        this.availabilityZoneList = availabilityZoneList;
        return this;
    }

    
    public LoadBalancer addAvailabilityZoneListItem(String availabilityZoneListItem) {
        this.availabilityZoneList.add(availabilityZoneListItem);
        return this;
    }

    public LoadBalancer withAvailabilityZoneList(Consumer<List<String>> availabilityZoneListSetter) {
        if(this.availabilityZoneList == null ){
            this.availabilityZoneList = new ArrayList<>();
        }
        availabilityZoneListSetter.accept(this.availabilityZoneList);
        return this;
    }

    /**
     * 功能描述：可用区列表。默认指定所有可利用的AZ。可调用nova接口（/v2/{project_id}/os-availability-zone）查询可用AZ
     * @return availabilityZoneList
     */
    public List<String> getAvailabilityZoneList() {
        return availabilityZoneList;
    }

    public void setAvailabilityZoneList(List<String> availabilityZoneList) {
        this.availabilityZoneList = availabilityZoneList;
    }

    public LoadBalancer withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * 功能描述：企业项目ID
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public LoadBalancer withBillingInfo(String billingInfo) {
        this.billingInfo = billingInfo;
        return this;
    }

    


    /**
     * 功能描述：预留资源账单信息，默认为空表示按需计费， 非空为包周期。 约束：admin权限才能更新此字段。
     * @return billingInfo
     */
    public String getBillingInfo() {
        return billingInfo;
    }

    public void setBillingInfo(String billingInfo) {
        this.billingInfo = billingInfo;
    }

    public LoadBalancer withL4FlavorId(String l4FlavorId) {
        this.l4FlavorId = l4FlavorId;
        return this;
    }

    


    /**
     * 功能描述：四层Flavor。
     * @return l4FlavorId
     */
    public String getL4FlavorId() {
        return l4FlavorId;
    }

    public void setL4FlavorId(String l4FlavorId) {
        this.l4FlavorId = l4FlavorId;
    }

    public LoadBalancer withL4ScaleFlavorId(String l4ScaleFlavorId) {
        this.l4ScaleFlavorId = l4ScaleFlavorId;
        return this;
    }

    


    /**
     * 功能描述：预留L4 弹性flavor。
     * @return l4ScaleFlavorId
     */
    public String getL4ScaleFlavorId() {
        return l4ScaleFlavorId;
    }

    public void setL4ScaleFlavorId(String l4ScaleFlavorId) {
        this.l4ScaleFlavorId = l4ScaleFlavorId;
    }

    public LoadBalancer withL7FlavorId(String l7FlavorId) {
        this.l7FlavorId = l7FlavorId;
        return this;
    }

    


    /**
     * 功能描述：七层Flavor。
     * @return l7FlavorId
     */
    public String getL7FlavorId() {
        return l7FlavorId;
    }

    public void setL7FlavorId(String l7FlavorId) {
        this.l7FlavorId = l7FlavorId;
    }

    public LoadBalancer withL7ScaleFlavorId(String l7ScaleFlavorId) {
        this.l7ScaleFlavorId = l7ScaleFlavorId;
        return this;
    }

    


    /**
     * 功能描述：预留弹性flavor。 
     * @return l7ScaleFlavorId
     */
    public String getL7ScaleFlavorId() {
        return l7ScaleFlavorId;
    }

    public void setL7ScaleFlavorId(String l7ScaleFlavorId) {
        this.l7ScaleFlavorId = l7ScaleFlavorId;
    }

    public LoadBalancer withPublicips(List<PublicIpInfo> publicips) {
        this.publicips = publicips;
        return this;
    }

    
    public LoadBalancer addPublicipsItem(PublicIpInfo publicipsItem) {
        if (this.publicips == null) {
            this.publicips = new ArrayList<>();
        }
        this.publicips.add(publicipsItem);
        return this;
    }

    public LoadBalancer withPublicips(Consumer<List<PublicIpInfo>> publicipsSetter) {
        if(this.publicips == null ){
            this.publicips = new ArrayList<>();
        }
        publicipsSetter.accept(this.publicips);
        return this;
    }

    /**
     * 功能描述：弹性公网EIP信息
     * @return publicips
     */
    public List<PublicIpInfo> getPublicips() {
        return publicips;
    }

    public void setPublicips(List<PublicIpInfo> publicips) {
        this.publicips = publicips;
    }

    public LoadBalancer withElbVirsubnetIds(List<String> elbVirsubnetIds) {
        this.elbVirsubnetIds = elbVirsubnetIds;
        return this;
    }

    
    public LoadBalancer addElbVirsubnetIdsItem(String elbVirsubnetIdsItem) {
        if (this.elbVirsubnetIds == null) {
            this.elbVirsubnetIds = new ArrayList<>();
        }
        this.elbVirsubnetIds.add(elbVirsubnetIdsItem);
        return this;
    }

    public LoadBalancer withElbVirsubnetIds(Consumer<List<String>> elbVirsubnetIdsSetter) {
        if(this.elbVirsubnetIds == null ){
            this.elbVirsubnetIds = new ArrayList<>();
        }
        elbVirsubnetIdsSetter.accept(this.elbVirsubnetIds);
        return this;
    }

    /**
     * 功能描述：下联面子网ID  loadbalancer使用的下联面端口会动态的从这些网络中占用IP
     * @return elbVirsubnetIds
     */
    public List<String> getElbVirsubnetIds() {
        return elbVirsubnetIds;
    }

    public void setElbVirsubnetIds(List<String> elbVirsubnetIds) {
        this.elbVirsubnetIds = elbVirsubnetIds;
    }

    public LoadBalancer withElbVirsubnetType(String elbVirsubnetType) {
        this.elbVirsubnetType = elbVirsubnetType;
        return this;
    }

    


    /**
     * 功能描述：下联面子网类型
     * @return elbVirsubnetType
     */
    public String getElbVirsubnetType() {
        return elbVirsubnetType;
    }

    public void setElbVirsubnetType(String elbVirsubnetType) {
        this.elbVirsubnetType = elbVirsubnetType;
    }

    public LoadBalancer withIpTargetEnable(Boolean ipTargetEnable) {
        this.ipTargetEnable = ipTargetEnable;
        return this;
    }

    


    /**
     * 是否启用跨VPC后端转发
     * @return ipTargetEnable
     */
    public Boolean getIpTargetEnable() {
        return ipTargetEnable;
    }

    public void setIpTargetEnable(Boolean ipTargetEnable) {
        this.ipTargetEnable = ipTargetEnable;
    }

    public LoadBalancer withDeletionProtectionEnable(String deletionProtectionEnable) {
        this.deletionProtectionEnable = deletionProtectionEnable;
        return this;
    }

    


    /**
     * 是否开启删除保护
     * @return deletionProtectionEnable
     */
    public String getDeletionProtectionEnable() {
        return deletionProtectionEnable;
    }

    public void setDeletionProtectionEnable(String deletionProtectionEnable) {
        this.deletionProtectionEnable = deletionProtectionEnable;
    }

    public LoadBalancer withFrozenScene(String frozenScene) {
        this.frozenScene = frozenScene;
        return this;
    }

    


    /**
     * 负载均衡器的冻结场景。若负载均衡器有多个冻结场景，用逗号分隔 POLICE：公安冻结场景。 ILLEGAL：违规冻结场景。 VERIFY：客户未实名认证冻结场景。 PARTNER：合作伙伴冻结（合作伙伴冻结子客户资源）。 ARREAR：欠费冻结场景。
     * @return frozenScene
     */
    public String getFrozenScene() {
        return frozenScene;
    }

    public void setFrozenScene(String frozenScene) {
        this.frozenScene = frozenScene;
    }

    public LoadBalancer withIpv6Bandwidth(BandwidthRef ipv6Bandwidth) {
        this.ipv6Bandwidth = ipv6Bandwidth;
        return this;
    }

    public LoadBalancer withIpv6Bandwidth(Consumer<BandwidthRef> ipv6BandwidthSetter) {
        if(this.ipv6Bandwidth == null ){
            this.ipv6Bandwidth = new BandwidthRef();
            ipv6BandwidthSetter.accept(this.ipv6Bandwidth);
        }
        
        return this;
    }


    /**
     * Get ipv6Bandwidth
     * @return ipv6Bandwidth
     */
    public BandwidthRef getIpv6Bandwidth() {
        return ipv6Bandwidth;
    }

    public void setIpv6Bandwidth(BandwidthRef ipv6Bandwidth) {
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
        LoadBalancer loadBalancer = (LoadBalancer) o;
        return Objects.equals(this.id, loadBalancer.id) &&
            Objects.equals(this.description, loadBalancer.description) &&
            Objects.equals(this.provisioningStatus, loadBalancer.provisioningStatus) &&
            Objects.equals(this.adminStateUp, loadBalancer.adminStateUp) &&
            Objects.equals(this.provider, loadBalancer.provider) &&
            Objects.equals(this.pools, loadBalancer.pools) &&
            Objects.equals(this.listeners, loadBalancer.listeners) &&
            Objects.equals(this.operatingStatus, loadBalancer.operatingStatus) &&
            Objects.equals(this.vipAddress, loadBalancer.vipAddress) &&
            Objects.equals(this.vipSubnetCidrId, loadBalancer.vipSubnetCidrId) &&
            Objects.equals(this.name, loadBalancer.name) &&
            Objects.equals(this.projectId, loadBalancer.projectId) &&
            Objects.equals(this.vipPortId, loadBalancer.vipPortId) &&
            Objects.equals(this.tags, loadBalancer.tags) &&
            Objects.equals(this.createdAt, loadBalancer.createdAt) &&
            Objects.equals(this.updatedAt, loadBalancer.updatedAt) &&
            Objects.equals(this.guaranteed, loadBalancer.guaranteed) &&
            Objects.equals(this.vpcId, loadBalancer.vpcId) &&
            Objects.equals(this.eips, loadBalancer.eips) &&
            Objects.equals(this.ipv6VipAddress, loadBalancer.ipv6VipAddress) &&
            Objects.equals(this.ipv6VipVirsubnetId, loadBalancer.ipv6VipVirsubnetId) &&
            Objects.equals(this.ipv6VipPortId, loadBalancer.ipv6VipPortId) &&
            Objects.equals(this.availabilityZoneList, loadBalancer.availabilityZoneList) &&
            Objects.equals(this.enterpriseProjectId, loadBalancer.enterpriseProjectId) &&
            Objects.equals(this.billingInfo, loadBalancer.billingInfo) &&
            Objects.equals(this.l4FlavorId, loadBalancer.l4FlavorId) &&
            Objects.equals(this.l4ScaleFlavorId, loadBalancer.l4ScaleFlavorId) &&
            Objects.equals(this.l7FlavorId, loadBalancer.l7FlavorId) &&
            Objects.equals(this.l7ScaleFlavorId, loadBalancer.l7ScaleFlavorId) &&
            Objects.equals(this.publicips, loadBalancer.publicips) &&
            Objects.equals(this.elbVirsubnetIds, loadBalancer.elbVirsubnetIds) &&
            Objects.equals(this.elbVirsubnetType, loadBalancer.elbVirsubnetType) &&
            Objects.equals(this.ipTargetEnable, loadBalancer.ipTargetEnable) &&
            Objects.equals(this.deletionProtectionEnable, loadBalancer.deletionProtectionEnable) &&
            Objects.equals(this.frozenScene, loadBalancer.frozenScene) &&
            Objects.equals(this.ipv6Bandwidth, loadBalancer.ipv6Bandwidth);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, description, provisioningStatus, adminStateUp, provider, pools, listeners, operatingStatus, vipAddress, vipSubnetCidrId, name, projectId, vipPortId, tags, createdAt, updatedAt, guaranteed, vpcId, eips, ipv6VipAddress, ipv6VipVirsubnetId, ipv6VipPortId, availabilityZoneList, enterpriseProjectId, billingInfo, l4FlavorId, l4ScaleFlavorId, l7FlavorId, l7ScaleFlavorId, publicips, elbVirsubnetIds, elbVirsubnetType, ipTargetEnable, deletionProtectionEnable, frozenScene, ipv6Bandwidth);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LoadBalancer {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    provisioningStatus: ").append(toIndentedString(provisioningStatus)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
        sb.append("    pools: ").append(toIndentedString(pools)).append("\n");
        sb.append("    listeners: ").append(toIndentedString(listeners)).append("\n");
        sb.append("    operatingStatus: ").append(toIndentedString(operatingStatus)).append("\n");
        sb.append("    vipAddress: ").append(toIndentedString(vipAddress)).append("\n");
        sb.append("    vipSubnetCidrId: ").append(toIndentedString(vipSubnetCidrId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    vipPortId: ").append(toIndentedString(vipPortId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    guaranteed: ").append(toIndentedString(guaranteed)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    eips: ").append(toIndentedString(eips)).append("\n");
        sb.append("    ipv6VipAddress: ").append(toIndentedString(ipv6VipAddress)).append("\n");
        sb.append("    ipv6VipVirsubnetId: ").append(toIndentedString(ipv6VipVirsubnetId)).append("\n");
        sb.append("    ipv6VipPortId: ").append(toIndentedString(ipv6VipPortId)).append("\n");
        sb.append("    availabilityZoneList: ").append(toIndentedString(availabilityZoneList)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    billingInfo: ").append(toIndentedString(billingInfo)).append("\n");
        sb.append("    l4FlavorId: ").append(toIndentedString(l4FlavorId)).append("\n");
        sb.append("    l4ScaleFlavorId: ").append(toIndentedString(l4ScaleFlavorId)).append("\n");
        sb.append("    l7FlavorId: ").append(toIndentedString(l7FlavorId)).append("\n");
        sb.append("    l7ScaleFlavorId: ").append(toIndentedString(l7ScaleFlavorId)).append("\n");
        sb.append("    publicips: ").append(toIndentedString(publicips)).append("\n");
        sb.append("    elbVirsubnetIds: ").append(toIndentedString(elbVirsubnetIds)).append("\n");
        sb.append("    elbVirsubnetType: ").append(toIndentedString(elbVirsubnetType)).append("\n");
        sb.append("    ipTargetEnable: ").append(toIndentedString(ipTargetEnable)).append("\n");
        sb.append("    deletionProtectionEnable: ").append(toIndentedString(deletionProtectionEnable)).append("\n");
        sb.append("    frozenScene: ").append(toIndentedString(frozenScene)).append("\n");
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

