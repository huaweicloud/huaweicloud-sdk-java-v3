package com.huaweicloud.sdk.iotedge.v2.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class DeleteEdgeApplicationVersionRequest  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="edge_app_id")
    

    private String edgeAppId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version")
    

    private String version;

    public DeleteEdgeApplicationVersionRequest withEdgeAppId(String edgeAppId) {
        this.edgeAppId = edgeAppId;
        return this;
    }

    


    /**
     * 应用版本,应用内版本唯一。
     * @return edgeAppId
     */
    public String getEdgeAppId() {
        return edgeAppId;
    }

    public void setEdgeAppId(String edgeAppId) {
        this.edgeAppId = edgeAppId;
    }

    

    public DeleteEdgeApplicationVersionRequest withVersion(String version) {
        this.version = version;
        return this;
    }

    


    /**
     * 应用版本ID，应用版本唯一。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteEdgeApplicationVersionRequest deleteEdgeApplicationVersionRequest = (DeleteEdgeApplicationVersionRequest) o;
        return Objects.equals(this.edgeAppId, deleteEdgeApplicationVersionRequest.edgeAppId) &&
            Objects.equals(this.version, deleteEdgeApplicationVersionRequest.version);
    }
    @Override
    public int hashCode() {
        return Objects.hash(edgeAppId, version);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteEdgeApplicationVersionRequest {\n");
        sb.append("    edgeAppId: ").append(toIndentedString(edgeAppId)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

