package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 代码导航def相关信息
 */
public class DefEntryDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_name")

    private String tagName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_path")

    private String filePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blob")

    private String blob;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "line_image")

    private String lineImage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "line_number")

    private Integer lineNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "range")

    private String range;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "syntax_type")

    private String syntaxType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "revision")

    private String revision;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend")

    private String extend;

    public DefEntryDto withTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }

    /**
     * **参数解释：** 标记名称。 **约束限制：** 不涉及。
     * @return tagName
     */
    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public DefEntryDto withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * **参数解释：** 文件路径。 **约束限制：** 不涉及。
     * @return filePath
     */
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public DefEntryDto withBlob(String blob) {
        this.blob = blob;
        return this;
    }

    /**
     * **参数解释：** blob文件ID。 **约束限制：** 不涉及。
     * @return blob
     */
    public String getBlob() {
        return blob;
    }

    public void setBlob(String blob) {
        this.blob = blob;
    }

    public DefEntryDto withLineImage(String lineImage) {
        this.lineImage = lineImage;
        return this;
    }

    /**
     * **参数解释：** 索引行简要内容。 **约束限制：** 不涉及。
     * @return lineImage
     */
    public String getLineImage() {
        return lineImage;
    }

    public void setLineImage(String lineImage) {
        this.lineImage = lineImage;
    }

    public DefEntryDto withLineNumber(Integer lineNumber) {
        this.lineNumber = lineNumber;
        return this;
    }

    /**
     * **参数解释：** 行号。 **约束限制：** 不涉及。
     * @return lineNumber
     */
    public Integer getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(Integer lineNumber) {
        this.lineNumber = lineNumber;
    }

    public DefEntryDto withRange(String range) {
        this.range = range;
        return this;
    }

    /**
     * **参数解释：** 范围信息。 **约束限制：** 不涉及。
     * @return range
     */
    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public DefEntryDto withSyntaxType(String syntaxType) {
        this.syntaxType = syntaxType;
        return this;
    }

    /**
     * **参数解释：** 语法类型。 **约束限制：** 不涉及。
     * @return syntaxType
     */
    public String getSyntaxType() {
        return syntaxType;
    }

    public void setSyntaxType(String syntaxType) {
        this.syntaxType = syntaxType;
    }

    public DefEntryDto withRevision(String revision) {
        this.revision = revision;
        return this;
    }

    /**
     * **参数解释：** 所在版本号（commit id）。 **约束限制：** 不涉及。
     * @return revision
     */
    public String getRevision() {
        return revision;
    }

    public void setRevision(String revision) {
        this.revision = revision;
    }

    public DefEntryDto withExtend(String extend) {
        this.extend = extend;
        return this;
    }

    /**
     * **参数解释：** 其他信息。 **约束限制：** 不涉及。
     * @return extend
     */
    public String getExtend() {
        return extend;
    }

    public void setExtend(String extend) {
        this.extend = extend;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DefEntryDto that = (DefEntryDto) obj;
        return Objects.equals(this.tagName, that.tagName) && Objects.equals(this.filePath, that.filePath)
            && Objects.equals(this.blob, that.blob) && Objects.equals(this.lineImage, that.lineImage)
            && Objects.equals(this.lineNumber, that.lineNumber) && Objects.equals(this.range, that.range)
            && Objects.equals(this.syntaxType, that.syntaxType) && Objects.equals(this.revision, that.revision)
            && Objects.equals(this.extend, that.extend);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tagName, filePath, blob, lineImage, lineNumber, range, syntaxType, revision, extend);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DefEntryDto {\n");
        sb.append("    tagName: ").append(toIndentedString(tagName)).append("\n");
        sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
        sb.append("    blob: ").append(toIndentedString(blob)).append("\n");
        sb.append("    lineImage: ").append(toIndentedString(lineImage)).append("\n");
        sb.append("    lineNumber: ").append(toIndentedString(lineNumber)).append("\n");
        sb.append("    range: ").append(toIndentedString(range)).append("\n");
        sb.append("    syntaxType: ").append(toIndentedString(syntaxType)).append("\n");
        sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
        sb.append("    extend: ").append(toIndentedString(extend)).append("\n");
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
