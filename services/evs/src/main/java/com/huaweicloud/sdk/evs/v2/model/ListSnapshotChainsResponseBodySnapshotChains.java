package com.huaweicloud.sdk.evs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ListSnapshotChainsResponseBodySnapshotChains
 */
public class ListSnapshotChainsResponseBodySnapshotChains {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshot_count")

    private Integer snapshotCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "capacity")

    private Float capacity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_id")

    private String volumeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    public ListSnapshotChainsResponseBodySnapshotChains withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释** 快照链ID。 **取值范围** 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListSnapshotChainsResponseBodySnapshotChains withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * **参数解释** 快照链所属云硬盘的可用区。 **取值范围** 不涉及。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public ListSnapshotChainsResponseBodySnapshotChains withSnapshotCount(Integer snapshotCount) {
        this.snapshotCount = snapshotCount;
        return this;
    }

    /**
     * **参数解释** 快照链上的快照个数。 **取值范围** 大于等于0。
     * @return snapshotCount
     */
    public Integer getSnapshotCount() {
        return snapshotCount;
    }

    public void setSnapshotCount(Integer snapshotCount) {
        this.snapshotCount = snapshotCount;
    }

    public ListSnapshotChainsResponseBodySnapshotChains withCapacity(Float capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * **参数解释** 快照链的大小。 **取值范围** 大于等于0。
     * @return capacity
     */
    public Float getCapacity() {
        return capacity;
    }

    public void setCapacity(Float capacity) {
        this.capacity = capacity;
    }

    public ListSnapshotChainsResponseBodySnapshotChains withProjectId(String projectId) {
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

    public ListSnapshotChainsResponseBodySnapshotChains withVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    /**
     * **参数解释** 快照链所属的云硬盘ID。 **取值范围** 不涉及。
     * @return volumeId
     */
    public String getVolumeId() {
        return volumeId;
    }

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    public ListSnapshotChainsResponseBodySnapshotChains withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * **参数解释** 快照链的类型。 **取值范围** 当前快照链支持\"standard\"、\"standard_copy\"两种类型。
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ListSnapshotChainsResponseBodySnapshotChains withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释** 创建时间。 **取值范围** 不涉及。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ListSnapshotChainsResponseBodySnapshotChains withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * **参数解释** 更新时间。 **取值范围** 不涉及。
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSnapshotChainsResponseBodySnapshotChains that = (ListSnapshotChainsResponseBodySnapshotChains) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.availabilityZone, that.availabilityZone)
            && Objects.equals(this.snapshotCount, that.snapshotCount) && Objects.equals(this.capacity, that.capacity)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.volumeId, that.volumeId)
            && Objects.equals(this.category, that.category) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, availabilityZone, snapshotCount, capacity, projectId, volumeId, category, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSnapshotChainsResponseBodySnapshotChains {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    snapshotCount: ").append(toIndentedString(snapshotCount)).append("\n");
        sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    volumeId: ").append(toIndentedString(volumeId)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
