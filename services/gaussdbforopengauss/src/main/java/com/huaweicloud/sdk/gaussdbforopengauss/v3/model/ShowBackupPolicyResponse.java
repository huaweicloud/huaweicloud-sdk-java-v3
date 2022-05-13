package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowBackupPolicy;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowBackupPolicyResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="backup_policy")
    
    
    private ShowBackupPolicy backupPolicy;

    public ShowBackupPolicyResponse withBackupPolicy(ShowBackupPolicy backupPolicy) {
        this.backupPolicy = backupPolicy;
        return this;
    }

    public ShowBackupPolicyResponse withBackupPolicy(Consumer<ShowBackupPolicy> backupPolicySetter) {
        if(this.backupPolicy == null ){
            this.backupPolicy = new ShowBackupPolicy();
            backupPolicySetter.accept(this.backupPolicy);
        }
        
        return this;
    }


    /**
     * Get backupPolicy
     * @return backupPolicy
     */
    public ShowBackupPolicy getBackupPolicy() {
        return backupPolicy;
    }

    public void setBackupPolicy(ShowBackupPolicy backupPolicy) {
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
        ShowBackupPolicyResponse showBackupPolicyResponse = (ShowBackupPolicyResponse) o;
        return Objects.equals(this.backupPolicy, showBackupPolicyResponse.backupPolicy);
    }
    @Override
    public int hashCode() {
        return Objects.hash(backupPolicy);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBackupPolicyResponse {\n");
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

