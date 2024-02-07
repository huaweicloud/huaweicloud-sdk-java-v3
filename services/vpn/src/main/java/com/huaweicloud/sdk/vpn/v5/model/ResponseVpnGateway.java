package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ResponseVpnGateway
 */
public class ResponseVpnGateway {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_id")

    private String certificateId;

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
    @JsonProperty(value = "connect_subnet")

    private String connectSubnet;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_private_ip_1")

    private String accessPrivateIp1;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_private_ip_2")

    private String accessPrivateIp2;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bgp_asn")

    private Long bgpAsn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private String flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone_ids")

    private List<String> availabilityZoneIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_number")

    private Integer connectionNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_connection_number")

    private Integer usedConnectionNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_connection_group")

    private Integer usedConnectionGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ha_mode")

    private String haMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip1")

    private ResponseEip eip1;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip2")

    private ResponseEip eip2;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_template")

    private PolicyTemplate policyTemplate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "supported_flavors")

    private List<String> supportedFlavors = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<VpnResourceTag> tags = null;

    public ResponseVpnGateway withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * VPN网关ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ResponseVpnGateway withName(String name) {
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

    public ResponseVpnGateway withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * VPN网关状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ResponseVpnGateway withAttachmentType(AttachmentTypeEnum attachmentType) {
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

    public ResponseVpnGateway withCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }

    /**
     * Get certificateId
     * @return certificateId
     */
    public String getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    public ResponseVpnGateway withErId(String erId) {
        this.erId = erId;
        return this;
    }

    /**
     * VPN网关所连接的ER实例的ID
     * @return erId
     */
    public String getErId() {
        return erId;
    }

    public void setErId(String erId) {
        this.erId = erId;
    }

    public ResponseVpnGateway withVpcId(String vpcId) {
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

    public ResponseVpnGateway withLocalSubnets(List<String> localSubnets) {
        this.localSubnets = localSubnets;
        return this;
    }

    public ResponseVpnGateway addLocalSubnetsItem(String localSubnetsItem) {
        if (this.localSubnets == null) {
            this.localSubnets = new ArrayList<>();
        }
        this.localSubnets.add(localSubnetsItem);
        return this;
    }

    public ResponseVpnGateway withLocalSubnets(Consumer<List<String>> localSubnetsSetter) {
        if (this.localSubnets == null) {
            this.localSubnets = new ArrayList<>();
        }
        localSubnetsSetter.accept(this.localSubnets);
        return this;
    }

    /**
     * 本端子网
     * @return localSubnets
     */
    public List<String> getLocalSubnets() {
        return localSubnets;
    }

    public void setLocalSubnets(List<String> localSubnets) {
        this.localSubnets = localSubnets;
    }

    public ResponseVpnGateway withConnectSubnet(String connectSubnet) {
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

    public ResponseVpnGateway withNetworkType(NetworkTypeEnum networkType) {
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

    public ResponseVpnGateway withAccessVpcId(String accessVpcId) {
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

    public ResponseVpnGateway withAccessSubnetId(String accessSubnetId) {
        this.accessSubnetId = accessSubnetId;
        return this;
    }

    /**
     * VPN网关北向接入VPC中的接入子网ID
     * @return accessSubnetId
     */
    public String getAccessSubnetId() {
        return accessSubnetId;
    }

    public void setAccessSubnetId(String accessSubnetId) {
        this.accessSubnetId = accessSubnetId;
    }

    public ResponseVpnGateway withAccessPrivateIp1(String accessPrivateIp1) {
        this.accessPrivateIp1 = accessPrivateIp1;
        return this;
    }

    /**
     * 私网类型VPN网关的接入私网IP，VPN网关使用该私网IP与对端网关建连。双活网关表示使用的第一个私网地址，主备表示主私网地址。
     * @return accessPrivateIp1
     */
    public String getAccessPrivateIp1() {
        return accessPrivateIp1;
    }

    public void setAccessPrivateIp1(String accessPrivateIp1) {
        this.accessPrivateIp1 = accessPrivateIp1;
    }

    public ResponseVpnGateway withAccessPrivateIp2(String accessPrivateIp2) {
        this.accessPrivateIp2 = accessPrivateIp2;
        return this;
    }

    /**
     * 私网类型VPN网关的接入私网IP，VPN网关使用该私网IP与对端网关建连。双活网关表示使用的第二个私网地址，主备表示备私网地址。
     * @return accessPrivateIp2
     */
    public String getAccessPrivateIp2() {
        return accessPrivateIp2;
    }

    public void setAccessPrivateIp2(String accessPrivateIp2) {
        this.accessPrivateIp2 = accessPrivateIp2;
    }

    public ResponseVpnGateway withBgpAsn(Long bgpAsn) {
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

    public ResponseVpnGateway withFlavor(String flavor) {
        this.flavor = flavor;
        return this;
    }

    /**
     * VPN网关的规格类型
     * @return flavor
     */
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public ResponseVpnGateway withAvailabilityZoneIds(List<String> availabilityZoneIds) {
        this.availabilityZoneIds = availabilityZoneIds;
        return this;
    }

    public ResponseVpnGateway addAvailabilityZoneIdsItem(String availabilityZoneIdsItem) {
        if (this.availabilityZoneIds == null) {
            this.availabilityZoneIds = new ArrayList<>();
        }
        this.availabilityZoneIds.add(availabilityZoneIdsItem);
        return this;
    }

    public ResponseVpnGateway withAvailabilityZoneIds(Consumer<List<String>> availabilityZoneIdsSetter) {
        if (this.availabilityZoneIds == null) {
            this.availabilityZoneIds = new ArrayList<>();
        }
        availabilityZoneIdsSetter.accept(this.availabilityZoneIds);
        return this;
    }

    /**
     * 可用区列表
     * @return availabilityZoneIds
     */
    public List<String> getAvailabilityZoneIds() {
        return availabilityZoneIds;
    }

    public void setAvailabilityZoneIds(List<String> availabilityZoneIds) {
        this.availabilityZoneIds = availabilityZoneIds;
    }

    public ResponseVpnGateway withConnectionNumber(Integer connectionNumber) {
        this.connectionNumber = connectionNumber;
        return this;
    }

    /**
     * 最大可创建的VPN连接数
     * @return connectionNumber
     */
    public Integer getConnectionNumber() {
        return connectionNumber;
    }

    public void setConnectionNumber(Integer connectionNumber) {
        this.connectionNumber = connectionNumber;
    }

    public ResponseVpnGateway withUsedConnectionNumber(Integer usedConnectionNumber) {
        this.usedConnectionNumber = usedConnectionNumber;
        return this;
    }

    /**
     * 当前已经使用的VPN连接数
     * @return usedConnectionNumber
     */
    public Integer getUsedConnectionNumber() {
        return usedConnectionNumber;
    }

    public void setUsedConnectionNumber(Integer usedConnectionNumber) {
        this.usedConnectionNumber = usedConnectionNumber;
    }

    public ResponseVpnGateway withUsedConnectionGroup(Integer usedConnectionGroup) {
        this.usedConnectionGroup = usedConnectionGroup;
        return this;
    }

    /**
     * 当前已经使用的VPN连接组个数
     * @return usedConnectionGroup
     */
    public Integer getUsedConnectionGroup() {
        return usedConnectionGroup;
    }

    public void setUsedConnectionGroup(Integer usedConnectionGroup) {
        this.usedConnectionGroup = usedConnectionGroup;
    }

    public ResponseVpnGateway withEnterpriseProjectId(String enterpriseProjectId) {
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

    public ResponseVpnGateway withHaMode(String haMode) {
        this.haMode = haMode;
        return this;
    }

    /**
     * ha模式
     * @return haMode
     */
    public String getHaMode() {
        return haMode;
    }

    public void setHaMode(String haMode) {
        this.haMode = haMode;
    }

    public ResponseVpnGateway withEip1(ResponseEip eip1) {
        this.eip1 = eip1;
        return this;
    }

    public ResponseVpnGateway withEip1(Consumer<ResponseEip> eip1Setter) {
        if (this.eip1 == null) {
            this.eip1 = new ResponseEip();
            eip1Setter.accept(this.eip1);
        }

        return this;
    }

    /**
     * Get eip1
     * @return eip1
     */
    public ResponseEip getEip1() {
        return eip1;
    }

    public void setEip1(ResponseEip eip1) {
        this.eip1 = eip1;
    }

    public ResponseVpnGateway withEip2(ResponseEip eip2) {
        this.eip2 = eip2;
        return this;
    }

    public ResponseVpnGateway withEip2(Consumer<ResponseEip> eip2Setter) {
        if (this.eip2 == null) {
            this.eip2 = new ResponseEip();
            eip2Setter.accept(this.eip2);
        }

        return this;
    }

    /**
     * Get eip2
     * @return eip2
     */
    public ResponseEip getEip2() {
        return eip2;
    }

    public void setEip2(ResponseEip eip2) {
        this.eip2 = eip2;
    }

    public ResponseVpnGateway withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public ResponseVpnGateway withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ResponseVpnGateway withPolicyTemplate(PolicyTemplate policyTemplate) {
        this.policyTemplate = policyTemplate;
        return this;
    }

    public ResponseVpnGateway withPolicyTemplate(Consumer<PolicyTemplate> policyTemplateSetter) {
        if (this.policyTemplate == null) {
            this.policyTemplate = new PolicyTemplate();
            policyTemplateSetter.accept(this.policyTemplate);
        }

        return this;
    }

    /**
     * Get policyTemplate
     * @return policyTemplate
     */
    public PolicyTemplate getPolicyTemplate() {
        return policyTemplate;
    }

    public void setPolicyTemplate(PolicyTemplate policyTemplate) {
        this.policyTemplate = policyTemplate;
    }

    public ResponseVpnGateway withSupportedFlavors(List<String> supportedFlavors) {
        this.supportedFlavors = supportedFlavors;
        return this;
    }

    public ResponseVpnGateway addSupportedFlavorsItem(String supportedFlavorsItem) {
        if (this.supportedFlavors == null) {
            this.supportedFlavors = new ArrayList<>();
        }
        this.supportedFlavors.add(supportedFlavorsItem);
        return this;
    }

    public ResponseVpnGateway withSupportedFlavors(Consumer<List<String>> supportedFlavorsSetter) {
        if (this.supportedFlavors == null) {
            this.supportedFlavors = new ArrayList<>();
        }
        supportedFlavorsSetter.accept(this.supportedFlavors);
        return this;
    }

    /**
     * 网关可升配到的目标规格
     * @return supportedFlavors
     */
    public List<String> getSupportedFlavors() {
        return supportedFlavors;
    }

    public void setSupportedFlavors(List<String> supportedFlavors) {
        this.supportedFlavors = supportedFlavors;
    }

    public ResponseVpnGateway withTags(List<VpnResourceTag> tags) {
        this.tags = tags;
        return this;
    }

    public ResponseVpnGateway addTagsItem(VpnResourceTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ResponseVpnGateway withTags(Consumer<List<VpnResourceTag>> tagsSetter) {
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
        ResponseVpnGateway that = (ResponseVpnGateway) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.status, that.status) && Objects.equals(this.attachmentType, that.attachmentType)
            && Objects.equals(this.certificateId, that.certificateId) && Objects.equals(this.erId, that.erId)
            && Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.localSubnets, that.localSubnets)
            && Objects.equals(this.connectSubnet, that.connectSubnet)
            && Objects.equals(this.networkType, that.networkType) && Objects.equals(this.accessVpcId, that.accessVpcId)
            && Objects.equals(this.accessSubnetId, that.accessSubnetId)
            && Objects.equals(this.accessPrivateIp1, that.accessPrivateIp1)
            && Objects.equals(this.accessPrivateIp2, that.accessPrivateIp2) && Objects.equals(this.bgpAsn, that.bgpAsn)
            && Objects.equals(this.flavor, that.flavor)
            && Objects.equals(this.availabilityZoneIds, that.availabilityZoneIds)
            && Objects.equals(this.connectionNumber, that.connectionNumber)
            && Objects.equals(this.usedConnectionNumber, that.usedConnectionNumber)
            && Objects.equals(this.usedConnectionGroup, that.usedConnectionGroup)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.haMode, that.haMode) && Objects.equals(this.eip1, that.eip1)
            && Objects.equals(this.eip2, that.eip2) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.policyTemplate, that.policyTemplate)
            && Objects.equals(this.supportedFlavors, that.supportedFlavors) && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            status,
            attachmentType,
            certificateId,
            erId,
            vpcId,
            localSubnets,
            connectSubnet,
            networkType,
            accessVpcId,
            accessSubnetId,
            accessPrivateIp1,
            accessPrivateIp2,
            bgpAsn,
            flavor,
            availabilityZoneIds,
            connectionNumber,
            usedConnectionNumber,
            usedConnectionGroup,
            enterpriseProjectId,
            haMode,
            eip1,
            eip2,
            createdAt,
            updatedAt,
            policyTemplate,
            supportedFlavors,
            tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResponseVpnGateway {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    attachmentType: ").append(toIndentedString(attachmentType)).append("\n");
        sb.append("    certificateId: ").append(toIndentedString(certificateId)).append("\n");
        sb.append("    erId: ").append(toIndentedString(erId)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    localSubnets: ").append(toIndentedString(localSubnets)).append("\n");
        sb.append("    connectSubnet: ").append(toIndentedString(connectSubnet)).append("\n");
        sb.append("    networkType: ").append(toIndentedString(networkType)).append("\n");
        sb.append("    accessVpcId: ").append(toIndentedString(accessVpcId)).append("\n");
        sb.append("    accessSubnetId: ").append(toIndentedString(accessSubnetId)).append("\n");
        sb.append("    accessPrivateIp1: ").append(toIndentedString(accessPrivateIp1)).append("\n");
        sb.append("    accessPrivateIp2: ").append(toIndentedString(accessPrivateIp2)).append("\n");
        sb.append("    bgpAsn: ").append(toIndentedString(bgpAsn)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    availabilityZoneIds: ").append(toIndentedString(availabilityZoneIds)).append("\n");
        sb.append("    connectionNumber: ").append(toIndentedString(connectionNumber)).append("\n");
        sb.append("    usedConnectionNumber: ").append(toIndentedString(usedConnectionNumber)).append("\n");
        sb.append("    usedConnectionGroup: ").append(toIndentedString(usedConnectionGroup)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    haMode: ").append(toIndentedString(haMode)).append("\n");
        sb.append("    eip1: ").append(toIndentedString(eip1)).append("\n");
        sb.append("    eip2: ").append(toIndentedString(eip2)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    policyTemplate: ").append(toIndentedString(policyTemplate)).append("\n");
        sb.append("    supportedFlavors: ").append(toIndentedString(supportedFlavors)).append("\n");
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
