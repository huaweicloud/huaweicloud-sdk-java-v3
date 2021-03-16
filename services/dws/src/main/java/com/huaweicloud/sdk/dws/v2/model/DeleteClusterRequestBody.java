package com.huaweicloud.sdk.dws.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * This is a auto create Body Object
 */
public class DeleteClusterRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="keep_last_manual_snapshot")
    
    private Integer keepLastManualSnapshot;

    public DeleteClusterRequestBody withKeepLastManualSnapshot(Integer keepLastManualSnapshot) {
        this.keepLastManualSnapshot = keepLastManualSnapshot;
        return this;
    }

    


    /**
     * 集群需要保留的快照数
     * @return keepLastManualSnapshot
     */
    public Integer getKeepLastManualSnapshot() {
        return keepLastManualSnapshot;
    }

    public void setKeepLastManualSnapshot(Integer keepLastManualSnapshot) {
        this.keepLastManualSnapshot = keepLastManualSnapshot;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteClusterRequestBody deleteClusterRequestBody = (DeleteClusterRequestBody) o;
        return Objects.equals(this.keepLastManualSnapshot, deleteClusterRequestBody.keepLastManualSnapshot);
    }
    @Override
    public int hashCode() {
        return Objects.hash(keepLastManualSnapshot);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteClusterRequestBody {\n");
        sb.append("    keepLastManualSnapshot: ").append(toIndentedString(keepLastManualSnapshot)).append("\n");
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

