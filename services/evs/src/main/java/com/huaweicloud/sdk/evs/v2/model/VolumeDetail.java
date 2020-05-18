package com.huaweicloud.sdk.evs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.evs.v2.model.Attachment;
import com.huaweicloud.sdk.evs.v2.model.Link;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 云硬盘详情。
 */
public class VolumeDetail  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="links")
    
    private List<Link> links = new ArrayList<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="attachments")
    
    private List<Attachment> attachments = new ArrayList<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="availability_zone")
    
    private String availabilityZone;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="snapshot_id")
    
    private String snapshotId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="os-vol-tenant-attr:tenant_id")
    
    private String osVolTenantAttrTenantId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="volume_image_metadata")
    
    private Object volumeImageMetadata = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_at")
    
    private String createdAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="volume_type")
    
    private String volumeType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    private String size;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bootable")
    
    private String bootable;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metadata")
    
    private Object metadata = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="os-vol-host-attr:host")
    
    private String osVolHostAttrHost;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="updated_at")
    
    private String updatedAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="os-volume-replication:extended_status")
    
    private String osVolumeReplicationExtendedStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="replication_status")
    
    private String replicationStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="os-vol-mig-status-attr:migstat")
    
    private String osVolMigStatusAttrMigstat;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="os-vol-mig-status-attr:name_id")
    
    private String osVolMigStatusAttrNameId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="shareable")
    
    private Boolean shareable;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_id")
    
    private String userId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="service_type")
    
    private String serviceType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="multiattach")
    
    private Boolean multiattach;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dedicated_storage_id")
    
    private String dedicatedStorageId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dedicated_storage_name")
    
    private String dedicatedStorageName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private Object tags = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="wwn")
    
    private String wwn;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId;

    public VolumeDetail withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 云硬盘的ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public VolumeDetail withLinks(List<Link> links) {
        this.links = links;
        return this;
    }

    
    public VolumeDetail addLinksItem(Link linksItem) {
        this.links.add(linksItem);
        return this;
    }

    public VolumeDetail withLinks(Consumer<List<Link>> linksSetter) {
        if(this.links == null ){
            this.links = new ArrayList<>();
        }
        linksSetter.accept(this.links);
        return this;
    }

    /**
     * 云硬盘URI自描述信息。
     * @return links
     */
    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public VolumeDetail withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 云硬盘名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VolumeDetail withStatus(String status) {
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

    public VolumeDetail withAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
        return this;
    }

    
    public VolumeDetail addAttachmentsItem(Attachment attachmentsItem) {
        this.attachments.add(attachmentsItem);
        return this;
    }

    public VolumeDetail withAttachments(Consumer<List<Attachment>> attachmentsSetter) {
        if(this.attachments == null ){
            this.attachments = new ArrayList<>();
        }
        attachmentsSetter.accept(this.attachments);
        return this;
    }

    /**
     * 云硬盘的挂载信息。
     * @return attachments
     */
    public List<Attachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    public VolumeDetail withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    


    /**
     * 云硬盘所属的AZ信息。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public VolumeDetail withSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    


    /**
     * 快照ID，如果是从快照创建，则有值。
     * @return snapshotId
     */
    public String getSnapshotId() {
        return snapshotId;
    }

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    public VolumeDetail withDescription(String description) {
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

    public VolumeDetail withOsVolTenantAttrTenantId(String osVolTenantAttrTenantId) {
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

    public VolumeDetail withVolumeImageMetadata(Object volumeImageMetadata) {
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

    public VolumeDetail withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    


    /**
     * 云硬盘创建时间。 时间格式：UTC YYYY-MM-DDTHH:MM:SS.XXXXXX
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public VolumeDetail withVolumeType(String volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    


    /**
     * 云硬盘类型。 目前支持“SSD”，“SAS”和“SATA”三种。 “SSD”为超高IO云硬盘 “SAS”为高IO云硬盘 “SATA”为普通IO云硬盘
     * @return volumeType
     */
    public String getVolumeType() {
        return volumeType;
    }

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    public VolumeDetail withSize(String size) {
        this.size = size;
        return this;
    }

    


    /**
     * 云硬盘大小，单位为GB。
     * @return size
     */
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public VolumeDetail withBootable(String bootable) {
        this.bootable = bootable;
        return this;
    }

    


    /**
     * 是否为启动云硬盘。 true：表示为启动云硬盘。 false：表示为非启动云硬盘。
     * @return bootable
     */
    public String getBootable() {
        return bootable;
    }

    public void setBootable(String bootable) {
        this.bootable = bootable;
    }

    public VolumeDetail withMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }

    


    /**
     * 云硬盘的元数据。 如果元数据中不包含hw:passthrough字段，云硬盘默认为VBD类型。 如果元数据中不包含__system__encrypted字段，云硬盘默认为不加密。
     * @return metadata
     */
    public Object getMetadata() {
        return metadata;
    }

    public void setMetadata(Object metadata) {
        this.metadata = metadata;
    }

    public VolumeDetail withOsVolHostAttrHost(String osVolHostAttrHost) {
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

    public VolumeDetail withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    


    /**
     * 云硬盘更新时间。 时间格式：UTC YYYY-MM-DDTHH:MM:SS.XXXXXX
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public VolumeDetail withOsVolumeReplicationExtendedStatus(String osVolumeReplicationExtendedStatus) {
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

    public VolumeDetail withReplicationStatus(String replicationStatus) {
        this.replicationStatus = replicationStatus;
        return this;
    }

    


    /**
     * 预留属性。
     * @return replicationStatus
     */
    public String getReplicationStatus() {
        return replicationStatus;
    }

    public void setReplicationStatus(String replicationStatus) {
        this.replicationStatus = replicationStatus;
    }

    public VolumeDetail withOsVolMigStatusAttrMigstat(String osVolMigStatusAttrMigstat) {
        this.osVolMigStatusAttrMigstat = osVolMigStatusAttrMigstat;
        return this;
    }

    


    /**
     * 预留属性。
     * @return osVolMigStatusAttrMigstat
     */
    public String getOsVolMigStatusAttrMigstat() {
        return osVolMigStatusAttrMigstat;
    }

    public void setOsVolMigStatusAttrMigstat(String osVolMigStatusAttrMigstat) {
        this.osVolMigStatusAttrMigstat = osVolMigStatusAttrMigstat;
    }

    public VolumeDetail withOsVolMigStatusAttrNameId(String osVolMigStatusAttrNameId) {
        this.osVolMigStatusAttrNameId = osVolMigStatusAttrNameId;
        return this;
    }

    


    /**
     * 预留属性。
     * @return osVolMigStatusAttrNameId
     */
    public String getOsVolMigStatusAttrNameId() {
        return osVolMigStatusAttrNameId;
    }

    public void setOsVolMigStatusAttrNameId(String osVolMigStatusAttrNameId) {
        this.osVolMigStatusAttrNameId = osVolMigStatusAttrNameId;
    }

    public VolumeDetail withShareable(Boolean shareable) {
        this.shareable = shareable;
        return this;
    }

    


    /**
     * 是否为共享云硬盘。
     * @return shareable
     */
    public Boolean getShareable() {
        return shareable;
    }

    public void setShareable(Boolean shareable) {
        this.shareable = shareable;
    }

    public VolumeDetail withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    


    /**
     * 预留属性。
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public VolumeDetail withServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    


    /**
     * 服务类型，结果为EVS、DSS、DESS。
     * @return serviceType
     */
    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public VolumeDetail withMultiattach(Boolean multiattach) {
        this.multiattach = multiattach;
        return this;
    }

    


    /**
     * 是否为共享云硬盘。
     * @return multiattach
     */
    public Boolean getMultiattach() {
        return multiattach;
    }

    public void setMultiattach(Boolean multiattach) {
        this.multiattach = multiattach;
    }

    public VolumeDetail withDedicatedStorageId(String dedicatedStorageId) {
        this.dedicatedStorageId = dedicatedStorageId;
        return this;
    }

    


    /**
     * 云硬盘所属的专属存储池ID。
     * @return dedicatedStorageId
     */
    public String getDedicatedStorageId() {
        return dedicatedStorageId;
    }

    public void setDedicatedStorageId(String dedicatedStorageId) {
        this.dedicatedStorageId = dedicatedStorageId;
    }

    public VolumeDetail withDedicatedStorageName(String dedicatedStorageName) {
        this.dedicatedStorageName = dedicatedStorageName;
        return this;
    }

    


    /**
     * 云硬盘所属的专属存储池的名称。
     * @return dedicatedStorageName
     */
    public String getDedicatedStorageName() {
        return dedicatedStorageName;
    }

    public void setDedicatedStorageName(String dedicatedStorageName) {
        this.dedicatedStorageName = dedicatedStorageName;
    }

    public VolumeDetail withTags(Object tags) {
        this.tags = tags;
        return this;
    }

    


    /**
     * 云硬盘的标签。 如果云硬盘有标签，则会有该字段，否则该字段为空。
     * @return tags
     */
    public Object getTags() {
        return tags;
    }

    public void setTags(Object tags) {
        this.tags = tags;
    }

    public VolumeDetail withWwn(String wwn) {
        this.wwn = wwn;
        return this;
    }

    


    /**
     * 云硬盘挂载时的唯一标识。
     * @return wwn
     */
    public String getWwn() {
        return wwn;
    }

    public void setWwn(String wwn) {
        this.wwn = wwn;
    }

    public VolumeDetail withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * 云硬盘上绑定的企业项目ID。 > 说明： >  > 关于企业项目ID的获取及企业项目特性的详细信息，请参见：\"[企业管理用户指南](https://support.huaweicloud.com/usermanual-em/zh-cn_topic_0123692049.html)\"。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VolumeDetail volumeDetail = (VolumeDetail) o;
        return Objects.equals(this.id, volumeDetail.id) &&
            Objects.equals(this.links, volumeDetail.links) &&
            Objects.equals(this.name, volumeDetail.name) &&
            Objects.equals(this.status, volumeDetail.status) &&
            Objects.equals(this.attachments, volumeDetail.attachments) &&
            Objects.equals(this.availabilityZone, volumeDetail.availabilityZone) &&
            Objects.equals(this.snapshotId, volumeDetail.snapshotId) &&
            Objects.equals(this.description, volumeDetail.description) &&
            Objects.equals(this.osVolTenantAttrTenantId, volumeDetail.osVolTenantAttrTenantId) &&
            Objects.equals(this.volumeImageMetadata, volumeDetail.volumeImageMetadata) &&
            Objects.equals(this.createdAt, volumeDetail.createdAt) &&
            Objects.equals(this.volumeType, volumeDetail.volumeType) &&
            Objects.equals(this.size, volumeDetail.size) &&
            Objects.equals(this.bootable, volumeDetail.bootable) &&
            Objects.equals(this.metadata, volumeDetail.metadata) &&
            Objects.equals(this.osVolHostAttrHost, volumeDetail.osVolHostAttrHost) &&
            Objects.equals(this.updatedAt, volumeDetail.updatedAt) &&
            Objects.equals(this.osVolumeReplicationExtendedStatus, volumeDetail.osVolumeReplicationExtendedStatus) &&
            Objects.equals(this.replicationStatus, volumeDetail.replicationStatus) &&
            Objects.equals(this.osVolMigStatusAttrMigstat, volumeDetail.osVolMigStatusAttrMigstat) &&
            Objects.equals(this.osVolMigStatusAttrNameId, volumeDetail.osVolMigStatusAttrNameId) &&
            Objects.equals(this.shareable, volumeDetail.shareable) &&
            Objects.equals(this.userId, volumeDetail.userId) &&
            Objects.equals(this.serviceType, volumeDetail.serviceType) &&
            Objects.equals(this.multiattach, volumeDetail.multiattach) &&
            Objects.equals(this.dedicatedStorageId, volumeDetail.dedicatedStorageId) &&
            Objects.equals(this.dedicatedStorageName, volumeDetail.dedicatedStorageName) &&
            Objects.equals(this.tags, volumeDetail.tags) &&
            Objects.equals(this.wwn, volumeDetail.wwn) &&
            Objects.equals(this.enterpriseProjectId, volumeDetail.enterpriseProjectId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, links, name, status, attachments, availabilityZone, snapshotId, description, osVolTenantAttrTenantId, volumeImageMetadata, createdAt, volumeType, size, bootable, metadata, osVolHostAttrHost, updatedAt, osVolumeReplicationExtendedStatus, replicationStatus, osVolMigStatusAttrMigstat, osVolMigStatusAttrNameId, shareable, userId, serviceType, multiattach, dedicatedStorageId, dedicatedStorageName, tags, wwn, enterpriseProjectId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VolumeDetail {\n");
            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    links: ").append(toIndentedString(links)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    status: ").append(toIndentedString(status)).append("\n");
            sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
            sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
            sb.append("    snapshotId: ").append(toIndentedString(snapshotId)).append("\n");
            sb.append("    description: ").append(toIndentedString(description)).append("\n");
            sb.append("    osVolTenantAttrTenantId: ").append(toIndentedString(osVolTenantAttrTenantId)).append("\n");
            sb.append("    volumeImageMetadata: ").append(toIndentedString(volumeImageMetadata)).append("\n");
            sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
            sb.append("    volumeType: ").append(toIndentedString(volumeType)).append("\n");
            sb.append("    size: ").append(toIndentedString(size)).append("\n");
            sb.append("    bootable: ").append(toIndentedString(bootable)).append("\n");
            sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
            sb.append("    osVolHostAttrHost: ").append(toIndentedString(osVolHostAttrHost)).append("\n");
            sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
            sb.append("    osVolumeReplicationExtendedStatus: ").append(toIndentedString(osVolumeReplicationExtendedStatus)).append("\n");
            sb.append("    replicationStatus: ").append(toIndentedString(replicationStatus)).append("\n");
            sb.append("    osVolMigStatusAttrMigstat: ").append(toIndentedString(osVolMigStatusAttrMigstat)).append("\n");
            sb.append("    osVolMigStatusAttrNameId: ").append(toIndentedString(osVolMigStatusAttrNameId)).append("\n");
            sb.append("    shareable: ").append(toIndentedString(shareable)).append("\n");
            sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
            sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
            sb.append("    multiattach: ").append(toIndentedString(multiattach)).append("\n");
            sb.append("    dedicatedStorageId: ").append(toIndentedString(dedicatedStorageId)).append("\n");
            sb.append("    dedicatedStorageName: ").append(toIndentedString(dedicatedStorageName)).append("\n");
            sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
            sb.append("    wwn: ").append(toIndentedString(wwn)).append("\n");
            sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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

