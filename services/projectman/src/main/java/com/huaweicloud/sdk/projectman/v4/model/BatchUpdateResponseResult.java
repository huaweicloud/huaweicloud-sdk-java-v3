package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 返回结果。 **取值范围：** 不涉及。
 */
public class BatchUpdateResponseResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project")

    private BatchUpdateResponseResultProject project;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "journal_ids")

    private List<String> journalIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_issues")

    private List<Integer> errorIssues = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "versions_issues")

    private List<String> versionsIssues = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_issues")

    private List<String> successIssues = null;

    public BatchUpdateResponseResult withProject(BatchUpdateResponseResultProject project) {
        this.project = project;
        return this;
    }

    public BatchUpdateResponseResult withProject(Consumer<BatchUpdateResponseResultProject> projectSetter) {
        if (this.project == null) {
            this.project = new BatchUpdateResponseResultProject();
            projectSetter.accept(this.project);
        }

        return this;
    }

    /**
     * Get project
     * @return project
     */
    public BatchUpdateResponseResultProject getProject() {
        return project;
    }

    public void setProject(BatchUpdateResponseResultProject project) {
        this.project = project;
    }

    public BatchUpdateResponseResult withJournalIds(List<String> journalIds) {
        this.journalIds = journalIds;
        return this;
    }

    public BatchUpdateResponseResult addJournalIdsItem(String journalIdsItem) {
        if (this.journalIds == null) {
            this.journalIds = new ArrayList<>();
        }
        this.journalIds.add(journalIdsItem);
        return this;
    }

    public BatchUpdateResponseResult withJournalIds(Consumer<List<String>> journalIdsSetter) {
        if (this.journalIds == null) {
            this.journalIds = new ArrayList<>();
        }
        journalIdsSetter.accept(this.journalIds);
        return this;
    }

    /**
     * **参数解释：** 历史记录id。 **取值范围：** 不涉及。
     * @return journalIds
     */
    public List<String> getJournalIds() {
        return journalIds;
    }

    public void setJournalIds(List<String> journalIds) {
        this.journalIds = journalIds;
    }

    public BatchUpdateResponseResult withErrorIssues(List<Integer> errorIssues) {
        this.errorIssues = errorIssues;
        return this;
    }

    public BatchUpdateResponseResult addErrorIssuesItem(Integer errorIssuesItem) {
        if (this.errorIssues == null) {
            this.errorIssues = new ArrayList<>();
        }
        this.errorIssues.add(errorIssuesItem);
        return this;
    }

    public BatchUpdateResponseResult withErrorIssues(Consumer<List<Integer>> errorIssuesSetter) {
        if (this.errorIssues == null) {
            this.errorIssues = new ArrayList<>();
        }
        errorIssuesSetter.accept(this.errorIssues);
        return this;
    }

    /**
     * **参数解释：** 编辑失败的工作项。 **取值范围：** 不涉及。
     * @return errorIssues
     */
    public List<Integer> getErrorIssues() {
        return errorIssues;
    }

    public void setErrorIssues(List<Integer> errorIssues) {
        this.errorIssues = errorIssues;
    }

    public BatchUpdateResponseResult withVersionsIssues(List<String> versionsIssues) {
        this.versionsIssues = versionsIssues;
        return this;
    }

    public BatchUpdateResponseResult addVersionsIssuesItem(String versionsIssuesItem) {
        if (this.versionsIssues == null) {
            this.versionsIssues = new ArrayList<>();
        }
        this.versionsIssues.add(versionsIssuesItem);
        return this;
    }

    public BatchUpdateResponseResult withVersionsIssues(Consumer<List<String>> versionsIssuesSetter) {
        if (this.versionsIssues == null) {
            this.versionsIssues = new ArrayList<>();
        }
        versionsIssuesSetter.accept(this.versionsIssues);
        return this;
    }

    /**
     * **参数解释：** 工作项的迭代版本。 **取值范围：** 不涉及。
     * @return versionsIssues
     */
    public List<String> getVersionsIssues() {
        return versionsIssues;
    }

    public void setVersionsIssues(List<String> versionsIssues) {
        this.versionsIssues = versionsIssues;
    }

    public BatchUpdateResponseResult withSuccessIssues(List<String> successIssues) {
        this.successIssues = successIssues;
        return this;
    }

    public BatchUpdateResponseResult addSuccessIssuesItem(String successIssuesItem) {
        if (this.successIssues == null) {
            this.successIssues = new ArrayList<>();
        }
        this.successIssues.add(successIssuesItem);
        return this;
    }

    public BatchUpdateResponseResult withSuccessIssues(Consumer<List<String>> successIssuesSetter) {
        if (this.successIssues == null) {
            this.successIssues = new ArrayList<>();
        }
        successIssuesSetter.accept(this.successIssues);
        return this;
    }

    /**
     * **参数解释：** 编辑成功的工作项。 **取值范围：** 不涉及。
     * @return successIssues
     */
    public List<String> getSuccessIssues() {
        return successIssues;
    }

    public void setSuccessIssues(List<String> successIssues) {
        this.successIssues = successIssues;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchUpdateResponseResult that = (BatchUpdateResponseResult) obj;
        return Objects.equals(this.project, that.project) && Objects.equals(this.journalIds, that.journalIds)
            && Objects.equals(this.errorIssues, that.errorIssues)
            && Objects.equals(this.versionsIssues, that.versionsIssues)
            && Objects.equals(this.successIssues, that.successIssues);
    }

    @Override
    public int hashCode() {
        return Objects.hash(project, journalIds, errorIssues, versionsIssues, successIssues);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchUpdateResponseResult {\n");
        sb.append("    project: ").append(toIndentedString(project)).append("\n");
        sb.append("    journalIds: ").append(toIndentedString(journalIds)).append("\n");
        sb.append("    errorIssues: ").append(toIndentedString(errorIssues)).append("\n");
        sb.append("    versionsIssues: ").append(toIndentedString(versionsIssues)).append("\n");
        sb.append("    successIssues: ").append(toIndentedString(successIssues)).append("\n");
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
