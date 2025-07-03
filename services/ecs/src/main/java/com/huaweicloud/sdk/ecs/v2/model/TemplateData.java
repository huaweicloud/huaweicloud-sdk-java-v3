package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TemplateData
 */
public class TemplateData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_id")

    private String flavorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone_id")

    private String availabilityZoneId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_recovery")

    private Boolean autoRecovery;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_profile")

    private TemplateOsProfile osProfile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_ids")

    private List<String> securityGroupIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_interfaces")

    private List<TemplateNetworkInterfaceOption> networkInterfaces = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "block_device_mappings")

    private List<TemplateBlockDeviceMappingOption> blockDeviceMappings = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "market_options")

    private TemplateMarketOptions marketOptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "internet_access")

    private TemplateInternetAccessOption internetAccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private Map<String, String> metadata = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_options")

    private List<TemplateTagOptions> tagOptions = null;

    public TemplateData withFlavorId(String flavorId) {
        this.flavorId = flavorId;
        return this;
    }

    /**
     * 规格ID
     * @return flavorId
     */
    public String getFlavorId() {
        return flavorId;
    }

    public void setFlavorId(String flavorId) {
        this.flavorId = flavorId;
    }

    public TemplateData withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TemplateData withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TemplateData withAvailabilityZoneId(String availabilityZoneId) {
        this.availabilityZoneId = availabilityZoneId;
        return this;
    }

    /**
     * AZ
     * @return availabilityZoneId
     */
    public String getAvailabilityZoneId() {
        return availabilityZoneId;
    }

    public void setAvailabilityZoneId(String availabilityZoneId) {
        this.availabilityZoneId = availabilityZoneId;
    }

    public TemplateData withEnterpriseProjectId(String enterpriseProjectId) {
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

    public TemplateData withAutoRecovery(Boolean autoRecovery) {
        this.autoRecovery = autoRecovery;
        return this;
    }

    /**
     * 开启自动恢复
     * @return autoRecovery
     */
    public Boolean getAutoRecovery() {
        return autoRecovery;
    }

    public void setAutoRecovery(Boolean autoRecovery) {
        this.autoRecovery = autoRecovery;
    }

    public TemplateData withOsProfile(TemplateOsProfile osProfile) {
        this.osProfile = osProfile;
        return this;
    }

    public TemplateData withOsProfile(Consumer<TemplateOsProfile> osProfileSetter) {
        if (this.osProfile == null) {
            this.osProfile = new TemplateOsProfile();
            osProfileSetter.accept(this.osProfile);
        }

        return this;
    }

    /**
     * Get osProfile
     * @return osProfile
     */
    public TemplateOsProfile getOsProfile() {
        return osProfile;
    }

    public void setOsProfile(TemplateOsProfile osProfile) {
        this.osProfile = osProfile;
    }

    public TemplateData withSecurityGroupIds(List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }

    public TemplateData addSecurityGroupIdsItem(String securityGroupIdsItem) {
        if (this.securityGroupIds == null) {
            this.securityGroupIds = new ArrayList<>();
        }
        this.securityGroupIds.add(securityGroupIdsItem);
        return this;
    }

    public TemplateData withSecurityGroupIds(Consumer<List<String>> securityGroupIdsSetter) {
        if (this.securityGroupIds == null) {
            this.securityGroupIds = new ArrayList<>();
        }
        securityGroupIdsSetter.accept(this.securityGroupIds);
        return this;
    }

    /**
     * 安全组ID列表。全网卡生效。
     * @return securityGroupIds
     */
    public List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    public void setSecurityGroupIds(List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
    }

    public TemplateData withNetworkInterfaces(List<TemplateNetworkInterfaceOption> networkInterfaces) {
        this.networkInterfaces = networkInterfaces;
        return this;
    }

    public TemplateData addNetworkInterfacesItem(TemplateNetworkInterfaceOption networkInterfacesItem) {
        if (this.networkInterfaces == null) {
            this.networkInterfaces = new ArrayList<>();
        }
        this.networkInterfaces.add(networkInterfacesItem);
        return this;
    }

    public TemplateData withNetworkInterfaces(Consumer<List<TemplateNetworkInterfaceOption>> networkInterfacesSetter) {
        if (this.networkInterfaces == null) {
            this.networkInterfaces = new ArrayList<>();
        }
        networkInterfacesSetter.accept(this.networkInterfaces);
        return this;
    }

    /**
     * Get networkInterfaces
     * @return networkInterfaces
     */
    public List<TemplateNetworkInterfaceOption> getNetworkInterfaces() {
        return networkInterfaces;
    }

    public void setNetworkInterfaces(List<TemplateNetworkInterfaceOption> networkInterfaces) {
        this.networkInterfaces = networkInterfaces;
    }

    public TemplateData withBlockDeviceMappings(List<TemplateBlockDeviceMappingOption> blockDeviceMappings) {
        this.blockDeviceMappings = blockDeviceMappings;
        return this;
    }

    public TemplateData addBlockDeviceMappingsItem(TemplateBlockDeviceMappingOption blockDeviceMappingsItem) {
        if (this.blockDeviceMappings == null) {
            this.blockDeviceMappings = new ArrayList<>();
        }
        this.blockDeviceMappings.add(blockDeviceMappingsItem);
        return this;
    }

    public TemplateData withBlockDeviceMappings(
        Consumer<List<TemplateBlockDeviceMappingOption>> blockDeviceMappingsSetter) {
        if (this.blockDeviceMappings == null) {
            this.blockDeviceMappings = new ArrayList<>();
        }
        blockDeviceMappingsSetter.accept(this.blockDeviceMappings);
        return this;
    }

    /**
     * BDM挂载信息。按flavor限制为准。 1. 整机镜像，不修改卷属性，按原镜像配置创建。 2. 整机镜像，修改卷属性，要用户解开填写BDM。 3. 提供解镜像为BDM接口。
     * @return blockDeviceMappings
     */
    public List<TemplateBlockDeviceMappingOption> getBlockDeviceMappings() {
        return blockDeviceMappings;
    }

    public void setBlockDeviceMappings(List<TemplateBlockDeviceMappingOption> blockDeviceMappings) {
        this.blockDeviceMappings = blockDeviceMappings;
    }

    public TemplateData withMarketOptions(TemplateMarketOptions marketOptions) {
        this.marketOptions = marketOptions;
        return this;
    }

    public TemplateData withMarketOptions(Consumer<TemplateMarketOptions> marketOptionsSetter) {
        if (this.marketOptions == null) {
            this.marketOptions = new TemplateMarketOptions();
            marketOptionsSetter.accept(this.marketOptions);
        }

        return this;
    }

    /**
     * Get marketOptions
     * @return marketOptions
     */
    public TemplateMarketOptions getMarketOptions() {
        return marketOptions;
    }

    public void setMarketOptions(TemplateMarketOptions marketOptions) {
        this.marketOptions = marketOptions;
    }

    public TemplateData withInternetAccess(TemplateInternetAccessOption internetAccess) {
        this.internetAccess = internetAccess;
        return this;
    }

    public TemplateData withInternetAccess(Consumer<TemplateInternetAccessOption> internetAccessSetter) {
        if (this.internetAccess == null) {
            this.internetAccess = new TemplateInternetAccessOption();
            internetAccessSetter.accept(this.internetAccess);
        }

        return this;
    }

    /**
     * Get internetAccess
     * @return internetAccess
     */
    public TemplateInternetAccessOption getInternetAccess() {
        return internetAccess;
    }

    public void setInternetAccess(TemplateInternetAccessOption internetAccess) {
        this.internetAccess = internetAccess;
    }

    public TemplateData withMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    public TemplateData putMetadataItem(String key, String metadataItem) {
        if (this.metadata == null) {
            this.metadata = new HashMap<>();
        }
        this.metadata.put(key, metadataItem);
        return this;
    }

    public TemplateData withMetadata(Consumer<Map<String, String>> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new HashMap<>();
        }
        metadataSetter.accept(this.metadata);
        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public Map<String, String> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    public TemplateData withTagOptions(List<TemplateTagOptions> tagOptions) {
        this.tagOptions = tagOptions;
        return this;
    }

    public TemplateData addTagOptionsItem(TemplateTagOptions tagOptionsItem) {
        if (this.tagOptions == null) {
            this.tagOptions = new ArrayList<>();
        }
        this.tagOptions.add(tagOptionsItem);
        return this;
    }

    public TemplateData withTagOptions(Consumer<List<TemplateTagOptions>> tagOptionsSetter) {
        if (this.tagOptions == null) {
            this.tagOptions = new ArrayList<>();
        }
        tagOptionsSetter.accept(this.tagOptions);
        return this;
    }

    /**
     * 创建虚拟机标签，目前仅支持给虚拟机打标签，后续会支持同时给相关资源如卷等打标签
     * @return tagOptions
     */
    public List<TemplateTagOptions> getTagOptions() {
        return tagOptions;
    }

    public void setTagOptions(List<TemplateTagOptions> tagOptions) {
        this.tagOptions = tagOptions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TemplateData that = (TemplateData) obj;
        return Objects.equals(this.flavorId, that.flavorId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.availabilityZoneId, that.availabilityZoneId)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.autoRecovery, that.autoRecovery) && Objects.equals(this.osProfile, that.osProfile)
            && Objects.equals(this.securityGroupIds, that.securityGroupIds)
            && Objects.equals(this.networkInterfaces, that.networkInterfaces)
            && Objects.equals(this.blockDeviceMappings, that.blockDeviceMappings)
            && Objects.equals(this.marketOptions, that.marketOptions)
            && Objects.equals(this.internetAccess, that.internetAccess) && Objects.equals(this.metadata, that.metadata)
            && Objects.equals(this.tagOptions, that.tagOptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavorId,
            name,
            description,
            availabilityZoneId,
            enterpriseProjectId,
            autoRecovery,
            osProfile,
            securityGroupIds,
            networkInterfaces,
            blockDeviceMappings,
            marketOptions,
            internetAccess,
            metadata,
            tagOptions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateData {\n");
        sb.append("    flavorId: ").append(toIndentedString(flavorId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    availabilityZoneId: ").append(toIndentedString(availabilityZoneId)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    autoRecovery: ").append(toIndentedString(autoRecovery)).append("\n");
        sb.append("    osProfile: ").append(toIndentedString(osProfile)).append("\n");
        sb.append("    securityGroupIds: ").append(toIndentedString(securityGroupIds)).append("\n");
        sb.append("    networkInterfaces: ").append(toIndentedString(networkInterfaces)).append("\n");
        sb.append("    blockDeviceMappings: ").append(toIndentedString(blockDeviceMappings)).append("\n");
        sb.append("    marketOptions: ").append(toIndentedString(marketOptions)).append("\n");
        sb.append("    internetAccess: ").append(toIndentedString(internetAccess)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    tagOptions: ").append(toIndentedString(tagOptions)).append("\n");
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
