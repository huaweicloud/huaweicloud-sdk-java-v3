package com.huaweicloud.sdk.ges.v2.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ClearGraph2Request  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="graph_id")
    
    
    private String graphId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="clear_metadata")
    
    
    private Boolean clearMetadata;

    public ClearGraph2Request withGraphId(String graphId) {
        this.graphId = graphId;
        return this;
    }

    


    /**
     * 图ID。
     * @return graphId
     */
    public String getGraphId() {
        return graphId;
    }

    public void setGraphId(String graphId) {
        this.graphId = graphId;
    }

    

    public ClearGraph2Request withClearMetadata(Boolean clearMetadata) {
        this.clearMetadata = clearMetadata;
        return this;
    }

    


    /**
     * 是否清空图关联的元数据。建议清除。
     * @return clearMetadata
     */
    public Boolean getClearMetadata() {
        return clearMetadata;
    }

    public void setClearMetadata(Boolean clearMetadata) {
        this.clearMetadata = clearMetadata;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ClearGraph2Request clearGraph2Request = (ClearGraph2Request) o;
        return Objects.equals(this.graphId, clearGraph2Request.graphId) &&
            Objects.equals(this.clearMetadata, clearGraph2Request.clearMetadata);
    }
    @Override
    public int hashCode() {
        return Objects.hash(graphId, clearMetadata);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClearGraph2Request {\n");
        sb.append("    graphId: ").append(toIndentedString(graphId)).append("\n");
        sb.append("    clearMetadata: ").append(toIndentedString(clearMetadata)).append("\n");
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

