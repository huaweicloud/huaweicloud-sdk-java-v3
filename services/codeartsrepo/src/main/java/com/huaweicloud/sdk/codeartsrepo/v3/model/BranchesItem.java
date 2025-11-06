package com.huaweicloud.sdk.codeartsrepo.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * BranchesItem
 */
public class BranchesItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commit")

    private CommitV2 commit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diverging_commit_counts")

    private DivergingCommitCounts divergingCommitCounts;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    public BranchesItem withCommit(CommitV2 commit) {
        this.commit = commit;
        return this;
    }

    public BranchesItem withCommit(Consumer<CommitV2> commitSetter) {
        if (this.commit == null) {
            this.commit = new CommitV2();
            commitSetter.accept(this.commit);
        }

        return this;
    }

    /**
     * Get commit
     * @return commit
     */
    public CommitV2 getCommit() {
        return commit;
    }

    public void setCommit(CommitV2 commit) {
        this.commit = commit;
    }

    public BranchesItem withDivergingCommitCounts(DivergingCommitCounts divergingCommitCounts) {
        this.divergingCommitCounts = divergingCommitCounts;
        return this;
    }

    public BranchesItem withDivergingCommitCounts(Consumer<DivergingCommitCounts> divergingCommitCountsSetter) {
        if (this.divergingCommitCounts == null) {
            this.divergingCommitCounts = new DivergingCommitCounts();
            divergingCommitCountsSetter.accept(this.divergingCommitCounts);
        }

        return this;
    }

    /**
     * Get divergingCommitCounts
     * @return divergingCommitCounts
     */
    public DivergingCommitCounts getDivergingCommitCounts() {
        return divergingCommitCounts;
    }

    public void setDivergingCommitCounts(DivergingCommitCounts divergingCommitCounts) {
        this.divergingCommitCounts = divergingCommitCounts;
    }

    public BranchesItem withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 分支名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BranchesItem that = (BranchesItem) obj;
        return Objects.equals(this.commit, that.commit)
            && Objects.equals(this.divergingCommitCounts, that.divergingCommitCounts)
            && Objects.equals(this.name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commit, divergingCommitCounts, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BranchesItem {\n");
        sb.append("    commit: ").append(toIndentedString(commit)).append("\n");
        sb.append("    divergingCommitCounts: ").append(toIndentedString(divergingCommitCounts)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
