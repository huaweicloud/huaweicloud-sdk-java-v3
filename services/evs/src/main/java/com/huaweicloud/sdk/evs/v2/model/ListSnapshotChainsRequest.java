package com.huaweicloud.sdk.evs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListSnapshotChainsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_id")

    private String volumeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    public ListSnapshotChainsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * **参数解释** 分页查询的起始资源ID，取值为上一页最后一条查询记录的资源ID。 **约束限制** 不涉及。 **取值范围** 不涉及。 **默认取值** 不涉及。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListSnapshotChainsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释** 返回结果个数限制。 **约束限制** 不涉及。 **取值范围** 最小值1，最大值1000，默认为1000。返回的结果中记录数不超过limit值。 **默认取值** 不涉及。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListSnapshotChainsRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释** 快照链ID。 **约束限制** 不涉及。 **取值范围** 不涉及。 **默认取值** 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListSnapshotChainsRequest withVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    /**
     * **参数解释** 快照链所属的云硬盘ID。 可通过[查询所有云硬盘详情](evs_04_2006.xml)获取云硬盘ID。 **约束限制** 不涉及。 **取值范围** 不涉及。 **默认取值** 不涉及。
     * @return volumeId
     */
    public String getVolumeId() {
        return volumeId;
    }

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    public ListSnapshotChainsRequest withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * **参数解释** 快照链的类型。 **约束限制** 不涉及。 **取值范围** 当前快照链支持\"standard\"、\"backup\"和\"server_backup\"三种类型。 **默认取值** 不涉及。
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSnapshotChainsRequest that = (ListSnapshotChainsRequest) obj;
        return Objects.equals(this.marker, that.marker) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.id, that.id) && Objects.equals(this.volumeId, that.volumeId)
            && Objects.equals(this.category, that.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marker, limit, id, volumeId, category);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSnapshotChainsRequest {\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    volumeId: ").append(toIndentedString(volumeId)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
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
