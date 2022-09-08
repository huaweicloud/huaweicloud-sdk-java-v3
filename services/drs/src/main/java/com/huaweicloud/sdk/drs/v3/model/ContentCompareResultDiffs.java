package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class ContentCompareResultDiffs {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_db_name")

    private String sourceDbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_table_name")

    private String sourceTableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ContentCompareDiff")

    private List<ContentCompareDiff> contentCompareDiff = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content_compare_diff_count")

    private Integer contentCompareDiffCount;

    public ContentCompareResultDiffs withSourceDbName(String sourceDbName) {
        this.sourceDbName = sourceDbName;
        return this;
    }

    /**
     * 源库名称。
     * @return sourceDbName
     */
    public String getSourceDbName() {
        return sourceDbName;
    }

    public void setSourceDbName(String sourceDbName) {
        this.sourceDbName = sourceDbName;
    }

    public ContentCompareResultDiffs withSourceTableName(String sourceTableName) {
        this.sourceTableName = sourceTableName;
        return this;
    }

    /**
     * 源库的表名称。
     * @return sourceTableName
     */
    public String getSourceTableName() {
        return sourceTableName;
    }

    public void setSourceTableName(String sourceTableName) {
        this.sourceTableName = sourceTableName;
    }

    public ContentCompareResultDiffs withContentCompareDiff(List<ContentCompareDiff> contentCompareDiff) {
        this.contentCompareDiff = contentCompareDiff;
        return this;
    }

    public ContentCompareResultDiffs addContentCompareDiffItem(ContentCompareDiff contentCompareDiffItem) {
        if (this.contentCompareDiff == null) {
            this.contentCompareDiff = new ArrayList<>();
        }
        this.contentCompareDiff.add(contentCompareDiffItem);
        return this;
    }

    public ContentCompareResultDiffs withContentCompareDiff(
        Consumer<List<ContentCompareDiff>> contentCompareDiffSetter) {
        if (this.contentCompareDiff == null) {
            this.contentCompareDiff = new ArrayList<>();
        }
        contentCompareDiffSetter.accept(this.contentCompareDiff);
        return this;
    }

    /**
     * 内容对比结果差异。
     * @return contentCompareDiff
     */
    public List<ContentCompareDiff> getContentCompareDiff() {
        return contentCompareDiff;
    }

    public void setContentCompareDiff(List<ContentCompareDiff> contentCompareDiff) {
        this.contentCompareDiff = contentCompareDiff;
    }

    public ContentCompareResultDiffs withContentCompareDiffCount(Integer contentCompareDiffCount) {
        this.contentCompareDiffCount = contentCompareDiffCount;
        return this;
    }

    /**
     * 内容对比结果差异总数。
     * @return contentCompareDiffCount
     */
    public Integer getContentCompareDiffCount() {
        return contentCompareDiffCount;
    }

    public void setContentCompareDiffCount(Integer contentCompareDiffCount) {
        this.contentCompareDiffCount = contentCompareDiffCount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ContentCompareResultDiffs contentCompareResultDiffs = (ContentCompareResultDiffs) o;
        return Objects.equals(this.sourceDbName, contentCompareResultDiffs.sourceDbName)
            && Objects.equals(this.sourceTableName, contentCompareResultDiffs.sourceTableName)
            && Objects.equals(this.contentCompareDiff, contentCompareResultDiffs.contentCompareDiff)
            && Objects.equals(this.contentCompareDiffCount, contentCompareResultDiffs.contentCompareDiffCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceDbName, sourceTableName, contentCompareDiff, contentCompareDiffCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContentCompareResultDiffs {\n");
        sb.append("    sourceDbName: ").append(toIndentedString(sourceDbName)).append("\n");
        sb.append("    sourceTableName: ").append(toIndentedString(sourceTableName)).append("\n");
        sb.append("    contentCompareDiff: ").append(toIndentedString(contentCompareDiff)).append("\n");
        sb.append("    contentCompareDiffCount: ").append(toIndentedString(contentCompareDiffCount)).append("\n");
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
