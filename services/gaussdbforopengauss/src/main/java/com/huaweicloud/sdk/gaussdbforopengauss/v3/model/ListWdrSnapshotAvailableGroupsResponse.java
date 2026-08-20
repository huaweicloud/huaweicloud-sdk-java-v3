package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

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
public class ListWdrSnapshotAvailableGroupsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Long totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "groups")

    private List<WdrSnapshotGroupResult> groups = null;

    public ListWdrSnapshotAvailableGroupsResponse withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * **参数解释**: 分组数量。 **取值范围**: 不涉及。
     * minimum: 0
     * @return totalCount
     */
    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public ListWdrSnapshotAvailableGroupsResponse withGroups(List<WdrSnapshotGroupResult> groups) {
        this.groups = groups;
        return this;
    }

    public ListWdrSnapshotAvailableGroupsResponse addGroupsItem(WdrSnapshotGroupResult groupsItem) {
        if (this.groups == null) {
            this.groups = new ArrayList<>();
        }
        this.groups.add(groupsItem);
        return this;
    }

    public ListWdrSnapshotAvailableGroupsResponse withGroups(Consumer<List<WdrSnapshotGroupResult>> groupsSetter) {
        if (this.groups == null) {
            this.groups = new ArrayList<>();
        }
        groupsSetter.accept(this.groups);
        return this;
    }

    /**
     * **参数解释**: 分组记录列表。
     * @return groups
     */
    public List<WdrSnapshotGroupResult> getGroups() {
        return groups;
    }

    public void setGroups(List<WdrSnapshotGroupResult> groups) {
        this.groups = groups;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListWdrSnapshotAvailableGroupsResponse that = (ListWdrSnapshotAvailableGroupsResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount) && Objects.equals(this.groups, that.groups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, groups);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListWdrSnapshotAvailableGroupsResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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
