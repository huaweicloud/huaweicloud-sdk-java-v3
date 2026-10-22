package com.huaweicloud.sdk.evs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class CountSnapshotsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_id")

    private String volumeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshot_type")

    private String snapshotType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_key")

    private String tagKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private String tags;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshot_chain_id")

    private String snapshotChainId;

    public CountSnapshotsRequest withVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    /**
     * **参数解释** 快照对应的云硬盘ID。 可通过[查询所有云硬盘详情](evs_04_2006.xml)获取云硬盘ID。 **约束限制** 不涉及。 **取值范围** 不涉及。 **默认取值** 不涉及。
     * @return volumeId
     */
    public String getVolumeId() {
        return volumeId;
    }

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    public CountSnapshotsRequest withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * **参数解释** 快照对应的云硬盘所在的可用区。 **约束限制** 不涉及。 **取值范围** 不涉及。 **默认取值** 不涉及。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public CountSnapshotsRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释** 快照名称。 **约束限制** 不涉及。 **取值范围** 最大支持64个字符。 **默认取值** 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CountSnapshotsRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释** 快照状态。 **约束限制** 最大支持255个字符。 **取值范围** [具体请参见[云硬盘快照状态](evs_04_0041.xml)。] **默认取值** 不涉及。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CountSnapshotsRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释** 快照ID。 可通过[查询云硬盘快照详情列表](evs_04_2021.xml)接口获取云硬盘快照ID。 **约束限制** 不涉及。 **取值范围** 不涉及。 **默认取值** 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CountSnapshotsRequest withSnapshotType(String snapshotType) {
        this.snapshotType = snapshotType;
        return this;
    }

    /**
     * **参数解释** 快照来源。 **约束限制** 不涉及。 **取值范围** 不涉及。 **默认取值** 不涉及。
     * @return snapshotType
     */
    public String getSnapshotType() {
        return snapshotType;
    }

    public void setSnapshotType(String snapshotType) {
        this.snapshotType = snapshotType;
    }

    public CountSnapshotsRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释** 快照的企业项目ID。  关于企业项目ID的获取及企业项目特性的详细信息，请参考：\"[[企业管理用户指南](https://support.huaweicloud.com/usermanual-em/zh-cn_topic_0123692049.html)](tag:hws)[[企业管理用户指南](https://support.huaweicloud.com/intl/zh-cn/usermanual-em/zh-cn_topic_0123692049.html)](tag:hws_hk)\"。 **约束限制** 不涉及。 **取值范围** 不涉及。 **默认取值** 不涉及。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CountSnapshotsRequest withTagKey(String tagKey) {
        this.tagKey = tagKey;
        return this;
    }

    /**
     * **参数解释** 快照标签的key。 **约束限制** 不涉及。 **取值范围** 不涉及。 **默认取值** 不涉及。
     * @return tagKey
     */
    public String getTagKey() {
        return tagKey;
    }

    public void setTagKey(String tagKey) {
        this.tagKey = tagKey;
    }

    public CountSnapshotsRequest withTags(String tags) {
        this.tags = tags;
        return this;
    }

    /**
     * **参数解释** 快照标签的key/value对，例如[{\"key\":\"bbb\",\"value\":\"bbb\"}]。 **约束限制** 不涉及。 **取值范围** 不涉及。 **默认取值** 不涉及。
     * @return tags
     */
    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public CountSnapshotsRequest withSnapshotChainId(String snapshotChainId) {
        this.snapshotChainId = snapshotChainId;
        return this;
    }

    /**
     * **参数解释** 快照链ID。 **约束限制** 不涉及。 **取值范围** 不涉及。 **默认取值** 不涉及。
     * @return snapshotChainId
     */
    public String getSnapshotChainId() {
        return snapshotChainId;
    }

    public void setSnapshotChainId(String snapshotChainId) {
        this.snapshotChainId = snapshotChainId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CountSnapshotsRequest that = (CountSnapshotsRequest) obj;
        return Objects.equals(this.volumeId, that.volumeId)
            && Objects.equals(this.availabilityZone, that.availabilityZone) && Objects.equals(this.name, that.name)
            && Objects.equals(this.status, that.status) && Objects.equals(this.id, that.id)
            && Objects.equals(this.snapshotType, that.snapshotType)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.tagKey, that.tagKey) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.snapshotChainId, that.snapshotChainId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(volumeId,
            availabilityZone,
            name,
            status,
            id,
            snapshotType,
            enterpriseProjectId,
            tagKey,
            tags,
            snapshotChainId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CountSnapshotsRequest {\n");
        sb.append("    volumeId: ").append(toIndentedString(volumeId)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    snapshotType: ").append(toIndentedString(snapshotType)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    tagKey: ").append(toIndentedString(tagKey)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    snapshotChainId: ").append(toIndentedString(snapshotChainId)).append("\n");
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
