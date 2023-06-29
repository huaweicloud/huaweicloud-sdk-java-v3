package com.huaweicloud.sdk.evs.v2.model;

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
public class UpdateVolumeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attachments")

    private List<Attachment> attachments = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bootable")

    private String bootable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "links")

    private List<Link> links = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private VolumeMetadata metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "multiattach")

    private Boolean multiattach;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os-vol-host-attr:host")

    private String osVolHostAttrHost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os-vol-tenant-attr:tenant_id")

    private String osVolTenantAttrTenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shareable")

    private String shareable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshot_id")

    private String snapshotId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_volid")

    private String sourceVolid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_image_metadata")

    private Object volumeImageMetadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_type")

    private String volumeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os-volume-replication:extended_status")

    private String osVolumeReplicationExtendedStatus;

    public UpdateVolumeResponse withAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
        return this;
    }

    public UpdateVolumeResponse addAttachmentsItem(Attachment attachmentsItem) {
        if (this.attachments == null) {
            this.attachments = new ArrayList<>();
        }
        this.attachments.add(attachmentsItem);
        return this;
    }

    public UpdateVolumeResponse withAttachments(Consumer<List<Attachment>> attachmentsSetter) {
        if (this.attachments == null) {
            this.attachments = new ArrayList<>();
        }
        attachmentsSetter.accept(this.attachments);
        return this;
    }

    /**
     * 是否挂载信息。
     * @return attachments
     */
    public List<Attachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    public UpdateVolumeResponse withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * 云硬盘所属AZ。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public UpdateVolumeResponse withBootable(String bootable) {
        this.bootable = bootable;
        return this;
    }

    /**
     * 是否为可启动云硬盘。
     * @return bootable
     */
    public String getBootable() {
        return bootable;
    }

    public void setBootable(String bootable) {
        this.bootable = bootable;
    }

    public UpdateVolumeResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建云硬盘的时间。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public UpdateVolumeResponse withId(String id) {
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

    public UpdateVolumeResponse withLinks(List<Link> links) {
        this.links = links;
        return this;
    }

    public UpdateVolumeResponse addLinksItem(Link linksItem) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        this.links.add(linksItem);
        return this;
    }

    public UpdateVolumeResponse withLinks(Consumer<List<Link>> linksSetter) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        linksSetter.accept(this.links);
        return this;
    }

    /**
     * 云硬盘uri自描述信息
     * @return links
     */
    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public UpdateVolumeResponse withMetadata(VolumeMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public UpdateVolumeResponse withMetadata(Consumer<VolumeMetadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new VolumeMetadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public VolumeMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(VolumeMetadata metadata) {
        this.metadata = metadata;
    }

    public UpdateVolumeResponse withMultiattach(Boolean multiattach) {
        this.multiattach = multiattach;
        return this;
    }

    /**
     * 是否为可共享云硬盘。
     * @return multiattach
     */
    public Boolean getMultiattach() {
        return multiattach;
    }

    public void setMultiattach(Boolean multiattach) {
        this.multiattach = multiattach;
    }

    public UpdateVolumeResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 云硬盘名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateVolumeResponse withOsVolHostAttrHost(String osVolHostAttrHost) {
        this.osVolHostAttrHost = osVolHostAttrHost;
        return this;
    }

    /**
     * 预留属性。
     * @return osVolHostAttrHost
     */
    public String getOsVolHostAttrHost() {
        return osVolHostAttrHost;
    }

    public void setOsVolHostAttrHost(String osVolHostAttrHost) {
        this.osVolHostAttrHost = osVolHostAttrHost;
    }

    public UpdateVolumeResponse withOsVolTenantAttrTenantId(String osVolTenantAttrTenantId) {
        this.osVolTenantAttrTenantId = osVolTenantAttrTenantId;
        return this;
    }

    /**
     * 云硬盘所属的项目ID。
     * @return osVolTenantAttrTenantId
     */
    public String getOsVolTenantAttrTenantId() {
        return osVolTenantAttrTenantId;
    }

    public void setOsVolTenantAttrTenantId(String osVolTenantAttrTenantId) {
        this.osVolTenantAttrTenantId = osVolTenantAttrTenantId;
    }

    public UpdateVolumeResponse withShareable(String shareable) {
        this.shareable = shareable;
        return this;
    }

    /**
     * 是否为共享云硬盘。
     * @return shareable
     */
    public String getShareable() {
        return shareable;
    }

    public void setShareable(String shareable) {
        this.shareable = shareable;
    }

    public UpdateVolumeResponse withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 云硬盘大小。
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public UpdateVolumeResponse withSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    /**
     * 快照ID。
     * @return snapshotId
     */
    public String getSnapshotId() {
        return snapshotId;
    }

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    public UpdateVolumeResponse withSourceVolid(String sourceVolid) {
        this.sourceVolid = sourceVolid;
        return this;
    }

    /**
     * 预留字段。
     * @return sourceVolid
     */
    public String getSourceVolid() {
        return sourceVolid;
    }

    public void setSourceVolid(String sourceVolid) {
        this.sourceVolid = sourceVolid;
    }

    public UpdateVolumeResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 云硬盘状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public UpdateVolumeResponse withVolumeImageMetadata(Object volumeImageMetadata) {
        this.volumeImageMetadata = volumeImageMetadata;
        return this;
    }

    /**
     * 云硬盘镜像的元数据。 > 说明： >  > 关于“volume_image_metadata”字段的详细说明，具体请参见：\"[查询镜像详情](https://support.huaweicloud.com/api-ims/ims_03_0703.html)\"。
     * @return volumeImageMetadata
     */
    public Object getVolumeImageMetadata() {
        return volumeImageMetadata;
    }

    public void setVolumeImageMetadata(Object volumeImageMetadata) {
        this.volumeImageMetadata = volumeImageMetadata;
    }

    public UpdateVolumeResponse withVolumeType(String volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    /**
     * 云硬盘类型。
     * @return volumeType
     */
    public String getVolumeType() {
        return volumeType;
    }

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    public UpdateVolumeResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 云硬盘描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateVolumeResponse withOsVolumeReplicationExtendedStatus(String osVolumeReplicationExtendedStatus) {
        this.osVolumeReplicationExtendedStatus = osVolumeReplicationExtendedStatus;
        return this;
    }

    /**
     * 预留属性。
     * @return osVolumeReplicationExtendedStatus
     */
    public String getOsVolumeReplicationExtendedStatus() {
        return osVolumeReplicationExtendedStatus;
    }

    public void setOsVolumeReplicationExtendedStatus(String osVolumeReplicationExtendedStatus) {
        this.osVolumeReplicationExtendedStatus = osVolumeReplicationExtendedStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateVolumeResponse that = (UpdateVolumeResponse) obj;
        return Objects.equals(this.attachments, that.attachments)
            && Objects.equals(this.availabilityZone, that.availabilityZone)
            && Objects.equals(this.bootable, that.bootable) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.id, that.id) && Objects.equals(this.links, that.links)
            && Objects.equals(this.metadata, that.metadata) && Objects.equals(this.multiattach, that.multiattach)
            && Objects.equals(this.name, that.name) && Objects.equals(this.osVolHostAttrHost, that.osVolHostAttrHost)
            && Objects.equals(this.osVolTenantAttrTenantId, that.osVolTenantAttrTenantId)
            && Objects.equals(this.shareable, that.shareable) && Objects.equals(this.size, that.size)
            && Objects.equals(this.snapshotId, that.snapshotId) && Objects.equals(this.sourceVolid, that.sourceVolid)
            && Objects.equals(this.status, that.status)
            && Objects.equals(this.volumeImageMetadata, that.volumeImageMetadata)
            && Objects.equals(this.volumeType, that.volumeType) && Objects.equals(this.description, that.description)
            && Objects.equals(this.osVolumeReplicationExtendedStatus, that.osVolumeReplicationExtendedStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attachments,
            availabilityZone,
            bootable,
            createdAt,
            id,
            links,
            metadata,
            multiattach,
            name,
            osVolHostAttrHost,
            osVolTenantAttrTenantId,
            shareable,
            size,
            snapshotId,
            sourceVolid,
            status,
            volumeImageMetadata,
            volumeType,
            description,
            osVolumeReplicationExtendedStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateVolumeResponse {\n");
        sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    bootable: ").append(toIndentedString(bootable)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    multiattach: ").append(toIndentedString(multiattach)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    osVolHostAttrHost: ").append(toIndentedString(osVolHostAttrHost)).append("\n");
        sb.append("    osVolTenantAttrTenantId: ").append(toIndentedString(osVolTenantAttrTenantId)).append("\n");
        sb.append("    shareable: ").append(toIndentedString(shareable)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    snapshotId: ").append(toIndentedString(snapshotId)).append("\n");
        sb.append("    sourceVolid: ").append(toIndentedString(sourceVolid)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    volumeImageMetadata: ").append(toIndentedString(volumeImageMetadata)).append("\n");
        sb.append("    volumeType: ").append(toIndentedString(volumeType)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    osVolumeReplicationExtendedStatus: ")
            .append(toIndentedString(osVolumeReplicationExtendedStatus))
            .append("\n");
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
