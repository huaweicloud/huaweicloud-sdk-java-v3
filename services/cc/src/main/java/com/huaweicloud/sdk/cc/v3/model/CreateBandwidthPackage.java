package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 创建带宽包请求体。
 */
public class CreateBandwidthPackage {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    /**
     * 本端大区。 云连接支持的大区有： | Chinese-Mainland | 中国大陆 | | Asia-Pacific | 亚太 | | Africa | 非洲 | | Western-Latin-America | 拉美西 | | Eastern-Latin-America | 拉美东 | | Northern-Latin-America | 拉美北 |
     */
    public static final class LocalAreaIdEnum {

        /**
         * Enum CHINESE_MAINLAND for value: "Chinese-Mainland"
         */
        public static final LocalAreaIdEnum CHINESE_MAINLAND = new LocalAreaIdEnum("Chinese-Mainland");

        /**
         * Enum ASIA_PACIFIC for value: "Asia-Pacific"
         */
        public static final LocalAreaIdEnum ASIA_PACIFIC = new LocalAreaIdEnum("Asia-Pacific");

        /**
         * Enum AFRICA for value: "Africa"
         */
        public static final LocalAreaIdEnum AFRICA = new LocalAreaIdEnum("Africa");

        /**
         * Enum WESTERN_LATIN_AMERICA for value: "Western-Latin-America"
         */
        public static final LocalAreaIdEnum WESTERN_LATIN_AMERICA = new LocalAreaIdEnum("Western-Latin-America");

        /**
         * Enum EASTERN_LATIN_AMERICA for value: "Eastern-Latin-America"
         */
        public static final LocalAreaIdEnum EASTERN_LATIN_AMERICA = new LocalAreaIdEnum("Eastern-Latin-America");

        /**
         * Enum NORTHERN_LATIN_AMERICA for value: "Northern-Latin-America"
         */
        public static final LocalAreaIdEnum NORTHERN_LATIN_AMERICA = new LocalAreaIdEnum("Northern-Latin-America");

        private static final Map<String, LocalAreaIdEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LocalAreaIdEnum> createStaticFields() {
            Map<String, LocalAreaIdEnum> map = new HashMap<>();
            map.put("Chinese-Mainland", CHINESE_MAINLAND);
            map.put("Asia-Pacific", ASIA_PACIFIC);
            map.put("Africa", AFRICA);
            map.put("Western-Latin-America", WESTERN_LATIN_AMERICA);
            map.put("Eastern-Latin-America", EASTERN_LATIN_AMERICA);
            map.put("Northern-Latin-America", NORTHERN_LATIN_AMERICA);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LocalAreaIdEnum(String value) {
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
        public static LocalAreaIdEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new LocalAreaIdEnum(value));
        }

