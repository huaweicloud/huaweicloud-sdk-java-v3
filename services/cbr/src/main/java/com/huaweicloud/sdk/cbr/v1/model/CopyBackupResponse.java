package com.huaweicloud.sdk.cbr.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cbr.v1.model.BackupReplicateRespBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CopyBackupResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="replication")
    
    private BackupReplicateRespBody replication = null;

    public CopyBackupResponse withReplication(BackupReplicateRespBody replication) {
        this.replication = replication;
        return this;
    }

    public CopyBackupResponse withReplication(Consumer<BackupReplicateRespBody> replicationSetter) {
        if(this.replication == null ){
            this.replication = new BackupReplicateRespBody();
            replicationSetter.accept(this.replication);
        }
        
        return this;
    }


    /**
     * Get replication
     * @return replication
     */
    public BackupReplicateRespBody getReplication() {
        return replication;
    }

    public void setReplication(BackupReplicateRespBody replication) {
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
        CopyBackupResponse copyBackupResponse = (CopyBackupResponse) o;
        return Objects.equals(this.replication, copyBackupResponse.replication);
    }
    @Override
    public int hashCode() {
        return Objects.hash(replication);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CopyBackupResponse {\n");
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

