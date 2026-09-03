package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowTrainingJobLogsFromAomResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_line")

    private String startLine;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_line")

    private String endLine;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lines")

    private Integer lines;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    public ShowTrainingJobLogsFromAomResponse withStartLine(String startLine) {
        this.startLine = startLine;
        return this;
    }

    /**
     * **参数解释**：返回日志的起始行号。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return startLine
     */
    public String getStartLine() {
        return startLine;
    }

    public void setStartLine(String startLine) {
        this.startLine = startLine;
    }

    public ShowTrainingJobLogsFromAomResponse withEndLine(String endLine) {
        this.endLine = endLine;
        return this;
    }

    /**
     * **参数解释**：返回日志的结束行号。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return endLine
     */
    public String getEndLine() {
        return endLine;
    }

    public void setEndLine(String endLine) {
        this.endLine = endLine;
    }

    public ShowTrainingJobLogsFromAomResponse withLines(Integer lines) {
        this.lines = lines;
        return this;
    }

    /**
     * **参数解释**：返回的日志行数。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return lines
     */
    public Integer getLines() {
        return lines;
    }

    public void setLines(Integer lines) {
        this.lines = lines;
    }

    public ShowTrainingJobLogsFromAomResponse withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * **参数解释**：日志内容。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTrainingJobLogsFromAomResponse that = (ShowTrainingJobLogsFromAomResponse) obj;
        return Objects.equals(this.startLine, that.startLine) && Objects.equals(this.endLine, that.endLine)
            && Objects.equals(this.lines, that.lines) && Objects.equals(this.content, that.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startLine, endLine, lines, content);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTrainingJobLogsFromAomResponse {\n");
        sb.append("    startLine: ").append(toIndentedString(startLine)).append("\n");
        sb.append("    endLine: ").append(toIndentedString(endLine)).append("\n");
        sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
