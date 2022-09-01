package com.huaweicloud.sdk.codecheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * start_offset和end_offset均为-1，表示该行不是缺陷片段或者整行都是，需要结合DefectInfoV2中的line_number属性一起判断哪一行是具体的缺陷片段。
 */
public class DefectFragmentV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "line_num")

    @JacksonXmlProperty(localName = "line_num")

    private String lineNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "line_content")

    @JacksonXmlProperty(localName = "line_content")

    private String lineContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_offset")

    @JacksonXmlProperty(localName = "start_offset")

    private Integer startOffset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_offset")

    @JacksonXmlProperty(localName = "end_offset")

    private Integer endOffset;

    public DefectFragmentV2 withLineNum(String lineNum) {
        this.lineNum = lineNum;
        return this;
    }

    /**
     * 行号
     * @return lineNum
     */
    public String getLineNum() {
        return lineNum;
    }

    public void setLineNum(String lineNum) {
        this.lineNum = lineNum;
    }

    public DefectFragmentV2 withLineContent(String lineContent) {
        this.lineContent = lineContent;
        return this;
    }

    /**
     * 该行代码内容
     * @return lineContent
     */
    public String getLineContent() {
        return lineContent;
    }

    public void setLineContent(String lineContent) {
        this.lineContent = lineContent;
    }

    public DefectFragmentV2 withStartOffset(Integer startOffset) {
        this.startOffset = startOffset;
        return this;
    }

    /**
     * 缺陷开始列号
     * @return startOffset
     */
    public Integer getStartOffset() {
        return startOffset;
    }

    public void setStartOffset(Integer startOffset) {
        this.startOffset = startOffset;
    }

    public DefectFragmentV2 withEndOffset(Integer endOffset) {
        this.endOffset = endOffset;
        return this;
    }

    /**
     * 缺陷结束列号
     * @return endOffset
     */
    public Integer getEndOffset() {
        return endOffset;
    }

    public void setEndOffset(Integer endOffset) {
        this.endOffset = endOffset;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DefectFragmentV2 defectFragmentV2 = (DefectFragmentV2) o;
        return Objects.equals(this.lineNum, defectFragmentV2.lineNum)
            && Objects.equals(this.lineContent, defectFragmentV2.lineContent)
            && Objects.equals(this.startOffset, defectFragmentV2.startOffset)
            && Objects.equals(this.endOffset, defectFragmentV2.endOffset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lineNum, lineContent, startOffset, endOffset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DefectFragmentV2 {\n");
        sb.append("    lineNum: ").append(toIndentedString(lineNum)).append("\n");
        sb.append("    lineContent: ").append(toIndentedString(lineContent)).append("\n");
        sb.append("    startOffset: ").append(toIndentedString(startOffset)).append("\n");
        sb.append("    endOffset: ").append(toIndentedString(endOffset)).append("\n");
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
