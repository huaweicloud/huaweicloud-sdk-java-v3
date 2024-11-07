package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 分支网络租户能力详情条目。
 */
public class SiteNetworkCapabilityEntry {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "specification")

    private SiteNetworkSpecificationEnum specification;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support")

    private Boolean isSupport;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support_enterprise_project")

    private Boolean isSupportEnterpriseProject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support_tag")

    private Boolean isSupportTag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support_intra_region")

    private Boolean isSupportIntraRegion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_topologies")

    private List<SiteNetworkTopologyEnum> supportTopologies = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_regions")

    private List<String> supportRegions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_dscp_regions")

    private List<String> supportDscpRegions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_freeze_regions")

    private List<String> supportFreezeRegions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_locations")

    private List<String> supportLocations = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size_range")

    private ConnectionBandwidthSizeRange sizeRange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_mode")

    private List<ConnectionBandwidthChargeModeEnum> chargeMode = null;

    public SiteNetworkCapabilityEntry withId(String id) {
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

    public SiteNetworkCapabilityEntry withDomainId(String domainId) {
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

    public SiteNetworkCapabilityEntry withSpecification(SiteNetworkSpecificationEnum specification) {
        this.specification = specification;
        return this;
    }

    /**
     * Get specification
     * @return specification
     */
    public SiteNetworkSpecificationEnum getSpecification() {
        return specification;
    }

    public void setSpecification(SiteNetworkSpecificationEnum specification) {
        this.specification = specification;
    }

    public SiteNetworkCapabilityEntry withIsSupport(Boolean isSupport) {
        this.isSupport = isSupport;
        return this;
    }

    /**
     * 是否支持分支网络。
     * @return isSupport
     */
    public Boolean getIsSupport() {
        return isSupport;
    }

    public void setIsSupport(Boolean isSupport) {
        this.isSupport = isSupport;
    }

    public SiteNetworkCapabilityEntry withIsSupportEnterpriseProject(Boolean isSupportEnterpriseProject) {
        this.isSupportEnterpriseProject = isSupportEnterpriseProject;
        return this;
    }

    /**
     * 是否支持分支网络企业项目。
     * @return isSupportEnterpriseProject
     */
    public Boolean getIsSupportEnterpriseProject() {
        return isSupportEnterpriseProject;
    }

    public void setIsSupportEnterpriseProject(Boolean isSupportEnterpriseProject) {
        this.isSupportEnterpriseProject = isSupportEnterpriseProject;
    }

    public SiteNetworkCapabilityEntry withIsSupportTag(Boolean isSupportTag) {
        this.isSupportTag = isSupportTag;
        return this;
    }

    /**
     * 是否支持分支网络标签。
     * @return isSupportTag
     */
    public Boolean getIsSupportTag() {
        return isSupportTag;
    }

    public void setIsSupportTag(Boolean isSupportTag) {
        this.isSupportTag = isSupportTag;
    }

    public SiteNetworkCapabilityEntry withIsSupportIntraRegion(Boolean isSupportIntraRegion) {
        this.isSupportIntraRegion = isSupportIntraRegion;
        return this;
    }

    /**
     * 是否支持创建同region分支网络。
     * @return isSupportIntraRegion
     */
    public Boolean getIsSupportIntraRegion() {
        return isSupportIntraRegion;
    }

    public void setIsSupportIntraRegion(Boolean isSupportIntraRegion) {
        this.isSupportIntraRegion = isSupportIntraRegion;
    }

    public SiteNetworkCapabilityEntry withSupportTopologies(List<SiteNetworkTopologyEnum> supportTopologies) {
        this.supportTopologies = supportTopologies;
        return this;
    }

    public SiteNetworkCapabilityEntry addSupportTopologiesItem(SiteNetworkTopologyEnum supportTopologiesItem) {
        if (this.supportTopologies == null) {
            this.supportTopologies = new ArrayList<>();
        }
        this.supportTopologies.add(supportTopologiesItem);
        return this;
    }

    public SiteNetworkCapabilityEntry withSupportTopologies(
        Consumer<List<SiteNetworkTopologyEnum>> supportTopologiesSetter) {
        if (this.supportTopologies == null) {
            this.supportTopologies = new ArrayList<>();
        }
        supportTopologiesSetter.accept(this.supportTopologies);
        return this;
    }

    /**
     * 分支网络的拓扑列表。
     * @return supportTopologies
     */
    public List<SiteNetworkTopologyEnum> getSupportTopologies() {
        return supportTopologies;
    }

    public void setSupportTopologies(List<SiteNetworkTopologyEnum> supportTopologies) {
        this.supportTopologies = supportTopologies;
    }

    public SiteNetworkCapabilityEntry withSupportRegions(List<String> supportRegions) {
        this.supportRegions = supportRegions;
        return this;
    }

    public SiteNetworkCapabilityEntry addSupportRegionsItem(String supportRegionsItem) {
        if (this.supportRegions == null) {
            this.supportRegions = new ArrayList<>();
        }
        this.supportRegions.add(supportRegionsItem);
        return this;
    }

    public SiteNetworkCapabilityEntry withSupportRegions(Consumer<List<String>> supportRegionsSetter) {
        if (this.supportRegions == null) {
            this.supportRegions = new ArrayList<>();
        }
        supportRegionsSetter.accept(this.supportRegions);
        return this;
    }

    /**
     * list类型
     * @return supportRegions
     */
    public List<String> getSupportRegions() {
        return supportRegions;
    }

    public void setSupportRegions(List<String> supportRegions) {
        this.supportRegions = supportRegions;
    }

    public SiteNetworkCapabilityEntry withSupportDscpRegions(List<String> supportDscpRegions) {
        this.supportDscpRegions = supportDscpRegions;
        return this;
    }

    public SiteNetworkCapabilityEntry addSupportDscpRegionsItem(String supportDscpRegionsItem) {
        if (this.supportDscpRegions == null) {
            this.supportDscpRegions = new ArrayList<>();
        }
        this.supportDscpRegions.add(supportDscpRegionsItem);
        return this;
    }

    public SiteNetworkCapabilityEntry withSupportDscpRegions(Consumer<List<String>> supportDscpRegionsSetter) {
        if (this.supportDscpRegions == null) {
            this.supportDscpRegions = new ArrayList<>();
        }
        supportDscpRegionsSetter.accept(this.supportDscpRegions);
        return this;
    }

    /**
     * list类型
     * @return supportDscpRegions
     */
    public List<String> getSupportDscpRegions() {
        return supportDscpRegions;
    }

    public void setSupportDscpRegions(List<String> supportDscpRegions) {
        this.supportDscpRegions = supportDscpRegions;
    }

    public SiteNetworkCapabilityEntry withSupportFreezeRegions(List<String> supportFreezeRegions) {
        this.supportFreezeRegions = supportFreezeRegions;
        return this;
    }

    public SiteNetworkCapabilityEntry addSupportFreezeRegionsItem(String supportFreezeRegionsItem) {
        if (this.supportFreezeRegions == null) {
            this.supportFreezeRegions = new ArrayList<>();
        }
        this.supportFreezeRegions.add(supportFreezeRegionsItem);
        return this;
    }

    public SiteNetworkCapabilityEntry withSupportFreezeRegions(Consumer<List<String>> supportFreezeRegionsSetter) {
        if (this.supportFreezeRegions == null) {
            this.supportFreezeRegions = new ArrayList<>();
        }
        supportFreezeRegionsSetter.accept(this.supportFreezeRegions);
        return this;
    }

    /**
     * list类型
     * @return supportFreezeRegions
     */
    public List<String> getSupportFreezeRegions() {
        return supportFreezeRegions;
    }

    public void setSupportFreezeRegions(List<String> supportFreezeRegions) {
        this.supportFreezeRegions = supportFreezeRegions;
    }

    public SiteNetworkCapabilityEntry withSupportLocations(List<String> supportLocations) {
        this.supportLocations = supportLocations;
        return this;
    }

    public SiteNetworkCapabilityEntry addSupportLocationsItem(String supportLocationsItem) {
        if (this.supportLocations == null) {
            this.supportLocations = new ArrayList<>();
        }
        this.supportLocations.add(supportLocationsItem);
        return this;
    }

    public SiteNetworkCapabilityEntry withSupportLocations(Consumer<List<String>> supportLocationsSetter) {
        if (this.supportLocations == null) {
            this.supportLocations = new ArrayList<>();
        }
        supportLocationsSetter.accept(this.supportLocations);
        return this;
    }

    /**
     * list类型
     * @return supportLocations
     */
    public List<String> getSupportLocations() {
        return supportLocations;
    }

    public void setSupportLocations(List<String> supportLocations) {
        this.supportLocations = supportLocations;
    }

    public SiteNetworkCapabilityEntry withSizeRange(ConnectionBandwidthSizeRange sizeRange) {
        this.sizeRange = sizeRange;
        return this;
    }

    public SiteNetworkCapabilityEntry withSizeRange(Consumer<ConnectionBandwidthSizeRange> sizeRangeSetter) {
        if (this.sizeRange == null) {
            this.sizeRange = new ConnectionBandwidthSizeRange();
            sizeRangeSetter.accept(this.sizeRange);
        }

        return this;
    }

    /**
     * Get sizeRange
     * @return sizeRange
     */
    public ConnectionBandwidthSizeRange getSizeRange() {
        return sizeRange;
    }

    public void setSizeRange(ConnectionBandwidthSizeRange sizeRange) {
        this.sizeRange = sizeRange;
    }

    public SiteNetworkCapabilityEntry withChargeMode(List<ConnectionBandwidthChargeModeEnum> chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    public SiteNetworkCapabilityEntry addChargeModeItem(ConnectionBandwidthChargeModeEnum chargeModeItem) {
        if (this.chargeMode == null) {
            this.chargeMode = new ArrayList<>();
        }
        this.chargeMode.add(chargeModeItem);
        return this;
    }

    public SiteNetworkCapabilityEntry withChargeMode(
        Consumer<List<ConnectionBandwidthChargeModeEnum>> chargeModeSetter) {
        if (this.chargeMode == null) {
            this.chargeMode = new ArrayList<>();
        }
        chargeModeSetter.accept(this.chargeMode);
        return this;
    }

    /**
     * list类型
     * @return chargeMode
     */
    public List<ConnectionBandwidthChargeModeEnum> getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(List<ConnectionBandwidthChargeModeEnum> chargeMode) {
        this.chargeMode = chargeMode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SiteNetworkCapabilityEntry that = (SiteNetworkCapabilityEntry) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.specification, that.specification) && Objects.equals(this.isSupport, that.isSupport)
            && Objects.equals(this.isSupportEnterpriseProject, that.isSupportEnterpriseProject)
            && Objects.equals(this.isSupportTag, that.isSupportTag)
            && Objects.equals(this.isSupportIntraRegion, that.isSupportIntraRegion)
            && Objects.equals(this.supportTopologies, that.supportTopologies)
            && Objects.equals(this.supportRegions, that.supportRegions)
            && Objects.equals(this.supportDscpRegions, that.supportDscpRegions)
            && Objects.equals(this.supportFreezeRegions, that.supportFreezeRegions)
            && Objects.equals(this.supportLocations, that.supportLocations)
            && Objects.equals(this.sizeRange, that.sizeRange) && Objects.equals(this.chargeMode, that.chargeMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            domainId,
            specification,
            isSupport,
            isSupportEnterpriseProject,
            isSupportTag,
            isSupportIntraRegion,
            supportTopologies,
            supportRegions,
            supportDscpRegions,
            supportFreezeRegions,
            supportLocations,
            sizeRange,
            chargeMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SiteNetworkCapabilityEntry {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    specification: ").append(toIndentedString(specification)).append("\n");
        sb.append("    isSupport: ").append(toIndentedString(isSupport)).append("\n");
        sb.append("    isSupportEnterpriseProject: ").append(toIndentedString(isSupportEnterpriseProject)).append("\n");
        sb.append("    isSupportTag: ").append(toIndentedString(isSupportTag)).append("\n");
        sb.append("    isSupportIntraRegion: ").append(toIndentedString(isSupportIntraRegion)).append("\n");
        sb.append("    supportTopologies: ").append(toIndentedString(supportTopologies)).append("\n");
        sb.append("    supportRegions: ").append(toIndentedString(supportRegions)).append("\n");
        sb.append("    supportDscpRegions: ").append(toIndentedString(supportDscpRegions)).append("\n");
        sb.append("    supportFreezeRegions: ").append(toIndentedString(supportFreezeRegions)).append("\n");
        sb.append("    supportLocations: ").append(toIndentedString(supportLocations)).append("\n");
        sb.append("    sizeRange: ").append(toIndentedString(sizeRange)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
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
