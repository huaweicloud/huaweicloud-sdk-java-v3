package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowRefCompareResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commit")

    private CommitDto commit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commits")

    private List<CommitDto> commits = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diffs")

    private List<DiffDto> diffs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diffs_files")

    private List<DiffDto> diffsFiles = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_timeout")

    private Boolean compareTimeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_same_ref")

    private Boolean compareSameRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conflict_files")

    private List<ConflictFileDto> conflictFiles = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "added_lines")

    private Integer addedLines;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "removed_lines")

    private Integer removedLines;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commits_count")

    private Integer commitsCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diffs_count")

    private Integer diffsCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Total")

    private String xTotal;

    public ShowRefCompareResponse withCommit(CommitDto commit) {
        this.commit = commit;
        return this;
    }

    public ShowRefCompareResponse withCommit(Consumer<CommitDto> commitSetter) {
        if (this.commit == null) {
            this.commit = new CommitDto();
            commitSetter.accept(this.commit);
        }

        return this;
    }

    /**
     * Get commit
     * @return commit
     */
    public CommitDto getCommit() {
        return commit;
    }

    public void setCommit(CommitDto commit) {
        this.commit = commit;
    }

    public ShowRefCompareResponse withCommits(List<CommitDto> commits) {
        this.commits = commits;
        return this;
    }

    public ShowRefCompareResponse addCommitsItem(CommitDto commitsItem) {
        if (this.commits == null) {
            this.commits = new ArrayList<>();
        }
        this.commits.add(commitsItem);
        return this;
    }

    public ShowRefCompareResponse withCommits(Consumer<List<CommitDto>> commitsSetter) {
        if (this.commits == null) {
            this.commits = new ArrayList<>();
        }
        commitsSetter.accept(this.commits);
        return this;
    }

    /**
     * commit相关信息列表
     * @return commits
     */
    public List<CommitDto> getCommits() {
        return commits;
    }

    public void setCommits(List<CommitDto> commits) {
        this.commits = commits;
    }

    public ShowRefCompareResponse withDiffs(List<DiffDto> diffs) {
        this.diffs = diffs;
        return this;
    }

    public ShowRefCompareResponse addDiffsItem(DiffDto diffsItem) {
        if (this.diffs == null) {
            this.diffs = new ArrayList<>();
        }
        this.diffs.add(diffsItem);
        return this;
    }

    public ShowRefCompareResponse withDiffs(Consumer<List<DiffDto>> diffsSetter) {
        if (this.diffs == null) {
            this.diffs = new ArrayList<>();
        }
        diffsSetter.accept(this.diffs);
        return this;
    }

    /**
     * 变更文件信息
     * @return diffs
     */
    public List<DiffDto> getDiffs() {
        return diffs;
    }

    public void setDiffs(List<DiffDto> diffs) {
        this.diffs = diffs;
    }

    public ShowRefCompareResponse withDiffsFiles(List<DiffDto> diffsFiles) {
        this.diffsFiles = diffsFiles;
        return this;
    }

    public ShowRefCompareResponse addDiffsFilesItem(DiffDto diffsFilesItem) {
        if (this.diffsFiles == null) {
            this.diffsFiles = new ArrayList<>();
        }
        this.diffsFiles.add(diffsFilesItem);
        return this;
    }

    public ShowRefCompareResponse withDiffsFiles(Consumer<List<DiffDto>> diffsFilesSetter) {
        if (this.diffsFiles == null) {
            this.diffsFiles = new ArrayList<>();
        }
        diffsFilesSetter.accept(this.diffsFiles);
        return this;
    }

    /**
     * 变更文件信息
     * @return diffsFiles
     */
    public List<DiffDto> getDiffsFiles() {
        return diffsFiles;
    }

    public void setDiffsFiles(List<DiffDto> diffsFiles) {
        this.diffsFiles = diffsFiles;
    }

    public ShowRefCompareResponse withCompareTimeout(Boolean compareTimeout) {
        this.compareTimeout = compareTimeout;
        return this;
    }

    /**
     * 是否超时
     * @return compareTimeout
     */
    public Boolean getCompareTimeout() {
        return compareTimeout;
    }

    public void setCompareTimeout(Boolean compareTimeout) {
        this.compareTimeout = compareTimeout;
    }

    public ShowRefCompareResponse withCompareSameRef(Boolean compareSameRef) {
        this.compareSameRef = compareSameRef;
        return this;
    }

    /**
     * 是否相同
     * @return compareSameRef
     */
    public Boolean getCompareSameRef() {
        return compareSameRef;
    }

    public void setCompareSameRef(Boolean compareSameRef) {
        this.compareSameRef = compareSameRef;
    }

    public ShowRefCompareResponse withConflictFiles(List<ConflictFileDto> conflictFiles) {
        this.conflictFiles = conflictFiles;
        return this;
    }

    public ShowRefCompareResponse addConflictFilesItem(ConflictFileDto conflictFilesItem) {
        if (this.conflictFiles == null) {
            this.conflictFiles = new ArrayList<>();
        }
        this.conflictFiles.add(conflictFilesItem);
        return this;
    }

    public ShowRefCompareResponse withConflictFiles(Consumer<List<ConflictFileDto>> conflictFilesSetter) {
        if (this.conflictFiles == null) {
            this.conflictFiles = new ArrayList<>();
        }
        conflictFilesSetter.accept(this.conflictFiles);
        return this;
    }

    /**
     * 冲突文件
     * @return conflictFiles
     */
    public List<ConflictFileDto> getConflictFiles() {
        return conflictFiles;
    }

    public void setConflictFiles(List<ConflictFileDto> conflictFiles) {
        this.conflictFiles = conflictFiles;
    }

    public ShowRefCompareResponse withAddedLines(Integer addedLines) {
        this.addedLines = addedLines;
        return this;
    }

    /**
     * 增加行数
     * minimum: 1
     * maximum: 2147483647
     * @return addedLines
     */
    public Integer getAddedLines() {
        return addedLines;
    }

    public void setAddedLines(Integer addedLines) {
        this.addedLines = addedLines;
    }

    public ShowRefCompareResponse withRemovedLines(Integer removedLines) {
        this.removedLines = removedLines;
        return this;
    }

    /**
     * 删除行数
     * minimum: 1
     * maximum: 2147483647
     * @return removedLines
     */
    public Integer getRemovedLines() {
        return removedLines;
    }

    public void setRemovedLines(Integer removedLines) {
        this.removedLines = removedLines;
    }

    public ShowRefCompareResponse withCommitsCount(Integer commitsCount) {
        this.commitsCount = commitsCount;
        return this;
    }

    /**
     * 提交数量
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

    public ShowRefCompareResponse withDiffsCount(Integer diffsCount) {
        this.diffsCount = diffsCount;
        return this;
    }

    /**
     * 文件变更数量
     * minimum: 1
     * maximum: 2147483647
     * @return diffsCount
     */
    public Integer getDiffsCount() {
        return diffsCount;
    }

    public void setDiffsCount(Integer diffsCount) {
        this.diffsCount = diffsCount;
    }

    public ShowRefCompareResponse withXTotal(String xTotal) {
        this.xTotal = xTotal;
        return this;
    }

    /**
     * Get xTotal
     * @return xTotal
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Total")
    public String getXTotal() {
        return xTotal;
    }

    public void setXTotal(String xTotal) {
        this.xTotal = xTotal;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowRefCompareResponse that = (ShowRefCompareResponse) obj;
        return Objects.equals(this.commit, that.commit) && Objects.equals(this.commits, that.commits)
            && Objects.equals(this.diffs, that.diffs) && Objects.equals(this.diffsFiles, that.diffsFiles)
            && Objects.equals(this.compareTimeout, that.compareTimeout)
            && Objects.equals(this.compareSameRef, that.compareSameRef)
            && Objects.equals(this.conflictFiles, that.conflictFiles)
            && Objects.equals(this.addedLines, that.addedLines) && Objects.equals(this.removedLines, that.removedLines)
            && Objects.equals(this.commitsCount, that.commitsCount) && Objects.equals(this.diffsCount, that.diffsCount)
            && Objects.equals(this.xTotal, that.xTotal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commit,
            commits,
            diffs,
            diffsFiles,
            compareTimeout,
            compareSameRef,
            conflictFiles,
            addedLines,
            removedLines,
            commitsCount,
            diffsCount,
            xTotal);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRefCompareResponse {\n");
        sb.append("    commit: ").append(toIndentedString(commit)).append("\n");
        sb.append("    commits: ").append(toIndentedString(commits)).append("\n");
        sb.append("    diffs: ").append(toIndentedString(diffs)).append("\n");
        sb.append("    diffsFiles: ").append(toIndentedString(diffsFiles)).append("\n");
        sb.append("    compareTimeout: ").append(toIndentedString(compareTimeout)).append("\n");
        sb.append("    compareSameRef: ").append(toIndentedString(compareSameRef)).append("\n");
        sb.append("    conflictFiles: ").append(toIndentedString(conflictFiles)).append("\n");
        sb.append("    addedLines: ").append(toIndentedString(addedLines)).append("\n");
        sb.append("    removedLines: ").append(toIndentedString(removedLines)).append("\n");
        sb.append("    commitsCount: ").append(toIndentedString(commitsCount)).append("\n");
        sb.append("    diffsCount: ").append(toIndentedString(diffsCount)).append("\n");
        sb.append("    xTotal: ").append(toIndentedString(xTotal)).append("\n");
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