        public static LocalAreaIdEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LocalAreaIdEnum) {
                return this.value.equals(((LocalAreaIdEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_area_id")

    private LocalAreaIdEnum localAreaId;

    /**
     * 远端大区。 云连接支持的大区有： | Chinese-Mainland | 中国大陆 | | Asia-Pacific | 亚太 | | Africa | 非洲 | | Western-Latin-America | 拉美西 | | Eastern-Latin-America | 拉美东 | | Northern-Latin-America | 拉美北 |
     */
    public static final class RemoteAreaIdEnum {

        /**
         * Enum CHINESE_MAINLAND for value: "Chinese-Mainland"
         */
        public static final RemoteAreaIdEnum CHINESE_MAINLAND = new RemoteAreaIdEnum("Chinese-Mainland");

        /**
         * Enum ASIA_PACIFIC for value: "Asia-Pacific"
         */
        public static final RemoteAreaIdEnum ASIA_PACIFIC = new RemoteAreaIdEnum("Asia-Pacific");

        /**
         * Enum AFRICA for value: "Africa"
         */
        public static final RemoteAreaIdEnum AFRICA = new RemoteAreaIdEnum("Africa");

        /**
         * Enum WESTERN_LATIN_AMERICA for value: "Western-Latin-America"
         */
        public static final RemoteAreaIdEnum WESTERN_LATIN_AMERICA = new RemoteAreaIdEnum("Western-Latin-America");

        /**
         * Enum EASTERN_LATIN_AMERICA for value: "Eastern-Latin-America"
         */
        public static final RemoteAreaIdEnum EASTERN_LATIN_AMERICA = new RemoteAreaIdEnum("Eastern-Latin-America");

        /**
         * Enum NORTHERN_LATIN_AMERICA for value: "Northern-Latin-America"
         */
        public static final RemoteAreaIdEnum NORTHERN_LATIN_AMERICA = new RemoteAreaIdEnum("Northern-Latin-America");

        private static final Map<String, RemoteAreaIdEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RemoteAreaIdEnum> createStaticFields() {
            Map<String, RemoteAreaIdEnum> map = new HashMap<>();
            map.put("Chinese-Mainland", CHINESE_MAINLAND);
            map.put("Asia-Pacific", ASIA_PACIFIC);
            map.put("Africa", AFRICA);
            map.put("Western-Latin-America", WESTERN_LATIN_AMERICA);
            map.put("Eastern-Latin-America", EASTERN_LATIN_AMERICA);
            map.put("Northern-Latin-America", NORTHERN_LATIN_AMERICA);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RemoteAreaIdEnum(String value) {
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
        public static RemoteAreaIdEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RemoteAreaIdEnum(value));
        }

        public static RemoteAreaIdEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RemoteAreaIdEnum) {
                return this.value.equals(((RemoteAreaIdEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_area_id")

    private RemoteAreaIdEnum remoteAreaId;

    /**
     * 带宽包实例的计费方式。 bandwidth是按带宽计费。
     */
    public static final class ChargeModeEnum {

        /**
         * Enum BANDWIDTH for value: "bandwidth"
         */
        public static final ChargeModeEnum BANDWIDTH = new ChargeModeEnum("bandwidth");

        private static final Map<String, ChargeModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ChargeModeEnum> createStaticFields() {
            Map<String, ChargeModeEnum> map = new HashMap<>();
            map.put("bandwidth", BANDWIDTH);
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

    /**
     * 带宽包实例在大陆站或国际站的计费方式： - 3：大陆站按需计费 - 4：国际站按需计费 - 5：大陆站按95方式计费 - 6：国际站按95方式计费
     */
    public static final class BillingModeEnum {

        /**
         * Enum NUMBER_3 for value: 3
         */
        public static final BillingModeEnum NUMBER_3 = new BillingModeEnum(3);

        /**
         * Enum NUMBER_4 for value: 4
         */
        public static final BillingModeEnum NUMBER_4 = new BillingModeEnum(4);

        /**
         * Enum NUMBER_5 for value: 5
         */
        public static final BillingModeEnum NUMBER_5 = new BillingModeEnum(5);

        /**
         * Enum NUMBER_6 for value: 6
         */
        public static final BillingModeEnum NUMBER_6 = new BillingModeEnum(6);

        private static final Map<Integer, BillingModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, BillingModeEnum> createStaticFields() {
            Map<Integer, BillingModeEnum> map = new HashMap<>();
            map.put(3, NUMBER_3);
            map.put(4, NUMBER_4);
            map.put(5, NUMBER_5);
            map.put(6, NUMBER_6);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        BillingModeEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static BillingModeEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new BillingModeEnum(value));
        }

        public static BillingModeEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof BillingModeEnum) {
                return this.value.equals(((BillingModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "billing_mode")

    private BillingModeEnum billingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth")

    private Integer bandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    /**
     * 带宽包实例绑定的资源类型。  cloud_connection: 云连接实例。
     */
    public static final class ResourceTypeEnum {

        /**
         * Enum CLOUD_CONNECTION for value: "cloud_connection"
         */
        public static final ResourceTypeEnum CLOUD_CONNECTION = new ResourceTypeEnum("cloud_connection");

        private static final Map<String, ResourceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResourceTypeEnum> createStaticFields() {
            Map<String, ResourceTypeEnum> map = new HashMap<>();
            map.put("cloud_connection", CLOUD_CONNECTION);
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

    /**
     * 互通类型: - Area: 大区互通 - Region: 城域互通
     */
    public static final class InterflowModeEnum {

        /**
         * Enum AREA for value: "Area"
         */
        public static final InterflowModeEnum AREA = new InterflowModeEnum("Area");

        /**
         * Enum REGION for value: "Region"
         */
        public static final InterflowModeEnum REGION = new InterflowModeEnum("Region");

        private static final Map<String, InterflowModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, InterflowModeEnum> createStaticFields() {
            Map<String, InterflowModeEnum> map = new HashMap<>();
            map.put("Area", AREA);
            map.put("Region", REGION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        InterflowModeEnum(String value) {
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
        public static InterflowModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new InterflowModeEnum(value));
        }

        public static InterflowModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof InterflowModeEnum) {
                return this.value.equals(((InterflowModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interflow_mode")

    private InterflowModeEnum interflowMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_code")

    private String specCode;

    public CreateBandwidthPackage withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 带宽包实例的名字。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateBandwidthPackage withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 带宽包实例的描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateBandwidthPackage withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 带宽包实例所属的企业项目ID。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CreateBandwidthPackage withLocalAreaId(LocalAreaIdEnum localAreaId) {
        this.localAreaId = localAreaId;
        return this;
    }

    /**
     * 本端大区。 云连接支持的大区有： | Chinese-Mainland | 中国大陆 | | Asia-Pacific | 亚太 | | Africa | 非洲 | | Western-Latin-America | 拉美西 | | Eastern-Latin-America | 拉美东 | | Northern-Latin-America | 拉美北 |
     * @return localAreaId
     */
    public LocalAreaIdEnum getLocalAreaId() {
        return localAreaId;
    }

    public void setLocalAreaId(LocalAreaIdEnum localAreaId) {
        this.localAreaId = localAreaId;
    }

    public CreateBandwidthPackage withRemoteAreaId(RemoteAreaIdEnum remoteAreaId) {
        this.remoteAreaId = remoteAreaId;
        return this;
    }

    /**
     * 远端大区。 云连接支持的大区有： | Chinese-Mainland | 中国大陆 | | Asia-Pacific | 亚太 | | Africa | 非洲 | | Western-Latin-America | 拉美西 | | Eastern-Latin-America | 拉美东 | | Northern-Latin-America | 拉美北 |
     * @return remoteAreaId
     */
    public RemoteAreaIdEnum getRemoteAreaId() {
        return remoteAreaId;
    }

    public void setRemoteAreaId(RemoteAreaIdEnum remoteAreaId) {
        this.remoteAreaId = remoteAreaId;
    }

    public CreateBandwidthPackage withChargeMode(ChargeModeEnum chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    /**
     * 带宽包实例的计费方式。 bandwidth是按带宽计费。
     * @return chargeMode
     */
    public ChargeModeEnum getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(ChargeModeEnum chargeMode) {
        this.chargeMode = chargeMode;
    }

    public CreateBandwidthPackage withBillingMode(BillingModeEnum billingMode) {
        this.billingMode = billingMode;
        return this;
    }

    /**
     * 带宽包实例在大陆站或国际站的计费方式： - 3：大陆站按需计费 - 4：国际站按需计费 - 5：大陆站按95方式计费 - 6：国际站按95方式计费
     * @return billingMode
     */
    public BillingModeEnum getBillingMode() {
        return billingMode;
    }

    public void setBillingMode(BillingModeEnum billingMode) {
        this.billingMode = billingMode;
    }

    public CreateBandwidthPackage withBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    /**
     * 带宽包实例中的带宽值。
     * minimum: 2
     * maximum: 999999
     * @return bandwidth
     */
    public Integer getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    public CreateBandwidthPackage withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public CreateBandwidthPackage withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 带宽包实例绑定的资源ID。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public CreateBandwidthPackage withResourceType(ResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 带宽包实例绑定的资源类型。  cloud_connection: 云连接实例。
     * @return resourceType
     */
    public ResourceTypeEnum getResourceType() {
        return resourceType;
    }

    public void setResourceType(ResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
    }

    public CreateBandwidthPackage withInterflowMode(InterflowModeEnum interflowMode) {
        this.interflowMode = interflowMode;
        return this;
    }

    /**
     * 互通类型: - Area: 大区互通 - Region: 城域互通
     * @return interflowMode
     */
    public InterflowModeEnum getInterflowMode() {
        return interflowMode;
    }

    public void setInterflowMode(InterflowModeEnum interflowMode) {
        this.interflowMode = interflowMode;
    }

    public CreateBandwidthPackage withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    /**
     * 产品编码。
     * @return specCode
     */
    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateBandwidthPackage that = (CreateBandwidthPackage) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.localAreaId, that.localAreaId)
            && Objects.equals(this.remoteAreaId, that.remoteAreaId) && Objects.equals(this.chargeMode, that.chargeMode)
            && Objects.equals(this.billingMode, that.billingMode) && Objects.equals(this.bandwidth, that.bandwidth)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.interflowMode, that.interflowMode) && Objects.equals(this.specCode, that.specCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            description,
            enterpriseProjectId,
            localAreaId,
            remoteAreaId,
            chargeMode,
            billingMode,
            bandwidth,
            projectId,
            resourceId,
            resourceType,
            interflowMode,
            specCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateBandwidthPackage {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    localAreaId: ").append(toIndentedString(localAreaId)).append("\n");
        sb.append("    remoteAreaId: ").append(toIndentedString(remoteAreaId)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    billingMode: ").append(toIndentedString(billingMode)).append("\n");
        sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    interflowMode: ").append(toIndentedString(interflowMode)).append("\n");
        sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
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
