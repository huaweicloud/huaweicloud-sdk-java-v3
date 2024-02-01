package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * update incre backup policy
 */
public class UpdateIncreBackupPolicy1RequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incre_backup_policy")

    private ShowIncreBackupPolicyRespBodyIncreBackupPolicy increBackupPolicy;

    public UpdateIncreBackupPolicy1RequestBody withIncreBackupPolicy(
        ShowIncreBackupPolicyRespBodyIncreBackupPolicy increBackupPolicy) {
        this.increBackupPolicy = increBackupPolicy;
        return this;
    }

    public UpdateIncreBackupPolicy1RequestBody withIncreBackupPolicy(
        Consumer<ShowIncreBackupPolicyRespBodyIncreBackupPolicy> increBackupPolicySetter) {
        if (this.increBackupPolicy == null) {
            this.increBackupPolicy = new ShowIncreBackupPolicyRespBodyIncreBackupPolicy();
            increBackupPolicySetter.accept(this.increBackupPolicy);
        }

        return this;
    }

    /**
     * Get increBackupPolicy
     * @return increBackupPolicy
     */
    public ShowIncreBackupPolicyRespBodyIncreBackupPolicy getIncreBackupPolicy() {
        return increBackupPolicy;
    }

    public void setIncreBackupPolicy(ShowIncreBackupPolicyRespBodyIncreBackupPolicy increBackupPolicy) {
        this.increBackupPolicy = increBackupPolicy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateIncreBackupPolicy1RequestBody that = (UpdateIncreBackupPolicy1RequestBody) obj;
        return Objects.equals(this.increBackupPolicy, that.increBackupPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(increBackupPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateIncreBackupPolicy1RequestBody {\n");
        sb.append("    increBackupPolicy: ").append(toIndentedString(increBackupPolicy)).append("\n");
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
