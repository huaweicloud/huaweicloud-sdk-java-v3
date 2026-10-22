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
 * SnapshotDetailV5
 */
public class SnapshotDetailV5 {

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
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_id")

    private String volumeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encrypted")

    private Boolean encrypted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cmk_id")

    private String cmkId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private Map<String, String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instant_access")

    private Boolean instantAccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retention_at")

    private String retentionAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instant_access_retention_at")

    private String instantAccessRetentionAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incremental")

    private Boolean incremental;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshot_type")

    private String snapshotType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress")

    private String progress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encrypt_algorithm")

    private String encryptAlgorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshot_chains")

    private List<SnapshotChains> snapshotChains = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshot_group_id")

    private String snapshotGroupId;

    public SnapshotDetailV5 withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释** 云硬盘快照ID。 **取值范围** 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SnapshotDetailV5 withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释** 云硬盘快照名称。 名称以autobk_snapshot_为前缀的快照是创建云硬盘备份时系统自动创建的，请不要进行“删除云硬盘快照”和“回滚快照到云硬盘”操作。 **取值范围** 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SnapshotDetailV5 withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释** 云硬盘快照描述信息。 **取值范围** 不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SnapshotDetailV5 withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释** 云硬盘快照创建时间。 时间格式：UTC YYYY-MM-DDTHH:MM:SS.XXXXXX **取值范围** 不涉及。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public SnapshotDetailV5 withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * **参数解释** 云硬盘快照更新时间。 **取值范围** 不涉及。
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public SnapshotDetailV5 withVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    /**
     * **参数解释** 快照所属的云硬盘ID。 **取值范围** 不涉及。
     * @return volumeId
     */
    public String getVolumeId() {
        return volumeId;
    }

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    public SnapshotDetailV5 withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * **参数解释** 云硬盘快照大小，单位为GiB。 **取值范围** 不涉及。
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public SnapshotDetailV5 withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释** 云硬盘快照的状态。 **取值范围** 具体请参见[云硬盘快照状态](evs_04_0041.xml)。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public SnapshotDetailV5 withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释** 项目ID。 **取值范围** 不涉及。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public SnapshotDetailV5 withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释** 快照所属的企业项目ID。 **取值范围** 不涉及。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public SnapshotDetailV5 withEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }

    /**
     * **参数解释** 是否为加密快照。 **取值范围** 不涉及。
     * @return encrypted
     */
    public Boolean getEncrypted() {
        return encrypted;
    }

    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    public SnapshotDetailV5 withCmkId(String cmkId) {
        this.cmkId = cmkId;
        return this;
    }

    /**
     * **参数解释** 快照所属的云硬盘ID的密钥ID。 **取值范围** 不涉及。
     * @return cmkId
     */
    public String getCmkId() {
        return cmkId;
    }

    public void setCmkId(String cmkId) {
        this.cmkId = cmkId;
    }

    public SnapshotDetailV5 withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * **参数解释** 快照类型。 **取值范围** 枚举值：standard/flash。
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public SnapshotDetailV5 withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * **参数解释** 快照所属AZ。 **取值范围** 不涉及。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public SnapshotDetailV5 withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    public SnapshotDetailV5 putTagsItem(String key, String tagsItem) {
        if (this.tags == null) {
            this.tags = new HashMap<>();
        }
        this.tags.put(key, tagsItem);
        return this;
    }

    public SnapshotDetailV5 withTags(Consumer<Map<String, String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new HashMap<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释** 快照所属标签。 标签的key：String类型，最大长度36个字符。 由英文字母、数字、下划线、中划线、UNICODE字符（\\u4E00-\\u9FFF）组成。  标签的value：String类型，最大长度43个字符，可以为空字符串。 由英文字母、数字、下划线、点、中划线、UNICODE字符（\\u4E00-\\u9FFF）组成。 **取值范围** 不涉及。
     * @return tags
     */
    public Map<String, String> getTags() {
        return tags;
    }

    public void setTags(Map<String, String> tags) {
        this.tags = tags;
    }

    public SnapshotDetailV5 withInstantAccess(Boolean instantAccess) {
        this.instantAccess = instantAccess;
        return this;
    }

    /**
     * **参数解释** 是否开启了快照极速可用功能。 **取值范围** true：开启。仅SSD系列云盘支持开启该功能。 false：关闭。即快照为未开启快照极速可用功能的存量快照。
     * @return instantAccess
     */
    public Boolean getInstantAccess() {
        return instantAccess;
    }

    public void setInstantAccess(Boolean instantAccess) {
        this.instantAccess = instantAccess;
    }

    public SnapshotDetailV5 withRetentionAt(String retentionAt) {
        this.retentionAt = retentionAt;
        return this;
    }

    /**
     * **参数解释** 快照保留的时间。 **取值范围** 不涉及。
     * @return retentionAt
     */
    public String getRetentionAt() {
        return retentionAt;
    }

    public void setRetentionAt(String retentionAt) {
        this.retentionAt = retentionAt;
    }

    public SnapshotDetailV5 withInstantAccessRetentionAt(String instantAccessRetentionAt) {
        this.instantAccessRetentionAt = instantAccessRetentionAt;
        return this;
    }

    /**
     * **参数解释** 设置快照极速可用功能的保留时间，保留时间到期后自动关闭快照极速可用功能。 **取值范围** 默认与参数retention_at的值一致。
     * @return instantAccessRetentionAt
     */
    public String getInstantAccessRetentionAt() {
        return instantAccessRetentionAt;
    }

    public void setInstantAccessRetentionAt(String instantAccessRetentionAt) {
        this.instantAccessRetentionAt = instantAccessRetentionAt;
    }

    public SnapshotDetailV5 withIncremental(Boolean incremental) {
        this.incremental = incremental;
        return this;
    }

    /**
     * **参数解释** 是否增量快照。 **取值范围** true，false。
     * @return incremental
     */
    public Boolean getIncremental() {
        return incremental;
    }

    public void setIncremental(Boolean incremental) {
        this.incremental = incremental;
    }

    public SnapshotDetailV5 withSnapshotType(String snapshotType) {
        this.snapshotType = snapshotType;
        return this;
    }

    /**
     * **参数解释** 快照创建来源。 **取值范围** auto：自动创建快照。 user：手动创建快照。 copy：复制快照。
     * @return snapshotType
     */
    public String getSnapshotType() {
        return snapshotType;
    }

    public void setSnapshotType(String snapshotType) {
        this.snapshotType = snapshotType;
    }

    public SnapshotDetailV5 withProgress(String progress) {
        this.progress = progress;
        return this;
    }

    /**
     * **参数解释** 快照创建进度，单位为百分比。 **取值范围** 不涉及。
     * @return progress
     */
    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public SnapshotDetailV5 withEncryptAlgorithm(String encryptAlgorithm) {
        this.encryptAlgorithm = encryptAlgorithm;
        return this;
    }

    /**
     * **参数解释** 加密快照的加密算法。 **取值范围** 不涉及。
     * @return encryptAlgorithm
     */
    public String getEncryptAlgorithm() {
        return encryptAlgorithm;
    }

    public void setEncryptAlgorithm(String encryptAlgorithm) {
        this.encryptAlgorithm = encryptAlgorithm;
    }

    public SnapshotDetailV5 withSnapshotChains(List<SnapshotChains> snapshotChains) {
        this.snapshotChains = snapshotChains;
        return this;
    }

    public SnapshotDetailV5 addSnapshotChainsItem(SnapshotChains snapshotChainsItem) {
        if (this.snapshotChains == null) {
            this.snapshotChains = new ArrayList<>();
        }
        this.snapshotChains.add(snapshotChainsItem);
        return this;
    }

    public SnapshotDetailV5 withSnapshotChains(Consumer<List<SnapshotChains>> snapshotChainsSetter) {
        if (this.snapshotChains == null) {
            this.snapshotChains = new ArrayList<>();
        }
        snapshotChainsSetter.accept(this.snapshotChains);
        return this;
    }

    /**
     * **参数解释** 快照所属的快照链信息。 **取值范围** 不涉及。
     * @return snapshotChains
     */
    public List<SnapshotChains> getSnapshotChains() {
        return snapshotChains;
    }

    public void setSnapshotChains(List<SnapshotChains> snapshotChains) {
        this.snapshotChains = snapshotChains;
    }

    public SnapshotDetailV5 withSnapshotGroupId(String snapshotGroupId) {
        this.snapshotGroupId = snapshotGroupId;
        return this;
    }

    /**
     * **参数解释** 快照所属的一致性快照组id。 **取值范围** 不涉及。
     * @return snapshotGroupId
     */
    public String getSnapshotGroupId() {
        return snapshotGroupId;
    }

    public void setSnapshotGroupId(String snapshotGroupId) {
        this.snapshotGroupId = snapshotGroupId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SnapshotDetailV5 that = (SnapshotDetailV5) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt) && Objects.equals(this.volumeId, that.volumeId)
            && Objects.equals(this.size, that.size) && Objects.equals(this.status, that.status)
            && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.encrypted, that.encrypted) && Objects.equals(this.cmkId, that.cmkId)
            && Objects.equals(this.category, that.category)
            && Objects.equals(this.availabilityZone, that.availabilityZone) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.instantAccess, that.instantAccess)
            && Objects.equals(this.retentionAt, that.retentionAt)
            && Objects.equals(this.instantAccessRetentionAt, that.instantAccessRetentionAt)
            && Objects.equals(this.incremental, that.incremental)
            && Objects.equals(this.snapshotType, that.snapshotType) && Objects.equals(this.progress, that.progress)
            && Objects.equals(this.encryptAlgorithm, that.encryptAlgorithm)
            && Objects.equals(this.snapshotChains, that.snapshotChains)
            && Objects.equals(this.snapshotGroupId, that.snapshotGroupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            createdAt,
            updatedAt,
            volumeId,
            size,
            status,
            projectId,
            enterpriseProjectId,
            encrypted,
            cmkId,
            category,
            availabilityZone,
            tags,
            instantAccess,
            retentionAt,
            instantAccessRetentionAt,
            incremental,
            snapshotType,
            progress,
            encryptAlgorithm,
            snapshotChains,
            snapshotGroupId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SnapshotDetailV5 {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    volumeId: ").append(toIndentedString(volumeId)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    encrypted: ").append(toIndentedString(encrypted)).append("\n");
        sb.append("    cmkId: ").append(toIndentedString(cmkId)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    instantAccess: ").append(toIndentedString(instantAccess)).append("\n");
        sb.append("    retentionAt: ").append(toIndentedString(retentionAt)).append("\n");
        sb.append("    instantAccessRetentionAt: ").append(toIndentedString(instantAccessRetentionAt)).append("\n");
        sb.append("    incremental: ").append(toIndentedString(incremental)).append("\n");
        sb.append("    snapshotType: ").append(toIndentedString(snapshotType)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    encryptAlgorithm: ").append(toIndentedString(encryptAlgorithm)).append("\n");
        sb.append("    snapshotChains: ").append(toIndentedString(snapshotChains)).append("\n");
        sb.append("    snapshotGroupId: ").append(toIndentedString(snapshotGroupId)).append("\n");
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
