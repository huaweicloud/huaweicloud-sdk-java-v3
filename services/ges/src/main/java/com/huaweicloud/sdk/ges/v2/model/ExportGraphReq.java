package com.huaweicloud.sdk.ges.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 导出图请求体
 */
public class ExportGraphReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "graph_export_path")

    private String graphExportPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edge_set_name")

    private String edgeSetName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vertex_set_name")

    private String vertexSetName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema_name")

    private String schemaName;

    public ExportGraphReq withGraphExportPath(String graphExportPath) {
        this.graphExportPath = graphExportPath;
        return this;
    }

    /**
     * 图的导出OBS路径。
     * @return graphExportPath
     */
    public String getGraphExportPath() {
        return graphExportPath;
    }

    public void setGraphExportPath(String graphExportPath) {
        this.graphExportPath = graphExportPath;
    }

    public ExportGraphReq withEdgeSetName(String edgeSetName) {
        this.edgeSetName = edgeSetName;
        return this;
    }

    /**
     * 导出边文件名。
     * @return edgeSetName
     */
    public String getEdgeSetName() {
        return edgeSetName;
    }

    public void setEdgeSetName(String edgeSetName) {
        this.edgeSetName = edgeSetName;
    }

    public ExportGraphReq withVertexSetName(String vertexSetName) {
        this.vertexSetName = vertexSetName;
        return this;
    }

    /**
     * 导出点文件名。
     * @return vertexSetName
     */
    public String getVertexSetName() {
        return vertexSetName;
    }

    public void setVertexSetName(String vertexSetName) {
        this.vertexSetName = vertexSetName;
    }

    public ExportGraphReq withSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }

    /**
     * 导出元数据文件名。
     * @return schemaName
     */
    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExportGraphReq that = (ExportGraphReq) obj;
        return Objects.equals(this.graphExportPath, that.graphExportPath)
            && Objects.equals(this.edgeSetName, that.edgeSetName)
            && Objects.equals(this.vertexSetName, that.vertexSetName)
            && Objects.equals(this.schemaName, that.schemaName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(graphExportPath, edgeSetName, vertexSetName, schemaName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportGraphReq {\n");
        sb.append("    graphExportPath: ").append(toIndentedString(graphExportPath)).append("\n");
        sb.append("    edgeSetName: ").append(toIndentedString(edgeSetName)).append("\n");
        sb.append("    vertexSetName: ").append(toIndentedString(vertexSetName)).append("\n");
        sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
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
