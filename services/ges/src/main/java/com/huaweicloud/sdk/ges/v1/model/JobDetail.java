package com.huaweicloud.sdk.ges.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ges.v1.model.EdgesetPath;
import com.huaweicloud.sdk.ges.v1.model.SchemaPath;
import com.huaweicloud.sdk.ges.v1.model.VertexsetPath;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 任务详情
 */
public class JobDetail  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="schemaPath")
    
    
    private List<SchemaPath> schemaPath = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="edgesetPath")
    
    
    private List<EdgesetPath> edgesetPath = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vertexsetPath")
    
    
    private List<VertexsetPath> vertexsetPath = null;
    
    public JobDetail withSchemaPath(List<SchemaPath> schemaPath) {
        this.schemaPath = schemaPath;
        return this;
    }

    
    public JobDetail addSchemaPathItem(SchemaPath schemaPathItem) {
        if(this.schemaPath == null) {
            this.schemaPath = new ArrayList<>();
        }
        this.schemaPath.add(schemaPathItem);
        return this;
    }

    public JobDetail withSchemaPath(Consumer<List<SchemaPath>> schemaPathSetter) {
        if(this.schemaPath == null) {
            this.schemaPath = new ArrayList<>();
        }
        schemaPathSetter.accept(this.schemaPath);
        return this;
    }

    /**
     * 元数据路径。
     * @return schemaPath
     */
    public List<SchemaPath> getSchemaPath() {
        return schemaPath;
    }

    public void setSchemaPath(List<SchemaPath> schemaPath) {
        this.schemaPath = schemaPath;
    }

    

    public JobDetail withEdgesetPath(List<EdgesetPath> edgesetPath) {
        this.edgesetPath = edgesetPath;
        return this;
    }

    
    public JobDetail addEdgesetPathItem(EdgesetPath edgesetPathItem) {
        if(this.edgesetPath == null) {
            this.edgesetPath = new ArrayList<>();
        }
        this.edgesetPath.add(edgesetPathItem);
        return this;
    }

    public JobDetail withEdgesetPath(Consumer<List<EdgesetPath>> edgesetPathSetter) {
        if(this.edgesetPath == null) {
            this.edgesetPath = new ArrayList<>();
        }
        edgesetPathSetter.accept(this.edgesetPath);
        return this;
    }

    /**
     * 边数据集路径。
     * @return edgesetPath
     */
    public List<EdgesetPath> getEdgesetPath() {
        return edgesetPath;
    }

    public void setEdgesetPath(List<EdgesetPath> edgesetPath) {
        this.edgesetPath = edgesetPath;
    }

    

    public JobDetail withVertexsetPath(List<VertexsetPath> vertexsetPath) {
        this.vertexsetPath = vertexsetPath;
        return this;
    }

    
    public JobDetail addVertexsetPathItem(VertexsetPath vertexsetPathItem) {
        if(this.vertexsetPath == null) {
            this.vertexsetPath = new ArrayList<>();
        }
        this.vertexsetPath.add(vertexsetPathItem);
        return this;
    }

    public JobDetail withVertexsetPath(Consumer<List<VertexsetPath>> vertexsetPathSetter) {
        if(this.vertexsetPath == null) {
            this.vertexsetPath = new ArrayList<>();
        }
        vertexsetPathSetter.accept(this.vertexsetPath);
        return this;
    }

    /**
     * 点数据集路径。
     * @return vertexsetPath
     */
    public List<VertexsetPath> getVertexsetPath() {
        return vertexsetPath;
    }

    public void setVertexsetPath(List<VertexsetPath> vertexsetPath) {
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
        JobDetail jobDetail = (JobDetail) o;
        return Objects.equals(this.schemaPath, jobDetail.schemaPath) &&
            Objects.equals(this.edgesetPath, jobDetail.edgesetPath) &&
            Objects.equals(this.vertexsetPath, jobDetail.vertexsetPath);
    }
    @Override
    public int hashCode() {
        return Objects.hash(schemaPath, edgesetPath, vertexsetPath);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobDetail {\n");
        sb.append("    schemaPath: ").append(toIndentedString(schemaPath)).append("\n");
        sb.append("    edgesetPath: ").append(toIndentedString(edgesetPath)).append("\n");
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

