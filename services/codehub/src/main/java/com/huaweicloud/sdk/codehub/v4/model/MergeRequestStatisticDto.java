package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 合并请求统计数据
 */
public class MergeRequestStatisticDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iid")

    private Integer iid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commits_count")

    private Integer commitsCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "changed_files_count")

    private String changedFilesCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notes_count")

    private NotesCountDto notesCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "changed_lines_count")

    private MergeRequestLineChange changedLinesCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merge_error")

    private String mergeError;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "json_merge_error")

    private Object jsonMergeError;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "votes")

    private Integer votes;

    public MergeRequestStatisticDto withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 合并请求ID
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public MergeRequestStatisticDto withIid(Integer iid) {
        this.iid = iid;
        return this;
    }

    /**
     * 合并请求序号
     * @return iid
     */
    public Integer getIid() {
        return iid;
    }

    public void setIid(Integer iid) {
        this.iid = iid;
    }

    public MergeRequestStatisticDto withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 合并请求标题
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public MergeRequestStatisticDto withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 合并请求状态
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public MergeRequestStatisticDto withCommitsCount(Integer commitsCount) {
        this.commitsCount = commitsCount;
        return this;
    }

    /**
     * 合并请求提交数
     * @return commitsCount
     */
    public Integer getCommitsCount() {
        return commitsCount;
    }

    public void setCommitsCount(Integer commitsCount) {
        this.commitsCount = commitsCount;
    }

    public MergeRequestStatisticDto withChangedFilesCount(String changedFilesCount) {
        this.changedFilesCount = changedFilesCount;
        return this;
    }

    /**
     * 合并请求文件变数
     * @return changedFilesCount
     */
    public String getChangedFilesCount() {
        return changedFilesCount;
    }

    public void setChangedFilesCount(String changedFilesCount) {
        this.changedFilesCount = changedFilesCount;
    }

    public MergeRequestStatisticDto withNotesCount(NotesCountDto notesCount) {
        this.notesCount = notesCount;
        return this;
    }

    public MergeRequestStatisticDto withNotesCount(Consumer<NotesCountDto> notesCountSetter) {
        if (this.notesCount == null) {
            this.notesCount = new NotesCountDto();
            notesCountSetter.accept(this.notesCount);
        }

        return this;
    }

    /**
     * Get notesCount
     * @return notesCount
     */
    public NotesCountDto getNotesCount() {
        return notesCount;
    }

    public void setNotesCount(NotesCountDto notesCount) {
        this.notesCount = notesCount;
    }

    public MergeRequestStatisticDto withChangedLinesCount(MergeRequestLineChange changedLinesCount) {
        this.changedLinesCount = changedLinesCount;
        return this;
    }

    public MergeRequestStatisticDto withChangedLinesCount(Consumer<MergeRequestLineChange> changedLinesCountSetter) {
        if (this.changedLinesCount == null) {
            this.changedLinesCount = new MergeRequestLineChange();
            changedLinesCountSetter.accept(this.changedLinesCount);
        }

        return this;
    }

    /**
     * Get changedLinesCount
     * @return changedLinesCount
     */
    public MergeRequestLineChange getChangedLinesCount() {
        return changedLinesCount;
    }

    public void setChangedLinesCount(MergeRequestLineChange changedLinesCount) {
        this.changedLinesCount = changedLinesCount;
    }

    public MergeRequestStatisticDto withMergeError(String mergeError) {
        this.mergeError = mergeError;
        return this;
    }

    /**
     * 合并请求合入异常信息
     * @return mergeError
     */
    public String getMergeError() {
        return mergeError;
    }

    public void setMergeError(String mergeError) {
        this.mergeError = mergeError;
    }

    public MergeRequestStatisticDto withJsonMergeError(Object jsonMergeError) {
        this.jsonMergeError = jsonMergeError;
        return this;
    }

    /**
     * 合并请求合入异常信息
     * @return jsonMergeError
     */
    public Object getJsonMergeError() {
        return jsonMergeError;
    }

    public void setJsonMergeError(Object jsonMergeError) {
        this.jsonMergeError = jsonMergeError;
    }

    public MergeRequestStatisticDto withVotes(Integer votes) {
        this.votes = votes;
        return this;
    }

    /**
     * 合并请求评分数
     * @return votes
     */
    public Integer getVotes() {
        return votes;
    }

    public void setVotes(Integer votes) {
        this.votes = votes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MergeRequestStatisticDto that = (MergeRequestStatisticDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.iid, that.iid)
            && Objects.equals(this.title, that.title) && Objects.equals(this.state, that.state)
            && Objects.equals(this.commitsCount, that.commitsCount)
            && Objects.equals(this.changedFilesCount, that.changedFilesCount)
            && Objects.equals(this.notesCount, that.notesCount)
            && Objects.equals(this.changedLinesCount, that.changedLinesCount)
            && Objects.equals(this.mergeError, that.mergeError)
            && Objects.equals(this.jsonMergeError, that.jsonMergeError) && Objects.equals(this.votes, that.votes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            iid,
            title,
            state,
            commitsCount,
            changedFilesCount,
            notesCount,
            changedLinesCount,
            mergeError,
            jsonMergeError,
            votes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MergeRequestStatisticDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    iid: ").append(toIndentedString(iid)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    commitsCount: ").append(toIndentedString(commitsCount)).append("\n");
        sb.append("    changedFilesCount: ").append(toIndentedString(changedFilesCount)).append("\n");
        sb.append("    notesCount: ").append(toIndentedString(notesCount)).append("\n");
        sb.append("    changedLinesCount: ").append(toIndentedString(changedLinesCount)).append("\n");
        sb.append("    mergeError: ").append(toIndentedString(mergeError)).append("\n");
        sb.append("    jsonMergeError: ").append(toIndentedString(jsonMergeError)).append("\n");
        sb.append("    votes: ").append(toIndentedString(votes)).append("\n");
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
