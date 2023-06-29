package com.huaweicloud.sdk.ges.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 只有jobName为ImportGraph时才返回，用于显示导入图详情。
 */
public class ShowJobRespJobDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema_path")

    private List<ShowJobRespJobDetailSchemaPath> schemaPath = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edgeset_path")

    private List<ShowJobRespJobDetailSchemaPath> edgesetPath = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vertexset_path")

    private List<ShowJobRespJobDetailSchemaPath> vertexsetPath = null;

    public ShowJobRespJobDetail withSchemaPath(List<ShowJobRespJobDetailSchemaPath> schemaPath) {
        this.schemaPath = schemaPath;
        return this;
    }

    public ShowJobRespJobDetail addSchemaPathItem(ShowJobRespJobDetailSchemaPath schemaPathItem) {
        if (this.schemaPath == null) {
            this.schemaPath = new ArrayList<>();
        }
        this.schemaPath.add(schemaPathItem);
        return this;
    }

    public ShowJobRespJobDetail withSchemaPath(Consumer<List<ShowJobRespJobDetailSchemaPath>> schemaPathSetter) {
        if (this.schemaPath == null) {
            this.schemaPath = new ArrayList<>();
        }
        schemaPathSetter.accept(this.schemaPath);
        return this;
    }

    /**
     * 元数据路径。
     * @return schemaPath
     */
    public List<ShowJobRespJobDetailSchemaPath> getSchemaPath() {
        return schemaPath;
    }

    public void setSchemaPath(List<ShowJobRespJobDetailSchemaPath> schemaPath) {
        this.schemaPath = schemaPath;
    }

    public ShowJobRespJobDetail withEdgesetPath(List<ShowJobRespJobDetailSchemaPath> edgesetPath) {
        this.edgesetPath = edgesetPath;
        return this;
    }

    public ShowJobRespJobDetail addEdgesetPathItem(ShowJobRespJobDetailSchemaPath edgesetPathItem) {
        if (this.edgesetPath == null) {
            this.edgesetPath = new ArrayList<>();
        }
        this.edgesetPath.add(edgesetPathItem);
        return this;
    }

    public ShowJobRespJobDetail withEdgesetPath(Consumer<List<ShowJobRespJobDetailSchemaPath>> edgesetPathSetter) {
        if (this.edgesetPath == null) {
            this.edgesetPath = new ArrayList<>();
        }
        edgesetPathSetter.accept(this.edgesetPath);
        return this;
    }

    /**
     * 边数据集路径。
     * @return edgesetPath
     */
    public List<ShowJobRespJobDetailSchemaPath> getEdgesetPath() {
        return edgesetPath;
    }

    public void setEdgesetPath(List<ShowJobRespJobDetailSchemaPath> edgesetPath) {
        this.edgesetPath = edgesetPath;
    }

    public ShowJobRespJobDetail withVertexsetPath(List<ShowJobRespJobDetailSchemaPath> vertexsetPath) {
        this.vertexsetPath = vertexsetPath;
        return this;
    }

    public ShowJobRespJobDetail addVertexsetPathItem(ShowJobRespJobDetailSchemaPath vertexsetPathItem) {
        if (this.vertexsetPath == null) {
            this.vertexsetPath = new ArrayList<>();
        }
        this.vertexsetPath.add(vertexsetPathItem);
        return this;
    }

    public ShowJobRespJobDetail withVertexsetPath(Consumer<List<ShowJobRespJobDetailSchemaPath>> vertexsetPathSetter) {
        if (this.vertexsetPath == null) {
            this.vertexsetPath = new ArrayList<>();
        }
        vertexsetPathSetter.accept(this.vertexsetPath);
        return this;
    }

    /**
     * 点数据集路径。
     * @return vertexsetPath
     */
    public List<ShowJobRespJobDetailSchemaPath> getVertexsetPath() {
        return vertexsetPath;
    }

    public void setVertexsetPath(List<ShowJobRespJobDetailSchemaPath> vertexsetPath) {
        this.vertexsetPath = vertexsetPath;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowJobRespJobDetail that = (ShowJobRespJobDetail) obj;
        return Objects.equals(this.schemaPath, that.schemaPath) && Objects.equals(this.edgesetPath, that.edgesetPath)
            && Objects.equals(this.vertexsetPath, that.vertexsetPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schemaPath, edgesetPath, vertexsetPath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowJobRespJobDetail {\n");
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
