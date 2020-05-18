package com.huaweicloud.sdk.evs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.evs.v2.model.VolumeTypeForExport;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * ExportToImageDetail
 */
public class ExportToImageDetail  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="container_format")
    
    private String containerFormat;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="disk_format")
    
    private String diskFormat;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="display_description")
    
    private String displayDescription;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="image_id")
    
    private String imageId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="image_name")
    
    private String imageName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    private Integer size;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="updated_at")
    
    private String updatedAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="volume_type")
    
    private VolumeTypeForExport volumeType = null;

    public ExportToImageDetail withContainerFormat(String containerFormat) {
        this.containerFormat = containerFormat;
        return this;
    }

    


    /**
     * 云硬盘导出镜像的容器类型。
     * @return containerFormat
     */
    public String getContainerFormat() {
        return containerFormat;
    }

    public void setContainerFormat(String containerFormat) {
        this.containerFormat = containerFormat;
    }

    public ExportToImageDetail withDiskFormat(String diskFormat) {
        this.diskFormat = diskFormat;
        return this;
    }

    


    /**
     * 云硬盘导出镜像的格式。目前只支持vhd和zvhd2，默认值是 “vhd”。
     * @return diskFormat
     */
    public String getDiskFormat() {
        return diskFormat;
    }

    public void setDiskFormat(String diskFormat) {
        this.diskFormat = diskFormat;
    }

    public ExportToImageDetail withDisplayDescription(String displayDescription) {
        this.displayDescription = displayDescription;
        return this;
    }

    


    /**
     * 云硬盘描述信息。
     * @return displayDescription
     */
    public String getDisplayDescription() {
        return displayDescription;
    }

    public void setDisplayDescription(String displayDescription) {
        this.displayDescription = displayDescription;
    }

    public ExportToImageDetail withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 云硬盘ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ExportToImageDetail withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    


    /**
     * 云硬盘导出镜像的ID。
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public ExportToImageDetail withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    


    /**
     * 云硬盘导出镜像的名称
     * @return imageName
     */
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public ExportToImageDetail withSize(Integer size) {
        this.size = size;
        return this;
    }

    


    /**
     * 云硬盘容量。
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ExportToImageDetail withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 云硬盘导出镜像后的状态，正常值为 “uploading”。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ExportToImageDetail withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    


    /**
     * 云硬盘更新时间。
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ExportToImageDetail withVolumeType(VolumeTypeForExport volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    public ExportToImageDetail withVolumeType(Consumer<VolumeTypeForExport> volumeTypeSetter) {
        if(this.volumeType == null ){
            this.volumeType = new VolumeTypeForExport();
        }
        volumeTypeSetter.accept(this.volumeType);
        return this;
    }


    /**
     * Get volumeType
     * @return volumeType
     */
    public VolumeTypeForExport getVolumeType() {
        return volumeType;
    }

    public void setVolumeType(VolumeTypeForExport volumeType) {
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
        ExportToImageDetail exportToImageDetail = (ExportToImageDetail) o;
        return Objects.equals(this.containerFormat, exportToImageDetail.containerFormat) &&
            Objects.equals(this.diskFormat, exportToImageDetail.diskFormat) &&
            Objects.equals(this.displayDescription, exportToImageDetail.displayDescription) &&
            Objects.equals(this.id, exportToImageDetail.id) &&
            Objects.equals(this.imageId, exportToImageDetail.imageId) &&
            Objects.equals(this.imageName, exportToImageDetail.imageName) &&
            Objects.equals(this.size, exportToImageDetail.size) &&
            Objects.equals(this.status, exportToImageDetail.status) &&
            Objects.equals(this.updatedAt, exportToImageDetail.updatedAt) &&
            Objects.equals(this.volumeType, exportToImageDetail.volumeType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(containerFormat, diskFormat, displayDescription, id, imageId, imageName, size, status, updatedAt, volumeType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportToImageDetail {\n");
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

