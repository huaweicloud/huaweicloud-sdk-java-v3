package com.huaweicloud.sdk.cbr.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cbr.v1.model.BackupReplicateReqBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class BackupReplicateReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="replicate")
    
    private BackupReplicateReqBody replicate;

    public BackupReplicateReq withReplicate(BackupReplicateReqBody replicate) {
        this.replicate = replicate;
        return this;
    }

    public BackupReplicateReq withReplicate(Consumer<BackupReplicateReqBody> replicateSetter) {
        if(this.replicate == null ){
            this.replicate = new BackupReplicateReqBody();
            replicateSetter.accept(this.replicate);
        }
        
        return this;
    }


    /**
     * Get replicate
     * @return replicate
     */
    public BackupReplicateReqBody getReplicate() {
        return replicate;
    }

    public void setReplicate(BackupReplicateReqBody replicate) {
        this.replicate = replicate;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BackupReplicateReq backupReplicateReq = (BackupReplicateReq) o;
        return Objects.equals(this.replicate, backupReplicateReq.replicate);
    }
    @Override
    public int hashCode() {
        return Objects.hash(replicate);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackupReplicateReq {\n");
        sb.append("    replicate: ").append(toIndentedString(replicate)).append("\n");
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

