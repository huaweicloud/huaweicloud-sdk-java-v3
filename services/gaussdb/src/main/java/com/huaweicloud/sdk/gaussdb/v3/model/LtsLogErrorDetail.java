package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * LtsLogErrorDetail
 */
public class LtsLogErrorDetail  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="node_id")
    

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="time")
    

    private String time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="level")
    

    private String level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="content")
    

    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="line_num")
    

    private String lineNum;

    public LtsLogErrorDetail withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    


    /**
     * 节点ID。
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    

    public LtsLogErrorDetail withTime(String time) {
        this.time = time;
        return this;
    }

    


    /**
     * 执行时间。
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    

    public LtsLogErrorDetail withLevel(String level) {
        this.level = level;
        return this;
    }

    


    /**
     * 日志级别。
     * @return level
     */
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    

    public LtsLogErrorDetail withContent(String content) {
        this.content = content;
        return this;
    }

    


    /**
     * 错误日志内容。
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    

    public LtsLogErrorDetail withLineNum(String lineNum) {
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
        LtsLogErrorDetail ltsLogErrorDetail = (LtsLogErrorDetail) o;
        return Objects.equals(this.nodeId, ltsLogErrorDetail.nodeId) &&
            Objects.equals(this.time, ltsLogErrorDetail.time) &&
            Objects.equals(this.level, ltsLogErrorDetail.level) &&
            Objects.equals(this.content, ltsLogErrorDetail.content) &&
            Objects.equals(this.lineNum, ltsLogErrorDetail.lineNum);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nodeId, time, level, content, lineNum);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LtsLogErrorDetail {\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

