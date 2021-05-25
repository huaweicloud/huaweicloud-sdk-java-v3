package com.huaweicloud.sdk.cbr.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowCheckpointRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="checkpoint_id")
    
    private String checkpointId;

    public ShowCheckpointRequest withCheckpointId(String checkpointId) {
        this.checkpointId = checkpointId;
        return this;
    }

    


    /**
     * 还原点ID
     * @return checkpointId
     */
    public String getCheckpointId() {
        return checkpointId;
    }

    public void setCheckpointId(String checkpointId) {
        this.checkpointId = checkpointId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowCheckpointRequest showCheckpointRequest = (ShowCheckpointRequest) o;
        return Objects.equals(this.checkpointId, showCheckpointRequest.checkpointId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(checkpointId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCheckpointRequest {\n");
        sb.append("    checkpointId: ").append(toIndentedString(checkpointId)).append("\n");
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

