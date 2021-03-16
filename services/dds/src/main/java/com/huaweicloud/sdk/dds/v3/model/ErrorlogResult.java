package com.huaweicloud.sdk.dds.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ErrorlogResult
 */
public class ErrorlogResult  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="node_name")
    
    private String nodeName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="level")
    
    private String level;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="time")
    
    private String time;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="content")
    
    private String content;

    public ErrorlogResult withNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    


    /**
     * 节点名称。
     * @return nodeName
     */
    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    

    public ErrorlogResult withLevel(String level) {
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

    

    public ErrorlogResult withTime(String time) {
        this.time = time;
        return this;
    }

    


    /**
     * 发生时间，UTC时间。
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    

    public ErrorlogResult withContent(String content) {
        this.content = content;
        return this;
    }

    


    /**
     * 日志内容。
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ErrorlogResult errorlogResult = (ErrorlogResult) o;
        return Objects.equals(this.nodeName, errorlogResult.nodeName) &&
            Objects.equals(this.level, errorlogResult.level) &&
            Objects.equals(this.time, errorlogResult.time) &&
            Objects.equals(this.content, errorlogResult.content);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nodeName, level, time, content);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ErrorlogResult {\n");
        sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

