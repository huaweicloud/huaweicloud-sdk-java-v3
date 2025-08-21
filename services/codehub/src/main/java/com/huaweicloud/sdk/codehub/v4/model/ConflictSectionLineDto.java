package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ConflictSectionLineDto
 */
public class ConflictSectionLineDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "line_code")

    private String lineCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "old_line")

    private Integer oldLine;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_line")

    private Integer newLine;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "text")

    private String text;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "meta_data")

    private ConflictSectionLineMetaDataDto metaData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rich_text")

    private String richText;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_receive_suggestion")

    private Boolean canReceiveSuggestion;

    public ConflictSectionLineDto withLineCode(String lineCode) {
        this.lineCode = lineCode;
        return this;
    }

    /**
     * 行
     * @return lineCode
     */
    public String getLineCode() {
        return lineCode;
    }

    public void setLineCode(String lineCode) {
        this.lineCode = lineCode;
    }

    public ConflictSectionLineDto withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ConflictSectionLineDto withOldLine(Integer oldLine) {
        this.oldLine = oldLine;
        return this;
    }

    /**
     * 旧行
     * @return oldLine
     */
    public Integer getOldLine() {
        return oldLine;
    }

    public void setOldLine(Integer oldLine) {
        this.oldLine = oldLine;
    }

    public ConflictSectionLineDto withNewLine(Integer newLine) {
        this.newLine = newLine;
        return this;
    }

    /**
     * 新行
     * @return newLine
     */
    public Integer getNewLine() {
        return newLine;
    }

    public void setNewLine(Integer newLine) {
        this.newLine = newLine;
    }

    public ConflictSectionLineDto withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * 文本
     * @return text
     */
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ConflictSectionLineDto withMetaData(ConflictSectionLineMetaDataDto metaData) {
        this.metaData = metaData;
        return this;
    }

    public ConflictSectionLineDto withMetaData(Consumer<ConflictSectionLineMetaDataDto> metaDataSetter) {
        if (this.metaData == null) {
            this.metaData = new ConflictSectionLineMetaDataDto();
            metaDataSetter.accept(this.metaData);
        }

        return this;
    }

    /**
     * Get metaData
     * @return metaData
     */
    public ConflictSectionLineMetaDataDto getMetaData() {
        return metaData;
    }

    public void setMetaData(ConflictSectionLineMetaDataDto metaData) {
        this.metaData = metaData;
    }

    public ConflictSectionLineDto withRichText(String richText) {
        this.richText = richText;
        return this;
    }

    /**
     * 富文本
     * @return richText
     */
    public String getRichText() {
        return richText;
    }

    public void setRichText(String richText) {
        this.richText = richText;
    }

    public ConflictSectionLineDto withCanReceiveSuggestion(Boolean canReceiveSuggestion) {
        this.canReceiveSuggestion = canReceiveSuggestion;
        return this;
    }

    /**
     * 可接受建议
     * @return canReceiveSuggestion
     */
    public Boolean getCanReceiveSuggestion() {
        return canReceiveSuggestion;
    }

    public void setCanReceiveSuggestion(Boolean canReceiveSuggestion) {
        this.canReceiveSuggestion = canReceiveSuggestion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConflictSectionLineDto that = (ConflictSectionLineDto) obj;
        return Objects.equals(this.lineCode, that.lineCode) && Objects.equals(this.type, that.type)
            && Objects.equals(this.oldLine, that.oldLine) && Objects.equals(this.newLine, that.newLine)
            && Objects.equals(this.text, that.text) && Objects.equals(this.metaData, that.metaData)
            && Objects.equals(this.richText, that.richText)
            && Objects.equals(this.canReceiveSuggestion, that.canReceiveSuggestion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lineCode, type, oldLine, newLine, text, metaData, richText, canReceiveSuggestion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConflictSectionLineDto {\n");
        sb.append("    lineCode: ").append(toIndentedString(lineCode)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    oldLine: ").append(toIndentedString(oldLine)).append("\n");
        sb.append("    newLine: ").append(toIndentedString(newLine)).append("\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
        sb.append("    richText: ").append(toIndentedString(richText)).append("\n");
        sb.append("    canReceiveSuggestion: ").append(toIndentedString(canReceiveSuggestion)).append("\n");
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
