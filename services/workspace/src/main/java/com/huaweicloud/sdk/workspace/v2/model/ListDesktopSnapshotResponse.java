package com.huaweicloud.sdk.workspace.v2.model;

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
public class ListDesktopSnapshotResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_snapshots")

    private List<DesktopSnapshotDetailInfo> desktopSnapshots = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListDesktopSnapshotResponse withDesktopSnapshots(List<DesktopSnapshotDetailInfo> desktopSnapshots) {
        this.desktopSnapshots = desktopSnapshots;
        return this;
    }

    public ListDesktopSnapshotResponse addDesktopSnapshotsItem(DesktopSnapshotDetailInfo desktopSnapshotsItem) {
        if (this.desktopSnapshots == null) {
            this.desktopSnapshots = new ArrayList<>();
        }
        this.desktopSnapshots.add(desktopSnapshotsItem);
        return this;
    }

    public ListDesktopSnapshotResponse withDesktopSnapshots(
        Consumer<List<DesktopSnapshotDetailInfo>> desktopSnapshotsSetter) {
        if (this.desktopSnapshots == null) {
            this.desktopSnapshots = new ArrayList<>();
        }
        desktopSnapshotsSetter.accept(this.desktopSnapshots);
        return this;
    }

    /**
     * 桌面快照详情列表。
     * @return desktopSnapshots
     */
    public List<DesktopSnapshotDetailInfo> getDesktopSnapshots() {
        return desktopSnapshots;
    }

    public void setDesktopSnapshots(List<DesktopSnapshotDetailInfo> desktopSnapshots) {
        this.desktopSnapshots = desktopSnapshots;
    }

    public ListDesktopSnapshotResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 桌面快照总数。
     * minimum: 0
     * maximum: 1000
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDesktopSnapshotResponse that = (ListDesktopSnapshotResponse) obj;
        return Objects.equals(this.desktopSnapshots, that.desktopSnapshots)
            && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desktopSnapshots, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDesktopSnapshotResponse {\n");
        sb.append("    desktopSnapshots: ").append(toIndentedString(desktopSnapshots)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
