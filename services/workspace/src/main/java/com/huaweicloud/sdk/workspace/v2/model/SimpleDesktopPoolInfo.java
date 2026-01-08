package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SimpleDesktopPoolInfo
 */
public class SimpleDesktopPoolInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private String createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charging_mode")

    private String chargingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_count")

    private Integer desktopCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_used")

    private Integer desktopUsed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_ids")

    private List<String> subnetIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product")

    private ProductInfo product;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_name")

    private String imageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_os_type")

    private String imageOsType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_os_version")

    private String imageOsVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_os_platform")

    private String imageOsPlatform;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_product_code")

    private String imageProductCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "root_volume")

    private VolumeInfo rootVolume;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_volumes")

    private List<VolumeInfo> dataVolumes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_groups")

    private List<SecurityGroupInfo> securityGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disconnected_retention_period")

    private Integer disconnectedRetentionPeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_autoscale")

    private Boolean enableAutoscale;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "autoscale_policy")

    private AutoscalePolicy autoscalePolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "in_maintenance_mode")

    private Boolean inMaintenanceMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_name_policy_id")

    private String desktopNamePolicyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ou_name")

    private String ouName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    public SimpleDesktopPoolInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 桌面池ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SimpleDesktopPoolInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 桌面池名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SimpleDesktopPoolInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 桌面池类型。DYNAMIC：动态池，STATIC：静态池。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public SimpleDesktopPoolInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 桌面池描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SimpleDesktopPoolInfo withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * 创建时间，格式为：UTC格式，例如“2022-05-11T11:45:42.000Z”。
     * @return createdTime
     */
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public SimpleDesktopPoolInfo withChargingMode(String chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /**
     * 计费模式，0：包周期，1：按需。
     * @return chargingMode
     */
    public String getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(String chargingMode) {
        this.chargingMode = chargingMode;
    }

    public SimpleDesktopPoolInfo withDesktopCount(Integer desktopCount) {
        this.desktopCount = desktopCount;
        return this;
    }

    /**
     * 桌面池总桌面数量。
     * @return desktopCount
     */
    public Integer getDesktopCount() {
        return desktopCount;
    }

    public void setDesktopCount(Integer desktopCount) {
        this.desktopCount = desktopCount;
    }

    public SimpleDesktopPoolInfo withDesktopUsed(Integer desktopUsed) {
        this.desktopUsed = desktopUsed;
        return this;
    }

    /**
     * 桌面池绑定用户的桌面个数。
     * @return desktopUsed
     */
    public Integer getDesktopUsed() {
        return desktopUsed;
    }

    public void setDesktopUsed(Integer desktopUsed) {
        this.desktopUsed = desktopUsed;
    }

    public SimpleDesktopPoolInfo withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * 可用区。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public SimpleDesktopPoolInfo withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * 子网ID（已废弃，多个仅取第一个）。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public SimpleDesktopPoolInfo withSubnetIds(List<String> subnetIds) {
        this.subnetIds = subnetIds;
        return this;
    }

    public SimpleDesktopPoolInfo addSubnetIdsItem(String subnetIdsItem) {
        if (this.subnetIds == null) {
            this.subnetIds = new ArrayList<>();
        }
        this.subnetIds.add(subnetIdsItem);
        return this;
    }

    public SimpleDesktopPoolInfo withSubnetIds(Consumer<List<String>> subnetIdsSetter) {
        if (this.subnetIds == null) {
            this.subnetIds = new ArrayList<>();
        }
        subnetIdsSetter.accept(this.subnetIds);
        return this;
    }

    /**
     * 桌面池子网ID列表。
     * @return subnetIds
     */
    public List<String> getSubnetIds() {
        return subnetIds;
    }

    public void setSubnetIds(List<String> subnetIds) {
        this.subnetIds = subnetIds;
    }

    public SimpleDesktopPoolInfo withProduct(ProductInfo product) {
        this.product = product;
        return this;
    }

    public SimpleDesktopPoolInfo withProduct(Consumer<ProductInfo> productSetter) {
        if (this.product == null) {
            this.product = new ProductInfo();
            productSetter.accept(this.product);
        }

        return this;
    }

    /**
     * Get product
     * @return product
     */
    public ProductInfo getProduct() {
        return product;
    }

    public void setProduct(ProductInfo product) {
        this.product = product;
    }

    public SimpleDesktopPoolInfo withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * 镜像ID。
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public SimpleDesktopPoolInfo withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    /**
     * 镜像名称。
     * @return imageName
     */
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public SimpleDesktopPoolInfo withImageOsType(String imageOsType) {
        this.imageOsType = imageOsType;
        return this;
    }

    /**
     * 镜像OS类型。
     * @return imageOsType
     */
    public String getImageOsType() {
        return imageOsType;
    }

    public void setImageOsType(String imageOsType) {
        this.imageOsType = imageOsType;
    }

    public SimpleDesktopPoolInfo withImageOsVersion(String imageOsVersion) {
        this.imageOsVersion = imageOsVersion;
        return this;
    }

    /**
     * 镜像OS版本。
     * @return imageOsVersion
     */
    public String getImageOsVersion() {
        return imageOsVersion;
    }

    public void setImageOsVersion(String imageOsVersion) {
        this.imageOsVersion = imageOsVersion;
    }

    public SimpleDesktopPoolInfo withImageOsPlatform(String imageOsPlatform) {
        this.imageOsPlatform = imageOsPlatform;
        return this;
    }

    /**
     * 镜像OS平台。
     * @return imageOsPlatform
     */
    public String getImageOsPlatform() {
        return imageOsPlatform;
    }

    public void setImageOsPlatform(String imageOsPlatform) {
        this.imageOsPlatform = imageOsPlatform;
    }

    public SimpleDesktopPoolInfo withImageProductCode(String imageProductCode) {
        this.imageProductCode = imageProductCode;
        return this;
    }

    /**
     * 镜像的productCode（specCode）。
     * @return imageProductCode
     */
    public String getImageProductCode() {
        return imageProductCode;
    }

    public void setImageProductCode(String imageProductCode) {
        this.imageProductCode = imageProductCode;
    }

    public SimpleDesktopPoolInfo withRootVolume(VolumeInfo rootVolume) {
        this.rootVolume = rootVolume;
        return this;
    }

    public SimpleDesktopPoolInfo withRootVolume(Consumer<VolumeInfo> rootVolumeSetter) {
        if (this.rootVolume == null) {
            this.rootVolume = new VolumeInfo();
            rootVolumeSetter.accept(this.rootVolume);
        }

        return this;
    }

    /**
     * Get rootVolume
     * @return rootVolume
     */
    public VolumeInfo getRootVolume() {
        return rootVolume;
    }

    public void setRootVolume(VolumeInfo rootVolume) {
        this.rootVolume = rootVolume;
    }

    public SimpleDesktopPoolInfo withDataVolumes(List<VolumeInfo> dataVolumes) {
        this.dataVolumes = dataVolumes;
        return this;
    }

    public SimpleDesktopPoolInfo addDataVolumesItem(VolumeInfo dataVolumesItem) {
        if (this.dataVolumes == null) {
            this.dataVolumes = new ArrayList<>();
        }
        this.dataVolumes.add(dataVolumesItem);
        return this;
    }

    public SimpleDesktopPoolInfo withDataVolumes(Consumer<List<VolumeInfo>> dataVolumesSetter) {
        if (this.dataVolumes == null) {
            this.dataVolumes = new ArrayList<>();
        }
        dataVolumesSetter.accept(this.dataVolumes);
        return this;
    }

    /**
     * 数据盘列表。
     * @return dataVolumes
     */
    public List<VolumeInfo> getDataVolumes() {
        return dataVolumes;
    }

    public void setDataVolumes(List<VolumeInfo> dataVolumes) {
        this.dataVolumes = dataVolumes;
    }

    public SimpleDesktopPoolInfo withSecurityGroups(List<SecurityGroupInfo> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    public SimpleDesktopPoolInfo addSecurityGroupsItem(SecurityGroupInfo securityGroupsItem) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        this.securityGroups.add(securityGroupsItem);
        return this;
    }

    public SimpleDesktopPoolInfo withSecurityGroups(Consumer<List<SecurityGroupInfo>> securityGroupsSetter) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        securityGroupsSetter.accept(this.securityGroups);
        return this;
    }

    /**
     * 桌面安全组。
     * @return securityGroups
     */
    public List<SecurityGroupInfo> getSecurityGroups() {
        return securityGroups;
    }

    public void setSecurityGroups(List<SecurityGroupInfo> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public SimpleDesktopPoolInfo withDisconnectedRetentionPeriod(Integer disconnectedRetentionPeriod) {
        this.disconnectedRetentionPeriod = disconnectedRetentionPeriod;
        return this;
    }

    /**
     * 动态池桌面断连多少分钟内，保留用户与桌面的绑定关系，超时后自动解绑。
     * @return disconnectedRetentionPeriod
     */
    public Integer getDisconnectedRetentionPeriod() {
        return disconnectedRetentionPeriod;
    }

    public void setDisconnectedRetentionPeriod(Integer disconnectedRetentionPeriod) {
        this.disconnectedRetentionPeriod = disconnectedRetentionPeriod;
    }

    public SimpleDesktopPoolInfo withEnableAutoscale(Boolean enableAutoscale) {
        this.enableAutoscale = enableAutoscale;
        return this;
    }

    /**
     * 桌面池是否开启弹性伸缩类型，为false则表示不开启弹性伸缩，为true则表示开启弹性伸缩。
     * @return enableAutoscale
     */
    public Boolean getEnableAutoscale() {
        return enableAutoscale;
    }

    public void setEnableAutoscale(Boolean enableAutoscale) {
        this.enableAutoscale = enableAutoscale;
    }

    public SimpleDesktopPoolInfo withAutoscalePolicy(AutoscalePolicy autoscalePolicy) {
        this.autoscalePolicy = autoscalePolicy;
        return this;
    }

    public SimpleDesktopPoolInfo withAutoscalePolicy(Consumer<AutoscalePolicy> autoscalePolicySetter) {
        if (this.autoscalePolicy == null) {
            this.autoscalePolicy = new AutoscalePolicy();
            autoscalePolicySetter.accept(this.autoscalePolicy);
        }

        return this;
    }

    /**
     * Get autoscalePolicy
     * @return autoscalePolicy
     */
    public AutoscalePolicy getAutoscalePolicy() {
        return autoscalePolicy;
    }

    public void setAutoscalePolicy(AutoscalePolicy autoscalePolicy) {
        this.autoscalePolicy = autoscalePolicy;
    }

    public SimpleDesktopPoolInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 桌面池状态。 - STEADY：稳态 - TEMPORARY：临时态 - EXIST_FROZEN：存在冻结桌面 - UNKNOWN：未知态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public SimpleDesktopPoolInfo withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public SimpleDesktopPoolInfo withInMaintenanceMode(Boolean inMaintenanceMode) {
        this.inMaintenanceMode = inMaintenanceMode;
        return this;
    }

    /**
     * 桌面池是否处于管理员维护模式。
     * @return inMaintenanceMode
     */
    public Boolean getInMaintenanceMode() {
        return inMaintenanceMode;
    }

    public void setInMaintenanceMode(Boolean inMaintenanceMode) {
        this.inMaintenanceMode = inMaintenanceMode;
    }

    public SimpleDesktopPoolInfo withDesktopNamePolicyId(String desktopNamePolicyId) {
        this.desktopNamePolicyId = desktopNamePolicyId;
        return this;
    }

    /**
     * 策略id，用于指定生成桌面名称策略。
     * @return desktopNamePolicyId
     */
    public String getDesktopNamePolicyId() {
        return desktopNamePolicyId;
    }

    public void setDesktopNamePolicyId(String desktopNamePolicyId) {
        this.desktopNamePolicyId = desktopNamePolicyId;
    }

    public SimpleDesktopPoolInfo withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public SimpleDesktopPoolInfo addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public SimpleDesktopPoolInfo withTags(Consumer<List<Tag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签列表
     * @return tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public SimpleDesktopPoolInfo withOuName(String ouName) {
        this.ouName = ouName;
        return this;
    }

    /**
     * OU名称
     * @return ouName
     */
    public String getOuName() {
        return ouName;
    }

    public void setOuName(String ouName) {
        this.ouName = ouName;
    }

    public SimpleDesktopPoolInfo withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * VPC ID。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SimpleDesktopPoolInfo that = (SimpleDesktopPoolInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.type, that.type) && Objects.equals(this.description, that.description)
            && Objects.equals(this.createdTime, that.createdTime)
            && Objects.equals(this.chargingMode, that.chargingMode)
            && Objects.equals(this.desktopCount, that.desktopCount)
            && Objects.equals(this.desktopUsed, that.desktopUsed)
            && Objects.equals(this.availabilityZone, that.availabilityZone)
            && Objects.equals(this.subnetId, that.subnetId) && Objects.equals(this.subnetIds, that.subnetIds)
            && Objects.equals(this.product, that.product) && Objects.equals(this.imageId, that.imageId)
            && Objects.equals(this.imageName, that.imageName) && Objects.equals(this.imageOsType, that.imageOsType)
            && Objects.equals(this.imageOsVersion, that.imageOsVersion)
            && Objects.equals(this.imageOsPlatform, that.imageOsPlatform)
            && Objects.equals(this.imageProductCode, that.imageProductCode)
            && Objects.equals(this.rootVolume, that.rootVolume) && Objects.equals(this.dataVolumes, that.dataVolumes)
            && Objects.equals(this.securityGroups, that.securityGroups)
            && Objects.equals(this.disconnectedRetentionPeriod, that.disconnectedRetentionPeriod)
            && Objects.equals(this.enableAutoscale, that.enableAutoscale)
            && Objects.equals(this.autoscalePolicy, that.autoscalePolicy) && Objects.equals(this.status, that.status)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.inMaintenanceMode, that.inMaintenanceMode)
            && Objects.equals(this.desktopNamePolicyId, that.desktopNamePolicyId)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.ouName, that.ouName)
            && Objects.equals(this.vpcId, that.vpcId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            type,
            description,
            createdTime,
            chargingMode,
            desktopCount,
            desktopUsed,
            availabilityZone,
            subnetId,
            subnetIds,
            product,
            imageId,
            imageName,
            imageOsType,
            imageOsVersion,
            imageOsPlatform,
            imageProductCode,
            rootVolume,
            dataVolumes,
            securityGroups,
            disconnectedRetentionPeriod,
            enableAutoscale,
            autoscalePolicy,
            status,
            enterpriseProjectId,
            inMaintenanceMode,
            desktopNamePolicyId,
            tags,
            ouName,
            vpcId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SimpleDesktopPoolInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    desktopCount: ").append(toIndentedString(desktopCount)).append("\n");
        sb.append("    desktopUsed: ").append(toIndentedString(desktopUsed)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    subnetIds: ").append(toIndentedString(subnetIds)).append("\n");
        sb.append("    product: ").append(toIndentedString(product)).append("\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
        sb.append("    imageOsType: ").append(toIndentedString(imageOsType)).append("\n");
        sb.append("    imageOsVersion: ").append(toIndentedString(imageOsVersion)).append("\n");
        sb.append("    imageOsPlatform: ").append(toIndentedString(imageOsPlatform)).append("\n");
        sb.append("    imageProductCode: ").append(toIndentedString(imageProductCode)).append("\n");
        sb.append("    rootVolume: ").append(toIndentedString(rootVolume)).append("\n");
        sb.append("    dataVolumes: ").append(toIndentedString(dataVolumes)).append("\n");
        sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
        sb.append("    disconnectedRetentionPeriod: ")
            .append(toIndentedString(disconnectedRetentionPeriod))
            .append("\n");
        sb.append("    enableAutoscale: ").append(toIndentedString(enableAutoscale)).append("\n");
        sb.append("    autoscalePolicy: ").append(toIndentedString(autoscalePolicy)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    inMaintenanceMode: ").append(toIndentedString(inMaintenanceMode)).append("\n");
        sb.append("    desktopNamePolicyId: ").append(toIndentedString(desktopNamePolicyId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    ouName: ").append(toIndentedString(ouName)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
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
