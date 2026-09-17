package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 工作项批量变更操作结果
 */
public class IssueBatchOperateEntitiesResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success")

    private List<IssueOperateResult> success = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed")

    private List<IssueOperateResult> failed = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "undeleted_trees")

    private List<IssueOperateResult> undeletedTrees = null;

    public IssueBatchOperateEntitiesResult withSuccess(List<IssueOperateResult> success) {
        this.success = success;
        return this;
    }

    public IssueBatchOperateEntitiesResult addSuccessItem(IssueOperateResult successItem) {
        if (this.success == null) {
            this.success = new ArrayList<>();
        }
        this.success.add(successItem);
        return this;
    }

    public IssueBatchOperateEntitiesResult withSuccess(Consumer<List<IssueOperateResult>> successSetter) {
        if (this.success == null) {
            this.success = new ArrayList<>();
        }
        successSetter.accept(this.success);
        return this;
    }

    /**
     * **参数解释**： 成功的结果。
     * @return success
     */
    public List<IssueOperateResult> getSuccess() {
        return success;
    }

    public void setSuccess(List<IssueOperateResult> success) {
        this.success = success;
    }

    public IssueBatchOperateEntitiesResult withFailed(List<IssueOperateResult> failed) {
        this.failed = failed;
        return this;
    }

    public IssueBatchOperateEntitiesResult addFailedItem(IssueOperateResult failedItem) {
        if (this.failed == null) {
            this.failed = new ArrayList<>();
        }
        this.failed.add(failedItem);
        return this;
    }

    public IssueBatchOperateEntitiesResult withFailed(Consumer<List<IssueOperateResult>> failedSetter) {
        if (this.failed == null) {
            this.failed = new ArrayList<>();
        }
        failedSetter.accept(this.failed);
        return this;
    }

    /**
     * **参数解释**： 失败的结果。
     * @return failed
     */
    public List<IssueOperateResult> getFailed() {
        return failed;
    }

    public void setFailed(List<IssueOperateResult> failed) {
        this.failed = failed;
    }

    public IssueBatchOperateEntitiesResult withUndeletedTrees(List<IssueOperateResult> undeletedTrees) {
        this.undeletedTrees = undeletedTrees;
        return this;
    }

    public IssueBatchOperateEntitiesResult addUndeletedTreesItem(IssueOperateResult undeletedTreesItem) {
        if (this.undeletedTrees == null) {
            this.undeletedTrees = new ArrayList<>();
        }
        this.undeletedTrees.add(undeletedTreesItem);
        return this;
    }

    public IssueBatchOperateEntitiesResult withUndeletedTrees(Consumer<List<IssueOperateResult>> undeletedTreesSetter) {
        if (this.undeletedTrees == null) {
            this.undeletedTrees = new ArrayList<>();
        }
        undeletedTreesSetter.accept(this.undeletedTrees);
        return this;
    }

    /**
     * **参数解释**： 删除失败的工作项。 **取值范围**： 不涉及
     * @return undeletedTrees
     */
    public List<IssueOperateResult> getUndeletedTrees() {
        return undeletedTrees;
    }

    public void setUndeletedTrees(List<IssueOperateResult> undeletedTrees) {
        this.undeletedTrees = undeletedTrees;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IssueBatchOperateEntitiesResult that = (IssueBatchOperateEntitiesResult) obj;
        return Objects.equals(this.success, that.success) && Objects.equals(this.failed, that.failed)
            && Objects.equals(this.undeletedTrees, that.undeletedTrees);
    }

    @Override
    public int hashCode() {
        return Objects.hash(success, failed, undeletedTrees);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssueBatchOperateEntitiesResult {\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
        sb.append("    undeletedTrees: ").append(toIndentedString(undeletedTrees)).append("\n");
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
