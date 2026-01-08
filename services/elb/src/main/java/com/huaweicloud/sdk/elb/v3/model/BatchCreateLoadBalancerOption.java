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

/**
 * 创建负载均衡器参数。
 */
public class BatchCreateLoadBalancerOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ids")

    private List<String> ids = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number")

    private Integer number;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vip_address")

    private String vipAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vip_subnet_cidr_id")

    private String vipSubnetCidrId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_vip_virsubnet_id")

    private String ipv6VipVirsubnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider")

    private String provider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l4_flavor_id")

    private String l4FlavorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l7_flavor_id")

    private String l7FlavorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "guaranteed")

    private Boolean guaranteed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone_list")

    private List<String> availabilityZoneList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state_up")

    private Boolean adminStateUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "billing_info")

    private String billingInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_bandwidth")

    private BandwidthRef ipv6Bandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth")

    private BandwidthRef bandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip_ids")

    private List<String> publicipIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip")

    private CreateLoadBalancerPublicIpOption publicip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elb_virsubnet_ids")

    private List<String> elbVirsubnetIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_target_enable")

    private Boolean ipTargetEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deletion_protection_enable")

    private Boolean deletionProtectionEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prepaid_options")

    private PrepaidCreateOption prepaidOptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "autoscaling")

    private CreateLoadbalancerAutoscalingOption autoscaling;

    /**
     * **参数解释**：WAF故障时的流量处理策略。  **约束限制**：只有绑定了waf的LB实例，该字段才会生效。  **取值范围**： - discard:丢弃 - forward: 转发到后端  **默认取值**：forward  [不支持该字段，请勿使用。](tag:hws_eu,hws_test,hcs,hcs_sm,hcso,srg,fcs,fcs_vm,mix,hcso_g42,hcso_g42_b,hcso_dt,dt,ocb,ctc,cmcc,tm,ct,sbc,g42,hws_ocb,hk_sbc,hk_tm,hk_g42)
     */
    public static final class WafFailureActionEnum {

        /**
         * Enum DISCARD for value: "discard"
         */
        public static final WafFailureActionEnum DISCARD = new WafFailureActionEnum("discard");

        /**
         * Enum FORWARD for value: "forward"
         */
        public static final WafFailureActionEnum FORWARD = new WafFailureActionEnum("forward");

        private static final Map<String, WafFailureActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, WafFailureActionEnum> createStaticFields() {
            Map<String, WafFailureActionEnum> map = new HashMap<>();
            map.put("discard", DISCARD);
            map.put("forward", FORWARD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        WafFailureActionEnum(String value) {
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
        public static WafFailureActionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new WafFailureActionEnum(value));
        }

        public static WafFailureActionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof WafFailureActionEnum) {
                return this.value.equals(((WafFailureActionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "waf_failure_action")

    private WafFailureActionEnum wafFailureAction;

    /**
     * **参数解释**：修改保护状态。  **约束限制**：不涉及  **取值范围**： - nonProtection: 不保护。 - consoleProtection: 控制台修改保护。  **默认取值**：nonProtection
     */
    public static final class ProtectionStatusEnum {

        /**
         * Enum NONPROTECTION for value: "nonProtection"
         */
        public static final ProtectionStatusEnum NONPROTECTION = new ProtectionStatusEnum("nonProtection");

        /**
         * Enum CONSOLEPROTECTION for value: "consoleProtection"
         */
        public static final ProtectionStatusEnum CONSOLEPROTECTION = new ProtectionStatusEnum("consoleProtection");

        private static final Map<String, ProtectionStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProtectionStatusEnum> createStaticFields() {
            Map<String, ProtectionStatusEnum> map = new HashMap<>();
            map.put("nonProtection", NONPROTECTION);
            map.put("consoleProtection", CONSOLEPROTECTION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProtectionStatusEnum(String value) {
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
        public static ProtectionStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ProtectionStatusEnum(value));
        }

        public static ProtectionStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProtectionStatusEnum) {
                return this.value.equals(((ProtectionStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protection_status")

    private ProtectionStatusEnum protectionStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protection_reason")

    private String protectionReason;

    /**
     * **参数解释**：创建实例采用的计费模式。  **约束限制**：批量创建共享型实例时，该字段不允许指定。  **取值范围**： - flavor：按实例规格收费。 - lcu：按使用量收费。  **默认取值**：flavor
     */
    public static final class ChargeModeEnum {

        /**
         * Enum FLAVOR for value: "flavor"
         */
        public static final ChargeModeEnum FLAVOR = new ChargeModeEnum("flavor");

        /**
         * Enum LCU for value: "lcu"
         */
        public static final ChargeModeEnum LCU = new ChargeModeEnum("lcu");

        private static final Map<String, ChargeModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ChargeModeEnum> createStaticFields() {
            Map<String, ChargeModeEnum> map = new HashMap<>();
            map.put("flavor", FLAVOR);
            map.put("lcu", LCU);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ChargeModeEnum(String value) {
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
        public static ChargeModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ChargeModeEnum(value));
        }

        public static ChargeModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ChargeModeEnum) {
                return this.value.equals(((ChargeModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_mode")

    private ChargeModeEnum chargeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_vip_address")

    private String ipv6VipAddress;

    public BatchCreateLoadBalancerOption withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**：负载均衡器ID（UUID）。  **约束限制**：不涉及  **取值范围**：不涉及  **默认取值**：不涉及  不支持该字段，请勿使用。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BatchCreateLoadBalancerOption withIds(List<String> ids) {
        this.ids = ids;
        return this;
    }

    public BatchCreateLoadBalancerOption addIdsItem(String idsItem) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        this.ids.add(idsItem);
        return this;
    }

    public BatchCreateLoadBalancerOption withIds(Consumer<List<String>> idsSetter) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        idsSetter.accept(this.ids);
        return this;
    }

    /**
     * **参数解释**：批创负载均衡器ID的列表（UUID）。  **约束限制**：不涉及  **取值范围**：不涉及  **默认取值**：不涉及  不支持该字段，请勿使用。
     * @return ids
     */
    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    public BatchCreateLoadBalancerOption withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释**：项目ID。获取方式请参见[获取项目ID](elb_fl_0008.xml)。  **约束限制**：不涉及  **取值范围**：长度为32个字符，由小写字母和数字组成。  **默认取值**：不涉及
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public BatchCreateLoadBalancerOption withNumber(Integer number) {
        this.number = number;
        return this;
    }

    /**
     * **参数解释**：批量创建负载均衡器的数量。  **约束限制**：不涉及  **取值范围**：1-10  **默认取值**：1
     * minimum: 1
     * maximum: 10
     * @return number
     */
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public BatchCreateLoadBalancerOption withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：负载均衡器的名称。 - 当批创负载均衡器数量为1时，负载均衡器的名字即为该传入的值。 - 当批创负载均衡器数量大于1时，负载均衡器的名字在传入的name后加上4位后缀。例如：批量创建3个负载均衡器，传入name为\"elb-test\"，则三个负载均衡器名字分别为：\"elb-test-0001\"，\"elb-test-0002\"，\"elb-test-0003\"  **约束限制**：不涉及  **取值范围**：不涉及  **默认取值**：不涉及
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BatchCreateLoadBalancerOption withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**：负载均衡器的描述。  **约束限制**：不涉及  **取值范围**：不涉及  **默认取值**：不涉及
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BatchCreateLoadBalancerOption withVipAddress(String vipAddress) {
        this.vipAddress = vipAddress;
        return this;
    }

    /**
     * **参数解释**：负载均衡器的IPv4私网IP。该地址必须包含在所在子网的IPv4网段内，且未被占用。  **约束限制**： - 传入vip_address时必须传入vip_subnet_cidr_id。 - 不传入vip_address，但传入vip_subnet_cidr_id，则自动分配IPv4私网IP。 - 不传入vip_address，且不传vip_subnet_cidr_id，则不分配私网IP，vip_address=null。 - 当批量创建的number数量大于1时不支持传入该字段，返回400。  **取值范围**：不涉及  **默认取值**：不涉及
     * @return vipAddress
     */
    public String getVipAddress() {
        return vipAddress;
    }

    public void setVipAddress(String vipAddress) {
        this.vipAddress = vipAddress;
    }

    public BatchCreateLoadBalancerOption withVipSubnetCidrId(String vipSubnetCidrId) {
        this.vipSubnetCidrId = vipSubnetCidrId;
        return this;
    }

    /**
     * **参数解释**：负载均衡器所在子网的IPv4子网ID。若需要创建带IPv4私网IP的LB，该字段必须传入。 可以通过GET https://{VPC_Endpoint}/v1/{project_id}/subnets 响应参数中的neutron_subnet_id得到。  **约束限制**： - vpc_id, vip_subnet_cidr_id, ipv6_vip_virsubnet_id不能同时为空，且需要在同一个vpc下。 - 若同时传入vpc_id和vip_subnet_cidr_id，则vip_subnet_cidr_id对应的子网必须属于vpc_id对应的VPC。  **取值范围**：不涉及  **默认取值**：不涉及
     * @return vipSubnetCidrId
     */
    public String getVipSubnetCidrId() {
        return vipSubnetCidrId;
    }

    public void setVipSubnetCidrId(String vipSubnetCidrId) {
        this.vipSubnetCidrId = vipSubnetCidrId;
    }

    public BatchCreateLoadBalancerOption withIpv6VipVirsubnetId(String ipv6VipVirsubnetId) {
        this.ipv6VipVirsubnetId = ipv6VipVirsubnetId;
        return this;
    }

    /**
     * **参数解释**：双栈类型负载均衡器所在子网的IPv6网络ID。 可以通过GET https://{VPC_Endpoint}/v1/{project_id}/subnets 响应参数中的neutron_network_id得到。  **约束限制**： - vpc_id，vip_subnet_cidr_id，ipv6_vip_virsubnet_id不能同时为空，且需要在同一个vpc下。 - 需要对应的子网开启IPv6。 - 批量创建共享型实例时，该字段不允许指定。  **取值范围**：不涉及  **默认取值**：不涉及  [不支持IPv6，请勿使用。](tag:dt)
     * @return ipv6VipVirsubnetId
     */
    public String getIpv6VipVirsubnetId() {
        return ipv6VipVirsubnetId;
    }

    public void setIpv6VipVirsubnetId(String ipv6VipVirsubnetId) {
        this.ipv6VipVirsubnetId = ipv6VipVirsubnetId;
    }

    public BatchCreateLoadBalancerOption withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * **参数解释**：负载均衡器的生产者名称。固定为vlb。  **约束限制**：批量创建共享型实例时，该字段不允许指定。  **取值范围**：不涉及  **默认取值**：不涉及
     * @return provider
     */
    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public BatchCreateLoadBalancerOption withL4FlavorId(String l4FlavorId) {
        this.l4FlavorId = l4FlavorId;
        return this;
    }

    /**
     * **参数解释**：网络型规格ID。 可以通过GET https://{ELB_Endpoint}/v3/{project_id}/elb/flavors?type=L4 响应参数中的id得到。  **约束限制**： - 当l4_flavor_id和l7_flavor_id都不传的时，会使用默认flavor （默认flavor根据不同局点有所不同，具体以实际值为准）。 - 当传入的规格类型为L4，表示该实例为固定规格实例，按规格计费。 - 当传入的规格类型为L4_elastic_max，表示该实例为弹性实例，按LCU计费。 - 批量创建共享型实例时，该字段不允许指定。 - 网关型LB不支持指定l4_flavor_id。  **取值范围**：不涉及  **默认取值**：不涉及  [只支持设置为l4_flavor.elb.shared。](tag:hcso_dt) [所有LB实例共享带宽，该字段无效，请勿使用。](tag:hcso,srg,fcs,fcs_vm,mix,hcso_g42,hcso_g42_b)
     * @return l4FlavorId
     */
    public String getL4FlavorId() {
        return l4FlavorId;
    }

    public void setL4FlavorId(String l4FlavorId) {
        this.l4FlavorId = l4FlavorId;
    }

    public BatchCreateLoadBalancerOption withL7FlavorId(String l7FlavorId) {
        this.l7FlavorId = l7FlavorId;
        return this;
    }

    /**
     * **参数解释**：应用型规格ID。 可以通过GET https://{ELB_Endpoint}/v3/{project_id}/elb/flavors?type=L7 响应参数中的id得到。  **约束限制**： - 当l4_flavor_id和l7_flavor_id都不传的时，会使用默认flavor （默认flavor根据不同局点有所不同，具体以实际值为准）。 - 当传入的规格类型为L7，表示该实例为固定规格实例，按规格计费。 - 当传入的规格类型为L7_elastic_max，表示该实例为弹性实例，按LCU计费。 - 批量创建共享型实例时，该字段不允许指定。 - 网关型LB不支持指定l7_flavor_id。  **取值范围**：不涉及  **默认取值**：不涉及  [只支持设置为l7_flavor.elb.shared。](tag:hcso_dt) [所有LB实例共享带宽，该字段无效，请勿使用。](tag:hcso,srg,fcs,fcs_vm,mix,hcso_g42,hcso_g42_b)
     * @return l7FlavorId
     */
    public String getL7FlavorId() {
        return l7FlavorId;
    }

    public void setL7FlavorId(String l7FlavorId) {
        this.l7FlavorId = l7FlavorId;
    }

    public BatchCreateLoadBalancerOption withGuaranteed(Boolean guaranteed) {
        this.guaranteed = guaranteed;
        return this;
    }

    /**
     * **参数解释**：批量创建的是否是独享型负载均衡器。  **约束限制**：不涉及  **取值范围**： - true：独享型。 - false：共享型。  **默认取值**：true
     * @return guaranteed
     */
    public Boolean getGuaranteed() {
        return guaranteed;
    }

    public void setGuaranteed(Boolean guaranteed) {
        this.guaranteed = guaranteed;
    }

    public BatchCreateLoadBalancerOption withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * **参数解释**：负载均衡器所在的VPC ID。 可以通过GET https://{VPC_Endpoint}/v1/{project_id}/vpcs 响应参数中的id得到。  **约束限制**： - vpc_id，vip_subnet_cidr_id，ipv6_vip_virsubnet_id不能同时为空，且需要在同一个vpc下。 - 批量创建共享型实例时，该字段不允许指定。  **取值范围**：不涉及  **默认取值**：不涉及
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public BatchCreateLoadBalancerOption withAvailabilityZoneList(List<String> availabilityZoneList) {
        this.availabilityZoneList = availabilityZoneList;
        return this;
    }

    public BatchCreateLoadBalancerOption addAvailabilityZoneListItem(String availabilityZoneListItem) {
        if (this.availabilityZoneList == null) {
            this.availabilityZoneList = new ArrayList<>();
        }
        this.availabilityZoneList.add(availabilityZoneListItem);
        return this;
    }

    public BatchCreateLoadBalancerOption withAvailabilityZoneList(Consumer<List<String>> availabilityZoneListSetter) {
        if (this.availabilityZoneList == null) {
            this.availabilityZoneList = new ArrayList<>();
        }
        availabilityZoneListSetter.accept(this.availabilityZoneList);
        return this;
    }

    /**
     * **参数解释**：可用区列表。 可通过GET https://{ELB_Endpoint}/v3/{project_id}/elb/availability-zones 接口来查询可用区集合列表。创建负载均衡器时，从查询结果选择某一个可用区集合，并从中选择一个或多个可用区。  **约束限制**： - 批量创建共享型实例时，该字段不允许指定。  **取值范围**：不涉及  **默认取值**：不涉及
     * @return availabilityZoneList
     */
    public List<String> getAvailabilityZoneList() {
        return availabilityZoneList;
    }

    public void setAvailabilityZoneList(List<String> availabilityZoneList) {
        this.availabilityZoneList = availabilityZoneList;
    }

    public BatchCreateLoadBalancerOption withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释**：资源所属的企业项目ID。创建时不传则资源属于default企业项目，返回enterprise_project_id=\"0\"。  **约束限制**：不能传入空字符串\"\"、\"0\"或不存在的企业项目ID。  **取值范围**：不涉及  **默认取值**：\"0\"  [不支持该字段，请勿使用。](tag:dt,hcso_dt)
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public BatchCreateLoadBalancerOption withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public BatchCreateLoadBalancerOption addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public BatchCreateLoadBalancerOption withTags(Consumer<List<Tag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释**：负载均衡的标签列表。示例：\"tags\":[{\"key\":\"my_tag\",\"value\":\"my_tag_value\"}]  **约束限制**：不涉及
     * @return tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public BatchCreateLoadBalancerOption withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    /**
     * **参数解释**：负载均衡器的启用状态。  **约束限制**：不涉及  **取值范围**： - true ：启用。 - false：停用。  **默认取值**：true。  [不支持该字段，请勿使用。](tag:dt)
     * @return adminStateUp
     */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public BatchCreateLoadBalancerOption withBillingInfo(String billingInfo) {
        this.billingInfo = billingInfo;
        return this;
    }

    /**
     * **参数解释**：资源账单信息。  **约束限制**：不涉及  **取值范围**： - 空：按需计费。 [- 非空：包周期计费，格式为：order_id:product_id:region_id:project_id。如：CS2107161019CDJZZ:OFFI569702121789763584:az1:057ef081eb00d2732fd1c01a9be75e6f](tag:hws)  **默认取值**：不涉及  [不支持该字段，请勿使用。](tag:hws_hk,hws_eu,hws_eu_wb,hws_test,srg,fcs,fcs_vm,dt,ctc,cmcc,tm,sbc,hk_sbc,hk_tm,hk_vdf)
     * @return billingInfo
     */
    public String getBillingInfo() {
        return billingInfo;
    }

    public void setBillingInfo(String billingInfo) {
        this.billingInfo = billingInfo;
    }

    public BatchCreateLoadBalancerOption withIpv6Bandwidth(BandwidthRef ipv6Bandwidth) {
        this.ipv6Bandwidth = ipv6Bandwidth;
        return this;
    }

    public BatchCreateLoadBalancerOption withIpv6Bandwidth(Consumer<BandwidthRef> ipv6BandwidthSetter) {
        if (this.ipv6Bandwidth == null) {
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

    public BatchCreateLoadBalancerOption withBandwidth(BandwidthRef bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    public BatchCreateLoadBalancerOption withBandwidth(Consumer<BandwidthRef> bandwidthSetter) {
        if (this.bandwidth == null) {
            this.bandwidth = new BandwidthRef();
            bandwidthSetter.accept(this.bandwidth);
        }

        return this;
    }

    /**
     * Get bandwidth
     * @return bandwidth
     */
    public BandwidthRef getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(BandwidthRef bandwidth) {
        this.bandwidth = bandwidth;
    }

    public BatchCreateLoadBalancerOption withPublicipIds(List<String> publicipIds) {
        this.publicipIds = publicipIds;
        return this;
    }

    public BatchCreateLoadBalancerOption addPublicipIdsItem(String publicipIdsItem) {
        if (this.publicipIds == null) {
            this.publicipIds = new ArrayList<>();
        }
        this.publicipIds.add(publicipIdsItem);
        return this;
    }

    public BatchCreateLoadBalancerOption withPublicipIds(Consumer<List<String>> publicipIdsSetter) {
        if (this.publicipIds == null) {
            this.publicipIds = new ArrayList<>();
        }
        publicipIdsSetter.accept(this.publicipIds);
        return this;
    }

    /**
     * **参数解释**：负载均衡器绑定的公网IP ID。只支持绑定数组中的第一个EIP，其他将被忽略。 当批量创建的number数量大于1时不支持传入该字段，返回400。  **约束限制**：不涉及  **取值范围**：不涉及  **默认取值**：不涉及
     * @return publicipIds
     */
    public List<String> getPublicipIds() {
        return publicipIds;
    }

    public void setPublicipIds(List<String> publicipIds) {
        this.publicipIds = publicipIds;
    }

    public BatchCreateLoadBalancerOption withPublicip(CreateLoadBalancerPublicIpOption publicip) {
        this.publicip = publicip;
        return this;
    }

    public BatchCreateLoadBalancerOption withPublicip(Consumer<CreateLoadBalancerPublicIpOption> publicipSetter) {
        if (this.publicip == null) {
            this.publicip = new CreateLoadBalancerPublicIpOption();
            publicipSetter.accept(this.publicip);
        }

        return this;
    }

    /**
     * Get publicip
     * @return publicip
     */
    public CreateLoadBalancerPublicIpOption getPublicip() {
        return publicip;
    }

    public void setPublicip(CreateLoadBalancerPublicIpOption publicip) {
        this.publicip = publicip;
    }

    public BatchCreateLoadBalancerOption withElbVirsubnetIds(List<String> elbVirsubnetIds) {
        this.elbVirsubnetIds = elbVirsubnetIds;
        return this;
    }

    public BatchCreateLoadBalancerOption addElbVirsubnetIdsItem(String elbVirsubnetIdsItem) {
        if (this.elbVirsubnetIds == null) {
            this.elbVirsubnetIds = new ArrayList<>();
        }
        this.elbVirsubnetIds.add(elbVirsubnetIdsItem);
        return this;
    }

    public BatchCreateLoadBalancerOption withElbVirsubnetIds(Consumer<List<String>> elbVirsubnetIdsSetter) {
        if (this.elbVirsubnetIds == null) {
            this.elbVirsubnetIds = new ArrayList<>();
        }
        elbVirsubnetIdsSetter.accept(this.elbVirsubnetIds);
        return this;
    }

    /**
     * **参数解释**：下联面子网的网络ID列表。 可以通过GET https://{VPC_Endpoint}/v1/{project_id}/subnets 响应参数中的neutron_network_id得到。 若不指定该字段，则按如下规则选择下联面网络： 1. 如果ELB实例开启ipv6，则选择ipv6_vip_virsubnet_id子网对应的网络ID。 2. 如果ELB实例没有开启ipv6，开启ipv4，则选择vip_subnet_cidr_id子网对应的网络ID。 3. 如果ELB实例没有选择私网，只开启公网，则会在当前负载均衡器所在的VPC中任意选一个子网，优选可用IP多的网络。 4. 批量创建共享型实例的场景，该字段不允许指定。 若指定多个下联面子网，则按顺序优先使用第一个子网来为负载均衡器下联面端口分配ip地址。  **约束限制**：下联面子网必须属于该LB所在的VPC。  **取值范围**：不涉及  **默认取值**：不涉及
     * @return elbVirsubnetIds
     */
    public List<String> getElbVirsubnetIds() {
        return elbVirsubnetIds;
    }

    public void setElbVirsubnetIds(List<String> elbVirsubnetIds) {
        this.elbVirsubnetIds = elbVirsubnetIds;
    }

    public BatchCreateLoadBalancerOption withIpTargetEnable(Boolean ipTargetEnable) {
        this.ipTargetEnable = ipTargetEnable;
        return this;
    }

    /**
     * **参数解释**：是否启用IP类型后端转发。 开启IP类型后端转发后，后端服务器组不仅支持添加云上VPC内的服务器，还支持添加其他VPC、其他公有云、云下数据中心的服务器。  **约束限制**： - 开启后不能关闭。 - 使用共享VPC的实例使用此特性时，需确保共享资源所有者已开通VPC对等连接，否则通信异常。 [- 仅独享型负载均衡器支持该特性。](tag:hws,hws_hk,ocb,ctc,hcs,g42,tm,cmcc,hk_g42,hws_ocb,hk_vdf,srg,fcs,dt) - 网关型LB不支持该特性。  **取值范围**： - true：开启。 - false：不开启。  **默认取值**：false  [荷兰region不支持该字段，请勿使用。](tag:dt)
     * @return ipTargetEnable
     */
    public Boolean getIpTargetEnable() {
        return ipTargetEnable;
    }

    public void setIpTargetEnable(Boolean ipTargetEnable) {
        this.ipTargetEnable = ipTargetEnable;
    }

    public BatchCreateLoadBalancerOption withDeletionProtectionEnable(Boolean deletionProtectionEnable) {
        this.deletionProtectionEnable = deletionProtectionEnable;
        return this;
    }

    /**
     * **参数解释**：是否开启删除保护。  **约束限制**：批量创建共享型实例的场景，该字段不允许指定。  **取值范围**：false 不开启，true 开启。  **默认取值**：false  [不支持该字段，请勿使用。](tag:hws_eu,g42,hk_g42) [荷兰region不支持该字段，请勿使用。](tag:dt)  > 退场时需要先关闭所有资源的删除保护开关。
     * @return deletionProtectionEnable
     */
    public Boolean getDeletionProtectionEnable() {
        return deletionProtectionEnable;
    }

    public void setDeletionProtectionEnable(Boolean deletionProtectionEnable) {
        this.deletionProtectionEnable = deletionProtectionEnable;
    }

    public BatchCreateLoadBalancerOption withPrepaidOptions(PrepaidCreateOption prepaidOptions) {
        this.prepaidOptions = prepaidOptions;
        return this;
    }

    public BatchCreateLoadBalancerOption withPrepaidOptions(Consumer<PrepaidCreateOption> prepaidOptionsSetter) {
        if (this.prepaidOptions == null) {
            this.prepaidOptions = new PrepaidCreateOption();
            prepaidOptionsSetter.accept(this.prepaidOptions);
        }

        return this;
    }

    /**
     * Get prepaidOptions
     * @return prepaidOptions
     */
    public PrepaidCreateOption getPrepaidOptions() {
        return prepaidOptions;
    }

    public void setPrepaidOptions(PrepaidCreateOption prepaidOptions) {
        this.prepaidOptions = prepaidOptions;
    }

    public BatchCreateLoadBalancerOption withAutoscaling(CreateLoadbalancerAutoscalingOption autoscaling) {
        this.autoscaling = autoscaling;
        return this;
    }

    public BatchCreateLoadBalancerOption withAutoscaling(
        Consumer<CreateLoadbalancerAutoscalingOption> autoscalingSetter) {
        if (this.autoscaling == null) {
            this.autoscaling = new CreateLoadbalancerAutoscalingOption();
            autoscalingSetter.accept(this.autoscaling);
        }

        return this;
    }

    /**
     * Get autoscaling
     * @return autoscaling
     */
    public CreateLoadbalancerAutoscalingOption getAutoscaling() {
        return autoscaling;
    }

    public void setAutoscaling(CreateLoadbalancerAutoscalingOption autoscaling) {
        this.autoscaling = autoscaling;
    }

    public BatchCreateLoadBalancerOption withWafFailureAction(WafFailureActionEnum wafFailureAction) {
        this.wafFailureAction = wafFailureAction;
        return this;
    }

    /**
     * **参数解释**：WAF故障时的流量处理策略。  **约束限制**：只有绑定了waf的LB实例，该字段才会生效。  **取值范围**： - discard:丢弃 - forward: 转发到后端  **默认取值**：forward  [不支持该字段，请勿使用。](tag:hws_eu,hws_test,hcs,hcs_sm,hcso,srg,fcs,fcs_vm,mix,hcso_g42,hcso_g42_b,hcso_dt,dt,ocb,ctc,cmcc,tm,ct,sbc,g42,hws_ocb,hk_sbc,hk_tm,hk_g42)
     * @return wafFailureAction
     */
    public WafFailureActionEnum getWafFailureAction() {
        return wafFailureAction;
    }

    public void setWafFailureAction(WafFailureActionEnum wafFailureAction) {
        this.wafFailureAction = wafFailureAction;
    }

    public BatchCreateLoadBalancerOption withProtectionStatus(ProtectionStatusEnum protectionStatus) {
        this.protectionStatus = protectionStatus;
        return this;
    }

    /**
     * **参数解释**：修改保护状态。  **约束限制**：不涉及  **取值范围**： - nonProtection: 不保护。 - consoleProtection: 控制台修改保护。  **默认取值**：nonProtection
     * @return protectionStatus
     */
    public ProtectionStatusEnum getProtectionStatus() {
        return protectionStatus;
    }

    public void setProtectionStatus(ProtectionStatusEnum protectionStatus) {
        this.protectionStatus = protectionStatus;
    }

    public BatchCreateLoadBalancerOption withProtectionReason(String protectionReason) {
        this.protectionReason = protectionReason;
        return this;
    }

    /**
     * **参数解释**：设置保护的原因。作为protection_status的转态设置的原因。  **约束限制**：仅当protection_status为consoleProtection时有效。  **取值范围**：除<和>外通用Unicode字符集字符，最大255个字符。  **默认取值**：不涉及
     * @return protectionReason
     */
    public String getProtectionReason() {
        return protectionReason;
    }

    public void setProtectionReason(String protectionReason) {
        this.protectionReason = protectionReason;
    }

    public BatchCreateLoadBalancerOption withChargeMode(ChargeModeEnum chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    /**
     * **参数解释**：创建实例采用的计费模式。  **约束限制**：批量创建共享型实例时，该字段不允许指定。  **取值范围**： - flavor：按实例规格收费。 - lcu：按使用量收费。  **默认取值**：flavor
     * @return chargeMode
     */
    public ChargeModeEnum getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(ChargeModeEnum chargeMode) {
        this.chargeMode = chargeMode;
    }

    public BatchCreateLoadBalancerOption withIpv6VipAddress(String ipv6VipAddress) {
        this.ipv6VipAddress = ipv6VipAddress;
        return this;
    }

    /**
     * **参数解释**：双栈类型负载均衡器的IPv6地址。  **约束限制**： - 当批量创建的number数量大于1时不支持传入该字段，返回400。 - 批量创建共享型实例的场景，该字段不允许指定。  **取值范围**：不涉及  **默认取值**：不涉及  [不支持IPv6，请勿使用。](tag:dt)
     * @return ipv6VipAddress
     */
    public String getIpv6VipAddress() {
        return ipv6VipAddress;
    }

    public void setIpv6VipAddress(String ipv6VipAddress) {
        this.ipv6VipAddress = ipv6VipAddress;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchCreateLoadBalancerOption that = (BatchCreateLoadBalancerOption) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.ids, that.ids)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.number, that.number)
            && Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.vipAddress, that.vipAddress)
            && Objects.equals(this.vipSubnetCidrId, that.vipSubnetCidrId)
            && Objects.equals(this.ipv6VipVirsubnetId, that.ipv6VipVirsubnetId)
            && Objects.equals(this.provider, that.provider) && Objects.equals(this.l4FlavorId, that.l4FlavorId)
            && Objects.equals(this.l7FlavorId, that.l7FlavorId) && Objects.equals(this.guaranteed, that.guaranteed)
            && Objects.equals(this.vpcId, that.vpcId)
            && Objects.equals(this.availabilityZoneList, that.availabilityZoneList)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.adminStateUp, that.adminStateUp)
            && Objects.equals(this.billingInfo, that.billingInfo)
            && Objects.equals(this.ipv6Bandwidth, that.ipv6Bandwidth) && Objects.equals(this.bandwidth, that.bandwidth)
            && Objects.equals(this.publicipIds, that.publicipIds) && Objects.equals(this.publicip, that.publicip)
            && Objects.equals(this.elbVirsubnetIds, that.elbVirsubnetIds)
            && Objects.equals(this.ipTargetEnable, that.ipTargetEnable)
            && Objects.equals(this.deletionProtectionEnable, that.deletionProtectionEnable)
            && Objects.equals(this.prepaidOptions, that.prepaidOptions)
            && Objects.equals(this.autoscaling, that.autoscaling)
            && Objects.equals(this.wafFailureAction, that.wafFailureAction)
            && Objects.equals(this.protectionStatus, that.protectionStatus)
            && Objects.equals(this.protectionReason, that.protectionReason)
            && Objects.equals(this.chargeMode, that.chargeMode)
            && Objects.equals(this.ipv6VipAddress, that.ipv6VipAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            ids,
            projectId,
            number,
            name,
            description,
            vipAddress,
            vipSubnetCidrId,
            ipv6VipVirsubnetId,
            provider,
            l4FlavorId,
            l7FlavorId,
            guaranteed,
            vpcId,
            availabilityZoneList,
            enterpriseProjectId,
            tags,
            adminStateUp,
            billingInfo,
            ipv6Bandwidth,
            bandwidth,
            publicipIds,
            publicip,
            elbVirsubnetIds,
            ipTargetEnable,
            deletionProtectionEnable,
            prepaidOptions,
            autoscaling,
            wafFailureAction,
            protectionStatus,
            protectionReason,
            chargeMode,
            ipv6VipAddress);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateLoadBalancerOption {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    vipAddress: ").append(toIndentedString(vipAddress)).append("\n");
        sb.append("    vipSubnetCidrId: ").append(toIndentedString(vipSubnetCidrId)).append("\n");
        sb.append("    ipv6VipVirsubnetId: ").append(toIndentedString(ipv6VipVirsubnetId)).append("\n");
        sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
        sb.append("    l4FlavorId: ").append(toIndentedString(l4FlavorId)).append("\n");
        sb.append("    l7FlavorId: ").append(toIndentedString(l7FlavorId)).append("\n");
        sb.append("    guaranteed: ").append(toIndentedString(guaranteed)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    availabilityZoneList: ").append(toIndentedString(availabilityZoneList)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    billingInfo: ").append(toIndentedString(billingInfo)).append("\n");
        sb.append("    ipv6Bandwidth: ").append(toIndentedString(ipv6Bandwidth)).append("\n");
        sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
        sb.append("    publicipIds: ").append(toIndentedString(publicipIds)).append("\n");
        sb.append("    publicip: ").append(toIndentedString(publicip)).append("\n");
        sb.append("    elbVirsubnetIds: ").append(toIndentedString(elbVirsubnetIds)).append("\n");
        sb.append("    ipTargetEnable: ").append(toIndentedString(ipTargetEnable)).append("\n");
        sb.append("    deletionProtectionEnable: ").append(toIndentedString(deletionProtectionEnable)).append("\n");
        sb.append("    prepaidOptions: ").append(toIndentedString(prepaidOptions)).append("\n");
        sb.append("    autoscaling: ").append(toIndentedString(autoscaling)).append("\n");
        sb.append("    wafFailureAction: ").append(toIndentedString(wafFailureAction)).append("\n");
        sb.append("    protectionStatus: ").append(toIndentedString(protectionStatus)).append("\n");
        sb.append("    protectionReason: ").append(toIndentedString(protectionReason)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    ipv6VipAddress: ").append(toIndentedString(ipv6VipAddress)).append("\n");
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
