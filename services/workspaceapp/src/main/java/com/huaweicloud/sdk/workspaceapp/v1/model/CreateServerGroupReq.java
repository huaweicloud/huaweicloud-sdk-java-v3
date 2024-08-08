package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建服务器组请求。
 */
public class CreateServerGroupReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_product_id")

    private String imageProductId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_type")

    private ImageTypeEnum imageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    private OsTypeEnum osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "route_policy")

    private RoutePolicy routePolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_id")

    private String flavorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

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
    @JsonProperty(value = "ou_name")

    private String ouName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_virtual")

    private IpVirtual ipVirtual;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_vdi")

    private Boolean isVdi;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_type")

    private AppTypeEnum appType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extra_session_type")

    private ExtraSessionTypeEnum extraSessionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extra_session_size")

    private Integer extraSessionSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TmsTag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "primary_server_group_id")

    private String primaryServerGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_group_status")

    private Boolean serverGroupStatus;

    public CreateServerGroupReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 服务器组名称，名称需满足如下规则: 1. 由中文，英文大小写，数字，_-组成，不能有空格。 2. 长度范围1~64个字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateServerGroupReq withImageId(String imageId) {
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

    public CreateServerGroupReq withImageProductId(String imageProductId) {
        this.imageProductId = imageProductId;
        return this;
    }

    /**
     * 服务器组的镜像产品ID，当镜像为云市场镜像时，该字段必填。
     * @return imageProductId
     */
    public String getImageProductId() {
        return imageProductId;
    }

    public void setImageProductId(String imageProductId) {
        this.imageProductId = imageProductId;
    }

    public CreateServerGroupReq withImageType(ImageTypeEnum imageType) {
        this.imageType = imageType;
        return this;
    }

    /**
     * Get imageType
     * @return imageType
     */
    public ImageTypeEnum getImageType() {
        return imageType;
    }

    public void setImageType(ImageTypeEnum imageType) {
        this.imageType = imageType;
    }

    public CreateServerGroupReq withOsType(OsTypeEnum osType) {
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

    public CreateServerGroupReq withDescription(String description) {
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

    public CreateServerGroupReq withRoutePolicy(RoutePolicy routePolicy) {
        this.routePolicy = routePolicy;
        return this;
    }

    public CreateServerGroupReq withRoutePolicy(Consumer<RoutePolicy> routePolicySetter) {
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

    public CreateServerGroupReq withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * 产品ID。 > - 获取方式详见产品套餐管理ListProduct：\"GET  /v1/{project_id}/product\"。
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public CreateServerGroupReq withFlavorId(String flavorId) {
        this.flavorId = flavorId;
        return this;
    }

    /**
     * 规格ID。
     * @return flavorId
     */
    public String getFlavorId() {
        return flavorId;
    }

    public void setFlavorId(String flavorId) {
        this.flavorId = flavorId;
    }

    public CreateServerGroupReq withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 虚拟私有云ID。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public CreateServerGroupReq withSubnetId(String subnetId) {
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

    public CreateServerGroupReq withSystemDiskType(VolumeType systemDiskType) {
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

    public CreateServerGroupReq withSystemDiskSize(Integer systemDiskSize) {
        this.systemDiskSize = systemDiskSize;
        return this;
    }

    /**
     * 磁盘容量，单位GB。
     * minimum: 10
     * maximum: 32768
     * @return systemDiskSize
     */
    public Integer getSystemDiskSize() {
        return systemDiskSize;
    }

    public void setSystemDiskSize(Integer systemDiskSize) {
        this.systemDiskSize = systemDiskSize;
    }

    public CreateServerGroupReq withOuName(String ouName) {
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

    public CreateServerGroupReq withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 云服务器系统盘对应的存储池的ID。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public CreateServerGroupReq withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * 可用分区。 > - 将服务创建到指定的可用分区，如果不指定则使用系统随机的可用分区。 > - 获取方式详见可用区管理ListAvailabilityZone：\"GET  /v1/{project_id}/availability-zone\"。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public CreateServerGroupReq withIpVirtual(IpVirtual ipVirtual) {
        this.ipVirtual = ipVirtual;
        return this;
    }

    public CreateServerGroupReq withIpVirtual(Consumer<IpVirtual> ipVirtualSetter) {
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

    public CreateServerGroupReq withIsVdi(Boolean isVdi) {
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

    public CreateServerGroupReq withAppType(AppTypeEnum appType) {
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

    public CreateServerGroupReq withExtraSessionType(ExtraSessionTypeEnum extraSessionType) {
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

    public CreateServerGroupReq withExtraSessionSize(Integer extraSessionSize) {
        this.extraSessionSize = extraSessionSize;
        return this;
    }

    /**
     * 付费会话数，单位/个。
     * minimum: 1
     * @return extraSessionSize
     */
    public Integer getExtraSessionSize() {
        return extraSessionSize;
    }

    public void setExtraSessionSize(Integer extraSessionSize) {
        this.extraSessionSize = extraSessionSize;
    }

    public CreateServerGroupReq withTags(List<TmsTag> tags) {
        this.tags = tags;
        return this;
    }

    public CreateServerGroupReq addTagsItem(TmsTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateServerGroupReq withTags(Consumer<List<TmsTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签信息，最多包含20个key,不允许重复
     * @return tags
     */
    public List<TmsTag> getTags() {
        return tags;
    }

    public void setTags(List<TmsTag> tags) {
        this.tags = tags;
    }

    public CreateServerGroupReq withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID,仅企业项目需配置(字段为空或者0表示使用默认default企业项目)
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CreateServerGroupReq withPrimaryServerGroupId(String primaryServerGroupId) {
        this.primaryServerGroupId = primaryServerGroupId;
        return this;
    }

    /**
     * 主服务器组id,绑定主服务器组，则创建的是备服务器。
     * @return primaryServerGroupId
     */
    public String getPrimaryServerGroupId() {
        return primaryServerGroupId;
    }

    public void setPrimaryServerGroupId(String primaryServerGroupId) {
        this.primaryServerGroupId = primaryServerGroupId;
    }

    public CreateServerGroupReq withServerGroupStatus(Boolean serverGroupStatus) {
        this.serverGroupStatus = serverGroupStatus;
        return this;
    }

    /**
     * 是否启用服务器组。
     * @return serverGroupStatus
     */
    public Boolean getServerGroupStatus() {
        return serverGroupStatus;
    }

    public void setServerGroupStatus(Boolean serverGroupStatus) {
        this.serverGroupStatus = serverGroupStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateServerGroupReq that = (CreateServerGroupReq) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.imageId, that.imageId)
            && Objects.equals(this.imageProductId, that.imageProductId)
            && Objects.equals(this.imageType, that.imageType) && Objects.equals(this.osType, that.osType)
            && Objects.equals(this.description, that.description) && Objects.equals(this.routePolicy, that.routePolicy)
            && Objects.equals(this.productId, that.productId) && Objects.equals(this.flavorId, that.flavorId)
            && Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.subnetId, that.subnetId)
            && Objects.equals(this.systemDiskType, that.systemDiskType)
            && Objects.equals(this.systemDiskSize, that.systemDiskSize) && Objects.equals(this.ouName, that.ouName)
            && Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.availabilityZone, that.availabilityZone)
            && Objects.equals(this.ipVirtual, that.ipVirtual) && Objects.equals(this.isVdi, that.isVdi)
            && Objects.equals(this.appType, that.appType)
            && Objects.equals(this.extraSessionType, that.extraSessionType)
            && Objects.equals(this.extraSessionSize, that.extraSessionSize) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.primaryServerGroupId, that.primaryServerGroupId)
            && Objects.equals(this.serverGroupStatus, that.serverGroupStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            imageId,
            imageProductId,
            imageType,
            osType,
            description,
            routePolicy,
            productId,
            flavorId,
            vpcId,
            subnetId,
            systemDiskType,
            systemDiskSize,
            ouName,
            clusterId,
            availabilityZone,
            ipVirtual,
            isVdi,
            appType,
            extraSessionType,
            extraSessionSize,
            tags,
            enterpriseProjectId,
            primaryServerGroupId,
            serverGroupStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateServerGroupReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    imageProductId: ").append(toIndentedString(imageProductId)).append("\n");
        sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    routePolicy: ").append(toIndentedString(routePolicy)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    flavorId: ").append(toIndentedString(flavorId)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    systemDiskType: ").append(toIndentedString(systemDiskType)).append("\n");
        sb.append("    systemDiskSize: ").append(toIndentedString(systemDiskSize)).append("\n");
        sb.append("    ouName: ").append(toIndentedString(ouName)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    ipVirtual: ").append(toIndentedString(ipVirtual)).append("\n");
        sb.append("    isVdi: ").append(toIndentedString(isVdi)).append("\n");
        sb.append("    appType: ").append(toIndentedString(appType)).append("\n");
        sb.append("    extraSessionType: ").append(toIndentedString(extraSessionType)).append("\n");
        sb.append("    extraSessionSize: ").append(toIndentedString(extraSessionSize)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    primaryServerGroupId: ").append(toIndentedString(primaryServerGroupId)).append("\n");
        sb.append("    serverGroupStatus: ").append(toIndentedString(serverGroupStatus)).append("\n");
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
