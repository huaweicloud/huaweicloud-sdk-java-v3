package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**: 实例内核WDR快照分组详情。
 */
public class WdrSnapshotGroupResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Long totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private Long beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshots")

    private List<WdrSnapshotRecord> snapshots = null;

    public WdrSnapshotGroupResult withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * **参数解释**: 快照总记录数。 **取值范围**: 不涉及。
     * minimum: 0
     * @return totalCount
     */
    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public WdrSnapshotGroupResult withBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * **参数解释**: 分组开始时间。对应该分组下的第一个快照的开始时间。 **取值范围**: 不涉及。
     * @return beginTime
     */
    public Long getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
    }

    public WdrSnapshotGroupResult withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释**: 分组结束时间。对应该分组下的最后一个快照的结束时间。 **取值范围**: 不涉及。
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public WdrSnapshotGroupResult withSnapshots(List<WdrSnapshotRecord> snapshots) {
        this.snapshots = snapshots;
        return this;
    }

    public WdrSnapshotGroupResult addSnapshotsItem(WdrSnapshotRecord snapshotsItem) {
        if (this.snapshots == null) {
            this.snapshots = new ArrayList<>();
        }
        this.snapshots.add(snapshotsItem);
        return this;
    }

    public WdrSnapshotGroupResult withSnapshots(Consumer<List<WdrSnapshotRecord>> snapshotsSetter) {
        if (this.snapshots == null) {
            this.snapshots = new ArrayList<>();
        }
        snapshotsSetter.accept(this.snapshots);
        return this;
    }

    /**
     * **参数解释**: 分组内快照列表。
     * @return snapshots
     */
    public List<WdrSnapshotRecord> getSnapshots() {
        return snapshots;
    }

    public void setSnapshots(List<WdrSnapshotRecord> snapshots) {
        this.snapshots = snapshots;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WdrSnapshotGroupResult that = (WdrSnapshotGroupResult) obj;
        return Objects.equals(this.totalCount, that.totalCount) && Objects.equals(this.beginTime, that.beginTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.snapshots, that.snapshots);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, beginTime, endTime, snapshots);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WdrSnapshotGroupResult {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    snapshots: ").append(toIndentedString(snapshots)).append("\n");
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
