package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新服务器组请求。
 */
public class UpdateServerGroupReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "route_policy")

    private RoutePolicy routePolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_mount_policy")

    private StorageFolderMountType storageMountPolicy;

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
    @JsonProperty(value = "system_disk_type")

    private VolumeType systemDiskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "system_disk_size")

    private Integer systemDiskSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ou_name")

    private String ouName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_type")

    private AppTypeEnum appType;

    public UpdateServerGroupReq withName(String name) {
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

    public UpdateServerGroupReq withDescription(String description) {
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

    public UpdateServerGroupReq withRoutePolicy(RoutePolicy routePolicy) {
        this.routePolicy = routePolicy;
        return this;
    }

    public UpdateServerGroupReq withRoutePolicy(Consumer<RoutePolicy> routePolicySetter) {
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

    public UpdateServerGroupReq withStorageMountPolicy(StorageFolderMountType storageMountPolicy) {
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

    public UpdateServerGroupReq withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * 服务器组关联的镜像ID，更新镜像ID只对组下新创建的云服务器生效。
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public UpdateServerGroupReq withImageProductId(String imageProductId) {
        this.imageProductId = imageProductId;
        return this;
    }

    /**
     * 服务器组的镜像的productId。
     * @return imageProductId
     */
    public String getImageProductId() {
        return imageProductId;
    }

    public void setImageProductId(String imageProductId) {
        this.imageProductId = imageProductId;
    }

    public UpdateServerGroupReq withImageType(ImageTypeEnum imageType) {
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

    public UpdateServerGroupReq withSystemDiskType(VolumeType systemDiskType) {
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

    public UpdateServerGroupReq withSystemDiskSize(Integer systemDiskSize) {
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

    public UpdateServerGroupReq withOuName(String ouName) {
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

    public UpdateServerGroupReq withAppType(AppTypeEnum appType) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateServerGroupReq that = (UpdateServerGroupReq) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.routePolicy, that.routePolicy)
            && Objects.equals(this.storageMountPolicy, that.storageMountPolicy)
            && Objects.equals(this.imageId, that.imageId) && Objects.equals(this.imageProductId, that.imageProductId)
            && Objects.equals(this.imageType, that.imageType)
            && Objects.equals(this.systemDiskType, that.systemDiskType)
            && Objects.equals(this.systemDiskSize, that.systemDiskSize) && Objects.equals(this.ouName, that.ouName)
            && Objects.equals(this.appType, that.appType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            description,
            routePolicy,
            storageMountPolicy,
            imageId,
            imageProductId,
            imageType,
            systemDiskType,
            systemDiskSize,
            ouName,
            appType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateServerGroupReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    routePolicy: ").append(toIndentedString(routePolicy)).append("\n");
        sb.append("    storageMountPolicy: ").append(toIndentedString(storageMountPolicy)).append("\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    imageProductId: ").append(toIndentedString(imageProductId)).append("\n");
        sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
        sb.append("    systemDiskType: ").append(toIndentedString(systemDiskType)).append("\n");
        sb.append("    systemDiskSize: ").append(toIndentedString(systemDiskSize)).append("\n");
        sb.append("    ouName: ").append(toIndentedString(ouName)).append("\n");
        sb.append("    appType: ").append(toIndentedString(appType)).append("\n");
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
