package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量创建工作项快照请求对象
 */
public class BatchCreateSnapshotRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issues")

    private List<BatchCreateSnapshotRequestIssues> issues = null;

    public BatchCreateSnapshotRequest withIssues(List<BatchCreateSnapshotRequestIssues> issues) {
        this.issues = issues;
        return this;
    }

    public BatchCreateSnapshotRequest addIssuesItem(BatchCreateSnapshotRequestIssues issuesItem) {
        if (this.issues == null) {
            this.issues = new ArrayList<>();
        }
        this.issues.add(issuesItem);
        return this;
    }

    public BatchCreateSnapshotRequest withIssues(Consumer<List<BatchCreateSnapshotRequestIssues>> issuesSetter) {
        if (this.issues == null) {
            this.issues = new ArrayList<>();
        }
        issuesSetter.accept(this.issues);
        return this;
    }

    /**
     * 需要创建快照的工作项数组。 每次最多支持对50个工作项创建快照。
     * @return issues
     */
    public List<BatchCreateSnapshotRequestIssues> getIssues() {
        return issues;
    }

    public void setIssues(List<BatchCreateSnapshotRequestIssues> issues) {
        this.issues = issues;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchCreateSnapshotRequest that = (BatchCreateSnapshotRequest) obj;
        return Objects.equals(this.issues, that.issues);
    }

    @Override
    public int hashCode() {
        return Objects.hash(issues);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateSnapshotRequest {\n");
        sb.append("    issues: ").append(toIndentedString(issues)).append("\n");
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
