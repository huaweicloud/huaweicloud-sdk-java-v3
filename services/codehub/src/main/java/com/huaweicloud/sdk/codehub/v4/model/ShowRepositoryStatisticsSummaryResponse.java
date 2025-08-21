package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowRepositoryStatisticsSummaryResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branches_count")

    private Integer branchesCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commits_count")

    private Integer commitsCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "members_count")

    private Integer membersCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags_count")

    private Integer tagsCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merge_request_count")

    private Long mergeRequestCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "note_count")

    private Long noteCount;

    public ShowRepositoryStatisticsSummaryResponse withBranchesCount(Integer branchesCount) {
        this.branchesCount = branchesCount;
        return this;
    }

    /**
     * **参数解释：** 分支数量。 **取值范围：** 不涉及。
     * minimum: 1
     * maximum: 2147483647
     * @return branchesCount
     */
    public Integer getBranchesCount() {
        return branchesCount;
    }

    public void setBranchesCount(Integer branchesCount) {
        this.branchesCount = branchesCount;
    }

    public ShowRepositoryStatisticsSummaryResponse withCommitsCount(Integer commitsCount) {
        this.commitsCount = commitsCount;
        return this;
    }

    /**
     * **参数解释：** 提交数量。 **取值范围：** 不涉及。
     * minimum: 1
     * maximum: 2147483647
     * @return commitsCount
     */
    public Integer getCommitsCount() {
        return commitsCount;
    }

    public void setCommitsCount(Integer commitsCount) {
        this.commitsCount = commitsCount;
    }

    public ShowRepositoryStatisticsSummaryResponse withMembersCount(Integer membersCount) {
        this.membersCount = membersCount;
        return this;
    }

    /**
     * **参数解释：** 成员数量。
     * minimum: 1
     * maximum: 2147483647
     * @return membersCount
     */
    public Integer getMembersCount() {
        return membersCount;
    }

    public void setMembersCount(Integer membersCount) {
        this.membersCount = membersCount;
    }

    public ShowRepositoryStatisticsSummaryResponse withTagsCount(Integer tagsCount) {
        this.tagsCount = tagsCount;
        return this;
    }

    /**
     * **参数解释：** Tag数量。 **取值范围：** 不涉及。
     * minimum: 1
     * maximum: 2147483647
     * @return tagsCount
     */
    public Integer getTagsCount() {
        return tagsCount;
    }

    public void setTagsCount(Integer tagsCount) {
        this.tagsCount = tagsCount;
    }

    public ShowRepositoryStatisticsSummaryResponse withMergeRequestCount(Long mergeRequestCount) {
        this.mergeRequestCount = mergeRequestCount;
        return this;
    }

    /**
     * **参数解释：** 合并请求数量。 **取值范围：** 不涉及。
     * minimum: 1
     * maximum: 2147483647
     * @return mergeRequestCount
     */
    public Long getMergeRequestCount() {
        return mergeRequestCount;
    }

    public void setMergeRequestCount(Long mergeRequestCount) {
        this.mergeRequestCount = mergeRequestCount;
    }

    public ShowRepositoryStatisticsSummaryResponse withNoteCount(Long noteCount) {
        this.noteCount = noteCount;
        return this;
    }

    /**
     * **参数解释：** 备注数量。 **取值范围：** 不涉及。
     * minimum: 1
     * maximum: 2147483647
     * @return noteCount
     */
    public Long getNoteCount() {
        return noteCount;
    }

    public void setNoteCount(Long noteCount) {
        this.noteCount = noteCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowRepositoryStatisticsSummaryResponse that = (ShowRepositoryStatisticsSummaryResponse) obj;
        return Objects.equals(this.branchesCount, that.branchesCount)
            && Objects.equals(this.commitsCount, that.commitsCount)
            && Objects.equals(this.membersCount, that.membersCount) && Objects.equals(this.tagsCount, that.tagsCount)
            && Objects.equals(this.mergeRequestCount, that.mergeRequestCount)
            && Objects.equals(this.noteCount, that.noteCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(branchesCount, commitsCount, membersCount, tagsCount, mergeRequestCount, noteCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRepositoryStatisticsSummaryResponse {\n");
        sb.append("    branchesCount: ").append(toIndentedString(branchesCount)).append("\n");
        sb.append("    commitsCount: ").append(toIndentedString(commitsCount)).append("\n");
        sb.append("    membersCount: ").append(toIndentedString(membersCount)).append("\n");
        sb.append("    tagsCount: ").append(toIndentedString(tagsCount)).append("\n");
        sb.append("    mergeRequestCount: ").append(toIndentedString(mergeRequestCount)).append("\n");
        sb.append("    noteCount: ").append(toIndentedString(noteCount)).append("\n");
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
