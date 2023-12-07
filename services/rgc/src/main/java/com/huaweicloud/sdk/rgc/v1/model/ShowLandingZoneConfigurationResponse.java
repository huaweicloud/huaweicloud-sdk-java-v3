package com.huaweicloud.sdk.rgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowLandingZoneConfigurationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "common_configuration")

    private CommonConfiguration commonConfiguration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logging_configuration")

    private LoggingConfiguration loggingConfiguration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organization_structure")

    private List<OrganizationStructureBaseLine> organizationStructure = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regions")

    private List<RegionConfigurationList> regions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identity_store_email")

    private String identityStoreEmail;

    public ShowLandingZoneConfigurationResponse withCommonConfiguration(CommonConfiguration commonConfiguration) {
        this.commonConfiguration = commonConfiguration;
        return this;
    }

    public ShowLandingZoneConfigurationResponse withCommonConfiguration(
        Consumer<CommonConfiguration> commonConfigurationSetter) {
        if (this.commonConfiguration == null) {
            this.commonConfiguration = new CommonConfiguration();
            commonConfigurationSetter.accept(this.commonConfiguration);
        }

        return this;
    }

    /**
     * Get commonConfiguration
     * @return commonConfiguration
     */
    public CommonConfiguration getCommonConfiguration() {
        return commonConfiguration;
    }

    public void setCommonConfiguration(CommonConfiguration commonConfiguration) {
        this.commonConfiguration = commonConfiguration;
    }

    public ShowLandingZoneConfigurationResponse withLoggingConfiguration(LoggingConfiguration loggingConfiguration) {
        this.loggingConfiguration = loggingConfiguration;
        return this;
    }

    public ShowLandingZoneConfigurationResponse withLoggingConfiguration(
        Consumer<LoggingConfiguration> loggingConfigurationSetter) {
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

    public ShowLandingZoneConfigurationResponse withOrganizationStructure(
        List<OrganizationStructureBaseLine> organizationStructure) {
        this.organizationStructure = organizationStructure;
        return this;
    }

    public ShowLandingZoneConfigurationResponse addOrganizationStructureItem(
        OrganizationStructureBaseLine organizationStructureItem) {
        if (this.organizationStructure == null) {
            this.organizationStructure = new ArrayList<>();
        }
        this.organizationStructure.add(organizationStructureItem);
        return this;
    }

    public ShowLandingZoneConfigurationResponse withOrganizationStructure(
        Consumer<List<OrganizationStructureBaseLine>> organizationStructureSetter) {
        if (this.organizationStructure == null) {
            this.organizationStructure = new ArrayList<>();
        }
        organizationStructureSetter.accept(this.organizationStructure);
        return this;
    }

    /**
     * Get organizationStructure
     * @return organizationStructure
     */
    public List<OrganizationStructureBaseLine> getOrganizationStructure() {
        return organizationStructure;
    }

    public void setOrganizationStructure(List<OrganizationStructureBaseLine> organizationStructure) {
        this.organizationStructure = organizationStructure;
    }

    public ShowLandingZoneConfigurationResponse withRegions(List<RegionConfigurationList> regions) {
        this.regions = regions;
        return this;
    }

    public ShowLandingZoneConfigurationResponse addRegionsItem(RegionConfigurationList regionsItem) {
        if (this.regions == null) {
            this.regions = new ArrayList<>();
        }
        this.regions.add(regionsItem);
        return this;
    }

    public ShowLandingZoneConfigurationResponse withRegions(Consumer<List<RegionConfigurationList>> regionsSetter) {
        if (this.regions == null) {
            this.regions = new ArrayList<>();
        }
        regionsSetter.accept(this.regions);
        return this;
    }

    /**
     * 纳管的区域
     * @return regions
     */
    public List<RegionConfigurationList> getRegions() {
        return regions;
    }

    public void setRegions(List<RegionConfigurationList> regions) {
        this.regions = regions;
    }

    public ShowLandingZoneConfigurationResponse withIdentityStoreEmail(String identityStoreEmail) {
        this.identityStoreEmail = identityStoreEmail;
        return this;
    }

    /**
     * 管理员账号创建Identity Center用户所用邮箱
     * @return identityStoreEmail
     */
    public String getIdentityStoreEmail() {
        return identityStoreEmail;
    }

    public void setIdentityStoreEmail(String identityStoreEmail) {
        this.identityStoreEmail = identityStoreEmail;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowLandingZoneConfigurationResponse that = (ShowLandingZoneConfigurationResponse) obj;
        return Objects.equals(this.commonConfiguration, that.commonConfiguration)
            && Objects.equals(this.loggingConfiguration, that.loggingConfiguration)
            && Objects.equals(this.organizationStructure, that.organizationStructure)
            && Objects.equals(this.regions, that.regions)
            && Objects.equals(this.identityStoreEmail, that.identityStoreEmail);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(commonConfiguration, loggingConfiguration, organizationStructure, regions, identityStoreEmail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowLandingZoneConfigurationResponse {\n");
        sb.append("    commonConfiguration: ").append(toIndentedString(commonConfiguration)).append("\n");
        sb.append("    loggingConfiguration: ").append(toIndentedString(loggingConfiguration)).append("\n");
        sb.append("    organizationStructure: ").append(toIndentedString(organizationStructure)).append("\n");
        sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
        sb.append("    identityStoreEmail: ").append(toIndentedString(identityStoreEmail)).append("\n");
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
