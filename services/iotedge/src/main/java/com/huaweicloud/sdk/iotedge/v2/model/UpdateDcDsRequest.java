package com.huaweicloud.sdk.iotedge.v2.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateDcDsReqDTO;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateDcDsRequest  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="edge_node_id")
    

    private String edgeNodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ds_id")
    

    private String dsId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    

    private UpdateDcDsReqDTO body;

    public UpdateDcDsRequest withEdgeNodeId(String edgeNodeId) {
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

    

    public UpdateDcDsRequest withDsId(String dsId) {
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

    

    public UpdateDcDsRequest withBody(UpdateDcDsReqDTO body) {
        this.body = body;
        return this;
    }

    public UpdateDcDsRequest withBody(Consumer<UpdateDcDsReqDTO> bodySetter) {
        if(this.body == null ){
            this.body = new UpdateDcDsReqDTO();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public UpdateDcDsReqDTO getBody() {
        return body;
    }

    public void setBody(UpdateDcDsReqDTO body) {
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
        UpdateDcDsRequest updateDcDsRequest = (UpdateDcDsRequest) o;
        return Objects.equals(this.edgeNodeId, updateDcDsRequest.edgeNodeId) &&
            Objects.equals(this.dsId, updateDcDsRequest.dsId) &&
            Objects.equals(this.body, updateDcDsRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(edgeNodeId, dsId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDcDsRequest {\n");
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

