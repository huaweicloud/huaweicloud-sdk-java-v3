package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListLoadBalancersRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_reverse")

    private Boolean pageReverse;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private List<String> id = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private List<String> name = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private List<String> description = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state_up")

    private Boolean adminStateUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provisioning_status")

    private List<String> provisioningStatus = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operating_status")

    private List<String> operatingStatus = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "guaranteed")

    private Boolean guaranteed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private List<String> vpcId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vip_port_id")

    private List<String> vipPortId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vip_address")

    private List<String> vipAddress = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vip_subnet_cidr_id")

    private List<String> vipSubnetCidrId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_vip_port_id")

    private List<String> ipv6VipPortId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_vip_address")

    private List<String> ipv6VipAddress = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_vip_virsubnet_id")

    private List<String> ipv6VipVirsubnetId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eips")

    private List<String> eips = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicips")

    private List<String> publicips = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone_list")

    private List<String> availabilityZoneList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l4_flavor_id")

    private List<String> l4FlavorId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l4_scale_flavor_id")

    private List<String> l4ScaleFlavorId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l7_flavor_id")

    private List<String> l7FlavorId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l7_scale_flavor_id")

    private List<String> l7ScaleFlavorId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "billing_info")

    private List<String> billingInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_device_id")

    private List<String> memberDeviceId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_address")

    private List<String> memberAddress = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private List<String> enterpriseProjectId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_version")

    private List<Integer> ipVersion = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deletion_protection_enable")

    private Boolean deletionProtectionEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elb_virsubnet_type")

    private List<String> elbVirsubnetType = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "autoscaling")

    private List<String> autoscaling = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protection_status")

    private List<String> protectionStatus = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_eips")

    private List<String> globalEips = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_topic_id")

    private String logTopicId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_group_id")

    private String logGroupId;

    public ListLoadBalancersRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 上一页最后一条记录的ID。  使用说明： - 必须与limit一起使用。 - 不指定时表示查询第一页。 - 该字段不允许为空或无效的ID。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListLoadBalancersRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页返回的个数。
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

    public ListLoadBalancersRequest withPageReverse(Boolean pageReverse) {
        this.pageReverse = pageReverse;
        return this;
    }

    /**
     * 是否反向查询。  取值： - true：查询上一页。 - false：查询下一页，默认。  使用说明： - 必须与limit一起使用。 - 当page_reverse=true时，若要查询上一页，marker取值为当前页返回值的previous_marker。
     * @return pageReverse
     */
    public Boolean getPageReverse() {
        return pageReverse;
    }

    public void setPageReverse(Boolean pageReverse) {
        this.pageReverse = pageReverse;
    }

    public ListLoadBalancersRequest withId(List<String> id) {
        this.id = id;
        return this;
    }

    public ListLoadBalancersRequest addIdItem(String idItem) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        this.id.add(idItem);
        return this;
    }

    public ListLoadBalancersRequest withId(Consumer<List<String>> idSetter) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        idSetter.accept(this.id);
        return this;
    }

    /**
     * 负载均衡器ID。  支持多值查询，查询条件格式：*id=xxx&id=xxx*。
     * @return id
     */
    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    public ListLoadBalancersRequest withName(List<String> name) {
        this.name = name;
        return this;
    }

    public ListLoadBalancersRequest addNameItem(String nameItem) {
        if (this.name == null) {
            this.name = new ArrayList<>();
        }
        this.name.add(nameItem);
        return this;
    }

    public ListLoadBalancersRequest withName(Consumer<List<String>> nameSetter) {
        if (this.name == null) {
            this.name = new ArrayList<>();
        }
        nameSetter.accept(this.name);
        return this;
    }

    /**
     * 负载均衡器名称。  支持多值查询，查询条件格式：*name=xxx&name=xxx*。
     * @return name
     */
    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    public ListLoadBalancersRequest withDescription(List<String> description) {
        this.description = description;
        return this;
    }

    public ListLoadBalancersRequest addDescriptionItem(String descriptionItem) {
        if (this.description == null) {
            this.description = new ArrayList<>();
        }
        this.description.add(descriptionItem);
        return this;
    }

    public ListLoadBalancersRequest withDescription(Consumer<List<String>> descriptionSetter) {
        if (this.description == null) {
            this.description = new ArrayList<>();
        }
        descriptionSetter.accept(this.description);
        return this;
    }

    /**
     * 负载均衡器的描述信息。  支持多值查询，查询条件格式：*description=xxx&description=xxx*。
     * @return description
     */
    public List<String> getDescription() {
        return description;
    }

    public void setDescription(List<String> description) {
        this.description = description;
    }

    public ListLoadBalancersRequest withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    /**
     * 负载均衡器的管理状态。  不支持该字段，请勿使用。
     * @return adminStateUp
     */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public ListLoadBalancersRequest withProvisioningStatus(List<String> provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
        return this;
    }

    public ListLoadBalancersRequest addProvisioningStatusItem(String provisioningStatusItem) {
        if (this.provisioningStatus == null) {
            this.provisioningStatus = new ArrayList<>();
        }
        this.provisioningStatus.add(provisioningStatusItem);
        return this;
    }

    public ListLoadBalancersRequest withProvisioningStatus(Consumer<List<String>> provisioningStatusSetter) {
        if (this.provisioningStatus == null) {
            this.provisioningStatus = new ArrayList<>();
        }
        provisioningStatusSetter.accept(this.provisioningStatus);
        return this;
    }

    /**
     * 负载均衡器的配置状态。  取值： - ACTIVE：使用中。 - PENDING_DELETE：删除中。  支持多值查询，查询条件格式：*provisioning_status=xxx&provisioning_status=xxx*。
     * @return provisioningStatus
     */
    public List<String> getProvisioningStatus() {
        return provisioningStatus;
    }

    public void setProvisioningStatus(List<String> provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
    }

    public ListLoadBalancersRequest withOperatingStatus(List<String> operatingStatus) {
        this.operatingStatus = operatingStatus;
        return this;
    }

    public ListLoadBalancersRequest addOperatingStatusItem(String operatingStatusItem) {
        if (this.operatingStatus == null) {
            this.operatingStatus = new ArrayList<>();
        }
        this.operatingStatus.add(operatingStatusItem);
        return this;
    }

    public ListLoadBalancersRequest withOperatingStatus(Consumer<List<String>> operatingStatusSetter) {
        if (this.operatingStatus == null) {
            this.operatingStatus = new ArrayList<>();
        }
        operatingStatusSetter.accept(this.operatingStatus);
        return this;
    }

    /**
     * 负载均衡器的操作状态。  取值： - ONLINE：正常运行。 - FROZEN：已冻结。  支持多值查询，查询条件格式：*operating_status=xxx&operating_status=xxx*。
     * @return operatingStatus
     */
    public List<String> getOperatingStatus() {
        return operatingStatus;
    }

    public void setOperatingStatus(List<String> operatingStatus) {
        this.operatingStatus = operatingStatus;
    }

    public ListLoadBalancersRequest withGuaranteed(Boolean guaranteed) {
        this.guaranteed = guaranteed;
        return this;
    }

    /**
     * 是否独享型LB。  取值： - false：共享型 - true：独享型  [仅支持独享型，固定为true。](tag:hws_eu,hcso_dt)
     * @return guaranteed
     */
    public Boolean getGuaranteed() {
        return guaranteed;
    }

    public void setGuaranteed(Boolean guaranteed) {
        this.guaranteed = guaranteed;
    }

    public ListLoadBalancersRequest withVpcId(List<String> vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public ListLoadBalancersRequest addVpcIdItem(String vpcIdItem) {
        if (this.vpcId == null) {
            this.vpcId = new ArrayList<>();
        }
        this.vpcId.add(vpcIdItem);
        return this;
    }

    public ListLoadBalancersRequest withVpcId(Consumer<List<String>> vpcIdSetter) {
        if (this.vpcId == null) {
            this.vpcId = new ArrayList<>();
        }
        vpcIdSetter.accept(this.vpcId);
        return this;
    }

    /**
     * 负载均衡器所在的VPC ID。  支持多值查询，查询条件格式：*vpc_id=xxx&vpc_id=xxx*。
     * @return vpcId
     */
    public List<String> getVpcId() {
        return vpcId;
    }

    public void setVpcId(List<String> vpcId) {
        this.vpcId = vpcId;
    }

    public ListLoadBalancersRequest withVipPortId(List<String> vipPortId) {
        this.vipPortId = vipPortId;
        return this;
    }

    public ListLoadBalancersRequest addVipPortIdItem(String vipPortIdItem) {
        if (this.vipPortId == null) {
            this.vipPortId = new ArrayList<>();
        }
        this.vipPortId.add(vipPortIdItem);
        return this;
    }

    public ListLoadBalancersRequest withVipPortId(Consumer<List<String>> vipPortIdSetter) {
        if (this.vipPortId == null) {
            this.vipPortId = new ArrayList<>();
        }
        vipPortIdSetter.accept(this.vipPortId);
        return this;
    }

    /**
     * 负载均衡器的IPv4对应的port ID。  支持多值查询，查询条件格式：*vip_port_id=xxx&vip_port_id=xxx*。
     * @return vipPortId
     */
    public List<String> getVipPortId() {
        return vipPortId;
    }

    public void setVipPortId(List<String> vipPortId) {
        this.vipPortId = vipPortId;
    }

    public ListLoadBalancersRequest withVipAddress(List<String> vipAddress) {
        this.vipAddress = vipAddress;
        return this;
    }

    public ListLoadBalancersRequest addVipAddressItem(String vipAddressItem) {
        if (this.vipAddress == null) {
            this.vipAddress = new ArrayList<>();
        }
        this.vipAddress.add(vipAddressItem);
        return this;
    }

    public ListLoadBalancersRequest withVipAddress(Consumer<List<String>> vipAddressSetter) {
        if (this.vipAddress == null) {
            this.vipAddress = new ArrayList<>();
        }
        vipAddressSetter.accept(this.vipAddress);
        return this;
    }

    /**
     * 负载均衡器的IPv4虚拟IP地址。  支持多值查询，查询条件格式：*vip_address=xxx&vip_address=xxx*。
     * @return vipAddress
     */
    public List<String> getVipAddress() {
        return vipAddress;
    }

    public void setVipAddress(List<String> vipAddress) {
        this.vipAddress = vipAddress;
    }

    public ListLoadBalancersRequest withVipSubnetCidrId(List<String> vipSubnetCidrId) {
        this.vipSubnetCidrId = vipSubnetCidrId;
        return this;
    }

    public ListLoadBalancersRequest addVipSubnetCidrIdItem(String vipSubnetCidrIdItem) {
        if (this.vipSubnetCidrId == null) {
            this.vipSubnetCidrId = new ArrayList<>();
        }
        this.vipSubnetCidrId.add(vipSubnetCidrIdItem);
        return this;
    }

    public ListLoadBalancersRequest withVipSubnetCidrId(Consumer<List<String>> vipSubnetCidrIdSetter) {
        if (this.vipSubnetCidrId == null) {
            this.vipSubnetCidrId = new ArrayList<>();
        }
        vipSubnetCidrIdSetter.accept(this.vipSubnetCidrId);
        return this;
    }

    /**
     * 负载均衡器所在子网的IPv4子网ID。  支持多值查询，查询条件格式：*vip_subnet_cidr_id=xxx&vip_subnet_cidr_id=xxx*。
     * @return vipSubnetCidrId
     */
    public List<String> getVipSubnetCidrId() {
        return vipSubnetCidrId;
    }

    public void setVipSubnetCidrId(List<String> vipSubnetCidrId) {
        this.vipSubnetCidrId = vipSubnetCidrId;
    }

    public ListLoadBalancersRequest withIpv6VipPortId(List<String> ipv6VipPortId) {
        this.ipv6VipPortId = ipv6VipPortId;
        return this;
    }

    public ListLoadBalancersRequest addIpv6VipPortIdItem(String ipv6VipPortIdItem) {
        if (this.ipv6VipPortId == null) {
            this.ipv6VipPortId = new ArrayList<>();
        }
        this.ipv6VipPortId.add(ipv6VipPortIdItem);
        return this;
    }

    public ListLoadBalancersRequest withIpv6VipPortId(Consumer<List<String>> ipv6VipPortIdSetter) {
        if (this.ipv6VipPortId == null) {
            this.ipv6VipPortId = new ArrayList<>();
        }
        ipv6VipPortIdSetter.accept(this.ipv6VipPortId);
        return this;
    }

    /**
     * 双栈类型负载均衡器的IPv6对应的port ID。  支持多值查询，查询条件格式：*ipv6_vip_port_id=xxx&ipv6_vip_port_id=xxx*。  [不支持IPv6，请勿使用。](tag:dt,dt_test)
     * @return ipv6VipPortId
     */
    public List<String> getIpv6VipPortId() {
        return ipv6VipPortId;
    }

    public void setIpv6VipPortId(List<String> ipv6VipPortId) {
        this.ipv6VipPortId = ipv6VipPortId;
    }

    public ListLoadBalancersRequest withIpv6VipAddress(List<String> ipv6VipAddress) {
        this.ipv6VipAddress = ipv6VipAddress;
        return this;
    }

    public ListLoadBalancersRequest addIpv6VipAddressItem(String ipv6VipAddressItem) {
        if (this.ipv6VipAddress == null) {
            this.ipv6VipAddress = new ArrayList<>();
        }
        this.ipv6VipAddress.add(ipv6VipAddressItem);
        return this;
    }

    public ListLoadBalancersRequest withIpv6VipAddress(Consumer<List<String>> ipv6VipAddressSetter) {
        if (this.ipv6VipAddress == null) {
            this.ipv6VipAddress = new ArrayList<>();
        }
        ipv6VipAddressSetter.accept(this.ipv6VipAddress);
        return this;
    }

    /**
     * 双栈类型负载均衡器的IPv6地址。  支持多值查询，查询条件格式：*ipv6_vip_address=xxx&ipv6_vip_address=xxx*。  [不支持IPv6，请勿使用。](tag:dt,dt_test)
     * @return ipv6VipAddress
     */
    public List<String> getIpv6VipAddress() {
        return ipv6VipAddress;
    }

    public void setIpv6VipAddress(List<String> ipv6VipAddress) {
        this.ipv6VipAddress = ipv6VipAddress;
    }

    public ListLoadBalancersRequest withIpv6VipVirsubnetId(List<String> ipv6VipVirsubnetId) {
        this.ipv6VipVirsubnetId = ipv6VipVirsubnetId;
        return this;
    }

    public ListLoadBalancersRequest addIpv6VipVirsubnetIdItem(String ipv6VipVirsubnetIdItem) {
        if (this.ipv6VipVirsubnetId == null) {
            this.ipv6VipVirsubnetId = new ArrayList<>();
        }
        this.ipv6VipVirsubnetId.add(ipv6VipVirsubnetIdItem);
        return this;
    }

    public ListLoadBalancersRequest withIpv6VipVirsubnetId(Consumer<List<String>> ipv6VipVirsubnetIdSetter) {
        if (this.ipv6VipVirsubnetId == null) {
            this.ipv6VipVirsubnetId = new ArrayList<>();
        }
        ipv6VipVirsubnetIdSetter.accept(this.ipv6VipVirsubnetId);
        return this;
    }

    /**
     * 双栈类型负载均衡器所在的子网IPv6网络ID。  支持多值查询，查询条件格式：*ipv6_vip_virsubnet_id=xxx&ipv6_vip_virsubnet_id=xxx*。  [不支持IPv6，请勿使用。](tag:dt,dt_test)
     * @return ipv6VipVirsubnetId
     */
    public List<String> getIpv6VipVirsubnetId() {
        return ipv6VipVirsubnetId;
    }

    public void setIpv6VipVirsubnetId(List<String> ipv6VipVirsubnetId) {
        this.ipv6VipVirsubnetId = ipv6VipVirsubnetId;
    }

    public ListLoadBalancersRequest withEips(List<String> eips) {
        this.eips = eips;
        return this;
    }

    public ListLoadBalancersRequest addEipsItem(String eipsItem) {
        if (this.eips == null) {
            this.eips = new ArrayList<>();
        }
        this.eips.add(eipsItem);
        return this;
    }

    public ListLoadBalancersRequest withEips(Consumer<List<String>> eipsSetter) {
        if (this.eips == null) {
            this.eips = new ArrayList<>();
        }
        eipsSetter.accept(this.eips);
        return this;
    }

    /**
     * 负载均衡器绑定的EIP。示例如下： \"eips\": [             {                 \"eip_id\": \"e9b72a9d-4275-455e-a724-853504e4d9c6\",                 \"eip_address\": \"88.88.14.122\",                 \"ip_version\": 4             }         ]  支持多值查询，查询条件格式： - eip_id作为查询条件：*eips=eip_id=xxx&eips=eip_id=xxx*。 - eip_address作为查询条件：*eips=eip_address=xxx&eips=eip_address=xxx*。 - ip_version作为查询条件：*eips=ip_version=xxx&eips=ip_version=xxx*。  注：该字段与publicips字段一致。
     * @return eips
     */
    public List<String> getEips() {
        return eips;
    }

    public void setEips(List<String> eips) {
        this.eips = eips;
    }

    public ListLoadBalancersRequest withPublicips(List<String> publicips) {
        this.publicips = publicips;
        return this;
    }

    public ListLoadBalancersRequest addPublicipsItem(String publicipsItem) {
        if (this.publicips == null) {
            this.publicips = new ArrayList<>();
        }
        this.publicips.add(publicipsItem);
        return this;
    }

    public ListLoadBalancersRequest withPublicips(Consumer<List<String>> publicipsSetter) {
        if (this.publicips == null) {
            this.publicips = new ArrayList<>();
        }
        publicipsSetter.accept(this.publicips);
        return this;
    }

    /**
     * 负载均衡器绑定的公网IP。示例如下：  \"publicips\": [                 {                     \"publicip_id\": \"e9b72a9d-4275-455e-a724-853504e4d9c6\",                     \"publicip_address\": \"88.88.14.122\",                     \"ip_version\": 4                 }             ]  支持多值查询，查询条件格式： - publicip_id作为查询条件： *publicips=publicip_id=xxx&publicips=publicip_id=xxx* - publicip_address作为查询条件： *publicips=publicip_address=xxx&publicips=publicip_address=xxx* - ip_version作为查询条件： *publicips=ip_version=xxx&publicips=ip_version=xxx*  注：该字段与eips字段一致。
     * @return publicips
     */
    public List<String> getPublicips() {
        return publicips;
    }

    public void setPublicips(List<String> publicips) {
        this.publicips = publicips;
    }

    public ListLoadBalancersRequest withAvailabilityZoneList(List<String> availabilityZoneList) {
        this.availabilityZoneList = availabilityZoneList;
        return this;
    }

    public ListLoadBalancersRequest addAvailabilityZoneListItem(String availabilityZoneListItem) {
        if (this.availabilityZoneList == null) {
            this.availabilityZoneList = new ArrayList<>();
        }
        this.availabilityZoneList.add(availabilityZoneListItem);
        return this;
    }

    public ListLoadBalancersRequest withAvailabilityZoneList(Consumer<List<String>> availabilityZoneListSetter) {
        if (this.availabilityZoneList == null) {
            this.availabilityZoneList = new ArrayList<>();
        }
        availabilityZoneListSetter.accept(this.availabilityZoneList);
        return this;
    }

    /**
     * 负载均衡器所在可用区列表。  支持多值查询，查询条件格式： *availability_zone_list=xxx&availability_zone_list=xxx*。
     * @return availabilityZoneList
     */
    public List<String> getAvailabilityZoneList() {
        return availabilityZoneList;
    }

    public void setAvailabilityZoneList(List<String> availabilityZoneList) {
        this.availabilityZoneList = availabilityZoneList;
    }

    public ListLoadBalancersRequest withL4FlavorId(List<String> l4FlavorId) {
        this.l4FlavorId = l4FlavorId;
        return this;
    }

    public ListLoadBalancersRequest addL4FlavorIdItem(String l4FlavorIdItem) {
        if (this.l4FlavorId == null) {
            this.l4FlavorId = new ArrayList<>();
        }
        this.l4FlavorId.add(l4FlavorIdItem);
        return this;
    }

    public ListLoadBalancersRequest withL4FlavorId(Consumer<List<String>> l4FlavorIdSetter) {
        if (this.l4FlavorId == null) {
            this.l4FlavorId = new ArrayList<>();
        }
        l4FlavorIdSetter.accept(this.l4FlavorId);
        return this;
    }

    /**
     * 网络型规格ID。  支持多值查询，查询条件格式：*l4_flavor_id=xxx&l4_flavor_id=xxx*。  [不支持该字段，请勿使用。](tag:hcso,fcs,fcs_vm,mix,hcso_g42,hcso_g42_b)
     * @return l4FlavorId
     */
    public List<String> getL4FlavorId() {
        return l4FlavorId;
    }

    public void setL4FlavorId(List<String> l4FlavorId) {
        this.l4FlavorId = l4FlavorId;
    }

    public ListLoadBalancersRequest withL4ScaleFlavorId(List<String> l4ScaleFlavorId) {
        this.l4ScaleFlavorId = l4ScaleFlavorId;
        return this;
    }

    public ListLoadBalancersRequest addL4ScaleFlavorIdItem(String l4ScaleFlavorIdItem) {
        if (this.l4ScaleFlavorId == null) {
            this.l4ScaleFlavorId = new ArrayList<>();
        }
        this.l4ScaleFlavorId.add(l4ScaleFlavorIdItem);
        return this;
    }

    public ListLoadBalancersRequest withL4ScaleFlavorId(Consumer<List<String>> l4ScaleFlavorIdSetter) {
        if (this.l4ScaleFlavorId == null) {
            this.l4ScaleFlavorId = new ArrayList<>();
        }
        l4ScaleFlavorIdSetter.accept(this.l4ScaleFlavorId);
        return this;
    }

    /**
     * 四层弹性Flavor ID。  支持多值查询，查询条件格式：*l4_scale_flavor_id=xxx&l4_scale_flavor_id=xxx*。  不支持该字段，请勿使用。
     * @return l4ScaleFlavorId
     */
    public List<String> getL4ScaleFlavorId() {
        return l4ScaleFlavorId;
    }

    public void setL4ScaleFlavorId(List<String> l4ScaleFlavorId) {
        this.l4ScaleFlavorId = l4ScaleFlavorId;
    }

    public ListLoadBalancersRequest withL7FlavorId(List<String> l7FlavorId) {
        this.l7FlavorId = l7FlavorId;
        return this;
    }

    public ListLoadBalancersRequest addL7FlavorIdItem(String l7FlavorIdItem) {
        if (this.l7FlavorId == null) {
            this.l7FlavorId = new ArrayList<>();
        }
        this.l7FlavorId.add(l7FlavorIdItem);
        return this;
    }

    public ListLoadBalancersRequest withL7FlavorId(Consumer<List<String>> l7FlavorIdSetter) {
        if (this.l7FlavorId == null) {
            this.l7FlavorId = new ArrayList<>();
        }
        l7FlavorIdSetter.accept(this.l7FlavorId);
        return this;
    }

    /**
     * 应用型规格ID。  支持多值查询，查询条件格式：*l7_flavor_id=xxx&l7_flavor_id=xxx*。  [不支持该字段，请勿使用。](tag:hcso,fcs,fcs_vm,mix,hcso_g42,hcso_g42_b)
     * @return l7FlavorId
     */
    public List<String> getL7FlavorId() {
        return l7FlavorId;
    }

    public void setL7FlavorId(List<String> l7FlavorId) {
        this.l7FlavorId = l7FlavorId;
    }

    public ListLoadBalancersRequest withL7ScaleFlavorId(List<String> l7ScaleFlavorId) {
        this.l7ScaleFlavorId = l7ScaleFlavorId;
        return this;
    }

    public ListLoadBalancersRequest addL7ScaleFlavorIdItem(String l7ScaleFlavorIdItem) {
        if (this.l7ScaleFlavorId == null) {
            this.l7ScaleFlavorId = new ArrayList<>();
        }
        this.l7ScaleFlavorId.add(l7ScaleFlavorIdItem);
        return this;
    }

    public ListLoadBalancersRequest withL7ScaleFlavorId(Consumer<List<String>> l7ScaleFlavorIdSetter) {
        if (this.l7ScaleFlavorId == null) {
            this.l7ScaleFlavorId = new ArrayList<>();
        }
        l7ScaleFlavorIdSetter.accept(this.l7ScaleFlavorId);
        return this;
    }

    /**
     * 七层弹性Flavor ID。  支持多值查询，查询条件格式：*l7_scale_flavor_id=xxx&l7_scale_flavor_id=xxx*。  不支持该字段，请勿使用。
     * @return l7ScaleFlavorId
     */
    public List<String> getL7ScaleFlavorId() {
        return l7ScaleFlavorId;
    }

    public void setL7ScaleFlavorId(List<String> l7ScaleFlavorId) {
        this.l7ScaleFlavorId = l7ScaleFlavorId;
    }

    public ListLoadBalancersRequest withBillingInfo(List<String> billingInfo) {
        this.billingInfo = billingInfo;
        return this;
    }

    public ListLoadBalancersRequest addBillingInfoItem(String billingInfoItem) {
        if (this.billingInfo == null) {
            this.billingInfo = new ArrayList<>();
        }
        this.billingInfo.add(billingInfoItem);
        return this;
    }

    public ListLoadBalancersRequest withBillingInfo(Consumer<List<String>> billingInfoSetter) {
        if (this.billingInfo == null) {
            this.billingInfo = new ArrayList<>();
        }
        billingInfoSetter.accept(this.billingInfo);
        return this;
    }

    /**
     * 资源账单信息。  支持多值查询，查询条件格式：*billing_info=xxx&billing_info=xxx*。  [不支持该字段，请勿使用。](tag:hws_hk,hws_eu,hws_test,hcs,hcs_sm,hcso,fcs,fcs_vm,mix,hcso_g42,hcso_g42_b,hcso_dt,dt,dt_test,ocb,ctc,cmcc,tm,sbc,g42,hws_ocb,hk_sbc,hk_tm,hk_g42)
     * @return billingInfo
     */
    public List<String> getBillingInfo() {
        return billingInfo;
    }

    public void setBillingInfo(List<String> billingInfo) {
        this.billingInfo = billingInfo;
    }

    public ListLoadBalancersRequest withMemberDeviceId(List<String> memberDeviceId) {
        this.memberDeviceId = memberDeviceId;
        return this;
    }

    public ListLoadBalancersRequest addMemberDeviceIdItem(String memberDeviceIdItem) {
        if (this.memberDeviceId == null) {
            this.memberDeviceId = new ArrayList<>();
        }
        this.memberDeviceId.add(memberDeviceIdItem);
        return this;
    }

    public ListLoadBalancersRequest withMemberDeviceId(Consumer<List<String>> memberDeviceIdSetter) {
        if (this.memberDeviceId == null) {
            this.memberDeviceId = new ArrayList<>();
        }
        memberDeviceIdSetter.accept(this.memberDeviceId);
        return this;
    }

    /**
     * 负载均衡器中的后端云服务器对应的弹性云服务器的ID。仅用于查询条件，不作为响应参数字段。  支持多值查询，查询条件格式：*member_device_id=xxx&member_device_id=xxx*。
     * @return memberDeviceId
     */
    public List<String> getMemberDeviceId() {
        return memberDeviceId;
    }

    public void setMemberDeviceId(List<String> memberDeviceId) {
        this.memberDeviceId = memberDeviceId;
    }

    public ListLoadBalancersRequest withMemberAddress(List<String> memberAddress) {
        this.memberAddress = memberAddress;
        return this;
    }

    public ListLoadBalancersRequest addMemberAddressItem(String memberAddressItem) {
        if (this.memberAddress == null) {
            this.memberAddress = new ArrayList<>();
        }
        this.memberAddress.add(memberAddressItem);
        return this;
    }

    public ListLoadBalancersRequest withMemberAddress(Consumer<List<String>> memberAddressSetter) {
        if (this.memberAddress == null) {
            this.memberAddress = new ArrayList<>();
        }
        memberAddressSetter.accept(this.memberAddress);
        return this;
    }

    /**
     * 负载均衡器中的后端云服务器对应的弹性云服务器的IP地址。仅用于查询条件，不作为响应参数字段。  支持多值查询，查询条件格式：*member_address=xxx&member_address=xxx*。
     * @return memberAddress
     */
    public List<String> getMemberAddress() {
        return memberAddress;
    }

    public void setMemberAddress(List<String> memberAddress) {
        this.memberAddress = memberAddress;
    }

    public ListLoadBalancersRequest withEnterpriseProjectId(List<String> enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    public ListLoadBalancersRequest addEnterpriseProjectIdItem(String enterpriseProjectIdItem) {
        if (this.enterpriseProjectId == null) {
            this.enterpriseProjectId = new ArrayList<>();
        }
        this.enterpriseProjectId.add(enterpriseProjectIdItem);
        return this;
    }

    public ListLoadBalancersRequest withEnterpriseProjectId(Consumer<List<String>> enterpriseProjectIdSetter) {
        if (this.enterpriseProjectId == null) {
            this.enterpriseProjectId = new ArrayList<>();
        }
        enterpriseProjectIdSetter.accept(this.enterpriseProjectId);
        return this;
    }

    /**
     * 负载均衡器所属的企业项目ID。 查询时若不传，则查询default企业项目下的资源，鉴权按照default企业项目鉴权。 如果传值，则必须传已存在的企业项目ID（不可为\"0\"）或传all_granted_eps表示查询所有企业项目。  支持多值查询，查询条件格式： *enterprise_project_id=xxx&enterprise_project_id=xxx*。  [不支持该字段，请勿使用。](tag:dt,dt_test,hcso_dt)
     * @return enterpriseProjectId
     */
    public List<String> getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(List<String> enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListLoadBalancersRequest withIpVersion(List<Integer> ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    public ListLoadBalancersRequest addIpVersionItem(Integer ipVersionItem) {
        if (this.ipVersion == null) {
            this.ipVersion = new ArrayList<>();
        }
        this.ipVersion.add(ipVersionItem);
        return this;
    }

    public ListLoadBalancersRequest withIpVersion(Consumer<List<Integer>> ipVersionSetter) {
        if (this.ipVersion == null) {
            this.ipVersion = new ArrayList<>();
        }
        ipVersionSetter.accept(this.ipVersion);
        return this;
    }

    /**
     * IP版本信息。  取值：4代表IPv4，6代表IPv6。  支持多值查询，查询条件格式：*ip_version=xxx&ip_version=xxx*。  [不支持IPv6，请勿设置为6。](tag:dt,dt_test)
     * @return ipVersion
     */
    public List<Integer> getIpVersion() {
        return ipVersion;
    }

    public void setIpVersion(List<Integer> ipVersion) {
        this.ipVersion = ipVersion;
    }

    public ListLoadBalancersRequest withDeletionProtectionEnable(Boolean deletionProtectionEnable) {
        this.deletionProtectionEnable = deletionProtectionEnable;
        return this;
    }

    /**
     * 是否开启删除保护，false不开启，true开启。[不支持该字段，请勿使用。](tag:hws_eu,g42,hk_g42)  [荷兰region不支持该字段，请勿使用。](tag:dt)
     * @return deletionProtectionEnable
     */
    public Boolean getDeletionProtectionEnable() {
        return deletionProtectionEnable;
    }

    public void setDeletionProtectionEnable(Boolean deletionProtectionEnable) {
        this.deletionProtectionEnable = deletionProtectionEnable;
    }

    public ListLoadBalancersRequest withElbVirsubnetType(List<String> elbVirsubnetType) {
        this.elbVirsubnetType = elbVirsubnetType;
        return this;
    }

    public ListLoadBalancersRequest addElbVirsubnetTypeItem(String elbVirsubnetTypeItem) {
        if (this.elbVirsubnetType == null) {
            this.elbVirsubnetType = new ArrayList<>();
        }
        this.elbVirsubnetType.add(elbVirsubnetTypeItem);
        return this;
    }

    public ListLoadBalancersRequest withElbVirsubnetType(Consumer<List<String>> elbVirsubnetTypeSetter) {
        if (this.elbVirsubnetType == null) {
            this.elbVirsubnetType = new ArrayList<>();
        }
        elbVirsubnetTypeSetter.accept(this.elbVirsubnetType);
        return this;
    }

    /**
     * 下联面子网类型。  取值： - ipv4：ipv4。 - dualstack：双栈。  支持多值查询，查询条件格式： *elb_virsubnet_type=ipv4&elb_virsubnet_type=dualstack*。
     * @return elbVirsubnetType
     */
    public List<String> getElbVirsubnetType() {
        return elbVirsubnetType;
    }

    public void setElbVirsubnetType(List<String> elbVirsubnetType) {
        this.elbVirsubnetType = elbVirsubnetType;
    }

    public ListLoadBalancersRequest withAutoscaling(List<String> autoscaling) {
        this.autoscaling = autoscaling;
        return this;
    }

    public ListLoadBalancersRequest addAutoscalingItem(String autoscalingItem) {
        if (this.autoscaling == null) {
            this.autoscaling = new ArrayList<>();
        }
        this.autoscaling.add(autoscalingItem);
        return this;
    }

    public ListLoadBalancersRequest withAutoscaling(Consumer<List<String>> autoscalingSetter) {
        if (this.autoscaling == null) {
            this.autoscaling = new ArrayList<>();
        }
        autoscalingSetter.accept(this.autoscaling);
        return this;
    }

    /**
     * 是否开启弹性扩缩容。示例如下： \"autoscaling\": {             \"enable\": \"true\"         }  支持多值查询，查询条件格式：  *autoscaling=enable=true&autoscaling=enable=false*。  [不支持该字段，请勿使用。](tag:hws_eu,g42,hk_g42,hcso,fcs,fcs_vm,mix,hcso_g42,hcso_g42_b)
     * @return autoscaling
     */
    public List<String> getAutoscaling() {
        return autoscaling;
    }

    public void setAutoscaling(List<String> autoscaling) {
        this.autoscaling = autoscaling;
    }

    public ListLoadBalancersRequest withProtectionStatus(List<String> protectionStatus) {
        this.protectionStatus = protectionStatus;
        return this;
    }

    public ListLoadBalancersRequest addProtectionStatusItem(String protectionStatusItem) {
        if (this.protectionStatus == null) {
            this.protectionStatus = new ArrayList<>();
        }
        this.protectionStatus.add(protectionStatusItem);
        return this;
    }

    public ListLoadBalancersRequest withProtectionStatus(Consumer<List<String>> protectionStatusSetter) {
        if (this.protectionStatus == null) {
            this.protectionStatus = new ArrayList<>();
        }
        protectionStatusSetter.accept(this.protectionStatus);
        return this;
    }

    /**
     * 修改保护状态, 取值： - nonProtection: 不保护，默认值为nonProtection - consoleProtection: 控制台修改保护
     * @return protectionStatus
     */
    public List<String> getProtectionStatus() {
        return protectionStatus;
    }

    public void setProtectionStatus(List<String> protectionStatus) {
        this.protectionStatus = protectionStatus;
    }

    public ListLoadBalancersRequest withGlobalEips(List<String> globalEips) {
        this.globalEips = globalEips;
        return this;
    }

    public ListLoadBalancersRequest addGlobalEipsItem(String globalEipsItem) {
        if (this.globalEips == null) {
            this.globalEips = new ArrayList<>();
        }
        this.globalEips.add(globalEipsItem);
        return this;
    }

    public ListLoadBalancersRequest withGlobalEips(Consumer<List<String>> globalEipsSetter) {
        if (this.globalEips == null) {
            this.globalEips = new ArrayList<>();
        }
        globalEipsSetter.accept(this.globalEips);
        return this;
    }

    /**
     * 负载均衡器绑定的公网IP。示例如下：  {     \"global_eips\": [         {             \"global_eip_id\": \"24000000-0000-0000-0000-100000000001\",             \"global_eip_address\": \"10.10.10.10\",             \"ip_version\": 4         }     ] }   支持多值查询，查询条件格式：  - global_eip_id作为查询条件：*global_eips=global_eip_id=xxx&global_eips=global_eip_id=xxx*。  - global_eip_address作为查询条件：*global_eips=global_eip_address=xxx&global_eips=global_eip_address=xxx*。  - ip_version作为查询条件：*global_eips=ip_version=xxx&global_eips=ip_version=xxx*。
     * @return globalEips
     */
    public List<String> getGlobalEips() {
        return globalEips;
    }

    public void setGlobalEips(List<String> globalEips) {
        this.globalEips = globalEips;
    }

    public ListLoadBalancersRequest withLogTopicId(String logTopicId) {
        this.logTopicId = logTopicId;
        return this;
    }

    /**
     * LB实例绑定的logtank的topic id信息，支持多值查询，查询条件格式：*log_topic_id=xxx&log_topic_id=xxx*。
     * @return logTopicId
     */
    public String getLogTopicId() {
        return logTopicId;
    }

    public void setLogTopicId(String logTopicId) {
        this.logTopicId = logTopicId;
    }

    public ListLoadBalancersRequest withLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
        return this;
    }

    /**
     * LB实例绑定的logtank的group id信息，支持多值查询，查询条件格式：*log_group_id=xxx&log_group_id=xxx*。
     * @return logGroupId
     */
    public String getLogGroupId() {
        return logGroupId;
    }

    public void setLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListLoadBalancersRequest that = (ListLoadBalancersRequest) obj;
        return Objects.equals(this.marker, that.marker) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.pageReverse, that.pageReverse) && Objects.equals(this.id, that.id)
            && Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.adminStateUp, that.adminStateUp)
            && Objects.equals(this.provisioningStatus, that.provisioningStatus)
            && Objects.equals(this.operatingStatus, that.operatingStatus)
            && Objects.equals(this.guaranteed, that.guaranteed) && Objects.equals(this.vpcId, that.vpcId)
            && Objects.equals(this.vipPortId, that.vipPortId) && Objects.equals(this.vipAddress, that.vipAddress)
            && Objects.equals(this.vipSubnetCidrId, that.vipSubnetCidrId)
            && Objects.equals(this.ipv6VipPortId, that.ipv6VipPortId)
            && Objects.equals(this.ipv6VipAddress, that.ipv6VipAddress)
            && Objects.equals(this.ipv6VipVirsubnetId, that.ipv6VipVirsubnetId) && Objects.equals(this.eips, that.eips)
            && Objects.equals(this.publicips, that.publicips)
            && Objects.equals(this.availabilityZoneList, that.availabilityZoneList)
            && Objects.equals(this.l4FlavorId, that.l4FlavorId)
            && Objects.equals(this.l4ScaleFlavorId, that.l4ScaleFlavorId)
            && Objects.equals(this.l7FlavorId, that.l7FlavorId)
            && Objects.equals(this.l7ScaleFlavorId, that.l7ScaleFlavorId)
            && Objects.equals(this.billingInfo, that.billingInfo)
            && Objects.equals(this.memberDeviceId, that.memberDeviceId)
            && Objects.equals(this.memberAddress, that.memberAddress)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.ipVersion, that.ipVersion)
            && Objects.equals(this.deletionProtectionEnable, that.deletionProtectionEnable)
            && Objects.equals(this.elbVirsubnetType, that.elbVirsubnetType)
            && Objects.equals(this.autoscaling, that.autoscaling)
            && Objects.equals(this.protectionStatus, that.protectionStatus)
            && Objects.equals(this.globalEips, that.globalEips) && Objects.equals(this.logTopicId, that.logTopicId)
            && Objects.equals(this.logGroupId, that.logGroupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marker,
            limit,
            pageReverse,
            id,
            name,
            description,
            adminStateUp,
            provisioningStatus,
            operatingStatus,
            guaranteed,
            vpcId,
            vipPortId,
            vipAddress,
            vipSubnetCidrId,
            ipv6VipPortId,
            ipv6VipAddress,
            ipv6VipVirsubnetId,
            eips,
            publicips,
            availabilityZoneList,
            l4FlavorId,
            l4ScaleFlavorId,
            l7FlavorId,
            l7ScaleFlavorId,
            billingInfo,
            memberDeviceId,
            memberAddress,
            enterpriseProjectId,
            ipVersion,
            deletionProtectionEnable,
            elbVirsubnetType,
            autoscaling,
            protectionStatus,
            globalEips,
            logTopicId,
            logGroupId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListLoadBalancersRequest {\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    pageReverse: ").append(toIndentedString(pageReverse)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    provisioningStatus: ").append(toIndentedString(provisioningStatus)).append("\n");
        sb.append("    operatingStatus: ").append(toIndentedString(operatingStatus)).append("\n");
        sb.append("    guaranteed: ").append(toIndentedString(guaranteed)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    vipPortId: ").append(toIndentedString(vipPortId)).append("\n");
        sb.append("    vipAddress: ").append(toIndentedString(vipAddress)).append("\n");
        sb.append("    vipSubnetCidrId: ").append(toIndentedString(vipSubnetCidrId)).append("\n");
        sb.append("    ipv6VipPortId: ").append(toIndentedString(ipv6VipPortId)).append("\n");
        sb.append("    ipv6VipAddress: ").append(toIndentedString(ipv6VipAddress)).append("\n");
        sb.append("    ipv6VipVirsubnetId: ").append(toIndentedString(ipv6VipVirsubnetId)).append("\n");
        sb.append("    eips: ").append(toIndentedString(eips)).append("\n");
        sb.append("    publicips: ").append(toIndentedString(publicips)).append("\n");
        sb.append("    availabilityZoneList: ").append(toIndentedString(availabilityZoneList)).append("\n");
        sb.append("    l4FlavorId: ").append(toIndentedString(l4FlavorId)).append("\n");
        sb.append("    l4ScaleFlavorId: ").append(toIndentedString(l4ScaleFlavorId)).append("\n");
        sb.append("    l7FlavorId: ").append(toIndentedString(l7FlavorId)).append("\n");
        sb.append("    l7ScaleFlavorId: ").append(toIndentedString(l7ScaleFlavorId)).append("\n");
        sb.append("    billingInfo: ").append(toIndentedString(billingInfo)).append("\n");
        sb.append("    memberDeviceId: ").append(toIndentedString(memberDeviceId)).append("\n");
        sb.append("    memberAddress: ").append(toIndentedString(memberAddress)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    ipVersion: ").append(toIndentedString(ipVersion)).append("\n");
        sb.append("    deletionProtectionEnable: ").append(toIndentedString(deletionProtectionEnable)).append("\n");
        sb.append("    elbVirsubnetType: ").append(toIndentedString(elbVirsubnetType)).append("\n");
        sb.append("    autoscaling: ").append(toIndentedString(autoscaling)).append("\n");
        sb.append("    protectionStatus: ").append(toIndentedString(protectionStatus)).append("\n");
        sb.append("    globalEips: ").append(toIndentedString(globalEips)).append("\n");
        sb.append("    logTopicId: ").append(toIndentedString(logTopicId)).append("\n");
        sb.append("    logGroupId: ").append(toIndentedString(logGroupId)).append("\n");
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
