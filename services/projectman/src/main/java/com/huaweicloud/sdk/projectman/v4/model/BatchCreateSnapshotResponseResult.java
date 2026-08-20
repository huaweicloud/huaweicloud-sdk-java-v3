package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量创建快照的结果。
 */
public class BatchCreateSnapshotResponseResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success")

    private List<CreateSnapshotResult> success = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed")

    private List<CreateSnapshotResult> failed = null;

    public BatchCreateSnapshotResponseResult withSuccess(List<CreateSnapshotResult> success) {
        this.success = success;
        return this;
    }

    public BatchCreateSnapshotResponseResult addSuccessItem(CreateSnapshotResult successItem) {
        if (this.success == null) {
            this.success = new ArrayList<>();
        }
        this.success.add(successItem);
        return this;
    }

    public BatchCreateSnapshotResponseResult withSuccess(Consumer<List<CreateSnapshotResult>> successSetter) {
        if (this.success == null) {
            this.success = new ArrayList<>();
        }
        successSetter.accept(this.success);
        return this;
    }

    /**
     * 创建成功的快照列表。
     * @return success
     */
    public List<CreateSnapshotResult> getSuccess() {
        return success;
    }

    public void setSuccess(List<CreateSnapshotResult> success) {
        this.success = success;
    }

    public BatchCreateSnapshotResponseResult withFailed(List<CreateSnapshotResult> failed) {
        this.failed = failed;
        return this;
    }

    public BatchCreateSnapshotResponseResult addFailedItem(CreateSnapshotResult failedItem) {
        if (this.failed == null) {
            this.failed = new ArrayList<>();
        }
        this.failed.add(failedItem);
        return this;
    }

    public BatchCreateSnapshotResponseResult withFailed(Consumer<List<CreateSnapshotResult>> failedSetter) {
        if (this.failed == null) {
            this.failed = new ArrayList<>();
        }
        failedSetter.accept(this.failed);
        return this;
    }

    /**
     * 创建失败的快照列表。
     * @return failed
     */
    public List<CreateSnapshotResult> getFailed() {
        return failed;
    }

    public void setFailed(List<CreateSnapshotResult> failed) {
        this.failed = failed;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchCreateSnapshotResponseResult that = (BatchCreateSnapshotResponseResult) obj;
        return Objects.equals(this.success, that.success) && Objects.equals(this.failed, that.failed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(success, failed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateSnapshotResponseResult {\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
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
