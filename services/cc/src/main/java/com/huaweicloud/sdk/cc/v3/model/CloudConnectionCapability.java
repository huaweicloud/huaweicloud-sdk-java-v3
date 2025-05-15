package com.huaweicloud.sdk.cc.v3.model;

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
 * 租户能力实例。
 */
public class CloudConnectionCapability {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    /**
     * 租户能力类型，分为： 1. v2：V2的API 2. v3：V3的API 3. billing_mode_period_reduce: 实时降配（包周期） 4. billing_mode_demand: 按需计费（每小时统计打点） 5. bwp95: 按需计费-95（传统95计费方式） 6. bwp95Avg: 按需计费-日95（95峰值平均） 7. network-quality: 丢包和时延统计 8. er：是否支持ER 9. domain_bandwidth：租户带宽值 10. ipv6: 是否支持IPV6 11. ipv6_support_regions: IPV6支持的region列表
     */
    public static final class ResourceTypeEnum {

        /**
         * Enum V2 for value: "v2"
         */
        public static final ResourceTypeEnum V2 = new ResourceTypeEnum("v2");

        /**
         * Enum V3 for value: "v3"
         */
        public static final ResourceTypeEnum V3 = new ResourceTypeEnum("v3");

        /**
         * Enum BILLING_MODE_PERIOD_REDUCE for value: "billing_mode_period_reduce"
         */
        public static final ResourceTypeEnum BILLING_MODE_PERIOD_REDUCE =
            new ResourceTypeEnum("billing_mode_period_reduce");

        /**
         * Enum BILLING_MODE_DEMAND for value: "billing_mode_demand"
         */
        public static final ResourceTypeEnum BILLING_MODE_DEMAND = new ResourceTypeEnum("billing_mode_demand");

        /**
         * Enum BWP95 for value: "bwp95"
         */
        public static final ResourceTypeEnum BWP95 = new ResourceTypeEnum("bwp95");

        /**
         * Enum BWP95AVG for value: "bwp95Avg"
         */
        public static final ResourceTypeEnum BWP95AVG = new ResourceTypeEnum("bwp95Avg");

        /**
         * Enum NETWORK_QUALITY for value: "network-quality"
         */
        public static final ResourceTypeEnum NETWORK_QUALITY = new ResourceTypeEnum("network-quality");

        /**
         * Enum ER for value: "er"
         */
        public static final ResourceTypeEnum ER = new ResourceTypeEnum("er");

        /**
         * Enum DOMAIN_BANDWIDTH for value: "domain_bandwidth"
         */
        public static final ResourceTypeEnum DOMAIN_BANDWIDTH = new ResourceTypeEnum("domain_bandwidth");

        /**
         * Enum IPV6 for value: "ipv6"
         */
        public static final ResourceTypeEnum IPV6 = new ResourceTypeEnum("ipv6");

        /**
         * Enum IPV6_SUPPORT_REGIONS for value: "ipv6_support_regions"
         */
        public static final ResourceTypeEnum IPV6_SUPPORT_REGIONS = new ResourceTypeEnum("ipv6_support_regions");

        private static final Map<String, ResourceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResourceTypeEnum> createStaticFields() {
            Map<String, ResourceTypeEnum> map = new HashMap<>();
            map.put("v2", V2);
            map.put("v3", V3);
            map.put("billing_mode_period_reduce", BILLING_MODE_PERIOD_REDUCE);
            map.put("billing_mode_demand", BILLING_MODE_DEMAND);
            map.put("bwp95", BWP95);
            map.put("bwp95Avg", BWP95AVG);
            map.put("network-quality", NETWORK_QUALITY);
            map.put("er", ER);
            map.put("domain_bandwidth", DOMAIN_BANDWIDTH);
            map.put("ipv6", IPV6);
            map.put("ipv6_support_regions", IPV6_SUPPORT_REGIONS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ResourceTypeEnum(String value) {
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
        public static ResourceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ResourceTypeEnum(value));
        }

        public static ResourceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ResourceTypeEnum) {
                return this.value.equals(((ResourceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private ResourceTypeEnum resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth")

    private BandwidthCapability bandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_regions")

    private List<String> supportRegions = null;

    public CloudConnectionCapability withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 实例ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CloudConnectionCapability withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 实例所属账号ID。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public CloudConnectionCapability withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 实例描述。不支持 <>。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CloudConnectionCapability withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 实例创建时间。UTC时间格式，yyyy-MM-ddTHH:mm:ss。
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public CloudConnectionCapability withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 实例更新时间。UTC时间格式，yyyy-MM-ddTHH:mm:ss。
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public CloudConnectionCapability withResourceType(ResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 租户能力类型，分为： 1. v2：V2的API 2. v3：V3的API 3. billing_mode_period_reduce: 实时降配（包周期） 4. billing_mode_demand: 按需计费（每小时统计打点） 5. bwp95: 按需计费-95（传统95计费方式） 6. bwp95Avg: 按需计费-日95（95峰值平均） 7. network-quality: 丢包和时延统计 8. er：是否支持ER 9. domain_bandwidth：租户带宽值 10. ipv6: 是否支持IPV6 11. ipv6_support_regions: IPV6支持的region列表
     * @return resourceType
     */
    public ResourceTypeEnum getResourceType() {
        return resourceType;
    }

    public void setResourceType(ResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
    }

    public CloudConnectionCapability withBandwidth(BandwidthCapability bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    public CloudConnectionCapability withBandwidth(Consumer<BandwidthCapability> bandwidthSetter) {
        if (this.bandwidth == null) {
            this.bandwidth = new BandwidthCapability();
            bandwidthSetter.accept(this.bandwidth);
        }

        return this;
    }

    /**
     * Get bandwidth
     * @return bandwidth
     */
    public BandwidthCapability getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(BandwidthCapability bandwidth) {
        this.bandwidth = bandwidth;
    }

    public CloudConnectionCapability withSupportRegions(List<String> supportRegions) {
        this.supportRegions = supportRegions;
        return this;
    }

    public CloudConnectionCapability addSupportRegionsItem(String supportRegionsItem) {
        if (this.supportRegions == null) {
            this.supportRegions = new ArrayList<>();
        }
        this.supportRegions.add(supportRegionsItem);
        return this;
    }

    public CloudConnectionCapability withSupportRegions(Consumer<List<String>> supportRegionsSetter) {
        if (this.supportRegions == null) {
            this.supportRegions = new ArrayList<>();
        }
        supportRegionsSetter.accept(this.supportRegions);
        return this;
    }

    /**
     * 租户支持的REGION列表。
     * @return supportRegions
     */
    public List<String> getSupportRegions() {
        return supportRegions;
    }

    public void setSupportRegions(List<String> supportRegions) {
        this.supportRegions = supportRegions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CloudConnectionCapability that = (CloudConnectionCapability) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.description, that.description) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt) && Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.bandwidth, that.bandwidth)
            && Objects.equals(this.supportRegions, that.supportRegions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, domainId, description, createdAt, updatedAt, resourceType, bandwidth, supportRegions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CloudConnectionCapability {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
        sb.append("    supportRegions: ").append(toIndentedString(supportRegions)).append("\n");
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
