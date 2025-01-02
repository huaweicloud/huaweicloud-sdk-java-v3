package com.huaweicloud.sdk.dc.v3.model;

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
 * global-dc-gateway详情。
 */
public class CreateGlobalDcGatewayEntry {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_center_network_id")

    private String globalCenterNetworkId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bgp_asn")

    private Long bgpAsn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location_name")

    private String locationName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_peer_link_count")

    private Integer currentPeerLinkCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_peer_link_count")

    private Integer availablePeerLinkCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state_up")

    private Boolean adminStateUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private GlobalDcGatewayStatus status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private OffsetDateTime createdTime;

    /**
     * 网关的地址簇，IPv4或者ipv6和IPv4双栈 - ipv4 - dual
     */
    public static final class AddressFamilyEnum {

        /**
         * Enum IPV4 for value: "ipv4"
         */
        public static final AddressFamilyEnum IPV4 = new AddressFamilyEnum("ipv4");

        /**
         * Enum DUAL for value: "dual"
         */
        public static final AddressFamilyEnum DUAL = new AddressFamilyEnum("dual");

        private static final Map<String, AddressFamilyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AddressFamilyEnum> createStaticFields() {
            Map<String, AddressFamilyEnum> map = new HashMap<>();
            map.put("ipv4", IPV4);
            map.put("dual", DUAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AddressFamilyEnum(String value) {
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
        public static AddressFamilyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AddressFamilyEnum(value));
        }

        public static AddressFamilyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AddressFamilyEnum) {
                return this.value.equals(((AddressFamilyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address_family")

    private AddressFamilyEnum addressFamily;

    public CreateGlobalDcGatewayEntry withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 专线全域接入网关（global-dc-gateway）ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CreateGlobalDcGatewayEntry withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 项目ID。
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public CreateGlobalDcGatewayEntry withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * global-dc-gateway名字。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateGlobalDcGatewayEntry withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateGlobalDcGatewayEntry withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * global-dc-gateway所属的企业项目ID。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CreateGlobalDcGatewayEntry withGlobalCenterNetworkId(String globalCenterNetworkId) {
        this.globalCenterNetworkId = globalCenterNetworkId;
        return this;
    }

    /**
     * DGW加载的全球中心网络实例的ID
     * @return globalCenterNetworkId
     */
    public String getGlobalCenterNetworkId() {
        return globalCenterNetworkId;
    }

    public void setGlobalCenterNetworkId(String globalCenterNetworkId) {
        this.globalCenterNetworkId = globalCenterNetworkId;
    }

    public CreateGlobalDcGatewayEntry withBgpAsn(Long bgpAsn) {
        this.bgpAsn = bgpAsn;
        return this;
    }

    /**
     * DGW对应BGP的ASN编号
     * minimum: 0
     * maximum: 65535
     * @return bgpAsn
     */
    public Long getBgpAsn() {
        return bgpAsn;
    }

    public void setBgpAsn(Long bgpAsn) {
        this.bgpAsn = bgpAsn;
    }

    public CreateGlobalDcGatewayEntry withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * DGW所属Region
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public CreateGlobalDcGatewayEntry withLocationName(String locationName) {
        this.locationName = locationName;
        return this;
    }

    /**
     * DGW创建网关设备归属的位置
     * @return locationName
     */
    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public CreateGlobalDcGatewayEntry withCurrentPeerLinkCount(Integer currentPeerLinkCount) {
        this.currentPeerLinkCount = currentPeerLinkCount;
        return this;
    }

    /**
     * 全域接入网关(GDGW)上关联连接的数量，表示DGW挂载ER的数量
     * @return currentPeerLinkCount
     */
    public Integer getCurrentPeerLinkCount() {
        return currentPeerLinkCount;
    }

    public void setCurrentPeerLinkCount(Integer currentPeerLinkCount) {
        this.currentPeerLinkCount = currentPeerLinkCount;
    }

    public CreateGlobalDcGatewayEntry withAvailablePeerLinkCount(Integer availablePeerLinkCount) {
        this.availablePeerLinkCount = availablePeerLinkCount;
        return this;
    }

    /**
     * 该全域接入网关上GDGW允许创建关联连接（PeerLink）的数量
     * @return availablePeerLinkCount
     */
    public Integer getAvailablePeerLinkCount() {
        return availablePeerLinkCount;
    }

    public void setAvailablePeerLinkCount(Integer availablePeerLinkCount) {
        this.availablePeerLinkCount = availablePeerLinkCount;
    }

    public CreateGlobalDcGatewayEntry withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public CreateGlobalDcGatewayEntry addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateGlobalDcGatewayEntry withTags(Consumer<List<Tag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * global-dc-gateway关联TAG。
     * @return tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public CreateGlobalDcGatewayEntry withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    /**
     * 该GDGW的管理状态，true为激活状态、false为冻结状态
     * @return adminStateUp
     */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public CreateGlobalDcGatewayEntry withStatus(GlobalDcGatewayStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    public GlobalDcGatewayStatus getStatus() {
        return status;
    }

    public void setStatus(GlobalDcGatewayStatus status) {
        this.status = status;
    }

    public CreateGlobalDcGatewayEntry withCreatedTime(OffsetDateTime createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * 创建时间。
     * @return createdTime
     */
    public OffsetDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(OffsetDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public CreateGlobalDcGatewayEntry withAddressFamily(AddressFamilyEnum addressFamily) {
        this.addressFamily = addressFamily;
        return this;
    }

    /**
     * 网关的地址簇，IPv4或者ipv6和IPv4双栈 - ipv4 - dual
     * @return addressFamily
     */
    public AddressFamilyEnum getAddressFamily() {
        return addressFamily;
    }

    public void setAddressFamily(AddressFamilyEnum addressFamily) {
        this.addressFamily = addressFamily;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateGlobalDcGatewayEntry that = (CreateGlobalDcGatewayEntry) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.tenantId, that.tenantId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.globalCenterNetworkId, that.globalCenterNetworkId)
            && Objects.equals(this.bgpAsn, that.bgpAsn) && Objects.equals(this.regionId, that.regionId)
            && Objects.equals(this.locationName, that.locationName)
            && Objects.equals(this.currentPeerLinkCount, that.currentPeerLinkCount)
            && Objects.equals(this.availablePeerLinkCount, that.availablePeerLinkCount)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.adminStateUp, that.adminStateUp)
            && Objects.equals(this.status, that.status) && Objects.equals(this.createdTime, that.createdTime)
            && Objects.equals(this.addressFamily, that.addressFamily);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            tenantId,
            name,
            description,
            enterpriseProjectId,
            globalCenterNetworkId,
            bgpAsn,
            regionId,
            locationName,
            currentPeerLinkCount,
            availablePeerLinkCount,
            tags,
            adminStateUp,
            status,
            createdTime,
            addressFamily);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateGlobalDcGatewayEntry {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    globalCenterNetworkId: ").append(toIndentedString(globalCenterNetworkId)).append("\n");
        sb.append("    bgpAsn: ").append(toIndentedString(bgpAsn)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
        sb.append("    currentPeerLinkCount: ").append(toIndentedString(currentPeerLinkCount)).append("\n");
        sb.append("    availablePeerLinkCount: ").append(toIndentedString(availablePeerLinkCount)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    addressFamily: ").append(toIndentedString(addressFamily)).append("\n");
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
