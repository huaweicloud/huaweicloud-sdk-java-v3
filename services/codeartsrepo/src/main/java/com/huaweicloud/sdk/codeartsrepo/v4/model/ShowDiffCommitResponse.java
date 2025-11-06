package com.huaweicloud.sdk.codeartsrepo.v4.model;

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
public class ShowDiffCommitResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diffs")

    private List<DiffNoLineDto> diffs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diff_refs")

    private DiffRefsDto diffRefs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "added_lines")

    private Integer addedLines;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "removed_lines")

    private Integer removedLines;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "change_file_count")

    private Integer changeFileCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "change_line_count")

    private Integer changeLineCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "too_large")

    private Boolean tooLarge;

    public ShowDiffCommitResponse withDiffs(List<DiffNoLineDto> diffs) {
        this.diffs = diffs;
        return this;
    }

    public ShowDiffCommitResponse addDiffsItem(DiffNoLineDto diffsItem) {
        if (this.diffs == null) {
            this.diffs = new ArrayList<>();
        }
        this.diffs.add(diffsItem);
        return this;
    }

    public ShowDiffCommitResponse withDiffs(Consumer<List<DiffNoLineDto>> diffsSetter) {
        if (this.diffs == null) {
            this.diffs = new ArrayList<>();
        }
        diffsSetter.accept(this.diffs);
        return this;
    }

    /**
     * **参数解释：** 差异信息。 **取值范围：** 不涉及。
     * @return diffs
     */
    public List<DiffNoLineDto> getDiffs() {
        return diffs;
    }

    public void setDiffs(List<DiffNoLineDto> diffs) {
        this.diffs = diffs;
    }

    public ShowDiffCommitResponse withDiffRefs(DiffRefsDto diffRefs) {
        this.diffRefs = diffRefs;
        return this;
    }

    public ShowDiffCommitResponse withDiffRefs(Consumer<DiffRefsDto> diffRefsSetter) {
        if (this.diffRefs == null) {
            this.diffRefs = new DiffRefsDto();
            diffRefsSetter.accept(this.diffRefs);
        }

        return this;
    }

    /**
     * Get diffRefs
     * @return diffRefs
     */
    public DiffRefsDto getDiffRefs() {
        return diffRefs;
    }

    public void setDiffRefs(DiffRefsDto diffRefs) {
        this.diffRefs = diffRefs;
    }

    public ShowDiffCommitResponse withAddedLines(Integer addedLines) {
        this.addedLines = addedLines;
        return this;
    }

    /**
     * **参数解释：** 增加行数。 **取值范围：** 不涉及。
     * @return addedLines
     */
    public Integer getAddedLines() {
        return addedLines;
    }

    public void setAddedLines(Integer addedLines) {
        this.addedLines = addedLines;
    }

    public ShowDiffCommitResponse withRemovedLines(Integer removedLines) {
        this.removedLines = removedLines;
        return this;
    }

    /**
     * **参数解释：** 删除行数。 **取值范围：** 不涉及。
     * @return removedLines
     */
    public Integer getRemovedLines() {
        return removedLines;
    }

    public void setRemovedLines(Integer removedLines) {
        this.removedLines = removedLines;
    }

    public ShowDiffCommitResponse withChangeFileCount(Integer changeFileCount) {
        this.changeFileCount = changeFileCount;
        return this;
    }

    /**
     * **参数解释：** 更改文件数目。 **取值范围：** 不涉及。
     * @return changeFileCount
     */
    public Integer getChangeFileCount() {
        return changeFileCount;
    }

    public void setChangeFileCount(Integer changeFileCount) {
        this.changeFileCount = changeFileCount;
    }

    public ShowDiffCommitResponse withChangeLineCount(Integer changeLineCount) {
        this.changeLineCount = changeLineCount;
        return this;
    }

    /**
     * **参数解释：** 更改行数。 **取值范围：** 不涉及。
     * @return changeLineCount
     */
    public Integer getChangeLineCount() {
        return changeLineCount;
    }

    public void setChangeLineCount(Integer changeLineCount) {
        this.changeLineCount = changeLineCount;
    }

    public ShowDiffCommitResponse withTooLarge(Boolean tooLarge) {
        this.tooLarge = tooLarge;
        return this;
    }

    /**
     * **参数解释：** 是否过大。 **取值范围：** - true，大文件。 - false，非大文件
     * @return tooLarge
     */
    public Boolean getTooLarge() {
        return tooLarge;
    }

    public void setTooLarge(Boolean tooLarge) {
        this.tooLarge = tooLarge;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDiffCommitResponse that = (ShowDiffCommitResponse) obj;
        return Objects.equals(this.diffs, that.diffs) && Objects.equals(this.diffRefs, that.diffRefs)
            && Objects.equals(this.addedLines, that.addedLines) && Objects.equals(this.removedLines, that.removedLines)
            && Objects.equals(this.changeFileCount, that.changeFileCount)
            && Objects.equals(this.changeLineCount, that.changeLineCount)
            && Objects.equals(this.tooLarge, that.tooLarge);
    }

    @Override
    public int hashCode() {
        return Objects.hash(diffs, diffRefs, addedLines, removedLines, changeFileCount, changeLineCount, tooLarge);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDiffCommitResponse {\n");
        sb.append("    diffs: ").append(toIndentedString(diffs)).append("\n");
        sb.append("    diffRefs: ").append(toIndentedString(diffRefs)).append("\n");
        sb.append("    addedLines: ").append(toIndentedString(addedLines)).append("\n");
        sb.append("    removedLines: ").append(toIndentedString(removedLines)).append("\n");
        sb.append("    changeFileCount: ").append(toIndentedString(changeFileCount)).append("\n");
        sb.append("    changeLineCount: ").append(toIndentedString(changeLineCount)).append("\n");
        sb.append("    tooLarge: ").append(toIndentedString(tooLarge)).append("\n");
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
