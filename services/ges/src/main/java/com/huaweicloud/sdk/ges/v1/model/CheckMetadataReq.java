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
public class CheckMetadataReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="schemaPath")
    
    
    private String schemaPath;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="edgesetPath")
    
    
    private String edgesetPath;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="edgesetFormat")
    
    
    private String edgesetFormat;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vertexsetFormat")
    
    
    private String vertexsetFormat;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vertexsetPath")
    
    
    private String vertexsetPath;

    public CheckMetadataReq withSchemaPath(String schemaPath) {
        this.schemaPath = schemaPath;
        return this;
    }

    


    /**
     * 元数据文件的OBS路径。
     * @return schemaPath
     */
    public String getSchemaPath() {
        return schemaPath;
    }

    public void setSchemaPath(String schemaPath) {
        this.schemaPath = schemaPath;
    }

    

    public CheckMetadataReq withEdgesetPath(String edgesetPath) {
        this.edgesetPath = edgesetPath;
        return this;
    }

    


    /**
     * 边数据集的OBS路径。
     * @return edgesetPath
     */
    public String getEdgesetPath() {
        return edgesetPath;
    }

    public void setEdgesetPath(String edgesetPath) {
        this.edgesetPath = edgesetPath;
    }

    

    public CheckMetadataReq withEdgesetFormat(String edgesetFormat) {
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

    

    public CheckMetadataReq withVertexsetFormat(String vertexsetFormat) {
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

    

    public CheckMetadataReq withVertexsetPath(String vertexsetPath) {
        this.vertexsetPath = vertexsetPath;
        return this;
    }

    


    /**
     * 点数据集OBS路径。
     * @return vertexsetPath
     */
    public String getVertexsetPath() {
        return vertexsetPath;
    }

    public void setVertexsetPath(String vertexsetPath) {
        this.vertexsetPath = vertexsetPath;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckMetadataReq checkMetadataReq = (CheckMetadataReq) o;
        return Objects.equals(this.schemaPath, checkMetadataReq.schemaPath) &&
            Objects.equals(this.edgesetPath, checkMetadataReq.edgesetPath) &&
            Objects.equals(this.edgesetFormat, checkMetadataReq.edgesetFormat) &&
            Objects.equals(this.vertexsetFormat, checkMetadataReq.vertexsetFormat) &&
            Objects.equals(this.vertexsetPath, checkMetadataReq.vertexsetPath);
    }
    @Override
    public int hashCode() {
        return Objects.hash(schemaPath, edgesetPath, edgesetFormat, vertexsetFormat, vertexsetPath);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckMetadataReq {\n");
        sb.append("    schemaPath: ").append(toIndentedString(schemaPath)).append("\n");
        sb.append("    edgesetPath: ").append(toIndentedString(edgesetPath)).append("\n");
        sb.append("    edgesetFormat: ").append(toIndentedString(edgesetFormat)).append("\n");
        sb.append("    vertexsetFormat: ").append(toIndentedString(vertexsetFormat)).append("\n");
        sb.append("    vertexsetPath: ").append(toIndentedString(vertexsetPath)).append("\n");
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

