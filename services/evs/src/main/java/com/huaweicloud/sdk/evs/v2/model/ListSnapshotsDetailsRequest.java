package com.huaweicloud.sdk.evs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListSnapshotsDetailsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_id")

    private String volumeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private String limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private String offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_key")

    private String sortKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_dir")

    private String sortDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ids")

    private String ids;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshot_group_id")

    private String snapshotGroupId;

    public ListSnapshotsDetailsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * **参数解释** 分页查询的起始资源id，取值为上一页最后一条查询记录的资源id。 **约束限制** 不涉及。 **取值范围** 不涉及。 **默认取值** 不涉及。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListSnapshotsDetailsRequest withVolumeId(String volumeId) {
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

    public ListSnapshotsDetailsRequest withAvailabilityZone(String availabilityZone) {
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

    public ListSnapshotsDetailsRequest withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释** 返回结果个数限制。  当租户所有的快照数量大于50个时，为了提升您的查询效率，建议查询的时候使用limit参数，并且参数值最大设置为50。查询示例：  GET /v2/xxx/snapshots/detail?limit=50，表示查询第1~50个快照。GET /v2/xxx/snapshots/detail?offset=50&limit=50，表示查询第51~100个快照。 **约束限制** 不涉及。 **取值范围** 最小值1，最大值1000，默认为1000。返回的结果中记录数不超过limit值。 **默认取值** 不涉及。
     * @return limit
     */
    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public ListSnapshotsDetailsRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释** 快照名称。 **约束限制** 不涉及。 **取值范围** 最大支持255个字符。 **默认取值** 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListSnapshotsDetailsRequest withOffset(String offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释** 偏移量。  分页查询快照时使用，与limit配合使用。假如共有30个快照， 设置offset为11，limit为10，即为从第12个快照开始查询， 一次最多可读取10个快照。 **约束限制** 与limit配合使用。 **取值范围** 不涉及。 **默认取值** 不涉及。
     * @return offset
     */
    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public ListSnapshotsDetailsRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释** 快照状态。 **约束限制** 不涉及。 **取值范围** [具体请参见[云硬盘快照状态](evs_04_0041.xml)。] **默认取值** 不涉及。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListSnapshotsDetailsRequest withSortKey(String sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    /**
     * **参数解释** 返回结果按该关键字排序。 **约束限制** 不涉及。 **取值范围** - id：云硬盘快照ID。 - status：云硬盘快照状态，取值可参考：\"[云硬盘快照状态。](evs_04_0041.xml)\"。 - size：云硬盘快照大小，单位为GiB。 - created_at：云硬盘快照创建时间。 **默认取值** created_at
     * @return sortKey
     */
    public String getSortKey() {
        return sortKey;
    }

    public void setSortKey(String sortKey) {
        this.sortKey = sortKey;
    }

    public ListSnapshotsDetailsRequest withSortDir(String sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    /**
     * **参数解释** 返回结果按照降序或升序排列，默认为“desc”。  **约束限制** 不涉及。 **取值范围** - desc：降序。 - asc：升序。 **默认取值** desc
     * @return sortDir
     */
    public String getSortDir() {
        return sortDir;
    }

    public void setSortDir(String sortDir) {
        this.sortDir = sortDir;
    }

    public ListSnapshotsDetailsRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释** 快照ID。 **约束限制** 不涉及。 **取值范围** 不涉及。 **默认取值** 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListSnapshotsDetailsRequest withIds(String ids) {
        this.ids = ids;
        return this;
    }

    /**
     * **参数解释** 快照id列表，多个id直接用,号隔开，格式为ids=id1,id2,...,idx。返回有效id对应的快照信息，无效的id会被忽略。 **约束限制** 最多支持一次查询60个id。 如果“id”和“ids”查询参数同时存在，“id”会被忽略。 **取值范围** 不涉及。 **默认取值** 不涉及。
     * @return ids
     */
    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

    public ListSnapshotsDetailsRequest withSnapshotType(String snapshotType) {
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

    public ListSnapshotsDetailsRequest withEnterpriseProjectId(String enterpriseProjectId) {
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

    public ListSnapshotsDetailsRequest withTagKey(String tagKey) {
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

    public ListSnapshotsDetailsRequest withTags(String tags) {
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

    public ListSnapshotsDetailsRequest withSnapshotChainId(String snapshotChainId) {
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

    public ListSnapshotsDetailsRequest withSnapshotGroupId(String snapshotGroupId) {
        this.snapshotGroupId = snapshotGroupId;
        return this;
    }

    /**
     * **参数解释** 快照一致性组ID。 **约束限制** 不涉及。 **取值范围** 不涉及。 **默认取值** 不涉及。
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
        ListSnapshotsDetailsRequest that = (ListSnapshotsDetailsRequest) obj;
        return Objects.equals(this.marker, that.marker) && Objects.equals(this.volumeId, that.volumeId)
            && Objects.equals(this.availabilityZone, that.availabilityZone) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.name, that.name) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.status, that.status) && Objects.equals(this.sortKey, that.sortKey)
            && Objects.equals(this.sortDir, that.sortDir) && Objects.equals(this.id, that.id)
            && Objects.equals(this.ids, that.ids) && Objects.equals(this.snapshotType, that.snapshotType)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.tagKey, that.tagKey) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.snapshotChainId, that.snapshotChainId)
            && Objects.equals(this.snapshotGroupId, that.snapshotGroupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marker,
            volumeId,
            availabilityZone,
            limit,
            name,
            offset,
            status,
            sortKey,
            sortDir,
            id,
            ids,
            snapshotType,
            enterpriseProjectId,
            tagKey,
            tags,
            snapshotChainId,
            snapshotGroupId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSnapshotsDetailsRequest {\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    volumeId: ").append(toIndentedString(volumeId)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
        sb.append("    snapshotType: ").append(toIndentedString(snapshotType)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    tagKey: ").append(toIndentedString(tagKey)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    snapshotChainId: ").append(toIndentedString(snapshotChainId)).append("\n");
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
