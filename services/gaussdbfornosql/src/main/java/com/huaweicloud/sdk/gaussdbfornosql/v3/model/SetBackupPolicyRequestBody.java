package com.huaweicloud.sdk.gaussdbfornosql.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.BackupPolicy;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * SetBackupPolicyRequestBody
 */
public class SetBackupPolicyRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="backup_policy")
    
    private BackupPolicy backupPolicy;

    public SetBackupPolicyRequestBody withBackupPolicy(BackupPolicy backupPolicy) {
        this.backupPolicy = backupPolicy;
        return this;
    }

    public SetBackupPolicyRequestBody withBackupPolicy(Consumer<BackupPolicy> backupPolicySetter) {
        if(this.backupPolicy == null ){
            this.backupPolicy = new BackupPolicy();
            backupPolicySetter.accept(this.backupPolicy);
        }
        
        return this;
    }


    /**
     * Get backupPolicy
     * @return backupPolicy
     */
    public BackupPolicy getBackupPolicy() {
        return backupPolicy;
    }

    public void setBackupPolicy(BackupPolicy backupPolicy) {
        this.backupPolicy = backupPolicy;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SetBackupPolicyRequestBody setBackupPolicyRequestBody = (SetBackupPolicyRequestBody) o;
        return Objects.equals(this.backupPolicy, setBackupPolicyRequestBody.backupPolicy);
    }
    @Override
    public int hashCode() {
        return Objects.hash(backupPolicy);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetBackupPolicyRequestBody {\n");
        sb.append("    backupPolicy: ").append(toIndentedString(backupPolicy)).append("\n");
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

