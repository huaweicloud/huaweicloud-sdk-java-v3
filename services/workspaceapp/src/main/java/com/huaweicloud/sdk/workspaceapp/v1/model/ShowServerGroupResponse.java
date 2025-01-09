package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowServerGroupResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    private OsTypeEnum osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "system_disk_type")

    private VolumeType systemDiskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "system_disk_size")

    private Integer systemDiskSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_vdi")

    private Boolean isVdi;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extra_session_type")

    private ExtraSessionTypeEnum extraSessionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extra_session_size")

    private Integer extraSessionSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_type")

    private AppTypeEnum appType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_mount_policy")

    private StorageFolderMountType storageMountPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "primary_server_group_ids")

    private List<String> primaryServerGroupIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secondary_server_group_ids")

    private List<String> secondaryServerGroupIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_group_status")

    private Boolean serverGroupStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "site_type")

    private String siteType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "site_id")

    private String siteId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_server_flavor_count")

    private Integer appServerFlavorCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_server_count")

    private Integer appServerCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_group_count")

    private Integer appGroupCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_name")

    private String imageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_info")

    private ProductInfo productInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_name")

    private String subnetName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scaling_policy")

    private ScalingPolicy scalingPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TmsTag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ou_name")

    private String ouName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavors")

    private List<Flavor> flavors = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_name")

    private String projectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_min_disk")

    private Integer imageMinDisk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "route_policy")

    private RoutePolicy routePolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_product_id")

    private String imageProductId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_type")

    private String imageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_virtual")

    private IpVirtual ipVirtual;

    public ShowServerGroupResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 服务器组的唯一标识。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowServerGroupResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 服务器组名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowServerGroupResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 服务器组描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowServerGroupResponse withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * 服务器组关联的镜像ID，用于创建对应组下的云服务器。
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public ShowServerGroupResponse withOsType(OsTypeEnum osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get osType
     * @return osType
     */
    public OsTypeEnum getOsType() {
        return osType;
    }

    public void setOsType(OsTypeEnum osType) {
        this.osType = osType;
    }

    public ShowServerGroupResponse withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * 产品id。
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public ShowServerGroupResponse withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * 网卡对应的子网ID。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public ShowServerGroupResponse withSystemDiskType(VolumeType systemDiskType) {
        this.systemDiskType = systemDiskType;
        return this;
    }

    /**
     * Get systemDiskType
     * @return systemDiskType
     */
    public VolumeType getSystemDiskType() {
        return systemDiskType;
    }

    public void setSystemDiskType(VolumeType systemDiskType) {
        this.systemDiskType = systemDiskType;
    }

    public ShowServerGroupResponse withSystemDiskSize(Integer systemDiskSize) {
        this.systemDiskSize = systemDiskSize;
        return this;
    }

    /**
     * 磁盘容量，单位GB。
     * @return systemDiskSize
     */
    public Integer getSystemDiskSize() {
        return systemDiskSize;
    }

    public void setSystemDiskSize(Integer systemDiskSize) {
        this.systemDiskSize = systemDiskSize;
    }

    public ShowServerGroupResponse withIsVdi(Boolean isVdi) {
        this.isVdi = isVdi;
        return this;
    }

    /**
     * 是否为vdi单会话模式。
     * @return isVdi
     */
    public Boolean getIsVdi() {
        return isVdi;
    }

    public void setIsVdi(Boolean isVdi) {
        this.isVdi = isVdi;
    }

    public ShowServerGroupResponse withExtraSessionType(ExtraSessionTypeEnum extraSessionType) {
        this.extraSessionType = extraSessionType;
        return this;
    }

    /**
     * Get extraSessionType
     * @return extraSessionType
     */
    public ExtraSessionTypeEnum getExtraSessionType() {
        return extraSessionType;
    }

    public void setExtraSessionType(ExtraSessionTypeEnum extraSessionType) {
        this.extraSessionType = extraSessionType;
    }

    public ShowServerGroupResponse withExtraSessionSize(Integer extraSessionSize) {
        this.extraSessionSize = extraSessionSize;
        return this;
    }

    /**
     * 付费会话个数。
     * @return extraSessionSize
     */
    public Integer getExtraSessionSize() {
        return extraSessionSize;
    }

    public void setExtraSessionSize(Integer extraSessionSize) {
        this.extraSessionSize = extraSessionSize;
    }

    public ShowServerGroupResponse withAppType(AppTypeEnum appType) {
        this.appType = appType;
        return this;
    }

    /**
     * Get appType
     * @return appType
     */
    public AppTypeEnum getAppType() {
        return appType;
    }

    public void setAppType(AppTypeEnum appType) {
        this.appType = appType;
    }

    public ShowServerGroupResponse withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 服务器组创建时间
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public ShowServerGroupResponse withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 服务器组更新时间
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public ShowServerGroupResponse withStorageMountPolicy(StorageFolderMountType storageMountPolicy) {
        this.storageMountPolicy = storageMountPolicy;
        return this;
    }

    /**
     * Get storageMountPolicy
     * @return storageMountPolicy
     */
    public StorageFolderMountType getStorageMountPolicy() {
        return storageMountPolicy;
    }

    public void setStorageMountPolicy(StorageFolderMountType storageMountPolicy) {
        this.storageMountPolicy = storageMountPolicy;
    }

    public ShowServerGroupResponse withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID(0表示默认企业项目Id)
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ShowServerGroupResponse withPrimaryServerGroupIds(List<String> primaryServerGroupIds) {
        this.primaryServerGroupIds = primaryServerGroupIds;
        return this;
    }

    public ShowServerGroupResponse addPrimaryServerGroupIdsItem(String primaryServerGroupIdsItem) {
        if (this.primaryServerGroupIds == null) {
            this.primaryServerGroupIds = new ArrayList<>();
        }
        this.primaryServerGroupIds.add(primaryServerGroupIdsItem);
        return this;
    }

    public ShowServerGroupResponse withPrimaryServerGroupIds(Consumer<List<String>> primaryServerGroupIdsSetter) {
        if (this.primaryServerGroupIds == null) {
            this.primaryServerGroupIds = new ArrayList<>();
        }
        primaryServerGroupIdsSetter.accept(this.primaryServerGroupIds);
        return this;
    }

    /**
     * 主服务器组id列表。
     * @return primaryServerGroupIds
     */
    public List<String> getPrimaryServerGroupIds() {
        return primaryServerGroupIds;
    }

    public void setPrimaryServerGroupIds(List<String> primaryServerGroupIds) {
        this.primaryServerGroupIds = primaryServerGroupIds;
    }

    public ShowServerGroupResponse withSecondaryServerGroupIds(List<String> secondaryServerGroupIds) {
        this.secondaryServerGroupIds = secondaryServerGroupIds;
        return this;
    }

    public ShowServerGroupResponse addSecondaryServerGroupIdsItem(String secondaryServerGroupIdsItem) {
        if (this.secondaryServerGroupIds == null) {
            this.secondaryServerGroupIds = new ArrayList<>();
        }
        this.secondaryServerGroupIds.add(secondaryServerGroupIdsItem);
        return this;
    }

    public ShowServerGroupResponse withSecondaryServerGroupIds(Consumer<List<String>> secondaryServerGroupIdsSetter) {
        if (this.secondaryServerGroupIds == null) {
            this.secondaryServerGroupIds = new ArrayList<>();
        }
        secondaryServerGroupIdsSetter.accept(this.secondaryServerGroupIds);
        return this;
    }

    /**
     * 备服务器组id列表。
     * @return secondaryServerGroupIds
     */
    public List<String> getSecondaryServerGroupIds() {
        return secondaryServerGroupIds;
    }

    public void setSecondaryServerGroupIds(List<String> secondaryServerGroupIds) {
        this.secondaryServerGroupIds = secondaryServerGroupIds;
    }

    public ShowServerGroupResponse withServerGroupStatus(Boolean serverGroupStatus) {
        this.serverGroupStatus = serverGroupStatus;
        return this;
    }

    /**
     * 服务器是否处于启用状态，true表示处于启用状态 false表示处于禁用状态。
     * @return serverGroupStatus
     */
    public Boolean getServerGroupStatus() {
        return serverGroupStatus;
    }

    public void setServerGroupStatus(Boolean serverGroupStatus) {
        this.serverGroupStatus = serverGroupStatus;
    }

    public ShowServerGroupResponse withSiteType(String siteType) {
        this.siteType = siteType;
        return this;
    }

    /**
     * 站点类型 - CENTER/IES
     * @return siteType
     */
    public String getSiteType() {
        return siteType;
    }

    public void setSiteType(String siteType) {
        this.siteType = siteType;
    }

    public ShowServerGroupResponse withSiteId(String siteId) {
        this.siteId = siteId;
        return this;
    }

    /**
     * 站点id
     * @return siteId
     */
    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public ShowServerGroupResponse withAppServerFlavorCount(Integer appServerFlavorCount) {
        this.appServerFlavorCount = appServerFlavorCount;
        return this;
    }

    /**
     * 服务器配置总数量。
     * @return appServerFlavorCount
     */
    public Integer getAppServerFlavorCount() {
        return appServerFlavorCount;
    }

    public void setAppServerFlavorCount(Integer appServerFlavorCount) {
        this.appServerFlavorCount = appServerFlavorCount;
    }

    public ShowServerGroupResponse withAppServerCount(Integer appServerCount) {
        this.appServerCount = appServerCount;
        return this;
    }

    /**
     * 服务器总数量。
     * @return appServerCount
     */
    public Integer getAppServerCount() {
        return appServerCount;
    }

    public void setAppServerCount(Integer appServerCount) {
        this.appServerCount = appServerCount;
    }

    public ShowServerGroupResponse withAppGroupCount(Integer appGroupCount) {
        this.appGroupCount = appGroupCount;
        return this;
    }

    /**
     * 关联应用组的总数量。
     * @return appGroupCount
     */
    public Integer getAppGroupCount() {
        return appGroupCount;
    }

    public void setAppGroupCount(Integer appGroupCount) {
        this.appGroupCount = appGroupCount;
    }

    public ShowServerGroupResponse withImageName(String imageName) {
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

    public ShowServerGroupResponse withProductInfo(ProductInfo productInfo) {
        this.productInfo = productInfo;
        return this;
    }

    public ShowServerGroupResponse withProductInfo(Consumer<ProductInfo> productInfoSetter) {
        if (this.productInfo == null) {
            this.productInfo = new ProductInfo();
            productInfoSetter.accept(this.productInfo);
        }

        return this;
    }

    /**
     * Get productInfo
     * @return productInfo
     */
    public ProductInfo getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(ProductInfo productInfo) {
        this.productInfo = productInfo;
    }

    public ShowServerGroupResponse withSubnetName(String subnetName) {
        this.subnetName = subnetName;
        return this;
    }

    /**
     * 子网名称。
     * @return subnetName
     */
    public String getSubnetName() {
        return subnetName;
    }

    public void setSubnetName(String subnetName) {
        this.subnetName = subnetName;
    }

    public ShowServerGroupResponse withScalingPolicy(ScalingPolicy scalingPolicy) {
        this.scalingPolicy = scalingPolicy;
        return this;
    }

    public ShowServerGroupResponse withScalingPolicy(Consumer<ScalingPolicy> scalingPolicySetter) {
        if (this.scalingPolicy == null) {
            this.scalingPolicy = new ScalingPolicy();
            scalingPolicySetter.accept(this.scalingPolicy);
        }

        return this;
    }

    /**
     * Get scalingPolicy
     * @return scalingPolicy
     */
    public ScalingPolicy getScalingPolicy() {
        return scalingPolicy;
    }

    public void setScalingPolicy(ScalingPolicy scalingPolicy) {
        this.scalingPolicy = scalingPolicy;
    }

    public ShowServerGroupResponse withTags(List<TmsTag> tags) {
        this.tags = tags;
        return this;
    }

    public ShowServerGroupResponse addTagsItem(TmsTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ShowServerGroupResponse withTags(Consumer<List<TmsTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签信息
     * @return tags
     */
    public List<TmsTag> getTags() {
        return tags;
    }

    public void setTags(List<TmsTag> tags) {
        this.tags = tags;
    }

    public ShowServerGroupResponse withOuName(String ouName) {
        this.ouName = ouName;
        return this;
    }

    /**
     * 默认组织名称。
     * @return ouName
     */
    public String getOuName() {
        return ouName;
    }

    public void setOuName(String ouName) {
        this.ouName = ouName;
    }

    public ShowServerGroupResponse withFlavors(List<Flavor> flavors) {
        this.flavors = flavors;
        return this;
    }

    public ShowServerGroupResponse addFlavorsItem(Flavor flavorsItem) {
        if (this.flavors == null) {
            this.flavors = new ArrayList<>();
        }
        this.flavors.add(flavorsItem);
        return this;
    }

    public ShowServerGroupResponse withFlavors(Consumer<List<Flavor>> flavorsSetter) {
        if (this.flavors == null) {
            this.flavors = new ArrayList<>();
        }
        flavorsSetter.accept(this.flavors);
        return this;
    }

    /**
     * 服务器规格列表。
     * @return flavors
     */
    public List<Flavor> getFlavors() {
        return flavors;
    }

    public void setFlavors(List<Flavor> flavors) {
        this.flavors = flavors;
    }

    public ShowServerGroupResponse withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    /**
     * 项目名称。
     * @return projectName
     */
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public ShowServerGroupResponse withImageMinDisk(Integer imageMinDisk) {
        this.imageMinDisk = imageMinDisk;
        return this;
    }

    /**
     * 镜像运行的最小内存，单位为MB，默认设置为0。
     * @return imageMinDisk
     */
    public Integer getImageMinDisk() {
        return imageMinDisk;
    }

    public void setImageMinDisk(Integer imageMinDisk) {
        this.imageMinDisk = imageMinDisk;
    }

    public ShowServerGroupResponse withRoutePolicy(RoutePolicy routePolicy) {
        this.routePolicy = routePolicy;
        return this;
    }

    public ShowServerGroupResponse withRoutePolicy(Consumer<RoutePolicy> routePolicySetter) {
        if (this.routePolicy == null) {
            this.routePolicy = new RoutePolicy();
            routePolicySetter.accept(this.routePolicy);
        }

        return this;
    }

    /**
     * Get routePolicy
     * @return routePolicy
     */
    public RoutePolicy getRoutePolicy() {
        return routePolicy;
    }

    public void setRoutePolicy(RoutePolicy routePolicy) {
        this.routePolicy = routePolicy;
    }

    public ShowServerGroupResponse withImageProductId(String imageProductId) {
        this.imageProductId = imageProductId;
        return this;
    }

    /**
     * 镜像的产品id。
     * @return imageProductId
     */
    public String getImageProductId() {
        return imageProductId;
    }

    public void setImageProductId(String imageProductId) {
        this.imageProductId = imageProductId;
    }

    public ShowServerGroupResponse withImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }

    /**
     * 镜像类型。
     * @return imageType
     */
    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public ShowServerGroupResponse withIpVirtual(IpVirtual ipVirtual) {
        this.ipVirtual = ipVirtual;
        return this;
    }

    public ShowServerGroupResponse withIpVirtual(Consumer<IpVirtual> ipVirtualSetter) {
        if (this.ipVirtual == null) {
            this.ipVirtual = new IpVirtual();
            ipVirtualSetter.accept(this.ipVirtual);
        }

        return this;
    }

    /**
     * Get ipVirtual
     * @return ipVirtual
     */
    public IpVirtual getIpVirtual() {
        return ipVirtual;
    }

    public void setIpVirtual(IpVirtual ipVirtual) {
        this.ipVirtual = ipVirtual;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowServerGroupResponse that = (ShowServerGroupResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.imageId, that.imageId)
            && Objects.equals(this.osType, that.osType) && Objects.equals(this.productId, that.productId)
            && Objects.equals(this.subnetId, that.subnetId) && Objects.equals(this.systemDiskType, that.systemDiskType)
            && Objects.equals(this.systemDiskSize, that.systemDiskSize) && Objects.equals(this.isVdi, that.isVdi)
            && Objects.equals(this.extraSessionType, that.extraSessionType)
            && Objects.equals(this.extraSessionSize, that.extraSessionSize)
            && Objects.equals(this.appType, that.appType) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.storageMountPolicy, that.storageMountPolicy)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.primaryServerGroupIds, that.primaryServerGroupIds)
            && Objects.equals(this.secondaryServerGroupIds, that.secondaryServerGroupIds)
            && Objects.equals(this.serverGroupStatus, that.serverGroupStatus)
            && Objects.equals(this.siteType, that.siteType) && Objects.equals(this.siteId, that.siteId)
            && Objects.equals(this.appServerFlavorCount, that.appServerFlavorCount)
            && Objects.equals(this.appServerCount, that.appServerCount)
            && Objects.equals(this.appGroupCount, that.appGroupCount) && Objects.equals(this.imageName, that.imageName)
            && Objects.equals(this.productInfo, that.productInfo) && Objects.equals(this.subnetName, that.subnetName)
            && Objects.equals(this.scalingPolicy, that.scalingPolicy) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.ouName, that.ouName) && Objects.equals(this.flavors, that.flavors)
            && Objects.equals(this.projectName, that.projectName)
            && Objects.equals(this.imageMinDisk, that.imageMinDisk)
            && Objects.equals(this.routePolicy, that.routePolicy)
            && Objects.equals(this.imageProductId, that.imageProductId)
            && Objects.equals(this.imageType, that.imageType) && Objects.equals(this.ipVirtual, that.ipVirtual);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            imageId,
            osType,
            productId,
            subnetId,
            systemDiskType,
            systemDiskSize,
            isVdi,
            extraSessionType,
            extraSessionSize,
            appType,
            createTime,
            updateTime,
            storageMountPolicy,
            enterpriseProjectId,
            primaryServerGroupIds,
            secondaryServerGroupIds,
            serverGroupStatus,
            siteType,
            siteId,
            appServerFlavorCount,
            appServerCount,
            appGroupCount,
            imageName,
            productInfo,
            subnetName,
            scalingPolicy,
            tags,
            ouName,
            flavors,
            projectName,
            imageMinDisk,
            routePolicy,
            imageProductId,
            imageType,
            ipVirtual);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowServerGroupResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    systemDiskType: ").append(toIndentedString(systemDiskType)).append("\n");
        sb.append("    systemDiskSize: ").append(toIndentedString(systemDiskSize)).append("\n");
        sb.append("    isVdi: ").append(toIndentedString(isVdi)).append("\n");
        sb.append("    extraSessionType: ").append(toIndentedString(extraSessionType)).append("\n");
        sb.append("    extraSessionSize: ").append(toIndentedString(extraSessionSize)).append("\n");
        sb.append("    appType: ").append(toIndentedString(appType)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    storageMountPolicy: ").append(toIndentedString(storageMountPolicy)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    primaryServerGroupIds: ").append(toIndentedString(primaryServerGroupIds)).append("\n");
        sb.append("    secondaryServerGroupIds: ").append(toIndentedString(secondaryServerGroupIds)).append("\n");
        sb.append("    serverGroupStatus: ").append(toIndentedString(serverGroupStatus)).append("\n");
        sb.append("    siteType: ").append(toIndentedString(siteType)).append("\n");
        sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
        sb.append("    appServerFlavorCount: ").append(toIndentedString(appServerFlavorCount)).append("\n");
        sb.append("    appServerCount: ").append(toIndentedString(appServerCount)).append("\n");
        sb.append("    appGroupCount: ").append(toIndentedString(appGroupCount)).append("\n");
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
        sb.append("    productInfo: ").append(toIndentedString(productInfo)).append("\n");
        sb.append("    subnetName: ").append(toIndentedString(subnetName)).append("\n");
        sb.append("    scalingPolicy: ").append(toIndentedString(scalingPolicy)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    ouName: ").append(toIndentedString(ouName)).append("\n");
        sb.append("    flavors: ").append(toIndentedString(flavors)).append("\n");
        sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
        sb.append("    imageMinDisk: ").append(toIndentedString(imageMinDisk)).append("\n");
        sb.append("    routePolicy: ").append(toIndentedString(routePolicy)).append("\n");
        sb.append("    imageProductId: ").append(toIndentedString(imageProductId)).append("\n");
        sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
        sb.append("    ipVirtual: ").append(toIndentedString(ipVirtual)).append("\n");
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
