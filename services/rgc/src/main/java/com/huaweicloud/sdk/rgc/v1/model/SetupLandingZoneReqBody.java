package com.huaweicloud.sdk.rgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * The request body of the CreateResourceShare operation.
 */
public class SetupLandingZoneReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identity_store_email")

    private String identityStoreEmail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "home_region")

    private String homeRegion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "setup_landing_zone_action_type")

    private String setupLandingZoneActionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_configuration_list")

    private List<RegionConfigurationList> regionConfigurationList = null;

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

    private SetupLandingZoneReqBodyLoggingConfiguration loggingConfiguration;

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

    public SetupLandingZoneReqBody withSetupLandingZoneActionType(String setupLandingZoneActionType) {
        this.setupLandingZoneActionType = setupLandingZoneActionType;
        return this;
    }

    /**
     * 设置Landing Zone的类型。包括CREATE、REPAIR以及UPDATE。
     * @return setupLandingZoneActionType
     */
    public String getSetupLandingZoneActionType() {
        return setupLandingZoneActionType;
    }

    public void setSetupLandingZoneActionType(String setupLandingZoneActionType) {
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

    public SetupLandingZoneReqBody withLoggingConfiguration(
        SetupLandingZoneReqBodyLoggingConfiguration loggingConfiguration) {
        this.loggingConfiguration = loggingConfiguration;
        return this;
    }

    public SetupLandingZoneReqBody withLoggingConfiguration(
        Consumer<SetupLandingZoneReqBodyLoggingConfiguration> loggingConfigurationSetter) {
        if (this.loggingConfiguration == null) {
            this.loggingConfiguration = new SetupLandingZoneReqBodyLoggingConfiguration();
            loggingConfigurationSetter.accept(this.loggingConfiguration);
        }

        return this;
    }

    /**
     * Get loggingConfiguration
     * @return loggingConfiguration
     */
    public SetupLandingZoneReqBodyLoggingConfiguration getLoggingConfiguration() {
        return loggingConfiguration;
    }

    public void setLoggingConfiguration(SetupLandingZoneReqBodyLoggingConfiguration loggingConfiguration) {
        this.loggingConfiguration = loggingConfiguration;
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
            && Objects.equals(this.organizationStructure, that.organizationStructure)
            && Objects.equals(this.denyUngovernedRegions, that.denyUngovernedRegions)
            && Objects.equals(this.cloudTrailType, that.cloudTrailType) && Objects.equals(this.kmsKeyId, that.kmsKeyId)
            && Objects.equals(this.loggingConfiguration, that.loggingConfiguration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identityStoreEmail,
            homeRegion,
            setupLandingZoneActionType,
            regionConfigurationList,
            organizationStructure,
            denyUngovernedRegions,
            cloudTrailType,
            kmsKeyId,
            loggingConfiguration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetupLandingZoneReqBody {\n");
        sb.append("    identityStoreEmail: ").append(toIndentedString(identityStoreEmail)).append("\n");
        sb.append("    homeRegion: ").append(toIndentedString(homeRegion)).append("\n");
        sb.append("    setupLandingZoneActionType: ").append(toIndentedString(setupLandingZoneActionType)).append("\n");
        sb.append("    regionConfigurationList: ").append(toIndentedString(regionConfigurationList)).append("\n");
        sb.append("    organizationStructure: ").append(toIndentedString(organizationStructure)).append("\n");
        sb.append("    denyUngovernedRegions: ").append(toIndentedString(denyUngovernedRegions)).append("\n");
        sb.append("    cloudTrailType: ").append(toIndentedString(cloudTrailType)).append("\n");
        sb.append("    kmsKeyId: ").append(toIndentedString(kmsKeyId)).append("\n");
        sb.append("    loggingConfiguration: ").append(toIndentedString(loggingConfiguration)).append("\n");
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
