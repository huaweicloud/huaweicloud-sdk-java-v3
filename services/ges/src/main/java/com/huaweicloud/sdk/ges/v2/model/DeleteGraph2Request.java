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
public class DeleteGraph2Request  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="graph_id")
    

    private String graphId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="keep_backup")
    

    private Boolean keepBackup;

    public DeleteGraph2Request withGraphId(String graphId) {
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

    

    public DeleteGraph2Request withKeepBackup(Boolean keepBackup) {
        this.keepBackup = keepBackup;
        return this;
    }

    


    /**
     * 删除图后是否保留备份，默认保留1个自动备份和2个手动备份。该查询参数为空时，表示不保留。
     * @return keepBackup
     */
    public Boolean getKeepBackup() {
        return keepBackup;
    }

    public void setKeepBackup(Boolean keepBackup) {
        this.keepBackup = keepBackup;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteGraph2Request deleteGraph2Request = (DeleteGraph2Request) o;
        return Objects.equals(this.graphId, deleteGraph2Request.graphId) &&
            Objects.equals(this.keepBackup, deleteGraph2Request.keepBackup);
    }
    @Override
    public int hashCode() {
        return Objects.hash(graphId, keepBackup);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteGraph2Request {\n");
        sb.append("    graphId: ").append(toIndentedString(graphId)).append("\n");
        sb.append("    keepBackup: ").append(toIndentedString(keepBackup)).append("\n");
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

