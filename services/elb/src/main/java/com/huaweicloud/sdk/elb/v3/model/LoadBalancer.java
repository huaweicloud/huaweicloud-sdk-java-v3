package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/** 负载均衡器的详细信息。 */
public class LoadBalancer {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provisioning_status")

    private String provisioningStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state_up")

    private Boolean adminStateUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider")

    private String provider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pools")

    private List<PoolRef> pools = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "listeners")

    private List<ListenerRef> listeners = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operating_status")

    private String operatingStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vip_subnet_cidr_id")

    private String vipSubnetCidrId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vip_address")

    private String vipAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vip_port_id")

    private String vipPortId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "guaranteed")

    private Boolean guaranteed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eips")

    private List<EipInfo> eips = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_vip_address")

    private String ipv6VipAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_vip_virsubnet_id")

    private String ipv6VipVirsubnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_vip_port_id")

    private String ipv6VipPortId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone_list")

    private List<String> availabilityZoneList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "billing_info")

    private String billingInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l4_flavor_id")

    private String l4FlavorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l4_scale_flavor_id")

    private String l4ScaleFlavorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l7_flavor_id")

    private String l7FlavorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l7_scale_flavor_id")

    private String l7ScaleFlavorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicips")

    private List<PublicIpInfo> publicips = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elb_virsubnet_ids")

    private List<String> elbVirsubnetIds = null;

    /** 下联面子网类型 - ipv4：ipv4 - dualstack：双栈 */
    public static final class ElbVirsubnetTypeEnum {

        /** Enum IPV4 for value: "ipv4" */
        public static final ElbVirsubnetTypeEnum IPV4 = new ElbVirsubnetTypeEnum("ipv4");

        /** Enum DUALSTACK for value: "dualstack" */
        public static final ElbVirsubnetTypeEnum DUALSTACK = new ElbVirsubnetTypeEnum("dualstack");

        private static final Map<String, ElbVirsubnetTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ElbVirsubnetTypeEnum> createStaticFields() {
            Map<String, ElbVirsubnetTypeEnum> map = new HashMap<>();
            map.put("ipv4", IPV4);
            map.put("dualstack", DUALSTACK);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ElbVirsubnetTypeEnum(String value) {
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
        public static ElbVirsubnetTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ElbVirsubnetTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ElbVirsubnetTypeEnum(value);
            }
            return result;
        }

        public static ElbVirsubnetTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ElbVirsubnetTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ElbVirsubnetTypeEnum) {
                return this.value.equals(((ElbVirsubnetTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elb_virsubnet_type")

    private ElbVirsubnetTypeEnum elbVirsubnetType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_target_enable")

    private Boolean ipTargetEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frozen_scene")

    private String frozenScene;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_bandwidth")

    private BandwidthRef ipv6Bandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deletion_protection_enable")

    private Boolean deletionProtectionEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "autoscaling")

    private AutoscalingRef autoscaling;

    public LoadBalancer withId(String id) {
        this.id = id;
        return this;
    }

    /** 负载均衡器ID。
     * 
     * @return id */
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

    /** 负载均衡器描述信息。
     * 
     * @return description */
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

    /** 负载均衡器的配置状态。取值： - ACTIVE：使用中。 - PENDING_DELETE：删除中。
     * 
     * @return provisioningStatus */
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

    /** 负载均衡器的管理状态。固定为true。
     * 
     * @return adminStateUp */
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

    /** 负载均衡器的生产者名称。固定为vlb。
     * 
     * @return provider */
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
        if (this.pools == null) {
            this.pools = new ArrayList<>();
        }
        this.pools.add(poolsItem);
        return this;
    }

    public LoadBalancer withPools(Consumer<List<PoolRef>> poolsSetter) {
        if (this.pools == null) {
            this.pools = new ArrayList<>();
        }
        poolsSetter.accept(this.pools);
        return this;
    }

    /** 负载均衡器直接关联的后端云服务器组的ID列表。
     * 
     * @return pools */
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
        if (this.listeners == null) {
            this.listeners = new ArrayList<>();
        }
        this.listeners.add(listenersItem);
        return this;
    }

    public LoadBalancer withListeners(Consumer<List<ListenerRef>> listenersSetter) {
        if (this.listeners == null) {
            this.listeners = new ArrayList<>();
        }
        listenersSetter.accept(this.listeners);
        return this;
    }

    /** 负载均衡器关联的监听器的ID列表。
     * 
     * @return listeners */
    public List<ListenerRef> getListeners() {
        return listeners;
    }

    public void setListeners(List<ListenerRef> listeners) {
        this.listeners = listeners;
    }

    public LoadBalancer withOperatingStatus(String operatingStatus) {
        this.operatingStatus = operatingStatus;
        return this;
    }

    /** 负载均衡器的操作状态。取值： - ONLINE：在线。
     * 
     * @return operatingStatus */
    public String getOperatingStatus() {
        return operatingStatus;
    }

    public void setOperatingStatus(String operatingStatus) {
        this.operatingStatus = operatingStatus;
    }

    public LoadBalancer withName(String name) {
        this.name = name;
        return this;
    }

    /** 负载均衡器的名称。
     * 
     * @return name */
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

    /** 负载均衡器所属的项目ID。
     * 
     * @return projectId */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public LoadBalancer withVipSubnetCidrId(String vipSubnetCidrId) {
        this.vipSubnetCidrId = vipSubnetCidrId;
        return this;
    }

    /** 负载均衡器所在子网的IPv4子网ID。
     * 
     * @return vipSubnetCidrId */
    public String getVipSubnetCidrId() {
        return vipSubnetCidrId;
    }

    public void setVipSubnetCidrId(String vipSubnetCidrId) {
        this.vipSubnetCidrId = vipSubnetCidrId;
    }

    public LoadBalancer withVipAddress(String vipAddress) {
        this.vipAddress = vipAddress;
        return this;
    }

    /** 负载均衡器的IPv4虚拟IP地址。
     * 
     * @return vipAddress */
    public String getVipAddress() {
        return vipAddress;
    }

    public void setVipAddress(String vipAddress) {
        this.vipAddress = vipAddress;
    }

    public LoadBalancer withVipPortId(String vipPortId) {
        this.vipPortId = vipPortId;
        return this;
    }

    /** 负载均衡器的IPv4对应的port ID。
     * 
     * @return vipPortId */
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
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public LoadBalancer withTags(Consumer<List<Tag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /** 负载均衡的标签列表。
     * 
     * @return tags */
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

    /** 负载均衡器的创建时间。格式：yyyy-MM-dd'T'HH:mm:ss'Z'
     * 
     * @return createdAt */
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

    /** 负载均衡器的更新时间。格式：yyyy-MM-dd'T'HH:mm:ss'Z'
     * 
     * @return updatedAt */
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

    /** 是否独享型LB，取值： - false：共享型。 - true：独享型。
     * 
     * @return guaranteed */
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

    /** 负载均衡器所在VPC ID。
     * 
     * @return vpcId */
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
        if (this.eips == null) {
            this.eips = new ArrayList<>();
        }
        this.eips.add(eipsItem);
        return this;
    }

    public LoadBalancer withEips(Consumer<List<EipInfo>> eipsSetter) {
        if (this.eips == null) {
            this.eips = new ArrayList<>();
        }
        eipsSetter.accept(this.eips);
        return this;
    }

    /** 负载均衡器绑定的EIP。只支持绑定一个EIP。 注：该字段与publicips一致。
     * 
     * @return eips */
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

    /** 双栈类型负载均衡器的IPv6地址。 [不支持IPv6，请勿使用。](tag:dt,dt_test)
     * 
     * @return ipv6VipAddress */
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

    /** 双栈类型负载均衡器所在子网的IPv6网络ID。 [不支持IPv6，请勿使用。](tag:dt,dt_test)
     * 
     * @return ipv6VipVirsubnetId */
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

    /** 双栈类型负载均衡器的IPv6对应的port ID。 [不支持IPv6，请勿使用。](tag:dt,dt_test)
     * 
     * @return ipv6VipPortId */
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
        if (this.availabilityZoneList == null) {
            this.availabilityZoneList = new ArrayList<>();
        }
        this.availabilityZoneList.add(availabilityZoneListItem);
        return this;
    }

    public LoadBalancer withAvailabilityZoneList(Consumer<List<String>> availabilityZoneListSetter) {
        if (this.availabilityZoneList == null) {
            this.availabilityZoneList = new ArrayList<>();
        }
        availabilityZoneListSetter.accept(this.availabilityZoneList);
        return this;
    }

    /** 负载均衡器所在的可用区列表。
     * 
     * @return availabilityZoneList */
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

    /** 企业项目ID。 [不支持该字段，请勿使用](tag:dt,dt_test)
     * 
     * @return enterpriseProjectId */
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

    /** 资源账单信息，取值： - 空：按需计费。 - 非空：包周期计费， 包周期计费billing_info字段的格式为：order_id&#58;product_id&#58;region_id&#58;project_id，如：
     * CS2107161019CDJZZ&#58;OFFI569702121789763584&#58;eu-de&#58;057ef081eb00d2732fd1c01a9be75e6f 使用说明： -
     * admin权限才能更新此字段。 [不支持该字段，请勿使用](tag:dt,dt_test)
     * 
     * @return billingInfo */
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

    /** 四层Flavor ID。 [hsco场景下所有LB实例共享带宽，该字段无效，请勿使用。](tag:hws,hcso)
     * 
     * @return l4FlavorId */
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

    /** 四层弹性Flavor ID。 不支持该字段，请勿使用。
     * 
     * @return l4ScaleFlavorId */
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

    /** 七层Flavor ID。 [hsco场景下所有LB实例共享带宽，该字段无效，请勿使用。](tag:hws,hcso)
     * 
     * @return l7FlavorId */
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

    /** 七层弹性Flavor ID。 不支持该字段，请勿使用。
     * 
     * @return l7ScaleFlavorId */
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
        if (this.publicips == null) {
            this.publicips = new ArrayList<>();
        }
        publicipsSetter.accept(this.publicips);
        return this;
    }

    /** 负载均衡器绑定的公网IP。只支持绑定一个公网IP。 注：该字段与eips一致。
     * 
     * @return publicips */
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
        if (this.elbVirsubnetIds == null) {
            this.elbVirsubnetIds = new ArrayList<>();
        }
        elbVirsubnetIdsSetter.accept(this.elbVirsubnetIds);
        return this;
    }

    /** 下联面子网的网络ID列表。可以通过GET https&#58;//{VPC_Endpoint}/v1/{project_id}/subnets 响应参数中的id得到。 使用说明： -
     * 若不指定该字段，则会在当前负载均衡器所在子网作为下联面子网。 - 若指定多个下联面子网，则按顺序优先使用第一个子网来为负载均衡器下联面端口分配ip地址。 - 下联面子网必须属于该LB所在的VPC。 - 不支持边缘云子网。
     * 
     * @return elbVirsubnetIds */
    public List<String> getElbVirsubnetIds() {
        return elbVirsubnetIds;
    }

    public void setElbVirsubnetIds(List<String> elbVirsubnetIds) {
        this.elbVirsubnetIds = elbVirsubnetIds;
    }

    public LoadBalancer withElbVirsubnetType(ElbVirsubnetTypeEnum elbVirsubnetType) {
        this.elbVirsubnetType = elbVirsubnetType;
        return this;
    }

    /** 下联面子网类型 - ipv4：ipv4 - dualstack：双栈
     * 
     * @return elbVirsubnetType */
    public ElbVirsubnetTypeEnum getElbVirsubnetType() {
        return elbVirsubnetType;
    }

    public void setElbVirsubnetType(ElbVirsubnetTypeEnum elbVirsubnetType) {
        this.elbVirsubnetType = elbVirsubnetType;
    }

    public LoadBalancer withIpTargetEnable(Boolean ipTargetEnable) {
        this.ipTargetEnable = ipTargetEnable;
        return this;
    }

    /** 是否启用跨VPC后端转发。取值： - true：开启。 - false：不开启。 仅独享型负载均衡器支持该特性。 开启跨VPC后端转发后，后端服务器组支持添加其他VPC、其他公有云、云下数据中心的服务器。
     * [不支持该字段，请勿使用。](tag:dt,dt_test)
     * 
     * @return ipTargetEnable */
    public Boolean getIpTargetEnable() {
        return ipTargetEnable;
    }

    public void setIpTargetEnable(Boolean ipTargetEnable) {
        this.ipTargetEnable = ipTargetEnable;
    }

    public LoadBalancer withFrozenScene(String frozenScene) {
        this.frozenScene = frozenScene;
        return this;
    }

    /** 负载均衡器的冻结场景。若负载均衡器有多个冻结场景，用逗号分隔。取值： - POLICE：公安冻结场景。 - ILLEGAL：违规冻结场景。 - VERIFY：客户未实名认证冻结场景。 -
     * RTNER：合作伙伴冻结（合作伙伴冻结子客户资源）。 - REAR：欠费冻结场景。 [不支持该字段，请勿使用。](tag:dt,dt_test)
     * 
     * @return frozenScene */
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
        if (this.ipv6Bandwidth == null) {
            this.ipv6Bandwidth = new BandwidthRef();
            ipv6BandwidthSetter.accept(this.ipv6Bandwidth);
        }

        return this;
    }

    /** Get ipv6Bandwidth
     * 
     * @return ipv6Bandwidth */
    public BandwidthRef getIpv6Bandwidth() {
        return ipv6Bandwidth;
    }

    public void setIpv6Bandwidth(BandwidthRef ipv6Bandwidth) {
        this.ipv6Bandwidth = ipv6Bandwidth;
    }

    public LoadBalancer withDeletionProtectionEnable(Boolean deletionProtectionEnable) {
        this.deletionProtectionEnable = deletionProtectionEnable;
        return this;
    }

    /** 是否开启删除保护，取值： - false：不开启。 - true：开启。 >退场时需要先关闭所有资源的删除保护开关。 仅当前局点启用删除保护特性后才会返回该字段。
     * 
     * @return deletionProtectionEnable */
    public Boolean getDeletionProtectionEnable() {
        return deletionProtectionEnable;
    }

    public void setDeletionProtectionEnable(Boolean deletionProtectionEnable) {
        this.deletionProtectionEnable = deletionProtectionEnable;
    }

    public LoadBalancer withAutoscaling(AutoscalingRef autoscaling) {
        this.autoscaling = autoscaling;
        return this;
    }

    public LoadBalancer withAutoscaling(Consumer<AutoscalingRef> autoscalingSetter) {
        if (this.autoscaling == null) {
            this.autoscaling = new AutoscalingRef();
            autoscalingSetter.accept(this.autoscaling);
        }

        return this;
    }

    /** Get autoscaling
     * 
     * @return autoscaling */
    public AutoscalingRef getAutoscaling() {
        return autoscaling;
    }

    public void setAutoscaling(AutoscalingRef autoscaling) {
        this.autoscaling = autoscaling;
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
        return Objects.equals(this.id, loadBalancer.id) && Objects.equals(this.description, loadBalancer.description)
            && Objects.equals(this.provisioningStatus, loadBalancer.provisioningStatus)
            && Objects.equals(this.adminStateUp, loadBalancer.adminStateUp)
            && Objects.equals(this.provider, loadBalancer.provider) && Objects.equals(this.pools, loadBalancer.pools)
            && Objects.equals(this.listeners, loadBalancer.listeners)
            && Objects.equals(this.operatingStatus, loadBalancer.operatingStatus)
            && Objects.equals(this.name, loadBalancer.name) && Objects.equals(this.projectId, loadBalancer.projectId)
            && Objects.equals(this.vipSubnetCidrId, loadBalancer.vipSubnetCidrId)
            && Objects.equals(this.vipAddress, loadBalancer.vipAddress)
            && Objects.equals(this.vipPortId, loadBalancer.vipPortId) && Objects.equals(this.tags, loadBalancer.tags)
            && Objects.equals(this.createdAt, loadBalancer.createdAt)
            && Objects.equals(this.updatedAt, loadBalancer.updatedAt)
            && Objects.equals(this.guaranteed, loadBalancer.guaranteed)
            && Objects.equals(this.vpcId, loadBalancer.vpcId) && Objects.equals(this.eips, loadBalancer.eips)
            && Objects.equals(this.ipv6VipAddress, loadBalancer.ipv6VipAddress)
            && Objects.equals(this.ipv6VipVirsubnetId, loadBalancer.ipv6VipVirsubnetId)
            && Objects.equals(this.ipv6VipPortId, loadBalancer.ipv6VipPortId)
            && Objects.equals(this.availabilityZoneList, loadBalancer.availabilityZoneList)
            && Objects.equals(this.enterpriseProjectId, loadBalancer.enterpriseProjectId)
            && Objects.equals(this.billingInfo, loadBalancer.billingInfo)
            && Objects.equals(this.l4FlavorId, loadBalancer.l4FlavorId)
            && Objects.equals(this.l4ScaleFlavorId, loadBalancer.l4ScaleFlavorId)
            && Objects.equals(this.l7FlavorId, loadBalancer.l7FlavorId)
            && Objects.equals(this.l7ScaleFlavorId, loadBalancer.l7ScaleFlavorId)
            && Objects.equals(this.publicips, loadBalancer.publicips)
            && Objects.equals(this.elbVirsubnetIds, loadBalancer.elbVirsubnetIds)
            && Objects.equals(this.elbVirsubnetType, loadBalancer.elbVirsubnetType)
            && Objects.equals(this.ipTargetEnable, loadBalancer.ipTargetEnable)
            && Objects.equals(this.frozenScene, loadBalancer.frozenScene)
            && Objects.equals(this.ipv6Bandwidth, loadBalancer.ipv6Bandwidth)
            && Objects.equals(this.deletionProtectionEnable, loadBalancer.deletionProtectionEnable)
            && Objects.equals(this.autoscaling, loadBalancer.autoscaling);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            description,
            provisioningStatus,
            adminStateUp,
            provider,
            pools,
            listeners,
            operatingStatus,
            name,
            projectId,
            vipSubnetCidrId,
            vipAddress,
            vipPortId,
            tags,
            createdAt,
            updatedAt,
            guaranteed,
            vpcId,
            eips,
            ipv6VipAddress,
            ipv6VipVirsubnetId,
            ipv6VipPortId,
            availabilityZoneList,
            enterpriseProjectId,
            billingInfo,
            l4FlavorId,
            l4ScaleFlavorId,
            l7FlavorId,
            l7ScaleFlavorId,
            publicips,
            elbVirsubnetIds,
            elbVirsubnetType,
            ipTargetEnable,
            frozenScene,
            ipv6Bandwidth,
            deletionProtectionEnable,
            autoscaling);
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
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    vipSubnetCidrId: ").append(toIndentedString(vipSubnetCidrId)).append("\n");
        sb.append("    vipAddress: ").append(toIndentedString(vipAddress)).append("\n");
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
        sb.append("    frozenScene: ").append(toIndentedString(frozenScene)).append("\n");
        sb.append("    ipv6Bandwidth: ").append(toIndentedString(ipv6Bandwidth)).append("\n");
        sb.append("    deletionProtectionEnable: ").append(toIndentedString(deletionProtectionEnable)).append("\n");
        sb.append("    autoscaling: ").append(toIndentedString(autoscaling)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
