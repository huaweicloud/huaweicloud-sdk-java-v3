package com.huaweicloud.sdk.evs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Image */
public class Image {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_format")

    private String containerFormat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_format")

    private String diskFormat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_description")

    private String displayDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_name")

    private String imageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_type")

    private VolumeType volumeType;

    public Image withContainerFormat(String containerFormat) {
        this.containerFormat = containerFormat;
        return this;
    }

    /** 云硬盘导出镜像的容器类型。 目前支持ami、ari、aki、ovf、bare。默认是bare。
     * 
     * @return containerFormat */
    public String getContainerFormat() {
        return containerFormat;
    }

    public void setContainerFormat(String containerFormat) {
        this.containerFormat = containerFormat;
    }

    public Image withDiskFormat(String diskFormat) {
        this.diskFormat = diskFormat;
        return this;
    }

    /** 云硬盘导出镜像的格式。 目前支持vhd、zvhd、zvhd2、raw、qcow2。默认是vhd。
     * 
     * @return diskFormat */
    public String getDiskFormat() {
        return diskFormat;
    }

    public void setDiskFormat(String diskFormat) {
        this.diskFormat = diskFormat;
    }

    public Image withDisplayDescription(String displayDescription) {
        this.displayDescription = displayDescription;
        return this;
    }

    /** 云硬盘描述信息。
     * 
     * @return displayDescription */
    public String getDisplayDescription() {
        return displayDescription;
    }

    public void setDisplayDescription(String displayDescription) {
        this.displayDescription = displayDescription;
    }

    public Image withId(String id) {
        this.id = id;
        return this;
    }

    /** 云硬盘ID。
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Image withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /** 云硬盘导出镜像的ID。
     * 
     * @return imageId */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public Image withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    /** 云硬盘导出镜像的名称
     * 
     * @return imageName */
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public Image withSize(Integer size) {
        this.size = size;
        return this;
    }

    /** 云硬盘容量。
     * 
     * @return size */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Image withStatus(String status) {
        this.status = status;
        return this;
    }

    /** 云硬盘导出镜像后的状态，正常值为 “uploading”。
     * 
     * @return status */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Image withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /** 云硬盘更新时间。 时间格式：UTC YYYY-MM-DDTHH:MM:SS.XXXXXX
     * 
     * @return updatedAt */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Image withVolumeType(VolumeType volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    public Image withVolumeType(Consumer<VolumeType> volumeTypeSetter) {
        if (this.volumeType == null) {
            this.volumeType = new VolumeType();
            volumeTypeSetter.accept(this.volumeType);
        }

        return this;
    }

    /** Get volumeType
     * 
     * @return volumeType */
    public VolumeType getVolumeType() {
        return volumeType;
    }

    public void setVolumeType(VolumeType volumeType) {
        this.volumeType = volumeType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Image image = (Image) o;
        return Objects.equals(this.containerFormat, image.containerFormat)
            && Objects.equals(this.diskFormat, image.diskFormat)
            && Objects.equals(this.displayDescription, image.displayDescription) && Objects.equals(this.id, image.id)
            && Objects.equals(this.imageId, image.imageId) && Objects.equals(this.imageName, image.imageName)
            && Objects.equals(this.size, image.size) && Objects.equals(this.status, image.status)
            && Objects.equals(this.updatedAt, image.updatedAt) && Objects.equals(this.volumeType, image.volumeType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(containerFormat,
            diskFormat,
            displayDescription,
            id,
            imageId,
            imageName,
            size,
            status,
            updatedAt,
            volumeType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Image {\n");
        sb.append("    containerFormat: ").append(toIndentedString(containerFormat)).append("\n");
        sb.append("    diskFormat: ").append(toIndentedString(diskFormat)).append("\n");
        sb.append("    displayDescription: ").append(toIndentedString(displayDescription)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    volumeType: ").append(toIndentedString(volumeType)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
