package com.huaweicloud.sdk.ges.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * This is a auto create Body Object
 */
public class ImportGraphReq  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="edgesetPath")
    

    private String edgesetPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="edgesetFormat")
    

    private String edgesetFormat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vertexsetPath")
    

    private String vertexsetPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vertexsetFormat")
    

    private String vertexsetFormat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="schemaPath")
    

    private String schemaPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="logDir")
    

    private String logDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="parallelEdge")
    

    private Object parallelEdge;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="action")
    

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ignoreLabel")
    

    private Boolean ignoreLabel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="delimiter")
    

    private String delimiter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="trimQuote")
    

    private String trimQuote;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offline")
    

    private Boolean offline;

    public ImportGraphReq withEdgesetPath(String edgesetPath) {
        this.edgesetPath = edgesetPath;
        return this;
    }

    


    /**
     * 边文件目录或边文件名。
     * @return edgesetPath
     */
    public String getEdgesetPath() {
        return edgesetPath;
    }

    public void setEdgesetPath(String edgesetPath) {
        this.edgesetPath = edgesetPath;
    }

    

    public ImportGraphReq withEdgesetFormat(String edgesetFormat) {
        this.edgesetFormat = edgesetFormat;
        return this;
    }

    


    /**
     * 边数据集格式。当前仅支持csv。  默认为csv。
     * @return edgesetFormat
     */
    public String getEdgesetFormat() {
        return edgesetFormat;
    }

    public void setEdgesetFormat(String edgesetFormat) {
        this.edgesetFormat = edgesetFormat;
    }

    

    public ImportGraphReq withVertexsetPath(String vertexsetPath) {
        this.vertexsetPath = vertexsetPath;
        return this;
    }

    


    /**
     * 点文件目录或点文件名。
     * @return vertexsetPath
     */
    public String getVertexsetPath() {
        return vertexsetPath;
    }

    public void setVertexsetPath(String vertexsetPath) {
        this.vertexsetPath = vertexsetPath;
    }

    

    public ImportGraphReq withVertexsetFormat(String vertexsetFormat) {
        this.vertexsetFormat = vertexsetFormat;
        return this;
    }

    


    /**
     * 点数据集格式。当前仅支持csv。  默认为csv。
     * @return vertexsetFormat
     */
    public String getVertexsetFormat() {
        return vertexsetFormat;
    }

    public void setVertexsetFormat(String vertexsetFormat) {
        this.vertexsetFormat = vertexsetFormat;
    }

    

    public ImportGraphReq withSchemaPath(String schemaPath) {
        this.schemaPath = schemaPath;
        return this;
    }

    


    /**
     * 新增数据的元数据文件路径。
     * @return schemaPath
     */
    public String getSchemaPath() {
        return schemaPath;
    }

    public void setSchemaPath(String schemaPath) {
        this.schemaPath = schemaPath;
    }

    

    public ImportGraphReq withLogDir(String logDir) {
        this.logDir = logDir;
        return this;
    }

    


    /**
     * 导入图日志存放目录，用于存储导入失败的数据和详细错入原因。
     * @return logDir
     */
    public String getLogDir() {
        return logDir;
    }

    public void setLogDir(String logDir) {
        this.logDir = logDir;
    }

    

    public ImportGraphReq withParallelEdge(Object parallelEdge) {
        this.parallelEdge = parallelEdge;
        return this;
    }

    


    /**
     * 重复边处理
     * @return parallelEdge
     */
    public Object getParallelEdge() {
        return parallelEdge;
    }

    public void setParallelEdge(Object parallelEdge) {
        this.parallelEdge = parallelEdge;
    }

    

    public ImportGraphReq withAction(String action) {
        this.action = action;
        return this;
    }

    


    /**
     * 处理方式，取值为allow，ignore和override，默认为allow。 - allow表示允许重复边。 - ignore表示忽略之后的重复边。 - override表示覆盖之前的重复边。
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    

    public ImportGraphReq withIgnoreLabel(Boolean ignoreLabel) {
        this.ignoreLabel = ignoreLabel;
        return this;
    }

    


    /**
     * 重复边的定义，是否忽略Label。取值为true或者false，默认取true。 - true 表示重复边定义不包含Label，即用<源点，终点>标记一条边，不包含Label。 - false 表示重复边定义包含Label，即用<源点，终点，Label>标记一条边。
     * @return ignoreLabel
     */
    public Boolean getIgnoreLabel() {
        return ignoreLabel;
    }

    public void setIgnoreLabel(Boolean ignoreLabel) {
        this.ignoreLabel = ignoreLabel;
    }

    

    public ImportGraphReq withDelimiter(String delimiter) {
        this.delimiter = delimiter;
        return this;
    }

    


    /**
     * csv格式文件字段分隔符，默认值为逗号（,）。list/set类型的字段内元素分隔符默认为分号（;）。
     * @return delimiter
     */
    public String getDelimiter() {
        return delimiter;
    }

    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    

    public ImportGraphReq withTrimQuote(String trimQuote) {
        this.trimQuote = trimQuote;
        return this;
    }

    


    /**
     * csv格式文件字段包围符，默认值为双引号（\"）。用来包围一个字段，如字段中含有分隔符或者换行等。
     * @return trimQuote
     */
    public String getTrimQuote() {
        return trimQuote;
    }

    public void setTrimQuote(String trimQuote) {
        this.trimQuote = trimQuote;
    }

    

    public ImportGraphReq withOffline(Boolean offline) {
        this.offline = offline;
        return this;
    }

    


    /**
     * 是否离线导入，取值为true或者false，默认取false。 - true 表示离线导入，导入速度较快，但导入过程中图处于锁定状态，不可读不可写。 - false 表示在线导入，相对离线导入，在线导入速度略慢，但导入过程中图并未锁定，可读不可写。
     * @return offline
     */
    public Boolean getOffline() {
        return offline;
    }

    public void setOffline(Boolean offline) {
        this.offline = offline;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImportGraphReq importGraphReq = (ImportGraphReq) o;
        return Objects.equals(this.edgesetPath, importGraphReq.edgesetPath) &&
            Objects.equals(this.edgesetFormat, importGraphReq.edgesetFormat) &&
            Objects.equals(this.vertexsetPath, importGraphReq.vertexsetPath) &&
            Objects.equals(this.vertexsetFormat, importGraphReq.vertexsetFormat) &&
            Objects.equals(this.schemaPath, importGraphReq.schemaPath) &&
            Objects.equals(this.logDir, importGraphReq.logDir) &&
            Objects.equals(this.parallelEdge, importGraphReq.parallelEdge) &&
            Objects.equals(this.action, importGraphReq.action) &&
            Objects.equals(this.ignoreLabel, importGraphReq.ignoreLabel) &&
            Objects.equals(this.delimiter, importGraphReq.delimiter) &&
            Objects.equals(this.trimQuote, importGraphReq.trimQuote) &&
            Objects.equals(this.offline, importGraphReq.offline);
    }
    @Override
    public int hashCode() {
        return Objects.hash(edgesetPath, edgesetFormat, vertexsetPath, vertexsetFormat, schemaPath, logDir, parallelEdge, action, ignoreLabel, delimiter, trimQuote, offline);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportGraphReq {\n");
        sb.append("    edgesetPath: ").append(toIndentedString(edgesetPath)).append("\n");
        sb.append("    edgesetFormat: ").append(toIndentedString(edgesetFormat)).append("\n");
        sb.append("    vertexsetPath: ").append(toIndentedString(vertexsetPath)).append("\n");
        sb.append("    vertexsetFormat: ").append(toIndentedString(vertexsetFormat)).append("\n");
        sb.append("    schemaPath: ").append(toIndentedString(schemaPath)).append("\n");
        sb.append("    logDir: ").append(toIndentedString(logDir)).append("\n");
        sb.append("    parallelEdge: ").append(toIndentedString(parallelEdge)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    ignoreLabel: ").append(toIndentedString(ignoreLabel)).append("\n");
        sb.append("    delimiter: ").append(toIndentedString(delimiter)).append("\n");
        sb.append("    trimQuote: ").append(toIndentedString(trimQuote)).append("\n");
        sb.append("    offline: ").append(toIndentedString(offline)).append("\n");
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

