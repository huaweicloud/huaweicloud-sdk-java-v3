package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class DeleteDcPointsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edge_node_id")

    private String edgeNodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ds_id")

    private String dsId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private DeleteDcPointsReqDTO body;

    public DeleteDcPointsRequest withEdgeNodeId(String edgeNodeId) {
        this.edgeNodeId = edgeNodeId;
        return this;
    }

    /**
     * 边缘节点ID
     * @return edgeNodeId
     */
    public String getEdgeNodeId() {
        return edgeNodeId;
    }

    public void setEdgeNodeId(String edgeNodeId) {
        this.edgeNodeId = edgeNodeId;
    }

    public DeleteDcPointsRequest withDsId(String dsId) {
        this.dsId = dsId;
        return this;
    }

    /**
     * 采集数据源id，创建数据源配置时设置，节点下唯一。
     * @return dsId
     */
    public String getDsId() {
        return dsId;
    }

    public void setDsId(String dsId) {
        this.dsId = dsId;
    }

    public DeleteDcPointsRequest withBody(DeleteDcPointsReqDTO body) {
        this.body = body;
        return this;
    }

    public DeleteDcPointsRequest withBody(Consumer<DeleteDcPointsReqDTO> bodySetter) {
        if (this.body == null) {
            this.body = new DeleteDcPointsReqDTO();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public DeleteDcPointsReqDTO getBody() {
        return body;
    }

    public void setBody(DeleteDcPointsReqDTO body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteDcPointsRequest that = (DeleteDcPointsRequest) obj;
        return Objects.equals(this.edgeNodeId, that.edgeNodeId) && Objects.equals(this.dsId, that.dsId)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(edgeNodeId, dsId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteDcPointsRequest {\n");
        sb.append("    edgeNodeId: ").append(toIndentedString(edgeNodeId)).append("\n");
        sb.append("    dsId: ").append(toIndentedString(dsId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
