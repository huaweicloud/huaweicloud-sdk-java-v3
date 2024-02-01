package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowIncreBackupPolicy1Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incre_backup_policy")

    private ShowIncreBackupPolicyRespBodyIncreBackupPolicy increBackupPolicy;

    public ShowIncreBackupPolicy1Response withIncreBackupPolicy(
        ShowIncreBackupPolicyRespBodyIncreBackupPolicy increBackupPolicy) {
        this.increBackupPolicy = increBackupPolicy;
        return this;
    }

    public ShowIncreBackupPolicy1Response withIncreBackupPolicy(
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
        ShowIncreBackupPolicy1Response that = (ShowIncreBackupPolicy1Response) obj;
        return Objects.equals(this.increBackupPolicy, that.increBackupPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(increBackupPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowIncreBackupPolicy1Response {\n");
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
