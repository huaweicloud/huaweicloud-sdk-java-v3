package com.huaweicloud.sdk.rgc.v1.model;

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
 * 设置Landing Zone的参数。
 */
public class SetupLandingZoneReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identity_store_email")

    private String identityStoreEmail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "home_region")

    private String homeRegion;

    /**
     * 设置Landing Zone的类型。包括CREATE、REPAIR以及UPDATE。
     */
    public static final class SetupLandingZoneActionTypeEnum {

        /**
         * Enum CREATE for value: "CREATE"
         */
        public static final SetupLandingZoneActionTypeEnum CREATE = new SetupLandingZoneActionTypeEnum("CREATE");

        /**
         * Enum UPDATE for value: "UPDATE"
         */
        public static final SetupLandingZoneActionTypeEnum UPDATE = new SetupLandingZoneActionTypeEnum("UPDATE");

        /**
         * Enum REPAIR for value: "REPAIR"
         */
        public static final SetupLandingZoneActionTypeEnum REPAIR = new SetupLandingZoneActionTypeEnum("REPAIR");

        private static final Map<String, SetupLandingZoneActionTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SetupLandingZoneActionTypeEnum> createStaticFields() {
            Map<String, SetupLandingZoneActionTypeEnum> map = new HashMap<>();
            map.put("CREATE", CREATE);
            map.put("UPDATE", UPDATE);
            map.put("REPAIR", REPAIR);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SetupLandingZoneActionTypeEnum(String value) {
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
        public static SetupLandingZoneActionTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElse(new SetupLandingZoneActionTypeEnum(value));
        }

        public static SetupLandingZoneActionTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SetupLandingZoneActionTypeEnum) {
                return this.value.equals(((SetupLandingZoneActionTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "setup_landing_zone_action_type")

    private SetupLandingZoneActionTypeEnum setupLandingZoneActionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_configuration_list")

    private List<RegionConfigurationList> regionConfigurationList = null;

    /**
     * 是否设置Landing Zone的identity center。
     */
    public static final class IdentityCenterStatusEnum {

        /**
         * Enum ENABLE for value: "ENABLE"
         */
        public static final IdentityCenterStatusEnum ENABLE = new IdentityCenterStatusEnum("ENABLE");

        /**
         * Enum DISABLE for value: "DISABLE"
         */
        public static final IdentityCenterStatusEnum DISABLE = new IdentityCenterStatusEnum("DISABLE");

        private static final Map<String, IdentityCenterStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, IdentityCenterStatusEnum> createStaticFields() {
            Map<String, IdentityCenterStatusEnum> map = new HashMap<>();
            map.put("ENABLE", ENABLE);
            map.put("DISABLE", DISABLE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        IdentityCenterStatusEnum(String value) {
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
        public static IdentityCenterStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new IdentityCenterStatusEnum(value));
        }

        public static IdentityCenterStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof IdentityCenterStatusEnum) {
                return this.value.equals(((IdentityCenterStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identity_center_status")

    private IdentityCenterStatusEnum identityCenterStatus;

    /**
     * 设置organization的类型。STANDARD和NON_STANDARD。
     */
    public static final class OrganizationStructureTypeEnum {

        /**
         * Enum STANDARD for value: "STANDARD"
         */
        public static final OrganizationStructureTypeEnum STANDARD = new OrganizationStructureTypeEnum("STANDARD");

        /**
         * Enum NON_STANDARD for value: "NON_STANDARD"
         */
        public static final OrganizationStructureTypeEnum NON_STANDARD =
            new OrganizationStructureTypeEnum("NON_STANDARD");

        private static final Map<String, OrganizationStructureTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OrganizationStructureTypeEnum> createStaticFields() {
            Map<String, OrganizationStructureTypeEnum> map = new HashMap<>();
            map.put("STANDARD", STANDARD);
            map.put("NON_STANDARD", NON_STANDARD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OrganizationStructureTypeEnum(String value) {
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
        public static OrganizationStructureTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElse(new OrganizationStructureTypeEnum(value));
        }

        public static OrganizationStructureTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OrganizationStructureTypeEnum) {
                return this.value.equals(((OrganizationStructureTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organization_structure_type")

    private OrganizationStructureTypeEnum organizationStructureType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organization_structure")

    private List<OrganizationStructureBaseLine> organizationStructure = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deny_ungoverned_regions")

    private Boolean denyUngovernedRegions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_trail_type")

    private Boolean cloudTrailType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kms_key_id")

    private String kmsKeyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logging_configuration")

    private LoggingConfiguration loggingConfiguration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "baseline_version")

    private String baselineVersion;

    public SetupLandingZoneReqBody withIdentityStoreEmail(String identityStoreEmail) {
        this.identityStoreEmail = identityStoreEmail;
        return this;
    }

    /**
     * 管理员纳管账号创建Identity Center用户所用邮箱。
     * @return identityStoreEmail
     */
    public String getIdentityStoreEmail() {
        return identityStoreEmail;
    }

    public void setIdentityStoreEmail(String identityStoreEmail) {
        this.identityStoreEmail = identityStoreEmail;
    }

    public SetupLandingZoneReqBody withHomeRegion(String homeRegion) {
        this.homeRegion = homeRegion;
        return this;
    }

    /**
     * 主区域。
     * @return homeRegion
     */
    public String getHomeRegion() {
        return homeRegion;
    }

    public void setHomeRegion(String homeRegion) {
        this.homeRegion = homeRegion;
    }

    public SetupLandingZoneReqBody withSetupLandingZoneActionType(
        SetupLandingZoneActionTypeEnum setupLandingZoneActionType) {
        this.setupLandingZoneActionType = setupLandingZoneActionType;
        return this;
    }

    /**
     * 设置Landing Zone的类型。包括CREATE、REPAIR以及UPDATE。
     * @return setupLandingZoneActionType
     */
    public SetupLandingZoneActionTypeEnum getSetupLandingZoneActionType() {
        return setupLandingZoneActionType;
    }

    public void setSetupLandingZoneActionType(SetupLandingZoneActionTypeEnum setupLandingZoneActionType) {
        this.setupLandingZoneActionType = setupLandingZoneActionType;
    }

    public SetupLandingZoneReqBody withRegionConfigurationList(List<RegionConfigurationList> regionConfigurationList) {
        this.regionConfigurationList = regionConfigurationList;
        return this;
    }

    public SetupLandingZoneReqBody addRegionConfigurationListItem(RegionConfigurationList regionConfigurationListItem) {
        if (this.regionConfigurationList == null) {
            this.regionConfigurationList = new ArrayList<>();
        }
        this.regionConfigurationList.add(regionConfigurationListItem);
        return this;
    }

    public SetupLandingZoneReqBody withRegionConfigurationList(
        Consumer<List<RegionConfigurationList>> regionConfigurationListSetter) {
        if (this.regionConfigurationList == null) {
            this.regionConfigurationList = new ArrayList<>();
        }
        regionConfigurationListSetter.accept(this.regionConfigurationList);
        return this;
    }

    /**
     * 当前纳管账号纳管的区域。
     * @return regionConfigurationList
     */
    public List<RegionConfigurationList> getRegionConfigurationList() {
        return regionConfigurationList;
    }

    public void setRegionConfigurationList(List<RegionConfigurationList> regionConfigurationList) {
        this.regionConfigurationList = regionConfigurationList;
    }

    public SetupLandingZoneReqBody withIdentityCenterStatus(IdentityCenterStatusEnum identityCenterStatus) {
        this.identityCenterStatus = identityCenterStatus;
        return this;
    }

    /**
     * 是否设置Landing Zone的identity center。
     * @return identityCenterStatus
     */
    public IdentityCenterStatusEnum getIdentityCenterStatus() {
        return identityCenterStatus;
    }

    public void setIdentityCenterStatus(IdentityCenterStatusEnum identityCenterStatus) {
        this.identityCenterStatus = identityCenterStatus;
    }

    public SetupLandingZoneReqBody withOrganizationStructureType(
        OrganizationStructureTypeEnum organizationStructureType) {
        this.organizationStructureType = organizationStructureType;
        return this;
    }

    /**
     * 设置organization的类型。STANDARD和NON_STANDARD。
     * @return organizationStructureType
     */
    public OrganizationStructureTypeEnum getOrganizationStructureType() {
        return organizationStructureType;
    }

    public void setOrganizationStructureType(OrganizationStructureTypeEnum organizationStructureType) {
        this.organizationStructureType = organizationStructureType;
    }

    public SetupLandingZoneReqBody withOrganizationStructure(
        List<OrganizationStructureBaseLine> organizationStructure) {
        this.organizationStructure = organizationStructure;
        return this;
    }

    public SetupLandingZoneReqBody addOrganizationStructureItem(
        OrganizationStructureBaseLine organizationStructureItem) {
        if (this.organizationStructure == null) {
            this.organizationStructure = new ArrayList<>();
        }
        this.organizationStructure.add(organizationStructureItem);
        return this;
    }

    public SetupLandingZoneReqBody withOrganizationStructure(
        Consumer<List<OrganizationStructureBaseLine>> organizationStructureSetter) {
        if (this.organizationStructure == null) {
            this.organizationStructure = new ArrayList<>();
        }
        organizationStructureSetter.accept(this.organizationStructure);
        return this;
    }

    /**
     * 基础环境的纳管账号体系。
     * @return organizationStructure
     */
    public List<OrganizationStructureBaseLine> getOrganizationStructure() {
        return organizationStructure;
    }

    public void setOrganizationStructure(List<OrganizationStructureBaseLine> organizationStructure) {
        this.organizationStructure = organizationStructure;
    }

    public SetupLandingZoneReqBody withDenyUngovernedRegions(Boolean denyUngovernedRegions) {
        this.denyUngovernedRegions = denyUngovernedRegions;
        return this;
    }

    /**
     * 是否允许区域拒绝，默认false。
     * @return denyUngovernedRegions
     */
    public Boolean getDenyUngovernedRegions() {
        return denyUngovernedRegions;
    }

    public void setDenyUngovernedRegions(Boolean denyUngovernedRegions) {
        this.denyUngovernedRegions = denyUngovernedRegions;
    }

    public SetupLandingZoneReqBody withCloudTrailType(Boolean cloudTrailType) {
        this.cloudTrailType = cloudTrailType;
        return this;
    }

    /**
     * 是否允许设置组织汇聚。
     * @return cloudTrailType
     */
    public Boolean getCloudTrailType() {
        return cloudTrailType;
    }

    public void setCloudTrailType(Boolean cloudTrailType) {
        this.cloudTrailType = cloudTrailType;
    }

    public SetupLandingZoneReqBody withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * 加密字段。
     * @return kmsKeyId
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    public SetupLandingZoneReqBody withLoggingConfiguration(LoggingConfiguration loggingConfiguration) {
        this.loggingConfiguration = loggingConfiguration;
        return this;
    }

    public SetupLandingZoneReqBody withLoggingConfiguration(Consumer<LoggingConfiguration> loggingConfigurationSetter) {
        if (this.loggingConfiguration == null) {
            this.loggingConfiguration = new LoggingConfiguration();
            loggingConfigurationSetter.accept(this.loggingConfiguration);
        }

        return this;
    }

    /**
     * Get loggingConfiguration
     * @return loggingConfiguration
     */
    public LoggingConfiguration getLoggingConfiguration() {
        return loggingConfiguration;
    }

    public void setLoggingConfiguration(LoggingConfiguration loggingConfiguration) {
        this.loggingConfiguration = loggingConfiguration;
    }

    public SetupLandingZoneReqBody withBaselineVersion(String baselineVersion) {
        this.baselineVersion = baselineVersion;
        return this;
    }

    /**
     * 基线版本
     * @return baselineVersion
     */
    public String getBaselineVersion() {
        return baselineVersion;
    }

    public void setBaselineVersion(String baselineVersion) {
        this.baselineVersion = baselineVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetupLandingZoneReqBody that = (SetupLandingZoneReqBody) obj;
        return Objects.equals(this.identityStoreEmail, that.identityStoreEmail)
            && Objects.equals(this.homeRegion, that.homeRegion)
            && Objects.equals(this.setupLandingZoneActionType, that.setupLandingZoneActionType)
            && Objects.equals(this.regionConfigurationList, that.regionConfigurationList)
            && Objects.equals(this.identityCenterStatus, that.identityCenterStatus)
            && Objects.equals(this.organizationStructureType, that.organizationStructureType)
            && Objects.equals(this.organizationStructure, that.organizationStructure)
            && Objects.equals(this.denyUngovernedRegions, that.denyUngovernedRegions)
            && Objects.equals(this.cloudTrailType, that.cloudTrailType) && Objects.equals(this.kmsKeyId, that.kmsKeyId)
            && Objects.equals(this.loggingConfiguration, that.loggingConfiguration)
            && Objects.equals(this.baselineVersion, that.baselineVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identityStoreEmail,
            homeRegion,
            setupLandingZoneActionType,
            regionConfigurationList,
            identityCenterStatus,
            organizationStructureType,
            organizationStructure,
            denyUngovernedRegions,
            cloudTrailType,
            kmsKeyId,
            loggingConfiguration,
            baselineVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetupLandingZoneReqBody {\n");
        sb.append("    identityStoreEmail: ").append(toIndentedString(identityStoreEmail)).append("\n");
        sb.append("    homeRegion: ").append(toIndentedString(homeRegion)).append("\n");
        sb.append("    setupLandingZoneActionType: ").append(toIndentedString(setupLandingZoneActionType)).append("\n");
        sb.append("    regionConfigurationList: ").append(toIndentedString(regionConfigurationList)).append("\n");
        sb.append("    identityCenterStatus: ").append(toIndentedString(identityCenterStatus)).append("\n");
        sb.append("    organizationStructureType: ").append(toIndentedString(organizationStructureType)).append("\n");
        sb.append("    organizationStructure: ").append(toIndentedString(organizationStructure)).append("\n");
        sb.append("    denyUngovernedRegions: ").append(toIndentedString(denyUngovernedRegions)).append("\n");
        sb.append("    cloudTrailType: ").append(toIndentedString(cloudTrailType)).append("\n");
        sb.append("    kmsKeyId: ").append(toIndentedString(kmsKeyId)).append("\n");
        sb.append("    loggingConfiguration: ").append(toIndentedString(loggingConfiguration)).append("\n");
        sb.append("    baselineVersion: ").append(toIndentedString(baselineVersion)).append("\n");
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
