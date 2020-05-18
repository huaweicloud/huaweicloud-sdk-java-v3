package com.huaweicloud.sdk.dds.v3.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dds.v3.model.SetBackupPolicyOption;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * SetBackupPolicyRequestBody
 */
public class SetBackupPolicyRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="backup_policy")
    
    private SetBackupPolicyOption backupPolicy = null;

    public SetBackupPolicyRequestBody withBackupPolicy(SetBackupPolicyOption backupPolicy) {
        this.backupPolicy = backupPolicy;
        return this;
    }

    public SetBackupPolicyRequestBody withBackupPolicy(Consumer<SetBackupPolicyOption> backupPolicySetter) {
        if(this.backupPolicy == null ){
            this.backupPolicy = new SetBackupPolicyOption();
        }
        backupPolicySetter.accept(this.backupPolicy);
        return this;
    }


    /**
     * Get backupPolicy
     * @return backupPolicy
     */
    public SetBackupPolicyOption getBackupPolicy() {
        return backupPolicy;
    }

    public void setBackupPolicy(SetBackupPolicyOption backupPolicy) {
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

