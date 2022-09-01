package com.huaweicloud.sdk.ges.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ges.v1.model.ParallelEdge;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class Parameters  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="schemaPath")
    
    @JacksonXmlProperty(localName = "schemaPath")
    
    private String schemaPath;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="edgesetPath")
    
    @JacksonXmlProperty(localName = "edgesetPath")
    
    private String edgesetPath;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="edgesetFormat")
    
    @JacksonXmlProperty(localName = "edgesetFormat")
    
    private String edgesetFormat;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="edgesetDefaultLabel")
    
    @JacksonXmlProperty(localName = "edgesetDefaultLabel")
    
    private String edgesetDefaultLabel;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vertexsetPath")
    
    @JacksonXmlProperty(localName = "vertexsetPath")
    
    private String vertexsetPath;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vertexsetFormat")
    
    @JacksonXmlProperty(localName = "vertexsetFormat")
    
    private String vertexsetFormat;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vertexsetDefaultLabel")
    
    @JacksonXmlProperty(localName = "vertexsetDefaultLabel")
    
    private String vertexsetDefaultLabel;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="logDir")
    
    @JacksonXmlProperty(localName = "logDir")
    
    private String logDir;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="parallelEdge")
    
    @JacksonXmlProperty(localName = "parallelEdge")
    
    private ParallelEdge parallelEdge;

    public Parameters withSchemaPath(String schemaPath) {
        this.schemaPath = schemaPath;
        return this;
    }

    


    /**
     * 元数据文件OBS路径，只支持文件。
     * @return schemaPath
     */
    public String getSchemaPath() {
        return schemaPath;
    }

    public void setSchemaPath(String schemaPath) {
        this.schemaPath = schemaPath;
    }

    

    public Parameters withEdgesetPath(String edgesetPath) {
        this.edgesetPath = edgesetPath;
        return this;
    }

    


    /**
     * 边数据集文件OBS路径，只支持文件。
     * @return edgesetPath
     */
    public String getEdgesetPath() {
        return edgesetPath;
    }

    public void setEdgesetPath(String edgesetPath) {
        this.edgesetPath = edgesetPath;
    }

    

    public Parameters withEdgesetFormat(String edgesetFormat) {
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

    

    public Parameters withEdgesetDefaultLabel(String edgesetDefaultLabel) {
        this.edgesetDefaultLabel = edgesetDefaultLabel;
        return this;
    }

    


    /**
     * 边数据集默认标签，当前默认为空，可以不填。
     * @return edgesetDefaultLabel
     */
    public String getEdgesetDefaultLabel() {
        return edgesetDefaultLabel;
    }

    public void setEdgesetDefaultLabel(String edgesetDefaultLabel) {
        this.edgesetDefaultLabel = edgesetDefaultLabel;
    }

    

    public Parameters withVertexsetPath(String vertexsetPath) {
        this.vertexsetPath = vertexsetPath;
        return this;
    }

    


    /**
     * 点数据集OBS路径，只支持文件。
     * @return vertexsetPath
     */
    public String getVertexsetPath() {
        return vertexsetPath;
    }

    public void setVertexsetPath(String vertexsetPath) {
        this.vertexsetPath = vertexsetPath;
    }

    

    public Parameters withVertexsetFormat(String vertexsetFormat) {
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

    

    public Parameters withVertexsetDefaultLabel(String vertexsetDefaultLabel) {
        this.vertexsetDefaultLabel = vertexsetDefaultLabel;
        return this;
    }

    


    /**
     * 点数据集默认标签，当前默认为空，可以不填。
     * @return vertexsetDefaultLabel
     */
    public String getVertexsetDefaultLabel() {
        return vertexsetDefaultLabel;
    }

    public void setVertexsetDefaultLabel(String vertexsetDefaultLabel) {
        this.vertexsetDefaultLabel = vertexsetDefaultLabel;
    }

    

    public Parameters withLogDir(String logDir) {
        this.logDir = logDir;
        return this;
    }

    


    /**
     * OBS日志存储目录，用于存储建图过程导入失败的数据和详细日志。
     * @return logDir
     */
    public String getLogDir() {
        return logDir;
    }

    public void setLogDir(String logDir) {
        this.logDir = logDir;
    }

    

    public Parameters withParallelEdge(ParallelEdge parallelEdge) {
        this.parallelEdge = parallelEdge;
        return this;
    }

    public Parameters withParallelEdge(Consumer<ParallelEdge> parallelEdgeSetter) {
        if(this.parallelEdge == null ){
            this.parallelEdge = new ParallelEdge();
            parallelEdgeSetter.accept(this.parallelEdge);
        }
        
        return this;
    }


    /**
     * Get parallelEdge
     * @return parallelEdge
     */
    public ParallelEdge getParallelEdge() {
        return parallelEdge;
    }

    public void setParallelEdge(ParallelEdge parallelEdge) {
        this.parallelEdge = parallelEdge;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Parameters parameters = (Parameters) o;
        return Objects.equals(this.schemaPath, parameters.schemaPath) &&
            Objects.equals(this.edgesetPath, parameters.edgesetPath) &&
            Objects.equals(this.edgesetFormat, parameters.edgesetFormat) &&
            Objects.equals(this.edgesetDefaultLabel, parameters.edgesetDefaultLabel) &&
            Objects.equals(this.vertexsetPath, parameters.vertexsetPath) &&
            Objects.equals(this.vertexsetFormat, parameters.vertexsetFormat) &&
            Objects.equals(this.vertexsetDefaultLabel, parameters.vertexsetDefaultLabel) &&
            Objects.equals(this.logDir, parameters.logDir) &&
            Objects.equals(this.parallelEdge, parameters.parallelEdge);
    }
    @Override
    public int hashCode() {
        return Objects.hash(schemaPath, edgesetPath, edgesetFormat, edgesetDefaultLabel, vertexsetPath, vertexsetFormat, vertexsetDefaultLabel, logDir, parallelEdge);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Parameters {\n");
        sb.append("    schemaPath: ").append(toIndentedString(schemaPath)).append("\n");
        sb.append("    edgesetPath: ").append(toIndentedString(edgesetPath)).append("\n");
        sb.append("    edgesetFormat: ").append(toIndentedString(edgesetFormat)).append("\n");
        sb.append("    edgesetDefaultLabel: ").append(toIndentedString(edgesetDefaultLabel)).append("\n");
        sb.append("    vertexsetPath: ").append(toIndentedString(vertexsetPath)).append("\n");
        sb.append("    vertexsetFormat: ").append(toIndentedString(vertexsetFormat)).append("\n");
        sb.append("    vertexsetDefaultLabel: ").append(toIndentedString(vertexsetDefaultLabel)).append("\n");
        sb.append("    logDir: ").append(toIndentedString(logDir)).append("\n");
        sb.append("    parallelEdge: ").append(toIndentedString(parallelEdge)).append("\n");
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

