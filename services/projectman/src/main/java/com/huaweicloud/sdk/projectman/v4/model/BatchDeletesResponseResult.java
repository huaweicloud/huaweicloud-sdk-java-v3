package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 返回结果。 **取值范围：** 不涉及。
 */
public class BatchDeletesResponseResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_issue")

    private BatchDeletesResponseResultDeleteIssue deleteIssue;

    public BatchDeletesResponseResult withDeleteIssue(BatchDeletesResponseResultDeleteIssue deleteIssue) {
        this.deleteIssue = deleteIssue;
        return this;
    }

    public BatchDeletesResponseResult withDeleteIssue(
        Consumer<BatchDeletesResponseResultDeleteIssue> deleteIssueSetter) {
        if (this.deleteIssue == null) {
            this.deleteIssue = new BatchDeletesResponseResultDeleteIssue();
            deleteIssueSetter.accept(this.deleteIssue);
        }

        return this;
    }

    /**
     * Get deleteIssue
     * @return deleteIssue
     */
    public BatchDeletesResponseResultDeleteIssue getDeleteIssue() {
        return deleteIssue;
    }

    public void setDeleteIssue(BatchDeletesResponseResultDeleteIssue deleteIssue) {
        this.deleteIssue = deleteIssue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDeletesResponseResult that = (BatchDeletesResponseResult) obj;
        return Objects.equals(this.deleteIssue, that.deleteIssue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deleteIssue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeletesResponseResult {\n");
        sb.append("    deleteIssue: ").append(toIndentedString(deleteIssue)).append("\n");
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
