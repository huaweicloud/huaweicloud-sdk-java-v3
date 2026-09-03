package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * WDR快照信息
 */
public class WdrSnapshot {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshot_id")

    private Long snapshotId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_at")

    private Long startAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_at")

    private Long endAt;

    public WdrSnapshot withSnapshotId(Long snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    /**
     * 快照ID
     * @return snapshotId
     */
    public Long getSnapshotId() {
        return snapshotId;
    }

    public void setSnapshotId(Long snapshotId) {
        this.snapshotId = snapshotId;
    }

    public WdrSnapshot withStartAt(Long startAt) {
        this.startAt = startAt;
        return this;
    }

    /**
     * 开始时间（Unix timestamp），单位：毫秒
     * @return startAt
     */
    public Long getStartAt() {
        return startAt;
    }

    public void setStartAt(Long startAt) {
        this.startAt = startAt;
    }

    public WdrSnapshot withEndAt(Long endAt) {
        this.endAt = endAt;
        return this;
    }

    /**
     * 结束时间（Unix timestamp），单位：毫秒
     * @return endAt
     */
    public Long getEndAt() {
        return endAt;
    }

    public void setEndAt(Long endAt) {
        this.endAt = endAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WdrSnapshot that = (WdrSnapshot) obj;
        return Objects.equals(this.snapshotId, that.snapshotId) && Objects.equals(this.startAt, that.startAt)
            && Objects.equals(this.endAt, that.endAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(snapshotId, startAt, endAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WdrSnapshot {\n");
        sb.append("    snapshotId: ").append(toIndentedString(snapshotId)).append("\n");
        sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
        sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
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
