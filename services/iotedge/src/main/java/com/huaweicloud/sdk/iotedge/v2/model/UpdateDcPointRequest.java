package com.huaweicloud.sdk.iotedge.v2.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateDcPointReqDTO;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateDcPointRequest  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="edge_node_id")
    

    private String edgeNodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ds_id")
    

    private String dsId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="point_id")
    

    private String pointId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    

    private UpdateDcPointReqDTO body;

    public UpdateDcPointRequest withEdgeNodeId(String edgeNodeId) {
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

    

    public UpdateDcPointRequest withDsId(String dsId) {
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

    

    public UpdateDcPointRequest withPointId(String pointId) {
        this.pointId = pointId;
        return this;
    }

    


    /**
     * 采集点位表id，创建点位表时设置，数据源下唯一。
     * @return pointId
     */
    public String getPointId() {
        return pointId;
    }

    public void setPointId(String pointId) {
        this.pointId = pointId;
    }

    

    public UpdateDcPointRequest withBody(UpdateDcPointReqDTO body) {
        this.body = body;
        return this;
    }

    public UpdateDcPointRequest withBody(Consumer<UpdateDcPointReqDTO> bodySetter) {
        if(this.body == null ){
            this.body = new UpdateDcPointReqDTO();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public UpdateDcPointReqDTO getBody() {
        return body;
    }

    public void setBody(UpdateDcPointReqDTO body) {
        this.body = body;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateDcPointRequest updateDcPointRequest = (UpdateDcPointRequest) o;
        return Objects.equals(this.edgeNodeId, updateDcPointRequest.edgeNodeId) &&
            Objects.equals(this.dsId, updateDcPointRequest.dsId) &&
            Objects.equals(this.pointId, updateDcPointRequest.pointId) &&
            Objects.equals(this.body, updateDcPointRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(edgeNodeId, dsId, pointId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDcPointRequest {\n");
        sb.append("    edgeNodeId: ").append(toIndentedString(edgeNodeId)).append("\n");
        sb.append("    dsId: ").append(toIndentedString(dsId)).append("\n");
        sb.append("    pointId: ").append(toIndentedString(pointId)).append("\n");
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

