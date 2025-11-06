package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * NotesCountDto
 */
public class NotesCountDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notes_count")

    private Integer notesCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unresolved_notes_count")

    private Integer unresolvedNotesCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "already_resolved_count")

    private Integer alreadyResolvedCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "need_resolved_count")

    private Integer needResolvedCount;

    public NotesCountDto withNotesCount(Integer notesCount) {
        this.notesCount = notesCount;
        return this;
    }

    /**
     * 检视意见总数
     * @return notesCount
     */
    public Integer getNotesCount() {
        return notesCount;
    }

    public void setNotesCount(Integer notesCount) {
        this.notesCount = notesCount;
    }

    public NotesCountDto withUnresolvedNotesCount(Integer unresolvedNotesCount) {
        this.unresolvedNotesCount = unresolvedNotesCount;
        return this;
    }

    /**
     * 未解决的检视意见数量
     * @return unresolvedNotesCount
     */
    public Integer getUnresolvedNotesCount() {
        return unresolvedNotesCount;
    }

    public void setUnresolvedNotesCount(Integer unresolvedNotesCount) {
        this.unresolvedNotesCount = unresolvedNotesCount;
    }

    public NotesCountDto withAlreadyResolvedCount(Integer alreadyResolvedCount) {
        this.alreadyResolvedCount = alreadyResolvedCount;
        return this;
    }

    /**
     * 已解决的检视意见数量
     * @return alreadyResolvedCount
     */
    public Integer getAlreadyResolvedCount() {
        return alreadyResolvedCount;
    }

    public void setAlreadyResolvedCount(Integer alreadyResolvedCount) {
        this.alreadyResolvedCount = alreadyResolvedCount;
    }

    public NotesCountDto withNeedResolvedCount(Integer needResolvedCount) {
        this.needResolvedCount = needResolvedCount;
        return this;
    }

    /**
     * 需要解决的检视意见总数
     * @return needResolvedCount
     */
    public Integer getNeedResolvedCount() {
        return needResolvedCount;
    }

    public void setNeedResolvedCount(Integer needResolvedCount) {
        this.needResolvedCount = needResolvedCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NotesCountDto that = (NotesCountDto) obj;
        return Objects.equals(this.notesCount, that.notesCount)
            && Objects.equals(this.unresolvedNotesCount, that.unresolvedNotesCount)
            && Objects.equals(this.alreadyResolvedCount, that.alreadyResolvedCount)
            && Objects.equals(this.needResolvedCount, that.needResolvedCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notesCount, unresolvedNotesCount, alreadyResolvedCount, needResolvedCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NotesCountDto {\n");
        sb.append("    notesCount: ").append(toIndentedString(notesCount)).append("\n");
        sb.append("    unresolvedNotesCount: ").append(toIndentedString(unresolvedNotesCount)).append("\n");
        sb.append("    alreadyResolvedCount: ").append(toIndentedString(alreadyResolvedCount)).append("\n");
        sb.append("    needResolvedCount: ").append(toIndentedString(needResolvedCount)).append("\n");
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
