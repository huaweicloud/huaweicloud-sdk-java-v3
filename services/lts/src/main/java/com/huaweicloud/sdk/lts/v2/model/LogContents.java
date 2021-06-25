package com.huaweicloud.sdk.lts.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 参数集
 */
public class LogContents  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="content")
    
    private String content;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="line_num")
    
    private String lineNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="labels")
    
    private Object labels;

    public LogContents withContent(String content) {
        this.content = content;
        return this;
    }

    


    /**
     * 日志原数据。
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    

    public LogContents withLineNum(String lineNum) {
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

    

    public LogContents withLabels(Object labels) {
        this.labels = labels;
        return this;
    }

    


    /**
     * 该条日志包含的 labels。
     * @return labels
     */
    public Object getLabels() {
        return labels;
    }

    public void setLabels(Object labels) {
        this.labels = labels;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LogContents logContents = (LogContents) o;
        return Objects.equals(this.content, logContents.content) &&
            Objects.equals(this.lineNum, logContents.lineNum) &&
            Objects.equals(this.labels, logContents.labels);
    }
    @Override
    public int hashCode() {
        return Objects.hash(content, lineNum, labels);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LogContents {\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    lineNum: ").append(toIndentedString(lineNum)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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

