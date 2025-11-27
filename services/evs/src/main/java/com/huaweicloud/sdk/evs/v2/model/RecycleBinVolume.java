package com.huaweicloud.sdk.evs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 回收站云硬盘详情
 */
public class RecycleBinVolume {

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
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attachments")

    private List<Attachment> attachments = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "multiattach")

    private Boolean multiattach;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private Map<String, Object> metadata = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bootable")

    private String bootable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private Map<String, String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type")

    private String serviceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_type")

    private String volumeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_delete_at")

    private String planDeleteAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pre_deleted_at")

    private String preDeletedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dedicated_storage_id")

    private String dedicatedStorageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dedicated_storage_name")

    private String dedicatedStorageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_image_metadata")

    private Map<String, Object> volumeImageMetadata = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wwn")

    private String wwn;

    public RecycleBinVolume withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释** 云硬盘ID。 **取值范围** 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RecycleBinVolume withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释** 云硬盘名称。 **取值范围** 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RecycleBinVolume withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释** 云硬盘描述。 **取值范围** 不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public RecycleBinVolume withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释** 云硬盘状态，具体请参见[云硬盘状态](evs_04_0040.xml)。 **取值范围** 不涉及。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public RecycleBinVolume withAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
        return this;
    }

    public RecycleBinVolume addAttachmentsItem(Attachment attachmentsItem) {
        if (this.attachments == null) {
            this.attachments = new ArrayList<>();
        }
        this.attachments.add(attachmentsItem);
        return this;
    }

    public RecycleBinVolume withAttachments(Consumer<List<Attachment>> attachmentsSetter) {
        if (this.attachments == null) {
            this.attachments = new ArrayList<>();
        }
        attachmentsSetter.accept(this.attachments);
        return this;
    }

    /**
     * **参数解释** 云硬盘的挂载信息。 **取值范围** 不涉及。
     * @return attachments
     */
    public List<Attachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    public RecycleBinVolume withMultiattach(Boolean multiattach) {
        this.multiattach = multiattach;
        return this;
    }

    /**
     * **参数解释** 云硬盘是否共享。 **取值范围** - true：表示为共享云硬盘。 - false：表示为普通云硬盘。
     * @return multiattach
     */
    public Boolean getMultiattach() {
        return multiattach;
    }

    public void setMultiattach(Boolean multiattach) {
        this.multiattach = multiattach;
    }

    public RecycleBinVolume withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * **参数解释** 云硬盘大小，单位为GiB。 **取值范围** 不涉及。
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public RecycleBinVolume withMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
        return this;
    }

    public RecycleBinVolume putMetadataItem(String key, Object metadataItem) {
        if (this.metadata == null) {
            this.metadata = new HashMap<>();
        }
        this.metadata.put(key, metadataItem);
        return this;
    }

    public RecycleBinVolume withMetadata(Consumer<Map<String, Object>> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new HashMap<>();
        }
        metadataSetter.accept(this.metadata);
        return this;
    }

    /**
     * **参数解释** 云硬盘的metadata信息 ，调用方可以添加或删除metadata信息。 **取值范围** 当前部分key在EVS服务中有业务场景含义，这部分key的描述如下： - __system__cmkid    metadata中的加密cmkid字段，与__system__encrypted配合表示需要加密，cmkid长度固定为36个字节。    请求获取密钥ID的方法请参考：\"[查询密钥列表](https://support.huaweicloud.com/api-dew/ListKeys.html)\"。      - __system__encrypted    metadata中的表示加密功能的字段，0代表不加密，1代表加密。    不指定该字段时，云硬盘的加密属性与数据源保持一致，如果不是从数据源创建的场景，则默认不加密。   - hw:passthrough    - true表示云硬盘的设备类型为SCSI类型，即允许ECS操作系统直接访问底层存储介质。支持SCSI锁命令。    - false表示云硬盘的设备类型为VBD (虚拟块存储设备 , Virtual Block Device)类型，即为默认类型，VBD只能支持简单的SCSI读写命令。    - 该字段不存在时，云硬盘默认为VBD类型。
     * @return metadata
     */
    public Map<String, Object> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
    }

    public RecycleBinVolume withBootable(String bootable) {
        this.bootable = bootable;
        return this;
    }

    /**
     * **参数解释** 云硬盘是否为启动盘。 **取值范围** - true：表示为启动云硬盘。 - false：表示为非启动云硬盘。
     * @return bootable
     */
    public String getBootable() {
        return bootable;
    }

    public void setBootable(String bootable) {
        this.bootable = bootable;
    }

    public RecycleBinVolume withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    public RecycleBinVolume putTagsItem(String key, String tagsItem) {
        if (this.tags == null) {
            this.tags = new HashMap<>();
        }
        this.tags.put(key, tagsItem);
        return this;
    }

    public RecycleBinVolume withTags(Consumer<Map<String, String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new HashMap<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释** 云硬盘标签。 **取值范围** 不涉及。
     * @return tags
     */
    public Map<String, String> getTags() {
        return tags;
    }

    public void setTags(Map<String, String> tags) {
        this.tags = tags;
    }

    public RecycleBinVolume withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * **参数解释** 云硬盘所属可用区。 **取值范围** 不涉及。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public RecycleBinVolume withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释** 云硬盘创建时间。 **取值范围** 时间格式：UTC YYYY-MM-DDTHH:MM:SS.XXXXXX
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public RecycleBinVolume withServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * **参数解释** 云硬盘所属的服务类型。 **取值范围** - EVS：云硬盘。 - DSS：专属分布式存储服务。
     * @return serviceType
     */
    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public RecycleBinVolume withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * **参数解释** 云硬盘信息被更新的时间。 **取值范围** 时间格式：UTC YYYY-MM-DDTHH:MM:SS.XXXXXX
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public RecycleBinVolume withVolumeType(String volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    /**
     * **参数解释** 云硬盘类型。 **取值范围** 目前支持\"SATA\"，\"SAS\"，\"GPSSD\"，\"SSD\"，\"ESSD\"，\"GPSSD2\"，\"ESSD2\"七种。   - \"SATA\"为普通IO云硬盘(已售罄) - \"SAS\"为高IO云硬盘 - \"GPSSD\"为通用型SSD云硬盘 - \"SSD\"为超高IO云硬盘 - \"ESSD\"为极速型SSD云硬盘 - \"GPSSD2\"为通用型SSD V2云硬盘 - \"ESSD2\"为极速型SSD V2云硬盘
     * @return volumeType
     */
    public String getVolumeType() {
        return volumeType;
    }

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    public RecycleBinVolume withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释** 企业项目ID。 **取值范围** 不涉及。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public RecycleBinVolume withPlanDeleteAt(String planDeleteAt) {
        this.planDeleteAt = planDeleteAt;
        return this;
    }

    /**
     * **参数解释** 预计到期清理的时间。 **取值范围** 时间格式：UTC YYYY-MM-DDTHH:MM:SS.XXXXXX
     * @return planDeleteAt
     */
    public String getPlanDeleteAt() {
        return planDeleteAt;
    }

    public void setPlanDeleteAt(String planDeleteAt) {
        this.planDeleteAt = planDeleteAt;
    }

    public RecycleBinVolume withPreDeletedAt(String preDeletedAt) {
        this.preDeletedAt = preDeletedAt;
        return this;
    }

    /**
     * **参数解释** 放入回收站的时间。 **取值范围** 时间格式：UTC YYYY-MM-DDTHH:MM:SS.XXXXXX
     * @return preDeletedAt
     */
    public String getPreDeletedAt() {
        return preDeletedAt;
    }

    public void setPreDeletedAt(String preDeletedAt) {
        this.preDeletedAt = preDeletedAt;
    }

    public RecycleBinVolume withDedicatedStorageId(String dedicatedStorageId) {
        this.dedicatedStorageId = dedicatedStorageId;
        return this;
    }

    /**
     * **参数解释** 云硬盘所属的专属存储池ID。 **取值范围** 不涉及。
     * @return dedicatedStorageId
     */
    public String getDedicatedStorageId() {
        return dedicatedStorageId;
    }

    public void setDedicatedStorageId(String dedicatedStorageId) {
        this.dedicatedStorageId = dedicatedStorageId;
    }

    public RecycleBinVolume withDedicatedStorageName(String dedicatedStorageName) {
        this.dedicatedStorageName = dedicatedStorageName;
        return this;
    }

    /**
     * **参数解释** 云硬盘所属的专属存储池的名称。 **取值范围** 不涉及。
     * @return dedicatedStorageName
     */
    public String getDedicatedStorageName() {
        return dedicatedStorageName;
    }

    public void setDedicatedStorageName(String dedicatedStorageName) {
        this.dedicatedStorageName = dedicatedStorageName;
    }

    public RecycleBinVolume withVolumeImageMetadata(Map<String, Object> volumeImageMetadata) {
        this.volumeImageMetadata = volumeImageMetadata;
        return this;
    }

    public RecycleBinVolume putVolumeImageMetadataItem(String key, Object volumeImageMetadataItem) {
        if (this.volumeImageMetadata == null) {
            this.volumeImageMetadata = new HashMap<>();
        }
        this.volumeImageMetadata.put(key, volumeImageMetadataItem);
        return this;
    }

    public RecycleBinVolume withVolumeImageMetadata(Consumer<Map<String, Object>> volumeImageMetadataSetter) {
        if (this.volumeImageMetadata == null) {
            this.volumeImageMetadata = new HashMap<>();
        }
        volumeImageMetadataSetter.accept(this.volumeImageMetadata);
        return this;
    }

    /**
     * **参数解释** 云硬盘镜像的元数据。 关于“volume_image_metadata”字段的详细说明，具体请参见：\"[查询镜像详情](https://support.huaweicloud.com/api-ims/ims_03_0703.html)\"。  **取值范围** 不涉及。
     * @return volumeImageMetadata
     */
    public Map<String, Object> getVolumeImageMetadata() {
        return volumeImageMetadata;
    }

    public void setVolumeImageMetadata(Map<String, Object> volumeImageMetadata) {
        this.volumeImageMetadata = volumeImageMetadata;
    }

    public RecycleBinVolume withWwn(String wwn) {
        this.wwn = wwn;
        return this;
    }

    /**
     * **参数解释** 云硬盘的唯一标识。 **取值范围** 不涉及。
     * @return wwn
     */
    public String getWwn() {
        return wwn;
    }

    public void setWwn(String wwn) {
        this.wwn = wwn;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RecycleBinVolume that = (RecycleBinVolume) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.status, that.status)
            && Objects.equals(this.attachments, that.attachments) && Objects.equals(this.multiattach, that.multiattach)
            && Objects.equals(this.size, that.size) && Objects.equals(this.metadata, that.metadata)
            && Objects.equals(this.bootable, that.bootable) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.availabilityZone, that.availabilityZone)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.serviceType, that.serviceType)
            && Objects.equals(this.updatedAt, that.updatedAt) && Objects.equals(this.volumeType, that.volumeType)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.planDeleteAt, that.planDeleteAt)
            && Objects.equals(this.preDeletedAt, that.preDeletedAt)
            && Objects.equals(this.dedicatedStorageId, that.dedicatedStorageId)
            && Objects.equals(this.dedicatedStorageName, that.dedicatedStorageName)
            && Objects.equals(this.volumeImageMetadata, that.volumeImageMetadata) && Objects.equals(this.wwn, that.wwn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            status,
            attachments,
            multiattach,
            size,
            metadata,
            bootable,
            tags,
            availabilityZone,
            createdAt,
            serviceType,
            updatedAt,
            volumeType,
            enterpriseProjectId,
            planDeleteAt,
            preDeletedAt,
            dedicatedStorageId,
            dedicatedStorageName,
            volumeImageMetadata,
            wwn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecycleBinVolume {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
        sb.append("    multiattach: ").append(toIndentedString(multiattach)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    bootable: ").append(toIndentedString(bootable)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    volumeType: ").append(toIndentedString(volumeType)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    planDeleteAt: ").append(toIndentedString(planDeleteAt)).append("\n");
        sb.append("    preDeletedAt: ").append(toIndentedString(preDeletedAt)).append("\n");
        sb.append("    dedicatedStorageId: ").append(toIndentedString(dedicatedStorageId)).append("\n");
        sb.append("    dedicatedStorageName: ").append(toIndentedString(dedicatedStorageName)).append("\n");
        sb.append("    volumeImageMetadata: ").append(toIndentedString(volumeImageMetadata)).append("\n");
        sb.append("    wwn: ").append(toIndentedString(wwn)).append("\n");
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
