package com.huaweicloud.sdk.vpn.v5.model;

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
 * CreateVgwRequestBodyContent
 */
public class CreateVgwRequestBodyContent {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 关联模式
     */
    public static final class AttachmentTypeEnum {

        /**
         * Enum VPC for value: "vpc"
         */
        public static final AttachmentTypeEnum VPC = new AttachmentTypeEnum("vpc");

        /**
         * Enum ER for value: "er"
         */
        public static final AttachmentTypeEnum ER = new AttachmentTypeEnum("er");

        private static final Map<String, AttachmentTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AttachmentTypeEnum> createStaticFields() {
            Map<String, AttachmentTypeEnum> map = new HashMap<>();
            map.put("vpc", VPC);
            map.put("er", ER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AttachmentTypeEnum(String value) {
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
        public static AttachmentTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AttachmentTypeEnum(value));
        }

        public static AttachmentTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AttachmentTypeEnum) {
                return this.value.equals(((AttachmentTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attachment_type")

    private AttachmentTypeEnum attachmentType;

    /**
     * 网关的IP协议版本
     */
    public static final class IpVersionEnum {

        /**
         * Enum IPV4 for value: "ipv4"
         */
        public static final IpVersionEnum IPV4 = new IpVersionEnum("ipv4");

        /**
         * Enum IPV6 for value: "ipv6"
         */
        public static final IpVersionEnum IPV6 = new IpVersionEnum("ipv6");

        private static final Map<String, IpVersionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, IpVersionEnum> createStaticFields() {
            Map<String, IpVersionEnum> map = new HashMap<>();
            map.put("ipv4", IPV4);
            map.put("ipv6", IPV6);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        IpVersionEnum(String value) {
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
        public static IpVersionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new IpVersionEnum(value));
        }

        public static IpVersionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof IpVersionEnum) {
                return this.value.equals(((IpVersionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_version")

    private IpVersionEnum ipVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "er_id")

    private String erId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_subnets")

    private List<String> localSubnets = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_subnets_v6")

    private List<String> localSubnetsV6 = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connect_subnet")

    private String connectSubnet;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bgp_asn")

    private Long bgpAsn;

    /**
     * VPN网关的规格类型，当attachment_type为er时不能填写Basic
     */
    public static final class FlavorEnum {

        /**
         * Enum BASIC for value: "Basic"
         */
        public static final FlavorEnum BASIC = new FlavorEnum("Basic");

        /**
         * Enum PROFESSIONAL1 for value: "Professional1"
         */
        public static final FlavorEnum PROFESSIONAL1 = new FlavorEnum("Professional1");

        /**
         * Enum PROFESSIONAL2 for value: "Professional2"
         */
        public static final FlavorEnum PROFESSIONAL2 = new FlavorEnum("Professional2");

        /**
         * Enum PROFESSIONAL3 for value: "Professional3"
         */
        public static final FlavorEnum PROFESSIONAL3 = new FlavorEnum("Professional3");

        /**
         * Enum PROFESSIONAL1_NONFIXEDIP for value: "Professional1-NonFixedIP"
         */
        public static final FlavorEnum PROFESSIONAL1_NONFIXEDIP = new FlavorEnum("Professional1-NonFixedIP");

        /**
         * Enum PROFESSIONAL2_NONFIXEDIP for value: "Professional2-NonFixedIP"
         */
        public static final FlavorEnum PROFESSIONAL2_NONFIXEDIP = new FlavorEnum("Professional2-NonFixedIP");

        /**
         * Enum PROFESSIONAL3_NONFIXEDIP for value: "Professional3-NonFixedIP"
         */
        public static final FlavorEnum PROFESSIONAL3_NONFIXEDIP = new FlavorEnum("Professional3-NonFixedIP");

        /**
         * Enum GM for value: "GM"
         */
        public static final FlavorEnum GM = new FlavorEnum("GM");

        private static final Map<String, FlavorEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FlavorEnum> createStaticFields() {
            Map<String, FlavorEnum> map = new HashMap<>();
            map.put("Basic", BASIC);
            map.put("Professional1", PROFESSIONAL1);
            map.put("Professional2", PROFESSIONAL2);
            map.put("Professional3", PROFESSIONAL3);
            map.put("Professional1-NonFixedIP", PROFESSIONAL1_NONFIXEDIP);
            map.put("Professional2-NonFixedIP", PROFESSIONAL2_NONFIXEDIP);
            map.put("Professional3-NonFixedIP", PROFESSIONAL3_NONFIXEDIP);
            map.put("GM", GM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FlavorEnum(String value) {
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
        public static FlavorEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FlavorEnum(value));
        }

        public static FlavorEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FlavorEnum) {
                return this.value.equals(((FlavorEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private FlavorEnum flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone_ids")

    private List<String> availabilityZoneIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip1")

    private CreateRequestEip eip1;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip2")

    private CreateRequestEip eip2;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_private_ip_1")

    private String accessPrivateIp1;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_private_ip_2")

    private String accessPrivateIp2;

    /**
     * VPN网关的网络类型，默认为公网(public)
     */
    public static final class NetworkTypeEnum {

        /**
         * Enum PUBLIC for value: "public"
         */
        public static final NetworkTypeEnum PUBLIC = new NetworkTypeEnum("public");

        /**
         * Enum PRIVATE for value: "private"
         */
        public static final NetworkTypeEnum PRIVATE = new NetworkTypeEnum("private");

        private static final Map<String, NetworkTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NetworkTypeEnum> createStaticFields() {
            Map<String, NetworkTypeEnum> map = new HashMap<>();
            map.put("public", PUBLIC);
            map.put("private", PRIVATE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NetworkTypeEnum(String value) {
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
        public static NetworkTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new NetworkTypeEnum(value));
        }

        public static NetworkTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NetworkTypeEnum) {
                return this.value.equals(((NetworkTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_type")

    private NetworkTypeEnum networkType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_vpc_id")

    private String accessVpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_subnet_id")

    private String accessSubnetId;

    /**
     * ha模式
     */
    public static final class HaModeEnum {

        /**
         * Enum ACTIVE_ACTIVE for value: "active-active"
         */
        public static final HaModeEnum ACTIVE_ACTIVE = new HaModeEnum("active-active");

        /**
         * Enum ACTIVE_STANDBY for value: "active-standby"
         */
        public static final HaModeEnum ACTIVE_STANDBY = new HaModeEnum("active-standby");

        private static final Map<String, HaModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, HaModeEnum> createStaticFields() {
            Map<String, HaModeEnum> map = new HashMap<>();
            map.put("active-active", ACTIVE_ACTIVE);
            map.put("active-standby", ACTIVE_STANDBY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        HaModeEnum(String value) {
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
        public static HaModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new HaModeEnum(value));
        }

        public static HaModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof HaModeEnum) {
                return this.value.equals(((HaModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ha_mode")

    private HaModeEnum haMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<VpnResourceTag> tags = null;

    public CreateVgwRequestBodyContent withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * VPN网关名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateVgwRequestBodyContent withAttachmentType(AttachmentTypeEnum attachmentType) {
        this.attachmentType = attachmentType;
        return this;
    }

    /**
     * 关联模式
     * @return attachmentType
     */
    public AttachmentTypeEnum getAttachmentType() {
        return attachmentType;
    }

    public void setAttachmentType(AttachmentTypeEnum attachmentType) {
        this.attachmentType = attachmentType;
    }

    public CreateVgwRequestBodyContent withIpVersion(IpVersionEnum ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    /**
     * 网关的IP协议版本
     * @return ipVersion
     */
    public IpVersionEnum getIpVersion() {
        return ipVersion;
    }

    public void setIpVersion(IpVersionEnum ipVersion) {
        this.ipVersion = ipVersion;
    }

    public CreateVgwRequestBodyContent withErId(String erId) {
        this.erId = erId;
        return this;
    }

    /**
     * VPN网关所连接的ER实例的ID，当attachment_type配置为\"er\"时必填，否则不填
     * @return erId
     */
    public String getErId() {
        return erId;
    }

    public void setErId(String erId) {
        this.erId = erId;
    }

    public CreateVgwRequestBodyContent withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * VPN网关所连接的VPC的ID
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public CreateVgwRequestBodyContent withLocalSubnets(List<String> localSubnets) {
        this.localSubnets = localSubnets;
        return this;
    }

    public CreateVgwRequestBodyContent addLocalSubnetsItem(String localSubnetsItem) {
        if (this.localSubnets == null) {
            this.localSubnets = new ArrayList<>();
        }
        this.localSubnets.add(localSubnetsItem);
        return this;
    }

    public CreateVgwRequestBodyContent withLocalSubnets(Consumer<List<String>> localSubnetsSetter) {
        if (this.localSubnets == null) {
            this.localSubnets = new ArrayList<>();
        }
        localSubnetsSetter.accept(this.localSubnets);
        return this;
    }

    /**
     * 本端子网，当attachment_type配置为\"vpc\"且ip_version为\"ipv4\"时必填，否则不填
     * @return localSubnets
     */
    public List<String> getLocalSubnets() {
        return localSubnets;
    }

    public void setLocalSubnets(List<String> localSubnets) {
        this.localSubnets = localSubnets;
    }

    public CreateVgwRequestBodyContent withLocalSubnetsV6(List<String> localSubnetsV6) {
        this.localSubnetsV6 = localSubnetsV6;
        return this;
    }

    public CreateVgwRequestBodyContent addLocalSubnetsV6Item(String localSubnetsV6Item) {
        if (this.localSubnetsV6 == null) {
            this.localSubnetsV6 = new ArrayList<>();
        }
        this.localSubnetsV6.add(localSubnetsV6Item);
        return this;
    }

    public CreateVgwRequestBodyContent withLocalSubnetsV6(Consumer<List<String>> localSubnetsV6Setter) {
        if (this.localSubnetsV6 == null) {
            this.localSubnetsV6 = new ArrayList<>();
        }
        localSubnetsV6Setter.accept(this.localSubnetsV6);
        return this;
    }

    /**
     * 使能ipv6的本端子网，当attachment_type配置为\"vpc\"且ip_version为\"ipv6\"时必填，否则不填
     * @return localSubnetsV6
     */
    public List<String> getLocalSubnetsV6() {
        return localSubnetsV6;
    }

    public void setLocalSubnetsV6(List<String> localSubnetsV6) {
        this.localSubnetsV6 = localSubnetsV6;
    }

    public CreateVgwRequestBodyContent withConnectSubnet(String connectSubnet) {
        this.connectSubnet = connectSubnet;
        return this;
    }

    /**
     * VPN网关所使用的VPC子网ID
     * @return connectSubnet
     */
    public String getConnectSubnet() {
        return connectSubnet;
    }

    public void setConnectSubnet(String connectSubnet) {
        this.connectSubnet = connectSubnet;
    }

    public CreateVgwRequestBodyContent withBgpAsn(Long bgpAsn) {
        this.bgpAsn = bgpAsn;
        return this;
    }

    /**
     * bgp所使用的asn号
     * minimum: 1
     * maximum: 4294967295
     * @return bgpAsn
     */
    public Long getBgpAsn() {
        return bgpAsn;
    }

    public void setBgpAsn(Long bgpAsn) {
        this.bgpAsn = bgpAsn;
    }

    public CreateVgwRequestBodyContent withFlavor(FlavorEnum flavor) {
        this.flavor = flavor;
        return this;
    }

    /**
     * VPN网关的规格类型，当attachment_type为er时不能填写Basic
     * @return flavor
     */
    public FlavorEnum getFlavor() {
        return flavor;
    }

    public void setFlavor(FlavorEnum flavor) {
        this.flavor = flavor;
    }

    public CreateVgwRequestBodyContent withAvailabilityZoneIds(List<String> availabilityZoneIds) {
        this.availabilityZoneIds = availabilityZoneIds;
        return this;
    }

    public CreateVgwRequestBodyContent addAvailabilityZoneIdsItem(String availabilityZoneIdsItem) {
        if (this.availabilityZoneIds == null) {
            this.availabilityZoneIds = new ArrayList<>();
        }
        this.availabilityZoneIds.add(availabilityZoneIdsItem);
        return this;
    }

    public CreateVgwRequestBodyContent withAvailabilityZoneIds(Consumer<List<String>> availabilityZoneIdsSetter) {
        if (this.availabilityZoneIds == null) {
            this.availabilityZoneIds = new ArrayList<>();
        }
        availabilityZoneIdsSetter.accept(this.availabilityZoneIds);
        return this;
    }

    /**
     * 部署VPN网关的可用区。不填时自动为VPN网关选择可用区。如果需要指定可用区可以通过查询VPN网关可用区查询可用区列表。
     * @return availabilityZoneIds
     */
    public List<String> getAvailabilityZoneIds() {
        return availabilityZoneIds;
    }

    public void setAvailabilityZoneIds(List<String> availabilityZoneIds) {
        this.availabilityZoneIds = availabilityZoneIds;
    }

    public CreateVgwRequestBodyContent withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CreateVgwRequestBodyContent withEip1(CreateRequestEip eip1) {
        this.eip1 = eip1;
        return this;
    }

    public CreateVgwRequestBodyContent withEip1(Consumer<CreateRequestEip> eip1Setter) {
        if (this.eip1 == null) {
            this.eip1 = new CreateRequestEip();
            eip1Setter.accept(this.eip1);
        }

        return this;
    }

    /**
     * Get eip1
     * @return eip1
     */
    public CreateRequestEip getEip1() {
        return eip1;
    }

    public void setEip1(CreateRequestEip eip1) {
        this.eip1 = eip1;
    }

    public CreateVgwRequestBodyContent withEip2(CreateRequestEip eip2) {
        this.eip2 = eip2;
        return this;
    }

    public CreateVgwRequestBodyContent withEip2(Consumer<CreateRequestEip> eip2Setter) {
        if (this.eip2 == null) {
            this.eip2 = new CreateRequestEip();
            eip2Setter.accept(this.eip2);
        }

        return this;
    }

    /**
     * Get eip2
     * @return eip2
     */
    public CreateRequestEip getEip2() {
        return eip2;
    }

    public void setEip2(CreateRequestEip eip2) {
        this.eip2 = eip2;
    }

    public CreateVgwRequestBodyContent withAccessPrivateIp1(String accessPrivateIp1) {
        this.accessPrivateIp1 = accessPrivateIp1;
        return this;
    }

    /**
     * 私网类型VPN网关的接入私网IP1，指定ip创建私网网关时设置，主备网关时为主ip，双活网关时为主ip1
     * @return accessPrivateIp1
     */
    public String getAccessPrivateIp1() {
        return accessPrivateIp1;
    }

    public void setAccessPrivateIp1(String accessPrivateIp1) {
        this.accessPrivateIp1 = accessPrivateIp1;
    }

    public CreateVgwRequestBodyContent withAccessPrivateIp2(String accessPrivateIp2) {
        this.accessPrivateIp2 = accessPrivateIp2;
        return this;
    }

    /**
     * 私网类型VPN网关的接入私网IP2，指定ip创建私网网关时设置，主备网关时为备ip，双活网关时为主ip2
     * @return accessPrivateIp2
     */
    public String getAccessPrivateIp2() {
        return accessPrivateIp2;
    }

    public void setAccessPrivateIp2(String accessPrivateIp2) {
        this.accessPrivateIp2 = accessPrivateIp2;
    }

    public CreateVgwRequestBodyContent withNetworkType(NetworkTypeEnum networkType) {
        this.networkType = networkType;
        return this;
    }

    /**
     * VPN网关的网络类型，默认为公网(public)
     * @return networkType
     */
    public NetworkTypeEnum getNetworkType() {
        return networkType;
    }

    public void setNetworkType(NetworkTypeEnum networkType) {
        this.networkType = networkType;
    }

    public CreateVgwRequestBodyContent withAccessVpcId(String accessVpcId) {
        this.accessVpcId = accessVpcId;
        return this;
    }

    /**
     * VPN网关北向接入VPC ID，不填时默认使用vpc_id字段的值
     * @return accessVpcId
     */
    public String getAccessVpcId() {
        return accessVpcId;
    }

    public void setAccessVpcId(String accessVpcId) {
        this.accessVpcId = accessVpcId;
    }

    public CreateVgwRequestBodyContent withAccessSubnetId(String accessSubnetId) {
        this.accessSubnetId = accessSubnetId;
        return this;
    }

    /**
     * VPN网关北向接入VPC中的接入子网ID，在填写了access_vpc_id时必填
     * @return accessSubnetId
     */
    public String getAccessSubnetId() {
        return accessSubnetId;
    }

    public void setAccessSubnetId(String accessSubnetId) {
        this.accessSubnetId = accessSubnetId;
    }

    public CreateVgwRequestBodyContent withHaMode(HaModeEnum haMode) {
        this.haMode = haMode;
        return this;
    }

    /**
     * ha模式
     * @return haMode
     */
    public HaModeEnum getHaMode() {
        return haMode;
    }

    public void setHaMode(HaModeEnum haMode) {
        this.haMode = haMode;
    }

    public CreateVgwRequestBodyContent withTags(List<VpnResourceTag> tags) {
        this.tags = tags;
        return this;
    }

    public CreateVgwRequestBodyContent addTagsItem(VpnResourceTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateVgwRequestBodyContent withTags(Consumer<List<VpnResourceTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签
     * @return tags
     */
    public List<VpnResourceTag> getTags() {
        return tags;
    }

    public void setTags(List<VpnResourceTag> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateVgwRequestBodyContent that = (CreateVgwRequestBodyContent) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.attachmentType, that.attachmentType)
            && Objects.equals(this.ipVersion, that.ipVersion) && Objects.equals(this.erId, that.erId)
            && Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.localSubnets, that.localSubnets)
            && Objects.equals(this.localSubnetsV6, that.localSubnetsV6)
            && Objects.equals(this.connectSubnet, that.connectSubnet) && Objects.equals(this.bgpAsn, that.bgpAsn)
            && Objects.equals(this.flavor, that.flavor)
            && Objects.equals(this.availabilityZoneIds, that.availabilityZoneIds)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.eip1, that.eip1) && Objects.equals(this.eip2, that.eip2)
            && Objects.equals(this.accessPrivateIp1, that.accessPrivateIp1)
            && Objects.equals(this.accessPrivateIp2, that.accessPrivateIp2)
            && Objects.equals(this.networkType, that.networkType) && Objects.equals(this.accessVpcId, that.accessVpcId)
            && Objects.equals(this.accessSubnetId, that.accessSubnetId) && Objects.equals(this.haMode, that.haMode)
            && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            attachmentType,
            ipVersion,
            erId,
            vpcId,
            localSubnets,
            localSubnetsV6,
            connectSubnet,
            bgpAsn,
            flavor,
            availabilityZoneIds,
            enterpriseProjectId,
            eip1,
            eip2,
            accessPrivateIp1,
            accessPrivateIp2,
            networkType,
            accessVpcId,
            accessSubnetId,
            haMode,
            tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVgwRequestBodyContent {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    attachmentType: ").append(toIndentedString(attachmentType)).append("\n");
        sb.append("    ipVersion: ").append(toIndentedString(ipVersion)).append("\n");
        sb.append("    erId: ").append(toIndentedString(erId)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    localSubnets: ").append(toIndentedString(localSubnets)).append("\n");
        sb.append("    localSubnetsV6: ").append(toIndentedString(localSubnetsV6)).append("\n");
        sb.append("    connectSubnet: ").append(toIndentedString(connectSubnet)).append("\n");
        sb.append("    bgpAsn: ").append(toIndentedString(bgpAsn)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    availabilityZoneIds: ").append(toIndentedString(availabilityZoneIds)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    eip1: ").append(toIndentedString(eip1)).append("\n");
        sb.append("    eip2: ").append(toIndentedString(eip2)).append("\n");
        sb.append("    accessPrivateIp1: ").append(toIndentedString(accessPrivateIp1)).append("\n");
        sb.append("    accessPrivateIp2: ").append(toIndentedString(accessPrivateIp2)).append("\n");
        sb.append("    networkType: ").append(toIndentedString(networkType)).append("\n");
        sb.append("    accessVpcId: ").append(toIndentedString(accessVpcId)).append("\n");
        sb.append("    accessSubnetId: ").append(toIndentedString(accessSubnetId)).append("\n");
        sb.append("    haMode: ").append(toIndentedString(haMode)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
