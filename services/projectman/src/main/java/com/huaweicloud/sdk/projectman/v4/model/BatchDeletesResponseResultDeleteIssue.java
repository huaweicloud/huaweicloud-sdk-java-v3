package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 删除的工作项。 **取值范围：** 不涉及。
 */
public class BatchDeletesResponseResultDeleteIssue {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "del_issue_id")

    private List<Integer> delIssueId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "del_issue")

    private List<BatchDeletesResponseResultDeleteIssueDelIssue> delIssue = null;

    public BatchDeletesResponseResultDeleteIssue withDelIssueId(List<Integer> delIssueId) {
        this.delIssueId = delIssueId;
        return this;
    }

    public BatchDeletesResponseResultDeleteIssue addDelIssueIdItem(Integer delIssueIdItem) {
        if (this.delIssueId == null) {
            this.delIssueId = new ArrayList<>();
        }
        this.delIssueId.add(delIssueIdItem);
        return this;
    }

    public BatchDeletesResponseResultDeleteIssue withDelIssueId(Consumer<List<Integer>> delIssueIdSetter) {
        if (this.delIssueId == null) {
            this.delIssueId = new ArrayList<>();
        }
        delIssueIdSetter.accept(this.delIssueId);
        return this;
    }

    /**
     * **参数解释：** 删除的工作项id。 **取值范围：** 不涉及。
     * @return delIssueId
     */
    public List<Integer> getDelIssueId() {
        return delIssueId;
    }

    public void setDelIssueId(List<Integer> delIssueId) {
        this.delIssueId = delIssueId;
    }

    public BatchDeletesResponseResultDeleteIssue withDelIssue(
        List<BatchDeletesResponseResultDeleteIssueDelIssue> delIssue) {
        this.delIssue = delIssue;
        return this;
    }

    public BatchDeletesResponseResultDeleteIssue addDelIssueItem(
        BatchDeletesResponseResultDeleteIssueDelIssue delIssueItem) {
        if (this.delIssue == null) {
            this.delIssue = new ArrayList<>();
        }
        this.delIssue.add(delIssueItem);
        return this;
    }

    public BatchDeletesResponseResultDeleteIssue withDelIssue(
        Consumer<List<BatchDeletesResponseResultDeleteIssueDelIssue>> delIssueSetter) {
        if (this.delIssue == null) {
            this.delIssue = new ArrayList<>();
        }
        delIssueSetter.accept(this.delIssue);
        return this;
    }

    /**
     * **参数解释：** 删除的工作项详情。 **取值范围：** 不涉及。
     * @return delIssue
     */
    public List<BatchDeletesResponseResultDeleteIssueDelIssue> getDelIssue() {
        return delIssue;
    }

    public void setDelIssue(List<BatchDeletesResponseResultDeleteIssueDelIssue> delIssue) {
        this.delIssue = delIssue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDeletesResponseResultDeleteIssue that = (BatchDeletesResponseResultDeleteIssue) obj;
        return Objects.equals(this.delIssueId, that.delIssueId) && Objects.equals(this.delIssue, that.delIssue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(delIssueId, delIssue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeletesResponseResultDeleteIssue {\n");
        sb.append("    delIssueId: ").append(toIndentedString(delIssueId)).append("\n");
        sb.append("    delIssue: ").append(toIndentedString(delIssue)).append("\n");
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
