package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 参数集
 */
public class StructLogContents {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_content")

    private String logContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "line_num")

    private String lineNum;

    public StructLogContents withLogContent(String logContent) {
        this.logContent = logContent;
        return this;
    }

    /**
     * 日志原数据。
     * @return logContent
     */
    public String getLogContent() {
        return logContent;
    }

    public void setLogContent(String logContent) {
        this.logContent = logContent;
    }

    public StructLogContents withLineNum(String lineNum) {
        this.lineNum = lineNum;
        return this;
    }

    /**
     * 日志单行序列号。
     * @return lineNum
     */
    public String getLineNum() {
        return lineNum;
    }

    public void setLineNum(String lineNum) {
        this.lineNum = lineNum;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StructLogContents structLogContents = (StructLogContents) o;
        return Objects.equals(this.logContent, structLogContents.logContent)
            && Objects.equals(this.lineNum, structLogContents.lineNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logContent, lineNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StructLogContents {\n");
        sb.append("    logContent: ").append(toIndentedString(logContent)).append("\n");
        sb.append("    lineNum: ").append(toIndentedString(lineNum)).append("\n");
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
