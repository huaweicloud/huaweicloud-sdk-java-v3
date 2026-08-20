package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 批量操作快照失败响应对象。
 */
public class FailureDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshot_id")

    private String snapshotId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshot_title")

    private String snapshotTitle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failure_reason")

    private String failureReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    public FailureDetail withSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    /**
     * 快照ID。
     * @return snapshotId
     */
    public String getSnapshotId() {
        return snapshotId;
    }

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    public FailureDetail withSnapshotTitle(String snapshotTitle) {
        this.snapshotTitle = snapshotTitle;
        return this;
    }

    /**
     * 快照标题。
     * @return snapshotTitle
     */
    public String getSnapshotTitle() {
        return snapshotTitle;
    }

    public void setSnapshotTitle(String snapshotTitle) {
        this.snapshotTitle = snapshotTitle;
    }

    public FailureDetail withFailureReason(String failureReason) {
        this.failureReason = failureReason;
        return this;
    }

    /**
     * 失败原因。
     * @return failureReason
     */
    public String getFailureReason() {
        return failureReason;
    }

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    public FailureDetail withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 错误码。
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FailureDetail that = (FailureDetail) obj;
        return Objects.equals(this.snapshotId, that.snapshotId)
            && Objects.equals(this.snapshotTitle, that.snapshotTitle)
            && Objects.equals(this.failureReason, that.failureReason) && Objects.equals(this.errorCode, that.errorCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(snapshotId, snapshotTitle, failureReason, errorCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FailureDetail {\n");
        sb.append("    snapshotId: ").append(toIndentedString(snapshotId)).append("\n");
        sb.append("    snapshotTitle: ").append(toIndentedString(snapshotTitle)).append("\n");
        sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
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
