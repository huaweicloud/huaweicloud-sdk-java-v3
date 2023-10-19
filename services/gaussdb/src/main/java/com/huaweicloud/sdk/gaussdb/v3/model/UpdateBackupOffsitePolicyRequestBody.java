package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateBackupOffsitePolicyRequestBody
 */
public class UpdateBackupOffsitePolicyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_policy")

    private UpdateBackupOffsitePolicyInfo backupPolicy;

    public UpdateBackupOffsitePolicyRequestBody withBackupPolicy(UpdateBackupOffsitePolicyInfo backupPolicy) {
        this.backupPolicy = backupPolicy;
        return this;
    }

    public UpdateBackupOffsitePolicyRequestBody withBackupPolicy(
        Consumer<UpdateBackupOffsitePolicyInfo> backupPolicySetter) {
        if (this.backupPolicy == null) {
            this.backupPolicy = new UpdateBackupOffsitePolicyInfo();
            backupPolicySetter.accept(this.backupPolicy);
        }

        return this;
    }

    /**
     * Get backupPolicy
     * @return backupPolicy
     */
    public UpdateBackupOffsitePolicyInfo getBackupPolicy() {
        return backupPolicy;
    }

    public void setBackupPolicy(UpdateBackupOffsitePolicyInfo backupPolicy) {
        this.backupPolicy = backupPolicy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateBackupOffsitePolicyRequestBody that = (UpdateBackupOffsitePolicyRequestBody) obj;
        return Objects.equals(this.backupPolicy, that.backupPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(backupPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateBackupOffsitePolicyRequestBody {\n");
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
