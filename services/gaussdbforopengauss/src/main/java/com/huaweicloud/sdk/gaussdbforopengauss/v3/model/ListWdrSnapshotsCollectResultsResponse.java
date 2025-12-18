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
public class ListWdrSnapshotsCollectResultsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wdr_snapshots")

    private List<CollectedWdrSnapshotInfoResult> wdrSnapshots = null;

    public ListWdrSnapshotsCollectResultsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * **参数解释**： 总记录数。 **取值范围**： 不涉及。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListWdrSnapshotsCollectResultsResponse withWdrSnapshots(List<CollectedWdrSnapshotInfoResult> wdrSnapshots) {
        this.wdrSnapshots = wdrSnapshots;
        return this;
    }

    public ListWdrSnapshotsCollectResultsResponse addWdrSnapshotsItem(CollectedWdrSnapshotInfoResult wdrSnapshotsItem) {
        if (this.wdrSnapshots == null) {
            this.wdrSnapshots = new ArrayList<>();
        }
        this.wdrSnapshots.add(wdrSnapshotsItem);
        return this;
    }

    public ListWdrSnapshotsCollectResultsResponse withWdrSnapshots(
        Consumer<List<CollectedWdrSnapshotInfoResult>> wdrSnapshotsSetter) {
        if (this.wdrSnapshots == null) {
            this.wdrSnapshots = new ArrayList<>();
        }
        wdrSnapshotsSetter.accept(this.wdrSnapshots);
        return this;
    }

    /**
     * **参数解释**： WDR快照信息列表。
     * @return wdrSnapshots
     */
    public List<CollectedWdrSnapshotInfoResult> getWdrSnapshots() {
        return wdrSnapshots;
    }

    public void setWdrSnapshots(List<CollectedWdrSnapshotInfoResult> wdrSnapshots) {
        this.wdrSnapshots = wdrSnapshots;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListWdrSnapshotsCollectResultsResponse that = (ListWdrSnapshotsCollectResultsResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount) && Objects.equals(this.wdrSnapshots, that.wdrSnapshots);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, wdrSnapshots);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListWdrSnapshotsCollectResultsResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    wdrSnapshots: ").append(toIndentedString(wdrSnapshots)).append("\n");
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
