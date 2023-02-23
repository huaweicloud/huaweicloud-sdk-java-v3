package com.huaweicloud.sdk.ges.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * This is a auto create Body Object
 */
public class StartGraphReq  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="graph_backup_id")
    

    private String graphBackupId;

    public StartGraphReq withGraphBackupId(String graphBackupId) {
        this.graphBackupId = graphBackupId;
        return this;
    }

    


    /**
     * 启动图时关联的备份ID，设置此参数时，表示从备份进行启动；如果为空，表示从上次关闭图时的状态启动。
     * @return graphBackupId
     */
    public String getGraphBackupId() {
        return graphBackupId;
    }

    public void setGraphBackupId(String graphBackupId) {
        this.graphBackupId = graphBackupId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StartGraphReq startGraphReq = (StartGraphReq) o;
        return Objects.equals(this.graphBackupId, startGraphReq.graphBackupId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(graphBackupId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartGraphReq {\n");
        sb.append("    graphBackupId: ").append(toIndentedString(graphBackupId)).append("\n");
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

