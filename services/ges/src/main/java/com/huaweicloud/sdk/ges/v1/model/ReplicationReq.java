package com.huaweicloud.sdk.ges.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ReplicationReq
 */
public class ReplicationReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="replication")
    
    
    private String replication;

    public ReplicationReq withReplication(String replication) {
        this.replication = replication;
        return this;
    }

    


    /**
     * 新扩副本数量。
     * @return replication
     */
    public String getReplication() {
        return replication;
    }

    public void setReplication(String replication) {
        this.replication = replication;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReplicationReq replicationReq = (ReplicationReq) o;
        return Objects.equals(this.replication, replicationReq.replication);
    }
    @Override
    public int hashCode() {
        return Objects.hash(replication);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReplicationReq {\n");
        sb.append("    replication: ").append(toIndentedString(replication)).append("\n");
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

