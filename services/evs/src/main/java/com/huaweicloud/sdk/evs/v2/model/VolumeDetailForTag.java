package com.huaweicloud.sdk.evs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/** 云硬盘详情。 */
public class VolumeDetailForTag {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "links")

    private List<Link> links = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attachments")

    private List<Attachment> attachments = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os-vol-host-attr:host")

    private String osVolHostAttrHost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_volid")

    private String sourceVolid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshot_id")

    private String snapshotId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os-vol-tenant-attr:tenant_id")

    private String osVolTenantAttrTenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_image_metadata")

    private Map<String, Object> volumeImageMetadata = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_type")

    private String volumeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consistencygroup_id")

    private String consistencygroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bootable")

    private String bootable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private VolumeMetadata metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encrypted")

    private Boolean encrypted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replication_status")

    private String replicationStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os-volume-replication:extended_status")

    private String osVolumeReplicationExtendedStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os-vol-mig-status-attr:migstat")

    private String osVolMigStatusAttrMigstat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os-vol-mig-status-attr:name_id")

    private String osVolMigStatusAttrNameId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shareable")

    private Boolean shareable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type")

    private String serviceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "multiattach")

    private Boolean multiattach;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dedicated_storage_id")

    private String dedicatedStorageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dedicated_storage_name")

    private String dedicatedStorageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private Map<String, String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wwn")

    private String wwn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    public VolumeDetailForTag withId(String id) {
        this.id = id;
        return this;
    }

    /** 云硬盘的ID。
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public VolumeDetailForTag withLinks(List<Link> links) {
        this.links = links;
        return this;
    }

    public VolumeDetailForTag addLinksItem(Link linksItem) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        this.links.add(linksItem);
        return this;
    }

    public VolumeDetailForTag withLinks(Consumer<List<Link>> linksSetter) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        linksSetter.accept(this.links);
        return this;
    }

    /** 云硬盘URI自描述信息。请参见
     * [links参数说明](https://support.huaweicloud.com/api-evs/evs_04_2006.html#evs_04_2006__evs_04_2010_li1077125119136)。
     * 
     * @return links */
    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public VolumeDetailForTag withName(String name) {
        this.name = name;
        return this;
    }

    /** 云硬盘名称。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VolumeDetailForTag withStatus(String status) {
        this.status = status;
        return this;
    }

    /** 云硬盘状态，请参见[云硬盘状态](https://support.huaweicloud.com/api-evs/evs_04_0040.html)。
     * 
     * @return status */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public VolumeDetailForTag withAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
        return this;
    }

    public VolumeDetailForTag addAttachmentsItem(Attachment attachmentsItem) {
        if (this.attachments == null) {
            this.attachments = new ArrayList<>();
        }
        this.attachments.add(attachmentsItem);
        return this;
    }

    public VolumeDetailForTag withAttachments(Consumer<List<Attachment>> attachmentsSetter) {
        if (this.attachments == null) {
            this.attachments = new ArrayList<>();
        }
        attachmentsSetter.accept(this.attachments);
        return this;
    }

    /** 云硬盘的挂载信息，请参见•[attachments参数说明](https://support.huaweicloud.com/api-evs/evs_04_2006.html#evs_04_2006__evs_04_2010_li12430153610291)。
     * 
     * @return attachments */
    public List<Attachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    public VolumeDetailForTag withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /** 云硬盘所属的AZ信息。
     * 
     * @return availabilityZone */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public VolumeDetailForTag withOsVolHostAttrHost(String osVolHostAttrHost) {
        this.osVolHostAttrHost = osVolHostAttrHost;
        return this;
    }

    /** 预留属性。
     * 
     * @return osVolHostAttrHost */
    public String getOsVolHostAttrHost() {
        return osVolHostAttrHost;
    }

    public void setOsVolHostAttrHost(String osVolHostAttrHost) {
        this.osVolHostAttrHost = osVolHostAttrHost;
    }

    public VolumeDetailForTag withSourceVolid(String sourceVolid) {
        this.sourceVolid = sourceVolid;
        return this;
    }

    /** 源云硬盘ID，如果是从源云硬盘创建，则有值。 当前云硬盘服务不支持该字段。
     * 
     * @return sourceVolid */
    public String getSourceVolid() {
        return sourceVolid;
    }

    public void setSourceVolid(String sourceVolid) {
        this.sourceVolid = sourceVolid;
    }

    public VolumeDetailForTag withSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    /** 快照ID，如果是从快照创建，则有值。
     * 
     * @return snapshotId */
    public String getSnapshotId() {
        return snapshotId;
    }

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    public VolumeDetailForTag withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 云硬盘描述。
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public VolumeDetailForTag withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /** 云硬盘创建时间。 时间格式：UTC YYYY-MM-DDTHH:MM:SS.XXXXXX
     * 
     * @return createdAt */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public VolumeDetailForTag withOsVolTenantAttrTenantId(String osVolTenantAttrTenantId) {
        this.osVolTenantAttrTenantId = osVolTenantAttrTenantId;
        return this;
    }

    /** 云硬盘所属的租户ID。租户ID就是项目ID。
     * 
     * @return osVolTenantAttrTenantId */
    public String getOsVolTenantAttrTenantId() {
        return osVolTenantAttrTenantId;
    }

    public void setOsVolTenantAttrTenantId(String osVolTenantAttrTenantId) {
        this.osVolTenantAttrTenantId = osVolTenantAttrTenantId;
    }

    public VolumeDetailForTag withVolumeImageMetadata(Map<String, Object> volumeImageMetadata) {
        this.volumeImageMetadata = volumeImageMetadata;
        return this;
    }

    public VolumeDetailForTag putVolumeImageMetadataItem(String key, Object volumeImageMetadataItem) {
        if (this.volumeImageMetadata == null) {
            this.volumeImageMetadata = new HashMap<>();
        }
        this.volumeImageMetadata.put(key, volumeImageMetadataItem);
        return this;
    }

    public VolumeDetailForTag withVolumeImageMetadata(Consumer<Map<String, Object>> volumeImageMetadataSetter) {
        if (this.volumeImageMetadata == null) {
            this.volumeImageMetadata = new HashMap<>();
        }
        volumeImageMetadataSetter.accept(this.volumeImageMetadata);
        return this;
    }

    /** 云硬盘镜像的元数据。 > 说明： > >
     * 关于“volume_image_metadata”字段的详细说明，具体请参见：\"[查询镜像详情](https://support.huaweicloud.com/api-ims/ims_03_0703.html)\"。
     * 
     * @return volumeImageMetadata */
    public Map<String, Object> getVolumeImageMetadata() {
        return volumeImageMetadata;
    }

    public void setVolumeImageMetadata(Map<String, Object> volumeImageMetadata) {
        this.volumeImageMetadata = volumeImageMetadata;
    }

    public VolumeDetailForTag withVolumeType(String volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    /** 云硬盘类型。 目前支持“SSD”，“GPSSD”，“SAS”和“SATA”四种。 “SSD”为超高IO云硬盘 “GPSSD”为通用型云硬盘 “SAS”为高IO云硬盘 “SATA”为普通IO云硬盘
     * 
     * @return volumeType */
    public String getVolumeType() {
        return volumeType;
    }

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    public VolumeDetailForTag withSize(Integer size) {
        this.size = size;
        return this;
    }

    /** 云硬盘大小，单位为GB。
     * 
     * @return size */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public VolumeDetailForTag withConsistencygroupId(String consistencygroupId) {
        this.consistencygroupId = consistencygroupId;
        return this;
    }

    /** 预留属性。
     * 
     * @return consistencygroupId */
    public String getConsistencygroupId() {
        return consistencygroupId;
    }

    public void setConsistencygroupId(String consistencygroupId) {
        this.consistencygroupId = consistencygroupId;
    }

    public VolumeDetailForTag withBootable(String bootable) {
        this.bootable = bootable;
        return this;
    }

    /** 是否为启动云硬盘。 true：表示为启动云硬盘。 false：表示为非启动云硬盘。
     * 
     * @return bootable */
    public String getBootable() {
        return bootable;
    }

    public void setBootable(String bootable) {
        this.bootable = bootable;
    }

    public VolumeDetailForTag withMetadata(VolumeMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public VolumeDetailForTag withMetadata(Consumer<VolumeMetadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new VolumeMetadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /** Get metadata
     * 
     * @return metadata */
    public VolumeMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(VolumeMetadata metadata) {
        this.metadata = metadata;
    }

    public VolumeDetailForTag withUpdatedAt(String updatedAt) {
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

    public VolumeDetailForTag withEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }

    /** 当前云硬盘服务不支持该字段。
     * 
     * @return encrypted */
    public Boolean getEncrypted() {
        return encrypted;
    }

    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    public VolumeDetailForTag withReplicationStatus(String replicationStatus) {
        this.replicationStatus = replicationStatus;
        return this;
    }

    /** 预留属性。
     * 
     * @return replicationStatus */
    public String getReplicationStatus() {
        return replicationStatus;
    }

    public void setReplicationStatus(String replicationStatus) {
        this.replicationStatus = replicationStatus;
    }

    public VolumeDetailForTag withOsVolumeReplicationExtendedStatus(String osVolumeReplicationExtendedStatus) {
        this.osVolumeReplicationExtendedStatus = osVolumeReplicationExtendedStatus;
        return this;
    }

    /** 预留属性。
     * 
     * @return osVolumeReplicationExtendedStatus */
    public String getOsVolumeReplicationExtendedStatus() {
        return osVolumeReplicationExtendedStatus;
    }

    public void setOsVolumeReplicationExtendedStatus(String osVolumeReplicationExtendedStatus) {
        this.osVolumeReplicationExtendedStatus = osVolumeReplicationExtendedStatus;
    }

    public VolumeDetailForTag withOsVolMigStatusAttrMigstat(String osVolMigStatusAttrMigstat) {
        this.osVolMigStatusAttrMigstat = osVolMigStatusAttrMigstat;
        return this;
    }

    /** 预留属性。
     * 
     * @return osVolMigStatusAttrMigstat */
    public String getOsVolMigStatusAttrMigstat() {
        return osVolMigStatusAttrMigstat;
    }

    public void setOsVolMigStatusAttrMigstat(String osVolMigStatusAttrMigstat) {
        this.osVolMigStatusAttrMigstat = osVolMigStatusAttrMigstat;
    }

    public VolumeDetailForTag withOsVolMigStatusAttrNameId(String osVolMigStatusAttrNameId) {
        this.osVolMigStatusAttrNameId = osVolMigStatusAttrNameId;
        return this;
    }

    /** 预留属性。
     * 
     * @return osVolMigStatusAttrNameId */
    public String getOsVolMigStatusAttrNameId() {
        return osVolMigStatusAttrNameId;
    }

    public void setOsVolMigStatusAttrNameId(String osVolMigStatusAttrNameId) {
        this.osVolMigStatusAttrNameId = osVolMigStatusAttrNameId;
    }

    public VolumeDetailForTag withShareable(Boolean shareable) {
        this.shareable = shareable;
        return this;
    }

    /** 是否为共享云硬盘。true为共享盘，false为普通云硬盘。 该字段已经废弃，请使用multiattach。
     * 
     * @return shareable */
    public Boolean getShareable() {
        return shareable;
    }

    public void setShareable(Boolean shareable) {
        this.shareable = shareable;
    }

    public VolumeDetailForTag withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /** 预留属性。
     * 
     * @return userId */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public VolumeDetailForTag withServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /** 服务类型，结果为EVS、DSS、DESS。
     * 
     * @return serviceType */
    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public VolumeDetailForTag withMultiattach(Boolean multiattach) {
        this.multiattach = multiattach;
        return this;
    }

    /** 是否为共享云硬盘。
     * 
     * @return multiattach */
    public Boolean getMultiattach() {
        return multiattach;
    }

    public void setMultiattach(Boolean multiattach) {
        this.multiattach = multiattach;
    }

    public VolumeDetailForTag withDedicatedStorageId(String dedicatedStorageId) {
        this.dedicatedStorageId = dedicatedStorageId;
        return this;
    }

    /** 云硬盘所属的专属存储池ID。
     * 
     * @return dedicatedStorageId */
    public String getDedicatedStorageId() {
        return dedicatedStorageId;
    }

    public void setDedicatedStorageId(String dedicatedStorageId) {
        this.dedicatedStorageId = dedicatedStorageId;
    }

    public VolumeDetailForTag withDedicatedStorageName(String dedicatedStorageName) {
        this.dedicatedStorageName = dedicatedStorageName;
        return this;
    }

    /** 云硬盘所属的专属存储池的名称。
     * 
     * @return dedicatedStorageName */
    public String getDedicatedStorageName() {
        return dedicatedStorageName;
    }

    public void setDedicatedStorageName(String dedicatedStorageName) {
        this.dedicatedStorageName = dedicatedStorageName;
    }

    public VolumeDetailForTag withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    public VolumeDetailForTag putTagsItem(String key, String tagsItem) {
        if (this.tags == null) {
            this.tags = new HashMap<>();
        }
        this.tags.put(key, tagsItem);
        return this;
    }

    public VolumeDetailForTag withTags(Consumer<Map<String, String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new HashMap<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /** 云硬盘的标签。 如果云硬盘有标签，则会有该字段，否则该字段为空。
     * 
     * @return tags */
    public Map<String, String> getTags() {
        return tags;
    }

    public void setTags(Map<String, String> tags) {
        this.tags = tags;
    }

    public VolumeDetailForTag withWwn(String wwn) {
        this.wwn = wwn;
        return this;
    }

    /** 云硬盘挂载时的唯一标识。
     * 
     * @return wwn */
    public String getWwn() {
        return wwn;
    }

    public void setWwn(String wwn) {
        this.wwn = wwn;
    }

    public VolumeDetailForTag withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /** 云硬盘上绑定的企业项目ID。 > 说明： > >
     * 关于企业项目ID的获取及企业项目特性的详细信息，请参见：\"[企业管理用户指南](https://support.huaweicloud.com/usermanual-em/zh-cn_topic_0123692049.html)\"。
     * 
     * @return enterpriseProjectId */
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
        VolumeDetailForTag volumeDetailForTag = (VolumeDetailForTag) o;
        return Objects.equals(this.id, volumeDetailForTag.id) && Objects.equals(this.links, volumeDetailForTag.links)
            && Objects.equals(this.name, volumeDetailForTag.name)
            && Objects.equals(this.status, volumeDetailForTag.status)
            && Objects.equals(this.attachments, volumeDetailForTag.attachments)
            && Objects.equals(this.availabilityZone, volumeDetailForTag.availabilityZone)
            && Objects.equals(this.osVolHostAttrHost, volumeDetailForTag.osVolHostAttrHost)
            && Objects.equals(this.sourceVolid, volumeDetailForTag.sourceVolid)
            && Objects.equals(this.snapshotId, volumeDetailForTag.snapshotId)
            && Objects.equals(this.description, volumeDetailForTag.description)
            && Objects.equals(this.createdAt, volumeDetailForTag.createdAt)
            && Objects.equals(this.osVolTenantAttrTenantId, volumeDetailForTag.osVolTenantAttrTenantId)
            && Objects.equals(this.volumeImageMetadata, volumeDetailForTag.volumeImageMetadata)
            && Objects.equals(this.volumeType, volumeDetailForTag.volumeType)
            && Objects.equals(this.size, volumeDetailForTag.size)
            && Objects.equals(this.consistencygroupId, volumeDetailForTag.consistencygroupId)
            && Objects.equals(this.bootable, volumeDetailForTag.bootable)
            && Objects.equals(this.metadata, volumeDetailForTag.metadata)
            && Objects.equals(this.updatedAt, volumeDetailForTag.updatedAt)
            && Objects.equals(this.encrypted, volumeDetailForTag.encrypted)
            && Objects.equals(this.replicationStatus, volumeDetailForTag.replicationStatus)
            && Objects.equals(this.osVolumeReplicationExtendedStatus,
                volumeDetailForTag.osVolumeReplicationExtendedStatus)
            && Objects.equals(this.osVolMigStatusAttrMigstat, volumeDetailForTag.osVolMigStatusAttrMigstat)
            && Objects.equals(this.osVolMigStatusAttrNameId, volumeDetailForTag.osVolMigStatusAttrNameId)
            && Objects.equals(this.shareable, volumeDetailForTag.shareable)
            && Objects.equals(this.userId, volumeDetailForTag.userId)
            && Objects.equals(this.serviceType, volumeDetailForTag.serviceType)
            && Objects.equals(this.multiattach, volumeDetailForTag.multiattach)
            && Objects.equals(this.dedicatedStorageId, volumeDetailForTag.dedicatedStorageId)
            && Objects.equals(this.dedicatedStorageName, volumeDetailForTag.dedicatedStorageName)
            && Objects.equals(this.tags, volumeDetailForTag.tags) && Objects.equals(this.wwn, volumeDetailForTag.wwn)
            && Objects.equals(this.enterpriseProjectId, volumeDetailForTag.enterpriseProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            links,
            name,
            status,
            attachments,
            availabilityZone,
            osVolHostAttrHost,
            sourceVolid,
            snapshotId,
            description,
            createdAt,
            osVolTenantAttrTenantId,
            volumeImageMetadata,
            volumeType,
            size,
            consistencygroupId,
            bootable,
            metadata,
            updatedAt,
            encrypted,
            replicationStatus,
            osVolumeReplicationExtendedStatus,
            osVolMigStatusAttrMigstat,
            osVolMigStatusAttrNameId,
            shareable,
            userId,
            serviceType,
            multiattach,
            dedicatedStorageId,
            dedicatedStorageName,
            tags,
            wwn,
            enterpriseProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VolumeDetailForTag {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    osVolHostAttrHost: ").append(toIndentedString(osVolHostAttrHost)).append("\n");
        sb.append("    sourceVolid: ").append(toIndentedString(sourceVolid)).append("\n");
        sb.append("    snapshotId: ").append(toIndentedString(snapshotId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    osVolTenantAttrTenantId: ").append(toIndentedString(osVolTenantAttrTenantId)).append("\n");
        sb.append("    volumeImageMetadata: ").append(toIndentedString(volumeImageMetadata)).append("\n");
        sb.append("    volumeType: ").append(toIndentedString(volumeType)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    consistencygroupId: ").append(toIndentedString(consistencygroupId)).append("\n");
        sb.append("    bootable: ").append(toIndentedString(bootable)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    encrypted: ").append(toIndentedString(encrypted)).append("\n");
        sb.append("    replicationStatus: ").append(toIndentedString(replicationStatus)).append("\n");
        sb.append("    osVolumeReplicationExtendedStatus: ")
            .append(toIndentedString(osVolumeReplicationExtendedStatus))
            .append("\n");
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

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
